// default package

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Level;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class hze implements o1f {
    public static final int[] n = new int[0];
    public static final Unsafe o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final hie e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final k0f j;
    public final qve k;
    public final d4f l;
    public final zxe m;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new r2((byte) 5));
        } catch (Throwable unused) {
            unsafe = null;
        }
        o = unsafe;
    }

    public hze(int[] iArr, Object[] objArr, int i, int i2, hie hieVar, boolean z, int[] iArr2, int i3, int i4, k0f k0fVar, qve qveVar, d4f d4fVar, npe npeVar, zxe zxeVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = z;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = k0fVar;
        this.k = qveVar;
        this.l = d4fVar;
        this.e = hieVar;
        this.m = zxeVar;
    }

    public static long A(long j, Object obj) {
        return ((Long) a5f.l(obj, j)).longValue();
    }

    public static h4f B(Object obj) {
        ese eseVar = (ese) obj;
        h4f h4fVar = eseVar.zzb;
        if (h4fVar != h4f.f) {
            return h4fVar;
        }
        h4f b = h4f.b();
        eseVar.zzb = b;
        return b;
    }

    public static Field k(Class cls, String str) {
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
            xi4.l(c00.k(sb, " not found. Known fields are ", arrays));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static hze l(j1f j1fVar, k0f k0fVar, qve qveVar, d4f d4fVar, npe npeVar, zxe zxeVar) {
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        char charAt4;
        int i7;
        char charAt5;
        int i8;
        char charAt6;
        int i9;
        char charAt7;
        int i10;
        char charAt8;
        int i11;
        char charAt9;
        int i12;
        char charAt10;
        int i13;
        char charAt11;
        Object[] objArr;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        Field k;
        char charAt12;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field k2;
        Object obj2;
        Field k3;
        int i27;
        char charAt13;
        int i28;
        int i29;
        char charAt14;
        int i30;
        int i31;
        char charAt15;
        int i32;
        char charAt16;
        if (!(j1fVar instanceof j1f)) {
            grb.o();
            return null;
        }
        boolean z = (j1fVar.d & 1) != 1;
        String str = j1fVar.b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i33 = 1;
            while (true) {
                i = i33 + 1;
                if (str.charAt(i33) < 55296) {
                    break;
                }
                i33 = i;
            }
        } else {
            i = 1;
        }
        int i34 = i + 1;
        int charAt17 = str.charAt(i);
        if (charAt17 >= 55296) {
            int i35 = charAt17 & 8191;
            int i36 = 13;
            while (true) {
                i32 = i34 + 1;
                charAt16 = str.charAt(i34);
                if (charAt16 < 55296) {
                    break;
                }
                i35 |= (charAt16 & 8191) << i36;
                i36 += 13;
                i34 = i32;
            }
            charAt17 = i35 | (charAt16 << i36);
            i34 = i32;
        }
        if (charAt17 == 0) {
            i5 = 0;
            charAt = 0;
            charAt2 = 0;
            i2 = 0;
            charAt3 = 0;
            iArr = n;
            i3 = 0;
            i4 = 0;
        } else {
            int i37 = i34 + 1;
            int charAt18 = str.charAt(i34);
            if (charAt18 >= 55296) {
                int i38 = charAt18 & 8191;
                int i39 = 13;
                while (true) {
                    i13 = i37 + 1;
                    charAt11 = str.charAt(i37);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i38 |= (charAt11 & 8191) << i39;
                    i39 += 13;
                    i37 = i13;
                }
                charAt18 = i38 | (charAt11 << i39);
                i37 = i13;
            }
            int i40 = i37 + 1;
            int charAt19 = str.charAt(i37);
            if (charAt19 >= 55296) {
                int i41 = charAt19 & 8191;
                int i42 = 13;
                while (true) {
                    i12 = i40 + 1;
                    charAt10 = str.charAt(i40);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i41 |= (charAt10 & 8191) << i42;
                    i42 += 13;
                    i40 = i12;
                }
                charAt19 = i41 | (charAt10 << i42);
                i40 = i12;
            }
            int i43 = i40 + 1;
            int charAt20 = str.charAt(i40);
            if (charAt20 >= 55296) {
                int i44 = charAt20 & 8191;
                int i45 = 13;
                while (true) {
                    i11 = i43 + 1;
                    charAt9 = str.charAt(i43);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i44 |= (charAt9 & 8191) << i45;
                    i45 += 13;
                    i43 = i11;
                }
                charAt20 = i44 | (charAt9 << i45);
                i43 = i11;
            }
            int i46 = i43 + 1;
            int charAt21 = str.charAt(i43);
            if (charAt21 >= 55296) {
                int i47 = charAt21 & 8191;
                int i48 = 13;
                while (true) {
                    i10 = i46 + 1;
                    charAt8 = str.charAt(i46);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i47 |= (charAt8 & 8191) << i48;
                    i48 += 13;
                    i46 = i10;
                }
                charAt21 = i47 | (charAt8 << i48);
                i46 = i10;
            }
            int i49 = i46 + 1;
            charAt = str.charAt(i46);
            if (charAt >= 55296) {
                int i50 = charAt & 8191;
                int i51 = 13;
                while (true) {
                    i9 = i49 + 1;
                    charAt7 = str.charAt(i49);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i50 |= (charAt7 & 8191) << i51;
                    i51 += 13;
                    i49 = i9;
                }
                charAt = i50 | (charAt7 << i51);
                i49 = i9;
            }
            int i52 = i49 + 1;
            charAt2 = str.charAt(i49);
            if (charAt2 >= 55296) {
                int i53 = charAt2 & 8191;
                int i54 = 13;
                while (true) {
                    i8 = i52 + 1;
                    charAt6 = str.charAt(i52);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i53 |= (charAt6 & 8191) << i54;
                    i54 += 13;
                    i52 = i8;
                }
                charAt2 = i53 | (charAt6 << i54);
                i52 = i8;
            }
            int i55 = i52 + 1;
            int charAt22 = str.charAt(i52);
            if (charAt22 >= 55296) {
                int i56 = charAt22 & 8191;
                int i57 = 13;
                while (true) {
                    i7 = i55 + 1;
                    charAt5 = str.charAt(i55);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i56 |= (charAt5 & 8191) << i57;
                    i57 += 13;
                    i55 = i7;
                }
                charAt22 = i56 | (charAt5 << i57);
                i55 = i7;
            }
            int i58 = i55 + 1;
            charAt3 = str.charAt(i55);
            if (charAt3 >= 55296) {
                int i59 = charAt3 & 8191;
                int i60 = i58;
                int i61 = 13;
                while (true) {
                    i6 = i60 + 1;
                    charAt4 = str.charAt(i60);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i59 |= (charAt4 & 8191) << i61;
                    i61 += 13;
                    i60 = i6;
                }
                charAt3 = i59 | (charAt4 << i61);
                i58 = i6;
            }
            int[] iArr2 = new int[charAt3 + charAt2 + charAt22];
            i2 = (charAt18 << 1) + charAt19;
            i3 = charAt20;
            i4 = charAt21;
            iArr = iArr2;
            i5 = charAt18;
            i34 = i58;
        }
        Object[] objArr2 = j1fVar.c;
        Class<?> cls = j1fVar.a.getClass();
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr3 = new Object[charAt << 1];
        int i62 = charAt2 + charAt3;
        int i63 = i62;
        int i64 = charAt3;
        int i65 = 0;
        int i66 = 0;
        while (i34 < length) {
            int i67 = i34 + 1;
            int charAt23 = str.charAt(i34);
            int i68 = i5;
            if (charAt23 >= 55296) {
                int i69 = charAt23 & 8191;
                int i70 = i67;
                int i71 = 13;
                while (true) {
                    i31 = i70 + 1;
                    charAt15 = str.charAt(i70);
                    objArr = objArr2;
                    if (charAt15 < 55296) {
                        break;
                    }
                    i69 |= (charAt15 & 8191) << i71;
                    i71 += 13;
                    i70 = i31;
                    objArr2 = objArr;
                }
                charAt23 = i69 | (charAt15 << i71);
                i14 = i31;
            } else {
                objArr = objArr2;
                i14 = i67;
            }
            int i72 = i14 + 1;
            int charAt24 = str.charAt(i14);
            if (charAt24 >= 55296) {
                int i73 = charAt24 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i29 = i74 + 1;
                    charAt14 = str.charAt(i74);
                    i30 = i73;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i73 = i30 | ((charAt14 & 8191) << i75);
                    i75 += 13;
                    i74 = i29;
                }
                charAt24 = i30 | (charAt14 << i75);
                i15 = i29;
            } else {
                i15 = i72;
            }
            int i76 = length;
            int i77 = charAt24 & jn7.d4;
            int i78 = charAt23;
            if ((charAt24 & 1024) != 0) {
                iArr[i65] = i66;
                i65++;
            }
            int[] iArr4 = iArr3;
            Unsafe unsafe = o;
            if (i77 >= 51) {
                int i79 = i15 + 1;
                int charAt25 = str.charAt(i15);
                if (charAt25 >= 55296) {
                    int i80 = charAt25 & 8191;
                    int i81 = i79;
                    int i82 = 13;
                    while (true) {
                        i27 = i81 + 1;
                        charAt13 = str.charAt(i81);
                        i28 = i80;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i80 = i28 | ((charAt13 & 8191) << i82);
                        i82 += 13;
                        i81 = i27;
                    }
                    charAt25 = i28 | (charAt13 << i82);
                    i25 = i27;
                } else {
                    i25 = i79;
                }
                int i83 = charAt25;
                int i84 = i77 - 51;
                int i85 = i25;
                if (i84 == 9 || i84 == 17) {
                    i26 = i2 + 1;
                    objArr3[((i66 / 3) << 1) + 1] = objArr[i2];
                } else {
                    if (i84 == 12 && !z) {
                        i26 = i2 + 1;
                        objArr3[((i66 / 3) << 1) + 1] = objArr[i2];
                    }
                    int i86 = i83 << 1;
                    obj = objArr[i86];
                    if (obj instanceof Field) {
                        k2 = k(cls, (String) obj);
                        objArr[i86] = k2;
                    } else {
                        k2 = (Field) obj;
                    }
                    i16 = i3;
                    i17 = i4;
                    i23 = (int) unsafe.objectFieldOffset(k2);
                    int i87 = i86 + 1;
                    obj2 = objArr[i87];
                    if (obj2 instanceof Field) {
                        k3 = k(cls, (String) obj2);
                        objArr[i87] = k3;
                    } else {
                        k3 = (Field) obj2;
                    }
                    i21 = (int) unsafe.objectFieldOffset(k3);
                    i19 = i85;
                    i22 = 0;
                }
                i2 = i26;
                int i862 = i83 << 1;
                obj = objArr[i862];
                if (obj instanceof Field) {
                }
                i16 = i3;
                i17 = i4;
                i23 = (int) unsafe.objectFieldOffset(k2);
                int i872 = i862 + 1;
                obj2 = objArr[i872];
                if (obj2 instanceof Field) {
                }
                i21 = (int) unsafe.objectFieldOffset(k3);
                i19 = i85;
                i22 = 0;
            } else {
                i16 = i3;
                i17 = i4;
                int i88 = i2 + 1;
                Field k4 = k(cls, (String) objArr[i2]);
                if (i77 == 9 || i77 == 17) {
                    objArr3[((i66 / 3) << 1) + 1] = k4.getType();
                } else {
                    if (i77 == 27 || i77 == 49) {
                        i24 = i2 + 2;
                        objArr3[((i66 / 3) << 1) + 1] = objArr[i88];
                    } else if (i77 == 12 || i77 == 30 || i77 == 44) {
                        if (!z) {
                            i24 = i2 + 2;
                            objArr3[((i66 / 3) << 1) + 1] = objArr[i88];
                        }
                    } else if (i77 == 50) {
                        int i89 = i64 + 1;
                        iArr[i64] = i66;
                        int i90 = (i66 / 3) << 1;
                        int i91 = i2 + 2;
                        objArr3[i90] = objArr[i88];
                        if ((charAt24 & 2048) != 0) {
                            i88 = i2 + 3;
                            objArr3[i90 + 1] = objArr[i91];
                            i64 = i89;
                        } else {
                            i64 = i89;
                            i88 = i91;
                        }
                    }
                    i88 = i24;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(k4);
                if ((charAt24 & TLObject.FLAG_12) != 4096 || i77 > 17) {
                    i2 = i88;
                    i18 = 1048575;
                    i19 = i15;
                    i20 = 0;
                } else {
                    int i92 = i15 + 1;
                    int charAt26 = str.charAt(i15);
                    if (charAt26 >= 55296) {
                        int i93 = charAt26 & 8191;
                        int i94 = 13;
                        while (true) {
                            i19 = i92 + 1;
                            charAt12 = str.charAt(i92);
                            if (charAt12 < 55296) {
                                break;
                            }
                            i93 |= (charAt12 & 8191) << i94;
                            i94 += 13;
                            i92 = i19;
                        }
                        charAt26 = i93 | (charAt12 << i94);
                    } else {
                        i19 = i92;
                    }
                    int i95 = (charAt26 / 32) + (i68 << 1);
                    Object obj3 = objArr[i95];
                    if (obj3 instanceof Field) {
                        k = (Field) obj3;
                    } else {
                        k = k(cls, (String) obj3);
                        objArr[i95] = k;
                    }
                    i2 = i88;
                    i18 = (int) unsafe.objectFieldOffset(k);
                    i20 = charAt26 % 32;
                }
                if (i77 >= 18 && i77 <= 49) {
                    iArr[i63] = objectFieldOffset;
                    i63++;
                }
                i21 = i18;
                i22 = i20;
                i23 = objectFieldOffset;
            }
            int i96 = i66 + 1;
            iArr4[i66] = i78;
            int i97 = i66 + 2;
            String str2 = str;
            iArr4[i96] = ((charAt24 & 512) != 0 ? TLObject.FLAG_29 : 0) | ((charAt24 & 256) != 0 ? TLObject.FLAG_28 : 0) | (i77 << 20) | i23;
            i66 += 3;
            iArr4[i97] = (i22 << 20) | i21;
            str = str2;
            length = i76;
            i5 = i68;
            objArr2 = objArr;
            i34 = i19;
            iArr3 = iArr4;
            i3 = i16;
            i4 = i17;
        }
        return new hze(iArr3, objArr3, i3, i4, j1fVar.a, z, iArr, charAt3, i62, k0fVar, qveVar, d4fVar, npeVar, zxeVar);
    }

    public static void n(int i, Object obj, g9d g9dVar) {
        if (!(obj instanceof String)) {
            g9dVar.b(i, (jne) obj);
            return;
        }
        String str = (String) obj;
        coe coeVar = (coe) g9dVar.b;
        coeVar.c(i, 2);
        byte[] bArr = coeVar.b;
        int i2 = coeVar.d;
        try {
            int t = coe.t(str.length() * 3);
            int t2 = coe.t(str.length());
            if (t2 != t) {
                coeVar.g(h5f.a(str));
                coeVar.d = h5f.a.b(str, bArr, coeVar.d, coeVar.e());
                return;
            }
            int i3 = i2 + t2;
            coeVar.d = i3;
            int b = h5f.a.b(str, bArr, i3, coeVar.e());
            coeVar.d = i2;
            coeVar.g((b - i2) - t2);
            coeVar.d = b;
        } catch (IndexOutOfBoundsException e) {
            throw new doe(e);
        } catch (q5f e2) {
            coeVar.d = i2;
            coe.e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(xse.a);
            try {
                coeVar.g(bytes.length);
                coeVar.k(bytes, 0, bytes.length);
            } catch (doe e3) {
                throw e3;
            } catch (IndexOutOfBoundsException e4) {
                throw new doe(e4);
            }
        }
    }

    public static int z(long j, Object obj) {
        return ((Integer) a5f.l(obj, j)).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e1, code lost:
    
        return false;
     */
    @Override // o1f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Object obj) {
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            boolean z = true;
            if (i2 >= this.h) {
                return true;
            }
            int i4 = this.g[i2];
            int[] iArr = this.a;
            int i5 = iArr[i4];
            int y = y(i4);
            int i6 = iArr[i4 + 2];
            int i7 = i6 & 1048575;
            int i8 = 1 << (i6 >>> 20);
            if (i7 != i) {
                if (i7 != 1048575) {
                    i3 = o.getInt(obj, i7);
                }
                i = i7;
            }
            if ((268435456 & y) != 0) {
                if (!(i == 1048575 ? r(i4, obj) : (i3 & i8) != 0)) {
                    break;
                }
            }
            int i9 = (267386880 & y) >>> 20;
            if (i9 == 9 || i9 == 17) {
                if (i == 1048575) {
                    z = r(i4, obj);
                } else if ((i8 & i3) == 0) {
                    z = false;
                }
                if (z && !m(i4).a(a5f.l(obj, y & 1048575))) {
                    break;
                }
                i2++;
            } else {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (q(i5, i4, obj) && !m(i4).a(a5f.l(obj, y & 1048575))) {
                            break;
                        }
                    } else if (i9 != 49) {
                        if (i9 == 50) {
                            Object l = a5f.l(obj, y & 1048575);
                            this.m.getClass();
                            if (!((rxe) l).isEmpty()) {
                                if (t(i4) == null) {
                                    throw new NoSuchMethodError();
                                }
                                grb.o();
                                return false;
                            }
                        } else {
                            continue;
                        }
                    }
                    i2++;
                }
                List list = (List) a5f.l(obj, y & 1048575);
                if (!list.isEmpty()) {
                    o1f m = m(i4);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!m.a(list.get(i10))) {
                            break loop0;
                        }
                    }
                } else {
                    continue;
                }
                i2++;
            }
        }
    }

    @Override // o1f
    public final void b(Object obj) {
        int[] iArr;
        int i;
        int i2 = this.h;
        while (true) {
            iArr = this.g;
            i = this.i;
            if (i2 >= i) {
                break;
            }
            long y = y(iArr[i2]) & 1048575;
            Object l = a5f.l(obj, y);
            if (l != null) {
                this.m.getClass();
                ((rxe) l).a = false;
                a5f.d(y, obj, l);
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.k.b(iArr[i], obj);
            i++;
        }
        this.l.getClass();
        ((ese) obj).zzb.e = false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:81:0x009f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o1f
    public final void c(Object obj, byte[] bArr, int i, int i2, lfd lfdVar) {
        int i3;
        int i4;
        int i5;
        Object obj2;
        int i6;
        int i7;
        int i8;
        int i9;
        Object obj3;
        int i10;
        int i11;
        Object obj4;
        int i12;
        int i13;
        int i14;
        hze hzeVar = this;
        Object obj5 = obj;
        byte[] bArr2 = bArr;
        int i15 = i2;
        lfd lfdVar2 = lfdVar;
        if (!hzeVar.f) {
            j(obj5, bArr, i, i15, 0, lfdVar);
            return;
        }
        int i16 = i;
        int i17 = -1;
        int i18 = 0;
        int i19 = 1048575;
        int i20 = 0;
        while (true) {
            Unsafe unsafe = o;
            if (i16 >= i15) {
                int i21 = i15;
                int i22 = i19;
                int i23 = i20;
                Object obj6 = obj5;
                if (i22 != 1048575) {
                    unsafe.putInt(obj6, i22, i23);
                }
                if (i16 != i21) {
                    throw new wte("Failed to parse the message.");
                }
                return;
            }
            int i24 = i16 + 1;
            int i25 = bArr2[i16];
            if (i25 < 0) {
                i24 = a7f.d(i25, bArr2, i24, lfdVar2);
                i25 = lfdVar2.a;
            }
            int i26 = i24;
            int i27 = i25 >>> 3;
            int i28 = i25 & 7;
            int i29 = hzeVar.d;
            int i30 = hzeVar.c;
            if (i27 > i17) {
                i4 = (i27 < i30 || i27 > i29) ? -1 : hzeVar.s(i27, i18 / 3);
                i3 = 0;
            } else if (i27 < i30 || i27 > i29) {
                i3 = 0;
                i4 = -1;
            } else {
                i3 = 0;
                i4 = hzeVar.s(i27, 0);
            }
            int i31 = i4;
            if (i31 == -1) {
                i5 = i25;
                obj2 = obj5;
                i6 = i20;
                i7 = i26;
                i8 = i3;
            } else {
                int[] iArr = hzeVar.a;
                int i32 = iArr[i31 + 1];
                int i33 = (i32 & 267386880) >>> 20;
                int i34 = i25;
                long j = i32 & 1048575;
                if (i33 <= 17) {
                    int i35 = iArr[i31 + 2];
                    int i36 = 1 << (i35 >>> 20);
                    int i37 = i35 & 1048575;
                    if (i37 != i19) {
                        int i38 = 1048575;
                        i9 = 1;
                        if (i19 != 1048575) {
                            unsafe.putInt(obj5, i19, i20);
                            i38 = 1048575;
                        }
                        if (i37 != i38) {
                            i20 = unsafe.getInt(obj5, i37);
                        }
                        i19 = i37;
                    } else {
                        i9 = 1;
                    }
                    switch (i33) {
                        case 0:
                            i10 = i27;
                            if (i28 != i9) {
                                obj3 = obj5;
                                obj2 = obj3;
                                i6 = i20;
                                i7 = i26;
                                i8 = i31;
                                i27 = i10;
                                i5 = i34;
                                break;
                            } else {
                                a5f.c.m(obj5, j, Double.longBitsToDouble(a7f.j(i26, bArr2)));
                                i20 |= i36;
                                obj5 = obj5;
                                i16 = i26 + 8;
                                i18 = i31;
                                i17 = i10;
                                break;
                            }
                        case 1:
                            i10 = i27;
                            if (i28 != 5) {
                                obj3 = obj5;
                                obj2 = obj3;
                                i6 = i20;
                                i7 = i26;
                                i8 = i31;
                                i27 = i10;
                                i5 = i34;
                                break;
                            } else {
                                a5f.c.n(obj5, j, Float.intBitsToFloat(a7f.a(i26, bArr2)));
                                i16 = i26 + 4;
                                i20 |= i36;
                                i18 = i31;
                                i17 = i10;
                                break;
                            }
                        case 2:
                        case 3:
                            i10 = i27;
                            if (i28 != 0) {
                                obj3 = obj5;
                                obj2 = obj3;
                                i6 = i20;
                                i7 = i26;
                                i8 = i31;
                                i27 = i10;
                                i5 = i34;
                                break;
                            } else {
                                i11 = a7f.i(bArr2, i26, lfdVar2);
                                unsafe.putLong(obj5, j, lfdVar2.b);
                                i20 |= i36;
                                i16 = i11;
                                i18 = i31;
                                i17 = i10;
                                break;
                            }
                        case 4:
                        case 11:
                            i10 = i27;
                            if (i28 != 0) {
                                obj3 = obj5;
                                obj2 = obj3;
                                i6 = i20;
                                i7 = i26;
                                i8 = i31;
                                i27 = i10;
                                i5 = i34;
                                break;
                            } else {
                                int h = a7f.h(bArr2, i26, lfdVar2);
                                unsafe.putInt(obj5, j, lfdVar2.a);
                                i20 |= i36;
                                i16 = h;
                                i18 = i31;
                                i17 = i10;
                                break;
                            }
                        case 5:
                        case 14:
                            i10 = i27;
                            if (i28 != i9) {
                                obj3 = obj5;
                                obj2 = obj3;
                                i6 = i20;
                                i7 = i26;
                                i8 = i31;
                                i27 = i10;
                                i5 = i34;
                                break;
                            } else {
                                unsafe.putLong(obj5, j, a7f.j(i26, bArr2));
                                i16 = i26 + 8;
                                i20 |= i36;
                                i18 = i31;
                                i17 = i10;
                                break;
                            }
                        case 6:
                        case 13:
                            i10 = i27;
                            if (i28 != 5) {
                                obj3 = obj5;
                                obj2 = obj3;
                                i6 = i20;
                                i7 = i26;
                                i8 = i31;
                                i27 = i10;
                                i5 = i34;
                                break;
                            } else {
                                unsafe.putInt(obj5, j, a7f.a(i26, bArr2));
                                i16 = i26 + 4;
                                i20 |= i36;
                                i18 = i31;
                                i17 = i10;
                                break;
                            }
                        case 7:
                            i10 = i27;
                            if (i28 != 0) {
                                obj3 = obj5;
                                obj2 = obj3;
                                i6 = i20;
                                i7 = i26;
                                i8 = i31;
                                i27 = i10;
                                i5 = i34;
                                break;
                            } else {
                                i16 = a7f.i(bArr2, i26, lfdVar2);
                                a5f.c.o(obj5, j, lfdVar2.b != 0 ? i9 : 0);
                                i20 |= i36;
                                i18 = i31;
                                i17 = i10;
                                break;
                            }
                        case 8:
                            i10 = i27;
                            if (i28 != 2) {
                                obj3 = obj5;
                                obj2 = obj3;
                                i6 = i20;
                                i7 = i26;
                                i8 = i31;
                                i27 = i10;
                                i5 = i34;
                                break;
                            } else {
                                i16 = (i32 & TLObject.FLAG_29) == 0 ? a7f.k(bArr2, i26, lfdVar2) : a7f.l(bArr2, i26, lfdVar2);
                                unsafe.putObject(obj5, j, lfdVar2.c);
                                i20 |= i36;
                                i18 = i31;
                                i17 = i10;
                                break;
                            }
                        case 9:
                            i10 = i27;
                            if (i28 != 2) {
                                obj3 = obj5;
                                obj2 = obj3;
                                i6 = i20;
                                i7 = i26;
                                i8 = i31;
                                i27 = i10;
                                i5 = i34;
                                break;
                            } else {
                                i16 = a7f.g(hzeVar.m(i31), bArr2, i26, i15, lfdVar2);
                                Object object = unsafe.getObject(obj5, j);
                                Object obj7 = lfdVar2.c;
                                if (object == null) {
                                    unsafe.putObject(obj5, j, obj7);
                                } else {
                                    unsafe.putObject(obj5, j, xse.b(object, obj7));
                                }
                                i20 |= i36;
                                i18 = i31;
                                i17 = i10;
                                break;
                            }
                        case 10:
                            i10 = i27;
                            if (i28 != 2) {
                                obj3 = obj5;
                                obj2 = obj3;
                                i6 = i20;
                                i7 = i26;
                                i8 = i31;
                                i27 = i10;
                                i5 = i34;
                                break;
                            } else {
                                i16 = a7f.m(bArr2, i26, lfdVar2);
                                unsafe.putObject(obj5, j, lfdVar2.c);
                                i20 |= i36;
                                i18 = i31;
                                i17 = i10;
                                break;
                            }
                        case 12:
                            i10 = i27;
                            if (i28 != 0) {
                                obj3 = obj5;
                                obj2 = obj3;
                                i6 = i20;
                                i7 = i26;
                                i8 = i31;
                                i27 = i10;
                                i5 = i34;
                                break;
                            } else {
                                i16 = a7f.h(bArr2, i26, lfdVar2);
                                unsafe.putInt(obj5, j, lfdVar2.a);
                                i20 |= i36;
                                i18 = i31;
                                i17 = i10;
                                break;
                            }
                        case 15:
                            i10 = i27;
                            if (i28 != 0) {
                                obj3 = obj5;
                                obj2 = obj3;
                                i6 = i20;
                                i7 = i26;
                                i8 = i31;
                                i27 = i10;
                                i5 = i34;
                                break;
                            } else {
                                i16 = a7f.h(bArr2, i26, lfdVar2);
                                unsafe.putInt(obj5, j, g7f.a(lfdVar2.a));
                                i20 |= i36;
                                i18 = i31;
                                i17 = i10;
                                break;
                            }
                        case 16:
                            if (i28 != 0) {
                                i10 = i27;
                                obj3 = obj5;
                                obj2 = obj3;
                                i6 = i20;
                                i7 = i26;
                                i8 = i31;
                                i27 = i10;
                                i5 = i34;
                                break;
                            } else {
                                i11 = a7f.i(bArr2, i26, lfdVar2);
                                long j2 = lfdVar2.b;
                                i10 = i27;
                                unsafe.putLong(obj5, j, (j2 >>> i9) ^ (-(j2 & 1)));
                                i20 |= i36;
                                i16 = i11;
                                i18 = i31;
                                i17 = i10;
                                break;
                            }
                        default:
                            obj3 = obj5;
                            i10 = i27;
                            obj2 = obj3;
                            i6 = i20;
                            i7 = i26;
                            i8 = i31;
                            i27 = i10;
                            i5 = i34;
                            break;
                    }
                } else {
                    Object obj8 = obj5;
                    i10 = i27;
                    if (i33 != 27) {
                        i5 = i34;
                        if (i33 <= 49) {
                            i6 = i20;
                            i13 = i19;
                            i27 = i10;
                            i14 = hzeVar.i(obj, bArr, i26, i2, i5, i27, i28, i31, i32, i33, j, lfdVar);
                            obj5 = obj;
                            i8 = i31;
                            if (i14 == i26) {
                                obj2 = obj5;
                                i7 = i14;
                            } else {
                                i15 = i2;
                                lfdVar2 = lfdVar;
                                i17 = i27;
                                i16 = i14;
                                i18 = i8;
                                i19 = i13;
                                i20 = i6;
                                bArr2 = bArr;
                            }
                        } else {
                            obj4 = obj;
                            i6 = i20;
                            i8 = i31;
                            i13 = i19;
                            i12 = i26;
                            i27 = i10;
                            if (i33 != 50) {
                                i14 = hzeVar.h(obj4, bArr, i12, i2, i5, i27, i28, i32, i33, j, i8, lfdVar);
                                obj2 = obj4;
                                if (i14 == i12) {
                                    i7 = i14;
                                } else {
                                    hzeVar = this;
                                    lfdVar2 = lfdVar;
                                    i17 = i27;
                                    i16 = i14;
                                    obj5 = obj2;
                                    i18 = i8;
                                    i19 = i13;
                                    i20 = i6;
                                    bArr2 = bArr;
                                    i15 = i2;
                                }
                            } else if (i28 == 2) {
                                hzeVar.o(j, obj4, i8);
                                throw null;
                            }
                        }
                        i19 = i13;
                    } else if (i28 == 2) {
                        bue bueVar = (bue) unsafe.getObject(obj8, j);
                        if (!bueVar.zza()) {
                            int size = bueVar.size();
                            bueVar = bueVar.zza(size == 0 ? 10 : size << 1);
                            unsafe.putObject(obj8, j, bueVar);
                        }
                        i16 = a7f.e(hzeVar.m(i31), i34, bArr2, i26, i15, bueVar, lfdVar2);
                        obj5 = obj;
                        bArr2 = bArr;
                        i15 = i2;
                        lfdVar2 = lfdVar;
                        i18 = i31;
                        i17 = i10;
                    } else {
                        obj4 = obj;
                        i6 = i20;
                        i12 = i26;
                        i8 = i31;
                        i27 = i10;
                        i5 = i34;
                        i13 = i19;
                    }
                    obj2 = obj4;
                    i7 = i12;
                    i19 = i13;
                }
            }
            bArr2 = bArr;
            lfdVar2 = lfdVar;
            i16 = a7f.c(i5, bArr, i7, i2, B(obj2), lfdVar);
            obj5 = obj2;
            i18 = i8;
            i20 = i6;
            hzeVar = this;
            i15 = i2;
            i17 = i27;
        }
    }

    @Override // o1f
    public final void d(ese eseVar, ese eseVar2) {
        ese eseVar3;
        eseVar2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                w1f.h(this.l, eseVar, eseVar2);
                return;
            }
            int y = y(i);
            long j = y & 1048575;
            int i2 = iArr[i];
            switch ((y & 267386880) >>> 20) {
                case 0:
                    eseVar3 = eseVar;
                    if (!r(i, eseVar2)) {
                        break;
                    } else {
                        cac cacVar = a5f.c;
                        cacVar.m(eseVar3, j, cacVar.t(j, eseVar2));
                        u(eseVar3, i);
                        continue;
                    }
                case 1:
                    eseVar3 = eseVar;
                    if (r(i, eseVar2)) {
                        cac cacVar2 = a5f.c;
                        cacVar2.n(eseVar3, j, cacVar2.r(j, eseVar2));
                        u(eseVar3, i);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    eseVar3 = eseVar;
                    if (r(i, eseVar2)) {
                        a5f.c.a.putLong(eseVar3, j, a5f.g(j, eseVar2));
                        u(eseVar3, i);
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    eseVar3 = eseVar;
                    if (r(i, eseVar2)) {
                        a5f.c.a.putLong(eseVar3, j, a5f.g(j, eseVar2));
                        u(eseVar3, i);
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    eseVar3 = eseVar;
                    if (r(i, eseVar2)) {
                        a5f.c(j, eseVar3, a5f.b(j, eseVar2));
                        u(eseVar3, i);
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    eseVar3 = eseVar;
                    if (r(i, eseVar2)) {
                        a5f.c.a.putLong(eseVar3, j, a5f.g(j, eseVar2));
                        u(eseVar3, i);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    eseVar3 = eseVar;
                    if (r(i, eseVar2)) {
                        a5f.c(j, eseVar3, a5f.b(j, eseVar2));
                        u(eseVar3, i);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    eseVar3 = eseVar;
                    if (r(i, eseVar2)) {
                        cac cacVar3 = a5f.c;
                        cacVar3.o(eseVar3, j, cacVar3.q(j, eseVar2));
                        u(eseVar3, i);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    eseVar3 = eseVar;
                    if (r(i, eseVar2)) {
                        a5f.d(j, eseVar3, a5f.l(eseVar2, j));
                        u(eseVar3, i);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    eseVar3 = eseVar;
                    p(eseVar3, eseVar2, i);
                    continue;
                case 10:
                    eseVar3 = eseVar;
                    if (r(i, eseVar2)) {
                        a5f.d(j, eseVar3, a5f.l(eseVar2, j));
                        u(eseVar3, i);
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    eseVar3 = eseVar;
                    if (r(i, eseVar2)) {
                        a5f.c(j, eseVar3, a5f.b(j, eseVar2));
                        u(eseVar3, i);
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    eseVar3 = eseVar;
                    if (r(i, eseVar2)) {
                        a5f.c(j, eseVar3, a5f.b(j, eseVar2));
                        u(eseVar3, i);
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    eseVar3 = eseVar;
                    if (r(i, eseVar2)) {
                        a5f.c(j, eseVar3, a5f.b(j, eseVar2));
                        u(eseVar3, i);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    eseVar3 = eseVar;
                    if (r(i, eseVar2)) {
                        a5f.c.a.putLong(eseVar3, j, a5f.g(j, eseVar2));
                        u(eseVar3, i);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    eseVar3 = eseVar;
                    if (r(i, eseVar2)) {
                        a5f.c(j, eseVar3, a5f.b(j, eseVar2));
                        u(eseVar3, i);
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (r(i, eseVar2)) {
                        eseVar3 = eseVar;
                        a5f.c.a.putLong(eseVar3, j, a5f.g(j, eseVar2));
                        u(eseVar3, i);
                        break;
                    }
                    break;
                case 17:
                    p(eseVar, eseVar2, i);
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
                case jn7.S /* 30 */:
                case 31:
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
                    this.k.a(eseVar, eseVar2, j);
                    break;
                case 50:
                    Class cls = w1f.a;
                    Object l = a5f.l(eseVar, j);
                    Object l2 = a5f.l(eseVar2, j);
                    this.m.getClass();
                    a5f.d(j, eseVar, zxe.a(l, l2));
                    break;
                case jn7.n0 /* 51 */:
                case jn7.o0 /* 52 */:
                case jn7.p0 /* 53 */:
                case jn7.q0 /* 54 */:
                case jn7.r0 /* 55 */:
                case 56:
                case jn7.t0 /* 57 */:
                case jn7.u0 /* 58 */:
                case jn7.v0 /* 59 */:
                    if (q(i2, i, eseVar2)) {
                        a5f.d(j, eseVar, a5f.l(eseVar2, j));
                        a5f.c(iArr[i + 2] & 1048575, eseVar, i2);
                        break;
                    }
                    break;
                case jn7.w0 /* 60 */:
                    v(eseVar, eseVar2, i);
                    break;
                case jn7.x0 /* 61 */:
                case jn7.y0 /* 62 */:
                case jn7.z0 /* 63 */:
                case 64:
                case 65:
                case jn7.C0 /* 66 */:
                case jn7.D0 /* 67 */:
                    if (q(i2, i, eseVar2)) {
                        a5f.d(j, eseVar, a5f.l(eseVar2, j));
                        a5f.c(iArr[i + 2] & 1048575, eseVar, i2);
                        break;
                    }
                    break;
                case jn7.E0 /* 68 */:
                    v(eseVar, eseVar2, i);
                    break;
            }
            eseVar3 = eseVar;
            i += 3;
            eseVar = eseVar3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o1f
    public final void e(Object obj, g9d g9dVar) {
        int i;
        int i2;
        int i3;
        int i4;
        g9dVar.getClass();
        coe coeVar = (coe) g9dVar.b;
        boolean z = this.f;
        d4f d4fVar = this.l;
        zxe zxeVar = this.m;
        int[] iArr = this.a;
        int i5 = 1;
        int i6 = 1048575;
        if (z) {
            int length = iArr.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int y = y(i7);
                int i8 = iArr[i7];
                switch ((y & 267386880) >>> 20) {
                    case 0:
                        if (r(i7, obj)) {
                            long doubleToRawLongBits = Double.doubleToRawLongBits(a5f.c.t(y & 1048575, obj));
                            coeVar.c(i8, 1);
                            coeVar.j(doubleToRawLongBits);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (r(i7, obj)) {
                            int floatToRawIntBits = Float.floatToRawIntBits(a5f.c.r(y & 1048575, obj));
                            coeVar.c(i8, 5);
                            coeVar.l(floatToRawIntBits);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (r(i7, obj)) {
                            long g = a5f.g(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.d(g);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (r(i7, obj)) {
                            long g2 = a5f.g(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.d(g2);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (r(i7, obj)) {
                            int b = a5f.b(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.b(b);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (r(i7, obj)) {
                            long g3 = a5f.g(y & 1048575, obj);
                            coeVar.c(i8, 1);
                            coeVar.j(g3);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (r(i7, obj)) {
                            int b2 = a5f.b(y & 1048575, obj);
                            coeVar.c(i8, 5);
                            coeVar.l(b2);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (r(i7, obj)) {
                            boolean q = a5f.c.q(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.a(q ? (byte) 1 : (byte) 0);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (r(i7, obj)) {
                            n(i8, a5f.l(obj, y & 1048575), g9dVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (r(i7, obj)) {
                            g9dVar.a(i8, a5f.l(obj, y & 1048575), m(i7));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (r(i7, obj)) {
                            g9dVar.b(i8, (jne) a5f.l(obj, y & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (r(i7, obj)) {
                            int b3 = a5f.b(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.g(b3);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (r(i7, obj)) {
                            int b4 = a5f.b(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.b(b4);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (r(i7, obj)) {
                            int b5 = a5f.b(y & 1048575, obj);
                            coeVar.c(i8, 5);
                            coeVar.l(b5);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (r(i7, obj)) {
                            long g4 = a5f.g(y & 1048575, obj);
                            coeVar.c(i8, 1);
                            coeVar.j(g4);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (r(i7, obj)) {
                            int b6 = a5f.b(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.g((b6 << 1) ^ (b6 >> 31));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (r(i7, obj)) {
                            long g5 = a5f.g(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.d((g5 << 1) ^ (g5 >> 63));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (r(i7, obj)) {
                            g9dVar.c(i8, a5f.l(obj, y & 1048575), m(i7));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        w1f.g(i8, (List) a5f.l(obj, y & 1048575), g9dVar, false);
                        break;
                    case 19:
                        w1f.n(i8, (List) a5f.l(obj, y & 1048575), g9dVar, false);
                        break;
                    case 20:
                        w1f.q(i8, (List) a5f.l(obj, y & 1048575), g9dVar, false);
                        break;
                    case 21:
                        w1f.s(i8, (List) a5f.l(obj, y & 1048575), g9dVar, false);
                        break;
                    case 22:
                        w1f.B(i8, (List) a5f.l(obj, y & 1048575), g9dVar, false);
                        break;
                    case 23:
                        w1f.w(i8, (List) a5f.l(obj, y & 1048575), g9dVar, false);
                        break;
                    case 24:
                        w1f.G(i8, (List) a5f.l(obj, y & 1048575), g9dVar, false);
                        break;
                    case 25:
                        w1f.J(i8, (List) a5f.l(obj, y & 1048575), g9dVar, false);
                        break;
                    case 26:
                        w1f.e(i8, (List) a5f.l(obj, y & 1048575), g9dVar);
                        break;
                    case 27:
                        w1f.f(i8, (List) a5f.l(obj, y & 1048575), g9dVar, m(i7));
                        break;
                    case 28:
                        w1f.l(i8, (List) a5f.l(obj, y & 1048575), g9dVar);
                        break;
                    case 29:
                        w1f.E(i8, (List) a5f.l(obj, y & 1048575), g9dVar, false);
                        break;
                    case jn7.S /* 30 */:
                        w1f.I(i8, (List) a5f.l(obj, y & 1048575), g9dVar, false);
                        break;
                    case 31:
                        w1f.H(i8, (List) a5f.l(obj, y & 1048575), g9dVar, false);
                        break;
                    case 32:
                        w1f.y(i8, (List) a5f.l(obj, y & 1048575), g9dVar, false);
                        break;
                    case 33:
                        w1f.F(i8, (List) a5f.l(obj, y & 1048575), g9dVar, false);
                        break;
                    case 34:
                        w1f.u(i8, (List) a5f.l(obj, y & 1048575), g9dVar, false);
                        break;
                    case 35:
                        w1f.g(i8, (List) a5f.l(obj, y & 1048575), g9dVar, true);
                        break;
                    case 36:
                        w1f.n(i8, (List) a5f.l(obj, y & 1048575), g9dVar, true);
                        break;
                    case 37:
                        w1f.q(i8, (List) a5f.l(obj, y & 1048575), g9dVar, true);
                        break;
                    case 38:
                        w1f.s(i8, (List) a5f.l(obj, y & 1048575), g9dVar, true);
                        break;
                    case 39:
                        w1f.B(i8, (List) a5f.l(obj, y & 1048575), g9dVar, true);
                        break;
                    case 40:
                        w1f.w(i8, (List) a5f.l(obj, y & 1048575), g9dVar, true);
                        break;
                    case 41:
                        w1f.G(i8, (List) a5f.l(obj, y & 1048575), g9dVar, true);
                        break;
                    case 42:
                        w1f.J(i8, (List) a5f.l(obj, y & 1048575), g9dVar, true);
                        break;
                    case 43:
                        w1f.E(i8, (List) a5f.l(obj, y & 1048575), g9dVar, true);
                        break;
                    case 44:
                        w1f.I(i8, (List) a5f.l(obj, y & 1048575), g9dVar, true);
                        break;
                    case 45:
                        w1f.H(i8, (List) a5f.l(obj, y & 1048575), g9dVar, true);
                        break;
                    case 46:
                        w1f.y(i8, (List) a5f.l(obj, y & 1048575), g9dVar, true);
                        break;
                    case 47:
                        w1f.F(i8, (List) a5f.l(obj, y & 1048575), g9dVar, true);
                        break;
                    case 48:
                        w1f.u(i8, (List) a5f.l(obj, y & 1048575), g9dVar, true);
                        break;
                    case 49:
                        w1f.m(i8, (List) a5f.l(obj, y & 1048575), g9dVar, m(i7));
                        break;
                    case 50:
                        if (a5f.l(obj, y & 1048575) != null) {
                            Object t = t(i7);
                            zxeVar.getClass();
                            if (t == null) {
                                throw new NoSuchMethodError();
                            }
                            grb.o();
                            return;
                        }
                        break;
                    case jn7.n0 /* 51 */:
                        if (q(i8, i7, obj)) {
                            long doubleToRawLongBits2 = Double.doubleToRawLongBits(((Double) a5f.l(obj, y & 1048575)).doubleValue());
                            coeVar.c(i8, 1);
                            coeVar.j(doubleToRawLongBits2);
                            break;
                        } else {
                            break;
                        }
                    case jn7.o0 /* 52 */:
                        if (q(i8, i7, obj)) {
                            int floatToRawIntBits2 = Float.floatToRawIntBits(((Float) a5f.l(obj, y & 1048575)).floatValue());
                            coeVar.c(i8, 5);
                            coeVar.l(floatToRawIntBits2);
                            break;
                        } else {
                            break;
                        }
                    case jn7.p0 /* 53 */:
                        if (q(i8, i7, obj)) {
                            long A = A(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.d(A);
                            break;
                        } else {
                            break;
                        }
                    case jn7.q0 /* 54 */:
                        if (q(i8, i7, obj)) {
                            long A2 = A(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.d(A2);
                            break;
                        } else {
                            break;
                        }
                    case jn7.r0 /* 55 */:
                        if (q(i8, i7, obj)) {
                            int z2 = z(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.b(z2);
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (q(i8, i7, obj)) {
                            long A3 = A(y & 1048575, obj);
                            coeVar.c(i8, 1);
                            coeVar.j(A3);
                            break;
                        } else {
                            break;
                        }
                    case jn7.t0 /* 57 */:
                        if (q(i8, i7, obj)) {
                            int z3 = z(y & 1048575, obj);
                            coeVar.c(i8, 5);
                            coeVar.l(z3);
                            break;
                        } else {
                            break;
                        }
                    case jn7.u0 /* 58 */:
                        if (q(i8, i7, obj)) {
                            boolean booleanValue = ((Boolean) a5f.l(obj, y & 1048575)).booleanValue();
                            coeVar.c(i8, 0);
                            coeVar.a(booleanValue ? (byte) 1 : (byte) 0);
                            break;
                        } else {
                            break;
                        }
                    case jn7.v0 /* 59 */:
                        if (q(i8, i7, obj)) {
                            n(i8, a5f.l(obj, y & 1048575), g9dVar);
                            break;
                        } else {
                            break;
                        }
                    case jn7.w0 /* 60 */:
                        if (q(i8, i7, obj)) {
                            g9dVar.a(i8, a5f.l(obj, y & 1048575), m(i7));
                            break;
                        } else {
                            break;
                        }
                    case jn7.x0 /* 61 */:
                        if (q(i8, i7, obj)) {
                            g9dVar.b(i8, (jne) a5f.l(obj, y & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case jn7.y0 /* 62 */:
                        if (q(i8, i7, obj)) {
                            int z4 = z(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.g(z4);
                            break;
                        } else {
                            break;
                        }
                    case jn7.z0 /* 63 */:
                        if (q(i8, i7, obj)) {
                            int z5 = z(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.b(z5);
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (q(i8, i7, obj)) {
                            int z6 = z(y & 1048575, obj);
                            coeVar.c(i8, 5);
                            coeVar.l(z6);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (q(i8, i7, obj)) {
                            long A4 = A(y & 1048575, obj);
                            coeVar.c(i8, 1);
                            coeVar.j(A4);
                            break;
                        } else {
                            break;
                        }
                    case jn7.C0 /* 66 */:
                        if (q(i8, i7, obj)) {
                            int z7 = z(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.g((z7 << 1) ^ (z7 >> 31));
                            break;
                        } else {
                            break;
                        }
                    case jn7.D0 /* 67 */:
                        if (q(i8, i7, obj)) {
                            long A5 = A(y & 1048575, obj);
                            coeVar.c(i8, 0);
                            coeVar.d((A5 << 1) ^ (A5 >> 63));
                            break;
                        } else {
                            break;
                        }
                    case jn7.E0 /* 68 */:
                        if (q(i8, i7, obj)) {
                            g9dVar.c(i8, a5f.l(obj, y & 1048575), m(i7));
                            break;
                        } else {
                            break;
                        }
                }
            }
            d4fVar.getClass();
            ((ese) obj).zzb.c(g9dVar);
            return;
        }
        int length2 = iArr.length;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (i9 < length2) {
            int y2 = y(i9);
            int i12 = iArr[i9];
            int i13 = i6;
            int i14 = (y2 & 267386880) >>> 20;
            int i15 = i5;
            Unsafe unsafe = o;
            if (i14 <= 17) {
                int i16 = iArr[i9 + 2];
                i = length2;
                int i17 = i16 & i13;
                if (i17 != i11) {
                    i10 = unsafe.getInt(obj, i17);
                    i11 = i17;
                }
                i2 = i15 << (i16 >>> 20);
            } else {
                i = length2;
                i2 = 0;
            }
            int i18 = i2;
            d4f d4fVar2 = d4fVar;
            long j = y2 & i13;
            switch (i14) {
                case 0:
                    if ((i10 & i18) != 0) {
                        long doubleToRawLongBits3 = Double.doubleToRawLongBits(a5f.c.t(j, obj));
                        i3 = 1;
                        coeVar.c(i12, 1);
                        coeVar.j(doubleToRawLongBits3);
                        i9 += 3;
                        d4fVar = d4fVar2;
                        i5 = i3;
                        i6 = i13;
                        length2 = i;
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 1:
                    if ((i10 & i18) != 0) {
                        int floatToRawIntBits3 = Float.floatToRawIntBits(a5f.c.r(j, obj));
                        coeVar.c(i12, 5);
                        coeVar.l(floatToRawIntBits3);
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 2:
                    if ((i10 & i18) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        coeVar.c(i12, 0);
                        coeVar.d(j2);
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 3:
                    if ((i10 & i18) != 0) {
                        long j3 = unsafe.getLong(obj, j);
                        coeVar.c(i12, 0);
                        coeVar.d(j3);
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 4:
                    if ((i10 & i18) != 0) {
                        int i19 = unsafe.getInt(obj, j);
                        coeVar.c(i12, 0);
                        coeVar.b(i19);
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 5:
                    if ((i10 & i18) != 0) {
                        long j4 = unsafe.getLong(obj, j);
                        coeVar.c(i12, 1);
                        coeVar.j(j4);
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 6:
                    if ((i10 & i18) != 0) {
                        int i20 = unsafe.getInt(obj, j);
                        coeVar.c(i12, 5);
                        coeVar.l(i20);
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 7:
                    if ((i10 & i18) != 0) {
                        boolean q2 = a5f.c.q(j, obj);
                        coeVar.c(i12, 0);
                        coeVar.a(q2 ? (byte) 1 : (byte) 0);
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 8:
                    if ((i10 & i18) != 0) {
                        n(i12, unsafe.getObject(obj, j), g9dVar);
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 9:
                    if ((i10 & i18) != 0) {
                        g9dVar.a(i12, unsafe.getObject(obj, j), m(i9));
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 10:
                    if ((i10 & i18) != 0) {
                        g9dVar.b(i12, (jne) unsafe.getObject(obj, j));
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 11:
                    if ((i10 & i18) != 0) {
                        int i21 = unsafe.getInt(obj, j);
                        coeVar.c(i12, 0);
                        coeVar.g(i21);
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 12:
                    if ((i10 & i18) != 0) {
                        int i22 = unsafe.getInt(obj, j);
                        coeVar.c(i12, 0);
                        coeVar.b(i22);
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 13:
                    if ((i10 & i18) != 0) {
                        int i23 = unsafe.getInt(obj, j);
                        coeVar.c(i12, 5);
                        coeVar.l(i23);
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 14:
                    if ((i10 & i18) != 0) {
                        long j5 = unsafe.getLong(obj, j);
                        coeVar.c(i12, 1);
                        coeVar.j(j5);
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 15:
                    if ((i10 & i18) != 0) {
                        int i24 = unsafe.getInt(obj, j);
                        coeVar.c(i12, 0);
                        coeVar.g((i24 << 1) ^ (i24 >> 31));
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 16:
                    if ((i10 & i18) != 0) {
                        long j6 = unsafe.getLong(obj, j);
                        coeVar.c(i12, 0);
                        coeVar.d((j6 << 1) ^ (j6 >> 63));
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 17:
                    if ((i10 & i18) != 0) {
                        g9dVar.c(i12, unsafe.getObject(obj, j), m(i9));
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 18:
                    w1f.g(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, false);
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 19:
                    w1f.n(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, false);
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 20:
                    w1f.q(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, false);
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 21:
                    w1f.s(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, false);
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 22:
                    w1f.B(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, false);
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 23:
                    w1f.w(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, false);
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 24:
                    w1f.G(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, false);
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 25:
                    w1f.J(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, false);
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 26:
                    w1f.e(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar);
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 27:
                    w1f.f(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, m(i9));
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 28:
                    w1f.l(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar);
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 29:
                    w1f.E(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, false);
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case jn7.S /* 30 */:
                    w1f.I(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, false);
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 31:
                    w1f.H(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, false);
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 32:
                    w1f.y(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, false);
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 33:
                    w1f.F(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, false);
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 34:
                    w1f.u(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, false);
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 35:
                    boolean z8 = i15;
                    w1f.g(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, z8);
                    i4 = z8;
                    i3 = i4;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 36:
                    boolean z9 = i15;
                    w1f.n(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, z9);
                    i4 = z9;
                    i3 = i4;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 37:
                    boolean z10 = i15;
                    w1f.q(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, z10);
                    i4 = z10;
                    i3 = i4;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 38:
                    boolean z11 = i15;
                    w1f.s(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, z11);
                    i4 = z11;
                    i3 = i4;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 39:
                    boolean z12 = i15;
                    w1f.B(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, z12);
                    i4 = z12;
                    i3 = i4;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 40:
                    boolean z13 = i15;
                    w1f.w(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, z13);
                    i4 = z13;
                    i3 = i4;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 41:
                    boolean z14 = i15;
                    w1f.G(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, z14);
                    i4 = z14;
                    i3 = i4;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 42:
                    boolean z15 = i15;
                    w1f.J(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, z15);
                    i4 = z15;
                    i3 = i4;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 43:
                    boolean z16 = i15;
                    w1f.E(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, z16);
                    i4 = z16;
                    i3 = i4;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 44:
                    boolean z17 = i15;
                    w1f.I(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, z17);
                    i4 = z17;
                    i3 = i4;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 45:
                    boolean z18 = i15;
                    w1f.H(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, z18);
                    i4 = z18;
                    i3 = i4;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 46:
                    boolean z19 = i15;
                    w1f.y(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, z19);
                    i4 = z19;
                    i3 = i4;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 47:
                    boolean z20 = i15;
                    w1f.F(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, z20);
                    i4 = z20;
                    i3 = i4;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 48:
                    i4 = 1;
                    w1f.u(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, true);
                    i3 = i4;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 49:
                    w1f.m(iArr[i9], (List) unsafe.getObject(obj, j), g9dVar, m(i9));
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        Object t2 = t(i9);
                        zxeVar.getClass();
                        if (t2 == null) {
                            throw new NoSuchMethodError();
                        }
                        grb.o();
                        return;
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case jn7.n0 /* 51 */:
                    if (q(i12, i9, obj)) {
                        long doubleToRawLongBits4 = Double.doubleToRawLongBits(((Double) a5f.l(obj, j)).doubleValue());
                        coeVar.c(i12, 1);
                        coeVar.j(doubleToRawLongBits4);
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case jn7.o0 /* 52 */:
                    if (q(i12, i9, obj)) {
                        int floatToRawIntBits4 = Float.floatToRawIntBits(((Float) a5f.l(obj, j)).floatValue());
                        coeVar.c(i12, 5);
                        coeVar.l(floatToRawIntBits4);
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case jn7.p0 /* 53 */:
                    if (q(i12, i9, obj)) {
                        long A6 = A(j, obj);
                        coeVar.c(i12, 0);
                        coeVar.d(A6);
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case jn7.q0 /* 54 */:
                    if (q(i12, i9, obj)) {
                        long A7 = A(j, obj);
                        coeVar.c(i12, 0);
                        coeVar.d(A7);
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case jn7.r0 /* 55 */:
                    if (q(i12, i9, obj)) {
                        int z21 = z(j, obj);
                        coeVar.c(i12, 0);
                        coeVar.b(z21);
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 56:
                    if (q(i12, i9, obj)) {
                        long A8 = A(j, obj);
                        coeVar.c(i12, 1);
                        coeVar.j(A8);
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case jn7.t0 /* 57 */:
                    if (q(i12, i9, obj)) {
                        int z22 = z(j, obj);
                        coeVar.c(i12, 5);
                        coeVar.l(z22);
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case jn7.u0 /* 58 */:
                    if (q(i12, i9, obj)) {
                        boolean booleanValue2 = ((Boolean) a5f.l(obj, j)).booleanValue();
                        coeVar.c(i12, 0);
                        coeVar.a(booleanValue2 ? (byte) 1 : (byte) 0);
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case jn7.v0 /* 59 */:
                    if (q(i12, i9, obj)) {
                        n(i12, unsafe.getObject(obj, j), g9dVar);
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case jn7.w0 /* 60 */:
                    if (q(i12, i9, obj)) {
                        g9dVar.a(i12, unsafe.getObject(obj, j), m(i9));
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case jn7.x0 /* 61 */:
                    if (q(i12, i9, obj)) {
                        g9dVar.b(i12, (jne) unsafe.getObject(obj, j));
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case jn7.y0 /* 62 */:
                    if (q(i12, i9, obj)) {
                        int z23 = z(j, obj);
                        coeVar.c(i12, 0);
                        coeVar.g(z23);
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case jn7.z0 /* 63 */:
                    if (q(i12, i9, obj)) {
                        int z24 = z(j, obj);
                        coeVar.c(i12, 0);
                        coeVar.b(z24);
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 64:
                    if (q(i12, i9, obj)) {
                        int z25 = z(j, obj);
                        coeVar.c(i12, 5);
                        coeVar.l(z25);
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 65:
                    if (q(i12, i9, obj)) {
                        long A9 = A(j, obj);
                        coeVar.c(i12, i15);
                        coeVar.j(A9);
                    }
                    i3 = 1;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case jn7.C0 /* 66 */:
                    if (q(i12, i9, obj)) {
                        int z26 = z(j, obj);
                        coeVar.c(i12, 0);
                        coeVar.g((z26 << 1) ^ (z26 >> 31));
                    }
                    i3 = i15;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case jn7.D0 /* 67 */:
                    if (q(i12, i9, obj)) {
                        long A10 = A(j, obj);
                        coeVar.c(i12, 0);
                        coeVar.d((A10 << i15) ^ (A10 >> 63));
                    }
                    i3 = i15;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case jn7.E0 /* 68 */:
                    if (q(i12, i9, obj)) {
                        g9dVar.c(i12, unsafe.getObject(obj, j), m(i9));
                    }
                    i3 = i15;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                default:
                    i3 = i15;
                    i9 += 3;
                    d4fVar = d4fVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
            }
        }
        d4fVar.getClass();
        ((ese) obj).zzb.c(g9dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        if (w1f.i(a5f.l(r12, r7), a5f.l(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (a5f.g(r7, r12) == a5f.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if (a5f.b(r7, r12) == a5f.b(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (a5f.g(r7, r12) == a5f.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b6, code lost:
    
        if (a5f.b(r7, r12) == a5f.b(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        if (a5f.b(r7, r12) == a5f.b(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
    
        if (a5f.b(r7, r12) == a5f.b(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f0, code lost:
    
        if (w1f.i(a5f.l(r12, r7), a5f.l(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0106, code lost:
    
        if (w1f.i(a5f.l(r12, r7), a5f.l(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011c, code lost:
    
        if (w1f.i(a5f.l(r12, r7), a5f.l(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0130, code lost:
    
        if (r5.q(r7, r12) != r5.q(r7, r13)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0142, code lost:
    
        if (a5f.b(r7, r12) == a5f.b(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0156, code lost:
    
        if (a5f.g(r7, r12) == a5f.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0168, code lost:
    
        if (a5f.b(r7, r12) == a5f.b(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017b, code lost:
    
        if (a5f.g(r7, r12) == a5f.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018e, code lost:
    
        if (a5f.g(r7, r12) == a5f.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a9, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.r(r7, r12)) != java.lang.Float.floatToIntBits(r5.r(r7, r13))) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c6, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.t(r7, r12)) != java.lang.Double.doubleToLongBits(r5.t(r7, r13))) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (w1f.i(a5f.l(r12, r7), a5f.l(r13, r7)) != false) goto L105;
     */
    @Override // o1f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(ese eseVar, ese eseVar2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int y = y(i);
                long j = y & 1048575;
                switch ((y & 267386880) >>> 20) {
                    case 0:
                        if (x(eseVar, eseVar2, i)) {
                            cac cacVar = a5f.c;
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (x(eseVar, eseVar2, i)) {
                            cac cacVar2 = a5f.c;
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (x(eseVar, eseVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (x(eseVar, eseVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (x(eseVar, eseVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (x(eseVar, eseVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (x(eseVar, eseVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (x(eseVar, eseVar2, i)) {
                            cac cacVar3 = a5f.c;
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (x(eseVar, eseVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (x(eseVar, eseVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (x(eseVar, eseVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (x(eseVar, eseVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (x(eseVar, eseVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (x(eseVar, eseVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (x(eseVar, eseVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (x(eseVar, eseVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (x(eseVar, eseVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (x(eseVar, eseVar2, i)) {
                            break;
                        }
                        z = false;
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
                    case jn7.S /* 30 */:
                    case 31:
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
                        z = w1f.i(a5f.l(eseVar, j), a5f.l(eseVar2, j));
                        break;
                    case 50:
                        z = w1f.i(a5f.l(eseVar, j), a5f.l(eseVar2, j));
                        break;
                    case jn7.n0 /* 51 */:
                    case jn7.o0 /* 52 */:
                    case jn7.p0 /* 53 */:
                    case jn7.q0 /* 54 */:
                    case jn7.r0 /* 55 */:
                    case 56:
                    case jn7.t0 /* 57 */:
                    case jn7.u0 /* 58 */:
                    case jn7.v0 /* 59 */:
                    case jn7.w0 /* 60 */:
                    case jn7.x0 /* 61 */:
                    case jn7.y0 /* 62 */:
                    case jn7.z0 /* 63 */:
                    case 64:
                    case 65:
                    case jn7.C0 /* 66 */:
                    case jn7.D0 /* 67 */:
                    case jn7.E0 /* 68 */:
                        long j2 = iArr[i + 2] & 1048575;
                        if (a5f.b(j2, eseVar) == a5f.b(j2, eseVar2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (z) {
                    i += 3;
                }
            } else {
                this.l.getClass();
                if (eseVar.zzb.equals(eseVar2.zzb)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ee, code lost:
    
        if (r4 != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d6, code lost:
    
        if (r4 != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01f1, code lost:
    
        r3 = r8 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01f0, code lost:
    
        r8 = 1231;
     */
    @Override // o1f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(ese eseVar) {
        int i;
        int a;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int y = y(i4);
            int i5 = iArr[i4];
            long j = 1048575 & y;
            int i6 = 1237;
            int i7 = 37;
            switch ((y & 267386880) >>> 20) {
                case 0:
                    i = i3 * 53;
                    a = xse.a(Double.doubleToLongBits(a5f.c.t(j, eseVar)));
                    i3 = a + i;
                    break;
                case 1:
                    i = i3 * 53;
                    a = Float.floatToIntBits(a5f.c.r(j, eseVar));
                    i3 = a + i;
                    break;
                case 2:
                    i = i3 * 53;
                    a = xse.a(a5f.g(j, eseVar));
                    i3 = a + i;
                    break;
                case 3:
                    i = i3 * 53;
                    a = xse.a(a5f.g(j, eseVar));
                    i3 = a + i;
                    break;
                case 4:
                    i = i3 * 53;
                    a = a5f.b(j, eseVar);
                    i3 = a + i;
                    break;
                case 5:
                    i = i3 * 53;
                    a = xse.a(a5f.g(j, eseVar));
                    i3 = a + i;
                    break;
                case 6:
                    i = i3 * 53;
                    a = a5f.b(j, eseVar);
                    i3 = a + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean q = a5f.c.q(j, eseVar);
                    Charset charset = xse.a;
                    break;
                case 8:
                    i = i3 * 53;
                    a = ((String) a5f.l(eseVar, j)).hashCode();
                    i3 = a + i;
                    break;
                case 9:
                    Object l = a5f.l(eseVar, j);
                    if (l != null) {
                        i7 = l.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    a = a5f.l(eseVar, j).hashCode();
                    i3 = a + i;
                    break;
                case 11:
                    i = i3 * 53;
                    a = a5f.b(j, eseVar);
                    i3 = a + i;
                    break;
                case 12:
                    i = i3 * 53;
                    a = a5f.b(j, eseVar);
                    i3 = a + i;
                    break;
                case 13:
                    i = i3 * 53;
                    a = a5f.b(j, eseVar);
                    i3 = a + i;
                    break;
                case 14:
                    i = i3 * 53;
                    a = xse.a(a5f.g(j, eseVar));
                    i3 = a + i;
                    break;
                case 15:
                    i = i3 * 53;
                    a = a5f.b(j, eseVar);
                    i3 = a + i;
                    break;
                case 16:
                    i = i3 * 53;
                    a = xse.a(a5f.g(j, eseVar));
                    i3 = a + i;
                    break;
                case 17:
                    Object l2 = a5f.l(eseVar, j);
                    if (l2 != null) {
                        i7 = l2.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
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
                case jn7.S /* 30 */:
                case 31:
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
                    i = i3 * 53;
                    a = a5f.l(eseVar, j).hashCode();
                    i3 = a + i;
                    break;
                case 50:
                    i = i3 * 53;
                    a = a5f.l(eseVar, j).hashCode();
                    i3 = a + i;
                    break;
                case jn7.n0 /* 51 */:
                    if (q(i5, i4, eseVar)) {
                        i = i3 * 53;
                        a = xse.a(Double.doubleToLongBits(((Double) a5f.l(eseVar, j)).doubleValue()));
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case jn7.o0 /* 52 */:
                    if (q(i5, i4, eseVar)) {
                        i = i3 * 53;
                        a = Float.floatToIntBits(((Float) a5f.l(eseVar, j)).floatValue());
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case jn7.p0 /* 53 */:
                    if (q(i5, i4, eseVar)) {
                        i = i3 * 53;
                        a = xse.a(A(j, eseVar));
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case jn7.q0 /* 54 */:
                    if (q(i5, i4, eseVar)) {
                        i = i3 * 53;
                        a = xse.a(A(j, eseVar));
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case jn7.r0 /* 55 */:
                    if (q(i5, i4, eseVar)) {
                        i = i3 * 53;
                        a = z(j, eseVar);
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(i5, i4, eseVar)) {
                        i = i3 * 53;
                        a = xse.a(A(j, eseVar));
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case jn7.t0 /* 57 */:
                    if (q(i5, i4, eseVar)) {
                        i = i3 * 53;
                        a = z(j, eseVar);
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case jn7.u0 /* 58 */:
                    if (q(i5, i4, eseVar)) {
                        i2 = i3 * 53;
                        boolean booleanValue = ((Boolean) a5f.l(eseVar, j)).booleanValue();
                        Charset charset2 = xse.a;
                        break;
                    } else {
                        break;
                    }
                case jn7.v0 /* 59 */:
                    if (q(i5, i4, eseVar)) {
                        i = i3 * 53;
                        a = ((String) a5f.l(eseVar, j)).hashCode();
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case jn7.w0 /* 60 */:
                    if (q(i5, i4, eseVar)) {
                        i = i3 * 53;
                        a = a5f.l(eseVar, j).hashCode();
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case jn7.x0 /* 61 */:
                    if (q(i5, i4, eseVar)) {
                        i = i3 * 53;
                        a = a5f.l(eseVar, j).hashCode();
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case jn7.y0 /* 62 */:
                    if (q(i5, i4, eseVar)) {
                        i = i3 * 53;
                        a = z(j, eseVar);
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case jn7.z0 /* 63 */:
                    if (q(i5, i4, eseVar)) {
                        i = i3 * 53;
                        a = z(j, eseVar);
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(i5, i4, eseVar)) {
                        i = i3 * 53;
                        a = z(j, eseVar);
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (q(i5, i4, eseVar)) {
                        i = i3 * 53;
                        a = xse.a(A(j, eseVar));
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case jn7.C0 /* 66 */:
                    if (q(i5, i4, eseVar)) {
                        i = i3 * 53;
                        a = z(j, eseVar);
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case jn7.D0 /* 67 */:
                    if (q(i5, i4, eseVar)) {
                        i = i3 * 53;
                        a = xse.a(A(j, eseVar));
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case jn7.E0 /* 68 */:
                    if (q(i5, i4, eseVar)) {
                        i = i3 * 53;
                        a = a5f.l(eseVar, j).hashCode();
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.l.getClass();
        return eseVar.zzb.hashCode() + (i3 * 53);
    }

    public final int h(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, lfd lfdVar) {
        int i9;
        int i10;
        int i11;
        Object object;
        long j2 = this.a[i8 + 2] & 1048575;
        Unsafe unsafe = o;
        switch (i7) {
            case jn7.n0 /* 51 */:
                i9 = i;
                if (i5 != 1) {
                    return i9;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(a7f.j(i9, bArr))));
                i11 = i9 + 8;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case jn7.o0 /* 52 */:
                i10 = i;
                if (i5 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(a7f.a(i10, bArr))));
                i11 = i10 + 4;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case jn7.p0 /* 53 */:
            case jn7.q0 /* 54 */:
                if (i5 != 0) {
                    return i;
                }
                i11 = a7f.i(bArr, i, lfdVar);
                unsafe.putObject(obj, j, Long.valueOf(lfdVar.b));
                unsafe.putInt(obj, j2, i4);
                return i11;
            case jn7.r0 /* 55 */:
            case jn7.y0 /* 62 */:
                if (i5 != 0) {
                    return i;
                }
                i11 = a7f.h(bArr, i, lfdVar);
                unsafe.putObject(obj, j, Integer.valueOf(lfdVar.a));
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 56:
            case 65:
                i9 = i;
                if (i5 != 1) {
                    return i9;
                }
                unsafe.putObject(obj, j, Long.valueOf(a7f.j(i9, bArr)));
                i11 = i9 + 8;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case jn7.t0 /* 57 */:
            case 64:
                i10 = i;
                if (i5 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j, Integer.valueOf(a7f.a(i10, bArr)));
                i11 = i10 + 4;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case jn7.u0 /* 58 */:
                if (i5 != 0) {
                    return i;
                }
                i11 = a7f.i(bArr, i, lfdVar);
                unsafe.putObject(obj, j, Boolean.valueOf(lfdVar.b != 0));
                unsafe.putInt(obj, j2, i4);
                return i11;
            case jn7.v0 /* 59 */:
                if (i5 != 2) {
                    return i;
                }
                int h = a7f.h(bArr, i, lfdVar);
                int i12 = lfdVar.a;
                if (i12 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & TLObject.FLAG_29) != 0) {
                        if (!h5f.a.c(h, h + i12, bArr)) {
                            throw wte.c();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, h, i12, xse.a));
                    h += i12;
                }
                unsafe.putInt(obj, j2, i4);
                return h;
            case jn7.w0 /* 60 */:
                if (i5 != 2) {
                    return i;
                }
                int g = a7f.g(m(i8), bArr, i, i2, lfdVar);
                object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                Object obj2 = lfdVar.c;
                if (object == null) {
                    unsafe.putObject(obj, j, obj2);
                } else {
                    unsafe.putObject(obj, j, xse.b(object, obj2));
                }
                unsafe.putInt(obj, j2, i4);
                return g;
            case jn7.x0 /* 61 */:
                if (i5 != 2) {
                    return i;
                }
                i11 = a7f.m(bArr, i, lfdVar);
                unsafe.putObject(obj, j, lfdVar.c);
                unsafe.putInt(obj, j2, i4);
                return i11;
            case jn7.z0 /* 63 */:
                if (i5 != 0) {
                    return i;
                }
                int h2 = a7f.h(bArr, i, lfdVar);
                int i13 = lfdVar.a;
                r7e w = w(i8);
                if (w != null && !w.a(i13)) {
                    B(obj).a(i3, Long.valueOf(i13));
                    return h2;
                }
                unsafe.putObject(obj, j, Integer.valueOf(i13));
                i11 = h2;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case jn7.C0 /* 66 */:
                if (i5 != 0) {
                    return i;
                }
                i11 = a7f.h(bArr, i, lfdVar);
                unsafe.putObject(obj, j, Integer.valueOf(g7f.a(lfdVar.a)));
                unsafe.putInt(obj, j2, i4);
                return i11;
            case jn7.D0 /* 67 */:
                if (i5 != 0) {
                    return i;
                }
                i11 = a7f.i(bArr, i, lfdVar);
                long j3 = lfdVar.b;
                unsafe.putObject(obj, j, Long.valueOf((j3 >>> 1) ^ (-(j3 & 1))));
                unsafe.putInt(obj, j2, i4);
                return i11;
            case jn7.E0 /* 68 */:
                if (i5 == 3) {
                    i11 = a7f.f(m(i8), bArr, i, i2, (i3 & (-8)) | 4, lfdVar);
                    object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    Object obj3 = lfdVar.c;
                    if (object == null) {
                        unsafe.putObject(obj, j, obj3);
                    } else {
                        unsafe.putObject(obj, j, xse.b(object, obj3));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
            default:
                return i;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int i(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, lfd lfdVar) {
        int b;
        Unsafe unsafe = o;
        bue bueVar = (bue) unsafe.getObject(obj, j2);
        if (!bueVar.zza()) {
            int size = bueVar.size();
            bueVar = bueVar.zza(size == 0 ? 10 : size << 1);
            unsafe.putObject(obj, j2, bueVar);
        }
        bue bueVar2 = bueVar;
        switch (i7) {
            case 18:
            case 35:
                if (i5 != 2) {
                    if (i5 == 1) {
                        a7f.j(i, bArr);
                        throw null;
                    }
                    return i;
                }
                int h = a7f.h(bArr, i, lfdVar);
                int i8 = lfdVar.a + h;
                if (h < i8) {
                    a7f.j(h, bArr);
                    throw null;
                }
                if (h == i8) {
                    return h;
                }
                throw wte.a();
            case 19:
            case 36:
                if (i5 != 2) {
                    if (i5 == 5) {
                        a7f.a(i, bArr);
                        throw null;
                    }
                    return i;
                }
                int h2 = a7f.h(bArr, i, lfdVar);
                int i9 = lfdVar.a + h2;
                if (h2 < i9) {
                    a7f.a(h2, bArr);
                    throw null;
                }
                if (h2 == i9) {
                    return h2;
                }
                throw wte.a();
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 != 2) {
                    if (i5 == 0) {
                        a7f.i(bArr, i, lfdVar);
                        throw null;
                    }
                    return i;
                }
                int h3 = a7f.h(bArr, i, lfdVar);
                int i10 = lfdVar.a + h3;
                if (h3 < i10) {
                    a7f.i(bArr, h3, lfdVar);
                    throw null;
                }
                if (h3 == i10) {
                    return h3;
                }
                throw wte.a();
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 != 2) {
                    if (i5 == 0) {
                        return a7f.b(i3, bArr, i, i2, bueVar2, lfdVar);
                    }
                    return i;
                }
                nse nseVar = (nse) bueVar2;
                int h4 = a7f.h(bArr, i, lfdVar);
                int i11 = lfdVar.a + h4;
                while (h4 < i11) {
                    h4 = a7f.h(bArr, h4, lfdVar);
                    nseVar.i(lfdVar.a);
                }
                if (h4 == i11) {
                    return h4;
                }
                throw wte.a();
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 != 2) {
                    if (i5 == 1) {
                        a7f.j(i, bArr);
                        throw null;
                    }
                    return i;
                }
                int h5 = a7f.h(bArr, i, lfdVar);
                int i12 = lfdVar.a + h5;
                if (h5 < i12) {
                    a7f.j(h5, bArr);
                    throw null;
                }
                if (h5 == i12) {
                    return h5;
                }
                throw wte.a();
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    nse nseVar2 = (nse) bueVar2;
                    int h6 = a7f.h(bArr, i, lfdVar);
                    int i13 = lfdVar.a + h6;
                    while (h6 < i13) {
                        nseVar2.i(a7f.a(h6, bArr));
                        h6 += 4;
                    }
                    if (h6 == i13) {
                        return h6;
                    }
                    throw wte.a();
                }
                if (i5 == 5) {
                    nse nseVar3 = (nse) bueVar2;
                    nseVar3.i(a7f.a(i, bArr));
                    int i14 = i + 4;
                    while (i14 < i2) {
                        int h7 = a7f.h(bArr, i14, lfdVar);
                        if (i3 != lfdVar.a) {
                            return i14;
                        }
                        nseVar3.i(a7f.a(h7, bArr));
                        i14 = h7 + 4;
                    }
                    return i14;
                }
                return i;
            case 25:
            case 42:
                if (i5 != 2) {
                    if (i5 == 0) {
                        a7f.i(bArr, i, lfdVar);
                        throw null;
                    }
                    return i;
                }
                int h8 = a7f.h(bArr, i, lfdVar);
                int i15 = lfdVar.a + h8;
                if (h8 < i15) {
                    a7f.i(bArr, h8, lfdVar);
                    throw null;
                }
                if (h8 == i15) {
                    return h8;
                }
                throw wte.a();
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int h9 = a7f.h(bArr, i, lfdVar);
                        int i16 = lfdVar.a;
                        if (i16 < 0) {
                            throw wte.b();
                        }
                        if (i16 == 0) {
                            bueVar2.add("");
                        } else {
                            bueVar2.add(new String(bArr, h9, i16, xse.a));
                            h9 += i16;
                        }
                        while (h9 < i2) {
                            int h10 = a7f.h(bArr, h9, lfdVar);
                            if (i3 != lfdVar.a) {
                                return h9;
                            }
                            h9 = a7f.h(bArr, h10, lfdVar);
                            int i17 = lfdVar.a;
                            if (i17 < 0) {
                                throw wte.b();
                            }
                            if (i17 == 0) {
                                bueVar2.add("");
                            } else {
                                bueVar2.add(new String(bArr, h9, i17, xse.a));
                                h9 += i17;
                            }
                        }
                        return h9;
                    }
                    int h11 = a7f.h(bArr, i, lfdVar);
                    int i18 = lfdVar.a;
                    if (i18 < 0) {
                        throw wte.b();
                    }
                    if (i18 == 0) {
                        bueVar2.add("");
                    } else {
                        int i19 = h11 + i18;
                        if (!h5f.a.c(h11, i19, bArr)) {
                            throw wte.c();
                        }
                        bueVar2.add(new String(bArr, h11, i18, xse.a));
                        h11 = i19;
                    }
                    while (h11 < i2) {
                        int h12 = a7f.h(bArr, h11, lfdVar);
                        if (i3 != lfdVar.a) {
                            return h11;
                        }
                        h11 = a7f.h(bArr, h12, lfdVar);
                        int i20 = lfdVar.a;
                        if (i20 < 0) {
                            throw wte.b();
                        }
                        if (i20 == 0) {
                            bueVar2.add("");
                        } else {
                            int i21 = h11 + i20;
                            if (!h5f.a.c(h11, i21, bArr)) {
                                throw wte.c();
                            }
                            bueVar2.add(new String(bArr, h11, i20, xse.a));
                            h11 = i21;
                        }
                    }
                    return h11;
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return a7f.e(m(i6), i3, bArr, i, i2, bueVar2, lfdVar);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    int h13 = a7f.h(bArr, i, lfdVar);
                    int i22 = lfdVar.a;
                    if (i22 < 0) {
                        throw wte.b();
                    }
                    if (i22 > bArr.length - h13) {
                        throw wte.a();
                    }
                    if (i22 == 0) {
                        bueVar2.add(jne.c);
                    } else {
                        bueVar2.add(jne.j(h13, i22, bArr));
                        h13 += i22;
                    }
                    while (h13 < i2) {
                        int h14 = a7f.h(bArr, h13, lfdVar);
                        if (i3 != lfdVar.a) {
                            return h13;
                        }
                        h13 = a7f.h(bArr, h14, lfdVar);
                        int i23 = lfdVar.a;
                        if (i23 < 0) {
                            throw wte.b();
                        }
                        if (i23 > bArr.length - h13) {
                            throw wte.a();
                        }
                        if (i23 == 0) {
                            bueVar2.add(jne.c);
                        } else {
                            bueVar2.add(jne.j(h13, i23, bArr));
                            h13 += i23;
                        }
                    }
                    return h13;
                }
                return i;
            case jn7.S /* 30 */:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        b = a7f.b(i3, bArr, i, i2, bueVar2, lfdVar);
                    }
                    return i;
                }
                nse nseVar4 = (nse) bueVar2;
                b = a7f.h(bArr, i, lfdVar);
                int i24 = lfdVar.a + b;
                while (b < i24) {
                    b = a7f.h(bArr, b, lfdVar);
                    nseVar4.i(lfdVar.a);
                }
                if (b != i24) {
                    throw wte.a();
                }
                ese eseVar = (ese) obj;
                h4f h4fVar = eseVar.zzb;
                h4f h4fVar2 = h4fVar != h4f.f ? h4fVar : null;
                r7e w = w(i6);
                Class cls = w1f.a;
                if (w != null) {
                    boolean z = bueVar2 instanceof RandomAccess;
                    d4f d4fVar = this.l;
                    if (z) {
                        int size2 = bueVar2.size();
                        int i25 = 0;
                        for (int i26 = 0; i26 < size2; i26++) {
                            Integer num = (Integer) bueVar2.get(i26);
                            int intValue = num.intValue();
                            if (w.a(intValue)) {
                                if (i26 != i25) {
                                    bueVar2.set(i25, num);
                                }
                                i25++;
                            } else {
                                if (h4fVar2 == null) {
                                    d4fVar.getClass();
                                    h4fVar2 = h4f.b();
                                }
                                d4fVar.getClass();
                                h4fVar2.a(i4 << 3, Long.valueOf(intValue));
                            }
                        }
                        if (i25 != size2) {
                            bueVar2.subList(i25, size2).clear();
                        }
                    } else {
                        Iterator it = bueVar2.iterator();
                        while (it.hasNext()) {
                            int intValue2 = ((Integer) it.next()).intValue();
                            if (!w.a(intValue2)) {
                                if (h4fVar2 == null) {
                                    d4fVar.getClass();
                                    h4fVar2 = h4f.b();
                                }
                                d4fVar.getClass();
                                h4fVar2.a(i4 << 3, Long.valueOf(intValue2));
                                it.remove();
                            }
                        }
                    }
                }
                if (h4fVar2 != null) {
                    eseVar.zzb = h4fVar2;
                }
                return b;
            case 33:
            case 47:
                if (i5 == 2) {
                    nse nseVar5 = (nse) bueVar2;
                    int h15 = a7f.h(bArr, i, lfdVar);
                    int i27 = lfdVar.a + h15;
                    while (h15 < i27) {
                        h15 = a7f.h(bArr, h15, lfdVar);
                        nseVar5.i(g7f.a(lfdVar.a));
                    }
                    if (h15 == i27) {
                        return h15;
                    }
                    throw wte.a();
                }
                if (i5 == 0) {
                    nse nseVar6 = (nse) bueVar2;
                    int h16 = a7f.h(bArr, i, lfdVar);
                    nseVar6.i(g7f.a(lfdVar.a));
                    while (h16 < i2) {
                        int h17 = a7f.h(bArr, h16, lfdVar);
                        if (i3 != lfdVar.a) {
                            return h16;
                        }
                        h16 = a7f.h(bArr, h17, lfdVar);
                        nseVar6.i(g7f.a(lfdVar.a));
                    }
                    return h16;
                }
                return i;
            case 34:
            case 48:
                if (i5 != 2) {
                    if (i5 == 0) {
                        a7f.i(bArr, i, lfdVar);
                        throw null;
                    }
                    return i;
                }
                int h18 = a7f.h(bArr, i, lfdVar);
                int i28 = lfdVar.a + h18;
                if (h18 < i28) {
                    a7f.i(bArr, h18, lfdVar);
                    throw null;
                }
                if (h18 == i28) {
                    return h18;
                }
                throw wte.a();
            case 49:
                if (i5 == 3) {
                    o1f m = m(i6);
                    int i29 = (i3 & (-8)) | 4;
                    int f = a7f.f(m, bArr, i, i2, i29, lfdVar);
                    int i30 = i2;
                    int i31 = i29;
                    lfd lfdVar2 = lfdVar;
                    bueVar2.add(lfdVar2.c);
                    while (f < i30) {
                        int h19 = a7f.h(bArr, f, lfdVar2);
                        if (i3 != lfdVar2.a) {
                            return f;
                        }
                        int i32 = i31;
                        int i33 = i30;
                        lfd lfdVar3 = lfdVar2;
                        f = a7f.f(m, bArr, h19, i33, i32, lfdVar3);
                        bueVar2.add(lfdVar3.c);
                        i31 = i32;
                        i30 = i33;
                        lfdVar2 = lfdVar3;
                    }
                    return f;
                }
                return i;
            default:
                return i;
        }
    }

    public final int j(Object obj, byte[] bArr, int i, int i2, int i3, lfd lfdVar) {
        int i4;
        Unsafe unsafe;
        int[] iArr;
        int i5;
        hze hzeVar;
        Object obj2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr2;
        int i12;
        int i13;
        Unsafe unsafe2;
        byte[] bArr2;
        lfd lfdVar2;
        int i14;
        int i15;
        byte[] bArr3;
        int i16;
        Object obj3;
        int i17;
        int i18;
        int i19;
        int h;
        hze hzeVar2 = this;
        Object obj4 = obj;
        byte[] bArr4 = bArr;
        int i20 = i2;
        lfd lfdVar3 = lfdVar;
        int i21 = i;
        int i22 = -1;
        int i23 = 0;
        int i24 = 0;
        int i25 = 1048575;
        int i26 = 0;
        while (true) {
            int[] iArr3 = hzeVar2.a;
            Unsafe unsafe3 = o;
            if (i21 < i20) {
                int i27 = i21 + 1;
                int i28 = bArr4[i21];
                if (i28 < 0) {
                    i27 = a7f.d(i28, bArr4, i27, lfdVar3);
                    i28 = lfdVar3.a;
                }
                int i29 = i27;
                int i30 = i28;
                int i31 = i30 >>> 3;
                int i32 = i30 & 7;
                int i33 = hzeVar2.d;
                int i34 = hzeVar2.c;
                if (i31 > i22) {
                    i7 = (i31 < i34 || i31 > i33) ? -1 : hzeVar2.s(i31, i23 / 3);
                    i6 = 0;
                } else if (i31 < i34 || i31 > i33) {
                    i6 = 0;
                    i7 = -1;
                } else {
                    i6 = 0;
                    i7 = hzeVar2.s(i31, 0);
                }
                if (i7 == -1) {
                    iArr = iArr3;
                    i8 = i30;
                    i4 = i25;
                    unsafe = unsafe3;
                    i5 = i6;
                    i9 = i31;
                    hzeVar = hzeVar2;
                    obj2 = obj4;
                    i10 = i29;
                    i11 = i5;
                } else {
                    int i35 = iArr3[i7 + 1];
                    int i36 = (i35 & 267386880) >>> 20;
                    long j = i35 & 1048575;
                    if (i36 <= 17) {
                        int i37 = iArr3[i7 + 2];
                        int i38 = 1 << (i37 >>> 20);
                        int i39 = i37 & 1048575;
                        if (i39 != i25) {
                            iArr2 = iArr3;
                            if (i25 != 1048575) {
                                unsafe3.putInt(obj4, i25, i26);
                            }
                            i13 = i39;
                            i12 = unsafe3.getInt(obj4, i39);
                        } else {
                            iArr2 = iArr3;
                            i12 = i26;
                            i13 = i25;
                        }
                        switch (i36) {
                            case 0:
                                bArr2 = bArr;
                                i8 = i30;
                                lfdVar2 = lfdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 != 1) {
                                    int i40 = i14;
                                    obj2 = obj4;
                                    i10 = i40;
                                    hzeVar = hzeVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                } else {
                                    a5f.c.m(obj4, j, Double.longBitsToDouble(a7f.j(i14, bArr2)));
                                    i21 = i14 + 8;
                                    int i41 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i41;
                                    i20 = i2;
                                    lfdVar3 = lfdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                }
                            case 1:
                                bArr2 = bArr;
                                i8 = i30;
                                lfdVar2 = lfdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 != 5) {
                                    int i402 = i14;
                                    obj2 = obj4;
                                    i10 = i402;
                                    hzeVar = hzeVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                } else {
                                    a5f.c.n(obj4, j, Float.intBitsToFloat(a7f.a(i14, bArr2)));
                                    i21 = i14 + 4;
                                    int i412 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i412;
                                    i20 = i2;
                                    lfdVar3 = lfdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                }
                            case 2:
                            case 3:
                                i8 = i30;
                                lfdVar2 = lfdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 != 0) {
                                    int i4022 = i14;
                                    obj2 = obj4;
                                    i10 = i4022;
                                    hzeVar = hzeVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                } else {
                                    int i42 = a7f.i(bArr, i14, lfdVar2);
                                    unsafe2.putLong(obj4, j, lfdVar2.b);
                                    int i43 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr;
                                    i25 = i43;
                                    i20 = i2;
                                    i21 = i42;
                                    lfdVar3 = lfdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                }
                            case 4:
                            case 11:
                                i8 = i30;
                                lfdVar2 = lfdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 != 0) {
                                    int i40222 = i14;
                                    obj2 = obj4;
                                    i10 = i40222;
                                    hzeVar = hzeVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                } else {
                                    int h2 = a7f.h(bArr, i14, lfdVar2);
                                    unsafe2.putInt(obj4, j, lfdVar2.a);
                                    int i44 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr;
                                    i25 = i44;
                                    i20 = i2;
                                    i21 = h2;
                                    lfdVar3 = lfdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                }
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i8 = i30;
                                lfdVar2 = lfdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 != 1) {
                                    int i402222 = i14;
                                    obj2 = obj4;
                                    i10 = i402222;
                                    hzeVar = hzeVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                } else {
                                    unsafe2.putLong(obj4, j, a7f.j(i14, bArr2));
                                    i21 = i14 + 8;
                                    int i4122 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i4122;
                                    i20 = i2;
                                    lfdVar3 = lfdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                }
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i8 = i30;
                                lfdVar2 = lfdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 != 5) {
                                    int i4022222 = i14;
                                    obj2 = obj4;
                                    i10 = i4022222;
                                    hzeVar = hzeVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                } else {
                                    unsafe2.putInt(obj4, j, a7f.a(i14, bArr2));
                                    i21 = i14 + 4;
                                    int i41222 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i41222;
                                    i20 = i2;
                                    lfdVar3 = lfdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                }
                            case 7:
                                bArr2 = bArr;
                                i8 = i30;
                                i15 = i29;
                                lfdVar2 = lfdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                if (i32 != 0) {
                                    i14 = i15;
                                    int i40222222 = i14;
                                    obj2 = obj4;
                                    i10 = i40222222;
                                    hzeVar = hzeVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                } else {
                                    i21 = a7f.i(bArr2, i15, lfdVar2);
                                    a5f.c.o(obj4, j, lfdVar2.b != 0);
                                    int i412222 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i412222;
                                    i20 = i2;
                                    lfdVar3 = lfdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                }
                            case 8:
                                bArr2 = bArr;
                                i8 = i30;
                                i15 = i29;
                                lfdVar2 = lfdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                if (i32 != 2) {
                                    i14 = i15;
                                    int i402222222 = i14;
                                    obj2 = obj4;
                                    i10 = i402222222;
                                    hzeVar = hzeVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                } else {
                                    i21 = (i35 & TLObject.FLAG_29) == 0 ? a7f.k(bArr2, i15, lfdVar2) : a7f.l(bArr2, i15, lfdVar2);
                                    unsafe2.putObject(obj4, j, lfdVar2.c);
                                    int i4122222 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i4122222;
                                    i20 = i2;
                                    lfdVar3 = lfdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                }
                            case 9:
                                bArr3 = bArr;
                                i8 = i30;
                                i15 = i29;
                                lfdVar2 = lfdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i16 = i2;
                                if (i32 != 2) {
                                    i14 = i15;
                                    int i4022222222 = i14;
                                    obj2 = obj4;
                                    i10 = i4022222222;
                                    hzeVar = hzeVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                } else {
                                    i21 = a7f.g(hzeVar2.m(i11), bArr3, i15, i16, lfdVar2);
                                    if ((i12 & i38) == 0) {
                                        unsafe2.putObject(obj4, j, lfdVar2.c);
                                    } else {
                                        unsafe2.putObject(obj4, j, xse.b(unsafe2.getObject(obj4, j), lfdVar2.c));
                                    }
                                    int i45 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr3;
                                    i25 = i45;
                                    i20 = i16;
                                    lfdVar3 = lfdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                }
                            case 10:
                                bArr3 = bArr;
                                i8 = i30;
                                i15 = i29;
                                lfdVar2 = lfdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i16 = i2;
                                if (i32 != 2) {
                                    i14 = i15;
                                    int i40222222222 = i14;
                                    obj2 = obj4;
                                    i10 = i40222222222;
                                    hzeVar = hzeVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                } else {
                                    i21 = a7f.m(bArr3, i15, lfdVar2);
                                    unsafe2.putObject(obj4, j, lfdVar2.c);
                                    int i452 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr3;
                                    i25 = i452;
                                    i20 = i16;
                                    lfdVar3 = lfdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                }
                            case 12:
                                bArr3 = bArr;
                                i8 = i30;
                                i15 = i29;
                                lfdVar2 = lfdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i16 = i2;
                                if (i32 != 0) {
                                    i14 = i15;
                                    int i402222222222 = i14;
                                    obj2 = obj4;
                                    i10 = i402222222222;
                                    hzeVar = hzeVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                } else {
                                    i21 = a7f.h(bArr3, i15, lfdVar2);
                                    int i46 = lfdVar2.a;
                                    r7e w = hzeVar2.w(i11);
                                    if (w == null || w.a(i46)) {
                                        unsafe2.putInt(obj4, j, i46);
                                        int i4522 = i13;
                                        i26 = i12 | i38;
                                        bArr4 = bArr3;
                                        i25 = i4522;
                                        i20 = i16;
                                        lfdVar3 = lfdVar2;
                                        i23 = i11;
                                        i24 = i8;
                                        i22 = i31;
                                    } else {
                                        B(obj4).a(i8, Long.valueOf(i46));
                                        bArr4 = bArr3;
                                        i20 = i16;
                                        i23 = i11;
                                        i25 = i13;
                                        i26 = i12;
                                        i24 = i8;
                                        i22 = i31;
                                        lfdVar3 = lfdVar2;
                                    }
                                }
                                break;
                            case 15:
                                bArr3 = bArr;
                                i8 = i30;
                                i15 = i29;
                                lfdVar2 = lfdVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i16 = i2;
                                if (i32 != 0) {
                                    i14 = i15;
                                    int i4022222222222 = i14;
                                    obj2 = obj4;
                                    i10 = i4022222222222;
                                    hzeVar = hzeVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                } else {
                                    i21 = a7f.h(bArr3, i15, lfdVar2);
                                    unsafe2.putInt(obj4, j, g7f.a(lfdVar2.a));
                                    int i45222 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr3;
                                    i25 = i45222;
                                    i20 = i16;
                                    lfdVar3 = lfdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                }
                            case 16:
                                i8 = i30;
                                i15 = i29;
                                if (i32 != 0) {
                                    i11 = i7;
                                    unsafe2 = unsafe3;
                                    i14 = i15;
                                    int i40222222222222 = i14;
                                    obj2 = obj4;
                                    i10 = i40222222222222;
                                    hzeVar = hzeVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                } else {
                                    int i47 = a7f.i(bArr, i15, lfdVar);
                                    int i48 = i7;
                                    long j2 = lfdVar.b;
                                    lfdVar2 = lfdVar;
                                    obj4 = obj;
                                    i11 = i48;
                                    i16 = i2;
                                    unsafe3.putLong(obj4, j, (j2 >>> 1) ^ (-(j2 & 1)));
                                    int i49 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr;
                                    i25 = i49;
                                    i21 = i47;
                                    i20 = i16;
                                    lfdVar3 = lfdVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                }
                            case 17:
                                if (i32 != 3) {
                                    i8 = i30;
                                    i11 = i7;
                                    unsafe2 = unsafe3;
                                    i14 = i29;
                                    int i402222222222222 = i14;
                                    obj2 = obj4;
                                    i10 = i402222222222222;
                                    hzeVar = hzeVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                } else {
                                    i21 = a7f.f(hzeVar2.m(i7), bArr, i29, i2, (i31 << 3) | 4, lfdVar);
                                    if ((i12 & i38) == 0) {
                                        unsafe3.putObject(obj4, j, lfdVar.c);
                                    } else {
                                        unsafe3.putObject(obj4, j, xse.b(unsafe3.getObject(obj4, j), lfdVar.c));
                                    }
                                    int i50 = i12 | i38;
                                    i23 = i7;
                                    lfdVar3 = lfdVar;
                                    bArr4 = bArr;
                                    i25 = i13;
                                    i24 = i30;
                                    i22 = i31;
                                    i26 = i50;
                                    i20 = i2;
                                }
                            default:
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i8 = i30;
                                i14 = i29;
                                int i4022222222222222 = i14;
                                obj2 = obj4;
                                i10 = i4022222222222222;
                                hzeVar = hzeVar2;
                                unsafe = unsafe2;
                                iArr = iArr2;
                                i9 = i31;
                                i4 = i13;
                                i26 = i12;
                                i5 = 0;
                                break;
                        }
                    } else {
                        lfd lfdVar4 = lfdVar3;
                        i8 = i30;
                        i11 = i7;
                        if (i36 == 27) {
                            if (i32 == 2) {
                                bue bueVar = (bue) unsafe3.getObject(obj4, j);
                                if (!bueVar.zza()) {
                                    int size = bueVar.size();
                                    bueVar = bueVar.zza(size == 0 ? 10 : size << 1);
                                    unsafe3.putObject(obj4, j, bueVar);
                                }
                                obj4 = obj;
                                i20 = i2;
                                lfdVar3 = lfdVar;
                                i21 = a7f.e(hzeVar2.m(i11), i8, bArr, i29, i2, bueVar, lfdVar4);
                                i23 = i11;
                                i24 = i8;
                                i22 = i31;
                                bArr4 = bArr;
                            } else {
                                obj3 = obj;
                                unsafe = unsafe3;
                                i17 = i29;
                                i18 = i26;
                                iArr = iArr3;
                                i19 = i31;
                                i4 = i25;
                                i5 = 0;
                                hzeVar = hzeVar2;
                                obj2 = obj3;
                                i10 = i17;
                                i9 = i19;
                            }
                        } else if (i36 <= 49) {
                            unsafe = unsafe3;
                            i18 = i26;
                            iArr = iArr3;
                            i4 = i25;
                            i5 = 0;
                            h = hzeVar2.i(obj, bArr, i29, i2, i8, i31, i32, i11, i35, i36, j, lfdVar);
                            obj4 = obj;
                            i8 = i8;
                            i22 = i31;
                            i11 = i11;
                            if (h == i29) {
                                hzeVar = hzeVar2;
                                obj2 = obj4;
                                i9 = i22;
                                i10 = h;
                            } else {
                                bArr4 = bArr;
                                i20 = i2;
                                lfdVar3 = lfdVar;
                                i21 = h;
                                i23 = i11;
                                i24 = i8;
                                i25 = i4;
                                i26 = i18;
                            }
                        } else {
                            obj3 = obj;
                            unsafe = unsafe3;
                            i18 = i26;
                            iArr = iArr3;
                            i4 = i25;
                            i17 = i29;
                            i19 = i31;
                            i5 = 0;
                            if (i36 == 50) {
                                if (i32 == 2) {
                                    hzeVar2.o(j, obj3, i11);
                                    throw null;
                                }
                                hzeVar = hzeVar2;
                                obj2 = obj3;
                                i10 = i17;
                                i9 = i19;
                            } else {
                                i9 = i19;
                                h = hzeVar2.h(obj3, bArr, i17, i2, i8, i9, i32, i35, i36, j, i11, lfdVar);
                                hzeVar = hzeVar2;
                                obj2 = obj3;
                                i11 = i11;
                                if (h == i17) {
                                    i10 = h;
                                } else {
                                    bArr4 = bArr;
                                    i20 = i2;
                                    lfdVar3 = lfdVar;
                                    i22 = i9;
                                    i21 = h;
                                    hzeVar2 = hzeVar;
                                    obj4 = obj2;
                                    i23 = i11;
                                    i24 = i8;
                                    i25 = i4;
                                    i26 = i18;
                                }
                            }
                        }
                        i26 = i18;
                    }
                }
                if (i8 != i3 || i3 == 0) {
                    bArr4 = bArr;
                    lfdVar3 = lfdVar;
                    i20 = i2;
                    i22 = i9;
                    hzeVar2 = hzeVar;
                    i23 = i11;
                    i24 = i8;
                    i25 = i4;
                    i21 = a7f.c(i8, bArr4, i10, i2, B(obj2), lfdVar);
                    obj4 = obj2;
                } else {
                    i20 = i2;
                    i21 = i10;
                    i24 = i8;
                }
            } else {
                i4 = i25;
                unsafe = unsafe3;
                iArr = iArr3;
                i5 = 0;
                hzeVar = hzeVar2;
                obj2 = obj4;
            }
        }
        int i51 = i4;
        if (i51 != 1048575) {
            unsafe.putInt(obj2, i51, i26);
        }
        for (int i52 = hzeVar.h; i52 < hzeVar.i; i52++) {
            int i53 = hzeVar.g[i52];
            int i54 = iArr[i53];
            Object l = a5f.l(obj2, hzeVar.y(i53) & 1048575);
            if (l != null && hzeVar.w(i53) != null) {
                hzeVar.m.getClass();
                if (hzeVar.t(i53) == null) {
                    throw new NoSuchMethodError();
                }
                grb.o();
                return i5;
            }
        }
        if (i3 == 0) {
            if (i21 != i20) {
                throw new wte("Failed to parse the message.");
            }
        } else if (i21 > i20 || i24 != i3) {
            throw new wte("Failed to parse the message.");
        }
        return i21;
    }

    public final o1f m(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.b;
        o1f o1fVar = (o1f) objArr[i2];
        if (o1fVar != null) {
            return o1fVar;
        }
        o1f a = w0f.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final void o(long j, Object obj, int i) {
        rxe rxeVar;
        Object t = t(i);
        Unsafe unsafe = o;
        Object object = unsafe.getObject(obj, j);
        this.m.getClass();
        if (!((rxe) object).a) {
            rxe rxeVar2 = rxe.b;
            if (rxeVar2.isEmpty()) {
                rxeVar = new rxe();
            } else {
                rxe rxeVar3 = new rxe(rxeVar2);
                rxeVar3.a = true;
                rxeVar = rxeVar3;
            }
            zxe.a(rxeVar, object);
            unsafe.putObject(obj, j, rxeVar);
        }
        if (t != null) {
            throw new ClassCastException();
        }
        throw new NoSuchMethodError();
    }

    public final void p(ese eseVar, ese eseVar2, int i) {
        long y = y(i) & 1048575;
        if (r(i, eseVar2)) {
            Object l = a5f.l(eseVar, y);
            Object l2 = a5f.l(eseVar2, y);
            if (l != null && l2 != null) {
                a5f.d(y, eseVar, xse.b(l, l2));
                u(eseVar, i);
            } else if (l2 != null) {
                a5f.d(y, eseVar, l2);
                u(eseVar, i);
            }
        }
    }

    public final boolean q(int i, int i2, Object obj) {
        return a5f.b((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final boolean r(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return (a5f.b(j, obj) & (1 << (i2 >>> 20))) != 0;
        }
        int y = y(i);
        long j2 = 1048575 & y;
        switch ((y & 267386880) >>> 20) {
            case 0:
                if (a5f.c.t(j2, obj) != 0.0d) {
                }
                break;
            case 1:
                if (a5f.c.r(j2, obj) != 0.0f) {
                }
                break;
            case 2:
                if (a5f.g(j2, obj) != 0) {
                }
                break;
            case 3:
                if (a5f.g(j2, obj) != 0) {
                }
                break;
            case 4:
                if (a5f.b(j2, obj) != 0) {
                }
                break;
            case 5:
                if (a5f.g(j2, obj) != 0) {
                }
                break;
            case 6:
                if (a5f.b(j2, obj) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                Object l = a5f.l(obj, j2);
                if (!(l instanceof String)) {
                    if (!(l instanceof jne)) {
                        iy8.d();
                        break;
                    } else if (!jne.c.equals(l)) {
                    }
                } else if (!((String) l).isEmpty()) {
                }
                break;
            case 9:
                if (a5f.l(obj, j2) != null) {
                }
                break;
            case 10:
                if (!jne.c.equals(a5f.l(obj, j2))) {
                }
                break;
            case 11:
                if (a5f.b(j2, obj) != 0) {
                }
                break;
            case 12:
                if (a5f.b(j2, obj) != 0) {
                }
                break;
            case 13:
                if (a5f.b(j2, obj) != 0) {
                }
                break;
            case 14:
                if (a5f.g(j2, obj) != 0) {
                }
                break;
            case 15:
                if (a5f.b(j2, obj) != 0) {
                }
                break;
            case 16:
                if (a5f.g(j2, obj) != 0) {
                }
                break;
            case 17:
                if (a5f.l(obj, j2) != null) {
                }
                break;
            default:
                iy8.d();
                break;
        }
        return false;
    }

    public final int s(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final Object t(int i) {
        return this.b[(i / 3) << 1];
    }

    public final void u(ese eseVar, int i) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        a5f.c(j, eseVar, a5f.b(j, eseVar) | (1 << (i2 >>> 20)));
    }

    public final void v(ese eseVar, ese eseVar2, int i) {
        int y = y(i);
        int i2 = this.a[i];
        long j = y & 1048575;
        if (q(i2, i, eseVar2)) {
            Object l = q(i2, i, eseVar) ? a5f.l(eseVar, j) : null;
            Object l2 = a5f.l(eseVar2, j);
            if (l != null && l2 != null) {
                a5f.d(j, eseVar, xse.b(l, l2));
                a5f.c(r1[i + 2] & 1048575, eseVar, i2);
            } else if (l2 != null) {
                a5f.d(j, eseVar, l2);
                a5f.c(r1[i + 2] & 1048575, eseVar, i2);
            }
        }
    }

    public final r7e w(int i) {
        return (r7e) this.b[((i / 3) << 1) + 1];
    }

    public final boolean x(ese eseVar, ese eseVar2, int i) {
        return r(i, eseVar) == r(i, eseVar2);
    }

    public final int y(int i) {
        return this.a[i + 1];
    }

    @Override // o1f
    public final Object zza() {
        this.j.getClass();
        return ((ese) this.e).d(4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o1f
    public final int zzb(Object obj) {
        d4f d4fVar;
        int i;
        int i2;
        int o2;
        int t;
        int f;
        int i3;
        int i4;
        int t2;
        int f2;
        int i5;
        int t3;
        int o3;
        int n2;
        int i6;
        d4f d4fVar2 = this.l;
        zxe zxeVar = this.m;
        int i7 = 267386880;
        int i8 = 1048575;
        int[] iArr = this.a;
        int i9 = 1;
        boolean z = this.f;
        Unsafe unsafe = o;
        if (z) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < iArr.length) {
                int y = y(i10);
                int i12 = (y & i7) >>> 20;
                int i13 = i7;
                int i14 = iArr[i10];
                int i15 = i8;
                int[] iArr2 = iArr;
                long j = y & i8;
                if (i12 >= pqe.b.a && i12 <= pqe.c.a) {
                    int i16 = iArr2[i10 + 2];
                }
                switch (i12) {
                    case 0:
                        if (r(i10, obj)) {
                            i11 = xnb.A(i14 << 3, 8, i11);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (r(i10, obj)) {
                            i11 = xnb.A(i14 << 3, 4, i11);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (r(i10, obj)) {
                            long g = a5f.g(j, obj);
                            t3 = coe.t(i14 << 3);
                            o3 = coe.o(g);
                            i11 += o3 + t3;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (r(i10, obj)) {
                            n2 = coe.n(i14, a5f.g(j, obj));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (r(i10, obj)) {
                            int b = a5f.b(j, obj);
                            t3 = coe.t(i14 << 3);
                            o3 = coe.p(b);
                            i11 += o3 + t3;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (r(i10, obj)) {
                            n2 = coe.r(i14);
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (r(i10, obj)) {
                            n2 = coe.v(i14);
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (r(i10, obj)) {
                            i11 = xnb.A(i14 << 3, 1, i11);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (r(i10, obj)) {
                            Object l = a5f.l(obj, j);
                            if (l instanceof jne) {
                                n2 = coe.i(i14, (jne) l);
                                i11 += n2;
                                break;
                            } else {
                                t3 = coe.t(i14 << 3);
                                o3 = coe.f((String) l);
                                i11 += o3 + t3;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (r(i10, obj)) {
                            n2 = w1f.a(i14, a5f.l(obj, j), m(i10));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (r(i10, obj)) {
                            n2 = coe.i(i14, (jne) a5f.l(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (r(i10, obj)) {
                            n2 = coe.s(i14, a5f.b(j, obj));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (r(i10, obj)) {
                            int b2 = a5f.b(j, obj);
                            t3 = coe.t(i14 << 3);
                            o3 = coe.p(b2);
                            i11 += o3 + t3;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (r(i10, obj)) {
                            i11 = xnb.A(i14 << 3, 4, i11);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (r(i10, obj)) {
                            i11 = xnb.A(i14 << 3, 8, i11);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (r(i10, obj)) {
                            n2 = coe.u(i14, a5f.b(j, obj));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (r(i10, obj)) {
                            n2 = coe.q(i14, a5f.g(j, obj));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (r(i10, obj)) {
                            n2 = coe.h(i14, (hie) a5f.l(obj, j), m(i10));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        n2 = w1f.C(i14, (List) a5f.l(obj, j));
                        i11 += n2;
                        break;
                    case 19:
                        n2 = w1f.z(i14, (List) a5f.l(obj, j));
                        i11 += n2;
                        break;
                    case 20:
                        List list = (List) a5f.l(obj, j);
                        Class cls = w1f.a;
                        if (list.size() != 0) {
                            n2 = dze.a(i14, list.size(), w1f.c(list));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 21:
                        List list2 = (List) a5f.l(obj, j);
                        Class cls2 = w1f.a;
                        int size = list2.size();
                        if (size != 0) {
                            n2 = dze.a(i14, size, w1f.k(list2));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 22:
                        List list3 = (List) a5f.l(obj, j);
                        Class cls3 = w1f.a;
                        int size2 = list3.size();
                        if (size2 != 0) {
                            n2 = dze.a(i14, size2, w1f.t(list3));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 23:
                        n2 = w1f.C(i14, (List) a5f.l(obj, j));
                        i11 += n2;
                        break;
                    case 24:
                        n2 = w1f.z(i14, (List) a5f.l(obj, j));
                        i11 += n2;
                        break;
                    case 25:
                        List list4 = (List) a5f.l(obj, j);
                        Class cls4 = w1f.a;
                        int size3 = list4.size();
                        if (size3 != 0) {
                            n2 = (coe.t(i14 << 3) + 1) * size3;
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 26:
                        n2 = w1f.j(i14, (List) a5f.l(obj, j));
                        i11 += n2;
                        break;
                    case 27:
                        n2 = w1f.b(i14, (List) a5f.l(obj, j), m(i10));
                        i11 += n2;
                        break;
                    case 28:
                        n2 = w1f.o(i14, (List) a5f.l(obj, j));
                        i11 += n2;
                        break;
                    case 29:
                        List list5 = (List) a5f.l(obj, j);
                        Class cls5 = w1f.a;
                        int size4 = list5.size();
                        if (size4 != 0) {
                            n2 = dze.a(i14, size4, w1f.v(list5));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case jn7.S /* 30 */:
                        List list6 = (List) a5f.l(obj, j);
                        Class cls6 = w1f.a;
                        int size5 = list6.size();
                        if (size5 != 0) {
                            n2 = dze.a(i14, size5, w1f.r(list6));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 31:
                        n2 = w1f.z(i14, (List) a5f.l(obj, j));
                        i11 += n2;
                        break;
                    case 32:
                        n2 = w1f.C(i14, (List) a5f.l(obj, j));
                        i11 += n2;
                        break;
                    case 33:
                        List list7 = (List) a5f.l(obj, j);
                        Class cls7 = w1f.a;
                        int size6 = list7.size();
                        if (size6 != 0) {
                            n2 = dze.a(i14, size6, w1f.x(list7));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 34:
                        List list8 = (List) a5f.l(obj, j);
                        Class cls8 = w1f.a;
                        int size7 = list8.size();
                        if (size7 != 0) {
                            n2 = dze.a(i14, size7, w1f.p(list8));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 35:
                        int D = w1f.D((List) unsafe.getObject(obj, j));
                        if (D > 0) {
                            i11 = dze.b(D, coe.m(i14), D, i11);
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        int A = w1f.A((List) unsafe.getObject(obj, j));
                        if (A > 0) {
                            i11 = dze.b(A, coe.m(i14), A, i11);
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        int c = w1f.c((List) unsafe.getObject(obj, j));
                        if (c > 0) {
                            i11 = dze.b(c, coe.m(i14), c, i11);
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        int k = w1f.k((List) unsafe.getObject(obj, j));
                        if (k > 0) {
                            i11 = dze.b(k, coe.m(i14), k, i11);
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        int t4 = w1f.t((List) unsafe.getObject(obj, j));
                        if (t4 > 0) {
                            i11 = dze.b(t4, coe.m(i14), t4, i11);
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        int D2 = w1f.D((List) unsafe.getObject(obj, j));
                        if (D2 > 0) {
                            i11 = dze.b(D2, coe.m(i14), D2, i11);
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        int A2 = w1f.A((List) unsafe.getObject(obj, j));
                        if (A2 > 0) {
                            i11 = dze.b(A2, coe.m(i14), A2, i11);
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        List list9 = (List) unsafe.getObject(obj, j);
                        Class cls9 = w1f.a;
                        int size8 = list9.size();
                        if (size8 > 0) {
                            i11 = dze.b(size8, coe.m(i14), size8, i11);
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        int v = w1f.v((List) unsafe.getObject(obj, j));
                        if (v > 0) {
                            i11 = dze.b(v, coe.m(i14), v, i11);
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        int r = w1f.r((List) unsafe.getObject(obj, j));
                        if (r > 0) {
                            i11 = dze.b(r, coe.m(i14), r, i11);
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        int A3 = w1f.A((List) unsafe.getObject(obj, j));
                        if (A3 > 0) {
                            i11 = dze.b(A3, coe.m(i14), A3, i11);
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        int D3 = w1f.D((List) unsafe.getObject(obj, j));
                        if (D3 > 0) {
                            i11 = dze.b(D3, coe.m(i14), D3, i11);
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        int x = w1f.x((List) unsafe.getObject(obj, j));
                        if (x > 0) {
                            i11 = dze.b(x, coe.m(i14), x, i11);
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        int p = w1f.p((List) unsafe.getObject(obj, j));
                        if (p > 0) {
                            i11 = dze.b(p, coe.m(i14), p, i11);
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        List list10 = (List) a5f.l(obj, j);
                        o1f m = m(i10);
                        Class cls10 = w1f.a;
                        int size9 = list10.size();
                        if (size9 == 0) {
                            i6 = 0;
                        } else {
                            i6 = 0;
                            for (int i17 = 0; i17 < size9; i17++) {
                                i6 = coe.h(i14, (hie) list10.get(i17), m) + i6;
                            }
                        }
                        i11 = i6 + i11;
                        break;
                    case 50:
                        Object l2 = a5f.l(obj, j);
                        Object t5 = t(i10);
                        zxeVar.getClass();
                        zxe.b(l2, t5);
                        break;
                    case jn7.n0 /* 51 */:
                        if (q(i14, i10, obj)) {
                            i11 = xnb.A(i14 << 3, 8, i11);
                            break;
                        } else {
                            break;
                        }
                    case jn7.o0 /* 52 */:
                        if (q(i14, i10, obj)) {
                            i11 = xnb.A(i14 << 3, 4, i11);
                            break;
                        } else {
                            break;
                        }
                    case jn7.p0 /* 53 */:
                        if (q(i14, i10, obj)) {
                            long A4 = A(j, obj);
                            t3 = coe.t(i14 << 3);
                            o3 = coe.o(A4);
                            i11 += o3 + t3;
                            break;
                        } else {
                            break;
                        }
                    case jn7.q0 /* 54 */:
                        if (q(i14, i10, obj)) {
                            n2 = coe.n(i14, A(j, obj));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case jn7.r0 /* 55 */:
                        if (q(i14, i10, obj)) {
                            int z2 = z(j, obj);
                            t3 = coe.t(i14 << 3);
                            o3 = coe.p(z2);
                            i11 += o3 + t3;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (q(i14, i10, obj)) {
                            n2 = coe.r(i14);
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case jn7.t0 /* 57 */:
                        if (q(i14, i10, obj)) {
                            n2 = coe.v(i14);
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case jn7.u0 /* 58 */:
                        if (q(i14, i10, obj)) {
                            i11 = xnb.A(i14 << 3, 1, i11);
                            break;
                        } else {
                            break;
                        }
                    case jn7.v0 /* 59 */:
                        if (q(i14, i10, obj)) {
                            Object l3 = a5f.l(obj, j);
                            if (l3 instanceof jne) {
                                n2 = coe.i(i14, (jne) l3);
                                i11 += n2;
                                break;
                            } else {
                                t3 = coe.t(i14 << 3);
                                o3 = coe.f((String) l3);
                                i11 += o3 + t3;
                                break;
                            }
                        } else {
                            break;
                        }
                    case jn7.w0 /* 60 */:
                        if (q(i14, i10, obj)) {
                            n2 = w1f.a(i14, a5f.l(obj, j), m(i10));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case jn7.x0 /* 61 */:
                        if (q(i14, i10, obj)) {
                            n2 = coe.i(i14, (jne) a5f.l(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case jn7.y0 /* 62 */:
                        if (q(i14, i10, obj)) {
                            n2 = coe.s(i14, z(j, obj));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case jn7.z0 /* 63 */:
                        if (q(i14, i10, obj)) {
                            int z3 = z(j, obj);
                            t3 = coe.t(i14 << 3);
                            o3 = coe.p(z3);
                            i11 += o3 + t3;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (q(i14, i10, obj)) {
                            i11 = xnb.A(i14 << 3, 4, i11);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (q(i14, i10, obj)) {
                            i11 = xnb.A(i14 << 3, 8, i11);
                            break;
                        } else {
                            break;
                        }
                    case jn7.C0 /* 66 */:
                        if (q(i14, i10, obj)) {
                            n2 = coe.u(i14, z(j, obj));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case jn7.D0 /* 67 */:
                        if (q(i14, i10, obj)) {
                            n2 = coe.q(i14, A(j, obj));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case jn7.E0 /* 68 */:
                        if (q(i14, i10, obj)) {
                            n2 = coe.h(i14, (hie) a5f.l(obj, j), m(i10));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                }
                i10 += 3;
                i7 = i13;
                i8 = i15;
                iArr = iArr2;
            }
            d4fVar2.getClass();
            return ((ese) obj).zzb.d() + i11;
        }
        int i18 = 1048575;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        while (i19 < iArr.length) {
            int y2 = y(i19);
            int i22 = iArr[i19];
            int i23 = (y2 & 267386880) >>> 20;
            int i24 = i9;
            if (i23 <= 17) {
                int i25 = iArr[i19 + 2];
                int i26 = i25 & 1048575;
                i = i24 << (i25 >>> 20);
                d4fVar = d4fVar2;
                if (i26 != i18) {
                    i21 = unsafe.getInt(obj, i26);
                    i18 = i26;
                }
            } else {
                d4fVar = d4fVar2;
                i = 0;
            }
            long j2 = y2 & 1048575;
            switch (i23) {
                case 0:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        i20 = xnb.A(i22 << 3, 8, i20);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        i20 = xnb.A(i22 << 3, 4, i20);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        o2 = coe.o(unsafe.getLong(obj, j2)) + coe.t(i22 << 3);
                        i20 += o2;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        o2 = coe.n(i22, unsafe.getLong(obj, j2));
                        i20 += o2;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        o2 = coe.p(unsafe.getInt(obj, j2)) + coe.t(i22 << 3);
                        i20 += o2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        o2 = coe.r(i22);
                        i20 += o2;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        o2 = coe.v(i22);
                        i20 += o2;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i & i21) != 0) {
                        i2 = 1;
                        i20 = xnb.A(i22 << 3, 1, i20);
                        break;
                    }
                    i2 = 1;
                    break;
                case 8:
                    if ((i & i21) != 0) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof jne) {
                            i3 = coe.i(i22, (jne) object);
                            i20 += i3;
                        } else {
                            t = coe.t(i22 << 3);
                            f = coe.f((String) object);
                            i3 = f + t;
                            i20 += i3;
                        }
                    }
                    i2 = 1;
                    break;
                case 9:
                    if ((i & i21) != 0) {
                        i3 = w1f.a(i22, unsafe.getObject(obj, j2), m(i19));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 10:
                    if ((i & i21) != 0) {
                        i3 = coe.i(i22, (jne) unsafe.getObject(obj, j2));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 11:
                    if ((i & i21) != 0) {
                        i3 = coe.s(i22, unsafe.getInt(obj, j2));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 12:
                    if ((i & i21) != 0) {
                        int i27 = unsafe.getInt(obj, j2);
                        t = coe.t(i22 << 3);
                        f = coe.p(i27);
                        i3 = f + t;
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 13:
                    if ((i & i21) != 0) {
                        i20 = xnb.A(i22 << 3, 4, i20);
                    }
                    i2 = 1;
                    break;
                case 14:
                    if ((i & i21) != 0) {
                        i20 = xnb.A(i22 << 3, 8, i20);
                    }
                    i2 = 1;
                    break;
                case 15:
                    if ((i & i21) != 0) {
                        i3 = coe.u(i22, unsafe.getInt(obj, j2));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 16:
                    if ((i & i21) != 0) {
                        i3 = coe.q(i22, unsafe.getLong(obj, j2));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 17:
                    if ((i & i21) != 0) {
                        i3 = coe.h(i22, (hie) unsafe.getObject(obj, j2), m(i19));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 18:
                    i3 = w1f.C(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 19:
                    i3 = w1f.z(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 20:
                    List list11 = (List) unsafe.getObject(obj, j2);
                    Class cls11 = w1f.a;
                    if (list11.size() != 0) {
                        i3 = dze.a(i22, list11.size(), w1f.c(list11));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 21:
                    List list12 = (List) unsafe.getObject(obj, j2);
                    Class cls12 = w1f.a;
                    int size10 = list12.size();
                    if (size10 != 0) {
                        i3 = dze.a(i22, size10, w1f.k(list12));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 22:
                    List list13 = (List) unsafe.getObject(obj, j2);
                    Class cls13 = w1f.a;
                    int size11 = list13.size();
                    if (size11 != 0) {
                        i3 = dze.a(i22, size11, w1f.t(list13));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 23:
                    i3 = w1f.C(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 24:
                    i3 = w1f.z(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 25:
                    List list14 = (List) unsafe.getObject(obj, j2);
                    Class cls14 = w1f.a;
                    int size12 = list14.size();
                    i20 += size12 == 0 ? 0 : (coe.t(i22 << 3) + 1) * size12;
                    i2 = 1;
                    break;
                case 26:
                    i3 = w1f.j(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 27:
                    i3 = w1f.b(i22, (List) unsafe.getObject(obj, j2), m(i19));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 28:
                    i3 = w1f.o(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 29:
                    List list15 = (List) unsafe.getObject(obj, j2);
                    Class cls15 = w1f.a;
                    int size13 = list15.size();
                    if (size13 != 0) {
                        i3 = dze.a(i22, size13, w1f.v(list15));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case jn7.S /* 30 */:
                    List list16 = (List) unsafe.getObject(obj, j2);
                    Class cls16 = w1f.a;
                    int size14 = list16.size();
                    if (size14 != 0) {
                        i3 = dze.a(i22, size14, w1f.r(list16));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 31:
                    i3 = w1f.z(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 32:
                    i3 = w1f.C(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 33:
                    List list17 = (List) unsafe.getObject(obj, j2);
                    Class cls17 = w1f.a;
                    int size15 = list17.size();
                    if (size15 != 0) {
                        i3 = dze.a(i22, size15, w1f.x(list17));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 34:
                    List list18 = (List) unsafe.getObject(obj, j2);
                    Class cls18 = w1f.a;
                    int size16 = list18.size();
                    if (size16 != 0) {
                        i3 = dze.a(i22, size16, w1f.p(list18));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 35:
                    int D4 = w1f.D((List) unsafe.getObject(obj, j2));
                    if (D4 > 0) {
                        i20 = dze.b(D4, coe.m(i22), D4, i20);
                    }
                    i2 = 1;
                    break;
                case 36:
                    int A5 = w1f.A((List) unsafe.getObject(obj, j2));
                    if (A5 > 0) {
                        i20 = dze.b(A5, coe.m(i22), A5, i20);
                    }
                    i2 = 1;
                    break;
                case 37:
                    int c2 = w1f.c((List) unsafe.getObject(obj, j2));
                    if (c2 > 0) {
                        i20 = dze.b(c2, coe.m(i22), c2, i20);
                    }
                    i2 = 1;
                    break;
                case 38:
                    int k2 = w1f.k((List) unsafe.getObject(obj, j2));
                    if (k2 > 0) {
                        i20 = dze.b(k2, coe.m(i22), k2, i20);
                    }
                    i2 = 1;
                    break;
                case 39:
                    int t6 = w1f.t((List) unsafe.getObject(obj, j2));
                    if (t6 > 0) {
                        i20 = dze.b(t6, coe.m(i22), t6, i20);
                    }
                    i2 = 1;
                    break;
                case 40:
                    int D5 = w1f.D((List) unsafe.getObject(obj, j2));
                    if (D5 > 0) {
                        i20 = dze.b(D5, coe.m(i22), D5, i20);
                    }
                    i2 = 1;
                    break;
                case 41:
                    int A6 = w1f.A((List) unsafe.getObject(obj, j2));
                    if (A6 > 0) {
                        i20 = dze.b(A6, coe.m(i22), A6, i20);
                    }
                    i2 = 1;
                    break;
                case 42:
                    List list19 = (List) unsafe.getObject(obj, j2);
                    Class cls19 = w1f.a;
                    int size17 = list19.size();
                    if (size17 > 0) {
                        i20 = dze.b(size17, coe.m(i22), size17, i20);
                    }
                    i2 = 1;
                    break;
                case 43:
                    int v2 = w1f.v((List) unsafe.getObject(obj, j2));
                    if (v2 > 0) {
                        i20 = dze.b(v2, coe.m(i22), v2, i20);
                    }
                    i2 = 1;
                    break;
                case 44:
                    int r2 = w1f.r((List) unsafe.getObject(obj, j2));
                    if (r2 > 0) {
                        i20 = dze.b(r2, coe.m(i22), r2, i20);
                    }
                    i2 = 1;
                    break;
                case 45:
                    int A7 = w1f.A((List) unsafe.getObject(obj, j2));
                    if (A7 > 0) {
                        i20 = dze.b(A7, coe.m(i22), A7, i20);
                    }
                    i2 = 1;
                    break;
                case 46:
                    int D6 = w1f.D((List) unsafe.getObject(obj, j2));
                    if (D6 > 0) {
                        i20 = dze.b(D6, coe.m(i22), D6, i20);
                    }
                    i2 = 1;
                    break;
                case 47:
                    int x2 = w1f.x((List) unsafe.getObject(obj, j2));
                    if (x2 > 0) {
                        i20 = dze.b(x2, coe.m(i22), x2, i20);
                    }
                    i2 = 1;
                    break;
                case 48:
                    int p2 = w1f.p((List) unsafe.getObject(obj, j2));
                    if (p2 > 0) {
                        i20 = dze.b(p2, coe.m(i22), p2, i20);
                    }
                    i2 = 1;
                    break;
                case 49:
                    List list20 = (List) unsafe.getObject(obj, j2);
                    o1f m2 = m(i19);
                    Class cls20 = w1f.a;
                    int size18 = list20.size();
                    if (size18 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (int i28 = 0; i28 < size18; i28++) {
                            i4 += coe.h(i22, (hie) list20.get(i28), m2);
                        }
                    }
                    i20 += i4;
                    i2 = 1;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j2);
                    Object t7 = t(i19);
                    zxeVar.getClass();
                    zxe.b(object2, t7);
                    i2 = 1;
                    break;
                case jn7.n0 /* 51 */:
                    if (q(i22, i19, obj)) {
                        i20 = xnb.A(i22 << 3, 8, i20);
                    }
                    i2 = 1;
                    break;
                case jn7.o0 /* 52 */:
                    if (q(i22, i19, obj)) {
                        i20 = xnb.A(i22 << 3, 4, i20);
                    }
                    i2 = 1;
                    break;
                case jn7.p0 /* 53 */:
                    if (q(i22, i19, obj)) {
                        i3 = coe.o(A(j2, obj)) + coe.t(i22 << 3);
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case jn7.q0 /* 54 */:
                    if (q(i22, i19, obj)) {
                        i3 = coe.n(i22, A(j2, obj));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case jn7.r0 /* 55 */:
                    if (q(i22, i19, obj)) {
                        int z4 = z(j2, obj);
                        t = coe.t(i22 << 3);
                        f = coe.p(z4);
                        i3 = f + t;
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 56:
                    if (q(i22, i19, obj)) {
                        i3 = coe.r(i22);
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case jn7.t0 /* 57 */:
                    if (q(i22, i19, obj)) {
                        i3 = coe.v(i22);
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case jn7.u0 /* 58 */:
                    if (q(i22, i19, obj)) {
                        i20 = xnb.A(i22 << 3, i24, i20);
                        i2 = i24;
                        break;
                    }
                    i2 = 1;
                    break;
                case jn7.v0 /* 59 */:
                    if (q(i22, i19, obj)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (object3 instanceof jne) {
                            i5 = coe.i(i22, (jne) object3);
                            i20 += i5;
                        } else {
                            t2 = coe.t(i22 << 3);
                            f2 = coe.f((String) object3);
                            i5 = f2 + t2;
                            i20 += i5;
                        }
                    }
                    i2 = i24;
                    break;
                case jn7.w0 /* 60 */:
                    if (q(i22, i19, obj)) {
                        i5 = w1f.a(i22, unsafe.getObject(obj, j2), m(i19));
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case jn7.x0 /* 61 */:
                    if (q(i22, i19, obj)) {
                        i5 = coe.i(i22, (jne) unsafe.getObject(obj, j2));
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case jn7.y0 /* 62 */:
                    if (q(i22, i19, obj)) {
                        i5 = coe.s(i22, z(j2, obj));
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case jn7.z0 /* 63 */:
                    if (q(i22, i19, obj)) {
                        int z5 = z(j2, obj);
                        t2 = coe.t(i22 << 3);
                        f2 = coe.p(z5);
                        i5 = f2 + t2;
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case 64:
                    if (q(i22, i19, obj)) {
                        i20 = xnb.A(i22 << 3, 4, i20);
                    }
                    i2 = i24;
                    break;
                case 65:
                    if (q(i22, i19, obj)) {
                        i20 = xnb.A(i22 << 3, 8, i20);
                    }
                    i2 = i24;
                    break;
                case jn7.C0 /* 66 */:
                    if (q(i22, i19, obj)) {
                        i5 = coe.u(i22, z(j2, obj));
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case jn7.D0 /* 67 */:
                    if (q(i22, i19, obj)) {
                        i5 = coe.q(i22, A(j2, obj));
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case jn7.E0 /* 68 */:
                    if (q(i22, i19, obj)) {
                        i5 = coe.h(i22, (hie) unsafe.getObject(obj, j2), m(i19));
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                default:
                    i2 = i24;
                    break;
            }
            i19 += 3;
            i9 = i2;
            d4fVar2 = d4fVar;
        }
        d4fVar2.getClass();
        return ((ese) obj).zzb.d() + i20;
    }
}
