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
import org.telegram.ui.yh;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class x5 implements f6 {
    public static final int[] h = new int[0];
    public static final Unsafe i = q6.i();
    public final int[] a;
    public final Object[] b;
    public final s4 c;
    public final int[] d;
    public final int e;
    public final p5 f;
    public final i6 g;

    public x5(int[] iArr, Object[] objArr, s4 s4Var, int[] iArr2, int i10, p5 p5Var, i6 i6Var, y4 y4Var) {
        this.a = iArr;
        this.b = objArr;
        this.d = iArr2;
        this.e = i10;
        this.f = p5Var;
        this.g = i6Var;
        this.c = s4Var;
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

    /* JADX WARN: Removed duplicated region for block: B:105:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0380  */
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
        String str;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        Field p10;
        int i35;
        char charAt9;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        Object obj;
        Field p11;
        Object obj2;
        Field p12;
        int i42;
        char charAt10;
        int i43;
        int i44;
        char charAt11;
        int i45;
        char charAt12;
        int i46;
        char charAt13;
        if (!(e6Var instanceof e6)) {
            e6Var.getClass();
            throw new ClassCastException();
        }
        String str2 = e6Var.b;
        int length = str2.length();
        char charAt14 = str2.charAt(0);
        char c3 = CharacterCompat.MIN_HIGH_SURROGATE;
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
        Object[] objArr2 = e6Var.c;
        Class<?> cls = e6Var.a.getClass();
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
            if (charAt20 >= c3) {
                int i78 = charAt20 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i45 = i79 + 1;
                    charAt12 = str2.charAt(i79);
                    if (charAt12 < c3) {
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
            if (charAt21 >= c3) {
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
                        if (e6Var.a() == 1 || i87 != 0) {
                            i40 = i11 + 1;
                            int i95 = i76 / 3;
                            objArr3[i95 + i95 + 1] = objArr2[i11];
                        } else {
                            i41 = 0;
                            int i96 = i92 + i92;
                            obj = objArr2[i96];
                            int i97 = i41;
                            if (obj instanceof Field) {
                                p11 = (Field) obj;
                            } else {
                                p11 = p(cls, (String) obj);
                                objArr2[i96] = p11;
                            }
                            int i98 = i12;
                            objArr = objArr3;
                            int objectFieldOffset = (int) unsafe.objectFieldOffset(p11);
                            int i99 = i96 + 1;
                            obj2 = objArr2[i99];
                            if (obj2 instanceof Field) {
                                p12 = (Field) obj2;
                            } else {
                                p12 = p(cls, (String) obj2);
                                objArr2[i99] = p12;
                            }
                            str = str2;
                            i32 = i97;
                            i29 = 0;
                            i25 = i98;
                            i33 = (int) unsafe.objectFieldOffset(p12);
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
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(p11);
                    int i992 = i962 + 1;
                    obj2 = objArr2[i992];
                    if (obj2 instanceof Field) {
                    }
                    str = str2;
                    i32 = i972;
                    i29 = 0;
                    i25 = i982;
                    i33 = (int) unsafe.objectFieldOffset(p12);
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
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(p11);
                int i9922 = i9622 + 1;
                obj2 = objArr2[i9922];
                if (obj2 instanceof Field) {
                }
                str = str2;
                i32 = i9722;
                i29 = 0;
                i25 = i9822;
                i33 = (int) unsafe.objectFieldOffset(p12);
                i34 = objectFieldOffset22;
            } else {
                int i100 = i12;
                objArr = objArr3;
                int i101 = i11 + 1;
                Field p13 = p(cls, (String) objArr2[i11]);
                i25 = i100;
                if (i85 == 9 || i85 == 17) {
                    i26 = i101;
                    int i102 = i76 / 3;
                    objArr[i102 + i102 + 1] = p13.getType();
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
                            if (e6Var.a() == 1 || i87 != 0) {
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
                                int objectFieldOffset3 = (int) unsafe.objectFieldOffset(p13);
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
                                        p10 = (Field) obj3;
                                    } else {
                                        p10 = p(cls, (String) obj3);
                                        objArr2[i110] = p10;
                                    }
                                    int i111 = charAt23;
                                    i30 = (int) unsafe.objectFieldOffset(p10);
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
                        int objectFieldOffset32 = (int) unsafe.objectFieldOffset(p13);
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
                int objectFieldOffset322 = (int) unsafe.objectFieldOffset(p13);
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
            c3 = CharacterCompat.MIN_HIGH_SURROGATE;
        }
        return new x5(iArr2, objArr3, e6Var.a, iArr, i13, p5Var, i6Var, y4Var);
    }

    public static int k(Object obj, long j10) {
        return ((Integer) q6.h(obj, j10)).intValue();
    }

    public static int l(int i10) {
        return (i10 >>> 20) & 255;
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
            StringBuilder m9 = yh.m("Field ", str, " for ", name, " not found. Known fields are ");
            m9.append(arrays);
            throw new RuntimeException(m9.toString());
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
            int m9 = m(i10);
            int i11 = 1048575 & m9;
            int l10 = l(m9);
            long j10 = i11;
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
            int m9 = m(i14);
            int i16 = 1048575 & m9;
            int l10 = l(m9);
            int i17 = iArr[i14];
            long j10 = i16;
            int i18 = 1237;
            int i19 = 37;
            switch (l10) {
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
                    Object h9 = q6.h(d5Var, j10);
                    if (h9 != null) {
                        i19 = h9.hashCode();
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
                    Object h10 = q6.h(d5Var, j10);
                    if (h10 != null) {
                        i19 = h10.hashCode();
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
                    floatToIntBits = q6.h(d5Var, j10).hashCode();
                    i15 = floatToIntBits + i11;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    i11 = i15 * 53;
                    floatToIntBits = q6.h(d5Var, j10).hashCode();
                    i15 = floatToIntBits + i11;
                    break;
                case 51:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) q6.h(d5Var, j10)).doubleValue());
                        Charset charset8 = j5.a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) q6.h(d5Var, j10)).floatValue());
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 53:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = n(d5Var, j10);
                        Charset charset9 = j5.a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = n(d5Var, j10);
                        Charset charset10 = j5.a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 55:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = k(d5Var, j10);
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 56:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = n(d5Var, j10);
                        Charset charset11 = j5.a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 57:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = k(d5Var, j10);
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 58:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i12 = i15 * 53;
                        boolean booleanValue = ((Boolean) q6.h(d5Var, j10)).booleanValue();
                        Charset charset12 = j5.a;
                        break;
                    }
                case 59:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = ((String) q6.h(d5Var, j10)).hashCode();
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 60:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = q6.h(d5Var, j10).hashCode();
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 61:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = q6.h(d5Var, j10).hashCode();
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 62:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = k(d5Var, j10);
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 63:
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
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = n(d5Var, j10);
                        Charset charset13 = j5.a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = k(d5Var, j10);
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 67:
                    if (!i(i17, i14, d5Var)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = n(d5Var, j10);
                        Charset charset14 = j5.a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
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
        boolean e6;
        int i10 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i10 < iArr.length) {
                int m9 = m(i10);
                long j10 = m9 & 1048575;
                switch (l(m9)) {
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
                        e6 = g6.e(q6.h(d5Var, j10), q6.h(d5Var2, j10));
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        e6 = g6.e(q6.h(d5Var, j10), q6.h(d5Var2, j10));
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
                        if (q6.e(d5Var, j11) == q6.e(d5Var2, j11) && g6.e(q6.h(d5Var, j10), q6.h(d5Var2, j10))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    default:
                        i10 += 3;
                }
                if (e6) {
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
            int m9 = m(i10);
            int i11 = m9 & 1048575;
            int l10 = l(m9);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (l10) {
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
                    i10 += 3;
                    obj = obj3;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Class cls = g6.a;
                    Object h9 = q6.h(obj, j10);
                    Object h10 = q6.h(obj2, j10);
                    if (h9 != null) {
                        throw new ClassCastException();
                    }
                    throw android.support.v4.media.a.j(h10);
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
                        q6.l(obj, j10, q6.h(obj2, j10));
                        q6.j(obj, iArr[i10 + 2] & 1048575, i12);
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
                        q6.l(obj, j10, q6.h(obj2, j10));
                        q6.j(obj, iArr[i10 + 2] & 1048575, i12);
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

    @Override // com.google.android.gms.internal.cast.f6
    public final void e(Object obj, s5 s5Var) {
        int i10;
        x5 x5Var = this;
        Unsafe unsafe = i;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 1048575;
        int i14 = 0;
        while (true) {
            int[] iArr = x5Var.a;
            if (i12 >= iArr.length) {
                x5Var.g.getClass();
                h6 h6Var = ((d5) obj).zzc;
                return;
            }
            int m9 = x5Var.m(i12);
            int l10 = l(m9);
            int i15 = iArr[i12];
            if (l10 <= 17) {
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
            long j10 = m9 & i11;
            switch (l10) {
                case 0:
                    if (x5Var.v(obj, i12, i13, i14, i10)) {
                        ((x4) s5Var.a).f(i15, Double.doubleToRawLongBits(q6.c.a(obj, j10)));
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 1:
                    if (x5Var.v(obj, i12, i13, i14, i10)) {
                        ((x4) s5Var.a).d(i15, Float.floatToRawIntBits(q6.c.b(obj, j10)));
                        break;
                    }
                    break;
                case 2:
                    if (x5Var.v(obj, i12, i13, i14, i10)) {
                        ((x4) s5Var.a).k(i15, unsafe.getLong(obj, j10));
                        break;
                    }
                    break;
                case 3:
                    if (x5Var.v(obj, i12, i13, i14, i10)) {
                        ((x4) s5Var.a).k(i15, unsafe.getLong(obj, j10));
                        break;
                    }
                    break;
                case 4:
                    if (x5Var.v(obj, i12, i13, i14, i10)) {
                        int i18 = unsafe.getInt(obj, j10);
                        x4 x4Var = (x4) s5Var.a;
                        x4Var.j(i15 << 3);
                        if (i18 >= 0) {
                            x4Var.j(i18);
                            break;
                        } else {
                            x4Var.l(i18);
                            break;
                        }
                    }
                    break;
                case 5:
                    if (x5Var.v(obj, i12, i13, i14, i10)) {
                        ((x4) s5Var.a).f(i15, unsafe.getLong(obj, j10));
                        break;
                    }
                    break;
                case 6:
                    if (x5Var.v(obj, i12, i13, i14, i10)) {
                        ((x4) s5Var.a).d(i15, unsafe.getInt(obj, j10));
                        break;
                    }
                    break;
                case 7:
                    if (x5Var.v(obj, i12, i13, i14, i10)) {
                        boolean g10 = q6.c.g(obj, j10);
                        x4 x4Var2 = (x4) s5Var.a;
                        x4Var2.j(i15 << 3);
                        x4Var2.a(g10 ? (byte) 1 : (byte) 0);
                        break;
                    }
                    break;
                case 8:
                    if (x5Var.v(obj, i12, i13, i14, i10)) {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof String) {
                            ((x4) s5Var.a).h(i15, (String) object);
                            break;
                        } else {
                            ((x4) s5Var.a).c(i15, (w4) object);
                            break;
                        }
                    }
                    break;
                case 9:
                    if (x5Var.v(obj, i12, i13, i14, i10)) {
                        s5Var.b(i15, unsafe.getObject(obj, j10), x5Var.o(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 10:
                    if (x5Var.v(obj, i12, i13, i14, i10)) {
                        ((x4) s5Var.a).c(i15, (w4) unsafe.getObject(obj, j10));
                        break;
                    }
                    break;
                case 11:
                    if (x5Var.v(obj, i12, i13, i14, i10)) {
                        int i19 = unsafe.getInt(obj, j10);
                        x4 x4Var3 = (x4) s5Var.a;
                        x4Var3.j(i15 << 3);
                        x4Var3.j(i19);
                        break;
                    }
                    break;
                case 12:
                    if (x5Var.v(obj, i12, i13, i14, i10)) {
                        int i20 = unsafe.getInt(obj, j10);
                        x4 x4Var4 = (x4) s5Var.a;
                        x4Var4.j(i15 << 3);
                        if (i20 >= 0) {
                            x4Var4.j(i20);
                            break;
                        } else {
                            x4Var4.l(i20);
                            break;
                        }
                    }
                    break;
                case 13:
                    if (x5Var.v(obj, i12, i13, i14, i10)) {
                        ((x4) s5Var.a).d(i15, unsafe.getInt(obj, j10));
                        break;
                    }
                    break;
                case 14:
                    if (x5Var.v(obj, i12, i13, i14, i10)) {
                        ((x4) s5Var.a).f(i15, unsafe.getLong(obj, j10));
                        break;
                    }
                    break;
                case 15:
                    if (x5Var.v(obj, i12, i13, i14, i10)) {
                        int i21 = unsafe.getInt(obj, j10);
                        x4 x4Var5 = (x4) s5Var.a;
                        x4Var5.j(i15 << 3);
                        x4Var5.j((i21 >> 31) ^ (i21 + i21));
                        break;
                    }
                    break;
                case 16:
                    if (x5Var.v(obj, i12, i13, i14, i10)) {
                        long j11 = unsafe.getLong(obj, j10);
                        ((x4) s5Var.a).k(i15, (j11 >> 63) ^ (j11 + j11));
                        break;
                    }
                    break;
                case 17:
                    if (x5Var.v(obj, i12, i13, i14, i10)) {
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
                        x4 x4Var6 = (x4) s5Var.a;
                        if (list instanceof m5) {
                            m5 m5Var = (m5) list;
                            for (int i23 = 0; i23 < list.size(); i23++) {
                                Object c3 = m5Var.c(i23);
                                if (c3 instanceof String) {
                                    x4Var6.h(i22, (String) c3);
                                } else {
                                    x4Var6.c(i22, (w4) c3);
                                }
                            }
                        } else {
                            for (int i24 = 0; i24 < list.size(); i24++) {
                                x4Var6.h(i22, (String) list.get(i24));
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
                            ((x4) s5Var.a).c(i27, (w4) list3.get(i28));
                        }
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 29:
                    g6.c(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    g6.r(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, false);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
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
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    g6.v(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    g6.t(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    g6.s(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    g6.p(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    g6.c(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    g6.r(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    g6.x(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    g6.y(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    g6.a(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 48:
                    g6.b(iArr[i12], (List) unsafe.getObject(obj, j10), s5Var, true);
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
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
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    if (unsafe.getObject(obj, j10) != null) {
                        int i31 = i12 / 3;
                        throw android.support.v4.media.a.j(x5Var.b[i31 + i31]);
                    }
                    continue;
                    i12 += 3;
                    i11 = 1048575;
                case 51:
                    if (x5Var.i(i15, i12, obj)) {
                        ((x4) s5Var.a).f(i15, Double.doubleToRawLongBits(((Double) q6.h(obj, j10)).doubleValue()));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 52:
                    if (x5Var.i(i15, i12, obj)) {
                        ((x4) s5Var.a).d(i15, Float.floatToRawIntBits(((Float) q6.h(obj, j10)).floatValue()));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 53:
                    if (x5Var.i(i15, i12, obj)) {
                        ((x4) s5Var.a).k(i15, n(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 54:
                    if (x5Var.i(i15, i12, obj)) {
                        ((x4) s5Var.a).k(i15, n(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 55:
                    if (x5Var.i(i15, i12, obj)) {
                        int k10 = k(obj, j10);
                        x4 x4Var7 = (x4) s5Var.a;
                        x4Var7.j(i15 << 3);
                        if (k10 >= 0) {
                            x4Var7.j(k10);
                        } else {
                            x4Var7.l(k10);
                        }
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 56:
                    if (x5Var.i(i15, i12, obj)) {
                        ((x4) s5Var.a).f(i15, n(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 57:
                    if (x5Var.i(i15, i12, obj)) {
                        ((x4) s5Var.a).d(i15, k(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 58:
                    if (x5Var.i(i15, i12, obj)) {
                        boolean booleanValue = ((Boolean) q6.h(obj, j10)).booleanValue();
                        x4 x4Var8 = (x4) s5Var.a;
                        x4Var8.j(i15 << 3);
                        x4Var8.a(booleanValue ? (byte) 1 : (byte) 0);
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 59:
                    if (x5Var.i(i15, i12, obj)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof String) {
                            ((x4) s5Var.a).h(i15, (String) object2);
                        } else {
                            ((x4) s5Var.a).c(i15, (w4) object2);
                        }
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 60:
                    if (x5Var.i(i15, i12, obj)) {
                        s5Var.b(i15, unsafe.getObject(obj, j10), x5Var.o(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 61:
                    if (x5Var.i(i15, i12, obj)) {
                        ((x4) s5Var.a).c(i15, (w4) unsafe.getObject(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 62:
                    if (x5Var.i(i15, i12, obj)) {
                        int k11 = k(obj, j10);
                        x4 x4Var9 = (x4) s5Var.a;
                        x4Var9.j(i15 << 3);
                        x4Var9.j(k11);
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 63:
                    if (x5Var.i(i15, i12, obj)) {
                        int k12 = k(obj, j10);
                        x4 x4Var10 = (x4) s5Var.a;
                        x4Var10.j(i15 << 3);
                        if (k12 >= 0) {
                            x4Var10.j(k12);
                        } else {
                            x4Var10.l(k12);
                        }
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 64:
                    if (x5Var.i(i15, i12, obj)) {
                        ((x4) s5Var.a).d(i15, k(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (x5Var.i(i15, i12, obj)) {
                        ((x4) s5Var.a).f(i15, n(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 66:
                    if (x5Var.i(i15, i12, obj)) {
                        int k13 = k(obj, j10);
                        x4 x4Var11 = (x4) s5Var.a;
                        x4Var11.j(i15 << 3);
                        x4Var11.j((k13 >> 31) ^ (k13 + k13));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 67:
                    if (x5Var.i(i15, i12, obj)) {
                        long n10 = n(obj, j10);
                        ((x4) s5Var.a).k(i15, (n10 >> 63) ^ (n10 + n10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i11 = 1048575;
                case 68:
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
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.e) {
            int i16 = this.d[i15];
            int[] iArr = this.a;
            int i17 = iArr[i16];
            int m9 = m(i16);
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
            if ((268435456 & m9) == 0 || v(obj, i11, i10, i12, i20)) {
                int l10 = l(m9);
                if (l10 == 9 || l10 == 17) {
                    if (v(obj, i11, i10, i12, i20) && !o(i11).f(q6.h(obj, m9 & 1048575))) {
                    }
                    i15++;
                    i13 = i10;
                    i14 = i12;
                } else {
                    if (l10 != 27) {
                        if (l10 == 60 || l10 == 68) {
                            if (i(i17, i11, obj) && !o(i11).f(q6.h(obj, m9 & 1048575))) {
                            }
                        } else if (l10 != 49) {
                            if (l10 == 50) {
                                q6.h(obj, m9 & 1048575).getClass();
                                throw new ClassCastException();
                            }
                        }
                        i15++;
                        i13 = i10;
                        i14 = i12;
                    }
                    List list = (List) q6.h(obj, m9 & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        f6 o10 = o(i11);
                        for (int i22 = 0; i22 < list.size(); i22++) {
                            if (o10.f(list.get(i22))) {
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

    @Override // com.google.android.gms.internal.cast.f6
    public final int g(s4 s4Var) {
        int i10;
        int i11;
        int a2;
        int o10;
        int h9;
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
        s4 s4Var2 = s4Var;
        Unsafe unsafe = i;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 1048575;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int[] iArr = x5Var.a;
            if (i15 >= iArr.length) {
                x5Var.g.getClass();
                h6 h6Var = ((d5) s4Var).zzc;
                int i19 = h6Var.c;
                if (i19 == -1) {
                    h6Var.c = 0;
                    i10 = 0;
                } else {
                    i10 = i19;
                }
                return i10 + i18;
            }
            int m9 = x5Var.m(i15);
            int l10 = l(m9);
            int i20 = iArr[i15];
            int i21 = iArr[i15 + 2];
            int i22 = i21 & i14;
            if (l10 <= 17) {
                if (i22 != i16) {
                    i17 = i22 == i14 ? 0 : unsafe.getInt(s4Var2, i22);
                    i16 = i22;
                }
                i11 = 1 << (i21 >>> 20);
            } else {
                i11 = 0;
            }
            int i23 = m9 & i14;
            if (l10 >= a5.b.a) {
                a5.c.getClass();
            }
            long j10 = i23;
            switch (l10) {
                case 0:
                    if (x5Var.v(s4Var2, i15, i16, i17, i11)) {
                        i18 = android.support.v4.media.a.x(i20 << 3, 8, i18);
                    }
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 1:
                    if (x5Var.v(s4Var2, i15, i16, i17, i11)) {
                        i18 = android.support.v4.media.a.x(i20 << 3, 4, i18);
                    }
                    x5Var = this;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 2:
                    if (x5Var.v(s4Var2, i15, i16, i17, i11)) {
                        i18 = android.support.v4.media.a.x(i20 << 3, x4.p(unsafe.getLong(s4Var2, j10)), i18);
                    }
                    x5Var = this;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 3:
                    if (x5Var.v(s4Var2, i15, i16, i17, i11)) {
                        i18 = android.support.v4.media.a.x(i20 << 3, x4.p(unsafe.getLong(s4Var2, j10)), i18);
                    }
                    x5Var = this;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 4:
                    if (x5Var.v(s4Var2, i15, i16, i17, i11)) {
                        i18 = android.support.v4.media.a.x(i20 << 3, x4.m(unsafe.getInt(s4Var2, j10)), i18);
                    }
                    x5Var = this;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 5:
                    if (x5Var.v(s4Var2, i15, i16, i17, i11)) {
                        i18 = android.support.v4.media.a.x(i20 << 3, 8, i18);
                    }
                    x5Var = this;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 6:
                    if (x5Var.v(s4Var2, i15, i16, i17, i11)) {
                        i18 = android.support.v4.media.a.x(i20 << 3, 4, i18);
                    }
                    x5Var = this;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 7:
                    if (x5Var.v(s4Var2, i15, i16, i17, i11)) {
                        i18 = android.support.v4.media.a.x(i20 << 3, 1, i18);
                    }
                    x5Var = this;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 8:
                    if (x5Var.v(s4Var2, i15, i16, i17, i11)) {
                        int i24 = i20 << 3;
                        Object object = unsafe.getObject(s4Var2, j10);
                        if (object instanceof w4) {
                            Logger logger = x4.e;
                            int o17 = ((w4) object).o();
                            i18 = android.support.v4.media.a.x(i24, x4.o(o17) + o17, i18);
                        } else {
                            i18 = android.support.v4.media.a.x(i24, x4.n((String) object), i18);
                        }
                    }
                    x5Var = this;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 9:
                    if (x5Var.v(s4Var2, i15, i16, i17, i11)) {
                        Object object2 = unsafe.getObject(s4Var2, j10);
                        f6 o18 = x5Var.o(i15);
                        Class cls = g6.a;
                        Logger logger2 = x4.e;
                        int a10 = ((s4) object2).a(o18);
                        i18 = android.support.v4.media.a.x(i20 << 3, x4.o(a10) + a10, i18);
                    }
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 10:
                    if (x5Var.v(s4Var2, i15, i16, i17, i11)) {
                        w4 w4Var = (w4) unsafe.getObject(s4Var2, j10);
                        Logger logger3 = x4.e;
                        int o19 = w4Var.o();
                        i18 = android.support.v4.media.a.x(i20 << 3, x4.o(o19) + o19, i18);
                    }
                    x5Var = this;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 11:
                    if (x5Var.v(s4Var2, i15, i16, i17, i11)) {
                        i18 = android.support.v4.media.a.x(i20 << 3, x4.o(unsafe.getInt(s4Var2, j10)), i18);
                    }
                    x5Var = this;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 12:
                    if (x5Var.v(s4Var2, i15, i16, i17, i11)) {
                        i18 = android.support.v4.media.a.x(i20 << 3, x4.m(unsafe.getInt(s4Var2, j10)), i18);
                    }
                    x5Var = this;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 13:
                    if (x5Var.v(s4Var2, i15, i16, i17, i11)) {
                        i18 = android.support.v4.media.a.x(i20 << 3, 4, i18);
                    }
                    x5Var = this;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 14:
                    if (x5Var.v(s4Var2, i15, i16, i17, i11)) {
                        i18 = android.support.v4.media.a.x(i20 << 3, 8, i18);
                    }
                    x5Var = this;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 15:
                    if (x5Var.v(s4Var2, i15, i16, i17, i11)) {
                        int i25 = unsafe.getInt(s4Var2, j10);
                        i18 = android.support.v4.media.a.x((i25 >> 31) ^ (i25 + i25), x4.o(i20 << 3), i18);
                    }
                    x5Var = this;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 16:
                    if (x5Var.v(s4Var2, i15, i16, i17, i11)) {
                        long j11 = unsafe.getLong(s4Var2, j10);
                        i18 += x4.p((j11 >> 63) ^ (j11 + j11)) + x4.o(i20 << 3);
                    }
                    x5Var = this;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 17:
                    if (x5Var.v(s4Var2, i15, i16, i17, i11)) {
                        s4 s4Var3 = (s4) unsafe.getObject(s4Var2, j10);
                        f6 o20 = x5Var.o(i15);
                        Logger logger4 = x4.e;
                        a2 = s4Var3.a(o20);
                        o10 = x4.o(i20 << 3);
                        i12 = o10 + o10;
                        i18 += i12 + a2;
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    }
                case 18:
                    h9 = g6.h(i20, (List) unsafe.getObject(s4Var2, j10));
                    i18 += h9;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 19:
                    h9 = g6.g(i20, (List) unsafe.getObject(s4Var2, j10));
                    i18 += h9;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(s4Var2, j10);
                    Class cls2 = g6.a;
                    if (list.size() != 0) {
                        o11 = (x4.o(i20 << 3) * list.size()) + g6.j(list);
                        i18 += o11;
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    }
                    o11 = 0;
                    i18 += o11;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(s4Var2, j10);
                    Class cls3 = g6.a;
                    size = list2.size();
                    if (size != 0) {
                        n10 = g6.n(list2);
                        o12 = x4.o(i20 << 3);
                        o13 = (o12 * size) + n10;
                        i18 += o13;
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    }
                    o13 = 0;
                    i18 += o13;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(s4Var2, j10);
                    Class cls4 = g6.a;
                    size = list3.size();
                    if (size != 0) {
                        n10 = g6.i(list3);
                        o12 = x4.o(i20 << 3);
                        o13 = (o12 * size) + n10;
                        i18 += o13;
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    }
                    o13 = 0;
                    i18 += o13;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 23:
                    h9 = g6.h(i20, (List) unsafe.getObject(s4Var2, j10));
                    i18 += h9;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 24:
                    h9 = g6.g(i20, (List) unsafe.getObject(s4Var2, j10));
                    i18 += h9;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(s4Var2, j10);
                    Class cls5 = g6.a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        o11 = (x4.o(i20 << 3) + 1) * size2;
                        i18 += o11;
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    }
                    o11 = 0;
                    i18 += o11;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(s4Var2, j10);
                    Class cls6 = g6.a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        boolean z4 = list5 instanceof m5;
                        o13 = x4.o(i20 << 3) * size3;
                        if (z4) {
                            m5 m5Var = (m5) list5;
                            for (int i26 = 0; i26 < size3; i26++) {
                                Object c3 = m5Var.c(i26);
                                if (c3 instanceof w4) {
                                    int o21 = ((w4) c3).o();
                                    o13 = android.support.v4.media.a.x(o21, o21, o13);
                                } else {
                                    o13 = x4.n((String) c3) + o13;
                                }
                            }
                        } else {
                            for (int i27 = 0; i27 < size3; i27++) {
                                Object obj = list5.get(i27);
                                if (obj instanceof w4) {
                                    int o22 = ((w4) obj).o();
                                    o13 = android.support.v4.media.a.x(o22, o22, o13);
                                } else {
                                    o13 = x4.n((String) obj) + o13;
                                }
                            }
                        }
                        i18 += o13;
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    }
                    o13 = 0;
                    i18 += o13;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(s4Var2, j10);
                    f6 o23 = x5Var.o(i15);
                    Class cls7 = g6.a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        o14 = 0;
                    } else {
                        o14 = x4.o(i20 << 3) * size4;
                        for (int i28 = 0; i28 < size4; i28++) {
                            int a11 = ((s4) list6.get(i28)).a(o23);
                            o14 = android.support.v4.media.a.x(a11, a11, o14);
                        }
                    }
                    i18 += o14;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(s4Var2, j10);
                    Class cls8 = g6.a;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        o13 = x4.o(i20 << 3) * size5;
                        for (int i29 = 0; i29 < list7.size(); i29++) {
                            int o24 = ((w4) list7.get(i29)).o();
                            o13 = android.support.v4.media.a.x(o24, o24, o13);
                        }
                        i18 += o13;
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    }
                    o13 = 0;
                    i18 += o13;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(s4Var2, j10);
                    Class cls9 = g6.a;
                    size = list8.size();
                    if (size != 0) {
                        n10 = g6.m(list8);
                        o12 = x4.o(i20 << 3);
                        o13 = (o12 * size) + n10;
                        i18 += o13;
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    }
                    o13 = 0;
                    i18 += o13;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    List list9 = (List) unsafe.getObject(s4Var2, j10);
                    Class cls10 = g6.a;
                    size = list9.size();
                    if (size != 0) {
                        n10 = g6.f(list9);
                        o12 = x4.o(i20 << 3);
                        o13 = (o12 * size) + n10;
                        i18 += o13;
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    }
                    o13 = 0;
                    i18 += o13;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    h9 = g6.g(i20, (List) unsafe.getObject(s4Var2, j10));
                    i18 += h9;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 32:
                    h9 = g6.h(i20, (List) unsafe.getObject(s4Var2, j10));
                    i18 += h9;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(s4Var2, j10);
                    Class cls11 = g6.a;
                    size = list10.size();
                    if (size != 0) {
                        n10 = g6.k(list10);
                        o12 = x4.o(i20 << 3);
                        o13 = (o12 * size) + n10;
                        i18 += o13;
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    }
                    o13 = 0;
                    i18 += o13;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(s4Var2, j10);
                    Class cls12 = g6.a;
                    size = list11.size();
                    if (size != 0) {
                        n10 = g6.l(list11);
                        o12 = x4.o(i20 << 3);
                        o13 = (o12 * size) + n10;
                        i18 += o13;
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    }
                    o13 = 0;
                    i18 += o13;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 35:
                    List list12 = (List) unsafe.getObject(s4Var2, j10);
                    Class cls13 = g6.a;
                    a2 = list12.size() * 8;
                    if (a2 > 0) {
                        o15 = x4.o(a2);
                        o16 = x4.o(i20 << 3);
                        i12 = o16 + o15;
                        i18 += i12 + a2;
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(s4Var2, j10);
                    Class cls14 = g6.a;
                    a2 = list13.size() * 4;
                    if (a2 > 0) {
                        o15 = x4.o(a2);
                        o16 = x4.o(i20 << 3);
                        i12 = o16 + o15;
                        i18 += i12 + a2;
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    }
                case 37:
                    a2 = g6.j((List) unsafe.getObject(s4Var2, j10));
                    if (a2 > 0) {
                        o15 = x4.o(a2);
                        o16 = x4.o(i20 << 3);
                        i12 = o16 + o15;
                        i18 += i12 + a2;
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    }
                case 38:
                    a2 = g6.n((List) unsafe.getObject(s4Var2, j10));
                    if (a2 > 0) {
                        o15 = x4.o(a2);
                        o16 = x4.o(i20 << 3);
                        i12 = o16 + o15;
                        i18 += i12 + a2;
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    a2 = g6.i((List) unsafe.getObject(s4Var2, j10));
                    if (a2 > 0) {
                        o15 = x4.o(a2);
                        o16 = x4.o(i20 << 3);
                        i12 = o16 + o15;
                        i18 += i12 + a2;
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    List list14 = (List) unsafe.getObject(s4Var2, j10);
                    Class cls15 = g6.a;
                    a2 = list14.size() * 8;
                    if (a2 > 0) {
                        o15 = x4.o(a2);
                        o16 = x4.o(i20 << 3);
                        i12 = o16 + o15;
                        i18 += i12 + a2;
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    List list15 = (List) unsafe.getObject(s4Var2, j10);
                    Class cls16 = g6.a;
                    a2 = list15.size() * 4;
                    if (a2 > 0) {
                        o15 = x4.o(a2);
                        o16 = x4.o(i20 << 3);
                        i12 = o16 + o15;
                        i18 += i12 + a2;
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    List list16 = (List) unsafe.getObject(s4Var2, j10);
                    Class cls17 = g6.a;
                    a2 = list16.size();
                    if (a2 > 0) {
                        o15 = x4.o(a2);
                        o16 = x4.o(i20 << 3);
                        i12 = o16 + o15;
                        i18 += i12 + a2;
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    a2 = g6.m((List) unsafe.getObject(s4Var2, j10));
                    if (a2 > 0) {
                        o15 = x4.o(a2);
                        o16 = x4.o(i20 << 3);
                        i12 = o16 + o15;
                        i18 += i12 + a2;
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    a2 = g6.f((List) unsafe.getObject(s4Var2, j10));
                    if (a2 > 0) {
                        o15 = x4.o(a2);
                        o16 = x4.o(i20 << 3);
                        i12 = o16 + o15;
                        i18 += i12 + a2;
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    List list17 = (List) unsafe.getObject(s4Var2, j10);
                    Class cls18 = g6.a;
                    a2 = list17.size() * 4;
                    if (a2 > 0) {
                        o15 = x4.o(a2);
                        o16 = x4.o(i20 << 3);
                        i12 = o16 + o15;
                        i18 += i12 + a2;
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    List list18 = (List) unsafe.getObject(s4Var2, j10);
                    Class cls19 = g6.a;
                    a2 = list18.size() * 8;
                    if (a2 > 0) {
                        o15 = x4.o(a2);
                        o16 = x4.o(i20 << 3);
                        i12 = o16 + o15;
                        i18 += i12 + a2;
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    a2 = g6.k((List) unsafe.getObject(s4Var2, j10));
                    if (a2 > 0) {
                        o15 = x4.o(a2);
                        o16 = x4.o(i20 << 3);
                        i12 = o16 + o15;
                        i18 += i12 + a2;
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    }
                case 48:
                    a2 = g6.l((List) unsafe.getObject(s4Var2, j10));
                    if (a2 > 0) {
                        o15 = x4.o(a2);
                        o16 = x4.o(i20 << 3);
                        i12 = o16 + o15;
                        i18 += i12 + a2;
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    }
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    List list19 = (List) unsafe.getObject(s4Var2, j10);
                    f6 o25 = x5Var.o(i15);
                    Class cls20 = g6.a;
                    int size6 = list19.size();
                    if (size6 == 0) {
                        i13 = 0;
                    } else {
                        i13 = 0;
                        for (int i30 = 0; i30 < size6; i30++) {
                            s4 s4Var4 = (s4) list19.get(i30);
                            Logger logger5 = x4.e;
                            int a12 = s4Var4.a(o25);
                            int o26 = x4.o(i20 << 3);
                            i13 += o26 + o26 + a12;
                        }
                    }
                    i18 += i13;
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Object object3 = unsafe.getObject(s4Var2, j10);
                    int i31 = i15 / 3;
                    Object obj2 = x5Var.b[i31 + i31];
                    if (object3 == null) {
                        throw android.support.v4.media.a.j(obj2);
                    }
                    throw new ClassCastException();
                case 51:
                    if (x5Var.i(i20, i15, s4Var2)) {
                        i18 = android.support.v4.media.a.x(i20 << 3, 8, i18);
                    }
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 52:
                    if (x5Var.i(i20, i15, s4Var2)) {
                        i18 = android.support.v4.media.a.x(i20 << 3, 4, i18);
                    }
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 53:
                    if (x5Var.i(i20, i15, s4Var2)) {
                        i18 = android.support.v4.media.a.x(i20 << 3, x4.p(n(s4Var2, j10)), i18);
                    }
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 54:
                    if (x5Var.i(i20, i15, s4Var2)) {
                        i18 = android.support.v4.media.a.x(i20 << 3, x4.p(n(s4Var2, j10)), i18);
                    }
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 55:
                    if (x5Var.i(i20, i15, s4Var2)) {
                        i18 = android.support.v4.media.a.x(i20 << 3, x4.m(k(s4Var2, j10)), i18);
                    }
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 56:
                    if (x5Var.i(i20, i15, s4Var2)) {
                        i18 = android.support.v4.media.a.x(i20 << 3, 8, i18);
                    }
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 57:
                    if (x5Var.i(i20, i15, s4Var2)) {
                        i18 = android.support.v4.media.a.x(i20 << 3, 4, i18);
                    }
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 58:
                    if (x5Var.i(i20, i15, s4Var2)) {
                        i18 = android.support.v4.media.a.x(i20 << 3, 1, i18);
                    }
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 59:
                    if (x5Var.i(i20, i15, s4Var2)) {
                        int i32 = i20 << 3;
                        Object object4 = unsafe.getObject(s4Var2, j10);
                        if (object4 instanceof w4) {
                            Logger logger6 = x4.e;
                            int o27 = ((w4) object4).o();
                            i18 = android.support.v4.media.a.x(i32, x4.o(o27) + o27, i18);
                        } else {
                            i18 = android.support.v4.media.a.x(i32, x4.n((String) object4), i18);
                        }
                    }
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 60:
                    if (x5Var.i(i20, i15, s4Var2)) {
                        Object object5 = unsafe.getObject(s4Var2, j10);
                        f6 o28 = x5Var.o(i15);
                        Class cls21 = g6.a;
                        Logger logger7 = x4.e;
                        int a13 = ((s4) object5).a(o28);
                        i18 = android.support.v4.media.a.x(i20 << 3, x4.o(a13) + a13, i18);
                    }
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 61:
                    if (x5Var.i(i20, i15, s4Var2)) {
                        w4 w4Var2 = (w4) unsafe.getObject(s4Var2, j10);
                        Logger logger8 = x4.e;
                        int o29 = w4Var2.o();
                        i18 = android.support.v4.media.a.x(i20 << 3, x4.o(o29) + o29, i18);
                    }
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 62:
                    if (x5Var.i(i20, i15, s4Var2)) {
                        i18 = android.support.v4.media.a.x(i20 << 3, x4.o(k(s4Var2, j10)), i18);
                    }
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 63:
                    if (x5Var.i(i20, i15, s4Var2)) {
                        i18 = android.support.v4.media.a.x(i20 << 3, x4.m(k(s4Var2, j10)), i18);
                    }
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 64:
                    if (x5Var.i(i20, i15, s4Var2)) {
                        i18 = android.support.v4.media.a.x(i20 << 3, 4, i18);
                    }
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (x5Var.i(i20, i15, s4Var2)) {
                        i18 = android.support.v4.media.a.x(i20 << 3, 8, i18);
                    }
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 66:
                    if (x5Var.i(i20, i15, s4Var2)) {
                        int k10 = k(s4Var2, j10);
                        i18 = android.support.v4.media.a.x((k10 >> 31) ^ (k10 + k10), x4.o(i20 << 3), i18);
                    }
                    i15 += 3;
                    s4Var2 = s4Var;
                    i14 = 1048575;
                case 67:
                    if (x5Var.i(i20, i15, s4Var2)) {
                        long n11 = n(s4Var2, j10);
                        a2 = x4.o(i20 << 3);
                        i12 = x4.p((n11 >> 63) ^ (n11 + n11));
                        i18 += i12 + a2;
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    }
                case 68:
                    if (x5Var.i(i20, i15, s4Var2)) {
                        s4 s4Var5 = (s4) unsafe.getObject(s4Var2, j10);
                        f6 o30 = x5Var.o(i15);
                        Logger logger9 = x4.e;
                        a2 = s4Var5.a(o30);
                        o10 = x4.o(i20 << 3);
                        i12 = o10 + o10;
                        i18 += i12 + a2;
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    } else {
                        i15 += 3;
                        s4Var2 = s4Var;
                        i14 = 1048575;
                    }
                default:
                    i15 += 3;
                    s4Var2 = s4Var;
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
            int m9 = m(i10) & 1048575;
            Unsafe unsafe = i;
            long j10 = m9;
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
            int m9 = m(i10) & 1048575;
            Unsafe unsafe = i;
            long j10 = m9;
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
            int m9 = m(i10);
            long j11 = m9 & 1048575;
            switch (l(m9)) {
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
                    Object h9 = q6.h(obj, j11);
                    if (h9 instanceof String) {
                        if (((String) h9).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(h9 instanceof w4)) {
                            throw new IllegalArgumentException();
                        }
                        if (w4.c.equals(h9)) {
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
                    if (w4.c.equals(q6.h(obj, j11))) {
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
