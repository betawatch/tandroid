package com.google.android.gms.internal.play_billing;

import androidx.car.app.navigation.model.Maneuver;
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
import org.telegram.ui.yh;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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

    public n2(int[] iArr, Object[] objArr, int i10, int i11, e1 e1Var, int[] iArr2, int i12, int i13, t1 t1Var, t1 t1Var2) {
        this.a = iArr;
        this.b = objArr;
        this.c = i10;
        this.d = i11;
        this.f = iArr2;
        this.g = i12;
        this.h = i13;
        this.i = t1Var;
        this.e = e1Var;
    }

    public static Field B(Class cls, String str) {
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
            StringBuilder m9 = yh.m("Field ", str, " for ", name, " not found. Known fields are ");
            m9.append(arrays);
            throw new RuntimeException(m9.toString(), e);
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
        int i10;
        int charAt;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        char charAt2;
        int i18;
        char charAt3;
        int i19;
        char charAt4;
        int i20;
        char charAt5;
        int i21;
        char charAt6;
        int i22;
        char charAt7;
        int i23;
        char charAt8;
        int i24;
        char charAt9;
        int i25;
        int i26;
        Object[] objArr;
        int i27;
        Class<?> cls;
        int objectFieldOffset;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        Field B;
        char charAt10;
        int i34;
        int i35;
        int i36;
        int i37;
        Object obj;
        Field B2;
        Object obj2;
        Field B3;
        int i38;
        char charAt11;
        int i39;
        char charAt12;
        int i40;
        char charAt13;
        int i41;
        char charAt14;
        if (!(s2Var instanceof s2)) {
            s2Var.getClass();
            throw new ClassCastException();
        }
        String str = s2Var.b;
        int length = str.length();
        int i42 = 55296;
        if (str.charAt(0) >= 55296) {
            int i43 = 1;
            while (true) {
                i10 = i43 + 1;
                if (str.charAt(i43) < 55296) {
                    break;
                }
                i43 = i10;
            }
        } else {
            i10 = 1;
        }
        int i44 = i10 + 1;
        int charAt15 = str.charAt(i10);
        if (charAt15 >= 55296) {
            int i45 = charAt15 & 8191;
            int i46 = 13;
            while (true) {
                i41 = i44 + 1;
                charAt14 = str.charAt(i44);
                if (charAt14 < 55296) {
                    break;
                }
                i45 |= (charAt14 & 8191) << i46;
                i46 += 13;
                i44 = i41;
            }
            charAt15 = i45 | (charAt14 << i46);
            i44 = i41;
        }
        if (charAt15 == 0) {
            iArr = j;
            i11 = 0;
            i13 = 0;
            i15 = 0;
            charAt = 0;
            i12 = 0;
            i14 = 0;
            i16 = 0;
        } else {
            int i47 = i44 + 1;
            int charAt16 = str.charAt(i44);
            if (charAt16 >= 55296) {
                int i48 = charAt16 & 8191;
                int i49 = 13;
                while (true) {
                    i24 = i47 + 1;
                    charAt9 = str.charAt(i47);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i48 |= (charAt9 & 8191) << i49;
                    i49 += 13;
                    i47 = i24;
                }
                charAt16 = i48 | (charAt9 << i49);
                i47 = i24;
            }
            int i50 = i47 + 1;
            int charAt17 = str.charAt(i47);
            if (charAt17 >= 55296) {
                int i51 = charAt17 & 8191;
                int i52 = 13;
                while (true) {
                    i23 = i50 + 1;
                    charAt8 = str.charAt(i50);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i51 |= (charAt8 & 8191) << i52;
                    i52 += 13;
                    i50 = i23;
                }
                charAt17 = i51 | (charAt8 << i52);
                i50 = i23;
            }
            int i53 = i50 + 1;
            int charAt18 = str.charAt(i50);
            if (charAt18 >= 55296) {
                int i54 = charAt18 & 8191;
                int i55 = 13;
                while (true) {
                    i22 = i53 + 1;
                    charAt7 = str.charAt(i53);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i54 |= (charAt7 & 8191) << i55;
                    i55 += 13;
                    i53 = i22;
                }
                charAt18 = i54 | (charAt7 << i55);
                i53 = i22;
            }
            int i56 = i53 + 1;
            int charAt19 = str.charAt(i53);
            if (charAt19 >= 55296) {
                int i57 = charAt19 & 8191;
                int i58 = 13;
                while (true) {
                    i21 = i56 + 1;
                    charAt6 = str.charAt(i56);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i57 |= (charAt6 & 8191) << i58;
                    i58 += 13;
                    i56 = i21;
                }
                charAt19 = i57 | (charAt6 << i58);
                i56 = i21;
            }
            int i59 = i56 + 1;
            charAt = str.charAt(i56);
            if (charAt >= 55296) {
                int i60 = charAt & 8191;
                int i61 = 13;
                while (true) {
                    i20 = i59 + 1;
                    charAt5 = str.charAt(i59);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i60 |= (charAt5 & 8191) << i61;
                    i61 += 13;
                    i59 = i20;
                }
                charAt = i60 | (charAt5 << i61);
                i59 = i20;
            }
            int i62 = i59 + 1;
            int charAt20 = str.charAt(i59);
            if (charAt20 >= 55296) {
                int i63 = charAt20 & 8191;
                int i64 = 13;
                while (true) {
                    i19 = i62 + 1;
                    charAt4 = str.charAt(i62);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i63 |= (charAt4 & 8191) << i64;
                    i64 += 13;
                    i62 = i19;
                }
                charAt20 = i63 | (charAt4 << i64);
                i62 = i19;
            }
            int i65 = i62 + 1;
            int charAt21 = str.charAt(i62);
            if (charAt21 >= 55296) {
                int i66 = charAt21 & 8191;
                int i67 = 13;
                while (true) {
                    i18 = i65 + 1;
                    charAt3 = str.charAt(i65);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i66 |= (charAt3 & 8191) << i67;
                    i67 += 13;
                    i65 = i18;
                }
                charAt21 = i66 | (charAt3 << i67);
                i65 = i18;
            }
            int i68 = i65 + 1;
            int charAt22 = str.charAt(i65);
            if (charAt22 >= 55296) {
                int i69 = charAt22 & 8191;
                int i70 = 13;
                while (true) {
                    i17 = i68 + 1;
                    charAt2 = str.charAt(i68);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i69 |= (charAt2 & 8191) << i70;
                    i70 += 13;
                    i68 = i17;
                }
                charAt22 = i69 | (charAt2 << i70);
                i68 = i17;
            }
            int i71 = charAt16 + charAt16 + charAt17;
            i11 = charAt16;
            i44 = i68;
            iArr = new int[charAt22 + charAt20 + charAt21];
            int i72 = charAt20;
            i12 = charAt18;
            i13 = i72;
            i14 = charAt19;
            i15 = i71;
            i16 = charAt22;
        }
        Unsafe unsafe = k;
        Object[] objArr2 = s2Var.c;
        Class<?> cls2 = s2Var.a.getClass();
        int i73 = i16 + i13;
        int i74 = charAt + charAt;
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr3 = new Object[i74];
        int i75 = i73;
        int i76 = i16;
        int i77 = 0;
        int i78 = 0;
        while (i44 < length) {
            int i79 = i44 + 1;
            int charAt23 = str.charAt(i44);
            if (charAt23 >= i42) {
                int i80 = charAt23 & 8191;
                int i81 = i79;
                int i82 = 13;
                while (true) {
                    i40 = i81 + 1;
                    charAt13 = str.charAt(i81);
                    i25 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i80 |= (charAt13 & 8191) << i82;
                    i82 += 13;
                    i81 = i40;
                    length = i25;
                }
                charAt23 = i80 | (charAt13 << i82);
                i26 = i40;
            } else {
                i25 = length;
                i26 = i79;
            }
            int i83 = i26 + 1;
            int charAt24 = str.charAt(i26);
            Object[] objArr4 = objArr2;
            char c3 = CharacterCompat.MIN_HIGH_SURROGATE;
            if (charAt24 >= 55296) {
                int i84 = charAt24 & 8191;
                int i85 = 13;
                while (true) {
                    i39 = i83 + 1;
                    charAt12 = str.charAt(i83);
                    if (charAt12 < c3) {
                        break;
                    }
                    i84 |= (charAt12 & 8191) << i85;
                    i85 += 13;
                    i83 = i39;
                    c3 = CharacterCompat.MIN_HIGH_SURROGATE;
                }
                charAt24 = i84 | (charAt12 << i85);
                i83 = i39;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i77] = i78;
                i77++;
            }
            int i86 = charAt24 & 255;
            int i87 = charAt23;
            int i88 = charAt24 & 2048;
            if (i86 >= 51) {
                int i89 = i83 + 1;
                int charAt25 = str.charAt(i83);
                char c10 = CharacterCompat.MIN_HIGH_SURROGATE;
                if (charAt25 >= 55296) {
                    int i90 = charAt25 & 8191;
                    int i91 = i89;
                    int i92 = 13;
                    while (true) {
                        i38 = i91 + 1;
                        charAt11 = str.charAt(i91);
                        if (charAt11 < c10) {
                            break;
                        }
                        i90 |= (charAt11 & 8191) << i92;
                        i92 += 13;
                        i91 = i38;
                        c10 = CharacterCompat.MIN_HIGH_SURROGATE;
                    }
                    charAt25 = i90 | (charAt11 << i92);
                    i35 = i38;
                } else {
                    i35 = i89;
                }
                int i93 = i35;
                int i94 = i86 - 51;
                int i95 = charAt25;
                if (i94 == 9 || i94 == 17) {
                    i36 = i15 + 1;
                    int i96 = i78 / 3;
                    objArr3[i96 + i96 + 1] = objArr4[i15];
                } else {
                    if (i94 == 12) {
                        if (s2Var.a() == 1 || i88 != 0) {
                            i36 = i15 + 1;
                            int i97 = i78 / 3;
                            objArr3[i97 + i97 + 1] = objArr4[i15];
                        } else {
                            i37 = 0;
                            int i98 = i95 + i95;
                            int i99 = i37;
                            obj = objArr4[i98];
                            if (obj instanceof Field) {
                                B2 = (Field) obj;
                            } else {
                                B2 = B(cls2, (String) obj);
                                objArr4[i98] = B2;
                            }
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(B2);
                            int i100 = i98 + 1;
                            obj2 = objArr4[i100];
                            if (obj2 instanceof Field) {
                                B3 = (Field) obj2;
                            } else {
                                B3 = B(cls2, (String) obj2);
                                objArr4[i100] = B3;
                            }
                            int objectFieldOffset3 = (int) unsafe.objectFieldOffset(B3);
                            Class<?> cls3 = cls2;
                            i28 = objectFieldOffset3;
                            i32 = objectFieldOffset2;
                            i29 = i93;
                            objArr = objArr3;
                            cls = cls3;
                            i27 = i11;
                            i33 = i99;
                            i31 = 0;
                        }
                    }
                    i37 = i88;
                    int i982 = i95 + i95;
                    int i992 = i37;
                    obj = objArr4[i982];
                    if (obj instanceof Field) {
                    }
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(B2);
                    int i1002 = i982 + 1;
                    obj2 = objArr4[i1002];
                    if (obj2 instanceof Field) {
                    }
                    int objectFieldOffset32 = (int) unsafe.objectFieldOffset(B3);
                    Class<?> cls32 = cls2;
                    i28 = objectFieldOffset32;
                    i32 = objectFieldOffset22;
                    i29 = i93;
                    objArr = objArr3;
                    cls = cls32;
                    i27 = i11;
                    i33 = i992;
                    i31 = 0;
                }
                i15 = i36;
                i37 = i88;
                int i9822 = i95 + i95;
                int i9922 = i37;
                obj = objArr4[i9822];
                if (obj instanceof Field) {
                }
                int objectFieldOffset222 = (int) unsafe.objectFieldOffset(B2);
                int i10022 = i9822 + 1;
                obj2 = objArr4[i10022];
                if (obj2 instanceof Field) {
                }
                int objectFieldOffset322 = (int) unsafe.objectFieldOffset(B3);
                Class<?> cls322 = cls2;
                i28 = objectFieldOffset322;
                i32 = objectFieldOffset222;
                i29 = i93;
                objArr = objArr3;
                cls = cls322;
                i27 = i11;
                i33 = i9922;
                i31 = 0;
            } else {
                int i101 = i15 + 1;
                Field B4 = B(cls2, (String) objArr4[i15]);
                objArr = objArr3;
                if (i86 == 9 || i86 == 17) {
                    i27 = i11;
                    int i102 = i78 / 3;
                    objArr[i102 + i102 + 1] = B4.getType();
                } else {
                    if (i86 == 27) {
                        i27 = i11;
                        i34 = 1;
                        i15 += 2;
                    } else if (i86 == 49) {
                        i15 += 2;
                        i27 = i11;
                        i34 = 1;
                    } else {
                        if (i86 == 12 || i86 == 30 || i86 == 44) {
                            i27 = i11;
                            if (s2Var.a() == 1 || i88 != 0) {
                                i15 += 2;
                                int i103 = i78 / 3;
                                objArr[i103 + i103 + 1] = objArr4[i101];
                                cls = cls2;
                            } else {
                                cls = cls2;
                                i15 = i101;
                                i88 = 0;
                            }
                        } else if (i86 == 50) {
                            int i104 = i15 + 2;
                            int i105 = i76 + 1;
                            iArr[i76] = i78;
                            int i106 = i78 / 3;
                            int i107 = i106 + i106;
                            objArr[i107] = objArr4[i101];
                            if (i88 != 0) {
                                i15 += 3;
                                objArr[i107 + 1] = objArr4[i104];
                                cls = cls2;
                                i76 = i105;
                            } else {
                                i15 = i104;
                                cls = cls2;
                                i76 = i105;
                                i88 = 0;
                            }
                            i27 = i11;
                        } else {
                            i27 = i11;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(B4);
                        i28 = 1048575;
                        if ((charAt24 & 4096) != 0 || i86 > 17) {
                            i29 = i83;
                            i30 = 0;
                        } else {
                            int i108 = i83 + 1;
                            int charAt26 = str.charAt(i83);
                            if (charAt26 >= 55296) {
                                int i109 = charAt26 & 8191;
                                int i110 = 13;
                                while (true) {
                                    i29 = i108 + 1;
                                    charAt10 = str.charAt(i108);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i109 |= (charAt10 & 8191) << i110;
                                    i110 += 13;
                                    i108 = i29;
                                }
                                charAt26 = i109 | (charAt10 << i110);
                            } else {
                                i29 = i108;
                            }
                            int i111 = (charAt26 / 32) + i27 + i27;
                            Object obj3 = objArr4[i111];
                            if (obj3 instanceof Field) {
                                B = (Field) obj3;
                            } else {
                                B = B(cls, (String) obj3);
                                objArr4[i111] = B;
                            }
                            i28 = (int) unsafe.objectFieldOffset(B);
                            i30 = charAt26 % 32;
                        }
                        if (i86 >= 18 && i86 <= 49) {
                            iArr[i75] = objectFieldOffset;
                            i75++;
                        }
                        i31 = i30;
                        i32 = objectFieldOffset;
                        i33 = i88;
                    }
                    int i112 = i78 / 3;
                    objArr[i112 + i112 + i34] = objArr4[i101];
                    cls = cls2;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(B4);
                    i28 = 1048575;
                    if ((charAt24 & 4096) != 0) {
                    }
                    i29 = i83;
                    i30 = 0;
                    if (i86 >= 18) {
                        iArr[i75] = objectFieldOffset;
                        i75++;
                    }
                    i31 = i30;
                    i32 = objectFieldOffset;
                    i33 = i88;
                }
                cls = cls2;
                i15 = i101;
                objectFieldOffset = (int) unsafe.objectFieldOffset(B4);
                i28 = 1048575;
                if ((charAt24 & 4096) != 0) {
                }
                i29 = i83;
                i30 = 0;
                if (i86 >= 18) {
                }
                i31 = i30;
                i32 = objectFieldOffset;
                i33 = i88;
            }
            int i113 = i78 + 1;
            iArr2[i78] = i87;
            int i114 = i78 + 2;
            String str2 = str;
            iArr2[i113] = ((charAt24 & 512) != 0 ? TLObject.FLAG_29 : 0) | ((charAt24 & 256) != 0 ? TLObject.FLAG_28 : 0) | (i33 != 0 ? TLObject.FLAG_31 : 0) | (i86 << 20) | i32;
            i78 += 3;
            iArr2[i114] = (i31 << 20) | i28;
            cls2 = cls;
            objArr2 = objArr4;
            length = i25;
            objArr3 = objArr;
            i11 = i27;
            i44 = i29;
            str = str2;
            i42 = 55296;
        }
        return new n2(iArr2, objArr3, i12, i14, s2Var.a, iArr, i16, i73, t1Var, t1Var2);
    }

    public static int s(Object obj, long j10) {
        return ((Integer) c3.h(obj, j10)).intValue();
    }

    public static int u(int i10) {
        return (i10 >>> 20) & 255;
    }

    public static long w(Object obj, long j10) {
        return ((Long) c3.h(obj, j10)).longValue();
    }

    public final Object A(int i10, int i11, Object obj) {
        t2 y10 = y(i11);
        if (!p(i10, i11, obj)) {
            return y10.zze();
        }
        Object object = k.getObject(obj, v(i11) & 1048575);
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
        int i10;
        long doubleToLongBits;
        int floatToIntBits;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i11 >= iArr.length) {
                return v1Var.zzc.hashCode() + (i12 * 53);
            }
            int v = v(i11);
            int i13 = 1048575 & v;
            int u10 = u(v);
            int i14 = iArr[i11];
            long j10 = i13;
            int i15 = 1237;
            switch (u10) {
                case 0:
                    i10 = i12 * 53;
                    doubleToLongBits = Double.doubleToLongBits(c3.c.a(v1Var, j10));
                    Charset charset = a2.a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + floatToIntBits;
                    break;
                case 1:
                    i10 = i12 * 53;
                    floatToIntBits = Float.floatToIntBits(c3.c.b(v1Var, j10));
                    i12 = i10 + floatToIntBits;
                    break;
                case 2:
                    i10 = i12 * 53;
                    doubleToLongBits = c3.f(v1Var, j10);
                    Charset charset2 = a2.a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + floatToIntBits;
                    break;
                case 3:
                    i10 = i12 * 53;
                    doubleToLongBits = c3.f(v1Var, j10);
                    Charset charset3 = a2.a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + floatToIntBits;
                    break;
                case 4:
                    i10 = i12 * 53;
                    floatToIntBits = c3.e(v1Var, j10);
                    i12 = i10 + floatToIntBits;
                    break;
                case 5:
                    i10 = i12 * 53;
                    doubleToLongBits = c3.f(v1Var, j10);
                    Charset charset4 = a2.a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + floatToIntBits;
                    break;
                case 6:
                    i10 = i12 * 53;
                    floatToIntBits = c3.e(v1Var, j10);
                    i12 = i10 + floatToIntBits;
                    break;
                case 7:
                    i10 = i12 * 53;
                    boolean g10 = c3.c.g(v1Var, j10);
                    Charset charset5 = a2.a;
                    break;
                case 8:
                    i10 = i12 * 53;
                    floatToIntBits = ((String) c3.h(v1Var, j10)).hashCode();
                    i12 = i10 + floatToIntBits;
                    break;
                case 9:
                    i10 = i12 * 53;
                    Object h = c3.h(v1Var, j10);
                    if (h != null) {
                        floatToIntBits = h.hashCode();
                        i12 = i10 + floatToIntBits;
                        break;
                    }
                    floatToIntBits = 37;
                    i12 = i10 + floatToIntBits;
                case 10:
                    i10 = i12 * 53;
                    floatToIntBits = c3.h(v1Var, j10).hashCode();
                    i12 = i10 + floatToIntBits;
                    break;
                case 11:
                    i10 = i12 * 53;
                    floatToIntBits = c3.e(v1Var, j10);
                    i12 = i10 + floatToIntBits;
                    break;
                case 12:
                    i10 = i12 * 53;
                    floatToIntBits = c3.e(v1Var, j10);
                    i12 = i10 + floatToIntBits;
                    break;
                case 13:
                    i10 = i12 * 53;
                    floatToIntBits = c3.e(v1Var, j10);
                    i12 = i10 + floatToIntBits;
                    break;
                case 14:
                    i10 = i12 * 53;
                    doubleToLongBits = c3.f(v1Var, j10);
                    Charset charset6 = a2.a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + floatToIntBits;
                    break;
                case 15:
                    i10 = i12 * 53;
                    floatToIntBits = c3.e(v1Var, j10);
                    i12 = i10 + floatToIntBits;
                    break;
                case 16:
                    i10 = i12 * 53;
                    doubleToLongBits = c3.f(v1Var, j10);
                    Charset charset7 = a2.a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + floatToIntBits;
                    break;
                case 17:
                    i10 = i12 * 53;
                    Object h9 = c3.h(v1Var, j10);
                    if (h9 != null) {
                        floatToIntBits = h9.hashCode();
                        i12 = i10 + floatToIntBits;
                        break;
                    }
                    floatToIntBits = 37;
                    i12 = i10 + floatToIntBits;
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
                    i10 = i12 * 53;
                    floatToIntBits = c3.h(v1Var, j10).hashCode();
                    i12 = i10 + floatToIntBits;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    i10 = i12 * 53;
                    floatToIntBits = c3.h(v1Var, j10).hashCode();
                    i12 = i10 + floatToIntBits;
                    break;
                case 51:
                    if (!p(i14, i11, v1Var)) {
                        break;
                    } else {
                        i10 = i12 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) c3.h(v1Var, j10)).doubleValue());
                        Charset charset8 = a2.a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + floatToIntBits;
                        break;
                    }
                case 52:
                    if (!p(i14, i11, v1Var)) {
                        break;
                    } else {
                        i10 = i12 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) c3.h(v1Var, j10)).floatValue());
                        i12 = i10 + floatToIntBits;
                        break;
                    }
                case 53:
                    if (!p(i14, i11, v1Var)) {
                        break;
                    } else {
                        i10 = i12 * 53;
                        doubleToLongBits = w(v1Var, j10);
                        Charset charset9 = a2.a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + floatToIntBits;
                        break;
                    }
                case 54:
                    if (!p(i14, i11, v1Var)) {
                        break;
                    } else {
                        i10 = i12 * 53;
                        doubleToLongBits = w(v1Var, j10);
                        Charset charset10 = a2.a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + floatToIntBits;
                        break;
                    }
                case 55:
                    if (!p(i14, i11, v1Var)) {
                        break;
                    } else {
                        i10 = i12 * 53;
                        floatToIntBits = s(v1Var, j10);
                        i12 = i10 + floatToIntBits;
                        break;
                    }
                case 56:
                    if (!p(i14, i11, v1Var)) {
                        break;
                    } else {
                        i10 = i12 * 53;
                        doubleToLongBits = w(v1Var, j10);
                        Charset charset11 = a2.a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + floatToIntBits;
                        break;
                    }
                case 57:
                    if (!p(i14, i11, v1Var)) {
                        break;
                    } else {
                        i10 = i12 * 53;
                        floatToIntBits = s(v1Var, j10);
                        i12 = i10 + floatToIntBits;
                        break;
                    }
                case 58:
                    if (!p(i14, i11, v1Var)) {
                        break;
                    } else {
                        i10 = i12 * 53;
                        boolean booleanValue = ((Boolean) c3.h(v1Var, j10)).booleanValue();
                        Charset charset12 = a2.a;
                        break;
                    }
                case 59:
                    if (!p(i14, i11, v1Var)) {
                        break;
                    } else {
                        i10 = i12 * 53;
                        floatToIntBits = ((String) c3.h(v1Var, j10)).hashCode();
                        i12 = i10 + floatToIntBits;
                        break;
                    }
                case 60:
                    if (!p(i14, i11, v1Var)) {
                        break;
                    } else {
                        i10 = i12 * 53;
                        floatToIntBits = c3.h(v1Var, j10).hashCode();
                        i12 = i10 + floatToIntBits;
                        break;
                    }
                case 61:
                    if (!p(i14, i11, v1Var)) {
                        break;
                    } else {
                        i10 = i12 * 53;
                        floatToIntBits = c3.h(v1Var, j10).hashCode();
                        i12 = i10 + floatToIntBits;
                        break;
                    }
                case 62:
                    if (!p(i14, i11, v1Var)) {
                        break;
                    } else {
                        i10 = i12 * 53;
                        floatToIntBits = s(v1Var, j10);
                        i12 = i10 + floatToIntBits;
                        break;
                    }
                case 63:
                    if (!p(i14, i11, v1Var)) {
                        break;
                    } else {
                        i10 = i12 * 53;
                        floatToIntBits = s(v1Var, j10);
                        i12 = i10 + floatToIntBits;
                        break;
                    }
                case 64:
                    if (!p(i14, i11, v1Var)) {
                        break;
                    } else {
                        i10 = i12 * 53;
                        floatToIntBits = s(v1Var, j10);
                        i12 = i10 + floatToIntBits;
                        break;
                    }
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (!p(i14, i11, v1Var)) {
                        break;
                    } else {
                        i10 = i12 * 53;
                        doubleToLongBits = w(v1Var, j10);
                        Charset charset13 = a2.a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + floatToIntBits;
                        break;
                    }
                case 66:
                    if (!p(i14, i11, v1Var)) {
                        break;
                    } else {
                        i10 = i12 * 53;
                        floatToIntBits = s(v1Var, j10);
                        i12 = i10 + floatToIntBits;
                        break;
                    }
                case 67:
                    if (!p(i14, i11, v1Var)) {
                        break;
                    } else {
                        i10 = i12 * 53;
                        doubleToLongBits = w(v1Var, j10);
                        Charset charset14 = a2.a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + floatToIntBits;
                        break;
                    }
                case 68:
                    if (!p(i14, i11, v1Var)) {
                        break;
                    } else {
                        i10 = i12 * 53;
                        floatToIntBits = c3.h(v1Var, j10).hashCode();
                        i12 = i10 + floatToIntBits;
                        break;
                    }
            }
            i11 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final boolean b(Object obj) {
        int i10;
        int i11;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.g) {
            int i16 = this.f[i15];
            int[] iArr = this.a;
            int i17 = iArr[i16];
            int v = v(i16);
            int i18 = iArr[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i13) {
                if (i19 != 1048575) {
                    i14 = k.getInt(obj, i19);
                }
                i11 = i16;
                i12 = i14;
                i10 = i19;
            } else {
                int i21 = i14;
                i10 = i13;
                i11 = i16;
                i12 = i21;
            }
            if ((268435456 & v) == 0 || n(obj, i11, i10, i12, i20)) {
                int u10 = u(v);
                if (u10 == 9 || u10 == 17) {
                    if (n(obj, i11, i10, i12, i20) && !y(i11).b(c3.h(obj, v & 1048575))) {
                    }
                    i15++;
                    i13 = i10;
                    i14 = i12;
                } else {
                    if (u10 != 27) {
                        if (u10 == 60 || u10 == 68) {
                            if (p(i17, i11, obj) && !y(i11).b(c3.h(obj, v & 1048575))) {
                            }
                        } else if (u10 != 49) {
                            if (u10 == 50 && !((j2) c3.h(obj, v & 1048575)).isEmpty()) {
                                int i22 = i11 / 3;
                                throw android.support.v4.media.a.j(this.b[i22 + i22]);
                            }
                        }
                        i15++;
                        i13 = i10;
                        i14 = i12;
                    }
                    List list = (List) c3.h(obj, v & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        t2 y10 = y(i11);
                        for (int i23 = 0; i23 < list.size(); i23++) {
                            if (y10.b(list.get(i23))) {
                            }
                        }
                    }
                    i15++;
                    i13 = i10;
                    i14 = i12;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final void c(Object obj, i2 i2Var) {
        int i10;
        int i11;
        n2 n2Var = this;
        Unsafe unsafe = k;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 1048575;
        int i15 = 0;
        while (true) {
            int[] iArr = n2Var.a;
            if (i13 >= iArr.length) {
                ((v1) obj).zzc.d(i2Var);
                return;
            }
            int v = n2Var.v(i13);
            int u10 = u(v);
            int i16 = iArr[i13];
            if (u10 <= 17) {
                int i17 = iArr[i13 + 2];
                int i18 = i17 & i12;
                if (i18 != i14) {
                    i15 = i18 == i12 ? 0 : unsafe.getInt(obj, i18);
                    i14 = i18;
                }
                i10 = 1 << (i17 >>> 20);
            } else {
                i10 = 0;
            }
            long j10 = v & i12;
            switch (u10) {
                case 0:
                    if (n2Var.n(obj, i13, i14, i15, i10)) {
                        ((m1) i2Var.a).h(i16, Double.doubleToRawLongBits(c3.c.a(obj, j10)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (n2Var.n(obj, i13, i14, i15, i10)) {
                        ((m1) i2Var.a).f(i16, Float.floatToRawIntBits(c3.c.b(obj, j10)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (n2Var.n(obj, i13, i14, i15, i10)) {
                        ((m1) i2Var.a).p(i16, unsafe.getLong(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (n2Var.n(obj, i13, i14, i15, i10)) {
                        ((m1) i2Var.a).p(i16, unsafe.getLong(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (n2Var.n(obj, i13, i14, i15, i10)) {
                        ((m1) i2Var.a).j(i16, unsafe.getInt(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (n2Var.n(obj, i13, i14, i15, i10)) {
                        ((m1) i2Var.a).h(i16, unsafe.getLong(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (n2Var.n(obj, i13, i14, i15, i10)) {
                        ((m1) i2Var.a).f(i16, unsafe.getInt(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (n2Var.n(obj, i13, i14, i15, i10)) {
                        byte g10 = c3.c.g(obj, j10);
                        m1 m1Var = (m1) i2Var.a;
                        m1Var.o(i16 << 3);
                        int i19 = m1Var.d;
                        try {
                            int i20 = i19 + 1;
                            try {
                                m1Var.b[i19] = g10;
                                m1Var.d = i20;
                                break;
                            } catch (IndexOutOfBoundsException e) {
                                e = e;
                                i19 = i20;
                                throw new b7.y0(i19, m1Var.c, 1, e);
                            }
                        } catch (IndexOutOfBoundsException e6) {
                            e = e6;
                        }
                    } else {
                        continue;
                    }
                case 8:
                    if (n2Var.n(obj, i13, i14, i15, i10)) {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof String) {
                            ((m1) i2Var.a).l(i16, (String) object);
                            break;
                        } else {
                            ((m1) i2Var.a).e(i16, (l1) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (n2Var.n(obj, i13, i14, i15, i10)) {
                        i2Var.b(i16, unsafe.getObject(obj, j10), n2Var.y(i13));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (n2Var.n(obj, i13, i14, i15, i10)) {
                        ((m1) i2Var.a).e(i16, (l1) unsafe.getObject(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (n2Var.n(obj, i13, i14, i15, i10)) {
                        ((m1) i2Var.a).n(i16, unsafe.getInt(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (n2Var.n(obj, i13, i14, i15, i10)) {
                        ((m1) i2Var.a).j(i16, unsafe.getInt(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (n2Var.n(obj, i13, i14, i15, i10)) {
                        ((m1) i2Var.a).f(i16, unsafe.getInt(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (n2Var.n(obj, i13, i14, i15, i10)) {
                        ((m1) i2Var.a).h(i16, unsafe.getLong(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (n2Var.n(obj, i13, i14, i15, i10)) {
                        int i21 = unsafe.getInt(obj, j10);
                        ((m1) i2Var.a).n(i16, (i21 >> 31) ^ (i21 + i21));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (n2Var.n(obj, i13, i14, i15, i10)) {
                        long j11 = unsafe.getLong(obj, j10);
                        ((m1) i2Var.a).p(i16, (j11 >> 63) ^ (j11 + j11));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (n2Var.n(obj, i13, i14, i15, i10)) {
                        i2Var.a(i16, unsafe.getObject(obj, j10), n2Var.y(i13));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    u2.r(iArr[i13], (List) unsafe.getObject(obj, j10), i2Var, false);
                    break;
                case 19:
                    u2.v(iArr[i13], (List) unsafe.getObject(obj, j10), i2Var, false);
                    break;
                case 20:
                    u2.x(iArr[i13], (List) unsafe.getObject(obj, j10), i2Var, false);
                    break;
                case 21:
                    u2.d(iArr[i13], (List) unsafe.getObject(obj, j10), i2Var, false);
                    break;
                case 22:
                    u2.w(iArr[i13], (List) unsafe.getObject(obj, j10), i2Var, false);
                    break;
                case 23:
                    u2.u(iArr[i13], (List) unsafe.getObject(obj, j10), i2Var, false);
                    break;
                case 24:
                    u2.t(iArr[i13], (List) unsafe.getObject(obj, j10), i2Var, false);
                    break;
                case 25:
                    u2.q(iArr[i13], (List) unsafe.getObject(obj, j10), i2Var, false);
                    break;
                case 26:
                    int i22 = iArr[i13];
                    List list = (List) unsafe.getObject(obj, j10);
                    t1 t1Var = u2.a;
                    if (list != null && !list.isEmpty()) {
                        m1 m1Var2 = (m1) i2Var.a;
                        if (list instanceof e2) {
                            e2 e2Var = (e2) list;
                            for (int i23 = 0; i23 < list.size(); i23++) {
                                Object zza = e2Var.zza();
                                if (zza instanceof String) {
                                    m1Var2.l(i22, (String) zza);
                                } else {
                                    m1Var2.e(i22, (l1) zza);
                                }
                            }
                            break;
                        } else {
                            for (int i24 = 0; i24 < list.size(); i24++) {
                                m1Var2.l(i22, (String) list.get(i24));
                            }
                            break;
                        }
                    }
                    break;
                case 27:
                    int i25 = iArr[i13];
                    List list2 = (List) unsafe.getObject(obj, j10);
                    t2 y10 = n2Var.y(i13);
                    t1 t1Var2 = u2.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i26 = 0; i26 < list2.size(); i26++) {
                            i2Var.b(i25, list2.get(i26), y10);
                        }
                        break;
                    }
                    break;
                case 28:
                    int i27 = iArr[i13];
                    List list3 = (List) unsafe.getObject(obj, j10);
                    t1 t1Var3 = u2.a;
                    if (list3 != null && !list3.isEmpty()) {
                        i2Var.getClass();
                        for (int i28 = 0; i28 < list3.size(); i28++) {
                            ((m1) i2Var.a).e(i27, (l1) list3.get(i28));
                        }
                        break;
                    }
                    break;
                case 29:
                    u2.c(iArr[i13], (List) unsafe.getObject(obj, j10), i2Var, false);
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    u2.s(iArr[i13], (List) unsafe.getObject(obj, j10), i2Var, false);
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    u2.y(iArr[i13], (List) unsafe.getObject(obj, j10), i2Var, false);
                    break;
                case 32:
                    u2.z(iArr[i13], (List) unsafe.getObject(obj, j10), i2Var, false);
                    break;
                case 33:
                    u2.a(iArr[i13], (List) unsafe.getObject(obj, j10), i2Var, false);
                    break;
                case 34:
                    u2.b(iArr[i13], (List) unsafe.getObject(obj, j10), i2Var, false);
                    break;
                case 35:
                    u2.r(iArr[i13], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case 36:
                    u2.v(iArr[i13], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case 37:
                    u2.x(iArr[i13], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case 38:
                    u2.d(iArr[i13], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    u2.w(iArr[i13], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    u2.u(iArr[i13], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    u2.t(iArr[i13], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    u2.q(iArr[i13], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    u2.c(iArr[i13], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    u2.s(iArr[i13], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    u2.y(iArr[i13], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    u2.z(iArr[i13], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    u2.a(iArr[i13], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case 48:
                    u2.b(iArr[i13], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    int i29 = iArr[i13];
                    List list4 = (List) unsafe.getObject(obj, j10);
                    t2 y11 = n2Var.y(i13);
                    t1 t1Var4 = u2.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i30 = 0; i30 < list4.size(); i30++) {
                            i2Var.a(i29, list4.get(i30), y11);
                        }
                        break;
                    }
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    if (unsafe.getObject(obj, j10) != null) {
                        int i31 = i13 / 3;
                        throw android.support.v4.media.a.j(n2Var.b[i31 + i31]);
                    }
                    break;
                case 51:
                    if (n2Var.p(i16, i13, obj)) {
                        ((m1) i2Var.a).h(i16, Double.doubleToRawLongBits(((Double) c3.h(obj, j10)).doubleValue()));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (n2Var.p(i16, i13, obj)) {
                        ((m1) i2Var.a).f(i16, Float.floatToRawIntBits(((Float) c3.h(obj, j10)).floatValue()));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (n2Var.p(i16, i13, obj)) {
                        ((m1) i2Var.a).p(i16, w(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (n2Var.p(i16, i13, obj)) {
                        ((m1) i2Var.a).p(i16, w(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (n2Var.p(i16, i13, obj)) {
                        ((m1) i2Var.a).j(i16, s(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (n2Var.p(i16, i13, obj)) {
                        ((m1) i2Var.a).h(i16, w(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (n2Var.p(i16, i13, obj)) {
                        ((m1) i2Var.a).f(i16, s(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (n2Var.p(i16, i13, obj)) {
                        byte booleanValue = ((Boolean) c3.h(obj, j10)).booleanValue();
                        m1 m1Var3 = (m1) i2Var.a;
                        m1Var3.o(i16 << 3);
                        int i32 = m1Var3.d;
                        try {
                            i11 = i32 + 1;
                        } catch (IndexOutOfBoundsException e10) {
                            e = e10;
                        }
                        try {
                            m1Var3.b[i32] = booleanValue;
                            m1Var3.d = i11;
                            break;
                        } catch (IndexOutOfBoundsException e11) {
                            e = e11;
                            i32 = i11;
                            throw new b7.y0(i32, m1Var3.c, 1, e);
                        }
                    } else {
                        continue;
                    }
                case 59:
                    if (n2Var.p(i16, i13, obj)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof String) {
                            ((m1) i2Var.a).l(i16, (String) object2);
                            break;
                        } else {
                            ((m1) i2Var.a).e(i16, (l1) object2);
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (n2Var.p(i16, i13, obj)) {
                        i2Var.b(i16, unsafe.getObject(obj, j10), n2Var.y(i13));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (n2Var.p(i16, i13, obj)) {
                        ((m1) i2Var.a).e(i16, (l1) unsafe.getObject(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (n2Var.p(i16, i13, obj)) {
                        ((m1) i2Var.a).n(i16, s(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (n2Var.p(i16, i13, obj)) {
                        ((m1) i2Var.a).j(i16, s(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (n2Var.p(i16, i13, obj)) {
                        ((m1) i2Var.a).f(i16, s(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (n2Var.p(i16, i13, obj)) {
                        ((m1) i2Var.a).h(i16, w(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (n2Var.p(i16, i13, obj)) {
                        int s6 = s(obj, j10);
                        ((m1) i2Var.a).n(i16, (s6 >> 31) ^ (s6 + s6));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (n2Var.p(i16, i13, obj)) {
                        long w10 = w(obj, j10);
                        ((m1) i2Var.a).p(i16, (w10 >> 63) ^ (w10 + w10));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (n2Var.p(i16, i13, obj)) {
                        i2Var.a(i16, unsafe.getObject(obj, j10), n2Var.y(i13));
                        break;
                    } else {
                        break;
                    }
            }
            i13 += 3;
            i12 = 1048575;
            n2Var = this;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final int d(e1 e1Var) {
        int i10;
        int b10;
        int b11;
        int c3;
        int b12;
        int o10;
        int b13;
        int b14;
        int b15;
        int b16;
        int i11;
        int b17;
        int h;
        int b18;
        int size;
        int n10;
        int b19;
        int size2;
        int b20;
        int b21;
        int o11;
        int b22;
        n2 n2Var = this;
        e1 e1Var2 = e1Var;
        Unsafe unsafe = k;
        int i12 = 0;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = n2Var.a;
            if (i12 >= iArr.length) {
                return ((v1) e1Var).zzc.a() + i15;
            }
            int v = n2Var.v(i12);
            int u10 = u(v);
            int i16 = iArr[i12];
            int i17 = iArr[i12 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1;
            if (u10 <= 17) {
                if (i18 != i13) {
                    i14 = i18 == 1048575 ? 0 : unsafe.getInt(e1Var2, i18);
                    i13 = i18;
                }
                i10 = 1 << (i17 >>> 20);
            } else {
                i10 = 0;
            }
            int i20 = v & 1048575;
            if (u10 >= q1.b.a) {
                q1.c.getClass();
            }
            long j10 = i20;
            switch (u10) {
                case 0:
                    if (n2Var.n(e1Var2, i12, i13, i14, i10)) {
                        b10 = m1.b(i16 << 3);
                        i19 = 8;
                        h = b10 + i19;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 1:
                    if (n2Var.n(e1Var2, i12, i13, i14, i10)) {
                        b10 = m1.b(i16 << 3);
                        i19 = 4;
                        h = b10 + i19;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 2:
                    if (n2Var.n(e1Var2, i12, i13, i14, i10)) {
                        long j11 = unsafe.getLong(e1Var2, j10);
                        b11 = m1.b(i16 << 3);
                        c3 = m1.c(j11);
                        h = b11 + c3;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 3:
                    if (n2Var.n(e1Var2, i12, i13, i14, i10)) {
                        long j12 = unsafe.getLong(e1Var2, j10);
                        b11 = m1.b(i16 << 3);
                        c3 = m1.c(j12);
                        h = b11 + c3;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 4:
                    if (n2Var.n(e1Var2, i12, i13, i14, i10)) {
                        long j13 = unsafe.getInt(e1Var2, j10);
                        b11 = m1.b(i16 << 3);
                        c3 = m1.c(j13);
                        h = b11 + c3;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 5:
                    if (n2Var.n(e1Var2, i12, i13, i14, i10)) {
                        b10 = m1.b(i16 << 3);
                        i19 = 8;
                        h = b10 + i19;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 6:
                    if (n2Var.n(e1Var2, i12, i13, i14, i10)) {
                        b10 = m1.b(i16 << 3);
                        i19 = 4;
                        h = b10 + i19;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 7:
                    if (n2Var.n(e1Var2, i12, i13, i14, i10)) {
                        b10 = m1.b(i16 << 3);
                        h = b10 + i19;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 8:
                    if (n2Var.n(e1Var2, i12, i13, i14, i10)) {
                        int i21 = i16 << 3;
                        Object object = unsafe.getObject(e1Var2, j10);
                        if (object instanceof l1) {
                            b12 = m1.b(i21);
                            o10 = ((l1) object).o();
                            b13 = m1.b(o10);
                            c3 = b13 + o10;
                            b11 = b12;
                            h = b11 + c3;
                            b18 = h;
                            i15 += b18;
                            i12 += 3;
                            n2Var = this;
                            e1Var2 = e1Var;
                        } else {
                            b12 = m1.b(i21);
                            c3 = m1.a((String) object);
                            b11 = b12;
                            h = b11 + c3;
                            b18 = h;
                            i15 += b18;
                            i12 += 3;
                            n2Var = this;
                            e1Var2 = e1Var;
                        }
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 9:
                    if (n2Var.n(e1Var2, i12, i13, i14, i10)) {
                        Object object2 = unsafe.getObject(e1Var2, j10);
                        t2 y10 = n2Var.y(i12);
                        t1 t1Var = u2.a;
                        b14 = m1.b(i16 << 3);
                        b15 = ((e1) object2).b(y10);
                        b16 = m1.b(b15);
                        h = b16 + b15 + b14;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 10:
                    if (n2Var.n(e1Var2, i12, i13, i14, i10)) {
                        l1 l1Var = (l1) unsafe.getObject(e1Var2, j10);
                        b12 = m1.b(i16 << 3);
                        o10 = l1Var.o();
                        b13 = m1.b(o10);
                        c3 = b13 + o10;
                        b11 = b12;
                        h = b11 + c3;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 11:
                    if (n2Var.n(e1Var2, i12, i13, i14, i10)) {
                        int i22 = unsafe.getInt(e1Var2, j10);
                        b12 = m1.b(i16 << 3);
                        c3 = m1.b(i22);
                        b11 = b12;
                        h = b11 + c3;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 12:
                    if (n2Var.n(e1Var2, i12, i13, i14, i10)) {
                        long j14 = unsafe.getInt(e1Var2, j10);
                        b11 = m1.b(i16 << 3);
                        c3 = m1.c(j14);
                        h = b11 + c3;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 13:
                    if (n2Var.n(e1Var2, i12, i13, i14, i10)) {
                        b10 = m1.b(i16 << 3);
                        i19 = 4;
                        h = b10 + i19;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 14:
                    if (n2Var.n(e1Var2, i12, i13, i14, i10)) {
                        b10 = m1.b(i16 << 3);
                        i19 = 8;
                        h = b10 + i19;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 15:
                    if (n2Var.n(e1Var2, i12, i13, i14, i10)) {
                        int i23 = unsafe.getInt(e1Var2, j10);
                        b12 = m1.b(i16 << 3);
                        c3 = m1.b((i23 >> 31) ^ (i23 + i23));
                        b11 = b12;
                        h = b11 + c3;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 16:
                    if (n2Var.n(e1Var2, i12, i13, i14, i10)) {
                        long j15 = unsafe.getLong(e1Var2, j10);
                        b11 = m1.b(i16 << 3);
                        c3 = m1.c((j15 >> 63) ^ (j15 + j15));
                        h = b11 + c3;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 17:
                    if (n2Var.n(e1Var2, i12, i13, i14, i10)) {
                        e1 e1Var3 = (e1) unsafe.getObject(e1Var2, j10);
                        t2 y11 = n2Var.y(i12);
                        int b23 = m1.b(i16 << 3);
                        i11 = b23 + b23;
                        b17 = e1Var3.b(y11);
                        h = b17 + i11;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 18:
                    h = u2.h(i16, (List) unsafe.getObject(e1Var2, j10));
                    b18 = h;
                    i15 += b18;
                    i12 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 19:
                    h = u2.g(i16, (List) unsafe.getObject(e1Var2, j10));
                    b18 = h;
                    i15 += b18;
                    i12 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 20:
                    List list = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var2 = u2.a;
                    if (list.size() != 0) {
                        b18 = (m1.b(i16 << 3) * list.size()) + u2.j(list);
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i15 += b18;
                    i12 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 21:
                    List list2 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var3 = u2.a;
                    size = list2.size();
                    if (size != 0) {
                        n10 = u2.n(list2);
                        b19 = m1.b(i16 << 3);
                        b18 = (b19 * size) + n10;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i15 += b18;
                    i12 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 22:
                    List list3 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var4 = u2.a;
                    size = list3.size();
                    if (size != 0) {
                        n10 = u2.i(list3);
                        b19 = m1.b(i16 << 3);
                        b18 = (b19 * size) + n10;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i15 += b18;
                    i12 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 23:
                    h = u2.h(i16, (List) unsafe.getObject(e1Var2, j10));
                    b18 = h;
                    i15 += b18;
                    i12 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 24:
                    h = u2.g(i16, (List) unsafe.getObject(e1Var2, j10));
                    b18 = h;
                    i15 += b18;
                    i12 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 25:
                    List list4 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var5 = u2.a;
                    int size3 = list4.size();
                    if (size3 != 0) {
                        b18 = (m1.b(i16 << 3) + 1) * size3;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i15 += b18;
                    i12 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 26:
                    List list5 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var6 = u2.a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        int b24 = m1.b(i16 << 3) * size4;
                        if (list5 instanceof e2) {
                            e2 e2Var = (e2) list5;
                            b18 = b24;
                            for (int i24 = 0; i24 < size4; i24++) {
                                Object zza = e2Var.zza();
                                if (zza instanceof l1) {
                                    int o12 = ((l1) zza).o();
                                    b18 = m1.b(o12) + o12 + b18;
                                } else {
                                    b18 = m1.a((String) zza) + b18;
                                }
                            }
                        } else {
                            b18 = b24;
                            for (int i25 = 0; i25 < size4; i25++) {
                                Object obj = list5.get(i25);
                                if (obj instanceof l1) {
                                    int o13 = ((l1) obj).o();
                                    b18 = m1.b(o13) + o13 + b18;
                                } else {
                                    b18 = m1.a((String) obj) + b18;
                                }
                            }
                        }
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i15 += b18;
                    i12 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 27:
                    List list6 = (List) unsafe.getObject(e1Var2, j10);
                    t2 y12 = n2Var.y(i12);
                    t1 t1Var7 = u2.a;
                    int size5 = list6.size();
                    if (size5 != 0) {
                        b18 = m1.b(i16 << 3) * size5;
                        for (int i26 = 0; i26 < size5; i26++) {
                            int b25 = ((e1) list6.get(i26)).b(y12);
                            b18 += m1.b(b25) + b25;
                        }
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i15 += b18;
                    i12 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 28:
                    List list7 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var8 = u2.a;
                    int size6 = list7.size();
                    if (size6 != 0) {
                        b18 = m1.b(i16 << 3) * size6;
                        for (int i27 = 0; i27 < list7.size(); i27++) {
                            int o14 = ((l1) list7.get(i27)).o();
                            b18 += m1.b(o14) + o14;
                        }
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i15 += b18;
                    i12 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 29:
                    List list8 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var9 = u2.a;
                    size = list8.size();
                    if (size != 0) {
                        n10 = u2.m(list8);
                        b19 = m1.b(i16 << 3);
                        b18 = (b19 * size) + n10;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i15 += b18;
                    i12 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    List list9 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var10 = u2.a;
                    size = list9.size();
                    if (size != 0) {
                        n10 = u2.f(list9);
                        b19 = m1.b(i16 << 3);
                        b18 = (b19 * size) + n10;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i15 += b18;
                    i12 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    h = u2.g(i16, (List) unsafe.getObject(e1Var2, j10));
                    b18 = h;
                    i15 += b18;
                    i12 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 32:
                    h = u2.h(i16, (List) unsafe.getObject(e1Var2, j10));
                    b18 = h;
                    i15 += b18;
                    i12 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 33:
                    List list10 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var11 = u2.a;
                    size = list10.size();
                    if (size != 0) {
                        n10 = u2.k(list10);
                        b19 = m1.b(i16 << 3);
                        b18 = (b19 * size) + n10;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i15 += b18;
                    i12 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 34:
                    List list11 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var12 = u2.a;
                    size = list11.size();
                    if (size != 0) {
                        n10 = u2.l(list11);
                        b19 = m1.b(i16 << 3);
                        b18 = (b19 * size) + n10;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i15 += b18;
                    i12 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 35:
                    List list12 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var13 = u2.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        b20 = m1.b(i16 << 3);
                        b21 = m1.b(size2);
                        i19 = size2;
                        b10 = b20 + b21;
                        h = b10 + i19;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var14 = u2.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        b20 = m1.b(i16 << 3);
                        b21 = m1.b(size2);
                        i19 = size2;
                        b10 = b20 + b21;
                        h = b10 + i19;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 37:
                    size2 = u2.j((List) unsafe.getObject(e1Var2, j10));
                    if (size2 > 0) {
                        b20 = m1.b(i16 << 3);
                        b21 = m1.b(size2);
                        i19 = size2;
                        b10 = b20 + b21;
                        h = b10 + i19;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 38:
                    size2 = u2.n((List) unsafe.getObject(e1Var2, j10));
                    if (size2 > 0) {
                        b20 = m1.b(i16 << 3);
                        b21 = m1.b(size2);
                        i19 = size2;
                        b10 = b20 + b21;
                        h = b10 + i19;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    size2 = u2.i((List) unsafe.getObject(e1Var2, j10));
                    if (size2 > 0) {
                        b20 = m1.b(i16 << 3);
                        b21 = m1.b(size2);
                        i19 = size2;
                        b10 = b20 + b21;
                        h = b10 + i19;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    List list14 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var15 = u2.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        b20 = m1.b(i16 << 3);
                        b21 = m1.b(size2);
                        i19 = size2;
                        b10 = b20 + b21;
                        h = b10 + i19;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    List list15 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var16 = u2.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        b20 = m1.b(i16 << 3);
                        b21 = m1.b(size2);
                        i19 = size2;
                        b10 = b20 + b21;
                        h = b10 + i19;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    List list16 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var17 = u2.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        b20 = m1.b(i16 << 3);
                        b21 = m1.b(size2);
                        i19 = size2;
                        b10 = b20 + b21;
                        h = b10 + i19;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    size2 = u2.m((List) unsafe.getObject(e1Var2, j10));
                    if (size2 > 0) {
                        b20 = m1.b(i16 << 3);
                        b21 = m1.b(size2);
                        i19 = size2;
                        b10 = b20 + b21;
                        h = b10 + i19;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    size2 = u2.f((List) unsafe.getObject(e1Var2, j10));
                    if (size2 > 0) {
                        b20 = m1.b(i16 << 3);
                        b21 = m1.b(size2);
                        i19 = size2;
                        b10 = b20 + b21;
                        h = b10 + i19;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    List list17 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var18 = u2.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        b20 = m1.b(i16 << 3);
                        b21 = m1.b(size2);
                        i19 = size2;
                        b10 = b20 + b21;
                        h = b10 + i19;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    List list18 = (List) unsafe.getObject(e1Var2, j10);
                    t1 t1Var19 = u2.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        b20 = m1.b(i16 << 3);
                        b21 = m1.b(size2);
                        i19 = size2;
                        b10 = b20 + b21;
                        h = b10 + i19;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    size2 = u2.k((List) unsafe.getObject(e1Var2, j10));
                    if (size2 > 0) {
                        b20 = m1.b(i16 << 3);
                        b21 = m1.b(size2);
                        i19 = size2;
                        b10 = b20 + b21;
                        h = b10 + i19;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 48:
                    size2 = u2.l((List) unsafe.getObject(e1Var2, j10));
                    if (size2 > 0) {
                        b20 = m1.b(i16 << 3);
                        b21 = m1.b(size2);
                        i19 = size2;
                        b10 = b20 + b21;
                        h = b10 + i19;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    List list19 = (List) unsafe.getObject(e1Var2, j10);
                    t2 y13 = n2Var.y(i12);
                    t1 t1Var20 = u2.a;
                    int size7 = list19.size();
                    if (size7 != 0) {
                        b18 = 0;
                        for (int i28 = 0; i28 < size7; i28++) {
                            e1 e1Var4 = (e1) list19.get(i28);
                            int b26 = m1.b(i16 << 3);
                            b18 += e1Var4.b(y13) + b26 + b26;
                        }
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                    b18 = 0;
                    i15 += b18;
                    i12 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    int i29 = i12 / 3;
                    j2 j2Var = (j2) unsafe.getObject(e1Var2, j10);
                    if (n2Var.b[i29 + i29] != null) {
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
                    i12 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
                case 51:
                    if (n2Var.p(i16, i12, e1Var2)) {
                        b10 = m1.b(i16 << 3);
                        i19 = 8;
                        h = b10 + i19;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 52:
                    if (n2Var.p(i16, i12, e1Var2)) {
                        b10 = m1.b(i16 << 3);
                        i19 = 4;
                        h = b10 + i19;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 53:
                    if (n2Var.p(i16, i12, e1Var2)) {
                        long w10 = w(e1Var2, j10);
                        b11 = m1.b(i16 << 3);
                        c3 = m1.c(w10);
                        h = b11 + c3;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 54:
                    if (n2Var.p(i16, i12, e1Var2)) {
                        long w11 = w(e1Var2, j10);
                        b11 = m1.b(i16 << 3);
                        c3 = m1.c(w11);
                        h = b11 + c3;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 55:
                    if (n2Var.p(i16, i12, e1Var2)) {
                        long s6 = s(e1Var2, j10);
                        b11 = m1.b(i16 << 3);
                        c3 = m1.c(s6);
                        h = b11 + c3;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 56:
                    if (n2Var.p(i16, i12, e1Var2)) {
                        b10 = m1.b(i16 << 3);
                        i19 = 8;
                        h = b10 + i19;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 57:
                    if (n2Var.p(i16, i12, e1Var2)) {
                        b10 = m1.b(i16 << 3);
                        i19 = 4;
                        h = b10 + i19;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 58:
                    if (n2Var.p(i16, i12, e1Var2)) {
                        b10 = m1.b(i16 << 3);
                        h = b10 + i19;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 59:
                    if (n2Var.p(i16, i12, e1Var2)) {
                        int i30 = i16 << 3;
                        Object object3 = unsafe.getObject(e1Var2, j10);
                        if (object3 instanceof l1) {
                            b11 = m1.b(i30);
                            o11 = ((l1) object3).o();
                            b22 = m1.b(o11);
                            c3 = o11 + b22;
                            h = b11 + c3;
                            b18 = h;
                            i15 += b18;
                            i12 += 3;
                            n2Var = this;
                            e1Var2 = e1Var;
                        } else {
                            b11 = m1.b(i30);
                            c3 = m1.a((String) object3);
                            h = b11 + c3;
                            b18 = h;
                            i15 += b18;
                            i12 += 3;
                            n2Var = this;
                            e1Var2 = e1Var;
                        }
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 60:
                    if (n2Var.p(i16, i12, e1Var2)) {
                        Object object4 = unsafe.getObject(e1Var2, j10);
                        t2 y14 = n2Var.y(i12);
                        t1 t1Var21 = u2.a;
                        b14 = m1.b(i16 << 3);
                        b15 = ((e1) object4).b(y14);
                        b16 = m1.b(b15);
                        h = b16 + b15 + b14;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 61:
                    if (n2Var.p(i16, i12, e1Var2)) {
                        l1 l1Var2 = (l1) unsafe.getObject(e1Var2, j10);
                        b11 = m1.b(i16 << 3);
                        o11 = l1Var2.o();
                        b22 = m1.b(o11);
                        c3 = o11 + b22;
                        h = b11 + c3;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 62:
                    if (n2Var.p(i16, i12, e1Var2)) {
                        int s9 = s(e1Var2, j10);
                        b11 = m1.b(i16 << 3);
                        c3 = m1.b(s9);
                        h = b11 + c3;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 63:
                    if (n2Var.p(i16, i12, e1Var2)) {
                        long s10 = s(e1Var2, j10);
                        b11 = m1.b(i16 << 3);
                        c3 = m1.c(s10);
                        h = b11 + c3;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 64:
                    if (n2Var.p(i16, i12, e1Var2)) {
                        b10 = m1.b(i16 << 3);
                        i19 = 4;
                        h = b10 + i19;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (n2Var.p(i16, i12, e1Var2)) {
                        b10 = m1.b(i16 << 3);
                        i19 = 8;
                        h = b10 + i19;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 66:
                    if (n2Var.p(i16, i12, e1Var2)) {
                        int s11 = s(e1Var2, j10);
                        b11 = m1.b(i16 << 3);
                        c3 = m1.b((s11 >> 31) ^ (s11 + s11));
                        h = b11 + c3;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 67:
                    if (n2Var.p(i16, i12, e1Var2)) {
                        long w12 = w(e1Var2, j10);
                        b11 = m1.b(i16 << 3);
                        c3 = m1.c((w12 >> 63) ^ (w12 + w12));
                        h = b11 + c3;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                case 68:
                    if (n2Var.p(i16, i12, e1Var2)) {
                        e1 e1Var5 = (e1) unsafe.getObject(e1Var2, j10);
                        t2 y15 = n2Var.y(i12);
                        int b27 = m1.b(i16 << 3);
                        i11 = b27 + b27;
                        b17 = e1Var5.b(y15);
                        h = b17 + i11;
                        b18 = h;
                        i15 += b18;
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    } else {
                        i12 += 3;
                        n2Var = this;
                        e1Var2 = e1Var;
                    }
                default:
                    i12 += 3;
                    n2Var = this;
                    e1Var2 = e1Var;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final void e(Object obj, byte[] bArr, int i10, int i11, h1 h1Var) {
        q(obj, bArr, i10, i11, 0, h1Var);
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final boolean f(v1 v1Var, v1 v1Var2) {
        boolean e;
        int i10 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i10 < iArr.length) {
                int v = v(i10);
                long j10 = v & 1048575;
                switch (u(v)) {
                    case 0:
                        if (!l(v1Var, v1Var2, i10)) {
                            break;
                        } else {
                            b3 b3Var = c3.c;
                            if (Double.doubleToLongBits(b3Var.a(v1Var, j10)) != Double.doubleToLongBits(b3Var.a(v1Var2, j10))) {
                                break;
                            } else {
                                continue;
                                i10 += 3;
                            }
                        }
                    case 1:
                        if (!l(v1Var, v1Var2, i10)) {
                            break;
                        } else {
                            b3 b3Var2 = c3.c;
                            if (Float.floatToIntBits(b3Var2.b(v1Var, j10)) != Float.floatToIntBits(b3Var2.b(v1Var2, j10))) {
                                break;
                            } else {
                                continue;
                                i10 += 3;
                            }
                        }
                    case 2:
                        if (l(v1Var, v1Var2, i10) && c3.f(v1Var, j10) == c3.f(v1Var2, j10)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 3:
                        if (l(v1Var, v1Var2, i10) && c3.f(v1Var, j10) == c3.f(v1Var2, j10)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 4:
                        if (l(v1Var, v1Var2, i10) && c3.e(v1Var, j10) == c3.e(v1Var2, j10)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 5:
                        if (l(v1Var, v1Var2, i10) && c3.f(v1Var, j10) == c3.f(v1Var2, j10)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 6:
                        if (l(v1Var, v1Var2, i10) && c3.e(v1Var, j10) == c3.e(v1Var2, j10)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 7:
                        if (!l(v1Var, v1Var2, i10)) {
                            break;
                        } else {
                            b3 b3Var3 = c3.c;
                            if (b3Var3.g(v1Var, j10) != b3Var3.g(v1Var2, j10)) {
                                break;
                            } else {
                                continue;
                                i10 += 3;
                            }
                        }
                    case 8:
                        if (l(v1Var, v1Var2, i10) && u2.e(c3.h(v1Var, j10), c3.h(v1Var2, j10))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 9:
                        if (l(v1Var, v1Var2, i10) && u2.e(c3.h(v1Var, j10), c3.h(v1Var2, j10))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 10:
                        if (l(v1Var, v1Var2, i10) && u2.e(c3.h(v1Var, j10), c3.h(v1Var2, j10))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 11:
                        if (l(v1Var, v1Var2, i10) && c3.e(v1Var, j10) == c3.e(v1Var2, j10)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 12:
                        if (l(v1Var, v1Var2, i10) && c3.e(v1Var, j10) == c3.e(v1Var2, j10)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 13:
                        if (l(v1Var, v1Var2, i10) && c3.e(v1Var, j10) == c3.e(v1Var2, j10)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 14:
                        if (l(v1Var, v1Var2, i10) && c3.f(v1Var, j10) == c3.f(v1Var2, j10)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 15:
                        if (l(v1Var, v1Var2, i10) && c3.e(v1Var, j10) == c3.e(v1Var2, j10)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 16:
                        if (l(v1Var, v1Var2, i10) && c3.f(v1Var, j10) == c3.f(v1Var2, j10)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 17:
                        if (l(v1Var, v1Var2, i10) && u2.e(c3.h(v1Var, j10), c3.h(v1Var2, j10))) {
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
                        e = u2.e(c3.h(v1Var, j10), c3.h(v1Var2, j10));
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        e = u2.e(c3.h(v1Var, j10), c3.h(v1Var2, j10));
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
                        long j11 = iArr[i10 + 2] & 1048575;
                        if (c3.e(v1Var, j11) == c3.e(v1Var2, j11) && u2.e(c3.h(v1Var, j10), c3.h(v1Var2, j10))) {
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
            } else if (v1Var.zzc.equals(v1Var2.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final void g(int i10, Object obj, Object obj2) {
        if (m(i10, obj2)) {
            int v = v(i10) & 1048575;
            Unsafe unsafe = k;
            long j10 = v;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i10] + " is present but null: " + obj2.toString());
            }
            t2 y10 = y(i10);
            if (!m(i10, obj)) {
                if (o(object)) {
                    v1 zze = y10.zze();
                    y10.zzg(zze, object);
                    unsafe.putObject(obj, j10, zze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                i(i10, obj);
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

    public final void h(int i10, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i11 = iArr[i10];
        if (p(i11, i10, obj2)) {
            int v = v(i10) & 1048575;
            Unsafe unsafe = k;
            long j10 = v;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2.toString());
            }
            t2 y10 = y(i10);
            if (!p(i11, i10, obj)) {
                if (o(object)) {
                    v1 zze = y10.zze();
                    y10.zzg(zze, object);
                    unsafe.putObject(obj, j10, zze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                c3.j(obj, iArr[i10 + 2] & 1048575, i11);
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

    public final void i(int i10, Object obj) {
        int i11 = this.a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        c3.j(obj, j10, (1 << (i11 >>> 20)) | c3.e(obj, j10));
    }

    public final void j(int i10, Object obj, Object obj2) {
        k.putObject(obj, v(i10) & 1048575, obj2);
        i(i10, obj);
    }

    public final void k(int i10, Object obj, Object obj2, int i11) {
        k.putObject(obj, v(i11) & 1048575, obj2);
        c3.j(obj, this.a[i11 + 2] & 1048575, i10);
    }

    public final boolean l(v1 v1Var, v1 v1Var2, int i10) {
        return m(i10, v1Var) == m(i10, v1Var2);
    }

    public final boolean m(int i10, Object obj) {
        int i11 = this.a[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 == 1048575) {
            int v = v(i10);
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
        } else if (((1 << (i11 >>> 20)) & c3.e(obj, j10)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean n(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? m(i10, obj) : (i12 & i13) != 0;
    }

    public final boolean p(int i10, int i11, Object obj) {
        return c3.e(obj, (long) (this.a[i11 + 2] & 1048575)) == i10;
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

    public final int t(int i10, int i11) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = iArr[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    public final int v(int i10) {
        return this.a[i10 + 1];
    }

    public final x1 x(int i10) {
        int i11 = i10 / 3;
        return (x1) this.b[i11 + i11 + 1];
    }

    public final t2 y(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        Object[] objArr = this.b;
        t2 t2Var = (t2) objArr[i12];
        if (t2Var != null) {
            return t2Var;
        }
        t2 a2 = q2.c.a((Class) objArr[i12 + 1]);
        objArr[i12] = a2;
        return a2;
    }

    public final Object z(int i10, Object obj) {
        t2 y10 = y(i10);
        int v = v(i10) & 1048575;
        if (!m(i10, obj)) {
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
        int i10 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i10 >= iArr.length) {
                this.i.getClass();
                x2 x2Var = ((v1) obj).zzc;
                if (x2Var.e) {
                    x2Var.e = false;
                    return;
                }
                return;
            }
            int v = v(i10);
            int i11 = 1048575 & v;
            int u10 = u(v);
            long j10 = i11;
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
                } else if (p(iArr[i10], i10, obj)) {
                    y(i10).zzf(k.getObject(obj, j10));
                }
                i10 += 3;
            }
            if (m(i10, obj)) {
                y(i10).zzf(k.getObject(obj, j10));
            }
            i10 += 3;
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
        int i10 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i10 >= iArr.length) {
                u2.p(obj, obj2);
                return;
            }
            int v = v(i10);
            int i11 = v & 1048575;
            int u10 = u(v);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (u10) {
                case 0:
                    if (m(i10, obj2)) {
                        b3 b3Var = c3.c;
                        obj3 = obj;
                        b3Var.e(obj3, j10, b3Var.a(obj2, j10));
                        i(i10, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (m(i10, obj2)) {
                        b3 b3Var2 = c3.c;
                        b3Var2.f(obj, j10, b3Var2.b(obj2, j10));
                        i(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (m(i10, obj2)) {
                        c3.k(obj, j10, c3.f(obj2, j10));
                        i(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (m(i10, obj2)) {
                        c3.k(obj, j10, c3.f(obj2, j10));
                        i(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (m(i10, obj2)) {
                        c3.j(obj, j10, c3.e(obj2, j10));
                        i(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (m(i10, obj2)) {
                        c3.k(obj, j10, c3.f(obj2, j10));
                        i(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (m(i10, obj2)) {
                        c3.j(obj, j10, c3.e(obj2, j10));
                        i(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (m(i10, obj2)) {
                        b3 b3Var3 = c3.c;
                        b3Var3.c(obj, j10, b3Var3.g(obj2, j10));
                        i(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m(i10, obj2)) {
                        c3.l(obj, j10, c3.h(obj2, j10));
                        i(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    g(i10, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (m(i10, obj2)) {
                        c3.l(obj, j10, c3.h(obj2, j10));
                        i(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (m(i10, obj2)) {
                        c3.j(obj, j10, c3.e(obj2, j10));
                        i(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (m(i10, obj2)) {
                        c3.j(obj, j10, c3.e(obj2, j10));
                        i(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (m(i10, obj2)) {
                        c3.j(obj, j10, c3.e(obj2, j10));
                        i(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m(i10, obj2)) {
                        c3.k(obj, j10, c3.f(obj2, j10));
                        i(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m(i10, obj2)) {
                        c3.j(obj, j10, c3.e(obj2, j10));
                        i(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m(i10, obj2)) {
                        c3.k(obj, j10, c3.f(obj2, j10));
                        i(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    g(i10, obj, obj2);
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
                    if (p(i12, i10, obj2)) {
                        c3.l(obj, j10, c3.h(obj2, j10));
                        c3.j(obj, iArr[i10 + 2] & 1048575, i12);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    h(i10, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                case 66:
                case 67:
                    if (p(i12, i10, obj2)) {
                        c3.l(obj, j10, c3.h(obj2, j10));
                        c3.j(obj, iArr[i10 + 2] & 1048575, i12);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    h(i10, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i10 += 3;
            obj = obj3;
        }
    }
}
