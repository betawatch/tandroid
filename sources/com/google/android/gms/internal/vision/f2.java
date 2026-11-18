package com.google.android.gms.internal.vision;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Level;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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

    public f2(int[] iArr, Object[] objArr, int i7, int i10, l0 l0Var, boolean z10, int[] iArr2, int i11, int i12, i2 i2Var, s1 s1Var, q2 q2Var, v0 v0Var, b2 b2Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i7;
        this.d = i10;
        this.f = z10;
        this.g = iArr2;
        this.h = i11;
        this.i = i12;
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
        int i7;
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
        Field m10;
        char charAt12;
        int i28;
        Object obj;
        Field m11;
        Object obj2;
        Field m12;
        int i29;
        char charAt13;
        int i30;
        char charAt14;
        int i31;
        int i32;
        char charAt15;
        int i33;
        char charAt16;
        if (!(m2Var instanceof m2)) {
            m2Var.getClass();
            throw new ClassCastException();
        }
        boolean z10 = (m2Var.d & 1) != 1;
        String str = m2Var.b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i34 = 1;
            while (true) {
                i7 = i34 + 1;
                if (str.charAt(i34) < 55296) {
                    break;
                }
                i34 = i7;
            }
        } else {
            i7 = 1;
        }
        int i35 = i7 + 1;
        int charAt17 = str.charAt(i7);
        if (charAt17 >= 55296) {
            int i36 = charAt17 & 8191;
            int i37 = 13;
            while (true) {
                i33 = i35 + 1;
                charAt16 = str.charAt(i35);
                if (charAt16 < 55296) {
                    break;
                }
                i36 |= (charAt16 & 8191) << i37;
                i37 += 13;
                i35 = i33;
            }
            charAt17 = i36 | (charAt16 << i37);
            i35 = i33;
        }
        if (charAt17 == 0) {
            i13 = 0;
            charAt = 0;
            charAt2 = 0;
            i10 = 0;
            charAt3 = 0;
            iArr = n;
            i11 = 0;
            i12 = 0;
        } else {
            int i38 = i35 + 1;
            int charAt18 = str.charAt(i35);
            if (charAt18 >= 55296) {
                int i39 = charAt18 & 8191;
                int i40 = 13;
                while (true) {
                    i21 = i38 + 1;
                    charAt11 = str.charAt(i38);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i39 |= (charAt11 & 8191) << i40;
                    i40 += 13;
                    i38 = i21;
                }
                charAt18 = i39 | (charAt11 << i40);
                i38 = i21;
            }
            int i41 = i38 + 1;
            int charAt19 = str.charAt(i38);
            if (charAt19 >= 55296) {
                int i42 = charAt19 & 8191;
                int i43 = 13;
                while (true) {
                    i20 = i41 + 1;
                    charAt10 = str.charAt(i41);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i42 |= (charAt10 & 8191) << i43;
                    i43 += 13;
                    i41 = i20;
                }
                charAt19 = i42 | (charAt10 << i43);
                i41 = i20;
            }
            int i44 = i41 + 1;
            int charAt20 = str.charAt(i41);
            if (charAt20 >= 55296) {
                int i45 = charAt20 & 8191;
                int i46 = 13;
                while (true) {
                    i19 = i44 + 1;
                    charAt9 = str.charAt(i44);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i45 |= (charAt9 & 8191) << i46;
                    i46 += 13;
                    i44 = i19;
                }
                charAt20 = i45 | (charAt9 << i46);
                i44 = i19;
            }
            int i47 = i44 + 1;
            int charAt21 = str.charAt(i44);
            if (charAt21 >= 55296) {
                int i48 = charAt21 & 8191;
                int i49 = 13;
                while (true) {
                    i18 = i47 + 1;
                    charAt8 = str.charAt(i47);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i48 |= (charAt8 & 8191) << i49;
                    i49 += 13;
                    i47 = i18;
                }
                charAt21 = i48 | (charAt8 << i49);
                i47 = i18;
            }
            int i50 = i47 + 1;
            charAt = str.charAt(i47);
            if (charAt >= 55296) {
                int i51 = charAt & 8191;
                int i52 = 13;
                while (true) {
                    i17 = i50 + 1;
                    charAt7 = str.charAt(i50);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i51 |= (charAt7 & 8191) << i52;
                    i52 += 13;
                    i50 = i17;
                }
                charAt = i51 | (charAt7 << i52);
                i50 = i17;
            }
            int i53 = i50 + 1;
            charAt2 = str.charAt(i50);
            if (charAt2 >= 55296) {
                int i54 = charAt2 & 8191;
                int i55 = 13;
                while (true) {
                    i16 = i53 + 1;
                    charAt6 = str.charAt(i53);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i54 |= (charAt6 & 8191) << i55;
                    i55 += 13;
                    i53 = i16;
                }
                charAt2 = i54 | (charAt6 << i55);
                i53 = i16;
            }
            int i56 = i53 + 1;
            int charAt22 = str.charAt(i53);
            if (charAt22 >= 55296) {
                int i57 = charAt22 & 8191;
                int i58 = 13;
                while (true) {
                    i15 = i56 + 1;
                    charAt5 = str.charAt(i56);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i57 |= (charAt5 & 8191) << i58;
                    i58 += 13;
                    i56 = i15;
                }
                charAt22 = i57 | (charAt5 << i58);
                i56 = i15;
            }
            int i59 = i56 + 1;
            charAt3 = str.charAt(i56);
            if (charAt3 >= 55296) {
                int i60 = charAt3 & 8191;
                int i61 = i59;
                int i62 = 13;
                while (true) {
                    i14 = i61 + 1;
                    charAt4 = str.charAt(i61);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i60 |= (charAt4 & 8191) << i62;
                    i62 += 13;
                    i61 = i14;
                }
                charAt3 = i60 | (charAt4 << i62);
                i59 = i14;
            }
            int[] iArr2 = new int[charAt3 + charAt2 + charAt22];
            i10 = (charAt18 << 1) + charAt19;
            i11 = charAt20;
            i12 = charAt21;
            iArr = iArr2;
            i13 = charAt18;
            i35 = i59;
        }
        Unsafe unsafe = o;
        Object[] objArr = m2Var.c;
        Class<?> cls = m2Var.a.getClass();
        int i63 = i13;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr2 = new Object[charAt << 1];
        int i64 = charAt2 + charAt3;
        int i65 = i64;
        int i66 = charAt3;
        int i67 = 0;
        int i68 = 0;
        while (i35 < length) {
            int i69 = i35 + 1;
            int charAt23 = str.charAt(i35);
            int[] iArr4 = iArr3;
            if (charAt23 >= 55296) {
                int i70 = charAt23 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i32 = i71 + 1;
                    charAt15 = str.charAt(i71);
                    i22 = length;
                    if (charAt15 < 55296) {
                        break;
                    }
                    i70 |= (charAt15 & 8191) << i72;
                    i72 += 13;
                    i71 = i32;
                    length = i22;
                }
                charAt23 = i70 | (charAt15 << i72);
                i23 = i32;
            } else {
                i22 = length;
                i23 = i69;
            }
            int i73 = i23 + 1;
            int charAt24 = str.charAt(i23);
            if (charAt24 >= 55296) {
                int i74 = charAt24 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i30 = i75 + 1;
                    charAt14 = str.charAt(i75);
                    i31 = i74;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i74 = i31 | ((charAt14 & 8191) << i76);
                    i76 += 13;
                    i75 = i30;
                }
                charAt24 = i31 | (charAt14 << i76);
                i24 = i30;
            } else {
                i24 = i73;
            }
            int i77 = charAt23;
            int i78 = charAt24 & ks.e4;
            int i79 = i11;
            if ((charAt24 & 1024) != 0) {
                iArr[i67] = i68;
                i67++;
            }
            int i80 = i12;
            if (i78 >= 51) {
                int i81 = i24 + 1;
                int charAt25 = str.charAt(i24);
                char c10 = 55296;
                if (charAt25 >= 55296) {
                    int i82 = charAt25 & 8191;
                    int i83 = 13;
                    while (true) {
                        i29 = i81 + 1;
                        charAt13 = str.charAt(i81);
                        if (charAt13 < c10) {
                            break;
                        }
                        i82 |= (charAt13 & 8191) << i83;
                        i83 += 13;
                        i81 = i29;
                        c10 = 55296;
                    }
                    charAt25 = i82 | (charAt13 << i83);
                    i81 = i29;
                }
                int i84 = i78 - 51;
                int i85 = charAt25;
                if (i84 == 9 || i84 == 17) {
                    i28 = i10 + 1;
                    objArr2[((i68 / 3) << 1) + 1] = objArr[i10];
                } else {
                    if (i84 == 12 && !z10) {
                        i28 = i10 + 1;
                        objArr2[((i68 / 3) << 1) + 1] = objArr[i10];
                    }
                    int i86 = i85 << 1;
                    obj = objArr[i86];
                    if (obj instanceof Field) {
                        m11 = m(cls, (String) obj);
                        objArr[i86] = m11;
                    } else {
                        m11 = (Field) obj;
                    }
                    int i87 = i81;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(m11);
                    int i88 = i86 + 1;
                    obj2 = objArr[i88];
                    if (obj2 instanceof Field) {
                        m12 = m(cls, (String) obj2);
                        objArr[i88] = m12;
                    } else {
                        m12 = (Field) obj2;
                    }
                    i26 = i87;
                    objectFieldOffset = objectFieldOffset2;
                    i25 = (int) unsafe.objectFieldOffset(m12);
                    i27 = 0;
                }
                i10 = i28;
                int i862 = i85 << 1;
                obj = objArr[i862];
                if (obj instanceof Field) {
                }
                int i872 = i81;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(m11);
                int i882 = i862 + 1;
                obj2 = objArr[i882];
                if (obj2 instanceof Field) {
                }
                i26 = i872;
                objectFieldOffset = objectFieldOffset22;
                i25 = (int) unsafe.objectFieldOffset(m12);
                i27 = 0;
            } else {
                int i89 = i10 + 1;
                Field m13 = m(cls, (String) objArr[i10]);
                if (i78 == 9 || i78 == 17) {
                    objArr2[((i68 / 3) << 1) + 1] = m13.getType();
                } else {
                    if (i78 == 27 || i78 == 49) {
                        i10 += 2;
                        objArr2[((i68 / 3) << 1) + 1] = objArr[i89];
                    } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                        if (!z10) {
                            i10 += 2;
                            objArr2[((i68 / 3) << 1) + 1] = objArr[i89];
                        }
                    } else if (i78 == 50) {
                        int i90 = i66 + 1;
                        iArr[i66] = i68;
                        int i91 = (i68 / 3) << 1;
                        int i92 = i10 + 2;
                        objArr2[i91] = objArr[i89];
                        if ((charAt24 & 2048) != 0) {
                            objArr2[i91 + 1] = objArr[i92];
                            i10 += 3;
                        } else {
                            i10 = i92;
                        }
                        i66 = i90;
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(m13);
                    if ((charAt24 & TLObject.FLAG_12) == 4096 || i78 > 17) {
                        i25 = 1048575;
                        i26 = i24;
                        i27 = 0;
                    } else {
                        int i93 = i24 + 1;
                        int charAt26 = str.charAt(i24);
                        if (charAt26 >= 55296) {
                            int i94 = charAt26 & 8191;
                            int i95 = 13;
                            while (true) {
                                i26 = i93 + 1;
                                charAt12 = str.charAt(i93);
                                if (charAt12 < 55296) {
                                    break;
                                }
                                i94 |= (charAt12 & 8191) << i95;
                                i95 += 13;
                                i93 = i26;
                            }
                            charAt26 = i94 | (charAt12 << i95);
                        } else {
                            i26 = i93;
                        }
                        int i96 = (charAt26 / 32) + (i63 << 1);
                        Object obj3 = objArr[i96];
                        if (obj3 instanceof Field) {
                            m10 = (Field) obj3;
                        } else {
                            m10 = m(cls, (String) obj3);
                            objArr[i96] = m10;
                        }
                        i25 = (int) unsafe.objectFieldOffset(m10);
                        i27 = charAt26 % 32;
                    }
                    if (i78 >= 18 && i78 <= 49) {
                        iArr[i65] = objectFieldOffset;
                        i65++;
                    }
                }
                i10 = i89;
                objectFieldOffset = (int) unsafe.objectFieldOffset(m13);
                if ((charAt24 & TLObject.FLAG_12) == 4096) {
                }
                i25 = 1048575;
                i26 = i24;
                i27 = 0;
                if (i78 >= 18) {
                    iArr[i65] = objectFieldOffset;
                    i65++;
                }
            }
            int i97 = i68 + 1;
            iArr4[i68] = i77;
            int i98 = i68 + 2;
            String str2 = str;
            iArr4[i97] = ((charAt24 & 512) != 0 ? TLObject.FLAG_29 : 0) | ((charAt24 & 256) != 0 ? TLObject.FLAG_28 : 0) | (i78 << 20) | objectFieldOffset;
            i68 += 3;
            iArr4[i98] = (i27 << 20) | i25;
            str = str2;
            iArr3 = iArr4;
            i11 = i79;
            length = i22;
            i35 = i26;
            i12 = i80;
        }
        return new f2(iArr3, objArr2, i11, i12, m2Var.a, z10, iArr, charAt3, i64, i2Var, s1Var, q2Var, v0Var, b2Var);
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
            throw new RuntimeException(a8.p0.s(sb2, " not found. Known fields are ", arrays));
        }
    }

    public static void n(int i7, Object obj, y1 y1Var) {
        if (!(obj instanceof String)) {
            y1Var.a(i7, (q0) obj);
            return;
        }
        String str = (String) obj;
        r0 r0Var = (r0) y1Var.a;
        r0Var.D(i7, 2);
        byte[] bArr = r0Var.c;
        int i10 = r0Var.e;
        try {
            int T = r0.T(str.length() * 3);
            int T2 = r0.T(str.length());
            if (T2 != T) {
                r0Var.H(b3.a(str));
                r0Var.e = b3.a.h(str, bArr, r0Var.e, r0Var.F());
                return;
            }
            int i11 = i10 + T2;
            r0Var.e = i11;
            int h = b3.a.h(str, bArr, i11, r0Var.F());
            r0Var.e = i10;
            r0Var.H((h - i10) - T2);
            r0Var.e = h;
        } catch (c3 e10) {
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ef, code lost:
    
        return false;
     */
    @Override // com.google.android.gms.internal.vision.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Object obj) {
        int i7 = 1048575;
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            boolean z10 = true;
            if (i10 >= this.h) {
                return true;
            }
            int i12 = this.g[i10];
            int[] iArr = this.a;
            int i13 = iArr[i12];
            int z11 = z(i12);
            int i14 = iArr[i12 + 2];
            int i15 = i14 & 1048575;
            int i16 = 1 << (i14 >>> 20);
            if (i15 != i7) {
                if (i15 != 1048575) {
                    i11 = o.getInt(obj, i15);
                }
                i7 = i15;
            }
            if ((268435456 & z11) != 0) {
                if (!(i7 == 1048575 ? r(i12, obj) : (i11 & i16) != 0)) {
                    break;
                }
            }
            int i17 = (267386880 & z11) >>> 20;
            if (i17 == 9 || i17 == 17) {
                if (i7 == 1048575) {
                    z10 = r(i12, obj);
                } else if ((i16 & i11) == 0) {
                    z10 = false;
                }
                if (z10 && !l(i12).a(y2.l(obj, z11 & 1048575))) {
                    break;
                }
                i10++;
            } else {
                if (i17 != 27) {
                    if (i17 == 60 || i17 == 68) {
                        if (q(i13, i12, obj) && !l(i12).a(y2.l(obj, z11 & 1048575))) {
                            break;
                        }
                    } else if (i17 != 49) {
                        if (i17 != 50) {
                            continue;
                        } else {
                            Object l10 = y2.l(obj, z11 & 1048575);
                            this.m.getClass();
                            if (!((a2) l10).isEmpty()) {
                                if (t(i12) == null) {
                                    throw new NoSuchMethodError();
                                }
                                throw new ClassCastException();
                            }
                        }
                    }
                    i10++;
                }
                List list = (List) y2.l(obj, z11 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    o2 l11 = l(i12);
                    for (int i18 = 0; i18 < list.size(); i18++) {
                        if (!l11.a(list.get(i18))) {
                            break loop0;
                        }
                    }
                }
                i10++;
            }
        }
    }

    @Override // com.google.android.gms.internal.vision.o2
    public final void b(Object obj) {
        int[] iArr;
        int i7;
        int i10 = this.h;
        while (true) {
            iArr = this.g;
            i7 = this.i;
            if (i10 >= i7) {
                break;
            }
            long z10 = z(iArr[i10]) & 1048575;
            Object l10 = y2.l(obj, z10);
            if (l10 != null) {
                this.m.getClass();
                ((a2) l10).a = false;
                y2.d(obj, z10, l10);
            }
            i10++;
        }
        int length = iArr.length;
        while (i7 < length) {
            this.k.b(obj, iArr[i7]);
            i7++;
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
        for (int i7 = 0; i7 < length; i7 += 3) {
            int z10 = z(i7);
            int i10 = iArr[i7];
            switch ((267386880 & z10) >>> 20) {
                case 0:
                    if (r(i7, obj)) {
                        double j3 = y2.c.j(obj, z10 & 1048575);
                        r0Var.getClass();
                        long doubleToRawLongBits = Double.doubleToRawLongBits(j3);
                        r0Var.D(i10, 1);
                        r0Var.K(doubleToRawLongBits);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (r(i7, obj)) {
                        float i11 = y2.c.i(obj, z10 & 1048575);
                        r0Var.getClass();
                        int floatToRawIntBits = Float.floatToRawIntBits(i11);
                        r0Var.D(i10, 5);
                        r0Var.M(floatToRawIntBits);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (r(i7, obj)) {
                        long l10 = y2.c.l(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.E(l10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (r(i7, obj)) {
                        long l11 = y2.c.l(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.E(l11);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (r(i7, obj)) {
                        int k10 = y2.c.k(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.C(k10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (r(i7, obj)) {
                        long l12 = y2.c.l(obj, z10 & 1048575);
                        r0Var.D(i10, 1);
                        r0Var.K(l12);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (r(i7, obj)) {
                        int k11 = y2.c.k(obj, z10 & 1048575);
                        r0Var.D(i10, 5);
                        r0Var.M(k11);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (r(i7, obj)) {
                        boolean h = y2.c.h(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.B(h ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (r(i7, obj)) {
                        n(i10, y2.l(obj, z10 & 1048575), y1Var);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (r(i7, obj)) {
                        y1Var.b(i10, y2.l(obj, z10 & 1048575), l(i7));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (r(i7, obj)) {
                        y1Var.a(i10, (q0) y2.l(obj, z10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (r(i7, obj)) {
                        int k12 = y2.c.k(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.H(k12);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (r(i7, obj)) {
                        int k13 = y2.c.k(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.C(k13);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (r(i7, obj)) {
                        int k14 = y2.c.k(obj, z10 & 1048575);
                        r0Var.D(i10, 5);
                        r0Var.M(k14);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (r(i7, obj)) {
                        long l13 = y2.c.l(obj, z10 & 1048575);
                        r0Var.D(i10, 1);
                        r0Var.K(l13);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (r(i7, obj)) {
                        int k15 = y2.c.k(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.H((k15 >> 31) ^ (k15 << 1));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (r(i7, obj)) {
                        long l14 = y2.c.l(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.E((l14 >> 63) ^ (l14 << 1));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (r(i7, obj)) {
                        y1Var.c(i10, y2.l(obj, z10 & 1048575), l(i7));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    p2.g(i10, (List) y2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 19:
                    p2.n(i10, (List) y2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 20:
                    p2.q(i10, (List) y2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 21:
                    p2.s(i10, (List) y2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 22:
                    p2.B(i10, (List) y2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 23:
                    p2.w(i10, (List) y2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 24:
                    p2.G(i10, (List) y2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 25:
                    p2.J(i10, (List) y2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 26:
                    p2.e(i10, (List) y2.l(obj, z10 & 1048575), y1Var);
                    break;
                case 27:
                    p2.f(i10, (List) y2.l(obj, z10 & 1048575), y1Var, l(i7));
                    break;
                case 28:
                    p2.l(i10, (List) y2.l(obj, z10 & 1048575), y1Var);
                    break;
                case 29:
                    p2.E(i10, (List) y2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case ks.T /* 30 */:
                    p2.I(i10, (List) y2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case ks.U /* 31 */:
                    p2.H(i10, (List) y2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 32:
                    p2.y(i10, (List) y2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 33:
                    p2.F(i10, (List) y2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 34:
                    p2.u(i10, (List) y2.l(obj, z10 & 1048575), y1Var, false);
                    break;
                case 35:
                    p2.g(i10, (List) y2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case 36:
                    p2.n(i10, (List) y2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case 37:
                    p2.q(i10, (List) y2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case 38:
                    p2.s(i10, (List) y2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case 39:
                    p2.B(i10, (List) y2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case 40:
                    p2.w(i10, (List) y2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case 41:
                    p2.G(i10, (List) y2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case 42:
                    p2.J(i10, (List) y2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case 43:
                    p2.E(i10, (List) y2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case 44:
                    p2.I(i10, (List) y2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case 45:
                    p2.H(i10, (List) y2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case 46:
                    p2.y(i10, (List) y2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case 47:
                    p2.F(i10, (List) y2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case 48:
                    p2.u(i10, (List) y2.l(obj, z10 & 1048575), y1Var, true);
                    break;
                case 49:
                    p2.m(i10, (List) y2.l(obj, z10 & 1048575), y1Var, l(i7));
                    break;
                case 50:
                    if (y2.l(obj, z10 & 1048575) != null) {
                        Object t6 = t(i7);
                        this.m.getClass();
                        if (t6 != null) {
                            throw new ClassCastException();
                        }
                        throw new NoSuchMethodError();
                    }
                    break;
                case ks.o0 /* 51 */:
                    if (q(i10, i7, obj)) {
                        double doubleValue = ((Double) y2.l(obj, z10 & 1048575)).doubleValue();
                        r0Var.getClass();
                        long doubleToRawLongBits2 = Double.doubleToRawLongBits(doubleValue);
                        r0Var.D(i10, 1);
                        r0Var.K(doubleToRawLongBits2);
                        break;
                    } else {
                        break;
                    }
                case ks.p0 /* 52 */:
                    if (q(i10, i7, obj)) {
                        float floatValue = ((Float) y2.l(obj, z10 & 1048575)).floatValue();
                        r0Var.getClass();
                        int floatToRawIntBits2 = Float.floatToRawIntBits(floatValue);
                        r0Var.D(i10, 5);
                        r0Var.M(floatToRawIntBits2);
                        break;
                    } else {
                        break;
                    }
                case ks.q0 /* 53 */:
                    if (q(i10, i7, obj)) {
                        long B = B(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.E(B);
                        break;
                    } else {
                        break;
                    }
                case ks.r0 /* 54 */:
                    if (q(i10, i7, obj)) {
                        long B2 = B(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.E(B2);
                        break;
                    } else {
                        break;
                    }
                case ks.s0 /* 55 */:
                    if (q(i10, i7, obj)) {
                        int A = A(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.C(A);
                        break;
                    } else {
                        break;
                    }
                case ks.t0 /* 56 */:
                    if (q(i10, i7, obj)) {
                        long B3 = B(obj, z10 & 1048575);
                        r0Var.D(i10, 1);
                        r0Var.K(B3);
                        break;
                    } else {
                        break;
                    }
                case ks.u0 /* 57 */:
                    if (q(i10, i7, obj)) {
                        int A2 = A(obj, z10 & 1048575);
                        r0Var.D(i10, 5);
                        r0Var.M(A2);
                        break;
                    } else {
                        break;
                    }
                case ks.v0 /* 58 */:
                    if (q(i10, i7, obj)) {
                        boolean booleanValue = ((Boolean) y2.l(obj, z10 & 1048575)).booleanValue();
                        r0Var.D(i10, 0);
                        r0Var.B(booleanValue ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case ks.w0 /* 59 */:
                    if (q(i10, i7, obj)) {
                        n(i10, y2.l(obj, z10 & 1048575), y1Var);
                        break;
                    } else {
                        break;
                    }
                case ks.x0 /* 60 */:
                    if (q(i10, i7, obj)) {
                        y1Var.b(i10, y2.l(obj, z10 & 1048575), l(i7));
                        break;
                    } else {
                        break;
                    }
                case ks.y0 /* 61 */:
                    if (q(i10, i7, obj)) {
                        y1Var.a(i10, (q0) y2.l(obj, z10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case ks.z0 /* 62 */:
                    if (q(i10, i7, obj)) {
                        int A3 = A(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.H(A3);
                        break;
                    } else {
                        break;
                    }
                case ks.A0 /* 63 */:
                    if (q(i10, i7, obj)) {
                        int A4 = A(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.C(A4);
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(i10, i7, obj)) {
                        int A5 = A(obj, z10 & 1048575);
                        r0Var.D(i10, 5);
                        r0Var.M(A5);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (q(i10, i7, obj)) {
                        long B4 = B(obj, z10 & 1048575);
                        r0Var.D(i10, 1);
                        r0Var.K(B4);
                        break;
                    } else {
                        break;
                    }
                case ks.D0 /* 66 */:
                    if (q(i10, i7, obj)) {
                        int A6 = A(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.H((A6 >> 31) ^ (A6 << 1));
                        break;
                    } else {
                        break;
                    }
                case ks.E0 /* 67 */:
                    if (q(i10, i7, obj)) {
                        long B5 = B(obj, z10 & 1048575);
                        r0Var.D(i10, 0);
                        r0Var.E((B5 >> 63) ^ (B5 << 1));
                        break;
                    } else {
                        break;
                    }
                case ks.F0 /* 68 */:
                    if (q(i10, i7, obj)) {
                        y1Var.c(i10, y2.l(obj, z10 & 1048575), l(i7));
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
        int i7;
        int a10;
        int i10;
        int[] iArr = this.a;
        int length = iArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int z10 = z(i12);
            int i13 = iArr[i12];
            long j3 = 1048575 & z10;
            int i14 = 1237;
            int i15 = 37;
            switch ((z10 & 267386880) >>> 20) {
                case 0:
                    i7 = i11 * 53;
                    a10 = j1.a(Double.doubleToLongBits(y2.c.j(f1Var, j3)));
                    i11 = a10 + i7;
                    break;
                case 1:
                    i7 = i11 * 53;
                    a10 = Float.floatToIntBits(y2.c.i(f1Var, j3));
                    i11 = a10 + i7;
                    break;
                case 2:
                    i7 = i11 * 53;
                    a10 = j1.a(y2.c.l(f1Var, j3));
                    i11 = a10 + i7;
                    break;
                case 3:
                    i7 = i11 * 53;
                    a10 = j1.a(y2.c.l(f1Var, j3));
                    i11 = a10 + i7;
                    break;
                case 4:
                    i7 = i11 * 53;
                    a10 = y2.c.k(f1Var, j3);
                    i11 = a10 + i7;
                    break;
                case 5:
                    i7 = i11 * 53;
                    a10 = j1.a(y2.c.l(f1Var, j3));
                    i11 = a10 + i7;
                    break;
                case 6:
                    i7 = i11 * 53;
                    a10 = y2.c.k(f1Var, j3);
                    i11 = a10 + i7;
                    break;
                case 7:
                    i10 = i11 * 53;
                    boolean h = y2.c.h(f1Var, j3);
                    Charset charset = j1.a;
                    break;
                case 8:
                    i7 = i11 * 53;
                    a10 = ((String) y2.l(f1Var, j3)).hashCode();
                    i11 = a10 + i7;
                    break;
                case 9:
                    Object l10 = y2.l(f1Var, j3);
                    if (l10 != null) {
                        i15 = l10.hashCode();
                    }
                    i11 = (i11 * 53) + i15;
                    break;
                case 10:
                    i7 = i11 * 53;
                    a10 = y2.l(f1Var, j3).hashCode();
                    i11 = a10 + i7;
                    break;
                case 11:
                    i7 = i11 * 53;
                    a10 = y2.c.k(f1Var, j3);
                    i11 = a10 + i7;
                    break;
                case 12:
                    i7 = i11 * 53;
                    a10 = y2.c.k(f1Var, j3);
                    i11 = a10 + i7;
                    break;
                case 13:
                    i7 = i11 * 53;
                    a10 = y2.c.k(f1Var, j3);
                    i11 = a10 + i7;
                    break;
                case 14:
                    i7 = i11 * 53;
                    a10 = j1.a(y2.c.l(f1Var, j3));
                    i11 = a10 + i7;
                    break;
                case 15:
                    i7 = i11 * 53;
                    a10 = y2.c.k(f1Var, j3);
                    i11 = a10 + i7;
                    break;
                case 16:
                    i7 = i11 * 53;
                    a10 = j1.a(y2.c.l(f1Var, j3));
                    i11 = a10 + i7;
                    break;
                case 17:
                    Object l11 = y2.l(f1Var, j3);
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
                case ks.T /* 30 */:
                case ks.U /* 31 */:
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
                    a10 = y2.l(f1Var, j3).hashCode();
                    i11 = a10 + i7;
                    break;
                case 50:
                    i7 = i11 * 53;
                    a10 = y2.l(f1Var, j3).hashCode();
                    i11 = a10 + i7;
                    break;
                case ks.o0 /* 51 */:
                    if (q(i13, i12, f1Var)) {
                        i7 = i11 * 53;
                        a10 = j1.a(Double.doubleToLongBits(((Double) y2.l(f1Var, j3)).doubleValue()));
                        i11 = a10 + i7;
                        break;
                    } else {
                        break;
                    }
                case ks.p0 /* 52 */:
                    if (q(i13, i12, f1Var)) {
                        i7 = i11 * 53;
                        a10 = Float.floatToIntBits(((Float) y2.l(f1Var, j3)).floatValue());
                        i11 = a10 + i7;
                        break;
                    } else {
                        break;
                    }
                case ks.q0 /* 53 */:
                    if (q(i13, i12, f1Var)) {
                        i7 = i11 * 53;
                        a10 = j1.a(B(f1Var, j3));
                        i11 = a10 + i7;
                        break;
                    } else {
                        break;
                    }
                case ks.r0 /* 54 */:
                    if (q(i13, i12, f1Var)) {
                        i7 = i11 * 53;
                        a10 = j1.a(B(f1Var, j3));
                        i11 = a10 + i7;
                        break;
                    } else {
                        break;
                    }
                case ks.s0 /* 55 */:
                    if (q(i13, i12, f1Var)) {
                        i7 = i11 * 53;
                        a10 = A(f1Var, j3);
                        i11 = a10 + i7;
                        break;
                    } else {
                        break;
                    }
                case ks.t0 /* 56 */:
                    if (q(i13, i12, f1Var)) {
                        i7 = i11 * 53;
                        a10 = j1.a(B(f1Var, j3));
                        i11 = a10 + i7;
                        break;
                    } else {
                        break;
                    }
                case ks.u0 /* 57 */:
                    if (q(i13, i12, f1Var)) {
                        i7 = i11 * 53;
                        a10 = A(f1Var, j3);
                        i11 = a10 + i7;
                        break;
                    } else {
                        break;
                    }
                case ks.v0 /* 58 */:
                    if (q(i13, i12, f1Var)) {
                        i10 = i11 * 53;
                        boolean booleanValue = ((Boolean) y2.l(f1Var, j3)).booleanValue();
                        Charset charset2 = j1.a;
                        break;
                    } else {
                        break;
                    }
                case ks.w0 /* 59 */:
                    if (q(i13, i12, f1Var)) {
                        i7 = i11 * 53;
                        a10 = ((String) y2.l(f1Var, j3)).hashCode();
                        i11 = a10 + i7;
                        break;
                    } else {
                        break;
                    }
                case ks.x0 /* 60 */:
                    if (q(i13, i12, f1Var)) {
                        i7 = i11 * 53;
                        a10 = y2.l(f1Var, j3).hashCode();
                        i11 = a10 + i7;
                        break;
                    } else {
                        break;
                    }
                case ks.y0 /* 61 */:
                    if (q(i13, i12, f1Var)) {
                        i7 = i11 * 53;
                        a10 = y2.l(f1Var, j3).hashCode();
                        i11 = a10 + i7;
                        break;
                    } else {
                        break;
                    }
                case ks.z0 /* 62 */:
                    if (q(i13, i12, f1Var)) {
                        i7 = i11 * 53;
                        a10 = A(f1Var, j3);
                        i11 = a10 + i7;
                        break;
                    } else {
                        break;
                    }
                case ks.A0 /* 63 */:
                    if (q(i13, i12, f1Var)) {
                        i7 = i11 * 53;
                        a10 = A(f1Var, j3);
                        i11 = a10 + i7;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(i13, i12, f1Var)) {
                        i7 = i11 * 53;
                        a10 = A(f1Var, j3);
                        i11 = a10 + i7;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (q(i13, i12, f1Var)) {
                        i7 = i11 * 53;
                        a10 = j1.a(B(f1Var, j3));
                        i11 = a10 + i7;
                        break;
                    } else {
                        break;
                    }
                case ks.D0 /* 66 */:
                    if (q(i13, i12, f1Var)) {
                        i7 = i11 * 53;
                        a10 = A(f1Var, j3);
                        i11 = a10 + i7;
                        break;
                    } else {
                        break;
                    }
                case ks.E0 /* 67 */:
                    if (q(i13, i12, f1Var)) {
                        i7 = i11 * 53;
                        a10 = j1.a(B(f1Var, j3));
                        i11 = a10 + i7;
                        break;
                    } else {
                        break;
                    }
                case ks.F0 /* 68 */:
                    if (q(i13, i12, f1Var)) {
                        i7 = i11 * 53;
                        a10 = y2.l(f1Var, j3).hashCode();
                        i11 = a10 + i7;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.l.getClass();
        return f1Var.zzb.hashCode() + (i11 * 53);
    }

    @Override // com.google.android.gms.internal.vision.o2
    public final void e(f1 f1Var, f1 f1Var2) {
        f1 f1Var3;
        f1Var2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i7 >= iArr.length) {
                p2.h(this.l, f1Var, f1Var2);
                return;
            }
            int z10 = z(i7);
            long j3 = z10 & 1048575;
            int i10 = iArr[i7];
            switch ((z10 & 267386880) >>> 20) {
                case 0:
                    f1Var3 = f1Var;
                    if (!r(i7, f1Var2)) {
                        break;
                    } else {
                        x2 x2Var = y2.c;
                        x2Var.d(f1Var3, j3, x2Var.j(f1Var2, j3));
                        u(i7, f1Var3);
                        continue;
                    }
                case 1:
                    f1Var3 = f1Var;
                    if (r(i7, f1Var2)) {
                        x2 x2Var2 = y2.c;
                        x2Var2.e(f1Var3, j3, x2Var2.i(f1Var2, j3));
                        u(i7, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    f1Var3 = f1Var;
                    if (r(i7, f1Var2)) {
                        x2 x2Var3 = y2.c;
                        x2Var3.f(f1Var3, j3, x2Var3.l(f1Var2, j3));
                        u(i7, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    f1Var3 = f1Var;
                    if (r(i7, f1Var2)) {
                        x2 x2Var4 = y2.c;
                        x2Var4.f(f1Var3, j3, x2Var4.l(f1Var2, j3));
                        u(i7, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    f1Var3 = f1Var;
                    if (r(i7, f1Var2)) {
                        y2.c(j3, f1Var3, y2.c.k(f1Var2, j3));
                        u(i7, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    f1Var3 = f1Var;
                    if (r(i7, f1Var2)) {
                        x2 x2Var5 = y2.c;
                        x2Var5.f(f1Var3, j3, x2Var5.l(f1Var2, j3));
                        u(i7, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    f1Var3 = f1Var;
                    if (r(i7, f1Var2)) {
                        y2.c(j3, f1Var3, y2.c.k(f1Var2, j3));
                        u(i7, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    f1Var3 = f1Var;
                    if (r(i7, f1Var2)) {
                        x2 x2Var6 = y2.c;
                        x2Var6.g(f1Var3, j3, x2Var6.h(f1Var2, j3));
                        u(i7, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    f1Var3 = f1Var;
                    if (r(i7, f1Var2)) {
                        y2.d(f1Var3, j3, y2.l(f1Var2, j3));
                        u(i7, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    f1Var3 = f1Var;
                    o(i7, f1Var3, f1Var2);
                    continue;
                case 10:
                    f1Var3 = f1Var;
                    if (r(i7, f1Var2)) {
                        y2.d(f1Var3, j3, y2.l(f1Var2, j3));
                        u(i7, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    f1Var3 = f1Var;
                    if (r(i7, f1Var2)) {
                        y2.c(j3, f1Var3, y2.c.k(f1Var2, j3));
                        u(i7, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    f1Var3 = f1Var;
                    if (r(i7, f1Var2)) {
                        y2.c(j3, f1Var3, y2.c.k(f1Var2, j3));
                        u(i7, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    f1Var3 = f1Var;
                    if (r(i7, f1Var2)) {
                        y2.c(j3, f1Var3, y2.c.k(f1Var2, j3));
                        u(i7, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    f1Var3 = f1Var;
                    if (r(i7, f1Var2)) {
                        x2 x2Var7 = y2.c;
                        x2Var7.f(f1Var3, j3, x2Var7.l(f1Var2, j3));
                        u(i7, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    f1Var3 = f1Var;
                    if (r(i7, f1Var2)) {
                        y2.c(j3, f1Var3, y2.c.k(f1Var2, j3));
                        u(i7, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (r(i7, f1Var2)) {
                        x2 x2Var8 = y2.c;
                        f1Var3 = f1Var;
                        x2Var8.f(f1Var3, j3, x2Var8.l(f1Var2, j3));
                        u(i7, f1Var3);
                        break;
                    }
                    break;
                case 17:
                    o(i7, f1Var, f1Var2);
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
                case ks.T /* 30 */:
                case ks.U /* 31 */:
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
                    this.k.a(f1Var, j3, f1Var2);
                    break;
                case 50:
                    Class cls = p2.a;
                    Object l10 = y2.l(f1Var, j3);
                    Object l11 = y2.l(f1Var2, j3);
                    this.m.getClass();
                    y2.d(f1Var, j3, b2.a(l10, l11));
                    break;
                case ks.o0 /* 51 */:
                case ks.p0 /* 52 */:
                case ks.q0 /* 53 */:
                case ks.r0 /* 54 */:
                case ks.s0 /* 55 */:
                case ks.t0 /* 56 */:
                case ks.u0 /* 57 */:
                case ks.v0 /* 58 */:
                case ks.w0 /* 59 */:
                    if (q(i10, i7, f1Var2)) {
                        y2.d(f1Var, j3, y2.l(f1Var2, j3));
                        y2.c(iArr[i7 + 2] & 1048575, f1Var, i10);
                        break;
                    }
                    break;
                case ks.x0 /* 60 */:
                    v(i7, f1Var, f1Var2);
                    break;
                case ks.y0 /* 61 */:
                case ks.z0 /* 62 */:
                case ks.A0 /* 63 */:
                case 64:
                case 65:
                case ks.D0 /* 66 */:
                case ks.E0 /* 67 */:
                    if (q(i10, i7, f1Var2)) {
                        y2.d(f1Var, j3, y2.l(f1Var2, j3));
                        y2.c(iArr[i7 + 2] & 1048575, f1Var, i10);
                        break;
                    }
                    break;
                case ks.F0 /* 68 */:
                    v(i7, f1Var, f1Var2);
                    break;
            }
            f1Var3 = f1Var;
            i7 += 3;
            f1Var = f1Var3;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:81:0x00a8. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.o2
    public final void f(Object obj, byte[] bArr, int i7, int i10, com.google.android.gms.internal.clearcut.l lVar) {
        int i11;
        int i12;
        Unsafe unsafe;
        Object obj2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Unsafe unsafe2;
        Object obj3;
        int i20;
        Unsafe unsafe3;
        Object obj4;
        int i21;
        int i22;
        int i23;
        f2 f2Var = this;
        Object obj5 = obj;
        byte[] bArr2 = bArr;
        int i24 = i10;
        com.google.android.gms.internal.clearcut.l lVar2 = lVar;
        if (!f2Var.f) {
            j(obj5, bArr, i7, i24, 0, lVar);
            return;
        }
        Unsafe unsafe4 = o;
        int i25 = i7;
        int i26 = -1;
        int i27 = 0;
        int i28 = 1048575;
        int i29 = 0;
        while (i25 < i24) {
            int i30 = i25 + 1;
            int i31 = bArr2[i25];
            if (i31 < 0) {
                i30 = e1.d(i31, bArr2, i30, lVar2);
                i31 = lVar2.a;
            }
            int i32 = i30;
            int i33 = i31 >>> 3;
            int i34 = i31 & 7;
            int i35 = f2Var.d;
            int i36 = f2Var.c;
            if (i33 > i26) {
                i12 = (i33 < i36 || i33 > i35) ? -1 : f2Var.s(i33, i27 / 3);
                i11 = 0;
            } else if (i33 < i36 || i33 > i35) {
                i11 = 0;
                i12 = -1;
            } else {
                i11 = 0;
                i12 = f2Var.s(i33, 0);
            }
            int i37 = i12;
            if (i37 == -1) {
                unsafe = unsafe4;
                obj2 = obj5;
                i13 = i31;
                i14 = i29;
                i15 = i32;
                i16 = i11;
            } else {
                int[] iArr = f2Var.a;
                int i38 = iArr[i37 + 1];
                int i39 = (i38 & 267386880) >>> 20;
                int i40 = i31;
                long j3 = i38 & 1048575;
                if (i39 <= 17) {
                    int i41 = iArr[i37 + 2];
                    int i42 = 1 << (i41 >>> 20);
                    int i43 = i41 & 1048575;
                    if (i43 != i28) {
                        i18 = i39;
                        i17 = 1;
                        i19 = i38;
                        if (i28 != 1048575) {
                            unsafe4.putInt(obj5, i28, i29);
                        }
                        if (i43 != 1048575) {
                            i29 = unsafe4.getInt(obj5, i43);
                        }
                        i28 = i43;
                    } else {
                        i17 = 1;
                        i18 = i39;
                        i19 = i38;
                    }
                    switch (i18) {
                        case 0:
                            i20 = i33;
                            if (i34 != i17) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i29;
                                i15 = i32;
                                i16 = i37;
                                i33 = i20;
                                i13 = i40;
                                break;
                            } else {
                                unsafe3 = unsafe4;
                                y2.c.d(obj5, j3, Double.longBitsToDouble(e1.u(i32, bArr2)));
                                i25 = i32 + 8;
                                i29 |= i42;
                                unsafe4 = unsafe3;
                                i27 = i37;
                                i26 = i20;
                                break;
                            }
                        case 1:
                            i20 = i33;
                            if (i34 != 5) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i29;
                                i15 = i32;
                                i16 = i37;
                                i33 = i20;
                                i13 = i40;
                                break;
                            } else {
                                y2.c.e(obj5, j3, Float.intBitsToFloat(e1.a(i32, bArr2)));
                                i25 = i32 + 4;
                                i29 |= i42;
                                i27 = i37;
                                i26 = i20;
                                break;
                            }
                        case 2:
                        case 3:
                            i20 = i33;
                            if (i34 != 0) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i29;
                                i15 = i32;
                                i16 = i37;
                                i33 = i20;
                                i13 = i40;
                                break;
                            } else {
                                int t6 = e1.t(bArr2, i32, lVar2);
                                unsafe4.putLong(obj5, j3, lVar2.b);
                                i29 |= i42;
                                i25 = t6;
                                i27 = i37;
                                i26 = i20;
                                break;
                            }
                        case 4:
                        case 11:
                            i20 = i33;
                            if (i34 != 0) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i29;
                                i15 = i32;
                                i16 = i37;
                                i33 = i20;
                                i13 = i40;
                                break;
                            } else {
                                int j10 = e1.j(bArr2, i32, lVar2);
                                unsafe4.putInt(obj5, j3, lVar2.a);
                                i29 |= i42;
                                i25 = j10;
                                i27 = i37;
                                i26 = i20;
                                break;
                            }
                        case 5:
                        case 14:
                            i20 = i33;
                            if (i34 != i17) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i29;
                                i15 = i32;
                                i16 = i37;
                                i33 = i20;
                                i13 = i40;
                                break;
                            } else {
                                unsafe4.putLong(obj5, j3, e1.u(i32, bArr2));
                                i25 = i32 + 8;
                                i29 |= i42;
                                i27 = i37;
                                i26 = i20;
                                break;
                            }
                        case 6:
                        case 13:
                            i20 = i33;
                            if (i34 != 5) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i29;
                                i15 = i32;
                                i16 = i37;
                                i33 = i20;
                                i13 = i40;
                                break;
                            } else {
                                unsafe4.putInt(obj5, j3, e1.a(i32, bArr2));
                                i25 = i32 + 4;
                                i29 |= i42;
                                i27 = i37;
                                i26 = i20;
                                break;
                            }
                        case 7:
                            i20 = i33;
                            if (i34 != 0) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i29;
                                i15 = i32;
                                i16 = i37;
                                i33 = i20;
                                i13 = i40;
                                break;
                            } else {
                                i25 = e1.t(bArr2, i32, lVar2);
                                y2.c.g(obj5, j3, lVar2.b != 0 ? i17 : 0);
                                i29 |= i42;
                                i27 = i37;
                                i26 = i20;
                                break;
                            }
                        case 8:
                            i20 = i33;
                            if (i34 != 2) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i29;
                                i15 = i32;
                                i16 = i37;
                                i33 = i20;
                                i13 = i40;
                                break;
                            } else {
                                i25 = (i19 & TLObject.FLAG_29) == 0 ? e1.w(bArr2, i32, lVar2) : e1.x(bArr2, i32, lVar2);
                                unsafe4.putObject(obj5, j3, lVar2.c);
                                i29 |= i42;
                                i27 = i37;
                                i26 = i20;
                                break;
                            }
                        case 9:
                            i20 = i33;
                            if (i34 != 2) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i29;
                                i15 = i32;
                                i16 = i37;
                                i33 = i20;
                                i13 = i40;
                                break;
                            } else {
                                i25 = e1.g(f2Var.l(i37), bArr2, i32, i24, lVar2);
                                Object object = unsafe4.getObject(obj5, j3);
                                if (object == null) {
                                    unsafe4.putObject(obj5, j3, lVar2.c);
                                } else {
                                    unsafe4.putObject(obj5, j3, j1.b(object, lVar2.c));
                                }
                                i29 |= i42;
                                i27 = i37;
                                i26 = i20;
                                break;
                            }
                        case 10:
                            i20 = i33;
                            if (i34 != 2) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i29;
                                i15 = i32;
                                i16 = i37;
                                i33 = i20;
                                i13 = i40;
                                break;
                            } else {
                                i25 = e1.z(bArr2, i32, lVar2);
                                unsafe4.putObject(obj5, j3, lVar2.c);
                                i29 |= i42;
                                i27 = i37;
                                i26 = i20;
                                break;
                            }
                        case 12:
                            i20 = i33;
                            if (i34 != 0) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i29;
                                i15 = i32;
                                i16 = i37;
                                i33 = i20;
                                i13 = i40;
                                break;
                            } else {
                                i25 = e1.j(bArr2, i32, lVar2);
                                unsafe4.putInt(obj5, j3, lVar2.a);
                                i29 |= i42;
                                i27 = i37;
                                i26 = i20;
                                break;
                            }
                        case 15:
                            i20 = i33;
                            if (i34 != 0) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i29;
                                i15 = i32;
                                i16 = i37;
                                i33 = i20;
                                i13 = i40;
                                break;
                            } else {
                                i25 = e1.j(bArr2, i32, lVar2);
                                unsafe4.putInt(obj5, j3, e1.y(lVar2.a));
                                i29 |= i42;
                                i27 = i37;
                                i26 = i20;
                                break;
                            }
                        case 16:
                            if (i34 != 0) {
                                i20 = i33;
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i29;
                                i15 = i32;
                                i16 = i37;
                                i33 = i20;
                                i13 = i40;
                                break;
                            } else {
                                int t10 = e1.t(bArr2, i32, lVar2);
                                long j11 = lVar2.b;
                                i20 = i33;
                                unsafe4.putLong(obj5, j3, (j11 >>> i17) ^ (-(j11 & 1)));
                                i29 |= i42;
                                i25 = t10;
                                i27 = i37;
                                i26 = i20;
                                break;
                            }
                        default:
                            unsafe2 = unsafe4;
                            obj3 = obj5;
                            i20 = i33;
                            obj2 = obj3;
                            unsafe = unsafe2;
                            i14 = i29;
                            i15 = i32;
                            i16 = i37;
                            i33 = i20;
                            i13 = i40;
                            break;
                    }
                } else {
                    i20 = i33;
                    unsafe3 = unsafe4;
                    Object obj6 = obj5;
                    if (i39 != 27) {
                        if (i39 <= 49) {
                            long j12 = i38;
                            unsafe = unsafe3;
                            i14 = i29;
                            i22 = i28;
                            i33 = i20;
                            i13 = i40;
                            i23 = f2Var.i(obj, bArr, i32, i10, i13, i33, i34, i37, j12, i39, j3, lVar);
                            obj5 = obj;
                            i16 = i37;
                            if (i23 == i32) {
                                obj2 = obj5;
                                i15 = i23;
                            } else {
                                i24 = i10;
                                lVar2 = lVar;
                                i26 = i33;
                                i25 = i23;
                                i27 = i16;
                                i28 = i22;
                                i29 = i14;
                                unsafe4 = unsafe;
                                bArr2 = bArr;
                            }
                        } else {
                            unsafe = unsafe3;
                            i14 = i29;
                            i16 = i37;
                            i21 = i32;
                            i22 = i28;
                            i33 = i20;
                            i13 = i40;
                            obj4 = obj;
                            if (i39 != 50) {
                                i23 = f2Var.h(obj4, bArr, i21, i10, i13, i33, i34, i38, i39, j3, i16, lVar);
                                obj2 = obj4;
                                if (i23 == i21) {
                                    i15 = i23;
                                } else {
                                    f2Var = this;
                                    lVar2 = lVar;
                                    i26 = i33;
                                    i25 = i23;
                                    obj5 = obj2;
                                    i27 = i16;
                                    i28 = i22;
                                    i29 = i14;
                                    unsafe4 = unsafe;
                                    bArr2 = bArr;
                                    i24 = i10;
                                }
                            } else if (i34 == 2) {
                                f2Var.p(j3, obj4, i16);
                                throw null;
                            }
                        }
                        i28 = i22;
                    } else if (i34 == 2) {
                        o1 o1Var = (o1) unsafe3.getObject(obj6, j3);
                        if (!o1Var.zza()) {
                            int size = o1Var.size();
                            o1Var = o1Var.zza(size == 0 ? 10 : size << 1);
                            unsafe3.putObject(obj6, j3, o1Var);
                        }
                        int e10 = e1.e(f2Var.l(i37), i40, bArr2, i32, i24, o1Var, lVar2);
                        obj5 = obj;
                        bArr2 = bArr;
                        i24 = i10;
                        lVar2 = lVar;
                        i25 = e10;
                        unsafe4 = unsafe3;
                        i27 = i37;
                        i26 = i20;
                    } else {
                        obj4 = obj;
                        unsafe = unsafe3;
                        i14 = i29;
                        i21 = i32;
                        i16 = i37;
                        i33 = i20;
                        i13 = i40;
                        i22 = i28;
                    }
                    obj2 = obj4;
                    i15 = i21;
                    i28 = i22;
                }
            }
            int c10 = e1.c(i13, bArr, i15, i10, C(obj2), lVar);
            bArr2 = bArr;
            lVar2 = lVar;
            i26 = i33;
            obj5 = obj2;
            i27 = i16;
            i29 = i14;
            unsafe4 = unsafe;
            i24 = i10;
            i25 = c10;
            f2Var = this;
        }
        Unsafe unsafe5 = unsafe4;
        int i44 = i24;
        int i45 = i28;
        int i46 = i29;
        Object obj7 = obj5;
        if (i45 != 1048575) {
            unsafe5.putInt(obj7, i45, i46);
        }
        if (i25 != i44) {
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
        int i7 = 0;
        while (true) {
            boolean z10 = true;
            if (i7 < length) {
                int z11 = z(i7);
                long j3 = z11 & 1048575;
                switch ((z11 & 267386880) >>> 20) {
                    case 0:
                        if (y(f1Var, f1Var2, i7)) {
                            x2 x2Var = y2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 1:
                        if (y(f1Var, f1Var2, i7)) {
                            x2 x2Var2 = y2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 2:
                        if (y(f1Var, f1Var2, i7)) {
                            x2 x2Var3 = y2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 3:
                        if (y(f1Var, f1Var2, i7)) {
                            x2 x2Var4 = y2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 4:
                        if (y(f1Var, f1Var2, i7)) {
                            x2 x2Var5 = y2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 5:
                        if (y(f1Var, f1Var2, i7)) {
                            x2 x2Var6 = y2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 6:
                        if (y(f1Var, f1Var2, i7)) {
                            x2 x2Var7 = y2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 7:
                        if (y(f1Var, f1Var2, i7)) {
                            x2 x2Var8 = y2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 8:
                        if (y(f1Var, f1Var2, i7)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 9:
                        if (y(f1Var, f1Var2, i7)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 10:
                        if (y(f1Var, f1Var2, i7)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 11:
                        if (y(f1Var, f1Var2, i7)) {
                            x2 x2Var9 = y2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 12:
                        if (y(f1Var, f1Var2, i7)) {
                            x2 x2Var10 = y2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 13:
                        if (y(f1Var, f1Var2, i7)) {
                            x2 x2Var11 = y2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 14:
                        if (y(f1Var, f1Var2, i7)) {
                            x2 x2Var12 = y2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 15:
                        if (y(f1Var, f1Var2, i7)) {
                            x2 x2Var13 = y2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 16:
                        if (y(f1Var, f1Var2, i7)) {
                            x2 x2Var14 = y2.c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 17:
                        if (y(f1Var, f1Var2, i7)) {
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
                    case ks.T /* 30 */:
                    case ks.U /* 31 */:
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
                        z10 = p2.i(y2.l(f1Var, j3), y2.l(f1Var2, j3));
                        break;
                    case 50:
                        z10 = p2.i(y2.l(f1Var, j3), y2.l(f1Var2, j3));
                        break;
                    case ks.o0 /* 51 */:
                    case ks.p0 /* 52 */:
                    case ks.q0 /* 53 */:
                    case ks.r0 /* 54 */:
                    case ks.s0 /* 55 */:
                    case ks.t0 /* 56 */:
                    case ks.u0 /* 57 */:
                    case ks.v0 /* 58 */:
                    case ks.w0 /* 59 */:
                    case ks.x0 /* 60 */:
                    case ks.y0 /* 61 */:
                    case ks.z0 /* 62 */:
                    case ks.A0 /* 63 */:
                    case 64:
                    case 65:
                    case ks.D0 /* 66 */:
                    case ks.E0 /* 67 */:
                    case ks.F0 /* 68 */:
                        long j10 = iArr[i7 + 2] & 1048575;
                        x2 x2Var15 = y2.c;
                        if (x2Var15.k(f1Var, j10) == x2Var15.k(f1Var2, j10)) {
                            break;
                        }
                        z10 = false;
                        break;
                }
                if (z10) {
                    i7 += 3;
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

    public final int h(Object obj, byte[] bArr, int i7, int i10, int i11, int i12, int i13, int i14, int i15, long j3, int i16, com.google.android.gms.internal.clearcut.l lVar) {
        int i17;
        int i18;
        int t6;
        Object object;
        Unsafe unsafe = o;
        long j10 = this.a[i16 + 2] & 1048575;
        switch (i15) {
            case ks.o0 /* 51 */:
                i17 = i7;
                if (i13 != 1) {
                    return i17;
                }
                unsafe.putObject(obj, j3, Double.valueOf(Double.longBitsToDouble(e1.u(i17, bArr))));
                t6 = i17 + 8;
                unsafe.putInt(obj, j10, i12);
                return t6;
            case ks.p0 /* 52 */:
                i18 = i7;
                if (i13 != 5) {
                    return i18;
                }
                unsafe.putObject(obj, j3, Float.valueOf(Float.intBitsToFloat(e1.a(i18, bArr))));
                t6 = i18 + 4;
                unsafe.putInt(obj, j10, i12);
                return t6;
            case ks.q0 /* 53 */:
            case ks.r0 /* 54 */:
                if (i13 != 0) {
                    return i7;
                }
                t6 = e1.t(bArr, i7, lVar);
                unsafe.putObject(obj, j3, Long.valueOf(lVar.b));
                unsafe.putInt(obj, j10, i12);
                return t6;
            case ks.s0 /* 55 */:
            case ks.z0 /* 62 */:
                if (i13 != 0) {
                    return i7;
                }
                t6 = e1.j(bArr, i7, lVar);
                unsafe.putObject(obj, j3, Integer.valueOf(lVar.a));
                unsafe.putInt(obj, j10, i12);
                return t6;
            case ks.t0 /* 56 */:
            case 65:
                i17 = i7;
                if (i13 != 1) {
                    return i17;
                }
                unsafe.putObject(obj, j3, Long.valueOf(e1.u(i17, bArr)));
                t6 = i17 + 8;
                unsafe.putInt(obj, j10, i12);
                return t6;
            case ks.u0 /* 57 */:
            case 64:
                i18 = i7;
                if (i13 != 5) {
                    return i18;
                }
                unsafe.putObject(obj, j3, Integer.valueOf(e1.a(i18, bArr)));
                t6 = i18 + 4;
                unsafe.putInt(obj, j10, i12);
                return t6;
            case ks.v0 /* 58 */:
                if (i13 != 0) {
                    return i7;
                }
                t6 = e1.t(bArr, i7, lVar);
                unsafe.putObject(obj, j3, Boolean.valueOf(lVar.b != 0));
                unsafe.putInt(obj, j10, i12);
                return t6;
            case ks.w0 /* 59 */:
                if (i13 != 2) {
                    return i7;
                }
                int j11 = e1.j(bArr, i7, lVar);
                int i19 = lVar.a;
                if (i19 == 0) {
                    unsafe.putObject(obj, j3, "");
                } else {
                    if ((i14 & TLObject.FLAG_29) != 0) {
                        if (!b3.a.s(j11, j11 + i19, bArr)) {
                            throw n1.c();
                        }
                    }
                    unsafe.putObject(obj, j3, new String(bArr, j11, i19, j1.a));
                    j11 += i19;
                }
                unsafe.putInt(obj, j10, i12);
                return j11;
            case ks.x0 /* 60 */:
                if (i13 != 2) {
                    return i7;
                }
                int g10 = e1.g(l(i16), bArr, i7, i10, lVar);
                object = unsafe.getInt(obj, j10) == i12 ? unsafe.getObject(obj, j3) : null;
                if (object == null) {
                    unsafe.putObject(obj, j3, lVar.c);
                } else {
                    unsafe.putObject(obj, j3, j1.b(object, lVar.c));
                }
                unsafe.putInt(obj, j10, i12);
                return g10;
            case ks.y0 /* 61 */:
                if (i13 != 2) {
                    return i7;
                }
                t6 = e1.z(bArr, i7, lVar);
                unsafe.putObject(obj, j3, lVar.c);
                unsafe.putInt(obj, j10, i12);
                return t6;
            case ks.A0 /* 63 */:
                if (i13 != 0) {
                    return i7;
                }
                int j12 = e1.j(bArr, i7, lVar);
                int i20 = lVar.a;
                k1 x10 = x(i16);
                if (x10 != null && !x10.zza(i20)) {
                    C(obj).a(i11, Long.valueOf(i20));
                    return j12;
                }
                unsafe.putObject(obj, j3, Integer.valueOf(i20));
                t6 = j12;
                unsafe.putInt(obj, j10, i12);
                return t6;
            case ks.D0 /* 66 */:
                if (i13 != 0) {
                    return i7;
                }
                t6 = e1.j(bArr, i7, lVar);
                unsafe.putObject(obj, j3, Integer.valueOf(e1.y(lVar.a)));
                unsafe.putInt(obj, j10, i12);
                return t6;
            case ks.E0 /* 67 */:
                if (i13 != 0) {
                    return i7;
                }
                t6 = e1.t(bArr, i7, lVar);
                long j13 = lVar.b;
                unsafe.putObject(obj, j3, Long.valueOf((-(j13 & 1)) ^ (j13 >>> 1)));
                unsafe.putInt(obj, j10, i12);
                return t6;
            case ks.F0 /* 68 */:
                if (i13 == 3) {
                    t6 = e1.f(l(i16), bArr, i7, i10, (i11 & (-8)) | 4, lVar);
                    object = unsafe.getInt(obj, j10) == i12 ? unsafe.getObject(obj, j3) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j3, lVar.c);
                    } else {
                        unsafe.putObject(obj, j3, j1.b(object, lVar.c));
                    }
                    unsafe.putInt(obj, j10, i12);
                    return t6;
                }
            default:
                return i7;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int i(Object obj, byte[] bArr, int i7, int i10, int i11, int i12, int i13, int i14, long j3, int i15, long j10, com.google.android.gms.internal.clearcut.l lVar) {
        int b10;
        Unsafe unsafe = o;
        o1 o1Var = (o1) unsafe.getObject(obj, j10);
        if (!o1Var.zza()) {
            int size = o1Var.size();
            o1Var = o1Var.zza(size == 0 ? 10 : size << 1);
            unsafe.putObject(obj, j10, o1Var);
        }
        o1 o1Var2 = o1Var;
        switch (i15) {
            case 18:
            case 35:
                if (i13 != 2) {
                    if (i13 == 1) {
                        Double.longBitsToDouble(e1.u(i7, bArr));
                        throw null;
                    }
                    return i7;
                }
                int j11 = e1.j(bArr, i7, lVar);
                int i16 = lVar.a + j11;
                if (j11 < i16) {
                    Double.longBitsToDouble(e1.u(j11, bArr));
                    throw null;
                }
                if (j11 == i16) {
                    return j11;
                }
                throw n1.a();
            case 19:
            case 36:
                if (i13 != 2) {
                    if (i13 == 5) {
                        Float.intBitsToFloat(e1.a(i7, bArr));
                        throw null;
                    }
                    return i7;
                }
                int j12 = e1.j(bArr, i7, lVar);
                int i17 = lVar.a + j12;
                if (j12 < i17) {
                    Float.intBitsToFloat(e1.a(j12, bArr));
                    throw null;
                }
                if (j12 == i17) {
                    return j12;
                }
                throw n1.a();
            case 20:
            case 21:
            case 37:
            case 38:
                if (i13 != 2) {
                    if (i13 == 0) {
                        e1.t(bArr, i7, lVar);
                        throw null;
                    }
                    return i7;
                }
                int j13 = e1.j(bArr, i7, lVar);
                int i18 = lVar.a + j13;
                if (j13 < i18) {
                    e1.t(bArr, j13, lVar);
                    throw null;
                }
                if (j13 == i18) {
                    return j13;
                }
                throw n1.a();
            case 22:
            case 29:
            case 39:
            case 43:
                if (i13 != 2) {
                    if (i13 == 0) {
                        return e1.b(i11, bArr, i7, i10, o1Var2, lVar);
                    }
                    return i7;
                }
                h1 h1Var = (h1) o1Var2;
                int j14 = e1.j(bArr, i7, lVar);
                int i19 = lVar.a + j14;
                while (j14 < i19) {
                    j14 = e1.j(bArr, j14, lVar);
                    h1Var.i(lVar.a);
                }
                if (j14 == i19) {
                    return j14;
                }
                throw n1.a();
            case 23:
            case 32:
            case 40:
            case 46:
                if (i13 != 2) {
                    if (i13 == 1) {
                        e1.u(i7, bArr);
                        throw null;
                    }
                    return i7;
                }
                int j15 = e1.j(bArr, i7, lVar);
                int i20 = lVar.a + j15;
                if (j15 < i20) {
                    e1.u(j15, bArr);
                    throw null;
                }
                if (j15 == i20) {
                    return j15;
                }
                throw n1.a();
            case 24:
            case ks.U /* 31 */:
            case 41:
            case 45:
                if (i13 == 2) {
                    h1 h1Var2 = (h1) o1Var2;
                    int j16 = e1.j(bArr, i7, lVar);
                    int i21 = lVar.a + j16;
                    while (j16 < i21) {
                        h1Var2.i(e1.a(j16, bArr));
                        j16 += 4;
                    }
                    if (j16 == i21) {
                        return j16;
                    }
                    throw n1.a();
                }
                if (i13 == 5) {
                    h1 h1Var3 = (h1) o1Var2;
                    h1Var3.i(e1.a(i7, bArr));
                    int i22 = i7 + 4;
                    while (i22 < i10) {
                        int j17 = e1.j(bArr, i22, lVar);
                        if (i11 != lVar.a) {
                            return i22;
                        }
                        h1Var3.i(e1.a(j17, bArr));
                        i22 = j17 + 4;
                    }
                    return i22;
                }
                return i7;
            case 25:
            case 42:
                if (i13 != 2) {
                    if (i13 == 0) {
                        e1.t(bArr, i7, lVar);
                        throw null;
                    }
                    return i7;
                }
                int j18 = e1.j(bArr, i7, lVar);
                int i23 = lVar.a + j18;
                if (j18 < i23) {
                    e1.t(bArr, j18, lVar);
                    throw null;
                }
                if (j18 == i23) {
                    return j18;
                }
                throw n1.a();
            case 26:
                if (i13 == 2) {
                    if ((j3 & 536870912) == 0) {
                        int j19 = e1.j(bArr, i7, lVar);
                        int i24 = lVar.a;
                        if (i24 < 0) {
                            throw n1.b();
                        }
                        if (i24 == 0) {
                            o1Var2.add("");
                        } else {
                            o1Var2.add(new String(bArr, j19, i24, j1.a));
                            j19 += i24;
                        }
                        while (j19 < i10) {
                            int j20 = e1.j(bArr, j19, lVar);
                            if (i11 != lVar.a) {
                                return j19;
                            }
                            j19 = e1.j(bArr, j20, lVar);
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
                        }
                        return j19;
                    }
                    int j21 = e1.j(bArr, i7, lVar);
                    int i26 = lVar.a;
                    if (i26 < 0) {
                        throw n1.b();
                    }
                    if (i26 == 0) {
                        o1Var2.add("");
                    } else {
                        int i27 = j21 + i26;
                        if (!b3.a.s(j21, i27, bArr)) {
                            throw n1.c();
                        }
                        o1Var2.add(new String(bArr, j21, i26, j1.a));
                        j21 = i27;
                    }
                    while (j21 < i10) {
                        int j22 = e1.j(bArr, j21, lVar);
                        if (i11 != lVar.a) {
                            return j21;
                        }
                        j21 = e1.j(bArr, j22, lVar);
                        int i28 = lVar.a;
                        if (i28 < 0) {
                            throw n1.b();
                        }
                        if (i28 == 0) {
                            o1Var2.add("");
                        } else {
                            int i29 = j21 + i28;
                            if (!b3.a.s(j21, i29, bArr)) {
                                throw n1.c();
                            }
                            o1Var2.add(new String(bArr, j21, i28, j1.a));
                            j21 = i29;
                        }
                    }
                    return j21;
                }
                return i7;
            case 27:
                if (i13 == 2) {
                    return e1.e(l(i14), i11, bArr, i7, i10, o1Var2, lVar);
                }
                return i7;
            case 28:
                if (i13 == 2) {
                    int j23 = e1.j(bArr, i7, lVar);
                    int i30 = lVar.a;
                    if (i30 < 0) {
                        throw n1.b();
                    }
                    if (i30 > bArr.length - j23) {
                        throw n1.a();
                    }
                    if (i30 == 0) {
                        o1Var2.add(q0.c);
                    } else {
                        o1Var2.add(q0.j(j23, i30, bArr));
                        j23 += i30;
                    }
                    while (j23 < i10) {
                        int j24 = e1.j(bArr, j23, lVar);
                        if (i11 != lVar.a) {
                            return j23;
                        }
                        j23 = e1.j(bArr, j24, lVar);
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
                            o1Var2.add(q0.j(j23, i31, bArr));
                            j23 += i31;
                        }
                    }
                    return j23;
                }
                return i7;
            case ks.T /* 30 */:
            case 44:
                if (i13 != 2) {
                    if (i13 == 0) {
                        b10 = e1.b(i11, bArr, i7, i10, o1Var2, lVar);
                    }
                    return i7;
                }
                h1 h1Var4 = (h1) o1Var2;
                b10 = e1.j(bArr, i7, lVar);
                int i32 = lVar.a + b10;
                while (b10 < i32) {
                    b10 = e1.j(bArr, b10, lVar);
                    h1Var4.i(lVar.a);
                }
                if (b10 != i32) {
                    throw n1.a();
                }
                f1 f1Var = (f1) obj;
                r2 r2Var = f1Var.zzb;
                r2 r2Var2 = r2Var != r2.f ? r2Var : null;
                k1 x10 = x(i14);
                Class cls = p2.a;
                if (x10 != null) {
                    boolean z10 = o1Var2 instanceof RandomAccess;
                    q2 q2Var = this.l;
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
                                if (r2Var2 == null) {
                                    q2Var.getClass();
                                    r2Var2 = r2.b();
                                }
                                q2Var.getClass();
                                r2Var2.a(i12 << 3, Long.valueOf(intValue));
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
                                if (r2Var2 == null) {
                                    q2Var.getClass();
                                    r2Var2 = r2.b();
                                }
                                q2Var.getClass();
                                r2Var2.a(i12 << 3, Long.valueOf(intValue2));
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
            case 47:
                if (i13 == 2) {
                    h1 h1Var5 = (h1) o1Var2;
                    int j25 = e1.j(bArr, i7, lVar);
                    int i35 = lVar.a + j25;
                    while (j25 < i35) {
                        j25 = e1.j(bArr, j25, lVar);
                        h1Var5.i(e1.y(lVar.a));
                    }
                    if (j25 == i35) {
                        return j25;
                    }
                    throw n1.a();
                }
                if (i13 == 0) {
                    h1 h1Var6 = (h1) o1Var2;
                    int j26 = e1.j(bArr, i7, lVar);
                    h1Var6.i(e1.y(lVar.a));
                    while (j26 < i10) {
                        int j27 = e1.j(bArr, j26, lVar);
                        if (i11 != lVar.a) {
                            return j26;
                        }
                        j26 = e1.j(bArr, j27, lVar);
                        h1Var6.i(e1.y(lVar.a));
                    }
                    return j26;
                }
                return i7;
            case 34:
            case 48:
                if (i13 != 2) {
                    if (i13 == 0) {
                        e1.t(bArr, i7, lVar);
                        throw null;
                    }
                    return i7;
                }
                int j28 = e1.j(bArr, i7, lVar);
                int i36 = lVar.a + j28;
                if (j28 < i36) {
                    e1.t(bArr, j28, lVar);
                    throw null;
                }
                if (j28 == i36) {
                    return j28;
                }
                throw n1.a();
            case 49:
                if (i13 == 3) {
                    o2 l10 = l(i14);
                    int i37 = (i11 & (-8)) | 4;
                    int f10 = e1.f(l10, bArr, i7, i10, i37, lVar);
                    o2 o2Var = l10;
                    int i38 = i10;
                    com.google.android.gms.internal.clearcut.l lVar2 = lVar;
                    o1Var2.add(lVar2.c);
                    while (f10 < i38) {
                        int j29 = e1.j(bArr, f10, lVar2);
                        if (i11 != lVar2.a) {
                            return f10;
                        }
                        o2 o2Var2 = o2Var;
                        int i39 = i38;
                        com.google.android.gms.internal.clearcut.l lVar3 = lVar2;
                        f10 = e1.f(o2Var2, bArr, j29, i39, i37, lVar3);
                        o1Var2.add(lVar3.c);
                        o2Var = o2Var2;
                        i38 = i39;
                        lVar2 = lVar3;
                    }
                    return f10;
                }
                return i7;
            default:
                return i7;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x03f7, code lost:
    
        if (r7 == r3) goto L140;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(Object obj, byte[] bArr, int i7, int i10, int i11, com.google.android.gms.internal.clearcut.l lVar) {
        int i12;
        Unsafe unsafe;
        int[] iArr;
        f2 f2Var;
        Object obj2;
        int i13;
        int i14;
        int i15;
        int i16;
        Object obj3;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int h;
        int i22;
        int i23;
        int i24;
        int i25;
        char c10;
        Unsafe unsafe2;
        int i26;
        Unsafe unsafe3;
        Object obj4;
        int i27;
        int i28;
        Unsafe unsafe4;
        int i29;
        int i30;
        Object obj5;
        f2 f2Var2 = this;
        Object obj6 = obj;
        byte[] bArr2 = bArr;
        int i31 = i10;
        com.google.android.gms.internal.clearcut.l lVar2 = lVar;
        Unsafe unsafe5 = o;
        int i32 = i7;
        int i33 = -1;
        int i34 = 0;
        int i35 = 0;
        int i36 = 1048575;
        int i37 = 0;
        while (true) {
            int[] iArr2 = f2Var2.a;
            if (i32 < i31) {
                int i38 = i32 + 1;
                int i39 = bArr2[i32];
                if (i39 < 0) {
                    i38 = e1.d(i39, bArr2, i38, lVar2);
                    i39 = lVar2.a;
                }
                int i40 = i39 >>> 3;
                int i41 = i38;
                int i42 = i39 & 7;
                int i43 = f2Var2.d;
                int i44 = f2Var2.c;
                int i45 = i39;
                if (i40 > i33) {
                    i14 = (i40 < i44 || i40 > i43) ? -1 : f2Var2.s(i40, i34 / 3);
                    i13 = 0;
                } else if (i40 < i44 || i40 > i43) {
                    i13 = 0;
                    i14 = -1;
                } else {
                    i13 = 0;
                    i14 = f2Var2.s(i40, 0);
                }
                if (i14 == -1) {
                    i12 = i36;
                    unsafe = unsafe5;
                    iArr = iArr2;
                    int i46 = i13;
                    i21 = i40;
                    i15 = i45;
                    f2Var = f2Var2;
                    obj2 = obj6;
                    i16 = i46;
                    i22 = i41;
                } else {
                    int i47 = iArr2[i14 + 1];
                    int i48 = (i47 & 267386880) >>> 20;
                    long j3 = i47 & 1048575;
                    if (i48 <= 17) {
                        int i49 = iArr2[i14 + 2];
                        int i50 = 1 << (i49 >>> 20);
                        int i51 = i49 & 1048575;
                        iArr = iArr2;
                        if (i51 != i36) {
                            i24 = i50;
                            if (i36 != 1048575) {
                                unsafe5.putInt(obj6, i36, i37);
                            }
                            i37 = unsafe5.getInt(obj6, i51);
                            i23 = i51;
                        } else {
                            i24 = i50;
                            i23 = i36;
                        }
                        switch (i48) {
                            case 0:
                                i15 = i45;
                                i25 = i40;
                                c10 = 65535;
                                i16 = i14;
                                unsafe2 = unsafe5;
                                i26 = i41;
                                if (i42 == 1) {
                                    unsafe3 = unsafe2;
                                    y2.c.d(obj6, j3, Double.longBitsToDouble(e1.u(i26, bArr)));
                                    obj4 = obj6;
                                    i27 = i26 + 8;
                                    i21 = i25;
                                    i31 = i10;
                                    f2Var = f2Var2;
                                    obj2 = obj4;
                                    i37 |= i24;
                                    unsafe = unsafe3;
                                    i32 = i27;
                                    bArr2 = bArr;
                                    lVar2 = lVar;
                                    i33 = i21;
                                    f2Var2 = f2Var;
                                    obj6 = obj2;
                                    i36 = i23;
                                    i35 = i15;
                                    i34 = i16;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i21 = i25;
                                f2Var = f2Var2;
                                unsafe = unsafe4;
                                i22 = i26;
                                i12 = i23;
                                obj2 = obj5;
                                break;
                            case 1:
                                i15 = i45;
                                i25 = i40;
                                c10 = 65535;
                                i16 = i14;
                                unsafe2 = unsafe5;
                                i26 = i41;
                                if (i42 == 5) {
                                    y2.c.e(obj6, j3, Float.intBitsToFloat(e1.a(i26, bArr)));
                                    i28 = i26 + 4;
                                    int i52 = i28;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i27 = i52;
                                    i21 = i25;
                                    i31 = i10;
                                    f2Var = f2Var2;
                                    obj2 = obj4;
                                    i37 |= i24;
                                    unsafe = unsafe3;
                                    i32 = i27;
                                    bArr2 = bArr;
                                    lVar2 = lVar;
                                    i33 = i21;
                                    f2Var2 = f2Var;
                                    obj6 = obj2;
                                    i36 = i23;
                                    i35 = i15;
                                    i34 = i16;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i21 = i25;
                                f2Var = f2Var2;
                                unsafe = unsafe4;
                                i22 = i26;
                                i12 = i23;
                                obj2 = obj5;
                                break;
                            case 2:
                            case 3:
                                i15 = i45;
                                i25 = i40;
                                c10 = 65535;
                                i16 = i14;
                                unsafe2 = unsafe5;
                                i26 = i41;
                                if (i42 == 0) {
                                    i28 = e1.t(bArr, i26, lVar2);
                                    unsafe2.putLong(obj6, j3, lVar2.b);
                                    int i522 = i28;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i27 = i522;
                                    i21 = i25;
                                    i31 = i10;
                                    f2Var = f2Var2;
                                    obj2 = obj4;
                                    i37 |= i24;
                                    unsafe = unsafe3;
                                    i32 = i27;
                                    bArr2 = bArr;
                                    lVar2 = lVar;
                                    i33 = i21;
                                    f2Var2 = f2Var;
                                    obj6 = obj2;
                                    i36 = i23;
                                    i35 = i15;
                                    i34 = i16;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i21 = i25;
                                f2Var = f2Var2;
                                unsafe = unsafe4;
                                i22 = i26;
                                i12 = i23;
                                obj2 = obj5;
                                break;
                            case 4:
                            case 11:
                                i15 = i45;
                                i25 = i40;
                                c10 = 65535;
                                i16 = i14;
                                unsafe2 = unsafe5;
                                i26 = i41;
                                if (i42 == 0) {
                                    i28 = e1.j(bArr, i26, lVar2);
                                    unsafe2.putInt(obj6, j3, lVar2.a);
                                    int i5222 = i28;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i27 = i5222;
                                    i21 = i25;
                                    i31 = i10;
                                    f2Var = f2Var2;
                                    obj2 = obj4;
                                    i37 |= i24;
                                    unsafe = unsafe3;
                                    i32 = i27;
                                    bArr2 = bArr;
                                    lVar2 = lVar;
                                    i33 = i21;
                                    f2Var2 = f2Var;
                                    obj6 = obj2;
                                    i36 = i23;
                                    i35 = i15;
                                    i34 = i16;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i21 = i25;
                                f2Var = f2Var2;
                                unsafe = unsafe4;
                                i22 = i26;
                                i12 = i23;
                                obj2 = obj5;
                                break;
                            case 5:
                            case 14:
                                i15 = i45;
                                i25 = i40;
                                c10 = 65535;
                                i16 = i14;
                                unsafe2 = unsafe5;
                                if (i42 != 1) {
                                    i26 = i41;
                                    unsafe4 = unsafe2;
                                    obj5 = obj6;
                                    i21 = i25;
                                    f2Var = f2Var2;
                                    unsafe = unsafe4;
                                    i22 = i26;
                                    i12 = i23;
                                    obj2 = obj5;
                                    break;
                                } else {
                                    unsafe2.putLong(obj6, j3, e1.u(i41, bArr));
                                    i28 = i41 + 8;
                                    int i52222 = i28;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i27 = i52222;
                                    i21 = i25;
                                    i31 = i10;
                                    f2Var = f2Var2;
                                    obj2 = obj4;
                                    i37 |= i24;
                                    unsafe = unsafe3;
                                    i32 = i27;
                                    bArr2 = bArr;
                                    lVar2 = lVar;
                                    i33 = i21;
                                    f2Var2 = f2Var;
                                    obj6 = obj2;
                                    i36 = i23;
                                    i35 = i15;
                                    i34 = i16;
                                    unsafe5 = unsafe;
                                }
                            case 6:
                            case 13:
                                i15 = i45;
                                i25 = i40;
                                i29 = i41;
                                c10 = 65535;
                                i16 = i14;
                                unsafe2 = unsafe5;
                                if (i42 == 5) {
                                    unsafe2.putInt(obj6, j3, e1.a(i29, bArr));
                                    i28 = i29 + 4;
                                    int i522222 = i28;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i27 = i522222;
                                    i21 = i25;
                                    i31 = i10;
                                    f2Var = f2Var2;
                                    obj2 = obj4;
                                    i37 |= i24;
                                    unsafe = unsafe3;
                                    i32 = i27;
                                    bArr2 = bArr;
                                    lVar2 = lVar;
                                    i33 = i21;
                                    f2Var2 = f2Var;
                                    obj6 = obj2;
                                    i36 = i23;
                                    i35 = i15;
                                    i34 = i16;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i26 = i29;
                                i21 = i25;
                                f2Var = f2Var2;
                                unsafe = unsafe4;
                                i22 = i26;
                                i12 = i23;
                                obj2 = obj5;
                                break;
                            case 7:
                                i15 = i45;
                                i25 = i40;
                                i29 = i41;
                                c10 = 65535;
                                i16 = i14;
                                unsafe2 = unsafe5;
                                if (i42 == 0) {
                                    i28 = e1.t(bArr, i29, lVar2);
                                    y2.c.g(obj6, j3, lVar2.b != 0);
                                    int i5222222 = i28;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i27 = i5222222;
                                    i21 = i25;
                                    i31 = i10;
                                    f2Var = f2Var2;
                                    obj2 = obj4;
                                    i37 |= i24;
                                    unsafe = unsafe3;
                                    i32 = i27;
                                    bArr2 = bArr;
                                    lVar2 = lVar;
                                    i33 = i21;
                                    f2Var2 = f2Var;
                                    obj6 = obj2;
                                    i36 = i23;
                                    i35 = i15;
                                    i34 = i16;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i26 = i29;
                                i21 = i25;
                                f2Var = f2Var2;
                                unsafe = unsafe4;
                                i22 = i26;
                                i12 = i23;
                                obj2 = obj5;
                                break;
                            case 8:
                                i15 = i45;
                                i25 = i40;
                                i29 = i41;
                                c10 = 65535;
                                i16 = i14;
                                unsafe2 = unsafe5;
                                if (i42 == 2) {
                                    i28 = (i47 & TLObject.FLAG_29) == 0 ? e1.w(bArr, i29, lVar2) : e1.x(bArr, i29, lVar2);
                                    unsafe2.putObject(obj6, j3, lVar2.c);
                                    int i52222222 = i28;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i27 = i52222222;
                                    i21 = i25;
                                    i31 = i10;
                                    f2Var = f2Var2;
                                    obj2 = obj4;
                                    i37 |= i24;
                                    unsafe = unsafe3;
                                    i32 = i27;
                                    bArr2 = bArr;
                                    lVar2 = lVar;
                                    i33 = i21;
                                    f2Var2 = f2Var;
                                    obj6 = obj2;
                                    i36 = i23;
                                    i35 = i15;
                                    i34 = i16;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i26 = i29;
                                i21 = i25;
                                f2Var = f2Var2;
                                unsafe = unsafe4;
                                i22 = i26;
                                i12 = i23;
                                obj2 = obj5;
                                break;
                            case 9:
                                i15 = i45;
                                i25 = i40;
                                i29 = i41;
                                c10 = 65535;
                                i16 = i14;
                                unsafe2 = unsafe5;
                                if (i42 == 2) {
                                    int g10 = e1.g(f2Var2.l(i16), bArr, i29, i10, lVar2);
                                    if ((i37 & i24) == 0) {
                                        unsafe2.putObject(obj6, j3, lVar2.c);
                                    } else {
                                        unsafe2.putObject(obj6, j3, j1.b(unsafe2.getObject(obj6, j3), lVar2.c));
                                    }
                                    i30 = g10;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i27 = i30;
                                    i21 = i25;
                                    i31 = i10;
                                    f2Var = f2Var2;
                                    obj2 = obj4;
                                    i37 |= i24;
                                    unsafe = unsafe3;
                                    i32 = i27;
                                    bArr2 = bArr;
                                    lVar2 = lVar;
                                    i33 = i21;
                                    f2Var2 = f2Var;
                                    obj6 = obj2;
                                    i36 = i23;
                                    i35 = i15;
                                    i34 = i16;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i26 = i29;
                                i21 = i25;
                                f2Var = f2Var2;
                                unsafe = unsafe4;
                                i22 = i26;
                                i12 = i23;
                                obj2 = obj5;
                                break;
                            case 10:
                                i15 = i45;
                                i25 = i40;
                                i29 = i41;
                                c10 = 65535;
                                i16 = i14;
                                unsafe2 = unsafe5;
                                if (i42 == 2) {
                                    i28 = e1.z(bArr, i29, lVar2);
                                    unsafe2.putObject(obj6, j3, lVar2.c);
                                    int i522222222 = i28;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i27 = i522222222;
                                    i21 = i25;
                                    i31 = i10;
                                    f2Var = f2Var2;
                                    obj2 = obj4;
                                    i37 |= i24;
                                    unsafe = unsafe3;
                                    i32 = i27;
                                    bArr2 = bArr;
                                    lVar2 = lVar;
                                    i33 = i21;
                                    f2Var2 = f2Var;
                                    obj6 = obj2;
                                    i36 = i23;
                                    i35 = i15;
                                    i34 = i16;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i26 = i29;
                                i21 = i25;
                                f2Var = f2Var2;
                                unsafe = unsafe4;
                                i22 = i26;
                                i12 = i23;
                                obj2 = obj5;
                                break;
                            case 12:
                                i15 = i45;
                                i25 = i40;
                                i29 = i41;
                                c10 = 65535;
                                i16 = i14;
                                unsafe2 = unsafe5;
                                if (i42 == 0) {
                                    i28 = e1.j(bArr, i29, lVar2);
                                    int i53 = lVar2.a;
                                    k1 x10 = f2Var2.x(i16);
                                    if (x10 == null || x10.zza(i53)) {
                                        unsafe2.putInt(obj6, j3, i53);
                                        int i5222222222 = i28;
                                        unsafe3 = unsafe2;
                                        obj4 = obj6;
                                        i27 = i5222222222;
                                        i21 = i25;
                                        i31 = i10;
                                        f2Var = f2Var2;
                                        obj2 = obj4;
                                        i37 |= i24;
                                        unsafe = unsafe3;
                                        i32 = i27;
                                        bArr2 = bArr;
                                        lVar2 = lVar;
                                        i33 = i21;
                                        f2Var2 = f2Var;
                                        obj6 = obj2;
                                        i36 = i23;
                                        i35 = i15;
                                        i34 = i16;
                                        unsafe5 = unsafe;
                                    } else {
                                        C(obj6).a(i15, Long.valueOf(i53));
                                        i21 = i25;
                                        f2Var = f2Var2;
                                        unsafe = unsafe2;
                                        i32 = i28;
                                        i31 = i10;
                                        obj2 = obj6;
                                        bArr2 = bArr;
                                        lVar2 = lVar;
                                        i33 = i21;
                                        f2Var2 = f2Var;
                                        obj6 = obj2;
                                        i36 = i23;
                                        i35 = i15;
                                        i34 = i16;
                                        unsafe5 = unsafe;
                                    }
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i26 = i29;
                                i21 = i25;
                                f2Var = f2Var2;
                                unsafe = unsafe4;
                                i22 = i26;
                                i12 = i23;
                                obj2 = obj5;
                                break;
                            case 15:
                                i15 = i45;
                                i25 = i40;
                                i29 = i41;
                                c10 = 65535;
                                i16 = i14;
                                unsafe2 = unsafe5;
                                if (i42 == 0) {
                                    i28 = e1.j(bArr, i29, lVar2);
                                    unsafe2.putInt(obj6, j3, e1.y(lVar2.a));
                                    int i52222222222 = i28;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i27 = i52222222222;
                                    i21 = i25;
                                    i31 = i10;
                                    f2Var = f2Var2;
                                    obj2 = obj4;
                                    i37 |= i24;
                                    unsafe = unsafe3;
                                    i32 = i27;
                                    bArr2 = bArr;
                                    lVar2 = lVar;
                                    i33 = i21;
                                    f2Var2 = f2Var;
                                    obj6 = obj2;
                                    i36 = i23;
                                    i35 = i15;
                                    i34 = i16;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i26 = i29;
                                i21 = i25;
                                f2Var = f2Var2;
                                unsafe = unsafe4;
                                i22 = i26;
                                i12 = i23;
                                obj2 = obj5;
                                break;
                            case 16:
                                i15 = i45;
                                i25 = i40;
                                com.google.android.gms.internal.clearcut.l lVar3 = lVar2;
                                i29 = i41;
                                c10 = 65535;
                                if (i42 != 0) {
                                    i16 = i14;
                                    unsafe2 = unsafe5;
                                    unsafe4 = unsafe2;
                                    obj5 = obj6;
                                    i26 = i29;
                                    i21 = i25;
                                    f2Var = f2Var2;
                                    unsafe = unsafe4;
                                    i22 = i26;
                                    i12 = i23;
                                    obj2 = obj5;
                                    break;
                                } else {
                                    i28 = e1.t(bArr, i29, lVar3);
                                    long j10 = lVar3.b;
                                    i16 = i14;
                                    unsafe2 = unsafe5;
                                    unsafe2.putLong(obj6, j3, (j10 >>> 1) ^ (-(j10 & 1)));
                                    int i522222222222 = i28;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i27 = i522222222222;
                                    i21 = i25;
                                    i31 = i10;
                                    f2Var = f2Var2;
                                    obj2 = obj4;
                                    i37 |= i24;
                                    unsafe = unsafe3;
                                    i32 = i27;
                                    bArr2 = bArr;
                                    lVar2 = lVar;
                                    i33 = i21;
                                    f2Var2 = f2Var;
                                    obj6 = obj2;
                                    i36 = i23;
                                    i35 = i15;
                                    i34 = i16;
                                    unsafe5 = unsafe;
                                }
                            case 17:
                                if (i42 != 3) {
                                    i15 = i45;
                                    i25 = i40;
                                    c10 = 65535;
                                    i16 = i14;
                                    obj5 = obj6;
                                    unsafe4 = unsafe5;
                                    i26 = i41;
                                    i21 = i25;
                                    f2Var = f2Var2;
                                    unsafe = unsafe4;
                                    i22 = i26;
                                    i12 = i23;
                                    obj2 = obj5;
                                    break;
                                } else {
                                    i15 = i45;
                                    i25 = i40;
                                    com.google.android.gms.internal.clearcut.l lVar4 = lVar2;
                                    c10 = 65535;
                                    i30 = e1.f(f2Var2.l(i14), bArr, i41, i10, (i40 << 3) | 4, lVar4);
                                    if ((i37 & i24) == 0) {
                                        unsafe5.putObject(obj6, j3, lVar4.c);
                                    } else {
                                        unsafe5.putObject(obj6, j3, j1.b(unsafe5.getObject(obj6, j3), lVar4.c));
                                    }
                                    i16 = i14;
                                    unsafe2 = unsafe5;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i27 = i30;
                                    i21 = i25;
                                    i31 = i10;
                                    f2Var = f2Var2;
                                    obj2 = obj4;
                                    i37 |= i24;
                                    unsafe = unsafe3;
                                    i32 = i27;
                                    bArr2 = bArr;
                                    lVar2 = lVar;
                                    i33 = i21;
                                    f2Var2 = f2Var;
                                    obj6 = obj2;
                                    i36 = i23;
                                    i35 = i15;
                                    i34 = i16;
                                    unsafe5 = unsafe;
                                }
                            default:
                                i15 = i45;
                                unsafe4 = unsafe5;
                                i25 = i40;
                                i26 = i41;
                                c10 = 65535;
                                i16 = i14;
                                obj5 = obj6;
                                i21 = i25;
                                f2Var = f2Var2;
                                unsafe = unsafe4;
                                i22 = i26;
                                i12 = i23;
                                obj2 = obj5;
                                break;
                        }
                    } else {
                        i15 = i45;
                        iArr = iArr2;
                        i16 = i14;
                        Object obj7 = obj6;
                        Unsafe unsafe6 = unsafe5;
                        if (i48 == 27) {
                            if (i42 == 2) {
                                o1 o1Var = (o1) unsafe6.getObject(obj7, j3);
                                if (!o1Var.zza()) {
                                    int size = o1Var.size();
                                    o1Var = o1Var.zza(size == 0 ? 10 : size << 1);
                                    unsafe6.putObject(obj7, j3, o1Var);
                                }
                                obj2 = obj;
                                i21 = i40;
                                i31 = i10;
                                i32 = e1.e(f2Var2.l(i16), i15, bArr, i41, i10, o1Var, lVar2);
                                unsafe = unsafe6;
                                i23 = i36;
                                f2Var = f2Var2;
                                bArr2 = bArr;
                                lVar2 = lVar;
                                i33 = i21;
                                f2Var2 = f2Var;
                                obj6 = obj2;
                                i36 = i23;
                                i35 = i15;
                                i34 = i16;
                                unsafe5 = unsafe;
                            } else {
                                obj3 = obj;
                                i17 = i40;
                                i12 = i36;
                                i20 = i41;
                                unsafe = unsafe6;
                                i19 = i15;
                                i18 = i37;
                            }
                        } else if (i48 <= 49) {
                            long j11 = i47;
                            i21 = i40;
                            unsafe = unsafe6;
                            i12 = i36;
                            i18 = i37;
                            h = f2Var2.i(obj, bArr, i41, i10, i15, i21, i42, i16, j11, i48, j3, lVar);
                            i15 = i15;
                            i16 = i16;
                            f2Var = f2Var2;
                            if (h == i41) {
                                obj2 = obj;
                                i22 = h;
                                i37 = i18;
                            } else {
                                obj2 = obj;
                                i31 = i10;
                                i32 = h;
                                bArr2 = bArr;
                                lVar2 = lVar;
                                i33 = i21;
                                f2Var2 = f2Var;
                                obj6 = obj2;
                                i35 = i15;
                                i34 = i16;
                                i36 = i12;
                                i37 = i18;
                                unsafe5 = unsafe;
                            }
                        } else {
                            obj3 = obj;
                            i17 = i40;
                            i12 = i36;
                            unsafe = unsafe6;
                            i18 = i37;
                            i19 = i15;
                            i20 = i41;
                            if (i48 != 50) {
                                i21 = i17;
                                h = f2Var2.h(obj3, bArr, i20, i10, i19, i21, i42, i47, i48, j3, i16, lVar);
                                f2Var = f2Var2;
                                obj2 = obj3;
                                i15 = i19;
                            } else if (i42 == 2) {
                                f2Var2.p(j3, obj3, i16);
                                throw null;
                            }
                        }
                        f2Var = f2Var2;
                        i21 = i17;
                        obj2 = obj3;
                        i22 = i20;
                        i15 = i19;
                        i37 = i18;
                    }
                }
                if (i15 != i11 || i11 == 0) {
                    i31 = i10;
                    i32 = e1.c(i15, bArr, i22, i10, C(obj2), lVar);
                    i23 = i12;
                    bArr2 = bArr;
                    lVar2 = lVar;
                    i33 = i21;
                    f2Var2 = f2Var;
                    obj6 = obj2;
                    i36 = i23;
                    i35 = i15;
                    i34 = i16;
                    unsafe5 = unsafe;
                } else {
                    i31 = i10;
                    i32 = i22;
                    i35 = i15;
                }
            } else {
                i12 = i36;
                unsafe = unsafe5;
                iArr = iArr2;
                f2Var = f2Var2;
                obj2 = obj6;
            }
        }
        int i54 = i12;
        if (i54 != 1048575) {
            unsafe.putInt(obj2, i54, i37);
        }
        for (int i55 = f2Var.h; i55 < f2Var.i; i55++) {
            int i56 = f2Var.g[i55];
            int i57 = iArr[i56];
            Object l10 = y2.l(obj2, f2Var.z(i56) & 1048575);
            if (l10 != null && f2Var.x(i56) != null) {
                f2Var.m.getClass();
                if (f2Var.t(i56) == null) {
                    throw new NoSuchMethodError();
                }
                throw new ClassCastException();
            }
        }
        if (i11 == 0) {
            if (i32 != i31) {
                throw new n1("Failed to parse the message.");
            }
        } else if (i32 > i31 || i35 != i11) {
            throw new n1("Failed to parse the message.");
        }
        return i32;
    }

    public final o2 l(int i7) {
        int i10 = (i7 / 3) << 1;
        Object[] objArr = this.b;
        o2 o2Var = (o2) objArr[i10];
        if (o2Var != null) {
            return o2Var;
        }
        o2 a10 = l2.c.a((Class) objArr[i10 + 1]);
        objArr[i10] = a10;
        return a10;
    }

    public final void o(int i7, Object obj, Object obj2) {
        long z10 = z(i7) & 1048575;
        if (r(i7, obj2)) {
            Object l10 = y2.l(obj, z10);
            Object l11 = y2.l(obj2, z10);
            if (l10 != null && l11 != null) {
                y2.d(obj, z10, j1.b(l10, l11));
                u(i7, obj);
            } else if (l11 != null) {
                y2.d(obj, z10, l11);
                u(i7, obj);
            }
        }
    }

    public final void p(long j3, Object obj, int i7) {
        a2 a2Var;
        Unsafe unsafe = o;
        Object t6 = t(i7);
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
        if (t6 != null) {
            throw new ClassCastException();
        }
        throw new NoSuchMethodError();
    }

    public final boolean q(int i7, int i10, Object obj) {
        return y2.c.k(obj, (long) (this.a[i10 + 2] & 1048575)) == i7;
    }

    public final boolean r(int i7, Object obj) {
        int i10 = this.a[i7 + 2];
        long j3 = i10 & 1048575;
        if (j3 == 1048575) {
            int z10 = z(i7);
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
                    Object l10 = y2.l(obj, j10);
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
        } else if (((1 << (i10 >>> 20)) & y2.c.k(obj, j3)) == 0) {
            return false;
        }
        return true;
    }

    public final int s(int i7, int i10) {
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

    public final Object t(int i7) {
        return this.b[(i7 / 3) << 1];
    }

    public final void u(int i7, Object obj) {
        int i10 = this.a[i7 + 2];
        long j3 = 1048575 & i10;
        if (j3 == 1048575) {
            return;
        }
        y2.c(j3, obj, (1 << (i10 >>> 20)) | y2.c.k(obj, j3));
    }

    public final void v(int i7, Object obj, Object obj2) {
        int z10 = z(i7);
        int i10 = this.a[i7];
        long j3 = z10 & 1048575;
        if (q(i10, i7, obj2)) {
            Object l10 = q(i10, i7, obj) ? y2.l(obj, j3) : null;
            Object l11 = y2.l(obj2, j3);
            if (l10 != null && l11 != null) {
                y2.d(obj, j3, j1.b(l10, l11));
                y2.c(r1[i7 + 2] & 1048575, obj, i10);
            } else if (l11 != null) {
                y2.d(obj, j3, l11);
                y2.c(r1[i7 + 2] & 1048575, obj, i10);
            }
        }
    }

    public final void w(Object obj, y1 y1Var) {
        int i7;
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
                i7 = 1048575;
                int i18 = i17 & 1048575;
                if (i18 != i12) {
                    i13 = unsafe.getInt(obj, i18);
                    i12 = i18;
                }
                i10 = 1 << (i17 >>> 20);
            } else {
                i7 = 1048575;
                i10 = 0;
            }
            int i19 = i14;
            long j3 = z10 & i7;
            switch (i16) {
                case 0:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        double j10 = y2.c.j(obj, j3);
                        r0 r0Var = (r0) y1Var.a;
                        r0Var.getClass();
                        long doubleToRawLongBits = Double.doubleToRawLongBits(j10);
                        r0Var.D(i15, 1);
                        r0Var.K(doubleToRawLongBits);
                        continue;
                    }
                case 1:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        float i20 = y2.c.i(obj, j3);
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
                        long j11 = unsafe.getLong(obj, j3);
                        r0 r0Var3 = (r0) y1Var.a;
                        r0Var3.D(i15, 0);
                        r0Var3.E(j11);
                    } else {
                        continue;
                    }
                case 3:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        long j12 = unsafe.getLong(obj, j3);
                        r0 r0Var4 = (r0) y1Var.a;
                        r0Var4.D(i15, 0);
                        r0Var4.E(j12);
                    } else {
                        continue;
                    }
                case 4:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        int i21 = unsafe.getInt(obj, j3);
                        r0 r0Var5 = (r0) y1Var.a;
                        r0Var5.D(i15, 0);
                        r0Var5.C(i21);
                    }
                    break;
                case 5:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        long j13 = unsafe.getLong(obj, j3);
                        r0 r0Var6 = (r0) y1Var.a;
                        r0Var6.D(i15, 1);
                        r0Var6.K(j13);
                        break;
                    }
                    break;
                case 6:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        int i22 = unsafe.getInt(obj, j3);
                        r0 r0Var7 = (r0) y1Var.a;
                        r0Var7.D(i15, 5);
                        r0Var7.M(i22);
                        break;
                    }
                    break;
                case 7:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        boolean h = y2.c.h(obj, j3);
                        r0 r0Var8 = (r0) y1Var.a;
                        r0Var8.D(i15, 0);
                        r0Var8.B(h ? (byte) 1 : (byte) 0);
                        break;
                    }
                    break;
                case 8:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        n(i15, unsafe.getObject(obj, j3), y1Var);
                        break;
                    }
                    break;
                case 9:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        y1Var.b(i15, unsafe.getObject(obj, j3), l(i11));
                        break;
                    }
                    break;
                case 10:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        y1Var.a(i15, (q0) unsafe.getObject(obj, j3));
                        break;
                    }
                    break;
                case 11:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        int i23 = unsafe.getInt(obj, j3);
                        r0 r0Var9 = (r0) y1Var.a;
                        r0Var9.D(i15, 0);
                        r0Var9.H(i23);
                        break;
                    }
                    break;
                case 12:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        int i24 = unsafe.getInt(obj, j3);
                        r0 r0Var10 = (r0) y1Var.a;
                        r0Var10.D(i15, 0);
                        r0Var10.C(i24);
                    }
                    break;
                case 13:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        int i25 = unsafe.getInt(obj, j3);
                        r0 r0Var11 = (r0) y1Var.a;
                        r0Var11.D(i15, 5);
                        r0Var11.M(i25);
                        break;
                    }
                    break;
                case 14:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        long j14 = unsafe.getLong(obj, j3);
                        r0 r0Var12 = (r0) y1Var.a;
                        r0Var12.D(i15, 1);
                        r0Var12.K(j14);
                        break;
                    }
                    break;
                case 15:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        int i26 = unsafe.getInt(obj, j3);
                        r0 r0Var13 = (r0) y1Var.a;
                        r0Var13.D(i15, 0);
                        r0Var13.H((i26 >> 31) ^ (i26 << 1));
                        break;
                    }
                    break;
                case 16:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        long j15 = unsafe.getLong(obj, j3);
                        r0 r0Var14 = (r0) y1Var.a;
                        r0Var14.D(i15, 0);
                        r0Var14.E((j15 << 1) ^ (j15 >> 63));
                        break;
                    }
                    break;
                case 17:
                    i11 = i19;
                    if ((i10 & i13) != 0) {
                        y1Var.c(i15, unsafe.getObject(obj, j3), l(i11));
                        break;
                    }
                    break;
                case 18:
                    i11 = i19;
                    p2.g(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, false);
                    break;
                case 19:
                    i11 = i19;
                    p2.n(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, false);
                    continue;
                case 20:
                    i11 = i19;
                    p2.q(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, false);
                    continue;
                case 21:
                    i11 = i19;
                    p2.s(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, false);
                    continue;
                case 22:
                    i11 = i19;
                    p2.B(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, false);
                    continue;
                case 23:
                    i11 = i19;
                    p2.w(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, false);
                    continue;
                case 24:
                    i11 = i19;
                    p2.G(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, false);
                    continue;
                case 25:
                    i11 = i19;
                    p2.J(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, false);
                    continue;
                case 26:
                    i11 = i19;
                    p2.e(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var);
                    break;
                case 27:
                    i11 = i19;
                    p2.f(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, l(i11));
                    break;
                case 28:
                    i11 = i19;
                    p2.l(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var);
                    break;
                case 29:
                    i11 = i19;
                    p2.E(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, false);
                    break;
                case ks.T /* 30 */:
                    i11 = i19;
                    p2.I(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, false);
                    continue;
                case ks.U /* 31 */:
                    i11 = i19;
                    p2.H(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, false);
                    continue;
                case 32:
                    i11 = i19;
                    p2.y(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, false);
                    continue;
                case 33:
                    i11 = i19;
                    p2.F(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, false);
                    continue;
                case 34:
                    i11 = i19;
                    p2.u(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, false);
                    continue;
                case 35:
                    i11 = i19;
                    p2.g(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, true);
                    break;
                case 36:
                    i11 = i19;
                    p2.n(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, true);
                    break;
                case 37:
                    i11 = i19;
                    p2.q(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, true);
                    break;
                case 38:
                    i11 = i19;
                    p2.s(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, true);
                    break;
                case 39:
                    i11 = i19;
                    p2.B(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, true);
                    break;
                case 40:
                    i11 = i19;
                    p2.w(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, true);
                    break;
                case 41:
                    i11 = i19;
                    p2.G(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, true);
                    break;
                case 42:
                    i11 = i19;
                    p2.J(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, true);
                    break;
                case 43:
                    i11 = i19;
                    p2.E(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, true);
                    break;
                case 44:
                    i11 = i19;
                    p2.I(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, true);
                    break;
                case 45:
                    i11 = i19;
                    p2.H(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, true);
                    break;
                case 46:
                    i11 = i19;
                    p2.y(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, true);
                    break;
                case 47:
                    i11 = i19;
                    p2.F(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, true);
                    break;
                case 48:
                    i11 = i19;
                    p2.u(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, true);
                    break;
                case 49:
                    i11 = i19;
                    p2.m(iArr[i11], (List) unsafe.getObject(obj, j3), y1Var, l(i11));
                    break;
                case 50:
                    i11 = i19;
                    if (unsafe.getObject(obj, j3) != null) {
                        Object t6 = t(i11);
                        this.m.getClass();
                        if (t6 != null) {
                            throw new ClassCastException();
                        }
                        throw new NoSuchMethodError();
                    }
                    break;
                case ks.o0 /* 51 */:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        double doubleValue = ((Double) y2.l(obj, j3)).doubleValue();
                        r0 r0Var15 = (r0) y1Var.a;
                        r0Var15.getClass();
                        long doubleToRawLongBits2 = Double.doubleToRawLongBits(doubleValue);
                        r0Var15.D(i15, 1);
                        r0Var15.K(doubleToRawLongBits2);
                        break;
                    }
                    break;
                case ks.p0 /* 52 */:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        float floatValue = ((Float) y2.l(obj, j3)).floatValue();
                        r0 r0Var16 = (r0) y1Var.a;
                        r0Var16.getClass();
                        int floatToRawIntBits2 = Float.floatToRawIntBits(floatValue);
                        r0Var16.D(i15, 5);
                        r0Var16.M(floatToRawIntBits2);
                        break;
                    }
                    break;
                case ks.q0 /* 53 */:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        long B = B(obj, j3);
                        r0 r0Var17 = (r0) y1Var.a;
                        r0Var17.D(i15, 0);
                        r0Var17.E(B);
                        break;
                    }
                    break;
                case ks.r0 /* 54 */:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        long B2 = B(obj, j3);
                        r0 r0Var18 = (r0) y1Var.a;
                        r0Var18.D(i15, 0);
                        r0Var18.E(B2);
                    } else {
                        continue;
                    }
                case ks.s0 /* 55 */:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        int A = A(obj, j3);
                        r0 r0Var19 = (r0) y1Var.a;
                        r0Var19.D(i15, 0);
                        r0Var19.C(A);
                    }
                    break;
                case ks.t0 /* 56 */:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        long B3 = B(obj, j3);
                        r0 r0Var20 = (r0) y1Var.a;
                        r0Var20.D(i15, 1);
                        r0Var20.K(B3);
                        break;
                    }
                    break;
                case ks.u0 /* 57 */:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        int A2 = A(obj, j3);
                        r0 r0Var21 = (r0) y1Var.a;
                        r0Var21.D(i15, 5);
                        r0Var21.M(A2);
                        break;
                    }
                    break;
                case ks.v0 /* 58 */:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        boolean booleanValue = ((Boolean) y2.l(obj, j3)).booleanValue();
                        r0 r0Var22 = (r0) y1Var.a;
                        r0Var22.D(i15, 0);
                        r0Var22.B(booleanValue ? (byte) 1 : (byte) 0);
                        break;
                    }
                    break;
                case ks.w0 /* 59 */:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        n(i15, unsafe.getObject(obj, j3), y1Var);
                        break;
                    }
                    break;
                case ks.x0 /* 60 */:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        y1Var.b(i15, unsafe.getObject(obj, j3), l(i11));
                        break;
                    }
                    break;
                case ks.y0 /* 61 */:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        y1Var.a(i15, (q0) unsafe.getObject(obj, j3));
                        break;
                    }
                    break;
                case ks.z0 /* 62 */:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        int A3 = A(obj, j3);
                        r0 r0Var23 = (r0) y1Var.a;
                        r0Var23.D(i15, 0);
                        r0Var23.H(A3);
                        break;
                    }
                    break;
                case ks.A0 /* 63 */:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        int A4 = A(obj, j3);
                        r0 r0Var24 = (r0) y1Var.a;
                        r0Var24.D(i15, 0);
                        r0Var24.C(A4);
                    }
                    break;
                case 64:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        int A5 = A(obj, j3);
                        r0 r0Var25 = (r0) y1Var.a;
                        r0Var25.D(i15, 5);
                        r0Var25.M(A5);
                        break;
                    }
                    break;
                case 65:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        long B4 = B(obj, j3);
                        r0 r0Var26 = (r0) y1Var.a;
                        r0Var26.D(i15, 1);
                        r0Var26.K(B4);
                        break;
                    }
                    break;
                case ks.D0 /* 66 */:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        int A6 = A(obj, j3);
                        r0 r0Var27 = (r0) y1Var.a;
                        r0Var27.D(i15, 0);
                        r0Var27.H((A6 >> 31) ^ (A6 << 1));
                        break;
                    }
                    break;
                case ks.E0 /* 67 */:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        long B5 = B(obj, j3);
                        r0 r0Var28 = (r0) y1Var.a;
                        r0Var28.D(i15, 0);
                        r0Var28.E((B5 << 1) ^ (B5 >> 63));
                        break;
                    }
                    break;
                case ks.F0 /* 68 */:
                    i11 = i19;
                    if (q(i15, i11, obj)) {
                        y1Var.c(i15, unsafe.getObject(obj, j3), l(i11));
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

    public final k1 x(int i7) {
        return (k1) this.b[((i7 / 3) << 1) + 1];
    }

    public final boolean y(f1 f1Var, f1 f1Var2, int i7) {
        return r(i7, f1Var) == r(i7, f1Var2);
    }

    public final int z(int i7) {
        return this.a[i7 + 1];
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
        int i7;
        int i10;
        char c10;
        char c11;
        int O;
        int T;
        int G;
        int J;
        char c12;
        int i11;
        int T2;
        int G2;
        int J2;
        int T3;
        int O2;
        int N;
        int i12;
        boolean z10 = this.f;
        q2 q2Var2 = this.l;
        b2 b2Var = this.m;
        int i13 = 267386880;
        int i14 = 1048575;
        int[] iArr = this.a;
        int i15 = 1;
        if (z10) {
            Unsafe unsafe = o;
            int i16 = 0;
            int i17 = 0;
            while (i16 < iArr.length) {
                int z11 = z(i16);
                int i18 = (z11 & i13) >>> 20;
                int i19 = i13;
                int i20 = iArr[i16];
                int i21 = i14;
                int[] iArr2 = iArr;
                long j3 = z11 & i14;
                if (i18 >= x0.b.a && i18 <= x0.c.a) {
                    int i22 = iArr2[i16 + 2];
                }
                switch (i18) {
                    case 0:
                        if (r(i16, obj)) {
                            i17 = a8.p0.D(i20 << 3, 8, i17);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (r(i16, obj)) {
                            i17 = a8.p0.D(i20 << 3, 4, i17);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (r(i16, obj)) {
                            long l10 = y2.c.l(obj, j3);
                            T3 = r0.T(i20 << 3);
                            O2 = r0.O(l10);
                            i17 += O2 + T3;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (r(i16, obj)) {
                            N = r0.N(i20, y2.c.l(obj, j3));
                            i17 += N;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (r(i16, obj)) {
                            int k10 = y2.c.k(obj, j3);
                            T3 = r0.T(i20 << 3);
                            O2 = r0.P(k10);
                            i17 += O2 + T3;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (r(i16, obj)) {
                            N = r0.R(i20);
                            i17 += N;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (r(i16, obj)) {
                            N = r0.V(i20);
                            i17 += N;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (r(i16, obj)) {
                            i17 = a8.p0.D(i20 << 3, 1, i17);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (r(i16, obj)) {
                            Object l11 = y2.l(obj, j3);
                            if (l11 instanceof q0) {
                                N = r0.J(i20, (q0) l11);
                                i17 += N;
                                break;
                            } else {
                                T3 = r0.T(i20 << 3);
                                O2 = r0.G((String) l11);
                                i17 += O2 + T3;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (r(i16, obj)) {
                            N = p2.a(i20, y2.l(obj, j3), l(i16));
                            i17 += N;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (r(i16, obj)) {
                            N = r0.J(i20, (q0) y2.l(obj, j3));
                            i17 += N;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (r(i16, obj)) {
                            N = r0.S(i20, y2.c.k(obj, j3));
                            i17 += N;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (r(i16, obj)) {
                            int k11 = y2.c.k(obj, j3);
                            T3 = r0.T(i20 << 3);
                            O2 = r0.P(k11);
                            i17 += O2 + T3;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (r(i16, obj)) {
                            i17 = a8.p0.D(i20 << 3, 4, i17);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (r(i16, obj)) {
                            i17 = a8.p0.D(i20 << 3, 8, i17);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (r(i16, obj)) {
                            N = r0.U(i20, y2.c.k(obj, j3));
                            i17 += N;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (r(i16, obj)) {
                            N = r0.Q(i20, y2.c.l(obj, j3));
                            i17 += N;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (r(i16, obj)) {
                            N = r0.I(i20, (l0) y2.l(obj, j3), l(i16));
                            i17 += N;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        N = p2.C(i20, (List) y2.l(obj, j3));
                        i17 += N;
                        break;
                    case 19:
                        N = p2.z(i20, (List) y2.l(obj, j3));
                        i17 += N;
                        break;
                    case 20:
                        List list = (List) y2.l(obj, j3);
                        Class cls = p2.a;
                        if (list.size() != 0) {
                            N = e2.d(i20, list.size(), p2.c(list));
                            i17 += N;
                            break;
                        }
                        N = 0;
                        i17 += N;
                    case 21:
                        List list2 = (List) y2.l(obj, j3);
                        Class cls2 = p2.a;
                        int size = list2.size();
                        if (size != 0) {
                            N = e2.d(i20, size, p2.k(list2));
                            i17 += N;
                            break;
                        }
                        N = 0;
                        i17 += N;
                    case 22:
                        List list3 = (List) y2.l(obj, j3);
                        Class cls3 = p2.a;
                        int size2 = list3.size();
                        if (size2 != 0) {
                            N = e2.d(i20, size2, p2.t(list3));
                            i17 += N;
                            break;
                        }
                        N = 0;
                        i17 += N;
                    case 23:
                        N = p2.C(i20, (List) y2.l(obj, j3));
                        i17 += N;
                        break;
                    case 24:
                        N = p2.z(i20, (List) y2.l(obj, j3));
                        i17 += N;
                        break;
                    case 25:
                        List list4 = (List) y2.l(obj, j3);
                        Class cls4 = p2.a;
                        int size3 = list4.size();
                        if (size3 != 0) {
                            N = (r0.T(i20 << 3) + 1) * size3;
                            i17 += N;
                            break;
                        }
                        N = 0;
                        i17 += N;
                    case 26:
                        N = p2.j(i20, (List) y2.l(obj, j3));
                        i17 += N;
                        break;
                    case 27:
                        N = p2.b(i20, (List) y2.l(obj, j3), l(i16));
                        i17 += N;
                        break;
                    case 28:
                        N = p2.o(i20, (List) y2.l(obj, j3));
                        i17 += N;
                        break;
                    case 29:
                        List list5 = (List) y2.l(obj, j3);
                        Class cls5 = p2.a;
                        int size4 = list5.size();
                        if (size4 != 0) {
                            N = e2.d(i20, size4, p2.v(list5));
                            i17 += N;
                            break;
                        }
                        N = 0;
                        i17 += N;
                    case ks.T /* 30 */:
                        List list6 = (List) y2.l(obj, j3);
                        Class cls6 = p2.a;
                        int size5 = list6.size();
                        if (size5 != 0) {
                            N = e2.d(i20, size5, p2.r(list6));
                            i17 += N;
                            break;
                        }
                        N = 0;
                        i17 += N;
                    case ks.U /* 31 */:
                        N = p2.z(i20, (List) y2.l(obj, j3));
                        i17 += N;
                        break;
                    case 32:
                        N = p2.C(i20, (List) y2.l(obj, j3));
                        i17 += N;
                        break;
                    case 33:
                        List list7 = (List) y2.l(obj, j3);
                        Class cls7 = p2.a;
                        int size6 = list7.size();
                        if (size6 != 0) {
                            N = e2.d(i20, size6, p2.x(list7));
                            i17 += N;
                            break;
                        }
                        N = 0;
                        i17 += N;
                    case 34:
                        List list8 = (List) y2.l(obj, j3);
                        Class cls8 = p2.a;
                        int size7 = list8.size();
                        if (size7 != 0) {
                            N = e2.d(i20, size7, p2.p(list8));
                            i17 += N;
                            break;
                        }
                        N = 0;
                        i17 += N;
                    case 35:
                        int D = p2.D((List) unsafe.getObject(obj, j3));
                        if (D > 0) {
                            i17 = e2.e(D, r0.y(i20), D, i17);
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        int A = p2.A((List) unsafe.getObject(obj, j3));
                        if (A > 0) {
                            i17 = e2.e(A, r0.y(i20), A, i17);
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        int c13 = p2.c((List) unsafe.getObject(obj, j3));
                        if (c13 > 0) {
                            i17 = e2.e(c13, r0.y(i20), c13, i17);
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        int k12 = p2.k((List) unsafe.getObject(obj, j3));
                        if (k12 > 0) {
                            i17 = e2.e(k12, r0.y(i20), k12, i17);
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        int t6 = p2.t((List) unsafe.getObject(obj, j3));
                        if (t6 > 0) {
                            i17 = e2.e(t6, r0.y(i20), t6, i17);
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        int D2 = p2.D((List) unsafe.getObject(obj, j3));
                        if (D2 > 0) {
                            i17 = e2.e(D2, r0.y(i20), D2, i17);
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        int A2 = p2.A((List) unsafe.getObject(obj, j3));
                        if (A2 > 0) {
                            i17 = e2.e(A2, r0.y(i20), A2, i17);
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        List list9 = (List) unsafe.getObject(obj, j3);
                        Class cls9 = p2.a;
                        int size8 = list9.size();
                        if (size8 > 0) {
                            i17 = e2.e(size8, r0.y(i20), size8, i17);
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        int v = p2.v((List) unsafe.getObject(obj, j3));
                        if (v > 0) {
                            i17 = e2.e(v, r0.y(i20), v, i17);
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        int r10 = p2.r((List) unsafe.getObject(obj, j3));
                        if (r10 > 0) {
                            i17 = e2.e(r10, r0.y(i20), r10, i17);
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        int A3 = p2.A((List) unsafe.getObject(obj, j3));
                        if (A3 > 0) {
                            i17 = e2.e(A3, r0.y(i20), A3, i17);
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        int D3 = p2.D((List) unsafe.getObject(obj, j3));
                        if (D3 > 0) {
                            i17 = e2.e(D3, r0.y(i20), D3, i17);
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        int x10 = p2.x((List) unsafe.getObject(obj, j3));
                        if (x10 > 0) {
                            i17 = e2.e(x10, r0.y(i20), x10, i17);
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        int p10 = p2.p((List) unsafe.getObject(obj, j3));
                        if (p10 > 0) {
                            i17 = e2.e(p10, r0.y(i20), p10, i17);
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        List list10 = (List) y2.l(obj, j3);
                        o2 l12 = l(i16);
                        Class cls10 = p2.a;
                        int size9 = list10.size();
                        if (size9 == 0) {
                            i12 = 0;
                        } else {
                            i12 = 0;
                            for (int i23 = 0; i23 < size9; i23++) {
                                i12 = r0.I(i20, (l0) list10.get(i23), l12) + i12;
                            }
                        }
                        i17 = i12 + i17;
                        break;
                    case 50:
                        Object l13 = y2.l(obj, j3);
                        Object t10 = t(i16);
                        b2Var.getClass();
                        b2.b(l13, t10);
                        break;
                    case ks.o0 /* 51 */:
                        if (q(i20, i16, obj)) {
                            i17 = a8.p0.D(i20 << 3, 8, i17);
                            break;
                        } else {
                            break;
                        }
                    case ks.p0 /* 52 */:
                        if (q(i20, i16, obj)) {
                            i17 = a8.p0.D(i20 << 3, 4, i17);
                            break;
                        } else {
                            break;
                        }
                    case ks.q0 /* 53 */:
                        if (q(i20, i16, obj)) {
                            long B = B(obj, j3);
                            T3 = r0.T(i20 << 3);
                            O2 = r0.O(B);
                            i17 += O2 + T3;
                            break;
                        } else {
                            break;
                        }
                    case ks.r0 /* 54 */:
                        if (q(i20, i16, obj)) {
                            N = r0.N(i20, B(obj, j3));
                            i17 += N;
                            break;
                        } else {
                            break;
                        }
                    case ks.s0 /* 55 */:
                        if (q(i20, i16, obj)) {
                            int A4 = A(obj, j3);
                            T3 = r0.T(i20 << 3);
                            O2 = r0.P(A4);
                            i17 += O2 + T3;
                            break;
                        } else {
                            break;
                        }
                    case ks.t0 /* 56 */:
                        if (q(i20, i16, obj)) {
                            N = r0.R(i20);
                            i17 += N;
                            break;
                        } else {
                            break;
                        }
                    case ks.u0 /* 57 */:
                        if (q(i20, i16, obj)) {
                            N = r0.V(i20);
                            i17 += N;
                            break;
                        } else {
                            break;
                        }
                    case ks.v0 /* 58 */:
                        if (q(i20, i16, obj)) {
                            i17 = a8.p0.D(i20 << 3, 1, i17);
                            break;
                        } else {
                            break;
                        }
                    case ks.w0 /* 59 */:
                        if (q(i20, i16, obj)) {
                            Object l14 = y2.l(obj, j3);
                            if (l14 instanceof q0) {
                                N = r0.J(i20, (q0) l14);
                                i17 += N;
                                break;
                            } else {
                                T3 = r0.T(i20 << 3);
                                O2 = r0.G((String) l14);
                                i17 += O2 + T3;
                                break;
                            }
                        } else {
                            break;
                        }
                    case ks.x0 /* 60 */:
                        if (q(i20, i16, obj)) {
                            N = p2.a(i20, y2.l(obj, j3), l(i16));
                            i17 += N;
                            break;
                        } else {
                            break;
                        }
                    case ks.y0 /* 61 */:
                        if (q(i20, i16, obj)) {
                            N = r0.J(i20, (q0) y2.l(obj, j3));
                            i17 += N;
                            break;
                        } else {
                            break;
                        }
                    case ks.z0 /* 62 */:
                        if (q(i20, i16, obj)) {
                            N = r0.S(i20, A(obj, j3));
                            i17 += N;
                            break;
                        } else {
                            break;
                        }
                    case ks.A0 /* 63 */:
                        if (q(i20, i16, obj)) {
                            int A5 = A(obj, j3);
                            T3 = r0.T(i20 << 3);
                            O2 = r0.P(A5);
                            i17 += O2 + T3;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (q(i20, i16, obj)) {
                            i17 = a8.p0.D(i20 << 3, 4, i17);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (q(i20, i16, obj)) {
                            i17 = a8.p0.D(i20 << 3, 8, i17);
                            break;
                        } else {
                            break;
                        }
                    case ks.D0 /* 66 */:
                        if (q(i20, i16, obj)) {
                            N = r0.U(i20, A(obj, j3));
                            i17 += N;
                            break;
                        } else {
                            break;
                        }
                    case ks.E0 /* 67 */:
                        if (q(i20, i16, obj)) {
                            N = r0.Q(i20, B(obj, j3));
                            i17 += N;
                            break;
                        } else {
                            break;
                        }
                    case ks.F0 /* 68 */:
                        if (q(i20, i16, obj)) {
                            N = r0.I(i20, (l0) y2.l(obj, j3), l(i16));
                            i17 += N;
                            break;
                        } else {
                            break;
                        }
                }
                i16 += 3;
                i13 = i19;
                i14 = i21;
                iArr = iArr2;
            }
            q2Var2.getClass();
            return ((f1) obj).zzb.d() + i17;
        }
        Unsafe unsafe2 = o;
        int i24 = 1048575;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        while (i25 < iArr.length) {
            int z12 = z(i25);
            int i28 = iArr[i25];
            int i29 = (z12 & 267386880) >>> 20;
            int i30 = i15;
            if (i29 <= 17) {
                int i31 = iArr[i25 + 2];
                int i32 = i31 & 1048575;
                i7 = i30 << (i31 >>> 20);
                q2Var = q2Var2;
                if (i32 != i24) {
                    i27 = unsafe2.getInt(obj, i32);
                    i24 = i32;
                }
            } else {
                q2Var = q2Var2;
                i7 = 0;
            }
            long j10 = z12 & 1048575;
            switch (i29) {
                case 0:
                    i10 = i30;
                    c10 = 4;
                    if ((i27 & i7) != 0) {
                        c11 = '\b';
                        i26 = a8.p0.D(i28 << 3, 8, i26);
                        break;
                    }
                    c11 = '\b';
                    break;
                case 1:
                    i10 = i30;
                    if ((i27 & i7) != 0) {
                        c10 = 4;
                        i26 = a8.p0.D(i28 << 3, 4, i26);
                        c11 = '\b';
                        break;
                    }
                    c10 = 4;
                    c11 = '\b';
                case 2:
                    i10 = i30;
                    if ((i7 & i27) != 0) {
                        O = r0.O(unsafe2.getLong(obj, j10)) + r0.T(i28 << 3);
                        i26 += O;
                    }
                    c10 = 4;
                    c11 = '\b';
                    break;
                case 3:
                    i10 = i30;
                    if ((i7 & i27) != 0) {
                        O = r0.N(i28, unsafe2.getLong(obj, j10));
                        i26 += O;
                    }
                    c10 = 4;
                    c11 = '\b';
                    break;
                case 4:
                    i10 = i30;
                    if ((i7 & i27) != 0) {
                        O = r0.P(unsafe2.getInt(obj, j10)) + r0.T(i28 << 3);
                        i26 += O;
                    }
                    c10 = 4;
                    c11 = '\b';
                    break;
                case 5:
                    i10 = i30;
                    if ((i27 & i7) != 0) {
                        O = r0.R(i28);
                        i26 += O;
                    }
                    c10 = 4;
                    c11 = '\b';
                    break;
                case 6:
                    i10 = i30;
                    if ((i27 & i7) != 0) {
                        O = r0.V(i28);
                        i26 += O;
                    }
                    c10 = 4;
                    c11 = '\b';
                    break;
                case 7:
                    if ((i27 & i7) != 0) {
                        i10 = 1;
                        i26 = a8.p0.D(i28 << 3, 1, i26);
                    } else {
                        i10 = 1;
                    }
                    c10 = 4;
                    c11 = '\b';
                    break;
                case 8:
                    if ((i27 & i7) != 0) {
                        Object object = unsafe2.getObject(obj, j10);
                        if (object instanceof q0) {
                            J = r0.J(i28, (q0) object);
                            i26 += J;
                        } else {
                            T = r0.T(i28 << 3);
                            G = r0.G((String) object);
                            J = G + T;
                            i26 += J;
                        }
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 9:
                    if ((i27 & i7) != 0) {
                        J = p2.a(i28, unsafe2.getObject(obj, j10), l(i25));
                        i26 += J;
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 10:
                    if ((i27 & i7) != 0) {
                        J = r0.J(i28, (q0) unsafe2.getObject(obj, j10));
                        i26 += J;
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 11:
                    if ((i27 & i7) != 0) {
                        J = r0.S(i28, unsafe2.getInt(obj, j10));
                        i26 += J;
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 12:
                    if ((i27 & i7) != 0) {
                        int i33 = unsafe2.getInt(obj, j10);
                        T = r0.T(i28 << 3);
                        G = r0.P(i33);
                        J = G + T;
                        i26 += J;
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 13:
                    if ((i27 & i7) != 0) {
                        c10 = 4;
                        i26 = a8.p0.D(i28 << 3, 4, i26);
                        i10 = 1;
                        c11 = '\b';
                        break;
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                case 14:
                    if ((i27 & i7) != 0) {
                        c12 = '\b';
                        i26 = a8.p0.D(i28 << 3, 8, i26);
                        c11 = c12;
                        c10 = 4;
                        i10 = 1;
                        break;
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 15:
                    if ((i27 & i7) != 0) {
                        J = r0.U(i28, unsafe2.getInt(obj, j10));
                        i26 += J;
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 16:
                    if ((i27 & i7) != 0) {
                        J = r0.Q(i28, unsafe2.getLong(obj, j10));
                        i26 += J;
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 17:
                    if ((i27 & i7) != 0) {
                        J = r0.I(i28, (l0) unsafe2.getObject(obj, j10), l(i25));
                        i26 += J;
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 18:
                    J = p2.C(i28, (List) unsafe2.getObject(obj, j10));
                    i26 += J;
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 19:
                    J = p2.z(i28, (List) unsafe2.getObject(obj, j10));
                    i26 += J;
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 20:
                    List list11 = (List) unsafe2.getObject(obj, j10);
                    Class cls11 = p2.a;
                    if (list11.size() != 0) {
                        J = e2.d(i28, list11.size(), p2.c(list11));
                        i26 += J;
                        c10 = 4;
                        i10 = 1;
                        c11 = '\b';
                        break;
                    }
                    J = 0;
                    i26 += J;
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                case 21:
                    List list12 = (List) unsafe2.getObject(obj, j10);
                    Class cls12 = p2.a;
                    int size10 = list12.size();
                    if (size10 != 0) {
                        J = e2.d(i28, size10, p2.k(list12));
                        i26 += J;
                        c10 = 4;
                        i10 = 1;
                        c11 = '\b';
                        break;
                    }
                    J = 0;
                    i26 += J;
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                case 22:
                    List list13 = (List) unsafe2.getObject(obj, j10);
                    Class cls13 = p2.a;
                    int size11 = list13.size();
                    if (size11 != 0) {
                        J = e2.d(i28, size11, p2.t(list13));
                        i26 += J;
                        c10 = 4;
                        i10 = 1;
                        c11 = '\b';
                        break;
                    }
                    J = 0;
                    i26 += J;
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                case 23:
                    J = p2.C(i28, (List) unsafe2.getObject(obj, j10));
                    i26 += J;
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 24:
                    J = p2.z(i28, (List) unsafe2.getObject(obj, j10));
                    i26 += J;
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 25:
                    List list14 = (List) unsafe2.getObject(obj, j10);
                    Class cls14 = p2.a;
                    int size12 = list14.size();
                    i26 += size12 == 0 ? 0 : (r0.T(i28 << 3) + 1) * size12;
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 26:
                    J = p2.j(i28, (List) unsafe2.getObject(obj, j10));
                    i26 += J;
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 27:
                    J = p2.b(i28, (List) unsafe2.getObject(obj, j10), l(i25));
                    i26 += J;
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 28:
                    J = p2.o(i28, (List) unsafe2.getObject(obj, j10));
                    i26 += J;
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 29:
                    List list15 = (List) unsafe2.getObject(obj, j10);
                    Class cls15 = p2.a;
                    int size13 = list15.size();
                    if (size13 != 0) {
                        J = e2.d(i28, size13, p2.v(list15));
                        i26 += J;
                        c10 = 4;
                        i10 = 1;
                        c11 = '\b';
                        break;
                    }
                    J = 0;
                    i26 += J;
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                case ks.T /* 30 */:
                    List list16 = (List) unsafe2.getObject(obj, j10);
                    Class cls16 = p2.a;
                    int size14 = list16.size();
                    if (size14 != 0) {
                        J = e2.d(i28, size14, p2.r(list16));
                        i26 += J;
                        c10 = 4;
                        i10 = 1;
                        c11 = '\b';
                        break;
                    }
                    J = 0;
                    i26 += J;
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                case ks.U /* 31 */:
                    J = p2.z(i28, (List) unsafe2.getObject(obj, j10));
                    i26 += J;
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 32:
                    J = p2.C(i28, (List) unsafe2.getObject(obj, j10));
                    i26 += J;
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 33:
                    List list17 = (List) unsafe2.getObject(obj, j10);
                    Class cls17 = p2.a;
                    int size15 = list17.size();
                    if (size15 != 0) {
                        J = e2.d(i28, size15, p2.x(list17));
                        i26 += J;
                        c10 = 4;
                        i10 = 1;
                        c11 = '\b';
                        break;
                    }
                    J = 0;
                    i26 += J;
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                case 34:
                    List list18 = (List) unsafe2.getObject(obj, j10);
                    Class cls18 = p2.a;
                    int size16 = list18.size();
                    if (size16 != 0) {
                        J = e2.d(i28, size16, p2.p(list18));
                        i26 += J;
                        c10 = 4;
                        i10 = 1;
                        c11 = '\b';
                        break;
                    }
                    J = 0;
                    i26 += J;
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                case 35:
                    int D4 = p2.D((List) unsafe2.getObject(obj, j10));
                    if (D4 > 0) {
                        i26 = e2.e(D4, r0.y(i28), D4, i26);
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 36:
                    int A6 = p2.A((List) unsafe2.getObject(obj, j10));
                    if (A6 > 0) {
                        i26 = e2.e(A6, r0.y(i28), A6, i26);
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 37:
                    int c14 = p2.c((List) unsafe2.getObject(obj, j10));
                    if (c14 > 0) {
                        i26 = e2.e(c14, r0.y(i28), c14, i26);
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 38:
                    int k13 = p2.k((List) unsafe2.getObject(obj, j10));
                    if (k13 > 0) {
                        i26 = e2.e(k13, r0.y(i28), k13, i26);
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 39:
                    int t11 = p2.t((List) unsafe2.getObject(obj, j10));
                    if (t11 > 0) {
                        i26 = e2.e(t11, r0.y(i28), t11, i26);
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 40:
                    int D5 = p2.D((List) unsafe2.getObject(obj, j10));
                    if (D5 > 0) {
                        i26 = e2.e(D5, r0.y(i28), D5, i26);
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 41:
                    int A7 = p2.A((List) unsafe2.getObject(obj, j10));
                    if (A7 > 0) {
                        i26 = e2.e(A7, r0.y(i28), A7, i26);
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 42:
                    List list19 = (List) unsafe2.getObject(obj, j10);
                    Class cls19 = p2.a;
                    int size17 = list19.size();
                    if (size17 > 0) {
                        i26 = e2.e(size17, r0.y(i28), size17, i26);
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 43:
                    int v10 = p2.v((List) unsafe2.getObject(obj, j10));
                    if (v10 > 0) {
                        i26 = e2.e(v10, r0.y(i28), v10, i26);
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 44:
                    int r11 = p2.r((List) unsafe2.getObject(obj, j10));
                    if (r11 > 0) {
                        i26 = e2.e(r11, r0.y(i28), r11, i26);
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 45:
                    int A8 = p2.A((List) unsafe2.getObject(obj, j10));
                    if (A8 > 0) {
                        i26 = e2.e(A8, r0.y(i28), A8, i26);
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 46:
                    int D6 = p2.D((List) unsafe2.getObject(obj, j10));
                    if (D6 > 0) {
                        i26 = e2.e(D6, r0.y(i28), D6, i26);
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 47:
                    int x11 = p2.x((List) unsafe2.getObject(obj, j10));
                    if (x11 > 0) {
                        i26 = e2.e(x11, r0.y(i28), x11, i26);
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 48:
                    int p11 = p2.p((List) unsafe2.getObject(obj, j10));
                    if (p11 > 0) {
                        i26 = e2.e(p11, r0.y(i28), p11, i26);
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 49:
                    List list20 = (List) unsafe2.getObject(obj, j10);
                    o2 l15 = l(i25);
                    Class cls20 = p2.a;
                    int size18 = list20.size();
                    if (size18 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 0;
                        for (int i34 = 0; i34 < size18; i34++) {
                            i11 += r0.I(i28, (l0) list20.get(i34), l15);
                        }
                    }
                    i26 += i11;
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case 50:
                    Object object2 = unsafe2.getObject(obj, j10);
                    Object t12 = t(i25);
                    b2Var.getClass();
                    b2.b(object2, t12);
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case ks.o0 /* 51 */:
                    if (q(i28, i25, obj)) {
                        c12 = '\b';
                        i26 = a8.p0.D(i28 << 3, 8, i26);
                        c11 = c12;
                        c10 = 4;
                        i10 = 1;
                        break;
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case ks.p0 /* 52 */:
                    if (q(i28, i25, obj)) {
                        c10 = 4;
                        i26 = a8.p0.D(i28 << 3, 4, i26);
                        i10 = 1;
                        c11 = '\b';
                        break;
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                case ks.q0 /* 53 */:
                    if (q(i28, i25, obj)) {
                        J = r0.O(B(obj, j10)) + r0.T(i28 << 3);
                        i26 += J;
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case ks.r0 /* 54 */:
                    if (q(i28, i25, obj)) {
                        J = r0.N(i28, B(obj, j10));
                        i26 += J;
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case ks.s0 /* 55 */:
                    if (q(i28, i25, obj)) {
                        int A9 = A(obj, j10);
                        T = r0.T(i28 << 3);
                        G = r0.P(A9);
                        J = G + T;
                        i26 += J;
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case ks.t0 /* 56 */:
                    if (q(i28, i25, obj)) {
                        J = r0.R(i28);
                        i26 += J;
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case ks.u0 /* 57 */:
                    if (q(i28, i25, obj)) {
                        J = r0.V(i28);
                        i26 += J;
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                    break;
                case ks.v0 /* 58 */:
                    if (q(i28, i25, obj)) {
                        i26 = a8.p0.D(i28 << 3, i30, i26);
                        i10 = i30;
                        c10 = 4;
                        c11 = '\b';
                        break;
                    }
                    c10 = 4;
                    i10 = 1;
                    c11 = '\b';
                case ks.w0 /* 59 */:
                    if (q(i28, i25, obj)) {
                        Object object3 = unsafe2.getObject(obj, j10);
                        if (object3 instanceof q0) {
                            J2 = r0.J(i28, (q0) object3);
                            i26 += J2;
                        } else {
                            T2 = r0.T(i28 << 3);
                            G2 = r0.G((String) object3);
                            J2 = G2 + T2;
                            i26 += J2;
                        }
                    }
                    i10 = i30;
                    c10 = 4;
                    c11 = '\b';
                    break;
                case ks.x0 /* 60 */:
                    if (q(i28, i25, obj)) {
                        J2 = p2.a(i28, unsafe2.getObject(obj, j10), l(i25));
                        i26 += J2;
                    }
                    i10 = i30;
                    c10 = 4;
                    c11 = '\b';
                    break;
                case ks.y0 /* 61 */:
                    if (q(i28, i25, obj)) {
                        J2 = r0.J(i28, (q0) unsafe2.getObject(obj, j10));
                        i26 += J2;
                    }
                    i10 = i30;
                    c10 = 4;
                    c11 = '\b';
                    break;
                case ks.z0 /* 62 */:
                    if (q(i28, i25, obj)) {
                        J2 = r0.S(i28, A(obj, j10));
                        i26 += J2;
                    }
                    i10 = i30;
                    c10 = 4;
                    c11 = '\b';
                    break;
                case ks.A0 /* 63 */:
                    if (q(i28, i25, obj)) {
                        int A10 = A(obj, j10);
                        T2 = r0.T(i28 << 3);
                        G2 = r0.P(A10);
                        J2 = G2 + T2;
                        i26 += J2;
                    }
                    i10 = i30;
                    c10 = 4;
                    c11 = '\b';
                    break;
                case 64:
                    if (q(i28, i25, obj)) {
                        c10 = 4;
                        i26 = a8.p0.D(i28 << 3, 4, i26);
                        i10 = i30;
                        c11 = '\b';
                        break;
                    }
                    i10 = i30;
                    c10 = 4;
                    c11 = '\b';
                case 65:
                    if (q(i28, i25, obj)) {
                        i26 = a8.p0.D(i28 << 3, 8, i26);
                        c11 = '\b';
                        i10 = i30;
                        c10 = 4;
                        break;
                    }
                    i10 = i30;
                    c10 = 4;
                    c11 = '\b';
                    break;
                case ks.D0 /* 66 */:
                    if (q(i28, i25, obj)) {
                        J2 = r0.U(i28, A(obj, j10));
                        i26 += J2;
                    }
                    i10 = i30;
                    c10 = 4;
                    c11 = '\b';
                    break;
                case ks.E0 /* 67 */:
                    if (q(i28, i25, obj)) {
                        J2 = r0.Q(i28, B(obj, j10));
                        i26 += J2;
                    }
                    i10 = i30;
                    c10 = 4;
                    c11 = '\b';
                    break;
                case ks.F0 /* 68 */:
                    if (q(i28, i25, obj)) {
                        J2 = r0.I(i28, (l0) unsafe2.getObject(obj, j10), l(i25));
                        i26 += J2;
                    }
                    i10 = i30;
                    c10 = 4;
                    c11 = '\b';
                    break;
                default:
                    i10 = i30;
                    c10 = 4;
                    c11 = '\b';
                    break;
            }
            i25 += 3;
            i15 = i10;
            q2Var2 = q2Var;
        }
        q2Var2.getClass();
        return ((f1) obj).zzb.d() + i26;
    }
}
