package androidx.datastore.preferences.protobuf;

import androidx.car.app.navigation.model.Maneuver;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.CharacterCompat;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class t0 implements c1 {
    public static final int[] o = new int[0];
    public static final Unsafe p = s1.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final a e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final v0 k;
    public final i0 l;
    public final k1 m;
    public final p0 n;

    public t0(int[] iArr, Object[] objArr, int i9, int i10, a aVar, boolean z10, int[] iArr2, int i11, int i12, v0 v0Var, i0 i0Var, k1 k1Var, o oVar, p0 p0Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i9;
        this.d = i10;
        this.f = aVar instanceof x;
        this.g = z10;
        this.h = iArr2;
        this.i = i11;
        this.j = i12;
        this.k = v0Var;
        this.l = i0Var;
        this.m = k1Var;
        this.e = aVar;
        this.n = p0Var;
    }

    public static long A(Object obj, long j10) {
        return ((Long) s1.d.i(obj, j10)).longValue();
    }

    public static Field D(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder t10 = aa.d.t("Field ", str, " for ");
            t10.append(cls.getName());
            t10.append(" not found. Known fields are ");
            t10.append(Arrays.toString(declaredFields));
            throw new RuntimeException(t10.toString());
        }
    }

    public static int G(int i9) {
        return (i9 & 267386880) >>> 20;
    }

    public static void K(int i9, Object obj, l0 l0Var) {
        if (!(obj instanceof String)) {
            l0Var.a(i9, (g) obj);
        } else {
            ((k) l0Var.a).P(i9, (String) obj);
        }
    }

    public static List s(Object obj, long j10) {
        return (List) s1.d.i(obj, j10);
    }

    public static t0 w(b1 b1Var, v0 v0Var, i0 i0Var, k1 k1Var, o oVar, p0 p0Var) {
        if (b1Var instanceof b1) {
            return x(b1Var, v0Var, i0Var, k1Var, oVar, p0Var);
        }
        b1Var.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0287  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static t0 x(b1 b1Var, v0 v0Var, i0 i0Var, k1 k1Var, o oVar, p0 p0Var) {
        int i9;
        int charAt;
        int charAt2;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        int i14;
        int i15;
        char charAt3;
        int i16;
        char charAt4;
        int i17;
        char charAt5;
        int i18;
        char charAt6;
        int i19;
        char charAt7;
        int i20;
        char charAt8;
        int i21;
        char charAt9;
        int i22;
        char charAt10;
        int[] iArr2;
        int i23;
        int i24;
        int i25;
        boolean z10;
        int i26;
        int objectFieldOffset;
        int i27;
        int i28;
        int i29;
        Field D;
        char charAt11;
        int i30;
        int i31;
        Object obj;
        Field D2;
        Object obj2;
        Field D3;
        int i32;
        char charAt12;
        int i33;
        char charAt13;
        int i34;
        int i35;
        char charAt14;
        int i36;
        char charAt15;
        char charAt16;
        int i37 = 0;
        boolean z11 = (b1Var.d & 1) != 1;
        String str = b1Var.b;
        int length = str.length();
        int charAt17 = str.charAt(0);
        if (charAt17 >= 55296) {
            int i38 = charAt17 & 8191;
            int i39 = 1;
            int i40 = 13;
            while (true) {
                i9 = i39 + 1;
                charAt16 = str.charAt(i39);
                if (charAt16 < 55296) {
                    break;
                }
                i38 |= (charAt16 & 8191) << i40;
                i40 += 13;
                i39 = i9;
            }
            charAt17 = i38 | (charAt16 << i40);
        } else {
            i9 = 1;
        }
        int i41 = i9 + 1;
        int charAt18 = str.charAt(i9);
        if (charAt18 >= 55296) {
            int i42 = charAt18 & 8191;
            int i43 = 13;
            while (true) {
                i36 = i41 + 1;
                charAt15 = str.charAt(i41);
                if (charAt15 < 55296) {
                    break;
                }
                i42 |= (charAt15 & 8191) << i43;
                i43 += 13;
                i41 = i36;
            }
            charAt18 = i42 | (charAt15 << i43);
            i41 = i36;
        }
        if (charAt18 == 0) {
            iArr = o;
            i12 = 0;
            i13 = 0;
            i14 = 0;
            charAt = 0;
            charAt2 = 0;
            i11 = 0;
        } else {
            int i44 = i41 + 1;
            int charAt19 = str.charAt(i41);
            if (charAt19 >= 55296) {
                int i45 = charAt19 & 8191;
                int i46 = 13;
                while (true) {
                    i22 = i44 + 1;
                    charAt10 = str.charAt(i44);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i45 |= (charAt10 & 8191) << i46;
                    i46 += 13;
                    i44 = i22;
                }
                charAt19 = i45 | (charAt10 << i46);
                i44 = i22;
            }
            int i47 = i44 + 1;
            int charAt20 = str.charAt(i44);
            if (charAt20 >= 55296) {
                int i48 = charAt20 & 8191;
                int i49 = 13;
                while (true) {
                    i21 = i47 + 1;
                    charAt9 = str.charAt(i47);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i48 |= (charAt9 & 8191) << i49;
                    i49 += 13;
                    i47 = i21;
                }
                charAt20 = i48 | (charAt9 << i49);
                i47 = i21;
            }
            int i50 = i47 + 1;
            int charAt21 = str.charAt(i47);
            if (charAt21 >= 55296) {
                int i51 = charAt21 & 8191;
                int i52 = 13;
                while (true) {
                    i20 = i50 + 1;
                    charAt8 = str.charAt(i50);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i51 |= (charAt8 & 8191) << i52;
                    i52 += 13;
                    i50 = i20;
                }
                charAt21 = i51 | (charAt8 << i52);
                i50 = i20;
            }
            int i53 = i50 + 1;
            int charAt22 = str.charAt(i50);
            if (charAt22 >= 55296) {
                int i54 = charAt22 & 8191;
                int i55 = 13;
                while (true) {
                    i19 = i53 + 1;
                    charAt7 = str.charAt(i53);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i54 |= (charAt7 & 8191) << i55;
                    i55 += 13;
                    i53 = i19;
                }
                charAt22 = i54 | (charAt7 << i55);
                i53 = i19;
            }
            int i56 = i53 + 1;
            charAt = str.charAt(i53);
            if (charAt >= 55296) {
                int i57 = charAt & 8191;
                int i58 = 13;
                while (true) {
                    i18 = i56 + 1;
                    charAt6 = str.charAt(i56);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i57 |= (charAt6 & 8191) << i58;
                    i58 += 13;
                    i56 = i18;
                }
                charAt = i57 | (charAt6 << i58);
                i56 = i18;
            }
            int i59 = i56 + 1;
            charAt2 = str.charAt(i56);
            if (charAt2 >= 55296) {
                int i60 = charAt2 & 8191;
                int i61 = 13;
                while (true) {
                    i17 = i59 + 1;
                    charAt5 = str.charAt(i59);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i60 |= (charAt5 & 8191) << i61;
                    i61 += 13;
                    i59 = i17;
                }
                charAt2 = i60 | (charAt5 << i61);
                i59 = i17;
            }
            int i62 = i59 + 1;
            int charAt23 = str.charAt(i59);
            if (charAt23 >= 55296) {
                int i63 = charAt23 & 8191;
                int i64 = i62;
                int i65 = 13;
                while (true) {
                    i16 = i64 + 1;
                    charAt4 = str.charAt(i64);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i63 |= (charAt4 & 8191) << i65;
                    i65 += 13;
                    i64 = i16;
                }
                charAt23 = i63 | (charAt4 << i65);
                i10 = i16;
            } else {
                i10 = i62;
            }
            int i66 = i10 + 1;
            int charAt24 = str.charAt(i10);
            if (charAt24 >= 55296) {
                int i67 = charAt24 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i15 = i68 + 1;
                    charAt3 = str.charAt(i68);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i67 |= (charAt3 & 8191) << i69;
                    i69 += 13;
                    i68 = i15;
                }
                charAt24 = i67 | (charAt3 << i69);
                i66 = i15;
            }
            int[] iArr3 = new int[charAt24 + charAt2 + charAt23];
            i11 = (charAt19 * 2) + charAt20;
            int i70 = charAt21;
            iArr = iArr3;
            i12 = i70;
            i13 = charAt22;
            i14 = charAt24;
            i37 = charAt19;
            i41 = i66;
        }
        Unsafe unsafe = p;
        Object[] objArr = b1Var.c;
        int i71 = i37;
        Class<?> cls = b1Var.a.getClass();
        int i72 = charAt17;
        int[] iArr4 = new int[charAt * 3];
        Object[] objArr2 = new Object[charAt * 2];
        int i73 = charAt2 + i14;
        int i74 = i14;
        int i75 = i73;
        int i76 = 0;
        int i77 = 0;
        while (i41 < length) {
            int i78 = i41 + 1;
            int charAt25 = str.charAt(i41);
            int i79 = length;
            if (charAt25 >= 55296) {
                int i80 = charAt25 & 8191;
                int i81 = i78;
                int i82 = 13;
                while (true) {
                    i35 = i81 + 1;
                    charAt14 = str.charAt(i81);
                    iArr2 = iArr4;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i80 |= (charAt14 & 8191) << i82;
                    i82 += 13;
                    i81 = i35;
                    iArr4 = iArr2;
                }
                charAt25 = i80 | (charAt14 << i82);
                i23 = i35;
            } else {
                iArr2 = iArr4;
                i23 = i78;
            }
            int i83 = i23 + 1;
            int charAt26 = str.charAt(i23);
            if (charAt26 >= 55296) {
                int i84 = charAt26 & 8191;
                int i85 = i83;
                int i86 = 13;
                while (true) {
                    i33 = i85 + 1;
                    charAt13 = str.charAt(i85);
                    i34 = i84;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i84 = i34 | ((charAt13 & 8191) << i86);
                    i86 += 13;
                    i85 = i33;
                }
                charAt26 = i34 | (charAt13 << i86);
                i24 = i33;
            } else {
                i24 = i83;
            }
            int i87 = i12;
            int i88 = charAt26 & 255;
            Object[] objArr3 = objArr;
            if ((charAt26 & 1024) != 0) {
                iArr[i76] = i77;
                i76++;
            }
            int i89 = charAt25;
            if (i88 >= 51) {
                int i90 = i24 + 1;
                int charAt27 = str.charAt(i24);
                char c10 = CharacterCompat.MIN_HIGH_SURROGATE;
                if (charAt27 >= 55296) {
                    int i91 = charAt27 & 8191;
                    int i92 = 13;
                    while (true) {
                        i32 = i90 + 1;
                        charAt12 = str.charAt(i90);
                        if (charAt12 < c10) {
                            break;
                        }
                        i91 |= (charAt12 & 8191) << i92;
                        i92 += 13;
                        i90 = i32;
                        c10 = CharacterCompat.MIN_HIGH_SURROGATE;
                    }
                    charAt27 = i91 | (charAt12 << i92);
                    i90 = i32;
                }
                int i93 = i88 - 51;
                int i94 = charAt27;
                if (i93 == 9 || i93 == 17) {
                    i31 = i11 + 1;
                    objArr2[((i77 / 3) * 2) + 1] = objArr3[i11];
                } else {
                    if (i93 == 12 && (i72 & 1) == 1) {
                        i31 = i11 + 1;
                        objArr2[((i77 / 3) * 2) + 1] = objArr3[i11];
                    }
                    int i95 = i94 * 2;
                    obj = objArr3[i95];
                    if (obj instanceof Field) {
                        D2 = D(cls, (String) obj);
                        objArr3[i95] = D2;
                    } else {
                        D2 = (Field) obj;
                    }
                    int i96 = i90;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(D2);
                    int i97 = i95 + 1;
                    obj2 = objArr3[i97];
                    if (obj2 instanceof Field) {
                        D3 = D(cls, (String) obj2);
                        objArr3[i97] = D3;
                    } else {
                        D3 = (Field) obj2;
                    }
                    i26 = i11;
                    objectFieldOffset = objectFieldOffset2;
                    z10 = z11;
                    i27 = i96;
                    i29 = (int) unsafe.objectFieldOffset(D3);
                    i25 = i13;
                    i28 = 0;
                }
                i11 = i31;
                int i952 = i94 * 2;
                obj = objArr3[i952];
                if (obj instanceof Field) {
                }
                int i962 = i90;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(D2);
                int i972 = i952 + 1;
                obj2 = objArr3[i972];
                if (obj2 instanceof Field) {
                }
                i26 = i11;
                objectFieldOffset = objectFieldOffset22;
                z10 = z11;
                i27 = i962;
                i29 = (int) unsafe.objectFieldOffset(D3);
                i25 = i13;
                i28 = 0;
            } else {
                int i98 = i11 + 1;
                Field D4 = D(cls, (String) objArr3[i11]);
                if (i88 == 9 || i88 == 17) {
                    i25 = i13;
                    objArr2[((i77 / 3) * 2) + 1] = D4.getType();
                } else {
                    if (i88 == 27 || i88 == 49) {
                        i25 = i13;
                        i30 = i11 + 2;
                        objArr2[((i77 / 3) * 2) + 1] = objArr3[i98];
                    } else if (i88 == 12 || i88 == 30 || i88 == 44) {
                        i25 = i13;
                        if ((i72 & 1) == 1) {
                            i30 = i11 + 2;
                            objArr2[((i77 / 3) * 2) + 1] = objArr3[i98];
                        }
                    } else if (i88 == 50) {
                        int i99 = i74 + 1;
                        iArr[i74] = i77;
                        int i100 = (i77 / 3) * 2;
                        int i101 = i11 + 2;
                        objArr2[i100] = objArr3[i98];
                        if ((charAt26 & 2048) != 0) {
                            i26 = i11 + 3;
                            objArr2[i100 + 1] = objArr3[i101];
                            i25 = i13;
                            z10 = z11;
                            i74 = i99;
                        } else {
                            z10 = z11;
                            i26 = i101;
                            i74 = i99;
                            i25 = i13;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(D4);
                        if ((i72 & 1) == 1 || i88 > 17) {
                            i27 = i24;
                            i28 = 0;
                            i29 = 0;
                        } else {
                            int i102 = i24 + 1;
                            int charAt28 = str.charAt(i24);
                            if (charAt28 >= 55296) {
                                int i103 = charAt28 & 8191;
                                int i104 = 13;
                                while (true) {
                                    i27 = i102 + 1;
                                    charAt11 = str.charAt(i102);
                                    if (charAt11 < 55296) {
                                        break;
                                    }
                                    i103 |= (charAt11 & 8191) << i104;
                                    i104 += 13;
                                    i102 = i27;
                                }
                                charAt28 = i103 | (charAt11 << i104);
                            } else {
                                i27 = i102;
                            }
                            int i105 = (charAt28 / 32) + (i71 * 2);
                            Object obj3 = objArr3[i105];
                            if (obj3 instanceof Field) {
                                D = (Field) obj3;
                            } else {
                                D = D(cls, (String) obj3);
                                objArr3[i105] = D;
                            }
                            i29 = (int) unsafe.objectFieldOffset(D);
                            i28 = charAt28 % 32;
                        }
                        if (i88 >= 18 && i88 <= 49) {
                            iArr[i75] = objectFieldOffset;
                            i75++;
                        }
                    } else {
                        i25 = i13;
                    }
                    i26 = i30;
                    z10 = z11;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(D4);
                    if ((i72 & 1) == 1) {
                    }
                    i27 = i24;
                    i28 = 0;
                    i29 = 0;
                    if (i88 >= 18) {
                        iArr[i75] = objectFieldOffset;
                        i75++;
                    }
                }
                z10 = z11;
                i26 = i98;
                objectFieldOffset = (int) unsafe.objectFieldOffset(D4);
                if ((i72 & 1) == 1) {
                }
                i27 = i24;
                i28 = 0;
                i29 = 0;
                if (i88 >= 18) {
                }
            }
            int i106 = i77 + 1;
            iArr2[i77] = i89;
            int i107 = i77 + 2;
            String str2 = str;
            iArr2[i106] = ((charAt26 & 512) != 0 ? TLObject.FLAG_29 : 0) | ((charAt26 & 256) != 0 ? TLObject.FLAG_28 : 0) | (i88 << 20) | objectFieldOffset;
            i77 += 3;
            iArr2[i107] = (i28 << 20) | i29;
            z11 = z10;
            i12 = i87;
            length = i79;
            iArr4 = iArr2;
            i13 = i25;
            i41 = i27;
            str = str2;
            i11 = i26;
            objArr = objArr3;
        }
        return new t0(iArr4, objArr2, i12, i13, b1Var.a, z11, iArr, i14, i73, v0Var, i0Var, k1Var, oVar, p0Var);
    }

    public static long y(int i9) {
        return i9 & 1048575;
    }

    public static int z(Object obj, long j10) {
        return ((Integer) s1.d.i(obj, j10)).intValue();
    }

    public final void B(Object obj, int i9, i iVar, c1 c1Var, n nVar) {
        int z10;
        List c10 = this.l.c(obj, i9 & 1048575);
        h hVar = (h) iVar.d;
        int i10 = iVar.a;
        if ((i10 & 7) != 2) {
            throw c0.b();
        }
        do {
            c10.add(iVar.A(c1Var, nVar));
            if (hVar.c() || iVar.c != 0) {
                return;
            } else {
                z10 = hVar.z();
            }
        } while (z10 == i10);
        iVar.c = z10;
    }

    public final void C(Object obj, int i9, i iVar) {
        if ((536870912 & i9) != 0) {
            s1.o(obj, i9 & 1048575, iVar.M());
        } else if (this.f) {
            s1.o(obj, i9 & 1048575, iVar.K());
        } else {
            s1.o(obj, i9 & 1048575, iVar.g());
        }
    }

    public final void E(int i9, Object obj) {
        if (this.g) {
            return;
        }
        int i10 = this.a[i9 + 2];
        long j10 = i10 & 1048575;
        s1.m(j10, obj, s1.d.g(obj, j10) | (1 << (i10 >>> 20)));
    }

    public final void F(int i9, int i10, Object obj) {
        s1.m(this.a[i10 + 2] & 1048575, obj, i9);
    }

    public final int H(int i9) {
        return this.a[i9 + 1];
    }

    public final void I(Object obj, l0 l0Var) {
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr = this.a;
        int length = iArr.length;
        Unsafe unsafe = p;
        int i13 = -1;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15 = i12 + 3) {
            int H = H(i15);
            int i16 = iArr[i15];
            int G = G(H);
            if (this.g || G > 17) {
                i9 = i15;
                i10 = 1048575;
                i11 = 0;
            } else {
                int i17 = iArr[i15 + 2];
                i10 = 1048575;
                int i18 = i17 & 1048575;
                i9 = i15;
                if (i18 != i13) {
                    i14 = unsafe.getInt(obj, i18);
                    i13 = i18;
                }
                i11 = 1 << (i17 >>> 20);
            }
            long j10 = H & i10;
            switch (G) {
                case 0:
                    i12 = i9;
                    if ((i11 & i14) == 0) {
                        break;
                    } else {
                        double e10 = s1.d.e(obj, j10);
                        k kVar = (k) l0Var.a;
                        kVar.getClass();
                        kVar.K(i16, Double.doubleToRawLongBits(e10));
                        continue;
                    }
                case 1:
                    i12 = i9;
                    if ((i11 & i14) != 0) {
                        float f10 = s1.d.f(obj, j10);
                        k kVar2 = (k) l0Var.a;
                        kVar2.getClass();
                        kVar2.I(i16, Float.floatToRawIntBits(f10));
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    i12 = i9;
                    if ((i11 & i14) != 0) {
                        ((k) l0Var.a).U(i16, unsafe.getLong(obj, j10));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    i12 = i9;
                    if ((i11 & i14) != 0) {
                        ((k) l0Var.a).U(i16, unsafe.getLong(obj, j10));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    i12 = i9;
                    if ((i11 & i14) != 0) {
                        ((k) l0Var.a).M(i16, unsafe.getInt(obj, j10));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    i12 = i9;
                    if ((i11 & i14) != 0) {
                        ((k) l0Var.a).K(i16, unsafe.getLong(obj, j10));
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    i12 = i9;
                    if ((i11 & i14) != 0) {
                        ((k) l0Var.a).I(i16, unsafe.getInt(obj, j10));
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    i12 = i9;
                    if ((i11 & i14) != 0) {
                        ((k) l0Var.a).F(i16, s1.d.c(obj, j10));
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    i12 = i9;
                    if ((i11 & i14) != 0) {
                        K(i16, unsafe.getObject(obj, j10), l0Var);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    i12 = i9;
                    if ((i11 & i14) != 0) {
                        ((k) l0Var.a).O(i16, (a) unsafe.getObject(obj, j10), n(i12));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    i12 = i9;
                    if ((i11 & i14) != 0) {
                        l0Var.a(i16, (g) unsafe.getObject(obj, j10));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    i12 = i9;
                    if ((i11 & i14) != 0) {
                        ((k) l0Var.a).S(i16, unsafe.getInt(obj, j10));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    i12 = i9;
                    if ((i11 & i14) != 0) {
                        ((k) l0Var.a).M(i16, unsafe.getInt(obj, j10));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    i12 = i9;
                    if ((i11 & i14) != 0) {
                        ((k) l0Var.a).I(i16, unsafe.getInt(obj, j10));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    i12 = i9;
                    if ((i11 & i14) != 0) {
                        ((k) l0Var.a).K(i16, unsafe.getLong(obj, j10));
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    i12 = i9;
                    if ((i11 & i14) != 0) {
                        int i19 = unsafe.getInt(obj, j10);
                        ((k) l0Var.a).S(i16, (i19 >> 31) ^ (i19 << 1));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    i12 = i9;
                    if ((i11 & i14) != 0) {
                        long j11 = unsafe.getLong(obj, j10);
                        ((k) l0Var.a).U(i16, (j11 >> 63) ^ (j11 << 1));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    i12 = i9;
                    if ((i11 & i14) != 0) {
                        l0Var.b(i16, unsafe.getObject(obj, j10), n(i12));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    i12 = i9;
                    d1.A(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, false);
                    continue;
                case 19:
                    i12 = i9;
                    d1.E(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, false);
                    continue;
                case 20:
                    i12 = i9;
                    d1.H(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, false);
                    continue;
                case 21:
                    i12 = i9;
                    d1.P(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, false);
                    continue;
                case 22:
                    i12 = i9;
                    d1.G(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, false);
                    continue;
                case 23:
                    i12 = i9;
                    d1.D(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, false);
                    continue;
                case 24:
                    i12 = i9;
                    d1.C(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, false);
                    continue;
                case 25:
                    i12 = i9;
                    d1.y(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, false);
                    continue;
                case 26:
                    i12 = i9;
                    d1.N(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var);
                    break;
                case 27:
                    i12 = i9;
                    d1.I(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, n(i12));
                    break;
                case 28:
                    i12 = i9;
                    d1.z(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var);
                    break;
                case 29:
                    i12 = i9;
                    d1.O(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, false);
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    i12 = i9;
                    d1.B(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, false);
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    i12 = i9;
                    d1.J(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, false);
                    break;
                case 32:
                    i12 = i9;
                    d1.K(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, false);
                    break;
                case 33:
                    i12 = i9;
                    d1.L(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, false);
                    break;
                case 34:
                    i12 = i9;
                    d1.M(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, false);
                    break;
                case 35:
                    i12 = i9;
                    d1.A(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, true);
                    break;
                case 36:
                    i12 = i9;
                    d1.E(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, true);
                    break;
                case 37:
                    i12 = i9;
                    d1.H(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, true);
                    break;
                case 38:
                    i12 = i9;
                    d1.P(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    i12 = i9;
                    d1.G(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    i12 = i9;
                    d1.D(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    i12 = i9;
                    d1.C(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    i12 = i9;
                    d1.y(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    i12 = i9;
                    d1.O(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    i12 = i9;
                    d1.B(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    i12 = i9;
                    d1.J(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    i12 = i9;
                    d1.K(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, true);
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    i12 = i9;
                    d1.L(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, true);
                    break;
                case 48:
                    i12 = i9;
                    d1.M(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, true);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    i12 = i9;
                    d1.F(iArr[i12], (List) unsafe.getObject(obj, j10), l0Var, n(i12));
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    i12 = i9;
                    J(l0Var, i16, unsafe.getObject(obj, j10), i12);
                    break;
                case 51:
                    i12 = i9;
                    if (r(i16, i12, obj)) {
                        double doubleValue = ((Double) s1.d.i(obj, j10)).doubleValue();
                        k kVar3 = (k) l0Var.a;
                        kVar3.getClass();
                        kVar3.K(i16, Double.doubleToRawLongBits(doubleValue));
                        break;
                    }
                    break;
                case 52:
                    i12 = i9;
                    if (r(i16, i12, obj)) {
                        float floatValue = ((Float) s1.d.i(obj, j10)).floatValue();
                        k kVar4 = (k) l0Var.a;
                        kVar4.getClass();
                        kVar4.I(i16, Float.floatToRawIntBits(floatValue));
                        break;
                    }
                    break;
                case 53:
                    i12 = i9;
                    if (r(i16, i12, obj)) {
                        ((k) l0Var.a).U(i16, A(obj, j10));
                        break;
                    }
                    break;
                case 54:
                    i12 = i9;
                    if (r(i16, i12, obj)) {
                        ((k) l0Var.a).U(i16, A(obj, j10));
                        break;
                    }
                    break;
                case 55:
                    i12 = i9;
                    if (r(i16, i12, obj)) {
                        ((k) l0Var.a).M(i16, z(obj, j10));
                        break;
                    }
                    break;
                case 56:
                    i12 = i9;
                    if (r(i16, i12, obj)) {
                        ((k) l0Var.a).K(i16, A(obj, j10));
                        break;
                    }
                    break;
                case 57:
                    i12 = i9;
                    if (r(i16, i12, obj)) {
                        ((k) l0Var.a).I(i16, z(obj, j10));
                        break;
                    }
                    break;
                case 58:
                    i12 = i9;
                    if (r(i16, i12, obj)) {
                        ((k) l0Var.a).F(i16, ((Boolean) s1.d.i(obj, j10)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    i12 = i9;
                    if (r(i16, i12, obj)) {
                        K(i16, unsafe.getObject(obj, j10), l0Var);
                        break;
                    }
                    break;
                case 60:
                    i12 = i9;
                    if (r(i16, i12, obj)) {
                        ((k) l0Var.a).O(i16, (a) unsafe.getObject(obj, j10), n(i12));
                        break;
                    }
                    break;
                case 61:
                    i12 = i9;
                    if (r(i16, i12, obj)) {
                        l0Var.a(i16, (g) unsafe.getObject(obj, j10));
                        break;
                    }
                    break;
                case 62:
                    i12 = i9;
                    if (r(i16, i12, obj)) {
                        ((k) l0Var.a).S(i16, z(obj, j10));
                        break;
                    }
                    break;
                case 63:
                    i12 = i9;
                    if (r(i16, i12, obj)) {
                        ((k) l0Var.a).M(i16, z(obj, j10));
                        break;
                    }
                    break;
                case 64:
                    i12 = i9;
                    if (r(i16, i12, obj)) {
                        ((k) l0Var.a).I(i16, z(obj, j10));
                        break;
                    }
                    break;
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    i12 = i9;
                    if (r(i16, i12, obj)) {
                        ((k) l0Var.a).K(i16, A(obj, j10));
                        break;
                    }
                    break;
                case 66:
                    i12 = i9;
                    if (r(i16, i12, obj)) {
                        int z10 = z(obj, j10);
                        ((k) l0Var.a).S(i16, (z10 >> 31) ^ (z10 << 1));
                        break;
                    }
                    break;
                case 67:
                    i12 = i9;
                    if (r(i16, i12, obj)) {
                        long A = A(obj, j10);
                        ((k) l0Var.a).U(i16, (A >> 63) ^ (A << 1));
                        break;
                    }
                    break;
                case 68:
                    i12 = i9;
                    if (r(i16, i12, obj)) {
                        l0Var.b(i16, unsafe.getObject(obj, j10), n(i12));
                        break;
                    }
                    break;
                default:
                    i12 = i9;
                    break;
            }
        }
        this.m.getClass();
        ((x) obj).unknownFields.d(l0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0147 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(l0 l0Var, int i9, Object obj, int i10) {
        int A;
        int size;
        int z10;
        int size2;
        int z11;
        if (obj != null) {
            Object m10 = m(i10);
            this.n.getClass();
            m0 m0Var = ((n0) m10).a;
            a2 a2Var = m0Var.b;
            a2 a2Var2 = m0Var.a;
            k kVar = (k) l0Var.a;
            kVar.getClass();
            for (Map.Entry entry : ((o0) obj).entrySet()) {
                kVar.R(i9, 2);
                Object key = entry.getKey();
                Object value = entry.getValue();
                int i11 = q.c;
                int y10 = k.y(1);
                x1 x1Var = a2.d;
                if (a2Var2 == x1Var) {
                    y10 *= 2;
                }
                int i12 = 8;
                switch (a2Var2.ordinal()) {
                    case 0:
                        ((Double) key).getClass();
                        A = 8;
                        int i13 = A + y10;
                        int y11 = k.y(2);
                        if (a2Var == x1Var) {
                            y11 *= 2;
                        }
                        switch (a2Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                kVar.T(i12 + y11 + i13);
                                Object key2 = entry.getKey();
                                Object value2 = entry.getValue();
                                q.b(kVar, a2Var2, 1, key2);
                                q.b(kVar, a2Var, 2, value2);
                            case 1:
                                ((Float) value).getClass();
                                i12 = 4;
                                kVar.T(i12 + y11 + i13);
                                Object key22 = entry.getKey();
                                Object value22 = entry.getValue();
                                q.b(kVar, a2Var2, 1, key22);
                                q.b(kVar, a2Var, 2, value22);
                            case 2:
                                i12 = k.A(((Long) value).longValue());
                                kVar.T(i12 + y11 + i13);
                                Object key222 = entry.getKey();
                                Object value222 = entry.getValue();
                                q.b(kVar, a2Var2, 1, key222);
                                q.b(kVar, a2Var, 2, value222);
                            case 3:
                                i12 = k.A(((Long) value).longValue());
                                kVar.T(i12 + y11 + i13);
                                Object key2222 = entry.getKey();
                                Object value2222 = entry.getValue();
                                q.b(kVar, a2Var2, 1, key2222);
                                q.b(kVar, a2Var, 2, value2222);
                            case 4:
                                i12 = k.w(((Integer) value).intValue());
                                kVar.T(i12 + y11 + i13);
                                Object key22222 = entry.getKey();
                                Object value22222 = entry.getValue();
                                q.b(kVar, a2Var2, 1, key22222);
                                q.b(kVar, a2Var, 2, value22222);
                            case 5:
                                ((Long) value).getClass();
                                kVar.T(i12 + y11 + i13);
                                Object key222222 = entry.getKey();
                                Object value222222 = entry.getValue();
                                q.b(kVar, a2Var2, 1, key222222);
                                q.b(kVar, a2Var, 2, value222222);
                            case 6:
                                ((Integer) value).getClass();
                                i12 = 4;
                                kVar.T(i12 + y11 + i13);
                                Object key2222222 = entry.getKey();
                                Object value2222222 = entry.getValue();
                                q.b(kVar, a2Var2, 1, key2222222);
                                q.b(kVar, a2Var, 2, value2222222);
                            case 7:
                                ((Boolean) value).getClass();
                                i12 = 1;
                                kVar.T(i12 + y11 + i13);
                                Object key22222222 = entry.getKey();
                                Object value22222222 = entry.getValue();
                                q.b(kVar, a2Var2, 1, key22222222);
                                q.b(kVar, a2Var, 2, value22222222);
                            case 8:
                                if (value instanceof g) {
                                    size2 = ((g) value).size();
                                    z11 = k.z(size2);
                                    i12 = z11 + size2;
                                    kVar.T(i12 + y11 + i13);
                                    Object key222222222 = entry.getKey();
                                    Object value222222222 = entry.getValue();
                                    q.b(kVar, a2Var2, 1, key222222222);
                                    q.b(kVar, a2Var, 2, value222222222);
                                } else {
                                    i12 = k.x((String) value);
                                    kVar.T(i12 + y11 + i13);
                                    Object key2222222222 = entry.getKey();
                                    Object value2222222222 = entry.getValue();
                                    q.b(kVar, a2Var2, 1, key2222222222);
                                    q.b(kVar, a2Var, 2, value2222222222);
                                }
                            case 9:
                                i12 = ((a) value).a();
                                kVar.T(i12 + y11 + i13);
                                Object key22222222222 = entry.getKey();
                                Object value22222222222 = entry.getValue();
                                q.b(kVar, a2Var2, 1, key22222222222);
                                q.b(kVar, a2Var, 2, value22222222222);
                            case 10:
                                size2 = ((a) value).a();
                                z11 = k.z(size2);
                                i12 = z11 + size2;
                                kVar.T(i12 + y11 + i13);
                                Object key222222222222 = entry.getKey();
                                Object value222222222222 = entry.getValue();
                                q.b(kVar, a2Var2, 1, key222222222222);
                                q.b(kVar, a2Var, 2, value222222222222);
                            case 11:
                                if (value instanceof g) {
                                    size2 = ((g) value).size();
                                    z11 = k.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    z11 = k.z(size2);
                                }
                                i12 = z11 + size2;
                                kVar.T(i12 + y11 + i13);
                                Object key2222222222222 = entry.getKey();
                                Object value2222222222222 = entry.getValue();
                                q.b(kVar, a2Var2, 1, key2222222222222);
                                q.b(kVar, a2Var, 2, value2222222222222);
                            case 12:
                                i12 = k.z(((Integer) value).intValue());
                                kVar.T(i12 + y11 + i13);
                                Object key22222222222222 = entry.getKey();
                                Object value22222222222222 = entry.getValue();
                                q.b(kVar, a2Var2, 1, key22222222222222);
                                q.b(kVar, a2Var, 2, value22222222222222);
                            case 13:
                                i12 = k.w(((Integer) value).intValue());
                                kVar.T(i12 + y11 + i13);
                                Object key222222222222222 = entry.getKey();
                                Object value222222222222222 = entry.getValue();
                                q.b(kVar, a2Var2, 1, key222222222222222);
                                q.b(kVar, a2Var, 2, value222222222222222);
                            case 14:
                                ((Integer) value).getClass();
                                i12 = 4;
                                kVar.T(i12 + y11 + i13);
                                Object key2222222222222222 = entry.getKey();
                                Object value2222222222222222 = entry.getValue();
                                q.b(kVar, a2Var2, 1, key2222222222222222);
                                q.b(kVar, a2Var, 2, value2222222222222222);
                            case 15:
                                ((Long) value).getClass();
                                kVar.T(i12 + y11 + i13);
                                Object key22222222222222222 = entry.getKey();
                                Object value22222222222222222 = entry.getValue();
                                q.b(kVar, a2Var2, 1, key22222222222222222);
                                q.b(kVar, a2Var, 2, value22222222222222222);
                            case 16:
                                int intValue = ((Integer) value).intValue();
                                i12 = k.z((intValue >> 31) ^ (intValue << 1));
                                kVar.T(i12 + y11 + i13);
                                Object key222222222222222222 = entry.getKey();
                                Object value222222222222222222 = entry.getValue();
                                q.b(kVar, a2Var2, 1, key222222222222222222);
                                q.b(kVar, a2Var, 2, value222222222222222222);
                            case 17:
                                long longValue = ((Long) value).longValue();
                                i12 = k.A((longValue >> 63) ^ (longValue << 1));
                                kVar.T(i12 + y11 + i13);
                                Object key2222222222222222222 = entry.getKey();
                                Object value2222222222222222222 = entry.getValue();
                                q.b(kVar, a2Var2, 1, key2222222222222222222);
                                q.b(kVar, a2Var, 2, value2222222222222222222);
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                    case 1:
                        ((Float) key).getClass();
                        A = 4;
                        int i132 = A + y10;
                        int y112 = k.y(2);
                        if (a2Var == x1Var) {
                        }
                        switch (a2Var.ordinal()) {
                        }
                    case 2:
                        A = k.A(((Long) key).longValue());
                        int i1322 = A + y10;
                        int y1122 = k.y(2);
                        if (a2Var == x1Var) {
                        }
                        switch (a2Var.ordinal()) {
                        }
                    case 3:
                        A = k.A(((Long) key).longValue());
                        int i13222 = A + y10;
                        int y11222 = k.y(2);
                        if (a2Var == x1Var) {
                        }
                        switch (a2Var.ordinal()) {
                        }
                    case 4:
                        A = k.w(((Integer) key).intValue());
                        int i132222 = A + y10;
                        int y112222 = k.y(2);
                        if (a2Var == x1Var) {
                        }
                        switch (a2Var.ordinal()) {
                        }
                    case 5:
                        ((Long) key).getClass();
                        A = 8;
                        int i1322222 = A + y10;
                        int y1122222 = k.y(2);
                        if (a2Var == x1Var) {
                        }
                        switch (a2Var.ordinal()) {
                        }
                    case 6:
                        ((Integer) key).getClass();
                        A = 4;
                        int i13222222 = A + y10;
                        int y11222222 = k.y(2);
                        if (a2Var == x1Var) {
                        }
                        switch (a2Var.ordinal()) {
                        }
                    case 7:
                        ((Boolean) key).getClass();
                        A = 1;
                        int i132222222 = A + y10;
                        int y112222222 = k.y(2);
                        if (a2Var == x1Var) {
                        }
                        switch (a2Var.ordinal()) {
                        }
                    case 8:
                        if (key instanceof g) {
                            size = ((g) key).size();
                            z10 = k.z(size);
                            A = size + z10;
                            int i1322222222 = A + y10;
                            int y1122222222 = k.y(2);
                            if (a2Var == x1Var) {
                            }
                            switch (a2Var.ordinal()) {
                            }
                        } else {
                            A = k.x((String) key);
                            int i13222222222 = A + y10;
                            int y11222222222 = k.y(2);
                            if (a2Var == x1Var) {
                            }
                            switch (a2Var.ordinal()) {
                            }
                        }
                    case 9:
                        A = ((a) key).a();
                        int i132222222222 = A + y10;
                        int y112222222222 = k.y(2);
                        if (a2Var == x1Var) {
                        }
                        switch (a2Var.ordinal()) {
                        }
                    case 10:
                        size = ((a) key).a();
                        z10 = k.z(size);
                        A = size + z10;
                        int i1322222222222 = A + y10;
                        int y1122222222222 = k.y(2);
                        if (a2Var == x1Var) {
                        }
                        switch (a2Var.ordinal()) {
                        }
                    case 11:
                        if (key instanceof g) {
                            size = ((g) key).size();
                            z10 = k.z(size);
                        } else {
                            size = ((byte[]) key).length;
                            z10 = k.z(size);
                        }
                        A = size + z10;
                        int i13222222222222 = A + y10;
                        int y11222222222222 = k.y(2);
                        if (a2Var == x1Var) {
                        }
                        switch (a2Var.ordinal()) {
                        }
                    case 12:
                        A = k.z(((Integer) key).intValue());
                        int i132222222222222 = A + y10;
                        int y112222222222222 = k.y(2);
                        if (a2Var == x1Var) {
                        }
                        switch (a2Var.ordinal()) {
                        }
                    case 13:
                        A = k.w(((Integer) key).intValue());
                        int i1322222222222222 = A + y10;
                        int y1122222222222222 = k.y(2);
                        if (a2Var == x1Var) {
                        }
                        switch (a2Var.ordinal()) {
                        }
                    case 14:
                        ((Integer) key).getClass();
                        A = 4;
                        int i13222222222222222 = A + y10;
                        int y11222222222222222 = k.y(2);
                        if (a2Var == x1Var) {
                        }
                        switch (a2Var.ordinal()) {
                        }
                    case 15:
                        ((Long) key).getClass();
                        A = 8;
                        int i132222222222222222 = A + y10;
                        int y112222222222222222 = k.y(2);
                        if (a2Var == x1Var) {
                        }
                        switch (a2Var.ordinal()) {
                        }
                    case 16:
                        int intValue2 = ((Integer) key).intValue();
                        A = k.z((intValue2 >> 31) ^ (intValue2 << 1));
                        int i1322222222222222222 = A + y10;
                        int y1122222222222222222 = k.y(2);
                        if (a2Var == x1Var) {
                        }
                        switch (a2Var.ordinal()) {
                        }
                    case 17:
                        long longValue2 = ((Long) key).longValue();
                        A = k.A((longValue2 << 1) ^ (longValue2 >> 63));
                        int i13222222222222222222 = A + y10;
                        int y11222222222222222222 = k.y(2);
                        if (a2Var == x1Var) {
                        }
                        switch (a2Var.ordinal()) {
                        }
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public final Object a() {
        this.k.getClass();
        return ((x) this.e).d(4);
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public final void b(Object obj, l0 l0Var) {
        l0Var.getClass();
        k kVar = (k) l0Var.a;
        if (!this.g) {
            I(obj, l0Var);
            return;
        }
        int[] iArr = this.a;
        int length = iArr.length;
        for (int i9 = 0; i9 < length; i9 += 3) {
            int H = H(i9);
            int i10 = iArr[i9];
            switch (G(H)) {
                case 0:
                    if (q(i9, obj)) {
                        double e10 = s1.d.e(obj, H & 1048575);
                        kVar.getClass();
                        kVar.K(i10, Double.doubleToRawLongBits(e10));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (q(i9, obj)) {
                        float f10 = s1.d.f(obj, H & 1048575);
                        kVar.getClass();
                        kVar.I(i10, Float.floatToRawIntBits(f10));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (q(i9, obj)) {
                        kVar.U(i10, s1.d.h(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (q(i9, obj)) {
                        kVar.U(i10, s1.d.h(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (q(i9, obj)) {
                        kVar.M(i10, s1.d.g(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (q(i9, obj)) {
                        kVar.K(i10, s1.d.h(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (q(i9, obj)) {
                        kVar.I(i10, s1.d.g(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (q(i9, obj)) {
                        kVar.F(i10, s1.d.c(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (q(i9, obj)) {
                        K(i10, s1.d.i(obj, H & 1048575), l0Var);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (q(i9, obj)) {
                        kVar.O(i10, (a) s1.d.i(obj, H & 1048575), n(i9));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (q(i9, obj)) {
                        l0Var.a(i10, (g) s1.d.i(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (q(i9, obj)) {
                        kVar.S(i10, s1.d.g(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (q(i9, obj)) {
                        kVar.M(i10, s1.d.g(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (q(i9, obj)) {
                        kVar.I(i10, s1.d.g(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (q(i9, obj)) {
                        kVar.K(i10, s1.d.h(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (q(i9, obj)) {
                        int g10 = s1.d.g(obj, H & 1048575);
                        kVar.S(i10, (g10 >> 31) ^ (g10 << 1));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (q(i9, obj)) {
                        long h = s1.d.h(obj, H & 1048575);
                        kVar.U(i10, (h >> 63) ^ (h << 1));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (q(i9, obj)) {
                        l0Var.b(i10, s1.d.i(obj, H & 1048575), n(i9));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    d1.A(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, false);
                    break;
                case 19:
                    d1.E(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, false);
                    break;
                case 20:
                    d1.H(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, false);
                    break;
                case 21:
                    d1.P(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, false);
                    break;
                case 22:
                    d1.G(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, false);
                    break;
                case 23:
                    d1.D(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, false);
                    break;
                case 24:
                    d1.C(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, false);
                    break;
                case 25:
                    d1.y(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, false);
                    break;
                case 26:
                    d1.N(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var);
                    break;
                case 27:
                    d1.I(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, n(i9));
                    break;
                case 28:
                    d1.z(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var);
                    break;
                case 29:
                    d1.O(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, false);
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    d1.B(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, false);
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    d1.J(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, false);
                    break;
                case 32:
                    d1.K(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, false);
                    break;
                case 33:
                    d1.L(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, false);
                    break;
                case 34:
                    d1.M(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, false);
                    break;
                case 35:
                    d1.A(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, true);
                    break;
                case 36:
                    d1.E(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, true);
                    break;
                case 37:
                    d1.H(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, true);
                    break;
                case 38:
                    d1.P(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    d1.G(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    d1.D(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    d1.C(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    d1.y(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    d1.O(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    d1.B(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    d1.J(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    d1.K(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, true);
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    d1.L(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, true);
                    break;
                case 48:
                    d1.M(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, true);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    d1.F(iArr[i9], (List) s1.d.i(obj, H & 1048575), l0Var, n(i9));
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    J(l0Var, i10, s1.d.i(obj, H & 1048575), i9);
                    break;
                case 51:
                    if (r(i10, i9, obj)) {
                        double doubleValue = ((Double) s1.d.i(obj, H & 1048575)).doubleValue();
                        kVar.getClass();
                        kVar.K(i10, Double.doubleToRawLongBits(doubleValue));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (r(i10, i9, obj)) {
                        float floatValue = ((Float) s1.d.i(obj, H & 1048575)).floatValue();
                        kVar.getClass();
                        kVar.I(i10, Float.floatToRawIntBits(floatValue));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (r(i10, i9, obj)) {
                        kVar.U(i10, A(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (r(i10, i9, obj)) {
                        kVar.U(i10, A(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (r(i10, i9, obj)) {
                        kVar.M(i10, z(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (r(i10, i9, obj)) {
                        kVar.K(i10, A(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (r(i10, i9, obj)) {
                        kVar.I(i10, z(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (r(i10, i9, obj)) {
                        kVar.F(i10, ((Boolean) s1.d.i(obj, H & 1048575)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (r(i10, i9, obj)) {
                        K(i10, s1.d.i(obj, H & 1048575), l0Var);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (r(i10, i9, obj)) {
                        kVar.O(i10, (a) s1.d.i(obj, H & 1048575), n(i9));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (r(i10, i9, obj)) {
                        l0Var.a(i10, (g) s1.d.i(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (r(i10, i9, obj)) {
                        kVar.S(i10, z(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (r(i10, i9, obj)) {
                        kVar.M(i10, z(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (r(i10, i9, obj)) {
                        kVar.I(i10, z(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (r(i10, i9, obj)) {
                        kVar.K(i10, A(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (r(i10, i9, obj)) {
                        int z10 = z(obj, H & 1048575);
                        kVar.S(i10, (z10 >> 31) ^ (z10 << 1));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (r(i10, i9, obj)) {
                        long A = A(obj, H & 1048575);
                        kVar.U(i10, (A >> 63) ^ (A << 1));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (r(i10, i9, obj)) {
                        l0Var.b(i10, s1.d.i(obj, H & 1048575), n(i9));
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.m.getClass();
        ((x) obj).unknownFields.d(l0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public final void c(Object obj) {
        int[] iArr;
        int i9;
        int i10 = this.i;
        while (true) {
            iArr = this.h;
            i9 = this.j;
            if (i10 >= i9) {
                break;
            }
            long H = H(iArr[i10]) & 1048575;
            Object i11 = s1.d.i(obj, H);
            if (i11 != null) {
                this.n.getClass();
                ((o0) i11).a = false;
                s1.o(obj, H, i11);
            }
            i10++;
        }
        int length = iArr.length;
        while (i9 < length) {
            this.l.a(obj, iArr[i9]);
            i9++;
        }
        this.m.getClass();
        ((x) obj).unknownFields.e = false;
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public final int d(a aVar) {
        return this.g ? p(aVar) : o(aVar);
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public final boolean e(Object obj) {
        int i9;
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            boolean z10 = true;
            if (i11 >= this.i) {
                return true;
            }
            int i13 = this.h[i11];
            int[] iArr = this.a;
            int i14 = iArr[i13];
            int H = H(i13);
            boolean z11 = this.g;
            if (z11) {
                i9 = 0;
            } else {
                int i15 = iArr[i13 + 2];
                int i16 = i15 & 1048575;
                i9 = 1 << (i15 >>> 20);
                if (i16 != i10) {
                    i12 = p.getInt(obj, i16);
                    i10 = i16;
                }
            }
            if ((268435456 & H) != 0) {
                if (!(z11 ? q(i13, obj) : (i12 & i9) != 0)) {
                    break;
                }
            }
            int G = G(H);
            if (G == 9 || G == 17) {
                if (z11) {
                    z10 = q(i13, obj);
                } else if ((i9 & i12) == 0) {
                    z10 = false;
                }
                if (z10) {
                    if (!n(i13).e(s1.d.i(obj, H & 1048575))) {
                        break;
                    }
                } else {
                    continue;
                }
                i11++;
            } else {
                if (G != 27) {
                    if (G == 60 || G == 68) {
                        if (r(i14, i13, obj)) {
                            if (!n(i13).e(s1.d.i(obj, H & 1048575))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                        i11++;
                    } else if (G != 49) {
                        if (G == 50) {
                            Object i17 = s1.d.i(obj, H & 1048575);
                            this.n.getClass();
                            o0 o0Var = (o0) i17;
                            if (!o0Var.isEmpty() && ((n0) m(i13)).a.b.a == b2.r) {
                                c1 c1Var = null;
                                for (Object obj2 : o0Var.values()) {
                                    if (c1Var == null) {
                                        c1Var = z0.c.a(obj2.getClass());
                                    }
                                    if (!c1Var.e(obj2)) {
                                        break loop0;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                        i11++;
                    }
                }
                List list = (List) s1.d.i(obj, H & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    c1 n10 = n(i13);
                    for (int i18 = 0; i18 < list.size(); i18++) {
                        if (!n10.e(list.get(i18))) {
                            break loop0;
                        }
                    }
                }
                i11++;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.datastore.preferences.protobuf.c1
    public final void f(x xVar, x xVar2) {
        x xVar3;
        xVar2.getClass();
        int i9 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i9 >= iArr.length) {
                x xVar4 = xVar;
                if (this.g) {
                    return;
                }
                d1.w(this.m, xVar4, xVar2);
                return;
            }
            int H = H(i9);
            long j10 = 1048575 & H;
            int i10 = iArr[i9];
            switch (G(H)) {
                case 0:
                    if (q(i9, xVar2)) {
                        r1 r1Var = s1.d;
                        xVar3 = xVar;
                        r1Var.m(xVar3, j10, r1Var.e(xVar2, j10));
                        E(i9, xVar3);
                        break;
                    }
                    xVar3 = xVar;
                    break;
                case 1:
                    if (q(i9, xVar2)) {
                        r1 r1Var2 = s1.d;
                        r1Var2.n(xVar, j10, r1Var2.f(xVar2, j10));
                        E(i9, xVar);
                    }
                    xVar3 = xVar;
                    break;
                case 2:
                    if (q(i9, xVar2)) {
                        s1.n(xVar, j10, s1.d.h(xVar2, j10));
                        E(i9, xVar);
                    }
                    xVar3 = xVar;
                    break;
                case 3:
                    if (q(i9, xVar2)) {
                        s1.n(xVar, j10, s1.d.h(xVar2, j10));
                        E(i9, xVar);
                    }
                    xVar3 = xVar;
                    break;
                case 4:
                    if (q(i9, xVar2)) {
                        s1.m(j10, xVar, s1.d.g(xVar2, j10));
                        E(i9, xVar);
                    }
                    xVar3 = xVar;
                    break;
                case 5:
                    if (q(i9, xVar2)) {
                        s1.n(xVar, j10, s1.d.h(xVar2, j10));
                        E(i9, xVar);
                    }
                    xVar3 = xVar;
                    break;
                case 6:
                    if (q(i9, xVar2)) {
                        s1.m(j10, xVar, s1.d.g(xVar2, j10));
                        E(i9, xVar);
                    }
                    xVar3 = xVar;
                    break;
                case 7:
                    if (q(i9, xVar2)) {
                        r1 r1Var3 = s1.d;
                        r1Var3.k(xVar, j10, r1Var3.c(xVar2, j10));
                        E(i9, xVar);
                    }
                    xVar3 = xVar;
                    break;
                case 8:
                    if (q(i9, xVar2)) {
                        s1.o(xVar, j10, s1.d.i(xVar2, j10));
                        E(i9, xVar);
                    }
                    xVar3 = xVar;
                    break;
                case 9:
                    u(i9, xVar, xVar2);
                    xVar3 = xVar;
                    break;
                case 10:
                    if (q(i9, xVar2)) {
                        s1.o(xVar, j10, s1.d.i(xVar2, j10));
                        E(i9, xVar);
                    }
                    xVar3 = xVar;
                    break;
                case 11:
                    if (q(i9, xVar2)) {
                        s1.m(j10, xVar, s1.d.g(xVar2, j10));
                        E(i9, xVar);
                    }
                    xVar3 = xVar;
                    break;
                case 12:
                    if (q(i9, xVar2)) {
                        s1.m(j10, xVar, s1.d.g(xVar2, j10));
                        E(i9, xVar);
                    }
                    xVar3 = xVar;
                    break;
                case 13:
                    if (q(i9, xVar2)) {
                        s1.m(j10, xVar, s1.d.g(xVar2, j10));
                        E(i9, xVar);
                    }
                    xVar3 = xVar;
                    break;
                case 14:
                    if (q(i9, xVar2)) {
                        s1.n(xVar, j10, s1.d.h(xVar2, j10));
                        E(i9, xVar);
                    }
                    xVar3 = xVar;
                    break;
                case 15:
                    if (q(i9, xVar2)) {
                        s1.m(j10, xVar, s1.d.g(xVar2, j10));
                        E(i9, xVar);
                    }
                    xVar3 = xVar;
                    break;
                case 16:
                    if (q(i9, xVar2)) {
                        s1.n(xVar, j10, s1.d.h(xVar2, j10));
                        E(i9, xVar);
                    }
                    xVar3 = xVar;
                    break;
                case 17:
                    u(i9, xVar, xVar2);
                    xVar3 = xVar;
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
                    this.l.b(xVar, j10, xVar2);
                    xVar3 = xVar;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Class cls = d1.a;
                    r1 r1Var4 = s1.d;
                    Object i11 = r1Var4.i(xVar, j10);
                    Object i12 = r1Var4.i(xVar2, j10);
                    this.n.getClass();
                    s1.o(xVar, j10, p0.b(i11, i12));
                    xVar3 = xVar;
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
                    if (r(i10, i9, xVar2)) {
                        s1.o(xVar, j10, s1.d.i(xVar2, j10));
                        F(i10, i9, xVar);
                    }
                    xVar3 = xVar;
                    break;
                case 60:
                    v(i9, xVar, xVar2);
                    xVar3 = xVar;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                case 66:
                case 67:
                    if (r(i10, i9, xVar2)) {
                        s1.o(xVar, j10, s1.d.i(xVar2, j10));
                        F(i10, i9, xVar);
                    }
                    xVar3 = xVar;
                    break;
                case 68:
                    v(i9, xVar, xVar2);
                    xVar3 = xVar;
                    break;
                default:
                    xVar3 = xVar;
                    break;
            }
            i9 += 3;
            xVar = xVar3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0217, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e3, code lost:
    
        r3 = r8 + r3;
     */
    @Override // androidx.datastore.preferences.protobuf.c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(x xVar) {
        int i9;
        int b10;
        int i10;
        int[] iArr = this.a;
        int length = iArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int H = H(i12);
            int i13 = iArr[i12];
            long j10 = 1048575 & H;
            int i14 = 1237;
            int i15 = 37;
            switch (G(H)) {
                case 0:
                    i9 = i11 * 53;
                    b10 = a0.b(Double.doubleToLongBits(s1.d.e(xVar, j10)));
                    i11 = b10 + i9;
                    break;
                case 1:
                    i9 = i11 * 53;
                    b10 = Float.floatToIntBits(s1.d.f(xVar, j10));
                    i11 = b10 + i9;
                    break;
                case 2:
                    i9 = i11 * 53;
                    b10 = a0.b(s1.d.h(xVar, j10));
                    i11 = b10 + i9;
                    break;
                case 3:
                    i9 = i11 * 53;
                    b10 = a0.b(s1.d.h(xVar, j10));
                    i11 = b10 + i9;
                    break;
                case 4:
                    i9 = i11 * 53;
                    b10 = s1.d.g(xVar, j10);
                    i11 = b10 + i9;
                    break;
                case 5:
                    i9 = i11 * 53;
                    b10 = a0.b(s1.d.h(xVar, j10));
                    i11 = b10 + i9;
                    break;
                case 6:
                    i9 = i11 * 53;
                    b10 = s1.d.g(xVar, j10);
                    i11 = b10 + i9;
                    break;
                case 7:
                    i10 = i11 * 53;
                    boolean c10 = s1.d.c(xVar, j10);
                    Charset charset = a0.a;
                    break;
                case 8:
                    i9 = i11 * 53;
                    b10 = ((String) s1.d.i(xVar, j10)).hashCode();
                    i11 = b10 + i9;
                    break;
                case 9:
                    Object i16 = s1.d.i(xVar, j10);
                    if (i16 != null) {
                        i15 = i16.hashCode();
                    }
                    i11 = (i11 * 53) + i15;
                    break;
                case 10:
                    i9 = i11 * 53;
                    b10 = s1.d.i(xVar, j10).hashCode();
                    i11 = b10 + i9;
                    break;
                case 11:
                    i9 = i11 * 53;
                    b10 = s1.d.g(xVar, j10);
                    i11 = b10 + i9;
                    break;
                case 12:
                    i9 = i11 * 53;
                    b10 = s1.d.g(xVar, j10);
                    i11 = b10 + i9;
                    break;
                case 13:
                    i9 = i11 * 53;
                    b10 = s1.d.g(xVar, j10);
                    i11 = b10 + i9;
                    break;
                case 14:
                    i9 = i11 * 53;
                    b10 = a0.b(s1.d.h(xVar, j10));
                    i11 = b10 + i9;
                    break;
                case 15:
                    i9 = i11 * 53;
                    b10 = s1.d.g(xVar, j10);
                    i11 = b10 + i9;
                    break;
                case 16:
                    i9 = i11 * 53;
                    b10 = a0.b(s1.d.h(xVar, j10));
                    i11 = b10 + i9;
                    break;
                case 17:
                    Object i17 = s1.d.i(xVar, j10);
                    if (i17 != null) {
                        i15 = i17.hashCode();
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
                    b10 = s1.d.i(xVar, j10).hashCode();
                    i11 = b10 + i9;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    i9 = i11 * 53;
                    b10 = s1.d.i(xVar, j10).hashCode();
                    i11 = b10 + i9;
                    break;
                case 51:
                    if (r(i13, i12, xVar)) {
                        i9 = i11 * 53;
                        b10 = a0.b(Double.doubleToLongBits(((Double) s1.d.i(xVar, j10)).doubleValue()));
                        i11 = b10 + i9;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (r(i13, i12, xVar)) {
                        i9 = i11 * 53;
                        b10 = Float.floatToIntBits(((Float) s1.d.i(xVar, j10)).floatValue());
                        i11 = b10 + i9;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (r(i13, i12, xVar)) {
                        i9 = i11 * 53;
                        b10 = a0.b(A(xVar, j10));
                        i11 = b10 + i9;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (r(i13, i12, xVar)) {
                        i9 = i11 * 53;
                        b10 = a0.b(A(xVar, j10));
                        i11 = b10 + i9;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (r(i13, i12, xVar)) {
                        i9 = i11 * 53;
                        b10 = z(xVar, j10);
                        i11 = b10 + i9;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (r(i13, i12, xVar)) {
                        i9 = i11 * 53;
                        b10 = a0.b(A(xVar, j10));
                        i11 = b10 + i9;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (r(i13, i12, xVar)) {
                        i9 = i11 * 53;
                        b10 = z(xVar, j10);
                        i11 = b10 + i9;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (r(i13, i12, xVar)) {
                        i10 = i11 * 53;
                        boolean booleanValue = ((Boolean) s1.d.i(xVar, j10)).booleanValue();
                        Charset charset2 = a0.a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (r(i13, i12, xVar)) {
                        i9 = i11 * 53;
                        b10 = ((String) s1.d.i(xVar, j10)).hashCode();
                        i11 = b10 + i9;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (r(i13, i12, xVar)) {
                        i9 = i11 * 53;
                        b10 = s1.d.i(xVar, j10).hashCode();
                        i11 = b10 + i9;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (r(i13, i12, xVar)) {
                        i9 = i11 * 53;
                        b10 = s1.d.i(xVar, j10).hashCode();
                        i11 = b10 + i9;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (r(i13, i12, xVar)) {
                        i9 = i11 * 53;
                        b10 = z(xVar, j10);
                        i11 = b10 + i9;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (r(i13, i12, xVar)) {
                        i9 = i11 * 53;
                        b10 = z(xVar, j10);
                        i11 = b10 + i9;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (r(i13, i12, xVar)) {
                        i9 = i11 * 53;
                        b10 = z(xVar, j10);
                        i11 = b10 + i9;
                        break;
                    } else {
                        break;
                    }
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (r(i13, i12, xVar)) {
                        i9 = i11 * 53;
                        b10 = a0.b(A(xVar, j10));
                        i11 = b10 + i9;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (r(i13, i12, xVar)) {
                        i9 = i11 * 53;
                        b10 = z(xVar, j10);
                        i11 = b10 + i9;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (r(i13, i12, xVar)) {
                        i9 = i11 * 53;
                        b10 = a0.b(A(xVar, j10));
                        i11 = b10 + i9;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (r(i13, i12, xVar)) {
                        i9 = i11 * 53;
                        b10 = s1.d.i(xVar, j10).hashCode();
                        i11 = b10 + i9;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.m.getClass();
        return xVar.unknownFields.hashCode() + (i11 * 53);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.d1.x(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (androidx.datastore.preferences.protobuf.d1.x(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.d1.x(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.d1.x(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.c(r12, r7) == r5.c(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.f(r12, r7)) == java.lang.Float.floatToIntBits(r5.f(r13, r7))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.e(r12, r7)) == java.lang.Double.doubleToLongBits(r5.e(r13, r7))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (androidx.datastore.preferences.protobuf.d1.x(r9.i(r12, r7), r9.i(r13, r7)) != false) goto L105;
     */
    @Override // androidx.datastore.preferences.protobuf.c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(x xVar, x xVar2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i9 = 0;
        while (true) {
            boolean z10 = true;
            if (i9 < length) {
                int H = H(i9);
                long j10 = H & 1048575;
                switch (G(H)) {
                    case 0:
                        if (j(xVar, xVar2, i9)) {
                            r1 r1Var = s1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 1:
                        if (j(xVar, xVar2, i9)) {
                            r1 r1Var2 = s1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 2:
                        if (j(xVar, xVar2, i9)) {
                            r1 r1Var3 = s1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 3:
                        if (j(xVar, xVar2, i9)) {
                            r1 r1Var4 = s1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 4:
                        if (j(xVar, xVar2, i9)) {
                            r1 r1Var5 = s1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 5:
                        if (j(xVar, xVar2, i9)) {
                            r1 r1Var6 = s1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 6:
                        if (j(xVar, xVar2, i9)) {
                            r1 r1Var7 = s1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 7:
                        if (j(xVar, xVar2, i9)) {
                            r1 r1Var8 = s1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 8:
                        if (j(xVar, xVar2, i9)) {
                            r1 r1Var9 = s1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 9:
                        if (j(xVar, xVar2, i9)) {
                            r1 r1Var10 = s1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 10:
                        if (j(xVar, xVar2, i9)) {
                            r1 r1Var11 = s1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 11:
                        if (j(xVar, xVar2, i9)) {
                            r1 r1Var12 = s1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 12:
                        if (j(xVar, xVar2, i9)) {
                            r1 r1Var13 = s1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 13:
                        if (j(xVar, xVar2, i9)) {
                            r1 r1Var14 = s1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 14:
                        if (j(xVar, xVar2, i9)) {
                            r1 r1Var15 = s1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 15:
                        if (j(xVar, xVar2, i9)) {
                            r1 r1Var16 = s1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 16:
                        if (j(xVar, xVar2, i9)) {
                            r1 r1Var17 = s1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 17:
                        if (j(xVar, xVar2, i9)) {
                            r1 r1Var18 = s1.d;
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
                        r1 r1Var19 = s1.d;
                        z10 = d1.x(r1Var19.i(xVar, j10), r1Var19.i(xVar2, j10));
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        r1 r1Var20 = s1.d;
                        z10 = d1.x(r1Var20.i(xVar, j10), r1Var20.i(xVar2, j10));
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
                        r1 r1Var21 = s1.d;
                        if (r1Var21.g(xVar, j11) == r1Var21.g(xVar2, j11)) {
                            break;
                        }
                        z10 = false;
                        break;
                }
                if (z10) {
                    i9 += 3;
                }
            } else {
                this.m.getClass();
                if (xVar.unknownFields.equals(xVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:213:0x0084, code lost:
    
        if (r11 != null) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0608 A[Catch: all -> 0x039e, TryCatch #11 {all -> 0x039e, blocks: (B:101:0x0603, B:103:0x0608, B:105:0x060f, B:107:0x0616, B:134:0x0388, B:137:0x0391, B:138:0x03a1, B:139:0x03b2, B:140:0x03c3, B:141:0x03d4, B:142:0x03e5, B:143:0x03f6, B:144:0x0407, B:145:0x0418, B:146:0x0429, B:148:0x0434, B:149:0x0453, B:150:0x0467, B:151:0x047c, B:152:0x0491, B:153:0x04a6, B:154:0x04bb, B:155:0x04d3, B:156:0x04e8, B:157:0x04fd, B:159:0x0508, B:160:0x0527, B:161:0x053b, B:162:0x0548, B:163:0x055f, B:164:0x0574, B:165:0x0589, B:166:0x059e, B:167:0x05b3, B:168:0x05c8, B:169:0x05de, B:177:0x05f4), top: B:100:0x0603 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x061c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0639 A[LOOP:4: B:121:0x0637->B:122:0x0639, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Object obj, i iVar, n nVar) {
        t0 t0Var;
        int i9;
        i iVar2;
        int G;
        i0 i0Var;
        t0 t0Var2 = this;
        Object obj2 = obj;
        i iVar3 = iVar;
        n nVar2 = nVar;
        nVar2.getClass();
        k1 k1Var = t0Var2.m;
        int[] iArr = t0Var2.h;
        int i10 = t0Var2.j;
        int i11 = t0Var2.i;
        j1 j1Var = null;
        while (true) {
            try {
                int c10 = iVar3.c();
                if (c10 >= t0Var2.c && c10 <= t0Var2.d) {
                    int[] iArr2 = t0Var2.a;
                    int length = (iArr2.length / 3) - 1;
                    int i12 = 0;
                    while (i12 <= length) {
                        int i13 = (length + i12) >>> 1;
                        int i14 = i13 * 3;
                        int i15 = iArr2[i14];
                        if (c10 == i15) {
                            i9 = i14;
                            j1 j1Var2 = j1.f;
                            if (i9 < 0) {
                                int H = t0Var2.H(i9);
                                try {
                                    G = G(H);
                                    i0Var = t0Var2.l;
                                } catch (b0 unused) {
                                }
                                switch (G) {
                                    case 0:
                                        int i16 = i9;
                                        iVar2 = iVar3;
                                        t0Var = t0Var2;
                                        try {
                                        } catch (b0 unused2) {
                                            obj2 = obj;
                                        } catch (Throwable th) {
                                            th = th;
                                            obj2 = obj;
                                        }
                                        try {
                                            s1.d.m(obj, y(H), iVar2.i());
                                            obj2 = obj;
                                            t0Var.E(i16, obj2);
                                        } catch (b0 unused3) {
                                            obj2 = obj;
                                            try {
                                                k1Var.getClass();
                                                if (j1Var == null) {
                                                }
                                                if (!k1.a(j1Var, iVar2)) {
                                                }
                                                nVar2 = nVar;
                                                t0Var2 = t0Var;
                                                iVar3 = iVar2;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                while (i11 < i10) {
                                                    t0Var.k(iArr[i11], obj2, j1Var);
                                                    i11++;
                                                }
                                                if (j1Var != null) {
                                                    k1Var.getClass();
                                                    ((x) obj2).unknownFields = j1Var;
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            obj2 = obj;
                                            while (i11 < i10) {
                                            }
                                            if (j1Var != null) {
                                            }
                                            throw th;
                                        }
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                        break;
                                    case 1:
                                        iVar2 = iVar3;
                                        t0Var = t0Var2;
                                        s1.d.n(obj2, y(H), iVar2.r());
                                        t0Var.E(i9, obj2);
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 2:
                                        iVar2 = iVar3;
                                        t0Var = t0Var2;
                                        s1.n(obj2, y(H), iVar2.y());
                                        t0Var.E(i9, obj2);
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 3:
                                        iVar2 = iVar3;
                                        t0Var = t0Var2;
                                        s1.n(obj2, y(H), iVar2.P());
                                        t0Var.E(i9, obj2);
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 4:
                                        iVar2 = iVar3;
                                        t0Var = t0Var2;
                                        s1.m(y(H), obj2, iVar2.w());
                                        t0Var.E(i9, obj2);
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 5:
                                        iVar2 = iVar3;
                                        t0Var = t0Var2;
                                        s1.n(obj2, y(H), iVar2.p());
                                        t0Var.E(i9, obj2);
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 6:
                                        iVar2 = iVar3;
                                        t0Var = t0Var2;
                                        s1.m(y(H), obj2, iVar2.n());
                                        t0Var.E(i9, obj2);
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 7:
                                        iVar2 = iVar3;
                                        t0Var = t0Var2;
                                        s1.d.k(obj2, y(H), iVar2.e());
                                        t0Var.E(i9, obj2);
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 8:
                                        iVar2 = iVar3;
                                        t0Var = t0Var2;
                                        t0Var.C(obj2, H, iVar2);
                                        t0Var.E(i9, obj2);
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 9:
                                        int i17 = i9;
                                        iVar2 = iVar3;
                                        n nVar3 = nVar2;
                                        t0Var = t0Var2;
                                        if (t0Var.q(i17, obj2)) {
                                            s1.o(obj2, y(H), a0.c(s1.d.i(obj2, y(H)), iVar2.B(t0Var.n(i17), nVar3)));
                                        } else {
                                            s1.o(obj2, y(H), iVar2.B(t0Var.n(i17), nVar3));
                                            t0Var.E(i17, obj2);
                                        }
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 10:
                                        iVar2 = iVar3;
                                        t0Var = t0Var2;
                                        s1.o(obj2, y(H), iVar2.g());
                                        t0Var.E(i9, obj2);
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 11:
                                        iVar2 = iVar3;
                                        t0Var = t0Var2;
                                        s1.m(y(H), obj2, iVar2.N());
                                        t0Var.E(i9, obj2);
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 12:
                                        int i18 = i9;
                                        iVar2 = iVar3;
                                        t0Var = t0Var2;
                                        int k10 = iVar2.k();
                                        t0Var.l(i18);
                                        s1.m(y(H), obj2, k10);
                                        t0Var.E(i18, obj2);
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 13:
                                        iVar2 = iVar3;
                                        t0Var = t0Var2;
                                        s1.m(y(H), obj2, iVar2.C());
                                        t0Var.E(i9, obj2);
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 14:
                                        iVar2 = iVar3;
                                        t0Var = t0Var2;
                                        s1.n(obj2, y(H), iVar2.E());
                                        t0Var.E(i9, obj2);
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 15:
                                        iVar2 = iVar3;
                                        t0Var = t0Var2;
                                        s1.m(y(H), obj2, iVar2.G());
                                        t0Var.E(i9, obj2);
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 16:
                                        iVar2 = iVar3;
                                        t0Var = t0Var2;
                                        s1.n(obj2, y(H), iVar2.I());
                                        t0Var.E(i9, obj2);
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 17:
                                        int i19 = i9;
                                        iVar2 = iVar3;
                                        n nVar4 = nVar2;
                                        t0Var = t0Var2;
                                        if (t0Var.q(i19, obj2)) {
                                            s1.o(obj2, y(H), a0.c(s1.d.i(obj2, y(H)), iVar2.u(t0Var.n(i19), nVar4)));
                                        } else {
                                            s1.o(obj2, y(H), iVar2.u(t0Var.n(i19), nVar4));
                                            t0Var.E(i19, obj2);
                                        }
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 18:
                                        iVar2 = iVar3;
                                        t0Var = t0Var2;
                                        iVar2.j(i0Var.c(obj2, y(H)));
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 19:
                                        iVar2 = iVar3;
                                        t0Var = t0Var2;
                                        iVar2.s(i0Var.c(obj2, y(H)));
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 20:
                                        iVar2 = iVar3;
                                        t0Var = t0Var2;
                                        iVar2.z(i0Var.c(obj2, y(H)));
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 21:
                                        iVar2 = iVar3;
                                        t0Var = t0Var2;
                                        iVar2.Q(i0Var.c(obj2, y(H)));
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 22:
                                        iVar2 = iVar3;
                                        t0Var = t0Var2;
                                        iVar2.x(i0Var.c(obj2, y(H)));
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 23:
                                        iVar2 = iVar3;
                                        t0Var = t0Var2;
                                        iVar2.q(i0Var.c(obj2, y(H)));
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 24:
                                        iVar2 = iVar3;
                                        t0Var = t0Var2;
                                        iVar2.o(i0Var.c(obj2, y(H)));
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 25:
                                        iVar2 = iVar3;
                                        t0Var = t0Var2;
                                        iVar2.f(i0Var.c(obj2, y(H)));
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 26:
                                        iVar2 = iVar3;
                                        t0Var = t0Var2;
                                        if ((536870912 & H) != 0) {
                                            try {
                                                iVar2.L(i0Var.c(obj2, H & 1048575), true);
                                            } catch (b0 unused4) {
                                                k1Var.getClass();
                                                if (j1Var == null) {
                                                    x xVar = (x) obj2;
                                                    j1 j1Var3 = xVar.unknownFields;
                                                    if (j1Var3 == j1Var2) {
                                                        j1Var3 = j1.b();
                                                        xVar.unknownFields = j1Var3;
                                                    }
                                                    j1Var = j1Var3;
                                                }
                                                if (!k1.a(j1Var, iVar2)) {
                                                    while (i11 < i10) {
                                                        t0Var.k(iArr[i11], obj2, j1Var);
                                                        i11++;
                                                    }
                                                    if (j1Var != null) {
                                                        ((x) obj2).unknownFields = j1Var;
                                                        return;
                                                    }
                                                    return;
                                                }
                                                nVar2 = nVar;
                                                t0Var2 = t0Var;
                                                iVar3 = iVar2;
                                            }
                                        } else {
                                            iVar2.L(i0Var.c(obj2, H & 1048575), false);
                                        }
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 27:
                                        try {
                                            try {
                                                t0Var2.B(obj2, H, iVar3, t0Var2.n(i9), nVar);
                                                t0Var = t0Var2;
                                                iVar2 = iVar3;
                                            } catch (b0 unused5) {
                                                t0Var = t0Var2;
                                                iVar2 = iVar3;
                                                k1Var.getClass();
                                                if (j1Var == null) {
                                                }
                                                if (!k1.a(j1Var, iVar2)) {
                                                }
                                                nVar2 = nVar;
                                                t0Var2 = t0Var;
                                                iVar3 = iVar2;
                                            }
                                        } catch (b0 unused6) {
                                            t0Var = t0Var2;
                                            iVar2 = iVar3;
                                            k1Var.getClass();
                                            if (j1Var == null) {
                                            }
                                            if (!k1.a(j1Var, iVar2)) {
                                            }
                                            nVar2 = nVar;
                                            t0Var2 = t0Var;
                                            iVar3 = iVar2;
                                        }
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                        break;
                                    case 28:
                                        iVar3.h(i0Var.c(obj2, y(H)));
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 29:
                                        iVar3.O(i0Var.c(obj2, y(H)));
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case MessageObject.TYPE_GIFT_STARS /* 30 */:
                                        iVar3.l(i0Var.c(obj2, y(H)));
                                        t0Var2.l(i9);
                                        Class cls = d1.a;
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                                        iVar3.D(i0Var.c(obj2, y(H)));
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 32:
                                        iVar3.F(i0Var.c(obj2, y(H)));
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 33:
                                        iVar3.H(i0Var.c(obj2, y(H)));
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 34:
                                        iVar3.J(i0Var.c(obj2, y(H)));
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 35:
                                        iVar3.j(i0Var.c(obj2, y(H)));
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 36:
                                        iVar3.s(i0Var.c(obj2, y(H)));
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 37:
                                        iVar3.z(i0Var.c(obj2, y(H)));
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 38:
                                        iVar3.Q(i0Var.c(obj2, y(H)));
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case Maneuver.TYPE_DESTINATION /* 39 */:
                                        iVar3.x(i0Var.c(obj2, y(H)));
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                        iVar3.q(i0Var.c(obj2, y(H)));
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                        iVar3.o(i0Var.c(obj2, H & 1048575));
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                        iVar3.f(i0Var.c(obj2, H & 1048575));
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                                        iVar3.O(i0Var.c(obj2, H & 1048575));
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                        iVar3.l(i0Var.c(obj2, H & 1048575));
                                        t0Var2.l(i9);
                                        Class cls2 = d1.a;
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                        iVar3.D(i0Var.c(obj2, H & 1048575));
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                        iVar3.F(i0Var.c(obj2, H & 1048575));
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                        iVar3.H(i0Var.c(obj2, H & 1048575));
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 48:
                                        iVar3.J(i0Var.c(obj2, H & 1048575));
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                        iVar3.v(i0Var.c(obj2, H & 1048575), t0Var2.n(i9), nVar2);
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                        try {
                                            try {
                                                t0Var2.t(obj2, i9, t0Var2.m(i9), nVar2, iVar);
                                                iVar3 = iVar;
                                                t0Var = t0Var2;
                                                iVar2 = iVar3;
                                            } catch (b0 unused7) {
                                                t0Var = t0Var2;
                                                iVar2 = iVar;
                                                k1Var.getClass();
                                                if (j1Var == null) {
                                                }
                                                if (!k1.a(j1Var, iVar2)) {
                                                }
                                                nVar2 = nVar;
                                                t0Var2 = t0Var;
                                                iVar3 = iVar2;
                                            }
                                        } catch (b0 unused8) {
                                            iVar2 = iVar;
                                            t0Var = t0Var2;
                                        }
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                        break;
                                    case 51:
                                        s1.o(obj2, H & 1048575, Double.valueOf(iVar3.i()));
                                        t0Var2.F(c10, i9, obj2);
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 52:
                                        s1.o(obj2, H & 1048575, Float.valueOf(iVar3.r()));
                                        t0Var2.F(c10, i9, obj2);
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 53:
                                        s1.o(obj2, H & 1048575, Long.valueOf(iVar3.y()));
                                        t0Var2.F(c10, i9, obj2);
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 54:
                                        s1.o(obj2, H & 1048575, Long.valueOf(iVar3.P()));
                                        t0Var2.F(c10, i9, obj2);
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 55:
                                        s1.o(obj2, H & 1048575, Integer.valueOf(iVar3.w()));
                                        t0Var2.F(c10, i9, obj2);
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 56:
                                        s1.o(obj2, H & 1048575, Long.valueOf(iVar3.p()));
                                        t0Var2.F(c10, i9, obj2);
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 57:
                                        s1.o(obj2, H & 1048575, Integer.valueOf(iVar3.n()));
                                        t0Var2.F(c10, i9, obj2);
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 58:
                                        s1.o(obj2, H & 1048575, Boolean.valueOf(iVar3.e()));
                                        t0Var2.F(c10, i9, obj2);
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 59:
                                        t0Var2.C(obj2, H, iVar3);
                                        t0Var2.F(c10, i9, obj2);
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 60:
                                        if (t0Var2.r(c10, i9, obj2)) {
                                            long j10 = H & 1048575;
                                            s1.o(obj2, j10, a0.c(s1.d.i(obj2, j10), iVar3.B(t0Var2.n(i9), nVar2)));
                                        } else {
                                            s1.o(obj2, H & 1048575, iVar3.B(t0Var2.n(i9), nVar2));
                                            t0Var2.E(i9, obj2);
                                        }
                                        t0Var2.F(c10, i9, obj2);
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 61:
                                        s1.o(obj2, H & 1048575, iVar3.g());
                                        t0Var2.F(c10, i9, obj2);
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 62:
                                        s1.o(obj2, H & 1048575, Integer.valueOf(iVar3.N()));
                                        t0Var2.F(c10, i9, obj2);
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 63:
                                        int k11 = iVar3.k();
                                        t0Var2.l(i9);
                                        s1.o(obj2, H & 1048575, Integer.valueOf(k11));
                                        t0Var2.F(c10, i9, obj2);
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 64:
                                        s1.o(obj2, H & 1048575, Integer.valueOf(iVar3.C()));
                                        t0Var2.F(c10, i9, obj2);
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case VoIPService.CALL_MIN_LAYER /* 65 */:
                                        s1.o(obj2, H & 1048575, Long.valueOf(iVar3.E()));
                                        t0Var2.F(c10, i9, obj2);
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 66:
                                        s1.o(obj2, H & 1048575, Integer.valueOf(iVar3.G()));
                                        t0Var2.F(c10, i9, obj2);
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 67:
                                        s1.o(obj2, H & 1048575, Long.valueOf(iVar3.I()));
                                        t0Var2.F(c10, i9, obj2);
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    case 68:
                                        s1.o(obj2, H & 1048575, iVar3.u(t0Var2.n(i9), nVar2));
                                        t0Var2.F(c10, i9, obj2);
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                    default:
                                        if (j1Var == null) {
                                            k1Var.getClass();
                                            j1Var = j1.b();
                                        }
                                        k1Var.getClass();
                                        if (!k1.a(j1Var, iVar3)) {
                                            while (i11 < i10) {
                                                t0Var2.k(iArr[i11], obj2, j1Var);
                                                i11++;
                                            }
                                            break;
                                        }
                                        t0Var = t0Var2;
                                        iVar2 = iVar3;
                                        nVar2 = nVar;
                                        t0Var2 = t0Var;
                                        iVar3 = iVar2;
                                }
                            } else if (c10 == Integer.MAX_VALUE) {
                                while (i11 < i10) {
                                    t0Var2.k(iArr[i11], obj2, j1Var);
                                    i11++;
                                }
                                if (j1Var != null) {
                                    k1Var.getClass();
                                }
                            } else {
                                k1Var.getClass();
                                if (j1Var == null) {
                                    x xVar2 = (x) obj2;
                                    j1 j1Var4 = xVar2.unknownFields;
                                    if (j1Var4 == j1Var2) {
                                        j1Var4 = j1.b();
                                        xVar2.unknownFields = j1Var4;
                                    }
                                    j1Var = j1Var4;
                                }
                                if (!k1.a(j1Var, iVar3)) {
                                    while (i11 < i10) {
                                        t0Var2.k(iArr[i11], obj2, j1Var);
                                        i11++;
                                    }
                                }
                            }
                        } else if (c10 < i15) {
                            length = i13 - 1;
                        } else {
                            i12 = i13 + 1;
                        }
                    }
                }
                i9 = -1;
                j1 j1Var22 = j1.f;
                if (i9 < 0) {
                }
            } catch (Throwable th4) {
                th = th4;
                t0Var = t0Var2;
            }
        }
        ((x) obj2).unknownFields = j1Var;
    }

    public final boolean j(x xVar, Object obj, int i9) {
        return q(i9, xVar) == q(i9, obj);
    }

    public final void k(int i9, Object obj, Object obj2) {
        int i10 = this.a[i9];
        if (s1.d.i(obj, H(i9) & 1048575) == null) {
            return;
        }
        l(i9);
    }

    public final void l(int i9) {
        if (this.b[((i9 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final Object m(int i9) {
        return this.b[(i9 / 3) * 2];
    }

    public final c1 n(int i9) {
        int i10 = (i9 / 3) * 2;
        Object[] objArr = this.b;
        c1 c1Var = (c1) objArr[i10];
        if (c1Var != null) {
            return c1Var;
        }
        c1 a2 = z0.c.a((Class) objArr[i10 + 1]);
        objArr[i10] = a2;
        return a2;
    }

    public final int o(Object obj) {
        int i9;
        int y10;
        int A;
        int y11;
        int w8;
        int u10;
        int y12;
        int x10;
        int f10;
        int y13;
        int i10;
        Unsafe unsafe = p;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i12 >= iArr.length) {
                this.m.getClass();
                return ((x) obj).unknownFields.a() + i13;
            }
            int H = H(i12);
            int i15 = iArr[i12];
            int G = G(H);
            if (G <= 17) {
                int i16 = iArr[i12 + 2];
                int i17 = i16 & 1048575;
                i9 = 1 << (i16 >>> 20);
                if (i17 != i11) {
                    i14 = unsafe.getInt(obj, i17);
                    i11 = i17;
                }
            } else {
                i9 = 0;
            }
            long j10 = H & 1048575;
            switch (G) {
                case 0:
                    if ((i9 & i14) != 0) {
                        i13 = aa.d.e(i15, 8, i13);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i14 & i9) != 0) {
                        i13 = aa.d.e(i15, 4, i13);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i14 & i9) != 0) {
                        long j11 = unsafe.getLong(obj, j10);
                        y10 = k.y(i15);
                        A = k.A(j11);
                        y13 = A + y10;
                        i13 += y13;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i14 & i9) != 0) {
                        long j12 = unsafe.getLong(obj, j10);
                        y10 = k.y(i15);
                        A = k.A(j12);
                        y13 = A + y10;
                        i13 += y13;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i14 & i9) != 0) {
                        int i18 = unsafe.getInt(obj, j10);
                        y11 = k.y(i15);
                        w8 = k.w(i18);
                        u10 = w8 + y11;
                        i13 += u10;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i14 & i9) != 0) {
                        u10 = k.u(i15);
                        i13 += u10;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i14 & i9) != 0) {
                        u10 = k.t(i15);
                        i13 += u10;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i14 & i9) != 0) {
                        i13 = aa.d.e(i15, 1, i13);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i14 & i9) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof g) {
                            int y14 = k.y(i15);
                            int size = ((g) object).size();
                            f10 = aa.d.f(size, size, y14, i13);
                            i13 = f10;
                            break;
                        } else {
                            y12 = k.y(i15);
                            x10 = k.x((String) object);
                            f10 = x10 + y12 + i13;
                            i13 = f10;
                        }
                    }
                case 9:
                    if ((i14 & i9) != 0) {
                        Object object2 = unsafe.getObject(obj, j10);
                        c1 n10 = n(i12);
                        Class cls = d1.a;
                        int y15 = k.y(i15);
                        int b10 = ((a) object2).b(n10);
                        i13 = aa.d.f(b10, b10, y15, i13);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i14 & i9) != 0) {
                        u10 = k.r(i15, (g) unsafe.getObject(obj, j10));
                        i13 += u10;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i14 & i9) != 0) {
                        int i19 = unsafe.getInt(obj, j10);
                        y11 = k.y(i15);
                        w8 = k.z(i19);
                        u10 = w8 + y11;
                        i13 += u10;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i14 & i9) != 0) {
                        int i20 = unsafe.getInt(obj, j10);
                        y11 = k.y(i15);
                        w8 = k.w(i20);
                        u10 = w8 + y11;
                        i13 += u10;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i14 & i9) != 0) {
                        i13 = aa.d.e(i15, 4, i13);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i9 & i14) != 0) {
                        i13 = aa.d.e(i15, 8, i13);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i14 & i9) != 0) {
                        int i21 = unsafe.getInt(obj, j10);
                        y11 = k.y(i15);
                        w8 = k.z((i21 >> 31) ^ (i21 << 1));
                        u10 = w8 + y11;
                        i13 += u10;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i14 & i9) != 0) {
                        long j13 = unsafe.getLong(obj, j10);
                        y10 = k.y(i15);
                        A = k.A((j13 >> 63) ^ (j13 << 1));
                        y13 = A + y10;
                        i13 += y13;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i14 & i9) != 0) {
                        u10 = k.v(i15, (a) unsafe.getObject(obj, j10), n(i12));
                        i13 += u10;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    u10 = d1.f(i15, (List) unsafe.getObject(obj, j10));
                    i13 += u10;
                    break;
                case 19:
                    u10 = d1.d(i15, (List) unsafe.getObject(obj, j10));
                    i13 += u10;
                    break;
                case 20:
                    u10 = d1.j(i15, (List) unsafe.getObject(obj, j10));
                    i13 += u10;
                    break;
                case 21:
                    u10 = d1.t(i15, (List) unsafe.getObject(obj, j10));
                    i13 += u10;
                    break;
                case 22:
                    u10 = d1.h(i15, (List) unsafe.getObject(obj, j10));
                    i13 += u10;
                    break;
                case 23:
                    u10 = d1.f(i15, (List) unsafe.getObject(obj, j10));
                    i13 += u10;
                    break;
                case 24:
                    u10 = d1.d(i15, (List) unsafe.getObject(obj, j10));
                    i13 += u10;
                    break;
                case 25:
                    List list = (List) unsafe.getObject(obj, j10);
                    Class cls2 = d1.a;
                    int size2 = list.size();
                    y13 = size2 == 0 ? 0 : (k.y(i15) + 1) * size2;
                    i13 += y13;
                    break;
                case 26:
                    u10 = d1.q(i15, (List) unsafe.getObject(obj, j10));
                    i13 += u10;
                    break;
                case 27:
                    u10 = d1.l(i15, (List) unsafe.getObject(obj, j10), n(i12));
                    i13 += u10;
                    break;
                case 28:
                    u10 = d1.a(i15, (List) unsafe.getObject(obj, j10));
                    i13 += u10;
                    break;
                case 29:
                    u10 = d1.r(i15, (List) unsafe.getObject(obj, j10));
                    i13 += u10;
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    u10 = d1.b(i15, (List) unsafe.getObject(obj, j10));
                    i13 += u10;
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    u10 = d1.d(i15, (List) unsafe.getObject(obj, j10));
                    i13 += u10;
                    break;
                case 32:
                    u10 = d1.f(i15, (List) unsafe.getObject(obj, j10));
                    i13 += u10;
                    break;
                case 33:
                    u10 = d1.m(i15, (List) unsafe.getObject(obj, j10));
                    i13 += u10;
                    break;
                case 34:
                    u10 = d1.o(i15, (List) unsafe.getObject(obj, j10));
                    i13 += u10;
                    break;
                case 35:
                    int g10 = d1.g((List) unsafe.getObject(obj, j10));
                    if (g10 > 0) {
                        i13 = aa.d.f(g10, k.y(i15), g10, i13);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int e10 = d1.e((List) unsafe.getObject(obj, j10));
                    if (e10 > 0) {
                        i13 = aa.d.f(e10, k.y(i15), e10, i13);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int k10 = d1.k((List) unsafe.getObject(obj, j10));
                    if (k10 > 0) {
                        i13 = aa.d.f(k10, k.y(i15), k10, i13);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int u11 = d1.u((List) unsafe.getObject(obj, j10));
                    if (u11 > 0) {
                        i13 = aa.d.f(u11, k.y(i15), u11, i13);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    int i22 = d1.i((List) unsafe.getObject(obj, j10));
                    if (i22 > 0) {
                        i13 = aa.d.f(i22, k.y(i15), i22, i13);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    int g11 = d1.g((List) unsafe.getObject(obj, j10));
                    if (g11 > 0) {
                        i13 = aa.d.f(g11, k.y(i15), g11, i13);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    int e11 = d1.e((List) unsafe.getObject(obj, j10));
                    if (e11 > 0) {
                        i13 = aa.d.f(e11, k.y(i15), e11, i13);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    List list2 = (List) unsafe.getObject(obj, j10);
                    Class cls3 = d1.a;
                    int size3 = list2.size();
                    if (size3 > 0) {
                        i13 = aa.d.f(size3, k.y(i15), size3, i13);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    int s10 = d1.s((List) unsafe.getObject(obj, j10));
                    if (s10 > 0) {
                        i13 = aa.d.f(s10, k.y(i15), s10, i13);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    int c10 = d1.c((List) unsafe.getObject(obj, j10));
                    if (c10 > 0) {
                        i13 = aa.d.f(c10, k.y(i15), c10, i13);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    int e12 = d1.e((List) unsafe.getObject(obj, j10));
                    if (e12 > 0) {
                        i13 = aa.d.f(e12, k.y(i15), e12, i13);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    int g12 = d1.g((List) unsafe.getObject(obj, j10));
                    if (g12 > 0) {
                        i13 = aa.d.f(g12, k.y(i15), g12, i13);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    int n11 = d1.n((List) unsafe.getObject(obj, j10));
                    if (n11 > 0) {
                        i13 = aa.d.f(n11, k.y(i15), n11, i13);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int p6 = d1.p((List) unsafe.getObject(obj, j10));
                    if (p6 > 0) {
                        i13 = aa.d.f(p6, k.y(i15), p6, i13);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    List list3 = (List) unsafe.getObject(obj, j10);
                    c1 n12 = n(i12);
                    Class cls4 = d1.a;
                    int size4 = list3.size();
                    if (size4 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 0;
                        for (int i23 = 0; i23 < size4; i23++) {
                            i10 += k.v(i15, (a) list3.get(i23), n12);
                        }
                    }
                    i13 += i10;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Object object3 = unsafe.getObject(obj, j10);
                    Object m10 = m(i12);
                    this.n.getClass();
                    u10 = p0.a(i15, object3, m10);
                    i13 += u10;
                    break;
                case 51:
                    if (r(i15, i12, obj)) {
                        i13 = aa.d.e(i15, 8, i13);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (r(i15, i12, obj)) {
                        i13 = aa.d.e(i15, 4, i13);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (r(i15, i12, obj)) {
                        long A2 = A(obj, j10);
                        y10 = k.y(i15);
                        A = k.A(A2);
                        y13 = A + y10;
                        i13 += y13;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (r(i15, i12, obj)) {
                        long A3 = A(obj, j10);
                        y10 = k.y(i15);
                        A = k.A(A3);
                        y13 = A + y10;
                        i13 += y13;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (r(i15, i12, obj)) {
                        int z10 = z(obj, j10);
                        y11 = k.y(i15);
                        w8 = k.w(z10);
                        u10 = w8 + y11;
                        i13 += u10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (r(i15, i12, obj)) {
                        u10 = k.u(i15);
                        i13 += u10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (r(i15, i12, obj)) {
                        u10 = k.t(i15);
                        i13 += u10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (r(i15, i12, obj)) {
                        i13 = aa.d.e(i15, 1, i13);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!r(i15, i12, obj)) {
                        break;
                    } else {
                        Object object4 = unsafe.getObject(obj, j10);
                        if (object4 instanceof g) {
                            int y16 = k.y(i15);
                            int size5 = ((g) object4).size();
                            f10 = aa.d.f(size5, size5, y16, i13);
                            i13 = f10;
                            break;
                        } else {
                            y12 = k.y(i15);
                            x10 = k.x((String) object4);
                            f10 = x10 + y12 + i13;
                            i13 = f10;
                        }
                    }
                case 60:
                    if (r(i15, i12, obj)) {
                        Object object5 = unsafe.getObject(obj, j10);
                        c1 n13 = n(i12);
                        Class cls5 = d1.a;
                        int y17 = k.y(i15);
                        int b11 = ((a) object5).b(n13);
                        i13 = aa.d.f(b11, b11, y17, i13);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (r(i15, i12, obj)) {
                        u10 = k.r(i15, (g) unsafe.getObject(obj, j10));
                        i13 += u10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (r(i15, i12, obj)) {
                        int z11 = z(obj, j10);
                        y11 = k.y(i15);
                        w8 = k.z(z11);
                        u10 = w8 + y11;
                        i13 += u10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (r(i15, i12, obj)) {
                        int z12 = z(obj, j10);
                        y11 = k.y(i15);
                        w8 = k.w(z12);
                        u10 = w8 + y11;
                        i13 += u10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (r(i15, i12, obj)) {
                        i13 = aa.d.e(i15, 4, i13);
                        break;
                    } else {
                        break;
                    }
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (r(i15, i12, obj)) {
                        i13 = aa.d.e(i15, 8, i13);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (r(i15, i12, obj)) {
                        int z13 = z(obj, j10);
                        y11 = k.y(i15);
                        w8 = k.z((z13 >> 31) ^ (z13 << 1));
                        u10 = w8 + y11;
                        i13 += u10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (r(i15, i12, obj)) {
                        long A4 = A(obj, j10);
                        y10 = k.y(i15);
                        A = k.A((A4 >> 63) ^ (A4 << 1));
                        y13 = A + y10;
                        i13 += y13;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (r(i15, i12, obj)) {
                        u10 = k.v(i15, (a) unsafe.getObject(obj, j10), n(i12));
                        i13 += u10;
                        break;
                    } else {
                        break;
                    }
            }
            i12 += 3;
        }
    }

    public final int p(Object obj) {
        int y10;
        int A;
        int y11;
        int w8;
        int u10;
        int y12;
        int x10;
        int y13;
        int A2;
        int i9;
        Unsafe unsafe = p;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i10 >= iArr.length) {
                this.m.getClass();
                return ((x) obj).unknownFields.a() + i11;
            }
            int H = H(i10);
            int G = G(H);
            int i12 = iArr[i10];
            long j10 = H & 1048575;
            if (G >= s.b.a && G <= s.c.a) {
                int i13 = iArr[i10 + 2];
            }
            switch (G) {
                case 0:
                    if (q(i10, obj)) {
                        i11 = aa.d.e(i12, 8, i11);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (q(i10, obj)) {
                        i11 = aa.d.e(i12, 4, i11);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (q(i10, obj)) {
                        long h = s1.d.h(obj, j10);
                        y10 = k.y(i12);
                        A = k.A(h);
                        u10 = A + y10;
                        i11 += u10;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (q(i10, obj)) {
                        long h10 = s1.d.h(obj, j10);
                        y10 = k.y(i12);
                        A = k.A(h10);
                        u10 = A + y10;
                        i11 += u10;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (q(i10, obj)) {
                        int g10 = s1.d.g(obj, j10);
                        y11 = k.y(i12);
                        w8 = k.w(g10);
                        u10 = w8 + y11;
                        i11 += u10;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (q(i10, obj)) {
                        u10 = k.u(i12);
                        i11 += u10;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (q(i10, obj)) {
                        u10 = k.t(i12);
                        i11 += u10;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (q(i10, obj)) {
                        i11 = aa.d.e(i12, 1, i11);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (q(i10, obj)) {
                        Object i14 = s1.d.i(obj, j10);
                        if (i14 instanceof g) {
                            int y14 = k.y(i12);
                            int size = ((g) i14).size();
                            i11 = aa.d.f(size, size, y14, i11);
                            break;
                        } else {
                            y12 = k.y(i12);
                            x10 = k.x((String) i14);
                            i11 = x10 + y12 + i11;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (q(i10, obj)) {
                        Object i15 = s1.d.i(obj, j10);
                        c1 n10 = n(i10);
                        Class cls = d1.a;
                        int y15 = k.y(i12);
                        int b10 = ((a) i15).b(n10);
                        i11 = aa.d.f(b10, b10, y15, i11);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (q(i10, obj)) {
                        u10 = k.r(i12, (g) s1.d.i(obj, j10));
                        i11 += u10;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (q(i10, obj)) {
                        int g11 = s1.d.g(obj, j10);
                        y11 = k.y(i12);
                        w8 = k.z(g11);
                        u10 = w8 + y11;
                        i11 += u10;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (q(i10, obj)) {
                        int g12 = s1.d.g(obj, j10);
                        y11 = k.y(i12);
                        w8 = k.w(g12);
                        u10 = w8 + y11;
                        i11 += u10;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (q(i10, obj)) {
                        i11 = aa.d.e(i12, 4, i11);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (q(i10, obj)) {
                        i11 = aa.d.e(i12, 8, i11);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (q(i10, obj)) {
                        int g13 = s1.d.g(obj, j10);
                        y11 = k.y(i12);
                        w8 = k.z((g13 >> 31) ^ (g13 << 1));
                        u10 = w8 + y11;
                        i11 += u10;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (q(i10, obj)) {
                        long h11 = s1.d.h(obj, j10);
                        y13 = k.y(i12);
                        A2 = k.A((h11 >> 63) ^ (h11 << 1));
                        u10 = A2 + y13;
                        i11 += u10;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (q(i10, obj)) {
                        u10 = k.v(i12, (a) s1.d.i(obj, j10), n(i10));
                        i11 += u10;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    u10 = d1.f(i12, s(obj, j10));
                    i11 += u10;
                    break;
                case 19:
                    u10 = d1.d(i12, s(obj, j10));
                    i11 += u10;
                    break;
                case 20:
                    u10 = d1.j(i12, s(obj, j10));
                    i11 += u10;
                    break;
                case 21:
                    u10 = d1.t(i12, s(obj, j10));
                    i11 += u10;
                    break;
                case 22:
                    u10 = d1.h(i12, s(obj, j10));
                    i11 += u10;
                    break;
                case 23:
                    u10 = d1.f(i12, s(obj, j10));
                    i11 += u10;
                    break;
                case 24:
                    u10 = d1.d(i12, s(obj, j10));
                    i11 += u10;
                    break;
                case 25:
                    List s10 = s(obj, j10);
                    Class cls2 = d1.a;
                    int size2 = s10.size();
                    i11 += size2 == 0 ? 0 : (k.y(i12) + 1) * size2;
                    break;
                case 26:
                    u10 = d1.q(i12, s(obj, j10));
                    i11 += u10;
                    break;
                case 27:
                    u10 = d1.l(i12, s(obj, j10), n(i10));
                    i11 += u10;
                    break;
                case 28:
                    u10 = d1.a(i12, s(obj, j10));
                    i11 += u10;
                    break;
                case 29:
                    u10 = d1.r(i12, s(obj, j10));
                    i11 += u10;
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    u10 = d1.b(i12, s(obj, j10));
                    i11 += u10;
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    u10 = d1.d(i12, s(obj, j10));
                    i11 += u10;
                    break;
                case 32:
                    u10 = d1.f(i12, s(obj, j10));
                    i11 += u10;
                    break;
                case 33:
                    u10 = d1.m(i12, s(obj, j10));
                    i11 += u10;
                    break;
                case 34:
                    u10 = d1.o(i12, s(obj, j10));
                    i11 += u10;
                    break;
                case 35:
                    int g14 = d1.g((List) unsafe.getObject(obj, j10));
                    if (g14 > 0) {
                        i11 = aa.d.f(g14, k.y(i12), g14, i11);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int e10 = d1.e((List) unsafe.getObject(obj, j10));
                    if (e10 > 0) {
                        i11 = aa.d.f(e10, k.y(i12), e10, i11);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int k10 = d1.k((List) unsafe.getObject(obj, j10));
                    if (k10 > 0) {
                        i11 = aa.d.f(k10, k.y(i12), k10, i11);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int u11 = d1.u((List) unsafe.getObject(obj, j10));
                    if (u11 > 0) {
                        i11 = aa.d.f(u11, k.y(i12), u11, i11);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    int i16 = d1.i((List) unsafe.getObject(obj, j10));
                    if (i16 > 0) {
                        i11 = aa.d.f(i16, k.y(i12), i16, i11);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    int g15 = d1.g((List) unsafe.getObject(obj, j10));
                    if (g15 > 0) {
                        i11 = aa.d.f(g15, k.y(i12), g15, i11);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    int e11 = d1.e((List) unsafe.getObject(obj, j10));
                    if (e11 > 0) {
                        i11 = aa.d.f(e11, k.y(i12), e11, i11);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    List list = (List) unsafe.getObject(obj, j10);
                    Class cls3 = d1.a;
                    int size3 = list.size();
                    if (size3 > 0) {
                        i11 = aa.d.f(size3, k.y(i12), size3, i11);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    int s11 = d1.s((List) unsafe.getObject(obj, j10));
                    if (s11 > 0) {
                        i11 = aa.d.f(s11, k.y(i12), s11, i11);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    int c10 = d1.c((List) unsafe.getObject(obj, j10));
                    if (c10 > 0) {
                        i11 = aa.d.f(c10, k.y(i12), c10, i11);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    int e12 = d1.e((List) unsafe.getObject(obj, j10));
                    if (e12 > 0) {
                        i11 = aa.d.f(e12, k.y(i12), e12, i11);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    int g16 = d1.g((List) unsafe.getObject(obj, j10));
                    if (g16 > 0) {
                        i11 = aa.d.f(g16, k.y(i12), g16, i11);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    int n11 = d1.n((List) unsafe.getObject(obj, j10));
                    if (n11 > 0) {
                        i11 = aa.d.f(n11, k.y(i12), n11, i11);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int p6 = d1.p((List) unsafe.getObject(obj, j10));
                    if (p6 > 0) {
                        i11 = aa.d.f(p6, k.y(i12), p6, i11);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    List s12 = s(obj, j10);
                    c1 n12 = n(i10);
                    Class cls4 = d1.a;
                    int size4 = s12.size();
                    if (size4 == 0) {
                        i9 = 0;
                    } else {
                        i9 = 0;
                        for (int i17 = 0; i17 < size4; i17++) {
                            i9 += k.v(i12, (a) s12.get(i17), n12);
                        }
                    }
                    i11 += i9;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Object i18 = s1.d.i(obj, j10);
                    Object m10 = m(i10);
                    this.n.getClass();
                    u10 = p0.a(i12, i18, m10);
                    i11 += u10;
                    break;
                case 51:
                    if (r(i12, i10, obj)) {
                        i11 = aa.d.e(i12, 8, i11);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (r(i12, i10, obj)) {
                        i11 = aa.d.e(i12, 4, i11);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (r(i12, i10, obj)) {
                        long A3 = A(obj, j10);
                        y10 = k.y(i12);
                        A = k.A(A3);
                        u10 = A + y10;
                        i11 += u10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (r(i12, i10, obj)) {
                        long A4 = A(obj, j10);
                        y10 = k.y(i12);
                        A = k.A(A4);
                        u10 = A + y10;
                        i11 += u10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (r(i12, i10, obj)) {
                        int z10 = z(obj, j10);
                        y11 = k.y(i12);
                        w8 = k.w(z10);
                        u10 = w8 + y11;
                        i11 += u10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (r(i12, i10, obj)) {
                        u10 = k.u(i12);
                        i11 += u10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (r(i12, i10, obj)) {
                        u10 = k.t(i12);
                        i11 += u10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (r(i12, i10, obj)) {
                        i11 = aa.d.e(i12, 1, i11);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (r(i12, i10, obj)) {
                        Object i19 = s1.d.i(obj, j10);
                        if (i19 instanceof g) {
                            int y16 = k.y(i12);
                            int size5 = ((g) i19).size();
                            i11 = aa.d.f(size5, size5, y16, i11);
                            break;
                        } else {
                            y12 = k.y(i12);
                            x10 = k.x((String) i19);
                            i11 = x10 + y12 + i11;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (r(i12, i10, obj)) {
                        Object i20 = s1.d.i(obj, j10);
                        c1 n13 = n(i10);
                        Class cls5 = d1.a;
                        int y17 = k.y(i12);
                        int b11 = ((a) i20).b(n13);
                        i11 = aa.d.f(b11, b11, y17, i11);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (r(i12, i10, obj)) {
                        u10 = k.r(i12, (g) s1.d.i(obj, j10));
                        i11 += u10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (r(i12, i10, obj)) {
                        int z11 = z(obj, j10);
                        y11 = k.y(i12);
                        w8 = k.z(z11);
                        u10 = w8 + y11;
                        i11 += u10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (r(i12, i10, obj)) {
                        int z12 = z(obj, j10);
                        y11 = k.y(i12);
                        w8 = k.w(z12);
                        u10 = w8 + y11;
                        i11 += u10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (r(i12, i10, obj)) {
                        i11 = aa.d.e(i12, 4, i11);
                        break;
                    } else {
                        break;
                    }
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (r(i12, i10, obj)) {
                        i11 = aa.d.e(i12, 8, i11);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (r(i12, i10, obj)) {
                        int z13 = z(obj, j10);
                        y11 = k.y(i12);
                        w8 = k.z((z13 >> 31) ^ (z13 << 1));
                        u10 = w8 + y11;
                        i11 += u10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (r(i12, i10, obj)) {
                        long A5 = A(obj, j10);
                        y13 = k.y(i12);
                        A2 = k.A((A5 >> 63) ^ (A5 << 1));
                        u10 = A2 + y13;
                        i11 += u10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (r(i12, i10, obj)) {
                        u10 = k.v(i12, (a) s1.d.i(obj, j10), n(i10));
                        i11 += u10;
                        break;
                    } else {
                        break;
                    }
            }
            i10 += 3;
        }
    }

    public final boolean q(int i9, Object obj) {
        if (this.g) {
            int H = H(i9);
            long j10 = H & 1048575;
            switch (G(H)) {
                case 0:
                    if (s1.d.e(obj, j10) == 0.0d) {
                        return false;
                    }
                    break;
                case 1:
                    if (s1.d.f(obj, j10) == 0.0f) {
                        return false;
                    }
                    break;
                case 2:
                    if (s1.d.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (s1.d.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (s1.d.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (s1.d.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (s1.d.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return s1.d.c(obj, j10);
                case 8:
                    Object i10 = s1.d.i(obj, j10);
                    if (i10 instanceof String) {
                        return !((String) i10).isEmpty();
                    }
                    if (i10 instanceof g) {
                        return !g.c.equals(i10);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (s1.d.i(obj, j10) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !g.c.equals(s1.d.i(obj, j10));
                case 11:
                    if (s1.d.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (s1.d.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (s1.d.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (s1.d.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (s1.d.g(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (s1.d.h(obj, j10) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (s1.d.i(obj, j10) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((s1.d.g(obj, r6 & 1048575) & (1 << (this.a[i9 + 2] >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean r(int i9, int i10, Object obj) {
        return s1.d.g(obj, (long) (this.a[i10 + 2] & 1048575)) == i9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        r10.put(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        r0.d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(Object obj, int i9, Object obj2, n nVar, i iVar) {
        long H = H(i9) & 1048575;
        Object i10 = s1.d.i(obj, H);
        p0 p0Var = this.n;
        if (i10 == null) {
            p0Var.getClass();
            i10 = o0.b.b();
            s1.o(obj, H, i10);
        } else {
            p0Var.getClass();
            if (!((o0) i10).a) {
                o0 b10 = o0.b.b();
                p0.b(b10, i10);
                s1.o(obj, H, b10);
                i10 = b10;
            }
        }
        p0Var.getClass();
        o0 o0Var = (o0) i10;
        m0 m0Var = ((n0) obj2).a;
        iVar.S(2);
        h hVar = (h) iVar.d;
        int e10 = hVar.e(hVar.A());
        Object obj3 = m0Var.c;
        Object obj4 = "";
        Object obj5 = obj3;
        while (true) {
            try {
                int c10 = iVar.c();
                if (c10 == Integer.MAX_VALUE || hVar.c()) {
                    break;
                }
                if (c10 == 1) {
                    obj4 = iVar.m(m0Var.a, null, null);
                } else if (c10 != 2) {
                    try {
                        if (!iVar.T()) {
                            throw new c0("Unable to parse map entry.");
                        }
                    } catch (b0 unused) {
                        if (!iVar.T()) {
                            throw new c0("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj5 = iVar.m(m0Var.b, obj3.getClass(), nVar);
                }
            } catch (Throwable th) {
                hVar.d(e10);
                throw th;
            }
        }
    }

    public final void u(int i9, Object obj, Object obj2) {
        long H = H(i9) & 1048575;
        if (q(i9, obj2)) {
            r1 r1Var = s1.d;
            Object i10 = r1Var.i(obj, H);
            Object i11 = r1Var.i(obj2, H);
            if (i10 != null && i11 != null) {
                s1.o(obj, H, a0.c(i10, i11));
                E(i9, obj);
            } else if (i11 != null) {
                s1.o(obj, H, i11);
                E(i9, obj);
            }
        }
    }

    public final void v(int i9, Object obj, Object obj2) {
        int H = H(i9);
        int i10 = this.a[i9];
        long j10 = H & 1048575;
        if (r(i10, i9, obj2)) {
            r1 r1Var = s1.d;
            Object i11 = r1Var.i(obj, j10);
            Object i12 = r1Var.i(obj2, j10);
            if (i11 != null && i12 != null) {
                s1.o(obj, j10, a0.c(i11, i12));
                F(i10, i9, obj);
            } else if (i12 != null) {
                s1.o(obj, j10, i12);
                F(i10, i9, obj);
            }
        }
    }
}
