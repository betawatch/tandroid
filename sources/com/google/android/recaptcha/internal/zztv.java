package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
final class zztv<T> implements zzug<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzvc.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzts zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzuv zzm;
    private final zzrz zzn;

    private zztv(int[] iArr, Object[] objArr, int i, int i2, zzts zztsVar, boolean z, int[] iArr2, int i3, int i4, zzty zztyVar, zztf zztfVar, zzuv zzuvVar, zzrz zzrzVar, zztn zztnVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zztsVar instanceof zzsn;
        boolean z2 = false;
        if (zzrzVar != null && (zztsVar instanceof zzsk)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzm = zzuvVar;
        this.zzn = zzrzVar;
        this.zzg = zztsVar;
    }

    private final Object zzA(Object obj, int i) {
        zzug zzx = zzx(i);
        int zzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzB(Object obj, int i, int i2) {
        zzug zzx = zzx(i2);
        if (!zzR(obj, i, i2)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i2) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder l = yjb.l("Field ", str, " for ", name, " not found. Known fields are ");
            l.append(arrays);
            throw new RuntimeException(l.toString(), e);
        }
    }

    private static void zzD(Object obj) {
        if (zzQ(obj)) {
            return;
        }
        w26.j("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            int zzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                sc8.j(mue.d("Source subfield ", this.zzc[i], " is present but null: ", obj2.toString()));
                return;
            }
            zzug zzx = zzx(i);
            if (!zzN(obj, i)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzH(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzR(obj2, i2, i)) {
            int zzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                sc8.j(mue.d("Source subfield ", iArr[i], " is present but null: ", obj2.toString()));
                return;
            }
            zzug zzx = zzx(i);
            if (!zzR(obj, i2, i)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzI(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i, zzuf zzufVar) {
        long j = i & 1048575;
        if (zzM(i)) {
            zzvc.zzs(obj, j, zzufVar.zzs());
        } else if (this.zzi) {
            zzvc.zzs(obj, j, zzufVar.zzr());
        } else {
            zzvc.zzs(obj, j, zzufVar.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int zzr = zzr(i);
        long j = 1048575 & zzr;
        if (j == 1048575) {
            return;
        }
        zzvc.zzq(obj, j, zzvc.zzc(obj, j) | (1 << (zzr >>> 20)));
    }

    private final void zzI(Object obj, int i, int i2) {
        zzvc.zzq(obj, zzr(i2) & 1048575, i);
    }

    private final void zzJ(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzu(i) & 1048575, obj2);
        zzH(obj, i);
    }

    private final void zzK(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzu(i2) & 1048575, obj2);
        zzI(obj, i, i2);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private static boolean zzM(int i) {
        return (i & TLObject.FLAG_29) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int zzr = zzr(i);
        long j = zzr & 1048575;
        if (j != 1048575) {
            return (zzvc.zzc(obj, j) & (1 << (zzr >>> 20))) != 0;
        }
        int zzu = zzu(i);
        long j2 = 1048575 & zzu;
        switch (zzt(zzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzvc.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzvc.zzb(obj, j2)) != 0;
            case 2:
                return zzvc.zzd(obj, j2) != 0;
            case 3:
                return zzvc.zzd(obj, j2) != 0;
            case 4:
                return zzvc.zzc(obj, j2) != 0;
            case 5:
                return zzvc.zzd(obj, j2) != 0;
            case 6:
                return zzvc.zzc(obj, j2) != 0;
            case 7:
                return zzvc.zzw(obj, j2);
            case 8:
                Object zzf = zzvc.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzqm) {
                    return !zzqm.zzb.equals(zzf);
                }
                sc8.e();
                return false;
            case 9:
                return zzvc.zzf(obj, j2) != null;
            case 10:
                return !zzqm.zzb.equals(zzvc.zzf(obj, j2));
            case 11:
                return zzvc.zzc(obj, j2) != 0;
            case 12:
                return zzvc.zzc(obj, j2) != 0;
            case 13:
                return zzvc.zzc(obj, j2) != 0;
            case 14:
                return zzvc.zzd(obj, j2) != 0;
            case 15:
                return zzvc.zzc(obj, j2) != 0;
            case 16:
                return zzvc.zzd(obj, j2) != 0;
            case 17:
                return zzvc.zzf(obj, j2) != null;
            default:
                sc8.e();
                return false;
        }
    }

    private final boolean zzO(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzN(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzP(Object obj, int i, zzug zzugVar) {
        return zzugVar.zzl(zzvc.zzf(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzsn) {
            return ((zzsn) obj).zzL();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzvc.zzc(obj, (long) (zzr(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzvc.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzvi zzviVar) {
        if (obj instanceof String) {
            zzviVar.zzG(i, (String) obj);
        } else {
            zzviVar.zzd(i, (zzqm) obj);
        }
    }

    public static zzuw zzd(Object obj) {
        zzsn zzsnVar = (zzsn) obj;
        zzuw zzuwVar = zzsnVar.zzc;
        if (zzuwVar != zzuw.zzc()) {
            return zzuwVar;
        }
        zzuw zzf = zzuw.zzf();
        zzsnVar.zzc = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zztv zzm(Class cls, zztp zztpVar, zzty zztyVar, zztf zztfVar, zzuv zzuvVar, zzrz zzrzVar, zztn zztnVar) {
        int i;
        int charAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        char charAt2;
        int i9;
        char charAt3;
        int i10;
        char charAt4;
        int i11;
        char charAt5;
        int i12;
        char charAt6;
        int i13;
        char charAt7;
        int i14;
        char charAt8;
        int i15;
        char charAt9;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Object[] objArr;
        int i21;
        int i22;
        int objectFieldOffset;
        int i23;
        String str;
        char c;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Field zzC;
        int i29;
        char charAt10;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        Object obj;
        Field zzC2;
        Object obj2;
        Field zzC3;
        int i37;
        char charAt11;
        int i38;
        char charAt12;
        int i39;
        char charAt13;
        int i40;
        char charAt14;
        if (!(zztpVar instanceof zzue)) {
            throw null;
        }
        zzue zzueVar = (zzue) zztpVar;
        String zzd = zzueVar.zzd();
        int length = zzd.length();
        char c2 = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i41 = 1;
            while (true) {
                i = i41 + 1;
                if (zzd.charAt(i41) < 55296) {
                    break;
                }
                i41 = i;
            }
        } else {
            i = 1;
        }
        int i42 = i + 1;
        int charAt15 = zzd.charAt(i);
        if (charAt15 >= 55296) {
            int i43 = charAt15 & 8191;
            int i44 = 13;
            while (true) {
                i40 = i42 + 1;
                charAt14 = zzd.charAt(i42);
                if (charAt14 < 55296) {
                    break;
                }
                i43 |= (charAt14 & 8191) << i44;
                i44 += 13;
                i42 = i40;
            }
            charAt15 = i43 | (charAt14 << i44);
            i42 = i40;
        }
        if (charAt15 == 0) {
            i3 = 0;
            i6 = 0;
            charAt = 0;
            i2 = 0;
            i4 = 0;
            i5 = 0;
            iArr = zza;
            i7 = 0;
        } else {
            int i45 = i42 + 1;
            int charAt16 = zzd.charAt(i42);
            if (charAt16 >= 55296) {
                int i46 = charAt16 & 8191;
                int i47 = 13;
                while (true) {
                    i15 = i45 + 1;
                    charAt9 = zzd.charAt(i45);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i46 |= (charAt9 & 8191) << i47;
                    i47 += 13;
                    i45 = i15;
                }
                charAt16 = i46 | (charAt9 << i47);
                i45 = i15;
            }
            int i48 = i45 + 1;
            int charAt17 = zzd.charAt(i45);
            if (charAt17 >= 55296) {
                int i49 = charAt17 & 8191;
                int i50 = 13;
                while (true) {
                    i14 = i48 + 1;
                    charAt8 = zzd.charAt(i48);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i49 |= (charAt8 & 8191) << i50;
                    i50 += 13;
                    i48 = i14;
                }
                charAt17 = i49 | (charAt8 << i50);
                i48 = i14;
            }
            int i51 = i48 + 1;
            int charAt18 = zzd.charAt(i48);
            if (charAt18 >= 55296) {
                int i52 = charAt18 & 8191;
                int i53 = 13;
                while (true) {
                    i13 = i51 + 1;
                    charAt7 = zzd.charAt(i51);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i52 |= (charAt7 & 8191) << i53;
                    i53 += 13;
                    i51 = i13;
                }
                charAt18 = i52 | (charAt7 << i53);
                i51 = i13;
            }
            int i54 = i51 + 1;
            int charAt19 = zzd.charAt(i51);
            if (charAt19 >= 55296) {
                int i55 = charAt19 & 8191;
                int i56 = 13;
                while (true) {
                    i12 = i54 + 1;
                    charAt6 = zzd.charAt(i54);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i55 |= (charAt6 & 8191) << i56;
                    i56 += 13;
                    i54 = i12;
                }
                charAt19 = i55 | (charAt6 << i56);
                i54 = i12;
            }
            int i57 = i54 + 1;
            charAt = zzd.charAt(i54);
            if (charAt >= 55296) {
                int i58 = charAt & 8191;
                int i59 = 13;
                while (true) {
                    i11 = i57 + 1;
                    charAt5 = zzd.charAt(i57);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i58 |= (charAt5 & 8191) << i59;
                    i59 += 13;
                    i57 = i11;
                }
                charAt = i58 | (charAt5 << i59);
                i57 = i11;
            }
            int i60 = i57 + 1;
            int charAt20 = zzd.charAt(i57);
            if (charAt20 >= 55296) {
                int i61 = charAt20 & 8191;
                int i62 = 13;
                while (true) {
                    i10 = i60 + 1;
                    charAt4 = zzd.charAt(i60);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i61 |= (charAt4 & 8191) << i62;
                    i62 += 13;
                    i60 = i10;
                }
                charAt20 = i61 | (charAt4 << i62);
                i60 = i10;
            }
            int i63 = i60 + 1;
            int charAt21 = zzd.charAt(i60);
            if (charAt21 >= 55296) {
                int i64 = charAt21 & 8191;
                int i65 = 13;
                while (true) {
                    i9 = i63 + 1;
                    charAt3 = zzd.charAt(i63);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i64 |= (charAt3 & 8191) << i65;
                    i65 += 13;
                    i63 = i9;
                }
                charAt21 = i64 | (charAt3 << i65);
                i63 = i9;
            }
            int i66 = i63 + 1;
            int charAt22 = zzd.charAt(i63);
            if (charAt22 >= 55296) {
                int i67 = charAt22 & 8191;
                int i68 = 13;
                while (true) {
                    i8 = i66 + 1;
                    charAt2 = zzd.charAt(i66);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i67 |= (charAt2 & 8191) << i68;
                    i68 += 13;
                    i66 = i8;
                }
                charAt22 = i67 | (charAt2 << i68);
                i66 = i8;
            }
            int i69 = (charAt16 << 1) + charAt17;
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i70 = charAt20;
            i2 = charAt18;
            i3 = i70;
            i4 = charAt19;
            i5 = charAt22;
            i6 = i69;
            iArr = iArr2;
            i7 = charAt16;
            i42 = i66;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzueVar.zze();
        Class<?> cls2 = zzueVar.zza().getClass();
        int i71 = i5 + i3;
        int i72 = charAt << 1;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr2 = new Object[i72];
        int i73 = i5;
        int i74 = i71;
        int i75 = 0;
        int i76 = 0;
        while (i42 < length) {
            int i77 = i42 + 1;
            int charAt23 = zzd.charAt(i42);
            if (charAt23 >= c2) {
                int i78 = charAt23 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i39 = i79 + 1;
                    charAt13 = zzd.charAt(i79);
                    if (charAt13 < c2) {
                        break;
                    }
                    i78 |= (charAt13 & 8191) << i80;
                    i80 += 13;
                    i79 = i39;
                }
                charAt23 = i78 | (charAt13 << i80);
                i16 = i39;
            } else {
                i16 = i77;
            }
            int i81 = i16 + 1;
            int charAt24 = zzd.charAt(i16);
            if (charAt24 >= c2) {
                int i82 = charAt24 & 8191;
                int i83 = i81;
                int i84 = 13;
                while (true) {
                    i38 = i83 + 1;
                    charAt12 = zzd.charAt(i83);
                    if (charAt12 < c2) {
                        break;
                    }
                    i82 |= (charAt12 & 8191) << i84;
                    i84 += 13;
                    i83 = i38;
                }
                charAt24 = i82 | (charAt12 << i84);
                i17 = i38;
            } else {
                i17 = i81;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i75] = i76;
                i75++;
            }
            int i85 = charAt24 & kk7.d4;
            zzue zzueVar2 = zzueVar;
            int i86 = charAt24 & 2048;
            if (i85 >= 51) {
                int i87 = i17 + 1;
                int charAt25 = zzd.charAt(i17);
                char c3 = 55296;
                if (charAt25 >= 55296) {
                    int i88 = charAt25 & 8191;
                    int i89 = i87;
                    int i90 = 13;
                    while (true) {
                        i37 = i89 + 1;
                        charAt11 = zzd.charAt(i89);
                        if (charAt11 < c3) {
                            break;
                        }
                        i88 |= (charAt11 & 8191) << i90;
                        i90 += 13;
                        i89 = i37;
                        c3 = 55296;
                    }
                    charAt25 = i88 | (charAt11 << i90);
                    i33 = i37;
                } else {
                    i33 = i87;
                }
                int i91 = i33;
                int i92 = i85 - 51;
                i18 = length;
                if (i92 == 9 || i92 == 17) {
                    i34 = 1;
                    i35 = i6 + 1;
                    objArr2[((i76 / 3) << 1) + 1] = zze[i6];
                } else if (i92 == 12) {
                    i34 = 1;
                    if (zzueVar2.zzc() == 1 || i86 != 0) {
                        i35 = i6 + 1;
                        objArr2[((i76 / 3) << 1) + 1] = zze[i6];
                    } else {
                        i36 = 0;
                        int i93 = charAt25 << i34;
                        obj = zze[i93];
                        int i94 = i36;
                        if (obj instanceof Field) {
                            zzC2 = (Field) obj;
                        } else {
                            zzC2 = zzC(cls2, (String) obj);
                            zze[i93] = zzC2;
                        }
                        int i95 = i7;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zzC2);
                        int i96 = i93 + 1;
                        obj2 = zze[i96];
                        i19 = i95;
                        if (obj2 instanceof Field) {
                            zzC3 = (Field) obj2;
                        } else {
                            zzC3 = zzC(cls2, (String) obj2);
                            zze[i96] = zzC3;
                        }
                        int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzC3);
                        str = zzd;
                        objArr = objArr2;
                        i24 = i91;
                        i26 = 0;
                        c = 55296;
                        i27 = objectFieldOffset2;
                        i28 = i94;
                    }
                } else {
                    i34 = 1;
                    i36 = i86;
                    int i932 = charAt25 << i34;
                    obj = zze[i932];
                    int i942 = i36;
                    if (obj instanceof Field) {
                    }
                    int i952 = i7;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzC2);
                    int i962 = i932 + 1;
                    obj2 = zze[i962];
                    i19 = i952;
                    if (obj2 instanceof Field) {
                    }
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzC3);
                    str = zzd;
                    objArr = objArr2;
                    i24 = i91;
                    i26 = 0;
                    c = 55296;
                    i27 = objectFieldOffset22;
                    i28 = i942;
                }
                i6 = i35;
                i36 = i86;
                int i9322 = charAt25 << i34;
                obj = zze[i9322];
                int i9422 = i36;
                if (obj instanceof Field) {
                }
                int i9522 = i7;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzC2);
                int i9622 = i9322 + 1;
                obj2 = zze[i9622];
                i19 = i9522;
                if (obj2 instanceof Field) {
                }
                int objectFieldOffset222 = (int) unsafe.objectFieldOffset(zzC3);
                str = zzd;
                objArr = objArr2;
                i24 = i91;
                i26 = 0;
                c = 55296;
                i27 = objectFieldOffset222;
                i28 = i9422;
            } else {
                i18 = length;
                i19 = i7;
                int i97 = i6 + 1;
                Field zzC4 = zzC(cls2, (String) zze[i6]);
                if (i85 == 9 || i85 == 17) {
                    i20 = i97;
                    objArr2[((i76 / 3) << 1) + 1] = zzC4.getType();
                } else {
                    if (i85 == 27) {
                        i30 = i97;
                        i31 = 1;
                        i32 = i6 + 2;
                    } else if (i85 == 49) {
                        i32 = i6 + 2;
                        i30 = i97;
                        i31 = 1;
                    } else {
                        if (i85 == 12 || i85 == 30 || i85 == 44) {
                            if (zzueVar2.zzc() == 1 || i86 != 0) {
                                i32 = i6 + 2;
                                objArr2[((i76 / 3) << 1) + 1] = zze[i97];
                                objArr = objArr2;
                                i21 = i86;
                                i22 = i32;
                                objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                                if ((charAt24 & TLObject.FLAG_12) != 0 || i85 > 17) {
                                    i23 = i21;
                                    str = zzd;
                                    c = 55296;
                                    i24 = i17;
                                    i25 = 1048575;
                                    i26 = 0;
                                } else {
                                    i24 = i17 + 1;
                                    int charAt26 = zzd.charAt(i17);
                                    if (charAt26 >= 55296) {
                                        int i98 = charAt26 & 8191;
                                        int i99 = 13;
                                        while (true) {
                                            i29 = i24 + 1;
                                            charAt10 = zzd.charAt(i24);
                                            if (charAt10 < 55296) {
                                                break;
                                            }
                                            i98 |= (charAt10 & 8191) << i99;
                                            i99 += 13;
                                            i24 = i29;
                                        }
                                        charAt26 = i98 | (charAt10 << i99);
                                        i24 = i29;
                                    }
                                    int i100 = (charAt26 / 32) + (i19 << 1);
                                    Object obj3 = zze[i100];
                                    i23 = i21;
                                    if (obj3 instanceof Field) {
                                        zzC = (Field) obj3;
                                    } else {
                                        zzC = zzC(cls2, (String) obj3);
                                        zze[i100] = zzC;
                                    }
                                    str = zzd;
                                    i25 = (int) unsafe.objectFieldOffset(zzC);
                                    i26 = charAt26 % 32;
                                    c = 55296;
                                }
                                if (i85 >= 18 || i85 > 49) {
                                    i27 = i25;
                                    i6 = i22;
                                } else {
                                    iArr[i74] = objectFieldOffset;
                                    i74++;
                                    i6 = i22;
                                    i27 = i25;
                                }
                                i28 = i23;
                            } else {
                                objArr = objArr2;
                                i22 = i97;
                            }
                        } else if (i85 == 50) {
                            int i101 = i6 + 2;
                            int i102 = i73 + 1;
                            iArr[i73] = i76;
                            int i103 = (i76 / 3) << 1;
                            objArr2[i103] = zze[i97];
                            if (i86 != 0) {
                                objArr2[i103 + 1] = zze[i101];
                                i22 = i6 + 3;
                                i21 = i86;
                                objArr = objArr2;
                                i73 = i102;
                                objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                                if ((charAt24 & TLObject.FLAG_12) != 0) {
                                }
                                i23 = i21;
                                str = zzd;
                                c = 55296;
                                i24 = i17;
                                i25 = 1048575;
                                i26 = 0;
                                if (i85 >= 18) {
                                }
                                i27 = i25;
                                i6 = i22;
                                i28 = i23;
                            } else {
                                i22 = i101;
                                objArr = objArr2;
                                i73 = i102;
                            }
                        } else {
                            i20 = i97;
                        }
                        i21 = 0;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                        if ((charAt24 & TLObject.FLAG_12) != 0) {
                        }
                        i23 = i21;
                        str = zzd;
                        c = 55296;
                        i24 = i17;
                        i25 = 1048575;
                        i26 = 0;
                        if (i85 >= 18) {
                        }
                        i27 = i25;
                        i6 = i22;
                        i28 = i23;
                    }
                    objArr2[((i76 / 3) << i31) + i31] = zze[i30];
                    objArr = objArr2;
                    i21 = i86;
                    i22 = i32;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                    if ((charAt24 & TLObject.FLAG_12) != 0) {
                    }
                    i23 = i21;
                    str = zzd;
                    c = 55296;
                    i24 = i17;
                    i25 = 1048575;
                    i26 = 0;
                    if (i85 >= 18) {
                    }
                    i27 = i25;
                    i6 = i22;
                    i28 = i23;
                }
                objArr = objArr2;
                i21 = i86;
                i22 = i20;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                if ((charAt24 & TLObject.FLAG_12) != 0) {
                }
                i23 = i21;
                str = zzd;
                c = 55296;
                i24 = i17;
                i25 = 1048575;
                i26 = 0;
                if (i85 >= 18) {
                }
                i27 = i25;
                i6 = i22;
                i28 = i23;
            }
            int i104 = i76 + 1;
            iArr3[i76] = charAt23;
            int i105 = i76 + 2;
            iArr3[i104] = ((charAt24 & 512) != 0 ? TLObject.FLAG_29 : 0) | ((charAt24 & 256) != 0 ? TLObject.FLAG_28 : 0) | (i28 != 0 ? TLObject.FLAG_31 : 0) | (i85 << 20) | objectFieldOffset;
            i76 += 3;
            iArr3[i105] = (i26 << 20) | i27;
            i42 = i24;
            c2 = c;
            zzueVar = zzueVar2;
            zzd = str;
            length = i18;
            objArr2 = objArr;
            i7 = i19;
        }
        return new zztv(iArr3, objArr2, i2, i4, zzueVar.zza(), false, iArr, i5, i71, zztyVar, zztfVar, zzuvVar, zzrzVar, zztnVar);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzvc.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzvc.zzf(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzvc.zzf(obj, j)).intValue();
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzs(i, 0);
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i2) {
        int[] iArr = this.zzc;
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

    private static int zzt(int i) {
        return (i >>> 20) & kk7.d4;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzvc.zzf(obj, j)).longValue();
    }

    private final zzsr zzw(int i) {
        return (zzsr) this.zzd[((i / 3) << 1) + 1];
    }

    private final zzug zzx(int i) {
        Object[] objArr = this.zzd;
        int i2 = (i / 3) << 1;
        zzug zzugVar = (zzug) objArr[i2];
        if (zzugVar != null) {
            return zzugVar;
        }
        zzug zzb2 = zzuc.zza().zzb((Class) objArr[i2 + 1]);
        objArr[i2] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzuv zzuvVar, Object obj3) {
        int i2 = this.zzc[i];
        Object zzf = zzvc.zzf(obj, zzu(i) & 1048575);
        if (zzf == null || zzw(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i) {
        return this.zzd[(i / 3) << 1];
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final int zza(Object obj) {
        int i;
        int zzA;
        int zzB;
        int zzA2;
        int zzd;
        int zzA3;
        int zzh;
        int zzw;
        int zzA4;
        int size;
        int zzl;
        int zzA5;
        int zzA6;
        int zze;
        int zzA7;
        int zzA8;
        int i2;
        int i3;
        int zzA9;
        int zzB2;
        int zzA10;
        int zzd2;
        int zzA11;
        zztv<T> zztvVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        while (true) {
            int[] iArr = zztvVar.zzc;
            if (i5 >= iArr.length) {
                int zza2 = ((zzsn) obj).zzc.zza() + i7;
                if (!zztvVar.zzh) {
                    return zza2;
                }
                zzuo zzuoVar = ((zzsk) obj).zzb.zza;
                int zzc = zzuoVar.zzc();
                int i9 = 0;
                for (int i10 = 0; i10 < zzc; i10++) {
                    Map.Entry zzg = zzuoVar.zzg(i10);
                    i9 += zzsd.zza((zzsc) ((zzuk) zzg).zza(), zzg.getValue());
                }
                for (Map.Entry entry : zzuoVar.zzd()) {
                    i9 += zzsd.zza((zzsc) entry.getKey(), entry.getValue());
                }
                return zza2 + i9;
            }
            int zzu = zztvVar.zzu(i5);
            int zzt = zzt(zzu);
            int i11 = iArr[i5];
            int i12 = iArr[i5 + 2];
            int i13 = i12 & i4;
            if (zzt <= 17) {
                if (i13 != i8) {
                    i6 = i13 == i4 ? 0 : unsafe.getInt(obj2, i13);
                    i8 = i13;
                }
                i = 1 << (i12 >>> 20);
            } else {
                i = 0;
            }
            int i14 = zzu & i4;
            if (zzt >= zzse.zzJ.zza()) {
                zzse.zzW.zza();
            }
            long j = i14;
            switch (zzt) {
                case 0:
                    if (zztvVar.zzO(obj2, i5, i8, i6, i)) {
                        i7 = mue.e(i11 << 3, 8, i7);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 1:
                    if (zztvVar.zzO(obj2, i5, i8, i6, i)) {
                        i7 = mue.e(i11 << 3, 4, i7);
                    }
                    zztvVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 2:
                    if (zztvVar.zzO(obj2, i5, i8, i6, i)) {
                        long j2 = unsafe.getLong(obj2, j);
                        zzA = zzqv.zzA(i11 << 3);
                        zzB = zzqv.zzB(j2);
                        i7 += zzB + zzA;
                    }
                    zztvVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 3:
                    if (zztvVar.zzO(obj2, i5, i8, i6, i)) {
                        long j3 = unsafe.getLong(obj2, j);
                        zzA = zzqv.zzA(i11 << 3);
                        zzB = zzqv.zzB(j3);
                        i7 += zzB + zzA;
                    }
                    zztvVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 4:
                    if (zztvVar.zzO(obj2, i5, i8, i6, i)) {
                        long j4 = unsafe.getInt(obj2, j);
                        zzA = zzqv.zzA(i11 << 3);
                        zzB = zzqv.zzB(j4);
                        i7 += zzB + zzA;
                    }
                    zztvVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 5:
                    if (zztvVar.zzO(obj2, i5, i8, i6, i)) {
                        i7 = mue.e(i11 << 3, 8, i7);
                    }
                    zztvVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 6:
                    if (zztvVar.zzO(obj2, i5, i8, i6, i)) {
                        i7 = mue.e(i11 << 3, 4, i7);
                    }
                    zztvVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 7:
                    if (zztvVar.zzO(obj2, i5, i8, i6, i)) {
                        i7 = mue.e(i11 << 3, 1, i7);
                    }
                    zztvVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 8:
                    if (zztvVar.zzO(obj2, i5, i8, i6, i)) {
                        int i15 = i11 << 3;
                        Object object = unsafe.getObject(obj2, j);
                        if (object instanceof zzqm) {
                            zzA2 = zzqv.zzA(i15);
                            zzd = ((zzqm) object).zzd();
                            zzA3 = zzqv.zzA(zzd);
                            i7 += zzA3 + zzd + zzA2;
                        } else {
                            i7 += zzqv.zzz((String) object) + zzqv.zzA(i15);
                        }
                    }
                    zztvVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 9:
                    if (zztvVar.zzO(obj2, i5, i8, i6, i)) {
                        zzh = zzui.zzh(i11, unsafe.getObject(obj2, j), zztvVar.zzx(i5));
                        i7 += zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    } else {
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                case 10:
                    if (zztvVar.zzO(obj2, i5, i8, i6, i)) {
                        zzqm zzqmVar = (zzqm) unsafe.getObject(obj2, j);
                        zzA2 = zzqv.zzA(i11 << 3);
                        zzd = zzqmVar.zzd();
                        zzA3 = zzqv.zzA(zzd);
                        i7 += zzA3 + zzd + zzA2;
                    }
                    zztvVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 11:
                    if (zztvVar.zzO(obj2, i5, i8, i6, i)) {
                        i7 = mue.e(unsafe.getInt(obj2, j), zzqv.zzA(i11 << 3), i7);
                    }
                    zztvVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 12:
                    if (zztvVar.zzO(obj2, i5, i8, i6, i)) {
                        long j5 = unsafe.getInt(obj2, j);
                        zzA = zzqv.zzA(i11 << 3);
                        zzB = zzqv.zzB(j5);
                        i7 += zzB + zzA;
                    }
                    zztvVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 13:
                    if (zztvVar.zzO(obj2, i5, i8, i6, i)) {
                        i7 = mue.e(i11 << 3, 4, i7);
                    }
                    zztvVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 14:
                    if (zztvVar.zzO(obj2, i5, i8, i6, i)) {
                        i7 = mue.e(i11 << 3, 8, i7);
                    }
                    zztvVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 15:
                    if (zztvVar.zzO(obj2, i5, i8, i6, i)) {
                        int i16 = unsafe.getInt(obj2, j);
                        i7 = mue.e((i16 << 1) ^ (i16 >> 31), zzqv.zzA(i11 << 3), i7);
                    }
                    zztvVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 16:
                    if (zztvVar.zzO(obj2, i5, i8, i6, i)) {
                        long j6 = unsafe.getLong(obj2, j);
                        zzA = zzqv.zzA(i11 << 3);
                        zzB = zzqv.zzB((j6 << 1) ^ (j6 >> 63));
                        i7 += zzB + zzA;
                    }
                    zztvVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 17:
                    if (zztvVar.zzO(obj2, i5, i8, i6, i)) {
                        zzw = zzqv.zzw(i11, (zzts) unsafe.getObject(obj2, j), zztvVar.zzx(i5));
                        i7 += zzw;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    } else {
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                case 18:
                    zzh = zzui.zzd(i11, (List) unsafe.getObject(obj2, j), false);
                    i7 += zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 19:
                    zzh = zzui.zzb(i11, (List) unsafe.getObject(obj2, j), false);
                    i7 += zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j);
                    int i17 = zzui.zza;
                    if (list.size() != 0) {
                        zzA4 = (zzqv.zzA(i11 << 3) * list.size()) + zzui.zzg(list);
                        i7 += zzA4;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzA4 = 0;
                    i7 += zzA4;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j);
                    int i18 = zzui.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zzui.zzl(list2);
                        zzA5 = zzqv.zzA(i11 << 3);
                        zzA4 = (zzA5 * size) + zzl;
                        i7 += zzA4;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzA4 = 0;
                    i7 += zzA4;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j);
                    int i19 = zzui.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zzui.zzf(list3);
                        zzA5 = zzqv.zzA(i11 << 3);
                        zzA4 = (zzA5 * size) + zzl;
                        i7 += zzA4;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzA4 = 0;
                    i7 += zzA4;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 23:
                    zzh = zzui.zzd(i11, (List) unsafe.getObject(obj2, j), false);
                    i7 += zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 24:
                    zzh = zzui.zzb(i11, (List) unsafe.getObject(obj2, j), false);
                    i7 += zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j);
                    int i20 = zzui.zza;
                    int size2 = list4.size();
                    i7 += size2 == 0 ? 0 : (zzqv.zzA(i11 << 3) + 1) * size2;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j);
                    int i21 = zzui.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzA4 = zzqv.zzA(i11 << 3) * size3;
                        if (list5 instanceof zzte) {
                            zzte zzteVar = (zzte) list5;
                            for (int i22 = 0; i22 < size3; i22++) {
                                Object zzc2 = zzteVar.zzc();
                                if (zzc2 instanceof zzqm) {
                                    int zzd3 = ((zzqm) zzc2).zzd();
                                    zzA4 = mue.e(zzd3, zzd3, zzA4);
                                } else {
                                    zzA4 = zzqv.zzz((String) zzc2) + zzA4;
                                }
                            }
                        } else {
                            for (int i23 = 0; i23 < size3; i23++) {
                                Object obj3 = list5.get(i23);
                                if (obj3 instanceof zzqm) {
                                    int zzd4 = ((zzqm) obj3).zzd();
                                    zzA4 = mue.e(zzd4, zzd4, zzA4);
                                } else {
                                    zzA4 = zzqv.zzz((String) obj3) + zzA4;
                                }
                            }
                        }
                        i7 += zzA4;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzA4 = 0;
                    i7 += zzA4;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j);
                    zzug zzx = zztvVar.zzx(i5);
                    int i24 = zzui.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzA6 = 0;
                    } else {
                        zzA6 = zzqv.zzA(i11 << 3) * size4;
                        for (int i25 = 0; i25 < size4; i25++) {
                            Object obj4 = list6.get(i25);
                            if (obj4 instanceof zztd) {
                                int zza3 = ((zztd) obj4).zza();
                                zzA6 = mue.e(zza3, zza3, zzA6);
                            } else {
                                zzA6 = zzqv.zzy((zzts) obj4, zzx) + zzA6;
                            }
                        }
                    }
                    i7 += zzA6;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j);
                    int i26 = zzui.zza;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        zzA4 = zzqv.zzA(i11 << 3) * size5;
                        for (int i27 = 0; i27 < list7.size(); i27++) {
                            int zzd5 = ((zzqm) list7.get(i27)).zzd();
                            zzA4 = mue.e(zzd5, zzd5, zzA4);
                        }
                        i7 += zzA4;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzA4 = 0;
                    i7 += zzA4;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j);
                    int i28 = zzui.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzl = zzui.zzk(list8);
                        zzA5 = zzqv.zzA(i11 << 3);
                        zzA4 = (zzA5 * size) + zzl;
                        i7 += zzA4;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzA4 = 0;
                    i7 += zzA4;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case kk7.S /* 30 */:
                    List list9 = (List) unsafe.getObject(obj2, j);
                    int i29 = zzui.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzl = zzui.zza(list9);
                        zzA5 = zzqv.zzA(i11 << 3);
                        zzA4 = (zzA5 * size) + zzl;
                        i7 += zzA4;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzA4 = 0;
                    i7 += zzA4;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 31:
                    zzh = zzui.zzb(i11, (List) unsafe.getObject(obj2, j), false);
                    i7 += zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 32:
                    zzh = zzui.zzd(i11, (List) unsafe.getObject(obj2, j), false);
                    i7 += zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j);
                    int i30 = zzui.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzl = zzui.zzi(list10);
                        zzA5 = zzqv.zzA(i11 << 3);
                        zzA4 = (zzA5 * size) + zzl;
                        i7 += zzA4;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzA4 = 0;
                    i7 += zzA4;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j);
                    int i31 = zzui.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzl = zzui.zzj(list11);
                        zzA5 = zzqv.zzA(i11 << 3);
                        zzA4 = (zzA5 * size) + zzl;
                        i7 += zzA4;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzA4 = 0;
                    i7 += zzA4;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 35:
                    zze = zzui.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA7 = zzqv.zzA(i11 << 3);
                        zzA8 = zzqv.zzA(zze);
                        i2 = zzA8 + zzA7 + zze;
                        i7 += i2;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    } else {
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                case 36:
                    zze = zzui.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA7 = zzqv.zzA(i11 << 3);
                        zzA8 = zzqv.zzA(zze);
                        i2 = zzA8 + zzA7 + zze;
                        i7 += i2;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    } else {
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                case 37:
                    zze = zzui.zzg((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA7 = zzqv.zzA(i11 << 3);
                        zzA8 = zzqv.zzA(zze);
                        i2 = zzA8 + zzA7 + zze;
                        i7 += i2;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    } else {
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                case 38:
                    zze = zzui.zzl((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA7 = zzqv.zzA(i11 << 3);
                        zzA8 = zzqv.zzA(zze);
                        i2 = zzA8 + zzA7 + zze;
                        i7 += i2;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    } else {
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                case 39:
                    zze = zzui.zzf((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA7 = zzqv.zzA(i11 << 3);
                        zzA8 = zzqv.zzA(zze);
                        i2 = zzA8 + zzA7 + zze;
                        i7 += i2;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    } else {
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                case 40:
                    zze = zzui.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA7 = zzqv.zzA(i11 << 3);
                        zzA8 = zzqv.zzA(zze);
                        i2 = zzA8 + zzA7 + zze;
                        i7 += i2;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    } else {
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                case 41:
                    zze = zzui.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA7 = zzqv.zzA(i11 << 3);
                        zzA8 = zzqv.zzA(zze);
                        i2 = zzA8 + zzA7 + zze;
                        i7 += i2;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    } else {
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j);
                    int i32 = zzui.zza;
                    zze = list12.size();
                    if (zze > 0) {
                        zzA7 = zzqv.zzA(i11 << 3);
                        zzA8 = zzqv.zzA(zze);
                        i2 = zzA8 + zzA7 + zze;
                        i7 += i2;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    } else {
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                case 43:
                    zze = zzui.zzk((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA7 = zzqv.zzA(i11 << 3);
                        zzA8 = zzqv.zzA(zze);
                        i2 = zzA8 + zzA7 + zze;
                        i7 += i2;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    } else {
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                case 44:
                    zze = zzui.zza((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA7 = zzqv.zzA(i11 << 3);
                        zzA8 = zzqv.zzA(zze);
                        i2 = zzA8 + zzA7 + zze;
                        i7 += i2;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    } else {
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                case 45:
                    zze = zzui.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA7 = zzqv.zzA(i11 << 3);
                        zzA8 = zzqv.zzA(zze);
                        i2 = zzA8 + zzA7 + zze;
                        i7 += i2;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    } else {
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                case 46:
                    zze = zzui.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA7 = zzqv.zzA(i11 << 3);
                        zzA8 = zzqv.zzA(zze);
                        i2 = zzA8 + zzA7 + zze;
                        i7 += i2;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    } else {
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                case 47:
                    zze = zzui.zzi((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA7 = zzqv.zzA(i11 << 3);
                        zzA8 = zzqv.zzA(zze);
                        i2 = zzA8 + zzA7 + zze;
                        i7 += i2;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    } else {
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                case 48:
                    zze = zzui.zzj((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA7 = zzqv.zzA(i11 << 3);
                        zzA8 = zzqv.zzA(zze);
                        i2 = zzA8 + zzA7 + zze;
                        i7 += i2;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    } else {
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j);
                    zzug zzx2 = zztvVar.zzx(i5);
                    int i33 = zzui.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                        for (int i34 = 0; i34 < size6; i34++) {
                            i3 += zzqv.zzw(i11, (zzts) list13.get(i34), zzx2);
                        }
                    }
                    i7 += i3;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 50:
                    zztm zztmVar = (zztm) unsafe.getObject(obj2, j);
                    if (zztmVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zztmVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            entry2.getKey();
                            entry2.getValue();
                            throw null;
                        }
                    }
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case kk7.n0 /* 51 */:
                    if (zztvVar.zzR(obj2, i11, i5)) {
                        i7 = mue.e(i11 << 3, 8, i7);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case kk7.o0 /* 52 */:
                    if (zztvVar.zzR(obj2, i11, i5)) {
                        i7 = mue.e(i11 << 3, 4, i7);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case kk7.p0 /* 53 */:
                    if (zztvVar.zzR(obj2, i11, i5)) {
                        long zzv = zzv(obj2, j);
                        zzA9 = zzqv.zzA(i11 << 3);
                        zzB2 = zzqv.zzB(zzv);
                        i7 += zzB2 + zzA9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    } else {
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                case kk7.q0 /* 54 */:
                    if (zztvVar.zzR(obj2, i11, i5)) {
                        long zzv2 = zzv(obj2, j);
                        zzA9 = zzqv.zzA(i11 << 3);
                        zzB2 = zzqv.zzB(zzv2);
                        i7 += zzB2 + zzA9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    } else {
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                case kk7.r0 /* 55 */:
                    if (zztvVar.zzR(obj2, i11, i5)) {
                        long zzp = zzp(obj2, j);
                        zzA9 = zzqv.zzA(i11 << 3);
                        zzB2 = zzqv.zzB(zzp);
                        i7 += zzB2 + zzA9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    } else {
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                case 56:
                    if (zztvVar.zzR(obj2, i11, i5)) {
                        i7 = mue.e(i11 << 3, 8, i7);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case kk7.t0 /* 57 */:
                    if (zztvVar.zzR(obj2, i11, i5)) {
                        i7 = mue.e(i11 << 3, 4, i7);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case kk7.u0 /* 58 */:
                    if (zztvVar.zzR(obj2, i11, i5)) {
                        i7 = mue.e(i11 << 3, 1, i7);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case kk7.v0 /* 59 */:
                    if (zztvVar.zzR(obj2, i11, i5)) {
                        int i35 = i11 << 3;
                        Object object2 = unsafe.getObject(obj2, j);
                        if (object2 instanceof zzqm) {
                            zzA10 = zzqv.zzA(i35);
                            zzd2 = ((zzqm) object2).zzd();
                            zzA11 = zzqv.zzA(zzd2);
                            i2 = zzA11 + zzd2 + zzA10;
                            i7 += i2;
                            i5 += 3;
                            obj2 = obj;
                            i4 = 1048575;
                        } else {
                            zzw = zzqv.zzz((String) object2) + zzqv.zzA(i35);
                            i7 += zzw;
                            i5 += 3;
                            obj2 = obj;
                            i4 = 1048575;
                        }
                    } else {
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                case kk7.w0 /* 60 */:
                    if (zztvVar.zzR(obj2, i11, i5)) {
                        zzh = zzui.zzh(i11, unsafe.getObject(obj2, j), zztvVar.zzx(i5));
                        i7 += zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    } else {
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                case kk7.x0 /* 61 */:
                    if (zztvVar.zzR(obj2, i11, i5)) {
                        zzqm zzqmVar2 = (zzqm) unsafe.getObject(obj2, j);
                        zzA10 = zzqv.zzA(i11 << 3);
                        zzd2 = zzqmVar2.zzd();
                        zzA11 = zzqv.zzA(zzd2);
                        i2 = zzA11 + zzd2 + zzA10;
                        i7 += i2;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    } else {
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                case kk7.y0 /* 62 */:
                    if (zztvVar.zzR(obj2, i11, i5)) {
                        i7 = mue.e(zzp(obj2, j), zzqv.zzA(i11 << 3), i7);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case kk7.z0 /* 63 */:
                    if (zztvVar.zzR(obj2, i11, i5)) {
                        long zzp2 = zzp(obj2, j);
                        zzA9 = zzqv.zzA(i11 << 3);
                        zzB2 = zzqv.zzB(zzp2);
                        i7 += zzB2 + zzA9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    } else {
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                case 64:
                    if (zztvVar.zzR(obj2, i11, i5)) {
                        i7 = mue.e(i11 << 3, 4, i7);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 65:
                    if (zztvVar.zzR(obj2, i11, i5)) {
                        i7 = mue.e(i11 << 3, 8, i7);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case kk7.C0 /* 66 */:
                    if (zztvVar.zzR(obj2, i11, i5)) {
                        int zzp3 = zzp(obj2, j);
                        i7 = mue.e((zzp3 << 1) ^ (zzp3 >> 31), zzqv.zzA(i11 << 3), i7);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case kk7.D0 /* 67 */:
                    if (zztvVar.zzR(obj2, i11, i5)) {
                        long zzv3 = zzv(obj2, j);
                        zzA9 = zzqv.zzA(i11 << 3);
                        zzB2 = zzqv.zzB((zzv3 << 1) ^ (zzv3 >> 63));
                        i7 += zzB2 + zzA9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    } else {
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                case kk7.E0 /* 68 */:
                    if (zztvVar.zzR(obj2, i11, i5)) {
                        zzw = zzqv.zzw(i11, (zzts) unsafe.getObject(obj2, j), zztvVar.zzx(i5));
                        i7 += zzw;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    } else {
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                default:
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int zzc;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i4 >= iArr.length) {
                int hashCode = ((zzsn) obj).zzc.hashCode() + (i5 * 53);
                return this.zzh ? (hashCode * 53) + ((zzsk) obj).zzb.zza.hashCode() : hashCode;
            }
            int zzu = zzu(i4);
            int i6 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i7 = iArr[i4];
            long j = i6;
            int i8 = 37;
            switch (zzt) {
                case 0:
                    i = i5 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzvc.zza(obj, j));
                    byte[] bArr = zzsv.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i + zzc;
                    break;
                case 1:
                    i2 = i5 * 53;
                    floatToIntBits = Float.floatToIntBits(zzvc.zzb(obj, j));
                    i5 = floatToIntBits + i2;
                    break;
                case 2:
                    i = i5 * 53;
                    doubleToLongBits = zzvc.zzd(obj, j);
                    byte[] bArr2 = zzsv.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i + zzc;
                    break;
                case 3:
                    i = i5 * 53;
                    doubleToLongBits = zzvc.zzd(obj, j);
                    byte[] bArr3 = zzsv.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i + zzc;
                    break;
                case 4:
                    i = i5 * 53;
                    zzc = zzvc.zzc(obj, j);
                    i5 = i + zzc;
                    break;
                case 5:
                    i = i5 * 53;
                    doubleToLongBits = zzvc.zzd(obj, j);
                    byte[] bArr4 = zzsv.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i + zzc;
                    break;
                case 6:
                    i = i5 * 53;
                    zzc = zzvc.zzc(obj, j);
                    i5 = i + zzc;
                    break;
                case 7:
                    i2 = i5 * 53;
                    floatToIntBits = zzsv.zza(zzvc.zzw(obj, j));
                    i5 = floatToIntBits + i2;
                    break;
                case 8:
                    i2 = i5 * 53;
                    floatToIntBits = ((String) zzvc.zzf(obj, j)).hashCode();
                    i5 = floatToIntBits + i2;
                    break;
                case 9:
                    i3 = i5 * 53;
                    Object zzf = zzvc.zzf(obj, j);
                    if (zzf != null) {
                        i8 = zzf.hashCode();
                    }
                    i5 = i3 + i8;
                    break;
                case 10:
                    i2 = i5 * 53;
                    floatToIntBits = zzvc.zzf(obj, j).hashCode();
                    i5 = floatToIntBits + i2;
                    break;
                case 11:
                    i = i5 * 53;
                    zzc = zzvc.zzc(obj, j);
                    i5 = i + zzc;
                    break;
                case 12:
                    i = i5 * 53;
                    zzc = zzvc.zzc(obj, j);
                    i5 = i + zzc;
                    break;
                case 13:
                    i = i5 * 53;
                    zzc = zzvc.zzc(obj, j);
                    i5 = i + zzc;
                    break;
                case 14:
                    i = i5 * 53;
                    doubleToLongBits = zzvc.zzd(obj, j);
                    byte[] bArr5 = zzsv.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i + zzc;
                    break;
                case 15:
                    i = i5 * 53;
                    zzc = zzvc.zzc(obj, j);
                    i5 = i + zzc;
                    break;
                case 16:
                    i = i5 * 53;
                    doubleToLongBits = zzvc.zzd(obj, j);
                    byte[] bArr6 = zzsv.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i + zzc;
                    break;
                case 17:
                    i3 = i5 * 53;
                    Object zzf2 = zzvc.zzf(obj, j);
                    if (zzf2 != null) {
                        i8 = zzf2.hashCode();
                    }
                    i5 = i3 + i8;
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
                case kk7.S /* 30 */:
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
                    i2 = i5 * 53;
                    floatToIntBits = zzvc.zzf(obj, j).hashCode();
                    i5 = floatToIntBits + i2;
                    break;
                case 50:
                    i2 = i5 * 53;
                    floatToIntBits = zzvc.zzf(obj, j).hashCode();
                    i5 = floatToIntBits + i2;
                    break;
                case kk7.n0 /* 51 */:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zzsv.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + zzc;
                        break;
                    }
                case kk7.o0 /* 52 */:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i5 = floatToIntBits + i2;
                        break;
                    }
                case kk7.p0 /* 53 */:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zzsv.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + zzc;
                        break;
                    }
                case kk7.q0 /* 54 */:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zzsv.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + zzc;
                        break;
                    }
                case kk7.r0 /* 55 */:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        zzc = zzp(obj, j);
                        i5 = i + zzc;
                        break;
                    }
                case 56:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zzsv.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + zzc;
                        break;
                    }
                case kk7.t0 /* 57 */:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        zzc = zzp(obj, j);
                        i5 = i + zzc;
                        break;
                    }
                case kk7.u0 /* 58 */:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzsv.zza(zzS(obj, j));
                        i5 = floatToIntBits + i2;
                        break;
                    }
                case kk7.v0 /* 59 */:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = ((String) zzvc.zzf(obj, j)).hashCode();
                        i5 = floatToIntBits + i2;
                        break;
                    }
                case kk7.w0 /* 60 */:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzvc.zzf(obj, j).hashCode();
                        i5 = floatToIntBits + i2;
                        break;
                    }
                case kk7.x0 /* 61 */:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzvc.zzf(obj, j).hashCode();
                        i5 = floatToIntBits + i2;
                        break;
                    }
                case kk7.y0 /* 62 */:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        zzc = zzp(obj, j);
                        i5 = i + zzc;
                        break;
                    }
                case kk7.z0 /* 63 */:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        zzc = zzp(obj, j);
                        i5 = i + zzc;
                        break;
                    }
                case 64:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        zzc = zzp(obj, j);
                        i5 = i + zzc;
                        break;
                    }
                case 65:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zzsv.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + zzc;
                        break;
                    }
                case kk7.C0 /* 66 */:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        zzc = zzp(obj, j);
                        i5 = i + zzc;
                        break;
                    }
                case kk7.D0 /* 67 */:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zzsv.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + zzc;
                        break;
                    }
                case kk7.E0 /* 68 */:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzvc.zzf(obj, j).hashCode();
                        i5 = floatToIntBits + i2;
                        break;
                    }
            }
            i4 += 3;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zzc(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, com.google.android.recaptcha.internal.zzqb r38) {
        /*
            Method dump skipped, instructions count: 3734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zztv.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzqb):int");
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final Object zze() {
        return ((zzsn) this.zzg).zzv();
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zzsn) {
                zzsn zzsnVar = (zzsn) obj;
                zzsnVar.zzJ(ConnectionsManager.DEFAULT_DATACENTER_ID);
                zzsnVar.zza = 0;
                zzsnVar.zzH();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zzu = zzu(i);
                int i2 = 1048575 & zzu;
                int zzt = zzt(zzu);
                long j = i2;
                if (zzt != 9) {
                    if (zzt != 60 && zzt != 68) {
                        switch (zzt) {
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
                            case kk7.S /* 30 */:
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
                                ((zzsu) zzvc.zzf(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zztm) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzR(obj, iArr[i], i)) {
                        zzx(i).zzf(zzb.getObject(obj, j));
                    }
                }
                if (zzN(obj, i)) {
                    zzx(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzi(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                zzui.zzq(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzui.zzp(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
            int zzu = zzu(i);
            int i2 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i3 = iArr[i];
            long j = i2;
            switch (zzt) {
                case 0:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzvc.zzo(obj, j, zzvc.zza(obj2, j));
                        zzH(obj, i);
                        break;
                    }
                case 1:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzvc.zzp(obj, j, zzvc.zzb(obj2, j));
                        zzH(obj, i);
                        break;
                    }
                case 2:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzvc.zzr(obj, j, zzvc.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    }
                case 3:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzvc.zzr(obj, j, zzvc.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    }
                case 4:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzvc.zzq(obj, j, zzvc.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    }
                case 5:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzvc.zzr(obj, j, zzvc.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    }
                case 6:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzvc.zzq(obj, j, zzvc.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    }
                case 7:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzvc.zzm(obj, j, zzvc.zzw(obj2, j));
                        zzH(obj, i);
                        break;
                    }
                case 8:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzvc.zzs(obj, j, zzvc.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i);
                    break;
                case 10:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzvc.zzs(obj, j, zzvc.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    }
                case 11:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzvc.zzq(obj, j, zzvc.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    }
                case 12:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzvc.zzq(obj, j, zzvc.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    }
                case 13:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzvc.zzq(obj, j, zzvc.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    }
                case 14:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzvc.zzr(obj, j, zzvc.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    }
                case 15:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzvc.zzq(obj, j, zzvc.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    }
                case 16:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzvc.zzr(obj, j, zzvc.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i);
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
                case kk7.S /* 30 */:
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
                    zzsu zzsuVar = (zzsu) zzvc.zzf(obj, j);
                    zzsu zzsuVar2 = (zzsu) zzvc.zzf(obj2, j);
                    int size = zzsuVar.size();
                    int size2 = zzsuVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzsuVar.zzc()) {
                            zzsuVar = zzsuVar.zzd(size2 + size);
                        }
                        zzsuVar.addAll(zzsuVar2);
                    }
                    if (size > 0) {
                        zzsuVar2 = zzsuVar;
                    }
                    zzvc.zzs(obj, j, zzsuVar2);
                    break;
                case 50:
                    int i4 = zzui.zza;
                    zzvc.zzs(obj, j, zztn.zzb(zzvc.zzf(obj, j), zzvc.zzf(obj2, j)));
                    break;
                case kk7.n0 /* 51 */:
                case kk7.o0 /* 52 */:
                case kk7.p0 /* 53 */:
                case kk7.q0 /* 54 */:
                case kk7.r0 /* 55 */:
                case 56:
                case kk7.t0 /* 57 */:
                case kk7.u0 /* 58 */:
                case kk7.v0 /* 59 */:
                    if (!zzR(obj2, i3, i)) {
                        break;
                    } else {
                        zzvc.zzs(obj, j, zzvc.zzf(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    }
                case kk7.w0 /* 60 */:
                    zzF(obj, obj2, i);
                    break;
                case kk7.x0 /* 61 */:
                case kk7.y0 /* 62 */:
                case kk7.z0 /* 63 */:
                case 64:
                case 65:
                case kk7.C0 /* 66 */:
                case kk7.D0 /* 67 */:
                    if (!zzR(obj2, i3, i)) {
                        break;
                    } else {
                        zzvc.zzs(obj, j, zzvc.zzf(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    }
                case kk7.E0 /* 68 */:
                    zzF(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:214:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x07ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0815 A[LOOP:3: B:50:0x0811->B:52:0x0815, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x07e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(Object obj, zzuf zzufVar, zzry zzryVar) {
        Object obj2;
        zztv<T> zztvVar;
        Object obj3;
        int i;
        zzuv zzuvVar;
        Object obj4;
        zzuv zzuvVar2;
        Object obj5;
        Object valueOf;
        int ordinal;
        Object zze;
        Object obj6;
        zztv<T> zztvVar2 = this;
        zzryVar.getClass();
        zzD(obj);
        zzuv zzuvVar3 = zztvVar2.zzm;
        Object obj7 = null;
        zzsd zzsdVar = null;
        while (true) {
            try {
                int zzc = zzufVar.zzc();
                int zzq = zztvVar2.zzq(zzc);
                if (zzq >= 0) {
                    obj5 = obj;
                    zzuvVar2 = zzuvVar3;
                    obj4 = obj7;
                    try {
                        int zzu = zztvVar2.zzu(zzq);
                        try {
                        } catch (zzsw unused) {
                            zztvVar = zztvVar2;
                            obj3 = obj4;
                            zzuvVar3 = zzuvVar2;
                            obj2 = obj5;
                        }
                        switch (zzt(zzu)) {
                            case 0:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzvc.zzo(obj5, zzu & 1048575, zzufVar.zza());
                                zztvVar.zzH(obj5, zzq);
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 1:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzvc.zzp(obj5, zzu & 1048575, zzufVar.zzb());
                                zztvVar.zzH(obj5, zzq);
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 2:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzvc.zzr(obj5, zzu & 1048575, zzufVar.zzl());
                                zztvVar.zzH(obj5, zzq);
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 3:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzvc.zzr(obj5, zzu & 1048575, zzufVar.zzo());
                                zztvVar.zzH(obj5, zzq);
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 4:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzvc.zzq(obj5, zzu & 1048575, zzufVar.zzg());
                                zztvVar.zzH(obj5, zzq);
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 5:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzvc.zzr(obj5, zzu & 1048575, zzufVar.zzk());
                                zztvVar.zzH(obj5, zzq);
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 6:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzvc.zzq(obj5, zzu & 1048575, zzufVar.zzf());
                                zztvVar.zzH(obj5, zzq);
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 7:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzvc.zzm(obj5, zzu & 1048575, zzufVar.zzN());
                                zztvVar.zzH(obj5, zzq);
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 8:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zztvVar.zzG(obj5, zzu, zzufVar);
                                zztvVar.zzH(obj5, zzq);
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 9:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzts zztsVar = (zzts) zztvVar.zzA(obj5, zzq);
                                zzufVar.zzu(zztsVar, zztvVar.zzx(zzq), zzryVar);
                                zztvVar.zzJ(obj5, zzq, zztsVar);
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 10:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzvc.zzs(obj5, zzu & 1048575, zzufVar.zzp());
                                zztvVar.zzH(obj5, zzq);
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 11:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzvc.zzq(obj5, zzu & 1048575, zzufVar.zzj());
                                zztvVar.zzH(obj5, zzq);
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 12:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                int zze2 = zzufVar.zze();
                                zzsr zzw = zztvVar.zzw(zzq);
                                if (zzw == null || zzw.zza(zze2)) {
                                    zzvc.zzq(obj5, zzu & 1048575, zze2);
                                    zztvVar.zzH(obj5, zzq);
                                    obj7 = obj3;
                                    zztvVar2 = zztvVar;
                                } else {
                                    obj7 = zzui.zzo(obj5, zzc, zze2, obj3, zzuvVar3);
                                    zztvVar2 = zztvVar;
                                }
                                break;
                            case 13:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzvc.zzq(obj5, zzu & 1048575, zzufVar.zzh());
                                zztvVar.zzH(obj5, zzq);
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 14:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzvc.zzr(obj5, zzu & 1048575, zzufVar.zzm());
                                zztvVar.zzH(obj5, zzq);
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 15:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzvc.zzq(obj5, zzu & 1048575, zzufVar.zzi());
                                zztvVar.zzH(obj5, zzq);
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 16:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzvc.zzr(obj5, zzu & 1048575, zzufVar.zzn());
                                zztvVar.zzH(obj5, zzq);
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 17:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzts zztsVar2 = (zzts) zztvVar.zzA(obj5, zzq);
                                zzufVar.zzt(zztsVar2, zztvVar.zzx(zzq), zzryVar);
                                zztvVar.zzJ(obj5, zzq, zztsVar2);
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 18:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzufVar.zzx(zztf.zza(obj5, zzu & 1048575));
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 19:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzufVar.zzB(zztf.zza(obj5, zzu & 1048575));
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 20:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzufVar.zzE(zztf.zza(obj5, zzu & 1048575));
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 21:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzufVar.zzM(zztf.zza(obj5, zzu & 1048575));
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 22:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzufVar.zzD(zztf.zza(obj5, zzu & 1048575));
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 23:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzufVar.zzA(zztf.zza(obj5, zzu & 1048575));
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 24:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzufVar.zzz(zztf.zza(obj5, zzu & 1048575));
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 25:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzufVar.zzv(zztf.zza(obj5, zzu & 1048575));
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 26:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                boolean zzM = zzM(zzu);
                                int i2 = zzu & 1048575;
                                if (zzM) {
                                    ((zzqr) zzufVar).zzK(zztf.zza(obj5, i2), true);
                                } else {
                                    ((zzqr) zzufVar).zzK(zztf.zza(obj5, i2), false);
                                }
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 27:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzufVar.zzF(zztf.zza(obj5, zzu & 1048575), zztvVar.zzx(zzq), zzryVar);
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 28:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzufVar.zzw(zztf.zza(obj5, zzu & 1048575));
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 29:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzufVar.zzL(zztf.zza(obj5, zzu & 1048575));
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case kk7.S /* 30 */:
                                zztvVar = zztvVar2;
                                List zza2 = zztf.zza(obj5, zzu & 1048575);
                                zzufVar.zzy(zza2);
                                obj7 = zzui.zzn(obj5, zzc, zza2, zztvVar.zzw(zzq), obj4, zzuvVar2);
                                zzuvVar3 = zzuvVar2;
                                zztvVar2 = zztvVar;
                            case 31:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzufVar.zzG(zztf.zza(obj5, zzu & 1048575));
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 32:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzufVar.zzH(zztf.zza(obj5, zzu & 1048575));
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 33:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzufVar.zzI(zztf.zza(obj5, zzu & 1048575));
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 34:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzufVar.zzJ(zztf.zza(obj5, zzu & 1048575));
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 35:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzufVar.zzx(zztf.zza(obj5, zzu & 1048575));
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 36:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzufVar.zzB(zztf.zza(obj5, zzu & 1048575));
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 37:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzufVar.zzE(zztf.zza(obj5, zzu & 1048575));
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 38:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzufVar.zzM(zztf.zza(obj5, zzu & 1048575));
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 39:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzufVar.zzD(zztf.zza(obj5, zzu & 1048575));
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 40:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzufVar.zzA(zztf.zza(obj5, zzu & 1048575));
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 41:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzufVar.zzz(zztf.zza(obj5, zzu & 1048575));
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 42:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                zzufVar.zzv(zztf.zza(obj5, zzu & 1048575));
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 43:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar2;
                                obj2 = obj5;
                                try {
                                    zzufVar.zzL(zztf.zza(obj2, zzu & 1048575));
                                    obj7 = obj3;
                                } catch (zzsw unused2) {
                                    obj7 = obj3;
                                    if (obj7 == null) {
                                    }
                                    if (!zzuvVar3.zzk(obj7, zzufVar, 0)) {
                                    }
                                    zztvVar2 = zztvVar;
                                } catch (Throwable th) {
                                    th = th;
                                    obj7 = obj3;
                                    i = zztvVar.zzk;
                                    while (i < zztvVar.zzl) {
                                    }
                                    if (obj7 != null) {
                                    }
                                    throw th;
                                }
                                zztvVar2 = zztvVar;
                                break;
                            case 44:
                                zztvVar = zztvVar2;
                                List zza3 = zztf.zza(obj5, zzu & 1048575);
                                zzufVar.zzy(zza3);
                                obj7 = zzui.zzn(obj5, zzc, zza3, zztvVar.zzw(zzq), obj4, zzuvVar2);
                                zzuvVar3 = zzuvVar2;
                                zztvVar2 = zztvVar;
                            case 45:
                                zztvVar = zztvVar2;
                                zzuvVar = zzuvVar2;
                                zzufVar.zzG(zztf.zza(obj5, zzu & 1048575));
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar;
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 46:
                                zztvVar = zztvVar2;
                                zzuvVar = zzuvVar2;
                                zzufVar.zzH(zztf.zza(obj5, zzu & 1048575));
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar;
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 47:
                                zztvVar = zztvVar2;
                                zzuvVar = zzuvVar2;
                                zzufVar.zzI(zztf.zza(obj5, zzu & 1048575));
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar;
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 48:
                                zztvVar = zztvVar2;
                                zzuvVar = zzuvVar2;
                                zzufVar.zzJ(zztf.zza(obj5, zzu & 1048575));
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar;
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 49:
                                zztvVar = zztvVar2;
                                zzuvVar = zzuvVar2;
                                zzufVar.zzC(zztf.zza(obj5, zzu & 1048575), zztvVar.zzx(zzq), zzryVar);
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar;
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 50:
                                zztvVar = zztvVar2;
                                obj6 = obj5;
                                zzuvVar = zzuvVar2;
                                Object zzz = zztvVar.zzz(zzq);
                                long zzu2 = zztvVar.zzu(zzq) & 1048575;
                                Object zzf = zzvc.zzf(obj6, zzu2);
                                if (zzf == null) {
                                    zzf = zztm.zza().zzb();
                                    zzvc.zzs(obj6, zzu2, zzf);
                                } else if (zztn.zza(zzf)) {
                                    Object zzb2 = zztm.zza().zzb();
                                    zztn.zzb(zzb2, zzf);
                                    zzvc.zzs(obj6, zzu2, zzb2);
                                    zzf = zzb2;
                                }
                                throw null;
                                break;
                            case kk7.n0 /* 51 */:
                                zztvVar = zztvVar2;
                                zzuvVar = zzuvVar2;
                                zzvc.zzs(obj5, zzu & 1048575, Double.valueOf(zzufVar.zza()));
                                zztvVar.zzI(obj5, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar;
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case kk7.o0 /* 52 */:
                                zztvVar = zztvVar2;
                                zzuvVar = zzuvVar2;
                                zzvc.zzs(obj5, zzu & 1048575, Float.valueOf(zzufVar.zzb()));
                                zztvVar.zzI(obj5, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar;
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case kk7.p0 /* 53 */:
                                zztvVar = zztvVar2;
                                zzuvVar = zzuvVar2;
                                zzvc.zzs(obj5, zzu & 1048575, Long.valueOf(zzufVar.zzl()));
                                zztvVar.zzI(obj5, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar;
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case kk7.q0 /* 54 */:
                                zztvVar = zztvVar2;
                                zzuvVar = zzuvVar2;
                                zzvc.zzs(obj5, zzu & 1048575, Long.valueOf(zzufVar.zzo()));
                                zztvVar.zzI(obj5, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar;
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case kk7.r0 /* 55 */:
                                zztvVar = zztvVar2;
                                zzuvVar = zzuvVar2;
                                zzvc.zzs(obj5, zzu & 1048575, Integer.valueOf(zzufVar.zzg()));
                                zztvVar.zzI(obj5, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar;
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 56:
                                zztvVar = zztvVar2;
                                zzuvVar = zzuvVar2;
                                zzvc.zzs(obj5, zzu & 1048575, Long.valueOf(zzufVar.zzk()));
                                zztvVar.zzI(obj5, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar;
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case kk7.t0 /* 57 */:
                                zztvVar = zztvVar2;
                                zzuvVar = zzuvVar2;
                                zzvc.zzs(obj5, zzu & 1048575, Integer.valueOf(zzufVar.zzf()));
                                zztvVar.zzI(obj5, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar;
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case kk7.u0 /* 58 */:
                                zztvVar = zztvVar2;
                                zzuvVar = zzuvVar2;
                                zzvc.zzs(obj5, zzu & 1048575, Boolean.valueOf(zzufVar.zzN()));
                                zztvVar.zzI(obj5, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar;
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case kk7.v0 /* 59 */:
                                zztvVar = zztvVar2;
                                zzuvVar = zzuvVar2;
                                zztvVar.zzG(obj5, zzu, zzufVar);
                                zztvVar.zzI(obj5, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar;
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case kk7.w0 /* 60 */:
                                zztvVar = zztvVar2;
                                zzuvVar = zzuvVar2;
                                zzts zztsVar3 = (zzts) zztvVar.zzB(obj5, zzc, zzq);
                                zzufVar.zzu(zztsVar3, zztvVar.zzx(zzq), zzryVar);
                                zztvVar.zzK(obj5, zzc, zzq, zztsVar3);
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar;
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case kk7.x0 /* 61 */:
                                zztvVar = zztvVar2;
                                zzuvVar = zzuvVar2;
                                zzvc.zzs(obj5, zzu & 1048575, zzufVar.zzp());
                                zztvVar.zzI(obj5, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar;
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case kk7.y0 /* 62 */:
                                zztvVar = zztvVar2;
                                zzuvVar = zzuvVar2;
                                zzvc.zzs(obj5, zzu & 1048575, Integer.valueOf(zzufVar.zzj()));
                                zztvVar.zzI(obj5, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar;
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case kk7.z0 /* 63 */:
                                zztvVar = zztvVar2;
                                zzuvVar = zzuvVar2;
                                int zze3 = zzufVar.zze();
                                zzsr zzw2 = zztvVar.zzw(zzq);
                                if (zzw2 == null || zzw2.zza(zze3)) {
                                    zzvc.zzs(obj5, zzu & 1048575, Integer.valueOf(zze3));
                                    zztvVar.zzI(obj5, zzc, zzq);
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    obj7 = obj3;
                                    zztvVar2 = zztvVar;
                                } else {
                                    obj7 = zzui.zzo(obj5, zzc, zze3, obj4, zzuvVar);
                                    zzuvVar3 = zzuvVar;
                                    zztvVar2 = zztvVar;
                                }
                                break;
                            case 64:
                                zztvVar = zztvVar2;
                                zzuvVar = zzuvVar2;
                                zzvc.zzs(obj5, zzu & 1048575, Integer.valueOf(zzufVar.zzh()));
                                zztvVar.zzI(obj5, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar;
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case 65:
                                zztvVar = zztvVar2;
                                zzuvVar = zzuvVar2;
                                zzvc.zzs(obj5, zzu & 1048575, Long.valueOf(zzufVar.zzm()));
                                zztvVar.zzI(obj5, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar;
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case kk7.C0 /* 66 */:
                                zztvVar = zztvVar2;
                                zzuvVar = zzuvVar2;
                                zzvc.zzs(obj5, zzu & 1048575, Integer.valueOf(zzufVar.zzi()));
                                zztvVar.zzI(obj5, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar;
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case kk7.D0 /* 67 */:
                                zztvVar = zztvVar2;
                                zzuvVar = zzuvVar2;
                                zzvc.zzs(obj5, zzu & 1048575, Long.valueOf(zzufVar.zzn()));
                                zztvVar.zzI(obj5, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar3 = zzuvVar;
                                obj7 = obj3;
                                zztvVar2 = zztvVar;
                            case kk7.E0 /* 68 */:
                                zztvVar = zztvVar2;
                                obj6 = obj5;
                                zzuvVar = zzuvVar2;
                                try {
                                    zzts zztsVar4 = (zzts) zztvVar.zzB(obj6, zzc, zzq);
                                    zzufVar.zzt(zztsVar4, zztvVar.zzx(zzq), zzryVar);
                                    zztvVar.zzK(obj6, zzc, zzq, zztsVar4);
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    obj7 = obj3;
                                } catch (zzsw unused3) {
                                    obj2 = obj6;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    obj7 = obj3;
                                    if (obj7 == null) {
                                        try {
                                            obj7 = zzuvVar3.zza(obj2);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            i = zztvVar.zzk;
                                            while (i < zztvVar.zzl) {
                                                zztvVar.zzy(obj2, zztvVar.zzj[i], obj7, zzuvVar3, obj);
                                                i++;
                                                zztvVar = this;
                                            }
                                            if (obj7 != null) {
                                                zzuvVar3.zzj(obj2, obj7);
                                            }
                                            throw th;
                                        }
                                    }
                                    if (!zzuvVar3.zzk(obj7, zzufVar, 0)) {
                                        for (int i3 = zztvVar.zzk; i3 < zztvVar.zzl; i3++) {
                                            zztvVar.zzy(obj2, zztvVar.zzj[i3], obj7, zzuvVar3, obj);
                                        }
                                        if (obj7 == null) {
                                        }
                                    }
                                    zztvVar2 = zztvVar;
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj2 = obj6;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    obj7 = obj3;
                                    i = zztvVar.zzk;
                                    while (i < zztvVar.zzl) {
                                    }
                                    if (obj7 != null) {
                                    }
                                    throw th;
                                }
                                zztvVar2 = zztvVar;
                                break;
                            default:
                                obj7 = obj4 == null ? zzuvVar2.zza(obj5) : obj4;
                                try {
                                } catch (zzsw unused4) {
                                    zztvVar = zztvVar2;
                                    obj2 = obj5;
                                    zzuvVar3 = zzuvVar2;
                                    if (obj7 == null) {
                                    }
                                    if (!zzuvVar3.zzk(obj7, zzufVar, 0)) {
                                    }
                                    zztvVar2 = zztvVar;
                                } catch (Throwable th4) {
                                    th = th4;
                                    zztvVar = zztvVar2;
                                    obj2 = obj5;
                                    zzuvVar3 = zzuvVar2;
                                    i = zztvVar.zzk;
                                    while (i < zztvVar.zzl) {
                                    }
                                    if (obj7 != null) {
                                    }
                                    throw th;
                                }
                                if (!zzuvVar2.zzk(obj7, zzufVar, 0)) {
                                    int i4 = zztvVar2.zzk;
                                    while (i4 < zztvVar2.zzl) {
                                        zzuv zzuvVar4 = zzuvVar2;
                                        zztvVar2.zzy(obj, zztvVar2.zzj[i4], obj7, zzuvVar4, obj);
                                        i4++;
                                        obj5 = obj;
                                        zztvVar2 = zztvVar2;
                                        zzuvVar2 = zzuvVar4;
                                    }
                                    obj2 = obj5;
                                    break;
                                } else {
                                    zztvVar = zztvVar2;
                                    zzuvVar = zzuvVar2;
                                    zzuvVar3 = zzuvVar;
                                    zztvVar2 = zztvVar;
                                }
                                break;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        zzuv zzuvVar5 = zzuvVar2;
                        zztvVar = zztvVar2;
                        obj3 = obj4;
                        zzuvVar3 = zzuvVar5;
                        obj2 = obj5;
                        obj7 = obj3;
                        i = zztvVar.zzk;
                        while (i < zztvVar.zzl) {
                        }
                        if (obj7 != null) {
                        }
                        throw th;
                    }
                } else if (zzc == Integer.MAX_VALUE) {
                    int i5 = zztvVar2.zzk;
                    while (i5 < zztvVar2.zzl) {
                        zztvVar2.zzy(obj, zztvVar2.zzj[i5], obj7, zzuvVar3, obj);
                        i5++;
                        zzuvVar3 = zzuvVar3;
                    }
                    obj2 = obj;
                    zzuvVar3 = zzuvVar3;
                } else {
                    Object obj8 = obj;
                    zzuvVar = zzuvVar3;
                    obj4 = obj7;
                    try {
                        zzsm zza4 = !zztvVar2.zzh ? null : zzryVar.zza(zztvVar2.zzg, zzc);
                        if (zza4 != null) {
                            if (zzsdVar == null) {
                                try {
                                    zzsdVar = ((zzsk) obj8).zzi();
                                } catch (Throwable th6) {
                                    th = th6;
                                    zztvVar = zztvVar2;
                                    obj2 = obj8;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    obj7 = obj3;
                                    i = zztvVar.zzk;
                                    while (i < zztvVar.zzl) {
                                    }
                                    if (obj7 != null) {
                                    }
                                    throw th;
                                }
                            }
                            zzsl zzslVar = zza4.zza;
                            zzvg zzvgVar = zzvg.zzn;
                            zzvg zzvgVar2 = zzslVar.zzb;
                            if (zzvgVar2 == zzvgVar) {
                                zzufVar.zzg();
                                throw null;
                            }
                            switch (zzvgVar2.ordinal()) {
                                case 0:
                                    valueOf = Double.valueOf(zzufVar.zza());
                                    ordinal = zzvgVar2.ordinal();
                                    if ((ordinal != 9 || ordinal == 10) && (zze = zzsdVar.zze(zzslVar)) != null) {
                                        byte[] bArr = zzsv.zzb;
                                        valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    }
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj7 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 1:
                                    valueOf = Float.valueOf(zzufVar.zzb());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                        break;
                                    }
                                    byte[] bArr2 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj7 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 2:
                                    valueOf = Long.valueOf(zzufVar.zzl());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj7 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 3:
                                    valueOf = Long.valueOf(zzufVar.zzo());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj7 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 4:
                                    valueOf = Integer.valueOf(zzufVar.zzg());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr2222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj7 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 5:
                                    valueOf = Long.valueOf(zzufVar.zzk());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj7 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 6:
                                    valueOf = Integer.valueOf(zzufVar.zzf());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj7 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 7:
                                    valueOf = Boolean.valueOf(zzufVar.zzN());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr2222222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj7 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 8:
                                    valueOf = zzufVar.zzr();
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22222222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj7 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 9:
                                    Object zze4 = zzsdVar.zze(zzslVar);
                                    if (!(zze4 instanceof zzsn)) {
                                        throw null;
                                    }
                                    zzug zzb3 = zzuc.zza().zzb(zze4.getClass());
                                    if (!((zzsn) zze4).zzL()) {
                                        Object zze5 = zzb3.zze();
                                        zzb3.zzg(zze5, zze4);
                                        zzsdVar.zzi(zzslVar, zze5);
                                        zze4 = zze5;
                                    }
                                    zzufVar.zzt(zze4, zzb3, zzryVar);
                                    obj7 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 10:
                                    Object zze6 = zzsdVar.zze(zzslVar);
                                    if (!(zze6 instanceof zzsn)) {
                                        throw null;
                                    }
                                    zzug zzb4 = zzuc.zza().zzb(zze6.getClass());
                                    if (!((zzsn) zze6).zzL()) {
                                        Object zze7 = zzb4.zze();
                                        zzb4.zzg(zze7, zze6);
                                        zzsdVar.zzi(zzslVar, zze7);
                                        zze6 = zze7;
                                    }
                                    zzufVar.zzu(zze6, zzb4, zzryVar);
                                    obj7 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 11:
                                    valueOf = zzufVar.zzp();
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222222222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj7 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 12:
                                    valueOf = Integer.valueOf(zzufVar.zzj());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr2222222222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj7 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 13:
                                    throw new IllegalStateException("Shouldn't reach here.");
                                case 14:
                                    valueOf = Integer.valueOf(zzufVar.zzh());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22222222222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj7 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 15:
                                    valueOf = Long.valueOf(zzufVar.zzm());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222222222222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj7 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 16:
                                    valueOf = Integer.valueOf(zzufVar.zzi());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr2222222222222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj7 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 17:
                                    valueOf = Long.valueOf(zzufVar.zzn());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22222222222222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj7 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                default:
                                    valueOf = null;
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222222222222222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj7 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                            }
                        } else {
                            obj7 = obj4 == null ? zzuvVar.zza(obj8) : obj4;
                            try {
                                if (zzuvVar.zzk(obj7, zzufVar, 0)) {
                                    zzuvVar3 = zzuvVar;
                                } else {
                                    int i6 = zztvVar2.zzk;
                                    while (i6 < zztvVar2.zzl) {
                                        zzuv zzuvVar6 = zzuvVar;
                                        Object obj9 = obj8;
                                        zztvVar2.zzy(obj9, zztvVar2.zzj[i6], obj7, zzuvVar6, obj);
                                        i6++;
                                        obj8 = obj9;
                                        zzuvVar = zzuvVar6;
                                    }
                                    zzuvVar2 = zzuvVar;
                                    obj2 = obj8;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                obj2 = obj8;
                                zzuvVar3 = zzuvVar;
                                zztvVar = zztvVar2;
                                i = zztvVar.zzk;
                                while (i < zztvVar.zzl) {
                                }
                                if (obj7 != null) {
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        zzuvVar2 = zzuvVar;
                        obj5 = obj8;
                        zzuv zzuvVar52 = zzuvVar2;
                        zztvVar = zztvVar2;
                        obj3 = obj4;
                        zzuvVar3 = zzuvVar52;
                        obj2 = obj5;
                        obj7 = obj3;
                        i = zztvVar.zzk;
                        while (i < zztvVar.zzl) {
                        }
                        if (obj7 != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th9) {
                th = th9;
                obj2 = obj;
                zztvVar = zztvVar2;
                obj3 = obj7;
            }
        }
        zzuvVar3 = zzuvVar2;
        if (obj7 == null) {
            zzuvVar3.zzj(obj2, obj7);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzqb zzqbVar) {
        zzc(obj, bArr, i, i2, 0, zzqbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:293:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // com.google.android.recaptcha.internal.zzug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(Object obj, zzvi zzviVar) {
        Map.Entry entry;
        Iterator it;
        int[] iArr;
        int i;
        boolean z;
        Map.Entry entry2;
        int i2;
        int i3;
        int i4;
        int i5;
        zztv<T> zztvVar = this;
        if (zztvVar.zzh) {
            zzsd zzsdVar = ((zzsk) obj).zzb;
            if (!zzsdVar.zza.isEmpty()) {
                Iterator zzf = zzsdVar.zzf();
                entry = (Map.Entry) zzf.next();
                it = zzf;
                iArr = zztvVar.zzc;
                Unsafe unsafe = zzb;
                int i6 = 1048575;
                int i7 = 1048575;
                i = 0;
                int i8 = 0;
                while (i < iArr.length) {
                    int zzu = zztvVar.zzu(i);
                    int zzt = zzt(zzu);
                    int i9 = iArr[i];
                    if (zzt <= 17) {
                        int i10 = iArr[i + 2];
                        z = true;
                        int i11 = i10 & i6;
                        if (i11 != i7) {
                            i8 = i11 == i6 ? 0 : unsafe.getInt(obj, i11);
                            i7 = i11;
                        }
                        int i12 = 1 << (i10 >>> 20);
                        entry2 = entry;
                        i2 = i7;
                        i3 = i8;
                        i4 = i12;
                    } else {
                        z = true;
                        entry2 = entry;
                        i2 = i7;
                        i3 = i8;
                        i4 = 0;
                    }
                    while (true) {
                        if (entry2 != null) {
                            zzrz zzrzVar = zztvVar.zzn;
                            i5 = i6;
                            if (((zzsl) entry2.getKey()).zza <= i9) {
                                zzrzVar.zzb(zzviVar, entry2);
                                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                                i6 = i5;
                            }
                        } else {
                            i5 = i6;
                        }
                    }
                    long j = zzu & i5;
                    switch (zzt) {
                        case 0:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzf(i9, zzvc.zza(obj, j));
                                continue;
                            }
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 1:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzo(i9, zzvc.zzb(obj, j));
                                break;
                            }
                            break;
                        case 2:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzt(i9, unsafe.getLong(obj, j));
                                break;
                            }
                            break;
                        case 3:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzK(i9, unsafe.getLong(obj, j));
                                break;
                            }
                            break;
                        case 4:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzr(i9, unsafe.getInt(obj, j));
                                break;
                            }
                            break;
                        case 5:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzm(i9, unsafe.getLong(obj, j));
                                break;
                            }
                            break;
                        case 6:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzk(i9, unsafe.getInt(obj, j));
                                break;
                            }
                            break;
                        case 7:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzb(i9, zzvc.zzw(obj, j));
                                break;
                            }
                            break;
                        case 8:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzT(i9, unsafe.getObject(obj, j), zzviVar);
                                break;
                            }
                            break;
                        case 9:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzv(i9, unsafe.getObject(obj, j), zztvVar.zzx(i));
                            } else {
                                continue;
                            }
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 10:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzd(i9, (zzqm) unsafe.getObject(obj, j));
                                break;
                            }
                            break;
                        case 11:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzI(i9, unsafe.getInt(obj, j));
                                break;
                            }
                            break;
                        case 12:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzi(i9, unsafe.getInt(obj, j));
                                break;
                            }
                            break;
                        case 13:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzx(i9, unsafe.getInt(obj, j));
                                break;
                            }
                            break;
                        case 14:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzz(i9, unsafe.getLong(obj, j));
                                break;
                            }
                            break;
                        case 15:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzB(i9, unsafe.getInt(obj, j));
                                break;
                            }
                            break;
                        case 16:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzD(i9, unsafe.getLong(obj, j));
                                break;
                            }
                            break;
                        case 17:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzq(i9, unsafe.getObject(obj, j), zztvVar.zzx(i));
                            } else {
                                continue;
                            }
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 18:
                            zzui.zzs(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            continue;
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 19:
                            zzui.zzw(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            continue;
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 20:
                            zzui.zzy(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            continue;
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 21:
                            zzui.zzE(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            continue;
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 22:
                            zzui.zzx(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            continue;
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 23:
                            zzui.zzv(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            continue;
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 24:
                            zzui.zzu(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            continue;
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 25:
                            zzui.zzr(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            continue;
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 26:
                            int i13 = iArr[i];
                            List list = (List) unsafe.getObject(obj, j);
                            int i14 = zzui.zza;
                            if (list == null) {
                                continue;
                            } else if (!list.isEmpty()) {
                                zzviVar.zzH(i13, list);
                            }
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 27:
                            int i15 = iArr[i];
                            List list2 = (List) unsafe.getObject(obj, j);
                            zzug zzx = zztvVar.zzx(i);
                            int i16 = zzui.zza;
                            if (list2 == null) {
                                continue;
                            } else if (!list2.isEmpty()) {
                                for (int i17 = 0; i17 < list2.size(); i17++) {
                                    ((zzqw) zzviVar).zzv(i15, list2.get(i17), zzx);
                                }
                            }
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 28:
                            int i18 = iArr[i];
                            List list3 = (List) unsafe.getObject(obj, j);
                            int i19 = zzui.zza;
                            if (list3 == null) {
                                continue;
                            } else if (!list3.isEmpty()) {
                                zzviVar.zze(i18, list3);
                            }
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 29:
                            zzui.zzD(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            continue;
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case kk7.S /* 30 */:
                            zzui.zzt(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            continue;
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 31:
                            zzui.zzz(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            continue;
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 32:
                            zzui.zzA(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            continue;
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 33:
                            zzui.zzB(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            continue;
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 34:
                            zzui.zzC(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            continue;
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 35:
                            zzui.zzs(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, z);
                            continue;
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 36:
                            zzui.zzw(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, z);
                            continue;
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 37:
                            zzui.zzy(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, z);
                            continue;
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 38:
                            zzui.zzE(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, z);
                            continue;
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 39:
                            zzui.zzx(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, z);
                            continue;
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 40:
                            zzui.zzv(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, z);
                            continue;
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 41:
                            zzui.zzu(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, z);
                            continue;
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 42:
                            zzui.zzr(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, z);
                            continue;
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 43:
                            zzui.zzD(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, z);
                            continue;
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 44:
                            zzui.zzt(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, z);
                            continue;
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 45:
                            zzui.zzz(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, z);
                            continue;
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 46:
                            zzui.zzA(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, z);
                            continue;
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 47:
                            zzui.zzB(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, z);
                            continue;
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 48:
                            zzui.zzC(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, z);
                            continue;
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 49:
                            int i20 = iArr[i];
                            List list4 = (List) unsafe.getObject(obj, j);
                            zzug zzx2 = zztvVar.zzx(i);
                            int i21 = zzui.zza;
                            if (list4 == null) {
                                continue;
                            } else if (!list4.isEmpty()) {
                                for (int i22 = 0; i22 < list4.size(); i22++) {
                                    ((zzqw) zzviVar).zzq(i20, list4.get(i22), zzx2);
                                }
                            }
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 50:
                            if (unsafe.getObject(obj, j) != null) {
                                throw null;
                            }
                            continue;
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case kk7.n0 /* 51 */:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzf(i9, zzn(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case kk7.o0 /* 52 */:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzo(i9, zzo(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case kk7.p0 /* 53 */:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzt(i9, zzv(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case kk7.q0 /* 54 */:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzK(i9, zzv(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case kk7.r0 /* 55 */:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzr(i9, zzp(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 56:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzm(i9, zzv(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case kk7.t0 /* 57 */:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzk(i9, zzp(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case kk7.u0 /* 58 */:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzb(i9, zzS(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case kk7.v0 /* 59 */:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzT(i9, unsafe.getObject(obj, j), zzviVar);
                            } else {
                                continue;
                            }
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case kk7.w0 /* 60 */:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzv(i9, unsafe.getObject(obj, j), zztvVar.zzx(i));
                            } else {
                                continue;
                            }
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case kk7.x0 /* 61 */:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzd(i9, (zzqm) unsafe.getObject(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case kk7.y0 /* 62 */:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzI(i9, zzp(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case kk7.z0 /* 63 */:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzi(i9, zzp(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 64:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzx(i9, zzp(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case 65:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzz(i9, zzv(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case kk7.C0 /* 66 */:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzB(i9, zzp(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case kk7.D0 /* 67 */:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzD(i9, zzv(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        case kk7.E0 /* 68 */:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzq(i9, unsafe.getObject(obj, j), zztvVar.zzx(i));
                            } else {
                                continue;
                            }
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                        default:
                            i += 3;
                            i8 = i3;
                            i6 = i5;
                            i7 = i2;
                            entry = entry2;
                    }
                    zztvVar = this;
                    i += 3;
                    i8 = i3;
                    i6 = i5;
                    i7 = i2;
                    entry = entry2;
                }
                while (entry != null) {
                    zztvVar.zzn.zzb(zzviVar, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                ((zzsn) obj).zzc.zzl(zzviVar);
            }
        }
        entry = null;
        it = null;
        iArr = zztvVar.zzc;
        Unsafe unsafe2 = zzb;
        int i62 = 1048575;
        int i72 = 1048575;
        i = 0;
        int i82 = 0;
        while (i < iArr.length) {
        }
        while (entry != null) {
        }
        ((zzsn) obj).zzc.zzl(zzviVar);
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final boolean zzk(Object obj, Object obj2) {
        boolean zzF;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzu = zzu(i);
            long j = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (zzL(obj, obj2, i) && Double.doubleToLongBits(zzvc.zza(obj, j)) == Double.doubleToLongBits(zzvc.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i) && Float.floatToIntBits(zzvc.zzb(obj, j)) == Float.floatToIntBits(zzvc.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i) && zzvc.zzd(obj, j) == zzvc.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i) && zzvc.zzd(obj, j) == zzvc.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i) && zzvc.zzc(obj, j) == zzvc.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i) && zzvc.zzd(obj, j) == zzvc.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i) && zzvc.zzc(obj, j) == zzvc.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i) && zzvc.zzw(obj, j) == zzvc.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i) && zzui.zzF(zzvc.zzf(obj, j), zzvc.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i) && zzui.zzF(zzvc.zzf(obj, j), zzvc.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i) && zzui.zzF(zzvc.zzf(obj, j), zzvc.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i) && zzvc.zzc(obj, j) == zzvc.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i) && zzvc.zzc(obj, j) == zzvc.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i) && zzvc.zzc(obj, j) == zzvc.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i) && zzvc.zzd(obj, j) == zzvc.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i) && zzvc.zzc(obj, j) == zzvc.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i) && zzvc.zzd(obj, j) == zzvc.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i) && zzui.zzF(zzvc.zzf(obj, j), zzvc.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
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
                case kk7.S /* 30 */:
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
                    zzF = zzui.zzF(zzvc.zzf(obj, j), zzvc.zzf(obj2, j));
                    break;
                case 50:
                    zzF = zzui.zzF(zzvc.zzf(obj, j), zzvc.zzf(obj2, j));
                    break;
                case kk7.n0 /* 51 */:
                case kk7.o0 /* 52 */:
                case kk7.p0 /* 53 */:
                case kk7.q0 /* 54 */:
                case kk7.r0 /* 55 */:
                case 56:
                case kk7.t0 /* 57 */:
                case kk7.u0 /* 58 */:
                case kk7.v0 /* 59 */:
                case kk7.w0 /* 60 */:
                case kk7.x0 /* 61 */:
                case kk7.y0 /* 62 */:
                case kk7.z0 /* 63 */:
                case 64:
                case 65:
                case kk7.C0 /* 66 */:
                case kk7.D0 /* 67 */:
                case kk7.E0 /* 68 */:
                    long zzr = zzr(i) & 1048575;
                    if (zzvc.zzc(obj, zzr) == zzvc.zzc(obj2, zzr) && zzui.zzF(zzvc.zzf(obj, j), zzvc.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzF) {
                return false;
            }
        }
        if (!((zzsn) obj).zzc.equals(((zzsn) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzsk) obj).zzb.equals(((zzsk) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i7 = iArr[i5];
            int i8 = iArr2[i7];
            int zzu = zzu(i7);
            int i9 = iArr2[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = zzb.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i4;
                i = i10;
            } else {
                int i12 = i4;
                i = i6;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & zzu) != 0 && !zzO(obj, i2, i, i3, i11)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt == 60 || zzt == 68) {
                        if (zzR(obj, i8, i2) && !zzP(obj, zzu, zzx(i2))) {
                            return false;
                        }
                    } else if (zzt != 49) {
                        if (zzt == 50 && !((zztm) zzvc.zzf(obj, zzu & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzvc.zzf(obj, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzug zzx = zzx(i2);
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        if (!zzx.zzl(list.get(i13))) {
                            return false;
                        }
                    }
                }
            } else if (zzO(obj, i2, i, i3, i11) && !zzP(obj, zzu, zzx(i2))) {
                return false;
            }
            i5++;
            i6 = i;
            i4 = i3;
        }
        return !this.zzh || ((zzsk) obj).zzb.zzk();
    }
}
