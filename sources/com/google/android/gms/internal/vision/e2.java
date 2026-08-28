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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e2 implements n2 {
    public static final int[] n = new int[0];
    public static final Unsafe o = x2.g();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final l0 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final h2 j;
    public final s1 k;
    public final p2 l;
    public final b2 m;

    public e2(int[] iArr, Object[] objArr, int i9, int i10, l0 l0Var, boolean z10, int[] iArr2, int i11, int i12, h2 h2Var, s1 s1Var, p2 p2Var, v0 v0Var, b2 b2Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i9;
        this.d = i10;
        this.f = z10;
        this.g = iArr2;
        this.h = i11;
        this.i = i12;
        this.j = h2Var;
        this.k = s1Var;
        this.l = p2Var;
        this.e = l0Var;
        this.m = b2Var;
    }

    public static int A(Object obj, long j10) {
        return ((Integer) x2.l(obj, j10)).intValue();
    }

    public static long B(Object obj, long j10) {
        return ((Long) x2.l(obj, j10)).longValue();
    }

    public static q2 C(Object obj) {
        f1 f1Var = (f1) obj;
        q2 q2Var = f1Var.zzb;
        if (q2Var != q2.f) {
            return q2Var;
        }
        q2 b10 = q2.b();
        f1Var.zzb = b10;
        return b10;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e2 k(l2 l2Var, h2 h2Var, s1 s1Var, p2 p2Var, v0 v0Var, b2 b2Var) {
        int i9;
        int charAt;
        int charAt2;
        int charAt3;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        char charAt4;
        int i15;
        char charAt5;
        int i16;
        char charAt6;
        int i17;
        char charAt7;
        int i18;
        char charAt8;
        int i19;
        char charAt9;
        int i20;
        char charAt10;
        int i21;
        char charAt11;
        int i22;
        int i23;
        int i24;
        int objectFieldOffset;
        int i25;
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
        if (!(l2Var instanceof l2)) {
            l2Var.getClass();
            throw new ClassCastException();
        }
        boolean z10 = (l2Var.d & 1) != 1;
        String str = l2Var.b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i35 = 1;
            while (true) {
                i9 = i35 + 1;
                if (str.charAt(i35) < 55296) {
                    break;
                }
                i35 = i9;
            }
        } else {
            i9 = 1;
        }
        int i36 = i9 + 1;
        int charAt17 = str.charAt(i9);
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
            iArr = n;
            i13 = 0;
            i11 = 0;
            i12 = 0;
            charAt = 0;
            charAt2 = 0;
            i10 = 0;
            charAt3 = 0;
        } else {
            int i39 = i36 + 1;
            int charAt18 = str.charAt(i36);
            if (charAt18 >= 55296) {
                int i40 = charAt18 & 8191;
                int i41 = 13;
                while (true) {
                    i21 = i39 + 1;
                    charAt11 = str.charAt(i39);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i40 |= (charAt11 & 8191) << i41;
                    i41 += 13;
                    i39 = i21;
                }
                charAt18 = i40 | (charAt11 << i41);
                i39 = i21;
            }
            int i42 = i39 + 1;
            int charAt19 = str.charAt(i39);
            if (charAt19 >= 55296) {
                int i43 = charAt19 & 8191;
                int i44 = 13;
                while (true) {
                    i20 = i42 + 1;
                    charAt10 = str.charAt(i42);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i43 |= (charAt10 & 8191) << i44;
                    i44 += 13;
                    i42 = i20;
                }
                charAt19 = i43 | (charAt10 << i44);
                i42 = i20;
            }
            int i45 = i42 + 1;
            int charAt20 = str.charAt(i42);
            if (charAt20 >= 55296) {
                int i46 = charAt20 & 8191;
                int i47 = 13;
                while (true) {
                    i19 = i45 + 1;
                    charAt9 = str.charAt(i45);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i46 |= (charAt9 & 8191) << i47;
                    i47 += 13;
                    i45 = i19;
                }
                charAt20 = i46 | (charAt9 << i47);
                i45 = i19;
            }
            int i48 = i45 + 1;
            int charAt21 = str.charAt(i45);
            if (charAt21 >= 55296) {
                int i49 = charAt21 & 8191;
                int i50 = 13;
                while (true) {
                    i18 = i48 + 1;
                    charAt8 = str.charAt(i48);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i49 |= (charAt8 & 8191) << i50;
                    i50 += 13;
                    i48 = i18;
                }
                charAt21 = i49 | (charAt8 << i50);
                i48 = i18;
            }
            int i51 = i48 + 1;
            charAt = str.charAt(i48);
            if (charAt >= 55296) {
                int i52 = charAt & 8191;
                int i53 = 13;
                while (true) {
                    i17 = i51 + 1;
                    charAt7 = str.charAt(i51);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i52 |= (charAt7 & 8191) << i53;
                    i53 += 13;
                    i51 = i17;
                }
                charAt = i52 | (charAt7 << i53);
                i51 = i17;
            }
            int i54 = i51 + 1;
            charAt2 = str.charAt(i51);
            if (charAt2 >= 55296) {
                int i55 = charAt2 & 8191;
                int i56 = 13;
                while (true) {
                    i16 = i54 + 1;
                    charAt6 = str.charAt(i54);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i55 |= (charAt6 & 8191) << i56;
                    i56 += 13;
                    i54 = i16;
                }
                charAt2 = i55 | (charAt6 << i56);
                i54 = i16;
            }
            int i57 = i54 + 1;
            int charAt22 = str.charAt(i54);
            if (charAt22 >= 55296) {
                int i58 = charAt22 & 8191;
                int i59 = 13;
                while (true) {
                    i15 = i57 + 1;
                    charAt5 = str.charAt(i57);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i58 |= (charAt5 & 8191) << i59;
                    i59 += 13;
                    i57 = i15;
                }
                charAt22 = i58 | (charAt5 << i59);
                i57 = i15;
            }
            int i60 = i57 + 1;
            charAt3 = str.charAt(i57);
            if (charAt3 >= 55296) {
                int i61 = charAt3 & 8191;
                int i62 = i60;
                int i63 = 13;
                while (true) {
                    i14 = i62 + 1;
                    charAt4 = str.charAt(i62);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i61 |= (charAt4 & 8191) << i63;
                    i63 += 13;
                    i62 = i14;
                }
                charAt3 = i61 | (charAt4 << i63);
                i60 = i14;
            }
            int[] iArr2 = new int[charAt3 + charAt2 + charAt22];
            i10 = (charAt18 << 1) + charAt19;
            i11 = charAt20;
            i12 = charAt21;
            iArr = iArr2;
            i13 = charAt18;
            i36 = i60;
        }
        Unsafe unsafe = o;
        Object[] objArr = l2Var.c;
        Class<?> cls = l2Var.a.getClass();
        int i64 = i13;
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
                    i22 = length;
                    if (charAt15 < 55296) {
                        break;
                    }
                    i71 |= (charAt15 & 8191) << i73;
                    i73 += 13;
                    i72 = i33;
                    length = i22;
                }
                charAt23 = i71 | (charAt15 << i73);
                i23 = i33;
            } else {
                i22 = length;
                i23 = i70;
            }
            int i74 = i23 + 1;
            int charAt24 = str.charAt(i23);
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
                i24 = i31;
            } else {
                i24 = i74;
            }
            int i78 = charAt23;
            int i79 = charAt24 & 255;
            int i80 = i11;
            if ((charAt24 & 1024) != 0) {
                iArr[i68] = i69;
                i68++;
            }
            int i81 = i12;
            if (i79 >= 51) {
                int i82 = i24 + 1;
                int charAt25 = str.charAt(i24);
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
                    i29 = i10 + 1;
                    objArr2[((i69 / 3) << 1) + 1] = objArr[i10];
                } else {
                    if (i85 == 12 && !z10) {
                        i29 = i10 + 1;
                        objArr2[((i69 / 3) << 1) + 1] = objArr[i10];
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
                    i25 = (int) unsafe.objectFieldOffset(m12);
                    i28 = objectFieldOffset2;
                    i27 = 0;
                    i26 = i88;
                }
                i10 = i29;
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
                i25 = (int) unsafe.objectFieldOffset(m12);
                i28 = objectFieldOffset22;
                i27 = 0;
                i26 = i882;
            } else {
                int i90 = i10 + 1;
                Field m13 = m(cls, (String) objArr[i10]);
                if (i79 == 9 || i79 == 17) {
                    objArr2[((i69 / 3) << 1) + 1] = m13.getType();
                } else {
                    if (i79 == 27 || i79 == 49) {
                        i10 += 2;
                        objArr2[((i69 / 3) << 1) + 1] = objArr[i90];
                    } else if (i79 == 12 || i79 == 30 || i79 == 44) {
                        if (!z10) {
                            i10 += 2;
                            objArr2[((i69 / 3) << 1) + 1] = objArr[i90];
                        }
                    } else if (i79 == 50) {
                        int i91 = i67 + 1;
                        iArr[i67] = i69;
                        int i92 = (i69 / 3) << 1;
                        int i93 = i10 + 2;
                        objArr2[i92] = objArr[i90];
                        if ((charAt24 & 2048) != 0) {
                            objArr2[i92 + 1] = objArr[i93];
                            i10 += 3;
                        } else {
                            i10 = i93;
                        }
                        i67 = i91;
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(m13);
                    if ((charAt24 & 4096) == 4096 || i79 > 17) {
                        i25 = 1048575;
                        i26 = i24;
                        i27 = 0;
                    } else {
                        int i94 = i24 + 1;
                        int charAt26 = str.charAt(i24);
                        if (charAt26 >= 55296) {
                            int i95 = charAt26 & 8191;
                            int i96 = 13;
                            while (true) {
                                i26 = i94 + 1;
                                charAt12 = str.charAt(i94);
                                if (charAt12 < 55296) {
                                    break;
                                }
                                i95 |= (charAt12 & 8191) << i96;
                                i96 += 13;
                                i94 = i26;
                            }
                            charAt26 = i95 | (charAt12 << i96);
                        } else {
                            i26 = i94;
                        }
                        int i97 = (charAt26 / 32) + (i64 << 1);
                        Object obj3 = objArr[i97];
                        if (obj3 instanceof Field) {
                            m10 = (Field) obj3;
                        } else {
                            m10 = m(cls, (String) obj3);
                            objArr[i97] = m10;
                        }
                        i27 = charAt26 % 32;
                        i25 = (int) unsafe.objectFieldOffset(m10);
                    }
                    if (i79 >= 18 && i79 <= 49) {
                        iArr[i66] = objectFieldOffset;
                        i66++;
                    }
                    i28 = objectFieldOffset;
                }
                i10 = i90;
                objectFieldOffset = (int) unsafe.objectFieldOffset(m13);
                if ((charAt24 & 4096) == 4096) {
                }
                i25 = 1048575;
                i26 = i24;
                i27 = 0;
                if (i79 >= 18) {
                    iArr[i66] = objectFieldOffset;
                    i66++;
                }
                i28 = objectFieldOffset;
            }
            int i98 = i69 + 1;
            iArr4[i69] = i78;
            int i99 = i69 + 2;
            String str2 = str;
            iArr4[i98] = ((charAt24 & 512) != 0 ? TLObject.FLAG_29 : 0) | ((charAt24 & 256) != 0 ? TLObject.FLAG_28 : 0) | (i79 << 20) | i28;
            i69 += 3;
            iArr4[i99] = (i27 << 20) | i25;
            iArr3 = iArr4;
            i11 = i80;
            length = i22;
            str = str2;
            i36 = i26;
            i12 = i81;
        }
        return new e2(iArr3, objArr2, i11, i12, l2Var.a, z10, iArr, charAt3, i65, h2Var, s1Var, p2Var, v0Var, b2Var);
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
            throw new RuntimeException(aa.d.r(sb2, " not found. Known fields are ", arrays));
        }
    }

    public static void n(int i9, Object obj, y1 y1Var) {
        if (!(obj instanceof String)) {
            y1Var.a(i9, (q0) obj);
            return;
        }
        String str = (String) obj;
        r0 r0Var = (r0) y1Var.a;
        r0Var.D(i9, 2);
        byte[] bArr = r0Var.c;
        int i10 = r0Var.e;
        try {
            int T = r0.T(str.length() * 3);
            int T2 = r0.T(str.length());
            if (T2 != T) {
                r0Var.H(a3.a(str));
                r0Var.e = a3.a.h(str, bArr, r0Var.e, r0Var.F());
                return;
            }
            int i11 = i10 + T2;
            r0Var.e = i11;
            int h = a3.a.h(str, bArr, i11, r0Var.F());
            r0Var.e = i10;
            r0Var.H((h - i10) - T2);
            r0Var.e = h;
        } catch (b3 e10) {
            r0Var.e = i10;
            r0.f.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(j1.a);
            try {
                r0Var.H(bytes.length);
                r0Var.L(bytes, 0, bytes.length);
            } catch (s0 e11) {
                throw e11;
            } catch (IndexOutOfBoundsException e12) {
                throw new s0(e12);
            }
        } catch (IndexOutOfBoundsException e13) {
            throw new s0(e13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f1, code lost:
    
        return false;
     */
    @Override // com.google.android.gms.internal.vision.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Object obj) {
        int i9 = 0;
        int i10 = 1048575;
        int i11 = 0;
        loop0: while (true) {
            boolean z10 = true;
            if (i9 >= this.h) {
                return true;
            }
            int i12 = this.g[i9];
            int[] iArr = this.a;
            int i13 = iArr[i12];
            int z11 = z(i12);
            int i14 = iArr[i12 + 2];
            int i15 = i14 & 1048575;
            int i16 = 1 << (i14 >>> 20);
            if (i15 != i10) {
                if (i15 != 1048575) {
                    i11 = o.getInt(obj, i15);
                }
                i10 = i15;
            }
            if ((268435456 & z11) != 0) {
                if (!(i10 == 1048575 ? r(i12, obj) : (i11 & i16) != 0)) {
                    break;
                }
            }
            int i17 = (267386880 & z11) >>> 20;
            if (i17 == 9 || i17 == 17) {
                if (i10 == 1048575) {
                    z10 = r(i12, obj);
                } else if ((i16 & i11) == 0) {
                    z10 = false;
                }
                if (z10 && !l(i12).a(x2.l(obj, z11 & 1048575))) {
                    break;
                }
                i9++;
            } else {
                if (i17 != 27) {
                    if (i17 == 60 || i17 == 68) {
                        if (q(i13, i12, obj) && !l(i12).a(x2.l(obj, z11 & 1048575))) {
                            break;
                        }
                    } else if (i17 != 49) {
                        if (i17 != 50) {
                            continue;
                        } else {
                            Object l10 = x2.l(obj, z11 & 1048575);
                            this.m.getClass();
                            if (!((a2) l10).isEmpty()) {
                                if (t(i12) == null) {
                                    throw new NoSuchMethodError();
                                }
                                throw new ClassCastException();
                            }
                        }
                    }
                    i9++;
                }
                List list = (List) x2.l(obj, z11 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    n2 l11 = l(i12);
                    for (int i18 = 0; i18 < list.size(); i18++) {
                        if (!l11.a(list.get(i18))) {
                            break loop0;
                        }
                    }
                }
                i9++;
            }
        }
    }

    @Override // com.google.android.gms.internal.vision.n2
    public final void b(Object obj) {
        int[] iArr;
        int i9;
        int i10 = this.h;
        while (true) {
            iArr = this.g;
            i9 = this.i;
            if (i10 >= i9) {
                break;
            }
            long z10 = z(iArr[i10]) & 1048575;
            Object l10 = x2.l(obj, z10);
            if (l10 != null) {
                this.m.getClass();
                ((a2) l10).a = false;
                x2.d(obj, z10, l10);
            }
            i10++;
        }
        int length = iArr.length;
        while (i9 < length) {
            this.k.b(obj, iArr[i9]);
            i9++;
        }
        this.l.getClass();
        ((f1) obj).zzb.e = false;
    }

    @Override // com.google.android.gms.internal.vision.n2
    public final void c(Object obj, y1 y1Var) {
        y1Var.getClass();
        r0 r0Var = (r0) y1Var.a;
        if (!this.f) {
            w(obj, y1Var);
            return;
        }
        int[] iArr = this.a;
        int length = iArr.length;
        for (int i9 = 0; i9 < length; i9 += 3) {
            int z10 = z(i9);
            int i10 = iArr[i9];
            switch ((267386880 & z10) >>> 20) {
                case 0:
                    if (r(i9, obj)) {
                        double j10 = x2.c.j(obj, z10 & 1048575);
                        r0Var.getClass();
                        long doubleToRawLongBits = Double.doubleToRawLongBits(j10);
                        r0Var.D(i10, 1);
                        r0Var.K(doubleToRawLongBits);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (r(i9, obj)) {
                        float i11 = x2.c.i(obj, z10 & 1048575);
                        r0Var.getClass();
                        int floatToRawIntBits = Float.floatToRawIntBits(i11);
                        r0Var.D(i10, 5);
                        r0Var.M(floatToRawIntBits);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (r(i9, obj)) {
                        long l10 = x2.c.l(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.E(l10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (r(i9, obj)) {
                        long l11 = x2.c.l(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.E(l11);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (r(i9, obj)) {
                        int k10 = x2.c.k(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.C(k10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (r(i9, obj)) {
                        long l12 = x2.c.l(obj, z10 & 1048575);
                        r0Var.D(i10, 1);
                        r0Var.K(l12);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (r(i9, obj)) {
                        int k11 = x2.c.k(obj, z10 & 1048575);
                        r0Var.D(i10, 5);
                        r0Var.M(k11);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (r(i9, obj)) {
                        boolean h = x2.c.h(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.B(h ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (r(i9, obj)) {
                        n(i10, x2.l(obj, z10 & 1048575), y1Var);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (r(i9, obj)) {
                        y1Var.b(i10, x2.l(obj, z10 & 1048575), l(i9));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (r(i9, obj)) {
                        y1Var.a(i10, (q0) x2.l(obj, z10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (r(i9, obj)) {
                        int k12 = x2.c.k(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.H(k12);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (r(i9, obj)) {
                        int k13 = x2.c.k(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.C(k13);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (r(i9, obj)) {
                        int k14 = x2.c.k(obj, z10 & 1048575);
                        r0Var.D(i10, 5);
                        r0Var.M(k14);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (r(i9, obj)) {
                        long l13 = x2.c.l(obj, z10 & 1048575);
                        r0Var.D(i10, 1);
                        r0Var.K(l13);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (r(i9, obj)) {
                        int k15 = x2.c.k(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.H((k15 >> 31) ^ (k15 << 1));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (r(i9, obj)) {
                        long l14 = x2.c.l(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.E((l14 >> 63) ^ (l14 << 1));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (r(i9, obj)) {
                        y1Var.c(i10, x2.l(obj, z10 & 1048575), l(i9));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    o2.g(i10, (List) x2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 19:
                    o2.n(i10, (List) x2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 20:
                    o2.q(i10, (List) x2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 21:
                    o2.s(i10, (List) x2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 22:
                    o2.B(i10, (List) x2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 23:
                    o2.w(i10, (List) x2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 24:
                    o2.G(i10, (List) x2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 25:
                    o2.J(i10, (List) x2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 26:
                    o2.e(i10, (List) x2.l(obj, z10 & 1048575), y1Var);
                    break;
                case 27:
                    o2.f(i10, (List) x2.l(obj, z10 & 1048575), y1Var, l(i9));
                    break;
                case 28:
                    o2.l(i10, (List) x2.l(obj, z10 & 1048575), y1Var);
                    break;
                case 29:
                    o2.E(i10, (List) x2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    o2.I(i10, (List) x2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    o2.H(i10, (List) x2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 32:
                    o2.y(i10, (List) x2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 33:
                    o2.F(i10, (List) x2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 34:
                    o2.u(i10, (List) x2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 35:
                    o2.g(i10, (List) x2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case 36:
                    o2.n(i10, (List) x2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case 37:
                    o2.q(i10, (List) x2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case 38:
                    o2.s(i10, (List) x2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    o2.B(i10, (List) x2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    o2.w(i10, (List) x2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    o2.G(i10, (List) x2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    o2.J(i10, (List) x2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    o2.E(i10, (List) x2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    o2.I(i10, (List) x2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    o2.H(i10, (List) x2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    o2.y(i10, (List) x2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    o2.F(i10, (List) x2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case 48:
                    o2.u(i10, (List) x2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    o2.m(i10, (List) x2.l(obj, z10 & 1048575), y1Var, l(i9));
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    if (x2.l(obj, z10 & 1048575) != null) {
                        Object t10 = t(i9);
                        this.m.getClass();
                        if (t10 != null) {
                            throw new ClassCastException();
                        }
                        throw new NoSuchMethodError();
                    }
                    break;
                case 51:
                    if (q(i10, i9, obj)) {
                        double doubleValue = ((Double) x2.l(obj, z10 & 1048575)).doubleValue();
                        r0Var.getClass();
                        long doubleToRawLongBits2 = Double.doubleToRawLongBits(doubleValue);
                        r0Var.D(i10, 1);
                        r0Var.K(doubleToRawLongBits2);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(i10, i9, obj)) {
                        float floatValue = ((Float) x2.l(obj, z10 & 1048575)).floatValue();
                        r0Var.getClass();
                        int floatToRawIntBits2 = Float.floatToRawIntBits(floatValue);
                        r0Var.D(i10, 5);
                        r0Var.M(floatToRawIntBits2);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (q(i10, i9, obj)) {
                        long B = B(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.E(B);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (q(i10, i9, obj)) {
                        long B2 = B(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.E(B2);
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (q(i10, i9, obj)) {
                        int A = A(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.C(A);
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(i10, i9, obj)) {
                        long B3 = B(obj, z10 & 1048575);
                        r0Var.D(i10, 1);
                        r0Var.K(B3);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (q(i10, i9, obj)) {
                        int A2 = A(obj, z10 & 1048575);
                        r0Var.D(i10, 5);
                        r0Var.M(A2);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (q(i10, i9, obj)) {
                        boolean booleanValue = ((Boolean) x2.l(obj, z10 & 1048575)).booleanValue();
                        r0Var.D(i10, 0);
                        r0Var.B(booleanValue ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(i10, i9, obj)) {
                        n(i10, x2.l(obj, z10 & 1048575), y1Var);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (q(i10, i9, obj)) {
                        y1Var.b(i10, x2.l(obj, z10 & 1048575), l(i9));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (q(i10, i9, obj)) {
                        y1Var.a(i10, (q0) x2.l(obj, z10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (q(i10, i9, obj)) {
                        int A3 = A(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.H(A3);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (q(i10, i9, obj)) {
                        int A4 = A(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.C(A4);
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(i10, i9, obj)) {
                        int A5 = A(obj, z10 & 1048575);
                        r0Var.D(i10, 5);
                        r0Var.M(A5);
                        break;
                    } else {
                        break;
                    }
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (q(i10, i9, obj)) {
                        long B4 = B(obj, z10 & 1048575);
                        r0Var.D(i10, 1);
                        r0Var.K(B4);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (q(i10, i9, obj)) {
                        int A6 = A(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.H((A6 >> 31) ^ (A6 << 1));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (q(i10, i9, obj)) {
                        long B5 = B(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.E((B5 >> 63) ^ (B5 << 1));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (q(i10, i9, obj)) {
                        y1Var.c(i10, x2.l(obj, z10 & 1048575), l(i9));
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.l.getClass();
        ((f1) obj).zzb.c(y1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fe, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d6, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d8, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00da, code lost:
    
        r3 = r8 + r3;
     */
    @Override // com.google.android.gms.internal.vision.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(f1 f1Var) {
        int i9;
        int a2;
        int i10;
        int[] iArr = this.a;
        int length = iArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int z10 = z(i12);
            int i13 = iArr[i12];
            long j10 = 1048575 & z10;
            int i14 = 1237;
            int i15 = 37;
            switch ((z10 & 267386880) >>> 20) {
                case 0:
                    i9 = i11 * 53;
                    a2 = j1.a(Double.doubleToLongBits(x2.c.j(f1Var, j10)));
                    i11 = a2 + i9;
                    break;
                case 1:
                    i9 = i11 * 53;
                    a2 = Float.floatToIntBits(x2.c.i(f1Var, j10));
                    i11 = a2 + i9;
                    break;
                case 2:
                    i9 = i11 * 53;
                    a2 = j1.a(x2.c.l(f1Var, j10));
                    i11 = a2 + i9;
                    break;
                case 3:
                    i9 = i11 * 53;
                    a2 = j1.a(x2.c.l(f1Var, j10));
                    i11 = a2 + i9;
                    break;
                case 4:
                    i9 = i11 * 53;
                    a2 = x2.c.k(f1Var, j10);
                    i11 = a2 + i9;
                    break;
                case 5:
                    i9 = i11 * 53;
                    a2 = j1.a(x2.c.l(f1Var, j10));
                    i11 = a2 + i9;
                    break;
                case 6:
                    i9 = i11 * 53;
                    a2 = x2.c.k(f1Var, j10);
                    i11 = a2 + i9;
                    break;
                case 7:
                    i10 = i11 * 53;
                    boolean h = x2.c.h(f1Var, j10);
                    Charset charset = j1.a;
                    break;
                case 8:
                    i9 = i11 * 53;
                    a2 = ((String) x2.l(f1Var, j10)).hashCode();
                    i11 = a2 + i9;
                    break;
                case 9:
                    Object l10 = x2.l(f1Var, j10);
                    if (l10 != null) {
                        i15 = l10.hashCode();
                    }
                    i11 = (i11 * 53) + i15;
                    break;
                case 10:
                    i9 = i11 * 53;
                    a2 = x2.l(f1Var, j10).hashCode();
                    i11 = a2 + i9;
                    break;
                case 11:
                    i9 = i11 * 53;
                    a2 = x2.c.k(f1Var, j10);
                    i11 = a2 + i9;
                    break;
                case 12:
                    i9 = i11 * 53;
                    a2 = x2.c.k(f1Var, j10);
                    i11 = a2 + i9;
                    break;
                case 13:
                    i9 = i11 * 53;
                    a2 = x2.c.k(f1Var, j10);
                    i11 = a2 + i9;
                    break;
                case 14:
                    i9 = i11 * 53;
                    a2 = j1.a(x2.c.l(f1Var, j10));
                    i11 = a2 + i9;
                    break;
                case 15:
                    i9 = i11 * 53;
                    a2 = x2.c.k(f1Var, j10);
                    i11 = a2 + i9;
                    break;
                case 16:
                    i9 = i11 * 53;
                    a2 = j1.a(x2.c.l(f1Var, j10));
                    i11 = a2 + i9;
                    break;
                case 17:
                    Object l11 = x2.l(f1Var, j10);
                    if (l11 != null) {
                        i15 = l11.hashCode();
                    }
                    i11 = (i11 * 53) + i15;
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
                    i9 = i11 * 53;
                    a2 = x2.l(f1Var, j10).hashCode();
                    i11 = a2 + i9;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    i9 = i11 * 53;
                    a2 = x2.l(f1Var, j10).hashCode();
                    i11 = a2 + i9;
                    break;
                case 51:
                    if (q(i13, i12, f1Var)) {
                        i9 = i11 * 53;
                        a2 = j1.a(Double.doubleToLongBits(((Double) x2.l(f1Var, j10)).doubleValue()));
                        i11 = a2 + i9;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(i13, i12, f1Var)) {
                        i9 = i11 * 53;
                        a2 = Float.floatToIntBits(((Float) x2.l(f1Var, j10)).floatValue());
                        i11 = a2 + i9;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (q(i13, i12, f1Var)) {
                        i9 = i11 * 53;
                        a2 = j1.a(B(f1Var, j10));
                        i11 = a2 + i9;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (q(i13, i12, f1Var)) {
                        i9 = i11 * 53;
                        a2 = j1.a(B(f1Var, j10));
                        i11 = a2 + i9;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (q(i13, i12, f1Var)) {
                        i9 = i11 * 53;
                        a2 = A(f1Var, j10);
                        i11 = a2 + i9;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(i13, i12, f1Var)) {
                        i9 = i11 * 53;
                        a2 = j1.a(B(f1Var, j10));
                        i11 = a2 + i9;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (q(i13, i12, f1Var)) {
                        i9 = i11 * 53;
                        a2 = A(f1Var, j10);
                        i11 = a2 + i9;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (q(i13, i12, f1Var)) {
                        i10 = i11 * 53;
                        boolean booleanValue = ((Boolean) x2.l(f1Var, j10)).booleanValue();
                        Charset charset2 = j1.a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(i13, i12, f1Var)) {
                        i9 = i11 * 53;
                        a2 = ((String) x2.l(f1Var, j10)).hashCode();
                        i11 = a2 + i9;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (q(i13, i12, f1Var)) {
                        i9 = i11 * 53;
                        a2 = x2.l(f1Var, j10).hashCode();
                        i11 = a2 + i9;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (q(i13, i12, f1Var)) {
                        i9 = i11 * 53;
                        a2 = x2.l(f1Var, j10).hashCode();
                        i11 = a2 + i9;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (q(i13, i12, f1Var)) {
                        i9 = i11 * 53;
                        a2 = A(f1Var, j10);
                        i11 = a2 + i9;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (q(i13, i12, f1Var)) {
                        i9 = i11 * 53;
                        a2 = A(f1Var, j10);
                        i11 = a2 + i9;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(i13, i12, f1Var)) {
                        i9 = i11 * 53;
                        a2 = A(f1Var, j10);
                        i11 = a2 + i9;
                        break;
                    } else {
                        break;
                    }
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (q(i13, i12, f1Var)) {
                        i9 = i11 * 53;
                        a2 = j1.a(B(f1Var, j10));
                        i11 = a2 + i9;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (q(i13, i12, f1Var)) {
                        i9 = i11 * 53;
                        a2 = A(f1Var, j10);
                        i11 = a2 + i9;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (q(i13, i12, f1Var)) {
                        i9 = i11 * 53;
                        a2 = j1.a(B(f1Var, j10));
                        i11 = a2 + i9;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (q(i13, i12, f1Var)) {
                        i9 = i11 * 53;
                        a2 = x2.l(f1Var, j10).hashCode();
                        i11 = a2 + i9;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.l.getClass();
        return f1Var.zzb.hashCode() + (i11 * 53);
    }

    @Override // com.google.android.gms.internal.vision.n2
    public final void e(f1 f1Var, f1 f1Var2) {
        f1 f1Var3;
        f1Var2.getClass();
        int i9 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i9 >= iArr.length) {
                o2.h(this.l, f1Var, f1Var2);
                return;
            }
            int z10 = z(i9);
            long j10 = z10 & 1048575;
            int i10 = iArr[i9];
            switch ((z10 & 267386880) >>> 20) {
                case 0:
                    f1Var3 = f1Var;
                    if (!r(i9, f1Var2)) {
                        break;
                    } else {
                        w2 w2Var = x2.c;
                        w2Var.d(f1Var3, j10, w2Var.j(f1Var2, j10));
                        u(i9, f1Var3);
                        continue;
                    }
                case 1:
                    f1Var3 = f1Var;
                    if (r(i9, f1Var2)) {
                        w2 w2Var2 = x2.c;
                        w2Var2.e(f1Var3, j10, w2Var2.i(f1Var2, j10));
                        u(i9, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    f1Var3 = f1Var;
                    if (r(i9, f1Var2)) {
                        w2 w2Var3 = x2.c;
                        w2Var3.f(f1Var3, j10, w2Var3.l(f1Var2, j10));
                        u(i9, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    f1Var3 = f1Var;
                    if (r(i9, f1Var2)) {
                        w2 w2Var4 = x2.c;
                        w2Var4.f(f1Var3, j10, w2Var4.l(f1Var2, j10));
                        u(i9, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    f1Var3 = f1Var;
                    if (r(i9, f1Var2)) {
                        x2.c(j10, f1Var3, x2.c.k(f1Var2, j10));
                        u(i9, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    f1Var3 = f1Var;
                    if (r(i9, f1Var2)) {
                        w2 w2Var5 = x2.c;
                        w2Var5.f(f1Var3, j10, w2Var5.l(f1Var2, j10));
                        u(i9, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    f1Var3 = f1Var;
                    if (r(i9, f1Var2)) {
                        x2.c(j10, f1Var3, x2.c.k(f1Var2, j10));
                        u(i9, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    f1Var3 = f1Var;
                    if (r(i9, f1Var2)) {
                        w2 w2Var6 = x2.c;
                        w2Var6.g(f1Var3, j10, w2Var6.h(f1Var2, j10));
                        u(i9, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    f1Var3 = f1Var;
                    if (r(i9, f1Var2)) {
                        x2.d(f1Var3, j10, x2.l(f1Var2, j10));
                        u(i9, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    f1Var3 = f1Var;
                    o(i9, f1Var3, f1Var2);
                    continue;
                case 10:
                    f1Var3 = f1Var;
                    if (r(i9, f1Var2)) {
                        x2.d(f1Var3, j10, x2.l(f1Var2, j10));
                        u(i9, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    f1Var3 = f1Var;
                    if (r(i9, f1Var2)) {
                        x2.c(j10, f1Var3, x2.c.k(f1Var2, j10));
                        u(i9, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    f1Var3 = f1Var;
                    if (r(i9, f1Var2)) {
                        x2.c(j10, f1Var3, x2.c.k(f1Var2, j10));
                        u(i9, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    f1Var3 = f1Var;
                    if (r(i9, f1Var2)) {
                        x2.c(j10, f1Var3, x2.c.k(f1Var2, j10));
                        u(i9, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    f1Var3 = f1Var;
                    if (r(i9, f1Var2)) {
                        w2 w2Var7 = x2.c;
                        w2Var7.f(f1Var3, j10, w2Var7.l(f1Var2, j10));
                        u(i9, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    f1Var3 = f1Var;
                    if (r(i9, f1Var2)) {
                        x2.c(j10, f1Var3, x2.c.k(f1Var2, j10));
                        u(i9, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (r(i9, f1Var2)) {
                        w2 w2Var8 = x2.c;
                        f1Var3 = f1Var;
                        w2Var8.f(f1Var3, j10, w2Var8.l(f1Var2, j10));
                        u(i9, f1Var3);
                        break;
                    }
                    break;
                case 17:
                    o(i9, f1Var, f1Var2);
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
                    this.k.a(f1Var, j10, f1Var2);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Class cls = o2.a;
                    Object l10 = x2.l(f1Var, j10);
                    Object l11 = x2.l(f1Var2, j10);
                    this.m.getClass();
                    x2.d(f1Var, j10, b2.a(l10, l11));
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
                    if (q(i10, i9, f1Var2)) {
                        x2.d(f1Var, j10, x2.l(f1Var2, j10));
                        x2.c(iArr[i9 + 2] & 1048575, f1Var, i10);
                        break;
                    }
                    break;
                case 60:
                    v(i9, f1Var, f1Var2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                case 66:
                case 67:
                    if (q(i10, i9, f1Var2)) {
                        x2.d(f1Var, j10, x2.l(f1Var2, j10));
                        x2.c(iArr[i9 + 2] & 1048575, f1Var, i10);
                        break;
                    }
                    break;
                case 68:
                    v(i9, f1Var, f1Var2);
                    break;
            }
            f1Var3 = f1Var;
            i9 += 3;
            f1Var = f1Var3;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:81:0x00a9. Please report as an issue. */
    @Override // com.google.android.gms.internal.vision.n2
    public final void f(Object obj, byte[] bArr, int i9, int i10, com.google.android.gms.internal.clearcut.m mVar) {
        int s10;
        Unsafe unsafe;
        Object obj2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        char c10;
        Unsafe unsafe2;
        Object obj3;
        int i17;
        Unsafe unsafe3;
        Object obj4;
        int i18;
        int i19;
        int i20;
        e2 e2Var = this;
        Object obj5 = obj;
        byte[] bArr2 = bArr;
        int i21 = i10;
        com.google.android.gms.internal.clearcut.m mVar2 = mVar;
        if (!e2Var.f) {
            j(obj5, bArr, i9, i21, 0, mVar);
            return;
        }
        Unsafe unsafe4 = o;
        int i22 = i9;
        int i23 = -1;
        int i24 = 0;
        int i25 = 1048575;
        int i26 = 0;
        while (i22 < i21) {
            int i27 = i22 + 1;
            int i28 = bArr2[i22];
            if (i28 < 0) {
                i27 = e1.d(i28, bArr2, i27, mVar2);
                i28 = mVar2.a;
            }
            int i29 = i27;
            int i30 = i28 >>> 3;
            int i31 = i28 & 7;
            int i32 = e2Var.d;
            int i33 = e2Var.c;
            if (i30 > i23) {
                s10 = (i30 < i33 || i30 > i32) ? -1 : e2Var.s(i30, i24 / 3);
            } else {
                s10 = (i30 < i33 || i30 > i32) ? -1 : e2Var.s(i30, 0);
            }
            int i34 = s10;
            if (i34 == -1) {
                unsafe = unsafe4;
                obj2 = obj5;
                i11 = i28;
                i12 = i26;
                i13 = i29;
                i14 = 0;
            } else {
                int[] iArr = e2Var.a;
                int i35 = iArr[i34 + 1];
                int i36 = (i35 & 267386880) >>> 20;
                int i37 = i28;
                long j10 = i35 & 1048575;
                if (i36 <= 17) {
                    int i38 = iArr[i34 + 2];
                    int i39 = 1 << (i38 >>> 20);
                    int i40 = i38 & 1048575;
                    if (i40 != i25) {
                        i16 = i36;
                        i15 = i35;
                        c10 = 1;
                        if (i25 != 1048575) {
                            unsafe4.putInt(obj5, i25, i26);
                        }
                        if (i40 != 1048575) {
                            i26 = unsafe4.getInt(obj5, i40);
                        }
                        i25 = i40;
                    } else {
                        i15 = i35;
                        i16 = i36;
                        c10 = 1;
                    }
                    switch (i16) {
                        case 0:
                            i17 = i30;
                            if (i31 != 1) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i12 = i26;
                                i13 = i29;
                                i14 = i34;
                                i30 = i17;
                                i11 = i37;
                                break;
                            } else {
                                unsafe3 = unsafe4;
                                x2.c.d(obj5, j10, Double.longBitsToDouble(e1.u(i29, bArr2)));
                                i22 = i29 + 8;
                                i26 |= i39;
                                unsafe4 = unsafe3;
                                i24 = i34;
                                i23 = i17;
                                break;
                            }
                        case 1:
                            i17 = i30;
                            if (i31 != 5) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i12 = i26;
                                i13 = i29;
                                i14 = i34;
                                i30 = i17;
                                i11 = i37;
                                break;
                            } else {
                                x2.c.e(obj5, j10, Float.intBitsToFloat(e1.a(i29, bArr2)));
                                i22 = i29 + 4;
                                i26 |= i39;
                                i24 = i34;
                                i23 = i17;
                                break;
                            }
                        case 2:
                        case 3:
                            i17 = i30;
                            if (i31 != 0) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i12 = i26;
                                i13 = i29;
                                i14 = i34;
                                i30 = i17;
                                i11 = i37;
                                break;
                            } else {
                                int t10 = e1.t(bArr2, i29, mVar2);
                                unsafe4.putLong(obj5, j10, mVar2.b);
                                i26 |= i39;
                                i22 = t10;
                                i24 = i34;
                                i23 = i17;
                                break;
                            }
                        case 4:
                        case 11:
                            i17 = i30;
                            if (i31 != 0) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i12 = i26;
                                i13 = i29;
                                i14 = i34;
                                i30 = i17;
                                i11 = i37;
                                break;
                            } else {
                                int j11 = e1.j(bArr2, i29, mVar2);
                                unsafe4.putInt(obj5, j10, mVar2.a);
                                i26 |= i39;
                                i22 = j11;
                                i24 = i34;
                                i23 = i17;
                                break;
                            }
                        case 5:
                        case 14:
                            i17 = i30;
                            if (i31 != 1) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i12 = i26;
                                i13 = i29;
                                i14 = i34;
                                i30 = i17;
                                i11 = i37;
                                break;
                            } else {
                                unsafe4.putLong(obj5, j10, e1.u(i29, bArr2));
                                i22 = i29 + 8;
                                i26 |= i39;
                                i24 = i34;
                                i23 = i17;
                                break;
                            }
                        case 6:
                        case 13:
                            i17 = i30;
                            if (i31 != 5) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i12 = i26;
                                i13 = i29;
                                i14 = i34;
                                i30 = i17;
                                i11 = i37;
                                break;
                            } else {
                                unsafe4.putInt(obj5, j10, e1.a(i29, bArr2));
                                i22 = i29 + 4;
                                i26 |= i39;
                                i24 = i34;
                                i23 = i17;
                                break;
                            }
                        case 7:
                            i17 = i30;
                            if (i31 != 0) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i12 = i26;
                                i13 = i29;
                                i14 = i34;
                                i30 = i17;
                                i11 = i37;
                                break;
                            } else {
                                i22 = e1.t(bArr2, i29, mVar2);
                                x2.c.g(obj5, j10, mVar2.b != 0);
                                i26 |= i39;
                                i24 = i34;
                                i23 = i17;
                                break;
                            }
                        case 8:
                            i17 = i30;
                            if (i31 != 2) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i12 = i26;
                                i13 = i29;
                                i14 = i34;
                                i30 = i17;
                                i11 = i37;
                                break;
                            } else {
                                i22 = (i15 & TLObject.FLAG_29) == 0 ? e1.w(bArr2, i29, mVar2) : e1.x(bArr2, i29, mVar2);
                                unsafe4.putObject(obj5, j10, mVar2.c);
                                i26 |= i39;
                                i24 = i34;
                                i23 = i17;
                                break;
                            }
                        case 9:
                            i17 = i30;
                            if (i31 != 2) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i12 = i26;
                                i13 = i29;
                                i14 = i34;
                                i30 = i17;
                                i11 = i37;
                                break;
                            } else {
                                i22 = e1.g(e2Var.l(i34), bArr2, i29, i21, mVar2);
                                Object object = unsafe4.getObject(obj5, j10);
                                if (object == null) {
                                    unsafe4.putObject(obj5, j10, mVar2.c);
                                } else {
                                    unsafe4.putObject(obj5, j10, j1.b(object, mVar2.c));
                                }
                                i26 |= i39;
                                i24 = i34;
                                i23 = i17;
                                break;
                            }
                        case 10:
                            i17 = i30;
                            if (i31 != 2) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i12 = i26;
                                i13 = i29;
                                i14 = i34;
                                i30 = i17;
                                i11 = i37;
                                break;
                            } else {
                                i22 = e1.z(bArr2, i29, mVar2);
                                unsafe4.putObject(obj5, j10, mVar2.c);
                                i26 |= i39;
                                i24 = i34;
                                i23 = i17;
                                break;
                            }
                        case 12:
                            i17 = i30;
                            if (i31 != 0) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i12 = i26;
                                i13 = i29;
                                i14 = i34;
                                i30 = i17;
                                i11 = i37;
                                break;
                            } else {
                                i22 = e1.j(bArr2, i29, mVar2);
                                unsafe4.putInt(obj5, j10, mVar2.a);
                                i26 |= i39;
                                i24 = i34;
                                i23 = i17;
                                break;
                            }
                        case 15:
                            i17 = i30;
                            if (i31 != 0) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i12 = i26;
                                i13 = i29;
                                i14 = i34;
                                i30 = i17;
                                i11 = i37;
                                break;
                            } else {
                                i22 = e1.j(bArr2, i29, mVar2);
                                unsafe4.putInt(obj5, j10, e1.y(mVar2.a));
                                i26 |= i39;
                                i24 = i34;
                                i23 = i17;
                                break;
                            }
                        case 16:
                            if (i31 != 0) {
                                i17 = i30;
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i12 = i26;
                                i13 = i29;
                                i14 = i34;
                                i30 = i17;
                                i11 = i37;
                                break;
                            } else {
                                int t11 = e1.t(bArr2, i29, mVar2);
                                long j12 = mVar2.b;
                                i17 = i30;
                                unsafe4.putLong(obj5, j10, (j12 >>> c10) ^ (-(j12 & 1)));
                                i26 |= i39;
                                i22 = t11;
                                i24 = i34;
                                i23 = i17;
                                break;
                            }
                        default:
                            unsafe2 = unsafe4;
                            obj3 = obj5;
                            i17 = i30;
                            obj2 = obj3;
                            unsafe = unsafe2;
                            i12 = i26;
                            i13 = i29;
                            i14 = i34;
                            i30 = i17;
                            i11 = i37;
                            break;
                    }
                } else {
                    i17 = i30;
                    unsafe3 = unsafe4;
                    Object obj6 = obj5;
                    if (i36 != 27) {
                        if (i36 <= 49) {
                            long j13 = i35;
                            unsafe = unsafe3;
                            i12 = i26;
                            i19 = i25;
                            i30 = i17;
                            i11 = i37;
                            i20 = e2Var.i(obj, bArr, i29, i10, i11, i30, i31, i34, j13, i36, j10, mVar);
                            obj5 = obj;
                            i14 = i34;
                            if (i20 == i29) {
                                obj2 = obj5;
                                i13 = i20;
                            } else {
                                i21 = i10;
                                mVar2 = mVar;
                                i23 = i30;
                                i22 = i20;
                                i24 = i14;
                                i25 = i19;
                                i26 = i12;
                                unsafe4 = unsafe;
                                bArr2 = bArr;
                            }
                        } else {
                            unsafe = unsafe3;
                            i12 = i26;
                            i14 = i34;
                            i18 = i29;
                            i19 = i25;
                            i30 = i17;
                            i11 = i37;
                            obj4 = obj;
                            if (i36 != 50) {
                                i20 = e2Var.h(obj4, bArr, i18, i10, i11, i30, i31, i35, i36, j10, i14, mVar);
                                obj2 = obj4;
                                if (i20 == i18) {
                                    i13 = i20;
                                } else {
                                    e2Var = this;
                                    mVar2 = mVar;
                                    i23 = i30;
                                    i22 = i20;
                                    obj5 = obj2;
                                    i24 = i14;
                                    i25 = i19;
                                    i26 = i12;
                                    unsafe4 = unsafe;
                                    bArr2 = bArr;
                                    i21 = i10;
                                }
                            } else if (i31 == 2) {
                                e2Var.p(j10, obj4, i14);
                                throw null;
                            }
                        }
                        i25 = i19;
                    } else if (i31 == 2) {
                        o1 o1Var = (o1) unsafe3.getObject(obj6, j10);
                        if (!o1Var.zza()) {
                            int size = o1Var.size();
                            o1Var = o1Var.zza(size == 0 ? 10 : size << 1);
                            unsafe3.putObject(obj6, j10, o1Var);
                        }
                        int e10 = e1.e(e2Var.l(i34), i37, bArr2, i29, i21, o1Var, mVar2);
                        obj5 = obj;
                        bArr2 = bArr;
                        i21 = i10;
                        mVar2 = mVar;
                        i22 = e10;
                        unsafe4 = unsafe3;
                        i24 = i34;
                        i23 = i17;
                    } else {
                        obj4 = obj;
                        unsafe = unsafe3;
                        i12 = i26;
                        i18 = i29;
                        i14 = i34;
                        i30 = i17;
                        i11 = i37;
                        i19 = i25;
                    }
                    obj2 = obj4;
                    i13 = i18;
                    i25 = i19;
                }
            }
            int c11 = e1.c(i11, bArr, i13, i10, C(obj2), mVar);
            bArr2 = bArr;
            mVar2 = mVar;
            i23 = i30;
            obj5 = obj2;
            i24 = i14;
            i26 = i12;
            unsafe4 = unsafe;
            i21 = i10;
            i22 = c11;
            e2Var = this;
        }
        Unsafe unsafe5 = unsafe4;
        int i41 = i21;
        int i42 = i25;
        int i43 = i26;
        Object obj7 = obj5;
        if (i42 != 1048575) {
            unsafe5.putInt(obj7, i42, i43);
        }
        if (i22 != i41) {
            throw new n1("Failed to parse the message.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (com.google.android.gms.internal.vision.o2.i(com.google.android.gms.internal.vision.x2.l(r12, r7), com.google.android.gms.internal.vision.x2.l(r13, r7)) != false) goto L105;
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
    
        if (com.google.android.gms.internal.vision.o2.i(com.google.android.gms.internal.vision.x2.l(r12, r7), com.google.android.gms.internal.vision.x2.l(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0111, code lost:
    
        if (com.google.android.gms.internal.vision.o2.i(com.google.android.gms.internal.vision.x2.l(r12, r7), com.google.android.gms.internal.vision.x2.l(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0127, code lost:
    
        if (com.google.android.gms.internal.vision.o2.i(com.google.android.gms.internal.vision.x2.l(r12, r7), com.google.android.gms.internal.vision.x2.l(r13, r7)) != false) goto L105;
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
    
        if (com.google.android.gms.internal.vision.o2.i(com.google.android.gms.internal.vision.x2.l(r12, r7), com.google.android.gms.internal.vision.x2.l(r13, r7)) != false) goto L105;
     */
    @Override // com.google.android.gms.internal.vision.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(f1 f1Var, f1 f1Var2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i9 = 0;
        while (true) {
            boolean z10 = true;
            if (i9 < length) {
                int z11 = z(i9);
                long j10 = z11 & 1048575;
                switch ((z11 & 267386880) >>> 20) {
                    case 0:
                        if (y(f1Var, f1Var2, i9)) {
                            w2 w2Var = x2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 1:
                        if (y(f1Var, f1Var2, i9)) {
                            w2 w2Var2 = x2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 2:
                        if (y(f1Var, f1Var2, i9)) {
                            w2 w2Var3 = x2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 3:
                        if (y(f1Var, f1Var2, i9)) {
                            w2 w2Var4 = x2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 4:
                        if (y(f1Var, f1Var2, i9)) {
                            w2 w2Var5 = x2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 5:
                        if (y(f1Var, f1Var2, i9)) {
                            w2 w2Var6 = x2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 6:
                        if (y(f1Var, f1Var2, i9)) {
                            w2 w2Var7 = x2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 7:
                        if (y(f1Var, f1Var2, i9)) {
                            w2 w2Var8 = x2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 8:
                        if (y(f1Var, f1Var2, i9)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 9:
                        if (y(f1Var, f1Var2, i9)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 10:
                        if (y(f1Var, f1Var2, i9)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 11:
                        if (y(f1Var, f1Var2, i9)) {
                            w2 w2Var9 = x2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 12:
                        if (y(f1Var, f1Var2, i9)) {
                            w2 w2Var10 = x2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 13:
                        if (y(f1Var, f1Var2, i9)) {
                            w2 w2Var11 = x2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 14:
                        if (y(f1Var, f1Var2, i9)) {
                            w2 w2Var12 = x2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 15:
                        if (y(f1Var, f1Var2, i9)) {
                            w2 w2Var13 = x2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 16:
                        if (y(f1Var, f1Var2, i9)) {
                            w2 w2Var14 = x2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 17:
                        if (y(f1Var, f1Var2, i9)) {
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
                        z10 = o2.i(x2.l(f1Var, j10), x2.l(f1Var2, j10));
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        z10 = o2.i(x2.l(f1Var, j10), x2.l(f1Var2, j10));
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
                        w2 w2Var15 = x2.c;
                        if (w2Var15.k(f1Var, j11) == w2Var15.k(f1Var2, j11)) {
                            break;
                        }
                        z10 = false;
                        break;
                }
                if (z10) {
                    i9 += 3;
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

    public final int h(Object obj, byte[] bArr, int i9, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, com.google.android.gms.internal.clearcut.m mVar) {
        int i17;
        int i18;
        int t10;
        Object object;
        Unsafe unsafe = o;
        long j11 = this.a[i16 + 2] & 1048575;
        switch (i15) {
            case 51:
                i17 = i9;
                if (i13 != 1) {
                    return i17;
                }
                unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(e1.u(i17, bArr))));
                t10 = i17 + 8;
                unsafe.putInt(obj, j11, i12);
                return t10;
            case 52:
                i18 = i9;
                if (i13 != 5) {
                    return i18;
                }
                unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(e1.a(i18, bArr))));
                t10 = i18 + 4;
                unsafe.putInt(obj, j11, i12);
                return t10;
            case 53:
            case 54:
                if (i13 != 0) {
                    return i9;
                }
                t10 = e1.t(bArr, i9, mVar);
                unsafe.putObject(obj, j10, Long.valueOf(mVar.b));
                unsafe.putInt(obj, j11, i12);
                return t10;
            case 55:
            case 62:
                if (i13 != 0) {
                    return i9;
                }
                t10 = e1.j(bArr, i9, mVar);
                unsafe.putObject(obj, j10, Integer.valueOf(mVar.a));
                unsafe.putInt(obj, j11, i12);
                return t10;
            case 56:
            case VoIPService.CALL_MIN_LAYER /* 65 */:
                i17 = i9;
                if (i13 != 1) {
                    return i17;
                }
                unsafe.putObject(obj, j10, Long.valueOf(e1.u(i17, bArr)));
                t10 = i17 + 8;
                unsafe.putInt(obj, j11, i12);
                return t10;
            case 57:
            case 64:
                i18 = i9;
                if (i13 != 5) {
                    return i18;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(e1.a(i18, bArr)));
                t10 = i18 + 4;
                unsafe.putInt(obj, j11, i12);
                return t10;
            case 58:
                if (i13 != 0) {
                    return i9;
                }
                t10 = e1.t(bArr, i9, mVar);
                unsafe.putObject(obj, j10, Boolean.valueOf(mVar.b != 0));
                unsafe.putInt(obj, j11, i12);
                return t10;
            case 59:
                if (i13 != 2) {
                    return i9;
                }
                int j12 = e1.j(bArr, i9, mVar);
                int i19 = mVar.a;
                if (i19 == 0) {
                    unsafe.putObject(obj, j10, "");
                } else {
                    if ((i14 & TLObject.FLAG_29) != 0) {
                        if (!a3.a.s(j12, j12 + i19, bArr)) {
                            throw n1.c();
                        }
                    }
                    unsafe.putObject(obj, j10, new String(bArr, j12, i19, j1.a));
                    j12 += i19;
                }
                unsafe.putInt(obj, j11, i12);
                return j12;
            case 60:
                if (i13 != 2) {
                    return i9;
                }
                int g10 = e1.g(l(i16), bArr, i9, i10, mVar);
                object = unsafe.getInt(obj, j11) == i12 ? unsafe.getObject(obj, j10) : null;
                if (object == null) {
                    unsafe.putObject(obj, j10, mVar.c);
                } else {
                    unsafe.putObject(obj, j10, j1.b(object, mVar.c));
                }
                unsafe.putInt(obj, j11, i12);
                return g10;
            case 61:
                if (i13 != 2) {
                    return i9;
                }
                t10 = e1.z(bArr, i9, mVar);
                unsafe.putObject(obj, j10, mVar.c);
                unsafe.putInt(obj, j11, i12);
                return t10;
            case 63:
                if (i13 != 0) {
                    return i9;
                }
                int j13 = e1.j(bArr, i9, mVar);
                int i20 = mVar.a;
                k1 x10 = x(i16);
                if (x10 != null && !x10.zza(i20)) {
                    C(obj).a(i11, Long.valueOf(i20));
                    return j13;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(i20));
                t10 = j13;
                unsafe.putInt(obj, j11, i12);
                return t10;
            case 66:
                if (i13 != 0) {
                    return i9;
                }
                t10 = e1.j(bArr, i9, mVar);
                unsafe.putObject(obj, j10, Integer.valueOf(e1.y(mVar.a)));
                unsafe.putInt(obj, j11, i12);
                return t10;
            case 67:
                if (i13 != 0) {
                    return i9;
                }
                t10 = e1.t(bArr, i9, mVar);
                long j14 = mVar.b;
                unsafe.putObject(obj, j10, Long.valueOf((-(j14 & 1)) ^ (j14 >>> 1)));
                unsafe.putInt(obj, j11, i12);
                return t10;
            case 68:
                if (i13 == 3) {
                    t10 = e1.f(l(i16), bArr, i9, i10, (i11 & (-8)) | 4, mVar);
                    object = unsafe.getInt(obj, j11) == i12 ? unsafe.getObject(obj, j10) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j10, mVar.c);
                    } else {
                        unsafe.putObject(obj, j10, j1.b(object, mVar.c));
                    }
                    unsafe.putInt(obj, j11, i12);
                    return t10;
                }
            default:
                return i9;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int i(Object obj, byte[] bArr, int i9, int i10, int i11, int i12, int i13, int i14, long j10, int i15, long j11, com.google.android.gms.internal.clearcut.m mVar) {
        int b10;
        Unsafe unsafe = o;
        o1 o1Var = (o1) unsafe.getObject(obj, j11);
        if (!o1Var.zza()) {
            int size = o1Var.size();
            o1Var = o1Var.zza(size == 0 ? 10 : size << 1);
            unsafe.putObject(obj, j11, o1Var);
        }
        o1 o1Var2 = o1Var;
        switch (i15) {
            case 18:
            case 35:
                if (i13 != 2) {
                    if (i13 == 1) {
                        Double.longBitsToDouble(e1.u(i9, bArr));
                        throw null;
                    }
                    return i9;
                }
                int j12 = e1.j(bArr, i9, mVar);
                int i16 = mVar.a + j12;
                if (j12 < i16) {
                    Double.longBitsToDouble(e1.u(j12, bArr));
                    throw null;
                }
                if (j12 == i16) {
                    return j12;
                }
                throw n1.a();
            case 19:
            case 36:
                if (i13 != 2) {
                    if (i13 == 5) {
                        Float.intBitsToFloat(e1.a(i9, bArr));
                        throw null;
                    }
                    return i9;
                }
                int j13 = e1.j(bArr, i9, mVar);
                int i17 = mVar.a + j13;
                if (j13 < i17) {
                    Float.intBitsToFloat(e1.a(j13, bArr));
                    throw null;
                }
                if (j13 == i17) {
                    return j13;
                }
                throw n1.a();
            case 20:
            case 21:
            case 37:
            case 38:
                if (i13 != 2) {
                    if (i13 == 0) {
                        e1.t(bArr, i9, mVar);
                        throw null;
                    }
                    return i9;
                }
                int j14 = e1.j(bArr, i9, mVar);
                int i18 = mVar.a + j14;
                if (j14 < i18) {
                    e1.t(bArr, j14, mVar);
                    throw null;
                }
                if (j14 == i18) {
                    return j14;
                }
                throw n1.a();
            case 22:
            case 29:
            case Maneuver.TYPE_DESTINATION /* 39 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                if (i13 != 2) {
                    if (i13 == 0) {
                        return e1.b(i11, bArr, i9, i10, o1Var2, mVar);
                    }
                    return i9;
                }
                h1 h1Var = (h1) o1Var2;
                int j15 = e1.j(bArr, i9, mVar);
                int i19 = mVar.a + j15;
                while (j15 < i19) {
                    j15 = e1.j(bArr, j15, mVar);
                    h1Var.n(mVar.a);
                }
                if (j15 == i19) {
                    return j15;
                }
                throw n1.a();
            case 23:
            case 32:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                if (i13 != 2) {
                    if (i13 == 1) {
                        e1.u(i9, bArr);
                        throw null;
                    }
                    return i9;
                }
                int j16 = e1.j(bArr, i9, mVar);
                int i20 = mVar.a + j16;
                if (j16 < i20) {
                    e1.u(j16, bArr);
                    throw null;
                }
                if (j16 == i20) {
                    return j16;
                }
                throw n1.a();
            case 24:
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                if (i13 == 2) {
                    h1 h1Var2 = (h1) o1Var2;
                    int j17 = e1.j(bArr, i9, mVar);
                    int i21 = mVar.a + j17;
                    while (j17 < i21) {
                        h1Var2.n(e1.a(j17, bArr));
                        j17 += 4;
                    }
                    if (j17 == i21) {
                        return j17;
                    }
                    throw n1.a();
                }
                if (i13 == 5) {
                    h1 h1Var3 = (h1) o1Var2;
                    h1Var3.n(e1.a(i9, bArr));
                    int i22 = i9 + 4;
                    while (i22 < i10) {
                        int j18 = e1.j(bArr, i22, mVar);
                        if (i11 != mVar.a) {
                            return i22;
                        }
                        h1Var3.n(e1.a(j18, bArr));
                        i22 = j18 + 4;
                    }
                    return i22;
                }
                return i9;
            case 25:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                if (i13 != 2) {
                    if (i13 == 0) {
                        e1.t(bArr, i9, mVar);
                        throw null;
                    }
                    return i9;
                }
                int j19 = e1.j(bArr, i9, mVar);
                int i23 = mVar.a + j19;
                if (j19 < i23) {
                    e1.t(bArr, j19, mVar);
                    throw null;
                }
                if (j19 == i23) {
                    return j19;
                }
                throw n1.a();
            case 26:
                if (i13 == 2) {
                    if ((j10 & 536870912) == 0) {
                        int j20 = e1.j(bArr, i9, mVar);
                        int i24 = mVar.a;
                        if (i24 < 0) {
                            throw n1.b();
                        }
                        if (i24 == 0) {
                            o1Var2.add("");
                        } else {
                            o1Var2.add(new String(bArr, j20, i24, j1.a));
                            j20 += i24;
                        }
                        while (j20 < i10) {
                            int j21 = e1.j(bArr, j20, mVar);
                            if (i11 != mVar.a) {
                                return j20;
                            }
                            j20 = e1.j(bArr, j21, mVar);
                            int i25 = mVar.a;
                            if (i25 < 0) {
                                throw n1.b();
                            }
                            if (i25 == 0) {
                                o1Var2.add("");
                            } else {
                                o1Var2.add(new String(bArr, j20, i25, j1.a));
                                j20 += i25;
                            }
                        }
                        return j20;
                    }
                    int j22 = e1.j(bArr, i9, mVar);
                    int i26 = mVar.a;
                    if (i26 < 0) {
                        throw n1.b();
                    }
                    if (i26 == 0) {
                        o1Var2.add("");
                    } else {
                        int i27 = j22 + i26;
                        if (!a3.a.s(j22, i27, bArr)) {
                            throw n1.c();
                        }
                        o1Var2.add(new String(bArr, j22, i26, j1.a));
                        j22 = i27;
                    }
                    while (j22 < i10) {
                        int j23 = e1.j(bArr, j22, mVar);
                        if (i11 != mVar.a) {
                            return j22;
                        }
                        j22 = e1.j(bArr, j23, mVar);
                        int i28 = mVar.a;
                        if (i28 < 0) {
                            throw n1.b();
                        }
                        if (i28 == 0) {
                            o1Var2.add("");
                        } else {
                            int i29 = j22 + i28;
                            if (!a3.a.s(j22, i29, bArr)) {
                                throw n1.c();
                            }
                            o1Var2.add(new String(bArr, j22, i28, j1.a));
                            j22 = i29;
                        }
                    }
                    return j22;
                }
                return i9;
            case 27:
                if (i13 == 2) {
                    return e1.e(l(i14), i11, bArr, i9, i10, o1Var2, mVar);
                }
                return i9;
            case 28:
                if (i13 == 2) {
                    int j24 = e1.j(bArr, i9, mVar);
                    int i30 = mVar.a;
                    if (i30 < 0) {
                        throw n1.b();
                    }
                    if (i30 > bArr.length - j24) {
                        throw n1.a();
                    }
                    if (i30 == 0) {
                        o1Var2.add(q0.c);
                    } else {
                        o1Var2.add(q0.o(j24, i30, bArr));
                        j24 += i30;
                    }
                    while (j24 < i10) {
                        int j25 = e1.j(bArr, j24, mVar);
                        if (i11 != mVar.a) {
                            return j24;
                        }
                        j24 = e1.j(bArr, j25, mVar);
                        int i31 = mVar.a;
                        if (i31 < 0) {
                            throw n1.b();
                        }
                        if (i31 > bArr.length - j24) {
                            throw n1.a();
                        }
                        if (i31 == 0) {
                            o1Var2.add(q0.c);
                        } else {
                            o1Var2.add(q0.o(j24, i31, bArr));
                            j24 += i31;
                        }
                    }
                    return j24;
                }
                return i9;
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                if (i13 != 2) {
                    if (i13 == 0) {
                        b10 = e1.b(i11, bArr, i9, i10, o1Var2, mVar);
                    }
                    return i9;
                }
                h1 h1Var4 = (h1) o1Var2;
                b10 = e1.j(bArr, i9, mVar);
                int i32 = mVar.a + b10;
                while (b10 < i32) {
                    b10 = e1.j(bArr, b10, mVar);
                    h1Var4.n(mVar.a);
                }
                if (b10 != i32) {
                    throw n1.a();
                }
                f1 f1Var = (f1) obj;
                q2 q2Var = f1Var.zzb;
                q2 q2Var2 = q2Var != q2.f ? q2Var : null;
                k1 x10 = x(i14);
                Class cls = o2.a;
                if (x10 != null) {
                    boolean z10 = o1Var2 instanceof RandomAccess;
                    p2 p2Var = this.l;
                    if (z10) {
                        int size2 = o1Var2.size();
                        int i33 = 0;
                        for (int i34 = 0; i34 < size2; i34++) {
                            Integer num = (Integer) o1Var2.get(i34);
                            int intValue = num.intValue();
                            if (x10.zza(intValue)) {
                                if (i34 != i33) {
                                    o1Var2.set(i33, num);
                                }
                                i33++;
                            } else {
                                if (q2Var2 == null) {
                                    p2Var.getClass();
                                    q2Var2 = q2.b();
                                }
                                p2Var.getClass();
                                q2Var2.a(i12 << 3, Long.valueOf(intValue));
                            }
                        }
                        if (i33 != size2) {
                            o1Var2.subList(i33, size2).clear();
                        }
                    } else {
                        Iterator it = o1Var2.iterator();
                        while (it.hasNext()) {
                            int intValue2 = ((Integer) it.next()).intValue();
                            if (!x10.zza(intValue2)) {
                                if (q2Var2 == null) {
                                    p2Var.getClass();
                                    q2Var2 = q2.b();
                                }
                                p2Var.getClass();
                                q2Var2.a(i12 << 3, Long.valueOf(intValue2));
                                it.remove();
                            }
                        }
                    }
                }
                if (q2Var2 != null) {
                    f1Var.zzb = q2Var2;
                }
                return b10;
            case 33:
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                if (i13 == 2) {
                    h1 h1Var5 = (h1) o1Var2;
                    int j26 = e1.j(bArr, i9, mVar);
                    int i35 = mVar.a + j26;
                    while (j26 < i35) {
                        j26 = e1.j(bArr, j26, mVar);
                        h1Var5.n(e1.y(mVar.a));
                    }
                    if (j26 == i35) {
                        return j26;
                    }
                    throw n1.a();
                }
                if (i13 == 0) {
                    h1 h1Var6 = (h1) o1Var2;
                    int j27 = e1.j(bArr, i9, mVar);
                    h1Var6.n(e1.y(mVar.a));
                    while (j27 < i10) {
                        int j28 = e1.j(bArr, j27, mVar);
                        if (i11 != mVar.a) {
                            return j27;
                        }
                        j27 = e1.j(bArr, j28, mVar);
                        h1Var6.n(e1.y(mVar.a));
                    }
                    return j27;
                }
                return i9;
            case 34:
            case 48:
                if (i13 != 2) {
                    if (i13 == 0) {
                        e1.t(bArr, i9, mVar);
                        throw null;
                    }
                    return i9;
                }
                int j29 = e1.j(bArr, i9, mVar);
                int i36 = mVar.a + j29;
                if (j29 < i36) {
                    e1.t(bArr, j29, mVar);
                    throw null;
                }
                if (j29 == i36) {
                    return j29;
                }
                throw n1.a();
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                if (i13 == 3) {
                    n2 l10 = l(i14);
                    int i37 = (i11 & (-8)) | 4;
                    int f10 = e1.f(l10, bArr, i9, i10, i37, mVar);
                    n2 n2Var = l10;
                    int i38 = i10;
                    com.google.android.gms.internal.clearcut.m mVar2 = mVar;
                    o1Var2.add(mVar2.c);
                    while (f10 < i38) {
                        int j30 = e1.j(bArr, f10, mVar2);
                        if (i11 != mVar2.a) {
                            return f10;
                        }
                        n2 n2Var2 = n2Var;
                        int i39 = i38;
                        com.google.android.gms.internal.clearcut.m mVar3 = mVar2;
                        f10 = e1.f(n2Var2, bArr, j30, i39, i37, mVar3);
                        o1Var2.add(mVar3.c);
                        n2Var = n2Var2;
                        i38 = i39;
                        mVar2 = mVar3;
                    }
                    return f10;
                }
                return i9;
            default:
                return i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x03f7, code lost:
    
        if (r7 == r3) goto L140;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(Object obj, byte[] bArr, int i9, int i10, int i11, com.google.android.gms.internal.clearcut.m mVar) {
        int i12;
        Unsafe unsafe;
        int[] iArr;
        e2 e2Var;
        Object obj2;
        int i13;
        int i14;
        Object obj3;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int h;
        int i20;
        int i21;
        int i22;
        int i23;
        Unsafe unsafe2;
        int i24;
        Unsafe unsafe3;
        Object obj4;
        int i25;
        int i26;
        Unsafe unsafe4;
        int i27;
        int i28;
        Object obj5;
        e2 e2Var2 = this;
        Object obj6 = obj;
        byte[] bArr2 = bArr;
        int i29 = i10;
        com.google.android.gms.internal.clearcut.m mVar2 = mVar;
        Unsafe unsafe5 = o;
        int i30 = i9;
        int i31 = -1;
        int i32 = 0;
        int i33 = 0;
        int i34 = 1048575;
        int i35 = 0;
        while (true) {
            int[] iArr2 = e2Var2.a;
            if (i30 < i29) {
                int i36 = i30 + 1;
                int i37 = bArr2[i30];
                if (i37 < 0) {
                    i36 = e1.d(i37, bArr2, i36, mVar2);
                    i37 = mVar2.a;
                }
                int i38 = i37 >>> 3;
                int i39 = i36;
                int i40 = i37 & 7;
                int i41 = e2Var2.d;
                int i42 = e2Var2.c;
                int i43 = i37;
                int s10 = i38 > i31 ? (i38 < i42 || i38 > i41) ? -1 : e2Var2.s(i38, i32 / 3) : (i38 < i42 || i38 > i41) ? -1 : e2Var2.s(i38, 0);
                if (s10 == -1) {
                    i13 = i43;
                    i12 = i34;
                    unsafe = unsafe5;
                    iArr = iArr2;
                    i19 = i38;
                    i14 = 0;
                    e2Var = e2Var2;
                    obj2 = obj6;
                    i20 = i39;
                } else {
                    int i44 = iArr2[s10 + 1];
                    int i45 = (i44 & 267386880) >>> 20;
                    long j10 = i44 & 1048575;
                    if (i45 <= 17) {
                        int i46 = iArr2[s10 + 2];
                        int i47 = 1 << (i46 >>> 20);
                        int i48 = i46 & 1048575;
                        iArr = iArr2;
                        if (i48 != i34) {
                            i22 = i47;
                            if (i34 != 1048575) {
                                unsafe5.putInt(obj6, i34, i35);
                            }
                            i35 = unsafe5.getInt(obj6, i48);
                            i21 = i48;
                        } else {
                            i22 = i47;
                            i21 = i34;
                        }
                        switch (i45) {
                            case 0:
                                i13 = i43;
                                i23 = i38;
                                i14 = s10;
                                unsafe2 = unsafe5;
                                i24 = i39;
                                if (i40 == 1) {
                                    unsafe3 = unsafe2;
                                    x2.c.d(obj6, j10, Double.longBitsToDouble(e1.u(i24, bArr)));
                                    obj4 = obj6;
                                    i25 = i24 + 8;
                                    i19 = i23;
                                    i29 = i10;
                                    e2Var = e2Var2;
                                    obj2 = obj4;
                                    i35 |= i22;
                                    unsafe = unsafe3;
                                    i30 = i25;
                                    bArr2 = bArr;
                                    mVar2 = mVar;
                                    i31 = i19;
                                    e2Var2 = e2Var;
                                    obj6 = obj2;
                                    i34 = i21;
                                    i33 = i13;
                                    i32 = i14;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i19 = i23;
                                e2Var = e2Var2;
                                unsafe = unsafe4;
                                i20 = i24;
                                i12 = i21;
                                obj2 = obj5;
                                break;
                            case 1:
                                i13 = i43;
                                i23 = i38;
                                i14 = s10;
                                unsafe2 = unsafe5;
                                i24 = i39;
                                if (i40 == 5) {
                                    x2.c.e(obj6, j10, Float.intBitsToFloat(e1.a(i24, bArr)));
                                    i26 = i24 + 4;
                                    int i49 = i26;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i25 = i49;
                                    i19 = i23;
                                    i29 = i10;
                                    e2Var = e2Var2;
                                    obj2 = obj4;
                                    i35 |= i22;
                                    unsafe = unsafe3;
                                    i30 = i25;
                                    bArr2 = bArr;
                                    mVar2 = mVar;
                                    i31 = i19;
                                    e2Var2 = e2Var;
                                    obj6 = obj2;
                                    i34 = i21;
                                    i33 = i13;
                                    i32 = i14;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i19 = i23;
                                e2Var = e2Var2;
                                unsafe = unsafe4;
                                i20 = i24;
                                i12 = i21;
                                obj2 = obj5;
                                break;
                            case 2:
                            case 3:
                                i13 = i43;
                                i23 = i38;
                                i14 = s10;
                                unsafe2 = unsafe5;
                                i24 = i39;
                                if (i40 == 0) {
                                    i26 = e1.t(bArr, i24, mVar2);
                                    unsafe2.putLong(obj6, j10, mVar2.b);
                                    int i492 = i26;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i25 = i492;
                                    i19 = i23;
                                    i29 = i10;
                                    e2Var = e2Var2;
                                    obj2 = obj4;
                                    i35 |= i22;
                                    unsafe = unsafe3;
                                    i30 = i25;
                                    bArr2 = bArr;
                                    mVar2 = mVar;
                                    i31 = i19;
                                    e2Var2 = e2Var;
                                    obj6 = obj2;
                                    i34 = i21;
                                    i33 = i13;
                                    i32 = i14;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i19 = i23;
                                e2Var = e2Var2;
                                unsafe = unsafe4;
                                i20 = i24;
                                i12 = i21;
                                obj2 = obj5;
                                break;
                            case 4:
                            case 11:
                                i13 = i43;
                                i23 = i38;
                                i14 = s10;
                                unsafe2 = unsafe5;
                                i24 = i39;
                                if (i40 == 0) {
                                    i26 = e1.j(bArr, i24, mVar2);
                                    unsafe2.putInt(obj6, j10, mVar2.a);
                                    int i4922 = i26;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i25 = i4922;
                                    i19 = i23;
                                    i29 = i10;
                                    e2Var = e2Var2;
                                    obj2 = obj4;
                                    i35 |= i22;
                                    unsafe = unsafe3;
                                    i30 = i25;
                                    bArr2 = bArr;
                                    mVar2 = mVar;
                                    i31 = i19;
                                    e2Var2 = e2Var;
                                    obj6 = obj2;
                                    i34 = i21;
                                    i33 = i13;
                                    i32 = i14;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i19 = i23;
                                e2Var = e2Var2;
                                unsafe = unsafe4;
                                i20 = i24;
                                i12 = i21;
                                obj2 = obj5;
                                break;
                            case 5:
                            case 14:
                                i13 = i43;
                                i23 = i38;
                                i14 = s10;
                                unsafe2 = unsafe5;
                                if (i40 != 1) {
                                    i24 = i39;
                                    unsafe4 = unsafe2;
                                    obj5 = obj6;
                                    i19 = i23;
                                    e2Var = e2Var2;
                                    unsafe = unsafe4;
                                    i20 = i24;
                                    i12 = i21;
                                    obj2 = obj5;
                                    break;
                                } else {
                                    unsafe2.putLong(obj6, j10, e1.u(i39, bArr));
                                    i26 = i39 + 8;
                                    int i49222 = i26;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i25 = i49222;
                                    i19 = i23;
                                    i29 = i10;
                                    e2Var = e2Var2;
                                    obj2 = obj4;
                                    i35 |= i22;
                                    unsafe = unsafe3;
                                    i30 = i25;
                                    bArr2 = bArr;
                                    mVar2 = mVar;
                                    i31 = i19;
                                    e2Var2 = e2Var;
                                    obj6 = obj2;
                                    i34 = i21;
                                    i33 = i13;
                                    i32 = i14;
                                    unsafe5 = unsafe;
                                }
                            case 6:
                            case 13:
                                i13 = i43;
                                i23 = i38;
                                i27 = i39;
                                i14 = s10;
                                unsafe2 = unsafe5;
                                if (i40 == 5) {
                                    unsafe2.putInt(obj6, j10, e1.a(i27, bArr));
                                    i26 = i27 + 4;
                                    int i492222 = i26;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i25 = i492222;
                                    i19 = i23;
                                    i29 = i10;
                                    e2Var = e2Var2;
                                    obj2 = obj4;
                                    i35 |= i22;
                                    unsafe = unsafe3;
                                    i30 = i25;
                                    bArr2 = bArr;
                                    mVar2 = mVar;
                                    i31 = i19;
                                    e2Var2 = e2Var;
                                    obj6 = obj2;
                                    i34 = i21;
                                    i33 = i13;
                                    i32 = i14;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i24 = i27;
                                i19 = i23;
                                e2Var = e2Var2;
                                unsafe = unsafe4;
                                i20 = i24;
                                i12 = i21;
                                obj2 = obj5;
                                break;
                            case 7:
                                i13 = i43;
                                i23 = i38;
                                i27 = i39;
                                i14 = s10;
                                unsafe2 = unsafe5;
                                if (i40 == 0) {
                                    i26 = e1.t(bArr, i27, mVar2);
                                    x2.c.g(obj6, j10, mVar2.b != 0);
                                    int i4922222 = i26;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i25 = i4922222;
                                    i19 = i23;
                                    i29 = i10;
                                    e2Var = e2Var2;
                                    obj2 = obj4;
                                    i35 |= i22;
                                    unsafe = unsafe3;
                                    i30 = i25;
                                    bArr2 = bArr;
                                    mVar2 = mVar;
                                    i31 = i19;
                                    e2Var2 = e2Var;
                                    obj6 = obj2;
                                    i34 = i21;
                                    i33 = i13;
                                    i32 = i14;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i24 = i27;
                                i19 = i23;
                                e2Var = e2Var2;
                                unsafe = unsafe4;
                                i20 = i24;
                                i12 = i21;
                                obj2 = obj5;
                                break;
                            case 8:
                                i13 = i43;
                                i23 = i38;
                                i27 = i39;
                                i14 = s10;
                                unsafe2 = unsafe5;
                                if (i40 == 2) {
                                    i26 = (i44 & TLObject.FLAG_29) == 0 ? e1.w(bArr, i27, mVar2) : e1.x(bArr, i27, mVar2);
                                    unsafe2.putObject(obj6, j10, mVar2.c);
                                    int i49222222 = i26;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i25 = i49222222;
                                    i19 = i23;
                                    i29 = i10;
                                    e2Var = e2Var2;
                                    obj2 = obj4;
                                    i35 |= i22;
                                    unsafe = unsafe3;
                                    i30 = i25;
                                    bArr2 = bArr;
                                    mVar2 = mVar;
                                    i31 = i19;
                                    e2Var2 = e2Var;
                                    obj6 = obj2;
                                    i34 = i21;
                                    i33 = i13;
                                    i32 = i14;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i24 = i27;
                                i19 = i23;
                                e2Var = e2Var2;
                                unsafe = unsafe4;
                                i20 = i24;
                                i12 = i21;
                                obj2 = obj5;
                                break;
                            case 9:
                                i13 = i43;
                                i23 = i38;
                                i27 = i39;
                                i14 = s10;
                                unsafe2 = unsafe5;
                                if (i40 == 2) {
                                    int g10 = e1.g(e2Var2.l(i14), bArr, i27, i10, mVar2);
                                    if ((i35 & i22) == 0) {
                                        unsafe2.putObject(obj6, j10, mVar2.c);
                                    } else {
                                        unsafe2.putObject(obj6, j10, j1.b(unsafe2.getObject(obj6, j10), mVar2.c));
                                    }
                                    i28 = g10;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i25 = i28;
                                    i19 = i23;
                                    i29 = i10;
                                    e2Var = e2Var2;
                                    obj2 = obj4;
                                    i35 |= i22;
                                    unsafe = unsafe3;
                                    i30 = i25;
                                    bArr2 = bArr;
                                    mVar2 = mVar;
                                    i31 = i19;
                                    e2Var2 = e2Var;
                                    obj6 = obj2;
                                    i34 = i21;
                                    i33 = i13;
                                    i32 = i14;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i24 = i27;
                                i19 = i23;
                                e2Var = e2Var2;
                                unsafe = unsafe4;
                                i20 = i24;
                                i12 = i21;
                                obj2 = obj5;
                                break;
                            case 10:
                                i13 = i43;
                                i23 = i38;
                                i27 = i39;
                                i14 = s10;
                                unsafe2 = unsafe5;
                                if (i40 == 2) {
                                    i26 = e1.z(bArr, i27, mVar2);
                                    unsafe2.putObject(obj6, j10, mVar2.c);
                                    int i492222222 = i26;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i25 = i492222222;
                                    i19 = i23;
                                    i29 = i10;
                                    e2Var = e2Var2;
                                    obj2 = obj4;
                                    i35 |= i22;
                                    unsafe = unsafe3;
                                    i30 = i25;
                                    bArr2 = bArr;
                                    mVar2 = mVar;
                                    i31 = i19;
                                    e2Var2 = e2Var;
                                    obj6 = obj2;
                                    i34 = i21;
                                    i33 = i13;
                                    i32 = i14;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i24 = i27;
                                i19 = i23;
                                e2Var = e2Var2;
                                unsafe = unsafe4;
                                i20 = i24;
                                i12 = i21;
                                obj2 = obj5;
                                break;
                            case 12:
                                i13 = i43;
                                i23 = i38;
                                i27 = i39;
                                i14 = s10;
                                unsafe2 = unsafe5;
                                if (i40 == 0) {
                                    i26 = e1.j(bArr, i27, mVar2);
                                    int i50 = mVar2.a;
                                    k1 x10 = e2Var2.x(i14);
                                    if (x10 == null || x10.zza(i50)) {
                                        unsafe2.putInt(obj6, j10, i50);
                                        int i4922222222 = i26;
                                        unsafe3 = unsafe2;
                                        obj4 = obj6;
                                        i25 = i4922222222;
                                        i19 = i23;
                                        i29 = i10;
                                        e2Var = e2Var2;
                                        obj2 = obj4;
                                        i35 |= i22;
                                        unsafe = unsafe3;
                                        i30 = i25;
                                        bArr2 = bArr;
                                        mVar2 = mVar;
                                        i31 = i19;
                                        e2Var2 = e2Var;
                                        obj6 = obj2;
                                        i34 = i21;
                                        i33 = i13;
                                        i32 = i14;
                                        unsafe5 = unsafe;
                                    } else {
                                        C(obj6).a(i13, Long.valueOf(i50));
                                        i19 = i23;
                                        e2Var = e2Var2;
                                        unsafe = unsafe2;
                                        i30 = i26;
                                        i29 = i10;
                                        obj2 = obj6;
                                        bArr2 = bArr;
                                        mVar2 = mVar;
                                        i31 = i19;
                                        e2Var2 = e2Var;
                                        obj6 = obj2;
                                        i34 = i21;
                                        i33 = i13;
                                        i32 = i14;
                                        unsafe5 = unsafe;
                                    }
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i24 = i27;
                                i19 = i23;
                                e2Var = e2Var2;
                                unsafe = unsafe4;
                                i20 = i24;
                                i12 = i21;
                                obj2 = obj5;
                                break;
                            case 15:
                                i13 = i43;
                                i23 = i38;
                                i27 = i39;
                                i14 = s10;
                                unsafe2 = unsafe5;
                                if (i40 == 0) {
                                    i26 = e1.j(bArr, i27, mVar2);
                                    unsafe2.putInt(obj6, j10, e1.y(mVar2.a));
                                    int i49222222222 = i26;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i25 = i49222222222;
                                    i19 = i23;
                                    i29 = i10;
                                    e2Var = e2Var2;
                                    obj2 = obj4;
                                    i35 |= i22;
                                    unsafe = unsafe3;
                                    i30 = i25;
                                    bArr2 = bArr;
                                    mVar2 = mVar;
                                    i31 = i19;
                                    e2Var2 = e2Var;
                                    obj6 = obj2;
                                    i34 = i21;
                                    i33 = i13;
                                    i32 = i14;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i24 = i27;
                                i19 = i23;
                                e2Var = e2Var2;
                                unsafe = unsafe4;
                                i20 = i24;
                                i12 = i21;
                                obj2 = obj5;
                                break;
                            case 16:
                                i13 = i43;
                                i23 = i38;
                                com.google.android.gms.internal.clearcut.m mVar3 = mVar2;
                                i27 = i39;
                                if (i40 != 0) {
                                    i14 = s10;
                                    unsafe2 = unsafe5;
                                    unsafe4 = unsafe2;
                                    obj5 = obj6;
                                    i24 = i27;
                                    i19 = i23;
                                    e2Var = e2Var2;
                                    unsafe = unsafe4;
                                    i20 = i24;
                                    i12 = i21;
                                    obj2 = obj5;
                                    break;
                                } else {
                                    i26 = e1.t(bArr, i27, mVar3);
                                    long j11 = mVar3.b;
                                    i14 = s10;
                                    unsafe2 = unsafe5;
                                    unsafe2.putLong(obj6, j10, (j11 >>> 1) ^ (-(j11 & 1)));
                                    int i492222222222 = i26;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i25 = i492222222222;
                                    i19 = i23;
                                    i29 = i10;
                                    e2Var = e2Var2;
                                    obj2 = obj4;
                                    i35 |= i22;
                                    unsafe = unsafe3;
                                    i30 = i25;
                                    bArr2 = bArr;
                                    mVar2 = mVar;
                                    i31 = i19;
                                    e2Var2 = e2Var;
                                    obj6 = obj2;
                                    i34 = i21;
                                    i33 = i13;
                                    i32 = i14;
                                    unsafe5 = unsafe;
                                }
                            case 17:
                                if (i40 != 3) {
                                    i13 = i43;
                                    i23 = i38;
                                    i14 = s10;
                                    obj5 = obj6;
                                    unsafe4 = unsafe5;
                                    i24 = i39;
                                    i19 = i23;
                                    e2Var = e2Var2;
                                    unsafe = unsafe4;
                                    i20 = i24;
                                    i12 = i21;
                                    obj2 = obj5;
                                    break;
                                } else {
                                    i13 = i43;
                                    i23 = i38;
                                    com.google.android.gms.internal.clearcut.m mVar4 = mVar2;
                                    i28 = e1.f(e2Var2.l(s10), bArr, i39, i10, (i38 << 3) | 4, mVar4);
                                    if ((i35 & i22) == 0) {
                                        unsafe5.putObject(obj6, j10, mVar4.c);
                                    } else {
                                        unsafe5.putObject(obj6, j10, j1.b(unsafe5.getObject(obj6, j10), mVar4.c));
                                    }
                                    i14 = s10;
                                    unsafe2 = unsafe5;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i25 = i28;
                                    i19 = i23;
                                    i29 = i10;
                                    e2Var = e2Var2;
                                    obj2 = obj4;
                                    i35 |= i22;
                                    unsafe = unsafe3;
                                    i30 = i25;
                                    bArr2 = bArr;
                                    mVar2 = mVar;
                                    i31 = i19;
                                    e2Var2 = e2Var;
                                    obj6 = obj2;
                                    i34 = i21;
                                    i33 = i13;
                                    i32 = i14;
                                    unsafe5 = unsafe;
                                }
                            default:
                                i13 = i43;
                                unsafe4 = unsafe5;
                                i23 = i38;
                                i24 = i39;
                                i14 = s10;
                                obj5 = obj6;
                                i19 = i23;
                                e2Var = e2Var2;
                                unsafe = unsafe4;
                                i20 = i24;
                                i12 = i21;
                                obj2 = obj5;
                                break;
                        }
                    } else {
                        i13 = i43;
                        iArr = iArr2;
                        i14 = s10;
                        Object obj7 = obj6;
                        Unsafe unsafe6 = unsafe5;
                        if (i45 == 27) {
                            if (i40 == 2) {
                                o1 o1Var = (o1) unsafe6.getObject(obj7, j10);
                                if (!o1Var.zza()) {
                                    int size = o1Var.size();
                                    o1Var = o1Var.zza(size == 0 ? 10 : size << 1);
                                    unsafe6.putObject(obj7, j10, o1Var);
                                }
                                obj2 = obj;
                                i19 = i38;
                                i29 = i10;
                                i30 = e1.e(e2Var2.l(i14), i13, bArr, i39, i10, o1Var, mVar2);
                                unsafe = unsafe6;
                                i21 = i34;
                                e2Var = e2Var2;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i31 = i19;
                                e2Var2 = e2Var;
                                obj6 = obj2;
                                i34 = i21;
                                i33 = i13;
                                i32 = i14;
                                unsafe5 = unsafe;
                            } else {
                                obj3 = obj;
                                i15 = i38;
                                i12 = i34;
                                i18 = i39;
                                unsafe = unsafe6;
                                i17 = i13;
                                i16 = i35;
                            }
                        } else if (i45 <= 49) {
                            long j12 = i44;
                            i19 = i38;
                            unsafe = unsafe6;
                            i12 = i34;
                            i16 = i35;
                            h = e2Var2.i(obj, bArr, i39, i10, i13, i19, i40, i14, j12, i45, j10, mVar);
                            i13 = i13;
                            i14 = i14;
                            e2Var = e2Var2;
                            if (h == i39) {
                                obj2 = obj;
                                i20 = h;
                                i35 = i16;
                            } else {
                                obj2 = obj;
                                i29 = i10;
                                i30 = h;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i31 = i19;
                                e2Var2 = e2Var;
                                obj6 = obj2;
                                i33 = i13;
                                i32 = i14;
                                i34 = i12;
                                i35 = i16;
                                unsafe5 = unsafe;
                            }
                        } else {
                            obj3 = obj;
                            i15 = i38;
                            i12 = i34;
                            unsafe = unsafe6;
                            i16 = i35;
                            i17 = i13;
                            i18 = i39;
                            if (i45 != 50) {
                                i19 = i15;
                                h = e2Var2.h(obj3, bArr, i18, i10, i17, i19, i40, i44, i45, j10, i14, mVar);
                                e2Var = e2Var2;
                                obj2 = obj3;
                                i13 = i17;
                            } else if (i40 == 2) {
                                e2Var2.p(j10, obj3, i14);
                                throw null;
                            }
                        }
                        e2Var = e2Var2;
                        i19 = i15;
                        obj2 = obj3;
                        i20 = i18;
                        i13 = i17;
                        i35 = i16;
                    }
                }
                if (i13 != i11 || i11 == 0) {
                    i29 = i10;
                    i30 = e1.c(i13, bArr, i20, i10, C(obj2), mVar);
                    i21 = i12;
                    bArr2 = bArr;
                    mVar2 = mVar;
                    i31 = i19;
                    e2Var2 = e2Var;
                    obj6 = obj2;
                    i34 = i21;
                    i33 = i13;
                    i32 = i14;
                    unsafe5 = unsafe;
                } else {
                    i29 = i10;
                    i30 = i20;
                    i33 = i13;
                }
            } else {
                i12 = i34;
                unsafe = unsafe5;
                iArr = iArr2;
                e2Var = e2Var2;
                obj2 = obj6;
            }
        }
        int i51 = i12;
        if (i51 != 1048575) {
            unsafe.putInt(obj2, i51, i35);
        }
        for (int i52 = e2Var.h; i52 < e2Var.i; i52++) {
            int i53 = e2Var.g[i52];
            int i54 = iArr[i53];
            Object l10 = x2.l(obj2, e2Var.z(i53) & 1048575);
            if (l10 != null && e2Var.x(i53) != null) {
                e2Var.m.getClass();
                if (e2Var.t(i53) == null) {
                    throw new NoSuchMethodError();
                }
                throw new ClassCastException();
            }
        }
        if (i11 == 0) {
            if (i30 != i29) {
                throw new n1("Failed to parse the message.");
            }
        } else if (i30 > i29 || i33 != i11) {
            throw new n1("Failed to parse the message.");
        }
        return i30;
    }

    public final n2 l(int i9) {
        int i10 = (i9 / 3) << 1;
        Object[] objArr = this.b;
        n2 n2Var = (n2) objArr[i10];
        if (n2Var != null) {
            return n2Var;
        }
        n2 a2 = k2.c.a((Class) objArr[i10 + 1]);
        objArr[i10] = a2;
        return a2;
    }

    public final void o(int i9, Object obj, Object obj2) {
        long z10 = z(i9) & 1048575;
        if (r(i9, obj2)) {
            Object l10 = x2.l(obj, z10);
            Object l11 = x2.l(obj2, z10);
            if (l10 != null && l11 != null) {
                x2.d(obj, z10, j1.b(l10, l11));
                u(i9, obj);
            } else if (l11 != null) {
                x2.d(obj, z10, l11);
                u(i9, obj);
            }
        }
    }

    public final void p(long j10, Object obj, int i9) {
        a2 a2Var;
        Unsafe unsafe = o;
        Object t10 = t(i9);
        Object object = unsafe.getObject(obj, j10);
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
            unsafe.putObject(obj, j10, a2Var);
        }
        if (t10 != null) {
            throw new ClassCastException();
        }
        throw new NoSuchMethodError();
    }

    public final boolean q(int i9, int i10, Object obj) {
        return x2.c.k(obj, (long) (this.a[i10 + 2] & 1048575)) == i9;
    }

    public final boolean r(int i9, Object obj) {
        int i10 = this.a[i9 + 2];
        long j10 = i10 & 1048575;
        if (j10 == 1048575) {
            int z10 = z(i9);
            long j11 = z10 & 1048575;
            switch ((z10 & 267386880) >>> 20) {
                case 0:
                    if (x2.c.j(obj, j11) == 0.0d) {
                        return false;
                    }
                    break;
                case 1:
                    if (x2.c.i(obj, j11) == 0.0f) {
                        return false;
                    }
                    break;
                case 2:
                    if (x2.c.l(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (x2.c.l(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (x2.c.k(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (x2.c.l(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (x2.c.k(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return x2.c.h(obj, j11);
                case 8:
                    Object l10 = x2.l(obj, j11);
                    if (l10 instanceof String) {
                        if (((String) l10).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(l10 instanceof q0)) {
                            throw new IllegalArgumentException();
                        }
                        if (q0.c.equals(l10)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (x2.l(obj, j11) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (q0.c.equals(x2.l(obj, j11))) {
                        return false;
                    }
                    break;
                case 11:
                    if (x2.c.k(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (x2.c.k(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (x2.c.k(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (x2.c.l(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (x2.c.k(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (x2.c.l(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (x2.l(obj, j11) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & x2.c.k(obj, j10)) == 0) {
            return false;
        }
        return true;
    }

    public final int s(int i9, int i10) {
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

    public final Object t(int i9) {
        return this.b[(i9 / 3) << 1];
    }

    public final void u(int i9, Object obj) {
        int i10 = this.a[i9 + 2];
        long j10 = 1048575 & i10;
        if (j10 == 1048575) {
            return;
        }
        x2.c(j10, obj, (1 << (i10 >>> 20)) | x2.c.k(obj, j10));
    }

    public final void v(int i9, Object obj, Object obj2) {
        int z10 = z(i9);
        int i10 = this.a[i9];
        long j10 = z10 & 1048575;
        if (q(i10, i9, obj2)) {
            Object l10 = q(i10, i9, obj) ? x2.l(obj, j10) : null;
            Object l11 = x2.l(obj2, j10);
            if (l10 != null && l11 != null) {
                x2.d(obj, j10, j1.b(l10, l11));
                x2.c(r1[i9 + 2] & 1048575, obj, i10);
            } else if (l11 != null) {
                x2.d(obj, j10, l11);
                x2.c(r1[i9 + 2] & 1048575, obj, i10);
            }
        }
    }

    public final void w(Object obj, y1 y1Var) {
        int i9;
        int i10;
        int i11;
        int[] iArr = this.a;
        int length = iArr.length;
        Unsafe unsafe = o;
        int i12 = 1048575;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14 = i11 + 3) {
            int z10 = z(i14);
            int i15 = iArr[i14];
            int i16 = (267386880 & z10) >>> 20;
            if (i16 <= 17) {
                int i17 = iArr[i14 + 2];
                i9 = 1048575;
                int i18 = i17 & 1048575;
                if (i18 != i12) {
                    i13 = unsafe.getInt(obj, i18);
                    i12 = i18;
                }
                i10 = 1 << (i17 >>> 20);
            } else {
                i9 = 1048575;
                i10 = 0;
            }
            int i19 = i14;
            long j10 = z10 & i9;
            switch (i16) {
                case 0:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        double j11 = x2.c.j(obj, j10);
                        r0 r0Var = (r0) y1Var.a;
                        r0Var.getClass();
                        long doubleToRawLongBits = Double.doubleToRawLongBits(j11);
                        r0Var.D(i15, 1);
                        r0Var.K(doubleToRawLongBits);
                        continue;
                    }
                case 1:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        float i20 = x2.c.i(obj, j10);
                        r0 r0Var2 = (r0) y1Var.a;
                        r0Var2.getClass();
                        int floatToRawIntBits = Float.floatToRawIntBits(i20);
                        r0Var2.D(i15, 5);
                        r0Var2.M(floatToRawIntBits);
                    } else {
                        continue;
                    }
                case 2:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        long j12 = unsafe.getLong(obj, j10);
                        r0 r0Var3 = (r0) y1Var.a;
                        r0Var3.D(i15, 0);
                        r0Var3.E(j12);
                    } else {
                        continue;
                    }
                case 3:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        long j13 = unsafe.getLong(obj, j10);
                        r0 r0Var4 = (r0) y1Var.a;
                        r0Var4.D(i15, 0);
                        r0Var4.E(j13);
                    } else {
                        continue;
                    }
                case 4:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        int i21 = unsafe.getInt(obj, j10);
                        r0 r0Var5 = (r0) y1Var.a;
                        r0Var5.D(i15, 0);
                        r0Var5.C(i21);
                    }
                    break;
                case 5:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        long j14 = unsafe.getLong(obj, j10);
                        r0 r0Var6 = (r0) y1Var.a;
                        r0Var6.D(i15, 1);
                        r0Var6.K(j14);
                        break;
                    }
                    break;
                case 6:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        int i22 = unsafe.getInt(obj, j10);
                        r0 r0Var7 = (r0) y1Var.a;
                        r0Var7.D(i15, 5);
                        r0Var7.M(i22);
                        break;
                    }
                    break;
                case 7:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        boolean h = x2.c.h(obj, j10);
                        r0 r0Var8 = (r0) y1Var.a;
                        r0Var8.D(i15, 0);
                        r0Var8.B(h ? (byte) 1 : (byte) 0);
                        break;
                    }
                    break;
                case 8:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        n(i15, unsafe.getObject(obj, j10), y1Var);
                        break;
                    }
                    break;
                case 9:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        y1Var.b(i15, unsafe.getObject(obj, j10), l(i11));
                        break;
                    }
                    break;
                case 10:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        y1Var.a(i15, (q0) unsafe.getObject(obj, j10));
                        break;
                    }
                    break;
                case 11:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        int i23 = unsafe.getInt(obj, j10);
                        r0 r0Var9 = (r0) y1Var.a;
                        r0Var9.D(i15, 0);
                        r0Var9.H(i23);
                        break;
                    }
                    break;
                case 12:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        int i24 = unsafe.getInt(obj, j10);
                        r0 r0Var10 = (r0) y1Var.a;
                        r0Var10.D(i15, 0);
                        r0Var10.C(i24);
                    }
                    break;
                case 13:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        int i25 = unsafe.getInt(obj, j10);
                        r0 r0Var11 = (r0) y1Var.a;
                        r0Var11.D(i15, 5);
                        r0Var11.M(i25);
                        break;
                    }
                    break;
                case 14:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        long j15 = unsafe.getLong(obj, j10);
                        r0 r0Var12 = (r0) y1Var.a;
                        r0Var12.D(i15, 1);
                        r0Var12.K(j15);
                        break;
                    }
                    break;
                case 15:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        int i26 = unsafe.getInt(obj, j10);
                        r0 r0Var13 = (r0) y1Var.a;
                        r0Var13.D(i15, 0);
                        r0Var13.H((i26 >> 31) ^ (i26 << 1));
                        break;
                    }
                    break;
                case 16:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        long j16 = unsafe.getLong(obj, j10);
                        r0 r0Var14 = (r0) y1Var.a;
                        r0Var14.D(i15, 0);
                        r0Var14.E((j16 << 1) ^ (j16 >> 63));
                        break;
                    }
                    break;
                case 17:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        y1Var.c(i15, unsafe.getObject(obj, j10), l(i11));
                        break;
                    }
                    break;
                case 18:
                    i11 = i19;
                    o2.g(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, false);
                    break;
                case 19:
                    i11 = i19;
                    o2.n(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, false);
                    continue;
                case 20:
                    i11 = i19;
                    o2.q(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, false);
                    continue;
                case 21:
                    i11 = i19;
                    o2.s(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, false);
                    continue;
                case 22:
                    i11 = i19;
                    o2.B(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, false);
                    continue;
                case 23:
                    i11 = i19;
                    o2.w(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, false);
                    continue;
                case 24:
                    i11 = i19;
                    o2.G(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, false);
                    continue;
                case 25:
                    i11 = i19;
                    o2.J(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, false);
                    continue;
                case 26:
                    i11 = i19;
                    o2.e(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var);
                    break;
                case 27:
                    i11 = i19;
                    o2.f(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, l(i11));
                    break;
                case 28:
                    i11 = i19;
                    o2.l(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var);
                    break;
                case 29:
                    i11 = i19;
                    o2.E(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, false);
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    i11 = i19;
                    o2.I(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, false);
                    continue;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    i11 = i19;
                    o2.H(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, false);
                    continue;
                case 32:
                    i11 = i19;
                    o2.y(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, false);
                    continue;
                case 33:
                    i11 = i19;
                    o2.F(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, false);
                    continue;
                case 34:
                    i11 = i19;
                    o2.u(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, false);
                    continue;
                case 35:
                    i11 = i19;
                    o2.g(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, true);
                    break;
                case 36:
                    i11 = i19;
                    o2.n(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, true);
                    break;
                case 37:
                    i11 = i19;
                    o2.q(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, true);
                    break;
                case 38:
                    i11 = i19;
                    o2.s(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    i11 = i19;
                    o2.B(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    i11 = i19;
                    o2.w(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    i11 = i19;
                    o2.G(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    i11 = i19;
                    o2.J(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    i11 = i19;
                    o2.E(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    i11 = i19;
                    o2.I(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    i11 = i19;
                    o2.H(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    i11 = i19;
                    o2.y(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, true);
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    i11 = i19;
                    o2.F(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, true);
                    break;
                case 48:
                    i11 = i19;
                    o2.u(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, true);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    i11 = i19;
                    o2.m(iArr[i11], (List) unsafe.getObject(obj, j10), y1Var, l(i11));
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    i11 = i19;
                    if (unsafe.getObject(obj, j10) != null) {
                        Object t10 = t(i11);
                        this.m.getClass();
                        if (t10 != null) {
                            throw new ClassCastException();
                        }
                        throw new NoSuchMethodError();
                    }
                    break;
                case 51:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        double doubleValue = ((Double) x2.l(obj, j10)).doubleValue();
                        r0 r0Var15 = (r0) y1Var.a;
                        r0Var15.getClass();
                        long doubleToRawLongBits2 = Double.doubleToRawLongBits(doubleValue);
                        r0Var15.D(i15, 1);
                        r0Var15.K(doubleToRawLongBits2);
                        break;
                    }
                    break;
                case 52:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        float floatValue = ((Float) x2.l(obj, j10)).floatValue();
                        r0 r0Var16 = (r0) y1Var.a;
                        r0Var16.getClass();
                        int floatToRawIntBits2 = Float.floatToRawIntBits(floatValue);
                        r0Var16.D(i15, 5);
                        r0Var16.M(floatToRawIntBits2);
                        break;
                    }
                    break;
                case 53:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        long B = B(obj, j10);
                        r0 r0Var17 = (r0) y1Var.a;
                        r0Var17.D(i15, 0);
                        r0Var17.E(B);
                        break;
                    }
                    break;
                case 54:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        long B2 = B(obj, j10);
                        r0 r0Var18 = (r0) y1Var.a;
                        r0Var18.D(i15, 0);
                        r0Var18.E(B2);
                    } else {
                        continue;
                    }
                case 55:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        int A = A(obj, j10);
                        r0 r0Var19 = (r0) y1Var.a;
                        r0Var19.D(i15, 0);
                        r0Var19.C(A);
                    }
                    break;
                case 56:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        long B3 = B(obj, j10);
                        r0 r0Var20 = (r0) y1Var.a;
                        r0Var20.D(i15, 1);
                        r0Var20.K(B3);
                        break;
                    }
                    break;
                case 57:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        int A2 = A(obj, j10);
                        r0 r0Var21 = (r0) y1Var.a;
                        r0Var21.D(i15, 5);
                        r0Var21.M(A2);
                        break;
                    }
                    break;
                case 58:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        boolean booleanValue = ((Boolean) x2.l(obj, j10)).booleanValue();
                        r0 r0Var22 = (r0) y1Var.a;
                        r0Var22.D(i15, 0);
                        r0Var22.B(booleanValue ? (byte) 1 : (byte) 0);
                        break;
                    }
                    break;
                case 59:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        n(i15, unsafe.getObject(obj, j10), y1Var);
                        break;
                    }
                    break;
                case 60:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        y1Var.b(i15, unsafe.getObject(obj, j10), l(i11));
                        break;
                    }
                    break;
                case 61:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        y1Var.a(i15, (q0) unsafe.getObject(obj, j10));
                        break;
                    }
                    break;
                case 62:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        int A3 = A(obj, j10);
                        r0 r0Var23 = (r0) y1Var.a;
                        r0Var23.D(i15, 0);
                        r0Var23.H(A3);
                        break;
                    }
                    break;
                case 63:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        int A4 = A(obj, j10);
                        r0 r0Var24 = (r0) y1Var.a;
                        r0Var24.D(i15, 0);
                        r0Var24.C(A4);
                    }
                    break;
                case 64:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        int A5 = A(obj, j10);
                        r0 r0Var25 = (r0) y1Var.a;
                        r0Var25.D(i15, 5);
                        r0Var25.M(A5);
                        break;
                    }
                    break;
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        long B4 = B(obj, j10);
                        r0 r0Var26 = (r0) y1Var.a;
                        r0Var26.D(i15, 1);
                        r0Var26.K(B4);
                        break;
                    }
                    break;
                case 66:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        int A6 = A(obj, j10);
                        r0 r0Var27 = (r0) y1Var.a;
                        r0Var27.D(i15, 0);
                        r0Var27.H((A6 >> 31) ^ (A6 << 1));
                        break;
                    }
                    break;
                case 67:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        long B5 = B(obj, j10);
                        r0 r0Var28 = (r0) y1Var.a;
                        r0Var28.D(i15, 0);
                        r0Var28.E((B5 << 1) ^ (B5 >> 63));
                        break;
                    }
                    break;
                case 68:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        y1Var.c(i15, unsafe.getObject(obj, j10), l(i11));
                        break;
                    }
                    break;
                default:
                    i11 = i19;
                    break;
            }
        }
        this.l.getClass();
        ((f1) obj).zzb.c(y1Var);
    }

    public final k1 x(int i9) {
        return (k1) this.b[((i9 / 3) << 1) + 1];
    }

    public final boolean y(f1 f1Var, f1 f1Var2, int i9) {
        return r(i9, f1Var) == r(i9, f1Var2);
    }

    public final int z(int i9) {
        return this.a[i9 + 1];
    }

    @Override // com.google.android.gms.internal.vision.n2
    public final Object zza() {
        this.j.getClass();
        return ((f1) this.e).e(4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.vision.n2
    public final int zzb(Object obj) {
        p2 p2Var;
        int i9;
        int O;
        int T;
        int G;
        int J;
        int i10;
        int T2;
        int O2;
        int N;
        int i11;
        boolean z10 = this.f;
        p2 p2Var2 = this.l;
        b2 b2Var = this.m;
        int i12 = 267386880;
        int i13 = 1048575;
        int[] iArr = this.a;
        if (!z10) {
            Unsafe unsafe = o;
            int i14 = 0;
            int i15 = 0;
            int i16 = 1048575;
            int i17 = 0;
            while (i14 < iArr.length) {
                int z11 = z(i14);
                int i18 = iArr[i14];
                int i19 = (z11 & 267386880) >>> 20;
                if (i19 <= 17) {
                    int i20 = iArr[i14 + 2];
                    int i21 = i20 & 1048575;
                    i9 = 1 << (i20 >>> 20);
                    p2Var = p2Var2;
                    if (i21 != i16) {
                        i17 = unsafe.getInt(obj, i21);
                        i16 = i21;
                    }
                } else {
                    p2Var = p2Var2;
                    i9 = 0;
                }
                long j10 = z11 & 1048575;
                switch (i19) {
                    case 0:
                        if ((i17 & i9) != 0) {
                            i15 = aa.d.A(i18 << 3, 8, i15);
                            break;
                        }
                        break;
                    case 1:
                        if ((i17 & i9) != 0) {
                            i15 = aa.d.A(i18 << 3, 4, i15);
                            break;
                        }
                    case 2:
                        if ((i9 & i17) != 0) {
                            O = r0.O(unsafe.getLong(obj, j10)) + r0.T(i18 << 3);
                            i15 += O;
                        }
                        break;
                    case 3:
                        if ((i9 & i17) != 0) {
                            O = r0.N(i18, unsafe.getLong(obj, j10));
                            i15 += O;
                        }
                        break;
                    case 4:
                        if ((i9 & i17) != 0) {
                            O = r0.P(unsafe.getInt(obj, j10)) + r0.T(i18 << 3);
                            i15 += O;
                        }
                        break;
                    case 5:
                        if ((i17 & i9) != 0) {
                            O = r0.R(i18);
                            i15 += O;
                        }
                        break;
                    case 6:
                        if ((i17 & i9) != 0) {
                            O = r0.V(i18);
                            i15 += O;
                        }
                        break;
                    case 7:
                        if ((i17 & i9) != 0) {
                            i15 = aa.d.A(i18 << 3, 1, i15);
                        }
                        break;
                    case 8:
                        if ((i17 & i9) != 0) {
                            Object object = unsafe.getObject(obj, j10);
                            if (object instanceof q0) {
                                J = r0.J(i18, (q0) object);
                                i15 += J;
                            } else {
                                T = r0.T(i18 << 3);
                                G = r0.G((String) object);
                                J = G + T;
                                i15 += J;
                            }
                        }
                        break;
                    case 9:
                        if ((i17 & i9) != 0) {
                            J = o2.a(i18, unsafe.getObject(obj, j10), l(i14));
                            i15 += J;
                        }
                        break;
                    case 10:
                        if ((i17 & i9) != 0) {
                            J = r0.J(i18, (q0) unsafe.getObject(obj, j10));
                            i15 += J;
                        }
                        break;
                    case 11:
                        if ((i17 & i9) != 0) {
                            J = r0.S(i18, unsafe.getInt(obj, j10));
                            i15 += J;
                        }
                        break;
                    case 12:
                        if ((i17 & i9) != 0) {
                            int i22 = unsafe.getInt(obj, j10);
                            T = r0.T(i18 << 3);
                            G = r0.P(i22);
                            J = G + T;
                            i15 += J;
                        }
                        break;
                    case 13:
                        if ((i17 & i9) != 0) {
                            i15 = aa.d.A(i18 << 3, 4, i15);
                            break;
                        }
                    case 14:
                        if ((i17 & i9) != 0) {
                            i15 = aa.d.A(i18 << 3, 8, i15);
                        }
                        break;
                    case 15:
                        if ((i17 & i9) != 0) {
                            J = r0.U(i18, unsafe.getInt(obj, j10));
                            i15 += J;
                        }
                        break;
                    case 16:
                        if ((i17 & i9) != 0) {
                            J = r0.Q(i18, unsafe.getLong(obj, j10));
                            i15 += J;
                        }
                        break;
                    case 17:
                        if ((i17 & i9) != 0) {
                            J = r0.I(i18, (l0) unsafe.getObject(obj, j10), l(i14));
                            i15 += J;
                        }
                        break;
                    case 18:
                        J = o2.C(i18, (List) unsafe.getObject(obj, j10));
                        i15 += J;
                        break;
                    case 19:
                        J = o2.z(i18, (List) unsafe.getObject(obj, j10));
                        i15 += J;
                        break;
                    case 20:
                        List list = (List) unsafe.getObject(obj, j10);
                        Class cls = o2.a;
                        if (list.size() != 0) {
                            J = aa.d.B(i18, list.size(), o2.c(list));
                            i15 += J;
                            break;
                        }
                        J = 0;
                        i15 += J;
                    case 21:
                        List list2 = (List) unsafe.getObject(obj, j10);
                        Class cls2 = o2.a;
                        int size = list2.size();
                        if (size != 0) {
                            J = aa.d.B(i18, size, o2.k(list2));
                            i15 += J;
                            break;
                        }
                        J = 0;
                        i15 += J;
                    case 22:
                        List list3 = (List) unsafe.getObject(obj, j10);
                        Class cls3 = o2.a;
                        int size2 = list3.size();
                        if (size2 != 0) {
                            J = aa.d.B(i18, size2, o2.t(list3));
                            i15 += J;
                            break;
                        }
                        J = 0;
                        i15 += J;
                    case 23:
                        J = o2.C(i18, (List) unsafe.getObject(obj, j10));
                        i15 += J;
                        break;
                    case 24:
                        J = o2.z(i18, (List) unsafe.getObject(obj, j10));
                        i15 += J;
                        break;
                    case 25:
                        List list4 = (List) unsafe.getObject(obj, j10);
                        Class cls4 = o2.a;
                        int size3 = list4.size();
                        i15 += size3 == 0 ? 0 : (r0.T(i18 << 3) + 1) * size3;
                        break;
                    case 26:
                        J = o2.j(i18, (List) unsafe.getObject(obj, j10));
                        i15 += J;
                        break;
                    case 27:
                        J = o2.b(i18, (List) unsafe.getObject(obj, j10), l(i14));
                        i15 += J;
                        break;
                    case 28:
                        J = o2.o(i18, (List) unsafe.getObject(obj, j10));
                        i15 += J;
                        break;
                    case 29:
                        List list5 = (List) unsafe.getObject(obj, j10);
                        Class cls5 = o2.a;
                        int size4 = list5.size();
                        if (size4 != 0) {
                            J = aa.d.B(i18, size4, o2.v(list5));
                            i15 += J;
                            break;
                        }
                        J = 0;
                        i15 += J;
                    case MessageObject.TYPE_GIFT_STARS /* 30 */:
                        List list6 = (List) unsafe.getObject(obj, j10);
                        Class cls6 = o2.a;
                        int size5 = list6.size();
                        if (size5 != 0) {
                            J = aa.d.B(i18, size5, o2.r(list6));
                            i15 += J;
                            break;
                        }
                        J = 0;
                        i15 += J;
                    case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                        J = o2.z(i18, (List) unsafe.getObject(obj, j10));
                        i15 += J;
                        break;
                    case 32:
                        J = o2.C(i18, (List) unsafe.getObject(obj, j10));
                        i15 += J;
                        break;
                    case 33:
                        List list7 = (List) unsafe.getObject(obj, j10);
                        Class cls7 = o2.a;
                        int size6 = list7.size();
                        if (size6 != 0) {
                            J = aa.d.B(i18, size6, o2.x(list7));
                            i15 += J;
                            break;
                        }
                        J = 0;
                        i15 += J;
                    case 34:
                        List list8 = (List) unsafe.getObject(obj, j10);
                        Class cls8 = o2.a;
                        int size7 = list8.size();
                        if (size7 != 0) {
                            J = aa.d.B(i18, size7, o2.p(list8));
                            i15 += J;
                            break;
                        }
                        J = 0;
                        i15 += J;
                    case 35:
                        int D = o2.D((List) unsafe.getObject(obj, j10));
                        if (D > 0) {
                            i15 = aa.d.y(D, r0.y(i18), D, i15);
                        }
                        break;
                    case 36:
                        int A = o2.A((List) unsafe.getObject(obj, j10));
                        if (A > 0) {
                            i15 = aa.d.y(A, r0.y(i18), A, i15);
                        }
                        break;
                    case 37:
                        int c10 = o2.c((List) unsafe.getObject(obj, j10));
                        if (c10 > 0) {
                            i15 = aa.d.y(c10, r0.y(i18), c10, i15);
                        }
                        break;
                    case 38:
                        int k10 = o2.k((List) unsafe.getObject(obj, j10));
                        if (k10 > 0) {
                            i15 = aa.d.y(k10, r0.y(i18), k10, i15);
                        }
                        break;
                    case Maneuver.TYPE_DESTINATION /* 39 */:
                        int t10 = o2.t((List) unsafe.getObject(obj, j10));
                        if (t10 > 0) {
                            i15 = aa.d.y(t10, r0.y(i18), t10, i15);
                        }
                        break;
                    case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                        int D2 = o2.D((List) unsafe.getObject(obj, j10));
                        if (D2 > 0) {
                            i15 = aa.d.y(D2, r0.y(i18), D2, i15);
                        }
                        break;
                    case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                        int A2 = o2.A((List) unsafe.getObject(obj, j10));
                        if (A2 > 0) {
                            i15 = aa.d.y(A2, r0.y(i18), A2, i15);
                        }
                        break;
                    case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                        List list9 = (List) unsafe.getObject(obj, j10);
                        Class cls9 = o2.a;
                        int size8 = list9.size();
                        if (size8 > 0) {
                            i15 = aa.d.y(size8, r0.y(i18), size8, i15);
                        }
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                        int v = o2.v((List) unsafe.getObject(obj, j10));
                        if (v > 0) {
                            i15 = aa.d.y(v, r0.y(i18), v, i15);
                        }
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                        int r10 = o2.r((List) unsafe.getObject(obj, j10));
                        if (r10 > 0) {
                            i15 = aa.d.y(r10, r0.y(i18), r10, i15);
                        }
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                        int A3 = o2.A((List) unsafe.getObject(obj, j10));
                        if (A3 > 0) {
                            i15 = aa.d.y(A3, r0.y(i18), A3, i15);
                        }
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                        int D3 = o2.D((List) unsafe.getObject(obj, j10));
                        if (D3 > 0) {
                            i15 = aa.d.y(D3, r0.y(i18), D3, i15);
                        }
                        break;
                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                        int x10 = o2.x((List) unsafe.getObject(obj, j10));
                        if (x10 > 0) {
                            i15 = aa.d.y(x10, r0.y(i18), x10, i15);
                        }
                        break;
                    case 48:
                        int p6 = o2.p((List) unsafe.getObject(obj, j10));
                        if (p6 > 0) {
                            i15 = aa.d.y(p6, r0.y(i18), p6, i15);
                        }
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                        List list10 = (List) unsafe.getObject(obj, j10);
                        n2 l10 = l(i14);
                        Class cls10 = o2.a;
                        int size9 = list10.size();
                        if (size9 == 0) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                            for (int i23 = 0; i23 < size9; i23++) {
                                i10 += r0.I(i18, (l0) list10.get(i23), l10);
                            }
                        }
                        i15 += i10;
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        Object object2 = unsafe.getObject(obj, j10);
                        Object t11 = t(i14);
                        b2Var.getClass();
                        b2.b(object2, t11);
                        break;
                    case 51:
                        if (q(i18, i14, obj)) {
                            i15 = aa.d.A(i18 << 3, 8, i15);
                        }
                        break;
                    case 52:
                        if (q(i18, i14, obj)) {
                            i15 = aa.d.A(i18 << 3, 4, i15);
                            break;
                        }
                    case 53:
                        if (q(i18, i14, obj)) {
                            J = r0.O(B(obj, j10)) + r0.T(i18 << 3);
                            i15 += J;
                        }
                        break;
                    case 54:
                        if (q(i18, i14, obj)) {
                            J = r0.N(i18, B(obj, j10));
                            i15 += J;
                        }
                        break;
                    case 55:
                        if (q(i18, i14, obj)) {
                            int A4 = A(obj, j10);
                            T = r0.T(i18 << 3);
                            G = r0.P(A4);
                            J = G + T;
                            i15 += J;
                        }
                        break;
                    case 56:
                        if (q(i18, i14, obj)) {
                            J = r0.R(i18);
                            i15 += J;
                        }
                        break;
                    case 57:
                        if (q(i18, i14, obj)) {
                            J = r0.V(i18);
                            i15 += J;
                        }
                        break;
                    case 58:
                        if (q(i18, i14, obj)) {
                            i15 = aa.d.A(i18 << 3, 1, i15);
                        }
                        break;
                    case 59:
                        if (q(i18, i14, obj)) {
                            Object object3 = unsafe.getObject(obj, j10);
                            if (object3 instanceof q0) {
                                J = r0.J(i18, (q0) object3);
                                i15 += J;
                            } else {
                                T = r0.T(i18 << 3);
                                G = r0.G((String) object3);
                                J = G + T;
                                i15 += J;
                            }
                        }
                        break;
                    case 60:
                        if (q(i18, i14, obj)) {
                            J = o2.a(i18, unsafe.getObject(obj, j10), l(i14));
                            i15 += J;
                        }
                        break;
                    case 61:
                        if (q(i18, i14, obj)) {
                            J = r0.J(i18, (q0) unsafe.getObject(obj, j10));
                            i15 += J;
                        }
                        break;
                    case 62:
                        if (q(i18, i14, obj)) {
                            J = r0.S(i18, A(obj, j10));
                            i15 += J;
                        }
                        break;
                    case 63:
                        if (q(i18, i14, obj)) {
                            int A5 = A(obj, j10);
                            T = r0.T(i18 << 3);
                            G = r0.P(A5);
                            J = G + T;
                            i15 += J;
                        }
                        break;
                    case 64:
                        if (q(i18, i14, obj)) {
                            i15 = aa.d.A(i18 << 3, 4, i15);
                            break;
                        }
                    case VoIPService.CALL_MIN_LAYER /* 65 */:
                        if (q(i18, i14, obj)) {
                            i15 = aa.d.A(i18 << 3, 8, i15);
                        }
                        break;
                    case 66:
                        if (q(i18, i14, obj)) {
                            J = r0.U(i18, A(obj, j10));
                            i15 += J;
                        }
                        break;
                    case 67:
                        if (q(i18, i14, obj)) {
                            J = r0.Q(i18, B(obj, j10));
                            i15 += J;
                        }
                        break;
                    case 68:
                        if (q(i18, i14, obj)) {
                            J = r0.I(i18, (l0) unsafe.getObject(obj, j10), l(i14));
                            i15 += J;
                        }
                        break;
                }
                i14 += 3;
                p2Var2 = p2Var;
            }
            p2Var2.getClass();
            return ((f1) obj).zzb.d() + i15;
        }
        Unsafe unsafe2 = o;
        int i24 = 0;
        int i25 = 0;
        while (i24 < iArr.length) {
            int z12 = z(i24);
            int i26 = (z12 & i12) >>> 20;
            int i27 = iArr[i24];
            int[] iArr2 = iArr;
            long j11 = z12 & i13;
            if (i26 >= x0.b.a && i26 <= x0.c.a) {
                int i28 = iArr2[i24 + 2];
            }
            switch (i26) {
                case 0:
                    if (r(i24, obj)) {
                        i25 = aa.d.A(i27 << 3, 8, i25);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (r(i24, obj)) {
                        i25 = aa.d.A(i27 << 3, 4, i25);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (r(i24, obj)) {
                        long l11 = x2.c.l(obj, j11);
                        T2 = r0.T(i27 << 3);
                        O2 = r0.O(l11);
                        i25 += O2 + T2;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (r(i24, obj)) {
                        N = r0.N(i27, x2.c.l(obj, j11));
                        i25 += N;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (r(i24, obj)) {
                        int k11 = x2.c.k(obj, j11);
                        T2 = r0.T(i27 << 3);
                        O2 = r0.P(k11);
                        i25 += O2 + T2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (r(i24, obj)) {
                        N = r0.R(i27);
                        i25 += N;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (r(i24, obj)) {
                        N = r0.V(i27);
                        i25 += N;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (r(i24, obj)) {
                        i25 = aa.d.A(i27 << 3, 1, i25);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (r(i24, obj)) {
                        Object l12 = x2.l(obj, j11);
                        if (l12 instanceof q0) {
                            N = r0.J(i27, (q0) l12);
                            i25 += N;
                            break;
                        } else {
                            T2 = r0.T(i27 << 3);
                            O2 = r0.G((String) l12);
                            i25 += O2 + T2;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (r(i24, obj)) {
                        N = o2.a(i27, x2.l(obj, j11), l(i24));
                        i25 += N;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (r(i24, obj)) {
                        N = r0.J(i27, (q0) x2.l(obj, j11));
                        i25 += N;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (r(i24, obj)) {
                        N = r0.S(i27, x2.c.k(obj, j11));
                        i25 += N;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (r(i24, obj)) {
                        int k12 = x2.c.k(obj, j11);
                        T2 = r0.T(i27 << 3);
                        O2 = r0.P(k12);
                        i25 += O2 + T2;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (r(i24, obj)) {
                        i25 = aa.d.A(i27 << 3, 4, i25);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (r(i24, obj)) {
                        i25 = aa.d.A(i27 << 3, 8, i25);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (r(i24, obj)) {
                        N = r0.U(i27, x2.c.k(obj, j11));
                        i25 += N;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (r(i24, obj)) {
                        N = r0.Q(i27, x2.c.l(obj, j11));
                        i25 += N;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (r(i24, obj)) {
                        N = r0.I(i27, (l0) x2.l(obj, j11), l(i24));
                        i25 += N;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    N = o2.C(i27, (List) x2.l(obj, j11));
                    i25 += N;
                    break;
                case 19:
                    N = o2.z(i27, (List) x2.l(obj, j11));
                    i25 += N;
                    break;
                case 20:
                    List list11 = (List) x2.l(obj, j11);
                    Class cls11 = o2.a;
                    if (list11.size() != 0) {
                        N = aa.d.B(i27, list11.size(), o2.c(list11));
                        i25 += N;
                        break;
                    }
                    N = 0;
                    i25 += N;
                case 21:
                    List list12 = (List) x2.l(obj, j11);
                    Class cls12 = o2.a;
                    int size10 = list12.size();
                    if (size10 != 0) {
                        N = aa.d.B(i27, size10, o2.k(list12));
                        i25 += N;
                        break;
                    }
                    N = 0;
                    i25 += N;
                case 22:
                    List list13 = (List) x2.l(obj, j11);
                    Class cls13 = o2.a;
                    int size11 = list13.size();
                    if (size11 != 0) {
                        N = aa.d.B(i27, size11, o2.t(list13));
                        i25 += N;
                        break;
                    }
                    N = 0;
                    i25 += N;
                case 23:
                    N = o2.C(i27, (List) x2.l(obj, j11));
                    i25 += N;
                    break;
                case 24:
                    N = o2.z(i27, (List) x2.l(obj, j11));
                    i25 += N;
                    break;
                case 25:
                    List list14 = (List) x2.l(obj, j11);
                    Class cls14 = o2.a;
                    int size12 = list14.size();
                    if (size12 != 0) {
                        N = (r0.T(i27 << 3) + 1) * size12;
                        i25 += N;
                        break;
                    }
                    N = 0;
                    i25 += N;
                case 26:
                    N = o2.j(i27, (List) x2.l(obj, j11));
                    i25 += N;
                    break;
                case 27:
                    N = o2.b(i27, (List) x2.l(obj, j11), l(i24));
                    i25 += N;
                    break;
                case 28:
                    N = o2.o(i27, (List) x2.l(obj, j11));
                    i25 += N;
                    break;
                case 29:
                    List list15 = (List) x2.l(obj, j11);
                    Class cls15 = o2.a;
                    int size13 = list15.size();
                    if (size13 != 0) {
                        N = aa.d.B(i27, size13, o2.v(list15));
                        i25 += N;
                        break;
                    }
                    N = 0;
                    i25 += N;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    List list16 = (List) x2.l(obj, j11);
                    Class cls16 = o2.a;
                    int size14 = list16.size();
                    if (size14 != 0) {
                        N = aa.d.B(i27, size14, o2.r(list16));
                        i25 += N;
                        break;
                    }
                    N = 0;
                    i25 += N;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    N = o2.z(i27, (List) x2.l(obj, j11));
                    i25 += N;
                    break;
                case 32:
                    N = o2.C(i27, (List) x2.l(obj, j11));
                    i25 += N;
                    break;
                case 33:
                    List list17 = (List) x2.l(obj, j11);
                    Class cls17 = o2.a;
                    int size15 = list17.size();
                    if (size15 != 0) {
                        N = aa.d.B(i27, size15, o2.x(list17));
                        i25 += N;
                        break;
                    }
                    N = 0;
                    i25 += N;
                case 34:
                    List list18 = (List) x2.l(obj, j11);
                    Class cls18 = o2.a;
                    int size16 = list18.size();
                    if (size16 != 0) {
                        N = aa.d.B(i27, size16, o2.p(list18));
                        i25 += N;
                        break;
                    }
                    N = 0;
                    i25 += N;
                case 35:
                    int D4 = o2.D((List) unsafe2.getObject(obj, j11));
                    if (D4 > 0) {
                        i25 = aa.d.y(D4, r0.y(i27), D4, i25);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int A6 = o2.A((List) unsafe2.getObject(obj, j11));
                    if (A6 > 0) {
                        i25 = aa.d.y(A6, r0.y(i27), A6, i25);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int c11 = o2.c((List) unsafe2.getObject(obj, j11));
                    if (c11 > 0) {
                        i25 = aa.d.y(c11, r0.y(i27), c11, i25);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int k13 = o2.k((List) unsafe2.getObject(obj, j11));
                    if (k13 > 0) {
                        i25 = aa.d.y(k13, r0.y(i27), k13, i25);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    int t12 = o2.t((List) unsafe2.getObject(obj, j11));
                    if (t12 > 0) {
                        i25 = aa.d.y(t12, r0.y(i27), t12, i25);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    int D5 = o2.D((List) unsafe2.getObject(obj, j11));
                    if (D5 > 0) {
                        i25 = aa.d.y(D5, r0.y(i27), D5, i25);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    int A7 = o2.A((List) unsafe2.getObject(obj, j11));
                    if (A7 > 0) {
                        i25 = aa.d.y(A7, r0.y(i27), A7, i25);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    List list19 = (List) unsafe2.getObject(obj, j11);
                    Class cls19 = o2.a;
                    int size17 = list19.size();
                    if (size17 > 0) {
                        i25 = aa.d.y(size17, r0.y(i27), size17, i25);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    int v4 = o2.v((List) unsafe2.getObject(obj, j11));
                    if (v4 > 0) {
                        i25 = aa.d.y(v4, r0.y(i27), v4, i25);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    int r11 = o2.r((List) unsafe2.getObject(obj, j11));
                    if (r11 > 0) {
                        i25 = aa.d.y(r11, r0.y(i27), r11, i25);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    int A8 = o2.A((List) unsafe2.getObject(obj, j11));
                    if (A8 > 0) {
                        i25 = aa.d.y(A8, r0.y(i27), A8, i25);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    int D6 = o2.D((List) unsafe2.getObject(obj, j11));
                    if (D6 > 0) {
                        i25 = aa.d.y(D6, r0.y(i27), D6, i25);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    int x11 = o2.x((List) unsafe2.getObject(obj, j11));
                    if (x11 > 0) {
                        i25 = aa.d.y(x11, r0.y(i27), x11, i25);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int p9 = o2.p((List) unsafe2.getObject(obj, j11));
                    if (p9 > 0) {
                        i25 = aa.d.y(p9, r0.y(i27), p9, i25);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    List list20 = (List) x2.l(obj, j11);
                    n2 l13 = l(i24);
                    Class cls20 = o2.a;
                    int size18 = list20.size();
                    if (size18 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 0;
                        for (int i29 = 0; i29 < size18; i29++) {
                            i11 = r0.I(i27, (l0) list20.get(i29), l13) + i11;
                        }
                    }
                    i25 = i11 + i25;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Object l14 = x2.l(obj, j11);
                    Object t13 = t(i24);
                    b2Var.getClass();
                    b2.b(l14, t13);
                    break;
                case 51:
                    if (q(i27, i24, obj)) {
                        i25 = aa.d.A(i27 << 3, 8, i25);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(i27, i24, obj)) {
                        i25 = aa.d.A(i27 << 3, 4, i25);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (q(i27, i24, obj)) {
                        long B = B(obj, j11);
                        T2 = r0.T(i27 << 3);
                        O2 = r0.O(B);
                        i25 += O2 + T2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (q(i27, i24, obj)) {
                        N = r0.N(i27, B(obj, j11));
                        i25 += N;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (q(i27, i24, obj)) {
                        int A9 = A(obj, j11);
                        T2 = r0.T(i27 << 3);
                        O2 = r0.P(A9);
                        i25 += O2 + T2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(i27, i24, obj)) {
                        N = r0.R(i27);
                        i25 += N;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (q(i27, i24, obj)) {
                        N = r0.V(i27);
                        i25 += N;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (q(i27, i24, obj)) {
                        i25 = aa.d.A(i27 << 3, 1, i25);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(i27, i24, obj)) {
                        Object l15 = x2.l(obj, j11);
                        if (l15 instanceof q0) {
                            N = r0.J(i27, (q0) l15);
                            i25 += N;
                            break;
                        } else {
                            T2 = r0.T(i27 << 3);
                            O2 = r0.G((String) l15);
                            i25 += O2 + T2;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (q(i27, i24, obj)) {
                        N = o2.a(i27, x2.l(obj, j11), l(i24));
                        i25 += N;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (q(i27, i24, obj)) {
                        N = r0.J(i27, (q0) x2.l(obj, j11));
                        i25 += N;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (q(i27, i24, obj)) {
                        N = r0.S(i27, A(obj, j11));
                        i25 += N;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (q(i27, i24, obj)) {
                        int A10 = A(obj, j11);
                        T2 = r0.T(i27 << 3);
                        O2 = r0.P(A10);
                        i25 += O2 + T2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(i27, i24, obj)) {
                        i25 = aa.d.A(i27 << 3, 4, i25);
                        break;
                    } else {
                        break;
                    }
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (q(i27, i24, obj)) {
                        i25 = aa.d.A(i27 << 3, 8, i25);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (q(i27, i24, obj)) {
                        N = r0.U(i27, A(obj, j11));
                        i25 += N;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (q(i27, i24, obj)) {
                        N = r0.Q(i27, B(obj, j11));
                        i25 += N;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (q(i27, i24, obj)) {
                        N = r0.I(i27, (l0) x2.l(obj, j11), l(i24));
                        i25 += N;
                        break;
                    } else {
                        break;
                    }
            }
            i24 += 3;
            iArr = iArr2;
            i12 = 267386880;
            i13 = 1048575;
        }
        p2Var2.getClass();
        return ((f1) obj).zzb.d() + i25;
    }
}
