package com.google.android.gms.internal.vision;

import androidx.car.app.navigation.model.Maneuver;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Level;
import org.telegram.messenger.CharacterCompat;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class f2 implements o2 {
    public static final int[] n = new int[0];
    public static final Unsafe o = y2.g();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final l0 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final i2 j;
    public final s1 k;
    public final q2 l;
    public final b2 m;

    public f2(int[] iArr, Object[] objArr, int i10, int i11, l0 l0Var, boolean z10, int[] iArr2, int i12, int i13, i2 i2Var, s1 s1Var, q2 q2Var, v0 v0Var, b2 b2Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i10;
        this.d = i11;
        this.f = z10;
        this.g = iArr2;
        this.h = i12;
        this.i = i13;
        this.j = i2Var;
        this.k = s1Var;
        this.l = q2Var;
        this.e = l0Var;
        this.m = b2Var;
    }

    public static int A(Object obj, long j3) {
        return ((Integer) y2.l(obj, j3)).intValue();
    }

    public static long B(Object obj, long j3) {
        return ((Long) y2.l(obj, j3)).longValue();
    }

    public static r2 C(Object obj) {
        f1 f1Var = (f1) obj;
        r2 r2Var = f1Var.zzb;
        if (r2Var != r2.f) {
            return r2Var;
        }
        r2 b10 = r2.b();
        f1Var.zzb = b10;
        return b10;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f2 k(m2 m2Var, i2 i2Var, s1 s1Var, q2 q2Var, v0 v0Var, b2 b2Var) {
        int i10;
        int charAt;
        int charAt2;
        int charAt3;
        int i11;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        int i15;
        char charAt4;
        int i16;
        char charAt5;
        int i17;
        char charAt6;
        int i18;
        char charAt7;
        int i19;
        char charAt8;
        int i20;
        char charAt9;
        int i21;
        char charAt10;
        int i22;
        char charAt11;
        int i23;
        int i24;
        int i25;
        int objectFieldOffset;
        int i26;
        int i27;
        int i28;
        Field m10;
        char charAt12;
        int i29;
        Object obj;
        Field m11;
        Object obj2;
        Field m12;
        int i30;
        char charAt13;
        int i31;
        char charAt14;
        int i32;
        int i33;
        char charAt15;
        int i34;
        char charAt16;
        if (!(m2Var instanceof m2)) {
            m2Var.getClass();
            throw new ClassCastException();
        }
        boolean z10 = (m2Var.d & 1) != 1;
        String str = m2Var.b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i35 = 1;
            while (true) {
                i10 = i35 + 1;
                if (str.charAt(i35) < 55296) {
                    break;
                }
                i35 = i10;
            }
        } else {
            i10 = 1;
        }
        int i36 = i10 + 1;
        int charAt17 = str.charAt(i10);
        if (charAt17 >= 55296) {
            int i37 = charAt17 & 8191;
            int i38 = 13;
            while (true) {
                i34 = i36 + 1;
                charAt16 = str.charAt(i36);
                if (charAt16 < 55296) {
                    break;
                }
                i37 |= (charAt16 & 8191) << i38;
                i38 += 13;
                i36 = i34;
            }
            charAt17 = i37 | (charAt16 << i38);
            i36 = i34;
        }
        if (charAt17 == 0) {
            i14 = 0;
            charAt = 0;
            charAt2 = 0;
            i11 = 0;
            charAt3 = 0;
            iArr = n;
            i12 = 0;
            i13 = 0;
        } else {
            int i39 = i36 + 1;
            int charAt18 = str.charAt(i36);
            if (charAt18 >= 55296) {
                int i40 = charAt18 & 8191;
                int i41 = 13;
                while (true) {
                    i22 = i39 + 1;
                    charAt11 = str.charAt(i39);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i40 |= (charAt11 & 8191) << i41;
                    i41 += 13;
                    i39 = i22;
                }
                charAt18 = i40 | (charAt11 << i41);
                i39 = i22;
            }
            int i42 = i39 + 1;
            int charAt19 = str.charAt(i39);
            if (charAt19 >= 55296) {
                int i43 = charAt19 & 8191;
                int i44 = 13;
                while (true) {
                    i21 = i42 + 1;
                    charAt10 = str.charAt(i42);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i43 |= (charAt10 & 8191) << i44;
                    i44 += 13;
                    i42 = i21;
                }
                charAt19 = i43 | (charAt10 << i44);
                i42 = i21;
            }
            int i45 = i42 + 1;
            int charAt20 = str.charAt(i42);
            if (charAt20 >= 55296) {
                int i46 = charAt20 & 8191;
                int i47 = 13;
                while (true) {
                    i20 = i45 + 1;
                    charAt9 = str.charAt(i45);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i46 |= (charAt9 & 8191) << i47;
                    i47 += 13;
                    i45 = i20;
                }
                charAt20 = i46 | (charAt9 << i47);
                i45 = i20;
            }
            int i48 = i45 + 1;
            int charAt21 = str.charAt(i45);
            if (charAt21 >= 55296) {
                int i49 = charAt21 & 8191;
                int i50 = 13;
                while (true) {
                    i19 = i48 + 1;
                    charAt8 = str.charAt(i48);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i49 |= (charAt8 & 8191) << i50;
                    i50 += 13;
                    i48 = i19;
                }
                charAt21 = i49 | (charAt8 << i50);
                i48 = i19;
            }
            int i51 = i48 + 1;
            charAt = str.charAt(i48);
            if (charAt >= 55296) {
                int i52 = charAt & 8191;
                int i53 = 13;
                while (true) {
                    i18 = i51 + 1;
                    charAt7 = str.charAt(i51);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i52 |= (charAt7 & 8191) << i53;
                    i53 += 13;
                    i51 = i18;
                }
                charAt = i52 | (charAt7 << i53);
                i51 = i18;
            }
            int i54 = i51 + 1;
            charAt2 = str.charAt(i51);
            if (charAt2 >= 55296) {
                int i55 = charAt2 & 8191;
                int i56 = 13;
                while (true) {
                    i17 = i54 + 1;
                    charAt6 = str.charAt(i54);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i55 |= (charAt6 & 8191) << i56;
                    i56 += 13;
                    i54 = i17;
                }
                charAt2 = i55 | (charAt6 << i56);
                i54 = i17;
            }
            int i57 = i54 + 1;
            int charAt22 = str.charAt(i54);
            if (charAt22 >= 55296) {
                int i58 = charAt22 & 8191;
                int i59 = 13;
                while (true) {
                    i16 = i57 + 1;
                    charAt5 = str.charAt(i57);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i58 |= (charAt5 & 8191) << i59;
                    i59 += 13;
                    i57 = i16;
                }
                charAt22 = i58 | (charAt5 << i59);
                i57 = i16;
            }
            int i60 = i57 + 1;
            charAt3 = str.charAt(i57);
            if (charAt3 >= 55296) {
                int i61 = charAt3 & 8191;
                int i62 = i60;
                int i63 = 13;
                while (true) {
                    i15 = i62 + 1;
                    charAt4 = str.charAt(i62);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i61 |= (charAt4 & 8191) << i63;
                    i63 += 13;
                    i62 = i15;
                }
                charAt3 = i61 | (charAt4 << i63);
                i60 = i15;
            }
            int[] iArr2 = new int[charAt3 + charAt2 + charAt22];
            i11 = (charAt18 << 1) + charAt19;
            i12 = charAt20;
            i13 = charAt21;
            iArr = iArr2;
            i14 = charAt18;
            i36 = i60;
        }
        Unsafe unsafe = o;
        Object[] objArr = m2Var.c;
        Class<?> cls = m2Var.a.getClass();
        int i64 = i14;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr2 = new Object[charAt << 1];
        int i65 = charAt2 + charAt3;
        int i66 = i65;
        int i67 = charAt3;
        int i68 = 0;
        int i69 = 0;
        while (i36 < length) {
            int i70 = i36 + 1;
            int charAt23 = str.charAt(i36);
            int[] iArr4 = iArr3;
            if (charAt23 >= 55296) {
                int i71 = charAt23 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i33 = i72 + 1;
                    charAt15 = str.charAt(i72);
                    i23 = length;
                    if (charAt15 < 55296) {
                        break;
                    }
                    i71 |= (charAt15 & 8191) << i73;
                    i73 += 13;
                    i72 = i33;
                    length = i23;
                }
                charAt23 = i71 | (charAt15 << i73);
                i24 = i33;
            } else {
                i23 = length;
                i24 = i70;
            }
            int i74 = i24 + 1;
            int charAt24 = str.charAt(i24);
            if (charAt24 >= 55296) {
                int i75 = charAt24 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i31 = i76 + 1;
                    charAt14 = str.charAt(i76);
                    i32 = i75;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i75 = i32 | ((charAt14 & 8191) << i77);
                    i77 += 13;
                    i76 = i31;
                }
                charAt24 = i32 | (charAt14 << i77);
                i25 = i31;
            } else {
                i25 = i74;
            }
            int i78 = charAt23;
            int i79 = charAt24 & 255;
            int i80 = i12;
            if ((charAt24 & 1024) != 0) {
                iArr[i68] = i69;
                i68++;
            }
            int i81 = i13;
            if (i79 >= 51) {
                int i82 = i25 + 1;
                int charAt25 = str.charAt(i25);
                char c10 = CharacterCompat.MIN_HIGH_SURROGATE;
                if (charAt25 >= 55296) {
                    int i83 = charAt25 & 8191;
                    int i84 = 13;
                    while (true) {
                        i30 = i82 + 1;
                        charAt13 = str.charAt(i82);
                        if (charAt13 < c10) {
                            break;
                        }
                        i83 |= (charAt13 & 8191) << i84;
                        i84 += 13;
                        i82 = i30;
                        c10 = CharacterCompat.MIN_HIGH_SURROGATE;
                    }
                    charAt25 = i83 | (charAt13 << i84);
                    i82 = i30;
                }
                int i85 = i79 - 51;
                int i86 = charAt25;
                if (i85 == 9 || i85 == 17) {
                    i29 = i11 + 1;
                    objArr2[((i69 / 3) << 1) + 1] = objArr[i11];
                } else {
                    if (i85 == 12 && !z10) {
                        i29 = i11 + 1;
                        objArr2[((i69 / 3) << 1) + 1] = objArr[i11];
                    }
                    int i87 = i86 << 1;
                    obj = objArr[i87];
                    if (obj instanceof Field) {
                        m11 = m(cls, (String) obj);
                        objArr[i87] = m11;
                    } else {
                        m11 = (Field) obj;
                    }
                    int i88 = i82;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(m11);
                    int i89 = i87 + 1;
                    obj2 = objArr[i89];
                    if (obj2 instanceof Field) {
                        m12 = m(cls, (String) obj2);
                        objArr[i89] = m12;
                    } else {
                        m12 = (Field) obj2;
                    }
                    i27 = i88;
                    objectFieldOffset = objectFieldOffset2;
                    i26 = (int) unsafe.objectFieldOffset(m12);
                    i28 = 0;
                }
                i11 = i29;
                int i872 = i86 << 1;
                obj = objArr[i872];
                if (obj instanceof Field) {
                }
                int i882 = i82;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(m11);
                int i892 = i872 + 1;
                obj2 = objArr[i892];
                if (obj2 instanceof Field) {
                }
                i27 = i882;
                objectFieldOffset = objectFieldOffset22;
                i26 = (int) unsafe.objectFieldOffset(m12);
                i28 = 0;
            } else {
                int i90 = i11 + 1;
                Field m13 = m(cls, (String) objArr[i11]);
                if (i79 == 9 || i79 == 17) {
                    objArr2[((i69 / 3) << 1) + 1] = m13.getType();
                } else {
                    if (i79 == 27 || i79 == 49) {
                        i11 += 2;
                        objArr2[((i69 / 3) << 1) + 1] = objArr[i90];
                    } else if (i79 == 12 || i79 == 30 || i79 == 44) {
                        if (!z10) {
                            i11 += 2;
                            objArr2[((i69 / 3) << 1) + 1] = objArr[i90];
                        }
                    } else if (i79 == 50) {
                        int i91 = i67 + 1;
                        iArr[i67] = i69;
                        int i92 = (i69 / 3) << 1;
                        int i93 = i11 + 2;
                        objArr2[i92] = objArr[i90];
                        if ((charAt24 & 2048) != 0) {
                            objArr2[i92 + 1] = objArr[i93];
                            i11 += 3;
                        } else {
                            i11 = i93;
                        }
                        i67 = i91;
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(m13);
                    if ((charAt24 & 4096) == 4096 || i79 > 17) {
                        i26 = 1048575;
                        i27 = i25;
                        i28 = 0;
                    } else {
                        int i94 = i25 + 1;
                        int charAt26 = str.charAt(i25);
                        if (charAt26 >= 55296) {
                            int i95 = charAt26 & 8191;
                            int i96 = 13;
                            while (true) {
                                i27 = i94 + 1;
                                charAt12 = str.charAt(i94);
                                if (charAt12 < 55296) {
                                    break;
                                }
                                i95 |= (charAt12 & 8191) << i96;
                                i96 += 13;
                                i94 = i27;
                            }
                            charAt26 = i95 | (charAt12 << i96);
                        } else {
                            i27 = i94;
                        }
                        int i97 = (charAt26 / 32) + (i64 << 1);
                        Object obj3 = objArr[i97];
                        if (obj3 instanceof Field) {
                            m10 = (Field) obj3;
                        } else {
                            m10 = m(cls, (String) obj3);
                            objArr[i97] = m10;
                        }
                        i26 = (int) unsafe.objectFieldOffset(m10);
                        i28 = charAt26 % 32;
                    }
                    if (i79 >= 18 && i79 <= 49) {
                        iArr[i66] = objectFieldOffset;
                        i66++;
                    }
                }
                i11 = i90;
                objectFieldOffset = (int) unsafe.objectFieldOffset(m13);
                if ((charAt24 & 4096) == 4096) {
                }
                i26 = 1048575;
                i27 = i25;
                i28 = 0;
                if (i79 >= 18) {
                    iArr[i66] = objectFieldOffset;
                    i66++;
                }
            }
            int i98 = i69 + 1;
            iArr4[i69] = i78;
            int i99 = i69 + 2;
            String str2 = str;
            iArr4[i98] = ((charAt24 & 512) != 0 ? TLObject.FLAG_29 : 0) | ((charAt24 & 256) != 0 ? TLObject.FLAG_28 : 0) | (i79 << 20) | objectFieldOffset;
            i69 += 3;
            iArr4[i99] = (i28 << 20) | i26;
            str = str2;
            iArr3 = iArr4;
            i12 = i80;
            length = i23;
            i36 = i27;
            i13 = i81;
        }
        return new f2(iArr3, objArr2, i12, i13, m2Var.a, z10, iArr, charAt3, i65, i2Var, s1Var, q2Var, v0Var, b2Var);
    }

    public static Field m(Class cls, String str) {
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
            StringBuilder sb2 = new StringBuilder(String.valueOf(arrays).length() + name.length() + String.valueOf(str).length() + 40);
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            throw new RuntimeException(a1.g.t(sb2, " not found. Known fields are ", arrays));
        }
    }

    public static void n(int i10, Object obj, y1 y1Var) {
        if (!(obj instanceof String)) {
            y1Var.a(i10, (q0) obj);
            return;
        }
        String str = (String) obj;
        r0 r0Var = (r0) y1Var.a;
        r0Var.D(i10, 2);
        byte[] bArr = r0Var.c;
        int i11 = r0Var.e;
        try {
            int T = r0.T(str.length() * 3);
            int T2 = r0.T(str.length());
            if (T2 != T) {
                r0Var.H(b3.a(str));
                r0Var.e = b3.a.h(str, bArr, r0Var.e, r0Var.F());
                return;
            }
            int i12 = i11 + T2;
            r0Var.e = i12;
            int h = b3.a.h(str, bArr, i12, r0Var.F());
            r0Var.e = i11;
            r0Var.H((h - i11) - T2);
            r0Var.e = h;
        } catch (c3 e7) {
            r0Var.e = i11;
            r0.f.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e7);
            byte[] bytes = str.getBytes(j1.a);
            try {
                r0Var.H(bytes.length);
                r0Var.L(bytes, 0, bytes.length);
            } catch (s0 e10) {
                throw e10;
            } catch (IndexOutOfBoundsException e11) {
                throw new s0(e11);
            }
        } catch (IndexOutOfBoundsException e12) {
            throw new s0(e12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ef, code lost:
    
        return false;
     */
    @Override // com.google.android.gms.internal.vision.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Object obj) {
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            boolean z10 = true;
            if (i11 >= this.h) {
                return true;
            }
            int i13 = this.g[i11];
            int[] iArr = this.a;
            int i14 = iArr[i13];
            int z11 = z(i13);
            int i15 = iArr[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i10) {
                if (i16 != 1048575) {
                    i12 = o.getInt(obj, i16);
                }
                i10 = i16;
            }
            if ((268435456 & z11) != 0) {
                if (!(i10 == 1048575 ? r(i13, obj) : (i12 & i17) != 0)) {
                    break;
                }
            }
            int i18 = (267386880 & z11) >>> 20;
            if (i18 == 9 || i18 == 17) {
                if (i10 == 1048575) {
                    z10 = r(i13, obj);
                } else if ((i17 & i12) == 0) {
                    z10 = false;
                }
                if (z10 && !l(i13).a(y2.l(obj, z11 & 1048575))) {
                    break;
                }
                i11++;
            } else {
                if (i18 != 27) {
                    if (i18 == 60 || i18 == 68) {
                        if (q(i14, i13, obj) && !l(i13).a(y2.l(obj, z11 & 1048575))) {
                            break;
                        }
                    } else if (i18 != 49) {
                        if (i18 != 50) {
                            continue;
                        } else {
                            Object l4 = y2.l(obj, z11 & 1048575);
                            this.m.getClass();
                            if (!((a2) l4).isEmpty()) {
                                if (t(i13) == null) {
                                    throw new NoSuchMethodError();
                                }
                                throw new ClassCastException();
                            }
                        }
                    }
                    i11++;
                }
                List list = (List) y2.l(obj, z11 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    o2 l10 = l(i13);
                    for (int i19 = 0; i19 < list.size(); i19++) {
                        if (!l10.a(list.get(i19))) {
                            break loop0;
                        }
                    }
                }
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.vision.o2
    public final void b(Object obj) {
        int[] iArr;
        int i10;
        int i11 = this.h;
        while (true) {
            iArr = this.g;
            i10 = this.i;
            if (i11 >= i10) {
                break;
            }
            long z10 = z(iArr[i11]) & 1048575;
            Object l4 = y2.l(obj, z10);
            if (l4 != null) {
                this.m.getClass();
                ((a2) l4).a = false;
                y2.d(obj, z10, l4);
            }
            i11++;
        }
        int length = iArr.length;
        while (i10 < length) {
            this.k.b(obj, iArr[i10]);
            i10++;
        }
        this.l.getClass();
        ((f1) obj).zzb.e = false;
    }

    @Override // com.google.android.gms.internal.vision.o2
    public final void c(Object obj, y1 y1Var) {
        y1Var.getClass();
        r0 r0Var = (r0) y1Var.a;
        if (!this.f) {
            w(obj, y1Var);
            return;
        }
        int[] iArr = this.a;
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int z10 = z(i10);
            int i11 = iArr[i10];
            switch ((267386880 & z10) >>> 20) {
                case 0:
                    if (r(i10, obj)) {
                        double j3 = y2.c.j(obj, z10 & 1048575);
                        r0Var.getClass();
                        long doubleToRawLongBits = Double.doubleToRawLongBits(j3);
                        r0Var.D(i11, 1);
                        r0Var.K(doubleToRawLongBits);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (r(i10, obj)) {
                        float i12 = y2.c.i(obj, z10 & 1048575);
                        r0Var.getClass();
                        int floatToRawIntBits = Float.floatToRawIntBits(i12);
                        r0Var.D(i11, 5);
                        r0Var.M(floatToRawIntBits);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (r(i10, obj)) {
                        long l4 = y2.c.l(obj, z10 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.E(l4);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (r(i10, obj)) {
                        long l10 = y2.c.l(obj, z10 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.E(l10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (r(i10, obj)) {
                        int k10 = y2.c.k(obj, z10 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.C(k10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (r(i10, obj)) {
                        long l11 = y2.c.l(obj, z10 & 1048575);
                        r0Var.D(i11, 1);
                        r0Var.K(l11);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (r(i10, obj)) {
                        int k11 = y2.c.k(obj, z10 & 1048575);
                        r0Var.D(i11, 5);
                        r0Var.M(k11);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (r(i10, obj)) {
                        boolean h = y2.c.h(obj, z10 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.B(h ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (r(i10, obj)) {
                        n(i11, y2.l(obj, z10 & 1048575), y1Var);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (r(i10, obj)) {
                        y1Var.b(i11, y2.l(obj, z10 & 1048575), l(i10));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (r(i10, obj)) {
                        y1Var.a(i11, (q0) y2.l(obj, z10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (r(i10, obj)) {
                        int k12 = y2.c.k(obj, z10 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.H(k12);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (r(i10, obj)) {
                        int k13 = y2.c.k(obj, z10 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.C(k13);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (r(i10, obj)) {
                        int k14 = y2.c.k(obj, z10 & 1048575);
                        r0Var.D(i11, 5);
                        r0Var.M(k14);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (r(i10, obj)) {
                        long l12 = y2.c.l(obj, z10 & 1048575);
                        r0Var.D(i11, 1);
                        r0Var.K(l12);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (r(i10, obj)) {
                        int k15 = y2.c.k(obj, z10 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.H((k15 >> 31) ^ (k15 << 1));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (r(i10, obj)) {
                        long l13 = y2.c.l(obj, z10 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.E((l13 >> 63) ^ (l13 << 1));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (r(i10, obj)) {
                        y1Var.c(i11, y2.l(obj, z10 & 1048575), l(i10));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    p2.g(i11, (List) y2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 19:
                    p2.n(i11, (List) y2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 20:
                    p2.q(i11, (List) y2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 21:
                    p2.s(i11, (List) y2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 22:
                    p2.B(i11, (List) y2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 23:
                    p2.w(i11, (List) y2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 24:
                    p2.G(i11, (List) y2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 25:
                    p2.J(i11, (List) y2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 26:
                    p2.e(i11, (List) y2.l(obj, z10 & 1048575), y1Var);
                    break;
                case 27:
                    p2.f(i11, (List) y2.l(obj, z10 & 1048575), y1Var, l(i10));
                    break;
                case 28:
                    p2.l(i11, (List) y2.l(obj, z10 & 1048575), y1Var);
                    break;
                case 29:
                    p2.E(i11, (List) y2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    p2.I(i11, (List) y2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    p2.H(i11, (List) y2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 32:
                    p2.y(i11, (List) y2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 33:
                    p2.F(i11, (List) y2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 34:
                    p2.u(i11, (List) y2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 35:
                    p2.g(i11, (List) y2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case 36:
                    p2.n(i11, (List) y2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case 37:
                    p2.q(i11, (List) y2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case 38:
                    p2.s(i11, (List) y2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    p2.B(i11, (List) y2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    p2.w(i11, (List) y2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    p2.G(i11, (List) y2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    p2.J(i11, (List) y2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    p2.E(i11, (List) y2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    p2.I(i11, (List) y2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    p2.H(i11, (List) y2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    p2.y(i11, (List) y2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    p2.F(i11, (List) y2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case 48:
                    p2.u(i11, (List) y2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    p2.m(i11, (List) y2.l(obj, z10 & 1048575), y1Var, l(i10));
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    if (y2.l(obj, z10 & 1048575) != null) {
                        Object t10 = t(i10);
                        this.m.getClass();
                        if (t10 != null) {
                            throw new ClassCastException();
                        }
                        throw new NoSuchMethodError();
                    }
                    break;
                case 51:
                    if (q(i11, i10, obj)) {
                        double doubleValue = ((Double) y2.l(obj, z10 & 1048575)).doubleValue();
                        r0Var.getClass();
                        long doubleToRawLongBits2 = Double.doubleToRawLongBits(doubleValue);
                        r0Var.D(i11, 1);
                        r0Var.K(doubleToRawLongBits2);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(i11, i10, obj)) {
                        float floatValue = ((Float) y2.l(obj, z10 & 1048575)).floatValue();
                        r0Var.getClass();
                        int floatToRawIntBits2 = Float.floatToRawIntBits(floatValue);
                        r0Var.D(i11, 5);
                        r0Var.M(floatToRawIntBits2);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (q(i11, i10, obj)) {
                        long B = B(obj, z10 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.E(B);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (q(i11, i10, obj)) {
                        long B2 = B(obj, z10 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.E(B2);
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (q(i11, i10, obj)) {
                        int A = A(obj, z10 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.C(A);
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(i11, i10, obj)) {
                        long B3 = B(obj, z10 & 1048575);
                        r0Var.D(i11, 1);
                        r0Var.K(B3);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (q(i11, i10, obj)) {
                        int A2 = A(obj, z10 & 1048575);
                        r0Var.D(i11, 5);
                        r0Var.M(A2);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (q(i11, i10, obj)) {
                        boolean booleanValue = ((Boolean) y2.l(obj, z10 & 1048575)).booleanValue();
                        r0Var.D(i11, 0);
                        r0Var.B(booleanValue ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(i11, i10, obj)) {
                        n(i11, y2.l(obj, z10 & 1048575), y1Var);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (q(i11, i10, obj)) {
                        y1Var.b(i11, y2.l(obj, z10 & 1048575), l(i10));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (q(i11, i10, obj)) {
                        y1Var.a(i11, (q0) y2.l(obj, z10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (q(i11, i10, obj)) {
                        int A3 = A(obj, z10 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.H(A3);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (q(i11, i10, obj)) {
                        int A4 = A(obj, z10 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.C(A4);
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(i11, i10, obj)) {
                        int A5 = A(obj, z10 & 1048575);
                        r0Var.D(i11, 5);
                        r0Var.M(A5);
                        break;
                    } else {
                        break;
                    }
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (q(i11, i10, obj)) {
                        long B4 = B(obj, z10 & 1048575);
                        r0Var.D(i11, 1);
                        r0Var.K(B4);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (q(i11, i10, obj)) {
                        int A6 = A(obj, z10 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.H((A6 >> 31) ^ (A6 << 1));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (q(i11, i10, obj)) {
                        long B5 = B(obj, z10 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.E((B5 >> 63) ^ (B5 << 1));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (q(i11, i10, obj)) {
                        y1Var.c(i11, y2.l(obj, z10 & 1048575), l(i10));
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.l.getClass();
        ((f1) obj).zzb.c(y1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fd, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d6, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d8, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d9, code lost:
    
        r3 = r8 + r3;
     */
    @Override // com.google.android.gms.internal.vision.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(f1 f1Var) {
        int i10;
        int a2;
        int i11;
        int[] iArr = this.a;
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int z10 = z(i13);
            int i14 = iArr[i13];
            long j3 = 1048575 & z10;
            int i15 = 1237;
            int i16 = 37;
            switch ((z10 & 267386880) >>> 20) {
                case 0:
                    i10 = i12 * 53;
                    a2 = j1.a(Double.doubleToLongBits(y2.c.j(f1Var, j3)));
                    i12 = a2 + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    a2 = Float.floatToIntBits(y2.c.i(f1Var, j3));
                    i12 = a2 + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    a2 = j1.a(y2.c.l(f1Var, j3));
                    i12 = a2 + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    a2 = j1.a(y2.c.l(f1Var, j3));
                    i12 = a2 + i10;
                    break;
                case 4:
                    i10 = i12 * 53;
                    a2 = y2.c.k(f1Var, j3);
                    i12 = a2 + i10;
                    break;
                case 5:
                    i10 = i12 * 53;
                    a2 = j1.a(y2.c.l(f1Var, j3));
                    i12 = a2 + i10;
                    break;
                case 6:
                    i10 = i12 * 53;
                    a2 = y2.c.k(f1Var, j3);
                    i12 = a2 + i10;
                    break;
                case 7:
                    i11 = i12 * 53;
                    boolean h = y2.c.h(f1Var, j3);
                    Charset charset = j1.a;
                    break;
                case 8:
                    i10 = i12 * 53;
                    a2 = ((String) y2.l(f1Var, j3)).hashCode();
                    i12 = a2 + i10;
                    break;
                case 9:
                    Object l4 = y2.l(f1Var, j3);
                    if (l4 != null) {
                        i16 = l4.hashCode();
                    }
                    i12 = (i12 * 53) + i16;
                    break;
                case 10:
                    i10 = i12 * 53;
                    a2 = y2.l(f1Var, j3).hashCode();
                    i12 = a2 + i10;
                    break;
                case 11:
                    i10 = i12 * 53;
                    a2 = y2.c.k(f1Var, j3);
                    i12 = a2 + i10;
                    break;
                case 12:
                    i10 = i12 * 53;
                    a2 = y2.c.k(f1Var, j3);
                    i12 = a2 + i10;
                    break;
                case 13:
                    i10 = i12 * 53;
                    a2 = y2.c.k(f1Var, j3);
                    i12 = a2 + i10;
                    break;
                case 14:
                    i10 = i12 * 53;
                    a2 = j1.a(y2.c.l(f1Var, j3));
                    i12 = a2 + i10;
                    break;
                case 15:
                    i10 = i12 * 53;
                    a2 = y2.c.k(f1Var, j3);
                    i12 = a2 + i10;
                    break;
                case 16:
                    i10 = i12 * 53;
                    a2 = j1.a(y2.c.l(f1Var, j3));
                    i12 = a2 + i10;
                    break;
                case 17:
                    Object l10 = y2.l(f1Var, j3);
                    if (l10 != null) {
                        i16 = l10.hashCode();
                    }
                    i12 = (i12 * 53) + i16;
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
                    i10 = i12 * 53;
                    a2 = y2.l(f1Var, j3).hashCode();
                    i12 = a2 + i10;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    i10 = i12 * 53;
                    a2 = y2.l(f1Var, j3).hashCode();
                    i12 = a2 + i10;
                    break;
                case 51:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = j1.a(Double.doubleToLongBits(((Double) y2.l(f1Var, j3)).doubleValue()));
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = Float.floatToIntBits(((Float) y2.l(f1Var, j3)).floatValue());
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = j1.a(B(f1Var, j3));
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = j1.a(B(f1Var, j3));
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = A(f1Var, j3);
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = j1.a(B(f1Var, j3));
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = A(f1Var, j3);
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (q(i14, i13, f1Var)) {
                        i11 = i12 * 53;
                        boolean booleanValue = ((Boolean) y2.l(f1Var, j3)).booleanValue();
                        Charset charset2 = j1.a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = ((String) y2.l(f1Var, j3)).hashCode();
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = y2.l(f1Var, j3).hashCode();
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = y2.l(f1Var, j3).hashCode();
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = A(f1Var, j3);
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = A(f1Var, j3);
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = A(f1Var, j3);
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = j1.a(B(f1Var, j3));
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = A(f1Var, j3);
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = j1.a(B(f1Var, j3));
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = y2.l(f1Var, j3).hashCode();
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.l.getClass();
        return f1Var.zzb.hashCode() + (i12 * 53);
    }

    @Override // com.google.android.gms.internal.vision.o2
    public final void e(f1 f1Var, f1 f1Var2) {
        f1 f1Var3;
        f1Var2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i10 >= iArr.length) {
                p2.h(this.l, f1Var, f1Var2);
                return;
            }
            int z10 = z(i10);
            long j3 = z10 & 1048575;
            int i11 = iArr[i10];
            switch ((z10 & 267386880) >>> 20) {
                case 0:
                    f1Var3 = f1Var;
                    if (!r(i10, f1Var2)) {
                        break;
                    } else {
                        x2 x2Var = y2.c;
                        x2Var.d(f1Var3, j3, x2Var.j(f1Var2, j3));
                        u(i10, f1Var3);
                        continue;
                    }
                case 1:
                    f1Var3 = f1Var;
                    if (r(i10, f1Var2)) {
                        x2 x2Var2 = y2.c;
                        x2Var2.e(f1Var3, j3, x2Var2.i(f1Var2, j3));
                        u(i10, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    f1Var3 = f1Var;
                    if (r(i10, f1Var2)) {
                        x2 x2Var3 = y2.c;
                        x2Var3.f(f1Var3, j3, x2Var3.l(f1Var2, j3));
                        u(i10, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    f1Var3 = f1Var;
                    if (r(i10, f1Var2)) {
                        x2 x2Var4 = y2.c;
                        x2Var4.f(f1Var3, j3, x2Var4.l(f1Var2, j3));
                        u(i10, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    f1Var3 = f1Var;
                    if (r(i10, f1Var2)) {
                        y2.c(j3, f1Var3, y2.c.k(f1Var2, j3));
                        u(i10, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    f1Var3 = f1Var;
                    if (r(i10, f1Var2)) {
                        x2 x2Var5 = y2.c;
                        x2Var5.f(f1Var3, j3, x2Var5.l(f1Var2, j3));
                        u(i10, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    f1Var3 = f1Var;
                    if (r(i10, f1Var2)) {
                        y2.c(j3, f1Var3, y2.c.k(f1Var2, j3));
                        u(i10, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    f1Var3 = f1Var;
                    if (r(i10, f1Var2)) {
                        x2 x2Var6 = y2.c;
                        x2Var6.g(f1Var3, j3, x2Var6.h(f1Var2, j3));
                        u(i10, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    f1Var3 = f1Var;
                    if (r(i10, f1Var2)) {
                        y2.d(f1Var3, j3, y2.l(f1Var2, j3));
                        u(i10, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    f1Var3 = f1Var;
                    o(i10, f1Var3, f1Var2);
                    continue;
                case 10:
                    f1Var3 = f1Var;
                    if (r(i10, f1Var2)) {
                        y2.d(f1Var3, j3, y2.l(f1Var2, j3));
                        u(i10, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    f1Var3 = f1Var;
                    if (r(i10, f1Var2)) {
                        y2.c(j3, f1Var3, y2.c.k(f1Var2, j3));
                        u(i10, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    f1Var3 = f1Var;
                    if (r(i10, f1Var2)) {
                        y2.c(j3, f1Var3, y2.c.k(f1Var2, j3));
                        u(i10, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    f1Var3 = f1Var;
                    if (r(i10, f1Var2)) {
                        y2.c(j3, f1Var3, y2.c.k(f1Var2, j3));
                        u(i10, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    f1Var3 = f1Var;
                    if (r(i10, f1Var2)) {
                        x2 x2Var7 = y2.c;
                        x2Var7.f(f1Var3, j3, x2Var7.l(f1Var2, j3));
                        u(i10, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    f1Var3 = f1Var;
                    if (r(i10, f1Var2)) {
                        y2.c(j3, f1Var3, y2.c.k(f1Var2, j3));
                        u(i10, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (r(i10, f1Var2)) {
                        x2 x2Var8 = y2.c;
                        f1Var3 = f1Var;
                        x2Var8.f(f1Var3, j3, x2Var8.l(f1Var2, j3));
                        u(i10, f1Var3);
                        break;
                    }
                    break;
                case 17:
                    o(i10, f1Var, f1Var2);
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
                    this.k.a(f1Var, j3, f1Var2);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Class cls = p2.a;
                    Object l4 = y2.l(f1Var, j3);
                    Object l10 = y2.l(f1Var2, j3);
                    this.m.getClass();
                    y2.d(f1Var, j3, b2.a(l4, l10));
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
                    if (q(i11, i10, f1Var2)) {
                        y2.d(f1Var, j3, y2.l(f1Var2, j3));
                        y2.c(iArr[i10 + 2] & 1048575, f1Var, i11);
                        break;
                    }
                    break;
                case 60:
                    v(i10, f1Var, f1Var2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                case 66:
                case 67:
                    if (q(i11, i10, f1Var2)) {
                        y2.d(f1Var, j3, y2.l(f1Var2, j3));
                        y2.c(iArr[i10 + 2] & 1048575, f1Var, i11);
                        break;
                    }
                    break;
                case 68:
                    v(i10, f1Var, f1Var2);
                    break;
            }
            f1Var3 = f1Var;
            i10 += 3;
            f1Var = f1Var3;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:81:0x00a8. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.o2
    public final void f(Object obj, byte[] bArr, int i10, int i11, com.google.android.gms.internal.clearcut.l lVar) {
        int i12;
        int i13;
        Unsafe unsafe;
        Object obj2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Unsafe unsafe2;
        Object obj3;
        int i21;
        Unsafe unsafe3;
        Object obj4;
        int i22;
        int i23;
        int i24;
        f2 f2Var = this;
        Object obj5 = obj;
        byte[] bArr2 = bArr;
        int i25 = i11;
        com.google.android.gms.internal.clearcut.l lVar2 = lVar;
        if (!f2Var.f) {
            j(obj5, bArr, i10, i25, 0, lVar);
            return;
        }
        Unsafe unsafe4 = o;
        int i26 = i10;
        int i27 = -1;
        int i28 = 0;
        int i29 = 1048575;
        int i30 = 0;
        while (i26 < i25) {
            int i31 = i26 + 1;
            int i32 = bArr2[i26];
            if (i32 < 0) {
                i31 = e1.d(i32, bArr2, i31, lVar2);
                i32 = lVar2.a;
            }
            int i33 = i31;
            int i34 = i32 >>> 3;
            int i35 = i32 & 7;
            int i36 = f2Var.d;
            int i37 = f2Var.c;
            if (i34 > i27) {
                i13 = (i34 < i37 || i34 > i36) ? -1 : f2Var.s(i34, i28 / 3);
                i12 = 0;
            } else if (i34 < i37 || i34 > i36) {
                i12 = 0;
                i13 = -1;
            } else {
                i12 = 0;
                i13 = f2Var.s(i34, 0);
            }
            int i38 = i13;
            if (i38 == -1) {
                unsafe = unsafe4;
                obj2 = obj5;
                i14 = i32;
                i15 = i30;
                i16 = i33;
                i17 = i12;
            } else {
                int[] iArr = f2Var.a;
                int i39 = iArr[i38 + 1];
                int i40 = (i39 & 267386880) >>> 20;
                int i41 = i32;
                long j3 = i39 & 1048575;
                if (i40 <= 17) {
                    int i42 = iArr[i38 + 2];
                    int i43 = 1 << (i42 >>> 20);
                    int i44 = i42 & 1048575;
                    if (i44 != i29) {
                        i19 = i40;
                        i18 = 1;
                        i20 = i39;
                        if (i29 != 1048575) {
                            unsafe4.putInt(obj5, i29, i30);
                        }
                        if (i44 != 1048575) {
                            i30 = unsafe4.getInt(obj5, i44);
                        }
                        i29 = i44;
                    } else {
                        i18 = 1;
                        i19 = i40;
                        i20 = i39;
                    }
                    switch (i19) {
                        case 0:
                            i21 = i34;
                            if (i35 != i18) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i15 = i30;
                                i16 = i33;
                                i17 = i38;
                                i34 = i21;
                                i14 = i41;
                                break;
                            } else {
                                unsafe3 = unsafe4;
                                y2.c.d(obj5, j3, Double.longBitsToDouble(e1.u(i33, bArr2)));
                                i26 = i33 + 8;
                                i30 |= i43;
                                unsafe4 = unsafe3;
                                i28 = i38;
                                i27 = i21;
                                break;
                            }
                        case 1:
                            i21 = i34;
                            if (i35 != 5) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i15 = i30;
                                i16 = i33;
                                i17 = i38;
                                i34 = i21;
                                i14 = i41;
                                break;
                            } else {
                                y2.c.e(obj5, j3, Float.intBitsToFloat(e1.a(i33, bArr2)));
                                i26 = i33 + 4;
                                i30 |= i43;
                                i28 = i38;
                                i27 = i21;
                                break;
                            }
                        case 2:
                        case 3:
                            i21 = i34;
                            if (i35 != 0) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i15 = i30;
                                i16 = i33;
                                i17 = i38;
                                i34 = i21;
                                i14 = i41;
                                break;
                            } else {
                                int t10 = e1.t(bArr2, i33, lVar2);
                                unsafe4.putLong(obj5, j3, lVar2.b);
                                i30 |= i43;
                                i26 = t10;
                                i28 = i38;
                                i27 = i21;
                                break;
                            }
                        case 4:
                        case 11:
                            i21 = i34;
                            if (i35 != 0) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i15 = i30;
                                i16 = i33;
                                i17 = i38;
                                i34 = i21;
                                i14 = i41;
                                break;
                            } else {
                                int j10 = e1.j(bArr2, i33, lVar2);
                                unsafe4.putInt(obj5, j3, lVar2.a);
                                i30 |= i43;
                                i26 = j10;
                                i28 = i38;
                                i27 = i21;
                                break;
                            }
                        case 5:
                        case 14:
                            i21 = i34;
                            if (i35 != i18) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i15 = i30;
                                i16 = i33;
                                i17 = i38;
                                i34 = i21;
                                i14 = i41;
                                break;
                            } else {
                                unsafe4.putLong(obj5, j3, e1.u(i33, bArr2));
                                i26 = i33 + 8;
                                i30 |= i43;
                                i28 = i38;
                                i27 = i21;
                                break;
                            }
                        case 6:
                        case 13:
                            i21 = i34;
                            if (i35 != 5) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i15 = i30;
                                i16 = i33;
                                i17 = i38;
                                i34 = i21;
                                i14 = i41;
                                break;
                            } else {
                                unsafe4.putInt(obj5, j3, e1.a(i33, bArr2));
                                i26 = i33 + 4;
                                i30 |= i43;
                                i28 = i38;
                                i27 = i21;
                                break;
                            }
                        case 7:
                            i21 = i34;
                            if (i35 != 0) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i15 = i30;
                                i16 = i33;
                                i17 = i38;
                                i34 = i21;
                                i14 = i41;
                                break;
                            } else {
                                i26 = e1.t(bArr2, i33, lVar2);
                                y2.c.g(obj5, j3, lVar2.b != 0 ? i18 : 0);
                                i30 |= i43;
                                i28 = i38;
                                i27 = i21;
                                break;
                            }
                        case 8:
                            i21 = i34;
                            if (i35 != 2) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i15 = i30;
                                i16 = i33;
                                i17 = i38;
                                i34 = i21;
                                i14 = i41;
                                break;
                            } else {
                                i26 = (i20 & TLObject.FLAG_29) == 0 ? e1.w(bArr2, i33, lVar2) : e1.x(bArr2, i33, lVar2);
                                unsafe4.putObject(obj5, j3, lVar2.c);
                                i30 |= i43;
                                i28 = i38;
                                i27 = i21;
                                break;
                            }
                        case 9:
                            i21 = i34;
                            if (i35 != 2) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i15 = i30;
                                i16 = i33;
                                i17 = i38;
                                i34 = i21;
                                i14 = i41;
                                break;
                            } else {
                                i26 = e1.g(f2Var.l(i38), bArr2, i33, i25, lVar2);
                                Object object = unsafe4.getObject(obj5, j3);
                                if (object == null) {
                                    unsafe4.putObject(obj5, j3, lVar2.c);
                                } else {
                                    unsafe4.putObject(obj5, j3, j1.b(object, lVar2.c));
                                }
                                i30 |= i43;
                                i28 = i38;
                                i27 = i21;
                                break;
                            }
                        case 10:
                            i21 = i34;
                            if (i35 != 2) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i15 = i30;
                                i16 = i33;
                                i17 = i38;
                                i34 = i21;
                                i14 = i41;
                                break;
                            } else {
                                i26 = e1.z(bArr2, i33, lVar2);
                                unsafe4.putObject(obj5, j3, lVar2.c);
                                i30 |= i43;
                                i28 = i38;
                                i27 = i21;
                                break;
                            }
                        case 12:
                            i21 = i34;
                            if (i35 != 0) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i15 = i30;
                                i16 = i33;
                                i17 = i38;
                                i34 = i21;
                                i14 = i41;
                                break;
                            } else {
                                i26 = e1.j(bArr2, i33, lVar2);
                                unsafe4.putInt(obj5, j3, lVar2.a);
                                i30 |= i43;
                                i28 = i38;
                                i27 = i21;
                                break;
                            }
                        case 15:
                            i21 = i34;
                            if (i35 != 0) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i15 = i30;
                                i16 = i33;
                                i17 = i38;
                                i34 = i21;
                                i14 = i41;
                                break;
                            } else {
                                i26 = e1.j(bArr2, i33, lVar2);
                                unsafe4.putInt(obj5, j3, e1.y(lVar2.a));
                                i30 |= i43;
                                i28 = i38;
                                i27 = i21;
                                break;
                            }
                        case 16:
                            if (i35 != 0) {
                                i21 = i34;
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i15 = i30;
                                i16 = i33;
                                i17 = i38;
                                i34 = i21;
                                i14 = i41;
                                break;
                            } else {
                                int t11 = e1.t(bArr2, i33, lVar2);
                                long j11 = lVar2.b;
                                i21 = i34;
                                unsafe4.putLong(obj5, j3, (j11 >>> i18) ^ (-(j11 & 1)));
                                i30 |= i43;
                                i26 = t11;
                                i28 = i38;
                                i27 = i21;
                                break;
                            }
                        default:
                            unsafe2 = unsafe4;
                            obj3 = obj5;
                            i21 = i34;
                            obj2 = obj3;
                            unsafe = unsafe2;
                            i15 = i30;
                            i16 = i33;
                            i17 = i38;
                            i34 = i21;
                            i14 = i41;
                            break;
                    }
                } else {
                    i21 = i34;
                    unsafe3 = unsafe4;
                    Object obj6 = obj5;
                    if (i40 != 27) {
                        if (i40 <= 49) {
                            long j12 = i39;
                            unsafe = unsafe3;
                            i15 = i30;
                            i23 = i29;
                            i34 = i21;
                            i14 = i41;
                            i24 = f2Var.i(obj, bArr, i33, i11, i14, i34, i35, i38, j12, i40, j3, lVar);
                            obj5 = obj;
                            i17 = i38;
                            if (i24 == i33) {
                                obj2 = obj5;
                                i16 = i24;
                            } else {
                                i25 = i11;
                                lVar2 = lVar;
                                i27 = i34;
                                i26 = i24;
                                i28 = i17;
                                i29 = i23;
                                i30 = i15;
                                unsafe4 = unsafe;
                                bArr2 = bArr;
                            }
                        } else {
                            unsafe = unsafe3;
                            i15 = i30;
                            i17 = i38;
                            i22 = i33;
                            i23 = i29;
                            i34 = i21;
                            i14 = i41;
                            obj4 = obj;
                            if (i40 != 50) {
                                i24 = f2Var.h(obj4, bArr, i22, i11, i14, i34, i35, i39, i40, j3, i17, lVar);
                                obj2 = obj4;
                                if (i24 == i22) {
                                    i16 = i24;
                                } else {
                                    f2Var = this;
                                    lVar2 = lVar;
                                    i27 = i34;
                                    i26 = i24;
                                    obj5 = obj2;
                                    i28 = i17;
                                    i29 = i23;
                                    i30 = i15;
                                    unsafe4 = unsafe;
                                    bArr2 = bArr;
                                    i25 = i11;
                                }
                            } else if (i35 == 2) {
                                f2Var.p(j3, obj4, i17);
                                throw null;
                            }
                        }
                        i29 = i23;
                    } else if (i35 == 2) {
                        o1 o1Var = (o1) unsafe3.getObject(obj6, j3);
                        if (!o1Var.zza()) {
                            int size = o1Var.size();
                            o1Var = o1Var.zza(size == 0 ? 10 : size << 1);
                            unsafe3.putObject(obj6, j3, o1Var);
                        }
                        int e7 = e1.e(f2Var.l(i38), i41, bArr2, i33, i25, o1Var, lVar2);
                        obj5 = obj;
                        bArr2 = bArr;
                        i25 = i11;
                        lVar2 = lVar;
                        i26 = e7;
                        unsafe4 = unsafe3;
                        i28 = i38;
                        i27 = i21;
                    } else {
                        obj4 = obj;
                        unsafe = unsafe3;
                        i15 = i30;
                        i22 = i33;
                        i17 = i38;
                        i34 = i21;
                        i14 = i41;
                        i23 = i29;
                    }
                    obj2 = obj4;
                    i16 = i22;
                    i29 = i23;
                }
            }
            int c10 = e1.c(i14, bArr, i16, i11, C(obj2), lVar);
            bArr2 = bArr;
            lVar2 = lVar;
            i27 = i34;
            obj5 = obj2;
            i28 = i17;
            i30 = i15;
            unsafe4 = unsafe;
            i25 = i11;
            i26 = c10;
            f2Var = this;
        }
        Unsafe unsafe5 = unsafe4;
        int i45 = i25;
        int i46 = i29;
        int i47 = i30;
        Object obj7 = obj5;
        if (i46 != 1048575) {
            unsafe5.putInt(obj7, i46, i47);
        }
        if (i26 != i45) {
            throw new n1("Failed to parse the message.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (com.google.android.gms.internal.vision.p2.i(com.google.android.gms.internal.vision.y2.l(r12, r7), com.google.android.gms.internal.vision.y2.l(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
    
        if (r5.l(r12, r7) != r5.l(r13, r7)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0095, code lost:
    
        if (r5.k(r12, r7) != r5.k(r13, r7)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
    
        if (r5.l(r12, r7) != r5.l(r13, r7)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
    
        if (r5.k(r12, r7) != r5.k(r13, r7)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d1, code lost:
    
        if (r5.k(r12, r7) != r5.k(r13, r7)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e5, code lost:
    
        if (r5.k(r12, r7) != r5.k(r13, r7)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fb, code lost:
    
        if (com.google.android.gms.internal.vision.p2.i(com.google.android.gms.internal.vision.y2.l(r12, r7), com.google.android.gms.internal.vision.y2.l(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0111, code lost:
    
        if (com.google.android.gms.internal.vision.p2.i(com.google.android.gms.internal.vision.y2.l(r12, r7), com.google.android.gms.internal.vision.y2.l(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0127, code lost:
    
        if (com.google.android.gms.internal.vision.p2.i(com.google.android.gms.internal.vision.y2.l(r12, r7), com.google.android.gms.internal.vision.y2.l(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013b, code lost:
    
        if (r5.h(r12, r7) != r5.h(r13, r7)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014f, code lost:
    
        if (r5.k(r12, r7) != r5.k(r13, r7)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0165, code lost:
    
        if (r5.l(r12, r7) != r5.l(r13, r7)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0179, code lost:
    
        if (r5.k(r12, r7) != r5.k(r13, r7)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018f, code lost:
    
        if (r5.l(r12, r7) != r5.l(r13, r7)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a5, code lost:
    
        if (r5.l(r12, r7) != r5.l(r13, r7)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01c1, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.i(r12, r7)) != java.lang.Float.floatToIntBits(r5.i(r13, r7))) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01df, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.j(r12, r7)) != java.lang.Double.doubleToLongBits(r5.j(r13, r7))) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        if (com.google.android.gms.internal.vision.p2.i(com.google.android.gms.internal.vision.y2.l(r12, r7), com.google.android.gms.internal.vision.y2.l(r13, r7)) != false) goto L105;
     */
    @Override // com.google.android.gms.internal.vision.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(f1 f1Var, f1 f1Var2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 < length) {
                int z11 = z(i10);
                long j3 = z11 & 1048575;
                switch ((z11 & 267386880) >>> 20) {
                    case 0:
                        if (y(f1Var, f1Var2, i10)) {
                            x2 x2Var = y2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 1:
                        if (y(f1Var, f1Var2, i10)) {
                            x2 x2Var2 = y2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 2:
                        if (y(f1Var, f1Var2, i10)) {
                            x2 x2Var3 = y2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 3:
                        if (y(f1Var, f1Var2, i10)) {
                            x2 x2Var4 = y2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 4:
                        if (y(f1Var, f1Var2, i10)) {
                            x2 x2Var5 = y2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 5:
                        if (y(f1Var, f1Var2, i10)) {
                            x2 x2Var6 = y2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 6:
                        if (y(f1Var, f1Var2, i10)) {
                            x2 x2Var7 = y2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 7:
                        if (y(f1Var, f1Var2, i10)) {
                            x2 x2Var8 = y2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 8:
                        if (y(f1Var, f1Var2, i10)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 9:
                        if (y(f1Var, f1Var2, i10)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 10:
                        if (y(f1Var, f1Var2, i10)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 11:
                        if (y(f1Var, f1Var2, i10)) {
                            x2 x2Var9 = y2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 12:
                        if (y(f1Var, f1Var2, i10)) {
                            x2 x2Var10 = y2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 13:
                        if (y(f1Var, f1Var2, i10)) {
                            x2 x2Var11 = y2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 14:
                        if (y(f1Var, f1Var2, i10)) {
                            x2 x2Var12 = y2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 15:
                        if (y(f1Var, f1Var2, i10)) {
                            x2 x2Var13 = y2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 16:
                        if (y(f1Var, f1Var2, i10)) {
                            x2 x2Var14 = y2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 17:
                        if (y(f1Var, f1Var2, i10)) {
                            break;
                        }
                        z10 = false;
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
                        z10 = p2.i(y2.l(f1Var, j3), y2.l(f1Var2, j3));
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        z10 = p2.i(y2.l(f1Var, j3), y2.l(f1Var2, j3));
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
                        x2 x2Var15 = y2.c;
                        if (x2Var15.k(f1Var, j10) == x2Var15.k(f1Var2, j10)) {
                            break;
                        }
                        z10 = false;
                        break;
                }
                if (z10) {
                    i10 += 3;
                }
            } else {
                this.l.getClass();
                if (f1Var.zzb.equals(f1Var2.zzb)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int h(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j3, int i17, com.google.android.gms.internal.clearcut.l lVar) {
        int i18;
        int i19;
        int t10;
        Object object;
        Unsafe unsafe = o;
        long j10 = this.a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                i18 = i10;
                if (i14 != 1) {
                    return i18;
                }
                unsafe.putObject(obj, j3, Double.valueOf(Double.longBitsToDouble(e1.u(i18, bArr))));
                t10 = i18 + 8;
                unsafe.putInt(obj, j10, i13);
                return t10;
            case 52:
                i19 = i10;
                if (i14 != 5) {
                    return i19;
                }
                unsafe.putObject(obj, j3, Float.valueOf(Float.intBitsToFloat(e1.a(i19, bArr))));
                t10 = i19 + 4;
                unsafe.putInt(obj, j10, i13);
                return t10;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                t10 = e1.t(bArr, i10, lVar);
                unsafe.putObject(obj, j3, Long.valueOf(lVar.b));
                unsafe.putInt(obj, j10, i13);
                return t10;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                t10 = e1.j(bArr, i10, lVar);
                unsafe.putObject(obj, j3, Integer.valueOf(lVar.a));
                unsafe.putInt(obj, j10, i13);
                return t10;
            case 56:
            case VoIPService.CALL_MIN_LAYER /* 65 */:
                i18 = i10;
                if (i14 != 1) {
                    return i18;
                }
                unsafe.putObject(obj, j3, Long.valueOf(e1.u(i18, bArr)));
                t10 = i18 + 8;
                unsafe.putInt(obj, j10, i13);
                return t10;
            case 57:
            case 64:
                i19 = i10;
                if (i14 != 5) {
                    return i19;
                }
                unsafe.putObject(obj, j3, Integer.valueOf(e1.a(i19, bArr)));
                t10 = i19 + 4;
                unsafe.putInt(obj, j10, i13);
                return t10;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                t10 = e1.t(bArr, i10, lVar);
                unsafe.putObject(obj, j3, Boolean.valueOf(lVar.b != 0));
                unsafe.putInt(obj, j10, i13);
                return t10;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int j11 = e1.j(bArr, i10, lVar);
                int i20 = lVar.a;
                if (i20 == 0) {
                    unsafe.putObject(obj, j3, "");
                } else {
                    if ((i15 & TLObject.FLAG_29) != 0) {
                        if (!b3.a.s(j11, j11 + i20, bArr)) {
                            throw n1.c();
                        }
                    }
                    unsafe.putObject(obj, j3, new String(bArr, j11, i20, j1.a));
                    j11 += i20;
                }
                unsafe.putInt(obj, j10, i13);
                return j11;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                int g10 = e1.g(l(i17), bArr, i10, i11, lVar);
                object = unsafe.getInt(obj, j10) == i13 ? unsafe.getObject(obj, j3) : null;
                if (object == null) {
                    unsafe.putObject(obj, j3, lVar.c);
                } else {
                    unsafe.putObject(obj, j3, j1.b(object, lVar.c));
                }
                unsafe.putInt(obj, j10, i13);
                return g10;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                t10 = e1.z(bArr, i10, lVar);
                unsafe.putObject(obj, j3, lVar.c);
                unsafe.putInt(obj, j10, i13);
                return t10;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int j12 = e1.j(bArr, i10, lVar);
                int i21 = lVar.a;
                k1 x10 = x(i17);
                if (x10 != null && !x10.zza(i21)) {
                    C(obj).a(i12, Long.valueOf(i21));
                    return j12;
                }
                unsafe.putObject(obj, j3, Integer.valueOf(i21));
                t10 = j12;
                unsafe.putInt(obj, j10, i13);
                return t10;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                t10 = e1.j(bArr, i10, lVar);
                unsafe.putObject(obj, j3, Integer.valueOf(e1.y(lVar.a)));
                unsafe.putInt(obj, j10, i13);
                return t10;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                t10 = e1.t(bArr, i10, lVar);
                long j13 = lVar.b;
                unsafe.putObject(obj, j3, Long.valueOf((-(j13 & 1)) ^ (j13 >>> 1)));
                unsafe.putInt(obj, j10, i13);
                return t10;
            case 68:
                if (i14 == 3) {
                    t10 = e1.f(l(i17), bArr, i10, i11, (i12 & (-8)) | 4, lVar);
                    object = unsafe.getInt(obj, j10) == i13 ? unsafe.getObject(obj, j3) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j3, lVar.c);
                    } else {
                        unsafe.putObject(obj, j3, j1.b(object, lVar.c));
                    }
                    unsafe.putInt(obj, j10, i13);
                    return t10;
                }
            default:
                return i10;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int i(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j3, int i16, long j10, com.google.android.gms.internal.clearcut.l lVar) {
        int b10;
        Unsafe unsafe = o;
        o1 o1Var = (o1) unsafe.getObject(obj, j10);
        if (!o1Var.zza()) {
            int size = o1Var.size();
            o1Var = o1Var.zza(size == 0 ? 10 : size << 1);
            unsafe.putObject(obj, j10, o1Var);
        }
        o1 o1Var2 = o1Var;
        switch (i16) {
            case 18:
            case 35:
                if (i14 != 2) {
                    if (i14 == 1) {
                        Double.longBitsToDouble(e1.u(i10, bArr));
                        throw null;
                    }
                    return i10;
                }
                int j11 = e1.j(bArr, i10, lVar);
                int i17 = lVar.a + j11;
                if (j11 < i17) {
                    Double.longBitsToDouble(e1.u(j11, bArr));
                    throw null;
                }
                if (j11 == i17) {
                    return j11;
                }
                throw n1.a();
            case 19:
            case 36:
                if (i14 != 2) {
                    if (i14 == 5) {
                        Float.intBitsToFloat(e1.a(i10, bArr));
                        throw null;
                    }
                    return i10;
                }
                int j12 = e1.j(bArr, i10, lVar);
                int i18 = lVar.a + j12;
                if (j12 < i18) {
                    Float.intBitsToFloat(e1.a(j12, bArr));
                    throw null;
                }
                if (j12 == i18) {
                    return j12;
                }
                throw n1.a();
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 != 2) {
                    if (i14 == 0) {
                        e1.t(bArr, i10, lVar);
                        throw null;
                    }
                    return i10;
                }
                int j13 = e1.j(bArr, i10, lVar);
                int i19 = lVar.a + j13;
                if (j13 < i19) {
                    e1.t(bArr, j13, lVar);
                    throw null;
                }
                if (j13 == i19) {
                    return j13;
                }
                throw n1.a();
            case 22:
            case 29:
            case Maneuver.TYPE_DESTINATION /* 39 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                if (i14 != 2) {
                    if (i14 == 0) {
                        return e1.b(i12, bArr, i10, i11, o1Var2, lVar);
                    }
                    return i10;
                }
                h1 h1Var = (h1) o1Var2;
                int j14 = e1.j(bArr, i10, lVar);
                int i20 = lVar.a + j14;
                while (j14 < i20) {
                    j14 = e1.j(bArr, j14, lVar);
                    h1Var.n(lVar.a);
                }
                if (j14 == i20) {
                    return j14;
                }
                throw n1.a();
            case 23:
            case 32:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                if (i14 != 2) {
                    if (i14 == 1) {
                        e1.u(i10, bArr);
                        throw null;
                    }
                    return i10;
                }
                int j15 = e1.j(bArr, i10, lVar);
                int i21 = lVar.a + j15;
                if (j15 < i21) {
                    e1.u(j15, bArr);
                    throw null;
                }
                if (j15 == i21) {
                    return j15;
                }
                throw n1.a();
            case 24:
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                if (i14 == 2) {
                    h1 h1Var2 = (h1) o1Var2;
                    int j16 = e1.j(bArr, i10, lVar);
                    int i22 = lVar.a + j16;
                    while (j16 < i22) {
                        h1Var2.n(e1.a(j16, bArr));
                        j16 += 4;
                    }
                    if (j16 == i22) {
                        return j16;
                    }
                    throw n1.a();
                }
                if (i14 == 5) {
                    h1 h1Var3 = (h1) o1Var2;
                    h1Var3.n(e1.a(i10, bArr));
                    int i23 = i10 + 4;
                    while (i23 < i11) {
                        int j17 = e1.j(bArr, i23, lVar);
                        if (i12 != lVar.a) {
                            return i23;
                        }
                        h1Var3.n(e1.a(j17, bArr));
                        i23 = j17 + 4;
                    }
                    return i23;
                }
                return i10;
            case 25:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                if (i14 != 2) {
                    if (i14 == 0) {
                        e1.t(bArr, i10, lVar);
                        throw null;
                    }
                    return i10;
                }
                int j18 = e1.j(bArr, i10, lVar);
                int i24 = lVar.a + j18;
                if (j18 < i24) {
                    e1.t(bArr, j18, lVar);
                    throw null;
                }
                if (j18 == i24) {
                    return j18;
                }
                throw n1.a();
            case 26:
                if (i14 == 2) {
                    if ((j3 & 536870912) == 0) {
                        int j19 = e1.j(bArr, i10, lVar);
                        int i25 = lVar.a;
                        if (i25 < 0) {
                            throw n1.b();
                        }
                        if (i25 == 0) {
                            o1Var2.add("");
                        } else {
                            o1Var2.add(new String(bArr, j19, i25, j1.a));
                            j19 += i25;
                        }
                        while (j19 < i11) {
                            int j20 = e1.j(bArr, j19, lVar);
                            if (i12 != lVar.a) {
                                return j19;
                            }
                            j19 = e1.j(bArr, j20, lVar);
                            int i26 = lVar.a;
                            if (i26 < 0) {
                                throw n1.b();
                            }
                            if (i26 == 0) {
                                o1Var2.add("");
                            } else {
                                o1Var2.add(new String(bArr, j19, i26, j1.a));
                                j19 += i26;
                            }
                        }
                        return j19;
                    }
                    int j21 = e1.j(bArr, i10, lVar);
                    int i27 = lVar.a;
                    if (i27 < 0) {
                        throw n1.b();
                    }
                    if (i27 == 0) {
                        o1Var2.add("");
                    } else {
                        int i28 = j21 + i27;
                        if (!b3.a.s(j21, i28, bArr)) {
                            throw n1.c();
                        }
                        o1Var2.add(new String(bArr, j21, i27, j1.a));
                        j21 = i28;
                    }
                    while (j21 < i11) {
                        int j22 = e1.j(bArr, j21, lVar);
                        if (i12 != lVar.a) {
                            return j21;
                        }
                        j21 = e1.j(bArr, j22, lVar);
                        int i29 = lVar.a;
                        if (i29 < 0) {
                            throw n1.b();
                        }
                        if (i29 == 0) {
                            o1Var2.add("");
                        } else {
                            int i30 = j21 + i29;
                            if (!b3.a.s(j21, i30, bArr)) {
                                throw n1.c();
                            }
                            o1Var2.add(new String(bArr, j21, i29, j1.a));
                            j21 = i30;
                        }
                    }
                    return j21;
                }
                return i10;
            case 27:
                if (i14 == 2) {
                    return e1.e(l(i15), i12, bArr, i10, i11, o1Var2, lVar);
                }
                return i10;
            case 28:
                if (i14 == 2) {
                    int j23 = e1.j(bArr, i10, lVar);
                    int i31 = lVar.a;
                    if (i31 < 0) {
                        throw n1.b();
                    }
                    if (i31 > bArr.length - j23) {
                        throw n1.a();
                    }
                    if (i31 == 0) {
                        o1Var2.add(q0.c);
                    } else {
                        o1Var2.add(q0.o(j23, i31, bArr));
                        j23 += i31;
                    }
                    while (j23 < i11) {
                        int j24 = e1.j(bArr, j23, lVar);
                        if (i12 != lVar.a) {
                            return j23;
                        }
                        j23 = e1.j(bArr, j24, lVar);
                        int i32 = lVar.a;
                        if (i32 < 0) {
                            throw n1.b();
                        }
                        if (i32 > bArr.length - j23) {
                            throw n1.a();
                        }
                        if (i32 == 0) {
                            o1Var2.add(q0.c);
                        } else {
                            o1Var2.add(q0.o(j23, i32, bArr));
                            j23 += i32;
                        }
                    }
                    return j23;
                }
                return i10;
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                if (i14 != 2) {
                    if (i14 == 0) {
                        b10 = e1.b(i12, bArr, i10, i11, o1Var2, lVar);
                    }
                    return i10;
                }
                h1 h1Var4 = (h1) o1Var2;
                b10 = e1.j(bArr, i10, lVar);
                int i33 = lVar.a + b10;
                while (b10 < i33) {
                    b10 = e1.j(bArr, b10, lVar);
                    h1Var4.n(lVar.a);
                }
                if (b10 != i33) {
                    throw n1.a();
                }
                f1 f1Var = (f1) obj;
                r2 r2Var = f1Var.zzb;
                r2 r2Var2 = r2Var != r2.f ? r2Var : null;
                k1 x10 = x(i15);
                Class cls = p2.a;
                if (x10 != null) {
                    boolean z10 = o1Var2 instanceof RandomAccess;
                    q2 q2Var = this.l;
                    if (z10) {
                        int size2 = o1Var2.size();
                        int i34 = 0;
                        for (int i35 = 0; i35 < size2; i35++) {
                            Integer num = (Integer) o1Var2.get(i35);
                            int intValue = num.intValue();
                            if (x10.zza(intValue)) {
                                if (i35 != i34) {
                                    o1Var2.set(i34, num);
                                }
                                i34++;
                            } else {
                                if (r2Var2 == null) {
                                    q2Var.getClass();
                                    r2Var2 = r2.b();
                                }
                                q2Var.getClass();
                                r2Var2.a(i13 << 3, Long.valueOf(intValue));
                            }
                        }
                        if (i34 != size2) {
                            o1Var2.subList(i34, size2).clear();
                        }
                    } else {
                        Iterator it = o1Var2.iterator();
                        while (it.hasNext()) {
                            int intValue2 = ((Integer) it.next()).intValue();
                            if (!x10.zza(intValue2)) {
                                if (r2Var2 == null) {
                                    q2Var.getClass();
                                    r2Var2 = r2.b();
                                }
                                q2Var.getClass();
                                r2Var2.a(i13 << 3, Long.valueOf(intValue2));
                                it.remove();
                            }
                        }
                    }
                }
                if (r2Var2 != null) {
                    f1Var.zzb = r2Var2;
                }
                return b10;
            case 33:
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                if (i14 == 2) {
                    h1 h1Var5 = (h1) o1Var2;
                    int j25 = e1.j(bArr, i10, lVar);
                    int i36 = lVar.a + j25;
                    while (j25 < i36) {
                        j25 = e1.j(bArr, j25, lVar);
                        h1Var5.n(e1.y(lVar.a));
                    }
                    if (j25 == i36) {
                        return j25;
                    }
                    throw n1.a();
                }
                if (i14 == 0) {
                    h1 h1Var6 = (h1) o1Var2;
                    int j26 = e1.j(bArr, i10, lVar);
                    h1Var6.n(e1.y(lVar.a));
                    while (j26 < i11) {
                        int j27 = e1.j(bArr, j26, lVar);
                        if (i12 != lVar.a) {
                            return j26;
                        }
                        j26 = e1.j(bArr, j27, lVar);
                        h1Var6.n(e1.y(lVar.a));
                    }
                    return j26;
                }
                return i10;
            case 34:
            case 48:
                if (i14 != 2) {
                    if (i14 == 0) {
                        e1.t(bArr, i10, lVar);
                        throw null;
                    }
                    return i10;
                }
                int j28 = e1.j(bArr, i10, lVar);
                int i37 = lVar.a + j28;
                if (j28 < i37) {
                    e1.t(bArr, j28, lVar);
                    throw null;
                }
                if (j28 == i37) {
                    return j28;
                }
                throw n1.a();
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                if (i14 == 3) {
                    o2 l4 = l(i15);
                    int i38 = (i12 & (-8)) | 4;
                    int f7 = e1.f(l4, bArr, i10, i11, i38, lVar);
                    o2 o2Var = l4;
                    int i39 = i11;
                    com.google.android.gms.internal.clearcut.l lVar2 = lVar;
                    o1Var2.add(lVar2.c);
                    while (f7 < i39) {
                        int j29 = e1.j(bArr, f7, lVar2);
                        if (i12 != lVar2.a) {
                            return f7;
                        }
                        o2 o2Var2 = o2Var;
                        int i40 = i39;
                        com.google.android.gms.internal.clearcut.l lVar3 = lVar2;
                        f7 = e1.f(o2Var2, bArr, j29, i40, i38, lVar3);
                        o1Var2.add(lVar3.c);
                        o2Var = o2Var2;
                        i39 = i40;
                        lVar2 = lVar3;
                    }
                    return f7;
                }
                return i10;
            default:
                return i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x03f7, code lost:
    
        if (r7 == r3) goto L140;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(Object obj, byte[] bArr, int i10, int i11, int i12, com.google.android.gms.internal.clearcut.l lVar) {
        int i13;
        Unsafe unsafe;
        int[] iArr;
        f2 f2Var;
        Object obj2;
        int i14;
        int i15;
        int i16;
        int i17;
        Object obj3;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int h;
        int i23;
        int i24;
        int i25;
        int i26;
        char c10;
        Unsafe unsafe2;
        int i27;
        Unsafe unsafe3;
        Object obj4;
        int i28;
        int i29;
        Unsafe unsafe4;
        int i30;
        int i31;
        Object obj5;
        f2 f2Var2 = this;
        Object obj6 = obj;
        byte[] bArr2 = bArr;
        int i32 = i11;
        com.google.android.gms.internal.clearcut.l lVar2 = lVar;
        Unsafe unsafe5 = o;
        int i33 = i10;
        int i34 = -1;
        int i35 = 0;
        int i36 = 0;
        int i37 = 1048575;
        int i38 = 0;
        while (true) {
            int[] iArr2 = f2Var2.a;
            if (i33 < i32) {
                int i39 = i33 + 1;
                int i40 = bArr2[i33];
                if (i40 < 0) {
                    i39 = e1.d(i40, bArr2, i39, lVar2);
                    i40 = lVar2.a;
                }
                int i41 = i40 >>> 3;
                int i42 = i39;
                int i43 = i40 & 7;
                int i44 = f2Var2.d;
                int i45 = f2Var2.c;
                int i46 = i40;
                if (i41 > i34) {
                    i15 = (i41 < i45 || i41 > i44) ? -1 : f2Var2.s(i41, i35 / 3);
                    i14 = 0;
                } else if (i41 < i45 || i41 > i44) {
                    i14 = 0;
                    i15 = -1;
                } else {
                    i14 = 0;
                    i15 = f2Var2.s(i41, 0);
                }
                if (i15 == -1) {
                    i13 = i37;
                    unsafe = unsafe5;
                    iArr = iArr2;
                    int i47 = i14;
                    i22 = i41;
                    i16 = i46;
                    f2Var = f2Var2;
                    obj2 = obj6;
                    i17 = i47;
                    i23 = i42;
                } else {
                    int i48 = iArr2[i15 + 1];
                    int i49 = (i48 & 267386880) >>> 20;
                    long j3 = i48 & 1048575;
                    if (i49 <= 17) {
                        int i50 = iArr2[i15 + 2];
                        int i51 = 1 << (i50 >>> 20);
                        int i52 = i50 & 1048575;
                        iArr = iArr2;
                        if (i52 != i37) {
                            i25 = i51;
                            if (i37 != 1048575) {
                                unsafe5.putInt(obj6, i37, i38);
                            }
                            i38 = unsafe5.getInt(obj6, i52);
                            i24 = i52;
                        } else {
                            i25 = i51;
                            i24 = i37;
                        }
                        switch (i49) {
                            case 0:
                                i16 = i46;
                                i26 = i41;
                                c10 = 65535;
                                i17 = i15;
                                unsafe2 = unsafe5;
                                i27 = i42;
                                if (i43 == 1) {
                                    unsafe3 = unsafe2;
                                    y2.c.d(obj6, j3, Double.longBitsToDouble(e1.u(i27, bArr)));
                                    obj4 = obj6;
                                    i28 = i27 + 8;
                                    i22 = i26;
                                    i32 = i11;
                                    f2Var = f2Var2;
                                    obj2 = obj4;
                                    i38 |= i25;
                                    unsafe = unsafe3;
                                    i33 = i28;
                                    bArr2 = bArr;
                                    lVar2 = lVar;
                                    i34 = i22;
                                    f2Var2 = f2Var;
                                    obj6 = obj2;
                                    i37 = i24;
                                    i36 = i16;
                                    i35 = i17;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i22 = i26;
                                f2Var = f2Var2;
                                unsafe = unsafe4;
                                i23 = i27;
                                i13 = i24;
                                obj2 = obj5;
                                break;
                            case 1:
                                i16 = i46;
                                i26 = i41;
                                c10 = 65535;
                                i17 = i15;
                                unsafe2 = unsafe5;
                                i27 = i42;
                                if (i43 == 5) {
                                    y2.c.e(obj6, j3, Float.intBitsToFloat(e1.a(i27, bArr)));
                                    i29 = i27 + 4;
                                    int i53 = i29;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i28 = i53;
                                    i22 = i26;
                                    i32 = i11;
                                    f2Var = f2Var2;
                                    obj2 = obj4;
                                    i38 |= i25;
                                    unsafe = unsafe3;
                                    i33 = i28;
                                    bArr2 = bArr;
                                    lVar2 = lVar;
                                    i34 = i22;
                                    f2Var2 = f2Var;
                                    obj6 = obj2;
                                    i37 = i24;
                                    i36 = i16;
                                    i35 = i17;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i22 = i26;
                                f2Var = f2Var2;
                                unsafe = unsafe4;
                                i23 = i27;
                                i13 = i24;
                                obj2 = obj5;
                                break;
                            case 2:
                            case 3:
                                i16 = i46;
                                i26 = i41;
                                c10 = 65535;
                                i17 = i15;
                                unsafe2 = unsafe5;
                                i27 = i42;
                                if (i43 == 0) {
                                    i29 = e1.t(bArr, i27, lVar2);
                                    unsafe2.putLong(obj6, j3, lVar2.b);
                                    int i532 = i29;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i28 = i532;
                                    i22 = i26;
                                    i32 = i11;
                                    f2Var = f2Var2;
                                    obj2 = obj4;
                                    i38 |= i25;
                                    unsafe = unsafe3;
                                    i33 = i28;
                                    bArr2 = bArr;
                                    lVar2 = lVar;
                                    i34 = i22;
                                    f2Var2 = f2Var;
                                    obj6 = obj2;
                                    i37 = i24;
                                    i36 = i16;
                                    i35 = i17;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i22 = i26;
                                f2Var = f2Var2;
                                unsafe = unsafe4;
                                i23 = i27;
                                i13 = i24;
                                obj2 = obj5;
                                break;
                            case 4:
                            case 11:
                                i16 = i46;
                                i26 = i41;
                                c10 = 65535;
                                i17 = i15;
                                unsafe2 = unsafe5;
                                i27 = i42;
                                if (i43 == 0) {
                                    i29 = e1.j(bArr, i27, lVar2);
                                    unsafe2.putInt(obj6, j3, lVar2.a);
                                    int i5322 = i29;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i28 = i5322;
                                    i22 = i26;
                                    i32 = i11;
                                    f2Var = f2Var2;
                                    obj2 = obj4;
                                    i38 |= i25;
                                    unsafe = unsafe3;
                                    i33 = i28;
                                    bArr2 = bArr;
                                    lVar2 = lVar;
                                    i34 = i22;
                                    f2Var2 = f2Var;
                                    obj6 = obj2;
                                    i37 = i24;
                                    i36 = i16;
                                    i35 = i17;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i22 = i26;
                                f2Var = f2Var2;
                                unsafe = unsafe4;
                                i23 = i27;
                                i13 = i24;
                                obj2 = obj5;
                                break;
                            case 5:
                            case 14:
                                i16 = i46;
                                i26 = i41;
                                c10 = 65535;
                                i17 = i15;
                                unsafe2 = unsafe5;
                                if (i43 != 1) {
                                    i27 = i42;
                                    unsafe4 = unsafe2;
                                    obj5 = obj6;
                                    i22 = i26;
                                    f2Var = f2Var2;
                                    unsafe = unsafe4;
                                    i23 = i27;
                                    i13 = i24;
                                    obj2 = obj5;
                                    break;
                                } else {
                                    unsafe2.putLong(obj6, j3, e1.u(i42, bArr));
                                    i29 = i42 + 8;
                                    int i53222 = i29;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i28 = i53222;
                                    i22 = i26;
                                    i32 = i11;
                                    f2Var = f2Var2;
                                    obj2 = obj4;
                                    i38 |= i25;
                                    unsafe = unsafe3;
                                    i33 = i28;
                                    bArr2 = bArr;
                                    lVar2 = lVar;
                                    i34 = i22;
                                    f2Var2 = f2Var;
                                    obj6 = obj2;
                                    i37 = i24;
                                    i36 = i16;
                                    i35 = i17;
                                    unsafe5 = unsafe;
                                }
                            case 6:
                            case 13:
                                i16 = i46;
                                i26 = i41;
                                i30 = i42;
                                c10 = 65535;
                                i17 = i15;
                                unsafe2 = unsafe5;
                                if (i43 == 5) {
                                    unsafe2.putInt(obj6, j3, e1.a(i30, bArr));
                                    i29 = i30 + 4;
                                    int i532222 = i29;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i28 = i532222;
                                    i22 = i26;
                                    i32 = i11;
                                    f2Var = f2Var2;
                                    obj2 = obj4;
                                    i38 |= i25;
                                    unsafe = unsafe3;
                                    i33 = i28;
                                    bArr2 = bArr;
                                    lVar2 = lVar;
                                    i34 = i22;
                                    f2Var2 = f2Var;
                                    obj6 = obj2;
                                    i37 = i24;
                                    i36 = i16;
                                    i35 = i17;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i27 = i30;
                                i22 = i26;
                                f2Var = f2Var2;
                                unsafe = unsafe4;
                                i23 = i27;
                                i13 = i24;
                                obj2 = obj5;
                                break;
                            case 7:
                                i16 = i46;
                                i26 = i41;
                                i30 = i42;
                                c10 = 65535;
                                i17 = i15;
                                unsafe2 = unsafe5;
                                if (i43 == 0) {
                                    i29 = e1.t(bArr, i30, lVar2);
                                    y2.c.g(obj6, j3, lVar2.b != 0);
                                    int i5322222 = i29;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i28 = i5322222;
                                    i22 = i26;
                                    i32 = i11;
                                    f2Var = f2Var2;
                                    obj2 = obj4;
                                    i38 |= i25;
                                    unsafe = unsafe3;
                                    i33 = i28;
                                    bArr2 = bArr;
                                    lVar2 = lVar;
                                    i34 = i22;
                                    f2Var2 = f2Var;
                                    obj6 = obj2;
                                    i37 = i24;
                                    i36 = i16;
                                    i35 = i17;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i27 = i30;
                                i22 = i26;
                                f2Var = f2Var2;
                                unsafe = unsafe4;
                                i23 = i27;
                                i13 = i24;
                                obj2 = obj5;
                                break;
                            case 8:
                                i16 = i46;
                                i26 = i41;
                                i30 = i42;
                                c10 = 65535;
                                i17 = i15;
                                unsafe2 = unsafe5;
                                if (i43 == 2) {
                                    i29 = (i48 & TLObject.FLAG_29) == 0 ? e1.w(bArr, i30, lVar2) : e1.x(bArr, i30, lVar2);
                                    unsafe2.putObject(obj6, j3, lVar2.c);
                                    int i53222222 = i29;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i28 = i53222222;
                                    i22 = i26;
                                    i32 = i11;
                                    f2Var = f2Var2;
                                    obj2 = obj4;
                                    i38 |= i25;
                                    unsafe = unsafe3;
                                    i33 = i28;
                                    bArr2 = bArr;
                                    lVar2 = lVar;
                                    i34 = i22;
                                    f2Var2 = f2Var;
                                    obj6 = obj2;
                                    i37 = i24;
                                    i36 = i16;
                                    i35 = i17;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i27 = i30;
                                i22 = i26;
                                f2Var = f2Var2;
                                unsafe = unsafe4;
                                i23 = i27;
                                i13 = i24;
                                obj2 = obj5;
                                break;
                            case 9:
                                i16 = i46;
                                i26 = i41;
                                i30 = i42;
                                c10 = 65535;
                                i17 = i15;
                                unsafe2 = unsafe5;
                                if (i43 == 2) {
                                    int g10 = e1.g(f2Var2.l(i17), bArr, i30, i11, lVar2);
                                    if ((i38 & i25) == 0) {
                                        unsafe2.putObject(obj6, j3, lVar2.c);
                                    } else {
                                        unsafe2.putObject(obj6, j3, j1.b(unsafe2.getObject(obj6, j3), lVar2.c));
                                    }
                                    i31 = g10;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i28 = i31;
                                    i22 = i26;
                                    i32 = i11;
                                    f2Var = f2Var2;
                                    obj2 = obj4;
                                    i38 |= i25;
                                    unsafe = unsafe3;
                                    i33 = i28;
                                    bArr2 = bArr;
                                    lVar2 = lVar;
                                    i34 = i22;
                                    f2Var2 = f2Var;
                                    obj6 = obj2;
                                    i37 = i24;
                                    i36 = i16;
                                    i35 = i17;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i27 = i30;
                                i22 = i26;
                                f2Var = f2Var2;
                                unsafe = unsafe4;
                                i23 = i27;
                                i13 = i24;
                                obj2 = obj5;
                                break;
                            case 10:
                                i16 = i46;
                                i26 = i41;
                                i30 = i42;
                                c10 = 65535;
                                i17 = i15;
                                unsafe2 = unsafe5;
                                if (i43 == 2) {
                                    i29 = e1.z(bArr, i30, lVar2);
                                    unsafe2.putObject(obj6, j3, lVar2.c);
                                    int i532222222 = i29;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i28 = i532222222;
                                    i22 = i26;
                                    i32 = i11;
                                    f2Var = f2Var2;
                                    obj2 = obj4;
                                    i38 |= i25;
                                    unsafe = unsafe3;
                                    i33 = i28;
                                    bArr2 = bArr;
                                    lVar2 = lVar;
                                    i34 = i22;
                                    f2Var2 = f2Var;
                                    obj6 = obj2;
                                    i37 = i24;
                                    i36 = i16;
                                    i35 = i17;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i27 = i30;
                                i22 = i26;
                                f2Var = f2Var2;
                                unsafe = unsafe4;
                                i23 = i27;
                                i13 = i24;
                                obj2 = obj5;
                                break;
                            case 12:
                                i16 = i46;
                                i26 = i41;
                                i30 = i42;
                                c10 = 65535;
                                i17 = i15;
                                unsafe2 = unsafe5;
                                if (i43 == 0) {
                                    i29 = e1.j(bArr, i30, lVar2);
                                    int i54 = lVar2.a;
                                    k1 x10 = f2Var2.x(i17);
                                    if (x10 == null || x10.zza(i54)) {
                                        unsafe2.putInt(obj6, j3, i54);
                                        int i5322222222 = i29;
                                        unsafe3 = unsafe2;
                                        obj4 = obj6;
                                        i28 = i5322222222;
                                        i22 = i26;
                                        i32 = i11;
                                        f2Var = f2Var2;
                                        obj2 = obj4;
                                        i38 |= i25;
                                        unsafe = unsafe3;
                                        i33 = i28;
                                        bArr2 = bArr;
                                        lVar2 = lVar;
                                        i34 = i22;
                                        f2Var2 = f2Var;
                                        obj6 = obj2;
                                        i37 = i24;
                                        i36 = i16;
                                        i35 = i17;
                                        unsafe5 = unsafe;
                                    } else {
                                        C(obj6).a(i16, Long.valueOf(i54));
                                        i22 = i26;
                                        f2Var = f2Var2;
                                        unsafe = unsafe2;
                                        i33 = i29;
                                        i32 = i11;
                                        obj2 = obj6;
                                        bArr2 = bArr;
                                        lVar2 = lVar;
                                        i34 = i22;
                                        f2Var2 = f2Var;
                                        obj6 = obj2;
                                        i37 = i24;
                                        i36 = i16;
                                        i35 = i17;
                                        unsafe5 = unsafe;
                                    }
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i27 = i30;
                                i22 = i26;
                                f2Var = f2Var2;
                                unsafe = unsafe4;
                                i23 = i27;
                                i13 = i24;
                                obj2 = obj5;
                                break;
                            case 15:
                                i16 = i46;
                                i26 = i41;
                                i30 = i42;
                                c10 = 65535;
                                i17 = i15;
                                unsafe2 = unsafe5;
                                if (i43 == 0) {
                                    i29 = e1.j(bArr, i30, lVar2);
                                    unsafe2.putInt(obj6, j3, e1.y(lVar2.a));
                                    int i53222222222 = i29;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i28 = i53222222222;
                                    i22 = i26;
                                    i32 = i11;
                                    f2Var = f2Var2;
                                    obj2 = obj4;
                                    i38 |= i25;
                                    unsafe = unsafe3;
                                    i33 = i28;
                                    bArr2 = bArr;
                                    lVar2 = lVar;
                                    i34 = i22;
                                    f2Var2 = f2Var;
                                    obj6 = obj2;
                                    i37 = i24;
                                    i36 = i16;
                                    i35 = i17;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i27 = i30;
                                i22 = i26;
                                f2Var = f2Var2;
                                unsafe = unsafe4;
                                i23 = i27;
                                i13 = i24;
                                obj2 = obj5;
                                break;
                            case 16:
                                i16 = i46;
                                i26 = i41;
                                com.google.android.gms.internal.clearcut.l lVar3 = lVar2;
                                i30 = i42;
                                c10 = 65535;
                                if (i43 != 0) {
                                    i17 = i15;
                                    unsafe2 = unsafe5;
                                    unsafe4 = unsafe2;
                                    obj5 = obj6;
                                    i27 = i30;
                                    i22 = i26;
                                    f2Var = f2Var2;
                                    unsafe = unsafe4;
                                    i23 = i27;
                                    i13 = i24;
                                    obj2 = obj5;
                                    break;
                                } else {
                                    i29 = e1.t(bArr, i30, lVar3);
                                    long j10 = lVar3.b;
                                    i17 = i15;
                                    unsafe2 = unsafe5;
                                    unsafe2.putLong(obj6, j3, (j10 >>> 1) ^ (-(j10 & 1)));
                                    int i532222222222 = i29;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i28 = i532222222222;
                                    i22 = i26;
                                    i32 = i11;
                                    f2Var = f2Var2;
                                    obj2 = obj4;
                                    i38 |= i25;
                                    unsafe = unsafe3;
                                    i33 = i28;
                                    bArr2 = bArr;
                                    lVar2 = lVar;
                                    i34 = i22;
                                    f2Var2 = f2Var;
                                    obj6 = obj2;
                                    i37 = i24;
                                    i36 = i16;
                                    i35 = i17;
                                    unsafe5 = unsafe;
                                }
                            case 17:
                                if (i43 != 3) {
                                    i16 = i46;
                                    i26 = i41;
                                    c10 = 65535;
                                    i17 = i15;
                                    obj5 = obj6;
                                    unsafe4 = unsafe5;
                                    i27 = i42;
                                    i22 = i26;
                                    f2Var = f2Var2;
                                    unsafe = unsafe4;
                                    i23 = i27;
                                    i13 = i24;
                                    obj2 = obj5;
                                    break;
                                } else {
                                    i16 = i46;
                                    i26 = i41;
                                    com.google.android.gms.internal.clearcut.l lVar4 = lVar2;
                                    c10 = 65535;
                                    i31 = e1.f(f2Var2.l(i15), bArr, i42, i11, (i41 << 3) | 4, lVar4);
                                    if ((i38 & i25) == 0) {
                                        unsafe5.putObject(obj6, j3, lVar4.c);
                                    } else {
                                        unsafe5.putObject(obj6, j3, j1.b(unsafe5.getObject(obj6, j3), lVar4.c));
                                    }
                                    i17 = i15;
                                    unsafe2 = unsafe5;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i28 = i31;
                                    i22 = i26;
                                    i32 = i11;
                                    f2Var = f2Var2;
                                    obj2 = obj4;
                                    i38 |= i25;
                                    unsafe = unsafe3;
                                    i33 = i28;
                                    bArr2 = bArr;
                                    lVar2 = lVar;
                                    i34 = i22;
                                    f2Var2 = f2Var;
                                    obj6 = obj2;
                                    i37 = i24;
                                    i36 = i16;
                                    i35 = i17;
                                    unsafe5 = unsafe;
                                }
                            default:
                                i16 = i46;
                                unsafe4 = unsafe5;
                                i26 = i41;
                                i27 = i42;
                                c10 = 65535;
                                i17 = i15;
                                obj5 = obj6;
                                i22 = i26;
                                f2Var = f2Var2;
                                unsafe = unsafe4;
                                i23 = i27;
                                i13 = i24;
                                obj2 = obj5;
                                break;
                        }
                    } else {
                        i16 = i46;
                        iArr = iArr2;
                        i17 = i15;
                        Object obj7 = obj6;
                        Unsafe unsafe6 = unsafe5;
                        if (i49 == 27) {
                            if (i43 == 2) {
                                o1 o1Var = (o1) unsafe6.getObject(obj7, j3);
                                if (!o1Var.zza()) {
                                    int size = o1Var.size();
                                    o1Var = o1Var.zza(size == 0 ? 10 : size << 1);
                                    unsafe6.putObject(obj7, j3, o1Var);
                                }
                                obj2 = obj;
                                i22 = i41;
                                i32 = i11;
                                i33 = e1.e(f2Var2.l(i17), i16, bArr, i42, i11, o1Var, lVar2);
                                unsafe = unsafe6;
                                i24 = i37;
                                f2Var = f2Var2;
                                bArr2 = bArr;
                                lVar2 = lVar;
                                i34 = i22;
                                f2Var2 = f2Var;
                                obj6 = obj2;
                                i37 = i24;
                                i36 = i16;
                                i35 = i17;
                                unsafe5 = unsafe;
                            } else {
                                obj3 = obj;
                                i18 = i41;
                                i13 = i37;
                                i21 = i42;
                                unsafe = unsafe6;
                                i20 = i16;
                                i19 = i38;
                            }
                        } else if (i49 <= 49) {
                            long j11 = i48;
                            i22 = i41;
                            unsafe = unsafe6;
                            i13 = i37;
                            i19 = i38;
                            h = f2Var2.i(obj, bArr, i42, i11, i16, i22, i43, i17, j11, i49, j3, lVar);
                            i16 = i16;
                            i17 = i17;
                            f2Var = f2Var2;
                            if (h == i42) {
                                obj2 = obj;
                                i23 = h;
                                i38 = i19;
                            } else {
                                obj2 = obj;
                                i32 = i11;
                                i33 = h;
                                bArr2 = bArr;
                                lVar2 = lVar;
                                i34 = i22;
                                f2Var2 = f2Var;
                                obj6 = obj2;
                                i36 = i16;
                                i35 = i17;
                                i37 = i13;
                                i38 = i19;
                                unsafe5 = unsafe;
                            }
                        } else {
                            obj3 = obj;
                            i18 = i41;
                            i13 = i37;
                            unsafe = unsafe6;
                            i19 = i38;
                            i20 = i16;
                            i21 = i42;
                            if (i49 != 50) {
                                i22 = i18;
                                h = f2Var2.h(obj3, bArr, i21, i11, i20, i22, i43, i48, i49, j3, i17, lVar);
                                f2Var = f2Var2;
                                obj2 = obj3;
                                i16 = i20;
                            } else if (i43 == 2) {
                                f2Var2.p(j3, obj3, i17);
                                throw null;
                            }
                        }
                        f2Var = f2Var2;
                        i22 = i18;
                        obj2 = obj3;
                        i23 = i21;
                        i16 = i20;
                        i38 = i19;
                    }
                }
                if (i16 != i12 || i12 == 0) {
                    i32 = i11;
                    i33 = e1.c(i16, bArr, i23, i11, C(obj2), lVar);
                    i24 = i13;
                    bArr2 = bArr;
                    lVar2 = lVar;
                    i34 = i22;
                    f2Var2 = f2Var;
                    obj6 = obj2;
                    i37 = i24;
                    i36 = i16;
                    i35 = i17;
                    unsafe5 = unsafe;
                } else {
                    i32 = i11;
                    i33 = i23;
                    i36 = i16;
                }
            } else {
                i13 = i37;
                unsafe = unsafe5;
                iArr = iArr2;
                f2Var = f2Var2;
                obj2 = obj6;
            }
        }
        int i55 = i13;
        if (i55 != 1048575) {
            unsafe.putInt(obj2, i55, i38);
        }
        for (int i56 = f2Var.h; i56 < f2Var.i; i56++) {
            int i57 = f2Var.g[i56];
            int i58 = iArr[i57];
            Object l4 = y2.l(obj2, f2Var.z(i57) & 1048575);
            if (l4 != null && f2Var.x(i57) != null) {
                f2Var.m.getClass();
                if (f2Var.t(i57) == null) {
                    throw new NoSuchMethodError();
                }
                throw new ClassCastException();
            }
        }
        if (i12 == 0) {
            if (i33 != i32) {
                throw new n1("Failed to parse the message.");
            }
        } else if (i33 > i32 || i36 != i12) {
            throw new n1("Failed to parse the message.");
        }
        return i33;
    }

    public final o2 l(int i10) {
        int i11 = (i10 / 3) << 1;
        Object[] objArr = this.b;
        o2 o2Var = (o2) objArr[i11];
        if (o2Var != null) {
            return o2Var;
        }
        o2 a2 = l2.c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a2;
        return a2;
    }

    public final void o(int i10, Object obj, Object obj2) {
        long z10 = z(i10) & 1048575;
        if (r(i10, obj2)) {
            Object l4 = y2.l(obj, z10);
            Object l10 = y2.l(obj2, z10);
            if (l4 != null && l10 != null) {
                y2.d(obj, z10, j1.b(l4, l10));
                u(i10, obj);
            } else if (l10 != null) {
                y2.d(obj, z10, l10);
                u(i10, obj);
            }
        }
    }

    public final void p(long j3, Object obj, int i10) {
        a2 a2Var;
        Unsafe unsafe = o;
        Object t10 = t(i10);
        Object object = unsafe.getObject(obj, j3);
        this.m.getClass();
        if (!((a2) object).a) {
            a2 a2Var2 = a2.b;
            if (a2Var2.isEmpty()) {
                a2Var = new a2();
            } else {
                a2 a2Var3 = new a2(a2Var2);
                a2Var3.a = true;
                a2Var = a2Var3;
            }
            b2.a(a2Var, object);
            unsafe.putObject(obj, j3, a2Var);
        }
        if (t10 != null) {
            throw new ClassCastException();
        }
        throw new NoSuchMethodError();
    }

    public final boolean q(int i10, int i11, Object obj) {
        return y2.c.k(obj, (long) (this.a[i11 + 2] & 1048575)) == i10;
    }

    public final boolean r(int i10, Object obj) {
        int i11 = this.a[i10 + 2];
        long j3 = i11 & 1048575;
        if (j3 == 1048575) {
            int z10 = z(i10);
            long j10 = z10 & 1048575;
            switch ((z10 & 267386880) >>> 20) {
                case 0:
                    if (y2.c.j(obj, j10) == 0.0d) {
                        return false;
                    }
                    break;
                case 1:
                    if (y2.c.i(obj, j10) == 0.0f) {
                        return false;
                    }
                    break;
                case 2:
                    if (y2.c.l(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (y2.c.l(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (y2.c.k(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (y2.c.l(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (y2.c.k(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return y2.c.h(obj, j10);
                case 8:
                    Object l4 = y2.l(obj, j10);
                    if (l4 instanceof String) {
                        if (((String) l4).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(l4 instanceof q0)) {
                            throw new IllegalArgumentException();
                        }
                        if (q0.c.equals(l4)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (y2.l(obj, j10) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (q0.c.equals(y2.l(obj, j10))) {
                        return false;
                    }
                    break;
                case 11:
                    if (y2.c.k(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (y2.c.k(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (y2.c.k(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (y2.c.l(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (y2.c.k(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (y2.c.l(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (y2.l(obj, j10) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i11 >>> 20)) & y2.c.k(obj, j3)) == 0) {
            return false;
        }
        return true;
    }

    public final int s(int i10, int i11) {
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

    public final Object t(int i10) {
        return this.b[(i10 / 3) << 1];
    }

    public final void u(int i10, Object obj) {
        int i11 = this.a[i10 + 2];
        long j3 = 1048575 & i11;
        if (j3 == 1048575) {
            return;
        }
        y2.c(j3, obj, (1 << (i11 >>> 20)) | y2.c.k(obj, j3));
    }

    public final void v(int i10, Object obj, Object obj2) {
        int z10 = z(i10);
        int i11 = this.a[i10];
        long j3 = z10 & 1048575;
        if (q(i11, i10, obj2)) {
            Object l4 = q(i11, i10, obj) ? y2.l(obj, j3) : null;
            Object l10 = y2.l(obj2, j3);
            if (l4 != null && l10 != null) {
                y2.d(obj, j3, j1.b(l4, l10));
                y2.c(r1[i10 + 2] & 1048575, obj, i11);
            } else if (l10 != null) {
                y2.d(obj, j3, l10);
                y2.c(r1[i10 + 2] & 1048575, obj, i11);
            }
        }
    }

    public final void w(Object obj, y1 y1Var) {
        int i10;
        int i11;
        int i12;
        int[] iArr = this.a;
        int length = iArr.length;
        Unsafe unsafe = o;
        int i13 = 1048575;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15 = i12 + 3) {
            int z10 = z(i15);
            int i16 = iArr[i15];
            int i17 = (267386880 & z10) >>> 20;
            if (i17 <= 17) {
                int i18 = iArr[i15 + 2];
                i10 = 1048575;
                int i19 = i18 & 1048575;
                if (i19 != i13) {
                    i14 = unsafe.getInt(obj, i19);
                    i13 = i19;
                }
                i11 = 1 << (i18 >>> 20);
            } else {
                i10 = 1048575;
                i11 = 0;
            }
            int i20 = i15;
            long j3 = z10 & i10;
            switch (i17) {
                case 0:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        double j10 = y2.c.j(obj, j3);
                        r0 r0Var = (r0) y1Var.a;
                        r0Var.getClass();
                        long doubleToRawLongBits = Double.doubleToRawLongBits(j10);
                        r0Var.D(i16, 1);
                        r0Var.K(doubleToRawLongBits);
                        continue;
                    }
                case 1:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        float i21 = y2.c.i(obj, j3);
                        r0 r0Var2 = (r0) y1Var.a;
                        r0Var2.getClass();
                        int floatToRawIntBits = Float.floatToRawIntBits(i21);
                        r0Var2.D(i16, 5);
                        r0Var2.M(floatToRawIntBits);
                    } else {
                        continue;
                    }
                case 2:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        long j11 = unsafe.getLong(obj, j3);
                        r0 r0Var3 = (r0) y1Var.a;
                        r0Var3.D(i16, 0);
                        r0Var3.E(j11);
                    } else {
                        continue;
                    }
                case 3:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        long j12 = unsafe.getLong(obj, j3);
                        r0 r0Var4 = (r0) y1Var.a;
                        r0Var4.D(i16, 0);
                        r0Var4.E(j12);
                    } else {
                        continue;
                    }
                case 4:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        int i22 = unsafe.getInt(obj, j3);
                        r0 r0Var5 = (r0) y1Var.a;
                        r0Var5.D(i16, 0);
                        r0Var5.C(i22);
                    }
                    break;
                case 5:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        long j13 = unsafe.getLong(obj, j3);
                        r0 r0Var6 = (r0) y1Var.a;
                        r0Var6.D(i16, 1);
                        r0Var6.K(j13);
                        break;
                    }
                    break;
                case 6:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        int i23 = unsafe.getInt(obj, j3);
                        r0 r0Var7 = (r0) y1Var.a;
                        r0Var7.D(i16, 5);
                        r0Var7.M(i23);
                        break;
                    }
                    break;
                case 7:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        boolean h = y2.c.h(obj, j3);
                        r0 r0Var8 = (r0) y1Var.a;
                        r0Var8.D(i16, 0);
                        r0Var8.B(h ? (byte) 1 : (byte) 0);
                        break;
                    }
                    break;
                case 8:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        n(i16, unsafe.getObject(obj, j3), y1Var);
                        break;
                    }
                    break;
                case 9:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        y1Var.b(i16, unsafe.getObject(obj, j3), l(i12));
                        break;
                    }
                    break;
                case 10:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        y1Var.a(i16, (q0) unsafe.getObject(obj, j3));
                        break;
                    }
                    break;
                case 11:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        int i24 = unsafe.getInt(obj, j3);
                        r0 r0Var9 = (r0) y1Var.a;
                        r0Var9.D(i16, 0);
                        r0Var9.H(i24);
                        break;
                    }
                    break;
                case 12:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        int i25 = unsafe.getInt(obj, j3);
                        r0 r0Var10 = (r0) y1Var.a;
                        r0Var10.D(i16, 0);
                        r0Var10.C(i25);
                    }
                    break;
                case 13:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        int i26 = unsafe.getInt(obj, j3);
                        r0 r0Var11 = (r0) y1Var.a;
                        r0Var11.D(i16, 5);
                        r0Var11.M(i26);
                        break;
                    }
                    break;
                case 14:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        long j14 = unsafe.getLong(obj, j3);
                        r0 r0Var12 = (r0) y1Var.a;
                        r0Var12.D(i16, 1);
                        r0Var12.K(j14);
                        break;
                    }
                    break;
                case 15:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        int i27 = unsafe.getInt(obj, j3);
                        r0 r0Var13 = (r0) y1Var.a;
                        r0Var13.D(i16, 0);
                        r0Var13.H((i27 >> 31) ^ (i27 << 1));
                        break;
                    }
                    break;
                case 16:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        long j15 = unsafe.getLong(obj, j3);
                        r0 r0Var14 = (r0) y1Var.a;
                        r0Var14.D(i16, 0);
                        r0Var14.E((j15 << 1) ^ (j15 >> 63));
                        break;
                    }
                    break;
                case 17:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        y1Var.c(i16, unsafe.getObject(obj, j3), l(i12));
                        break;
                    }
                    break;
                case 18:
                    i12 = i20;
                    p2.g(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, false);
                    break;
                case 19:
                    i12 = i20;
                    p2.n(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, false);
                    continue;
                case 20:
                    i12 = i20;
                    p2.q(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, false);
                    continue;
                case 21:
                    i12 = i20;
                    p2.s(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, false);
                    continue;
                case 22:
                    i12 = i20;
                    p2.B(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, false);
                    continue;
                case 23:
                    i12 = i20;
                    p2.w(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, false);
                    continue;
                case 24:
                    i12 = i20;
                    p2.G(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, false);
                    continue;
                case 25:
                    i12 = i20;
                    p2.J(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, false);
                    continue;
                case 26:
                    i12 = i20;
                    p2.e(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var);
                    break;
                case 27:
                    i12 = i20;
                    p2.f(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, l(i12));
                    break;
                case 28:
                    i12 = i20;
                    p2.l(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var);
                    break;
                case 29:
                    i12 = i20;
                    p2.E(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, false);
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    i12 = i20;
                    p2.I(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, false);
                    continue;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    i12 = i20;
                    p2.H(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, false);
                    continue;
                case 32:
                    i12 = i20;
                    p2.y(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, false);
                    continue;
                case 33:
                    i12 = i20;
                    p2.F(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, false);
                    continue;
                case 34:
                    i12 = i20;
                    p2.u(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, false);
                    continue;
                case 35:
                    i12 = i20;
                    p2.g(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, true);
                    break;
                case 36:
                    i12 = i20;
                    p2.n(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, true);
                    break;
                case 37:
                    i12 = i20;
                    p2.q(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, true);
                    break;
                case 38:
                    i12 = i20;
                    p2.s(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    i12 = i20;
                    p2.B(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    i12 = i20;
                    p2.w(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    i12 = i20;
                    p2.G(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    i12 = i20;
                    p2.J(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    i12 = i20;
                    p2.E(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    i12 = i20;
                    p2.I(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    i12 = i20;
                    p2.H(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    i12 = i20;
                    p2.y(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, true);
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    i12 = i20;
                    p2.F(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, true);
                    break;
                case 48:
                    i12 = i20;
                    p2.u(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, true);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    i12 = i20;
                    p2.m(iArr[i12], (List) unsafe.getObject(obj, j3), y1Var, l(i12));
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    i12 = i20;
                    if (unsafe.getObject(obj, j3) != null) {
                        Object t10 = t(i12);
                        this.m.getClass();
                        if (t10 != null) {
                            throw new ClassCastException();
                        }
                        throw new NoSuchMethodError();
                    }
                    break;
                case 51:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        double doubleValue = ((Double) y2.l(obj, j3)).doubleValue();
                        r0 r0Var15 = (r0) y1Var.a;
                        r0Var15.getClass();
                        long doubleToRawLongBits2 = Double.doubleToRawLongBits(doubleValue);
                        r0Var15.D(i16, 1);
                        r0Var15.K(doubleToRawLongBits2);
                        break;
                    }
                    break;
                case 52:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        float floatValue = ((Float) y2.l(obj, j3)).floatValue();
                        r0 r0Var16 = (r0) y1Var.a;
                        r0Var16.getClass();
                        int floatToRawIntBits2 = Float.floatToRawIntBits(floatValue);
                        r0Var16.D(i16, 5);
                        r0Var16.M(floatToRawIntBits2);
                        break;
                    }
                    break;
                case 53:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        long B = B(obj, j3);
                        r0 r0Var17 = (r0) y1Var.a;
                        r0Var17.D(i16, 0);
                        r0Var17.E(B);
                        break;
                    }
                    break;
                case 54:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        long B2 = B(obj, j3);
                        r0 r0Var18 = (r0) y1Var.a;
                        r0Var18.D(i16, 0);
                        r0Var18.E(B2);
                    } else {
                        continue;
                    }
                case 55:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        int A = A(obj, j3);
                        r0 r0Var19 = (r0) y1Var.a;
                        r0Var19.D(i16, 0);
                        r0Var19.C(A);
                    }
                    break;
                case 56:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        long B3 = B(obj, j3);
                        r0 r0Var20 = (r0) y1Var.a;
                        r0Var20.D(i16, 1);
                        r0Var20.K(B3);
                        break;
                    }
                    break;
                case 57:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        int A2 = A(obj, j3);
                        r0 r0Var21 = (r0) y1Var.a;
                        r0Var21.D(i16, 5);
                        r0Var21.M(A2);
                        break;
                    }
                    break;
                case 58:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        boolean booleanValue = ((Boolean) y2.l(obj, j3)).booleanValue();
                        r0 r0Var22 = (r0) y1Var.a;
                        r0Var22.D(i16, 0);
                        r0Var22.B(booleanValue ? (byte) 1 : (byte) 0);
                        break;
                    }
                    break;
                case 59:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        n(i16, unsafe.getObject(obj, j3), y1Var);
                        break;
                    }
                    break;
                case 60:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        y1Var.b(i16, unsafe.getObject(obj, j3), l(i12));
                        break;
                    }
                    break;
                case 61:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        y1Var.a(i16, (q0) unsafe.getObject(obj, j3));
                        break;
                    }
                    break;
                case 62:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        int A3 = A(obj, j3);
                        r0 r0Var23 = (r0) y1Var.a;
                        r0Var23.D(i16, 0);
                        r0Var23.H(A3);
                        break;
                    }
                    break;
                case 63:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        int A4 = A(obj, j3);
                        r0 r0Var24 = (r0) y1Var.a;
                        r0Var24.D(i16, 0);
                        r0Var24.C(A4);
                    }
                    break;
                case 64:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        int A5 = A(obj, j3);
                        r0 r0Var25 = (r0) y1Var.a;
                        r0Var25.D(i16, 5);
                        r0Var25.M(A5);
                        break;
                    }
                    break;
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        long B4 = B(obj, j3);
                        r0 r0Var26 = (r0) y1Var.a;
                        r0Var26.D(i16, 1);
                        r0Var26.K(B4);
                        break;
                    }
                    break;
                case 66:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        int A6 = A(obj, j3);
                        r0 r0Var27 = (r0) y1Var.a;
                        r0Var27.D(i16, 0);
                        r0Var27.H((A6 >> 31) ^ (A6 << 1));
                        break;
                    }
                    break;
                case 67:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        long B5 = B(obj, j3);
                        r0 r0Var28 = (r0) y1Var.a;
                        r0Var28.D(i16, 0);
                        r0Var28.E((B5 << 1) ^ (B5 >> 63));
                        break;
                    }
                    break;
                case 68:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        y1Var.c(i16, unsafe.getObject(obj, j3), l(i12));
                        break;
                    }
                    break;
                default:
                    i12 = i20;
                    break;
            }
        }
        this.l.getClass();
        ((f1) obj).zzb.c(y1Var);
    }

    public final k1 x(int i10) {
        return (k1) this.b[((i10 / 3) << 1) + 1];
    }

    public final boolean y(f1 f1Var, f1 f1Var2, int i10) {
        return r(i10, f1Var) == r(i10, f1Var2);
    }

    public final int z(int i10) {
        return this.a[i10 + 1];
    }

    @Override // com.google.android.gms.internal.vision.o2
    public final Object zza() {
        this.j.getClass();
        return ((f1) this.e).e(4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.vision.o2
    public final int zzb(Object obj) {
        q2 q2Var;
        int i10;
        int i11;
        char c10;
        char c11;
        int O;
        int T;
        int G;
        int J;
        char c12;
        int i12;
        int T2;
        int G2;
        int J2;
        int T3;
        int O2;
        int N;
        int i13;
        boolean z10 = this.f;
        q2 q2Var2 = this.l;
        b2 b2Var = this.m;
        int i14 = 267386880;
        int i15 = 1048575;
        int[] iArr = this.a;
        int i16 = 1;
        if (z10) {
            Unsafe unsafe = o;
            int i17 = 0;
            int i18 = 0;
            while (i17 < iArr.length) {
                int z11 = z(i17);
                int i19 = (z11 & i14) >>> 20;
                int i20 = i14;
                int i21 = iArr[i17];
                int i22 = i15;
                int[] iArr2 = iArr;
                long j3 = z11 & i15;
                if (i19 >= x0.b.a && i19 <= x0.c.a) {
                    int i23 = iArr2[i17 + 2];
                }
                switch (i19) {
                    case 0:
                        if (r(i17, obj)) {
                            i18 = a1.g.E(i21 << 3, 8, i18);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (r(i17, obj)) {
                            i18 = a1.g.E(i21 << 3, 4, i18);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (r(i17, obj)) {
                            long l4 = y2.c.l(obj, j3);
                            T3 = r0.T(i21 << 3);
                            O2 = r0.O(l4);
                            i18 += O2 + T3;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (r(i17, obj)) {
                            N = r0.N(i21, y2.c.l(obj, j3));
                            i18 += N;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (r(i17, obj)) {
                            int k10 = y2.c.k(obj, j3);
                            T3 = r0.T(i21 << 3);
                            O2 = r0.P(k10);
                            i18 += O2 + T3;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (r(i17, obj)) {
                            N = r0.R(i21);
                            i18 += N;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (r(i17, obj)) {
                            N = r0.V(i21);
                            i18 += N;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (r(i17, obj)) {
                            i18 = a1.g.E(i21 << 3, 1, i18);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (r(i17, obj)) {
                            Object l10 = y2.l(obj, j3);
                            if (l10 instanceof q0) {
                                N = r0.J(i21, (q0) l10);
                                i18 += N;
                                break;
                            } else {
                                T3 = r0.T(i21 << 3);
                                O2 = r0.G((String) l10);
                                i18 += O2 + T3;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (r(i17, obj)) {
                            N = p2.a(i21, y2.l(obj, j3), l(i17));
                            i18 += N;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (r(i17, obj)) {
                            N = r0.J(i21, (q0) y2.l(obj, j3));
                            i18 += N;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (r(i17, obj)) {
                            N = r0.S(i21, y2.c.k(obj, j3));
                            i18 += N;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (r(i17, obj)) {
                            int k11 = y2.c.k(obj, j3);
                            T3 = r0.T(i21 << 3);
                            O2 = r0.P(k11);
                            i18 += O2 + T3;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (r(i17, obj)) {
                            i18 = a1.g.E(i21 << 3, 4, i18);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (r(i17, obj)) {
                            i18 = a1.g.E(i21 << 3, 8, i18);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (r(i17, obj)) {
                            N = r0.U(i21, y2.c.k(obj, j3));
                            i18 += N;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (r(i17, obj)) {
                            N = r0.Q(i21, y2.c.l(obj, j3));
                            i18 += N;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (r(i17, obj)) {
                            N = r0.I(i21, (l0) y2.l(obj, j3), l(i17));
                            i18 += N;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        N = p2.C(i21, (List) y2.l(obj, j3));
                        i18 += N;
                        break;
                    case 19:
                        N = p2.z(i21, (List) y2.l(obj, j3));
                        i18 += N;
                        break;
                    case 20:
                        List list = (List) y2.l(obj, j3);
                        Class cls = p2.a;
                        if (list.size() != 0) {
                            N = e2.c(i21, list.size(), p2.c(list));
                            i18 += N;
                            break;
                        }
                        N = 0;
                        i18 += N;
                    case 21:
                        List list2 = (List) y2.l(obj, j3);
                        Class cls2 = p2.a;
                        int size = list2.size();
                        if (size != 0) {
                            N = e2.c(i21, size, p2.k(list2));
                            i18 += N;
                            break;
                        }
                        N = 0;
                        i18 += N;
                    case 22:
                        List list3 = (List) y2.l(obj, j3);
                        Class cls3 = p2.a;
                        int size2 = list3.size();
                        if (size2 != 0) {
                            N = e2.c(i21, size2, p2.t(list3));
                            i18 += N;
                            break;
                        }
                        N = 0;
                        i18 += N;
                    case 23:
                        N = p2.C(i21, (List) y2.l(obj, j3));
                        i18 += N;
                        break;
                    case 24:
                        N = p2.z(i21, (List) y2.l(obj, j3));
                        i18 += N;
                        break;
                    case 25:
                        List list4 = (List) y2.l(obj, j3);
                        Class cls4 = p2.a;
                        int size3 = list4.size();
                        if (size3 != 0) {
                            N = (r0.T(i21 << 3) + 1) * size3;
                            i18 += N;
                            break;
                        }
                        N = 0;
                        i18 += N;
                    case 26:
                        N = p2.j(i21, (List) y2.l(obj, j3));
                        i18 += N;
                        break;
                    case 27:
                        N = p2.b(i21, (List) y2.l(obj, j3), l(i17));
                        i18 += N;
                        break;
                    case 28:
                        N = p2.o(i21, (List) y2.l(obj, j3));
                        i18 += N;
                        break;
                    case 29:
                        List list5 = (List) y2.l(obj, j3);
                        Class cls5 = p2.a;
                        int size4 = list5.size();
                        if (size4 != 0) {
                            N = e2.c(i21, size4, p2.v(list5));
                            i18 += N;
                            break;
                        }
                        N = 0;
                        i18 += N;
                    case MessageObject.TYPE_GIFT_STARS /* 30 */:
                        List list6 = (List) y2.l(obj, j3);
                        Class cls6 = p2.a;
                        int size5 = list6.size();
                        if (size5 != 0) {
                            N = e2.c(i21, size5, p2.r(list6));
                            i18 += N;
                            break;
                        }
                        N = 0;
                        i18 += N;
                    case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                        N = p2.z(i21, (List) y2.l(obj, j3));
                        i18 += N;
                        break;
                    case 32:
                        N = p2.C(i21, (List) y2.l(obj, j3));
                        i18 += N;
                        break;
                    case 33:
                        List list7 = (List) y2.l(obj, j3);
                        Class cls7 = p2.a;
                        int size6 = list7.size();
                        if (size6 != 0) {
                            N = e2.c(i21, size6, p2.x(list7));
                            i18 += N;
                            break;
                        }
                        N = 0;
                        i18 += N;
                    case 34:
                        List list8 = (List) y2.l(obj, j3);
                        Class cls8 = p2.a;
                        int size7 = list8.size();
                        if (size7 != 0) {
                            N = e2.c(i21, size7, p2.p(list8));
                            i18 += N;
                            break;
                        }
                        N = 0;
                        i18 += N;
                    case 35:
                        int D = p2.D((List) unsafe.getObject(obj, j3));
                        if (D > 0) {
                            i18 = e2.d(D, r0.y(i21), D, i18);
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        int A = p2.A((List) unsafe.getObject(obj, j3));
                        if (A > 0) {
                            i18 = e2.d(A, r0.y(i21), A, i18);
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        int c13 = p2.c((List) unsafe.getObject(obj, j3));
                        if (c13 > 0) {
                            i18 = e2.d(c13, r0.y(i21), c13, i18);
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        int k12 = p2.k((List) unsafe.getObject(obj, j3));
                        if (k12 > 0) {
                            i18 = e2.d(k12, r0.y(i21), k12, i18);
                            break;
                        } else {
                            break;
                        }
                    case Maneuver.TYPE_DESTINATION /* 39 */:
                        int t10 = p2.t((List) unsafe.getObject(obj, j3));
                        if (t10 > 0) {
                            i18 = e2.d(t10, r0.y(i21), t10, i18);
                            break;
                        } else {
                            break;
                        }
                    case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                        int D2 = p2.D((List) unsafe.getObject(obj, j3));
                        if (D2 > 0) {
                            i18 = e2.d(D2, r0.y(i21), D2, i18);
                            break;
                        } else {
                            break;
                        }
                    case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                        int A2 = p2.A((List) unsafe.getObject(obj, j3));
                        if (A2 > 0) {
                            i18 = e2.d(A2, r0.y(i21), A2, i18);
                            break;
                        } else {
                            break;
                        }
                    case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                        List list9 = (List) unsafe.getObject(obj, j3);
                        Class cls9 = p2.a;
                        int size8 = list9.size();
                        if (size8 > 0) {
                            i18 = e2.d(size8, r0.y(i21), size8, i18);
                            break;
                        } else {
                            break;
                        }
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                        int v = p2.v((List) unsafe.getObject(obj, j3));
                        if (v > 0) {
                            i18 = e2.d(v, r0.y(i21), v, i18);
                            break;
                        } else {
                            break;
                        }
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                        int r10 = p2.r((List) unsafe.getObject(obj, j3));
                        if (r10 > 0) {
                            i18 = e2.d(r10, r0.y(i21), r10, i18);
                            break;
                        } else {
                            break;
                        }
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                        int A3 = p2.A((List) unsafe.getObject(obj, j3));
                        if (A3 > 0) {
                            i18 = e2.d(A3, r0.y(i21), A3, i18);
                            break;
                        } else {
                            break;
                        }
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                        int D3 = p2.D((List) unsafe.getObject(obj, j3));
                        if (D3 > 0) {
                            i18 = e2.d(D3, r0.y(i21), D3, i18);
                            break;
                        } else {
                            break;
                        }
                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                        int x10 = p2.x((List) unsafe.getObject(obj, j3));
                        if (x10 > 0) {
                            i18 = e2.d(x10, r0.y(i21), x10, i18);
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        int p5 = p2.p((List) unsafe.getObject(obj, j3));
                        if (p5 > 0) {
                            i18 = e2.d(p5, r0.y(i21), p5, i18);
                            break;
                        } else {
                            break;
                        }
                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                        List list10 = (List) y2.l(obj, j3);
                        o2 l11 = l(i17);
                        Class cls10 = p2.a;
                        int size9 = list10.size();
                        if (size9 == 0) {
                            i13 = 0;
                        } else {
                            i13 = 0;
                            for (int i24 = 0; i24 < size9; i24++) {
                                i13 = r0.I(i21, (l0) list10.get(i24), l11) + i13;
                            }
                        }
                        i18 = i13 + i18;
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        Object l12 = y2.l(obj, j3);
                        Object t11 = t(i17);
                        b2Var.getClass();
                        b2.b(l12, t11);
                        break;
                    case 51:
                        if (q(i21, i17, obj)) {
                            i18 = a1.g.E(i21 << 3, 8, i18);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (q(i21, i17, obj)) {
                            i18 = a1.g.E(i21 << 3, 4, i18);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (q(i21, i17, obj)) {
                            long B = B(obj, j3);
                            T3 = r0.T(i21 << 3);
                            O2 = r0.O(B);
                            i18 += O2 + T3;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (q(i21, i17, obj)) {
                            N = r0.N(i21, B(obj, j3));
                            i18 += N;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (q(i21, i17, obj)) {
                            int A4 = A(obj, j3);
                            T3 = r0.T(i21 << 3);
                            O2 = r0.P(A4);
                            i18 += O2 + T3;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (q(i21, i17, obj)) {
                            N = r0.R(i21);
                            i18 += N;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (q(i21, i17, obj)) {
                            N = r0.V(i21);
                            i18 += N;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (q(i21, i17, obj)) {
                            i18 = a1.g.E(i21 << 3, 1, i18);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (q(i21, i17, obj)) {
                            Object l13 = y2.l(obj, j3);
                            if (l13 instanceof q0) {
                                N = r0.J(i21, (q0) l13);
                                i18 += N;
                                break;
                            } else {
                                T3 = r0.T(i21 << 3);
                                O2 = r0.G((String) l13);
                                i18 += O2 + T3;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (q(i21, i17, obj)) {
                            N = p2.a(i21, y2.l(obj, j3), l(i17));
                            i18 += N;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (q(i21, i17, obj)) {
                            N = r0.J(i21, (q0) y2.l(obj, j3));
                            i18 += N;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (q(i21, i17, obj)) {
                            N = r0.S(i21, A(obj, j3));
                            i18 += N;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (q(i21, i17, obj)) {
                            int A5 = A(obj, j3);
                            T3 = r0.T(i21 << 3);
                            O2 = r0.P(A5);
                            i18 += O2 + T3;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (q(i21, i17, obj)) {
                            i18 = a1.g.E(i21 << 3, 4, i18);
                            break;
                        } else {
                            break;
                        }
                    case VoIPService.CALL_MIN_LAYER /* 65 */:
                        if (q(i21, i17, obj)) {
                            i18 = a1.g.E(i21 << 3, 8, i18);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (q(i21, i17, obj)) {
                            N = r0.U(i21, A(obj, j3));
                            i18 += N;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (q(i21, i17, obj)) {
                            N = r0.Q(i21, B(obj, j3));
                            i18 += N;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (q(i21, i17, obj)) {
                            N = r0.I(i21, (l0) y2.l(obj, j3), l(i17));
                            i18 += N;
                            break;
                        } else {
                            break;
                        }
                }
                i17 += 3;
                i14 = i20;
                i15 = i22;
                iArr = iArr2;
            }
            q2Var2.getClass();
            return ((f1) obj).zzb.d() + i18;
        }
        Unsafe unsafe2 = o;
        int i25 = 1048575;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        while (i26 < iArr.length) {
            int z12 = z(i26);
            int i29 = iArr[i26];
            int i30 = (z12 & 267386880) >>> 20;
            int i31 = i16;
            if (i30 <= 17) {
                int i32 = iArr[i26 + 2];
                int i33 = i32 & 1048575;
                i10 = i31 << (i32 >>> 20);
                q2Var = q2Var2;
                if (i33 != i25) {
                    i28 = unsafe2.getInt(obj, i33);
                    i25 = i33;
                }
            } else {
                q2Var = q2Var2;
                i10 = 0;
            }
            long j10 = z12 & 1048575;
            switch (i30) {
                case 0:
                    i11 = i31;
                    c10 = 4;
                    if ((i28 & i10) != 0) {
                        c11 = '\b';
                        i27 = a1.g.E(i29 << 3, 8, i27);
                        break;
                    }
                    c11 = '\b';
                    break;
                case 1:
                    i11 = i31;
                    if ((i28 & i10) != 0) {
                        c10 = 4;
                        i27 = a1.g.E(i29 << 3, 4, i27);
                        c11 = '\b';
                        break;
                    }
                    c10 = 4;
                    c11 = '\b';
                case 2:
                    i11 = i31;
                    if ((i10 & i28) != 0) {
                        O = r0.O(unsafe2.getLong(obj, j10)) + r0.T(i29 << 3);
                        i27 += O;
                    }
                    c10 = 4;
                    c11 = '\b';
                    break;
                case 3:
                    i11 = i31;
                    if ((i10 & i28) != 0) {
                        O = r0.N(i29, unsafe2.getLong(obj, j10));
                        i27 += O;
                    }
                    c10 = 4;
                    c11 = '\b';
                    break;
                case 4:
                    i11 = i31;
                    if ((i10 & i28) != 0) {
                        O = r0.P(unsafe2.getInt(obj, j10)) + r0.T(i29 << 3);
                        i27 += O;
                    }
                    c10 = 4;
                    c11 = '\b';
                    break;
                case 5:
                    i11 = i31;
                    if ((i28 & i10) != 0) {
                        O = r0.R(i29);
                        i27 += O;
                    }
                    c10 = 4;
                    c11 = '\b';
                    break;
                case 6:
                    i11 = i31;
                    if ((i28 & i10) != 0) {
                        O = r0.V(i29);
                        i27 += O;
                    }
                    c10 = 4;
                    c11 = '\b';
                    break;
                case 7:
                    if ((i28 & i10) != 0) {
                        i11 = 1;
                        i27 = a1.g.E(i29 << 3, 1, i27);
                    } else {
                        i11 = 1;
                    }
                    c10 = 4;
                    c11 = '\b';
                    break;
                case 8:
                    if ((i28 & i10) != 0) {
                        Object object = unsafe2.getObject(obj, j10);
                        if (object instanceof q0) {
                            J = r0.J(i29, (q0) object);
                            i27 += J;
                        } else {
                            T = r0.T(i29 << 3);
                            G = r0.G((String) object);
                            J = G + T;
                            i27 += J;
                        }
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 9:
                    if ((i28 & i10) != 0) {
                        J = p2.a(i29, unsafe2.getObject(obj, j10), l(i26));
                        i27 += J;
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 10:
                    if ((i28 & i10) != 0) {
                        J = r0.J(i29, (q0) unsafe2.getObject(obj, j10));
                        i27 += J;
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 11:
                    if ((i28 & i10) != 0) {
                        J = r0.S(i29, unsafe2.getInt(obj, j10));
                        i27 += J;
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 12:
                    if ((i28 & i10) != 0) {
                        int i34 = unsafe2.getInt(obj, j10);
                        T = r0.T(i29 << 3);
                        G = r0.P(i34);
                        J = G + T;
                        i27 += J;
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 13:
                    if ((i28 & i10) != 0) {
                        c10 = 4;
                        i27 = a1.g.E(i29 << 3, 4, i27);
                        i11 = 1;
                        c11 = '\b';
                        break;
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                case 14:
                    if ((i28 & i10) != 0) {
                        c12 = '\b';
                        i27 = a1.g.E(i29 << 3, 8, i27);
                        c11 = c12;
                        c10 = 4;
                        i11 = 1;
                        break;
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 15:
                    if ((i28 & i10) != 0) {
                        J = r0.U(i29, unsafe2.getInt(obj, j10));
                        i27 += J;
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 16:
                    if ((i28 & i10) != 0) {
                        J = r0.Q(i29, unsafe2.getLong(obj, j10));
                        i27 += J;
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 17:
                    if ((i28 & i10) != 0) {
                        J = r0.I(i29, (l0) unsafe2.getObject(obj, j10), l(i26));
                        i27 += J;
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 18:
                    J = p2.C(i29, (List) unsafe2.getObject(obj, j10));
                    i27 += J;
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 19:
                    J = p2.z(i29, (List) unsafe2.getObject(obj, j10));
                    i27 += J;
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 20:
                    List list11 = (List) unsafe2.getObject(obj, j10);
                    Class cls11 = p2.a;
                    if (list11.size() != 0) {
                        J = e2.c(i29, list11.size(), p2.c(list11));
                        i27 += J;
                        c10 = 4;
                        i11 = 1;
                        c11 = '\b';
                        break;
                    }
                    J = 0;
                    i27 += J;
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                case 21:
                    List list12 = (List) unsafe2.getObject(obj, j10);
                    Class cls12 = p2.a;
                    int size10 = list12.size();
                    if (size10 != 0) {
                        J = e2.c(i29, size10, p2.k(list12));
                        i27 += J;
                        c10 = 4;
                        i11 = 1;
                        c11 = '\b';
                        break;
                    }
                    J = 0;
                    i27 += J;
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                case 22:
                    List list13 = (List) unsafe2.getObject(obj, j10);
                    Class cls13 = p2.a;
                    int size11 = list13.size();
                    if (size11 != 0) {
                        J = e2.c(i29, size11, p2.t(list13));
                        i27 += J;
                        c10 = 4;
                        i11 = 1;
                        c11 = '\b';
                        break;
                    }
                    J = 0;
                    i27 += J;
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                case 23:
                    J = p2.C(i29, (List) unsafe2.getObject(obj, j10));
                    i27 += J;
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 24:
                    J = p2.z(i29, (List) unsafe2.getObject(obj, j10));
                    i27 += J;
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 25:
                    List list14 = (List) unsafe2.getObject(obj, j10);
                    Class cls14 = p2.a;
                    int size12 = list14.size();
                    i27 += size12 == 0 ? 0 : (r0.T(i29 << 3) + 1) * size12;
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 26:
                    J = p2.j(i29, (List) unsafe2.getObject(obj, j10));
                    i27 += J;
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 27:
                    J = p2.b(i29, (List) unsafe2.getObject(obj, j10), l(i26));
                    i27 += J;
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 28:
                    J = p2.o(i29, (List) unsafe2.getObject(obj, j10));
                    i27 += J;
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 29:
                    List list15 = (List) unsafe2.getObject(obj, j10);
                    Class cls15 = p2.a;
                    int size13 = list15.size();
                    if (size13 != 0) {
                        J = e2.c(i29, size13, p2.v(list15));
                        i27 += J;
                        c10 = 4;
                        i11 = 1;
                        c11 = '\b';
                        break;
                    }
                    J = 0;
                    i27 += J;
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    List list16 = (List) unsafe2.getObject(obj, j10);
                    Class cls16 = p2.a;
                    int size14 = list16.size();
                    if (size14 != 0) {
                        J = e2.c(i29, size14, p2.r(list16));
                        i27 += J;
                        c10 = 4;
                        i11 = 1;
                        c11 = '\b';
                        break;
                    }
                    J = 0;
                    i27 += J;
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    J = p2.z(i29, (List) unsafe2.getObject(obj, j10));
                    i27 += J;
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 32:
                    J = p2.C(i29, (List) unsafe2.getObject(obj, j10));
                    i27 += J;
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 33:
                    List list17 = (List) unsafe2.getObject(obj, j10);
                    Class cls17 = p2.a;
                    int size15 = list17.size();
                    if (size15 != 0) {
                        J = e2.c(i29, size15, p2.x(list17));
                        i27 += J;
                        c10 = 4;
                        i11 = 1;
                        c11 = '\b';
                        break;
                    }
                    J = 0;
                    i27 += J;
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                case 34:
                    List list18 = (List) unsafe2.getObject(obj, j10);
                    Class cls18 = p2.a;
                    int size16 = list18.size();
                    if (size16 != 0) {
                        J = e2.c(i29, size16, p2.p(list18));
                        i27 += J;
                        c10 = 4;
                        i11 = 1;
                        c11 = '\b';
                        break;
                    }
                    J = 0;
                    i27 += J;
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                case 35:
                    int D4 = p2.D((List) unsafe2.getObject(obj, j10));
                    if (D4 > 0) {
                        i27 = e2.d(D4, r0.y(i29), D4, i27);
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 36:
                    int A6 = p2.A((List) unsafe2.getObject(obj, j10));
                    if (A6 > 0) {
                        i27 = e2.d(A6, r0.y(i29), A6, i27);
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 37:
                    int c14 = p2.c((List) unsafe2.getObject(obj, j10));
                    if (c14 > 0) {
                        i27 = e2.d(c14, r0.y(i29), c14, i27);
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 38:
                    int k13 = p2.k((List) unsafe2.getObject(obj, j10));
                    if (k13 > 0) {
                        i27 = e2.d(k13, r0.y(i29), k13, i27);
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    int t12 = p2.t((List) unsafe2.getObject(obj, j10));
                    if (t12 > 0) {
                        i27 = e2.d(t12, r0.y(i29), t12, i27);
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    int D5 = p2.D((List) unsafe2.getObject(obj, j10));
                    if (D5 > 0) {
                        i27 = e2.d(D5, r0.y(i29), D5, i27);
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    int A7 = p2.A((List) unsafe2.getObject(obj, j10));
                    if (A7 > 0) {
                        i27 = e2.d(A7, r0.y(i29), A7, i27);
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    List list19 = (List) unsafe2.getObject(obj, j10);
                    Class cls19 = p2.a;
                    int size17 = list19.size();
                    if (size17 > 0) {
                        i27 = e2.d(size17, r0.y(i29), size17, i27);
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    int v9 = p2.v((List) unsafe2.getObject(obj, j10));
                    if (v9 > 0) {
                        i27 = e2.d(v9, r0.y(i29), v9, i27);
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    int r11 = p2.r((List) unsafe2.getObject(obj, j10));
                    if (r11 > 0) {
                        i27 = e2.d(r11, r0.y(i29), r11, i27);
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    int A8 = p2.A((List) unsafe2.getObject(obj, j10));
                    if (A8 > 0) {
                        i27 = e2.d(A8, r0.y(i29), A8, i27);
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    int D6 = p2.D((List) unsafe2.getObject(obj, j10));
                    if (D6 > 0) {
                        i27 = e2.d(D6, r0.y(i29), D6, i27);
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    int x11 = p2.x((List) unsafe2.getObject(obj, j10));
                    if (x11 > 0) {
                        i27 = e2.d(x11, r0.y(i29), x11, i27);
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 48:
                    int p10 = p2.p((List) unsafe2.getObject(obj, j10));
                    if (p10 > 0) {
                        i27 = e2.d(p10, r0.y(i29), p10, i27);
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    List list20 = (List) unsafe2.getObject(obj, j10);
                    o2 l14 = l(i26);
                    Class cls20 = p2.a;
                    int size18 = list20.size();
                    if (size18 == 0) {
                        i12 = 0;
                    } else {
                        i12 = 0;
                        for (int i35 = 0; i35 < size18; i35++) {
                            i12 += r0.I(i29, (l0) list20.get(i35), l14);
                        }
                    }
                    i27 += i12;
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Object object2 = unsafe2.getObject(obj, j10);
                    Object t13 = t(i26);
                    b2Var.getClass();
                    b2.b(object2, t13);
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 51:
                    if (q(i29, i26, obj)) {
                        c12 = '\b';
                        i27 = a1.g.E(i29 << 3, 8, i27);
                        c11 = c12;
                        c10 = 4;
                        i11 = 1;
                        break;
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 52:
                    if (q(i29, i26, obj)) {
                        c10 = 4;
                        i27 = a1.g.E(i29 << 3, 4, i27);
                        i11 = 1;
                        c11 = '\b';
                        break;
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                case 53:
                    if (q(i29, i26, obj)) {
                        J = r0.O(B(obj, j10)) + r0.T(i29 << 3);
                        i27 += J;
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 54:
                    if (q(i29, i26, obj)) {
                        J = r0.N(i29, B(obj, j10));
                        i27 += J;
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 55:
                    if (q(i29, i26, obj)) {
                        int A9 = A(obj, j10);
                        T = r0.T(i29 << 3);
                        G = r0.P(A9);
                        J = G + T;
                        i27 += J;
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 56:
                    if (q(i29, i26, obj)) {
                        J = r0.R(i29);
                        i27 += J;
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 57:
                    if (q(i29, i26, obj)) {
                        J = r0.V(i29);
                        i27 += J;
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                    break;
                case 58:
                    if (q(i29, i26, obj)) {
                        i27 = a1.g.E(i29 << 3, i31, i27);
                        i11 = i31;
                        c10 = 4;
                        c11 = '\b';
                        break;
                    }
                    c10 = 4;
                    i11 = 1;
                    c11 = '\b';
                case 59:
                    if (q(i29, i26, obj)) {
                        Object object3 = unsafe2.getObject(obj, j10);
                        if (object3 instanceof q0) {
                            J2 = r0.J(i29, (q0) object3);
                            i27 += J2;
                        } else {
                            T2 = r0.T(i29 << 3);
                            G2 = r0.G((String) object3);
                            J2 = G2 + T2;
                            i27 += J2;
                        }
                    }
                    i11 = i31;
                    c10 = 4;
                    c11 = '\b';
                    break;
                case 60:
                    if (q(i29, i26, obj)) {
                        J2 = p2.a(i29, unsafe2.getObject(obj, j10), l(i26));
                        i27 += J2;
                    }
                    i11 = i31;
                    c10 = 4;
                    c11 = '\b';
                    break;
                case 61:
                    if (q(i29, i26, obj)) {
                        J2 = r0.J(i29, (q0) unsafe2.getObject(obj, j10));
                        i27 += J2;
                    }
                    i11 = i31;
                    c10 = 4;
                    c11 = '\b';
                    break;
                case 62:
                    if (q(i29, i26, obj)) {
                        J2 = r0.S(i29, A(obj, j10));
                        i27 += J2;
                    }
                    i11 = i31;
                    c10 = 4;
                    c11 = '\b';
                    break;
                case 63:
                    if (q(i29, i26, obj)) {
                        int A10 = A(obj, j10);
                        T2 = r0.T(i29 << 3);
                        G2 = r0.P(A10);
                        J2 = G2 + T2;
                        i27 += J2;
                    }
                    i11 = i31;
                    c10 = 4;
                    c11 = '\b';
                    break;
                case 64:
                    if (q(i29, i26, obj)) {
                        c10 = 4;
                        i27 = a1.g.E(i29 << 3, 4, i27);
                        i11 = i31;
                        c11 = '\b';
                        break;
                    }
                    i11 = i31;
                    c10 = 4;
                    c11 = '\b';
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (q(i29, i26, obj)) {
                        i27 = a1.g.E(i29 << 3, 8, i27);
                        c11 = '\b';
                        i11 = i31;
                        c10 = 4;
                        break;
                    }
                    i11 = i31;
                    c10 = 4;
                    c11 = '\b';
                    break;
                case 66:
                    if (q(i29, i26, obj)) {
                        J2 = r0.U(i29, A(obj, j10));
                        i27 += J2;
                    }
                    i11 = i31;
                    c10 = 4;
                    c11 = '\b';
                    break;
                case 67:
                    if (q(i29, i26, obj)) {
                        J2 = r0.Q(i29, B(obj, j10));
                        i27 += J2;
                    }
                    i11 = i31;
                    c10 = 4;
                    c11 = '\b';
                    break;
                case 68:
                    if (q(i29, i26, obj)) {
                        J2 = r0.I(i29, (l0) unsafe2.getObject(obj, j10), l(i26));
                        i27 += J2;
                    }
                    i11 = i31;
                    c10 = 4;
                    c11 = '\b';
                    break;
                default:
                    i11 = i31;
                    c10 = 4;
                    c11 = '\b';
                    break;
            }
            i26 += 3;
            i16 = i11;
            q2Var2 = q2Var;
        }
        q2Var2.getClass();
        return ((f1) obj).zzb.d() + i27;
    }
}
