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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class b6 implements j6 {
    public static final int[] h = new int[0];
    public static final Unsafe i = u6.i();
    public final int[] a;
    public final Object[] b;
    public final v4 c;
    public final int[] d;
    public final int e;
    public final t5 f;
    public final m6 g;

    public b6(int[] iArr, Object[] objArr, v4 v4Var, int[] iArr2, int i10, t5 t5Var, m6 m6Var, c5 c5Var) {
        this.a = iArr;
        this.b = objArr;
        this.d = iArr2;
        this.e = i10;
        this.f = t5Var;
        this.g = m6Var;
        this.c = v4Var;
    }

    public static boolean h(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof h5) {
            return ((h5) obj).g();
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
    public static b6 j(i6 i6Var, t5 t5Var, m6 m6Var, c5 c5Var) {
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
        String str;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        Field p5;
        int i35;
        char charAt9;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        Object obj;
        Field p10;
        Object obj2;
        Field p11;
        int i42;
        char charAt10;
        int i43;
        int i44;
        char charAt11;
        int i45;
        char charAt12;
        int i46;
        char charAt13;
        if (!(i6Var instanceof i6)) {
            i6Var.getClass();
            throw new ClassCastException();
        }
        String str2 = i6Var.b;
        int length = str2.length();
        char charAt14 = str2.charAt(0);
        char c10 = CharacterCompat.MIN_HIGH_SURROGATE;
        if (charAt14 >= 55296) {
            int i47 = 1;
            while (true) {
                i10 = i47 + 1;
                if (str2.charAt(i47) < 55296) {
                    break;
                }
                i47 = i10;
            }
        } else {
            i10 = 1;
        }
        int i48 = i10 + 1;
        int charAt15 = str2.charAt(i10);
        if (charAt15 >= 55296) {
            int i49 = charAt15 & 8191;
            int i50 = 13;
            while (true) {
                i46 = i48 + 1;
                charAt13 = str2.charAt(i48);
                if (charAt13 < 55296) {
                    break;
                }
                i49 |= (charAt13 & 8191) << i50;
                i50 += 13;
                i48 = i46;
            }
            charAt15 = i49 | (charAt13 << i50);
            i48 = i46;
        }
        if (charAt15 == 0) {
            iArr = h;
            i12 = 0;
            charAt = 0;
            charAt2 = 0;
            i11 = 0;
            i13 = 0;
        } else {
            int i51 = i48 + 1;
            int charAt16 = str2.charAt(i48);
            if (charAt16 >= 55296) {
                int i52 = charAt16 & 8191;
                int i53 = 13;
                while (true) {
                    i21 = i51 + 1;
                    charAt8 = str2.charAt(i51);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i52 |= (charAt8 & 8191) << i53;
                    i53 += 13;
                    i51 = i21;
                }
                charAt16 = i52 | (charAt8 << i53);
                i51 = i21;
            }
            int i54 = i51 + 1;
            int charAt17 = str2.charAt(i51);
            if (charAt17 >= 55296) {
                int i55 = charAt17 & 8191;
                int i56 = 13;
                while (true) {
                    i20 = i54 + 1;
                    charAt7 = str2.charAt(i54);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i55 |= (charAt7 & 8191) << i56;
                    i56 += 13;
                    i54 = i20;
                }
                charAt17 = i55 | (charAt7 << i56);
                i54 = i20;
            }
            int i57 = i54 + 1;
            if (str2.charAt(i54) >= 55296) {
                while (true) {
                    i19 = i57 + 1;
                    if (str2.charAt(i57) < 55296) {
                        break;
                    }
                    i57 = i19;
                }
                i57 = i19;
            }
            int i58 = i57 + 1;
            if (str2.charAt(i57) >= 55296) {
                while (true) {
                    i18 = i58 + 1;
                    if (str2.charAt(i58) < 55296) {
                        break;
                    }
                    i58 = i18;
                }
                i58 = i18;
            }
            int i59 = i58 + 1;
            charAt = str2.charAt(i58);
            if (charAt >= 55296) {
                int i60 = charAt & 8191;
                int i61 = 13;
                while (true) {
                    i17 = i59 + 1;
                    charAt6 = str2.charAt(i59);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i60 |= (charAt6 & 8191) << i61;
                    i61 += 13;
                    i59 = i17;
                }
                charAt = i60 | (charAt6 << i61);
                i59 = i17;
            }
            int i62 = i59 + 1;
            charAt2 = str2.charAt(i59);
            if (charAt2 >= 55296) {
                int i63 = charAt2 & 8191;
                int i64 = 13;
                while (true) {
                    i16 = i62 + 1;
                    charAt5 = str2.charAt(i62);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i63 |= (charAt5 & 8191) << i64;
                    i64 += 13;
                    i62 = i16;
                }
                charAt2 = i63 | (charAt5 << i64);
                i62 = i16;
            }
            int i65 = i62 + 1;
            int charAt18 = str2.charAt(i62);
            if (charAt18 >= 55296) {
                int i66 = charAt18 & 8191;
                int i67 = 13;
                while (true) {
                    i15 = i65 + 1;
                    charAt4 = str2.charAt(i65);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i66 |= (charAt4 & 8191) << i67;
                    i67 += 13;
                    i65 = i15;
                }
                charAt18 = i66 | (charAt4 << i67);
                i65 = i15;
            }
            int i68 = i65 + 1;
            int charAt19 = str2.charAt(i65);
            if (charAt19 >= 55296) {
                int i69 = charAt19 & 8191;
                int i70 = 13;
                while (true) {
                    i14 = i68 + 1;
                    charAt3 = str2.charAt(i68);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i69 |= (charAt3 & 8191) << i70;
                    i70 += 13;
                    i68 = i14;
                }
                charAt19 = i69 | (charAt3 << i70);
                i68 = i14;
            }
            int i71 = charAt19 + charAt2 + charAt18;
            i11 = charAt16 + charAt16 + charAt17;
            i12 = charAt16;
            i48 = i68;
            iArr = new int[i71];
            i13 = charAt19;
        }
        Unsafe unsafe = i;
        Object[] objArr2 = i6Var.c;
        Class<?> cls = i6Var.a.getClass();
        int i72 = charAt2 + i13;
        int i73 = charAt + charAt;
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr3 = new Object[i73];
        int i74 = i13;
        int i75 = 0;
        int i76 = 0;
        while (i48 < length) {
            int i77 = i48 + 1;
            int charAt20 = str2.charAt(i48);
            if (charAt20 >= c10) {
                int i78 = charAt20 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i45 = i79 + 1;
                    charAt12 = str2.charAt(i79);
                    if (charAt12 < c10) {
                        break;
                    }
                    i78 |= (charAt12 & 8191) << i80;
                    i80 += 13;
                    i79 = i45;
                }
                charAt20 = i78 | (charAt12 << i80);
                i22 = i45;
            } else {
                i22 = i77;
            }
            int i81 = i22 + 1;
            int charAt21 = str2.charAt(i22);
            if (charAt21 >= c10) {
                int i82 = charAt21 & 8191;
                int i83 = i81;
                int i84 = 13;
                while (true) {
                    i44 = i83 + 1;
                    charAt11 = str2.charAt(i83);
                    i23 = length;
                    if (charAt11 < 55296) {
                        break;
                    }
                    i82 |= (charAt11 & 8191) << i84;
                    i84 += 13;
                    i83 = i44;
                    length = i23;
                }
                charAt21 = i82 | (charAt11 << i84);
                i24 = i44;
            } else {
                i23 = length;
                i24 = i81;
            }
            if ((charAt21 & 1024) != 0) {
                iArr[i75] = i76;
                i75++;
            }
            int i85 = charAt21 & 255;
            int i86 = charAt20;
            int i87 = charAt21 & 2048;
            if (i85 >= 51) {
                int i88 = i24 + 1;
                int charAt22 = str2.charAt(i24);
                if (charAt22 >= 55296) {
                    int i89 = charAt22 & 8191;
                    int i90 = i88;
                    int i91 = 13;
                    while (true) {
                        i42 = i90 + 1;
                        charAt10 = str2.charAt(i90);
                        i43 = i89;
                        if (charAt10 < 55296) {
                            break;
                        }
                        i89 = i43 | ((charAt10 & 8191) << i91);
                        i91 += 13;
                        i90 = i42;
                    }
                    charAt22 = i43 | (charAt10 << i91);
                    i39 = i42;
                } else {
                    i39 = i88;
                }
                int i92 = charAt22;
                int i93 = i85 - 51;
                i31 = i39;
                if (i93 == 9 || i93 == 17) {
                    i40 = i11 + 1;
                    int i94 = i76 / 3;
                    objArr3[i94 + i94 + 1] = objArr2[i11];
                } else {
                    if (i93 == 12) {
                        if (i6Var.a() == 1 || i87 != 0) {
                            i40 = i11 + 1;
                            int i95 = i76 / 3;
                            objArr3[i95 + i95 + 1] = objArr2[i11];
                        } else {
                            i41 = 0;
                            int i96 = i92 + i92;
                            obj = objArr2[i96];
                            int i97 = i41;
                            if (obj instanceof Field) {
                                p10 = (Field) obj;
                            } else {
                                p10 = p(cls, (String) obj);
                                objArr2[i96] = p10;
                            }
                            int i98 = i12;
                            objArr = objArr3;
                            int objectFieldOffset = (int) unsafe.objectFieldOffset(p10);
                            int i99 = i96 + 1;
                            obj2 = objArr2[i99];
                            if (obj2 instanceof Field) {
                                p11 = (Field) obj2;
                            } else {
                                p11 = p(cls, (String) obj2);
                                objArr2[i99] = p11;
                            }
                            str = str2;
                            i32 = i97;
                            i29 = 0;
                            i25 = i98;
                            i33 = (int) unsafe.objectFieldOffset(p11);
                            i34 = objectFieldOffset;
                        }
                    }
                    i41 = i87;
                    int i962 = i92 + i92;
                    obj = objArr2[i962];
                    int i972 = i41;
                    if (obj instanceof Field) {
                    }
                    int i982 = i12;
                    objArr = objArr3;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(p10);
                    int i992 = i962 + 1;
                    obj2 = objArr2[i992];
                    if (obj2 instanceof Field) {
                    }
                    str = str2;
                    i32 = i972;
                    i29 = 0;
                    i25 = i982;
                    i33 = (int) unsafe.objectFieldOffset(p11);
                    i34 = objectFieldOffset2;
                }
                i11 = i40;
                i41 = i87;
                int i9622 = i92 + i92;
                obj = objArr2[i9622];
                int i9722 = i41;
                if (obj instanceof Field) {
                }
                int i9822 = i12;
                objArr = objArr3;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(p10);
                int i9922 = i9622 + 1;
                obj2 = objArr2[i9922];
                if (obj2 instanceof Field) {
                }
                str = str2;
                i32 = i9722;
                i29 = 0;
                i25 = i9822;
                i33 = (int) unsafe.objectFieldOffset(p11);
                i34 = objectFieldOffset22;
            } else {
                int i100 = i12;
                objArr = objArr3;
                int i101 = i11 + 1;
                Field p12 = p(cls, (String) objArr2[i11]);
                i25 = i100;
                if (i85 == 9 || i85 == 17) {
                    i26 = i101;
                    int i102 = i76 / 3;
                    objArr[i102 + i102 + 1] = p12.getType();
                } else {
                    if (i85 == 27) {
                        i36 = i101;
                        i37 = 1;
                        i38 = i11 + 2;
                    } else if (i85 == 49) {
                        i38 = i11 + 2;
                        i36 = i101;
                        i37 = 1;
                    } else {
                        if (i85 == 12 || i85 == 30 || i85 == 44) {
                            i26 = i101;
                            if (i6Var.a() == 1 || i87 != 0) {
                                i38 = i11 + 2;
                                int i103 = i76 / 3;
                                objArr[i103 + i103 + 1] = objArr2[i26];
                                i26 = i38;
                            }
                        } else if (i85 == 50) {
                            int i104 = i11 + 2;
                            int i105 = i74 + 1;
                            iArr[i74] = i76;
                            int i106 = i76 / 3;
                            int i107 = i106 + i106;
                            objArr[i107] = objArr2[i101];
                            if (i87 != 0) {
                                objArr[i107 + 1] = objArr2[i104];
                                i27 = i87;
                                i74 = i105;
                                i26 = i11 + 3;
                                int objectFieldOffset3 = (int) unsafe.objectFieldOffset(p12);
                                if ((charAt21 & 4096) != 0 || i85 > 17) {
                                    str = str2;
                                    i28 = i24;
                                    i29 = 0;
                                    i30 = 1048575;
                                } else {
                                    i28 = i24 + 1;
                                    int charAt23 = str2.charAt(i24);
                                    if (charAt23 >= 55296) {
                                        int i108 = charAt23 & 8191;
                                        int i109 = 13;
                                        while (true) {
                                            i35 = i28 + 1;
                                            charAt9 = str2.charAt(i28);
                                            if (charAt9 < 55296) {
                                                break;
                                            }
                                            i108 |= (charAt9 & 8191) << i109;
                                            i109 += 13;
                                            i28 = i35;
                                        }
                                        charAt23 = i108 | (charAt9 << i109);
                                        i28 = i35;
                                    }
                                    int i110 = (charAt23 / 32) + i25 + i25;
                                    Object obj3 = objArr2[i110];
                                    str = str2;
                                    if (obj3 instanceof Field) {
                                        p5 = (Field) obj3;
                                    } else {
                                        p5 = p(cls, (String) obj3);
                                        objArr2[i110] = p5;
                                    }
                                    int i111 = charAt23;
                                    i30 = (int) unsafe.objectFieldOffset(p5);
                                    i29 = i111 % 32;
                                }
                                if (i85 >= 18 || i85 > 49) {
                                    i31 = i28;
                                } else {
                                    iArr[i72] = objectFieldOffset3;
                                    i31 = i28;
                                    i72++;
                                }
                                i11 = i26;
                                i32 = i27;
                                i33 = i30;
                                i34 = objectFieldOffset3;
                            } else {
                                i74 = i105;
                                i26 = i104;
                            }
                        } else {
                            i26 = i101;
                        }
                        i27 = 0;
                        int objectFieldOffset32 = (int) unsafe.objectFieldOffset(p12);
                        if ((charAt21 & 4096) != 0) {
                        }
                        str = str2;
                        i28 = i24;
                        i29 = 0;
                        i30 = 1048575;
                        if (i85 >= 18) {
                        }
                        i31 = i28;
                        i11 = i26;
                        i32 = i27;
                        i33 = i30;
                        i34 = objectFieldOffset32;
                    }
                    int i112 = i76 / 3;
                    objArr[i112 + i112 + i37] = objArr2[i36];
                    i26 = i38;
                }
                i27 = i87;
                int objectFieldOffset322 = (int) unsafe.objectFieldOffset(p12);
                if ((charAt21 & 4096) != 0) {
                }
                str = str2;
                i28 = i24;
                i29 = 0;
                i30 = 1048575;
                if (i85 >= 18) {
                }
                i31 = i28;
                i11 = i26;
                i32 = i27;
                i33 = i30;
                i34 = objectFieldOffset322;
            }
            int i113 = i76 + 1;
            iArr2[i76] = i86;
            int i114 = i76 + 2;
            int i115 = i29;
            iArr2[i113] = ((charAt21 & 512) != 0 ? TLObject.FLAG_29 : 0) | ((charAt21 & 256) != 0 ? TLObject.FLAG_28 : 0) | (i32 != 0 ? TLObject.FLAG_31 : 0) | (i85 << 20) | i34;
            i76 += 3;
            iArr2[i114] = (i115 << 20) | i33;
            length = i23;
            i12 = i25;
            str2 = str;
            i48 = i31;
            objArr3 = objArr;
            c10 = CharacterCompat.MIN_HIGH_SURROGATE;
        }
        return new b6(iArr2, objArr3, i6Var.a, iArr, i13, t5Var, m6Var, c5Var);
    }

    public static int k(Object obj, long j3) {
        return ((Integer) u6.h(obj, j3)).intValue();
    }

    public static int l(int i10) {
        return (i10 >>> 20) & 255;
    }

    public static long n(Object obj, long j3) {
        return ((Long) u6.h(obj, j3)).longValue();
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
            StringBuilder w10 = a4.a.w("Field ", str, " for ", name, " not found. Known fields are ");
            w10.append(arrays);
            throw new RuntimeException(w10.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        continue;
     */
    @Override // com.google.android.gms.internal.cast.j6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        if (!h(obj)) {
            return;
        }
        if (obj instanceof h5) {
            h5 h5Var = (h5) obj;
            h5Var.f();
            h5Var.zza = 0;
            h5Var.d();
        }
        int i10 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i10 >= iArr.length) {
                this.g.getClass();
                l6 l6Var = ((h5) obj).zzc;
                if (l6Var.d) {
                    l6Var.d = false;
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
    @Override // com.google.android.gms.internal.cast.j6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(h5 h5Var) {
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
                h5Var.zzc.getClass();
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
                    doubleToLongBits = Double.doubleToLongBits(u6.c.a(h5Var, j3));
                    Charset charset = n5.a;
                    i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i11 = i15 * 53;
                    floatToIntBits = Float.floatToIntBits(u6.c.b(h5Var, j3));
                    i15 = floatToIntBits + i11;
                    break;
                case 2:
                    i10 = i15 * 53;
                    doubleToLongBits = u6.f(h5Var, j3);
                    Charset charset2 = n5.a;
                    i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i10 = i15 * 53;
                    doubleToLongBits = u6.f(h5Var, j3);
                    Charset charset3 = n5.a;
                    i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i11 = i15 * 53;
                    floatToIntBits = u6.e(h5Var, j3);
                    i15 = floatToIntBits + i11;
                    break;
                case 5:
                    i10 = i15 * 53;
                    doubleToLongBits = u6.f(h5Var, j3);
                    Charset charset4 = n5.a;
                    i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i11 = i15 * 53;
                    floatToIntBits = u6.e(h5Var, j3);
                    i15 = floatToIntBits + i11;
                    break;
                case 7:
                    i12 = i15 * 53;
                    boolean g10 = u6.c.g(h5Var, j3);
                    Charset charset5 = n5.a;
                    break;
                case 8:
                    i11 = i15 * 53;
                    floatToIntBits = ((String) u6.h(h5Var, j3)).hashCode();
                    i15 = floatToIntBits + i11;
                    break;
                case 9:
                    i13 = i15 * 53;
                    Object h10 = u6.h(h5Var, j3);
                    if (h10 != null) {
                        i19 = h10.hashCode();
                    }
                    i15 = i13 + i19;
                    break;
                case 10:
                    i11 = i15 * 53;
                    floatToIntBits = u6.h(h5Var, j3).hashCode();
                    i15 = floatToIntBits + i11;
                    break;
                case 11:
                    i11 = i15 * 53;
                    floatToIntBits = u6.e(h5Var, j3);
                    i15 = floatToIntBits + i11;
                    break;
                case 12:
                    i11 = i15 * 53;
                    floatToIntBits = u6.e(h5Var, j3);
                    i15 = floatToIntBits + i11;
                    break;
                case 13:
                    i11 = i15 * 53;
                    floatToIntBits = u6.e(h5Var, j3);
                    i15 = floatToIntBits + i11;
                    break;
                case 14:
                    i10 = i15 * 53;
                    doubleToLongBits = u6.f(h5Var, j3);
                    Charset charset6 = n5.a;
                    i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i11 = i15 * 53;
                    floatToIntBits = u6.e(h5Var, j3);
                    i15 = floatToIntBits + i11;
                    break;
                case 16:
                    i10 = i15 * 53;
                    doubleToLongBits = u6.f(h5Var, j3);
                    Charset charset7 = n5.a;
                    i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i13 = i15 * 53;
                    Object h11 = u6.h(h5Var, j3);
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
                    floatToIntBits = u6.h(h5Var, j3).hashCode();
                    i15 = floatToIntBits + i11;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    i11 = i15 * 53;
                    floatToIntBits = u6.h(h5Var, j3).hashCode();
                    i15 = floatToIntBits + i11;
                    break;
                case 51:
                    if (!i(i17, i14, h5Var)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) u6.h(h5Var, j3)).doubleValue());
                        Charset charset8 = n5.a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!i(i17, i14, h5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) u6.h(h5Var, j3)).floatValue());
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 53:
                    if (!i(i17, i14, h5Var)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = n(h5Var, j3);
                        Charset charset9 = n5.a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!i(i17, i14, h5Var)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = n(h5Var, j3);
                        Charset charset10 = n5.a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 55:
                    if (!i(i17, i14, h5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = k(h5Var, j3);
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 56:
                    if (!i(i17, i14, h5Var)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = n(h5Var, j3);
                        Charset charset11 = n5.a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 57:
                    if (!i(i17, i14, h5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = k(h5Var, j3);
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 58:
                    if (!i(i17, i14, h5Var)) {
                        break;
                    } else {
                        i12 = i15 * 53;
                        boolean booleanValue = ((Boolean) u6.h(h5Var, j3)).booleanValue();
                        Charset charset12 = n5.a;
                        break;
                    }
                case 59:
                    if (!i(i17, i14, h5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = ((String) u6.h(h5Var, j3)).hashCode();
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 60:
                    if (!i(i17, i14, h5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = u6.h(h5Var, j3).hashCode();
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 61:
                    if (!i(i17, i14, h5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = u6.h(h5Var, j3).hashCode();
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 62:
                    if (!i(i17, i14, h5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = k(h5Var, j3);
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 63:
                    if (!i(i17, i14, h5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = k(h5Var, j3);
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 64:
                    if (!i(i17, i14, h5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = k(h5Var, j3);
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (!i(i17, i14, h5Var)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = n(h5Var, j3);
                        Charset charset13 = n5.a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!i(i17, i14, h5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = k(h5Var, j3);
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 67:
                    if (!i(i17, i14, h5Var)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = n(h5Var, j3);
                        Charset charset14 = n5.a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
                    if (!i(i17, i14, h5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = u6.h(h5Var, j3).hashCode();
                        i15 = floatToIntBits + i11;
                        break;
                    }
            }
            i14 += 3;
        }
    }

    @Override // com.google.android.gms.internal.cast.j6
    public final boolean c(h5 h5Var, h5 h5Var2) {
        boolean e7;
        int i10 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i10 < iArr.length) {
                int m10 = m(i10);
                long j3 = m10 & 1048575;
                switch (l(m10)) {
                    case 0:
                        if (!t(h5Var, h5Var2, i10)) {
                            break;
                        } else {
                            t6 t6Var = u6.c;
                            if (Double.doubleToLongBits(t6Var.a(h5Var, j3)) != Double.doubleToLongBits(t6Var.a(h5Var2, j3))) {
                                break;
                            } else {
                                continue;
                                i10 += 3;
                            }
                        }
                    case 1:
                        if (!t(h5Var, h5Var2, i10)) {
                            break;
                        } else {
                            t6 t6Var2 = u6.c;
                            if (Float.floatToIntBits(t6Var2.b(h5Var, j3)) != Float.floatToIntBits(t6Var2.b(h5Var2, j3))) {
                                break;
                            } else {
                                continue;
                                i10 += 3;
                            }
                        }
                    case 2:
                        if (t(h5Var, h5Var2, i10) && u6.f(h5Var, j3) == u6.f(h5Var2, j3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 3:
                        if (t(h5Var, h5Var2, i10) && u6.f(h5Var, j3) == u6.f(h5Var2, j3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 4:
                        if (t(h5Var, h5Var2, i10) && u6.e(h5Var, j3) == u6.e(h5Var2, j3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 5:
                        if (t(h5Var, h5Var2, i10) && u6.f(h5Var, j3) == u6.f(h5Var2, j3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 6:
                        if (t(h5Var, h5Var2, i10) && u6.e(h5Var, j3) == u6.e(h5Var2, j3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 7:
                        if (!t(h5Var, h5Var2, i10)) {
                            break;
                        } else {
                            t6 t6Var3 = u6.c;
                            if (t6Var3.g(h5Var, j3) != t6Var3.g(h5Var2, j3)) {
                                break;
                            } else {
                                continue;
                                i10 += 3;
                            }
                        }
                    case 8:
                        if (t(h5Var, h5Var2, i10) && k6.e(u6.h(h5Var, j3), u6.h(h5Var2, j3))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 9:
                        if (t(h5Var, h5Var2, i10) && k6.e(u6.h(h5Var, j3), u6.h(h5Var2, j3))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 10:
                        if (t(h5Var, h5Var2, i10) && k6.e(u6.h(h5Var, j3), u6.h(h5Var2, j3))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 11:
                        if (t(h5Var, h5Var2, i10) && u6.e(h5Var, j3) == u6.e(h5Var2, j3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 12:
                        if (t(h5Var, h5Var2, i10) && u6.e(h5Var, j3) == u6.e(h5Var2, j3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 13:
                        if (t(h5Var, h5Var2, i10) && u6.e(h5Var, j3) == u6.e(h5Var2, j3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 14:
                        if (t(h5Var, h5Var2, i10) && u6.f(h5Var, j3) == u6.f(h5Var2, j3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 15:
                        if (t(h5Var, h5Var2, i10) && u6.e(h5Var, j3) == u6.e(h5Var2, j3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 16:
                        if (t(h5Var, h5Var2, i10) && u6.f(h5Var, j3) == u6.f(h5Var2, j3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 17:
                        if (t(h5Var, h5Var2, i10) && k6.e(u6.h(h5Var, j3), u6.h(h5Var2, j3))) {
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
                        e7 = k6.e(u6.h(h5Var, j3), u6.h(h5Var2, j3));
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        e7 = k6.e(u6.h(h5Var, j3), u6.h(h5Var2, j3));
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
                        if (u6.e(h5Var, j10) == u6.e(h5Var2, j10) && k6.e(u6.h(h5Var, j3), u6.h(h5Var2, j3))) {
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
                if (h5Var.zzc.equals(h5Var2.zzc)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.cast.j6
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
                k6.o(this.g, obj, obj2);
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
                        t6 t6Var = u6.c;
                        obj3 = obj;
                        t6Var.e(obj3, j3, t6Var.a(obj2, j3));
                        s(i10, obj3);
                        i10 += 3;
                        obj = obj3;
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 1:
                    if (u(i10, obj2)) {
                        t6 t6Var2 = u6.c;
                        t6Var2.f(obj, j3, t6Var2.b(obj2, j3));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 2:
                    if (u(i10, obj2)) {
                        u6.k(obj, j3, u6.f(obj2, j3));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 3:
                    if (u(i10, obj2)) {
                        u6.k(obj, j3, u6.f(obj2, j3));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 4:
                    if (u(i10, obj2)) {
                        u6.j(obj, j3, u6.e(obj2, j3));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 5:
                    if (u(i10, obj2)) {
                        u6.k(obj, j3, u6.f(obj2, j3));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 6:
                    if (u(i10, obj2)) {
                        u6.j(obj, j3, u6.e(obj2, j3));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 7:
                    if (u(i10, obj2)) {
                        t6 t6Var3 = u6.c;
                        t6Var3.c(obj, j3, t6Var3.g(obj2, j3));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 8:
                    if (u(i10, obj2)) {
                        u6.l(obj, j3, u6.h(obj2, j3));
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
                        u6.l(obj, j3, u6.h(obj2, j3));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 11:
                    if (u(i10, obj2)) {
                        u6.j(obj, j3, u6.e(obj2, j3));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 12:
                    if (u(i10, obj2)) {
                        u6.j(obj, j3, u6.e(obj2, j3));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 13:
                    if (u(i10, obj2)) {
                        u6.j(obj, j3, u6.e(obj2, j3));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 14:
                    if (u(i10, obj2)) {
                        u6.k(obj, j3, u6.f(obj2, j3));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 15:
                    if (u(i10, obj2)) {
                        u6.j(obj, j3, u6.e(obj2, j3));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                case 16:
                    if (u(i10, obj2)) {
                        u6.k(obj, j3, u6.f(obj2, j3));
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
                    Class cls = k6.a;
                    Object h10 = u6.h(obj, j3);
                    Object h11 = u6.h(obj2, j3);
                    if (h10 != null) {
                        throw new ClassCastException();
                    }
                    throw a4.a.j(h11);
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
                        u6.l(obj, j3, u6.h(obj2, j3));
                        u6.j(obj, iArr[i10 + 2] & 1048575, i12);
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
                        u6.l(obj, j3, u6.h(obj2, j3));
                        u6.j(obj, iArr[i10 + 2] & 1048575, i12);
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

    @Override // com.google.android.gms.internal.cast.j6
    public final void e(Object obj, w5 w5Var) {
        int i10;
        b6 b6Var = this;
        Unsafe unsafe = i;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 1048575;
        int i14 = 0;
        while (true) {
            int[] iArr = b6Var.a;
            if (i12 >= iArr.length) {
                b6Var.g.getClass();
                l6 l6Var = ((h5) obj).zzc;
                return;
            }
            int m10 = b6Var.m(i12);
            int l4 = l(m10);
            int i15 = iArr[i12];
            if (l4 <= 17) {
                int i16 = iArr[i12 + 2];
                int i17 = i16 & i11;
                if (i17 != i13) {
                    i14 = i17 == i11 ? 0 : unsafe.getInt(obj, i17);
                    i13 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            long j3 = m10 & i11;
            switch (l4) {
                case 0:
                    if (b6Var.v(obj, i12, i13, i14, i10)) {
                        ((a5) w5Var.a).f(i15, Double.doubleToRawLongBits(u6.c.a(obj, j3)));
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 1:
                    if (b6Var.v(obj, i12, i13, i14, i10)) {
                        ((a5) w5Var.a).d(i15, Float.floatToRawIntBits(u6.c.b(obj, j3)));
                        break;
                    }
                    break;
                case 2:
                    if (b6Var.v(obj, i12, i13, i14, i10)) {
                        ((a5) w5Var.a).k(i15, unsafe.getLong(obj, j3));
                        break;
                    }
                    break;
                case 3:
                    if (b6Var.v(obj, i12, i13, i14, i10)) {
                        ((a5) w5Var.a).k(i15, unsafe.getLong(obj, j3));
                        break;
                    }
                    break;
                case 4:
                    if (b6Var.v(obj, i12, i13, i14, i10)) {
                        int i18 = unsafe.getInt(obj, j3);
                        a5 a5Var = (a5) w5Var.a;
                        a5Var.j(i15 << 3);
                        if (i18 >= 0) {
                            a5Var.j(i18);
                            break;
                        } else {
                            a5Var.l(i18);
                            break;
                        }
                    }
                    break;
                case 5:
                    if (b6Var.v(obj, i12, i13, i14, i10)) {
                        ((a5) w5Var.a).f(i15, unsafe.getLong(obj, j3));
                        break;
                    }
                    break;
                case 6:
                    if (b6Var.v(obj, i12, i13, i14, i10)) {
                        ((a5) w5Var.a).d(i15, unsafe.getInt(obj, j3));
                        break;
                    }
                    break;
                case 7:
                    if (b6Var.v(obj, i12, i13, i14, i10)) {
                        boolean g10 = u6.c.g(obj, j3);
                        a5 a5Var2 = (a5) w5Var.a;
                        a5Var2.j(i15 << 3);
                        a5Var2.a(g10 ? (byte) 1 : (byte) 0);
                        break;
                    }
                    break;
                case 8:
                    if (b6Var.v(obj, i12, i13, i14, i10)) {
                        Object object = unsafe.getObject(obj, j3);
                        if (object instanceof String) {
                            ((a5) w5Var.a).h(i15, (String) object);
                            break;
                        } else {
                            ((a5) w5Var.a).c(i15, (z4) object);
                            break;
                        }
                    }
                    break;
                case 9:
                    if (b6Var.v(obj, i12, i13, i14, i10)) {
                        w5Var.b(i15, unsafe.getObject(obj, j3), b6Var.o(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 10:
                    if (b6Var.v(obj, i12, i13, i14, i10)) {
                        ((a5) w5Var.a).c(i15, (z4) unsafe.getObject(obj, j3));
                        break;
                    }
                    break;
                case 11:
                    if (b6Var.v(obj, i12, i13, i14, i10)) {
                        int i19 = unsafe.getInt(obj, j3);
                        a5 a5Var3 = (a5) w5Var.a;
                        a5Var3.j(i15 << 3);
                        a5Var3.j(i19);
                        break;
                    }
                    break;
                case 12:
                    if (b6Var.v(obj, i12, i13, i14, i10)) {
                        int i20 = unsafe.getInt(obj, j3);
                        a5 a5Var4 = (a5) w5Var.a;
                        a5Var4.j(i15 << 3);
                        if (i20 >= 0) {
                            a5Var4.j(i20);
                            break;
                        } else {
                            a5Var4.l(i20);
                            break;
                        }
                    }
                    break;
                case 13:
                    if (b6Var.v(obj, i12, i13, i14, i10)) {
                        ((a5) w5Var.a).d(i15, unsafe.getInt(obj, j3));
                        break;
                    }
                    break;
                case 14:
                    if (b6Var.v(obj, i12, i13, i14, i10)) {
                        ((a5) w5Var.a).f(i15, unsafe.getLong(obj, j3));
                        break;
                    }
                    break;
                case 15:
                    if (b6Var.v(obj, i12, i13, i14, i10)) {
                        int i21 = unsafe.getInt(obj, j3);
                        a5 a5Var5 = (a5) w5Var.a;
                        a5Var5.j(i15 << 3);
                        a5Var5.j((i21 >> 31) ^ (i21 + i21));
                        break;
                    }
                    break;
                case 16:
                    if (b6Var.v(obj, i12, i13, i14, i10)) {
                        long j10 = unsafe.getLong(obj, j3);
                        ((a5) w5Var.a).k(i15, (j10 >> 63) ^ (j10 + j10));
                        break;
                    }
                    break;
                case 17:
                    if (b6Var.v(obj, i12, i13, i14, i10)) {
                        w5Var.a(i15, unsafe.getObject(obj, j3), b6Var.o(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 18:
                    k6.q(iArr[i12], (List) unsafe.getObject(obj, j3), w5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 19:
                    k6.u(iArr[i12], (List) unsafe.getObject(obj, j3), w5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 20:
                    k6.w(iArr[i12], (List) unsafe.getObject(obj, j3), w5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 21:
                    k6.d(iArr[i12], (List) unsafe.getObject(obj, j3), w5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 22:
                    k6.v(iArr[i12], (List) unsafe.getObject(obj, j3), w5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 23:
                    k6.t(iArr[i12], (List) unsafe.getObject(obj, j3), w5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 24:
                    k6.s(iArr[i12], (List) unsafe.getObject(obj, j3), w5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 25:
                    k6.p(iArr[i12], (List) unsafe.getObject(obj, j3), w5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 26:
                    int i22 = iArr[i12];
                    List list = (List) unsafe.getObject(obj, j3);
                    Class cls = k6.a;
                    if (list == null) {
                        continue;
                    } else if (!list.isEmpty()) {
                        a5 a5Var6 = (a5) w5Var.a;
                        if (list instanceof q5) {
                            q5 q5Var = (q5) list;
                            for (int i23 = 0; i23 < list.size(); i23++) {
                                Object c10 = q5Var.c(i23);
                                if (c10 instanceof String) {
                                    a5Var6.h(i22, (String) c10);
                                } else {
                                    a5Var6.c(i22, (z4) c10);
                                }
                            }
                        } else {
                            for (int i24 = 0; i24 < list.size(); i24++) {
                                a5Var6.h(i22, (String) list.get(i24));
                            }
                        }
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 27:
                    int i25 = iArr[i12];
                    List list2 = (List) unsafe.getObject(obj, j3);
                    j6 o9 = b6Var.o(i12);
                    Class cls2 = k6.a;
                    if (list2 == null) {
                        continue;
                    } else if (!list2.isEmpty()) {
                        for (int i26 = 0; i26 < list2.size(); i26++) {
                            w5Var.b(i25, list2.get(i26), o9);
                        }
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 28:
                    int i27 = iArr[i12];
                    List list3 = (List) unsafe.getObject(obj, j3);
                    Class cls3 = k6.a;
                    if (list3 == null) {
                        continue;
                    } else if (!list3.isEmpty()) {
                        w5Var.getClass();
                        for (int i28 = 0; i28 < list3.size(); i28++) {
                            ((a5) w5Var.a).c(i27, (z4) list3.get(i28));
                        }
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 29:
                    k6.c(iArr[i12], (List) unsafe.getObject(obj, j3), w5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    k6.r(iArr[i12], (List) unsafe.getObject(obj, j3), w5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    k6.x(iArr[i12], (List) unsafe.getObject(obj, j3), w5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 32:
                    k6.y(iArr[i12], (List) unsafe.getObject(obj, j3), w5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 33:
                    k6.a(iArr[i12], (List) unsafe.getObject(obj, j3), w5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 34:
                    k6.b(iArr[i12], (List) unsafe.getObject(obj, j3), w5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 35:
                    k6.q(iArr[i12], (List) unsafe.getObject(obj, j3), w5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 36:
                    k6.u(iArr[i12], (List) unsafe.getObject(obj, j3), w5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 37:
                    k6.w(iArr[i12], (List) unsafe.getObject(obj, j3), w5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 38:
                    k6.d(iArr[i12], (List) unsafe.getObject(obj, j3), w5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    k6.v(iArr[i12], (List) unsafe.getObject(obj, j3), w5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    k6.t(iArr[i12], (List) unsafe.getObject(obj, j3), w5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    k6.s(iArr[i12], (List) unsafe.getObject(obj, j3), w5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    k6.p(iArr[i12], (List) unsafe.getObject(obj, j3), w5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    k6.c(iArr[i12], (List) unsafe.getObject(obj, j3), w5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    k6.r(iArr[i12], (List) unsafe.getObject(obj, j3), w5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    k6.x(iArr[i12], (List) unsafe.getObject(obj, j3), w5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    k6.y(iArr[i12], (List) unsafe.getObject(obj, j3), w5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    k6.a(iArr[i12], (List) unsafe.getObject(obj, j3), w5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 48:
                    k6.b(iArr[i12], (List) unsafe.getObject(obj, j3), w5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    int i29 = iArr[i12];
                    List list4 = (List) unsafe.getObject(obj, j3);
                    j6 o10 = b6Var.o(i12);
                    Class cls4 = k6.a;
                    if (list4 == null) {
                        continue;
                    } else if (!list4.isEmpty()) {
                        for (int i30 = 0; i30 < list4.size(); i30++) {
                            w5Var.a(i29, list4.get(i30), o10);
                        }
                    }
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    if (unsafe.getObject(obj, j3) != null) {
                        int i31 = i12 / 3;
                        throw a4.a.j(b6Var.b[i31 + i31]);
                    }
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 51:
                    if (b6Var.i(i15, i12, obj)) {
                        ((a5) w5Var.a).f(i15, Double.doubleToRawLongBits(((Double) u6.h(obj, j3)).doubleValue()));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 52:
                    if (b6Var.i(i15, i12, obj)) {
                        ((a5) w5Var.a).d(i15, Float.floatToRawIntBits(((Float) u6.h(obj, j3)).floatValue()));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 53:
                    if (b6Var.i(i15, i12, obj)) {
                        ((a5) w5Var.a).k(i15, n(obj, j3));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 54:
                    if (b6Var.i(i15, i12, obj)) {
                        ((a5) w5Var.a).k(i15, n(obj, j3));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 55:
                    if (b6Var.i(i15, i12, obj)) {
                        int k10 = k(obj, j3);
                        a5 a5Var7 = (a5) w5Var.a;
                        a5Var7.j(i15 << 3);
                        if (k10 >= 0) {
                            a5Var7.j(k10);
                        } else {
                            a5Var7.l(k10);
                        }
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 56:
                    if (b6Var.i(i15, i12, obj)) {
                        ((a5) w5Var.a).f(i15, n(obj, j3));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 57:
                    if (b6Var.i(i15, i12, obj)) {
                        ((a5) w5Var.a).d(i15, k(obj, j3));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 58:
                    if (b6Var.i(i15, i12, obj)) {
                        boolean booleanValue = ((Boolean) u6.h(obj, j3)).booleanValue();
                        a5 a5Var8 = (a5) w5Var.a;
                        a5Var8.j(i15 << 3);
                        a5Var8.a(booleanValue ? (byte) 1 : (byte) 0);
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 59:
                    if (b6Var.i(i15, i12, obj)) {
                        Object object2 = unsafe.getObject(obj, j3);
                        if (object2 instanceof String) {
                            ((a5) w5Var.a).h(i15, (String) object2);
                        } else {
                            ((a5) w5Var.a).c(i15, (z4) object2);
                        }
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 60:
                    if (b6Var.i(i15, i12, obj)) {
                        w5Var.b(i15, unsafe.getObject(obj, j3), b6Var.o(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 61:
                    if (b6Var.i(i15, i12, obj)) {
                        ((a5) w5Var.a).c(i15, (z4) unsafe.getObject(obj, j3));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 62:
                    if (b6Var.i(i15, i12, obj)) {
                        int k11 = k(obj, j3);
                        a5 a5Var9 = (a5) w5Var.a;
                        a5Var9.j(i15 << 3);
                        a5Var9.j(k11);
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 63:
                    if (b6Var.i(i15, i12, obj)) {
                        int k12 = k(obj, j3);
                        a5 a5Var10 = (a5) w5Var.a;
                        a5Var10.j(i15 << 3);
                        if (k12 >= 0) {
                            a5Var10.j(k12);
                        } else {
                            a5Var10.l(k12);
                        }
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 64:
                    if (b6Var.i(i15, i12, obj)) {
                        ((a5) w5Var.a).d(i15, k(obj, j3));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (b6Var.i(i15, i12, obj)) {
                        ((a5) w5Var.a).f(i15, n(obj, j3));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 66:
                    if (b6Var.i(i15, i12, obj)) {
                        int k13 = k(obj, j3);
                        a5 a5Var11 = (a5) w5Var.a;
                        a5Var11.j(i15 << 3);
                        a5Var11.j((k13 >> 31) ^ (k13 + k13));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 67:
                    if (b6Var.i(i15, i12, obj)) {
                        long n10 = n(obj, j3);
                        ((a5) w5Var.a).k(i15, (n10 >> 63) ^ (n10 + n10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 68:
                    if (b6Var.i(i15, i12, obj)) {
                        w5Var.a(i15, unsafe.getObject(obj, j3), b6Var.o(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                default:
                    i12 += 3;
                    i11 = 1048575;
            }
            b6Var = this;
            i12 += 3;
            i11 = 1048575;
        }
    }

    @Override // com.google.android.gms.internal.cast.j6
    public final boolean f(Object obj) {
        int i10;
        int i11;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.e) {
            int i16 = this.d[i15];
            int[] iArr = this.a;
            int i17 = iArr[i16];
            int m10 = m(i16);
            int i18 = iArr[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i13) {
                if (i19 != 1048575) {
                    i14 = i.getInt(obj, i19);
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
            if ((268435456 & m10) == 0 || v(obj, i11, i10, i12, i20)) {
                int l4 = l(m10);
                if (l4 == 9 || l4 == 17) {
                    if (v(obj, i11, i10, i12, i20) && !o(i11).f(u6.h(obj, m10 & 1048575))) {
                    }
                    i15++;
                    i13 = i10;
                    i14 = i12;
                } else {
                    if (l4 != 27) {
                        if (l4 == 60 || l4 == 68) {
                            if (i(i17, i11, obj) && !o(i11).f(u6.h(obj, m10 & 1048575))) {
                            }
                        } else if (l4 != 49) {
                            if (l4 == 50) {
                                u6.h(obj, m10 & 1048575).getClass();
                                throw new ClassCastException();
                            }
                        }
                        i15++;
                        i13 = i10;
                        i14 = i12;
                    }
                    List list = (List) u6.h(obj, m10 & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        j6 o9 = o(i11);
                        for (int i22 = 0; i22 < list.size(); i22++) {
                            if (o9.f(list.get(i22))) {
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

    @Override // com.google.android.gms.internal.cast.j6
    public final int g(v4 v4Var) {
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
        b6 b6Var = this;
        v4 v4Var2 = v4Var;
        Unsafe unsafe = i;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 1048575;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int[] iArr = b6Var.a;
            if (i15 >= iArr.length) {
                b6Var.g.getClass();
                l6 l6Var = ((h5) v4Var).zzc;
                int i19 = l6Var.c;
                if (i19 == -1) {
                    l6Var.c = 0;
                    i10 = 0;
                } else {
                    i10 = i19;
                }
                return i10 + i18;
            }
            int m10 = b6Var.m(i15);
            int l4 = l(m10);
            int i20 = iArr[i15];
            int i21 = iArr[i15 + 2];
            int i22 = i21 & i14;
            if (l4 <= 17) {
                if (i22 != i16) {
                    i17 = i22 == i14 ? 0 : unsafe.getInt(v4Var2, i22);
                    i16 = i22;
                }
                i11 = 1 << (i21 >>> 20);
            } else {
                i11 = 0;
            }
            int i23 = m10 & i14;
            if (l4 >= e5.b.a) {
                e5.c.getClass();
            }
            long j3 = i23;
            switch (l4) {
                case 0:
                    if (b6Var.v(v4Var2, i15, i16, i17, i11)) {
                        i18 = a4.a.B(i20 << 3, 8, i18);
                    }
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 1:
                    if (b6Var.v(v4Var2, i15, i16, i17, i11)) {
                        i18 = a4.a.B(i20 << 3, 4, i18);
                    }
                    b6Var = this;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 2:
                    if (b6Var.v(v4Var2, i15, i16, i17, i11)) {
                        i18 = a4.a.B(i20 << 3, a5.p(unsafe.getLong(v4Var2, j3)), i18);
                    }
                    b6Var = this;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 3:
                    if (b6Var.v(v4Var2, i15, i16, i17, i11)) {
                        i18 = a4.a.B(i20 << 3, a5.p(unsafe.getLong(v4Var2, j3)), i18);
                    }
                    b6Var = this;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 4:
                    if (b6Var.v(v4Var2, i15, i16, i17, i11)) {
                        i18 = a4.a.B(i20 << 3, a5.m(unsafe.getInt(v4Var2, j3)), i18);
                    }
                    b6Var = this;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 5:
                    if (b6Var.v(v4Var2, i15, i16, i17, i11)) {
                        i18 = a4.a.B(i20 << 3, 8, i18);
                    }
                    b6Var = this;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 6:
                    if (b6Var.v(v4Var2, i15, i16, i17, i11)) {
                        i18 = a4.a.B(i20 << 3, 4, i18);
                    }
                    b6Var = this;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 7:
                    if (b6Var.v(v4Var2, i15, i16, i17, i11)) {
                        i18 = a4.a.B(i20 << 3, 1, i18);
                    }
                    b6Var = this;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 8:
                    if (b6Var.v(v4Var2, i15, i16, i17, i11)) {
                        int i24 = i20 << 3;
                        Object object = unsafe.getObject(v4Var2, j3);
                        if (object instanceof z4) {
                            Logger logger = a5.e;
                            int o16 = ((z4) object).o();
                            i18 = a4.a.B(i24, a5.o(o16) + o16, i18);
                        } else {
                            i18 = a4.a.B(i24, a5.n((String) object), i18);
                        }
                    }
                    b6Var = this;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 9:
                    if (b6Var.v(v4Var2, i15, i16, i17, i11)) {
                        Object object2 = unsafe.getObject(v4Var2, j3);
                        j6 o17 = b6Var.o(i15);
                        Class cls = k6.a;
                        Logger logger2 = a5.e;
                        int a10 = ((v4) object2).a(o17);
                        i18 = a4.a.B(i20 << 3, a5.o(a10) + a10, i18);
                    }
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 10:
                    if (b6Var.v(v4Var2, i15, i16, i17, i11)) {
                        z4 z4Var = (z4) unsafe.getObject(v4Var2, j3);
                        Logger logger3 = a5.e;
                        int o18 = z4Var.o();
                        i18 = a4.a.B(i20 << 3, a5.o(o18) + o18, i18);
                    }
                    b6Var = this;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 11:
                    if (b6Var.v(v4Var2, i15, i16, i17, i11)) {
                        i18 = a4.a.B(i20 << 3, a5.o(unsafe.getInt(v4Var2, j3)), i18);
                    }
                    b6Var = this;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 12:
                    if (b6Var.v(v4Var2, i15, i16, i17, i11)) {
                        i18 = a4.a.B(i20 << 3, a5.m(unsafe.getInt(v4Var2, j3)), i18);
                    }
                    b6Var = this;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 13:
                    if (b6Var.v(v4Var2, i15, i16, i17, i11)) {
                        i18 = a4.a.B(i20 << 3, 4, i18);
                    }
                    b6Var = this;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 14:
                    if (b6Var.v(v4Var2, i15, i16, i17, i11)) {
                        i18 = a4.a.B(i20 << 3, 8, i18);
                    }
                    b6Var = this;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 15:
                    if (b6Var.v(v4Var2, i15, i16, i17, i11)) {
                        int i25 = unsafe.getInt(v4Var2, j3);
                        i18 = a4.a.B((i25 >> 31) ^ (i25 + i25), a5.o(i20 << 3), i18);
                    }
                    b6Var = this;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 16:
                    if (b6Var.v(v4Var2, i15, i16, i17, i11)) {
                        long j10 = unsafe.getLong(v4Var2, j3);
                        i18 += a5.p((j10 >> 63) ^ (j10 + j10)) + a5.o(i20 << 3);
                    }
                    b6Var = this;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 17:
                    if (b6Var.v(v4Var2, i15, i16, i17, i11)) {
                        v4 v4Var3 = (v4) unsafe.getObject(v4Var2, j3);
                        j6 o19 = b6Var.o(i15);
                        Logger logger4 = a5.e;
                        a2 = v4Var3.a(o19);
                        o9 = a5.o(i20 << 3);
                        i12 = o9 + o9;
                        i18 += i12 + a2;
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    }
                case 18:
                    h10 = k6.h(i20, (List) unsafe.getObject(v4Var2, j3));
                    i18 += h10;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 19:
                    h10 = k6.g(i20, (List) unsafe.getObject(v4Var2, j3));
                    i18 += h10;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(v4Var2, j3);
                    Class cls2 = k6.a;
                    if (list.size() != 0) {
                        o10 = (a5.o(i20 << 3) * list.size()) + k6.j(list);
                        i18 += o10;
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    }
                    o10 = 0;
                    i18 += o10;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(v4Var2, j3);
                    Class cls3 = k6.a;
                    size = list2.size();
                    if (size != 0) {
                        n10 = k6.n(list2);
                        o11 = a5.o(i20 << 3);
                        o12 = (o11 * size) + n10;
                        i18 += o12;
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    }
                    o12 = 0;
                    i18 += o12;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(v4Var2, j3);
                    Class cls4 = k6.a;
                    size = list3.size();
                    if (size != 0) {
                        n10 = k6.i(list3);
                        o11 = a5.o(i20 << 3);
                        o12 = (o11 * size) + n10;
                        i18 += o12;
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    }
                    o12 = 0;
                    i18 += o12;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 23:
                    h10 = k6.h(i20, (List) unsafe.getObject(v4Var2, j3));
                    i18 += h10;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 24:
                    h10 = k6.g(i20, (List) unsafe.getObject(v4Var2, j3));
                    i18 += h10;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(v4Var2, j3);
                    Class cls5 = k6.a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        o10 = (a5.o(i20 << 3) + 1) * size2;
                        i18 += o10;
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    }
                    o10 = 0;
                    i18 += o10;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(v4Var2, j3);
                    Class cls6 = k6.a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        boolean z10 = list5 instanceof q5;
                        o12 = a5.o(i20 << 3) * size3;
                        if (z10) {
                            q5 q5Var = (q5) list5;
                            for (int i26 = 0; i26 < size3; i26++) {
                                Object c10 = q5Var.c(i26);
                                if (c10 instanceof z4) {
                                    int o20 = ((z4) c10).o();
                                    o12 = a4.a.B(o20, o20, o12);
                                } else {
                                    o12 = a5.n((String) c10) + o12;
                                }
                            }
                        } else {
                            for (int i27 = 0; i27 < size3; i27++) {
                                Object obj = list5.get(i27);
                                if (obj instanceof z4) {
                                    int o21 = ((z4) obj).o();
                                    o12 = a4.a.B(o21, o21, o12);
                                } else {
                                    o12 = a5.n((String) obj) + o12;
                                }
                            }
                        }
                        i18 += o12;
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    }
                    o12 = 0;
                    i18 += o12;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(v4Var2, j3);
                    j6 o22 = b6Var.o(i15);
                    Class cls7 = k6.a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        o13 = 0;
                    } else {
                        o13 = a5.o(i20 << 3) * size4;
                        for (int i28 = 0; i28 < size4; i28++) {
                            int a11 = ((v4) list6.get(i28)).a(o22);
                            o13 = a4.a.B(a11, a11, o13);
                        }
                    }
                    i18 += o13;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(v4Var2, j3);
                    Class cls8 = k6.a;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        o12 = a5.o(i20 << 3) * size5;
                        for (int i29 = 0; i29 < list7.size(); i29++) {
                            int o23 = ((z4) list7.get(i29)).o();
                            o12 = a4.a.B(o23, o23, o12);
                        }
                        i18 += o12;
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    }
                    o12 = 0;
                    i18 += o12;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(v4Var2, j3);
                    Class cls9 = k6.a;
                    size = list8.size();
                    if (size != 0) {
                        n10 = k6.m(list8);
                        o11 = a5.o(i20 << 3);
                        o12 = (o11 * size) + n10;
                        i18 += o12;
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    }
                    o12 = 0;
                    i18 += o12;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    List list9 = (List) unsafe.getObject(v4Var2, j3);
                    Class cls10 = k6.a;
                    size = list9.size();
                    if (size != 0) {
                        n10 = k6.f(list9);
                        o11 = a5.o(i20 << 3);
                        o12 = (o11 * size) + n10;
                        i18 += o12;
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    }
                    o12 = 0;
                    i18 += o12;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    h10 = k6.g(i20, (List) unsafe.getObject(v4Var2, j3));
                    i18 += h10;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 32:
                    h10 = k6.h(i20, (List) unsafe.getObject(v4Var2, j3));
                    i18 += h10;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(v4Var2, j3);
                    Class cls11 = k6.a;
                    size = list10.size();
                    if (size != 0) {
                        n10 = k6.k(list10);
                        o11 = a5.o(i20 << 3);
                        o12 = (o11 * size) + n10;
                        i18 += o12;
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    }
                    o12 = 0;
                    i18 += o12;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(v4Var2, j3);
                    Class cls12 = k6.a;
                    size = list11.size();
                    if (size != 0) {
                        n10 = k6.l(list11);
                        o11 = a5.o(i20 << 3);
                        o12 = (o11 * size) + n10;
                        i18 += o12;
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    }
                    o12 = 0;
                    i18 += o12;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 35:
                    List list12 = (List) unsafe.getObject(v4Var2, j3);
                    Class cls13 = k6.a;
                    a2 = list12.size() * 8;
                    if (a2 > 0) {
                        o14 = a5.o(a2);
                        o15 = a5.o(i20 << 3);
                        i12 = o15 + o14;
                        i18 += i12 + a2;
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(v4Var2, j3);
                    Class cls14 = k6.a;
                    a2 = list13.size() * 4;
                    if (a2 > 0) {
                        o14 = a5.o(a2);
                        o15 = a5.o(i20 << 3);
                        i12 = o15 + o14;
                        i18 += i12 + a2;
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    }
                case 37:
                    a2 = k6.j((List) unsafe.getObject(v4Var2, j3));
                    if (a2 > 0) {
                        o14 = a5.o(a2);
                        o15 = a5.o(i20 << 3);
                        i12 = o15 + o14;
                        i18 += i12 + a2;
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    }
                case 38:
                    a2 = k6.n((List) unsafe.getObject(v4Var2, j3));
                    if (a2 > 0) {
                        o14 = a5.o(a2);
                        o15 = a5.o(i20 << 3);
                        i12 = o15 + o14;
                        i18 += i12 + a2;
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    a2 = k6.i((List) unsafe.getObject(v4Var2, j3));
                    if (a2 > 0) {
                        o14 = a5.o(a2);
                        o15 = a5.o(i20 << 3);
                        i12 = o15 + o14;
                        i18 += i12 + a2;
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    List list14 = (List) unsafe.getObject(v4Var2, j3);
                    Class cls15 = k6.a;
                    a2 = list14.size() * 8;
                    if (a2 > 0) {
                        o14 = a5.o(a2);
                        o15 = a5.o(i20 << 3);
                        i12 = o15 + o14;
                        i18 += i12 + a2;
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    List list15 = (List) unsafe.getObject(v4Var2, j3);
                    Class cls16 = k6.a;
                    a2 = list15.size() * 4;
                    if (a2 > 0) {
                        o14 = a5.o(a2);
                        o15 = a5.o(i20 << 3);
                        i12 = o15 + o14;
                        i18 += i12 + a2;
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    List list16 = (List) unsafe.getObject(v4Var2, j3);
                    Class cls17 = k6.a;
                    a2 = list16.size();
                    if (a2 > 0) {
                        o14 = a5.o(a2);
                        o15 = a5.o(i20 << 3);
                        i12 = o15 + o14;
                        i18 += i12 + a2;
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    a2 = k6.m((List) unsafe.getObject(v4Var2, j3));
                    if (a2 > 0) {
                        o14 = a5.o(a2);
                        o15 = a5.o(i20 << 3);
                        i12 = o15 + o14;
                        i18 += i12 + a2;
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    a2 = k6.f((List) unsafe.getObject(v4Var2, j3));
                    if (a2 > 0) {
                        o14 = a5.o(a2);
                        o15 = a5.o(i20 << 3);
                        i12 = o15 + o14;
                        i18 += i12 + a2;
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    List list17 = (List) unsafe.getObject(v4Var2, j3);
                    Class cls18 = k6.a;
                    a2 = list17.size() * 4;
                    if (a2 > 0) {
                        o14 = a5.o(a2);
                        o15 = a5.o(i20 << 3);
                        i12 = o15 + o14;
                        i18 += i12 + a2;
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    List list18 = (List) unsafe.getObject(v4Var2, j3);
                    Class cls19 = k6.a;
                    a2 = list18.size() * 8;
                    if (a2 > 0) {
                        o14 = a5.o(a2);
                        o15 = a5.o(i20 << 3);
                        i12 = o15 + o14;
                        i18 += i12 + a2;
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    a2 = k6.k((List) unsafe.getObject(v4Var2, j3));
                    if (a2 > 0) {
                        o14 = a5.o(a2);
                        o15 = a5.o(i20 << 3);
                        i12 = o15 + o14;
                        i18 += i12 + a2;
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    }
                case 48:
                    a2 = k6.l((List) unsafe.getObject(v4Var2, j3));
                    if (a2 > 0) {
                        o14 = a5.o(a2);
                        o15 = a5.o(i20 << 3);
                        i12 = o15 + o14;
                        i18 += i12 + a2;
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    List list19 = (List) unsafe.getObject(v4Var2, j3);
                    j6 o24 = b6Var.o(i15);
                    Class cls20 = k6.a;
                    int size6 = list19.size();
                    if (size6 == 0) {
                        i13 = 0;
                    } else {
                        i13 = 0;
                        for (int i30 = 0; i30 < size6; i30++) {
                            v4 v4Var4 = (v4) list19.get(i30);
                            Logger logger5 = a5.e;
                            int a12 = v4Var4.a(o24);
                            int o25 = a5.o(i20 << 3);
                            i13 += o25 + o25 + a12;
                        }
                    }
                    i18 += i13;
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Object object3 = unsafe.getObject(v4Var2, j3);
                    int i31 = i15 / 3;
                    Object obj2 = b6Var.b[i31 + i31];
                    if (object3 == null) {
                        throw a4.a.j(obj2);
                    }
                    throw new ClassCastException();
                case 51:
                    if (b6Var.i(i20, i15, v4Var2)) {
                        i18 = a4.a.B(i20 << 3, 8, i18);
                    }
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 52:
                    if (b6Var.i(i20, i15, v4Var2)) {
                        i18 = a4.a.B(i20 << 3, 4, i18);
                    }
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 53:
                    if (b6Var.i(i20, i15, v4Var2)) {
                        i18 = a4.a.B(i20 << 3, a5.p(n(v4Var2, j3)), i18);
                    }
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 54:
                    if (b6Var.i(i20, i15, v4Var2)) {
                        i18 = a4.a.B(i20 << 3, a5.p(n(v4Var2, j3)), i18);
                    }
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 55:
                    if (b6Var.i(i20, i15, v4Var2)) {
                        i18 = a4.a.B(i20 << 3, a5.m(k(v4Var2, j3)), i18);
                    }
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 56:
                    if (b6Var.i(i20, i15, v4Var2)) {
                        i18 = a4.a.B(i20 << 3, 8, i18);
                    }
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 57:
                    if (b6Var.i(i20, i15, v4Var2)) {
                        i18 = a4.a.B(i20 << 3, 4, i18);
                    }
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 58:
                    if (b6Var.i(i20, i15, v4Var2)) {
                        i18 = a4.a.B(i20 << 3, 1, i18);
                    }
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 59:
                    if (b6Var.i(i20, i15, v4Var2)) {
                        int i32 = i20 << 3;
                        Object object4 = unsafe.getObject(v4Var2, j3);
                        if (object4 instanceof z4) {
                            Logger logger6 = a5.e;
                            int o26 = ((z4) object4).o();
                            i18 = a4.a.B(i32, a5.o(o26) + o26, i18);
                        } else {
                            i18 = a4.a.B(i32, a5.n((String) object4), i18);
                        }
                    }
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 60:
                    if (b6Var.i(i20, i15, v4Var2)) {
                        Object object5 = unsafe.getObject(v4Var2, j3);
                        j6 o27 = b6Var.o(i15);
                        Class cls21 = k6.a;
                        Logger logger7 = a5.e;
                        int a13 = ((v4) object5).a(o27);
                        i18 = a4.a.B(i20 << 3, a5.o(a13) + a13, i18);
                    }
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 61:
                    if (b6Var.i(i20, i15, v4Var2)) {
                        z4 z4Var2 = (z4) unsafe.getObject(v4Var2, j3);
                        Logger logger8 = a5.e;
                        int o28 = z4Var2.o();
                        i18 = a4.a.B(i20 << 3, a5.o(o28) + o28, i18);
                    }
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 62:
                    if (b6Var.i(i20, i15, v4Var2)) {
                        i18 = a4.a.B(i20 << 3, a5.o(k(v4Var2, j3)), i18);
                    }
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 63:
                    if (b6Var.i(i20, i15, v4Var2)) {
                        i18 = a4.a.B(i20 << 3, a5.m(k(v4Var2, j3)), i18);
                    }
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 64:
                    if (b6Var.i(i20, i15, v4Var2)) {
                        i18 = a4.a.B(i20 << 3, 4, i18);
                    }
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (b6Var.i(i20, i15, v4Var2)) {
                        i18 = a4.a.B(i20 << 3, 8, i18);
                    }
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 66:
                    if (b6Var.i(i20, i15, v4Var2)) {
                        int k10 = k(v4Var2, j3);
                        i18 = a4.a.B((k10 >> 31) ^ (k10 + k10), a5.o(i20 << 3), i18);
                    }
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
                case 67:
                    if (b6Var.i(i20, i15, v4Var2)) {
                        long n11 = n(v4Var2, j3);
                        a2 = a5.o(i20 << 3);
                        i12 = a5.p((n11 >> 63) ^ (n11 + n11));
                        i18 += i12 + a2;
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    }
                case 68:
                    if (b6Var.i(i20, i15, v4Var2)) {
                        v4 v4Var5 = (v4) unsafe.getObject(v4Var2, j3);
                        j6 o29 = b6Var.o(i15);
                        Logger logger9 = a5.e;
                        a2 = v4Var5.a(o29);
                        o9 = a5.o(i20 << 3);
                        i12 = o9 + o9;
                        i18 += i12 + a2;
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        v4Var2 = v4Var;
                        i14 = 1048575;
                    }
                default:
                    i15 += 3;
                    v4Var2 = v4Var;
                    i14 = 1048575;
            }
        }
    }

    public final boolean i(int i10, int i11, Object obj) {
        return u6.e(obj, (long) (this.a[i11 + 2] & 1048575)) == i10;
    }

    public final int m(int i10) {
        return this.a[i10 + 1];
    }

    public final j6 o(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        Object[] objArr = this.b;
        j6 j6Var = (j6) objArr[i12];
        if (j6Var != null) {
            return j6Var;
        }
        j6 a2 = g6.c.a((Class) objArr[i12 + 1]);
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
            j6 o9 = o(i10);
            if (!u(i10, obj)) {
                if (h(object)) {
                    h5 zzc = o9.zzc();
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
                h5 zzc2 = o9.zzc();
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
            j6 o9 = o(i10);
            if (!i(i11, i10, obj)) {
                if (h(object)) {
                    h5 zzc = o9.zzc();
                    o9.d(zzc, object);
                    unsafe.putObject(obj, j3, zzc);
                } else {
                    unsafe.putObject(obj, j3, object);
                }
                u6.j(obj, iArr[i10 + 2] & 1048575, i11);
                return;
            }
            Object object2 = unsafe.getObject(obj, j3);
            if (!h(object2)) {
                h5 zzc2 = o9.zzc();
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
        u6.j(obj, j3, (1 << (i11 >>> 20)) | u6.e(obj, j3));
    }

    public final boolean t(h5 h5Var, h5 h5Var2, int i10) {
        return u(i10, h5Var) == u(i10, h5Var2);
    }

    public final boolean u(int i10, Object obj) {
        int i11 = this.a[i10 + 2];
        long j3 = i11 & 1048575;
        if (j3 == 1048575) {
            int m10 = m(i10);
            long j10 = m10 & 1048575;
            switch (l(m10)) {
                case 0:
                    if (Double.doubleToRawLongBits(u6.c.a(obj, j10)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(u6.c.b(obj, j10)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (u6.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (u6.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (u6.e(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (u6.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (u6.e(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return u6.c.g(obj, j10);
                case 8:
                    Object h10 = u6.h(obj, j10);
                    if (h10 instanceof String) {
                        if (((String) h10).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(h10 instanceof z4)) {
                            throw new IllegalArgumentException();
                        }
                        if (z4.c.equals(h10)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (u6.h(obj, j10) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (z4.c.equals(u6.h(obj, j10))) {
                        return false;
                    }
                    break;
                case 11:
                    if (u6.e(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (u6.e(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (u6.e(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (u6.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (u6.e(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (u6.f(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (u6.h(obj, j10) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i11 >>> 20)) & u6.e(obj, j3)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean v(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? u(i10, obj) : (i12 & i13) != 0;
    }

    @Override // com.google.android.gms.internal.cast.j6
    public final h5 zzc() {
        return (h5) ((h5) this.c).h(4, null);
    }
}
