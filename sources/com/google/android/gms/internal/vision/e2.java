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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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

    public e2(int[] iArr, Object[] objArr, int i10, int i11, l0 l0Var, boolean z4, int[] iArr2, int i12, int i13, h2 h2Var, s1 s1Var, p2 p2Var, v0 v0Var, b2 b2Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i10;
        this.d = i11;
        this.f = z4;
        this.g = iArr2;
        this.h = i12;
        this.i = i13;
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
        int i29;
        Field m9;
        char charAt12;
        int i30;
        Object obj;
        Field m10;
        Object obj2;
        Field m11;
        int i31;
        char charAt13;
        int i32;
        char charAt14;
        int i33;
        int i34;
        char charAt15;
        int i35;
        char charAt16;
        if (!(l2Var instanceof l2)) {
            l2Var.getClass();
            throw new ClassCastException();
        }
        boolean z4 = (l2Var.d & 1) != 1;
        String str = l2Var.b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i36 = 1;
            while (true) {
                i10 = i36 + 1;
                if (str.charAt(i36) < 55296) {
                    break;
                }
                i36 = i10;
            }
        } else {
            i10 = 1;
        }
        int i37 = i10 + 1;
        int charAt17 = str.charAt(i10);
        if (charAt17 >= 55296) {
            int i38 = charAt17 & 8191;
            int i39 = 13;
            while (true) {
                i35 = i37 + 1;
                charAt16 = str.charAt(i37);
                if (charAt16 < 55296) {
                    break;
                }
                i38 |= (charAt16 & 8191) << i39;
                i39 += 13;
                i37 = i35;
            }
            charAt17 = i38 | (charAt16 << i39);
            i37 = i35;
        }
        if (charAt17 == 0) {
            iArr = n;
            i14 = 0;
            i12 = 0;
            i13 = 0;
            charAt = 0;
            charAt2 = 0;
            i11 = 0;
            charAt3 = 0;
        } else {
            int i40 = i37 + 1;
            int charAt18 = str.charAt(i37);
            if (charAt18 >= 55296) {
                int i41 = charAt18 & 8191;
                int i42 = 13;
                while (true) {
                    i22 = i40 + 1;
                    charAt11 = str.charAt(i40);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i41 |= (charAt11 & 8191) << i42;
                    i42 += 13;
                    i40 = i22;
                }
                charAt18 = i41 | (charAt11 << i42);
                i40 = i22;
            }
            int i43 = i40 + 1;
            int charAt19 = str.charAt(i40);
            if (charAt19 >= 55296) {
                int i44 = charAt19 & 8191;
                int i45 = 13;
                while (true) {
                    i21 = i43 + 1;
                    charAt10 = str.charAt(i43);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i44 |= (charAt10 & 8191) << i45;
                    i45 += 13;
                    i43 = i21;
                }
                charAt19 = i44 | (charAt10 << i45);
                i43 = i21;
            }
            int i46 = i43 + 1;
            int charAt20 = str.charAt(i43);
            if (charAt20 >= 55296) {
                int i47 = charAt20 & 8191;
                int i48 = 13;
                while (true) {
                    i20 = i46 + 1;
                    charAt9 = str.charAt(i46);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i47 |= (charAt9 & 8191) << i48;
                    i48 += 13;
                    i46 = i20;
                }
                charAt20 = i47 | (charAt9 << i48);
                i46 = i20;
            }
            int i49 = i46 + 1;
            int charAt21 = str.charAt(i46);
            if (charAt21 >= 55296) {
                int i50 = charAt21 & 8191;
                int i51 = 13;
                while (true) {
                    i19 = i49 + 1;
                    charAt8 = str.charAt(i49);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i50 |= (charAt8 & 8191) << i51;
                    i51 += 13;
                    i49 = i19;
                }
                charAt21 = i50 | (charAt8 << i51);
                i49 = i19;
            }
            int i52 = i49 + 1;
            charAt = str.charAt(i49);
            if (charAt >= 55296) {
                int i53 = charAt & 8191;
                int i54 = 13;
                while (true) {
                    i18 = i52 + 1;
                    charAt7 = str.charAt(i52);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i53 |= (charAt7 & 8191) << i54;
                    i54 += 13;
                    i52 = i18;
                }
                charAt = i53 | (charAt7 << i54);
                i52 = i18;
            }
            int i55 = i52 + 1;
            charAt2 = str.charAt(i52);
            if (charAt2 >= 55296) {
                int i56 = charAt2 & 8191;
                int i57 = 13;
                while (true) {
                    i17 = i55 + 1;
                    charAt6 = str.charAt(i55);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i56 |= (charAt6 & 8191) << i57;
                    i57 += 13;
                    i55 = i17;
                }
                charAt2 = i56 | (charAt6 << i57);
                i55 = i17;
            }
            int i58 = i55 + 1;
            int charAt22 = str.charAt(i55);
            if (charAt22 >= 55296) {
                int i59 = charAt22 & 8191;
                int i60 = 13;
                while (true) {
                    i16 = i58 + 1;
                    charAt5 = str.charAt(i58);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i59 |= (charAt5 & 8191) << i60;
                    i60 += 13;
                    i58 = i16;
                }
                charAt22 = i59 | (charAt5 << i60);
                i58 = i16;
            }
            int i61 = i58 + 1;
            charAt3 = str.charAt(i58);
            if (charAt3 >= 55296) {
                int i62 = charAt3 & 8191;
                int i63 = i61;
                int i64 = 13;
                while (true) {
                    i15 = i63 + 1;
                    charAt4 = str.charAt(i63);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i62 |= (charAt4 & 8191) << i64;
                    i64 += 13;
                    i63 = i15;
                }
                charAt3 = i62 | (charAt4 << i64);
                i61 = i15;
            }
            int[] iArr2 = new int[charAt3 + charAt2 + charAt22];
            i11 = (charAt18 << 1) + charAt19;
            i12 = charAt20;
            i13 = charAt21;
            iArr = iArr2;
            i14 = charAt18;
            i37 = i61;
        }
        Unsafe unsafe = o;
        Object[] objArr = l2Var.c;
        Class<?> cls = l2Var.a.getClass();
        int i65 = i14;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr2 = new Object[charAt << 1];
        int i66 = charAt2 + charAt3;
        int i67 = i66;
        int i68 = charAt3;
        int i69 = 0;
        int i70 = 0;
        while (i37 < length) {
            int i71 = i37 + 1;
            int charAt23 = str.charAt(i37);
            int[] iArr4 = iArr3;
            if (charAt23 >= 55296) {
                int i72 = charAt23 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i34 = i73 + 1;
                    charAt15 = str.charAt(i73);
                    i23 = length;
                    if (charAt15 < 55296) {
                        break;
                    }
                    i72 |= (charAt15 & 8191) << i74;
                    i74 += 13;
                    i73 = i34;
                    length = i23;
                }
                charAt23 = i72 | (charAt15 << i74);
                i24 = i34;
            } else {
                i23 = length;
                i24 = i71;
            }
            int i75 = i24 + 1;
            int charAt24 = str.charAt(i24);
            if (charAt24 >= 55296) {
                int i76 = charAt24 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i32 = i77 + 1;
                    charAt14 = str.charAt(i77);
                    i33 = i76;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i76 = i33 | ((charAt14 & 8191) << i78);
                    i78 += 13;
                    i77 = i32;
                }
                charAt24 = i33 | (charAt14 << i78);
                i25 = i32;
            } else {
                i25 = i75;
            }
            int i79 = charAt23;
            int i80 = charAt24 & 255;
            int i81 = i12;
            if ((charAt24 & 1024) != 0) {
                iArr[i69] = i70;
                i69++;
            }
            int i82 = i13;
            if (i80 >= 51) {
                int i83 = i25 + 1;
                int charAt25 = str.charAt(i25);
                char c3 = CharacterCompat.MIN_HIGH_SURROGATE;
                if (charAt25 >= 55296) {
                    int i84 = charAt25 & 8191;
                    int i85 = 13;
                    while (true) {
                        i31 = i83 + 1;
                        charAt13 = str.charAt(i83);
                        if (charAt13 < c3) {
                            break;
                        }
                        i84 |= (charAt13 & 8191) << i85;
                        i85 += 13;
                        i83 = i31;
                        c3 = CharacterCompat.MIN_HIGH_SURROGATE;
                    }
                    charAt25 = i84 | (charAt13 << i85);
                    i83 = i31;
                }
                int i86 = i80 - 51;
                int i87 = charAt25;
                if (i86 == 9 || i86 == 17) {
                    i30 = i11 + 1;
                    objArr2[((i70 / 3) << 1) + 1] = objArr[i11];
                } else {
                    if (i86 == 12 && !z4) {
                        i30 = i11 + 1;
                        objArr2[((i70 / 3) << 1) + 1] = objArr[i11];
                    }
                    int i88 = i87 << 1;
                    obj = objArr[i88];
                    if (obj instanceof Field) {
                        m10 = m(cls, (String) obj);
                        objArr[i88] = m10;
                    } else {
                        m10 = (Field) obj;
                    }
                    int i89 = i83;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(m10);
                    int i90 = i88 + 1;
                    obj2 = objArr[i90];
                    if (obj2 instanceof Field) {
                        m11 = m(cls, (String) obj2);
                        objArr[i90] = m11;
                    } else {
                        m11 = (Field) obj2;
                    }
                    i26 = (int) unsafe.objectFieldOffset(m11);
                    i29 = objectFieldOffset2;
                    i28 = 0;
                    i27 = i89;
                }
                i11 = i30;
                int i882 = i87 << 1;
                obj = objArr[i882];
                if (obj instanceof Field) {
                }
                int i892 = i83;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(m10);
                int i902 = i882 + 1;
                obj2 = objArr[i902];
                if (obj2 instanceof Field) {
                }
                i26 = (int) unsafe.objectFieldOffset(m11);
                i29 = objectFieldOffset22;
                i28 = 0;
                i27 = i892;
            } else {
                int i91 = i11 + 1;
                Field m12 = m(cls, (String) objArr[i11]);
                if (i80 == 9 || i80 == 17) {
                    objArr2[((i70 / 3) << 1) + 1] = m12.getType();
                } else {
                    if (i80 == 27 || i80 == 49) {
                        i11 += 2;
                        objArr2[((i70 / 3) << 1) + 1] = objArr[i91];
                    } else if (i80 == 12 || i80 == 30 || i80 == 44) {
                        if (!z4) {
                            i11 += 2;
                            objArr2[((i70 / 3) << 1) + 1] = objArr[i91];
                        }
                    } else if (i80 == 50) {
                        int i92 = i68 + 1;
                        iArr[i68] = i70;
                        int i93 = (i70 / 3) << 1;
                        int i94 = i11 + 2;
                        objArr2[i93] = objArr[i91];
                        if ((charAt24 & 2048) != 0) {
                            objArr2[i93 + 1] = objArr[i94];
                            i11 += 3;
                        } else {
                            i11 = i94;
                        }
                        i68 = i92;
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(m12);
                    if ((charAt24 & 4096) == 4096 || i80 > 17) {
                        i26 = 1048575;
                        i27 = i25;
                        i28 = 0;
                    } else {
                        int i95 = i25 + 1;
                        int charAt26 = str.charAt(i25);
                        if (charAt26 >= 55296) {
                            int i96 = charAt26 & 8191;
                            int i97 = 13;
                            while (true) {
                                i27 = i95 + 1;
                                charAt12 = str.charAt(i95);
                                if (charAt12 < 55296) {
                                    break;
                                }
                                i96 |= (charAt12 & 8191) << i97;
                                i97 += 13;
                                i95 = i27;
                            }
                            charAt26 = i96 | (charAt12 << i97);
                        } else {
                            i27 = i95;
                        }
                        int i98 = (charAt26 / 32) + (i65 << 1);
                        Object obj3 = objArr[i98];
                        if (obj3 instanceof Field) {
                            m9 = (Field) obj3;
                        } else {
                            m9 = m(cls, (String) obj3);
                            objArr[i98] = m9;
                        }
                        i28 = charAt26 % 32;
                        i26 = (int) unsafe.objectFieldOffset(m9);
                    }
                    if (i80 >= 18 && i80 <= 49) {
                        iArr[i67] = objectFieldOffset;
                        i67++;
                    }
                    i29 = objectFieldOffset;
                }
                i11 = i91;
                objectFieldOffset = (int) unsafe.objectFieldOffset(m12);
                if ((charAt24 & 4096) == 4096) {
                }
                i26 = 1048575;
                i27 = i25;
                i28 = 0;
                if (i80 >= 18) {
                    iArr[i67] = objectFieldOffset;
                    i67++;
                }
                i29 = objectFieldOffset;
            }
            int i99 = i70 + 1;
            iArr4[i70] = i79;
            int i100 = i70 + 2;
            String str2 = str;
            iArr4[i99] = ((charAt24 & 512) != 0 ? TLObject.FLAG_29 : 0) | ((charAt24 & 256) != 0 ? TLObject.FLAG_28 : 0) | (i80 << 20) | i29;
            i70 += 3;
            iArr4[i100] = (i28 << 20) | i26;
            iArr3 = iArr4;
            i12 = i81;
            length = i23;
            str = str2;
            i37 = i27;
            i13 = i82;
        }
        return new e2(iArr3, objArr2, i12, i13, l2Var.a, z4, iArr, charAt3, i66, h2Var, s1Var, p2Var, v0Var, b2Var);
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
            StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + name.length() + String.valueOf(str).length() + 40);
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            throw new RuntimeException(android.support.v4.media.a.r(sb, " not found. Known fields are ", arrays));
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
                r0Var.H(a3.a(str));
                r0Var.e = a3.a.h(str, bArr, r0Var.e, r0Var.F());
                return;
            }
            int i12 = i11 + T2;
            r0Var.e = i12;
            int h = a3.a.h(str, bArr, i12, r0Var.F());
            r0Var.e = i11;
            r0Var.H((h - i11) - T2);
            r0Var.e = h;
        } catch (b3 e) {
            r0Var.e = i11;
            r0.f.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(j1.a);
            try {
                r0Var.H(bytes.length);
                r0Var.L(bytes, 0, bytes.length);
            } catch (s0 e6) {
                throw e6;
            } catch (IndexOutOfBoundsException e10) {
                throw new s0(e10);
            }
        } catch (IndexOutOfBoundsException e11) {
            throw new s0(e11);
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
        int i10 = 0;
        int i11 = 1048575;
        int i12 = 0;
        loop0: while (true) {
            boolean z4 = true;
            if (i10 >= this.h) {
                return true;
            }
            int i13 = this.g[i10];
            int[] iArr = this.a;
            int i14 = iArr[i13];
            int z10 = z(i13);
            int i15 = iArr[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i11) {
                if (i16 != 1048575) {
                    i12 = o.getInt(obj, i16);
                }
                i11 = i16;
            }
            if ((268435456 & z10) != 0) {
                if (!(i11 == 1048575 ? r(i13, obj) : (i12 & i17) != 0)) {
                    break;
                }
            }
            int i18 = (267386880 & z10) >>> 20;
            if (i18 == 9 || i18 == 17) {
                if (i11 == 1048575) {
                    z4 = r(i13, obj);
                } else if ((i17 & i12) == 0) {
                    z4 = false;
                }
                if (z4 && !l(i13).a(x2.l(obj, z10 & 1048575))) {
                    break;
                }
                i10++;
            } else {
                if (i18 != 27) {
                    if (i18 == 60 || i18 == 68) {
                        if (q(i14, i13, obj) && !l(i13).a(x2.l(obj, z10 & 1048575))) {
                            break;
                        }
                    } else if (i18 != 49) {
                        if (i18 != 50) {
                            continue;
                        } else {
                            Object l10 = x2.l(obj, z10 & 1048575);
                            this.m.getClass();
                            if (!((a2) l10).isEmpty()) {
                                if (t(i13) == null) {
                                    throw new NoSuchMethodError();
                                }
                                throw new ClassCastException();
                            }
                        }
                    }
                    i10++;
                }
                List list = (List) x2.l(obj, z10 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    n2 l11 = l(i13);
                    for (int i19 = 0; i19 < list.size(); i19++) {
                        if (!l11.a(list.get(i19))) {
                            break loop0;
                        }
                    }
                }
                i10++;
            }
        }
    }

    @Override // com.google.android.gms.internal.vision.n2
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
            long z4 = z(iArr[i11]) & 1048575;
            Object l10 = x2.l(obj, z4);
            if (l10 != null) {
                this.m.getClass();
                ((a2) l10).a = false;
                x2.d(obj, z4, l10);
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
        for (int i10 = 0; i10 < length; i10 += 3) {
            int z4 = z(i10);
            int i11 = iArr[i10];
            switch ((267386880 & z4) >>> 20) {
                case 0:
                    if (r(i10, obj)) {
                        double j10 = x2.c.j(obj, z4 & 1048575);
                        r0Var.getClass();
                        long doubleToRawLongBits = Double.doubleToRawLongBits(j10);
                        r0Var.D(i11, 1);
                        r0Var.K(doubleToRawLongBits);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (r(i10, obj)) {
                        float i12 = x2.c.i(obj, z4 & 1048575);
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
                        long l10 = x2.c.l(obj, z4 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.E(l10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (r(i10, obj)) {
                        long l11 = x2.c.l(obj, z4 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.E(l11);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (r(i10, obj)) {
                        int k10 = x2.c.k(obj, z4 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.C(k10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (r(i10, obj)) {
                        long l12 = x2.c.l(obj, z4 & 1048575);
                        r0Var.D(i11, 1);
                        r0Var.K(l12);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (r(i10, obj)) {
                        int k11 = x2.c.k(obj, z4 & 1048575);
                        r0Var.D(i11, 5);
                        r0Var.M(k11);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (r(i10, obj)) {
                        boolean h = x2.c.h(obj, z4 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.B(h ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (r(i10, obj)) {
                        n(i11, x2.l(obj, z4 & 1048575), y1Var);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (r(i10, obj)) {
                        y1Var.b(i11, x2.l(obj, z4 & 1048575), l(i10));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (r(i10, obj)) {
                        y1Var.a(i11, (q0) x2.l(obj, z4 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (r(i10, obj)) {
                        int k12 = x2.c.k(obj, z4 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.H(k12);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (r(i10, obj)) {
                        int k13 = x2.c.k(obj, z4 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.C(k13);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (r(i10, obj)) {
                        int k14 = x2.c.k(obj, z4 & 1048575);
                        r0Var.D(i11, 5);
                        r0Var.M(k14);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (r(i10, obj)) {
                        long l13 = x2.c.l(obj, z4 & 1048575);
                        r0Var.D(i11, 1);
                        r0Var.K(l13);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (r(i10, obj)) {
                        int k15 = x2.c.k(obj, z4 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.H((k15 >> 31) ^ (k15 << 1));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (r(i10, obj)) {
                        long l14 = x2.c.l(obj, z4 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.E((l14 >> 63) ^ (l14 << 1));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (r(i10, obj)) {
                        y1Var.c(i11, x2.l(obj, z4 & 1048575), l(i10));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    o2.g(i11, (List) x2.l(obj, z4 & 1048575), y1Var, false);
                    break;
                case 19:
                    o2.n(i11, (List) x2.l(obj, z4 & 1048575), y1Var, false);
                    break;
                case 20:
                    o2.q(i11, (List) x2.l(obj, z4 & 1048575), y1Var, false);
                    break;
                case 21:
                    o2.s(i11, (List) x2.l(obj, z4 & 1048575), y1Var, false);
                    break;
                case 22:
                    o2.B(i11, (List) x2.l(obj, z4 & 1048575), y1Var, false);
                    break;
                case 23:
                    o2.w(i11, (List) x2.l(obj, z4 & 1048575), y1Var, false);
                    break;
                case 24:
                    o2.G(i11, (List) x2.l(obj, z4 & 1048575), y1Var, false);
                    break;
                case 25:
                    o2.J(i11, (List) x2.l(obj, z4 & 1048575), y1Var, false);
                    break;
                case 26:
                    o2.e(i11, (List) x2.l(obj, z4 & 1048575), y1Var);
                    break;
                case 27:
                    o2.f(i11, (List) x2.l(obj, z4 & 1048575), y1Var, l(i10));
                    break;
                case 28:
                    o2.l(i11, (List) x2.l(obj, z4 & 1048575), y1Var);
                    break;
                case 29:
                    o2.E(i11, (List) x2.l(obj, z4 & 1048575), y1Var, false);
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    o2.I(i11, (List) x2.l(obj, z4 & 1048575), y1Var, false);
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    o2.H(i11, (List) x2.l(obj, z4 & 1048575), y1Var, false);
                    break;
                case 32:
                    o2.y(i11, (List) x2.l(obj, z4 & 1048575), y1Var, false);
                    break;
                case 33:
                    o2.F(i11, (List) x2.l(obj, z4 & 1048575), y1Var, false);
                    break;
                case 34:
                    o2.u(i11, (List) x2.l(obj, z4 & 1048575), y1Var, false);
                    break;
                case 35:
                    o2.g(i11, (List) x2.l(obj, z4 & 1048575), y1Var, true);
                    break;
                case 36:
                    o2.n(i11, (List) x2.l(obj, z4 & 1048575), y1Var, true);
                    break;
                case 37:
                    o2.q(i11, (List) x2.l(obj, z4 & 1048575), y1Var, true);
                    break;
                case 38:
                    o2.s(i11, (List) x2.l(obj, z4 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    o2.B(i11, (List) x2.l(obj, z4 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    o2.w(i11, (List) x2.l(obj, z4 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    o2.G(i11, (List) x2.l(obj, z4 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    o2.J(i11, (List) x2.l(obj, z4 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    o2.E(i11, (List) x2.l(obj, z4 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    o2.I(i11, (List) x2.l(obj, z4 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    o2.H(i11, (List) x2.l(obj, z4 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    o2.y(i11, (List) x2.l(obj, z4 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    o2.F(i11, (List) x2.l(obj, z4 & 1048575), y1Var, true);
                    break;
                case 48:
                    o2.u(i11, (List) x2.l(obj, z4 & 1048575), y1Var, true);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    o2.m(i11, (List) x2.l(obj, z4 & 1048575), y1Var, l(i10));
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    if (x2.l(obj, z4 & 1048575) != null) {
                        Object t6 = t(i10);
                        this.m.getClass();
                        if (t6 != null) {
                            throw new ClassCastException();
                        }
                        throw new NoSuchMethodError();
                    }
                    break;
                case 51:
                    if (q(i11, i10, obj)) {
                        double doubleValue = ((Double) x2.l(obj, z4 & 1048575)).doubleValue();
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
                        float floatValue = ((Float) x2.l(obj, z4 & 1048575)).floatValue();
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
                        long B = B(obj, z4 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.E(B);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (q(i11, i10, obj)) {
                        long B2 = B(obj, z4 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.E(B2);
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (q(i11, i10, obj)) {
                        int A = A(obj, z4 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.C(A);
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(i11, i10, obj)) {
                        long B3 = B(obj, z4 & 1048575);
                        r0Var.D(i11, 1);
                        r0Var.K(B3);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (q(i11, i10, obj)) {
                        int A2 = A(obj, z4 & 1048575);
                        r0Var.D(i11, 5);
                        r0Var.M(A2);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (q(i11, i10, obj)) {
                        boolean booleanValue = ((Boolean) x2.l(obj, z4 & 1048575)).booleanValue();
                        r0Var.D(i11, 0);
                        r0Var.B(booleanValue ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(i11, i10, obj)) {
                        n(i11, x2.l(obj, z4 & 1048575), y1Var);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (q(i11, i10, obj)) {
                        y1Var.b(i11, x2.l(obj, z4 & 1048575), l(i10));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (q(i11, i10, obj)) {
                        y1Var.a(i11, (q0) x2.l(obj, z4 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (q(i11, i10, obj)) {
                        int A3 = A(obj, z4 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.H(A3);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (q(i11, i10, obj)) {
                        int A4 = A(obj, z4 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.C(A4);
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(i11, i10, obj)) {
                        int A5 = A(obj, z4 & 1048575);
                        r0Var.D(i11, 5);
                        r0Var.M(A5);
                        break;
                    } else {
                        break;
                    }
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (q(i11, i10, obj)) {
                        long B4 = B(obj, z4 & 1048575);
                        r0Var.D(i11, 1);
                        r0Var.K(B4);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (q(i11, i10, obj)) {
                        int A6 = A(obj, z4 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.H((A6 >> 31) ^ (A6 << 1));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (q(i11, i10, obj)) {
                        long B5 = B(obj, z4 & 1048575);
                        r0Var.D(i11, 0);
                        r0Var.E((B5 >> 63) ^ (B5 << 1));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (q(i11, i10, obj)) {
                        y1Var.c(i11, x2.l(obj, z4 & 1048575), l(i10));
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
        int i10;
        int a2;
        int i11;
        int[] iArr = this.a;
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int z4 = z(i13);
            int i14 = iArr[i13];
            long j10 = 1048575 & z4;
            int i15 = 1237;
            int i16 = 37;
            switch ((z4 & 267386880) >>> 20) {
                case 0:
                    i10 = i12 * 53;
                    a2 = j1.a(Double.doubleToLongBits(x2.c.j(f1Var, j10)));
                    i12 = a2 + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    a2 = Float.floatToIntBits(x2.c.i(f1Var, j10));
                    i12 = a2 + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    a2 = j1.a(x2.c.l(f1Var, j10));
                    i12 = a2 + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    a2 = j1.a(x2.c.l(f1Var, j10));
                    i12 = a2 + i10;
                    break;
                case 4:
                    i10 = i12 * 53;
                    a2 = x2.c.k(f1Var, j10);
                    i12 = a2 + i10;
                    break;
                case 5:
                    i10 = i12 * 53;
                    a2 = j1.a(x2.c.l(f1Var, j10));
                    i12 = a2 + i10;
                    break;
                case 6:
                    i10 = i12 * 53;
                    a2 = x2.c.k(f1Var, j10);
                    i12 = a2 + i10;
                    break;
                case 7:
                    i11 = i12 * 53;
                    boolean h = x2.c.h(f1Var, j10);
                    Charset charset = j1.a;
                    break;
                case 8:
                    i10 = i12 * 53;
                    a2 = ((String) x2.l(f1Var, j10)).hashCode();
                    i12 = a2 + i10;
                    break;
                case 9:
                    Object l10 = x2.l(f1Var, j10);
                    if (l10 != null) {
                        i16 = l10.hashCode();
                    }
                    i12 = (i12 * 53) + i16;
                    break;
                case 10:
                    i10 = i12 * 53;
                    a2 = x2.l(f1Var, j10).hashCode();
                    i12 = a2 + i10;
                    break;
                case 11:
                    i10 = i12 * 53;
                    a2 = x2.c.k(f1Var, j10);
                    i12 = a2 + i10;
                    break;
                case 12:
                    i10 = i12 * 53;
                    a2 = x2.c.k(f1Var, j10);
                    i12 = a2 + i10;
                    break;
                case 13:
                    i10 = i12 * 53;
                    a2 = x2.c.k(f1Var, j10);
                    i12 = a2 + i10;
                    break;
                case 14:
                    i10 = i12 * 53;
                    a2 = j1.a(x2.c.l(f1Var, j10));
                    i12 = a2 + i10;
                    break;
                case 15:
                    i10 = i12 * 53;
                    a2 = x2.c.k(f1Var, j10);
                    i12 = a2 + i10;
                    break;
                case 16:
                    i10 = i12 * 53;
                    a2 = j1.a(x2.c.l(f1Var, j10));
                    i12 = a2 + i10;
                    break;
                case 17:
                    Object l11 = x2.l(f1Var, j10);
                    if (l11 != null) {
                        i16 = l11.hashCode();
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
                    a2 = x2.l(f1Var, j10).hashCode();
                    i12 = a2 + i10;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    i10 = i12 * 53;
                    a2 = x2.l(f1Var, j10).hashCode();
                    i12 = a2 + i10;
                    break;
                case 51:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = j1.a(Double.doubleToLongBits(((Double) x2.l(f1Var, j10)).doubleValue()));
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = Float.floatToIntBits(((Float) x2.l(f1Var, j10)).floatValue());
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = j1.a(B(f1Var, j10));
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = j1.a(B(f1Var, j10));
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = A(f1Var, j10);
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = j1.a(B(f1Var, j10));
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = A(f1Var, j10);
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (q(i14, i13, f1Var)) {
                        i11 = i12 * 53;
                        boolean booleanValue = ((Boolean) x2.l(f1Var, j10)).booleanValue();
                        Charset charset2 = j1.a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = ((String) x2.l(f1Var, j10)).hashCode();
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = x2.l(f1Var, j10).hashCode();
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = x2.l(f1Var, j10).hashCode();
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = A(f1Var, j10);
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = A(f1Var, j10);
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = A(f1Var, j10);
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = j1.a(B(f1Var, j10));
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = A(f1Var, j10);
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = j1.a(B(f1Var, j10));
                        i12 = a2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (q(i14, i13, f1Var)) {
                        i10 = i12 * 53;
                        a2 = x2.l(f1Var, j10).hashCode();
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

    @Override // com.google.android.gms.internal.vision.n2
    public final void e(f1 f1Var, f1 f1Var2) {
        f1 f1Var3;
        f1Var2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i10 >= iArr.length) {
                o2.h(this.l, f1Var, f1Var2);
                return;
            }
            int z4 = z(i10);
            long j10 = z4 & 1048575;
            int i11 = iArr[i10];
            switch ((z4 & 267386880) >>> 20) {
                case 0:
                    f1Var3 = f1Var;
                    if (!r(i10, f1Var2)) {
                        break;
                    } else {
                        w2 w2Var = x2.c;
                        w2Var.d(f1Var3, j10, w2Var.j(f1Var2, j10));
                        u(i10, f1Var3);
                        continue;
                    }
                case 1:
                    f1Var3 = f1Var;
                    if (r(i10, f1Var2)) {
                        w2 w2Var2 = x2.c;
                        w2Var2.e(f1Var3, j10, w2Var2.i(f1Var2, j10));
                        u(i10, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    f1Var3 = f1Var;
                    if (r(i10, f1Var2)) {
                        w2 w2Var3 = x2.c;
                        w2Var3.f(f1Var3, j10, w2Var3.l(f1Var2, j10));
                        u(i10, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    f1Var3 = f1Var;
                    if (r(i10, f1Var2)) {
                        w2 w2Var4 = x2.c;
                        w2Var4.f(f1Var3, j10, w2Var4.l(f1Var2, j10));
                        u(i10, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    f1Var3 = f1Var;
                    if (r(i10, f1Var2)) {
                        x2.c(j10, f1Var3, x2.c.k(f1Var2, j10));
                        u(i10, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    f1Var3 = f1Var;
                    if (r(i10, f1Var2)) {
                        w2 w2Var5 = x2.c;
                        w2Var5.f(f1Var3, j10, w2Var5.l(f1Var2, j10));
                        u(i10, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    f1Var3 = f1Var;
                    if (r(i10, f1Var2)) {
                        x2.c(j10, f1Var3, x2.c.k(f1Var2, j10));
                        u(i10, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    f1Var3 = f1Var;
                    if (r(i10, f1Var2)) {
                        w2 w2Var6 = x2.c;
                        w2Var6.g(f1Var3, j10, w2Var6.h(f1Var2, j10));
                        u(i10, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    f1Var3 = f1Var;
                    if (r(i10, f1Var2)) {
                        x2.d(f1Var3, j10, x2.l(f1Var2, j10));
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
                        x2.d(f1Var3, j10, x2.l(f1Var2, j10));
                        u(i10, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    f1Var3 = f1Var;
                    if (r(i10, f1Var2)) {
                        x2.c(j10, f1Var3, x2.c.k(f1Var2, j10));
                        u(i10, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    f1Var3 = f1Var;
                    if (r(i10, f1Var2)) {
                        x2.c(j10, f1Var3, x2.c.k(f1Var2, j10));
                        u(i10, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    f1Var3 = f1Var;
                    if (r(i10, f1Var2)) {
                        x2.c(j10, f1Var3, x2.c.k(f1Var2, j10));
                        u(i10, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    f1Var3 = f1Var;
                    if (r(i10, f1Var2)) {
                        w2 w2Var7 = x2.c;
                        w2Var7.f(f1Var3, j10, w2Var7.l(f1Var2, j10));
                        u(i10, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    f1Var3 = f1Var;
                    if (r(i10, f1Var2)) {
                        x2.c(j10, f1Var3, x2.c.k(f1Var2, j10));
                        u(i10, f1Var3);
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (r(i10, f1Var2)) {
                        w2 w2Var8 = x2.c;
                        f1Var3 = f1Var;
                        w2Var8.f(f1Var3, j10, w2Var8.l(f1Var2, j10));
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
                    if (q(i11, i10, f1Var2)) {
                        x2.d(f1Var, j10, x2.l(f1Var2, j10));
                        x2.c(iArr[i10 + 2] & 1048575, f1Var, i11);
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
                        x2.d(f1Var, j10, x2.l(f1Var2, j10));
                        x2.c(iArr[i10 + 2] & 1048575, f1Var, i11);
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

    /* JADX WARN: Failed to find 'out' block for switch in B:81:0x00a9. Please report as an issue. */
    @Override // com.google.android.gms.internal.vision.n2
    public final void f(Object obj, byte[] bArr, int i10, int i11, com.google.android.gms.internal.clearcut.m mVar) {
        int s6;
        Unsafe unsafe;
        Object obj2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        char c3;
        Unsafe unsafe2;
        Object obj3;
        int i18;
        Unsafe unsafe3;
        Object obj4;
        int i19;
        int i20;
        int i21;
        e2 e2Var = this;
        Object obj5 = obj;
        byte[] bArr2 = bArr;
        int i22 = i11;
        com.google.android.gms.internal.clearcut.m mVar2 = mVar;
        if (!e2Var.f) {
            j(obj5, bArr, i10, i22, 0, mVar);
            return;
        }
        Unsafe unsafe4 = o;
        int i23 = i10;
        int i24 = -1;
        int i25 = 0;
        int i26 = 1048575;
        int i27 = 0;
        while (i23 < i22) {
            int i28 = i23 + 1;
            int i29 = bArr2[i23];
            if (i29 < 0) {
                i28 = e1.d(i29, bArr2, i28, mVar2);
                i29 = mVar2.a;
            }
            int i30 = i28;
            int i31 = i29 >>> 3;
            int i32 = i29 & 7;
            int i33 = e2Var.d;
            int i34 = e2Var.c;
            if (i31 > i24) {
                s6 = (i31 < i34 || i31 > i33) ? -1 : e2Var.s(i31, i25 / 3);
            } else {
                s6 = (i31 < i34 || i31 > i33) ? -1 : e2Var.s(i31, 0);
            }
            int i35 = s6;
            if (i35 == -1) {
                unsafe = unsafe4;
                obj2 = obj5;
                i12 = i29;
                i13 = i27;
                i14 = i30;
                i15 = 0;
            } else {
                int[] iArr = e2Var.a;
                int i36 = iArr[i35 + 1];
                int i37 = (i36 & 267386880) >>> 20;
                int i38 = i29;
                long j10 = i36 & 1048575;
                if (i37 <= 17) {
                    int i39 = iArr[i35 + 2];
                    int i40 = 1 << (i39 >>> 20);
                    int i41 = i39 & 1048575;
                    if (i41 != i26) {
                        i17 = i37;
                        i16 = i36;
                        c3 = 1;
                        if (i26 != 1048575) {
                            unsafe4.putInt(obj5, i26, i27);
                        }
                        if (i41 != 1048575) {
                            i27 = unsafe4.getInt(obj5, i41);
                        }
                        i26 = i41;
                    } else {
                        i16 = i36;
                        i17 = i37;
                        c3 = 1;
                    }
                    switch (i17) {
                        case 0:
                            i18 = i31;
                            if (i32 != 1) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i13 = i27;
                                i14 = i30;
                                i15 = i35;
                                i31 = i18;
                                i12 = i38;
                                break;
                            } else {
                                unsafe3 = unsafe4;
                                x2.c.d(obj5, j10, Double.longBitsToDouble(e1.u(i30, bArr2)));
                                i23 = i30 + 8;
                                i27 |= i40;
                                unsafe4 = unsafe3;
                                i25 = i35;
                                i24 = i18;
                                break;
                            }
                        case 1:
                            i18 = i31;
                            if (i32 != 5) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i13 = i27;
                                i14 = i30;
                                i15 = i35;
                                i31 = i18;
                                i12 = i38;
                                break;
                            } else {
                                x2.c.e(obj5, j10, Float.intBitsToFloat(e1.a(i30, bArr2)));
                                i23 = i30 + 4;
                                i27 |= i40;
                                i25 = i35;
                                i24 = i18;
                                break;
                            }
                        case 2:
                        case 3:
                            i18 = i31;
                            if (i32 != 0) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i13 = i27;
                                i14 = i30;
                                i15 = i35;
                                i31 = i18;
                                i12 = i38;
                                break;
                            } else {
                                int t6 = e1.t(bArr2, i30, mVar2);
                                unsafe4.putLong(obj5, j10, mVar2.b);
                                i27 |= i40;
                                i23 = t6;
                                i25 = i35;
                                i24 = i18;
                                break;
                            }
                        case 4:
                        case 11:
                            i18 = i31;
                            if (i32 != 0) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i13 = i27;
                                i14 = i30;
                                i15 = i35;
                                i31 = i18;
                                i12 = i38;
                                break;
                            } else {
                                int j11 = e1.j(bArr2, i30, mVar2);
                                unsafe4.putInt(obj5, j10, mVar2.a);
                                i27 |= i40;
                                i23 = j11;
                                i25 = i35;
                                i24 = i18;
                                break;
                            }
                        case 5:
                        case 14:
                            i18 = i31;
                            if (i32 != 1) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i13 = i27;
                                i14 = i30;
                                i15 = i35;
                                i31 = i18;
                                i12 = i38;
                                break;
                            } else {
                                unsafe4.putLong(obj5, j10, e1.u(i30, bArr2));
                                i23 = i30 + 8;
                                i27 |= i40;
                                i25 = i35;
                                i24 = i18;
                                break;
                            }
                        case 6:
                        case 13:
                            i18 = i31;
                            if (i32 != 5) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i13 = i27;
                                i14 = i30;
                                i15 = i35;
                                i31 = i18;
                                i12 = i38;
                                break;
                            } else {
                                unsafe4.putInt(obj5, j10, e1.a(i30, bArr2));
                                i23 = i30 + 4;
                                i27 |= i40;
                                i25 = i35;
                                i24 = i18;
                                break;
                            }
                        case 7:
                            i18 = i31;
                            if (i32 != 0) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i13 = i27;
                                i14 = i30;
                                i15 = i35;
                                i31 = i18;
                                i12 = i38;
                                break;
                            } else {
                                i23 = e1.t(bArr2, i30, mVar2);
                                x2.c.g(obj5, j10, mVar2.b != 0);
                                i27 |= i40;
                                i25 = i35;
                                i24 = i18;
                                break;
                            }
                        case 8:
                            i18 = i31;
                            if (i32 != 2) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i13 = i27;
                                i14 = i30;
                                i15 = i35;
                                i31 = i18;
                                i12 = i38;
                                break;
                            } else {
                                i23 = (i16 & TLObject.FLAG_29) == 0 ? e1.w(bArr2, i30, mVar2) : e1.x(bArr2, i30, mVar2);
                                unsafe4.putObject(obj5, j10, mVar2.c);
                                i27 |= i40;
                                i25 = i35;
                                i24 = i18;
                                break;
                            }
                        case 9:
                            i18 = i31;
                            if (i32 != 2) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i13 = i27;
                                i14 = i30;
                                i15 = i35;
                                i31 = i18;
                                i12 = i38;
                                break;
                            } else {
                                i23 = e1.g(e2Var.l(i35), bArr2, i30, i22, mVar2);
                                Object object = unsafe4.getObject(obj5, j10);
                                if (object == null) {
                                    unsafe4.putObject(obj5, j10, mVar2.c);
                                } else {
                                    unsafe4.putObject(obj5, j10, j1.b(object, mVar2.c));
                                }
                                i27 |= i40;
                                i25 = i35;
                                i24 = i18;
                                break;
                            }
                        case 10:
                            i18 = i31;
                            if (i32 != 2) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i13 = i27;
                                i14 = i30;
                                i15 = i35;
                                i31 = i18;
                                i12 = i38;
                                break;
                            } else {
                                i23 = e1.z(bArr2, i30, mVar2);
                                unsafe4.putObject(obj5, j10, mVar2.c);
                                i27 |= i40;
                                i25 = i35;
                                i24 = i18;
                                break;
                            }
                        case 12:
                            i18 = i31;
                            if (i32 != 0) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i13 = i27;
                                i14 = i30;
                                i15 = i35;
                                i31 = i18;
                                i12 = i38;
                                break;
                            } else {
                                i23 = e1.j(bArr2, i30, mVar2);
                                unsafe4.putInt(obj5, j10, mVar2.a);
                                i27 |= i40;
                                i25 = i35;
                                i24 = i18;
                                break;
                            }
                        case 15:
                            i18 = i31;
                            if (i32 != 0) {
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i13 = i27;
                                i14 = i30;
                                i15 = i35;
                                i31 = i18;
                                i12 = i38;
                                break;
                            } else {
                                i23 = e1.j(bArr2, i30, mVar2);
                                unsafe4.putInt(obj5, j10, e1.y(mVar2.a));
                                i27 |= i40;
                                i25 = i35;
                                i24 = i18;
                                break;
                            }
                        case 16:
                            if (i32 != 0) {
                                i18 = i31;
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i13 = i27;
                                i14 = i30;
                                i15 = i35;
                                i31 = i18;
                                i12 = i38;
                                break;
                            } else {
                                int t9 = e1.t(bArr2, i30, mVar2);
                                long j12 = mVar2.b;
                                i18 = i31;
                                unsafe4.putLong(obj5, j10, (j12 >>> c3) ^ (-(j12 & 1)));
                                i27 |= i40;
                                i23 = t9;
                                i25 = i35;
                                i24 = i18;
                                break;
                            }
                        default:
                            unsafe2 = unsafe4;
                            obj3 = obj5;
                            i18 = i31;
                            obj2 = obj3;
                            unsafe = unsafe2;
                            i13 = i27;
                            i14 = i30;
                            i15 = i35;
                            i31 = i18;
                            i12 = i38;
                            break;
                    }
                } else {
                    i18 = i31;
                    unsafe3 = unsafe4;
                    Object obj6 = obj5;
                    if (i37 != 27) {
                        if (i37 <= 49) {
                            long j13 = i36;
                            unsafe = unsafe3;
                            i13 = i27;
                            i20 = i26;
                            i31 = i18;
                            i12 = i38;
                            i21 = e2Var.i(obj, bArr, i30, i11, i12, i31, i32, i35, j13, i37, j10, mVar);
                            obj5 = obj;
                            i15 = i35;
                            if (i21 == i30) {
                                obj2 = obj5;
                                i14 = i21;
                            } else {
                                i22 = i11;
                                mVar2 = mVar;
                                i24 = i31;
                                i23 = i21;
                                i25 = i15;
                                i26 = i20;
                                i27 = i13;
                                unsafe4 = unsafe;
                                bArr2 = bArr;
                            }
                        } else {
                            unsafe = unsafe3;
                            i13 = i27;
                            i15 = i35;
                            i19 = i30;
                            i20 = i26;
                            i31 = i18;
                            i12 = i38;
                            obj4 = obj;
                            if (i37 != 50) {
                                i21 = e2Var.h(obj4, bArr, i19, i11, i12, i31, i32, i36, i37, j10, i15, mVar);
                                obj2 = obj4;
                                if (i21 == i19) {
                                    i14 = i21;
                                } else {
                                    e2Var = this;
                                    mVar2 = mVar;
                                    i24 = i31;
                                    i23 = i21;
                                    obj5 = obj2;
                                    i25 = i15;
                                    i26 = i20;
                                    i27 = i13;
                                    unsafe4 = unsafe;
                                    bArr2 = bArr;
                                    i22 = i11;
                                }
                            } else if (i32 == 2) {
                                e2Var.p(j10, obj4, i15);
                                throw null;
                            }
                        }
                        i26 = i20;
                    } else if (i32 == 2) {
                        o1 o1Var = (o1) unsafe3.getObject(obj6, j10);
                        if (!o1Var.zza()) {
                            int size = o1Var.size();
                            o1Var = o1Var.zza(size == 0 ? 10 : size << 1);
                            unsafe3.putObject(obj6, j10, o1Var);
                        }
                        int e = e1.e(e2Var.l(i35), i38, bArr2, i30, i22, o1Var, mVar2);
                        obj5 = obj;
                        bArr2 = bArr;
                        i22 = i11;
                        mVar2 = mVar;
                        i23 = e;
                        unsafe4 = unsafe3;
                        i25 = i35;
                        i24 = i18;
                    } else {
                        obj4 = obj;
                        unsafe = unsafe3;
                        i13 = i27;
                        i19 = i30;
                        i15 = i35;
                        i31 = i18;
                        i12 = i38;
                        i20 = i26;
                    }
                    obj2 = obj4;
                    i14 = i19;
                    i26 = i20;
                }
            }
            int c10 = e1.c(i12, bArr, i14, i11, C(obj2), mVar);
            bArr2 = bArr;
            mVar2 = mVar;
            i24 = i31;
            obj5 = obj2;
            i25 = i15;
            i27 = i13;
            unsafe4 = unsafe;
            i22 = i11;
            i23 = c10;
            e2Var = this;
        }
        Unsafe unsafe5 = unsafe4;
        int i42 = i22;
        int i43 = i26;
        int i44 = i27;
        Object obj7 = obj5;
        if (i43 != 1048575) {
            unsafe5.putInt(obj7, i43, i44);
        }
        if (i23 != i42) {
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
        int i10 = 0;
        while (true) {
            boolean z4 = true;
            if (i10 < length) {
                int z10 = z(i10);
                long j10 = z10 & 1048575;
                switch ((z10 & 267386880) >>> 20) {
                    case 0:
                        if (y(f1Var, f1Var2, i10)) {
                            w2 w2Var = x2.c;
                            break;
                        }
                        z4 = false;
                        break;
                    case 1:
                        if (y(f1Var, f1Var2, i10)) {
                            w2 w2Var2 = x2.c;
                            break;
                        }
                        z4 = false;
                        break;
                    case 2:
                        if (y(f1Var, f1Var2, i10)) {
                            w2 w2Var3 = x2.c;
                            break;
                        }
                        z4 = false;
                        break;
                    case 3:
                        if (y(f1Var, f1Var2, i10)) {
                            w2 w2Var4 = x2.c;
                            break;
                        }
                        z4 = false;
                        break;
                    case 4:
                        if (y(f1Var, f1Var2, i10)) {
                            w2 w2Var5 = x2.c;
                            break;
                        }
                        z4 = false;
                        break;
                    case 5:
                        if (y(f1Var, f1Var2, i10)) {
                            w2 w2Var6 = x2.c;
                            break;
                        }
                        z4 = false;
                        break;
                    case 6:
                        if (y(f1Var, f1Var2, i10)) {
                            w2 w2Var7 = x2.c;
                            break;
                        }
                        z4 = false;
                        break;
                    case 7:
                        if (y(f1Var, f1Var2, i10)) {
                            w2 w2Var8 = x2.c;
                            break;
                        }
                        z4 = false;
                        break;
                    case 8:
                        if (y(f1Var, f1Var2, i10)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 9:
                        if (y(f1Var, f1Var2, i10)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 10:
                        if (y(f1Var, f1Var2, i10)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 11:
                        if (y(f1Var, f1Var2, i10)) {
                            w2 w2Var9 = x2.c;
                            break;
                        }
                        z4 = false;
                        break;
                    case 12:
                        if (y(f1Var, f1Var2, i10)) {
                            w2 w2Var10 = x2.c;
                            break;
                        }
                        z4 = false;
                        break;
                    case 13:
                        if (y(f1Var, f1Var2, i10)) {
                            w2 w2Var11 = x2.c;
                            break;
                        }
                        z4 = false;
                        break;
                    case 14:
                        if (y(f1Var, f1Var2, i10)) {
                            w2 w2Var12 = x2.c;
                            break;
                        }
                        z4 = false;
                        break;
                    case 15:
                        if (y(f1Var, f1Var2, i10)) {
                            w2 w2Var13 = x2.c;
                            break;
                        }
                        z4 = false;
                        break;
                    case 16:
                        if (y(f1Var, f1Var2, i10)) {
                            w2 w2Var14 = x2.c;
                            break;
                        }
                        z4 = false;
                        break;
                    case 17:
                        if (y(f1Var, f1Var2, i10)) {
                            break;
                        }
                        z4 = false;
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
                        z4 = o2.i(x2.l(f1Var, j10), x2.l(f1Var2, j10));
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        z4 = o2.i(x2.l(f1Var, j10), x2.l(f1Var2, j10));
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
                        w2 w2Var15 = x2.c;
                        if (w2Var15.k(f1Var, j11) == w2Var15.k(f1Var2, j11)) {
                            break;
                        }
                        z4 = false;
                        break;
                }
                if (z4) {
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

    public final int h(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, com.google.android.gms.internal.clearcut.m mVar) {
        int i18;
        int i19;
        int t6;
        Object object;
        Unsafe unsafe = o;
        long j11 = this.a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                i18 = i10;
                if (i14 != 1) {
                    return i18;
                }
                unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(e1.u(i18, bArr))));
                t6 = i18 + 8;
                unsafe.putInt(obj, j11, i13);
                return t6;
            case 52:
                i19 = i10;
                if (i14 != 5) {
                    return i19;
                }
                unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(e1.a(i19, bArr))));
                t6 = i19 + 4;
                unsafe.putInt(obj, j11, i13);
                return t6;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                t6 = e1.t(bArr, i10, mVar);
                unsafe.putObject(obj, j10, Long.valueOf(mVar.b));
                unsafe.putInt(obj, j11, i13);
                return t6;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                t6 = e1.j(bArr, i10, mVar);
                unsafe.putObject(obj, j10, Integer.valueOf(mVar.a));
                unsafe.putInt(obj, j11, i13);
                return t6;
            case 56:
            case VoIPService.CALL_MIN_LAYER /* 65 */:
                i18 = i10;
                if (i14 != 1) {
                    return i18;
                }
                unsafe.putObject(obj, j10, Long.valueOf(e1.u(i18, bArr)));
                t6 = i18 + 8;
                unsafe.putInt(obj, j11, i13);
                return t6;
            case 57:
            case 64:
                i19 = i10;
                if (i14 != 5) {
                    return i19;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(e1.a(i19, bArr)));
                t6 = i19 + 4;
                unsafe.putInt(obj, j11, i13);
                return t6;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                t6 = e1.t(bArr, i10, mVar);
                unsafe.putObject(obj, j10, Boolean.valueOf(mVar.b != 0));
                unsafe.putInt(obj, j11, i13);
                return t6;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int j12 = e1.j(bArr, i10, mVar);
                int i20 = mVar.a;
                if (i20 == 0) {
                    unsafe.putObject(obj, j10, "");
                } else {
                    if ((i15 & TLObject.FLAG_29) != 0) {
                        if (!a3.a.s(j12, j12 + i20, bArr)) {
                            throw n1.c();
                        }
                    }
                    unsafe.putObject(obj, j10, new String(bArr, j12, i20, j1.a));
                    j12 += i20;
                }
                unsafe.putInt(obj, j11, i13);
                return j12;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                int g10 = e1.g(l(i17), bArr, i10, i11, mVar);
                object = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                if (object == null) {
                    unsafe.putObject(obj, j10, mVar.c);
                } else {
                    unsafe.putObject(obj, j10, j1.b(object, mVar.c));
                }
                unsafe.putInt(obj, j11, i13);
                return g10;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                t6 = e1.z(bArr, i10, mVar);
                unsafe.putObject(obj, j10, mVar.c);
                unsafe.putInt(obj, j11, i13);
                return t6;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int j13 = e1.j(bArr, i10, mVar);
                int i21 = mVar.a;
                k1 x10 = x(i17);
                if (x10 != null && !x10.zza(i21)) {
                    C(obj).a(i12, Long.valueOf(i21));
                    return j13;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(i21));
                t6 = j13;
                unsafe.putInt(obj, j11, i13);
                return t6;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                t6 = e1.j(bArr, i10, mVar);
                unsafe.putObject(obj, j10, Integer.valueOf(e1.y(mVar.a)));
                unsafe.putInt(obj, j11, i13);
                return t6;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                t6 = e1.t(bArr, i10, mVar);
                long j14 = mVar.b;
                unsafe.putObject(obj, j10, Long.valueOf((-(j14 & 1)) ^ (j14 >>> 1)));
                unsafe.putInt(obj, j11, i13);
                return t6;
            case 68:
                if (i14 == 3) {
                    t6 = e1.f(l(i17), bArr, i10, i11, (i12 & (-8)) | 4, mVar);
                    object = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j10, mVar.c);
                    } else {
                        unsafe.putObject(obj, j10, j1.b(object, mVar.c));
                    }
                    unsafe.putInt(obj, j11, i13);
                    return t6;
                }
            default:
                return i10;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int i(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, com.google.android.gms.internal.clearcut.m mVar) {
        int b10;
        Unsafe unsafe = o;
        o1 o1Var = (o1) unsafe.getObject(obj, j11);
        if (!o1Var.zza()) {
            int size = o1Var.size();
            o1Var = o1Var.zza(size == 0 ? 10 : size << 1);
            unsafe.putObject(obj, j11, o1Var);
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
                int j12 = e1.j(bArr, i10, mVar);
                int i17 = mVar.a + j12;
                if (j12 < i17) {
                    Double.longBitsToDouble(e1.u(j12, bArr));
                    throw null;
                }
                if (j12 == i17) {
                    return j12;
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
                int j13 = e1.j(bArr, i10, mVar);
                int i18 = mVar.a + j13;
                if (j13 < i18) {
                    Float.intBitsToFloat(e1.a(j13, bArr));
                    throw null;
                }
                if (j13 == i18) {
                    return j13;
                }
                throw n1.a();
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 != 2) {
                    if (i14 == 0) {
                        e1.t(bArr, i10, mVar);
                        throw null;
                    }
                    return i10;
                }
                int j14 = e1.j(bArr, i10, mVar);
                int i19 = mVar.a + j14;
                if (j14 < i19) {
                    e1.t(bArr, j14, mVar);
                    throw null;
                }
                if (j14 == i19) {
                    return j14;
                }
                throw n1.a();
            case 22:
            case 29:
            case Maneuver.TYPE_DESTINATION /* 39 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                if (i14 != 2) {
                    if (i14 == 0) {
                        return e1.b(i12, bArr, i10, i11, o1Var2, mVar);
                    }
                    return i10;
                }
                h1 h1Var = (h1) o1Var2;
                int j15 = e1.j(bArr, i10, mVar);
                int i20 = mVar.a + j15;
                while (j15 < i20) {
                    j15 = e1.j(bArr, j15, mVar);
                    h1Var.n(mVar.a);
                }
                if (j15 == i20) {
                    return j15;
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
                int j16 = e1.j(bArr, i10, mVar);
                int i21 = mVar.a + j16;
                if (j16 < i21) {
                    e1.u(j16, bArr);
                    throw null;
                }
                if (j16 == i21) {
                    return j16;
                }
                throw n1.a();
            case 24:
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                if (i14 == 2) {
                    h1 h1Var2 = (h1) o1Var2;
                    int j17 = e1.j(bArr, i10, mVar);
                    int i22 = mVar.a + j17;
                    while (j17 < i22) {
                        h1Var2.n(e1.a(j17, bArr));
                        j17 += 4;
                    }
                    if (j17 == i22) {
                        return j17;
                    }
                    throw n1.a();
                }
                if (i14 == 5) {
                    h1 h1Var3 = (h1) o1Var2;
                    h1Var3.n(e1.a(i10, bArr));
                    int i23 = i10 + 4;
                    while (i23 < i11) {
                        int j18 = e1.j(bArr, i23, mVar);
                        if (i12 != mVar.a) {
                            return i23;
                        }
                        h1Var3.n(e1.a(j18, bArr));
                        i23 = j18 + 4;
                    }
                    return i23;
                }
                return i10;
            case 25:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                if (i14 != 2) {
                    if (i14 == 0) {
                        e1.t(bArr, i10, mVar);
                        throw null;
                    }
                    return i10;
                }
                int j19 = e1.j(bArr, i10, mVar);
                int i24 = mVar.a + j19;
                if (j19 < i24) {
                    e1.t(bArr, j19, mVar);
                    throw null;
                }
                if (j19 == i24) {
                    return j19;
                }
                throw n1.a();
            case 26:
                if (i14 == 2) {
                    if ((j10 & 536870912) == 0) {
                        int j20 = e1.j(bArr, i10, mVar);
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
                        while (j20 < i11) {
                            int j21 = e1.j(bArr, j20, mVar);
                            if (i12 != mVar.a) {
                                return j20;
                            }
                            j20 = e1.j(bArr, j21, mVar);
                            int i26 = mVar.a;
                            if (i26 < 0) {
                                throw n1.b();
                            }
                            if (i26 == 0) {
                                o1Var2.add("");
                            } else {
                                o1Var2.add(new String(bArr, j20, i26, j1.a));
                                j20 += i26;
                            }
                        }
                        return j20;
                    }
                    int j22 = e1.j(bArr, i10, mVar);
                    int i27 = mVar.a;
                    if (i27 < 0) {
                        throw n1.b();
                    }
                    if (i27 == 0) {
                        o1Var2.add("");
                    } else {
                        int i28 = j22 + i27;
                        if (!a3.a.s(j22, i28, bArr)) {
                            throw n1.c();
                        }
                        o1Var2.add(new String(bArr, j22, i27, j1.a));
                        j22 = i28;
                    }
                    while (j22 < i11) {
                        int j23 = e1.j(bArr, j22, mVar);
                        if (i12 != mVar.a) {
                            return j22;
                        }
                        j22 = e1.j(bArr, j23, mVar);
                        int i29 = mVar.a;
                        if (i29 < 0) {
                            throw n1.b();
                        }
                        if (i29 == 0) {
                            o1Var2.add("");
                        } else {
                            int i30 = j22 + i29;
                            if (!a3.a.s(j22, i30, bArr)) {
                                throw n1.c();
                            }
                            o1Var2.add(new String(bArr, j22, i29, j1.a));
                            j22 = i30;
                        }
                    }
                    return j22;
                }
                return i10;
            case 27:
                if (i14 == 2) {
                    return e1.e(l(i15), i12, bArr, i10, i11, o1Var2, mVar);
                }
                return i10;
            case 28:
                if (i14 == 2) {
                    int j24 = e1.j(bArr, i10, mVar);
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
                    while (j24 < i11) {
                        int j25 = e1.j(bArr, j24, mVar);
                        if (i12 != mVar.a) {
                            return j24;
                        }
                        j24 = e1.j(bArr, j25, mVar);
                        int i32 = mVar.a;
                        if (i32 < 0) {
                            throw n1.b();
                        }
                        if (i32 > bArr.length - j24) {
                            throw n1.a();
                        }
                        if (i32 == 0) {
                            o1Var2.add(q0.c);
                        } else {
                            o1Var2.add(q0.o(j24, i32, bArr));
                            j24 += i32;
                        }
                    }
                    return j24;
                }
                return i10;
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                if (i14 != 2) {
                    if (i14 == 0) {
                        b10 = e1.b(i12, bArr, i10, i11, o1Var2, mVar);
                    }
                    return i10;
                }
                h1 h1Var4 = (h1) o1Var2;
                b10 = e1.j(bArr, i10, mVar);
                int i33 = mVar.a + b10;
                while (b10 < i33) {
                    b10 = e1.j(bArr, b10, mVar);
                    h1Var4.n(mVar.a);
                }
                if (b10 != i33) {
                    throw n1.a();
                }
                f1 f1Var = (f1) obj;
                q2 q2Var = f1Var.zzb;
                q2 q2Var2 = q2Var != q2.f ? q2Var : null;
                k1 x10 = x(i15);
                Class cls = o2.a;
                if (x10 != null) {
                    boolean z4 = o1Var2 instanceof RandomAccess;
                    p2 p2Var = this.l;
                    if (z4) {
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
                                if (q2Var2 == null) {
                                    p2Var.getClass();
                                    q2Var2 = q2.b();
                                }
                                p2Var.getClass();
                                q2Var2.a(i13 << 3, Long.valueOf(intValue));
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
                                if (q2Var2 == null) {
                                    p2Var.getClass();
                                    q2Var2 = q2.b();
                                }
                                p2Var.getClass();
                                q2Var2.a(i13 << 3, Long.valueOf(intValue2));
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
                if (i14 == 2) {
                    h1 h1Var5 = (h1) o1Var2;
                    int j26 = e1.j(bArr, i10, mVar);
                    int i36 = mVar.a + j26;
                    while (j26 < i36) {
                        j26 = e1.j(bArr, j26, mVar);
                        h1Var5.n(e1.y(mVar.a));
                    }
                    if (j26 == i36) {
                        return j26;
                    }
                    throw n1.a();
                }
                if (i14 == 0) {
                    h1 h1Var6 = (h1) o1Var2;
                    int j27 = e1.j(bArr, i10, mVar);
                    h1Var6.n(e1.y(mVar.a));
                    while (j27 < i11) {
                        int j28 = e1.j(bArr, j27, mVar);
                        if (i12 != mVar.a) {
                            return j27;
                        }
                        j27 = e1.j(bArr, j28, mVar);
                        h1Var6.n(e1.y(mVar.a));
                    }
                    return j27;
                }
                return i10;
            case 34:
            case 48:
                if (i14 != 2) {
                    if (i14 == 0) {
                        e1.t(bArr, i10, mVar);
                        throw null;
                    }
                    return i10;
                }
                int j29 = e1.j(bArr, i10, mVar);
                int i37 = mVar.a + j29;
                if (j29 < i37) {
                    e1.t(bArr, j29, mVar);
                    throw null;
                }
                if (j29 == i37) {
                    return j29;
                }
                throw n1.a();
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                if (i14 == 3) {
                    n2 l10 = l(i15);
                    int i38 = (i12 & (-8)) | 4;
                    int f10 = e1.f(l10, bArr, i10, i11, i38, mVar);
                    n2 n2Var = l10;
                    int i39 = i11;
                    com.google.android.gms.internal.clearcut.m mVar2 = mVar;
                    o1Var2.add(mVar2.c);
                    while (f10 < i39) {
                        int j30 = e1.j(bArr, f10, mVar2);
                        if (i12 != mVar2.a) {
                            return f10;
                        }
                        n2 n2Var2 = n2Var;
                        int i40 = i39;
                        com.google.android.gms.internal.clearcut.m mVar3 = mVar2;
                        f10 = e1.f(n2Var2, bArr, j30, i40, i38, mVar3);
                        o1Var2.add(mVar3.c);
                        n2Var = n2Var2;
                        i39 = i40;
                        mVar2 = mVar3;
                    }
                    return f10;
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
    public final int j(Object obj, byte[] bArr, int i10, int i11, int i12, com.google.android.gms.internal.clearcut.m mVar) {
        int i13;
        Unsafe unsafe;
        int[] iArr;
        e2 e2Var;
        Object obj2;
        int i14;
        int i15;
        Object obj3;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int h;
        int i21;
        int i22;
        int i23;
        int i24;
        Unsafe unsafe2;
        int i25;
        Unsafe unsafe3;
        Object obj4;
        int i26;
        int i27;
        Unsafe unsafe4;
        int i28;
        int i29;
        Object obj5;
        e2 e2Var2 = this;
        Object obj6 = obj;
        byte[] bArr2 = bArr;
        int i30 = i11;
        com.google.android.gms.internal.clearcut.m mVar2 = mVar;
        Unsafe unsafe5 = o;
        int i31 = i10;
        int i32 = -1;
        int i33 = 0;
        int i34 = 0;
        int i35 = 1048575;
        int i36 = 0;
        while (true) {
            int[] iArr2 = e2Var2.a;
            if (i31 < i30) {
                int i37 = i31 + 1;
                int i38 = bArr2[i31];
                if (i38 < 0) {
                    i37 = e1.d(i38, bArr2, i37, mVar2);
                    i38 = mVar2.a;
                }
                int i39 = i38 >>> 3;
                int i40 = i37;
                int i41 = i38 & 7;
                int i42 = e2Var2.d;
                int i43 = e2Var2.c;
                int i44 = i38;
                int s6 = i39 > i32 ? (i39 < i43 || i39 > i42) ? -1 : e2Var2.s(i39, i33 / 3) : (i39 < i43 || i39 > i42) ? -1 : e2Var2.s(i39, 0);
                if (s6 == -1) {
                    i14 = i44;
                    i13 = i35;
                    unsafe = unsafe5;
                    iArr = iArr2;
                    i20 = i39;
                    i15 = 0;
                    e2Var = e2Var2;
                    obj2 = obj6;
                    i21 = i40;
                } else {
                    int i45 = iArr2[s6 + 1];
                    int i46 = (i45 & 267386880) >>> 20;
                    long j10 = i45 & 1048575;
                    if (i46 <= 17) {
                        int i47 = iArr2[s6 + 2];
                        int i48 = 1 << (i47 >>> 20);
                        int i49 = i47 & 1048575;
                        iArr = iArr2;
                        if (i49 != i35) {
                            i23 = i48;
                            if (i35 != 1048575) {
                                unsafe5.putInt(obj6, i35, i36);
                            }
                            i36 = unsafe5.getInt(obj6, i49);
                            i22 = i49;
                        } else {
                            i23 = i48;
                            i22 = i35;
                        }
                        switch (i46) {
                            case 0:
                                i14 = i44;
                                i24 = i39;
                                i15 = s6;
                                unsafe2 = unsafe5;
                                i25 = i40;
                                if (i41 == 1) {
                                    unsafe3 = unsafe2;
                                    x2.c.d(obj6, j10, Double.longBitsToDouble(e1.u(i25, bArr)));
                                    obj4 = obj6;
                                    i26 = i25 + 8;
                                    i20 = i24;
                                    i30 = i11;
                                    e2Var = e2Var2;
                                    obj2 = obj4;
                                    i36 |= i23;
                                    unsafe = unsafe3;
                                    i31 = i26;
                                    bArr2 = bArr;
                                    mVar2 = mVar;
                                    i32 = i20;
                                    e2Var2 = e2Var;
                                    obj6 = obj2;
                                    i35 = i22;
                                    i34 = i14;
                                    i33 = i15;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i20 = i24;
                                e2Var = e2Var2;
                                unsafe = unsafe4;
                                i21 = i25;
                                i13 = i22;
                                obj2 = obj5;
                                break;
                            case 1:
                                i14 = i44;
                                i24 = i39;
                                i15 = s6;
                                unsafe2 = unsafe5;
                                i25 = i40;
                                if (i41 == 5) {
                                    x2.c.e(obj6, j10, Float.intBitsToFloat(e1.a(i25, bArr)));
                                    i27 = i25 + 4;
                                    int i50 = i27;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i26 = i50;
                                    i20 = i24;
                                    i30 = i11;
                                    e2Var = e2Var2;
                                    obj2 = obj4;
                                    i36 |= i23;
                                    unsafe = unsafe3;
                                    i31 = i26;
                                    bArr2 = bArr;
                                    mVar2 = mVar;
                                    i32 = i20;
                                    e2Var2 = e2Var;
                                    obj6 = obj2;
                                    i35 = i22;
                                    i34 = i14;
                                    i33 = i15;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i20 = i24;
                                e2Var = e2Var2;
                                unsafe = unsafe4;
                                i21 = i25;
                                i13 = i22;
                                obj2 = obj5;
                                break;
                            case 2:
                            case 3:
                                i14 = i44;
                                i24 = i39;
                                i15 = s6;
                                unsafe2 = unsafe5;
                                i25 = i40;
                                if (i41 == 0) {
                                    i27 = e1.t(bArr, i25, mVar2);
                                    unsafe2.putLong(obj6, j10, mVar2.b);
                                    int i502 = i27;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i26 = i502;
                                    i20 = i24;
                                    i30 = i11;
                                    e2Var = e2Var2;
                                    obj2 = obj4;
                                    i36 |= i23;
                                    unsafe = unsafe3;
                                    i31 = i26;
                                    bArr2 = bArr;
                                    mVar2 = mVar;
                                    i32 = i20;
                                    e2Var2 = e2Var;
                                    obj6 = obj2;
                                    i35 = i22;
                                    i34 = i14;
                                    i33 = i15;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i20 = i24;
                                e2Var = e2Var2;
                                unsafe = unsafe4;
                                i21 = i25;
                                i13 = i22;
                                obj2 = obj5;
                                break;
                            case 4:
                            case 11:
                                i14 = i44;
                                i24 = i39;
                                i15 = s6;
                                unsafe2 = unsafe5;
                                i25 = i40;
                                if (i41 == 0) {
                                    i27 = e1.j(bArr, i25, mVar2);
                                    unsafe2.putInt(obj6, j10, mVar2.a);
                                    int i5022 = i27;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i26 = i5022;
                                    i20 = i24;
                                    i30 = i11;
                                    e2Var = e2Var2;
                                    obj2 = obj4;
                                    i36 |= i23;
                                    unsafe = unsafe3;
                                    i31 = i26;
                                    bArr2 = bArr;
                                    mVar2 = mVar;
                                    i32 = i20;
                                    e2Var2 = e2Var;
                                    obj6 = obj2;
                                    i35 = i22;
                                    i34 = i14;
                                    i33 = i15;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i20 = i24;
                                e2Var = e2Var2;
                                unsafe = unsafe4;
                                i21 = i25;
                                i13 = i22;
                                obj2 = obj5;
                                break;
                            case 5:
                            case 14:
                                i14 = i44;
                                i24 = i39;
                                i15 = s6;
                                unsafe2 = unsafe5;
                                if (i41 != 1) {
                                    i25 = i40;
                                    unsafe4 = unsafe2;
                                    obj5 = obj6;
                                    i20 = i24;
                                    e2Var = e2Var2;
                                    unsafe = unsafe4;
                                    i21 = i25;
                                    i13 = i22;
                                    obj2 = obj5;
                                    break;
                                } else {
                                    unsafe2.putLong(obj6, j10, e1.u(i40, bArr));
                                    i27 = i40 + 8;
                                    int i50222 = i27;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i26 = i50222;
                                    i20 = i24;
                                    i30 = i11;
                                    e2Var = e2Var2;
                                    obj2 = obj4;
                                    i36 |= i23;
                                    unsafe = unsafe3;
                                    i31 = i26;
                                    bArr2 = bArr;
                                    mVar2 = mVar;
                                    i32 = i20;
                                    e2Var2 = e2Var;
                                    obj6 = obj2;
                                    i35 = i22;
                                    i34 = i14;
                                    i33 = i15;
                                    unsafe5 = unsafe;
                                }
                            case 6:
                            case 13:
                                i14 = i44;
                                i24 = i39;
                                i28 = i40;
                                i15 = s6;
                                unsafe2 = unsafe5;
                                if (i41 == 5) {
                                    unsafe2.putInt(obj6, j10, e1.a(i28, bArr));
                                    i27 = i28 + 4;
                                    int i502222 = i27;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i26 = i502222;
                                    i20 = i24;
                                    i30 = i11;
                                    e2Var = e2Var2;
                                    obj2 = obj4;
                                    i36 |= i23;
                                    unsafe = unsafe3;
                                    i31 = i26;
                                    bArr2 = bArr;
                                    mVar2 = mVar;
                                    i32 = i20;
                                    e2Var2 = e2Var;
                                    obj6 = obj2;
                                    i35 = i22;
                                    i34 = i14;
                                    i33 = i15;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i25 = i28;
                                i20 = i24;
                                e2Var = e2Var2;
                                unsafe = unsafe4;
                                i21 = i25;
                                i13 = i22;
                                obj2 = obj5;
                                break;
                            case 7:
                                i14 = i44;
                                i24 = i39;
                                i28 = i40;
                                i15 = s6;
                                unsafe2 = unsafe5;
                                if (i41 == 0) {
                                    i27 = e1.t(bArr, i28, mVar2);
                                    x2.c.g(obj6, j10, mVar2.b != 0);
                                    int i5022222 = i27;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i26 = i5022222;
                                    i20 = i24;
                                    i30 = i11;
                                    e2Var = e2Var2;
                                    obj2 = obj4;
                                    i36 |= i23;
                                    unsafe = unsafe3;
                                    i31 = i26;
                                    bArr2 = bArr;
                                    mVar2 = mVar;
                                    i32 = i20;
                                    e2Var2 = e2Var;
                                    obj6 = obj2;
                                    i35 = i22;
                                    i34 = i14;
                                    i33 = i15;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i25 = i28;
                                i20 = i24;
                                e2Var = e2Var2;
                                unsafe = unsafe4;
                                i21 = i25;
                                i13 = i22;
                                obj2 = obj5;
                                break;
                            case 8:
                                i14 = i44;
                                i24 = i39;
                                i28 = i40;
                                i15 = s6;
                                unsafe2 = unsafe5;
                                if (i41 == 2) {
                                    i27 = (i45 & TLObject.FLAG_29) == 0 ? e1.w(bArr, i28, mVar2) : e1.x(bArr, i28, mVar2);
                                    unsafe2.putObject(obj6, j10, mVar2.c);
                                    int i50222222 = i27;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i26 = i50222222;
                                    i20 = i24;
                                    i30 = i11;
                                    e2Var = e2Var2;
                                    obj2 = obj4;
                                    i36 |= i23;
                                    unsafe = unsafe3;
                                    i31 = i26;
                                    bArr2 = bArr;
                                    mVar2 = mVar;
                                    i32 = i20;
                                    e2Var2 = e2Var;
                                    obj6 = obj2;
                                    i35 = i22;
                                    i34 = i14;
                                    i33 = i15;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i25 = i28;
                                i20 = i24;
                                e2Var = e2Var2;
                                unsafe = unsafe4;
                                i21 = i25;
                                i13 = i22;
                                obj2 = obj5;
                                break;
                            case 9:
                                i14 = i44;
                                i24 = i39;
                                i28 = i40;
                                i15 = s6;
                                unsafe2 = unsafe5;
                                if (i41 == 2) {
                                    int g10 = e1.g(e2Var2.l(i15), bArr, i28, i11, mVar2);
                                    if ((i36 & i23) == 0) {
                                        unsafe2.putObject(obj6, j10, mVar2.c);
                                    } else {
                                        unsafe2.putObject(obj6, j10, j1.b(unsafe2.getObject(obj6, j10), mVar2.c));
                                    }
                                    i29 = g10;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i26 = i29;
                                    i20 = i24;
                                    i30 = i11;
                                    e2Var = e2Var2;
                                    obj2 = obj4;
                                    i36 |= i23;
                                    unsafe = unsafe3;
                                    i31 = i26;
                                    bArr2 = bArr;
                                    mVar2 = mVar;
                                    i32 = i20;
                                    e2Var2 = e2Var;
                                    obj6 = obj2;
                                    i35 = i22;
                                    i34 = i14;
                                    i33 = i15;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i25 = i28;
                                i20 = i24;
                                e2Var = e2Var2;
                                unsafe = unsafe4;
                                i21 = i25;
                                i13 = i22;
                                obj2 = obj5;
                                break;
                            case 10:
                                i14 = i44;
                                i24 = i39;
                                i28 = i40;
                                i15 = s6;
                                unsafe2 = unsafe5;
                                if (i41 == 2) {
                                    i27 = e1.z(bArr, i28, mVar2);
                                    unsafe2.putObject(obj6, j10, mVar2.c);
                                    int i502222222 = i27;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i26 = i502222222;
                                    i20 = i24;
                                    i30 = i11;
                                    e2Var = e2Var2;
                                    obj2 = obj4;
                                    i36 |= i23;
                                    unsafe = unsafe3;
                                    i31 = i26;
                                    bArr2 = bArr;
                                    mVar2 = mVar;
                                    i32 = i20;
                                    e2Var2 = e2Var;
                                    obj6 = obj2;
                                    i35 = i22;
                                    i34 = i14;
                                    i33 = i15;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i25 = i28;
                                i20 = i24;
                                e2Var = e2Var2;
                                unsafe = unsafe4;
                                i21 = i25;
                                i13 = i22;
                                obj2 = obj5;
                                break;
                            case 12:
                                i14 = i44;
                                i24 = i39;
                                i28 = i40;
                                i15 = s6;
                                unsafe2 = unsafe5;
                                if (i41 == 0) {
                                    i27 = e1.j(bArr, i28, mVar2);
                                    int i51 = mVar2.a;
                                    k1 x10 = e2Var2.x(i15);
                                    if (x10 == null || x10.zza(i51)) {
                                        unsafe2.putInt(obj6, j10, i51);
                                        int i5022222222 = i27;
                                        unsafe3 = unsafe2;
                                        obj4 = obj6;
                                        i26 = i5022222222;
                                        i20 = i24;
                                        i30 = i11;
                                        e2Var = e2Var2;
                                        obj2 = obj4;
                                        i36 |= i23;
                                        unsafe = unsafe3;
                                        i31 = i26;
                                        bArr2 = bArr;
                                        mVar2 = mVar;
                                        i32 = i20;
                                        e2Var2 = e2Var;
                                        obj6 = obj2;
                                        i35 = i22;
                                        i34 = i14;
                                        i33 = i15;
                                        unsafe5 = unsafe;
                                    } else {
                                        C(obj6).a(i14, Long.valueOf(i51));
                                        i20 = i24;
                                        e2Var = e2Var2;
                                        unsafe = unsafe2;
                                        i31 = i27;
                                        i30 = i11;
                                        obj2 = obj6;
                                        bArr2 = bArr;
                                        mVar2 = mVar;
                                        i32 = i20;
                                        e2Var2 = e2Var;
                                        obj6 = obj2;
                                        i35 = i22;
                                        i34 = i14;
                                        i33 = i15;
                                        unsafe5 = unsafe;
                                    }
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i25 = i28;
                                i20 = i24;
                                e2Var = e2Var2;
                                unsafe = unsafe4;
                                i21 = i25;
                                i13 = i22;
                                obj2 = obj5;
                                break;
                            case 15:
                                i14 = i44;
                                i24 = i39;
                                i28 = i40;
                                i15 = s6;
                                unsafe2 = unsafe5;
                                if (i41 == 0) {
                                    i27 = e1.j(bArr, i28, mVar2);
                                    unsafe2.putInt(obj6, j10, e1.y(mVar2.a));
                                    int i50222222222 = i27;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i26 = i50222222222;
                                    i20 = i24;
                                    i30 = i11;
                                    e2Var = e2Var2;
                                    obj2 = obj4;
                                    i36 |= i23;
                                    unsafe = unsafe3;
                                    i31 = i26;
                                    bArr2 = bArr;
                                    mVar2 = mVar;
                                    i32 = i20;
                                    e2Var2 = e2Var;
                                    obj6 = obj2;
                                    i35 = i22;
                                    i34 = i14;
                                    i33 = i15;
                                    unsafe5 = unsafe;
                                }
                                unsafe4 = unsafe2;
                                obj5 = obj6;
                                i25 = i28;
                                i20 = i24;
                                e2Var = e2Var2;
                                unsafe = unsafe4;
                                i21 = i25;
                                i13 = i22;
                                obj2 = obj5;
                                break;
                            case 16:
                                i14 = i44;
                                i24 = i39;
                                com.google.android.gms.internal.clearcut.m mVar3 = mVar2;
                                i28 = i40;
                                if (i41 != 0) {
                                    i15 = s6;
                                    unsafe2 = unsafe5;
                                    unsafe4 = unsafe2;
                                    obj5 = obj6;
                                    i25 = i28;
                                    i20 = i24;
                                    e2Var = e2Var2;
                                    unsafe = unsafe4;
                                    i21 = i25;
                                    i13 = i22;
                                    obj2 = obj5;
                                    break;
                                } else {
                                    i27 = e1.t(bArr, i28, mVar3);
                                    long j11 = mVar3.b;
                                    i15 = s6;
                                    unsafe2 = unsafe5;
                                    unsafe2.putLong(obj6, j10, (j11 >>> 1) ^ (-(j11 & 1)));
                                    int i502222222222 = i27;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i26 = i502222222222;
                                    i20 = i24;
                                    i30 = i11;
                                    e2Var = e2Var2;
                                    obj2 = obj4;
                                    i36 |= i23;
                                    unsafe = unsafe3;
                                    i31 = i26;
                                    bArr2 = bArr;
                                    mVar2 = mVar;
                                    i32 = i20;
                                    e2Var2 = e2Var;
                                    obj6 = obj2;
                                    i35 = i22;
                                    i34 = i14;
                                    i33 = i15;
                                    unsafe5 = unsafe;
                                }
                            case 17:
                                if (i41 != 3) {
                                    i14 = i44;
                                    i24 = i39;
                                    i15 = s6;
                                    obj5 = obj6;
                                    unsafe4 = unsafe5;
                                    i25 = i40;
                                    i20 = i24;
                                    e2Var = e2Var2;
                                    unsafe = unsafe4;
                                    i21 = i25;
                                    i13 = i22;
                                    obj2 = obj5;
                                    break;
                                } else {
                                    i14 = i44;
                                    i24 = i39;
                                    com.google.android.gms.internal.clearcut.m mVar4 = mVar2;
                                    i29 = e1.f(e2Var2.l(s6), bArr, i40, i11, (i39 << 3) | 4, mVar4);
                                    if ((i36 & i23) == 0) {
                                        unsafe5.putObject(obj6, j10, mVar4.c);
                                    } else {
                                        unsafe5.putObject(obj6, j10, j1.b(unsafe5.getObject(obj6, j10), mVar4.c));
                                    }
                                    i15 = s6;
                                    unsafe2 = unsafe5;
                                    unsafe3 = unsafe2;
                                    obj4 = obj6;
                                    i26 = i29;
                                    i20 = i24;
                                    i30 = i11;
                                    e2Var = e2Var2;
                                    obj2 = obj4;
                                    i36 |= i23;
                                    unsafe = unsafe3;
                                    i31 = i26;
                                    bArr2 = bArr;
                                    mVar2 = mVar;
                                    i32 = i20;
                                    e2Var2 = e2Var;
                                    obj6 = obj2;
                                    i35 = i22;
                                    i34 = i14;
                                    i33 = i15;
                                    unsafe5 = unsafe;
                                }
                            default:
                                i14 = i44;
                                unsafe4 = unsafe5;
                                i24 = i39;
                                i25 = i40;
                                i15 = s6;
                                obj5 = obj6;
                                i20 = i24;
                                e2Var = e2Var2;
                                unsafe = unsafe4;
                                i21 = i25;
                                i13 = i22;
                                obj2 = obj5;
                                break;
                        }
                    } else {
                        i14 = i44;
                        iArr = iArr2;
                        i15 = s6;
                        Object obj7 = obj6;
                        Unsafe unsafe6 = unsafe5;
                        if (i46 == 27) {
                            if (i41 == 2) {
                                o1 o1Var = (o1) unsafe6.getObject(obj7, j10);
                                if (!o1Var.zza()) {
                                    int size = o1Var.size();
                                    o1Var = o1Var.zza(size == 0 ? 10 : size << 1);
                                    unsafe6.putObject(obj7, j10, o1Var);
                                }
                                obj2 = obj;
                                i20 = i39;
                                i30 = i11;
                                i31 = e1.e(e2Var2.l(i15), i14, bArr, i40, i11, o1Var, mVar2);
                                unsafe = unsafe6;
                                i22 = i35;
                                e2Var = e2Var2;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i32 = i20;
                                e2Var2 = e2Var;
                                obj6 = obj2;
                                i35 = i22;
                                i34 = i14;
                                i33 = i15;
                                unsafe5 = unsafe;
                            } else {
                                obj3 = obj;
                                i16 = i39;
                                i13 = i35;
                                i19 = i40;
                                unsafe = unsafe6;
                                i18 = i14;
                                i17 = i36;
                            }
                        } else if (i46 <= 49) {
                            long j12 = i45;
                            i20 = i39;
                            unsafe = unsafe6;
                            i13 = i35;
                            i17 = i36;
                            h = e2Var2.i(obj, bArr, i40, i11, i14, i20, i41, i15, j12, i46, j10, mVar);
                            i14 = i14;
                            i15 = i15;
                            e2Var = e2Var2;
                            if (h == i40) {
                                obj2 = obj;
                                i21 = h;
                                i36 = i17;
                            } else {
                                obj2 = obj;
                                i30 = i11;
                                i31 = h;
                                bArr2 = bArr;
                                mVar2 = mVar;
                                i32 = i20;
                                e2Var2 = e2Var;
                                obj6 = obj2;
                                i34 = i14;
                                i33 = i15;
                                i35 = i13;
                                i36 = i17;
                                unsafe5 = unsafe;
                            }
                        } else {
                            obj3 = obj;
                            i16 = i39;
                            i13 = i35;
                            unsafe = unsafe6;
                            i17 = i36;
                            i18 = i14;
                            i19 = i40;
                            if (i46 != 50) {
                                i20 = i16;
                                h = e2Var2.h(obj3, bArr, i19, i11, i18, i20, i41, i45, i46, j10, i15, mVar);
                                e2Var = e2Var2;
                                obj2 = obj3;
                                i14 = i18;
                            } else if (i41 == 2) {
                                e2Var2.p(j10, obj3, i15);
                                throw null;
                            }
                        }
                        e2Var = e2Var2;
                        i20 = i16;
                        obj2 = obj3;
                        i21 = i19;
                        i14 = i18;
                        i36 = i17;
                    }
                }
                if (i14 != i12 || i12 == 0) {
                    i30 = i11;
                    i31 = e1.c(i14, bArr, i21, i11, C(obj2), mVar);
                    i22 = i13;
                    bArr2 = bArr;
                    mVar2 = mVar;
                    i32 = i20;
                    e2Var2 = e2Var;
                    obj6 = obj2;
                    i35 = i22;
                    i34 = i14;
                    i33 = i15;
                    unsafe5 = unsafe;
                } else {
                    i30 = i11;
                    i31 = i21;
                    i34 = i14;
                }
            } else {
                i13 = i35;
                unsafe = unsafe5;
                iArr = iArr2;
                e2Var = e2Var2;
                obj2 = obj6;
            }
        }
        int i52 = i13;
        if (i52 != 1048575) {
            unsafe.putInt(obj2, i52, i36);
        }
        for (int i53 = e2Var.h; i53 < e2Var.i; i53++) {
            int i54 = e2Var.g[i53];
            int i55 = iArr[i54];
            Object l10 = x2.l(obj2, e2Var.z(i54) & 1048575);
            if (l10 != null && e2Var.x(i54) != null) {
                e2Var.m.getClass();
                if (e2Var.t(i54) == null) {
                    throw new NoSuchMethodError();
                }
                throw new ClassCastException();
            }
        }
        if (i12 == 0) {
            if (i31 != i30) {
                throw new n1("Failed to parse the message.");
            }
        } else if (i31 > i30 || i34 != i12) {
            throw new n1("Failed to parse the message.");
        }
        return i31;
    }

    public final n2 l(int i10) {
        int i11 = (i10 / 3) << 1;
        Object[] objArr = this.b;
        n2 n2Var = (n2) objArr[i11];
        if (n2Var != null) {
            return n2Var;
        }
        n2 a2 = k2.c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a2;
        return a2;
    }

    public final void o(int i10, Object obj, Object obj2) {
        long z4 = z(i10) & 1048575;
        if (r(i10, obj2)) {
            Object l10 = x2.l(obj, z4);
            Object l11 = x2.l(obj2, z4);
            if (l10 != null && l11 != null) {
                x2.d(obj, z4, j1.b(l10, l11));
                u(i10, obj);
            } else if (l11 != null) {
                x2.d(obj, z4, l11);
                u(i10, obj);
            }
        }
    }

    public final void p(long j10, Object obj, int i10) {
        a2 a2Var;
        Unsafe unsafe = o;
        Object t6 = t(i10);
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
        if (t6 != null) {
            throw new ClassCastException();
        }
        throw new NoSuchMethodError();
    }

    public final boolean q(int i10, int i11, Object obj) {
        return x2.c.k(obj, (long) (this.a[i11 + 2] & 1048575)) == i10;
    }

    public final boolean r(int i10, Object obj) {
        int i11 = this.a[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 == 1048575) {
            int z4 = z(i10);
            long j11 = z4 & 1048575;
            switch ((z4 & 267386880) >>> 20) {
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
        } else if (((1 << (i11 >>> 20)) & x2.c.k(obj, j10)) == 0) {
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
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        x2.c(j10, obj, (1 << (i11 >>> 20)) | x2.c.k(obj, j10));
    }

    public final void v(int i10, Object obj, Object obj2) {
        int z4 = z(i10);
        int i11 = this.a[i10];
        long j10 = z4 & 1048575;
        if (q(i11, i10, obj2)) {
            Object l10 = q(i11, i10, obj) ? x2.l(obj, j10) : null;
            Object l11 = x2.l(obj2, j10);
            if (l10 != null && l11 != null) {
                x2.d(obj, j10, j1.b(l10, l11));
                x2.c(r1[i10 + 2] & 1048575, obj, i11);
            } else if (l11 != null) {
                x2.d(obj, j10, l11);
                x2.c(r1[i10 + 2] & 1048575, obj, i11);
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
            int z4 = z(i15);
            int i16 = iArr[i15];
            int i17 = (267386880 & z4) >>> 20;
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
            long j10 = z4 & i10;
            switch (i17) {
                case 0:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        double j11 = x2.c.j(obj, j10);
                        r0 r0Var = (r0) y1Var.a;
                        r0Var.getClass();
                        long doubleToRawLongBits = Double.doubleToRawLongBits(j11);
                        r0Var.D(i16, 1);
                        r0Var.K(doubleToRawLongBits);
                        continue;
                    }
                case 1:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        float i21 = x2.c.i(obj, j10);
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
                        long j12 = unsafe.getLong(obj, j10);
                        r0 r0Var3 = (r0) y1Var.a;
                        r0Var3.D(i16, 0);
                        r0Var3.E(j12);
                    } else {
                        continue;
                    }
                case 3:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        long j13 = unsafe.getLong(obj, j10);
                        r0 r0Var4 = (r0) y1Var.a;
                        r0Var4.D(i16, 0);
                        r0Var4.E(j13);
                    } else {
                        continue;
                    }
                case 4:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        int i22 = unsafe.getInt(obj, j10);
                        r0 r0Var5 = (r0) y1Var.a;
                        r0Var5.D(i16, 0);
                        r0Var5.C(i22);
                    }
                    break;
                case 5:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        long j14 = unsafe.getLong(obj, j10);
                        r0 r0Var6 = (r0) y1Var.a;
                        r0Var6.D(i16, 1);
                        r0Var6.K(j14);
                        break;
                    }
                    break;
                case 6:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        int i23 = unsafe.getInt(obj, j10);
                        r0 r0Var7 = (r0) y1Var.a;
                        r0Var7.D(i16, 5);
                        r0Var7.M(i23);
                        break;
                    }
                    break;
                case 7:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        boolean h = x2.c.h(obj, j10);
                        r0 r0Var8 = (r0) y1Var.a;
                        r0Var8.D(i16, 0);
                        r0Var8.B(h ? (byte) 1 : (byte) 0);
                        break;
                    }
                    break;
                case 8:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        n(i16, unsafe.getObject(obj, j10), y1Var);
                        break;
                    }
                    break;
                case 9:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        y1Var.b(i16, unsafe.getObject(obj, j10), l(i12));
                        break;
                    }
                    break;
                case 10:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        y1Var.a(i16, (q0) unsafe.getObject(obj, j10));
                        break;
                    }
                    break;
                case 11:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        int i24 = unsafe.getInt(obj, j10);
                        r0 r0Var9 = (r0) y1Var.a;
                        r0Var9.D(i16, 0);
                        r0Var9.H(i24);
                        break;
                    }
                    break;
                case 12:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        int i25 = unsafe.getInt(obj, j10);
                        r0 r0Var10 = (r0) y1Var.a;
                        r0Var10.D(i16, 0);
                        r0Var10.C(i25);
                    }
                    break;
                case 13:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        int i26 = unsafe.getInt(obj, j10);
                        r0 r0Var11 = (r0) y1Var.a;
                        r0Var11.D(i16, 5);
                        r0Var11.M(i26);
                        break;
                    }
                    break;
                case 14:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        long j15 = unsafe.getLong(obj, j10);
                        r0 r0Var12 = (r0) y1Var.a;
                        r0Var12.D(i16, 1);
                        r0Var12.K(j15);
                        break;
                    }
                    break;
                case 15:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        int i27 = unsafe.getInt(obj, j10);
                        r0 r0Var13 = (r0) y1Var.a;
                        r0Var13.D(i16, 0);
                        r0Var13.H((i27 >> 31) ^ (i27 << 1));
                        break;
                    }
                    break;
                case 16:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        long j16 = unsafe.getLong(obj, j10);
                        r0 r0Var14 = (r0) y1Var.a;
                        r0Var14.D(i16, 0);
                        r0Var14.E((j16 << 1) ^ (j16 >> 63));
                        break;
                    }
                    break;
                case 17:
                    i12 = i20;
                    if ((i11 & i14) != 0) {
                        y1Var.c(i16, unsafe.getObject(obj, j10), l(i12));
                        break;
                    }
                    break;
                case 18:
                    i12 = i20;
                    o2.g(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, false);
                    break;
                case 19:
                    i12 = i20;
                    o2.n(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, false);
                    continue;
                case 20:
                    i12 = i20;
                    o2.q(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, false);
                    continue;
                case 21:
                    i12 = i20;
                    o2.s(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, false);
                    continue;
                case 22:
                    i12 = i20;
                    o2.B(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, false);
                    continue;
                case 23:
                    i12 = i20;
                    o2.w(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, false);
                    continue;
                case 24:
                    i12 = i20;
                    o2.G(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, false);
                    continue;
                case 25:
                    i12 = i20;
                    o2.J(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, false);
                    continue;
                case 26:
                    i12 = i20;
                    o2.e(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var);
                    break;
                case 27:
                    i12 = i20;
                    o2.f(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, l(i12));
                    break;
                case 28:
                    i12 = i20;
                    o2.l(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var);
                    break;
                case 29:
                    i12 = i20;
                    o2.E(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, false);
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    i12 = i20;
                    o2.I(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, false);
                    continue;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    i12 = i20;
                    o2.H(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, false);
                    continue;
                case 32:
                    i12 = i20;
                    o2.y(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, false);
                    continue;
                case 33:
                    i12 = i20;
                    o2.F(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, false);
                    continue;
                case 34:
                    i12 = i20;
                    o2.u(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, false);
                    continue;
                case 35:
                    i12 = i20;
                    o2.g(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, true);
                    break;
                case 36:
                    i12 = i20;
                    o2.n(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, true);
                    break;
                case 37:
                    i12 = i20;
                    o2.q(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, true);
                    break;
                case 38:
                    i12 = i20;
                    o2.s(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    i12 = i20;
                    o2.B(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    i12 = i20;
                    o2.w(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    i12 = i20;
                    o2.G(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    i12 = i20;
                    o2.J(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    i12 = i20;
                    o2.E(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    i12 = i20;
                    o2.I(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    i12 = i20;
                    o2.H(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    i12 = i20;
                    o2.y(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, true);
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    i12 = i20;
                    o2.F(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, true);
                    break;
                case 48:
                    i12 = i20;
                    o2.u(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, true);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    i12 = i20;
                    o2.m(iArr[i12], (List) unsafe.getObject(obj, j10), y1Var, l(i12));
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    i12 = i20;
                    if (unsafe.getObject(obj, j10) != null) {
                        Object t6 = t(i12);
                        this.m.getClass();
                        if (t6 != null) {
                            throw new ClassCastException();
                        }
                        throw new NoSuchMethodError();
                    }
                    break;
                case 51:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        double doubleValue = ((Double) x2.l(obj, j10)).doubleValue();
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
                        float floatValue = ((Float) x2.l(obj, j10)).floatValue();
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
                        long B = B(obj, j10);
                        r0 r0Var17 = (r0) y1Var.a;
                        r0Var17.D(i16, 0);
                        r0Var17.E(B);
                        break;
                    }
                    break;
                case 54:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        long B2 = B(obj, j10);
                        r0 r0Var18 = (r0) y1Var.a;
                        r0Var18.D(i16, 0);
                        r0Var18.E(B2);
                    } else {
                        continue;
                    }
                case 55:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        int A = A(obj, j10);
                        r0 r0Var19 = (r0) y1Var.a;
                        r0Var19.D(i16, 0);
                        r0Var19.C(A);
                    }
                    break;
                case 56:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        long B3 = B(obj, j10);
                        r0 r0Var20 = (r0) y1Var.a;
                        r0Var20.D(i16, 1);
                        r0Var20.K(B3);
                        break;
                    }
                    break;
                case 57:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        int A2 = A(obj, j10);
                        r0 r0Var21 = (r0) y1Var.a;
                        r0Var21.D(i16, 5);
                        r0Var21.M(A2);
                        break;
                    }
                    break;
                case 58:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        boolean booleanValue = ((Boolean) x2.l(obj, j10)).booleanValue();
                        r0 r0Var22 = (r0) y1Var.a;
                        r0Var22.D(i16, 0);
                        r0Var22.B(booleanValue ? (byte) 1 : (byte) 0);
                        break;
                    }
                    break;
                case 59:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        n(i16, unsafe.getObject(obj, j10), y1Var);
                        break;
                    }
                    break;
                case 60:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        y1Var.b(i16, unsafe.getObject(obj, j10), l(i12));
                        break;
                    }
                    break;
                case 61:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        y1Var.a(i16, (q0) unsafe.getObject(obj, j10));
                        break;
                    }
                    break;
                case 62:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        int A3 = A(obj, j10);
                        r0 r0Var23 = (r0) y1Var.a;
                        r0Var23.D(i16, 0);
                        r0Var23.H(A3);
                        break;
                    }
                    break;
                case 63:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        int A4 = A(obj, j10);
                        r0 r0Var24 = (r0) y1Var.a;
                        r0Var24.D(i16, 0);
                        r0Var24.C(A4);
                    }
                    break;
                case 64:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        int A5 = A(obj, j10);
                        r0 r0Var25 = (r0) y1Var.a;
                        r0Var25.D(i16, 5);
                        r0Var25.M(A5);
                        break;
                    }
                    break;
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        long B4 = B(obj, j10);
                        r0 r0Var26 = (r0) y1Var.a;
                        r0Var26.D(i16, 1);
                        r0Var26.K(B4);
                        break;
                    }
                    break;
                case 66:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        int A6 = A(obj, j10);
                        r0 r0Var27 = (r0) y1Var.a;
                        r0Var27.D(i16, 0);
                        r0Var27.H((A6 >> 31) ^ (A6 << 1));
                        break;
                    }
                    break;
                case 67:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        long B5 = B(obj, j10);
                        r0 r0Var28 = (r0) y1Var.a;
                        r0Var28.D(i16, 0);
                        r0Var28.E((B5 << 1) ^ (B5 >> 63));
                        break;
                    }
                    break;
                case 68:
                    i12 = i20;
                    if (q(i16, i12, obj)) {
                        y1Var.c(i16, unsafe.getObject(obj, j10), l(i12));
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

    @Override // com.google.android.gms.internal.vision.n2
    public final Object zza() {
        this.j.getClass();
        return ((f1) this.e).e(4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.vision.n2
    public final int zzb(Object obj) {
        p2 p2Var;
        int i10;
        int O;
        int T;
        int G;
        int J;
        int i11;
        int T2;
        int O2;
        int N;
        int i12;
        boolean z4 = this.f;
        p2 p2Var2 = this.l;
        b2 b2Var = this.m;
        int i13 = 267386880;
        int i14 = 1048575;
        int[] iArr = this.a;
        if (!z4) {
            Unsafe unsafe = o;
            int i15 = 0;
            int i16 = 0;
            int i17 = 1048575;
            int i18 = 0;
            while (i15 < iArr.length) {
                int z10 = z(i15);
                int i19 = iArr[i15];
                int i20 = (z10 & 267386880) >>> 20;
                if (i20 <= 17) {
                    int i21 = iArr[i15 + 2];
                    int i22 = i21 & 1048575;
                    i10 = 1 << (i21 >>> 20);
                    p2Var = p2Var2;
                    if (i22 != i17) {
                        i18 = unsafe.getInt(obj, i22);
                        i17 = i22;
                    }
                } else {
                    p2Var = p2Var2;
                    i10 = 0;
                }
                long j10 = z10 & 1048575;
                switch (i20) {
                    case 0:
                        if ((i18 & i10) != 0) {
                            i16 = android.support.v4.media.a.A(i19 << 3, 8, i16);
                            break;
                        }
                        break;
                    case 1:
                        if ((i18 & i10) != 0) {
                            i16 = android.support.v4.media.a.A(i19 << 3, 4, i16);
                            break;
                        }
                    case 2:
                        if ((i10 & i18) != 0) {
                            O = r0.O(unsafe.getLong(obj, j10)) + r0.T(i19 << 3);
                            i16 += O;
                        }
                        break;
                    case 3:
                        if ((i10 & i18) != 0) {
                            O = r0.N(i19, unsafe.getLong(obj, j10));
                            i16 += O;
                        }
                        break;
                    case 4:
                        if ((i10 & i18) != 0) {
                            O = r0.P(unsafe.getInt(obj, j10)) + r0.T(i19 << 3);
                            i16 += O;
                        }
                        break;
                    case 5:
                        if ((i18 & i10) != 0) {
                            O = r0.R(i19);
                            i16 += O;
                        }
                        break;
                    case 6:
                        if ((i18 & i10) != 0) {
                            O = r0.V(i19);
                            i16 += O;
                        }
                        break;
                    case 7:
                        if ((i18 & i10) != 0) {
                            i16 = android.support.v4.media.a.A(i19 << 3, 1, i16);
                        }
                        break;
                    case 8:
                        if ((i18 & i10) != 0) {
                            Object object = unsafe.getObject(obj, j10);
                            if (object instanceof q0) {
                                J = r0.J(i19, (q0) object);
                                i16 += J;
                            } else {
                                T = r0.T(i19 << 3);
                                G = r0.G((String) object);
                                J = G + T;
                                i16 += J;
                            }
                        }
                        break;
                    case 9:
                        if ((i18 & i10) != 0) {
                            J = o2.a(i19, unsafe.getObject(obj, j10), l(i15));
                            i16 += J;
                        }
                        break;
                    case 10:
                        if ((i18 & i10) != 0) {
                            J = r0.J(i19, (q0) unsafe.getObject(obj, j10));
                            i16 += J;
                        }
                        break;
                    case 11:
                        if ((i18 & i10) != 0) {
                            J = r0.S(i19, unsafe.getInt(obj, j10));
                            i16 += J;
                        }
                        break;
                    case 12:
                        if ((i18 & i10) != 0) {
                            int i23 = unsafe.getInt(obj, j10);
                            T = r0.T(i19 << 3);
                            G = r0.P(i23);
                            J = G + T;
                            i16 += J;
                        }
                        break;
                    case 13:
                        if ((i18 & i10) != 0) {
                            i16 = android.support.v4.media.a.A(i19 << 3, 4, i16);
                            break;
                        }
                    case 14:
                        if ((i18 & i10) != 0) {
                            i16 = android.support.v4.media.a.A(i19 << 3, 8, i16);
                        }
                        break;
                    case 15:
                        if ((i18 & i10) != 0) {
                            J = r0.U(i19, unsafe.getInt(obj, j10));
                            i16 += J;
                        }
                        break;
                    case 16:
                        if ((i18 & i10) != 0) {
                            J = r0.Q(i19, unsafe.getLong(obj, j10));
                            i16 += J;
                        }
                        break;
                    case 17:
                        if ((i18 & i10) != 0) {
                            J = r0.I(i19, (l0) unsafe.getObject(obj, j10), l(i15));
                            i16 += J;
                        }
                        break;
                    case 18:
                        J = o2.C(i19, (List) unsafe.getObject(obj, j10));
                        i16 += J;
                        break;
                    case 19:
                        J = o2.z(i19, (List) unsafe.getObject(obj, j10));
                        i16 += J;
                        break;
                    case 20:
                        List list = (List) unsafe.getObject(obj, j10);
                        Class cls = o2.a;
                        if (list.size() != 0) {
                            J = android.support.v4.media.a.B(i19, list.size(), o2.c(list));
                            i16 += J;
                            break;
                        }
                        J = 0;
                        i16 += J;
                    case 21:
                        List list2 = (List) unsafe.getObject(obj, j10);
                        Class cls2 = o2.a;
                        int size = list2.size();
                        if (size != 0) {
                            J = android.support.v4.media.a.B(i19, size, o2.k(list2));
                            i16 += J;
                            break;
                        }
                        J = 0;
                        i16 += J;
                    case 22:
                        List list3 = (List) unsafe.getObject(obj, j10);
                        Class cls3 = o2.a;
                        int size2 = list3.size();
                        if (size2 != 0) {
                            J = android.support.v4.media.a.B(i19, size2, o2.t(list3));
                            i16 += J;
                            break;
                        }
                        J = 0;
                        i16 += J;
                    case 23:
                        J = o2.C(i19, (List) unsafe.getObject(obj, j10));
                        i16 += J;
                        break;
                    case 24:
                        J = o2.z(i19, (List) unsafe.getObject(obj, j10));
                        i16 += J;
                        break;
                    case 25:
                        List list4 = (List) unsafe.getObject(obj, j10);
                        Class cls4 = o2.a;
                        int size3 = list4.size();
                        i16 += size3 == 0 ? 0 : (r0.T(i19 << 3) + 1) * size3;
                        break;
                    case 26:
                        J = o2.j(i19, (List) unsafe.getObject(obj, j10));
                        i16 += J;
                        break;
                    case 27:
                        J = o2.b(i19, (List) unsafe.getObject(obj, j10), l(i15));
                        i16 += J;
                        break;
                    case 28:
                        J = o2.o(i19, (List) unsafe.getObject(obj, j10));
                        i16 += J;
                        break;
                    case 29:
                        List list5 = (List) unsafe.getObject(obj, j10);
                        Class cls5 = o2.a;
                        int size4 = list5.size();
                        if (size4 != 0) {
                            J = android.support.v4.media.a.B(i19, size4, o2.v(list5));
                            i16 += J;
                            break;
                        }
                        J = 0;
                        i16 += J;
                    case MessageObject.TYPE_GIFT_STARS /* 30 */:
                        List list6 = (List) unsafe.getObject(obj, j10);
                        Class cls6 = o2.a;
                        int size5 = list6.size();
                        if (size5 != 0) {
                            J = android.support.v4.media.a.B(i19, size5, o2.r(list6));
                            i16 += J;
                            break;
                        }
                        J = 0;
                        i16 += J;
                    case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                        J = o2.z(i19, (List) unsafe.getObject(obj, j10));
                        i16 += J;
                        break;
                    case 32:
                        J = o2.C(i19, (List) unsafe.getObject(obj, j10));
                        i16 += J;
                        break;
                    case 33:
                        List list7 = (List) unsafe.getObject(obj, j10);
                        Class cls7 = o2.a;
                        int size6 = list7.size();
                        if (size6 != 0) {
                            J = android.support.v4.media.a.B(i19, size6, o2.x(list7));
                            i16 += J;
                            break;
                        }
                        J = 0;
                        i16 += J;
                    case 34:
                        List list8 = (List) unsafe.getObject(obj, j10);
                        Class cls8 = o2.a;
                        int size7 = list8.size();
                        if (size7 != 0) {
                            J = android.support.v4.media.a.B(i19, size7, o2.p(list8));
                            i16 += J;
                            break;
                        }
                        J = 0;
                        i16 += J;
                    case 35:
                        int D = o2.D((List) unsafe.getObject(obj, j10));
                        if (D > 0) {
                            i16 = android.support.v4.media.a.y(D, r0.y(i19), D, i16);
                        }
                        break;
                    case 36:
                        int A = o2.A((List) unsafe.getObject(obj, j10));
                        if (A > 0) {
                            i16 = android.support.v4.media.a.y(A, r0.y(i19), A, i16);
                        }
                        break;
                    case 37:
                        int c3 = o2.c((List) unsafe.getObject(obj, j10));
                        if (c3 > 0) {
                            i16 = android.support.v4.media.a.y(c3, r0.y(i19), c3, i16);
                        }
                        break;
                    case 38:
                        int k10 = o2.k((List) unsafe.getObject(obj, j10));
                        if (k10 > 0) {
                            i16 = android.support.v4.media.a.y(k10, r0.y(i19), k10, i16);
                        }
                        break;
                    case Maneuver.TYPE_DESTINATION /* 39 */:
                        int t6 = o2.t((List) unsafe.getObject(obj, j10));
                        if (t6 > 0) {
                            i16 = android.support.v4.media.a.y(t6, r0.y(i19), t6, i16);
                        }
                        break;
                    case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                        int D2 = o2.D((List) unsafe.getObject(obj, j10));
                        if (D2 > 0) {
                            i16 = android.support.v4.media.a.y(D2, r0.y(i19), D2, i16);
                        }
                        break;
                    case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                        int A2 = o2.A((List) unsafe.getObject(obj, j10));
                        if (A2 > 0) {
                            i16 = android.support.v4.media.a.y(A2, r0.y(i19), A2, i16);
                        }
                        break;
                    case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                        List list9 = (List) unsafe.getObject(obj, j10);
                        Class cls9 = o2.a;
                        int size8 = list9.size();
                        if (size8 > 0) {
                            i16 = android.support.v4.media.a.y(size8, r0.y(i19), size8, i16);
                        }
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                        int v = o2.v((List) unsafe.getObject(obj, j10));
                        if (v > 0) {
                            i16 = android.support.v4.media.a.y(v, r0.y(i19), v, i16);
                        }
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                        int r10 = o2.r((List) unsafe.getObject(obj, j10));
                        if (r10 > 0) {
                            i16 = android.support.v4.media.a.y(r10, r0.y(i19), r10, i16);
                        }
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                        int A3 = o2.A((List) unsafe.getObject(obj, j10));
                        if (A3 > 0) {
                            i16 = android.support.v4.media.a.y(A3, r0.y(i19), A3, i16);
                        }
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                        int D3 = o2.D((List) unsafe.getObject(obj, j10));
                        if (D3 > 0) {
                            i16 = android.support.v4.media.a.y(D3, r0.y(i19), D3, i16);
                        }
                        break;
                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                        int x10 = o2.x((List) unsafe.getObject(obj, j10));
                        if (x10 > 0) {
                            i16 = android.support.v4.media.a.y(x10, r0.y(i19), x10, i16);
                        }
                        break;
                    case 48:
                        int p10 = o2.p((List) unsafe.getObject(obj, j10));
                        if (p10 > 0) {
                            i16 = android.support.v4.media.a.y(p10, r0.y(i19), p10, i16);
                        }
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                        List list10 = (List) unsafe.getObject(obj, j10);
                        n2 l10 = l(i15);
                        Class cls10 = o2.a;
                        int size9 = list10.size();
                        if (size9 == 0) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                            for (int i24 = 0; i24 < size9; i24++) {
                                i11 += r0.I(i19, (l0) list10.get(i24), l10);
                            }
                        }
                        i16 += i11;
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        Object object2 = unsafe.getObject(obj, j10);
                        Object t9 = t(i15);
                        b2Var.getClass();
                        b2.b(object2, t9);
                        break;
                    case 51:
                        if (q(i19, i15, obj)) {
                            i16 = android.support.v4.media.a.A(i19 << 3, 8, i16);
                        }
                        break;
                    case 52:
                        if (q(i19, i15, obj)) {
                            i16 = android.support.v4.media.a.A(i19 << 3, 4, i16);
                            break;
                        }
                    case 53:
                        if (q(i19, i15, obj)) {
                            J = r0.O(B(obj, j10)) + r0.T(i19 << 3);
                            i16 += J;
                        }
                        break;
                    case 54:
                        if (q(i19, i15, obj)) {
                            J = r0.N(i19, B(obj, j10));
                            i16 += J;
                        }
                        break;
                    case 55:
                        if (q(i19, i15, obj)) {
                            int A4 = A(obj, j10);
                            T = r0.T(i19 << 3);
                            G = r0.P(A4);
                            J = G + T;
                            i16 += J;
                        }
                        break;
                    case 56:
                        if (q(i19, i15, obj)) {
                            J = r0.R(i19);
                            i16 += J;
                        }
                        break;
                    case 57:
                        if (q(i19, i15, obj)) {
                            J = r0.V(i19);
                            i16 += J;
                        }
                        break;
                    case 58:
                        if (q(i19, i15, obj)) {
                            i16 = android.support.v4.media.a.A(i19 << 3, 1, i16);
                        }
                        break;
                    case 59:
                        if (q(i19, i15, obj)) {
                            Object object3 = unsafe.getObject(obj, j10);
                            if (object3 instanceof q0) {
                                J = r0.J(i19, (q0) object3);
                                i16 += J;
                            } else {
                                T = r0.T(i19 << 3);
                                G = r0.G((String) object3);
                                J = G + T;
                                i16 += J;
                            }
                        }
                        break;
                    case 60:
                        if (q(i19, i15, obj)) {
                            J = o2.a(i19, unsafe.getObject(obj, j10), l(i15));
                            i16 += J;
                        }
                        break;
                    case 61:
                        if (q(i19, i15, obj)) {
                            J = r0.J(i19, (q0) unsafe.getObject(obj, j10));
                            i16 += J;
                        }
                        break;
                    case 62:
                        if (q(i19, i15, obj)) {
                            J = r0.S(i19, A(obj, j10));
                            i16 += J;
                        }
                        break;
                    case 63:
                        if (q(i19, i15, obj)) {
                            int A5 = A(obj, j10);
                            T = r0.T(i19 << 3);
                            G = r0.P(A5);
                            J = G + T;
                            i16 += J;
                        }
                        break;
                    case 64:
                        if (q(i19, i15, obj)) {
                            i16 = android.support.v4.media.a.A(i19 << 3, 4, i16);
                            break;
                        }
                    case VoIPService.CALL_MIN_LAYER /* 65 */:
                        if (q(i19, i15, obj)) {
                            i16 = android.support.v4.media.a.A(i19 << 3, 8, i16);
                        }
                        break;
                    case 66:
                        if (q(i19, i15, obj)) {
                            J = r0.U(i19, A(obj, j10));
                            i16 += J;
                        }
                        break;
                    case 67:
                        if (q(i19, i15, obj)) {
                            J = r0.Q(i19, B(obj, j10));
                            i16 += J;
                        }
                        break;
                    case 68:
                        if (q(i19, i15, obj)) {
                            J = r0.I(i19, (l0) unsafe.getObject(obj, j10), l(i15));
                            i16 += J;
                        }
                        break;
                }
                i15 += 3;
                p2Var2 = p2Var;
            }
            p2Var2.getClass();
            return ((f1) obj).zzb.d() + i16;
        }
        Unsafe unsafe2 = o;
        int i25 = 0;
        int i26 = 0;
        while (i25 < iArr.length) {
            int z11 = z(i25);
            int i27 = (z11 & i13) >>> 20;
            int i28 = iArr[i25];
            int[] iArr2 = iArr;
            long j11 = z11 & i14;
            if (i27 >= x0.b.a && i27 <= x0.c.a) {
                int i29 = iArr2[i25 + 2];
            }
            switch (i27) {
                case 0:
                    if (r(i25, obj)) {
                        i26 = android.support.v4.media.a.A(i28 << 3, 8, i26);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (r(i25, obj)) {
                        i26 = android.support.v4.media.a.A(i28 << 3, 4, i26);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (r(i25, obj)) {
                        long l11 = x2.c.l(obj, j11);
                        T2 = r0.T(i28 << 3);
                        O2 = r0.O(l11);
                        i26 += O2 + T2;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (r(i25, obj)) {
                        N = r0.N(i28, x2.c.l(obj, j11));
                        i26 += N;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (r(i25, obj)) {
                        int k11 = x2.c.k(obj, j11);
                        T2 = r0.T(i28 << 3);
                        O2 = r0.P(k11);
                        i26 += O2 + T2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (r(i25, obj)) {
                        N = r0.R(i28);
                        i26 += N;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (r(i25, obj)) {
                        N = r0.V(i28);
                        i26 += N;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (r(i25, obj)) {
                        i26 = android.support.v4.media.a.A(i28 << 3, 1, i26);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (r(i25, obj)) {
                        Object l12 = x2.l(obj, j11);
                        if (l12 instanceof q0) {
                            N = r0.J(i28, (q0) l12);
                            i26 += N;
                            break;
                        } else {
                            T2 = r0.T(i28 << 3);
                            O2 = r0.G((String) l12);
                            i26 += O2 + T2;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (r(i25, obj)) {
                        N = o2.a(i28, x2.l(obj, j11), l(i25));
                        i26 += N;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (r(i25, obj)) {
                        N = r0.J(i28, (q0) x2.l(obj, j11));
                        i26 += N;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (r(i25, obj)) {
                        N = r0.S(i28, x2.c.k(obj, j11));
                        i26 += N;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (r(i25, obj)) {
                        int k12 = x2.c.k(obj, j11);
                        T2 = r0.T(i28 << 3);
                        O2 = r0.P(k12);
                        i26 += O2 + T2;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (r(i25, obj)) {
                        i26 = android.support.v4.media.a.A(i28 << 3, 4, i26);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (r(i25, obj)) {
                        i26 = android.support.v4.media.a.A(i28 << 3, 8, i26);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (r(i25, obj)) {
                        N = r0.U(i28, x2.c.k(obj, j11));
                        i26 += N;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (r(i25, obj)) {
                        N = r0.Q(i28, x2.c.l(obj, j11));
                        i26 += N;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (r(i25, obj)) {
                        N = r0.I(i28, (l0) x2.l(obj, j11), l(i25));
                        i26 += N;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    N = o2.C(i28, (List) x2.l(obj, j11));
                    i26 += N;
                    break;
                case 19:
                    N = o2.z(i28, (List) x2.l(obj, j11));
                    i26 += N;
                    break;
                case 20:
                    List list11 = (List) x2.l(obj, j11);
                    Class cls11 = o2.a;
                    if (list11.size() != 0) {
                        N = android.support.v4.media.a.B(i28, list11.size(), o2.c(list11));
                        i26 += N;
                        break;
                    }
                    N = 0;
                    i26 += N;
                case 21:
                    List list12 = (List) x2.l(obj, j11);
                    Class cls12 = o2.a;
                    int size10 = list12.size();
                    if (size10 != 0) {
                        N = android.support.v4.media.a.B(i28, size10, o2.k(list12));
                        i26 += N;
                        break;
                    }
                    N = 0;
                    i26 += N;
                case 22:
                    List list13 = (List) x2.l(obj, j11);
                    Class cls13 = o2.a;
                    int size11 = list13.size();
                    if (size11 != 0) {
                        N = android.support.v4.media.a.B(i28, size11, o2.t(list13));
                        i26 += N;
                        break;
                    }
                    N = 0;
                    i26 += N;
                case 23:
                    N = o2.C(i28, (List) x2.l(obj, j11));
                    i26 += N;
                    break;
                case 24:
                    N = o2.z(i28, (List) x2.l(obj, j11));
                    i26 += N;
                    break;
                case 25:
                    List list14 = (List) x2.l(obj, j11);
                    Class cls14 = o2.a;
                    int size12 = list14.size();
                    if (size12 != 0) {
                        N = (r0.T(i28 << 3) + 1) * size12;
                        i26 += N;
                        break;
                    }
                    N = 0;
                    i26 += N;
                case 26:
                    N = o2.j(i28, (List) x2.l(obj, j11));
                    i26 += N;
                    break;
                case 27:
                    N = o2.b(i28, (List) x2.l(obj, j11), l(i25));
                    i26 += N;
                    break;
                case 28:
                    N = o2.o(i28, (List) x2.l(obj, j11));
                    i26 += N;
                    break;
                case 29:
                    List list15 = (List) x2.l(obj, j11);
                    Class cls15 = o2.a;
                    int size13 = list15.size();
                    if (size13 != 0) {
                        N = android.support.v4.media.a.B(i28, size13, o2.v(list15));
                        i26 += N;
                        break;
                    }
                    N = 0;
                    i26 += N;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    List list16 = (List) x2.l(obj, j11);
                    Class cls16 = o2.a;
                    int size14 = list16.size();
                    if (size14 != 0) {
                        N = android.support.v4.media.a.B(i28, size14, o2.r(list16));
                        i26 += N;
                        break;
                    }
                    N = 0;
                    i26 += N;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    N = o2.z(i28, (List) x2.l(obj, j11));
                    i26 += N;
                    break;
                case 32:
                    N = o2.C(i28, (List) x2.l(obj, j11));
                    i26 += N;
                    break;
                case 33:
                    List list17 = (List) x2.l(obj, j11);
                    Class cls17 = o2.a;
                    int size15 = list17.size();
                    if (size15 != 0) {
                        N = android.support.v4.media.a.B(i28, size15, o2.x(list17));
                        i26 += N;
                        break;
                    }
                    N = 0;
                    i26 += N;
                case 34:
                    List list18 = (List) x2.l(obj, j11);
                    Class cls18 = o2.a;
                    int size16 = list18.size();
                    if (size16 != 0) {
                        N = android.support.v4.media.a.B(i28, size16, o2.p(list18));
                        i26 += N;
                        break;
                    }
                    N = 0;
                    i26 += N;
                case 35:
                    int D4 = o2.D((List) unsafe2.getObject(obj, j11));
                    if (D4 > 0) {
                        i26 = android.support.v4.media.a.y(D4, r0.y(i28), D4, i26);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int A6 = o2.A((List) unsafe2.getObject(obj, j11));
                    if (A6 > 0) {
                        i26 = android.support.v4.media.a.y(A6, r0.y(i28), A6, i26);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int c10 = o2.c((List) unsafe2.getObject(obj, j11));
                    if (c10 > 0) {
                        i26 = android.support.v4.media.a.y(c10, r0.y(i28), c10, i26);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int k13 = o2.k((List) unsafe2.getObject(obj, j11));
                    if (k13 > 0) {
                        i26 = android.support.v4.media.a.y(k13, r0.y(i28), k13, i26);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    int t10 = o2.t((List) unsafe2.getObject(obj, j11));
                    if (t10 > 0) {
                        i26 = android.support.v4.media.a.y(t10, r0.y(i28), t10, i26);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    int D5 = o2.D((List) unsafe2.getObject(obj, j11));
                    if (D5 > 0) {
                        i26 = android.support.v4.media.a.y(D5, r0.y(i28), D5, i26);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    int A7 = o2.A((List) unsafe2.getObject(obj, j11));
                    if (A7 > 0) {
                        i26 = android.support.v4.media.a.y(A7, r0.y(i28), A7, i26);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    List list19 = (List) unsafe2.getObject(obj, j11);
                    Class cls19 = o2.a;
                    int size17 = list19.size();
                    if (size17 > 0) {
                        i26 = android.support.v4.media.a.y(size17, r0.y(i28), size17, i26);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    int v10 = o2.v((List) unsafe2.getObject(obj, j11));
                    if (v10 > 0) {
                        i26 = android.support.v4.media.a.y(v10, r0.y(i28), v10, i26);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    int r11 = o2.r((List) unsafe2.getObject(obj, j11));
                    if (r11 > 0) {
                        i26 = android.support.v4.media.a.y(r11, r0.y(i28), r11, i26);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    int A8 = o2.A((List) unsafe2.getObject(obj, j11));
                    if (A8 > 0) {
                        i26 = android.support.v4.media.a.y(A8, r0.y(i28), A8, i26);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    int D6 = o2.D((List) unsafe2.getObject(obj, j11));
                    if (D6 > 0) {
                        i26 = android.support.v4.media.a.y(D6, r0.y(i28), D6, i26);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    int x11 = o2.x((List) unsafe2.getObject(obj, j11));
                    if (x11 > 0) {
                        i26 = android.support.v4.media.a.y(x11, r0.y(i28), x11, i26);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int p11 = o2.p((List) unsafe2.getObject(obj, j11));
                    if (p11 > 0) {
                        i26 = android.support.v4.media.a.y(p11, r0.y(i28), p11, i26);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    List list20 = (List) x2.l(obj, j11);
                    n2 l13 = l(i25);
                    Class cls20 = o2.a;
                    int size18 = list20.size();
                    if (size18 == 0) {
                        i12 = 0;
                    } else {
                        i12 = 0;
                        for (int i30 = 0; i30 < size18; i30++) {
                            i12 = r0.I(i28, (l0) list20.get(i30), l13) + i12;
                        }
                    }
                    i26 = i12 + i26;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Object l14 = x2.l(obj, j11);
                    Object t11 = t(i25);
                    b2Var.getClass();
                    b2.b(l14, t11);
                    break;
                case 51:
                    if (q(i28, i25, obj)) {
                        i26 = android.support.v4.media.a.A(i28 << 3, 8, i26);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(i28, i25, obj)) {
                        i26 = android.support.v4.media.a.A(i28 << 3, 4, i26);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (q(i28, i25, obj)) {
                        long B = B(obj, j11);
                        T2 = r0.T(i28 << 3);
                        O2 = r0.O(B);
                        i26 += O2 + T2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (q(i28, i25, obj)) {
                        N = r0.N(i28, B(obj, j11));
                        i26 += N;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (q(i28, i25, obj)) {
                        int A9 = A(obj, j11);
                        T2 = r0.T(i28 << 3);
                        O2 = r0.P(A9);
                        i26 += O2 + T2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(i28, i25, obj)) {
                        N = r0.R(i28);
                        i26 += N;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (q(i28, i25, obj)) {
                        N = r0.V(i28);
                        i26 += N;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (q(i28, i25, obj)) {
                        i26 = android.support.v4.media.a.A(i28 << 3, 1, i26);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(i28, i25, obj)) {
                        Object l15 = x2.l(obj, j11);
                        if (l15 instanceof q0) {
                            N = r0.J(i28, (q0) l15);
                            i26 += N;
                            break;
                        } else {
                            T2 = r0.T(i28 << 3);
                            O2 = r0.G((String) l15);
                            i26 += O2 + T2;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (q(i28, i25, obj)) {
                        N = o2.a(i28, x2.l(obj, j11), l(i25));
                        i26 += N;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (q(i28, i25, obj)) {
                        N = r0.J(i28, (q0) x2.l(obj, j11));
                        i26 += N;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (q(i28, i25, obj)) {
                        N = r0.S(i28, A(obj, j11));
                        i26 += N;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (q(i28, i25, obj)) {
                        int A10 = A(obj, j11);
                        T2 = r0.T(i28 << 3);
                        O2 = r0.P(A10);
                        i26 += O2 + T2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(i28, i25, obj)) {
                        i26 = android.support.v4.media.a.A(i28 << 3, 4, i26);
                        break;
                    } else {
                        break;
                    }
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (q(i28, i25, obj)) {
                        i26 = android.support.v4.media.a.A(i28 << 3, 8, i26);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (q(i28, i25, obj)) {
                        N = r0.U(i28, A(obj, j11));
                        i26 += N;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (q(i28, i25, obj)) {
                        N = r0.Q(i28, B(obj, j11));
                        i26 += N;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (q(i28, i25, obj)) {
                        N = r0.I(i28, (l0) x2.l(obj, j11), l(i25));
                        i26 += N;
                        break;
                    } else {
                        break;
                    }
            }
            i25 += 3;
            iArr = iArr2;
            i13 = 267386880;
            i14 = 1048575;
        }
        p2Var2.getClass();
        return ((f1) obj).zzb.d() + i26;
    }
}
