package com.google.android.gms.internal.cast;

import androidx.car.app.navigation.model.Maneuver;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import org.telegram.messenger.CharacterCompat;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class z5 implements h6 {
    public static final int[] h = new int[0];
    public static final Unsafe i = s6.i();
    public final int[] a;
    public final Object[] b;
    public final t4 c;
    public final int[] d;
    public final int e;
    public final r5 f;
    public final k6 g;

    public z5(int[] iArr, Object[] objArr, t4 t4Var, int[] iArr2, int i10, r5 r5Var, k6 k6Var, a5 a5Var) {
        this.a = iArr;
        this.b = objArr;
        this.d = iArr2;
        this.e = i10;
        this.f = r5Var;
        this.g = k6Var;
        this.c = t4Var;
    }

    public static boolean h(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof f5) {
            return ((f5) obj).g();
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
    public static z5 j(g6 g6Var, r5 r5Var, k6 k6Var, a5 a5Var) {
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
        Field p10;
        Object obj2;
        Field p11;
        int i39;
        char charAt10;
        int i40;
        int i41;
        char charAt11;
        int i42;
        char charAt12;
        int i43;
        char charAt13;
        if (!(g6Var instanceof g6)) {
            g6Var.getClass();
            throw new ClassCastException();
        }
        String str2 = g6Var.b;
        int length = str2.length();
        char charAt14 = str2.charAt(0);
        char c11 = CharacterCompat.MIN_HIGH_SURROGATE;
        if (charAt14 >= 55296) {
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
        int charAt15 = str2.charAt(i10);
        if (charAt15 >= 55296) {
            int i46 = charAt15 & 8191;
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
            charAt15 = i46 | (charAt13 << i47);
            i45 = i43;
        }
        if (charAt15 == 0) {
            charAt = 0;
            charAt2 = 0;
            i11 = 0;
            i13 = 0;
            iArr = h;
            i12 = 0;
        } else {
            int i48 = i45 + 1;
            int charAt16 = str2.charAt(i45);
            if (charAt16 >= 55296) {
                int i49 = charAt16 & 8191;
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
                charAt16 = i49 | (charAt8 << i50);
                i48 = i21;
            }
            int i51 = i48 + 1;
            int charAt17 = str2.charAt(i48);
            if (charAt17 >= 55296) {
                int i52 = charAt17 & 8191;
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
                charAt17 = i52 | (charAt7 << i53);
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
            int charAt18 = str2.charAt(i59);
            if (charAt18 >= 55296) {
                int i63 = charAt18 & 8191;
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
                charAt18 = i63 | (charAt4 << i64);
                i62 = i15;
            }
            int i65 = i62 + 1;
            int charAt19 = str2.charAt(i62);
            if (charAt19 >= 55296) {
                int i66 = charAt19 & 8191;
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
                charAt19 = i66 | (charAt3 << i67);
                i65 = i14;
            }
            int i68 = charAt19 + charAt2 + charAt18;
            i11 = charAt16 + charAt16 + charAt17;
            i12 = charAt16;
            i45 = i65;
            iArr = new int[i68];
            i13 = charAt19;
        }
        Unsafe unsafe = i;
        Object[] objArr2 = g6Var.c;
        Class<?> cls = g6Var.a.getClass();
        int i69 = charAt2 + i13;
        int i70 = charAt + charAt;
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr3 = new Object[i70];
        int i71 = i13;
        int i72 = 0;
        int i73 = 0;
        while (i45 < length) {
            int i74 = i45 + 1;
            int charAt20 = str2.charAt(i45);
            if (charAt20 >= c11) {
                int i75 = charAt20 & 8191;
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
                charAt20 = i75 | (charAt12 << i77);
                i22 = i42;
            } else {
                i22 = i74;
            }
            int i78 = i22 + 1;
            int charAt21 = str2.charAt(i22);
            if (charAt21 >= c11) {
                int i79 = charAt21 & 8191;
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
                charAt21 = i79 | (charAt11 << i81);
                i24 = i41;
            } else {
                i23 = length;
                i24 = i78;
            }
            if ((charAt21 & 1024) != 0) {
                iArr[i72] = i73;
                i72++;
            }
            int i82 = charAt21 & 255;
            int i83 = charAt20;
            int i84 = charAt21 & 2048;
            if (i82 >= 51) {
                int i85 = i24 + 1;
                int charAt22 = str2.charAt(i24);
                if (charAt22 >= 55296) {
                    int i86 = charAt22 & 8191;
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
                    charAt22 = i40 | (charAt10 << i88);
                    i36 = i39;
                } else {
                    i36 = i85;
                }
                int i89 = charAt22;
                int i90 = i82 - 51;
                int i91 = i36;
                if (i90 == 9 || i90 == 17) {
                    i37 = i11 + 1;
                    int i92 = i73 / 3;
                    objArr3[i92 + i92 + 1] = objArr2[i11];
                } else {
                    if (i90 == 12) {
                        if (g6Var.a() == 1 || i84 != 0) {
                            i37 = i11 + 1;
                            int i93 = i73 / 3;
                            objArr3[i93 + i93 + 1] = objArr2[i11];
                        } else {
                            i38 = 0;
                            int i94 = i89 + i89;
                            obj = objArr2[i94];
                            int i95 = i38;
                            if (obj instanceof Field) {
                                p10 = (Field) obj;
                            } else {
                                p10 = p(cls, (String) obj);
                                objArr2[i94] = p10;
                            }
                            int i96 = i12;
                            objArr = objArr3;
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(p10);
                            int i97 = i94 + 1;
                            obj2 = objArr2[i97];
                            if (obj2 instanceof Field) {
                                p11 = (Field) obj2;
                            } else {
                                p11 = p(cls, (String) obj2);
                                objArr2[i97] = p11;
                            }
                            int objectFieldOffset3 = (int) unsafe.objectFieldOffset(p11);
                            i25 = i96;
                            i27 = i95;
                            str = str2;
                            i26 = i11;
                            i31 = 0;
                            c10 = CharacterCompat.MIN_HIGH_SURROGATE;
                            i28 = objectFieldOffset3;
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
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(p10);
                    int i972 = i942 + 1;
                    obj2 = objArr2[i972];
                    if (obj2 instanceof Field) {
                    }
                    int objectFieldOffset32 = (int) unsafe.objectFieldOffset(p11);
                    i25 = i962;
                    i27 = i952;
                    str = str2;
                    i26 = i11;
                    i31 = 0;
                    c10 = CharacterCompat.MIN_HIGH_SURROGATE;
                    i28 = objectFieldOffset32;
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
                int objectFieldOffset222 = (int) unsafe.objectFieldOffset(p10);
                int i9722 = i9422 + 1;
                obj2 = objArr2[i9722];
                if (obj2 instanceof Field) {
                }
                int objectFieldOffset322 = (int) unsafe.objectFieldOffset(p11);
                i25 = i9622;
                i27 = i9522;
                str = str2;
                i26 = i11;
                i31 = 0;
                c10 = CharacterCompat.MIN_HIGH_SURROGATE;
                i28 = objectFieldOffset322;
                i32 = objectFieldOffset222;
                i29 = i91;
            } else {
                int i98 = i12;
                objArr = objArr3;
                int i99 = i11 + 1;
                Field p12 = p(cls, (String) objArr2[i11]);
                i25 = i98;
                if (i82 == 9 || i82 == 17) {
                    i26 = i99;
                    int i100 = i73 / 3;
                    objArr[i100 + i100 + 1] = p12.getType();
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
                            if (g6Var.a() == 1 || i84 != 0) {
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
                                objectFieldOffset = (int) unsafe.objectFieldOffset(p12);
                                i28 = 1048575;
                                if ((charAt21 & 4096) != 0 || i82 > 17) {
                                    str = str2;
                                    c10 = CharacterCompat.MIN_HIGH_SURROGATE;
                                    i29 = i24;
                                    i30 = 0;
                                } else {
                                    int i106 = i24 + 1;
                                    int charAt23 = str2.charAt(i24);
                                    if (charAt23 >= 55296) {
                                        int i107 = charAt23 & 8191;
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
                                        charAt23 = i107 | (charAt9 << i108);
                                    } else {
                                        i29 = i106;
                                    }
                                    int i109 = (charAt23 / 32) + i25 + i25;
                                    Object obj3 = objArr2[i109];
                                    if (obj3 instanceof Field) {
                                        p5 = (Field) obj3;
                                    } else {
                                        p5 = p(cls, (String) obj3);
                                        objArr2[i109] = p5;
                                    }
                                    str = str2;
                                    i30 = charAt23 % 32;
                                    i28 = (int) unsafe.objectFieldOffset(p5);
                                    c10 = CharacterCompat.MIN_HIGH_SURROGATE;
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
                        objectFieldOffset = (int) unsafe.objectFieldOffset(p12);
                        i28 = 1048575;
                        if ((charAt21 & 4096) != 0) {
                        }
                        str = str2;
                        c10 = CharacterCompat.MIN_HIGH_SURROGATE;
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(p12);
                i28 = 1048575;
                if ((charAt21 & 4096) != 0) {
                }
                str = str2;
                c10 = CharacterCompat.MIN_HIGH_SURROGATE;
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
            iArr2[i111] = ((charAt21 & 512) != 0 ? TLObject.FLAG_29 : 0) | ((charAt21 & 256) != 0 ? TLObject.FLAG_28 : 0) | (i27 != 0 ? TLObject.FLAG_31 : 0) | (i82 << 20) | i32;
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
        return new z5(iArr2, objArr3, g6Var.a, iArr, i13, r5Var, k6Var, a5Var);
    }

    public static int k(Object obj, long j3) {
        return ((Integer) s6.h(obj, j3)).intValue();
    }

    public static int l(int i10) {
        return (i10 >>> 20) & 255;
    }

    public static long n(Object obj, long j3) {
        return ((Long) s6.h(obj, j3)).longValue();
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
            StringBuilder x10 = a1.g.x("Field ", str, " for ", name, " not found. Known fields are ");
            x10.append(arrays);
            throw new RuntimeException(x10.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        continue;
     */
    @Override // com.google.android.gms.internal.cast.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        if (!h(obj)) {
            return;
        }
        if (obj instanceof f5) {
            f5 f5Var = (f5) obj;
            f5Var.f();
            f5Var.zza = 0;
            f5Var.d();
        }
        int i10 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i10 >= iArr.length) {
                this.g.getClass();
                j6 j6Var = ((f5) obj).zzc;
                if (j6Var.d) {
                    j6Var.d = false;
                    return;
                }
                return;
            }
            int m10 = m(i10);
            int i11 = 1048575 & m10;
            int l4 = l(m10);
            long j3 = i11;
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
                            this.f.a(obj, j3);
                            break;
                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                            if (i.getObject(obj, j3) != null) {
                                throw new ClassCastException();
                            }
                            break;
                    }
                } else if (i(iArr[i10], i10, obj)) {
                    o(i10).a(i.getObject(obj, j3));
                }
                i10 += 3;
            }
            if (u(i10, obj)) {
                o(i10).a(i.getObject(obj, j3));
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
    @Override // com.google.android.gms.internal.cast.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(f5 f5Var) {
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
                f5Var.zzc.getClass();
                return (i15 * 53) + 506991;
            }
            int m10 = m(i14);
            int i16 = 1048575 & m10;
            int l4 = l(m10);
            int i17 = iArr[i14];
            long j3 = i16;
            int i18 = 1237;
            int i19 = 37;
            switch (l4) {
                case 0:
                    i10 = i15 * 53;
                    doubleToLongBits = Double.doubleToLongBits(s6.c.a(f5Var, j3));
                    Charset charset = l5.a;
                    i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i11 = i15 * 53;
                    floatToIntBits = Float.floatToIntBits(s6.c.b(f5Var, j3));
                    i15 = floatToIntBits + i11;
                    break;
                case 2:
                    i10 = i15 * 53;
                    doubleToLongBits = s6.f(f5Var, j3);
                    Charset charset2 = l5.a;
                    i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i10 = i15 * 53;
                    doubleToLongBits = s6.f(f5Var, j3);
                    Charset charset3 = l5.a;
                    i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i11 = i15 * 53;
                    floatToIntBits = s6.e(f5Var, j3);
                    i15 = floatToIntBits + i11;
                    break;
                case 5:
                    i10 = i15 * 53;
                    doubleToLongBits = s6.f(f5Var, j3);
                    Charset charset4 = l5.a;
                    i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i11 = i15 * 53;
                    floatToIntBits = s6.e(f5Var, j3);
                    i15 = floatToIntBits + i11;
                    break;
                case 7:
                    i12 = i15 * 53;
                    boolean g10 = s6.c.g(f5Var, j3);
                    Charset charset5 = l5.a;
                    break;
                case 8:
                    i11 = i15 * 53;
                    floatToIntBits = ((String) s6.h(f5Var, j3)).hashCode();
                    i15 = floatToIntBits + i11;
                    break;
                case 9:
                    i13 = i15 * 53;
                    Object h10 = s6.h(f5Var, j3);
                    if (h10 != null) {
                        i19 = h10.hashCode();
                    }
                    i15 = i13 + i19;
                    break;
                case 10:
                    i11 = i15 * 53;
                    floatToIntBits = s6.h(f5Var, j3).hashCode();
                    i15 = floatToIntBits + i11;
                    break;
                case 11:
                    i11 = i15 * 53;
                    floatToIntBits = s6.e(f5Var, j3);
                    i15 = floatToIntBits + i11;
                    break;
                case 12:
                    i11 = i15 * 53;
                    floatToIntBits = s6.e(f5Var, j3);
                    i15 = floatToIntBits + i11;
                    break;
                case 13:
                    i11 = i15 * 53;
                    floatToIntBits = s6.e(f5Var, j3);
                    i15 = floatToIntBits + i11;
                    break;
                case 14:
                    i10 = i15 * 53;
                    doubleToLongBits = s6.f(f5Var, j3);
                    Charset charset6 = l5.a;
                    i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i11 = i15 * 53;
                    floatToIntBits = s6.e(f5Var, j3);
                    i15 = floatToIntBits + i11;
                    break;
                case 16:
                    i10 = i15 * 53;
                    doubleToLongBits = s6.f(f5Var, j3);
                    Charset charset7 = l5.a;
                    i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i13 = i15 * 53;
                    Object h11 = s6.h(f5Var, j3);
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
                    i11 = i15 * 53;
                    floatToIntBits = s6.h(f5Var, j3).hashCode();
                    i15 = floatToIntBits + i11;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    i11 = i15 * 53;
                    floatToIntBits = s6.h(f5Var, j3).hashCode();
                    i15 = floatToIntBits + i11;
                    break;
                case 51:
                    if (!i(i17, i14, f5Var)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) s6.h(f5Var, j3)).doubleValue());
                        Charset charset8 = l5.a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!i(i17, i14, f5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) s6.h(f5Var, j3)).floatValue());
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 53:
                    if (!i(i17, i14, f5Var)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = n(f5Var, j3);
                        Charset charset9 = l5.a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!i(i17, i14, f5Var)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = n(f5Var, j3);
                        Charset charset10 = l5.a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 55:
                    if (!i(i17, i14, f5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = k(f5Var, j3);
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 56:
                    if (!i(i17, i14, f5Var)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = n(f5Var, j3);
                        Charset charset11 = l5.a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 57:
                    if (!i(i17, i14, f5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = k(f5Var, j3);
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 58:
                    if (!i(i17, i14, f5Var)) {
                        break;
                    } else {
                        i12 = i15 * 53;
                        boolean booleanValue = ((Boolean) s6.h(f5Var, j3)).booleanValue();
                        Charset charset12 = l5.a;
                        break;
                    }
                case 59:
                    if (!i(i17, i14, f5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = ((String) s6.h(f5Var, j3)).hashCode();
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 60:
                    if (!i(i17, i14, f5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = s6.h(f5Var, j3).hashCode();
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 61:
                    if (!i(i17, i14, f5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = s6.h(f5Var, j3).hashCode();
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 62:
                    if (!i(i17, i14, f5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = k(f5Var, j3);
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 63:
                    if (!i(i17, i14, f5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = k(f5Var, j3);
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 64:
                    if (!i(i17, i14, f5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = k(f5Var, j3);
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (!i(i17, i14, f5Var)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = n(f5Var, j3);
                        Charset charset13 = l5.a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!i(i17, i14, f5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = k(f5Var, j3);
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 67:
                    if (!i(i17, i14, f5Var)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = n(f5Var, j3);
                        Charset charset14 = l5.a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
                    if (!i(i17, i14, f5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = s6.h(f5Var, j3).hashCode();
                        i15 = floatToIntBits + i11;
                        break;
                    }
            }
            i14 += 3;
        }
    }

    @Override // com.google.android.gms.internal.cast.h6
    public final boolean c(f5 f5Var, f5 f5Var2) {
        boolean e7;
        int i10 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i10 < iArr.length) {
                int m10 = m(i10);
                long j3 = m10 & 1048575;
                switch (l(m10)) {
                    case 0:
                        if (!t(f5Var, f5Var2, i10)) {
                            break;
                        } else {
                            r6 r6Var = s6.c;
                            if (Double.doubleToLongBits(r6Var.a(f5Var, j3)) != Double.doubleToLongBits(r6Var.a(f5Var2, j3))) {
                                break;
                            } else {
                                continue;
                                i10 += 3;
                            }
                        }
                    case 1:
                        if (!t(f5Var, f5Var2, i10)) {
                            break;
                        } else {
                            r6 r6Var2 = s6.c;
                            if (Float.floatToIntBits(r6Var2.b(f5Var, j3)) != Float.floatToIntBits(r6Var2.b(f5Var2, j3))) {
                                break;
                            } else {
                                continue;
                                i10 += 3;
                            }
                        }
                    case 2:
                        if (t(f5Var, f5Var2, i10) && s6.f(f5Var, j3) == s6.f(f5Var2, j3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 3:
                        if (t(f5Var, f5Var2, i10) && s6.f(f5Var, j3) == s6.f(f5Var2, j3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 4:
                        if (t(f5Var, f5Var2, i10) && s6.e(f5Var, j3) == s6.e(f5Var2, j3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 5:
                        if (t(f5Var, f5Var2, i10) && s6.f(f5Var, j3) == s6.f(f5Var2, j3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 6:
                        if (t(f5Var, f5Var2, i10) && s6.e(f5Var, j3) == s6.e(f5Var2, j3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 7:
                        if (!t(f5Var, f5Var2, i10)) {
                            break;
                        } else {
                            r6 r6Var3 = s6.c;
                            if (r6Var3.g(f5Var, j3) != r6Var3.g(f5Var2, j3)) {
                                break;
                            } else {
                                continue;
                                i10 += 3;
                            }
                        }
                    case 8:
                        if (t(f5Var, f5Var2, i10) && i6.e(s6.h(f5Var, j3), s6.h(f5Var2, j3))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 9:
                        if (t(f5Var, f5Var2, i10) && i6.e(s6.h(f5Var, j3), s6.h(f5Var2, j3))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 10:
                        if (t(f5Var, f5Var2, i10) && i6.e(s6.h(f5Var, j3), s6.h(f5Var2, j3))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 11:
                        if (t(f5Var, f5Var2, i10) && s6.e(f5Var, j3) == s6.e(f5Var2, j3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 12:
                        if (t(f5Var, f5Var2, i10) && s6.e(f5Var, j3) == s6.e(f5Var2, j3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 13:
                        if (t(f5Var, f5Var2, i10) && s6.e(f5Var, j3) == s6.e(f5Var2, j3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 14:
                        if (t(f5Var, f5Var2, i10) && s6.f(f5Var, j3) == s6.f(f5Var2, j3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 15:
                        if (t(f5Var, f5Var2, i10) && s6.e(f5Var, j3) == s6.e(f5Var2, j3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 16:
                        if (t(f5Var, f5Var2, i10) && s6.f(f5Var, j3) == s6.f(f5Var2, j3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 17:
                        if (t(f5Var, f5Var2, i10) && i6.e(s6.h(f5Var, j3), s6.h(f5Var2, j3))) {
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
                        e7 = i6.e(s6.h(f5Var, j3), s6.h(f5Var2, j3));
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        e7 = i6.e(s6.h(f5Var, j3), s6.h(f5Var2, j3));
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
                        long j10 = iArr[i10 + 2] & 1048575;
                        if (s6.e(f5Var, j10) == s6.e(f5Var2, j10) && i6.e(s6.h(f5Var, j3), s6.h(f5Var2, j3))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    default:
                        i10 += 3;
                }
                if (e7) {
                    i10 += 3;
                }
            } else {
                this.g.getClass();
                if (f5Var.zzc.equals(f5Var2.zzc)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.cast.h6
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
                i6.o(this.g, obj, obj2);
                return;
            }
            int m10 = m(i10);
            int i11 = m10 & 1048575;
            int l4 = l(m10);
            int i12 = iArr[i10];
            long j3 = i11;
            switch (l4) {
                case 0:
                    if (u(i10, obj2)) {
                        r6 r6Var = s6.c;
                        obj3 = obj;
                        r6Var.e(obj3, j3, r6Var.a(obj2, j3));
                        s(i10, obj3);
                        i10 += 3;
                        obj = obj3;
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 1:
                    if (u(i10, obj2)) {
                        r6 r6Var2 = s6.c;
                        r6Var2.f(obj, j3, r6Var2.b(obj2, j3));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 2:
                    if (u(i10, obj2)) {
                        s6.k(obj, j3, s6.f(obj2, j3));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 3:
                    if (u(i10, obj2)) {
                        s6.k(obj, j3, s6.f(obj2, j3));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 4:
                    if (u(i10, obj2)) {
                        s6.j(obj, j3, s6.e(obj2, j3));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 5:
                    if (u(i10, obj2)) {
                        s6.k(obj, j3, s6.f(obj2, j3));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 6:
                    if (u(i10, obj2)) {
                        s6.j(obj, j3, s6.e(obj2, j3));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 7:
                    if (u(i10, obj2)) {
                        r6 r6Var3 = s6.c;
                        r6Var3.c(obj, j3, r6Var3.g(obj2, j3));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 8:
                    if (u(i10, obj2)) {
                        s6.l(obj, j3, s6.h(obj2, j3));
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
                        s6.l(obj, j3, s6.h(obj2, j3));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 11:
                    if (u(i10, obj2)) {
                        s6.j(obj, j3, s6.e(obj2, j3));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 12:
                    if (u(i10, obj2)) {
                        s6.j(obj, j3, s6.e(obj2, j3));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 13:
                    if (u(i10, obj2)) {
                        s6.j(obj, j3, s6.e(obj2, j3));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 14:
                    if (u(i10, obj2)) {
                        s6.k(obj, j3, s6.f(obj2, j3));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 15:
                    if (u(i10, obj2)) {
                        s6.j(obj, j3, s6.e(obj2, j3));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 16:
                    if (u(i10, obj2)) {
                        s6.k(obj, j3, s6.f(obj2, j3));
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
                    this.f.b(obj, j3, obj2);
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Class cls = i6.a;
                    Object h10 = s6.h(obj, j3);
                    Object h11 = s6.h(obj2, j3);
                    if (h10 != null) {
                        throw new ClassCastException();
                    }
                    throw a1.g.j(h11);
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (i(i12, i10, obj2)) {
                        s6.l(obj, j3, s6.h(obj2, j3));
                        s6.j(obj, iArr[i10 + 2] & 1048575, i12);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 60:
                    r(i10, obj, obj2);
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 61:
                case 62:
                case 63:
                case 64:
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                case 66:
                case 67:
                    if (i(i12, i10, obj2)) {
                        s6.l(obj, j3, s6.h(obj2, j3));
                        s6.j(obj, iArr[i10 + 2] & 1048575, i12);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 68:
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

    @Override // com.google.android.gms.internal.cast.h6
    public final void e(Object obj, u5 u5Var) {
        int i10;
        z5 z5Var = this;
        Unsafe unsafe = i;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (true) {
            int[] iArr = z5Var.a;
            if (i12 >= iArr.length) {
                z5Var.g.getClass();
                j6 j6Var = ((f5) obj).zzc;
                return;
            }
            int m10 = z5Var.m(i12);
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
            long j3 = m10 & i11;
            switch (l4) {
                case 0:
                    if (z5Var.v(obj, i12, i14, i13, i10)) {
                        ((y4) u5Var.a).f(i15, Double.doubleToRawLongBits(s6.c.a(obj, j3)));
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 1:
                    if (z5Var.v(obj, i12, i14, i13, i10)) {
                        ((y4) u5Var.a).d(i15, Float.floatToRawIntBits(s6.c.b(obj, j3)));
                        break;
                    }
                    break;
                case 2:
                    if (z5Var.v(obj, i12, i14, i13, i10)) {
                        ((y4) u5Var.a).k(i15, unsafe.getLong(obj, j3));
                        break;
                    }
                    break;
                case 3:
                    if (z5Var.v(obj, i12, i14, i13, i10)) {
                        ((y4) u5Var.a).k(i15, unsafe.getLong(obj, j3));
                        break;
                    }
                    break;
                case 4:
                    if (z5Var.v(obj, i12, i14, i13, i10)) {
                        int i18 = unsafe.getInt(obj, j3);
                        y4 y4Var = (y4) u5Var.a;
                        y4Var.j(i15 << 3);
                        if (i18 >= 0) {
                            y4Var.j(i18);
                            break;
                        } else {
                            y4Var.l(i18);
                            break;
                        }
                    }
                    break;
                case 5:
                    if (z5Var.v(obj, i12, i14, i13, i10)) {
                        ((y4) u5Var.a).f(i15, unsafe.getLong(obj, j3));
                        break;
                    }
                    break;
                case 6:
                    if (z5Var.v(obj, i12, i14, i13, i10)) {
                        ((y4) u5Var.a).d(i15, unsafe.getInt(obj, j3));
                        break;
                    }
                    break;
                case 7:
                    if (z5Var.v(obj, i12, i14, i13, i10)) {
                        boolean g10 = s6.c.g(obj, j3);
                        y4 y4Var2 = (y4) u5Var.a;
                        y4Var2.j(i15 << 3);
                        y4Var2.a(g10 ? (byte) 1 : (byte) 0);
                        break;
                    }
                    break;
                case 8:
                    if (z5Var.v(obj, i12, i14, i13, i10)) {
                        Object object = unsafe.getObject(obj, j3);
                        if (object instanceof String) {
                            ((y4) u5Var.a).h(i15, (String) object);
                            break;
                        } else {
                            ((y4) u5Var.a).c(i15, (x4) object);
                            break;
                        }
                    }
                    break;
                case 9:
                    if (z5Var.v(obj, i12, i14, i13, i10)) {
                        u5Var.b(i15, unsafe.getObject(obj, j3), z5Var.o(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 10:
                    if (z5Var.v(obj, i12, i14, i13, i10)) {
                        ((y4) u5Var.a).c(i15, (x4) unsafe.getObject(obj, j3));
                        break;
                    }
                    break;
                case 11:
                    if (z5Var.v(obj, i12, i14, i13, i10)) {
                        int i19 = unsafe.getInt(obj, j3);
                        y4 y4Var3 = (y4) u5Var.a;
                        y4Var3.j(i15 << 3);
                        y4Var3.j(i19);
                        break;
                    }
                    break;
                case 12:
                    if (z5Var.v(obj, i12, i14, i13, i10)) {
                        int i20 = unsafe.getInt(obj, j3);
                        y4 y4Var4 = (y4) u5Var.a;
                        y4Var4.j(i15 << 3);
                        if (i20 >= 0) {
                            y4Var4.j(i20);
                            break;
                        } else {
                            y4Var4.l(i20);
                            break;
                        }
                    }
                    break;
                case 13:
                    if (z5Var.v(obj, i12, i14, i13, i10)) {
                        ((y4) u5Var.a).d(i15, unsafe.getInt(obj, j3));
                        break;
                    }
                    break;
                case 14:
                    if (z5Var.v(obj, i12, i14, i13, i10)) {
                        ((y4) u5Var.a).f(i15, unsafe.getLong(obj, j3));
                        break;
                    }
                    break;
                case 15:
                    if (z5Var.v(obj, i12, i14, i13, i10)) {
                        int i21 = unsafe.getInt(obj, j3);
                        y4 y4Var5 = (y4) u5Var.a;
                        y4Var5.j(i15 << 3);
                        y4Var5.j((i21 >> 31) ^ (i21 + i21));
                        break;
                    }
                    break;
                case 16:
                    if (z5Var.v(obj, i12, i14, i13, i10)) {
                        long j10 = unsafe.getLong(obj, j3);
                        ((y4) u5Var.a).k(i15, (j10 >> 63) ^ (j10 + j10));
                        break;
                    }
                    break;
                case 17:
                    if (z5Var.v(obj, i12, i14, i13, i10)) {
                        u5Var.a(i15, unsafe.getObject(obj, j3), z5Var.o(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 18:
                    i6.q(iArr[i12], (List) unsafe.getObject(obj, j3), u5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 19:
                    i6.u(iArr[i12], (List) unsafe.getObject(obj, j3), u5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 20:
                    i6.w(iArr[i12], (List) unsafe.getObject(obj, j3), u5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 21:
                    i6.d(iArr[i12], (List) unsafe.getObject(obj, j3), u5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 22:
                    i6.v(iArr[i12], (List) unsafe.getObject(obj, j3), u5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 23:
                    i6.t(iArr[i12], (List) unsafe.getObject(obj, j3), u5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 24:
                    i6.s(iArr[i12], (List) unsafe.getObject(obj, j3), u5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 25:
                    i6.p(iArr[i12], (List) unsafe.getObject(obj, j3), u5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 26:
                    int i22 = iArr[i12];
                    List list = (List) unsafe.getObject(obj, j3);
                    Class cls = i6.a;
                    if (list == null) {
                        continue;
                    } else if (!list.isEmpty()) {
                        y4 y4Var6 = (y4) u5Var.a;
                        if (list instanceof o5) {
                            o5 o5Var = (o5) list;
                            for (int i23 = 0; i23 < list.size(); i23++) {
                                Object c10 = o5Var.c(i23);
                                if (c10 instanceof String) {
                                    y4Var6.h(i22, (String) c10);
                                } else {
                                    y4Var6.c(i22, (x4) c10);
                                }
                            }
                        } else {
                            for (int i24 = 0; i24 < list.size(); i24++) {
                                y4Var6.h(i22, (String) list.get(i24));
                            }
                        }
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 27:
                    int i25 = iArr[i12];
                    List list2 = (List) unsafe.getObject(obj, j3);
                    h6 o9 = z5Var.o(i12);
                    Class cls2 = i6.a;
                    if (list2 == null) {
                        continue;
                    } else if (!list2.isEmpty()) {
                        for (int i26 = 0; i26 < list2.size(); i26++) {
                            u5Var.b(i25, list2.get(i26), o9);
                        }
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 28:
                    int i27 = iArr[i12];
                    List list3 = (List) unsafe.getObject(obj, j3);
                    Class cls3 = i6.a;
                    if (list3 == null) {
                        continue;
                    } else if (!list3.isEmpty()) {
                        u5Var.getClass();
                        for (int i28 = 0; i28 < list3.size(); i28++) {
                            ((y4) u5Var.a).c(i27, (x4) list3.get(i28));
                        }
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 29:
                    i6.c(iArr[i12], (List) unsafe.getObject(obj, j3), u5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    i6.r(iArr[i12], (List) unsafe.getObject(obj, j3), u5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    i6.x(iArr[i12], (List) unsafe.getObject(obj, j3), u5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 32:
                    i6.y(iArr[i12], (List) unsafe.getObject(obj, j3), u5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 33:
                    i6.a(iArr[i12], (List) unsafe.getObject(obj, j3), u5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 34:
                    i6.b(iArr[i12], (List) unsafe.getObject(obj, j3), u5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 35:
                    i6.q(iArr[i12], (List) unsafe.getObject(obj, j3), u5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 36:
                    i6.u(iArr[i12], (List) unsafe.getObject(obj, j3), u5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 37:
                    i6.w(iArr[i12], (List) unsafe.getObject(obj, j3), u5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 38:
                    i6.d(iArr[i12], (List) unsafe.getObject(obj, j3), u5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    i6.v(iArr[i12], (List) unsafe.getObject(obj, j3), u5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    i6.t(iArr[i12], (List) unsafe.getObject(obj, j3), u5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    i6.s(iArr[i12], (List) unsafe.getObject(obj, j3), u5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    i6.p(iArr[i12], (List) unsafe.getObject(obj, j3), u5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    i6.c(iArr[i12], (List) unsafe.getObject(obj, j3), u5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    i6.r(iArr[i12], (List) unsafe.getObject(obj, j3), u5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    i6.x(iArr[i12], (List) unsafe.getObject(obj, j3), u5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    i6.y(iArr[i12], (List) unsafe.getObject(obj, j3), u5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    i6.a(iArr[i12], (List) unsafe.getObject(obj, j3), u5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 48:
                    i6.b(iArr[i12], (List) unsafe.getObject(obj, j3), u5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    int i29 = iArr[i12];
                    List list4 = (List) unsafe.getObject(obj, j3);
                    h6 o10 = z5Var.o(i12);
                    Class cls4 = i6.a;
                    if (list4 == null) {
                        continue;
                    } else if (!list4.isEmpty()) {
                        for (int i30 = 0; i30 < list4.size(); i30++) {
                            u5Var.a(i29, list4.get(i30), o10);
                        }
                    }
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    if (unsafe.getObject(obj, j3) != null) {
                        int i31 = i12 / 3;
                        throw a1.g.j(z5Var.b[i31 + i31]);
                    }
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 51:
                    if (z5Var.i(i15, i12, obj)) {
                        ((y4) u5Var.a).f(i15, Double.doubleToRawLongBits(((Double) s6.h(obj, j3)).doubleValue()));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 52:
                    if (z5Var.i(i15, i12, obj)) {
                        ((y4) u5Var.a).d(i15, Float.floatToRawIntBits(((Float) s6.h(obj, j3)).floatValue()));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 53:
                    if (z5Var.i(i15, i12, obj)) {
                        ((y4) u5Var.a).k(i15, n(obj, j3));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 54:
                    if (z5Var.i(i15, i12, obj)) {
                        ((y4) u5Var.a).k(i15, n(obj, j3));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 55:
                    if (z5Var.i(i15, i12, obj)) {
                        int k10 = k(obj, j3);
                        y4 y4Var7 = (y4) u5Var.a;
                        y4Var7.j(i15 << 3);
                        if (k10 >= 0) {
                            y4Var7.j(k10);
                        } else {
                            y4Var7.l(k10);
                        }
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 56:
                    if (z5Var.i(i15, i12, obj)) {
                        ((y4) u5Var.a).f(i15, n(obj, j3));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 57:
                    if (z5Var.i(i15, i12, obj)) {
                        ((y4) u5Var.a).d(i15, k(obj, j3));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 58:
                    if (z5Var.i(i15, i12, obj)) {
                        boolean booleanValue = ((Boolean) s6.h(obj, j3)).booleanValue();
                        y4 y4Var8 = (y4) u5Var.a;
                        y4Var8.j(i15 << 3);
                        y4Var8.a(booleanValue ? (byte) 1 : (byte) 0);
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 59:
                    if (z5Var.i(i15, i12, obj)) {
                        Object object2 = unsafe.getObject(obj, j3);
                        if (object2 instanceof String) {
                            ((y4) u5Var.a).h(i15, (String) object2);
                        } else {
                            ((y4) u5Var.a).c(i15, (x4) object2);
                        }
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 60:
                    if (z5Var.i(i15, i12, obj)) {
                        u5Var.b(i15, unsafe.getObject(obj, j3), z5Var.o(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 61:
                    if (z5Var.i(i15, i12, obj)) {
                        ((y4) u5Var.a).c(i15, (x4) unsafe.getObject(obj, j3));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 62:
                    if (z5Var.i(i15, i12, obj)) {
                        int k11 = k(obj, j3);
                        y4 y4Var9 = (y4) u5Var.a;
                        y4Var9.j(i15 << 3);
                        y4Var9.j(k11);
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 63:
                    if (z5Var.i(i15, i12, obj)) {
                        int k12 = k(obj, j3);
                        y4 y4Var10 = (y4) u5Var.a;
                        y4Var10.j(i15 << 3);
                        if (k12 >= 0) {
                            y4Var10.j(k12);
                        } else {
                            y4Var10.l(k12);
                        }
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 64:
                    if (z5Var.i(i15, i12, obj)) {
                        ((y4) u5Var.a).d(i15, k(obj, j3));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (z5Var.i(i15, i12, obj)) {
                        ((y4) u5Var.a).f(i15, n(obj, j3));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 66:
                    if (z5Var.i(i15, i12, obj)) {
                        int k13 = k(obj, j3);
                        y4 y4Var11 = (y4) u5Var.a;
                        y4Var11.j(i15 << 3);
                        y4Var11.j((k13 >> 31) ^ (k13 + k13));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 67:
                    if (z5Var.i(i15, i12, obj)) {
                        long n10 = n(obj, j3);
                        ((y4) u5Var.a).k(i15, (n10 >> 63) ^ (n10 + n10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 68:
                    if (z5Var.i(i15, i12, obj)) {
                        u5Var.a(i15, unsafe.getObject(obj, j3), z5Var.o(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                default:
                    i12 += 3;
                    i11 = 1048575;
            }
            z5Var = this;
            i12 += 3;
            i11 = 1048575;
        }
    }

    @Override // com.google.android.gms.internal.cast.h6
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
                    if (v(obj, i11, i10, i12, i20) && !o(i11).f(s6.h(obj, m10 & 1048575))) {
                    }
                    i14++;
                    i15 = i10;
                    i13 = i12;
                } else {
                    if (l4 != 27) {
                        if (l4 == 60 || l4 == 68) {
                            if (i(i17, i11, obj) && !o(i11).f(s6.h(obj, m10 & 1048575))) {
                            }
                        } else if (l4 != 49) {
                            if (l4 == 50) {
                                s6.h(obj, m10 & 1048575).getClass();
                                throw new ClassCastException();
                            }
                        }
                        i14++;
                        i15 = i10;
                        i13 = i12;
                    }
                    List list = (List) s6.h(obj, m10 & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        h6 o9 = o(i11);
                        for (int i22 = 0; i22 < list.size(); i22++) {
                            if (o9.f(list.get(i22))) {
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

    @Override // com.google.android.gms.internal.cast.h6
    public final int g(t4 t4Var) {
        int i10;
        int i11;
        int a2;
        int o9;
        int h10;
        int o10;
        int size;
        int n10;
        int o11;
        int o12;
        int o13;
        int o14;
        int o15;
        int i12;
        int i13;
        z5 z5Var = this;
        t4 t4Var2 = t4Var;
        Unsafe unsafe = i;
        int i14 = 1048575;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int[] iArr = z5Var.a;
            if (i16 >= iArr.length) {
                z5Var.g.getClass();
                j6 j6Var = ((f5) t4Var).zzc;
                int i19 = j6Var.c;
                if (i19 == -1) {
                    j6Var.c = 0;
                    i10 = 0;
                } else {
                    i10 = i19;
                }
                return i10 + i18;
            }
            int m10 = z5Var.m(i16);
            int l4 = l(m10);
            int i20 = iArr[i16];
            int i21 = iArr[i16 + 2];
            int i22 = i21 & i14;
            if (l4 <= 17) {
                if (i22 != i15) {
                    i17 = i22 == i14 ? 0 : unsafe.getInt(t4Var2, i22);
                    i15 = i22;
                }
                i11 = 1 << (i21 >>> 20);
            } else {
                i11 = 0;
            }
            int i23 = m10 & i14;
            if (l4 >= c5.b.a) {
                c5.c.getClass();
            }
            long j3 = i23;
            switch (l4) {
                case 0:
                    if (z5Var.v(t4Var2, i16, i15, i17, i11)) {
                        i18 = a1.g.C(i20 << 3, 8, i18);
                    }
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 1:
                    if (z5Var.v(t4Var2, i16, i15, i17, i11)) {
                        i18 = a1.g.C(i20 << 3, 4, i18);
                    }
                    z5Var = this;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 2:
                    if (z5Var.v(t4Var2, i16, i15, i17, i11)) {
                        i18 = a1.g.C(i20 << 3, y4.p(unsafe.getLong(t4Var2, j3)), i18);
                    }
                    z5Var = this;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 3:
                    if (z5Var.v(t4Var2, i16, i15, i17, i11)) {
                        i18 = a1.g.C(i20 << 3, y4.p(unsafe.getLong(t4Var2, j3)), i18);
                    }
                    z5Var = this;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 4:
                    if (z5Var.v(t4Var2, i16, i15, i17, i11)) {
                        i18 = a1.g.C(i20 << 3, y4.m(unsafe.getInt(t4Var2, j3)), i18);
                    }
                    z5Var = this;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 5:
                    if (z5Var.v(t4Var2, i16, i15, i17, i11)) {
                        i18 = a1.g.C(i20 << 3, 8, i18);
                    }
                    z5Var = this;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 6:
                    if (z5Var.v(t4Var2, i16, i15, i17, i11)) {
                        i18 = a1.g.C(i20 << 3, 4, i18);
                    }
                    z5Var = this;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 7:
                    if (z5Var.v(t4Var2, i16, i15, i17, i11)) {
                        i18 = a1.g.C(i20 << 3, 1, i18);
                    }
                    z5Var = this;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 8:
                    if (z5Var.v(t4Var2, i16, i15, i17, i11)) {
                        int i24 = i20 << 3;
                        Object object = unsafe.getObject(t4Var2, j3);
                        if (object instanceof x4) {
                            Logger logger = y4.e;
                            int o16 = ((x4) object).o();
                            i18 = a1.g.C(i24, y4.o(o16) + o16, i18);
                        } else {
                            i18 = a1.g.C(i24, y4.n((String) object), i18);
                        }
                    }
                    z5Var = this;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 9:
                    if (z5Var.v(t4Var2, i16, i15, i17, i11)) {
                        Object object2 = unsafe.getObject(t4Var2, j3);
                        h6 o17 = z5Var.o(i16);
                        Class cls = i6.a;
                        Logger logger2 = y4.e;
                        int a10 = ((t4) object2).a(o17);
                        i18 = a1.g.C(i20 << 3, y4.o(a10) + a10, i18);
                    }
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 10:
                    if (z5Var.v(t4Var2, i16, i15, i17, i11)) {
                        x4 x4Var = (x4) unsafe.getObject(t4Var2, j3);
                        Logger logger3 = y4.e;
                        int o18 = x4Var.o();
                        i18 = a1.g.C(i20 << 3, y4.o(o18) + o18, i18);
                    }
                    z5Var = this;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 11:
                    if (z5Var.v(t4Var2, i16, i15, i17, i11)) {
                        i18 = a1.g.C(i20 << 3, y4.o(unsafe.getInt(t4Var2, j3)), i18);
                    }
                    z5Var = this;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 12:
                    if (z5Var.v(t4Var2, i16, i15, i17, i11)) {
                        i18 = a1.g.C(i20 << 3, y4.m(unsafe.getInt(t4Var2, j3)), i18);
                    }
                    z5Var = this;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 13:
                    if (z5Var.v(t4Var2, i16, i15, i17, i11)) {
                        i18 = a1.g.C(i20 << 3, 4, i18);
                    }
                    z5Var = this;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 14:
                    if (z5Var.v(t4Var2, i16, i15, i17, i11)) {
                        i18 = a1.g.C(i20 << 3, 8, i18);
                    }
                    z5Var = this;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 15:
                    if (z5Var.v(t4Var2, i16, i15, i17, i11)) {
                        int i25 = unsafe.getInt(t4Var2, j3);
                        i18 = a1.g.C((i25 >> 31) ^ (i25 + i25), y4.o(i20 << 3), i18);
                    }
                    z5Var = this;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 16:
                    if (z5Var.v(t4Var2, i16, i15, i17, i11)) {
                        long j10 = unsafe.getLong(t4Var2, j3);
                        i18 += y4.p((j10 >> 63) ^ (j10 + j10)) + y4.o(i20 << 3);
                    }
                    z5Var = this;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 17:
                    if (z5Var.v(t4Var2, i16, i15, i17, i11)) {
                        t4 t4Var3 = (t4) unsafe.getObject(t4Var2, j3);
                        h6 o19 = z5Var.o(i16);
                        Logger logger4 = y4.e;
                        a2 = t4Var3.a(o19);
                        o9 = y4.o(i20 << 3);
                        i12 = o9 + o9;
                        i18 += i12 + a2;
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    }
                case 18:
                    h10 = i6.h(i20, (List) unsafe.getObject(t4Var2, j3));
                    i18 += h10;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 19:
                    h10 = i6.g(i20, (List) unsafe.getObject(t4Var2, j3));
                    i18 += h10;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(t4Var2, j3);
                    Class cls2 = i6.a;
                    if (list.size() != 0) {
                        o10 = (y4.o(i20 << 3) * list.size()) + i6.j(list);
                        i18 += o10;
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    }
                    o10 = 0;
                    i18 += o10;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(t4Var2, j3);
                    Class cls3 = i6.a;
                    size = list2.size();
                    if (size != 0) {
                        n10 = i6.n(list2);
                        o11 = y4.o(i20 << 3);
                        o12 = (o11 * size) + n10;
                        i18 += o12;
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    }
                    o12 = 0;
                    i18 += o12;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(t4Var2, j3);
                    Class cls4 = i6.a;
                    size = list3.size();
                    if (size != 0) {
                        n10 = i6.i(list3);
                        o11 = y4.o(i20 << 3);
                        o12 = (o11 * size) + n10;
                        i18 += o12;
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    }
                    o12 = 0;
                    i18 += o12;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 23:
                    h10 = i6.h(i20, (List) unsafe.getObject(t4Var2, j3));
                    i18 += h10;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 24:
                    h10 = i6.g(i20, (List) unsafe.getObject(t4Var2, j3));
                    i18 += h10;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(t4Var2, j3);
                    Class cls5 = i6.a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        o10 = (y4.o(i20 << 3) + 1) * size2;
                        i18 += o10;
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    }
                    o10 = 0;
                    i18 += o10;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(t4Var2, j3);
                    Class cls6 = i6.a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        boolean z10 = list5 instanceof o5;
                        o12 = y4.o(i20 << 3) * size3;
                        if (z10) {
                            o5 o5Var = (o5) list5;
                            for (int i26 = 0; i26 < size3; i26++) {
                                Object c10 = o5Var.c(i26);
                                if (c10 instanceof x4) {
                                    int o20 = ((x4) c10).o();
                                    o12 = a1.g.C(o20, o20, o12);
                                } else {
                                    o12 = y4.n((String) c10) + o12;
                                }
                            }
                        } else {
                            for (int i27 = 0; i27 < size3; i27++) {
                                Object obj = list5.get(i27);
                                if (obj instanceof x4) {
                                    int o21 = ((x4) obj).o();
                                    o12 = a1.g.C(o21, o21, o12);
                                } else {
                                    o12 = y4.n((String) obj) + o12;
                                }
                            }
                        }
                        i18 += o12;
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    }
                    o12 = 0;
                    i18 += o12;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(t4Var2, j3);
                    h6 o22 = z5Var.o(i16);
                    Class cls7 = i6.a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        o13 = 0;
                    } else {
                        o13 = y4.o(i20 << 3) * size4;
                        for (int i28 = 0; i28 < size4; i28++) {
                            int a11 = ((t4) list6.get(i28)).a(o22);
                            o13 = a1.g.C(a11, a11, o13);
                        }
                    }
                    i18 += o13;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(t4Var2, j3);
                    Class cls8 = i6.a;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        o12 = y4.o(i20 << 3) * size5;
                        for (int i29 = 0; i29 < list7.size(); i29++) {
                            int o23 = ((x4) list7.get(i29)).o();
                            o12 = a1.g.C(o23, o23, o12);
                        }
                        i18 += o12;
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    }
                    o12 = 0;
                    i18 += o12;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(t4Var2, j3);
                    Class cls9 = i6.a;
                    size = list8.size();
                    if (size != 0) {
                        n10 = i6.m(list8);
                        o11 = y4.o(i20 << 3);
                        o12 = (o11 * size) + n10;
                        i18 += o12;
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    }
                    o12 = 0;
                    i18 += o12;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    List list9 = (List) unsafe.getObject(t4Var2, j3);
                    Class cls10 = i6.a;
                    size = list9.size();
                    if (size != 0) {
                        n10 = i6.f(list9);
                        o11 = y4.o(i20 << 3);
                        o12 = (o11 * size) + n10;
                        i18 += o12;
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    }
                    o12 = 0;
                    i18 += o12;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    h10 = i6.g(i20, (List) unsafe.getObject(t4Var2, j3));
                    i18 += h10;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 32:
                    h10 = i6.h(i20, (List) unsafe.getObject(t4Var2, j3));
                    i18 += h10;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(t4Var2, j3);
                    Class cls11 = i6.a;
                    size = list10.size();
                    if (size != 0) {
                        n10 = i6.k(list10);
                        o11 = y4.o(i20 << 3);
                        o12 = (o11 * size) + n10;
                        i18 += o12;
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    }
                    o12 = 0;
                    i18 += o12;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(t4Var2, j3);
                    Class cls12 = i6.a;
                    size = list11.size();
                    if (size != 0) {
                        n10 = i6.l(list11);
                        o11 = y4.o(i20 << 3);
                        o12 = (o11 * size) + n10;
                        i18 += o12;
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    }
                    o12 = 0;
                    i18 += o12;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 35:
                    List list12 = (List) unsafe.getObject(t4Var2, j3);
                    Class cls13 = i6.a;
                    a2 = list12.size() * 8;
                    if (a2 > 0) {
                        o14 = y4.o(a2);
                        o15 = y4.o(i20 << 3);
                        i12 = o15 + o14;
                        i18 += i12 + a2;
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(t4Var2, j3);
                    Class cls14 = i6.a;
                    a2 = list13.size() * 4;
                    if (a2 > 0) {
                        o14 = y4.o(a2);
                        o15 = y4.o(i20 << 3);
                        i12 = o15 + o14;
                        i18 += i12 + a2;
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    }
                case 37:
                    a2 = i6.j((List) unsafe.getObject(t4Var2, j3));
                    if (a2 > 0) {
                        o14 = y4.o(a2);
                        o15 = y4.o(i20 << 3);
                        i12 = o15 + o14;
                        i18 += i12 + a2;
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    }
                case 38:
                    a2 = i6.n((List) unsafe.getObject(t4Var2, j3));
                    if (a2 > 0) {
                        o14 = y4.o(a2);
                        o15 = y4.o(i20 << 3);
                        i12 = o15 + o14;
                        i18 += i12 + a2;
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    a2 = i6.i((List) unsafe.getObject(t4Var2, j3));
                    if (a2 > 0) {
                        o14 = y4.o(a2);
                        o15 = y4.o(i20 << 3);
                        i12 = o15 + o14;
                        i18 += i12 + a2;
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    List list14 = (List) unsafe.getObject(t4Var2, j3);
                    Class cls15 = i6.a;
                    a2 = list14.size() * 8;
                    if (a2 > 0) {
                        o14 = y4.o(a2);
                        o15 = y4.o(i20 << 3);
                        i12 = o15 + o14;
                        i18 += i12 + a2;
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    List list15 = (List) unsafe.getObject(t4Var2, j3);
                    Class cls16 = i6.a;
                    a2 = list15.size() * 4;
                    if (a2 > 0) {
                        o14 = y4.o(a2);
                        o15 = y4.o(i20 << 3);
                        i12 = o15 + o14;
                        i18 += i12 + a2;
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    List list16 = (List) unsafe.getObject(t4Var2, j3);
                    Class cls17 = i6.a;
                    a2 = list16.size();
                    if (a2 > 0) {
                        o14 = y4.o(a2);
                        o15 = y4.o(i20 << 3);
                        i12 = o15 + o14;
                        i18 += i12 + a2;
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    a2 = i6.m((List) unsafe.getObject(t4Var2, j3));
                    if (a2 > 0) {
                        o14 = y4.o(a2);
                        o15 = y4.o(i20 << 3);
                        i12 = o15 + o14;
                        i18 += i12 + a2;
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    a2 = i6.f((List) unsafe.getObject(t4Var2, j3));
                    if (a2 > 0) {
                        o14 = y4.o(a2);
                        o15 = y4.o(i20 << 3);
                        i12 = o15 + o14;
                        i18 += i12 + a2;
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    List list17 = (List) unsafe.getObject(t4Var2, j3);
                    Class cls18 = i6.a;
                    a2 = list17.size() * 4;
                    if (a2 > 0) {
                        o14 = y4.o(a2);
                        o15 = y4.o(i20 << 3);
                        i12 = o15 + o14;
                        i18 += i12 + a2;
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    List list18 = (List) unsafe.getObject(t4Var2, j3);
                    Class cls19 = i6.a;
                    a2 = list18.size() * 8;
                    if (a2 > 0) {
                        o14 = y4.o(a2);
                        o15 = y4.o(i20 << 3);
                        i12 = o15 + o14;
                        i18 += i12 + a2;
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    a2 = i6.k((List) unsafe.getObject(t4Var2, j3));
                    if (a2 > 0) {
                        o14 = y4.o(a2);
                        o15 = y4.o(i20 << 3);
                        i12 = o15 + o14;
                        i18 += i12 + a2;
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    }
                case 48:
                    a2 = i6.l((List) unsafe.getObject(t4Var2, j3));
                    if (a2 > 0) {
                        o14 = y4.o(a2);
                        o15 = y4.o(i20 << 3);
                        i12 = o15 + o14;
                        i18 += i12 + a2;
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    List list19 = (List) unsafe.getObject(t4Var2, j3);
                    h6 o24 = z5Var.o(i16);
                    Class cls20 = i6.a;
                    int size6 = list19.size();
                    if (size6 == 0) {
                        i13 = 0;
                    } else {
                        i13 = 0;
                        for (int i30 = 0; i30 < size6; i30++) {
                            t4 t4Var4 = (t4) list19.get(i30);
                            Logger logger5 = y4.e;
                            int a12 = t4Var4.a(o24);
                            int o25 = y4.o(i20 << 3);
                            i13 += o25 + o25 + a12;
                        }
                    }
                    i18 += i13;
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Object object3 = unsafe.getObject(t4Var2, j3);
                    int i31 = i16 / 3;
                    Object obj2 = z5Var.b[i31 + i31];
                    if (object3 == null) {
                        throw a1.g.j(obj2);
                    }
                    throw new ClassCastException();
                case 51:
                    if (z5Var.i(i20, i16, t4Var2)) {
                        i18 = a1.g.C(i20 << 3, 8, i18);
                    }
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 52:
                    if (z5Var.i(i20, i16, t4Var2)) {
                        i18 = a1.g.C(i20 << 3, 4, i18);
                    }
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 53:
                    if (z5Var.i(i20, i16, t4Var2)) {
                        i18 = a1.g.C(i20 << 3, y4.p(n(t4Var2, j3)), i18);
                    }
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 54:
                    if (z5Var.i(i20, i16, t4Var2)) {
                        i18 = a1.g.C(i20 << 3, y4.p(n(t4Var2, j3)), i18);
                    }
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 55:
                    if (z5Var.i(i20, i16, t4Var2)) {
                        i18 = a1.g.C(i20 << 3, y4.m(k(t4Var2, j3)), i18);
                    }
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 56:
                    if (z5Var.i(i20, i16, t4Var2)) {
                        i18 = a1.g.C(i20 << 3, 8, i18);
                    }
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 57:
                    if (z5Var.i(i20, i16, t4Var2)) {
                        i18 = a1.g.C(i20 << 3, 4, i18);
                    }
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 58:
                    if (z5Var.i(i20, i16, t4Var2)) {
                        i18 = a1.g.C(i20 << 3, 1, i18);
                    }
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 59:
                    if (z5Var.i(i20, i16, t4Var2)) {
                        int i32 = i20 << 3;
                        Object object4 = unsafe.getObject(t4Var2, j3);
                        if (object4 instanceof x4) {
                            Logger logger6 = y4.e;
                            int o26 = ((x4) object4).o();
                            i18 = a1.g.C(i32, y4.o(o26) + o26, i18);
                        } else {
                            i18 = a1.g.C(i32, y4.n((String) object4), i18);
                        }
                    }
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 60:
                    if (z5Var.i(i20, i16, t4Var2)) {
                        Object object5 = unsafe.getObject(t4Var2, j3);
                        h6 o27 = z5Var.o(i16);
                        Class cls21 = i6.a;
                        Logger logger7 = y4.e;
                        int a13 = ((t4) object5).a(o27);
                        i18 = a1.g.C(i20 << 3, y4.o(a13) + a13, i18);
                    }
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 61:
                    if (z5Var.i(i20, i16, t4Var2)) {
                        x4 x4Var2 = (x4) unsafe.getObject(t4Var2, j3);
                        Logger logger8 = y4.e;
                        int o28 = x4Var2.o();
                        i18 = a1.g.C(i20 << 3, y4.o(o28) + o28, i18);
                    }
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 62:
                    if (z5Var.i(i20, i16, t4Var2)) {
                        i18 = a1.g.C(i20 << 3, y4.o(k(t4Var2, j3)), i18);
                    }
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 63:
                    if (z5Var.i(i20, i16, t4Var2)) {
                        i18 = a1.g.C(i20 << 3, y4.m(k(t4Var2, j3)), i18);
                    }
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 64:
                    if (z5Var.i(i20, i16, t4Var2)) {
                        i18 = a1.g.C(i20 << 3, 4, i18);
                    }
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (z5Var.i(i20, i16, t4Var2)) {
                        i18 = a1.g.C(i20 << 3, 8, i18);
                    }
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 66:
                    if (z5Var.i(i20, i16, t4Var2)) {
                        int k10 = k(t4Var2, j3);
                        i18 = a1.g.C((k10 >> 31) ^ (k10 + k10), y4.o(i20 << 3), i18);
                    }
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
                case 67:
                    if (z5Var.i(i20, i16, t4Var2)) {
                        long n11 = n(t4Var2, j3);
                        a2 = y4.o(i20 << 3);
                        i12 = y4.p((n11 >> 63) ^ (n11 + n11));
                        i18 += i12 + a2;
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    }
                case 68:
                    if (z5Var.i(i20, i16, t4Var2)) {
                        t4 t4Var5 = (t4) unsafe.getObject(t4Var2, j3);
                        h6 o29 = z5Var.o(i16);
                        Logger logger9 = y4.e;
                        a2 = t4Var5.a(o29);
                        o9 = y4.o(i20 << 3);
                        i12 = o9 + o9;
                        i18 += i12 + a2;
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    } else {
                        i16 += 3;
                        t4Var2 = t4Var;
                        i14 = 1048575;
                    }
                default:
                    i16 += 3;
                    t4Var2 = t4Var;
                    i14 = 1048575;
            }
        }
    }

    public final boolean i(int i10, int i11, Object obj) {
        return s6.e(obj, (long) (this.a[i11 + 2] & 1048575)) == i10;
    }

    public final int m(int i10) {
        return this.a[i10 + 1];
    }

    public final h6 o(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        Object[] objArr = this.b;
        h6 h6Var = (h6) objArr[i12];
        if (h6Var != null) {
            return h6Var;
        }
        h6 a2 = e6.c.a((Class) objArr[i12 + 1]);
        objArr[i12] = a2;
        return a2;
    }

    public final void q(int i10, Object obj, Object obj2) {
        if (u(i10, obj2)) {
            int m10 = m(i10) & 1048575;
            Unsafe unsafe = i;
            long j3 = m10;
            Object object = unsafe.getObject(obj2, j3);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i10] + " is present but null: " + obj2.toString());
            }
            h6 o9 = o(i10);
            if (!u(i10, obj)) {
                if (h(object)) {
                    f5 zzc = o9.zzc();
                    o9.d(zzc, object);
                    unsafe.putObject(obj, j3, zzc);
                } else {
                    unsafe.putObject(obj, j3, object);
                }
                s(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j3);
            if (!h(object2)) {
                f5 zzc2 = o9.zzc();
                o9.d(zzc2, object2);
                unsafe.putObject(obj, j3, zzc2);
                object2 = zzc2;
            }
            o9.d(object2, object);
        }
    }

    public final void r(int i10, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i11 = iArr[i10];
        if (i(i11, i10, obj2)) {
            int m10 = m(i10) & 1048575;
            Unsafe unsafe = i;
            long j3 = m10;
            Object object = unsafe.getObject(obj2, j3);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2.toString());
            }
            h6 o9 = o(i10);
            if (!i(i11, i10, obj)) {
                if (h(object)) {
                    f5 zzc = o9.zzc();
                    o9.d(zzc, object);
                    unsafe.putObject(obj, j3, zzc);
                } else {
                    unsafe.putObject(obj, j3, object);
                }
                s6.j(obj, iArr[i10 + 2] & 1048575, i11);
                return;
            }
            Object object2 = unsafe.getObject(obj, j3);
            if (!h(object2)) {
                f5 zzc2 = o9.zzc();
                o9.d(zzc2, object2);
                unsafe.putObject(obj, j3, zzc2);
                object2 = zzc2;
            }
            o9.d(object2, object);
        }
    }

    public final void s(int i10, Object obj) {
        int i11 = this.a[i10 + 2];
        long j3 = 1048575 & i11;
        if (j3 == 1048575) {
            return;
        }
        s6.j(obj, j3, (1 << (i11 >>> 20)) | s6.e(obj, j3));
    }

    public final boolean t(f5 f5Var, f5 f5Var2, int i10) {
        return u(i10, f5Var) == u(i10, f5Var2);
    }

    public final boolean u(int i10, Object obj) {
        int i11 = this.a[i10 + 2];
        long j3 = i11 & 1048575;
        if (j3 == 1048575) {
            int m10 = m(i10);
            long j10 = m10 & 1048575;
            switch (l(m10)) {
                case 0:
                    if (Double.doubleToRawLongBits(s6.c.a(obj, j10)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(s6.c.b(obj, j10)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (s6.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (s6.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (s6.e(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (s6.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (s6.e(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return s6.c.g(obj, j10);
                case 8:
                    Object h10 = s6.h(obj, j10);
                    if (h10 instanceof String) {
                        if (((String) h10).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(h10 instanceof x4)) {
                            throw new IllegalArgumentException();
                        }
                        if (x4.c.equals(h10)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (s6.h(obj, j10) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (x4.c.equals(s6.h(obj, j10))) {
                        return false;
                    }
                    break;
                case 11:
                    if (s6.e(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (s6.e(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (s6.e(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (s6.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (s6.e(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (s6.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (s6.h(obj, j10) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i11 >>> 20)) & s6.e(obj, j3)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean v(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? u(i10, obj) : (i12 & i13) != 0;
    }

    @Override // com.google.android.gms.internal.cast.h6
    public final f5 zzc() {
        return (f5) ((f5) this.c).h(4, null);
    }
}
