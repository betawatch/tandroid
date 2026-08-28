package com.google.android.gms.internal.play_billing;

import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.internal.cast.z4;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.CharacterCompat;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public n2(int[] iArr, Object[] objArr, int i9, int i10, e1 e1Var, int[] iArr2, int i11, int i12, t1 t1Var, t1 t1Var2) {
        this.a = iArr;
        this.b = objArr;
        this.c = i9;
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
            StringBuilder q10 = j3.r0.q("Field ", str, " for ", name, " not found. Known fields are ");
            q10.append(arrays);
            throw new RuntimeException(q10.toString(), e10);
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

    /* JADX WARN: Removed duplicated region for block: B:103:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static n2 r(s2 s2Var, t1 t1Var, t1 t1Var2) {
        int i9;
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
                i9 = i42 + 1;
                if (str.charAt(i42) < 55296) {
                    break;
                }
                i42 = i9;
            }
        } else {
            i9 = 1;
        }
        int i43 = i9 + 1;
        int charAt15 = str.charAt(i9);
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
            iArr = j;
            i10 = 0;
            i12 = 0;
            i14 = 0;
            charAt = 0;
            i11 = 0;
            i13 = 0;
            i15 = 0;
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
            char c10 = CharacterCompat.MIN_HIGH_SURROGATE;
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
                    c10 = CharacterCompat.MIN_HIGH_SURROGATE;
                }
                charAt24 = i83 | (charAt12 << i84);
                i82 = i38;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i76] = i77;
                i76++;
            }
            int i85 = charAt24 & 255;
            int i86 = charAt23;
            int i87 = charAt24 & 2048;
            if (i85 >= 51) {
                int i88 = i82 + 1;
                int charAt25 = str.charAt(i82);
                char c11 = CharacterCompat.MIN_HIGH_SURROGATE;
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
                        c11 = CharacterCompat.MIN_HIGH_SURROGATE;
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
                            int i98 = i36;
                            obj = objArr4[i97];
                            if (obj instanceof Field) {
                                B2 = (Field) obj;
                            } else {
                                B2 = B(cls2, (String) obj);
                                objArr4[i97] = B2;
                            }
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(B2);
                            int i99 = i97 + 1;
                            obj2 = objArr4[i99];
                            if (obj2 instanceof Field) {
                                B3 = (Field) obj2;
                            } else {
                                B3 = B(cls2, (String) obj2);
                                objArr4[i99] = B3;
                            }
                            int objectFieldOffset3 = (int) unsafe.objectFieldOffset(B3);
                            Class<?> cls3 = cls2;
                            i27 = objectFieldOffset3;
                            i31 = objectFieldOffset2;
                            i28 = i92;
                            objArr = objArr3;
                            cls = cls3;
                            i26 = i10;
                            i32 = i98;
                            i30 = 0;
                        }
                    }
                    i36 = i87;
                    int i972 = i94 + i94;
                    int i982 = i36;
                    obj = objArr4[i972];
                    if (obj instanceof Field) {
                    }
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(B2);
                    int i992 = i972 + 1;
                    obj2 = objArr4[i992];
                    if (obj2 instanceof Field) {
                    }
                    int objectFieldOffset32 = (int) unsafe.objectFieldOffset(B3);
                    Class<?> cls32 = cls2;
                    i27 = objectFieldOffset32;
                    i31 = objectFieldOffset22;
                    i28 = i92;
                    objArr = objArr3;
                    cls = cls32;
                    i26 = i10;
                    i32 = i982;
                    i30 = 0;
                }
                i14 = i35;
                i36 = i87;
                int i9722 = i94 + i94;
                int i9822 = i36;
                obj = objArr4[i9722];
                if (obj instanceof Field) {
                }
                int objectFieldOffset222 = (int) unsafe.objectFieldOffset(B2);
                int i9922 = i9722 + 1;
                obj2 = objArr4[i9922];
                if (obj2 instanceof Field) {
                }
                int objectFieldOffset322 = (int) unsafe.objectFieldOffset(B3);
                Class<?> cls322 = cls2;
                i27 = objectFieldOffset322;
                i31 = objectFieldOffset222;
                i28 = i92;
                objArr = objArr3;
                cls = cls322;
                i26 = i10;
                i32 = i9822;
                i30 = 0;
            } else {
                int i100 = i14 + 1;
                Field B4 = B(cls2, (String) objArr4[i14]);
                objArr = objArr3;
                if (i85 == 9 || i85 == 17) {
                    i26 = i10;
                    int i101 = i77 / 3;
                    objArr[i101 + i101 + 1] = B4.getType();
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
                                int i102 = i77 / 3;
                                objArr[i102 + i102 + 1] = objArr4[i100];
                                cls = cls2;
                            } else {
                                cls = cls2;
                                i14 = i100;
                                i87 = 0;
                            }
                        } else if (i85 == 50) {
                            int i103 = i14 + 2;
                            int i104 = i75 + 1;
                            iArr[i75] = i77;
                            int i105 = i77 / 3;
                            int i106 = i105 + i105;
                            objArr[i106] = objArr4[i100];
                            if (i87 != 0) {
                                i14 += 3;
                                objArr[i106 + 1] = objArr4[i103];
                                cls = cls2;
                                i75 = i104;
                            } else {
                                i14 = i103;
                                cls = cls2;
                                i75 = i104;
                                i87 = 0;
                            }
                            i26 = i10;
                        } else {
                            i26 = i10;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(B4);
                        i27 = 1048575;
                        if ((charAt24 & 4096) != 0 || i85 > 17) {
                            i28 = i82;
                            i29 = 0;
                        } else {
                            int i107 = i82 + 1;
                            int charAt26 = str.charAt(i82);
                            if (charAt26 >= 55296) {
                                int i108 = charAt26 & 8191;
                                int i109 = 13;
                                while (true) {
                                    i28 = i107 + 1;
                                    charAt10 = str.charAt(i107);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i108 |= (charAt10 & 8191) << i109;
                                    i109 += 13;
                                    i107 = i28;
                                }
                                charAt26 = i108 | (charAt10 << i109);
                            } else {
                                i28 = i107;
                            }
                            int i110 = (charAt26 / 32) + i26 + i26;
                            Object obj3 = objArr4[i110];
                            if (obj3 instanceof Field) {
                                B = (Field) obj3;
                            } else {
                                B = B(cls, (String) obj3);
                                objArr4[i110] = B;
                            }
                            i27 = (int) unsafe.objectFieldOffset(B);
                            i29 = charAt26 % 32;
                        }
                        if (i85 >= 18 && i85 <= 49) {
                            iArr[i74] = objectFieldOffset;
                            i74++;
                        }
                        i30 = i29;
                        i31 = objectFieldOffset;
                        i32 = i87;
                    }
                    int i111 = i77 / 3;
                    objArr[i111 + i111 + i33] = objArr4[i100];
                    cls = cls2;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(B4);
                    i27 = 1048575;
                    if ((charAt24 & 4096) != 0) {
                    }
                    i28 = i82;
                    i29 = 0;
                    if (i85 >= 18) {
                        iArr[i74] = objectFieldOffset;
                        i74++;
                    }
                    i30 = i29;
                    i31 = objectFieldOffset;
                    i32 = i87;
                }
                cls = cls2;
                i14 = i100;
                objectFieldOffset = (int) unsafe.objectFieldOffset(B4);
                i27 = 1048575;
                if ((charAt24 & 4096) != 0) {
                }
                i28 = i82;
                i29 = 0;
                if (i85 >= 18) {
                }
                i30 = i29;
                i31 = objectFieldOffset;
                i32 = i87;
            }
            int i112 = i77 + 1;
            iArr2[i77] = i86;
            int i113 = i77 + 2;
            String str2 = str;
            iArr2[i112] = ((charAt24 & 512) != 0 ? TLObject.FLAG_29 : 0) | ((charAt24 & 256) != 0 ? TLObject.FLAG_28 : 0) | (i32 != 0 ? TLObject.FLAG_31 : 0) | (i85 << 20) | i31;
            i77 += 3;
            iArr2[i113] = (i30 << 20) | i27;
            cls2 = cls;
            objArr2 = objArr4;
            length = i24;
            objArr3 = objArr;
            i10 = i26;
            i43 = i28;
            str = str2;
            i41 = 55296;
        }
        return new n2(iArr2, objArr3, i11, i13, s2Var.a, iArr, i15, i72, t1Var, t1Var2);
    }

    public static int s(Object obj, long j10) {
        return ((Integer) c3.h(obj, j10)).intValue();
    }

    public static int u(int i9) {
        return (i9 >>> 20) & 255;
    }

    public static long w(Object obj, long j10) {
        return ((Long) c3.h(obj, j10)).longValue();
    }

    public final Object A(int i9, int i10, Object obj) {
        t2 y10 = y(i10);
        if (!p(i9, i10, obj)) {
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

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01e0, code lost:
    
        if (r2 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d5, code lost:
    
        if (r2 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d7, code lost:
    
        r6 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d9, code lost:
    
        r2 = r6;
     */
    @Override // com.google.android.gms.internal.play_billing.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(v1 v1Var) {
        int i9;
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
            long j10 = i12;
            int i14 = 1237;
            switch (u10) {
                case 0:
                    i9 = i11 * 53;
                    doubleToLongBits = Double.doubleToLongBits(c3.c.a(v1Var, j10));
                    Charset charset = a2.a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i9 + floatToIntBits;
                    break;
                case 1:
                    i9 = i11 * 53;
                    floatToIntBits = Float.floatToIntBits(c3.c.b(v1Var, j10));
                    i11 = i9 + floatToIntBits;
                    break;
                case 2:
                    i9 = i11 * 53;
                    doubleToLongBits = c3.f(v1Var, j10);
                    Charset charset2 = a2.a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i9 + floatToIntBits;
                    break;
                case 3:
                    i9 = i11 * 53;
                    doubleToLongBits = c3.f(v1Var, j10);
                    Charset charset3 = a2.a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i9 + floatToIntBits;
                    break;
                case 4:
                    i9 = i11 * 53;
                    floatToIntBits = c3.e(v1Var, j10);
                    i11 = i9 + floatToIntBits;
                    break;
                case 5:
                    i9 = i11 * 53;
                    doubleToLongBits = c3.f(v1Var, j10);
                    Charset charset4 = a2.a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i9 + floatToIntBits;
                    break;
                case 6:
                    i9 = i11 * 53;
                    floatToIntBits = c3.e(v1Var, j10);
                    i11 = i9 + floatToIntBits;
                    break;
                case 7:
                    i9 = i11 * 53;
                    boolean g10 = c3.c.g(v1Var, j10);
                    Charset charset5 = a2.a;
                    break;
                case 8:
                    i9 = i11 * 53;
                    floatToIntBits = ((String) c3.h(v1Var, j10)).hashCode();
                    i11 = i9 + floatToIntBits;
                    break;
                case 9:
                    i9 = i11 * 53;
                    Object h = c3.h(v1Var, j10);
                    if (h != null) {
                        floatToIntBits = h.hashCode();
                        i11 = i9 + floatToIntBits;
                        break;
                    }
                    floatToIntBits = 37;
                    i11 = i9 + floatToIntBits;
                case 10:
                    i9 = i11 * 53;
                    floatToIntBits = c3.h(v1Var, j10).hashCode();
                    i11 = i9 + floatToIntBits;
                    break;
                case 11:
                    i9 = i11 * 53;
                    floatToIntBits = c3.e(v1Var, j10);
                    i11 = i9 + floatToIntBits;
                    break;
                case 12:
                    i9 = i11 * 53;
                    floatToIntBits = c3.e(v1Var, j10);
                    i11 = i9 + floatToIntBits;
                    break;
                case 13:
                    i9 = i11 * 53;
                    floatToIntBits = c3.e(v1Var, j10);
                    i11 = i9 + floatToIntBits;
                    break;
                case 14:
                    i9 = i11 * 53;
                    doubleToLongBits = c3.f(v1Var, j10);
                    Charset charset6 = a2.a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i9 + floatToIntBits;
                    break;
                case 15:
                    i9 = i11 * 53;
                    floatToIntBits = c3.e(v1Var, j10);
                    i11 = i9 + floatToIntBits;
                    break;
                case 16:
                    i9 = i11 * 53;
                    doubleToLongBits = c3.f(v1Var, j10);
                    Charset charset7 = a2.a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i9 + floatToIntBits;
                    break;
                case 17:
                    i9 = i11 * 53;
                    Object h10 = c3.h(v1Var, j10);
                    if (h10 != null) {
                        floatToIntBits = h10.hashCode();
                        i11 = i9 + floatToIntBits;
                        break;
                    }
                    floatToIntBits = 37;
                    i11 = i9 + floatToIntBits;
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
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                case 48:
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    i9 = i11 * 53;
                    floatToIntBits = c3.h(v1Var, j10).hashCode();
                    i11 = i9 + floatToIntBits;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    i9 = i11 * 53;
                    floatToIntBits = c3.h(v1Var, j10).hashCode();
                    i11 = i9 + floatToIntBits;
                    break;
                case 51:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i9 = i11 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) c3.h(v1Var, j10)).doubleValue());
                        Charset charset8 = a2.a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i9 + floatToIntBits;
                        break;
                    }
                case 52:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i9 = i11 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) c3.h(v1Var, j10)).floatValue());
                        i11 = i9 + floatToIntBits;
                        break;
                    }
                case 53:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i9 = i11 * 53;
                        doubleToLongBits = w(v1Var, j10);
                        Charset charset9 = a2.a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i9 + floatToIntBits;
                        break;
                    }
                case 54:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i9 = i11 * 53;
                        doubleToLongBits = w(v1Var, j10);
                        Charset charset10 = a2.a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i9 + floatToIntBits;
                        break;
                    }
                case 55:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i9 = i11 * 53;
                        floatToIntBits = s(v1Var, j10);
                        i11 = i9 + floatToIntBits;
                        break;
                    }
                case 56:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i9 = i11 * 53;
                        doubleToLongBits = w(v1Var, j10);
                        Charset charset11 = a2.a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i9 + floatToIntBits;
                        break;
                    }
                case 57:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i9 = i11 * 53;
                        floatToIntBits = s(v1Var, j10);
                        i11 = i9 + floatToIntBits;
                        break;
                    }
                case 58:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i9 = i11 * 53;
                        boolean booleanValue = ((Boolean) c3.h(v1Var, j10)).booleanValue();
                        Charset charset12 = a2.a;
                        break;
                    }
                case 59:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i9 = i11 * 53;
                        floatToIntBits = ((String) c3.h(v1Var, j10)).hashCode();
                        i11 = i9 + floatToIntBits;
                        break;
                    }
                case 60:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i9 = i11 * 53;
                        floatToIntBits = c3.h(v1Var, j10).hashCode();
                        i11 = i9 + floatToIntBits;
                        break;
                    }
                case 61:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i9 = i11 * 53;
                        floatToIntBits = c3.h(v1Var, j10).hashCode();
                        i11 = i9 + floatToIntBits;
                        break;
                    }
                case 62:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i9 = i11 * 53;
                        floatToIntBits = s(v1Var, j10);
                        i11 = i9 + floatToIntBits;
                        break;
                    }
                case 63:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i9 = i11 * 53;
                        floatToIntBits = s(v1Var, j10);
                        i11 = i9 + floatToIntBits;
                        break;
                    }
                case 64:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i9 = i11 * 53;
                        floatToIntBits = s(v1Var, j10);
                        i11 = i9 + floatToIntBits;
                        break;
                    }
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i9 = i11 * 53;
                        doubleToLongBits = w(v1Var, j10);
                        Charset charset13 = a2.a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i9 + floatToIntBits;
                        break;
                    }
                case 66:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i9 = i11 * 53;
                        floatToIntBits = s(v1Var, j10);
                        i11 = i9 + floatToIntBits;
                        break;
                    }
                case 67:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i9 = i11 * 53;
                        doubleToLongBits = w(v1Var, j10);
                        Charset charset14 = a2.a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i9 + floatToIntBits;
                        break;
                    }
                case 68:
                    if (!p(i13, i10, v1Var)) {
                        break;
                    } else {
                        i9 = i11 * 53;
                        floatToIntBits = c3.h(v1Var, j10).hashCode();
                        i11 = i9 + floatToIntBits;
                        break;
                    }
            }
            i10 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final boolean b(Object obj) {
        int i9;
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.g) {
            int i15 = this.f[i14];
            int[] iArr = this.a;
            int i16 = iArr[i15];
            int v = v(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = k.getInt(obj, i18);
                }
                i10 = i15;
                i11 = i13;
                i9 = i18;
            } else {
                int i20 = i13;
                i9 = i12;
                i10 = i15;
                i11 = i20;
            }
            if ((268435456 & v) == 0 || n(obj, i10, i9, i11, i19)) {
                int u10 = u(v);
                if (u10 == 9 || u10 == 17) {
                    if (n(obj, i10, i9, i11, i19) && !y(i10).b(c3.h(obj, v & 1048575))) {
                    }
                    i14++;
                    i12 = i9;
                    i13 = i11;
                } else {
                    if (u10 != 27) {
                        if (u10 == 60 || u10 == 68) {
                            if (p(i16, i10, obj) && !y(i10).b(c3.h(obj, v & 1048575))) {
                            }
                        } else if (u10 != 49) {
                            if (u10 == 50 && !((j2) c3.h(obj, v & 1048575)).isEmpty()) {
                                int i21 = i10 / 3;
                                throw aa.d.j(this.b[i21 + i21]);
                            }
                        }
                        i14++;
                        i12 = i9;
                        i13 = i11;
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
                    i14++;
                    i12 = i9;
                    i13 = i11;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final void c(Object obj, i2 i2Var) {
        int i9;
        int i10;
        n2 n2Var = this;
        Unsafe unsafe = k;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 1048575;
        int i14 = 0;
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
                if (i17 != i13) {
                    i14 = i17 == i11 ? 0 : unsafe.getInt(obj, i17);
                    i13 = i17;
                }
                i9 = 1 << (i16 >>> 20);
            } else {
                i9 = 0;
            }
            long j10 = v & i11;
            switch (u10) {
                case 0:
                    if (n2Var.n(obj, i12, i13, i14, i9)) {
                        ((m1) i2Var.a).h(i15, Double.doubleToRawLongBits(c3.c.a(obj, j10)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (n2Var.n(obj, i12, i13, i14, i9)) {
                        ((m1) i2Var.a).f(i15, Float.floatToRawIntBits(c3.c.b(obj, j10)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (n2Var.n(obj, i12, i13, i14, i9)) {
                        ((m1) i2Var.a).p(i15, unsafe.getLong(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (n2Var.n(obj, i12, i13, i14, i9)) {
                        ((m1) i2Var.a).p(i15, unsafe.getLong(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (n2Var.n(obj, i12, i13, i14, i9)) {
                        ((m1) i2Var.a).j(i15, unsafe.getInt(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (n2Var.n(obj, i12, i13, i14, i9)) {
                        ((m1) i2Var.a).h(i15, unsafe.getLong(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (n2Var.n(obj, i12, i13, i14, i9)) {
                        ((m1) i2Var.a).f(i15, unsafe.getInt(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (n2Var.n(obj, i12, i13, i14, i9)) {
                        byte g10 = c3.c.g(obj, j10);
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
                                throw new z4(i18, m1Var.c, 1, e);
                            }
                        } catch (IndexOutOfBoundsException e11) {
                            e = e11;
                        }
                    } else {
                        continue;
                    }
                case 8:
                    if (n2Var.n(obj, i12, i13, i14, i9)) {
                        Object object = unsafe.getObject(obj, j10);
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
                    if (n2Var.n(obj, i12, i13, i14, i9)) {
                        i2Var.b(i15, unsafe.getObject(obj, j10), n2Var.y(i12));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (n2Var.n(obj, i12, i13, i14, i9)) {
                        ((m1) i2Var.a).e(i15, (l1) unsafe.getObject(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (n2Var.n(obj, i12, i13, i14, i9)) {
                        ((m1) i2Var.a).n(i15, unsafe.getInt(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (n2Var.n(obj, i12, i13, i14, i9)) {
                        ((m1) i2Var.a).j(i15, unsafe.getInt(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (n2Var.n(obj, i12, i13, i14, i9)) {
                        ((m1) i2Var.a).f(i15, unsafe.getInt(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (n2Var.n(obj, i12, i13, i14, i9)) {
                        ((m1) i2Var.a).h(i15, unsafe.getLong(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (n2Var.n(obj, i12, i13, i14, i9)) {
                        int i20 = unsafe.getInt(obj, j10);
                        ((m1) i2Var.a).n(i15, (i20 >> 31) ^ (i20 + i20));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (n2Var.n(obj, i12, i13, i14, i9)) {
                        long j11 = unsafe.getLong(obj, j10);
                        ((m1) i2Var.a).p(i15, (j11 >> 63) ^ (j11 + j11));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (n2Var.n(obj, i12, i13, i14, i9)) {
                        i2Var.a(i15, unsafe.getObject(obj, j10), n2Var.y(i12));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    u2.r(iArr[i12], (List) unsafe.getObject(obj, j10), i2Var, false);
                    break;
                case 19:
                    u2.v(iArr[i12], (List) unsafe.getObject(obj, j10), i2Var, false);
                    break;
                case 20:
                    u2.x(iArr[i12], (List) unsafe.getObject(obj, j10), i2Var, false);
                    break;
                case 21:
                    u2.d(iArr[i12], (List) unsafe.getObject(obj, j10), i2Var, false);
                    break;
                case 22:
                    u2.w(iArr[i12], (List) unsafe.getObject(obj, j10), i2Var, false);
                    break;
                case 23:
                    u2.u(iArr[i12], (List) unsafe.getObject(obj, j10), i2Var, false);
                    break;
                case 24:
                    u2.t(iArr[i12], (List) unsafe.getObject(obj, j10), i2Var, false);
                    break;
                case 25:
                    u2.q(iArr[i12], (List) unsafe.getObject(obj, j10), i2Var, false);
                    break;
                case 26:
                    int i21 = iArr[i12];
                    List list = (List) unsafe.getObject(obj, j10);
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
                    List list2 = (List) unsafe.getObject(obj, j10);
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
                    List list3 = (List) unsafe.getObject(obj, j10);
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
                    u2.c(iArr[i12], (List) unsafe.getObject(obj, j10), i2Var, false);
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    u2.s(iArr[i12], (List) unsafe.getObject(obj, j10), i2Var, false);
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    u2.y(iArr[i12], (List) unsafe.getObject(obj, j10), i2Var, false);
                    break;
                case 32:
                    u2.z(iArr[i12], (List) unsafe.getObject(obj, j10), i2Var, false);
                    break;
                case 33:
                    u2.a(iArr[i12], (List) unsafe.getObject(obj, j10), i2Var, false);
                    break;
                case 34:
                    u2.b(iArr[i12], (List) unsafe.getObject(obj, j10), i2Var, false);
                    break;
                case 35:
                    u2.r(iArr[i12], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case 36:
                    u2.v(iArr[i12], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case 37:
                    u2.x(iArr[i12], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case 38:
                    u2.d(iArr[i12], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    u2.w(iArr[i12], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    u2.u(iArr[i12], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    u2.t(iArr[i12], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    u2.q(iArr[i12], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    u2.c(iArr[i12], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    u2.s(iArr[i12], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    u2.y(iArr[i12], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    u2.z(iArr[i12], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    u2.a(iArr[i12], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case 48:
                    u2.b(iArr[i12], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    int i28 = iArr[i12];
                    List list4 = (List) unsafe.getObject(obj, j10);
                    t2 y11 = n2Var.y(i12);
                    t1 t1Var4 = u2.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i29 = 0; i29 < list4.size(); i29++) {
                            i2Var.a(i28, list4.get(i29), y11);
                        }
                        break;
                    }
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    if (unsafe.getObject(obj, j10) != null) {
                        int i30 = i12 / 3;
                        throw aa.d.j(n2Var.b[i30 + i30]);
                    }
                    break;
                case 51:
                    if (n2Var.p(i15, i12, obj)) {
                        ((m1) i2Var.a).h(i15, Double.doubleToRawLongBits(((Double) c3.h(obj, j10)).doubleValue()));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (n2Var.p(i15, i12, obj)) {
                        ((m1) i2Var.a).f(i15, Float.floatToRawIntBits(((Float) c3.h(obj, j10)).floatValue()));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (n2Var.p(i15, i12, obj)) {
                        ((m1) i2Var.a).p(i15, w(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (n2Var.p(i15, i12, obj)) {
                        ((m1) i2Var.a).p(i15, w(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (n2Var.p(i15, i12, obj)) {
                        ((m1) i2Var.a).j(i15, s(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (n2Var.p(i15, i12, obj)) {
                        ((m1) i2Var.a).h(i15, w(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (n2Var.p(i15, i12, obj)) {
                        ((m1) i2Var.a).f(i15, s(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (n2Var.p(i15, i12, obj)) {
                        byte booleanValue = ((Boolean) c3.h(obj, j10)).booleanValue();
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
                            throw new z4(i31, m1Var3.c, 1, e);
                        }
                    } else {
                        continue;
                    }
                case 59:
                    if (n2Var.p(i15, i12, obj)) {
                        Object object2 = unsafe.getObject(obj, j10);
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
                case 60:
                    if (n2Var.p(i15, i12, obj)) {
                        i2Var.b(i15, unsafe.getObject(obj, j10), n2Var.y(i12));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (n2Var.p(i15, i12, obj)) {
                        ((m1) i2Var.a).e(i15, (l1) unsafe.getObject(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (n2Var.p(i15, i12, obj)) {
                        ((m1) i2Var.a).n(i15, s(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (n2Var.p(i15, i12, obj)) {
                        ((m1) i2Var.a).j(i15, s(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (n2Var.p(i15, i12, obj)) {
                        ((m1) i2Var.a).f(i15, s(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (n2Var.p(i15, i12, obj)) {
                        ((m1) i2Var.a).h(i15, w(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (n2Var.p(i15, i12, obj)) {
                        int s10 = s(obj, j10);
                        ((m1) i2Var.a).n(i15, (s10 >> 31) ^ (s10 + s10));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (n2Var.p(i15, i12, obj)) {
                        long w8 = w(obj, j10);
                        ((m1) i2Var.a).p(i15, (w8 >> 63) ^ (w8 + w8));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (n2Var.p(i15, i12, obj)) {
                        i2Var.a(i15, unsafe.getObject(obj, j10), n2Var.y(i12));
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
        int i9;
        int b10;
        int b11;
        int c10;
        int b12;
        int o6;
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
        int o9;
        int b22;
        n2 n2Var = this;
        e1 e1Var2 = e1Var;
        Unsafe unsafe = k;
        int i11 = 0;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = n2Var.a;
            if (i11 >= iArr.length) {
                return ((v1) e1Var).zzc.a() + i14;
            }
            int v = n2Var.v(i11);
            int u10 = u(v);
            int i15 = iArr[i11];
            int i16 = iArr[i11 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1;
            if (u10 <= 17) {
                if (i17 != i12) {
                    i13 = i17 == 1048575 ? 0 : unsafe.getInt(e1Var2, i17);
                    i12 = i17;
                }
                i9 = 1 << (i16 >>> 20);
            } else {
                i9 = 0;
            }
            int i19 = v & 1048575;
            if (u10 >= q1.b.a) {
                q1.c.getClass();
            }
            long j10 = i19;
            switch (u10) {
                case 0:
                    if (n2Var.n(e1Var2, i11, i12, i13, i9)) {
                        b10 = m1.b(i15 << 3);
                        i18 = 8;
                        h = b10 + i18;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 1:
                    if (n2Var.n(e1Var2, i11, i12, i13, i9)) {
                        b10 = m1.b(i15 << 3);
                        i18 = 4;
                        h = b10 + i18;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 2:
                    if (n2Var.n(e1Var2, i11, i12, i13, i9)) {
                        long j11 = unsafe.getLong(e1Var2, j10);
                        b11 = m1.b(i15 << 3);
                        c10 = m1.c(j11);
                        h = b11 + c10;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 3:
                    if (n2Var.n(e1Var2, i11, i12, i13, i9)) {
                        long j12 = unsafe.getLong(e1Var2, j10);
                        b11 = m1.b(i15 << 3);
                        c10 = m1.c(j12);
                        h = b11 + c10;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 4:
                    if (n2Var.n(e1Var2, i11, i12, i13, i9)) {
                        long j13 = unsafe.getInt(e1Var2, j10);
                        b11 = m1.b(i15 << 3);
                        c10 = m1.c(j13);
                        h = b11 + c10;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 5:
                    if (n2Var.n(e1Var2, i11, i12, i13, i9)) {
                        b10 = m1.b(i15 << 3);
                        i18 = 8;
                        h = b10 + i18;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 6:
                    if (n2Var.n(e1Var2, i11, i12, i13, i9)) {
                        b10 = m1.b(i15 << 3);
                        i18 = 4;
                        h = b10 + i18;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 7:
                    if (n2Var.n(e1Var2, i11, i12, i13, i9)) {
                        b10 = m1.b(i15 << 3);
                        h = b10 + i18;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 8:
                    if (n2Var.n(e1Var2, i11, i12, i13, i9)) {
                        int i20 = i15 << 3;
                        Object object = unsafe.getObject(e1Var2, j10);
                        if (object instanceof l1) {
                            b12 = m1.b(i20);
                            o6 = ((l1) object).o();
                            b13 = m1.b(o6);
                            c10 = b13 + o6;
                            b11 = b12;
                            h = b11 + c10;
                            b18 = h;
                            i14 += b18;
                            i11 += 3;
                            n2Var = this;
                            e1Var2 = e1Var;
                        } else {
                            b12 = m1.b(i20);
                            c10 = m1.a((String) object);
                            b11 = b12;
                            h = b11 + c10;
                            b18 = h;
                            i14 += b18;
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
                    if (n2Var.n(e1Var2, i11, i12, i13, i9)) {
                        Object object2 = unsafe.getObject(e1Var2, j10);
                        t2 y10 = n2Var.y(i11);
                        t1 t1Var = u2.a;
                        b14 = m1.b(i15 << 3);
                        b15 = ((e1) object2).b(y10);
                        b16 = m1.b(b15);
                        h = b16 + b15 + b14;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 10:
                    if (n2Var.n(e1Var2, i11, i12, i13, i9)) {
                        l1 l1Var = (l1) unsafe.getObject(e1Var2, j10);
                        b12 = m1.b(i15 << 3);
                        o6 = l1Var.o();
                        b13 = m1.b(o6);
                        c10 = b13 + o6;
                        b11 = b12;
                        h = b11 + c10;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 11:
                    if (n2Var.n(e1Var2, i11, i12, i13, i9)) {
                        int i21 = unsafe.getInt(e1Var2, j10);
                        b12 = m1.b(i15 << 3);
                        c10 = m1.b(i21);
                        b11 = b12;
                        h = b11 + c10;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 12:
                    if (n2Var.n(e1Var2, i11, i12, i13, i9)) {
                        long j14 = unsafe.getInt(e1Var2, j10);
                        b11 = m1.b(i15 << 3);
                        c10 = m1.c(j14);
                        h = b11 + c10;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 13:
                    if (n2Var.n(e1Var2, i11, i12, i13, i9)) {
                        b10 = m1.b(i15 << 3);
                        i18 = 4;
                        h = b10 + i18;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 14:
                    if (n2Var.n(e1Var2, i11, i12, i13, i9)) {
                        b10 = m1.b(i15 << 3);
                        i18 = 8;
                        h = b10 + i18;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 15:
                    if (n2Var.n(e1Var2, i11, i12, i13, i9)) {
                        int i22 = unsafe.getInt(e1Var2, j10);
                        b12 = m1.b(i15 << 3);
                        c10 = m1.b((i22 >> 31) ^ (i22 + i22));
                        b11 = b12;
                        h = b11 + c10;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 16:
                    if (n2Var.n(e1Var2, i11, i12, i13, i9)) {
                        long j15 = unsafe.getLong(e1Var2, j10);
                        b11 = m1.b(i15 << 3);
                        c10 = m1.c((j15 >> 63) ^ (j15 + j15));
                        h = b11 + c10;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 17:
                    if (n2Var.n(e1Var2, i11, i12, i13, i9)) {
                        e1 e1Var3 = (e1) unsafe.getObject(e1Var2, j10);
                        t2 y11 = n2Var.y(i11);
                        int b23 = m1.b(i15 << 3);
                        i10 = b23 + b23;
                        b17 = e1Var3.b(y11);
                        h = b17 + i10;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 18:
                    h = u2.h(i15, (List) unsafe.getObject(e1Var2, j10));
                    b18 = h;
                    i14 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 19:
                    h = u2.g(i15, (List) unsafe.getObject(e1Var2, j10));
                    b18 = h;
                    i14 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 20:
                    List list = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var2 = u2.a;
                    if (list.size() != 0) {
                        b18 = (m1.b(i15 << 3) * list.size()) + u2.j(list);
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i14 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 21:
                    List list2 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var3 = u2.a;
                    size = list2.size();
                    if (size != 0) {
                        n10 = u2.n(list2);
                        b19 = m1.b(i15 << 3);
                        b18 = (b19 * size) + n10;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i14 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 22:
                    List list3 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var4 = u2.a;
                    size = list3.size();
                    if (size != 0) {
                        n10 = u2.i(list3);
                        b19 = m1.b(i15 << 3);
                        b18 = (b19 * size) + n10;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i14 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 23:
                    h = u2.h(i15, (List) unsafe.getObject(e1Var2, j10));
                    b18 = h;
                    i14 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 24:
                    h = u2.g(i15, (List) unsafe.getObject(e1Var2, j10));
                    b18 = h;
                    i14 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 25:
                    List list4 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var5 = u2.a;
                    int size3 = list4.size();
                    if (size3 != 0) {
                        b18 = (m1.b(i15 << 3) + 1) * size3;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i14 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 26:
                    List list5 = (List) unsafe.getObject(e1Var2, j10);
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
                                    int o10 = ((l1) zza).o();
                                    b18 = m1.b(o10) + o10 + b18;
                                } else {
                                    b18 = m1.a((String) zza) + b18;
                                }
                            }
                        } else {
                            b18 = b24;
                            for (int i24 = 0; i24 < size4; i24++) {
                                Object obj = list5.get(i24);
                                if (obj instanceof l1) {
                                    int o11 = ((l1) obj).o();
                                    b18 = m1.b(o11) + o11 + b18;
                                } else {
                                    b18 = m1.a((String) obj) + b18;
                                }
                            }
                        }
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i14 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 27:
                    List list6 = (List) unsafe.getObject(e1Var2, j10);
                    t2 y12 = n2Var.y(i11);
                    t1 t1Var7 = u2.a;
                    int size5 = list6.size();
                    if (size5 != 0) {
                        b18 = m1.b(i15 << 3) * size5;
                        for (int i25 = 0; i25 < size5; i25++) {
                            int b25 = ((e1) list6.get(i25)).b(y12);
                            b18 += m1.b(b25) + b25;
                        }
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i14 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 28:
                    List list7 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var8 = u2.a;
                    int size6 = list7.size();
                    if (size6 != 0) {
                        b18 = m1.b(i15 << 3) * size6;
                        for (int i26 = 0; i26 < list7.size(); i26++) {
                            int o12 = ((l1) list7.get(i26)).o();
                            b18 += m1.b(o12) + o12;
                        }
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i14 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 29:
                    List list8 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var9 = u2.a;
                    size = list8.size();
                    if (size != 0) {
                        n10 = u2.m(list8);
                        b19 = m1.b(i15 << 3);
                        b18 = (b19 * size) + n10;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i14 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    List list9 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var10 = u2.a;
                    size = list9.size();
                    if (size != 0) {
                        n10 = u2.f(list9);
                        b19 = m1.b(i15 << 3);
                        b18 = (b19 * size) + n10;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i14 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    h = u2.g(i15, (List) unsafe.getObject(e1Var2, j10));
                    b18 = h;
                    i14 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 32:
                    h = u2.h(i15, (List) unsafe.getObject(e1Var2, j10));
                    b18 = h;
                    i14 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 33:
                    List list10 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var11 = u2.a;
                    size = list10.size();
                    if (size != 0) {
                        n10 = u2.k(list10);
                        b19 = m1.b(i15 << 3);
                        b18 = (b19 * size) + n10;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i14 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 34:
                    List list11 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var12 = u2.a;
                    size = list11.size();
                    if (size != 0) {
                        n10 = u2.l(list11);
                        b19 = m1.b(i15 << 3);
                        b18 = (b19 * size) + n10;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i14 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 35:
                    List list12 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var13 = u2.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        b20 = m1.b(i15 << 3);
                        b21 = m1.b(size2);
                        i18 = size2;
                        b10 = b20 + b21;
                        h = b10 + i18;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var14 = u2.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        b20 = m1.b(i15 << 3);
                        b21 = m1.b(size2);
                        i18 = size2;
                        b10 = b20 + b21;
                        h = b10 + i18;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 37:
                    size2 = u2.j((List) unsafe.getObject(e1Var2, j10));
                    if (size2 > 0) {
                        b20 = m1.b(i15 << 3);
                        b21 = m1.b(size2);
                        i18 = size2;
                        b10 = b20 + b21;
                        h = b10 + i18;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 38:
                    size2 = u2.n((List) unsafe.getObject(e1Var2, j10));
                    if (size2 > 0) {
                        b20 = m1.b(i15 << 3);
                        b21 = m1.b(size2);
                        i18 = size2;
                        b10 = b20 + b21;
                        h = b10 + i18;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    size2 = u2.i((List) unsafe.getObject(e1Var2, j10));
                    if (size2 > 0) {
                        b20 = m1.b(i15 << 3);
                        b21 = m1.b(size2);
                        i18 = size2;
                        b10 = b20 + b21;
                        h = b10 + i18;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    List list14 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var15 = u2.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        b20 = m1.b(i15 << 3);
                        b21 = m1.b(size2);
                        i18 = size2;
                        b10 = b20 + b21;
                        h = b10 + i18;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    List list15 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var16 = u2.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        b20 = m1.b(i15 << 3);
                        b21 = m1.b(size2);
                        i18 = size2;
                        b10 = b20 + b21;
                        h = b10 + i18;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    List list16 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var17 = u2.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        b20 = m1.b(i15 << 3);
                        b21 = m1.b(size2);
                        i18 = size2;
                        b10 = b20 + b21;
                        h = b10 + i18;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    size2 = u2.m((List) unsafe.getObject(e1Var2, j10));
                    if (size2 > 0) {
                        b20 = m1.b(i15 << 3);
                        b21 = m1.b(size2);
                        i18 = size2;
                        b10 = b20 + b21;
                        h = b10 + i18;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    size2 = u2.f((List) unsafe.getObject(e1Var2, j10));
                    if (size2 > 0) {
                        b20 = m1.b(i15 << 3);
                        b21 = m1.b(size2);
                        i18 = size2;
                        b10 = b20 + b21;
                        h = b10 + i18;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    List list17 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var18 = u2.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        b20 = m1.b(i15 << 3);
                        b21 = m1.b(size2);
                        i18 = size2;
                        b10 = b20 + b21;
                        h = b10 + i18;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    List list18 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var19 = u2.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        b20 = m1.b(i15 << 3);
                        b21 = m1.b(size2);
                        i18 = size2;
                        b10 = b20 + b21;
                        h = b10 + i18;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    size2 = u2.k((List) unsafe.getObject(e1Var2, j10));
                    if (size2 > 0) {
                        b20 = m1.b(i15 << 3);
                        b21 = m1.b(size2);
                        i18 = size2;
                        b10 = b20 + b21;
                        h = b10 + i18;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 48:
                    size2 = u2.l((List) unsafe.getObject(e1Var2, j10));
                    if (size2 > 0) {
                        b20 = m1.b(i15 << 3);
                        b21 = m1.b(size2);
                        i18 = size2;
                        b10 = b20 + b21;
                        h = b10 + i18;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    List list19 = (List) unsafe.getObject(e1Var2, j10);
                    t2 y13 = n2Var.y(i11);
                    t1 t1Var20 = u2.a;
                    int size7 = list19.size();
                    if (size7 != 0) {
                        b18 = 0;
                        for (int i27 = 0; i27 < size7; i27++) {
                            e1 e1Var4 = (e1) list19.get(i27);
                            int b26 = m1.b(i15 << 3);
                            b18 += e1Var4.b(y13) + b26 + b26;
                        }
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i14 += b18;
                    i11 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    int i28 = i11 / 3;
                    j2 j2Var = (j2) unsafe.getObject(e1Var2, j10);
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
                case 51:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        b10 = m1.b(i15 << 3);
                        i18 = 8;
                        h = b10 + i18;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 52:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        b10 = m1.b(i15 << 3);
                        i18 = 4;
                        h = b10 + i18;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 53:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        long w8 = w(e1Var2, j10);
                        b11 = m1.b(i15 << 3);
                        c10 = m1.c(w8);
                        h = b11 + c10;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 54:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        long w10 = w(e1Var2, j10);
                        b11 = m1.b(i15 << 3);
                        c10 = m1.c(w10);
                        h = b11 + c10;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 55:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        long s10 = s(e1Var2, j10);
                        b11 = m1.b(i15 << 3);
                        c10 = m1.c(s10);
                        h = b11 + c10;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 56:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        b10 = m1.b(i15 << 3);
                        i18 = 8;
                        h = b10 + i18;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 57:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        b10 = m1.b(i15 << 3);
                        i18 = 4;
                        h = b10 + i18;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 58:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        b10 = m1.b(i15 << 3);
                        h = b10 + i18;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 59:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        int i29 = i15 << 3;
                        Object object3 = unsafe.getObject(e1Var2, j10);
                        if (object3 instanceof l1) {
                            b11 = m1.b(i29);
                            o9 = ((l1) object3).o();
                            b22 = m1.b(o9);
                            c10 = o9 + b22;
                            h = b11 + c10;
                            b18 = h;
                            i14 += b18;
                            i11 += 3;
                            n2Var = this;
                            e1Var2 = e1Var;
                        } else {
                            b11 = m1.b(i29);
                            c10 = m1.a((String) object3);
                            h = b11 + c10;
                            b18 = h;
                            i14 += b18;
                            i11 += 3;
                            n2Var = this;
                            e1Var2 = e1Var;
                        }
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 60:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        Object object4 = unsafe.getObject(e1Var2, j10);
                        t2 y14 = n2Var.y(i11);
                        t1 t1Var21 = u2.a;
                        b14 = m1.b(i15 << 3);
                        b15 = ((e1) object4).b(y14);
                        b16 = m1.b(b15);
                        h = b16 + b15 + b14;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 61:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        l1 l1Var2 = (l1) unsafe.getObject(e1Var2, j10);
                        b11 = m1.b(i15 << 3);
                        o9 = l1Var2.o();
                        b22 = m1.b(o9);
                        c10 = o9 + b22;
                        h = b11 + c10;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 62:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        int s11 = s(e1Var2, j10);
                        b11 = m1.b(i15 << 3);
                        c10 = m1.b(s11);
                        h = b11 + c10;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 63:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        long s12 = s(e1Var2, j10);
                        b11 = m1.b(i15 << 3);
                        c10 = m1.c(s12);
                        h = b11 + c10;
                        b18 = h;
                        i14 += b18;
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
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        b10 = m1.b(i15 << 3);
                        i18 = 8;
                        h = b10 + i18;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 66:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        int s13 = s(e1Var2, j10);
                        b11 = m1.b(i15 << 3);
                        c10 = m1.b((s13 >> 31) ^ (s13 + s13));
                        h = b11 + c10;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 67:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        long w11 = w(e1Var2, j10);
                        b11 = m1.b(i15 << 3);
                        c10 = m1.c((w11 >> 63) ^ (w11 + w11));
                        h = b11 + c10;
                        b18 = h;
                        i14 += b18;
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i11 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 68:
                    if (n2Var.p(i15, i11, e1Var2)) {
                        e1 e1Var5 = (e1) unsafe.getObject(e1Var2, j10);
                        t2 y15 = n2Var.y(i11);
                        int b27 = m1.b(i15 << 3);
                        i10 = b27 + b27;
                        b17 = e1Var5.b(y15);
                        h = b17 + i10;
                        b18 = h;
                        i14 += b18;
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
    public final void e(Object obj, byte[] bArr, int i9, int i10, h1 h1Var) {
        q(obj, bArr, i9, i10, 0, h1Var);
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final boolean f(v1 v1Var, v1 v1Var2) {
        boolean e10;
        int i9 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i9 < iArr.length) {
                int v = v(i9);
                long j10 = v & 1048575;
                switch (u(v)) {
                    case 0:
                        if (!l(v1Var, v1Var2, i9)) {
                            break;
                        } else {
                            b3 b3Var = c3.c;
                            if (Double.doubleToLongBits(b3Var.a(v1Var, j10)) != Double.doubleToLongBits(b3Var.a(v1Var2, j10))) {
                                break;
                            } else {
                                continue;
                                i9 += 3;
                            }
                        }
                    case 1:
                        if (!l(v1Var, v1Var2, i9)) {
                            break;
                        } else {
                            b3 b3Var2 = c3.c;
                            if (Float.floatToIntBits(b3Var2.b(v1Var, j10)) != Float.floatToIntBits(b3Var2.b(v1Var2, j10))) {
                                break;
                            } else {
                                continue;
                                i9 += 3;
                            }
                        }
                    case 2:
                        if (l(v1Var, v1Var2, i9) && c3.f(v1Var, j10) == c3.f(v1Var2, j10)) {
                            continue;
                            i9 += 3;
                        }
                        break;
                    case 3:
                        if (l(v1Var, v1Var2, i9) && c3.f(v1Var, j10) == c3.f(v1Var2, j10)) {
                            continue;
                            i9 += 3;
                        }
                        break;
                    case 4:
                        if (l(v1Var, v1Var2, i9) && c3.e(v1Var, j10) == c3.e(v1Var2, j10)) {
                            continue;
                            i9 += 3;
                        }
                        break;
                    case 5:
                        if (l(v1Var, v1Var2, i9) && c3.f(v1Var, j10) == c3.f(v1Var2, j10)) {
                            continue;
                            i9 += 3;
                        }
                        break;
                    case 6:
                        if (l(v1Var, v1Var2, i9) && c3.e(v1Var, j10) == c3.e(v1Var2, j10)) {
                            continue;
                            i9 += 3;
                        }
                        break;
                    case 7:
                        if (!l(v1Var, v1Var2, i9)) {
                            break;
                        } else {
                            b3 b3Var3 = c3.c;
                            if (b3Var3.g(v1Var, j10) != b3Var3.g(v1Var2, j10)) {
                                break;
                            } else {
                                continue;
                                i9 += 3;
                            }
                        }
                    case 8:
                        if (l(v1Var, v1Var2, i9) && u2.e(c3.h(v1Var, j10), c3.h(v1Var2, j10))) {
                            continue;
                            i9 += 3;
                        }
                        break;
                    case 9:
                        if (l(v1Var, v1Var2, i9) && u2.e(c3.h(v1Var, j10), c3.h(v1Var2, j10))) {
                            continue;
                            i9 += 3;
                        }
                        break;
                    case 10:
                        if (l(v1Var, v1Var2, i9) && u2.e(c3.h(v1Var, j10), c3.h(v1Var2, j10))) {
                            continue;
                            i9 += 3;
                        }
                        break;
                    case 11:
                        if (l(v1Var, v1Var2, i9) && c3.e(v1Var, j10) == c3.e(v1Var2, j10)) {
                            continue;
                            i9 += 3;
                        }
                        break;
                    case 12:
                        if (l(v1Var, v1Var2, i9) && c3.e(v1Var, j10) == c3.e(v1Var2, j10)) {
                            continue;
                            i9 += 3;
                        }
                        break;
                    case 13:
                        if (l(v1Var, v1Var2, i9) && c3.e(v1Var, j10) == c3.e(v1Var2, j10)) {
                            continue;
                            i9 += 3;
                        }
                        break;
                    case 14:
                        if (l(v1Var, v1Var2, i9) && c3.f(v1Var, j10) == c3.f(v1Var2, j10)) {
                            continue;
                            i9 += 3;
                        }
                        break;
                    case 15:
                        if (l(v1Var, v1Var2, i9) && c3.e(v1Var, j10) == c3.e(v1Var2, j10)) {
                            continue;
                            i9 += 3;
                        }
                        break;
                    case 16:
                        if (l(v1Var, v1Var2, i9) && c3.f(v1Var, j10) == c3.f(v1Var2, j10)) {
                            continue;
                            i9 += 3;
                        }
                        break;
                    case 17:
                        if (l(v1Var, v1Var2, i9) && u2.e(c3.h(v1Var, j10), c3.h(v1Var2, j10))) {
                            continue;
                            i9 += 3;
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
                    case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case Maneuver.TYPE_DESTINATION /* 39 */:
                    case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    case 48:
                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                        e10 = u2.e(c3.h(v1Var, j10), c3.h(v1Var2, j10));
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        e10 = u2.e(c3.h(v1Var, j10), c3.h(v1Var2, j10));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case VoIPService.CALL_MIN_LAYER /* 65 */:
                    case 66:
                    case 67:
                    case 68:
                        long j11 = iArr[i9 + 2] & 1048575;
                        if (c3.e(v1Var, j11) == c3.e(v1Var2, j11) && u2.e(c3.h(v1Var, j10), c3.h(v1Var2, j10))) {
                            continue;
                            i9 += 3;
                        }
                        break;
                    default:
                        i9 += 3;
                }
                if (e10) {
                    i9 += 3;
                }
            } else if (v1Var.zzc.equals(v1Var2.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final void g(int i9, Object obj, Object obj2) {
        if (m(i9, obj2)) {
            int v = v(i9) & 1048575;
            Unsafe unsafe = k;
            long j10 = v;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i9] + " is present but null: " + obj2.toString());
            }
            t2 y10 = y(i9);
            if (!m(i9, obj)) {
                if (o(object)) {
                    v1 zze = y10.zze();
                    y10.zzg(zze, object);
                    unsafe.putObject(obj, j10, zze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                i(i9, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!o(object2)) {
                v1 zze2 = y10.zze();
                y10.zzg(zze2, object2);
                unsafe.putObject(obj, j10, zze2);
                object2 = zze2;
            }
            y10.zzg(object2, object);
        }
    }

    public final void h(int i9, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i10 = iArr[i9];
        if (p(i10, i9, obj2)) {
            int v = v(i9) & 1048575;
            Unsafe unsafe = k;
            long j10 = v;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i9] + " is present but null: " + obj2.toString());
            }
            t2 y10 = y(i9);
            if (!p(i10, i9, obj)) {
                if (o(object)) {
                    v1 zze = y10.zze();
                    y10.zzg(zze, object);
                    unsafe.putObject(obj, j10, zze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                c3.j(obj, iArr[i9 + 2] & 1048575, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!o(object2)) {
                v1 zze2 = y10.zze();
                y10.zzg(zze2, object2);
                unsafe.putObject(obj, j10, zze2);
                object2 = zze2;
            }
            y10.zzg(object2, object);
        }
    }

    public final void i(int i9, Object obj) {
        int i10 = this.a[i9 + 2];
        long j10 = 1048575 & i10;
        if (j10 == 1048575) {
            return;
        }
        c3.j(obj, j10, (1 << (i10 >>> 20)) | c3.e(obj, j10));
    }

    public final void j(int i9, Object obj, Object obj2) {
        k.putObject(obj, v(i9) & 1048575, obj2);
        i(i9, obj);
    }

    public final void k(int i9, Object obj, Object obj2, int i10) {
        k.putObject(obj, v(i10) & 1048575, obj2);
        c3.j(obj, this.a[i10 + 2] & 1048575, i9);
    }

    public final boolean l(v1 v1Var, v1 v1Var2, int i9) {
        return m(i9, v1Var) == m(i9, v1Var2);
    }

    public final boolean m(int i9, Object obj) {
        int i10 = this.a[i9 + 2];
        long j10 = i10 & 1048575;
        if (j10 == 1048575) {
            int v = v(i9);
            long j11 = v & 1048575;
            switch (u(v)) {
                case 0:
                    if (Double.doubleToRawLongBits(c3.c.a(obj, j11)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(c3.c.b(obj, j11)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (c3.f(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (c3.f(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (c3.e(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (c3.f(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (c3.e(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return c3.c.g(obj, j11);
                case 8:
                    Object h = c3.h(obj, j11);
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
                    if (c3.h(obj, j11) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (l1.c.equals(c3.h(obj, j11))) {
                        return false;
                    }
                    break;
                case 11:
                    if (c3.e(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (c3.e(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (c3.e(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (c3.f(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (c3.e(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (c3.f(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (c3.h(obj, j11) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & c3.e(obj, j10)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean n(Object obj, int i9, int i10, int i11, int i12) {
        return i10 == 1048575 ? m(i9, obj) : (i11 & i12) != 0;
    }

    public final boolean p(int i9, int i10, Object obj) {
        return c3.e(obj, (long) (this.a[i10 + 2] & 1048575)) == i9;
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
            Method dump skipped, instructions count: 3914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.n2.q(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.h1):int");
    }

    public final int t(int i9, int i10) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = iArr[i12];
            if (i9 == i13) {
                return i12;
            }
            if (i9 < i13) {
                length = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
        }
        return -1;
    }

    public final int v(int i9) {
        return this.a[i9 + 1];
    }

    public final x1 x(int i9) {
        int i10 = i9 / 3;
        return (x1) this.b[i10 + i10 + 1];
    }

    public final t2 y(int i9) {
        int i10 = i9 / 3;
        int i11 = i10 + i10;
        Object[] objArr = this.b;
        t2 t2Var = (t2) objArr[i11];
        if (t2Var != null) {
            return t2Var;
        }
        t2 a2 = q2.c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a2;
        return a2;
    }

    public final Object z(int i9, Object obj) {
        t2 y10 = y(i9);
        int v = v(i9) & 1048575;
        if (!m(i9, obj)) {
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
        int i9 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i9 >= iArr.length) {
                this.i.getClass();
                x2 x2Var = ((v1) obj).zzc;
                if (x2Var.e) {
                    x2Var.e = false;
                    return;
                }
                return;
            }
            int v = v(i9);
            int i10 = 1048575 & v;
            int u10 = u(v);
            long j10 = i10;
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
                        case MessageObject.TYPE_GIFT_STARS /* 30 */:
                        case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case Maneuver.TYPE_DESTINATION /* 39 */:
                        case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                        case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                        case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                        case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                        case 48:
                        case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                            f1 f1Var = (f1) ((z1) c3.h(obj, j10));
                            if (!f1Var.a) {
                                break;
                            } else {
                                f1Var.a = false;
                                break;
                            }
                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                            Unsafe unsafe = k;
                            Object object = unsafe.getObject(obj, j10);
                            if (object == null) {
                                break;
                            } else {
                                ((j2) object).a = false;
                                unsafe.putObject(obj, j10, object);
                                break;
                            }
                    }
                } else if (p(iArr[i9], i9, obj)) {
                    y(i9).zzf(k.getObject(obj, j10));
                }
                i9 += 3;
            }
            if (m(i9, obj)) {
                y(i9).zzf(k.getObject(obj, j10));
            }
            i9 += 3;
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
        int i9 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i9 >= iArr.length) {
                u2.p(obj, obj2);
                return;
            }
            int v = v(i9);
            int i10 = v & 1048575;
            int u10 = u(v);
            int i11 = iArr[i9];
            long j10 = i10;
            switch (u10) {
                case 0:
                    if (m(i9, obj2)) {
                        b3 b3Var = c3.c;
                        obj3 = obj;
                        b3Var.e(obj3, j10, b3Var.a(obj2, j10));
                        i(i9, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (m(i9, obj2)) {
                        b3 b3Var2 = c3.c;
                        b3Var2.f(obj, j10, b3Var2.b(obj2, j10));
                        i(i9, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (m(i9, obj2)) {
                        c3.k(obj, j10, c3.f(obj2, j10));
                        i(i9, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (m(i9, obj2)) {
                        c3.k(obj, j10, c3.f(obj2, j10));
                        i(i9, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (m(i9, obj2)) {
                        c3.j(obj, j10, c3.e(obj2, j10));
                        i(i9, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (m(i9, obj2)) {
                        c3.k(obj, j10, c3.f(obj2, j10));
                        i(i9, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (m(i9, obj2)) {
                        c3.j(obj, j10, c3.e(obj2, j10));
                        i(i9, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (m(i9, obj2)) {
                        b3 b3Var3 = c3.c;
                        b3Var3.c(obj, j10, b3Var3.g(obj2, j10));
                        i(i9, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m(i9, obj2)) {
                        c3.l(obj, j10, c3.h(obj2, j10));
                        i(i9, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    g(i9, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (m(i9, obj2)) {
                        c3.l(obj, j10, c3.h(obj2, j10));
                        i(i9, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (m(i9, obj2)) {
                        c3.j(obj, j10, c3.e(obj2, j10));
                        i(i9, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (m(i9, obj2)) {
                        c3.j(obj, j10, c3.e(obj2, j10));
                        i(i9, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (m(i9, obj2)) {
                        c3.j(obj, j10, c3.e(obj2, j10));
                        i(i9, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m(i9, obj2)) {
                        c3.k(obj, j10, c3.f(obj2, j10));
                        i(i9, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m(i9, obj2)) {
                        c3.j(obj, j10, c3.e(obj2, j10));
                        i(i9, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m(i9, obj2)) {
                        c3.k(obj, j10, c3.f(obj2, j10));
                        i(i9, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    g(i9, obj, obj2);
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
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                case 48:
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    z1 z1Var = (z1) c3.h(obj, j10);
                    z1 z1Var2 = (z1) c3.h(obj2, j10);
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
                    c3.l(obj, j10, z1Var2);
                    obj3 = obj;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    t1 t1Var = u2.a;
                    c3.l(obj, j10, t1.a(c3.h(obj, j10), c3.h(obj2, j10)));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (p(i11, i9, obj2)) {
                        c3.l(obj, j10, c3.h(obj2, j10));
                        c3.j(obj, iArr[i9 + 2] & 1048575, i11);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    h(i9, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                case 66:
                case 67:
                    if (p(i11, i9, obj2)) {
                        c3.l(obj, j10, c3.h(obj2, j10));
                        c3.j(obj, iArr[i9 + 2] & 1048575, i11);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    h(i9, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i9 += 3;
            obj = obj3;
        }
    }
}
