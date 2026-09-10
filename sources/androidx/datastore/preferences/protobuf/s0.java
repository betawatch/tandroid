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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class s0 implements b1 {
    public static final int[] o = new int[0];
    public static final Unsafe p = r1.i();
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
    public final u0 k;
    public final h0 l;
    public final j1 m;
    public final o0 n;

    public s0(int[] iArr, Object[] objArr, int i10, int i11, a aVar, boolean z10, int[] iArr2, int i12, int i13, u0 u0Var, h0 h0Var, j1 j1Var, n nVar, o0 o0Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i10;
        this.d = i11;
        this.f = aVar instanceof w;
        this.g = z10;
        this.h = iArr2;
        this.i = i12;
        this.j = i13;
        this.k = u0Var;
        this.l = h0Var;
        this.m = j1Var;
        this.e = aVar;
        this.n = o0Var;
    }

    public static long A(Object obj, long j3) {
        return ((Long) r1.d.i(obj, j3)).longValue();
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
            StringBuilder v = a4.a.v("Field ", str, " for ");
            v.append(cls.getName());
            v.append(" not found. Known fields are ");
            v.append(Arrays.toString(declaredFields));
            throw new RuntimeException(v.toString());
        }
    }

    public static int G(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static void K(int i10, Object obj, k0 k0Var) {
        if (!(obj instanceof String)) {
            k0Var.a(i10, (g) obj);
        } else {
            ((j) k0Var.a).P(i10, (String) obj);
        }
    }

    public static List s(Object obj, long j3) {
        return (List) r1.d.i(obj, j3);
    }

    public static s0 w(a1 a1Var, u0 u0Var, h0 h0Var, j1 j1Var, n nVar, o0 o0Var) {
        if (a1Var instanceof a1) {
            return x(a1Var, u0Var, h0Var, j1Var, nVar, o0Var);
        }
        a1Var.getClass();
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
    public static s0 x(a1 a1Var, u0 u0Var, h0 h0Var, j1 j1Var, n nVar, o0 o0Var) {
        int i10;
        int charAt;
        int charAt2;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        int i15;
        int i16;
        char charAt3;
        int i17;
        char charAt4;
        int i18;
        char charAt5;
        int i19;
        char charAt6;
        int i20;
        char charAt7;
        int i21;
        char charAt8;
        int i22;
        char charAt9;
        int i23;
        char charAt10;
        int[] iArr2;
        int i24;
        int i25;
        int i26;
        boolean z10;
        int i27;
        int objectFieldOffset;
        int i28;
        int i29;
        int i30;
        Field D;
        char charAt11;
        int i31;
        int i32;
        Object obj;
        Field D2;
        Object obj2;
        Field D3;
        int i33;
        char charAt12;
        int i34;
        char charAt13;
        int i35;
        int i36;
        char charAt14;
        int i37;
        char charAt15;
        char charAt16;
        int i38 = 0;
        boolean z11 = (a1Var.d & 1) != 1;
        String str = a1Var.b;
        int length = str.length();
        int charAt17 = str.charAt(0);
        if (charAt17 >= 55296) {
            int i39 = charAt17 & 8191;
            int i40 = 1;
            int i41 = 13;
            while (true) {
                i10 = i40 + 1;
                charAt16 = str.charAt(i40);
                if (charAt16 < 55296) {
                    break;
                }
                i39 |= (charAt16 & 8191) << i41;
                i41 += 13;
                i40 = i10;
            }
            charAt17 = i39 | (charAt16 << i41);
        } else {
            i10 = 1;
        }
        int i42 = i10 + 1;
        int charAt18 = str.charAt(i10);
        if (charAt18 >= 55296) {
            int i43 = charAt18 & 8191;
            int i44 = 13;
            while (true) {
                i37 = i42 + 1;
                charAt15 = str.charAt(i42);
                if (charAt15 < 55296) {
                    break;
                }
                i43 |= (charAt15 & 8191) << i44;
                i44 += 13;
                i42 = i37;
            }
            charAt18 = i43 | (charAt15 << i44);
            i42 = i37;
        }
        if (charAt18 == 0) {
            iArr = o;
            i13 = 0;
            i14 = 0;
            i15 = 0;
            charAt = 0;
            charAt2 = 0;
            i12 = 0;
        } else {
            int i45 = i42 + 1;
            int charAt19 = str.charAt(i42);
            if (charAt19 >= 55296) {
                int i46 = charAt19 & 8191;
                int i47 = 13;
                while (true) {
                    i23 = i45 + 1;
                    charAt10 = str.charAt(i45);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i46 |= (charAt10 & 8191) << i47;
                    i47 += 13;
                    i45 = i23;
                }
                charAt19 = i46 | (charAt10 << i47);
                i45 = i23;
            }
            int i48 = i45 + 1;
            int charAt20 = str.charAt(i45);
            if (charAt20 >= 55296) {
                int i49 = charAt20 & 8191;
                int i50 = 13;
                while (true) {
                    i22 = i48 + 1;
                    charAt9 = str.charAt(i48);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i49 |= (charAt9 & 8191) << i50;
                    i50 += 13;
                    i48 = i22;
                }
                charAt20 = i49 | (charAt9 << i50);
                i48 = i22;
            }
            int i51 = i48 + 1;
            int charAt21 = str.charAt(i48);
            if (charAt21 >= 55296) {
                int i52 = charAt21 & 8191;
                int i53 = 13;
                while (true) {
                    i21 = i51 + 1;
                    charAt8 = str.charAt(i51);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i52 |= (charAt8 & 8191) << i53;
                    i53 += 13;
                    i51 = i21;
                }
                charAt21 = i52 | (charAt8 << i53);
                i51 = i21;
            }
            int i54 = i51 + 1;
            int charAt22 = str.charAt(i51);
            if (charAt22 >= 55296) {
                int i55 = charAt22 & 8191;
                int i56 = 13;
                while (true) {
                    i20 = i54 + 1;
                    charAt7 = str.charAt(i54);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i55 |= (charAt7 & 8191) << i56;
                    i56 += 13;
                    i54 = i20;
                }
                charAt22 = i55 | (charAt7 << i56);
                i54 = i20;
            }
            int i57 = i54 + 1;
            charAt = str.charAt(i54);
            if (charAt >= 55296) {
                int i58 = charAt & 8191;
                int i59 = 13;
                while (true) {
                    i19 = i57 + 1;
                    charAt6 = str.charAt(i57);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i58 |= (charAt6 & 8191) << i59;
                    i59 += 13;
                    i57 = i19;
                }
                charAt = i58 | (charAt6 << i59);
                i57 = i19;
            }
            int i60 = i57 + 1;
            charAt2 = str.charAt(i57);
            if (charAt2 >= 55296) {
                int i61 = charAt2 & 8191;
                int i62 = 13;
                while (true) {
                    i18 = i60 + 1;
                    charAt5 = str.charAt(i60);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i61 |= (charAt5 & 8191) << i62;
                    i62 += 13;
                    i60 = i18;
                }
                charAt2 = i61 | (charAt5 << i62);
                i60 = i18;
            }
            int i63 = i60 + 1;
            int charAt23 = str.charAt(i60);
            if (charAt23 >= 55296) {
                int i64 = charAt23 & 8191;
                int i65 = i63;
                int i66 = 13;
                while (true) {
                    i17 = i65 + 1;
                    charAt4 = str.charAt(i65);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i64 |= (charAt4 & 8191) << i66;
                    i66 += 13;
                    i65 = i17;
                }
                charAt23 = i64 | (charAt4 << i66);
                i11 = i17;
            } else {
                i11 = i63;
            }
            int i67 = i11 + 1;
            int charAt24 = str.charAt(i11);
            if (charAt24 >= 55296) {
                int i68 = charAt24 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i16 = i69 + 1;
                    charAt3 = str.charAt(i69);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i68 |= (charAt3 & 8191) << i70;
                    i70 += 13;
                    i69 = i16;
                }
                charAt24 = i68 | (charAt3 << i70);
                i67 = i16;
            }
            int[] iArr3 = new int[charAt24 + charAt2 + charAt23];
            i12 = (charAt19 * 2) + charAt20;
            int i71 = charAt21;
            iArr = iArr3;
            i13 = i71;
            i14 = charAt22;
            i15 = charAt24;
            i38 = charAt19;
            i42 = i67;
        }
        Unsafe unsafe = p;
        Object[] objArr = a1Var.c;
        int i72 = i38;
        Class<?> cls = a1Var.a.getClass();
        int i73 = charAt17;
        int[] iArr4 = new int[charAt * 3];
        Object[] objArr2 = new Object[charAt * 2];
        int i74 = charAt2 + i15;
        int i75 = i15;
        int i76 = i74;
        int i77 = 0;
        int i78 = 0;
        while (i42 < length) {
            int i79 = i42 + 1;
            int charAt25 = str.charAt(i42);
            int i80 = length;
            if (charAt25 >= 55296) {
                int i81 = charAt25 & 8191;
                int i82 = i79;
                int i83 = 13;
                while (true) {
                    i36 = i82 + 1;
                    charAt14 = str.charAt(i82);
                    iArr2 = iArr4;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i81 |= (charAt14 & 8191) << i83;
                    i83 += 13;
                    i82 = i36;
                    iArr4 = iArr2;
                }
                charAt25 = i81 | (charAt14 << i83);
                i24 = i36;
            } else {
                iArr2 = iArr4;
                i24 = i79;
            }
            int i84 = i24 + 1;
            int charAt26 = str.charAt(i24);
            if (charAt26 >= 55296) {
                int i85 = charAt26 & 8191;
                int i86 = i84;
                int i87 = 13;
                while (true) {
                    i34 = i86 + 1;
                    charAt13 = str.charAt(i86);
                    i35 = i85;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i85 = i35 | ((charAt13 & 8191) << i87);
                    i87 += 13;
                    i86 = i34;
                }
                charAt26 = i35 | (charAt13 << i87);
                i25 = i34;
            } else {
                i25 = i84;
            }
            int i88 = i13;
            int i89 = charAt26 & 255;
            Object[] objArr3 = objArr;
            if ((charAt26 & 1024) != 0) {
                iArr[i77] = i78;
                i77++;
            }
            int i90 = charAt25;
            if (i89 >= 51) {
                int i91 = i25 + 1;
                int charAt27 = str.charAt(i25);
                char c10 = CharacterCompat.MIN_HIGH_SURROGATE;
                if (charAt27 >= 55296) {
                    int i92 = charAt27 & 8191;
                    int i93 = 13;
                    while (true) {
                        i33 = i91 + 1;
                        charAt12 = str.charAt(i91);
                        if (charAt12 < c10) {
                            break;
                        }
                        i92 |= (charAt12 & 8191) << i93;
                        i93 += 13;
                        i91 = i33;
                        c10 = CharacterCompat.MIN_HIGH_SURROGATE;
                    }
                    charAt27 = i92 | (charAt12 << i93);
                    i91 = i33;
                }
                int i94 = i89 - 51;
                int i95 = charAt27;
                if (i94 == 9 || i94 == 17) {
                    i32 = i12 + 1;
                    objArr2[((i78 / 3) * 2) + 1] = objArr3[i12];
                } else {
                    if (i94 == 12 && (i73 & 1) == 1) {
                        i32 = i12 + 1;
                        objArr2[((i78 / 3) * 2) + 1] = objArr3[i12];
                    }
                    int i96 = i95 * 2;
                    obj = objArr3[i96];
                    if (obj instanceof Field) {
                        D2 = D(cls, (String) obj);
                        objArr3[i96] = D2;
                    } else {
                        D2 = (Field) obj;
                    }
                    int i97 = i91;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(D2);
                    int i98 = i96 + 1;
                    obj2 = objArr3[i98];
                    if (obj2 instanceof Field) {
                        D3 = D(cls, (String) obj2);
                        objArr3[i98] = D3;
                    } else {
                        D3 = (Field) obj2;
                    }
                    i27 = i12;
                    objectFieldOffset = objectFieldOffset2;
                    z10 = z11;
                    i28 = i97;
                    i30 = (int) unsafe.objectFieldOffset(D3);
                    i26 = i14;
                    i29 = 0;
                }
                i12 = i32;
                int i962 = i95 * 2;
                obj = objArr3[i962];
                if (obj instanceof Field) {
                }
                int i972 = i91;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(D2);
                int i982 = i962 + 1;
                obj2 = objArr3[i982];
                if (obj2 instanceof Field) {
                }
                i27 = i12;
                objectFieldOffset = objectFieldOffset22;
                z10 = z11;
                i28 = i972;
                i30 = (int) unsafe.objectFieldOffset(D3);
                i26 = i14;
                i29 = 0;
            } else {
                int i99 = i12 + 1;
                Field D4 = D(cls, (String) objArr3[i12]);
                if (i89 == 9 || i89 == 17) {
                    i26 = i14;
                    objArr2[((i78 / 3) * 2) + 1] = D4.getType();
                } else {
                    if (i89 == 27 || i89 == 49) {
                        i26 = i14;
                        i31 = i12 + 2;
                        objArr2[((i78 / 3) * 2) + 1] = objArr3[i99];
                    } else if (i89 == 12 || i89 == 30 || i89 == 44) {
                        i26 = i14;
                        if ((i73 & 1) == 1) {
                            i31 = i12 + 2;
                            objArr2[((i78 / 3) * 2) + 1] = objArr3[i99];
                        }
                    } else if (i89 == 50) {
                        int i100 = i75 + 1;
                        iArr[i75] = i78;
                        int i101 = (i78 / 3) * 2;
                        int i102 = i12 + 2;
                        objArr2[i101] = objArr3[i99];
                        if ((charAt26 & 2048) != 0) {
                            i27 = i12 + 3;
                            objArr2[i101 + 1] = objArr3[i102];
                            i26 = i14;
                            z10 = z11;
                            i75 = i100;
                        } else {
                            z10 = z11;
                            i27 = i102;
                            i75 = i100;
                            i26 = i14;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(D4);
                        if ((i73 & 1) == 1 || i89 > 17) {
                            i28 = i25;
                            i29 = 0;
                            i30 = 0;
                        } else {
                            int i103 = i25 + 1;
                            int charAt28 = str.charAt(i25);
                            if (charAt28 >= 55296) {
                                int i104 = charAt28 & 8191;
                                int i105 = 13;
                                while (true) {
                                    i28 = i103 + 1;
                                    charAt11 = str.charAt(i103);
                                    if (charAt11 < 55296) {
                                        break;
                                    }
                                    i104 |= (charAt11 & 8191) << i105;
                                    i105 += 13;
                                    i103 = i28;
                                }
                                charAt28 = i104 | (charAt11 << i105);
                            } else {
                                i28 = i103;
                            }
                            int i106 = (charAt28 / 32) + (i72 * 2);
                            Object obj3 = objArr3[i106];
                            if (obj3 instanceof Field) {
                                D = (Field) obj3;
                            } else {
                                D = D(cls, (String) obj3);
                                objArr3[i106] = D;
                            }
                            i30 = (int) unsafe.objectFieldOffset(D);
                            i29 = charAt28 % 32;
                        }
                        if (i89 >= 18 && i89 <= 49) {
                            iArr[i76] = objectFieldOffset;
                            i76++;
                        }
                    } else {
                        i26 = i14;
                    }
                    i27 = i31;
                    z10 = z11;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(D4);
                    if ((i73 & 1) == 1) {
                    }
                    i28 = i25;
                    i29 = 0;
                    i30 = 0;
                    if (i89 >= 18) {
                        iArr[i76] = objectFieldOffset;
                        i76++;
                    }
                }
                z10 = z11;
                i27 = i99;
                objectFieldOffset = (int) unsafe.objectFieldOffset(D4);
                if ((i73 & 1) == 1) {
                }
                i28 = i25;
                i29 = 0;
                i30 = 0;
                if (i89 >= 18) {
                }
            }
            int i107 = i78 + 1;
            iArr2[i78] = i90;
            int i108 = i78 + 2;
            String str2 = str;
            iArr2[i107] = ((charAt26 & 512) != 0 ? TLObject.FLAG_29 : 0) | ((charAt26 & 256) != 0 ? TLObject.FLAG_28 : 0) | (i89 << 20) | objectFieldOffset;
            i78 += 3;
            iArr2[i108] = (i29 << 20) | i30;
            z11 = z10;
            i13 = i88;
            length = i80;
            iArr4 = iArr2;
            i14 = i26;
            i42 = i28;
            str = str2;
            i12 = i27;
            objArr = objArr3;
        }
        return new s0(iArr4, objArr2, i13, i14, a1Var.a, z11, iArr, i15, i74, u0Var, h0Var, j1Var, nVar, o0Var);
    }

    public static long y(int i10) {
        return i10 & 1048575;
    }

    public static int z(Object obj, long j3) {
        return ((Integer) r1.d.i(obj, j3)).intValue();
    }

    public final void B(Object obj, int i10, a0.h hVar, b1 b1Var, m mVar) {
        int z10;
        List c10 = this.l.c(obj, i10 & 1048575);
        h hVar2 = (h) hVar.c;
        int i11 = hVar.a;
        if ((i11 & 7) != 2) {
            throw b0.b();
        }
        do {
            c10.add(hVar.B(b1Var, mVar));
            if (hVar2.c() || hVar.d != 0) {
                return;
            } else {
                z10 = hVar2.z();
            }
        } while (z10 == i11);
        hVar.d = z10;
    }

    public final void C(Object obj, int i10, a0.h hVar) {
        if ((536870912 & i10) != 0) {
            r1.o(obj, i10 & 1048575, hVar.N());
        } else if (this.f) {
            r1.o(obj, i10 & 1048575, hVar.L());
        } else {
            r1.o(obj, i10 & 1048575, hVar.h());
        }
    }

    public final void E(int i10, Object obj) {
        if (this.g) {
            return;
        }
        int i11 = this.a[i10 + 2];
        long j3 = i11 & 1048575;
        r1.m(j3, obj, r1.d.g(obj, j3) | (1 << (i11 >>> 20)));
    }

    public final void F(int i10, int i11, Object obj) {
        r1.m(this.a[i11 + 2] & 1048575, obj, i10);
    }

    public final int H(int i10) {
        return this.a[i10 + 1];
    }

    public final void I(Object obj, k0 k0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr = this.a;
        int length = iArr.length;
        Unsafe unsafe = p;
        int i14 = -1;
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16 = i13 + 3) {
            int H = H(i16);
            int i17 = iArr[i16];
            int G = G(H);
            if (this.g || G > 17) {
                i10 = i16;
                i11 = 1048575;
                i12 = 0;
            } else {
                int i18 = iArr[i16 + 2];
                i11 = 1048575;
                int i19 = i18 & 1048575;
                i10 = i16;
                if (i19 != i14) {
                    i15 = unsafe.getInt(obj, i19);
                    i14 = i19;
                }
                i12 = 1 << (i18 >>> 20);
            }
            long j3 = H & i11;
            switch (G) {
                case 0:
                    i13 = i10;
                    if ((i12 & i15) == 0) {
                        break;
                    } else {
                        double e = r1.d.e(obj, j3);
                        j jVar = (j) k0Var.a;
                        jVar.getClass();
                        jVar.K(i17, Double.doubleToRawLongBits(e));
                        continue;
                    }
                case 1:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        float f7 = r1.d.f(obj, j3);
                        j jVar2 = (j) k0Var.a;
                        jVar2.getClass();
                        jVar2.I(i17, Float.floatToRawIntBits(f7));
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        ((j) k0Var.a).U(i17, unsafe.getLong(obj, j3));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        ((j) k0Var.a).U(i17, unsafe.getLong(obj, j3));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        ((j) k0Var.a).M(i17, unsafe.getInt(obj, j3));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        ((j) k0Var.a).K(i17, unsafe.getLong(obj, j3));
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        ((j) k0Var.a).I(i17, unsafe.getInt(obj, j3));
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        ((j) k0Var.a).F(i17, r1.d.c(obj, j3));
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        K(i17, unsafe.getObject(obj, j3), k0Var);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        ((j) k0Var.a).O(i17, (a) unsafe.getObject(obj, j3), n(i13));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        k0Var.a(i17, (g) unsafe.getObject(obj, j3));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        ((j) k0Var.a).S(i17, unsafe.getInt(obj, j3));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        ((j) k0Var.a).M(i17, unsafe.getInt(obj, j3));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        ((j) k0Var.a).I(i17, unsafe.getInt(obj, j3));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        ((j) k0Var.a).K(i17, unsafe.getLong(obj, j3));
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        int i20 = unsafe.getInt(obj, j3);
                        ((j) k0Var.a).S(i17, (i20 >> 31) ^ (i20 << 1));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        long j10 = unsafe.getLong(obj, j3);
                        ((j) k0Var.a).U(i17, (j10 >> 63) ^ (j10 << 1));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    i13 = i10;
                    if ((i12 & i15) != 0) {
                        k0Var.b(i17, unsafe.getObject(obj, j3), n(i13));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    i13 = i10;
                    c1.A(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, false);
                    continue;
                case 19:
                    i13 = i10;
                    c1.E(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, false);
                    continue;
                case 20:
                    i13 = i10;
                    c1.H(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, false);
                    continue;
                case 21:
                    i13 = i10;
                    c1.P(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, false);
                    continue;
                case 22:
                    i13 = i10;
                    c1.G(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, false);
                    continue;
                case 23:
                    i13 = i10;
                    c1.D(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, false);
                    continue;
                case 24:
                    i13 = i10;
                    c1.C(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, false);
                    continue;
                case 25:
                    i13 = i10;
                    c1.y(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, false);
                    continue;
                case 26:
                    i13 = i10;
                    c1.N(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var);
                    break;
                case 27:
                    i13 = i10;
                    c1.I(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, n(i13));
                    break;
                case 28:
                    i13 = i10;
                    c1.z(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var);
                    break;
                case 29:
                    i13 = i10;
                    c1.O(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, false);
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    i13 = i10;
                    c1.B(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, false);
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    i13 = i10;
                    c1.J(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, false);
                    break;
                case 32:
                    i13 = i10;
                    c1.K(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, false);
                    break;
                case 33:
                    i13 = i10;
                    c1.L(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, false);
                    break;
                case 34:
                    i13 = i10;
                    c1.M(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, false);
                    break;
                case 35:
                    i13 = i10;
                    c1.A(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, true);
                    break;
                case 36:
                    i13 = i10;
                    c1.E(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, true);
                    break;
                case 37:
                    i13 = i10;
                    c1.H(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, true);
                    break;
                case 38:
                    i13 = i10;
                    c1.P(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    i13 = i10;
                    c1.G(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    i13 = i10;
                    c1.D(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    i13 = i10;
                    c1.C(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    i13 = i10;
                    c1.y(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    i13 = i10;
                    c1.O(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    i13 = i10;
                    c1.B(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    i13 = i10;
                    c1.J(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    i13 = i10;
                    c1.K(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, true);
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    i13 = i10;
                    c1.L(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, true);
                    break;
                case 48:
                    i13 = i10;
                    c1.M(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, true);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    i13 = i10;
                    c1.F(iArr[i13], (List) unsafe.getObject(obj, j3), k0Var, n(i13));
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    i13 = i10;
                    J(k0Var, i17, unsafe.getObject(obj, j3), i13);
                    break;
                case 51:
                    i13 = i10;
                    if (r(i17, i13, obj)) {
                        double doubleValue = ((Double) r1.d.i(obj, j3)).doubleValue();
                        j jVar3 = (j) k0Var.a;
                        jVar3.getClass();
                        jVar3.K(i17, Double.doubleToRawLongBits(doubleValue));
                        break;
                    }
                    break;
                case 52:
                    i13 = i10;
                    if (r(i17, i13, obj)) {
                        float floatValue = ((Float) r1.d.i(obj, j3)).floatValue();
                        j jVar4 = (j) k0Var.a;
                        jVar4.getClass();
                        jVar4.I(i17, Float.floatToRawIntBits(floatValue));
                        break;
                    }
                    break;
                case 53:
                    i13 = i10;
                    if (r(i17, i13, obj)) {
                        ((j) k0Var.a).U(i17, A(obj, j3));
                        break;
                    }
                    break;
                case 54:
                    i13 = i10;
                    if (r(i17, i13, obj)) {
                        ((j) k0Var.a).U(i17, A(obj, j3));
                        break;
                    }
                    break;
                case 55:
                    i13 = i10;
                    if (r(i17, i13, obj)) {
                        ((j) k0Var.a).M(i17, z(obj, j3));
                        break;
                    }
                    break;
                case 56:
                    i13 = i10;
                    if (r(i17, i13, obj)) {
                        ((j) k0Var.a).K(i17, A(obj, j3));
                        break;
                    }
                    break;
                case 57:
                    i13 = i10;
                    if (r(i17, i13, obj)) {
                        ((j) k0Var.a).I(i17, z(obj, j3));
                        break;
                    }
                    break;
                case 58:
                    i13 = i10;
                    if (r(i17, i13, obj)) {
                        ((j) k0Var.a).F(i17, ((Boolean) r1.d.i(obj, j3)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    i13 = i10;
                    if (r(i17, i13, obj)) {
                        K(i17, unsafe.getObject(obj, j3), k0Var);
                        break;
                    }
                    break;
                case 60:
                    i13 = i10;
                    if (r(i17, i13, obj)) {
                        ((j) k0Var.a).O(i17, (a) unsafe.getObject(obj, j3), n(i13));
                        break;
                    }
                    break;
                case 61:
                    i13 = i10;
                    if (r(i17, i13, obj)) {
                        k0Var.a(i17, (g) unsafe.getObject(obj, j3));
                        break;
                    }
                    break;
                case 62:
                    i13 = i10;
                    if (r(i17, i13, obj)) {
                        ((j) k0Var.a).S(i17, z(obj, j3));
                        break;
                    }
                    break;
                case 63:
                    i13 = i10;
                    if (r(i17, i13, obj)) {
                        ((j) k0Var.a).M(i17, z(obj, j3));
                        break;
                    }
                    break;
                case 64:
                    i13 = i10;
                    if (r(i17, i13, obj)) {
                        ((j) k0Var.a).I(i17, z(obj, j3));
                        break;
                    }
                    break;
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    i13 = i10;
                    if (r(i17, i13, obj)) {
                        ((j) k0Var.a).K(i17, A(obj, j3));
                        break;
                    }
                    break;
                case 66:
                    i13 = i10;
                    if (r(i17, i13, obj)) {
                        int z10 = z(obj, j3);
                        ((j) k0Var.a).S(i17, (z10 >> 31) ^ (z10 << 1));
                        break;
                    }
                    break;
                case 67:
                    i13 = i10;
                    if (r(i17, i13, obj)) {
                        long A = A(obj, j3);
                        ((j) k0Var.a).U(i17, (A >> 63) ^ (A << 1));
                        break;
                    }
                    break;
                case 68:
                    i13 = i10;
                    if (r(i17, i13, obj)) {
                        k0Var.b(i17, unsafe.getObject(obj, j3), n(i13));
                        break;
                    }
                    break;
                default:
                    i13 = i10;
                    break;
            }
        }
        this.m.getClass();
        ((w) obj).unknownFields.d(k0Var);
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
    public final void J(k0 k0Var, int i10, Object obj, int i11) {
        int A;
        int size;
        int z10;
        int size2;
        int z11;
        if (obj != null) {
            Object m10 = m(i11);
            this.n.getClass();
            l0 l0Var = ((m0) m10).a;
            z1 z1Var = l0Var.b;
            z1 z1Var2 = l0Var.a;
            j jVar = (j) k0Var.a;
            jVar.getClass();
            for (Map.Entry entry : ((n0) obj).entrySet()) {
                jVar.R(i10, 2);
                Object key = entry.getKey();
                Object value = entry.getValue();
                int i12 = p.c;
                int y3 = j.y(1);
                w1 w1Var = z1.d;
                if (z1Var2 == w1Var) {
                    y3 *= 2;
                }
                int i13 = 8;
                switch (z1Var2.ordinal()) {
                    case 0:
                        ((Double) key).getClass();
                        A = 8;
                        int i14 = A + y3;
                        int y10 = j.y(2);
                        if (z1Var == w1Var) {
                            y10 *= 2;
                        }
                        switch (z1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                jVar.T(i13 + y10 + i14);
                                Object key2 = entry.getKey();
                                Object value2 = entry.getValue();
                                p.b(jVar, z1Var2, 1, key2);
                                p.b(jVar, z1Var, 2, value2);
                            case 1:
                                ((Float) value).getClass();
                                i13 = 4;
                                jVar.T(i13 + y10 + i14);
                                Object key22 = entry.getKey();
                                Object value22 = entry.getValue();
                                p.b(jVar, z1Var2, 1, key22);
                                p.b(jVar, z1Var, 2, value22);
                            case 2:
                                i13 = j.A(((Long) value).longValue());
                                jVar.T(i13 + y10 + i14);
                                Object key222 = entry.getKey();
                                Object value222 = entry.getValue();
                                p.b(jVar, z1Var2, 1, key222);
                                p.b(jVar, z1Var, 2, value222);
                            case 3:
                                i13 = j.A(((Long) value).longValue());
                                jVar.T(i13 + y10 + i14);
                                Object key2222 = entry.getKey();
                                Object value2222 = entry.getValue();
                                p.b(jVar, z1Var2, 1, key2222);
                                p.b(jVar, z1Var, 2, value2222);
                            case 4:
                                i13 = j.w(((Integer) value).intValue());
                                jVar.T(i13 + y10 + i14);
                                Object key22222 = entry.getKey();
                                Object value22222 = entry.getValue();
                                p.b(jVar, z1Var2, 1, key22222);
                                p.b(jVar, z1Var, 2, value22222);
                            case 5:
                                ((Long) value).getClass();
                                jVar.T(i13 + y10 + i14);
                                Object key222222 = entry.getKey();
                                Object value222222 = entry.getValue();
                                p.b(jVar, z1Var2, 1, key222222);
                                p.b(jVar, z1Var, 2, value222222);
                            case 6:
                                ((Integer) value).getClass();
                                i13 = 4;
                                jVar.T(i13 + y10 + i14);
                                Object key2222222 = entry.getKey();
                                Object value2222222 = entry.getValue();
                                p.b(jVar, z1Var2, 1, key2222222);
                                p.b(jVar, z1Var, 2, value2222222);
                            case 7:
                                ((Boolean) value).getClass();
                                i13 = 1;
                                jVar.T(i13 + y10 + i14);
                                Object key22222222 = entry.getKey();
                                Object value22222222 = entry.getValue();
                                p.b(jVar, z1Var2, 1, key22222222);
                                p.b(jVar, z1Var, 2, value22222222);
                            case 8:
                                if (value instanceof g) {
                                    size2 = ((g) value).size();
                                    z11 = j.z(size2);
                                    i13 = z11 + size2;
                                    jVar.T(i13 + y10 + i14);
                                    Object key222222222 = entry.getKey();
                                    Object value222222222 = entry.getValue();
                                    p.b(jVar, z1Var2, 1, key222222222);
                                    p.b(jVar, z1Var, 2, value222222222);
                                } else {
                                    i13 = j.x((String) value);
                                    jVar.T(i13 + y10 + i14);
                                    Object key2222222222 = entry.getKey();
                                    Object value2222222222 = entry.getValue();
                                    p.b(jVar, z1Var2, 1, key2222222222);
                                    p.b(jVar, z1Var, 2, value2222222222);
                                }
                            case 9:
                                i13 = ((a) value).a();
                                jVar.T(i13 + y10 + i14);
                                Object key22222222222 = entry.getKey();
                                Object value22222222222 = entry.getValue();
                                p.b(jVar, z1Var2, 1, key22222222222);
                                p.b(jVar, z1Var, 2, value22222222222);
                            case 10:
                                size2 = ((a) value).a();
                                z11 = j.z(size2);
                                i13 = z11 + size2;
                                jVar.T(i13 + y10 + i14);
                                Object key222222222222 = entry.getKey();
                                Object value222222222222 = entry.getValue();
                                p.b(jVar, z1Var2, 1, key222222222222);
                                p.b(jVar, z1Var, 2, value222222222222);
                            case 11:
                                if (value instanceof g) {
                                    size2 = ((g) value).size();
                                    z11 = j.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    z11 = j.z(size2);
                                }
                                i13 = z11 + size2;
                                jVar.T(i13 + y10 + i14);
                                Object key2222222222222 = entry.getKey();
                                Object value2222222222222 = entry.getValue();
                                p.b(jVar, z1Var2, 1, key2222222222222);
                                p.b(jVar, z1Var, 2, value2222222222222);
                            case 12:
                                i13 = j.z(((Integer) value).intValue());
                                jVar.T(i13 + y10 + i14);
                                Object key22222222222222 = entry.getKey();
                                Object value22222222222222 = entry.getValue();
                                p.b(jVar, z1Var2, 1, key22222222222222);
                                p.b(jVar, z1Var, 2, value22222222222222);
                            case 13:
                                i13 = j.w(((Integer) value).intValue());
                                jVar.T(i13 + y10 + i14);
                                Object key222222222222222 = entry.getKey();
                                Object value222222222222222 = entry.getValue();
                                p.b(jVar, z1Var2, 1, key222222222222222);
                                p.b(jVar, z1Var, 2, value222222222222222);
                            case 14:
                                ((Integer) value).getClass();
                                i13 = 4;
                                jVar.T(i13 + y10 + i14);
                                Object key2222222222222222 = entry.getKey();
                                Object value2222222222222222 = entry.getValue();
                                p.b(jVar, z1Var2, 1, key2222222222222222);
                                p.b(jVar, z1Var, 2, value2222222222222222);
                            case 15:
                                ((Long) value).getClass();
                                jVar.T(i13 + y10 + i14);
                                Object key22222222222222222 = entry.getKey();
                                Object value22222222222222222 = entry.getValue();
                                p.b(jVar, z1Var2, 1, key22222222222222222);
                                p.b(jVar, z1Var, 2, value22222222222222222);
                            case 16:
                                int intValue = ((Integer) value).intValue();
                                i13 = j.z((intValue >> 31) ^ (intValue << 1));
                                jVar.T(i13 + y10 + i14);
                                Object key222222222222222222 = entry.getKey();
                                Object value222222222222222222 = entry.getValue();
                                p.b(jVar, z1Var2, 1, key222222222222222222);
                                p.b(jVar, z1Var, 2, value222222222222222222);
                            case 17:
                                long longValue = ((Long) value).longValue();
                                i13 = j.A((longValue >> 63) ^ (longValue << 1));
                                jVar.T(i13 + y10 + i14);
                                Object key2222222222222222222 = entry.getKey();
                                Object value2222222222222222222 = entry.getValue();
                                p.b(jVar, z1Var2, 1, key2222222222222222222);
                                p.b(jVar, z1Var, 2, value2222222222222222222);
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                    case 1:
                        ((Float) key).getClass();
                        A = 4;
                        int i142 = A + y3;
                        int y102 = j.y(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case 2:
                        A = j.A(((Long) key).longValue());
                        int i1422 = A + y3;
                        int y1022 = j.y(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case 3:
                        A = j.A(((Long) key).longValue());
                        int i14222 = A + y3;
                        int y10222 = j.y(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case 4:
                        A = j.w(((Integer) key).intValue());
                        int i142222 = A + y3;
                        int y102222 = j.y(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case 5:
                        ((Long) key).getClass();
                        A = 8;
                        int i1422222 = A + y3;
                        int y1022222 = j.y(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case 6:
                        ((Integer) key).getClass();
                        A = 4;
                        int i14222222 = A + y3;
                        int y10222222 = j.y(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case 7:
                        ((Boolean) key).getClass();
                        A = 1;
                        int i142222222 = A + y3;
                        int y102222222 = j.y(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case 8:
                        if (key instanceof g) {
                            size = ((g) key).size();
                            z10 = j.z(size);
                            A = size + z10;
                            int i1422222222 = A + y3;
                            int y1022222222 = j.y(2);
                            if (z1Var == w1Var) {
                            }
                            switch (z1Var.ordinal()) {
                            }
                        } else {
                            A = j.x((String) key);
                            int i14222222222 = A + y3;
                            int y10222222222 = j.y(2);
                            if (z1Var == w1Var) {
                            }
                            switch (z1Var.ordinal()) {
                            }
                        }
                    case 9:
                        A = ((a) key).a();
                        int i142222222222 = A + y3;
                        int y102222222222 = j.y(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case 10:
                        size = ((a) key).a();
                        z10 = j.z(size);
                        A = size + z10;
                        int i1422222222222 = A + y3;
                        int y1022222222222 = j.y(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case 11:
                        if (key instanceof g) {
                            size = ((g) key).size();
                            z10 = j.z(size);
                        } else {
                            size = ((byte[]) key).length;
                            z10 = j.z(size);
                        }
                        A = size + z10;
                        int i14222222222222 = A + y3;
                        int y10222222222222 = j.y(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case 12:
                        A = j.z(((Integer) key).intValue());
                        int i142222222222222 = A + y3;
                        int y102222222222222 = j.y(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case 13:
                        A = j.w(((Integer) key).intValue());
                        int i1422222222222222 = A + y3;
                        int y1022222222222222 = j.y(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case 14:
                        ((Integer) key).getClass();
                        A = 4;
                        int i14222222222222222 = A + y3;
                        int y10222222222222222 = j.y(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case 15:
                        ((Long) key).getClass();
                        A = 8;
                        int i142222222222222222 = A + y3;
                        int y102222222222222222 = j.y(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case 16:
                        int intValue2 = ((Integer) key).intValue();
                        A = j.z((intValue2 >> 31) ^ (intValue2 << 1));
                        int i1422222222222222222 = A + y3;
                        int y1022222222222222222 = j.y(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case 17:
                        long longValue2 = ((Long) key).longValue();
                        A = j.A((longValue2 << 1) ^ (longValue2 >> 63));
                        int i14222222222222222222 = A + y3;
                        int y10222222222222222222 = j.y(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final Object a() {
        this.k.getClass();
        return ((w) this.e).d(4);
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final void b(Object obj, k0 k0Var) {
        k0Var.getClass();
        j jVar = (j) k0Var.a;
        if (!this.g) {
            I(obj, k0Var);
            return;
        }
        int[] iArr = this.a;
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int H = H(i10);
            int i11 = iArr[i10];
            switch (G(H)) {
                case 0:
                    if (q(i10, obj)) {
                        double e = r1.d.e(obj, H & 1048575);
                        jVar.getClass();
                        jVar.K(i11, Double.doubleToRawLongBits(e));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (q(i10, obj)) {
                        float f7 = r1.d.f(obj, H & 1048575);
                        jVar.getClass();
                        jVar.I(i11, Float.floatToRawIntBits(f7));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (q(i10, obj)) {
                        jVar.U(i11, r1.d.h(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (q(i10, obj)) {
                        jVar.U(i11, r1.d.h(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (q(i10, obj)) {
                        jVar.M(i11, r1.d.g(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (q(i10, obj)) {
                        jVar.K(i11, r1.d.h(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (q(i10, obj)) {
                        jVar.I(i11, r1.d.g(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (q(i10, obj)) {
                        jVar.F(i11, r1.d.c(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (q(i10, obj)) {
                        K(i11, r1.d.i(obj, H & 1048575), k0Var);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (q(i10, obj)) {
                        jVar.O(i11, (a) r1.d.i(obj, H & 1048575), n(i10));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (q(i10, obj)) {
                        k0Var.a(i11, (g) r1.d.i(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (q(i10, obj)) {
                        jVar.S(i11, r1.d.g(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (q(i10, obj)) {
                        jVar.M(i11, r1.d.g(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (q(i10, obj)) {
                        jVar.I(i11, r1.d.g(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (q(i10, obj)) {
                        jVar.K(i11, r1.d.h(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (q(i10, obj)) {
                        int g10 = r1.d.g(obj, H & 1048575);
                        jVar.S(i11, (g10 >> 31) ^ (g10 << 1));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (q(i10, obj)) {
                        long h = r1.d.h(obj, H & 1048575);
                        jVar.U(i11, (h >> 63) ^ (h << 1));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (q(i10, obj)) {
                        k0Var.b(i11, r1.d.i(obj, H & 1048575), n(i10));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    c1.A(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, false);
                    break;
                case 19:
                    c1.E(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, false);
                    break;
                case 20:
                    c1.H(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, false);
                    break;
                case 21:
                    c1.P(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, false);
                    break;
                case 22:
                    c1.G(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, false);
                    break;
                case 23:
                    c1.D(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, false);
                    break;
                case 24:
                    c1.C(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, false);
                    break;
                case 25:
                    c1.y(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, false);
                    break;
                case 26:
                    c1.N(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var);
                    break;
                case 27:
                    c1.I(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, n(i10));
                    break;
                case 28:
                    c1.z(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var);
                    break;
                case 29:
                    c1.O(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, false);
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    c1.B(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, false);
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    c1.J(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, false);
                    break;
                case 32:
                    c1.K(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, false);
                    break;
                case 33:
                    c1.L(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, false);
                    break;
                case 34:
                    c1.M(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, false);
                    break;
                case 35:
                    c1.A(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, true);
                    break;
                case 36:
                    c1.E(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, true);
                    break;
                case 37:
                    c1.H(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, true);
                    break;
                case 38:
                    c1.P(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    c1.G(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    c1.D(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    c1.C(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, true);
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    c1.y(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    c1.O(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    c1.B(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    c1.J(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, true);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    c1.K(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, true);
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    c1.L(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, true);
                    break;
                case 48:
                    c1.M(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, true);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    c1.F(iArr[i10], (List) r1.d.i(obj, H & 1048575), k0Var, n(i10));
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    J(k0Var, i11, r1.d.i(obj, H & 1048575), i10);
                    break;
                case 51:
                    if (r(i11, i10, obj)) {
                        double doubleValue = ((Double) r1.d.i(obj, H & 1048575)).doubleValue();
                        jVar.getClass();
                        jVar.K(i11, Double.doubleToRawLongBits(doubleValue));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (r(i11, i10, obj)) {
                        float floatValue = ((Float) r1.d.i(obj, H & 1048575)).floatValue();
                        jVar.getClass();
                        jVar.I(i11, Float.floatToRawIntBits(floatValue));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (r(i11, i10, obj)) {
                        jVar.U(i11, A(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (r(i11, i10, obj)) {
                        jVar.U(i11, A(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (r(i11, i10, obj)) {
                        jVar.M(i11, z(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (r(i11, i10, obj)) {
                        jVar.K(i11, A(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (r(i11, i10, obj)) {
                        jVar.I(i11, z(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (r(i11, i10, obj)) {
                        jVar.F(i11, ((Boolean) r1.d.i(obj, H & 1048575)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (r(i11, i10, obj)) {
                        K(i11, r1.d.i(obj, H & 1048575), k0Var);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (r(i11, i10, obj)) {
                        jVar.O(i11, (a) r1.d.i(obj, H & 1048575), n(i10));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (r(i11, i10, obj)) {
                        k0Var.a(i11, (g) r1.d.i(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (r(i11, i10, obj)) {
                        jVar.S(i11, z(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (r(i11, i10, obj)) {
                        jVar.M(i11, z(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (r(i11, i10, obj)) {
                        jVar.I(i11, z(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (r(i11, i10, obj)) {
                        jVar.K(i11, A(obj, H & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (r(i11, i10, obj)) {
                        int z10 = z(obj, H & 1048575);
                        jVar.S(i11, (z10 >> 31) ^ (z10 << 1));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (r(i11, i10, obj)) {
                        long A = A(obj, H & 1048575);
                        jVar.U(i11, (A >> 63) ^ (A << 1));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (r(i11, i10, obj)) {
                        k0Var.b(i11, r1.d.i(obj, H & 1048575), n(i10));
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.m.getClass();
        ((w) obj).unknownFields.d(k0Var);
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
    @Override // androidx.datastore.preferences.protobuf.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Object obj, a0.h hVar, m mVar) {
        s0 s0Var;
        int i10;
        a0.h hVar2;
        int G;
        h0 h0Var;
        s0 s0Var2 = this;
        Object obj2 = obj;
        a0.h hVar3 = hVar;
        m mVar2 = mVar;
        mVar2.getClass();
        j1 j1Var = s0Var2.m;
        int[] iArr = s0Var2.h;
        int i11 = s0Var2.j;
        int i12 = s0Var2.i;
        i1 i1Var = null;
        while (true) {
            try {
                int d = hVar3.d();
                if (d >= s0Var2.c && d <= s0Var2.d) {
                    int[] iArr2 = s0Var2.a;
                    int length = (iArr2.length / 3) - 1;
                    int i13 = 0;
                    while (i13 <= length) {
                        int i14 = (length + i13) >>> 1;
                        int i15 = i14 * 3;
                        int i16 = iArr2[i15];
                        if (d == i16) {
                            i10 = i15;
                            i1 i1Var2 = i1.f;
                            if (i10 < 0) {
                                int H = s0Var2.H(i10);
                                try {
                                    G = G(H);
                                    h0Var = s0Var2.l;
                                } catch (a0 unused) {
                                }
                                switch (G) {
                                    case 0:
                                        int i17 = i10;
                                        hVar2 = hVar3;
                                        s0Var = s0Var2;
                                        try {
                                        } catch (a0 unused2) {
                                            obj2 = obj;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            obj2 = obj;
                                        }
                                        try {
                                            r1.d.m(obj, y(H), hVar2.j());
                                            obj2 = obj;
                                            s0Var.E(i17, obj2);
                                        } catch (a0 unused3) {
                                            obj2 = obj;
                                            try {
                                                j1Var.getClass();
                                                if (i1Var == null) {
                                                }
                                                if (!j1.a(i1Var, hVar2)) {
                                                }
                                                mVar2 = mVar;
                                                s0Var2 = s0Var;
                                                hVar3 = hVar2;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                while (i12 < i11) {
                                                    s0Var.k(iArr[i12], obj2, i1Var);
                                                    i12++;
                                                }
                                                if (i1Var != null) {
                                                    j1Var.getClass();
                                                    ((w) obj2).unknownFields = i1Var;
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            obj2 = obj;
                                            while (i12 < i11) {
                                            }
                                            if (i1Var != null) {
                                            }
                                            throw th;
                                        }
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                        break;
                                    case 1:
                                        hVar2 = hVar3;
                                        s0Var = s0Var2;
                                        r1.d.n(obj2, y(H), hVar2.s());
                                        s0Var.E(i10, obj2);
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 2:
                                        hVar2 = hVar3;
                                        s0Var = s0Var2;
                                        r1.n(obj2, y(H), hVar2.z());
                                        s0Var.E(i10, obj2);
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 3:
                                        hVar2 = hVar3;
                                        s0Var = s0Var2;
                                        r1.n(obj2, y(H), hVar2.Q());
                                        s0Var.E(i10, obj2);
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 4:
                                        hVar2 = hVar3;
                                        s0Var = s0Var2;
                                        r1.m(y(H), obj2, hVar2.x());
                                        s0Var.E(i10, obj2);
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 5:
                                        hVar2 = hVar3;
                                        s0Var = s0Var2;
                                        r1.n(obj2, y(H), hVar2.q());
                                        s0Var.E(i10, obj2);
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 6:
                                        hVar2 = hVar3;
                                        s0Var = s0Var2;
                                        r1.m(y(H), obj2, hVar2.o());
                                        s0Var.E(i10, obj2);
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 7:
                                        hVar2 = hVar3;
                                        s0Var = s0Var2;
                                        r1.d.k(obj2, y(H), hVar2.f());
                                        s0Var.E(i10, obj2);
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 8:
                                        hVar2 = hVar3;
                                        s0Var = s0Var2;
                                        s0Var.C(obj2, H, hVar2);
                                        s0Var.E(i10, obj2);
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 9:
                                        int i18 = i10;
                                        hVar2 = hVar3;
                                        m mVar3 = mVar2;
                                        s0Var = s0Var2;
                                        if (s0Var.q(i18, obj2)) {
                                            r1.o(obj2, y(H), z.c(r1.d.i(obj2, y(H)), hVar2.C(s0Var.n(i18), mVar3)));
                                        } else {
                                            r1.o(obj2, y(H), hVar2.C(s0Var.n(i18), mVar3));
                                            s0Var.E(i18, obj2);
                                        }
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 10:
                                        hVar2 = hVar3;
                                        s0Var = s0Var2;
                                        r1.o(obj2, y(H), hVar2.h());
                                        s0Var.E(i10, obj2);
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 11:
                                        hVar2 = hVar3;
                                        s0Var = s0Var2;
                                        r1.m(y(H), obj2, hVar2.O());
                                        s0Var.E(i10, obj2);
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 12:
                                        int i19 = i10;
                                        hVar2 = hVar3;
                                        s0Var = s0Var2;
                                        int l4 = hVar2.l();
                                        s0Var.l(i19);
                                        r1.m(y(H), obj2, l4);
                                        s0Var.E(i19, obj2);
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 13:
                                        hVar2 = hVar3;
                                        s0Var = s0Var2;
                                        r1.m(y(H), obj2, hVar2.D());
                                        s0Var.E(i10, obj2);
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 14:
                                        hVar2 = hVar3;
                                        s0Var = s0Var2;
                                        r1.n(obj2, y(H), hVar2.F());
                                        s0Var.E(i10, obj2);
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 15:
                                        hVar2 = hVar3;
                                        s0Var = s0Var2;
                                        r1.m(y(H), obj2, hVar2.H());
                                        s0Var.E(i10, obj2);
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 16:
                                        hVar2 = hVar3;
                                        s0Var = s0Var2;
                                        r1.n(obj2, y(H), hVar2.J());
                                        s0Var.E(i10, obj2);
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 17:
                                        int i20 = i10;
                                        hVar2 = hVar3;
                                        m mVar4 = mVar2;
                                        s0Var = s0Var2;
                                        if (s0Var.q(i20, obj2)) {
                                            r1.o(obj2, y(H), z.c(r1.d.i(obj2, y(H)), hVar2.v(s0Var.n(i20), mVar4)));
                                        } else {
                                            r1.o(obj2, y(H), hVar2.v(s0Var.n(i20), mVar4));
                                            s0Var.E(i20, obj2);
                                        }
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 18:
                                        hVar2 = hVar3;
                                        s0Var = s0Var2;
                                        hVar2.k(h0Var.c(obj2, y(H)));
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 19:
                                        hVar2 = hVar3;
                                        s0Var = s0Var2;
                                        hVar2.t(h0Var.c(obj2, y(H)));
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 20:
                                        hVar2 = hVar3;
                                        s0Var = s0Var2;
                                        hVar2.A(h0Var.c(obj2, y(H)));
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 21:
                                        hVar2 = hVar3;
                                        s0Var = s0Var2;
                                        hVar2.R(h0Var.c(obj2, y(H)));
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 22:
                                        hVar2 = hVar3;
                                        s0Var = s0Var2;
                                        hVar2.y(h0Var.c(obj2, y(H)));
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 23:
                                        hVar2 = hVar3;
                                        s0Var = s0Var2;
                                        hVar2.r(h0Var.c(obj2, y(H)));
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 24:
                                        hVar2 = hVar3;
                                        s0Var = s0Var2;
                                        hVar2.p(h0Var.c(obj2, y(H)));
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 25:
                                        hVar2 = hVar3;
                                        s0Var = s0Var2;
                                        hVar2.g(h0Var.c(obj2, y(H)));
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 26:
                                        hVar2 = hVar3;
                                        s0Var = s0Var2;
                                        if ((536870912 & H) != 0) {
                                            try {
                                                hVar2.M(h0Var.c(obj2, H & 1048575), true);
                                            } catch (a0 unused4) {
                                                j1Var.getClass();
                                                if (i1Var == null) {
                                                    w wVar = (w) obj2;
                                                    i1 i1Var3 = wVar.unknownFields;
                                                    if (i1Var3 == i1Var2) {
                                                        i1Var3 = i1.b();
                                                        wVar.unknownFields = i1Var3;
                                                    }
                                                    i1Var = i1Var3;
                                                }
                                                if (!j1.a(i1Var, hVar2)) {
                                                    while (i12 < i11) {
                                                        s0Var.k(iArr[i12], obj2, i1Var);
                                                        i12++;
                                                    }
                                                    if (i1Var != null) {
                                                        ((w) obj2).unknownFields = i1Var;
                                                        return;
                                                    }
                                                    return;
                                                }
                                                mVar2 = mVar;
                                                s0Var2 = s0Var;
                                                hVar3 = hVar2;
                                            }
                                        } else {
                                            hVar2.M(h0Var.c(obj2, H & 1048575), false);
                                        }
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 27:
                                        try {
                                            try {
                                                s0Var2.B(obj2, H, hVar3, s0Var2.n(i10), mVar);
                                                s0Var = s0Var2;
                                                hVar2 = hVar3;
                                            } catch (a0 unused5) {
                                                s0Var = s0Var2;
                                                hVar2 = hVar3;
                                                j1Var.getClass();
                                                if (i1Var == null) {
                                                }
                                                if (!j1.a(i1Var, hVar2)) {
                                                }
                                                mVar2 = mVar;
                                                s0Var2 = s0Var;
                                                hVar3 = hVar2;
                                            }
                                        } catch (a0 unused6) {
                                            s0Var = s0Var2;
                                            hVar2 = hVar3;
                                            j1Var.getClass();
                                            if (i1Var == null) {
                                            }
                                            if (!j1.a(i1Var, hVar2)) {
                                            }
                                            mVar2 = mVar;
                                            s0Var2 = s0Var;
                                            hVar3 = hVar2;
                                        }
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                        break;
                                    case 28:
                                        hVar3.i(h0Var.c(obj2, y(H)));
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 29:
                                        hVar3.P(h0Var.c(obj2, y(H)));
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case MessageObject.TYPE_GIFT_STARS /* 30 */:
                                        hVar3.m(h0Var.c(obj2, y(H)));
                                        s0Var2.l(i10);
                                        Class cls = c1.a;
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                                        hVar3.E(h0Var.c(obj2, y(H)));
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 32:
                                        hVar3.G(h0Var.c(obj2, y(H)));
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 33:
                                        hVar3.I(h0Var.c(obj2, y(H)));
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 34:
                                        hVar3.K(h0Var.c(obj2, y(H)));
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 35:
                                        hVar3.k(h0Var.c(obj2, y(H)));
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 36:
                                        hVar3.t(h0Var.c(obj2, y(H)));
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 37:
                                        hVar3.A(h0Var.c(obj2, y(H)));
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 38:
                                        hVar3.R(h0Var.c(obj2, y(H)));
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case Maneuver.TYPE_DESTINATION /* 39 */:
                                        hVar3.y(h0Var.c(obj2, y(H)));
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                        hVar3.r(h0Var.c(obj2, y(H)));
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                        hVar3.p(h0Var.c(obj2, H & 1048575));
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                        hVar3.g(h0Var.c(obj2, H & 1048575));
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                                        hVar3.P(h0Var.c(obj2, H & 1048575));
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                        hVar3.m(h0Var.c(obj2, H & 1048575));
                                        s0Var2.l(i10);
                                        Class cls2 = c1.a;
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                        hVar3.E(h0Var.c(obj2, H & 1048575));
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                        hVar3.G(h0Var.c(obj2, H & 1048575));
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                        hVar3.I(h0Var.c(obj2, H & 1048575));
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 48:
                                        hVar3.K(h0Var.c(obj2, H & 1048575));
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                        hVar3.w(h0Var.c(obj2, H & 1048575), s0Var2.n(i10), mVar2);
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                        try {
                                            try {
                                                s0Var2.t(obj2, i10, s0Var2.m(i10), mVar2, hVar);
                                                hVar3 = hVar;
                                                s0Var = s0Var2;
                                                hVar2 = hVar3;
                                            } catch (a0 unused7) {
                                                s0Var = s0Var2;
                                                hVar2 = hVar;
                                                j1Var.getClass();
                                                if (i1Var == null) {
                                                }
                                                if (!j1.a(i1Var, hVar2)) {
                                                }
                                                mVar2 = mVar;
                                                s0Var2 = s0Var;
                                                hVar3 = hVar2;
                                            }
                                        } catch (a0 unused8) {
                                            hVar2 = hVar;
                                            s0Var = s0Var2;
                                        }
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                        break;
                                    case 51:
                                        r1.o(obj2, H & 1048575, Double.valueOf(hVar3.j()));
                                        s0Var2.F(d, i10, obj2);
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 52:
                                        r1.o(obj2, H & 1048575, Float.valueOf(hVar3.s()));
                                        s0Var2.F(d, i10, obj2);
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 53:
                                        r1.o(obj2, H & 1048575, Long.valueOf(hVar3.z()));
                                        s0Var2.F(d, i10, obj2);
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 54:
                                        r1.o(obj2, H & 1048575, Long.valueOf(hVar3.Q()));
                                        s0Var2.F(d, i10, obj2);
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 55:
                                        r1.o(obj2, H & 1048575, Integer.valueOf(hVar3.x()));
                                        s0Var2.F(d, i10, obj2);
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 56:
                                        r1.o(obj2, H & 1048575, Long.valueOf(hVar3.q()));
                                        s0Var2.F(d, i10, obj2);
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 57:
                                        r1.o(obj2, H & 1048575, Integer.valueOf(hVar3.o()));
                                        s0Var2.F(d, i10, obj2);
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 58:
                                        r1.o(obj2, H & 1048575, Boolean.valueOf(hVar3.f()));
                                        s0Var2.F(d, i10, obj2);
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 59:
                                        s0Var2.C(obj2, H, hVar3);
                                        s0Var2.F(d, i10, obj2);
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 60:
                                        if (s0Var2.r(d, i10, obj2)) {
                                            long j3 = H & 1048575;
                                            r1.o(obj2, j3, z.c(r1.d.i(obj2, j3), hVar3.C(s0Var2.n(i10), mVar2)));
                                        } else {
                                            r1.o(obj2, H & 1048575, hVar3.C(s0Var2.n(i10), mVar2));
                                            s0Var2.E(i10, obj2);
                                        }
                                        s0Var2.F(d, i10, obj2);
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 61:
                                        r1.o(obj2, H & 1048575, hVar3.h());
                                        s0Var2.F(d, i10, obj2);
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 62:
                                        r1.o(obj2, H & 1048575, Integer.valueOf(hVar3.O()));
                                        s0Var2.F(d, i10, obj2);
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 63:
                                        int l10 = hVar3.l();
                                        s0Var2.l(i10);
                                        r1.o(obj2, H & 1048575, Integer.valueOf(l10));
                                        s0Var2.F(d, i10, obj2);
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 64:
                                        r1.o(obj2, H & 1048575, Integer.valueOf(hVar3.D()));
                                        s0Var2.F(d, i10, obj2);
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case VoIPService.CALL_MIN_LAYER /* 65 */:
                                        r1.o(obj2, H & 1048575, Long.valueOf(hVar3.F()));
                                        s0Var2.F(d, i10, obj2);
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 66:
                                        r1.o(obj2, H & 1048575, Integer.valueOf(hVar3.H()));
                                        s0Var2.F(d, i10, obj2);
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 67:
                                        r1.o(obj2, H & 1048575, Long.valueOf(hVar3.J()));
                                        s0Var2.F(d, i10, obj2);
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    case 68:
                                        r1.o(obj2, H & 1048575, hVar3.v(s0Var2.n(i10), mVar2));
                                        s0Var2.F(d, i10, obj2);
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                    default:
                                        if (i1Var == null) {
                                            j1Var.getClass();
                                            i1Var = i1.b();
                                        }
                                        j1Var.getClass();
                                        if (!j1.a(i1Var, hVar3)) {
                                            while (i12 < i11) {
                                                s0Var2.k(iArr[i12], obj2, i1Var);
                                                i12++;
                                            }
                                            break;
                                        }
                                        s0Var = s0Var2;
                                        hVar2 = hVar3;
                                        mVar2 = mVar;
                                        s0Var2 = s0Var;
                                        hVar3 = hVar2;
                                }
                            } else if (d == Integer.MAX_VALUE) {
                                while (i12 < i11) {
                                    s0Var2.k(iArr[i12], obj2, i1Var);
                                    i12++;
                                }
                                if (i1Var != null) {
                                    j1Var.getClass();
                                }
                            } else {
                                j1Var.getClass();
                                if (i1Var == null) {
                                    w wVar2 = (w) obj2;
                                    i1 i1Var4 = wVar2.unknownFields;
                                    if (i1Var4 == i1Var2) {
                                        i1Var4 = i1.b();
                                        wVar2.unknownFields = i1Var4;
                                    }
                                    i1Var = i1Var4;
                                }
                                if (!j1.a(i1Var, hVar3)) {
                                    while (i12 < i11) {
                                        s0Var2.k(iArr[i12], obj2, i1Var);
                                        i12++;
                                    }
                                }
                            }
                        } else if (d < i16) {
                            length = i14 - 1;
                        } else {
                            i13 = i14 + 1;
                        }
                    }
                }
                i10 = -1;
                i1 i1Var22 = i1.f;
                if (i10 < 0) {
                }
            } catch (Throwable th5) {
                th = th5;
                s0Var = s0Var2;
            }
        }
        ((w) obj2).unknownFields = i1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final void d(Object obj) {
        int[] iArr;
        int i10;
        int i11 = this.i;
        while (true) {
            iArr = this.h;
            i10 = this.j;
            if (i11 >= i10) {
                break;
            }
            long H = H(iArr[i11]) & 1048575;
            Object i12 = r1.d.i(obj, H);
            if (i12 != null) {
                this.n.getClass();
                ((n0) i12).a = false;
                r1.o(obj, H, i12);
            }
            i11++;
        }
        int length = iArr.length;
        while (i10 < length) {
            this.l.a(obj, iArr[i10]);
            i10++;
        }
        this.m.getClass();
        ((w) obj).unknownFields.e = false;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final int e(a aVar) {
        return this.g ? p(aVar) : o(aVar);
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final boolean f(Object obj) {
        int i10;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        loop0: while (true) {
            boolean z10 = true;
            if (i12 >= this.i) {
                return true;
            }
            int i14 = this.h[i12];
            int[] iArr = this.a;
            int i15 = iArr[i14];
            int H = H(i14);
            boolean z11 = this.g;
            if (z11) {
                i10 = 0;
            } else {
                int i16 = iArr[i14 + 2];
                int i17 = i16 & 1048575;
                i10 = 1 << (i16 >>> 20);
                if (i17 != i11) {
                    i13 = p.getInt(obj, i17);
                    i11 = i17;
                }
            }
            if ((268435456 & H) != 0) {
                if (!(z11 ? q(i14, obj) : (i13 & i10) != 0)) {
                    break;
                }
            }
            int G = G(H);
            if (G == 9 || G == 17) {
                if (z11) {
                    z10 = q(i14, obj);
                } else if ((i10 & i13) == 0) {
                    z10 = false;
                }
                if (z10) {
                    if (!n(i14).f(r1.d.i(obj, H & 1048575))) {
                        break;
                    }
                } else {
                    continue;
                }
                i12++;
            } else {
                if (G != 27) {
                    if (G == 60 || G == 68) {
                        if (r(i15, i14, obj)) {
                            if (!n(i14).f(r1.d.i(obj, H & 1048575))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                        i12++;
                    } else if (G != 49) {
                        if (G == 50) {
                            Object i18 = r1.d.i(obj, H & 1048575);
                            this.n.getClass();
                            n0 n0Var = (n0) i18;
                            if (!n0Var.isEmpty() && ((m0) m(i14)).a.b.a == a2.r) {
                                b1 b1Var = null;
                                for (Object obj2 : n0Var.values()) {
                                    if (b1Var == null) {
                                        b1Var = y0.c.a(obj2.getClass());
                                    }
                                    if (!b1Var.f(obj2)) {
                                        break loop0;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                        i12++;
                    }
                }
                List list = (List) r1.d.i(obj, H & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    b1 n10 = n(i14);
                    for (int i19 = 0; i19 < list.size(); i19++) {
                        if (!n10.f(list.get(i19))) {
                            break loop0;
                        }
                    }
                }
                i12++;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.datastore.preferences.protobuf.b1
    public final void g(w wVar, w wVar2) {
        w wVar3;
        wVar2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i10 >= iArr.length) {
                w wVar4 = wVar;
                if (this.g) {
                    return;
                }
                c1.w(this.m, wVar4, wVar2);
                return;
            }
            int H = H(i10);
            long j3 = 1048575 & H;
            int i11 = iArr[i10];
            switch (G(H)) {
                case 0:
                    if (q(i10, wVar2)) {
                        q1 q1Var = r1.d;
                        wVar3 = wVar;
                        q1Var.m(wVar3, j3, q1Var.e(wVar2, j3));
                        E(i10, wVar3);
                        break;
                    }
                    wVar3 = wVar;
                    break;
                case 1:
                    if (q(i10, wVar2)) {
                        q1 q1Var2 = r1.d;
                        q1Var2.n(wVar, j3, q1Var2.f(wVar2, j3));
                        E(i10, wVar);
                    }
                    wVar3 = wVar;
                    break;
                case 2:
                    if (q(i10, wVar2)) {
                        r1.n(wVar, j3, r1.d.h(wVar2, j3));
                        E(i10, wVar);
                    }
                    wVar3 = wVar;
                    break;
                case 3:
                    if (q(i10, wVar2)) {
                        r1.n(wVar, j3, r1.d.h(wVar2, j3));
                        E(i10, wVar);
                    }
                    wVar3 = wVar;
                    break;
                case 4:
                    if (q(i10, wVar2)) {
                        r1.m(j3, wVar, r1.d.g(wVar2, j3));
                        E(i10, wVar);
                    }
                    wVar3 = wVar;
                    break;
                case 5:
                    if (q(i10, wVar2)) {
                        r1.n(wVar, j3, r1.d.h(wVar2, j3));
                        E(i10, wVar);
                    }
                    wVar3 = wVar;
                    break;
                case 6:
                    if (q(i10, wVar2)) {
                        r1.m(j3, wVar, r1.d.g(wVar2, j3));
                        E(i10, wVar);
                    }
                    wVar3 = wVar;
                    break;
                case 7:
                    if (q(i10, wVar2)) {
                        q1 q1Var3 = r1.d;
                        q1Var3.k(wVar, j3, q1Var3.c(wVar2, j3));
                        E(i10, wVar);
                    }
                    wVar3 = wVar;
                    break;
                case 8:
                    if (q(i10, wVar2)) {
                        r1.o(wVar, j3, r1.d.i(wVar2, j3));
                        E(i10, wVar);
                    }
                    wVar3 = wVar;
                    break;
                case 9:
                    u(i10, wVar, wVar2);
                    wVar3 = wVar;
                    break;
                case 10:
                    if (q(i10, wVar2)) {
                        r1.o(wVar, j3, r1.d.i(wVar2, j3));
                        E(i10, wVar);
                    }
                    wVar3 = wVar;
                    break;
                case 11:
                    if (q(i10, wVar2)) {
                        r1.m(j3, wVar, r1.d.g(wVar2, j3));
                        E(i10, wVar);
                    }
                    wVar3 = wVar;
                    break;
                case 12:
                    if (q(i10, wVar2)) {
                        r1.m(j3, wVar, r1.d.g(wVar2, j3));
                        E(i10, wVar);
                    }
                    wVar3 = wVar;
                    break;
                case 13:
                    if (q(i10, wVar2)) {
                        r1.m(j3, wVar, r1.d.g(wVar2, j3));
                        E(i10, wVar);
                    }
                    wVar3 = wVar;
                    break;
                case 14:
                    if (q(i10, wVar2)) {
                        r1.n(wVar, j3, r1.d.h(wVar2, j3));
                        E(i10, wVar);
                    }
                    wVar3 = wVar;
                    break;
                case 15:
                    if (q(i10, wVar2)) {
                        r1.m(j3, wVar, r1.d.g(wVar2, j3));
                        E(i10, wVar);
                    }
                    wVar3 = wVar;
                    break;
                case 16:
                    if (q(i10, wVar2)) {
                        r1.n(wVar, j3, r1.d.h(wVar2, j3));
                        E(i10, wVar);
                    }
                    wVar3 = wVar;
                    break;
                case 17:
                    u(i10, wVar, wVar2);
                    wVar3 = wVar;
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
                    this.l.b(wVar, j3, wVar2);
                    wVar3 = wVar;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Class cls = c1.a;
                    q1 q1Var4 = r1.d;
                    Object i12 = q1Var4.i(wVar, j3);
                    Object i13 = q1Var4.i(wVar2, j3);
                    this.n.getClass();
                    r1.o(wVar, j3, o0.b(i12, i13));
                    wVar3 = wVar;
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
                    if (r(i11, i10, wVar2)) {
                        r1.o(wVar, j3, r1.d.i(wVar2, j3));
                        F(i11, i10, wVar);
                    }
                    wVar3 = wVar;
                    break;
                case 60:
                    v(i10, wVar, wVar2);
                    wVar3 = wVar;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                case 66:
                case 67:
                    if (r(i11, i10, wVar2)) {
                        r1.o(wVar, j3, r1.d.i(wVar2, j3));
                        F(i11, i10, wVar);
                    }
                    wVar3 = wVar;
                    break;
                case 68:
                    v(i10, wVar, wVar2);
                    wVar3 = wVar;
                    break;
                default:
                    wVar3 = wVar;
                    break;
            }
            i10 += 3;
            wVar = wVar3;
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
    @Override // androidx.datastore.preferences.protobuf.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(w wVar) {
        int i10;
        int b10;
        int i11;
        int[] iArr = this.a;
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int H = H(i13);
            int i14 = iArr[i13];
            long j3 = 1048575 & H;
            int i15 = 1237;
            int i16 = 37;
            switch (G(H)) {
                case 0:
                    i10 = i12 * 53;
                    b10 = z.b(Double.doubleToLongBits(r1.d.e(wVar, j3)));
                    i12 = b10 + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    b10 = Float.floatToIntBits(r1.d.f(wVar, j3));
                    i12 = b10 + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    b10 = z.b(r1.d.h(wVar, j3));
                    i12 = b10 + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    b10 = z.b(r1.d.h(wVar, j3));
                    i12 = b10 + i10;
                    break;
                case 4:
                    i10 = i12 * 53;
                    b10 = r1.d.g(wVar, j3);
                    i12 = b10 + i10;
                    break;
                case 5:
                    i10 = i12 * 53;
                    b10 = z.b(r1.d.h(wVar, j3));
                    i12 = b10 + i10;
                    break;
                case 6:
                    i10 = i12 * 53;
                    b10 = r1.d.g(wVar, j3);
                    i12 = b10 + i10;
                    break;
                case 7:
                    i11 = i12 * 53;
                    boolean c10 = r1.d.c(wVar, j3);
                    Charset charset = z.a;
                    break;
                case 8:
                    i10 = i12 * 53;
                    b10 = ((String) r1.d.i(wVar, j3)).hashCode();
                    i12 = b10 + i10;
                    break;
                case 9:
                    Object i17 = r1.d.i(wVar, j3);
                    if (i17 != null) {
                        i16 = i17.hashCode();
                    }
                    i12 = (i12 * 53) + i16;
                    break;
                case 10:
                    i10 = i12 * 53;
                    b10 = r1.d.i(wVar, j3).hashCode();
                    i12 = b10 + i10;
                    break;
                case 11:
                    i10 = i12 * 53;
                    b10 = r1.d.g(wVar, j3);
                    i12 = b10 + i10;
                    break;
                case 12:
                    i10 = i12 * 53;
                    b10 = r1.d.g(wVar, j3);
                    i12 = b10 + i10;
                    break;
                case 13:
                    i10 = i12 * 53;
                    b10 = r1.d.g(wVar, j3);
                    i12 = b10 + i10;
                    break;
                case 14:
                    i10 = i12 * 53;
                    b10 = z.b(r1.d.h(wVar, j3));
                    i12 = b10 + i10;
                    break;
                case 15:
                    i10 = i12 * 53;
                    b10 = r1.d.g(wVar, j3);
                    i12 = b10 + i10;
                    break;
                case 16:
                    i10 = i12 * 53;
                    b10 = z.b(r1.d.h(wVar, j3));
                    i12 = b10 + i10;
                    break;
                case 17:
                    Object i18 = r1.d.i(wVar, j3);
                    if (i18 != null) {
                        i16 = i18.hashCode();
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
                    b10 = r1.d.i(wVar, j3).hashCode();
                    i12 = b10 + i10;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    i10 = i12 * 53;
                    b10 = r1.d.i(wVar, j3).hashCode();
                    i12 = b10 + i10;
                    break;
                case 51:
                    if (r(i14, i13, wVar)) {
                        i10 = i12 * 53;
                        b10 = z.b(Double.doubleToLongBits(((Double) r1.d.i(wVar, j3)).doubleValue()));
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (r(i14, i13, wVar)) {
                        i10 = i12 * 53;
                        b10 = Float.floatToIntBits(((Float) r1.d.i(wVar, j3)).floatValue());
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (r(i14, i13, wVar)) {
                        i10 = i12 * 53;
                        b10 = z.b(A(wVar, j3));
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (r(i14, i13, wVar)) {
                        i10 = i12 * 53;
                        b10 = z.b(A(wVar, j3));
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (r(i14, i13, wVar)) {
                        i10 = i12 * 53;
                        b10 = z(wVar, j3);
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (r(i14, i13, wVar)) {
                        i10 = i12 * 53;
                        b10 = z.b(A(wVar, j3));
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (r(i14, i13, wVar)) {
                        i10 = i12 * 53;
                        b10 = z(wVar, j3);
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (r(i14, i13, wVar)) {
                        i11 = i12 * 53;
                        boolean booleanValue = ((Boolean) r1.d.i(wVar, j3)).booleanValue();
                        Charset charset2 = z.a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (r(i14, i13, wVar)) {
                        i10 = i12 * 53;
                        b10 = ((String) r1.d.i(wVar, j3)).hashCode();
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (r(i14, i13, wVar)) {
                        i10 = i12 * 53;
                        b10 = r1.d.i(wVar, j3).hashCode();
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (r(i14, i13, wVar)) {
                        i10 = i12 * 53;
                        b10 = r1.d.i(wVar, j3).hashCode();
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (r(i14, i13, wVar)) {
                        i10 = i12 * 53;
                        b10 = z(wVar, j3);
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (r(i14, i13, wVar)) {
                        i10 = i12 * 53;
                        b10 = z(wVar, j3);
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (r(i14, i13, wVar)) {
                        i10 = i12 * 53;
                        b10 = z(wVar, j3);
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (r(i14, i13, wVar)) {
                        i10 = i12 * 53;
                        b10 = z.b(A(wVar, j3));
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (r(i14, i13, wVar)) {
                        i10 = i12 * 53;
                        b10 = z(wVar, j3);
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (r(i14, i13, wVar)) {
                        i10 = i12 * 53;
                        b10 = z.b(A(wVar, j3));
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (r(i14, i13, wVar)) {
                        i10 = i12 * 53;
                        b10 = r1.d.i(wVar, j3).hashCode();
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.m.getClass();
        return wVar.unknownFields.hashCode() + (i12 * 53);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.c1.x(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L105;
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
    
        if (androidx.datastore.preferences.protobuf.c1.x(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.c1.x(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.c1.x(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L105;
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
    
        if (androidx.datastore.preferences.protobuf.c1.x(r9.i(r12, r7), r9.i(r13, r7)) != false) goto L105;
     */
    @Override // androidx.datastore.preferences.protobuf.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(w wVar, w wVar2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 < length) {
                int H = H(i10);
                long j3 = H & 1048575;
                switch (G(H)) {
                    case 0:
                        if (j(wVar, wVar2, i10)) {
                            q1 q1Var = r1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 1:
                        if (j(wVar, wVar2, i10)) {
                            q1 q1Var2 = r1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 2:
                        if (j(wVar, wVar2, i10)) {
                            q1 q1Var3 = r1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 3:
                        if (j(wVar, wVar2, i10)) {
                            q1 q1Var4 = r1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 4:
                        if (j(wVar, wVar2, i10)) {
                            q1 q1Var5 = r1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 5:
                        if (j(wVar, wVar2, i10)) {
                            q1 q1Var6 = r1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 6:
                        if (j(wVar, wVar2, i10)) {
                            q1 q1Var7 = r1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 7:
                        if (j(wVar, wVar2, i10)) {
                            q1 q1Var8 = r1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 8:
                        if (j(wVar, wVar2, i10)) {
                            q1 q1Var9 = r1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 9:
                        if (j(wVar, wVar2, i10)) {
                            q1 q1Var10 = r1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 10:
                        if (j(wVar, wVar2, i10)) {
                            q1 q1Var11 = r1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 11:
                        if (j(wVar, wVar2, i10)) {
                            q1 q1Var12 = r1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 12:
                        if (j(wVar, wVar2, i10)) {
                            q1 q1Var13 = r1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 13:
                        if (j(wVar, wVar2, i10)) {
                            q1 q1Var14 = r1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 14:
                        if (j(wVar, wVar2, i10)) {
                            q1 q1Var15 = r1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 15:
                        if (j(wVar, wVar2, i10)) {
                            q1 q1Var16 = r1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 16:
                        if (j(wVar, wVar2, i10)) {
                            q1 q1Var17 = r1.d;
                            break;
                        }
                        z10 = false;
                        break;
                    case 17:
                        if (j(wVar, wVar2, i10)) {
                            q1 q1Var18 = r1.d;
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
                        q1 q1Var19 = r1.d;
                        z10 = c1.x(q1Var19.i(wVar, j3), q1Var19.i(wVar2, j3));
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        q1 q1Var20 = r1.d;
                        z10 = c1.x(q1Var20.i(wVar, j3), q1Var20.i(wVar2, j3));
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
                        q1 q1Var21 = r1.d;
                        if (q1Var21.g(wVar, j10) == q1Var21.g(wVar2, j10)) {
                            break;
                        }
                        z10 = false;
                        break;
                }
                if (z10) {
                    i10 += 3;
                }
            } else {
                this.m.getClass();
                if (wVar.unknownFields.equals(wVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j(w wVar, Object obj, int i10) {
        return q(i10, wVar) == q(i10, obj);
    }

    public final void k(int i10, Object obj, Object obj2) {
        int i11 = this.a[i10];
        if (r1.d.i(obj, H(i10) & 1048575) == null) {
            return;
        }
        l(i10);
    }

    public final void l(int i10) {
        if (this.b[((i10 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final Object m(int i10) {
        return this.b[(i10 / 3) * 2];
    }

    public final b1 n(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.b;
        b1 b1Var = (b1) objArr[i11];
        if (b1Var != null) {
            return b1Var;
        }
        b1 a2 = y0.c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a2;
        return a2;
    }

    public final int o(Object obj) {
        int i10;
        int y3;
        int A;
        int y10;
        int w10;
        int u10;
        int y11;
        int x10;
        int g10;
        int y12;
        int i11;
        Unsafe unsafe = p;
        int i12 = -1;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i13 >= iArr.length) {
                this.m.getClass();
                return ((w) obj).unknownFields.a() + i14;
            }
            int H = H(i13);
            int i16 = iArr[i13];
            int G = G(H);
            if (G <= 17) {
                int i17 = iArr[i13 + 2];
                int i18 = i17 & 1048575;
                i10 = 1 << (i17 >>> 20);
                if (i18 != i12) {
                    i15 = unsafe.getInt(obj, i18);
                    i12 = i18;
                }
            } else {
                i10 = 0;
            }
            long j3 = H & 1048575;
            switch (G) {
                case 0:
                    if ((i10 & i15) != 0) {
                        i14 = a4.a.f(i16, 8, i14);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i15 & i10) != 0) {
                        i14 = a4.a.f(i16, 4, i14);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i15 & i10) != 0) {
                        long j10 = unsafe.getLong(obj, j3);
                        y3 = j.y(i16);
                        A = j.A(j10);
                        y12 = A + y3;
                        i14 += y12;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i15 & i10) != 0) {
                        long j11 = unsafe.getLong(obj, j3);
                        y3 = j.y(i16);
                        A = j.A(j11);
                        y12 = A + y3;
                        i14 += y12;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i15 & i10) != 0) {
                        int i19 = unsafe.getInt(obj, j3);
                        y10 = j.y(i16);
                        w10 = j.w(i19);
                        u10 = w10 + y10;
                        i14 += u10;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i15 & i10) != 0) {
                        u10 = j.u(i16);
                        i14 += u10;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i15 & i10) != 0) {
                        u10 = j.t(i16);
                        i14 += u10;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i15 & i10) != 0) {
                        i14 = a4.a.f(i16, 1, i14);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j3);
                        if (object instanceof g) {
                            int y13 = j.y(i16);
                            int size = ((g) object).size();
                            g10 = a4.a.g(size, size, y13, i14);
                            i14 = g10;
                            break;
                        } else {
                            y11 = j.y(i16);
                            x10 = j.x((String) object);
                            g10 = x10 + y11 + i14;
                            i14 = g10;
                        }
                    }
                case 9:
                    if ((i15 & i10) != 0) {
                        Object object2 = unsafe.getObject(obj, j3);
                        b1 n10 = n(i13);
                        Class cls = c1.a;
                        int y14 = j.y(i16);
                        int b10 = ((a) object2).b(n10);
                        i14 = a4.a.g(b10, b10, y14, i14);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i15 & i10) != 0) {
                        u10 = j.r(i16, (g) unsafe.getObject(obj, j3));
                        i14 += u10;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i15 & i10) != 0) {
                        int i20 = unsafe.getInt(obj, j3);
                        y10 = j.y(i16);
                        w10 = j.z(i20);
                        u10 = w10 + y10;
                        i14 += u10;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i15 & i10) != 0) {
                        int i21 = unsafe.getInt(obj, j3);
                        y10 = j.y(i16);
                        w10 = j.w(i21);
                        u10 = w10 + y10;
                        i14 += u10;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i15 & i10) != 0) {
                        i14 = a4.a.f(i16, 4, i14);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i10 & i15) != 0) {
                        i14 = a4.a.f(i16, 8, i14);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i15 & i10) != 0) {
                        int i22 = unsafe.getInt(obj, j3);
                        y10 = j.y(i16);
                        w10 = j.z((i22 >> 31) ^ (i22 << 1));
                        u10 = w10 + y10;
                        i14 += u10;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i15 & i10) != 0) {
                        long j12 = unsafe.getLong(obj, j3);
                        y3 = j.y(i16);
                        A = j.A((j12 >> 63) ^ (j12 << 1));
                        y12 = A + y3;
                        i14 += y12;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i15 & i10) != 0) {
                        u10 = j.v(i16, (a) unsafe.getObject(obj, j3), n(i13));
                        i14 += u10;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    u10 = c1.f(i16, (List) unsafe.getObject(obj, j3));
                    i14 += u10;
                    break;
                case 19:
                    u10 = c1.d(i16, (List) unsafe.getObject(obj, j3));
                    i14 += u10;
                    break;
                case 20:
                    u10 = c1.j(i16, (List) unsafe.getObject(obj, j3));
                    i14 += u10;
                    break;
                case 21:
                    u10 = c1.t(i16, (List) unsafe.getObject(obj, j3));
                    i14 += u10;
                    break;
                case 22:
                    u10 = c1.h(i16, (List) unsafe.getObject(obj, j3));
                    i14 += u10;
                    break;
                case 23:
                    u10 = c1.f(i16, (List) unsafe.getObject(obj, j3));
                    i14 += u10;
                    break;
                case 24:
                    u10 = c1.d(i16, (List) unsafe.getObject(obj, j3));
                    i14 += u10;
                    break;
                case 25:
                    List list = (List) unsafe.getObject(obj, j3);
                    Class cls2 = c1.a;
                    int size2 = list.size();
                    y12 = size2 == 0 ? 0 : (j.y(i16) + 1) * size2;
                    i14 += y12;
                    break;
                case 26:
                    u10 = c1.q(i16, (List) unsafe.getObject(obj, j3));
                    i14 += u10;
                    break;
                case 27:
                    u10 = c1.l(i16, (List) unsafe.getObject(obj, j3), n(i13));
                    i14 += u10;
                    break;
                case 28:
                    u10 = c1.a(i16, (List) unsafe.getObject(obj, j3));
                    i14 += u10;
                    break;
                case 29:
                    u10 = c1.r(i16, (List) unsafe.getObject(obj, j3));
                    i14 += u10;
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    u10 = c1.b(i16, (List) unsafe.getObject(obj, j3));
                    i14 += u10;
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    u10 = c1.d(i16, (List) unsafe.getObject(obj, j3));
                    i14 += u10;
                    break;
                case 32:
                    u10 = c1.f(i16, (List) unsafe.getObject(obj, j3));
                    i14 += u10;
                    break;
                case 33:
                    u10 = c1.m(i16, (List) unsafe.getObject(obj, j3));
                    i14 += u10;
                    break;
                case 34:
                    u10 = c1.o(i16, (List) unsafe.getObject(obj, j3));
                    i14 += u10;
                    break;
                case 35:
                    int g11 = c1.g((List) unsafe.getObject(obj, j3));
                    if (g11 > 0) {
                        i14 = a4.a.g(g11, j.y(i16), g11, i14);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int e = c1.e((List) unsafe.getObject(obj, j3));
                    if (e > 0) {
                        i14 = a4.a.g(e, j.y(i16), e, i14);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int k10 = c1.k((List) unsafe.getObject(obj, j3));
                    if (k10 > 0) {
                        i14 = a4.a.g(k10, j.y(i16), k10, i14);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int u11 = c1.u((List) unsafe.getObject(obj, j3));
                    if (u11 > 0) {
                        i14 = a4.a.g(u11, j.y(i16), u11, i14);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    int i23 = c1.i((List) unsafe.getObject(obj, j3));
                    if (i23 > 0) {
                        i14 = a4.a.g(i23, j.y(i16), i23, i14);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    int g12 = c1.g((List) unsafe.getObject(obj, j3));
                    if (g12 > 0) {
                        i14 = a4.a.g(g12, j.y(i16), g12, i14);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    int e7 = c1.e((List) unsafe.getObject(obj, j3));
                    if (e7 > 0) {
                        i14 = a4.a.g(e7, j.y(i16), e7, i14);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    List list2 = (List) unsafe.getObject(obj, j3);
                    Class cls3 = c1.a;
                    int size3 = list2.size();
                    if (size3 > 0) {
                        i14 = a4.a.g(size3, j.y(i16), size3, i14);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    int s10 = c1.s((List) unsafe.getObject(obj, j3));
                    if (s10 > 0) {
                        i14 = a4.a.g(s10, j.y(i16), s10, i14);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    int c10 = c1.c((List) unsafe.getObject(obj, j3));
                    if (c10 > 0) {
                        i14 = a4.a.g(c10, j.y(i16), c10, i14);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    int e10 = c1.e((List) unsafe.getObject(obj, j3));
                    if (e10 > 0) {
                        i14 = a4.a.g(e10, j.y(i16), e10, i14);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    int g13 = c1.g((List) unsafe.getObject(obj, j3));
                    if (g13 > 0) {
                        i14 = a4.a.g(g13, j.y(i16), g13, i14);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    int n11 = c1.n((List) unsafe.getObject(obj, j3));
                    if (n11 > 0) {
                        i14 = a4.a.g(n11, j.y(i16), n11, i14);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int p5 = c1.p((List) unsafe.getObject(obj, j3));
                    if (p5 > 0) {
                        i14 = a4.a.g(p5, j.y(i16), p5, i14);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    List list3 = (List) unsafe.getObject(obj, j3);
                    b1 n12 = n(i13);
                    Class cls4 = c1.a;
                    int size4 = list3.size();
                    if (size4 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 0;
                        for (int i24 = 0; i24 < size4; i24++) {
                            i11 += j.v(i16, (a) list3.get(i24), n12);
                        }
                    }
                    i14 += i11;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Object object3 = unsafe.getObject(obj, j3);
                    Object m10 = m(i13);
                    this.n.getClass();
                    u10 = o0.a(i16, object3, m10);
                    i14 += u10;
                    break;
                case 51:
                    if (r(i16, i13, obj)) {
                        i14 = a4.a.f(i16, 8, i14);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (r(i16, i13, obj)) {
                        i14 = a4.a.f(i16, 4, i14);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (r(i16, i13, obj)) {
                        long A2 = A(obj, j3);
                        y3 = j.y(i16);
                        A = j.A(A2);
                        y12 = A + y3;
                        i14 += y12;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (r(i16, i13, obj)) {
                        long A3 = A(obj, j3);
                        y3 = j.y(i16);
                        A = j.A(A3);
                        y12 = A + y3;
                        i14 += y12;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (r(i16, i13, obj)) {
                        int z10 = z(obj, j3);
                        y10 = j.y(i16);
                        w10 = j.w(z10);
                        u10 = w10 + y10;
                        i14 += u10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (r(i16, i13, obj)) {
                        u10 = j.u(i16);
                        i14 += u10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (r(i16, i13, obj)) {
                        u10 = j.t(i16);
                        i14 += u10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (r(i16, i13, obj)) {
                        i14 = a4.a.f(i16, 1, i14);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!r(i16, i13, obj)) {
                        break;
                    } else {
                        Object object4 = unsafe.getObject(obj, j3);
                        if (object4 instanceof g) {
                            int y15 = j.y(i16);
                            int size5 = ((g) object4).size();
                            g10 = a4.a.g(size5, size5, y15, i14);
                            i14 = g10;
                            break;
                        } else {
                            y11 = j.y(i16);
                            x10 = j.x((String) object4);
                            g10 = x10 + y11 + i14;
                            i14 = g10;
                        }
                    }
                case 60:
                    if (r(i16, i13, obj)) {
                        Object object5 = unsafe.getObject(obj, j3);
                        b1 n13 = n(i13);
                        Class cls5 = c1.a;
                        int y16 = j.y(i16);
                        int b11 = ((a) object5).b(n13);
                        i14 = a4.a.g(b11, b11, y16, i14);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (r(i16, i13, obj)) {
                        u10 = j.r(i16, (g) unsafe.getObject(obj, j3));
                        i14 += u10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (r(i16, i13, obj)) {
                        int z11 = z(obj, j3);
                        y10 = j.y(i16);
                        w10 = j.z(z11);
                        u10 = w10 + y10;
                        i14 += u10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (r(i16, i13, obj)) {
                        int z12 = z(obj, j3);
                        y10 = j.y(i16);
                        w10 = j.w(z12);
                        u10 = w10 + y10;
                        i14 += u10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (r(i16, i13, obj)) {
                        i14 = a4.a.f(i16, 4, i14);
                        break;
                    } else {
                        break;
                    }
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (r(i16, i13, obj)) {
                        i14 = a4.a.f(i16, 8, i14);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (r(i16, i13, obj)) {
                        int z13 = z(obj, j3);
                        y10 = j.y(i16);
                        w10 = j.z((z13 >> 31) ^ (z13 << 1));
                        u10 = w10 + y10;
                        i14 += u10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (r(i16, i13, obj)) {
                        long A4 = A(obj, j3);
                        y3 = j.y(i16);
                        A = j.A((A4 >> 63) ^ (A4 << 1));
                        y12 = A + y3;
                        i14 += y12;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (r(i16, i13, obj)) {
                        u10 = j.v(i16, (a) unsafe.getObject(obj, j3), n(i13));
                        i14 += u10;
                        break;
                    } else {
                        break;
                    }
            }
            i13 += 3;
        }
    }

    public final int p(Object obj) {
        int y3;
        int A;
        int y10;
        int w10;
        int u10;
        int y11;
        int x10;
        int y12;
        int A2;
        int i10;
        Unsafe unsafe = p;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i11 >= iArr.length) {
                this.m.getClass();
                return ((w) obj).unknownFields.a() + i12;
            }
            int H = H(i11);
            int G = G(H);
            int i13 = iArr[i11];
            long j3 = H & 1048575;
            if (G >= r.b.a && G <= r.c.a) {
                int i14 = iArr[i11 + 2];
            }
            switch (G) {
                case 0:
                    if (q(i11, obj)) {
                        i12 = a4.a.f(i13, 8, i12);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (q(i11, obj)) {
                        i12 = a4.a.f(i13, 4, i12);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (q(i11, obj)) {
                        long h = r1.d.h(obj, j3);
                        y3 = j.y(i13);
                        A = j.A(h);
                        u10 = A + y3;
                        i12 += u10;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (q(i11, obj)) {
                        long h10 = r1.d.h(obj, j3);
                        y3 = j.y(i13);
                        A = j.A(h10);
                        u10 = A + y3;
                        i12 += u10;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (q(i11, obj)) {
                        int g10 = r1.d.g(obj, j3);
                        y10 = j.y(i13);
                        w10 = j.w(g10);
                        u10 = w10 + y10;
                        i12 += u10;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (q(i11, obj)) {
                        u10 = j.u(i13);
                        i12 += u10;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (q(i11, obj)) {
                        u10 = j.t(i13);
                        i12 += u10;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (q(i11, obj)) {
                        i12 = a4.a.f(i13, 1, i12);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (q(i11, obj)) {
                        Object i15 = r1.d.i(obj, j3);
                        if (i15 instanceof g) {
                            int y13 = j.y(i13);
                            int size = ((g) i15).size();
                            i12 = a4.a.g(size, size, y13, i12);
                            break;
                        } else {
                            y11 = j.y(i13);
                            x10 = j.x((String) i15);
                            i12 = x10 + y11 + i12;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (q(i11, obj)) {
                        Object i16 = r1.d.i(obj, j3);
                        b1 n10 = n(i11);
                        Class cls = c1.a;
                        int y14 = j.y(i13);
                        int b10 = ((a) i16).b(n10);
                        i12 = a4.a.g(b10, b10, y14, i12);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (q(i11, obj)) {
                        u10 = j.r(i13, (g) r1.d.i(obj, j3));
                        i12 += u10;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (q(i11, obj)) {
                        int g11 = r1.d.g(obj, j3);
                        y10 = j.y(i13);
                        w10 = j.z(g11);
                        u10 = w10 + y10;
                        i12 += u10;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (q(i11, obj)) {
                        int g12 = r1.d.g(obj, j3);
                        y10 = j.y(i13);
                        w10 = j.w(g12);
                        u10 = w10 + y10;
                        i12 += u10;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (q(i11, obj)) {
                        i12 = a4.a.f(i13, 4, i12);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (q(i11, obj)) {
                        i12 = a4.a.f(i13, 8, i12);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (q(i11, obj)) {
                        int g13 = r1.d.g(obj, j3);
                        y10 = j.y(i13);
                        w10 = j.z((g13 >> 31) ^ (g13 << 1));
                        u10 = w10 + y10;
                        i12 += u10;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (q(i11, obj)) {
                        long h11 = r1.d.h(obj, j3);
                        y12 = j.y(i13);
                        A2 = j.A((h11 >> 63) ^ (h11 << 1));
                        u10 = A2 + y12;
                        i12 += u10;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (q(i11, obj)) {
                        u10 = j.v(i13, (a) r1.d.i(obj, j3), n(i11));
                        i12 += u10;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    u10 = c1.f(i13, s(obj, j3));
                    i12 += u10;
                    break;
                case 19:
                    u10 = c1.d(i13, s(obj, j3));
                    i12 += u10;
                    break;
                case 20:
                    u10 = c1.j(i13, s(obj, j3));
                    i12 += u10;
                    break;
                case 21:
                    u10 = c1.t(i13, s(obj, j3));
                    i12 += u10;
                    break;
                case 22:
                    u10 = c1.h(i13, s(obj, j3));
                    i12 += u10;
                    break;
                case 23:
                    u10 = c1.f(i13, s(obj, j3));
                    i12 += u10;
                    break;
                case 24:
                    u10 = c1.d(i13, s(obj, j3));
                    i12 += u10;
                    break;
                case 25:
                    List s10 = s(obj, j3);
                    Class cls2 = c1.a;
                    int size2 = s10.size();
                    i12 += size2 == 0 ? 0 : (j.y(i13) + 1) * size2;
                    break;
                case 26:
                    u10 = c1.q(i13, s(obj, j3));
                    i12 += u10;
                    break;
                case 27:
                    u10 = c1.l(i13, s(obj, j3), n(i11));
                    i12 += u10;
                    break;
                case 28:
                    u10 = c1.a(i13, s(obj, j3));
                    i12 += u10;
                    break;
                case 29:
                    u10 = c1.r(i13, s(obj, j3));
                    i12 += u10;
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    u10 = c1.b(i13, s(obj, j3));
                    i12 += u10;
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    u10 = c1.d(i13, s(obj, j3));
                    i12 += u10;
                    break;
                case 32:
                    u10 = c1.f(i13, s(obj, j3));
                    i12 += u10;
                    break;
                case 33:
                    u10 = c1.m(i13, s(obj, j3));
                    i12 += u10;
                    break;
                case 34:
                    u10 = c1.o(i13, s(obj, j3));
                    i12 += u10;
                    break;
                case 35:
                    int g14 = c1.g((List) unsafe.getObject(obj, j3));
                    if (g14 > 0) {
                        i12 = a4.a.g(g14, j.y(i13), g14, i12);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int e = c1.e((List) unsafe.getObject(obj, j3));
                    if (e > 0) {
                        i12 = a4.a.g(e, j.y(i13), e, i12);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int k10 = c1.k((List) unsafe.getObject(obj, j3));
                    if (k10 > 0) {
                        i12 = a4.a.g(k10, j.y(i13), k10, i12);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int u11 = c1.u((List) unsafe.getObject(obj, j3));
                    if (u11 > 0) {
                        i12 = a4.a.g(u11, j.y(i13), u11, i12);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    int i17 = c1.i((List) unsafe.getObject(obj, j3));
                    if (i17 > 0) {
                        i12 = a4.a.g(i17, j.y(i13), i17, i12);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    int g15 = c1.g((List) unsafe.getObject(obj, j3));
                    if (g15 > 0) {
                        i12 = a4.a.g(g15, j.y(i13), g15, i12);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    int e7 = c1.e((List) unsafe.getObject(obj, j3));
                    if (e7 > 0) {
                        i12 = a4.a.g(e7, j.y(i13), e7, i12);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    List list = (List) unsafe.getObject(obj, j3);
                    Class cls3 = c1.a;
                    int size3 = list.size();
                    if (size3 > 0) {
                        i12 = a4.a.g(size3, j.y(i13), size3, i12);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    int s11 = c1.s((List) unsafe.getObject(obj, j3));
                    if (s11 > 0) {
                        i12 = a4.a.g(s11, j.y(i13), s11, i12);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    int c10 = c1.c((List) unsafe.getObject(obj, j3));
                    if (c10 > 0) {
                        i12 = a4.a.g(c10, j.y(i13), c10, i12);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    int e10 = c1.e((List) unsafe.getObject(obj, j3));
                    if (e10 > 0) {
                        i12 = a4.a.g(e10, j.y(i13), e10, i12);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    int g16 = c1.g((List) unsafe.getObject(obj, j3));
                    if (g16 > 0) {
                        i12 = a4.a.g(g16, j.y(i13), g16, i12);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    int n11 = c1.n((List) unsafe.getObject(obj, j3));
                    if (n11 > 0) {
                        i12 = a4.a.g(n11, j.y(i13), n11, i12);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int p5 = c1.p((List) unsafe.getObject(obj, j3));
                    if (p5 > 0) {
                        i12 = a4.a.g(p5, j.y(i13), p5, i12);
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    List s12 = s(obj, j3);
                    b1 n12 = n(i11);
                    Class cls4 = c1.a;
                    int size4 = s12.size();
                    if (size4 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 0;
                        for (int i18 = 0; i18 < size4; i18++) {
                            i10 += j.v(i13, (a) s12.get(i18), n12);
                        }
                    }
                    i12 += i10;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Object i19 = r1.d.i(obj, j3);
                    Object m10 = m(i11);
                    this.n.getClass();
                    u10 = o0.a(i13, i19, m10);
                    i12 += u10;
                    break;
                case 51:
                    if (r(i13, i11, obj)) {
                        i12 = a4.a.f(i13, 8, i12);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (r(i13, i11, obj)) {
                        i12 = a4.a.f(i13, 4, i12);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (r(i13, i11, obj)) {
                        long A3 = A(obj, j3);
                        y3 = j.y(i13);
                        A = j.A(A3);
                        u10 = A + y3;
                        i12 += u10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (r(i13, i11, obj)) {
                        long A4 = A(obj, j3);
                        y3 = j.y(i13);
                        A = j.A(A4);
                        u10 = A + y3;
                        i12 += u10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (r(i13, i11, obj)) {
                        int z10 = z(obj, j3);
                        y10 = j.y(i13);
                        w10 = j.w(z10);
                        u10 = w10 + y10;
                        i12 += u10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (r(i13, i11, obj)) {
                        u10 = j.u(i13);
                        i12 += u10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (r(i13, i11, obj)) {
                        u10 = j.t(i13);
                        i12 += u10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (r(i13, i11, obj)) {
                        i12 = a4.a.f(i13, 1, i12);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (r(i13, i11, obj)) {
                        Object i20 = r1.d.i(obj, j3);
                        if (i20 instanceof g) {
                            int y15 = j.y(i13);
                            int size5 = ((g) i20).size();
                            i12 = a4.a.g(size5, size5, y15, i12);
                            break;
                        } else {
                            y11 = j.y(i13);
                            x10 = j.x((String) i20);
                            i12 = x10 + y11 + i12;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (r(i13, i11, obj)) {
                        Object i21 = r1.d.i(obj, j3);
                        b1 n13 = n(i11);
                        Class cls5 = c1.a;
                        int y16 = j.y(i13);
                        int b11 = ((a) i21).b(n13);
                        i12 = a4.a.g(b11, b11, y16, i12);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (r(i13, i11, obj)) {
                        u10 = j.r(i13, (g) r1.d.i(obj, j3));
                        i12 += u10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (r(i13, i11, obj)) {
                        int z11 = z(obj, j3);
                        y10 = j.y(i13);
                        w10 = j.z(z11);
                        u10 = w10 + y10;
                        i12 += u10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (r(i13, i11, obj)) {
                        int z12 = z(obj, j3);
                        y10 = j.y(i13);
                        w10 = j.w(z12);
                        u10 = w10 + y10;
                        i12 += u10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (r(i13, i11, obj)) {
                        i12 = a4.a.f(i13, 4, i12);
                        break;
                    } else {
                        break;
                    }
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (r(i13, i11, obj)) {
                        i12 = a4.a.f(i13, 8, i12);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (r(i13, i11, obj)) {
                        int z13 = z(obj, j3);
                        y10 = j.y(i13);
                        w10 = j.z((z13 >> 31) ^ (z13 << 1));
                        u10 = w10 + y10;
                        i12 += u10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (r(i13, i11, obj)) {
                        long A5 = A(obj, j3);
                        y12 = j.y(i13);
                        A2 = j.A((A5 >> 63) ^ (A5 << 1));
                        u10 = A2 + y12;
                        i12 += u10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (r(i13, i11, obj)) {
                        u10 = j.v(i13, (a) r1.d.i(obj, j3), n(i11));
                        i12 += u10;
                        break;
                    } else {
                        break;
                    }
            }
            i11 += 3;
        }
    }

    public final boolean q(int i10, Object obj) {
        if (this.g) {
            int H = H(i10);
            long j3 = H & 1048575;
            switch (G(H)) {
                case 0:
                    if (r1.d.e(obj, j3) == 0.0d) {
                        return false;
                    }
                    break;
                case 1:
                    if (r1.d.f(obj, j3) == 0.0f) {
                        return false;
                    }
                    break;
                case 2:
                    if (r1.d.h(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (r1.d.h(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (r1.d.g(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (r1.d.h(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (r1.d.g(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return r1.d.c(obj, j3);
                case 8:
                    Object i11 = r1.d.i(obj, j3);
                    if (i11 instanceof String) {
                        return !((String) i11).isEmpty();
                    }
                    if (i11 instanceof g) {
                        return !g.c.equals(i11);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (r1.d.i(obj, j3) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !g.c.equals(r1.d.i(obj, j3));
                case 11:
                    if (r1.d.g(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (r1.d.g(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (r1.d.g(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (r1.d.h(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (r1.d.g(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (r1.d.h(obj, j3) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (r1.d.i(obj, j3) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((r1.d.g(obj, r6 & 1048575) & (1 << (this.a[i10 + 2] >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean r(int i10, int i11, Object obj) {
        return r1.d.g(obj, (long) (this.a[i11 + 2] & 1048575)) == i10;
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
    public final void t(Object obj, int i10, Object obj2, m mVar, a0.h hVar) {
        long H = H(i10) & 1048575;
        Object i11 = r1.d.i(obj, H);
        o0 o0Var = this.n;
        if (i11 == null) {
            o0Var.getClass();
            i11 = n0.b.b();
            r1.o(obj, H, i11);
        } else {
            o0Var.getClass();
            if (!((n0) i11).a) {
                n0 b10 = n0.b.b();
                o0.b(b10, i11);
                r1.o(obj, H, b10);
                i11 = b10;
            }
        }
        o0Var.getClass();
        n0 n0Var = (n0) i11;
        l0 l0Var = ((m0) obj2).a;
        hVar.T(2);
        h hVar2 = (h) hVar.c;
        int e = hVar2.e(hVar2.A());
        Object obj3 = l0Var.c;
        Object obj4 = "";
        Object obj5 = obj3;
        while (true) {
            try {
                int d = hVar.d();
                if (d == Integer.MAX_VALUE || hVar2.c()) {
                    break;
                }
                if (d == 1) {
                    obj4 = hVar.n(l0Var.a, null, null);
                } else if (d != 2) {
                    try {
                        if (!hVar.U()) {
                            throw new b0("Unable to parse map entry.");
                        }
                    } catch (a0 unused) {
                        if (!hVar.U()) {
                            throw new b0("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj5 = hVar.n(l0Var.b, obj3.getClass(), mVar);
                }
            } catch (Throwable th2) {
                hVar2.d(e);
                throw th2;
            }
        }
    }

    public final void u(int i10, Object obj, Object obj2) {
        long H = H(i10) & 1048575;
        if (q(i10, obj2)) {
            q1 q1Var = r1.d;
            Object i11 = q1Var.i(obj, H);
            Object i12 = q1Var.i(obj2, H);
            if (i11 != null && i12 != null) {
                r1.o(obj, H, z.c(i11, i12));
                E(i10, obj);
            } else if (i12 != null) {
                r1.o(obj, H, i12);
                E(i10, obj);
            }
        }
    }

    public final void v(int i10, Object obj, Object obj2) {
        int H = H(i10);
        int i11 = this.a[i10];
        long j3 = H & 1048575;
        if (r(i11, i10, obj2)) {
            q1 q1Var = r1.d;
            Object i12 = q1Var.i(obj, j3);
            Object i13 = q1Var.i(obj2, j3);
            if (i12 != null && i13 != null) {
                r1.o(obj, j3, z.c(i12, i13));
                F(i11, i10, obj);
            } else if (i13 != null) {
                r1.o(obj, j3, i13);
                F(i11, i10, obj);
            }
        }
    }
}
