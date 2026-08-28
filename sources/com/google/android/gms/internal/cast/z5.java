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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public z5(int[] iArr, Object[] objArr, t4 t4Var, int[] iArr2, int i9, r5 r5Var, k6 k6Var, a5 a5Var) {
        this.a = iArr;
        this.b = objArr;
        this.d = iArr2;
        this.e = i9;
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

    /* JADX WARN: Removed duplicated region for block: B:105:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static z5 j(g6 g6Var, r5 r5Var, k6 k6Var, a5 a5Var) {
        int i9;
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
        String str;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        Field p6;
        int i34;
        char charAt9;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        Object obj;
        Field p9;
        Object obj2;
        Field p10;
        int i41;
        char charAt10;
        int i42;
        int i43;
        char charAt11;
        int i44;
        char charAt12;
        int i45;
        char charAt13;
        if (!(g6Var instanceof g6)) {
            g6Var.getClass();
            throw new ClassCastException();
        }
        String str2 = g6Var.b;
        int length = str2.length();
        char charAt14 = str2.charAt(0);
        char c10 = CharacterCompat.MIN_HIGH_SURROGATE;
        if (charAt14 >= 55296) {
            int i46 = 1;
            while (true) {
                i9 = i46 + 1;
                if (str2.charAt(i46) < 55296) {
                    break;
                }
                i46 = i9;
            }
        } else {
            i9 = 1;
        }
        int i47 = i9 + 1;
        int charAt15 = str2.charAt(i9);
        if (charAt15 >= 55296) {
            int i48 = charAt15 & 8191;
            int i49 = 13;
            while (true) {
                i45 = i47 + 1;
                charAt13 = str2.charAt(i47);
                if (charAt13 < 55296) {
                    break;
                }
                i48 |= (charAt13 & 8191) << i49;
                i49 += 13;
                i47 = i45;
            }
            charAt15 = i48 | (charAt13 << i49);
            i47 = i45;
        }
        if (charAt15 == 0) {
            iArr = h;
            i11 = 0;
            charAt = 0;
            charAt2 = 0;
            i10 = 0;
            i12 = 0;
        } else {
            int i50 = i47 + 1;
            int charAt16 = str2.charAt(i47);
            if (charAt16 >= 55296) {
                int i51 = charAt16 & 8191;
                int i52 = 13;
                while (true) {
                    i20 = i50 + 1;
                    charAt8 = str2.charAt(i50);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i51 |= (charAt8 & 8191) << i52;
                    i52 += 13;
                    i50 = i20;
                }
                charAt16 = i51 | (charAt8 << i52);
                i50 = i20;
            }
            int i53 = i50 + 1;
            int charAt17 = str2.charAt(i50);
            if (charAt17 >= 55296) {
                int i54 = charAt17 & 8191;
                int i55 = 13;
                while (true) {
                    i19 = i53 + 1;
                    charAt7 = str2.charAt(i53);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i54 |= (charAt7 & 8191) << i55;
                    i55 += 13;
                    i53 = i19;
                }
                charAt17 = i54 | (charAt7 << i55);
                i53 = i19;
            }
            int i56 = i53 + 1;
            if (str2.charAt(i53) >= 55296) {
                while (true) {
                    i18 = i56 + 1;
                    if (str2.charAt(i56) < 55296) {
                        break;
                    }
                    i56 = i18;
                }
                i56 = i18;
            }
            int i57 = i56 + 1;
            if (str2.charAt(i56) >= 55296) {
                while (true) {
                    i17 = i57 + 1;
                    if (str2.charAt(i57) < 55296) {
                        break;
                    }
                    i57 = i17;
                }
                i57 = i17;
            }
            int i58 = i57 + 1;
            charAt = str2.charAt(i57);
            if (charAt >= 55296) {
                int i59 = charAt & 8191;
                int i60 = 13;
                while (true) {
                    i16 = i58 + 1;
                    charAt6 = str2.charAt(i58);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i59 |= (charAt6 & 8191) << i60;
                    i60 += 13;
                    i58 = i16;
                }
                charAt = i59 | (charAt6 << i60);
                i58 = i16;
            }
            int i61 = i58 + 1;
            charAt2 = str2.charAt(i58);
            if (charAt2 >= 55296) {
                int i62 = charAt2 & 8191;
                int i63 = 13;
                while (true) {
                    i15 = i61 + 1;
                    charAt5 = str2.charAt(i61);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i62 |= (charAt5 & 8191) << i63;
                    i63 += 13;
                    i61 = i15;
                }
                charAt2 = i62 | (charAt5 << i63);
                i61 = i15;
            }
            int i64 = i61 + 1;
            int charAt18 = str2.charAt(i61);
            if (charAt18 >= 55296) {
                int i65 = charAt18 & 8191;
                int i66 = 13;
                while (true) {
                    i14 = i64 + 1;
                    charAt4 = str2.charAt(i64);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i65 |= (charAt4 & 8191) << i66;
                    i66 += 13;
                    i64 = i14;
                }
                charAt18 = i65 | (charAt4 << i66);
                i64 = i14;
            }
            int i67 = i64 + 1;
            int charAt19 = str2.charAt(i64);
            if (charAt19 >= 55296) {
                int i68 = charAt19 & 8191;
                int i69 = 13;
                while (true) {
                    i13 = i67 + 1;
                    charAt3 = str2.charAt(i67);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i68 |= (charAt3 & 8191) << i69;
                    i69 += 13;
                    i67 = i13;
                }
                charAt19 = i68 | (charAt3 << i69);
                i67 = i13;
            }
            int i70 = charAt19 + charAt2 + charAt18;
            i10 = charAt16 + charAt16 + charAt17;
            i11 = charAt16;
            i47 = i67;
            iArr = new int[i70];
            i12 = charAt19;
        }
        Unsafe unsafe = i;
        Object[] objArr2 = g6Var.c;
        Class<?> cls = g6Var.a.getClass();
        int i71 = charAt2 + i12;
        int i72 = charAt + charAt;
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr3 = new Object[i72];
        int i73 = i12;
        int i74 = 0;
        int i75 = 0;
        while (i47 < length) {
            int i76 = i47 + 1;
            int charAt20 = str2.charAt(i47);
            if (charAt20 >= c10) {
                int i77 = charAt20 & 8191;
                int i78 = i76;
                int i79 = 13;
                while (true) {
                    i44 = i78 + 1;
                    charAt12 = str2.charAt(i78);
                    if (charAt12 < c10) {
                        break;
                    }
                    i77 |= (charAt12 & 8191) << i79;
                    i79 += 13;
                    i78 = i44;
                }
                charAt20 = i77 | (charAt12 << i79);
                i21 = i44;
            } else {
                i21 = i76;
            }
            int i80 = i21 + 1;
            int charAt21 = str2.charAt(i21);
            if (charAt21 >= c10) {
                int i81 = charAt21 & 8191;
                int i82 = i80;
                int i83 = 13;
                while (true) {
                    i43 = i82 + 1;
                    charAt11 = str2.charAt(i82);
                    i22 = length;
                    if (charAt11 < 55296) {
                        break;
                    }
                    i81 |= (charAt11 & 8191) << i83;
                    i83 += 13;
                    i82 = i43;
                    length = i22;
                }
                charAt21 = i81 | (charAt11 << i83);
                i23 = i43;
            } else {
                i22 = length;
                i23 = i80;
            }
            if ((charAt21 & 1024) != 0) {
                iArr[i74] = i75;
                i74++;
            }
            int i84 = charAt21 & 255;
            int i85 = charAt20;
            int i86 = charAt21 & 2048;
            if (i84 >= 51) {
                int i87 = i23 + 1;
                int charAt22 = str2.charAt(i23);
                if (charAt22 >= 55296) {
                    int i88 = charAt22 & 8191;
                    int i89 = i87;
                    int i90 = 13;
                    while (true) {
                        i41 = i89 + 1;
                        charAt10 = str2.charAt(i89);
                        i42 = i88;
                        if (charAt10 < 55296) {
                            break;
                        }
                        i88 = i42 | ((charAt10 & 8191) << i90);
                        i90 += 13;
                        i89 = i41;
                    }
                    charAt22 = i42 | (charAt10 << i90);
                    i38 = i41;
                } else {
                    i38 = i87;
                }
                int i91 = charAt22;
                int i92 = i84 - 51;
                i30 = i38;
                if (i92 == 9 || i92 == 17) {
                    i39 = i10 + 1;
                    int i93 = i75 / 3;
                    objArr3[i93 + i93 + 1] = objArr2[i10];
                } else {
                    if (i92 == 12) {
                        if (g6Var.a() == 1 || i86 != 0) {
                            i39 = i10 + 1;
                            int i94 = i75 / 3;
                            objArr3[i94 + i94 + 1] = objArr2[i10];
                        } else {
                            i40 = 0;
                            int i95 = i91 + i91;
                            obj = objArr2[i95];
                            int i96 = i40;
                            if (obj instanceof Field) {
                                p9 = (Field) obj;
                            } else {
                                p9 = p(cls, (String) obj);
                                objArr2[i95] = p9;
                            }
                            int i97 = i11;
                            objArr = objArr3;
                            int objectFieldOffset = (int) unsafe.objectFieldOffset(p9);
                            int i98 = i95 + 1;
                            obj2 = objArr2[i98];
                            if (obj2 instanceof Field) {
                                p10 = (Field) obj2;
                            } else {
                                p10 = p(cls, (String) obj2);
                                objArr2[i98] = p10;
                            }
                            str = str2;
                            i31 = i96;
                            i28 = 0;
                            i24 = i97;
                            i32 = (int) unsafe.objectFieldOffset(p10);
                            i33 = objectFieldOffset;
                        }
                    }
                    i40 = i86;
                    int i952 = i91 + i91;
                    obj = objArr2[i952];
                    int i962 = i40;
                    if (obj instanceof Field) {
                    }
                    int i972 = i11;
                    objArr = objArr3;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(p9);
                    int i982 = i952 + 1;
                    obj2 = objArr2[i982];
                    if (obj2 instanceof Field) {
                    }
                    str = str2;
                    i31 = i962;
                    i28 = 0;
                    i24 = i972;
                    i32 = (int) unsafe.objectFieldOffset(p10);
                    i33 = objectFieldOffset2;
                }
                i10 = i39;
                i40 = i86;
                int i9522 = i91 + i91;
                obj = objArr2[i9522];
                int i9622 = i40;
                if (obj instanceof Field) {
                }
                int i9722 = i11;
                objArr = objArr3;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(p9);
                int i9822 = i9522 + 1;
                obj2 = objArr2[i9822];
                if (obj2 instanceof Field) {
                }
                str = str2;
                i31 = i9622;
                i28 = 0;
                i24 = i9722;
                i32 = (int) unsafe.objectFieldOffset(p10);
                i33 = objectFieldOffset22;
            } else {
                int i99 = i11;
                objArr = objArr3;
                int i100 = i10 + 1;
                Field p11 = p(cls, (String) objArr2[i10]);
                i24 = i99;
                if (i84 == 9 || i84 == 17) {
                    i25 = i100;
                    int i101 = i75 / 3;
                    objArr[i101 + i101 + 1] = p11.getType();
                } else {
                    if (i84 == 27) {
                        i35 = i100;
                        i36 = 1;
                        i37 = i10 + 2;
                    } else if (i84 == 49) {
                        i37 = i10 + 2;
                        i35 = i100;
                        i36 = 1;
                    } else {
                        if (i84 == 12 || i84 == 30 || i84 == 44) {
                            i25 = i100;
                            if (g6Var.a() == 1 || i86 != 0) {
                                i37 = i10 + 2;
                                int i102 = i75 / 3;
                                objArr[i102 + i102 + 1] = objArr2[i25];
                                i25 = i37;
                            }
                        } else if (i84 == 50) {
                            int i103 = i10 + 2;
                            int i104 = i73 + 1;
                            iArr[i73] = i75;
                            int i105 = i75 / 3;
                            int i106 = i105 + i105;
                            objArr[i106] = objArr2[i100];
                            if (i86 != 0) {
                                objArr[i106 + 1] = objArr2[i103];
                                i26 = i86;
                                i73 = i104;
                                i25 = i10 + 3;
                                int objectFieldOffset3 = (int) unsafe.objectFieldOffset(p11);
                                if ((charAt21 & 4096) != 0 || i84 > 17) {
                                    str = str2;
                                    i27 = i23;
                                    i28 = 0;
                                    i29 = 1048575;
                                } else {
                                    i27 = i23 + 1;
                                    int charAt23 = str2.charAt(i23);
                                    if (charAt23 >= 55296) {
                                        int i107 = charAt23 & 8191;
                                        int i108 = 13;
                                        while (true) {
                                            i34 = i27 + 1;
                                            charAt9 = str2.charAt(i27);
                                            if (charAt9 < 55296) {
                                                break;
                                            }
                                            i107 |= (charAt9 & 8191) << i108;
                                            i108 += 13;
                                            i27 = i34;
                                        }
                                        charAt23 = i107 | (charAt9 << i108);
                                        i27 = i34;
                                    }
                                    int i109 = (charAt23 / 32) + i24 + i24;
                                    Object obj3 = objArr2[i109];
                                    str = str2;
                                    if (obj3 instanceof Field) {
                                        p6 = (Field) obj3;
                                    } else {
                                        p6 = p(cls, (String) obj3);
                                        objArr2[i109] = p6;
                                    }
                                    int i110 = charAt23;
                                    i29 = (int) unsafe.objectFieldOffset(p6);
                                    i28 = i110 % 32;
                                }
                                if (i84 >= 18 || i84 > 49) {
                                    i30 = i27;
                                } else {
                                    iArr[i71] = objectFieldOffset3;
                                    i30 = i27;
                                    i71++;
                                }
                                i10 = i25;
                                i31 = i26;
                                i32 = i29;
                                i33 = objectFieldOffset3;
                            } else {
                                i73 = i104;
                                i25 = i103;
                            }
                        } else {
                            i25 = i100;
                        }
                        i26 = 0;
                        int objectFieldOffset32 = (int) unsafe.objectFieldOffset(p11);
                        if ((charAt21 & 4096) != 0) {
                        }
                        str = str2;
                        i27 = i23;
                        i28 = 0;
                        i29 = 1048575;
                        if (i84 >= 18) {
                        }
                        i30 = i27;
                        i10 = i25;
                        i31 = i26;
                        i32 = i29;
                        i33 = objectFieldOffset32;
                    }
                    int i111 = i75 / 3;
                    objArr[i111 + i111 + i36] = objArr2[i35];
                    i25 = i37;
                }
                i26 = i86;
                int objectFieldOffset322 = (int) unsafe.objectFieldOffset(p11);
                if ((charAt21 & 4096) != 0) {
                }
                str = str2;
                i27 = i23;
                i28 = 0;
                i29 = 1048575;
                if (i84 >= 18) {
                }
                i30 = i27;
                i10 = i25;
                i31 = i26;
                i32 = i29;
                i33 = objectFieldOffset322;
            }
            int i112 = i75 + 1;
            iArr2[i75] = i85;
            int i113 = i75 + 2;
            int i114 = i28;
            iArr2[i112] = ((charAt21 & 512) != 0 ? TLObject.FLAG_29 : 0) | ((charAt21 & 256) != 0 ? TLObject.FLAG_28 : 0) | (i31 != 0 ? TLObject.FLAG_31 : 0) | (i84 << 20) | i33;
            i75 += 3;
            iArr2[i113] = (i114 << 20) | i32;
            length = i22;
            i11 = i24;
            str2 = str;
            i47 = i30;
            objArr3 = objArr;
            c10 = CharacterCompat.MIN_HIGH_SURROGATE;
        }
        return new z5(iArr2, objArr3, g6Var.a, iArr, i12, r5Var, k6Var, a5Var);
    }

    public static int k(Object obj, long j10) {
        return ((Integer) s6.h(obj, j10)).intValue();
    }

    public static int l(int i9) {
        return (i9 >>> 20) & 255;
    }

    public static long n(Object obj, long j10) {
        return ((Long) s6.h(obj, j10)).longValue();
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
            StringBuilder q10 = j3.r0.q("Field ", str, " for ", name, " not found. Known fields are ");
            q10.append(arrays);
            throw new RuntimeException(q10.toString());
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
        int i9 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i9 >= iArr.length) {
                this.g.getClass();
                j6 j6Var = ((f5) obj).zzc;
                if (j6Var.d) {
                    j6Var.d = false;
                    return;
                }
                return;
            }
            int m10 = m(i9);
            int i10 = 1048575 & m10;
            int l10 = l(m10);
            long j10 = i10;
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
                            this.f.a(obj, j10);
                            break;
                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                            if (i.getObject(obj, j10) != null) {
                                throw new ClassCastException();
                            }
                            break;
                    }
                } else if (i(iArr[i9], i9, obj)) {
                    o(i9).a(i.getObject(obj, j10));
                }
                i9 += 3;
            }
            if (u(i9, obj)) {
                o(i9).a(i.getObject(obj, j10));
            }
            i9 += 3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01eb, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00db, code lost:
    
        r6 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dd, code lost:
    
        r1 = r6 + r1;
     */
    @Override // com.google.android.gms.internal.cast.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(f5 f5Var) {
        int i9;
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
                f5Var.zzc.getClass();
                return (i14 * 53) + 506991;
            }
            int m10 = m(i13);
            int i15 = 1048575 & m10;
            int l10 = l(m10);
            int i16 = iArr[i13];
            long j10 = i15;
            int i17 = 1237;
            int i18 = 37;
            switch (l10) {
                case 0:
                    i9 = i14 * 53;
                    doubleToLongBits = Double.doubleToLongBits(s6.c.a(f5Var, j10));
                    Charset charset = l5.a;
                    i14 = i9 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i10 = i14 * 53;
                    floatToIntBits = Float.floatToIntBits(s6.c.b(f5Var, j10));
                    i14 = floatToIntBits + i10;
                    break;
                case 2:
                    i9 = i14 * 53;
                    doubleToLongBits = s6.f(f5Var, j10);
                    Charset charset2 = l5.a;
                    i14 = i9 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i9 = i14 * 53;
                    doubleToLongBits = s6.f(f5Var, j10);
                    Charset charset3 = l5.a;
                    i14 = i9 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i10 = i14 * 53;
                    floatToIntBits = s6.e(f5Var, j10);
                    i14 = floatToIntBits + i10;
                    break;
                case 5:
                    i9 = i14 * 53;
                    doubleToLongBits = s6.f(f5Var, j10);
                    Charset charset4 = l5.a;
                    i14 = i9 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i10 = i14 * 53;
                    floatToIntBits = s6.e(f5Var, j10);
                    i14 = floatToIntBits + i10;
                    break;
                case 7:
                    i11 = i14 * 53;
                    boolean g10 = s6.c.g(f5Var, j10);
                    Charset charset5 = l5.a;
                    break;
                case 8:
                    i10 = i14 * 53;
                    floatToIntBits = ((String) s6.h(f5Var, j10)).hashCode();
                    i14 = floatToIntBits + i10;
                    break;
                case 9:
                    i12 = i14 * 53;
                    Object h10 = s6.h(f5Var, j10);
                    if (h10 != null) {
                        i18 = h10.hashCode();
                    }
                    i14 = i12 + i18;
                    break;
                case 10:
                    i10 = i14 * 53;
                    floatToIntBits = s6.h(f5Var, j10).hashCode();
                    i14 = floatToIntBits + i10;
                    break;
                case 11:
                    i10 = i14 * 53;
                    floatToIntBits = s6.e(f5Var, j10);
                    i14 = floatToIntBits + i10;
                    break;
                case 12:
                    i10 = i14 * 53;
                    floatToIntBits = s6.e(f5Var, j10);
                    i14 = floatToIntBits + i10;
                    break;
                case 13:
                    i10 = i14 * 53;
                    floatToIntBits = s6.e(f5Var, j10);
                    i14 = floatToIntBits + i10;
                    break;
                case 14:
                    i9 = i14 * 53;
                    doubleToLongBits = s6.f(f5Var, j10);
                    Charset charset6 = l5.a;
                    i14 = i9 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i10 = i14 * 53;
                    floatToIntBits = s6.e(f5Var, j10);
                    i14 = floatToIntBits + i10;
                    break;
                case 16:
                    i9 = i14 * 53;
                    doubleToLongBits = s6.f(f5Var, j10);
                    Charset charset7 = l5.a;
                    i14 = i9 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i12 = i14 * 53;
                    Object h11 = s6.h(f5Var, j10);
                    if (h11 != null) {
                        i18 = h11.hashCode();
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
                    i10 = i14 * 53;
                    floatToIntBits = s6.h(f5Var, j10).hashCode();
                    i14 = floatToIntBits + i10;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    i10 = i14 * 53;
                    floatToIntBits = s6.h(f5Var, j10).hashCode();
                    i14 = floatToIntBits + i10;
                    break;
                case 51:
                    if (!i(i16, i13, f5Var)) {
                        break;
                    } else {
                        i9 = i14 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) s6.h(f5Var, j10)).doubleValue());
                        Charset charset8 = l5.a;
                        i14 = i9 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!i(i16, i13, f5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) s6.h(f5Var, j10)).floatValue());
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 53:
                    if (!i(i16, i13, f5Var)) {
                        break;
                    } else {
                        i9 = i14 * 53;
                        doubleToLongBits = n(f5Var, j10);
                        Charset charset9 = l5.a;
                        i14 = i9 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!i(i16, i13, f5Var)) {
                        break;
                    } else {
                        i9 = i14 * 53;
                        doubleToLongBits = n(f5Var, j10);
                        Charset charset10 = l5.a;
                        i14 = i9 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 55:
                    if (!i(i16, i13, f5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = k(f5Var, j10);
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 56:
                    if (!i(i16, i13, f5Var)) {
                        break;
                    } else {
                        i9 = i14 * 53;
                        doubleToLongBits = n(f5Var, j10);
                        Charset charset11 = l5.a;
                        i14 = i9 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 57:
                    if (!i(i16, i13, f5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = k(f5Var, j10);
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 58:
                    if (!i(i16, i13, f5Var)) {
                        break;
                    } else {
                        i11 = i14 * 53;
                        boolean booleanValue = ((Boolean) s6.h(f5Var, j10)).booleanValue();
                        Charset charset12 = l5.a;
                        break;
                    }
                case 59:
                    if (!i(i16, i13, f5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = ((String) s6.h(f5Var, j10)).hashCode();
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 60:
                    if (!i(i16, i13, f5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = s6.h(f5Var, j10).hashCode();
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 61:
                    if (!i(i16, i13, f5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = s6.h(f5Var, j10).hashCode();
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 62:
                    if (!i(i16, i13, f5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = k(f5Var, j10);
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 63:
                    if (!i(i16, i13, f5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = k(f5Var, j10);
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 64:
                    if (!i(i16, i13, f5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = k(f5Var, j10);
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (!i(i16, i13, f5Var)) {
                        break;
                    } else {
                        i9 = i14 * 53;
                        doubleToLongBits = n(f5Var, j10);
                        Charset charset13 = l5.a;
                        i14 = i9 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!i(i16, i13, f5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = k(f5Var, j10);
                        i14 = floatToIntBits + i10;
                        break;
                    }
                case 67:
                    if (!i(i16, i13, f5Var)) {
                        break;
                    } else {
                        i9 = i14 * 53;
                        doubleToLongBits = n(f5Var, j10);
                        Charset charset14 = l5.a;
                        i14 = i9 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
                    if (!i(i16, i13, f5Var)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        floatToIntBits = s6.h(f5Var, j10).hashCode();
                        i14 = floatToIntBits + i10;
                        break;
                    }
            }
            i13 += 3;
        }
    }

    @Override // com.google.android.gms.internal.cast.h6
    public final boolean c(f5 f5Var, f5 f5Var2) {
        boolean e10;
        int i9 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i9 < iArr.length) {
                int m10 = m(i9);
                long j10 = m10 & 1048575;
                switch (l(m10)) {
                    case 0:
                        if (!t(f5Var, f5Var2, i9)) {
                            break;
                        } else {
                            r6 r6Var = s6.c;
                            if (Double.doubleToLongBits(r6Var.a(f5Var, j10)) != Double.doubleToLongBits(r6Var.a(f5Var2, j10))) {
                                break;
                            } else {
                                continue;
                                i9 += 3;
                            }
                        }
                    case 1:
                        if (!t(f5Var, f5Var2, i9)) {
                            break;
                        } else {
                            r6 r6Var2 = s6.c;
                            if (Float.floatToIntBits(r6Var2.b(f5Var, j10)) != Float.floatToIntBits(r6Var2.b(f5Var2, j10))) {
                                break;
                            } else {
                                continue;
                                i9 += 3;
                            }
                        }
                    case 2:
                        if (t(f5Var, f5Var2, i9) && s6.f(f5Var, j10) == s6.f(f5Var2, j10)) {
                            continue;
                            i9 += 3;
                        }
                        break;
                    case 3:
                        if (t(f5Var, f5Var2, i9) && s6.f(f5Var, j10) == s6.f(f5Var2, j10)) {
                            continue;
                            i9 += 3;
                        }
                        break;
                    case 4:
                        if (t(f5Var, f5Var2, i9) && s6.e(f5Var, j10) == s6.e(f5Var2, j10)) {
                            continue;
                            i9 += 3;
                        }
                        break;
                    case 5:
                        if (t(f5Var, f5Var2, i9) && s6.f(f5Var, j10) == s6.f(f5Var2, j10)) {
                            continue;
                            i9 += 3;
                        }
                        break;
                    case 6:
                        if (t(f5Var, f5Var2, i9) && s6.e(f5Var, j10) == s6.e(f5Var2, j10)) {
                            continue;
                            i9 += 3;
                        }
                        break;
                    case 7:
                        if (!t(f5Var, f5Var2, i9)) {
                            break;
                        } else {
                            r6 r6Var3 = s6.c;
                            if (r6Var3.g(f5Var, j10) != r6Var3.g(f5Var2, j10)) {
                                break;
                            } else {
                                continue;
                                i9 += 3;
                            }
                        }
                    case 8:
                        if (t(f5Var, f5Var2, i9) && i6.e(s6.h(f5Var, j10), s6.h(f5Var2, j10))) {
                            continue;
                            i9 += 3;
                        }
                        break;
                    case 9:
                        if (t(f5Var, f5Var2, i9) && i6.e(s6.h(f5Var, j10), s6.h(f5Var2, j10))) {
                            continue;
                            i9 += 3;
                        }
                        break;
                    case 10:
                        if (t(f5Var, f5Var2, i9) && i6.e(s6.h(f5Var, j10), s6.h(f5Var2, j10))) {
                            continue;
                            i9 += 3;
                        }
                        break;
                    case 11:
                        if (t(f5Var, f5Var2, i9) && s6.e(f5Var, j10) == s6.e(f5Var2, j10)) {
                            continue;
                            i9 += 3;
                        }
                        break;
                    case 12:
                        if (t(f5Var, f5Var2, i9) && s6.e(f5Var, j10) == s6.e(f5Var2, j10)) {
                            continue;
                            i9 += 3;
                        }
                        break;
                    case 13:
                        if (t(f5Var, f5Var2, i9) && s6.e(f5Var, j10) == s6.e(f5Var2, j10)) {
                            continue;
                            i9 += 3;
                        }
                        break;
                    case 14:
                        if (t(f5Var, f5Var2, i9) && s6.f(f5Var, j10) == s6.f(f5Var2, j10)) {
                            continue;
                            i9 += 3;
                        }
                        break;
                    case 15:
                        if (t(f5Var, f5Var2, i9) && s6.e(f5Var, j10) == s6.e(f5Var2, j10)) {
                            continue;
                            i9 += 3;
                        }
                        break;
                    case 16:
                        if (t(f5Var, f5Var2, i9) && s6.f(f5Var, j10) == s6.f(f5Var2, j10)) {
                            continue;
                            i9 += 3;
                        }
                        break;
                    case 17:
                        if (t(f5Var, f5Var2, i9) && i6.e(s6.h(f5Var, j10), s6.h(f5Var2, j10))) {
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
                        e10 = i6.e(s6.h(f5Var, j10), s6.h(f5Var2, j10));
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        e10 = i6.e(s6.h(f5Var, j10), s6.h(f5Var2, j10));
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
                        if (s6.e(f5Var, j11) == s6.e(f5Var2, j11) && i6.e(s6.h(f5Var, j10), s6.h(f5Var2, j10))) {
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
        int i9 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i9 >= iArr.length) {
                i6.o(this.g, obj, obj2);
                return;
            }
            int m10 = m(i9);
            int i10 = m10 & 1048575;
            int l10 = l(m10);
            int i11 = iArr[i9];
            long j10 = i10;
            switch (l10) {
                case 0:
                    if (u(i9, obj2)) {
                        r6 r6Var = s6.c;
                        obj3 = obj;
                        r6Var.e(obj3, j10, r6Var.a(obj2, j10));
                        s(i9, obj3);
                        i9 += 3;
                        obj = obj3;
                    }
                    obj3 = obj;
                    i9 += 3;
                    obj = obj3;
                case 1:
                    if (u(i9, obj2)) {
                        r6 r6Var2 = s6.c;
                        r6Var2.f(obj, j10, r6Var2.b(obj2, j10));
                        s(i9, obj);
                    }
                    obj3 = obj;
                    i9 += 3;
                    obj = obj3;
                case 2:
                    if (u(i9, obj2)) {
                        s6.k(obj, j10, s6.f(obj2, j10));
                        s(i9, obj);
                    }
                    obj3 = obj;
                    i9 += 3;
                    obj = obj3;
                case 3:
                    if (u(i9, obj2)) {
                        s6.k(obj, j10, s6.f(obj2, j10));
                        s(i9, obj);
                    }
                    obj3 = obj;
                    i9 += 3;
                    obj = obj3;
                case 4:
                    if (u(i9, obj2)) {
                        s6.j(obj, j10, s6.e(obj2, j10));
                        s(i9, obj);
                    }
                    obj3 = obj;
                    i9 += 3;
                    obj = obj3;
                case 5:
                    if (u(i9, obj2)) {
                        s6.k(obj, j10, s6.f(obj2, j10));
                        s(i9, obj);
                    }
                    obj3 = obj;
                    i9 += 3;
                    obj = obj3;
                case 6:
                    if (u(i9, obj2)) {
                        s6.j(obj, j10, s6.e(obj2, j10));
                        s(i9, obj);
                    }
                    obj3 = obj;
                    i9 += 3;
                    obj = obj3;
                case 7:
                    if (u(i9, obj2)) {
                        r6 r6Var3 = s6.c;
                        r6Var3.c(obj, j10, r6Var3.g(obj2, j10));
                        s(i9, obj);
                    }
                    obj3 = obj;
                    i9 += 3;
                    obj = obj3;
                case 8:
                    if (u(i9, obj2)) {
                        s6.l(obj, j10, s6.h(obj2, j10));
                        s(i9, obj);
                    }
                    obj3 = obj;
                    i9 += 3;
                    obj = obj3;
                case 9:
                    q(i9, obj, obj2);
                    obj3 = obj;
                    i9 += 3;
                    obj = obj3;
                case 10:
                    if (u(i9, obj2)) {
                        s6.l(obj, j10, s6.h(obj2, j10));
                        s(i9, obj);
                    }
                    obj3 = obj;
                    i9 += 3;
                    obj = obj3;
                case 11:
                    if (u(i9, obj2)) {
                        s6.j(obj, j10, s6.e(obj2, j10));
                        s(i9, obj);
                    }
                    obj3 = obj;
                    i9 += 3;
                    obj = obj3;
                case 12:
                    if (u(i9, obj2)) {
                        s6.j(obj, j10, s6.e(obj2, j10));
                        s(i9, obj);
                    }
                    obj3 = obj;
                    i9 += 3;
                    obj = obj3;
                case 13:
                    if (u(i9, obj2)) {
                        s6.j(obj, j10, s6.e(obj2, j10));
                        s(i9, obj);
                    }
                    obj3 = obj;
                    i9 += 3;
                    obj = obj3;
                case 14:
                    if (u(i9, obj2)) {
                        s6.k(obj, j10, s6.f(obj2, j10));
                        s(i9, obj);
                    }
                    obj3 = obj;
                    i9 += 3;
                    obj = obj3;
                case 15:
                    if (u(i9, obj2)) {
                        s6.j(obj, j10, s6.e(obj2, j10));
                        s(i9, obj);
                    }
                    obj3 = obj;
                    i9 += 3;
                    obj = obj3;
                case 16:
                    if (u(i9, obj2)) {
                        s6.k(obj, j10, s6.f(obj2, j10));
                        s(i9, obj);
                    }
                    obj3 = obj;
                    i9 += 3;
                    obj = obj3;
                case 17:
                    q(i9, obj, obj2);
                    obj3 = obj;
                    i9 += 3;
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
                    this.f.b(obj, j10, obj2);
                    obj3 = obj;
                    i9 += 3;
                    obj = obj3;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Class cls = i6.a;
                    Object h10 = s6.h(obj, j10);
                    Object h11 = s6.h(obj2, j10);
                    if (h10 != null) {
                        throw new ClassCastException();
                    }
                    throw aa.d.j(h11);
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (i(i11, i9, obj2)) {
                        s6.l(obj, j10, s6.h(obj2, j10));
                        s6.j(obj, iArr[i9 + 2] & 1048575, i11);
                    }
                    obj3 = obj;
                    i9 += 3;
                    obj = obj3;
                case 60:
                    r(i9, obj, obj2);
                    obj3 = obj;
                    i9 += 3;
                    obj = obj3;
                case 61:
                case 62:
                case 63:
                case 64:
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                case 66:
                case 67:
                    if (i(i11, i9, obj2)) {
                        s6.l(obj, j10, s6.h(obj2, j10));
                        s6.j(obj, iArr[i9 + 2] & 1048575, i11);
                    }
                    obj3 = obj;
                    i9 += 3;
                    obj = obj3;
                case 68:
                    r(i9, obj, obj2);
                    obj3 = obj;
                    i9 += 3;
                    obj = obj3;
                default:
                    obj3 = obj;
                    i9 += 3;
                    obj = obj3;
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.h6
    public final void e(Object obj, u5 u5Var) {
        int i9;
        z5 z5Var = this;
        Unsafe unsafe = i;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 1048575;
        int i13 = 0;
        while (true) {
            int[] iArr = z5Var.a;
            if (i11 >= iArr.length) {
                z5Var.g.getClass();
                j6 j6Var = ((f5) obj).zzc;
                return;
            }
            int m10 = z5Var.m(i11);
            int l10 = l(m10);
            int i14 = iArr[i11];
            if (l10 <= 17) {
                int i15 = iArr[i11 + 2];
                int i16 = i15 & i10;
                if (i16 != i12) {
                    i13 = i16 == i10 ? 0 : unsafe.getInt(obj, i16);
                    i12 = i16;
                }
                i9 = 1 << (i15 >>> 20);
            } else {
                i9 = 0;
            }
            long j10 = m10 & i10;
            switch (l10) {
                case 0:
                    if (z5Var.v(obj, i11, i12, i13, i9)) {
                        ((y4) u5Var.a).f(i14, Double.doubleToRawLongBits(s6.c.a(obj, j10)));
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 1:
                    if (z5Var.v(obj, i11, i12, i13, i9)) {
                        ((y4) u5Var.a).d(i14, Float.floatToRawIntBits(s6.c.b(obj, j10)));
                        break;
                    }
                    break;
                case 2:
                    if (z5Var.v(obj, i11, i12, i13, i9)) {
                        ((y4) u5Var.a).k(i14, unsafe.getLong(obj, j10));
                        break;
                    }
                    break;
                case 3:
                    if (z5Var.v(obj, i11, i12, i13, i9)) {
                        ((y4) u5Var.a).k(i14, unsafe.getLong(obj, j10));
                        break;
                    }
                    break;
                case 4:
                    if (z5Var.v(obj, i11, i12, i13, i9)) {
                        int i17 = unsafe.getInt(obj, j10);
                        y4 y4Var = (y4) u5Var.a;
                        y4Var.j(i14 << 3);
                        if (i17 >= 0) {
                            y4Var.j(i17);
                            break;
                        } else {
                            y4Var.l(i17);
                            break;
                        }
                    }
                    break;
                case 5:
                    if (z5Var.v(obj, i11, i12, i13, i9)) {
                        ((y4) u5Var.a).f(i14, unsafe.getLong(obj, j10));
                        break;
                    }
                    break;
                case 6:
                    if (z5Var.v(obj, i11, i12, i13, i9)) {
                        ((y4) u5Var.a).d(i14, unsafe.getInt(obj, j10));
                        break;
                    }
                    break;
                case 7:
                    if (z5Var.v(obj, i11, i12, i13, i9)) {
                        boolean g10 = s6.c.g(obj, j10);
                        y4 y4Var2 = (y4) u5Var.a;
                        y4Var2.j(i14 << 3);
                        y4Var2.a(g10 ? (byte) 1 : (byte) 0);
                        break;
                    }
                    break;
                case 8:
                    if (z5Var.v(obj, i11, i12, i13, i9)) {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof String) {
                            ((y4) u5Var.a).h(i14, (String) object);
                            break;
                        } else {
                            ((y4) u5Var.a).c(i14, (x4) object);
                            break;
                        }
                    }
                    break;
                case 9:
                    if (z5Var.v(obj, i11, i12, i13, i9)) {
                        u5Var.k(i14, unsafe.getObject(obj, j10), z5Var.o(i11));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 10:
                    if (z5Var.v(obj, i11, i12, i13, i9)) {
                        ((y4) u5Var.a).c(i14, (x4) unsafe.getObject(obj, j10));
                        break;
                    }
                    break;
                case 11:
                    if (z5Var.v(obj, i11, i12, i13, i9)) {
                        int i18 = unsafe.getInt(obj, j10);
                        y4 y4Var3 = (y4) u5Var.a;
                        y4Var3.j(i14 << 3);
                        y4Var3.j(i18);
                        break;
                    }
                    break;
                case 12:
                    if (z5Var.v(obj, i11, i12, i13, i9)) {
                        int i19 = unsafe.getInt(obj, j10);
                        y4 y4Var4 = (y4) u5Var.a;
                        y4Var4.j(i14 << 3);
                        if (i19 >= 0) {
                            y4Var4.j(i19);
                            break;
                        } else {
                            y4Var4.l(i19);
                            break;
                        }
                    }
                    break;
                case 13:
                    if (z5Var.v(obj, i11, i12, i13, i9)) {
                        ((y4) u5Var.a).d(i14, unsafe.getInt(obj, j10));
                        break;
                    }
                    break;
                case 14:
                    if (z5Var.v(obj, i11, i12, i13, i9)) {
                        ((y4) u5Var.a).f(i14, unsafe.getLong(obj, j10));
                        break;
                    }
                    break;
                case 15:
                    if (z5Var.v(obj, i11, i12, i13, i9)) {
                        int i20 = unsafe.getInt(obj, j10);
                        y4 y4Var5 = (y4) u5Var.a;
                        y4Var5.j(i14 << 3);
                        y4Var5.j((i20 >> 31) ^ (i20 + i20));
                        break;
                    }
                    break;
                case 16:
                    if (z5Var.v(obj, i11, i12, i13, i9)) {
                        long j11 = unsafe.getLong(obj, j10);
                        ((y4) u5Var.a).k(i14, (j11 >> 63) ^ (j11 + j11));
                        break;
                    }
                    break;
                case 17:
                    if (z5Var.v(obj, i11, i12, i13, i9)) {
                        u5Var.j(i14, unsafe.getObject(obj, j10), z5Var.o(i11));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 18:
                    i6.q(iArr[i11], (List) unsafe.getObject(obj, j10), u5Var, false);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 19:
                    i6.u(iArr[i11], (List) unsafe.getObject(obj, j10), u5Var, false);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 20:
                    i6.w(iArr[i11], (List) unsafe.getObject(obj, j10), u5Var, false);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 21:
                    i6.d(iArr[i11], (List) unsafe.getObject(obj, j10), u5Var, false);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 22:
                    i6.v(iArr[i11], (List) unsafe.getObject(obj, j10), u5Var, false);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 23:
                    i6.t(iArr[i11], (List) unsafe.getObject(obj, j10), u5Var, false);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 24:
                    i6.s(iArr[i11], (List) unsafe.getObject(obj, j10), u5Var, false);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 25:
                    i6.p(iArr[i11], (List) unsafe.getObject(obj, j10), u5Var, false);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 26:
                    int i21 = iArr[i11];
                    List list = (List) unsafe.getObject(obj, j10);
                    Class cls = i6.a;
                    if (list == null) {
                        continue;
                    } else if (!list.isEmpty()) {
                        y4 y4Var6 = (y4) u5Var.a;
                        if (list instanceof o5) {
                            o5 o5Var = (o5) list;
                            for (int i22 = 0; i22 < list.size(); i22++) {
                                Object c10 = o5Var.c(i22);
                                if (c10 instanceof String) {
                                    y4Var6.h(i21, (String) c10);
                                } else {
                                    y4Var6.c(i21, (x4) c10);
                                }
                            }
                        } else {
                            for (int i23 = 0; i23 < list.size(); i23++) {
                                y4Var6.h(i21, (String) list.get(i23));
                            }
                        }
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 27:
                    int i24 = iArr[i11];
                    List list2 = (List) unsafe.getObject(obj, j10);
                    h6 o6 = z5Var.o(i11);
                    Class cls2 = i6.a;
                    if (list2 == null) {
                        continue;
                    } else if (!list2.isEmpty()) {
                        for (int i25 = 0; i25 < list2.size(); i25++) {
                            u5Var.k(i24, list2.get(i25), o6);
                        }
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 28:
                    int i26 = iArr[i11];
                    List list3 = (List) unsafe.getObject(obj, j10);
                    Class cls3 = i6.a;
                    if (list3 == null) {
                        continue;
                    } else if (!list3.isEmpty()) {
                        u5Var.getClass();
                        for (int i27 = 0; i27 < list3.size(); i27++) {
                            ((y4) u5Var.a).c(i26, (x4) list3.get(i27));
                        }
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 29:
                    i6.c(iArr[i11], (List) unsafe.getObject(obj, j10), u5Var, false);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    i6.r(iArr[i11], (List) unsafe.getObject(obj, j10), u5Var, false);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    i6.x(iArr[i11], (List) unsafe.getObject(obj, j10), u5Var, false);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 32:
                    i6.y(iArr[i11], (List) unsafe.getObject(obj, j10), u5Var, false);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 33:
                    i6.a(iArr[i11], (List) unsafe.getObject(obj, j10), u5Var, false);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 34:
                    i6.b(iArr[i11], (List) unsafe.getObject(obj, j10), u5Var, false);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 35:
                    i6.q(iArr[i11], (List) unsafe.getObject(obj, j10), u5Var, true);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 36:
                    i6.u(iArr[i11], (List) unsafe.getObject(obj, j10), u5Var, true);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 37:
                    i6.w(iArr[i11], (List) unsafe.getObject(obj, j10), u5Var, true);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 38:
                    i6.d(iArr[i11], (List) unsafe.getObject(obj, j10), u5Var, true);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    i6.v(iArr[i11], (List) unsafe.getObject(obj, j10), u5Var, true);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    i6.t(iArr[i11], (List) unsafe.getObject(obj, j10), u5Var, true);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    i6.s(iArr[i11], (List) unsafe.getObject(obj, j10), u5Var, true);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    i6.p(iArr[i11], (List) unsafe.getObject(obj, j10), u5Var, true);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    i6.c(iArr[i11], (List) unsafe.getObject(obj, j10), u5Var, true);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    i6.r(iArr[i11], (List) unsafe.getObject(obj, j10), u5Var, true);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    i6.x(iArr[i11], (List) unsafe.getObject(obj, j10), u5Var, true);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    i6.y(iArr[i11], (List) unsafe.getObject(obj, j10), u5Var, true);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    i6.a(iArr[i11], (List) unsafe.getObject(obj, j10), u5Var, true);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 48:
                    i6.b(iArr[i11], (List) unsafe.getObject(obj, j10), u5Var, true);
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    int i28 = iArr[i11];
                    List list4 = (List) unsafe.getObject(obj, j10);
                    h6 o9 = z5Var.o(i11);
                    Class cls4 = i6.a;
                    if (list4 == null) {
                        continue;
                    } else if (!list4.isEmpty()) {
                        for (int i29 = 0; i29 < list4.size(); i29++) {
                            u5Var.j(i28, list4.get(i29), o9);
                        }
                    }
                    i11 += 3;
                    i10 = 1048575;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    if (unsafe.getObject(obj, j10) != null) {
                        int i30 = i11 / 3;
                        throw aa.d.j(z5Var.b[i30 + i30]);
                    }
                    continue;
                    i11 += 3;
                    i10 = 1048575;
                case 51:
                    if (z5Var.i(i14, i11, obj)) {
                        ((y4) u5Var.a).f(i14, Double.doubleToRawLongBits(((Double) s6.h(obj, j10)).doubleValue()));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 52:
                    if (z5Var.i(i14, i11, obj)) {
                        ((y4) u5Var.a).d(i14, Float.floatToRawIntBits(((Float) s6.h(obj, j10)).floatValue()));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 53:
                    if (z5Var.i(i14, i11, obj)) {
                        ((y4) u5Var.a).k(i14, n(obj, j10));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 54:
                    if (z5Var.i(i14, i11, obj)) {
                        ((y4) u5Var.a).k(i14, n(obj, j10));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 55:
                    if (z5Var.i(i14, i11, obj)) {
                        int k10 = k(obj, j10);
                        y4 y4Var7 = (y4) u5Var.a;
                        y4Var7.j(i14 << 3);
                        if (k10 >= 0) {
                            y4Var7.j(k10);
                        } else {
                            y4Var7.l(k10);
                        }
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 56:
                    if (z5Var.i(i14, i11, obj)) {
                        ((y4) u5Var.a).f(i14, n(obj, j10));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 57:
                    if (z5Var.i(i14, i11, obj)) {
                        ((y4) u5Var.a).d(i14, k(obj, j10));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 58:
                    if (z5Var.i(i14, i11, obj)) {
                        boolean booleanValue = ((Boolean) s6.h(obj, j10)).booleanValue();
                        y4 y4Var8 = (y4) u5Var.a;
                        y4Var8.j(i14 << 3);
                        y4Var8.a(booleanValue ? (byte) 1 : (byte) 0);
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 59:
                    if (z5Var.i(i14, i11, obj)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof String) {
                            ((y4) u5Var.a).h(i14, (String) object2);
                        } else {
                            ((y4) u5Var.a).c(i14, (x4) object2);
                        }
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 60:
                    if (z5Var.i(i14, i11, obj)) {
                        u5Var.k(i14, unsafe.getObject(obj, j10), z5Var.o(i11));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 61:
                    if (z5Var.i(i14, i11, obj)) {
                        ((y4) u5Var.a).c(i14, (x4) unsafe.getObject(obj, j10));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 62:
                    if (z5Var.i(i14, i11, obj)) {
                        int k11 = k(obj, j10);
                        y4 y4Var9 = (y4) u5Var.a;
                        y4Var9.j(i14 << 3);
                        y4Var9.j(k11);
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 63:
                    if (z5Var.i(i14, i11, obj)) {
                        int k12 = k(obj, j10);
                        y4 y4Var10 = (y4) u5Var.a;
                        y4Var10.j(i14 << 3);
                        if (k12 >= 0) {
                            y4Var10.j(k12);
                        } else {
                            y4Var10.l(k12);
                        }
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 64:
                    if (z5Var.i(i14, i11, obj)) {
                        ((y4) u5Var.a).d(i14, k(obj, j10));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (z5Var.i(i14, i11, obj)) {
                        ((y4) u5Var.a).f(i14, n(obj, j10));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 66:
                    if (z5Var.i(i14, i11, obj)) {
                        int k13 = k(obj, j10);
                        y4 y4Var11 = (y4) u5Var.a;
                        y4Var11.j(i14 << 3);
                        y4Var11.j((k13 >> 31) ^ (k13 + k13));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 67:
                    if (z5Var.i(i14, i11, obj)) {
                        long n10 = n(obj, j10);
                        ((y4) u5Var.a).k(i14, (n10 >> 63) ^ (n10 + n10));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 68:
                    if (z5Var.i(i14, i11, obj)) {
                        u5Var.j(i14, unsafe.getObject(obj, j10), z5Var.o(i11));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i10 = 1048575;
                default:
                    i11 += 3;
                    i10 = 1048575;
            }
            z5Var = this;
            i11 += 3;
            i10 = 1048575;
        }
    }

    @Override // com.google.android.gms.internal.cast.h6
    public final boolean f(Object obj) {
        int i9;
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.e) {
            int i15 = this.d[i14];
            int[] iArr = this.a;
            int i16 = iArr[i15];
            int m10 = m(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = i.getInt(obj, i18);
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
            if ((268435456 & m10) == 0 || v(obj, i10, i9, i11, i19)) {
                int l10 = l(m10);
                if (l10 == 9 || l10 == 17) {
                    if (v(obj, i10, i9, i11, i19) && !o(i10).f(s6.h(obj, m10 & 1048575))) {
                    }
                    i14++;
                    i12 = i9;
                    i13 = i11;
                } else {
                    if (l10 != 27) {
                        if (l10 == 60 || l10 == 68) {
                            if (i(i16, i10, obj) && !o(i10).f(s6.h(obj, m10 & 1048575))) {
                            }
                        } else if (l10 != 49) {
                            if (l10 == 50) {
                                s6.h(obj, m10 & 1048575).getClass();
                                throw new ClassCastException();
                            }
                        }
                        i14++;
                        i12 = i9;
                        i13 = i11;
                    }
                    List list = (List) s6.h(obj, m10 & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        h6 o6 = o(i10);
                        for (int i21 = 0; i21 < list.size(); i21++) {
                            if (o6.f(list.get(i21))) {
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

    @Override // com.google.android.gms.internal.cast.h6
    public final int g(t4 t4Var) {
        int i9;
        int i10;
        int a2;
        int o6;
        int h10;
        int o9;
        int size;
        int n10;
        int o10;
        int o11;
        int o12;
        int o13;
        int o14;
        int i11;
        int i12;
        z5 z5Var = this;
        t4 t4Var2 = t4Var;
        Unsafe unsafe = i;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int[] iArr = z5Var.a;
            if (i14 >= iArr.length) {
                z5Var.g.getClass();
                j6 j6Var = ((f5) t4Var).zzc;
                int i18 = j6Var.c;
                if (i18 == -1) {
                    j6Var.c = 0;
                    i9 = 0;
                } else {
                    i9 = i18;
                }
                return i9 + i17;
            }
            int m10 = z5Var.m(i14);
            int l10 = l(m10);
            int i19 = iArr[i14];
            int i20 = iArr[i14 + 2];
            int i21 = i20 & i13;
            if (l10 <= 17) {
                if (i21 != i15) {
                    i16 = i21 == i13 ? 0 : unsafe.getInt(t4Var2, i21);
                    i15 = i21;
                }
                i10 = 1 << (i20 >>> 20);
            } else {
                i10 = 0;
            }
            int i22 = m10 & i13;
            if (l10 >= c5.b.a) {
                c5.c.getClass();
            }
            long j10 = i22;
            switch (l10) {
                case 0:
                    if (z5Var.v(t4Var2, i14, i15, i16, i10)) {
                        i17 = aa.d.x(i19 << 3, 8, i17);
                    }
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 1:
                    if (z5Var.v(t4Var2, i14, i15, i16, i10)) {
                        i17 = aa.d.x(i19 << 3, 4, i17);
                    }
                    z5Var = this;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 2:
                    if (z5Var.v(t4Var2, i14, i15, i16, i10)) {
                        i17 = aa.d.x(i19 << 3, y4.p(unsafe.getLong(t4Var2, j10)), i17);
                    }
                    z5Var = this;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 3:
                    if (z5Var.v(t4Var2, i14, i15, i16, i10)) {
                        i17 = aa.d.x(i19 << 3, y4.p(unsafe.getLong(t4Var2, j10)), i17);
                    }
                    z5Var = this;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 4:
                    if (z5Var.v(t4Var2, i14, i15, i16, i10)) {
                        i17 = aa.d.x(i19 << 3, y4.m(unsafe.getInt(t4Var2, j10)), i17);
                    }
                    z5Var = this;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 5:
                    if (z5Var.v(t4Var2, i14, i15, i16, i10)) {
                        i17 = aa.d.x(i19 << 3, 8, i17);
                    }
                    z5Var = this;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 6:
                    if (z5Var.v(t4Var2, i14, i15, i16, i10)) {
                        i17 = aa.d.x(i19 << 3, 4, i17);
                    }
                    z5Var = this;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 7:
                    if (z5Var.v(t4Var2, i14, i15, i16, i10)) {
                        i17 = aa.d.x(i19 << 3, 1, i17);
                    }
                    z5Var = this;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 8:
                    if (z5Var.v(t4Var2, i14, i15, i16, i10)) {
                        int i23 = i19 << 3;
                        Object object = unsafe.getObject(t4Var2, j10);
                        if (object instanceof x4) {
                            Logger logger = y4.e;
                            int o15 = ((x4) object).o();
                            i17 = aa.d.x(i23, y4.o(o15) + o15, i17);
                        } else {
                            i17 = aa.d.x(i23, y4.n((String) object), i17);
                        }
                    }
                    z5Var = this;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 9:
                    if (z5Var.v(t4Var2, i14, i15, i16, i10)) {
                        Object object2 = unsafe.getObject(t4Var2, j10);
                        h6 o16 = z5Var.o(i14);
                        Class cls = i6.a;
                        Logger logger2 = y4.e;
                        int a3 = ((t4) object2).a(o16);
                        i17 = aa.d.x(i19 << 3, y4.o(a3) + a3, i17);
                    }
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 10:
                    if (z5Var.v(t4Var2, i14, i15, i16, i10)) {
                        x4 x4Var = (x4) unsafe.getObject(t4Var2, j10);
                        Logger logger3 = y4.e;
                        int o17 = x4Var.o();
                        i17 = aa.d.x(i19 << 3, y4.o(o17) + o17, i17);
                    }
                    z5Var = this;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 11:
                    if (z5Var.v(t4Var2, i14, i15, i16, i10)) {
                        i17 = aa.d.x(i19 << 3, y4.o(unsafe.getInt(t4Var2, j10)), i17);
                    }
                    z5Var = this;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 12:
                    if (z5Var.v(t4Var2, i14, i15, i16, i10)) {
                        i17 = aa.d.x(i19 << 3, y4.m(unsafe.getInt(t4Var2, j10)), i17);
                    }
                    z5Var = this;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 13:
                    if (z5Var.v(t4Var2, i14, i15, i16, i10)) {
                        i17 = aa.d.x(i19 << 3, 4, i17);
                    }
                    z5Var = this;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 14:
                    if (z5Var.v(t4Var2, i14, i15, i16, i10)) {
                        i17 = aa.d.x(i19 << 3, 8, i17);
                    }
                    z5Var = this;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 15:
                    if (z5Var.v(t4Var2, i14, i15, i16, i10)) {
                        int i24 = unsafe.getInt(t4Var2, j10);
                        i17 = aa.d.x((i24 >> 31) ^ (i24 + i24), y4.o(i19 << 3), i17);
                    }
                    z5Var = this;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 16:
                    if (z5Var.v(t4Var2, i14, i15, i16, i10)) {
                        long j11 = unsafe.getLong(t4Var2, j10);
                        i17 += y4.p((j11 >> 63) ^ (j11 + j11)) + y4.o(i19 << 3);
                    }
                    z5Var = this;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 17:
                    if (z5Var.v(t4Var2, i14, i15, i16, i10)) {
                        t4 t4Var3 = (t4) unsafe.getObject(t4Var2, j10);
                        h6 o18 = z5Var.o(i14);
                        Logger logger4 = y4.e;
                        a2 = t4Var3.a(o18);
                        o6 = y4.o(i19 << 3);
                        i11 = o6 + o6;
                        i17 += i11 + a2;
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    } else {
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    }
                case 18:
                    h10 = i6.h(i19, (List) unsafe.getObject(t4Var2, j10));
                    i17 += h10;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 19:
                    h10 = i6.g(i19, (List) unsafe.getObject(t4Var2, j10));
                    i17 += h10;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(t4Var2, j10);
                    Class cls2 = i6.a;
                    if (list.size() != 0) {
                        o9 = (y4.o(i19 << 3) * list.size()) + i6.j(list);
                        i17 += o9;
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    }
                    o9 = 0;
                    i17 += o9;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(t4Var2, j10);
                    Class cls3 = i6.a;
                    size = list2.size();
                    if (size != 0) {
                        n10 = i6.n(list2);
                        o10 = y4.o(i19 << 3);
                        o11 = (o10 * size) + n10;
                        i17 += o11;
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    }
                    o11 = 0;
                    i17 += o11;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(t4Var2, j10);
                    Class cls4 = i6.a;
                    size = list3.size();
                    if (size != 0) {
                        n10 = i6.i(list3);
                        o10 = y4.o(i19 << 3);
                        o11 = (o10 * size) + n10;
                        i17 += o11;
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    }
                    o11 = 0;
                    i17 += o11;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 23:
                    h10 = i6.h(i19, (List) unsafe.getObject(t4Var2, j10));
                    i17 += h10;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 24:
                    h10 = i6.g(i19, (List) unsafe.getObject(t4Var2, j10));
                    i17 += h10;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(t4Var2, j10);
                    Class cls5 = i6.a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        o9 = (y4.o(i19 << 3) + 1) * size2;
                        i17 += o9;
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    }
                    o9 = 0;
                    i17 += o9;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(t4Var2, j10);
                    Class cls6 = i6.a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        boolean z10 = list5 instanceof o5;
                        o11 = y4.o(i19 << 3) * size3;
                        if (z10) {
                            o5 o5Var = (o5) list5;
                            for (int i25 = 0; i25 < size3; i25++) {
                                Object c10 = o5Var.c(i25);
                                if (c10 instanceof x4) {
                                    int o19 = ((x4) c10).o();
                                    o11 = aa.d.x(o19, o19, o11);
                                } else {
                                    o11 = y4.n((String) c10) + o11;
                                }
                            }
                        } else {
                            for (int i26 = 0; i26 < size3; i26++) {
                                Object obj = list5.get(i26);
                                if (obj instanceof x4) {
                                    int o20 = ((x4) obj).o();
                                    o11 = aa.d.x(o20, o20, o11);
                                } else {
                                    o11 = y4.n((String) obj) + o11;
                                }
                            }
                        }
                        i17 += o11;
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    }
                    o11 = 0;
                    i17 += o11;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(t4Var2, j10);
                    h6 o21 = z5Var.o(i14);
                    Class cls7 = i6.a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        o12 = 0;
                    } else {
                        o12 = y4.o(i19 << 3) * size4;
                        for (int i27 = 0; i27 < size4; i27++) {
                            int a10 = ((t4) list6.get(i27)).a(o21);
                            o12 = aa.d.x(a10, a10, o12);
                        }
                    }
                    i17 += o12;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(t4Var2, j10);
                    Class cls8 = i6.a;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        o11 = y4.o(i19 << 3) * size5;
                        for (int i28 = 0; i28 < list7.size(); i28++) {
                            int o22 = ((x4) list7.get(i28)).o();
                            o11 = aa.d.x(o22, o22, o11);
                        }
                        i17 += o11;
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    }
                    o11 = 0;
                    i17 += o11;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(t4Var2, j10);
                    Class cls9 = i6.a;
                    size = list8.size();
                    if (size != 0) {
                        n10 = i6.m(list8);
                        o10 = y4.o(i19 << 3);
                        o11 = (o10 * size) + n10;
                        i17 += o11;
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    }
                    o11 = 0;
                    i17 += o11;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    List list9 = (List) unsafe.getObject(t4Var2, j10);
                    Class cls10 = i6.a;
                    size = list9.size();
                    if (size != 0) {
                        n10 = i6.f(list9);
                        o10 = y4.o(i19 << 3);
                        o11 = (o10 * size) + n10;
                        i17 += o11;
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    }
                    o11 = 0;
                    i17 += o11;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    h10 = i6.g(i19, (List) unsafe.getObject(t4Var2, j10));
                    i17 += h10;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 32:
                    h10 = i6.h(i19, (List) unsafe.getObject(t4Var2, j10));
                    i17 += h10;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(t4Var2, j10);
                    Class cls11 = i6.a;
                    size = list10.size();
                    if (size != 0) {
                        n10 = i6.k(list10);
                        o10 = y4.o(i19 << 3);
                        o11 = (o10 * size) + n10;
                        i17 += o11;
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    }
                    o11 = 0;
                    i17 += o11;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(t4Var2, j10);
                    Class cls12 = i6.a;
                    size = list11.size();
                    if (size != 0) {
                        n10 = i6.l(list11);
                        o10 = y4.o(i19 << 3);
                        o11 = (o10 * size) + n10;
                        i17 += o11;
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    }
                    o11 = 0;
                    i17 += o11;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 35:
                    List list12 = (List) unsafe.getObject(t4Var2, j10);
                    Class cls13 = i6.a;
                    a2 = list12.size() * 8;
                    if (a2 > 0) {
                        o13 = y4.o(a2);
                        o14 = y4.o(i19 << 3);
                        i11 = o14 + o13;
                        i17 += i11 + a2;
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    } else {
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(t4Var2, j10);
                    Class cls14 = i6.a;
                    a2 = list13.size() * 4;
                    if (a2 > 0) {
                        o13 = y4.o(a2);
                        o14 = y4.o(i19 << 3);
                        i11 = o14 + o13;
                        i17 += i11 + a2;
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    } else {
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    }
                case 37:
                    a2 = i6.j((List) unsafe.getObject(t4Var2, j10));
                    if (a2 > 0) {
                        o13 = y4.o(a2);
                        o14 = y4.o(i19 << 3);
                        i11 = o14 + o13;
                        i17 += i11 + a2;
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    } else {
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    }
                case 38:
                    a2 = i6.n((List) unsafe.getObject(t4Var2, j10));
                    if (a2 > 0) {
                        o13 = y4.o(a2);
                        o14 = y4.o(i19 << 3);
                        i11 = o14 + o13;
                        i17 += i11 + a2;
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    } else {
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    }
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    a2 = i6.i((List) unsafe.getObject(t4Var2, j10));
                    if (a2 > 0) {
                        o13 = y4.o(a2);
                        o14 = y4.o(i19 << 3);
                        i11 = o14 + o13;
                        i17 += i11 + a2;
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    } else {
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    }
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    List list14 = (List) unsafe.getObject(t4Var2, j10);
                    Class cls15 = i6.a;
                    a2 = list14.size() * 8;
                    if (a2 > 0) {
                        o13 = y4.o(a2);
                        o14 = y4.o(i19 << 3);
                        i11 = o14 + o13;
                        i17 += i11 + a2;
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    } else {
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    }
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    List list15 = (List) unsafe.getObject(t4Var2, j10);
                    Class cls16 = i6.a;
                    a2 = list15.size() * 4;
                    if (a2 > 0) {
                        o13 = y4.o(a2);
                        o14 = y4.o(i19 << 3);
                        i11 = o14 + o13;
                        i17 += i11 + a2;
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    } else {
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    }
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    List list16 = (List) unsafe.getObject(t4Var2, j10);
                    Class cls17 = i6.a;
                    a2 = list16.size();
                    if (a2 > 0) {
                        o13 = y4.o(a2);
                        o14 = y4.o(i19 << 3);
                        i11 = o14 + o13;
                        i17 += i11 + a2;
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    } else {
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    a2 = i6.m((List) unsafe.getObject(t4Var2, j10));
                    if (a2 > 0) {
                        o13 = y4.o(a2);
                        o14 = y4.o(i19 << 3);
                        i11 = o14 + o13;
                        i17 += i11 + a2;
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    } else {
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    a2 = i6.f((List) unsafe.getObject(t4Var2, j10));
                    if (a2 > 0) {
                        o13 = y4.o(a2);
                        o14 = y4.o(i19 << 3);
                        i11 = o14 + o13;
                        i17 += i11 + a2;
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    } else {
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    List list17 = (List) unsafe.getObject(t4Var2, j10);
                    Class cls18 = i6.a;
                    a2 = list17.size() * 4;
                    if (a2 > 0) {
                        o13 = y4.o(a2);
                        o14 = y4.o(i19 << 3);
                        i11 = o14 + o13;
                        i17 += i11 + a2;
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    } else {
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    List list18 = (List) unsafe.getObject(t4Var2, j10);
                    Class cls19 = i6.a;
                    a2 = list18.size() * 8;
                    if (a2 > 0) {
                        o13 = y4.o(a2);
                        o14 = y4.o(i19 << 3);
                        i11 = o14 + o13;
                        i17 += i11 + a2;
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    } else {
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    }
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    a2 = i6.k((List) unsafe.getObject(t4Var2, j10));
                    if (a2 > 0) {
                        o13 = y4.o(a2);
                        o14 = y4.o(i19 << 3);
                        i11 = o14 + o13;
                        i17 += i11 + a2;
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    } else {
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    }
                case 48:
                    a2 = i6.l((List) unsafe.getObject(t4Var2, j10));
                    if (a2 > 0) {
                        o13 = y4.o(a2);
                        o14 = y4.o(i19 << 3);
                        i11 = o14 + o13;
                        i17 += i11 + a2;
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    } else {
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    }
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    List list19 = (List) unsafe.getObject(t4Var2, j10);
                    h6 o23 = z5Var.o(i14);
                    Class cls20 = i6.a;
                    int size6 = list19.size();
                    if (size6 == 0) {
                        i12 = 0;
                    } else {
                        i12 = 0;
                        for (int i29 = 0; i29 < size6; i29++) {
                            t4 t4Var4 = (t4) list19.get(i29);
                            Logger logger5 = y4.e;
                            int a11 = t4Var4.a(o23);
                            int o24 = y4.o(i19 << 3);
                            i12 += o24 + o24 + a11;
                        }
                    }
                    i17 += i12;
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Object object3 = unsafe.getObject(t4Var2, j10);
                    int i30 = i14 / 3;
                    Object obj2 = z5Var.b[i30 + i30];
                    if (object3 == null) {
                        throw aa.d.j(obj2);
                    }
                    throw new ClassCastException();
                case 51:
                    if (z5Var.i(i19, i14, t4Var2)) {
                        i17 = aa.d.x(i19 << 3, 8, i17);
                    }
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 52:
                    if (z5Var.i(i19, i14, t4Var2)) {
                        i17 = aa.d.x(i19 << 3, 4, i17);
                    }
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 53:
                    if (z5Var.i(i19, i14, t4Var2)) {
                        i17 = aa.d.x(i19 << 3, y4.p(n(t4Var2, j10)), i17);
                    }
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 54:
                    if (z5Var.i(i19, i14, t4Var2)) {
                        i17 = aa.d.x(i19 << 3, y4.p(n(t4Var2, j10)), i17);
                    }
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 55:
                    if (z5Var.i(i19, i14, t4Var2)) {
                        i17 = aa.d.x(i19 << 3, y4.m(k(t4Var2, j10)), i17);
                    }
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 56:
                    if (z5Var.i(i19, i14, t4Var2)) {
                        i17 = aa.d.x(i19 << 3, 8, i17);
                    }
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 57:
                    if (z5Var.i(i19, i14, t4Var2)) {
                        i17 = aa.d.x(i19 << 3, 4, i17);
                    }
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 58:
                    if (z5Var.i(i19, i14, t4Var2)) {
                        i17 = aa.d.x(i19 << 3, 1, i17);
                    }
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 59:
                    if (z5Var.i(i19, i14, t4Var2)) {
                        int i31 = i19 << 3;
                        Object object4 = unsafe.getObject(t4Var2, j10);
                        if (object4 instanceof x4) {
                            Logger logger6 = y4.e;
                            int o25 = ((x4) object4).o();
                            i17 = aa.d.x(i31, y4.o(o25) + o25, i17);
                        } else {
                            i17 = aa.d.x(i31, y4.n((String) object4), i17);
                        }
                    }
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 60:
                    if (z5Var.i(i19, i14, t4Var2)) {
                        Object object5 = unsafe.getObject(t4Var2, j10);
                        h6 o26 = z5Var.o(i14);
                        Class cls21 = i6.a;
                        Logger logger7 = y4.e;
                        int a12 = ((t4) object5).a(o26);
                        i17 = aa.d.x(i19 << 3, y4.o(a12) + a12, i17);
                    }
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 61:
                    if (z5Var.i(i19, i14, t4Var2)) {
                        x4 x4Var2 = (x4) unsafe.getObject(t4Var2, j10);
                        Logger logger8 = y4.e;
                        int o27 = x4Var2.o();
                        i17 = aa.d.x(i19 << 3, y4.o(o27) + o27, i17);
                    }
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 62:
                    if (z5Var.i(i19, i14, t4Var2)) {
                        i17 = aa.d.x(i19 << 3, y4.o(k(t4Var2, j10)), i17);
                    }
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 63:
                    if (z5Var.i(i19, i14, t4Var2)) {
                        i17 = aa.d.x(i19 << 3, y4.m(k(t4Var2, j10)), i17);
                    }
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 64:
                    if (z5Var.i(i19, i14, t4Var2)) {
                        i17 = aa.d.x(i19 << 3, 4, i17);
                    }
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (z5Var.i(i19, i14, t4Var2)) {
                        i17 = aa.d.x(i19 << 3, 8, i17);
                    }
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 66:
                    if (z5Var.i(i19, i14, t4Var2)) {
                        int k10 = k(t4Var2, j10);
                        i17 = aa.d.x((k10 >> 31) ^ (k10 + k10), y4.o(i19 << 3), i17);
                    }
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
                case 67:
                    if (z5Var.i(i19, i14, t4Var2)) {
                        long n11 = n(t4Var2, j10);
                        a2 = y4.o(i19 << 3);
                        i11 = y4.p((n11 >> 63) ^ (n11 + n11));
                        i17 += i11 + a2;
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    } else {
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    }
                case 68:
                    if (z5Var.i(i19, i14, t4Var2)) {
                        t4 t4Var5 = (t4) unsafe.getObject(t4Var2, j10);
                        h6 o28 = z5Var.o(i14);
                        Logger logger9 = y4.e;
                        a2 = t4Var5.a(o28);
                        o6 = y4.o(i19 << 3);
                        i11 = o6 + o6;
                        i17 += i11 + a2;
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    } else {
                        i14 += 3;
                        t4Var2 = t4Var;
                        i13 = 1048575;
                    }
                default:
                    i14 += 3;
                    t4Var2 = t4Var;
                    i13 = 1048575;
            }
        }
    }

    public final boolean i(int i9, int i10, Object obj) {
        return s6.e(obj, (long) (this.a[i10 + 2] & 1048575)) == i9;
    }

    public final int m(int i9) {
        return this.a[i9 + 1];
    }

    public final h6 o(int i9) {
        int i10 = i9 / 3;
        int i11 = i10 + i10;
        Object[] objArr = this.b;
        h6 h6Var = (h6) objArr[i11];
        if (h6Var != null) {
            return h6Var;
        }
        h6 a2 = e6.c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a2;
        return a2;
    }

    public final void q(int i9, Object obj, Object obj2) {
        if (u(i9, obj2)) {
            int m10 = m(i9) & 1048575;
            Unsafe unsafe = i;
            long j10 = m10;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i9] + " is present but null: " + obj2.toString());
            }
            h6 o6 = o(i9);
            if (!u(i9, obj)) {
                if (h(object)) {
                    f5 zzc = o6.zzc();
                    o6.d(zzc, object);
                    unsafe.putObject(obj, j10, zzc);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                s(i9, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!h(object2)) {
                f5 zzc2 = o6.zzc();
                o6.d(zzc2, object2);
                unsafe.putObject(obj, j10, zzc2);
                object2 = zzc2;
            }
            o6.d(object2, object);
        }
    }

    public final void r(int i9, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i10 = iArr[i9];
        if (i(i10, i9, obj2)) {
            int m10 = m(i9) & 1048575;
            Unsafe unsafe = i;
            long j10 = m10;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i9] + " is present but null: " + obj2.toString());
            }
            h6 o6 = o(i9);
            if (!i(i10, i9, obj)) {
                if (h(object)) {
                    f5 zzc = o6.zzc();
                    o6.d(zzc, object);
                    unsafe.putObject(obj, j10, zzc);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                s6.j(obj, iArr[i9 + 2] & 1048575, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!h(object2)) {
                f5 zzc2 = o6.zzc();
                o6.d(zzc2, object2);
                unsafe.putObject(obj, j10, zzc2);
                object2 = zzc2;
            }
            o6.d(object2, object);
        }
    }

    public final void s(int i9, Object obj) {
        int i10 = this.a[i9 + 2];
        long j10 = 1048575 & i10;
        if (j10 == 1048575) {
            return;
        }
        s6.j(obj, j10, (1 << (i10 >>> 20)) | s6.e(obj, j10));
    }

    public final boolean t(f5 f5Var, f5 f5Var2, int i9) {
        return u(i9, f5Var) == u(i9, f5Var2);
    }

    public final boolean u(int i9, Object obj) {
        int i10 = this.a[i9 + 2];
        long j10 = i10 & 1048575;
        if (j10 == 1048575) {
            int m10 = m(i9);
            long j11 = m10 & 1048575;
            switch (l(m10)) {
                case 0:
                    if (Double.doubleToRawLongBits(s6.c.a(obj, j11)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(s6.c.b(obj, j11)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (s6.f(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (s6.f(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (s6.e(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (s6.f(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (s6.e(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return s6.c.g(obj, j11);
                case 8:
                    Object h10 = s6.h(obj, j11);
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
                    if (s6.h(obj, j11) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (x4.c.equals(s6.h(obj, j11))) {
                        return false;
                    }
                    break;
                case 11:
                    if (s6.e(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (s6.e(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (s6.e(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (s6.f(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (s6.e(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (s6.f(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (s6.h(obj, j11) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & s6.e(obj, j10)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean v(Object obj, int i9, int i10, int i11, int i12) {
        return i10 == 1048575 ? u(i9, obj) : (i11 & i12) != 0;
    }

    @Override // com.google.android.gms.internal.cast.h6
    public final f5 zzc() {
        return (f5) ((f5) this.c).h(4, null);
    }
}
