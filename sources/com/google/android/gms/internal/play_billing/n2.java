package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class n2 implements t2 {
    public static final int[] j = new int[0];
    public static final Unsafe k = c3.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final e1 e;
    public final int[] f;
    public final int g;
    public final int h;
    public final t1 i;

    public n2(int[] iArr, Object[] objArr, int i7, int i10, e1 e1Var, int[] iArr2, int i11, int i12, t1 t1Var, t1 t1Var2) {
        this.a = iArr;
        this.b = objArr;
        this.c = i7;
        this.d = i10;
        this.f = iArr2;
        this.g = i11;
        this.h = i12;
        this.i = t1Var;
        this.e = e1Var;
    }

    public static Field B(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
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
            throw new RuntimeException(n10.toString(), e10);
        }
    }

    public static boolean o(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof v1) {
            return ((v1) obj).m();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static n2 r(s2 s2Var, t1 t1Var, t1 t1Var2) {
        int i7;
        int charAt;
        int i10;
        int[] iArr;
        int i11;
        int i12;
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
        Object[] objArr;
        int i26;
        Class<?> cls;
        int objectFieldOffset;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        Field B;
        char charAt10;
        int i33;
        int i34;
        int i35;
        int i36;
        Object obj;
        Field B2;
        Object obj2;
        Field B3;
        int i37;
        char charAt11;
        int i38;
        char charAt12;
        int i39;
        char charAt13;
        int i40;
        char charAt14;
        if (!(s2Var instanceof s2)) {
            s2Var.getClass();
            throw new ClassCastException();
        }
        String str = s2Var.b;
        int length = str.length();
        int i41 = 55296;
        if (str.charAt(0) >= 55296) {
            int i42 = 1;
            while (true) {
                i7 = i42 + 1;
                if (str.charAt(i42) < 55296) {
                    break;
                }
                i42 = i7;
            }
        } else {
            i7 = 1;
        }
        int i43 = i7 + 1;
        int charAt15 = str.charAt(i7);
        if (charAt15 >= 55296) {
            int i44 = charAt15 & 8191;
            int i45 = 13;
            while (true) {
                i40 = i43 + 1;
                charAt14 = str.charAt(i43);
                if (charAt14 < 55296) {
                    break;
                }
                i44 |= (charAt14 & 8191) << i45;
                i45 += 13;
                i43 = i40;
            }
            charAt15 = i44 | (charAt14 << i45);
            i43 = i40;
        }
        if (charAt15 == 0) {
            i12 = 0;
            i14 = 0;
            charAt = 0;
            i11 = 0;
            i13 = 0;
            i15 = 0;
            iArr = j;
            i10 = 0;
        } else {
            int i46 = i43 + 1;
            int charAt16 = str.charAt(i43);
            if (charAt16 >= 55296) {
                int i47 = charAt16 & 8191;
                int i48 = 13;
                while (true) {
                    i23 = i46 + 1;
                    charAt9 = str.charAt(i46);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i47 |= (charAt9 & 8191) << i48;
                    i48 += 13;
                    i46 = i23;
                }
                charAt16 = i47 | (charAt9 << i48);
                i46 = i23;
            }
            int i49 = i46 + 1;
            int charAt17 = str.charAt(i46);
            if (charAt17 >= 55296) {
                int i50 = charAt17 & 8191;
                int i51 = 13;
                while (true) {
                    i22 = i49 + 1;
                    charAt8 = str.charAt(i49);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i50 |= (charAt8 & 8191) << i51;
                    i51 += 13;
                    i49 = i22;
                }
                charAt17 = i50 | (charAt8 << i51);
                i49 = i22;
            }
            int i52 = i49 + 1;
            int charAt18 = str.charAt(i49);
            if (charAt18 >= 55296) {
                int i53 = charAt18 & 8191;
                int i54 = 13;
                while (true) {
                    i21 = i52 + 1;
                    charAt7 = str.charAt(i52);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i53 |= (charAt7 & 8191) << i54;
                    i54 += 13;
                    i52 = i21;
                }
                charAt18 = i53 | (charAt7 << i54);
                i52 = i21;
            }
            int i55 = i52 + 1;
            int charAt19 = str.charAt(i52);
            if (charAt19 >= 55296) {
                int i56 = charAt19 & 8191;
                int i57 = 13;
                while (true) {
                    i20 = i55 + 1;
                    charAt6 = str.charAt(i55);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i56 |= (charAt6 & 8191) << i57;
                    i57 += 13;
                    i55 = i20;
                }
                charAt19 = i56 | (charAt6 << i57);
                i55 = i20;
            }
            int i58 = i55 + 1;
            charAt = str.charAt(i55);
            if (charAt >= 55296) {
                int i59 = charAt & 8191;
                int i60 = 13;
                while (true) {
                    i19 = i58 + 1;
                    charAt5 = str.charAt(i58);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i59 |= (charAt5 & 8191) << i60;
                    i60 += 13;
                    i58 = i19;
                }
                charAt = i59 | (charAt5 << i60);
                i58 = i19;
            }
            int i61 = i58 + 1;
            int charAt20 = str.charAt(i58);
            if (charAt20 >= 55296) {
                int i62 = charAt20 & 8191;
                int i63 = 13;
                while (true) {
                    i18 = i61 + 1;
                    charAt4 = str.charAt(i61);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i62 |= (charAt4 & 8191) << i63;
                    i63 += 13;
                    i61 = i18;
                }
                charAt20 = i62 | (charAt4 << i63);
                i61 = i18;
            }
            int i64 = i61 + 1;
            int charAt21 = str.charAt(i61);
            if (charAt21 >= 55296) {
                int i65 = charAt21 & 8191;
                int i66 = 13;
                while (true) {
                    i17 = i64 + 1;
                    charAt3 = str.charAt(i64);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i65 |= (charAt3 & 8191) << i66;
                    i66 += 13;
                    i64 = i17;
                }
                charAt21 = i65 | (charAt3 << i66);
                i64 = i17;
            }
            int i67 = i64 + 1;
            int charAt22 = str.charAt(i64);
            if (charAt22 >= 55296) {
                int i68 = charAt22 & 8191;
                int i69 = 13;
                while (true) {
                    i16 = i67 + 1;
                    charAt2 = str.charAt(i67);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i68 |= (charAt2 & 8191) << i69;
                    i69 += 13;
                    i67 = i16;
                }
                charAt22 = i68 | (charAt2 << i69);
                i67 = i16;
            }
            int i70 = charAt16 + charAt16 + charAt17;
            i10 = charAt16;
            i43 = i67;
            iArr = new int[charAt22 + charAt20 + charAt21];
            int i71 = charAt20;
            i11 = charAt18;
            i12 = i71;
            i13 = charAt19;
            i14 = i70;
            i15 = charAt22;
        }
        Unsafe unsafe = k;
        Object[] objArr2 = s2Var.c;
        Class<?> cls2 = s2Var.a.getClass();
        int i72 = i15 + i12;
        int i73 = charAt + charAt;
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr3 = new Object[i73];
        int i74 = i72;
        int i75 = i15;
        int i76 = 0;
        int i77 = 0;
        while (i43 < length) {
            int i78 = i43 + 1;
            int charAt23 = str.charAt(i43);
            if (charAt23 >= i41) {
                int i79 = charAt23 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i39 = i80 + 1;
                    charAt13 = str.charAt(i80);
                    i24 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i79 |= (charAt13 & 8191) << i81;
                    i81 += 13;
                    i80 = i39;
                    length = i24;
                }
                charAt23 = i79 | (charAt13 << i81);
                i25 = i39;
            } else {
                i24 = length;
                i25 = i78;
            }
            int i82 = i25 + 1;
            int charAt24 = str.charAt(i25);
            Object[] objArr4 = objArr2;
            char c10 = 55296;
            if (charAt24 >= 55296) {
                int i83 = charAt24 & 8191;
                int i84 = 13;
                while (true) {
                    i38 = i82 + 1;
                    charAt12 = str.charAt(i82);
                    if (charAt12 < c10) {
                        break;
                    }
                    i83 |= (charAt12 & 8191) << i84;
                    i84 += 13;
                    i82 = i38;
                    c10 = 55296;
                }
                charAt24 = i83 | (charAt12 << i84);
                i82 = i38;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i76] = i77;
                i76++;
            }
            int i85 = charAt24 & qs.e4;
            int i86 = charAt23;
            int i87 = charAt24 & 2048;
            if (i85 >= 51) {
                int i88 = i82 + 1;
                int charAt25 = str.charAt(i82);
                char c11 = 55296;
                if (charAt25 >= 55296) {
                    int i89 = charAt25 & 8191;
                    int i90 = i88;
                    int i91 = 13;
                    while (true) {
                        i37 = i90 + 1;
                        charAt11 = str.charAt(i90);
                        if (charAt11 < c11) {
                            break;
                        }
                        i89 |= (charAt11 & 8191) << i91;
                        i91 += 13;
                        i90 = i37;
                        c11 = 55296;
                    }
                    charAt25 = i89 | (charAt11 << i91);
                    i34 = i37;
                } else {
                    i34 = i88;
                }
                int i92 = i34;
                int i93 = i85 - 51;
                int i94 = charAt25;
                if (i93 == 9 || i93 == 17) {
                    i35 = i14 + 1;
                    int i95 = i77 / 3;
                    objArr3[i95 + i95 + 1] = objArr4[i14];
                } else {
                    if (i93 == 12) {
                        if (s2Var.a() == 1 || i87 != 0) {
                            i35 = i14 + 1;
                            int i96 = i77 / 3;
                            objArr3[i96 + i96 + 1] = objArr4[i14];
                        } else {
                            i36 = 0;
                            int i97 = i94 + i94;
                            i87 = i36;
                            obj = objArr4[i97];
                            if (obj instanceof Field) {
                                B2 = (Field) obj;
                            } else {
                                B2 = B(cls2, (String) obj);
                                objArr4[i97] = B2;
                            }
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(B2);
                            int i98 = i97 + 1;
                            obj2 = objArr4[i98];
                            if (obj2 instanceof Field) {
                                B3 = (Field) obj2;
                            } else {
                                B3 = B(cls2, (String) obj2);
                                objArr4[i98] = B3;
                            }
                            i29 = i92;
                            i32 = objectFieldOffset2;
                            i28 = 55296;
                            objArr = objArr3;
                            i26 = i10;
                            cls = cls2;
                            i31 = 0;
                            i27 = (int) unsafe.objectFieldOffset(B3);
                        }
                    }
                    i36 = i87;
                    int i972 = i94 + i94;
                    i87 = i36;
                    obj = objArr4[i972];
                    if (obj instanceof Field) {
                    }
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(B2);
                    int i982 = i972 + 1;
                    obj2 = objArr4[i982];
                    if (obj2 instanceof Field) {
                    }
                    i29 = i92;
                    i32 = objectFieldOffset22;
                    i28 = 55296;
                    objArr = objArr3;
                    i26 = i10;
                    cls = cls2;
                    i31 = 0;
                    i27 = (int) unsafe.objectFieldOffset(B3);
                }
                i14 = i35;
                i36 = i87;
                int i9722 = i94 + i94;
                i87 = i36;
                obj = objArr4[i9722];
                if (obj instanceof Field) {
                }
                int objectFieldOffset222 = (int) unsafe.objectFieldOffset(B2);
                int i9822 = i9722 + 1;
                obj2 = objArr4[i9822];
                if (obj2 instanceof Field) {
                }
                i29 = i92;
                i32 = objectFieldOffset222;
                i28 = 55296;
                objArr = objArr3;
                i26 = i10;
                cls = cls2;
                i31 = 0;
                i27 = (int) unsafe.objectFieldOffset(B3);
            } else {
                int i99 = i14 + 1;
                Field B4 = B(cls2, (String) objArr4[i14]);
                objArr = objArr3;
                if (i85 == 9 || i85 == 17) {
                    i26 = i10;
                    int i100 = i77 / 3;
                    objArr[i100 + i100 + 1] = B4.getType();
                } else {
                    if (i85 == 27) {
                        i26 = i10;
                        i33 = 1;
                        i14 += 2;
                    } else if (i85 == 49) {
                        i14 += 2;
                        i26 = i10;
                        i33 = 1;
                    } else {
                        if (i85 == 12 || i85 == 30 || i85 == 44) {
                            i26 = i10;
                            if (s2Var.a() == 1 || i87 != 0) {
                                i14 += 2;
                                int i101 = i77 / 3;
                                objArr[i101 + i101 + 1] = objArr4[i99];
                                cls = cls2;
                            } else {
                                cls = cls2;
                                i14 = i99;
                                i87 = 0;
                            }
                        } else if (i85 == 50) {
                            int i102 = i14 + 2;
                            int i103 = i75 + 1;
                            iArr[i75] = i77;
                            int i104 = i77 / 3;
                            int i105 = i104 + i104;
                            objArr[i105] = objArr4[i99];
                            if (i87 != 0) {
                                i14 += 3;
                                objArr[i105 + 1] = objArr4[i102];
                                cls = cls2;
                                i75 = i103;
                            } else {
                                i14 = i102;
                                cls = cls2;
                                i75 = i103;
                                i87 = 0;
                            }
                            i26 = i10;
                        } else {
                            i26 = i10;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(B4);
                        i27 = 1048575;
                        if ((charAt24 & TLObject.FLAG_12) != 0 || i85 > 17) {
                            i28 = 55296;
                            i29 = i82;
                            i30 = 0;
                        } else {
                            int i106 = i82 + 1;
                            int charAt26 = str.charAt(i82);
                            if (charAt26 >= 55296) {
                                int i107 = charAt26 & 8191;
                                int i108 = 13;
                                while (true) {
                                    i29 = i106 + 1;
                                    charAt10 = str.charAt(i106);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i107 |= (charAt10 & 8191) << i108;
                                    i108 += 13;
                                    i106 = i29;
                                }
                                charAt26 = i107 | (charAt10 << i108);
                            } else {
                                i29 = i106;
                            }
                            int i109 = (charAt26 / 32) + i26 + i26;
                            Object obj3 = objArr4[i109];
                            if (obj3 instanceof Field) {
                                B = (Field) obj3;
                            } else {
                                B = B(cls, (String) obj3);
                                objArr4[i109] = B;
                            }
                            i30 = charAt26 % 32;
                            i27 = (int) unsafe.objectFieldOffset(B);
                            i28 = 55296;
                        }
                        if (i85 >= 18 && i85 <= 49) {
                            iArr[i74] = objectFieldOffset;
                            i74++;
                        }
                        i31 = i30;
                        i32 = objectFieldOffset;
                    }
                    int i110 = i77 / 3;
                    objArr[i110 + i110 + i33] = objArr4[i99];
                    cls = cls2;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(B4);
                    i27 = 1048575;
                    if ((charAt24 & TLObject.FLAG_12) != 0) {
                    }
                    i28 = 55296;
                    i29 = i82;
                    i30 = 0;
                    if (i85 >= 18) {
                        iArr[i74] = objectFieldOffset;
                        i74++;
                    }
                    i31 = i30;
                    i32 = objectFieldOffset;
                }
                cls = cls2;
                i14 = i99;
                objectFieldOffset = (int) unsafe.objectFieldOffset(B4);
                i27 = 1048575;
                if ((charAt24 & TLObject.FLAG_12) != 0) {
                }
                i28 = 55296;
                i29 = i82;
                i30 = 0;
                if (i85 >= 18) {
                }
                i31 = i30;
                i32 = objectFieldOffset;
            }
            int i111 = i87;
            int i112 = i77 + 1;
            iArr2[i77] = i86;
            int i113 = i77 + 2;
            String str2 = str;
            iArr2[i112] = ((charAt24 & 512) != 0 ? TLObject.FLAG_29 : 0) | ((charAt24 & 256) != 0 ? TLObject.FLAG_28 : 0) | (i111 != 0 ? TLObject.FLAG_31 : 0) | (i85 << 20) | i32;
            i77 += 3;
            iArr2[i113] = (i31 << 20) | i27;
            cls2 = cls;
            objArr2 = objArr4;
            i41 = i28;
            length = i24;
            objArr3 = objArr;
            i10 = i26;
            i43 = i29;
            str = str2;
        }
        return new n2(iArr2, objArr3, i11, i13, s2Var.a, iArr, i15, i72, t1Var, t1Var2);
    }

    public static int s(Object obj, long j3) {
        return ((Integer) c3.h(obj, j3)).intValue();
    }

    public static int u(int i7) {
        return (i7 >>> 20) & qs.e4;
    }

    public static long w(Object obj, long j3) {
        return ((Long) c3.h(obj, j3)).longValue();
    }

    public final Object A(int i7, int i10, Object obj) {
        t2 y10 = y(i10);
        if (!p(i7, i10, obj)) {
            return y10.zze();
        }
        Object object = k.getObject(obj, v(i10) & 1048575);
        if (o(object)) {
            return object;
        }
        v1 zze = y10.zze();
        if (object != null) {
            y10.zzg(zze, object);
        }
        return zze;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01df, code lost:
    
        if (r2 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d5, code lost:
    
        if (r2 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d7, code lost:
    
        r6 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d8, code lost:
    
        r2 = r6;
     */
    @Override // com.google.android.gms.internal.play_billing.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(v1 v1Var) {
        int i7;
        long doubleToLongBits;
        int floatToIntBits;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i10 >= iArr.length) {
                return v1Var.zzc.hashCode() + (i11 * 53);
            }
            int v = v(i10);
            int i12 = 1048575 & v;
            int u10 = u(v);
            int i13 = iArr[i10];
            long j3 = i12;
            int i14 = 1237;
            switch (u10) {
                case 0:
                    i7 = i11 * 53;
                    doubleToLongBits = Double.doubleToLongBits(c3.c.a(v1Var, j3));
                    Charset charset = a2.a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i7 + floatToIntBits;
                    break;
                case 1:
                    i7 = i11 * 53;
                    floatToIntBits = Float.floatToIntBits(c3.c.b(v1Var, j3));
                    i11 = i7 + floatToIntBits;
                    break;
                case 2:
                    i7 = i11 * 53;
                    doubleToLongBits = c3.f(v1Var, j3);
                    Charset charset2 = a2.a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i7 + floatToIntBits;
                    break;
                case 3:
                    i7 = i11 * 53;
                    doubleToLongBits = c3.f(v1Var, j3);
                    Charset charset3 = a2.a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i7 + floatToIntBits;
                    break;
                case 4:
                    i7 = i11 * 53;
                    floatToIntBits = c3.e(v1Var, j3);
                    i11 = i7 + floatToIntBits;
                    break;
                case 5:
                    i7 = i11 * 53;
                    doubleToLongBits = c3.f(v1Var, j3);
                    Charset charset4 = a2.a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i7 + floatToIntBits;
                    break;
                case 6:
                    i7 = i11 * 53;
                    floatToIntBits = c3.e(v1Var, j3);
                    i11 = i7 + floatToIntBits;
                    break;
                case 7:
                    i7 = i11 * 53;
                    boolean g10 = c3.c.g(v1Var, j3);
                    Charset charset5 = a2.a;
                    break;
                case 8:
                    i7 = i11 * 53;
                    floatToIntBits = ((String) c3.h(v1Var, j3)).hashCode();
                    i11 = i7 + floatToIntBits;
                    break;
                case 9:
                    i7 = i11 * 53;
                    Object h = c3.h(v1Var, j3);
                    if (h != null) {
                        floatToIntBits = h.hashCode();
                        i11 = i7 + floatToIntBits;
                        break;
                    }
                    floatToIntBits = 37;
                    i11 = i7 + floatToIntBits;
                case 10:
                    i7 = i11 * 53;
                    floatToIntBits = c3.h(v1Var, j3).hashCode();
                    i11 = i7 + floatToIntBits;
                    break;
                case 11:
                    i7 = i11 * 53;
                    floatToIntBits = c3.e(v1Var, j3);
                    i11 = i7 + floatToIntBits;
                    break;
                case 12:
                    i7 = i11 * 53;
                    floatToIntBits = c3.e(v1Var, j3);
                    i11 = i7 + floatToIntBits;
                    break;
                case 13:
                    i7 = i11 * 53;
                    floatToIntBits = c3.e(v1Var, j3);
                    i11 = i7 + floatToIntBits;
                    break;
                case 14:
                    i7 = i11 * 53;
                    doubleToLongBits = c3.f(v1Var, j3);
                    Charset charset6 = a2.a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i7 + floatToIntBits;
                    break;
                case 15:
                    i7 = i11 * 53;
                    floatToIntBits = c3.e(v1Var, j3);
                    i11 = i7 + floatToIntBits;
                    break;
                case 16:
                    i7 = i11 * 53;
                    doubleToLongBits = c3.f(v1Var, j3);
                    Charset charset7 = a2.a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i7 + floatToIntBits;
                    break;
                case 17:
                    i7 = i11 * 53;
                    Object h7 = c3.h(v1Var, j3);
                    if (h7 != null) {
                        floatToIntBits = h7.hashCode();
                        i11 = i7 + floatToIntBits;
                        break;
                    }
                    floatToIntBits = 37;
                    i11 = i7 + floatToIntBits;
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
                    floatToIntBits = c3.h(v1Var, j3).hashCode();
                    i11 = i7 + floatToIntBits;
                    break;
                case 50:
                    i7 = i11 * 53;
                    floatToIntBits = c3.h(v1Var, j3).hashCode();
                    i11 = i7 + floatToIntBits;
                    break;
                case qs.o0 /* 51 */:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) c3.h(v1Var, j3)).doubleValue());
                        Charset charset8 = a2.a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i7 + floatToIntBits;
                        break;
                    }
                case qs.p0 /* 52 */:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) c3.h(v1Var, j3)).floatValue());
                        i11 = i7 + floatToIntBits;
                        break;
                    }
                case qs.q0 /* 53 */:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        doubleToLongBits = w(v1Var, j3);
                        Charset charset9 = a2.a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i7 + floatToIntBits;
                        break;
                    }
                case qs.r0 /* 54 */:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        doubleToLongBits = w(v1Var, j3);
                        Charset charset10 = a2.a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i7 + floatToIntBits;
                        break;
                    }
                case qs.s0 /* 55 */:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        floatToIntBits = s(v1Var, j3);
                        i11 = i7 + floatToIntBits;
                        break;
                    }
                case qs.t0 /* 56 */:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        doubleToLongBits = w(v1Var, j3);
                        Charset charset11 = a2.a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i7 + floatToIntBits;
                        break;
                    }
                case qs.u0 /* 57 */:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        floatToIntBits = s(v1Var, j3);
                        i11 = i7 + floatToIntBits;
                        break;
                    }
                case qs.v0 /* 58 */:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        boolean booleanValue = ((Boolean) c3.h(v1Var, j3)).booleanValue();
                        Charset charset12 = a2.a;
                        break;
                    }
                case qs.w0 /* 59 */:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        floatToIntBits = ((String) c3.h(v1Var, j3)).hashCode();
                        i11 = i7 + floatToIntBits;
                        break;
                    }
                case qs.x0 /* 60 */:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        floatToIntBits = c3.h(v1Var, j3).hashCode();
                        i11 = i7 + floatToIntBits;
                        break;
                    }
                case qs.y0 /* 61 */:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        floatToIntBits = c3.h(v1Var, j3).hashCode();
                        i11 = i7 + floatToIntBits;
                        break;
                    }
                case qs.z0 /* 62 */:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        floatToIntBits = s(v1Var, j3);
                        i11 = i7 + floatToIntBits;
                        break;
                    }
                case qs.A0 /* 63 */:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        floatToIntBits = s(v1Var, j3);
                        i11 = i7 + floatToIntBits;
                        break;
                    }
                case 64:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        floatToIntBits = s(v1Var, j3);
                        i11 = i7 + floatToIntBits;
                        break;
                    }
                case 65:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        doubleToLongBits = w(v1Var, j3);
                        Charset charset13 = a2.a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i7 + floatToIntBits;
                        break;
                    }
                case qs.D0 /* 66 */:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        floatToIntBits = s(v1Var, j3);
                        i11 = i7 + floatToIntBits;
                        break;
                    }
                case qs.E0 /* 67 */:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        doubleToLongBits = w(v1Var, j3);
                        Charset charset14 = a2.a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i7 + floatToIntBits;
                        break;
                    }
                case qs.F0 /* 68 */:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        floatToIntBits = c3.h(v1Var, j3).hashCode();
                        i11 = i7 + floatToIntBits;
                        break;
                    }
            }
            i10 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final boolean b(Object obj) {
        int i7;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.g) {
            int i15 = this.f[i13];
            int[] iArr = this.a;
            int i16 = iArr[i15];
            int v = v(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = k.getInt(obj, i18);
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
            if ((268435456 & v) == 0 || n(obj, i10, i7, i11, i19)) {
                int u10 = u(v);
                if (u10 == 9 || u10 == 17) {
                    if (n(obj, i10, i7, i11, i19) && !y(i10).b(c3.h(obj, v & 1048575))) {
                    }
                    i13++;
                    i14 = i7;
                    i12 = i11;
                } else {
                    if (u10 != 27) {
                        if (u10 == 60 || u10 == 68) {
                            if (p(i16, i10, obj) && !y(i10).b(c3.h(obj, v & 1048575))) {
                            }
                        } else if (u10 != 49) {
                            if (u10 == 50 && !((j2) c3.h(obj, v & 1048575)).isEmpty()) {
                                int i21 = i10 / 3;
                                this.b[i21 + i21].getClass();
                                throw new ClassCastException();
                            }
                        }
                        i13++;
                        i14 = i7;
                        i12 = i11;
                    }
                    List list = (List) c3.h(obj, v & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        t2 y10 = y(i10);
                        for (int i22 = 0; i22 < list.size(); i22++) {
                            if (y10.b(list.get(i22))) {
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

    @Override // com.google.android.gms.internal.play_billing.t2
    public final void c(Object obj, i2 i2Var) {
        int i7;
        int i10;
        n2 n2Var = this;
        Unsafe unsafe = k;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (true) {
            int[] iArr = n2Var.a;
            if (i12 >= iArr.length) {
                ((v1) obj).zzc.d(i2Var);
                return;
            }
            int v = n2Var.v(i12);
            int u10 = u(v);
            int i15 = iArr[i12];
            if (u10 <= 17) {
                int i16 = iArr[i12 + 2];
                int i17 = i16 & i11;
                if (i17 != i14) {
                    i13 = i17 == i11 ? 0 : unsafe.getInt(obj, i17);
                    i14 = i17;
                }
                i7 = 1 << (i16 >>> 20);
            } else {
                i7 = 0;
            }
            long j3 = v & i11;
            switch (u10) {
                case 0:
                    if (n2Var.n(obj, i12, i14, i13, i7)) {
                        ((m1) i2Var.a).h(i15, Double.doubleToRawLongBits(c3.c.a(obj, j3)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (n2Var.n(obj, i12, i14, i13, i7)) {
                        ((m1) i2Var.a).f(i15, Float.floatToRawIntBits(c3.c.b(obj, j3)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (n2Var.n(obj, i12, i14, i13, i7)) {
                        ((m1) i2Var.a).p(i15, unsafe.getLong(obj, j3));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (n2Var.n(obj, i12, i14, i13, i7)) {
                        ((m1) i2Var.a).p(i15, unsafe.getLong(obj, j3));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (n2Var.n(obj, i12, i14, i13, i7)) {
                        ((m1) i2Var.a).j(i15, unsafe.getInt(obj, j3));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (n2Var.n(obj, i12, i14, i13, i7)) {
                        ((m1) i2Var.a).h(i15, unsafe.getLong(obj, j3));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (n2Var.n(obj, i12, i14, i13, i7)) {
                        ((m1) i2Var.a).f(i15, unsafe.getInt(obj, j3));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (n2Var.n(obj, i12, i14, i13, i7)) {
                        byte g10 = c3.c.g(obj, j3);
                        m1 m1Var = (m1) i2Var.a;
                        m1Var.o(i15 << 3);
                        int i18 = m1Var.d;
                        try {
                            int i19 = i18 + 1;
                            try {
                                m1Var.b[i18] = g10;
                                m1Var.d = i19;
                                break;
                            } catch (IndexOutOfBoundsException e10) {
                                e = e10;
                                i18 = i19;
                                throw new androidx.datastore.preferences.protobuf.l(i18, m1Var.c, 1, e);
                            }
                        } catch (IndexOutOfBoundsException e11) {
                            e = e11;
                        }
                    } else {
                        continue;
                    }
                case 8:
                    if (n2Var.n(obj, i12, i14, i13, i7)) {
                        Object object = unsafe.getObject(obj, j3);
                        if (object instanceof String) {
                            ((m1) i2Var.a).l(i15, (String) object);
                            break;
                        } else {
                            ((m1) i2Var.a).e(i15, (l1) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (n2Var.n(obj, i12, i14, i13, i7)) {
                        i2Var.b(i15, unsafe.getObject(obj, j3), n2Var.y(i12));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (n2Var.n(obj, i12, i14, i13, i7)) {
                        ((m1) i2Var.a).e(i15, (l1) unsafe.getObject(obj, j3));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (n2Var.n(obj, i12, i14, i13, i7)) {
                        ((m1) i2Var.a).n(i15, unsafe.getInt(obj, j3));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (n2Var.n(obj, i12, i14, i13, i7)) {
                        ((m1) i2Var.a).j(i15, unsafe.getInt(obj, j3));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (n2Var.n(obj, i12, i14, i13, i7)) {
                        ((m1) i2Var.a).f(i15, unsafe.getInt(obj, j3));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (n2Var.n(obj, i12, i14, i13, i7)) {
                        ((m1) i2Var.a).h(i15, unsafe.getLong(obj, j3));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (n2Var.n(obj, i12, i14, i13, i7)) {
                        int i20 = unsafe.getInt(obj, j3);
                        ((m1) i2Var.a).n(i15, (i20 >> 31) ^ (i20 + i20));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (n2Var.n(obj, i12, i14, i13, i7)) {
                        long j10 = unsafe.getLong(obj, j3);
                        ((m1) i2Var.a).p(i15, (j10 >> 63) ^ (j10 + j10));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (n2Var.n(obj, i12, i14, i13, i7)) {
                        i2Var.a(i15, unsafe.getObject(obj, j3), n2Var.y(i12));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    u2.r(iArr[i12], (List) unsafe.getObject(obj, j3), i2Var, false);
                    break;
                case 19:
                    u2.v(iArr[i12], (List) unsafe.getObject(obj, j3), i2Var, false);
                    break;
                case 20:
                    u2.x(iArr[i12], (List) unsafe.getObject(obj, j3), i2Var, false);
                    break;
                case 21:
                    u2.d(iArr[i12], (List) unsafe.getObject(obj, j3), i2Var, false);
                    break;
                case 22:
                    u2.w(iArr[i12], (List) unsafe.getObject(obj, j3), i2Var, false);
                    break;
                case 23:
                    u2.u(iArr[i12], (List) unsafe.getObject(obj, j3), i2Var, false);
                    break;
                case 24:
                    u2.t(iArr[i12], (List) unsafe.getObject(obj, j3), i2Var, false);
                    break;
                case 25:
                    u2.q(iArr[i12], (List) unsafe.getObject(obj, j3), i2Var, false);
                    break;
                case 26:
                    int i21 = iArr[i12];
                    List list = (List) unsafe.getObject(obj, j3);
                    t1 t1Var = u2.a;
                    if (list != null && !list.isEmpty()) {
                        m1 m1Var2 = (m1) i2Var.a;
                        if (list instanceof e2) {
                            e2 e2Var = (e2) list;
                            for (int i22 = 0; i22 < list.size(); i22++) {
                                Object zza = e2Var.zza();
                                if (zza instanceof String) {
                                    m1Var2.l(i21, (String) zza);
                                } else {
                                    m1Var2.e(i21, (l1) zza);
                                }
                            }
                            break;
                        } else {
                            for (int i23 = 0; i23 < list.size(); i23++) {
                                m1Var2.l(i21, (String) list.get(i23));
                            }
                            break;
                        }
                    }
                    break;
                case 27:
                    int i24 = iArr[i12];
                    List list2 = (List) unsafe.getObject(obj, j3);
                    t2 y10 = n2Var.y(i12);
                    t1 t1Var2 = u2.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i25 = 0; i25 < list2.size(); i25++) {
                            i2Var.b(i24, list2.get(i25), y10);
                        }
                        break;
                    }
                    break;
                case 28:
                    int i26 = iArr[i12];
                    List list3 = (List) unsafe.getObject(obj, j3);
                    t1 t1Var3 = u2.a;
                    if (list3 != null && !list3.isEmpty()) {
                        i2Var.getClass();
                        for (int i27 = 0; i27 < list3.size(); i27++) {
                            ((m1) i2Var.a).e(i26, (l1) list3.get(i27));
                        }
                        break;
                    }
                    break;
                case 29:
                    u2.c(iArr[i12], (List) unsafe.getObject(obj, j3), i2Var, false);
                    break;
                case qs.T /* 30 */:
                    u2.s(iArr[i12], (List) unsafe.getObject(obj, j3), i2Var, false);
                    break;
                case qs.U /* 31 */:
                    u2.y(iArr[i12], (List) unsafe.getObject(obj, j3), i2Var, false);
                    break;
                case 32:
                    u2.z(iArr[i12], (List) unsafe.getObject(obj, j3), i2Var, false);
                    break;
                case 33:
                    u2.a(iArr[i12], (List) unsafe.getObject(obj, j3), i2Var, false);
                    break;
                case 34:
                    u2.b(iArr[i12], (List) unsafe.getObject(obj, j3), i2Var, false);
                    break;
                case 35:
                    u2.r(iArr[i12], (List) unsafe.getObject(obj, j3), i2Var, true);
                    break;
                case 36:
                    u2.v(iArr[i12], (List) unsafe.getObject(obj, j3), i2Var, true);
                    break;
                case 37:
                    u2.x(iArr[i12], (List) unsafe.getObject(obj, j3), i2Var, true);
                    break;
                case 38:
                    u2.d(iArr[i12], (List) unsafe.getObject(obj, j3), i2Var, true);
                    break;
                case 39:
                    u2.w(iArr[i12], (List) unsafe.getObject(obj, j3), i2Var, true);
                    break;
                case 40:
                    u2.u(iArr[i12], (List) unsafe.getObject(obj, j3), i2Var, true);
                    break;
                case 41:
                    u2.t(iArr[i12], (List) unsafe.getObject(obj, j3), i2Var, true);
                    break;
                case 42:
                    u2.q(iArr[i12], (List) unsafe.getObject(obj, j3), i2Var, true);
                    break;
                case 43:
                    u2.c(iArr[i12], (List) unsafe.getObject(obj, j3), i2Var, true);
                    break;
                case 44:
                    u2.s(iArr[i12], (List) unsafe.getObject(obj, j3), i2Var, true);
                    break;
                case 45:
                    u2.y(iArr[i12], (List) unsafe.getObject(obj, j3), i2Var, true);
                    break;
                case 46:
                    u2.z(iArr[i12], (List) unsafe.getObject(obj, j3), i2Var, true);
                    break;
                case 47:
                    u2.a(iArr[i12], (List) unsafe.getObject(obj, j3), i2Var, true);
                    break;
                case 48:
                    u2.b(iArr[i12], (List) unsafe.getObject(obj, j3), i2Var, true);
                    break;
                case 49:
                    int i28 = iArr[i12];
                    List list4 = (List) unsafe.getObject(obj, j3);
                    t2 y11 = n2Var.y(i12);
                    t1 t1Var4 = u2.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i29 = 0; i29 < list4.size(); i29++) {
                            i2Var.a(i28, list4.get(i29), y11);
                        }
                        break;
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j3) != null) {
                        int i30 = i12 / 3;
                        n2Var.b[i30 + i30].getClass();
                        throw new ClassCastException();
                    }
                    break;
                case qs.o0 /* 51 */:
                    if (n2Var.p(i15, i12, obj)) {
                        ((m1) i2Var.a).h(i15, Double.doubleToRawLongBits(((Double) c3.h(obj, j3)).doubleValue()));
                        break;
                    } else {
                        break;
                    }
                case qs.p0 /* 52 */:
                    if (n2Var.p(i15, i12, obj)) {
                        ((m1) i2Var.a).f(i15, Float.floatToRawIntBits(((Float) c3.h(obj, j3)).floatValue()));
                        break;
                    } else {
                        break;
                    }
                case qs.q0 /* 53 */:
                    if (n2Var.p(i15, i12, obj)) {
                        ((m1) i2Var.a).p(i15, w(obj, j3));
                        break;
                    } else {
                        break;
                    }
                case qs.r0 /* 54 */:
                    if (n2Var.p(i15, i12, obj)) {
                        ((m1) i2Var.a).p(i15, w(obj, j3));
                        break;
                    } else {
                        break;
                    }
                case qs.s0 /* 55 */:
                    if (n2Var.p(i15, i12, obj)) {
                        ((m1) i2Var.a).j(i15, s(obj, j3));
                        break;
                    } else {
                        break;
                    }
                case qs.t0 /* 56 */:
                    if (n2Var.p(i15, i12, obj)) {
                        ((m1) i2Var.a).h(i15, w(obj, j3));
                        break;
                    } else {
                        break;
                    }
                case qs.u0 /* 57 */:
                    if (n2Var.p(i15, i12, obj)) {
                        ((m1) i2Var.a).f(i15, s(obj, j3));
                        break;
                    } else {
                        break;
                    }
                case qs.v0 /* 58 */:
                    if (n2Var.p(i15, i12, obj)) {
                        byte booleanValue = ((Boolean) c3.h(obj, j3)).booleanValue();
                        m1 m1Var3 = (m1) i2Var.a;
                        m1Var3.o(i15 << 3);
                        int i31 = m1Var3.d;
                        try {
                            i10 = i31 + 1;
                        } catch (IndexOutOfBoundsException e12) {
                            e = e12;
                        }
                        try {
                            m1Var3.b[i31] = booleanValue;
                            m1Var3.d = i10;
                            break;
                        } catch (IndexOutOfBoundsException e13) {
                            e = e13;
                            i31 = i10;
                            throw new androidx.datastore.preferences.protobuf.l(i31, m1Var3.c, 1, e);
                        }
                    } else {
                        continue;
                    }
                case qs.w0 /* 59 */:
                    if (n2Var.p(i15, i12, obj)) {
                        Object object2 = unsafe.getObject(obj, j3);
                        if (object2 instanceof String) {
                            ((m1) i2Var.a).l(i15, (String) object2);
                            break;
                        } else {
                            ((m1) i2Var.a).e(i15, (l1) object2);
                            break;
                        }
                    } else {
                        break;
                    }
                case qs.x0 /* 60 */:
                    if (n2Var.p(i15, i12, obj)) {
                        i2Var.b(i15, unsafe.getObject(obj, j3), n2Var.y(i12));
                        break;
                    } else {
                        break;
                    }
                case qs.y0 /* 61 */:
                    if (n2Var.p(i15, i12, obj)) {
                        ((m1) i2Var.a).e(i15, (l1) unsafe.getObject(obj, j3));
                        break;
                    } else {
                        break;
                    }
                case qs.z0 /* 62 */:
                    if (n2Var.p(i15, i12, obj)) {
                        ((m1) i2Var.a).n(i15, s(obj, j3));
                        break;
                    } else {
                        break;
                    }
                case qs.A0 /* 63 */:
                    if (n2Var.p(i15, i12, obj)) {
                        ((m1) i2Var.a).j(i15, s(obj, j3));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (n2Var.p(i15, i12, obj)) {
                        ((m1) i2Var.a).f(i15, s(obj, j3));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (n2Var.p(i15, i12, obj)) {
                        ((m1) i2Var.a).h(i15, w(obj, j3));
                        break;
                    } else {
                        break;
                    }
                case qs.D0 /* 66 */:
                    if (n2Var.p(i15, i12, obj)) {
                        int s5 = s(obj, j3);
                        ((m1) i2Var.a).n(i15, (s5 >> 31) ^ (s5 + s5));
                        break;
                    } else {
                        break;
                    }
                case qs.E0 /* 67 */:
                    if (n2Var.p(i15, i12, obj)) {
                        long w10 = w(obj, j3);
                        ((m1) i2Var.a).p(i15, (w10 >> 63) ^ (w10 + w10));
                        break;
                    } else {
                        break;
                    }
                case qs.F0 /* 68 */:
                    if (n2Var.p(i15, i12, obj)) {
                        i2Var.a(i15, unsafe.getObject(obj, j3), n2Var.y(i12));
                        break;
                    } else {
                        break;
                    }
            }
            i12 += 3;
            i11 = 1048575;
            n2Var = this;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final int d(e1 e1Var) {
        int i7;
        int b10;
        int b11;
        int c10;
        int b12;
        int j3;
        int b13;
        int b14;
        int b15;
        int b16;
        int i10;
        int b17;
        int h;
        int b18;
        int size;
        int n10;
        int b19;
        int size2;
        int b20;
        int b21;
        int j10;
        int b22;
        n2 n2Var = this;
        e1 e1Var2 = e1Var;
        Unsafe unsafe = k;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (true) {
            int[] iArr = n2Var.a;
            if (i11 >= iArr.length) {
                return ((v1) e1Var).zzc.a() + i13;
            }
            int v = n2Var.v(i11);
            int u10 = u(v);
            int i15 = iArr[i11];
            int i16 = iArr[i11 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1;
            if (u10 <= 17) {
                if (i17 != i14) {
                    i12 = i17 == 1048575 ? 0 : unsafe.getInt(e1Var2, i17);
                    i14 = i17;
                }
                i7 = 1 << (i16 >>> 20);
            } else {
                i7 = 0;
            }
            int i19 = v & 1048575;
            if (u10 >= q1.b.a) {
                q1.c.getClass();
            }
            long j11 = i19;
            switch (u10) {
                case 0:
                    if (n2Var.n(e1Var2, i11, i14, i12, i7)) {
                        b10 = m1.b(i15 << 3);
                        i18 = 8;
                        h = b10 + i18;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 1:
                    if (n2Var.n(e1Var2, i11, i14, i12, i7)) {
                        b10 = m1.b(i15 << 3);
                        i18 = 4;
                        h = b10 + i18;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 2:
                    if (n2Var.n(e1Var2, i11, i14, i12, i7)) {
                        long j12 = unsafe.getLong(e1Var2, j11);
                        b11 = m1.b(i15 << 3);
                        c10 = m1.c(j12);
                        h = b11 + c10;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 3:
                    if (n2Var.n(e1Var2, i11, i14, i12, i7)) {
                        long j13 = unsafe.getLong(e1Var2, j11);
                        b11 = m1.b(i15 << 3);
                        c10 = m1.c(j13);
                        h = b11 + c10;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 4:
                    if (n2Var.n(e1Var2, i11, i14, i12, i7)) {
                        long j14 = unsafe.getInt(e1Var2, j11);
                        b11 = m1.b(i15 << 3);
                        c10 = m1.c(j14);
                        h = b11 + c10;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 5:
                    if (n2Var.n(e1Var2, i11, i14, i12, i7)) {
                        b10 = m1.b(i15 << 3);
                        i18 = 8;
                        h = b10 + i18;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 6:
                    if (n2Var.n(e1Var2, i11, i14, i12, i7)) {
                        b10 = m1.b(i15 << 3);
                        i18 = 4;
                        h = b10 + i18;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 7:
                    if (n2Var.n(e1Var2, i11, i14, i12, i7)) {
                        b10 = m1.b(i15 << 3);
                        h = b10 + i18;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 8:
                    if (n2Var.n(e1Var2, i11, i14, i12, i7)) {
                        int i20 = i15 << 3;
                        Object object = unsafe.getObject(e1Var2, j11);
                        if (object instanceof l1) {
                            b12 = m1.b(i20);
                            j3 = ((l1) object).j();
                            b13 = m1.b(j3);
                            c10 = b13 + j3;
                            b11 = b12;
                            h = b11 + c10;
                            b18 = h;
                            i13 += b18;
                            i11 += 3;
                            n2Var = this;
                            e1Var2 = e1Var;
                        } else {
                            b12 = m1.b(i20);
                            c10 = m1.a((String) object);
                            b11 = b12;
                            h = b11 + c10;
                            b18 = h;
                            i13 += b18;
                            i11 += 3;
                            n2Var = this;
                            e1Var2 = e1Var;
                        }
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 9:
                    if (n2Var.n(e1Var2, i11, i14, i12, i7)) {
                        Object object2 = unsafe.getObject(e1Var2, j11);
                        t2 y10 = n2Var.y(i11);
                        t1 t1Var = u2.a;
                        b14 = m1.b(i15 << 3);
                        b15 = ((e1) object2).b(y10);
                        b16 = m1.b(b15);
                        h = b16 + b15 + b14;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 10:
                    if (n2Var.n(e1Var2, i11, i14, i12, i7)) {
                        l1 l1Var = (l1) unsafe.getObject(e1Var2, j11);
                        b12 = m1.b(i15 << 3);
                        j3 = l1Var.j();
                        b13 = m1.b(j3);
                        c10 = b13 + j3;
                        b11 = b12;
                        h = b11 + c10;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 11:
                    if (n2Var.n(e1Var2, i11, i14, i12, i7)) {
                        int i21 = unsafe.getInt(e1Var2, j11);
                        b12 = m1.b(i15 << 3);
                        c10 = m1.b(i21);
                        b11 = b12;
                        h = b11 + c10;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 12:
                    if (n2Var.n(e1Var2, i11, i14, i12, i7)) {
                        long j15 = unsafe.getInt(e1Var2, j11);
                        b11 = m1.b(i15 << 3);
                        c10 = m1.c(j15);
                        h = b11 + c10;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 13:
                    if (n2Var.n(e1Var2, i11, i14, i12, i7)) {
                        b10 = m1.b(i15 << 3);
                        i18 = 4;
                        h = b10 + i18;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 14:
                    if (n2Var.n(e1Var2, i11, i14, i12, i7)) {
                        b10 = m1.b(i15 << 3);
                        i18 = 8;
                        h = b10 + i18;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 15:
                    if (n2Var.n(e1Var2, i11, i14, i12, i7)) {
                        int i22 = unsafe.getInt(e1Var2, j11);
                        b12 = m1.b(i15 << 3);
                        c10 = m1.b((i22 >> 31) ^ (i22 + i22));
                        b11 = b12;
                        h = b11 + c10;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 16:
                    if (n2Var.n(e1Var2, i11, i14, i12, i7)) {
                        long j16 = unsafe.getLong(e1Var2, j11);
                        b11 = m1.b(i15 << 3);
                        c10 = m1.c((j16 >> 63) ^ (j16 + j16));
                        h = b11 + c10;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 17:
                    if (n2Var.n(e1Var2, i11, i14, i12, i7)) {
                        e1 e1Var3 = (e1) unsafe.getObject(e1Var2, j11);
                        t2 y11 = n2Var.y(i11);
                        int b23 = m1.b(i15 << 3);
                        i10 = b23 + b23;
                        b17 = e1Var3.b(y11);
                        h = b17 + i10;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 18:
                    h = u2.h(i15, (List) unsafe.getObject(e1Var2, j11));
                    b18 = h;
                    i13 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 19:
                    h = u2.g(i15, (List) unsafe.getObject(e1Var2, j11));
                    b18 = h;
                    i13 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 20:
                    List list = (List) unsafe.getObject(e1Var2, j11);
                    t1 t1Var2 = u2.a;
                    if (list.size() != 0) {
                        b18 = (m1.b(i15 << 3) * list.size()) + u2.j(list);
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i13 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 21:
                    List list2 = (List) unsafe.getObject(e1Var2, j11);
                    t1 t1Var3 = u2.a;
                    size = list2.size();
                    if (size != 0) {
                        n10 = u2.n(list2);
                        b19 = m1.b(i15 << 3);
                        b18 = (b19 * size) + n10;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i13 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 22:
                    List list3 = (List) unsafe.getObject(e1Var2, j11);
                    t1 t1Var4 = u2.a;
                    size = list3.size();
                    if (size != 0) {
                        n10 = u2.i(list3);
                        b19 = m1.b(i15 << 3);
                        b18 = (b19 * size) + n10;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i13 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 23:
                    h = u2.h(i15, (List) unsafe.getObject(e1Var2, j11));
                    b18 = h;
                    i13 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 24:
                    h = u2.g(i15, (List) unsafe.getObject(e1Var2, j11));
                    b18 = h;
                    i13 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 25:
                    List list4 = (List) unsafe.getObject(e1Var2, j11);
                    t1 t1Var5 = u2.a;
                    int size3 = list4.size();
                    if (size3 != 0) {
                        b18 = (m1.b(i15 << 3) + 1) * size3;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i13 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 26:
                    List list5 = (List) unsafe.getObject(e1Var2, j11);
                    t1 t1Var6 = u2.a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        int b24 = m1.b(i15 << 3) * size4;
                        if (list5 instanceof e2) {
                            e2 e2Var = (e2) list5;
                            b18 = b24;
                            for (int i23 = 0; i23 < size4; i23++) {
                                Object zza = e2Var.zza();
                                if (zza instanceof l1) {
                                    int j17 = ((l1) zza).j();
                                    b18 = m1.b(j17) + j17 + b18;
                                } else {
                                    b18 = m1.a((String) zza) + b18;
                                }
                            }
                        } else {
                            b18 = b24;
                            for (int i24 = 0; i24 < size4; i24++) {
                                Object obj = list5.get(i24);
                                if (obj instanceof l1) {
                                    int j18 = ((l1) obj).j();
                                    b18 = m1.b(j18) + j18 + b18;
                                } else {
                                    b18 = m1.a((String) obj) + b18;
                                }
                            }
                        }
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i13 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 27:
                    List list6 = (List) unsafe.getObject(e1Var2, j11);
                    t2 y12 = n2Var.y(i11);
                    t1 t1Var7 = u2.a;
                    int size5 = list6.size();
                    if (size5 != 0) {
                        b18 = m1.b(i15 << 3) * size5;
                        for (int i25 = 0; i25 < size5; i25++) {
                            int b25 = ((e1) list6.get(i25)).b(y12);
                            b18 += m1.b(b25) + b25;
                        }
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i13 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 28:
                    List list7 = (List) unsafe.getObject(e1Var2, j11);
                    t1 t1Var8 = u2.a;
                    int size6 = list7.size();
                    if (size6 != 0) {
                        int b26 = m1.b(i15 << 3) * size6;
                        b18 = b26;
                        for (int i26 = 0; i26 < list7.size(); i26++) {
                            int j19 = ((l1) list7.get(i26)).j();
                            b18 += m1.b(j19) + j19;
                        }
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i13 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 29:
                    List list8 = (List) unsafe.getObject(e1Var2, j11);
                    t1 t1Var9 = u2.a;
                    size = list8.size();
                    if (size != 0) {
                        n10 = u2.m(list8);
                        b19 = m1.b(i15 << 3);
                        b18 = (b19 * size) + n10;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i13 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case qs.T /* 30 */:
                    List list9 = (List) unsafe.getObject(e1Var2, j11);
                    t1 t1Var10 = u2.a;
                    size = list9.size();
                    if (size != 0) {
                        n10 = u2.f(list9);
                        b19 = m1.b(i15 << 3);
                        b18 = (b19 * size) + n10;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i13 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case qs.U /* 31 */:
                    h = u2.g(i15, (List) unsafe.getObject(e1Var2, j11));
                    b18 = h;
                    i13 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 32:
                    h = u2.h(i15, (List) unsafe.getObject(e1Var2, j11));
                    b18 = h;
                    i13 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 33:
                    List list10 = (List) unsafe.getObject(e1Var2, j11);
                    t1 t1Var11 = u2.a;
                    size = list10.size();
                    if (size != 0) {
                        n10 = u2.k(list10);
                        b19 = m1.b(i15 << 3);
                        b18 = (b19 * size) + n10;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i13 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 34:
                    List list11 = (List) unsafe.getObject(e1Var2, j11);
                    t1 t1Var12 = u2.a;
                    size = list11.size();
                    if (size != 0) {
                        n10 = u2.l(list11);
                        b19 = m1.b(i15 << 3);
                        b18 = (b19 * size) + n10;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i13 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 35:
                    List list12 = (List) unsafe.getObject(e1Var2, j11);
                    t1 t1Var13 = u2.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        b20 = m1.b(i15 << 3);
                        b21 = m1.b(size2);
                        i18 = size2;
                        b10 = b20 + b21;
                        h = b10 + i18;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(e1Var2, j11);
                    t1 t1Var14 = u2.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        b20 = m1.b(i15 << 3);
                        b21 = m1.b(size2);
                        i18 = size2;
                        b10 = b20 + b21;
                        h = b10 + i18;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 37:
                    size2 = u2.j((List) unsafe.getObject(e1Var2, j11));
                    if (size2 > 0) {
                        b20 = m1.b(i15 << 3);
                        b21 = m1.b(size2);
                        i18 = size2;
                        b10 = b20 + b21;
                        h = b10 + i18;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 38:
                    size2 = u2.n((List) unsafe.getObject(e1Var2, j11));
                    if (size2 > 0) {
                        b20 = m1.b(i15 << 3);
                        b21 = m1.b(size2);
                        i18 = size2;
                        b10 = b20 + b21;
                        h = b10 + i18;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 39:
                    size2 = u2.i((List) unsafe.getObject(e1Var2, j11));
                    if (size2 > 0) {
                        b20 = m1.b(i15 << 3);
                        b21 = m1.b(size2);
                        i18 = size2;
                        b10 = b20 + b21;
                        h = b10 + i18;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(e1Var2, j11);
                    t1 t1Var15 = u2.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        b20 = m1.b(i15 << 3);
                        b21 = m1.b(size2);
                        i18 = size2;
                        b10 = b20 + b21;
                        h = b10 + i18;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(e1Var2, j11);
                    t1 t1Var16 = u2.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        b20 = m1.b(i15 << 3);
                        b21 = m1.b(size2);
                        i18 = size2;
                        b10 = b20 + b21;
                        h = b10 + i18;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(e1Var2, j11);
                    t1 t1Var17 = u2.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        b20 = m1.b(i15 << 3);
                        b21 = m1.b(size2);
                        i18 = size2;
                        b10 = b20 + b21;
                        h = b10 + i18;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 43:
                    size2 = u2.m((List) unsafe.getObject(e1Var2, j11));
                    if (size2 > 0) {
                        b20 = m1.b(i15 << 3);
                        b21 = m1.b(size2);
                        i18 = size2;
                        b10 = b20 + b21;
                        h = b10 + i18;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 44:
                    size2 = u2.f((List) unsafe.getObject(e1Var2, j11));
                    if (size2 > 0) {
                        b20 = m1.b(i15 << 3);
                        b21 = m1.b(size2);
                        i18 = size2;
                        b10 = b20 + b21;
                        h = b10 + i18;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(e1Var2, j11);
                    t1 t1Var18 = u2.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        b20 = m1.b(i15 << 3);
                        b21 = m1.b(size2);
                        i18 = size2;
                        b10 = b20 + b21;
                        h = b10 + i18;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(e1Var2, j11);
                    t1 t1Var19 = u2.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        b20 = m1.b(i15 << 3);
                        b21 = m1.b(size2);
                        i18 = size2;
                        b10 = b20 + b21;
                        h = b10 + i18;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 47:
                    size2 = u2.k((List) unsafe.getObject(e1Var2, j11));
                    if (size2 > 0) {
                        b20 = m1.b(i15 << 3);
                        b21 = m1.b(size2);
                        i18 = size2;
                        b10 = b20 + b21;
                        h = b10 + i18;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 48:
                    size2 = u2.l((List) unsafe.getObject(e1Var2, j11));
                    if (size2 > 0) {
                        b20 = m1.b(i15 << 3);
                        b21 = m1.b(size2);
                        i18 = size2;
                        b10 = b20 + b21;
                        h = b10 + i18;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(e1Var2, j11);
                    t2 y13 = n2Var.y(i11);
                    t1 t1Var20 = u2.a;
                    int size7 = list19.size();
                    if (size7 != 0) {
                        b18 = 0;
                        for (int i27 = 0; i27 < size7; i27++) {
                            e1 e1Var4 = (e1) list19.get(i27);
                            int b27 = m1.b(i15 << 3);
                            b18 += e1Var4.b(y13) + b27 + b27;
                        }
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i13 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 50:
                    int i28 = i11 / 3;
                    j2 j2Var = (j2) unsafe.getObject(e1Var2, j11);
                    if (n2Var.b[i28 + i28] != null) {
                        throw new ClassCastException();
                    }
                    if (j2Var.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = j2Var.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case qs.o0 /* 51 */:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        b10 = m1.b(i15 << 3);
                        i18 = 8;
                        h = b10 + i18;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case qs.p0 /* 52 */:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        b10 = m1.b(i15 << 3);
                        i18 = 4;
                        h = b10 + i18;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case qs.q0 /* 53 */:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        long w10 = w(e1Var2, j11);
                        b11 = m1.b(i15 << 3);
                        c10 = m1.c(w10);
                        h = b11 + c10;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case qs.r0 /* 54 */:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        long w11 = w(e1Var2, j11);
                        b11 = m1.b(i15 << 3);
                        c10 = m1.c(w11);
                        h = b11 + c10;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case qs.s0 /* 55 */:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        long s5 = s(e1Var2, j11);
                        b11 = m1.b(i15 << 3);
                        c10 = m1.c(s5);
                        h = b11 + c10;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case qs.t0 /* 56 */:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        b10 = m1.b(i15 << 3);
                        i18 = 8;
                        h = b10 + i18;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case qs.u0 /* 57 */:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        b10 = m1.b(i15 << 3);
                        i18 = 4;
                        h = b10 + i18;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case qs.v0 /* 58 */:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        b10 = m1.b(i15 << 3);
                        h = b10 + i18;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case qs.w0 /* 59 */:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        int i29 = i15 << 3;
                        Object object3 = unsafe.getObject(e1Var2, j11);
                        if (object3 instanceof l1) {
                            b11 = m1.b(i29);
                            j10 = ((l1) object3).j();
                            b22 = m1.b(j10);
                            c10 = j10 + b22;
                            h = b11 + c10;
                            b18 = h;
                            i13 += b18;
                            i11 += 3;
                            n2Var = this;
                            e1Var2 = e1Var;
                        } else {
                            b11 = m1.b(i29);
                            c10 = m1.a((String) object3);
                            h = b11 + c10;
                            b18 = h;
                            i13 += b18;
                            i11 += 3;
                            n2Var = this;
                            e1Var2 = e1Var;
                        }
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case qs.x0 /* 60 */:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        Object object4 = unsafe.getObject(e1Var2, j11);
                        t2 y14 = n2Var.y(i11);
                        t1 t1Var21 = u2.a;
                        b14 = m1.b(i15 << 3);
                        b15 = ((e1) object4).b(y14);
                        b16 = m1.b(b15);
                        h = b16 + b15 + b14;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case qs.y0 /* 61 */:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        l1 l1Var2 = (l1) unsafe.getObject(e1Var2, j11);
                        b11 = m1.b(i15 << 3);
                        j10 = l1Var2.j();
                        b22 = m1.b(j10);
                        c10 = j10 + b22;
                        h = b11 + c10;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case qs.z0 /* 62 */:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        int s9 = s(e1Var2, j11);
                        b11 = m1.b(i15 << 3);
                        c10 = m1.b(s9);
                        h = b11 + c10;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case qs.A0 /* 63 */:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        long s10 = s(e1Var2, j11);
                        b11 = m1.b(i15 << 3);
                        c10 = m1.c(s10);
                        h = b11 + c10;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 64:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        b10 = m1.b(i15 << 3);
                        i18 = 4;
                        h = b10 + i18;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 65:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        b10 = m1.b(i15 << 3);
                        i18 = 8;
                        h = b10 + i18;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case qs.D0 /* 66 */:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        int s11 = s(e1Var2, j11);
                        b11 = m1.b(i15 << 3);
                        c10 = m1.b((s11 >> 31) ^ (s11 + s11));
                        h = b11 + c10;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case qs.E0 /* 67 */:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        long w12 = w(e1Var2, j11);
                        b11 = m1.b(i15 << 3);
                        c10 = m1.c((w12 >> 63) ^ (w12 + w12));
                        h = b11 + c10;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case qs.F0 /* 68 */:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        e1 e1Var5 = (e1) unsafe.getObject(e1Var2, j11);
                        t2 y15 = n2Var.y(i11);
                        int b28 = m1.b(i15 << 3);
                        i10 = b28 + b28;
                        b17 = e1Var5.b(y15);
                        h = b17 + i10;
                        b18 = h;
                        i13 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                default:
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final void e(Object obj, byte[] bArr, int i7, int i10, h1 h1Var) {
        q(obj, bArr, i7, i10, 0, h1Var);
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final boolean f(v1 v1Var, v1 v1Var2) {
        boolean e10;
        int i7 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i7 < iArr.length) {
                int v = v(i7);
                long j3 = v & 1048575;
                switch (u(v)) {
                    case 0:
                        if (!l(v1Var, v1Var2, i7)) {
                            break;
                        } else {
                            b3 b3Var = c3.c;
                            if (Double.doubleToLongBits(b3Var.a(v1Var, j3)) != Double.doubleToLongBits(b3Var.a(v1Var2, j3))) {
                                break;
                            } else {
                                continue;
                                i7 += 3;
                            }
                        }
                    case 1:
                        if (!l(v1Var, v1Var2, i7)) {
                            break;
                        } else {
                            b3 b3Var2 = c3.c;
                            if (Float.floatToIntBits(b3Var2.b(v1Var, j3)) != Float.floatToIntBits(b3Var2.b(v1Var2, j3))) {
                                break;
                            } else {
                                continue;
                                i7 += 3;
                            }
                        }
                    case 2:
                        if (l(v1Var, v1Var2, i7) && c3.f(v1Var, j3) == c3.f(v1Var2, j3)) {
                            continue;
                            i7 += 3;
                        }
                        break;
                    case 3:
                        if (l(v1Var, v1Var2, i7) && c3.f(v1Var, j3) == c3.f(v1Var2, j3)) {
                            continue;
                            i7 += 3;
                        }
                        break;
                    case 4:
                        if (l(v1Var, v1Var2, i7) && c3.e(v1Var, j3) == c3.e(v1Var2, j3)) {
                            continue;
                            i7 += 3;
                        }
                        break;
                    case 5:
                        if (l(v1Var, v1Var2, i7) && c3.f(v1Var, j3) == c3.f(v1Var2, j3)) {
                            continue;
                            i7 += 3;
                        }
                        break;
                    case 6:
                        if (l(v1Var, v1Var2, i7) && c3.e(v1Var, j3) == c3.e(v1Var2, j3)) {
                            continue;
                            i7 += 3;
                        }
                        break;
                    case 7:
                        if (!l(v1Var, v1Var2, i7)) {
                            break;
                        } else {
                            b3 b3Var3 = c3.c;
                            if (b3Var3.g(v1Var, j3) != b3Var3.g(v1Var2, j3)) {
                                break;
                            } else {
                                continue;
                                i7 += 3;
                            }
                        }
                    case 8:
                        if (l(v1Var, v1Var2, i7) && u2.e(c3.h(v1Var, j3), c3.h(v1Var2, j3))) {
                            continue;
                            i7 += 3;
                        }
                        break;
                    case 9:
                        if (l(v1Var, v1Var2, i7) && u2.e(c3.h(v1Var, j3), c3.h(v1Var2, j3))) {
                            continue;
                            i7 += 3;
                        }
                        break;
                    case 10:
                        if (l(v1Var, v1Var2, i7) && u2.e(c3.h(v1Var, j3), c3.h(v1Var2, j3))) {
                            continue;
                            i7 += 3;
                        }
                        break;
                    case 11:
                        if (l(v1Var, v1Var2, i7) && c3.e(v1Var, j3) == c3.e(v1Var2, j3)) {
                            continue;
                            i7 += 3;
                        }
                        break;
                    case 12:
                        if (l(v1Var, v1Var2, i7) && c3.e(v1Var, j3) == c3.e(v1Var2, j3)) {
                            continue;
                            i7 += 3;
                        }
                        break;
                    case 13:
                        if (l(v1Var, v1Var2, i7) && c3.e(v1Var, j3) == c3.e(v1Var2, j3)) {
                            continue;
                            i7 += 3;
                        }
                        break;
                    case 14:
                        if (l(v1Var, v1Var2, i7) && c3.f(v1Var, j3) == c3.f(v1Var2, j3)) {
                            continue;
                            i7 += 3;
                        }
                        break;
                    case 15:
                        if (l(v1Var, v1Var2, i7) && c3.e(v1Var, j3) == c3.e(v1Var2, j3)) {
                            continue;
                            i7 += 3;
                        }
                        break;
                    case 16:
                        if (l(v1Var, v1Var2, i7) && c3.f(v1Var, j3) == c3.f(v1Var2, j3)) {
                            continue;
                            i7 += 3;
                        }
                        break;
                    case 17:
                        if (l(v1Var, v1Var2, i7) && u2.e(c3.h(v1Var, j3), c3.h(v1Var2, j3))) {
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
                        e10 = u2.e(c3.h(v1Var, j3), c3.h(v1Var2, j3));
                        break;
                    case 50:
                        e10 = u2.e(c3.h(v1Var, j3), c3.h(v1Var2, j3));
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
                        if (c3.e(v1Var, j10) == c3.e(v1Var2, j10) && u2.e(c3.h(v1Var, j3), c3.h(v1Var2, j3))) {
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
            } else if (v1Var.zzc.equals(v1Var2.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final void g(int i7, Object obj, Object obj2) {
        if (m(i7, obj2)) {
            int v = v(i7) & 1048575;
            Unsafe unsafe = k;
            long j3 = v;
            Object object = unsafe.getObject(obj2, j3);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i7] + " is present but null: " + obj2.toString());
            }
            t2 y10 = y(i7);
            if (!m(i7, obj)) {
                if (o(object)) {
                    v1 zze = y10.zze();
                    y10.zzg(zze, object);
                    unsafe.putObject(obj, j3, zze);
                } else {
                    unsafe.putObject(obj, j3, object);
                }
                i(i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j3);
            if (!o(object2)) {
                v1 zze2 = y10.zze();
                y10.zzg(zze2, object2);
                unsafe.putObject(obj, j3, zze2);
                object2 = zze2;
            }
            y10.zzg(object2, object);
        }
    }

    public final void h(int i7, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i10 = iArr[i7];
        if (p(i10, i7, obj2)) {
            int v = v(i7) & 1048575;
            Unsafe unsafe = k;
            long j3 = v;
            Object object = unsafe.getObject(obj2, j3);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i7] + " is present but null: " + obj2.toString());
            }
            t2 y10 = y(i7);
            if (!p(i10, i7, obj)) {
                if (o(object)) {
                    v1 zze = y10.zze();
                    y10.zzg(zze, object);
                    unsafe.putObject(obj, j3, zze);
                } else {
                    unsafe.putObject(obj, j3, object);
                }
                c3.j(obj, iArr[i7 + 2] & 1048575, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j3);
            if (!o(object2)) {
                v1 zze2 = y10.zze();
                y10.zzg(zze2, object2);
                unsafe.putObject(obj, j3, zze2);
                object2 = zze2;
            }
            y10.zzg(object2, object);
        }
    }

    public final void i(int i7, Object obj) {
        int i10 = this.a[i7 + 2];
        long j3 = 1048575 & i10;
        if (j3 == 1048575) {
            return;
        }
        c3.j(obj, j3, (1 << (i10 >>> 20)) | c3.e(obj, j3));
    }

    public final void j(int i7, Object obj, Object obj2) {
        k.putObject(obj, v(i7) & 1048575, obj2);
        i(i7, obj);
    }

    public final void k(int i7, Object obj, Object obj2, int i10) {
        k.putObject(obj, v(i10) & 1048575, obj2);
        c3.j(obj, this.a[i10 + 2] & 1048575, i7);
    }

    public final boolean l(v1 v1Var, v1 v1Var2, int i7) {
        return m(i7, v1Var) == m(i7, v1Var2);
    }

    public final boolean m(int i7, Object obj) {
        int i10 = this.a[i7 + 2];
        long j3 = i10 & 1048575;
        if (j3 == 1048575) {
            int v = v(i7);
            long j10 = v & 1048575;
            switch (u(v)) {
                case 0:
                    if (Double.doubleToRawLongBits(c3.c.a(obj, j10)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(c3.c.b(obj, j10)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (c3.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (c3.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (c3.e(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (c3.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (c3.e(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return c3.c.g(obj, j10);
                case 8:
                    Object h = c3.h(obj, j10);
                    if (h instanceof String) {
                        if (((String) h).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(h instanceof l1)) {
                            throw new IllegalArgumentException();
                        }
                        if (l1.c.equals(h)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (c3.h(obj, j10) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (l1.c.equals(c3.h(obj, j10))) {
                        return false;
                    }
                    break;
                case 11:
                    if (c3.e(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (c3.e(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (c3.e(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (c3.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (c3.e(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (c3.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (c3.h(obj, j10) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & c3.e(obj, j3)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean n(Object obj, int i7, int i10, int i11, int i12) {
        return i10 == 1048575 ? m(i7, obj) : (i11 & i12) != 0;
    }

    public final boolean p(int i7, int i10, Object obj) {
        return c3.e(obj, (long) (this.a[i10 + 2] & 1048575)) == i7;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int q(java.lang.Object r38, byte[] r39, int r40, int r41, int r42, com.google.android.gms.internal.play_billing.h1 r43) {
        /*
            Method dump skipped, instructions count: 3930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.n2.q(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.h1):int");
    }

    public final int t(int i7, int i10) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
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
        return -1;
    }

    public final int v(int i7) {
        return this.a[i7 + 1];
    }

    public final x1 x(int i7) {
        int i10 = i7 / 3;
        return (x1) this.b[i10 + i10 + 1];
    }

    public final t2 y(int i7) {
        int i10 = i7 / 3;
        int i11 = i10 + i10;
        Object[] objArr = this.b;
        t2 t2Var = (t2) objArr[i11];
        if (t2Var != null) {
            return t2Var;
        }
        t2 a10 = q2.c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a10;
        return a10;
    }

    public final Object z(int i7, Object obj) {
        t2 y10 = y(i7);
        int v = v(i7) & 1048575;
        if (!m(i7, obj)) {
            return y10.zze();
        }
        Object object = k.getObject(obj, v);
        if (o(object)) {
            return object;
        }
        v1 zze = y10.zze();
        if (object != null) {
            y10.zzg(zze, object);
        }
        return zze;
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final v1 zze() {
        return (v1) ((v1) this.e).d(4);
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final void zzf(Object obj) {
        if (!o(obj)) {
            return;
        }
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            v1Var.l();
            v1Var.zza = 0;
            v1Var.j();
        }
        int i7 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i7 >= iArr.length) {
                this.i.getClass();
                x2 x2Var = ((v1) obj).zzc;
                if (x2Var.e) {
                    x2Var.e = false;
                    return;
                }
                return;
            }
            int v = v(i7);
            int i10 = 1048575 & v;
            int u10 = u(v);
            long j3 = i10;
            if (u10 != 9) {
                if (u10 != 60 && u10 != 68) {
                    switch (u10) {
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
                            f1 f1Var = (f1) ((z1) c3.h(obj, j3));
                            if (!f1Var.a) {
                                break;
                            } else {
                                f1Var.a = false;
                                break;
                            }
                        case 50:
                            Unsafe unsafe = k;
                            Object object = unsafe.getObject(obj, j3);
                            if (object == null) {
                                break;
                            } else {
                                ((j2) object).a = false;
                                unsafe.putObject(obj, j3, object);
                                break;
                            }
                    }
                } else if (p(iArr[i7], i7, obj)) {
                    y(i7).zzf(k.getObject(obj, j3));
                }
                i7 += 3;
            }
            if (m(i7, obj)) {
                y(i7).zzf(k.getObject(obj, j3));
            }
            i7 += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.play_billing.t2
    public final void zzg(Object obj, Object obj2) {
        Object obj3;
        if (!o(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i7 >= iArr.length) {
                u2.p(obj, obj2);
                return;
            }
            int v = v(i7);
            int i10 = v & 1048575;
            int u10 = u(v);
            int i11 = iArr[i7];
            long j3 = i10;
            switch (u10) {
                case 0:
                    if (m(i7, obj2)) {
                        b3 b3Var = c3.c;
                        obj3 = obj;
                        b3Var.e(obj3, j3, b3Var.a(obj2, j3));
                        i(i7, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (m(i7, obj2)) {
                        b3 b3Var2 = c3.c;
                        b3Var2.f(obj, j3, b3Var2.b(obj2, j3));
                        i(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (m(i7, obj2)) {
                        c3.k(obj, j3, c3.f(obj2, j3));
                        i(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (m(i7, obj2)) {
                        c3.k(obj, j3, c3.f(obj2, j3));
                        i(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (m(i7, obj2)) {
                        c3.j(obj, j3, c3.e(obj2, j3));
                        i(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (m(i7, obj2)) {
                        c3.k(obj, j3, c3.f(obj2, j3));
                        i(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (m(i7, obj2)) {
                        c3.j(obj, j3, c3.e(obj2, j3));
                        i(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (m(i7, obj2)) {
                        b3 b3Var3 = c3.c;
                        b3Var3.c(obj, j3, b3Var3.g(obj2, j3));
                        i(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m(i7, obj2)) {
                        c3.l(obj, j3, c3.h(obj2, j3));
                        i(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    g(i7, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (m(i7, obj2)) {
                        c3.l(obj, j3, c3.h(obj2, j3));
                        i(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (m(i7, obj2)) {
                        c3.j(obj, j3, c3.e(obj2, j3));
                        i(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (m(i7, obj2)) {
                        c3.j(obj, j3, c3.e(obj2, j3));
                        i(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (m(i7, obj2)) {
                        c3.j(obj, j3, c3.e(obj2, j3));
                        i(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m(i7, obj2)) {
                        c3.k(obj, j3, c3.f(obj2, j3));
                        i(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m(i7, obj2)) {
                        c3.j(obj, j3, c3.e(obj2, j3));
                        i(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m(i7, obj2)) {
                        c3.k(obj, j3, c3.f(obj2, j3));
                        i(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    g(i7, obj, obj2);
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
                    z1 z1Var = (z1) c3.h(obj, j3);
                    z1 z1Var2 = (z1) c3.h(obj2, j3);
                    int size = z1Var.size();
                    int size2 = z1Var2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((f1) z1Var).a) {
                            z1Var = z1Var.zzd(size2 + size);
                        }
                        z1Var.addAll(z1Var2);
                    }
                    if (size > 0) {
                        z1Var2 = z1Var;
                    }
                    c3.l(obj, j3, z1Var2);
                    obj3 = obj;
                    break;
                case 50:
                    t1 t1Var = u2.a;
                    c3.l(obj, j3, t1.a(c3.h(obj, j3), c3.h(obj2, j3)));
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
                    if (p(i11, i7, obj2)) {
                        c3.l(obj, j3, c3.h(obj2, j3));
                        c3.j(obj, iArr[i7 + 2] & 1048575, i11);
                    }
                    obj3 = obj;
                    break;
                case qs.x0 /* 60 */:
                    h(i7, obj, obj2);
                    obj3 = obj;
                    break;
                case qs.y0 /* 61 */:
                case qs.z0 /* 62 */:
                case qs.A0 /* 63 */:
                case 64:
                case 65:
                case qs.D0 /* 66 */:
                case qs.E0 /* 67 */:
                    if (p(i11, i7, obj2)) {
                        c3.l(obj, j3, c3.h(obj2, j3));
                        c3.j(obj, iArr[i7 + 2] & 1048575, i11);
                    }
                    obj3 = obj;
                    break;
                case qs.F0 /* 68 */:
                    h(i7, obj, obj2);
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
}
