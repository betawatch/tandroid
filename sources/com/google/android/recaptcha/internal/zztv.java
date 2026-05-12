package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.CharacterCompat;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

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
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e);
        }
    }

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            int zzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
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
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
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
        zzvc.zzq(obj, j, (1 << (zzr >>> 20)) | zzvc.zzc(obj, j));
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
        long j2 = zzu & 1048575;
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
                throw new IllegalArgumentException();
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
                throw new IllegalArgumentException();
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

    static zzuw zzd(Object obj) {
        zzsn zzsnVar = (zzsn) obj;
        zzuw zzuwVar = zzsnVar.zzc;
        if (zzuwVar != zzuw.zzc()) {
            return zzuwVar;
        }
        zzuw zzf = zzuw.zzf();
        zzsnVar.zzc = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zztv zzm(Class cls, zztp zztpVar, zzty zztyVar, zztf zztfVar, zzuv zzuvVar, zzrz zzrzVar, zztn zztnVar) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        char charAt3;
        int i8;
        char charAt4;
        int i9;
        char charAt5;
        int i10;
        char charAt6;
        int i11;
        char charAt7;
        int i12;
        char charAt8;
        int i13;
        char charAt9;
        int i14;
        char charAt10;
        int i15;
        int i16;
        int i17;
        int i18;
        zzue zzueVar;
        String str;
        int objectFieldOffset;
        int i19;
        Class<?> cls2;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Field zzC;
        int i26;
        char charAt11;
        int i27;
        int i28;
        int i29;
        int i30;
        Object obj;
        Field zzC2;
        Object obj2;
        Field zzC3;
        int i31;
        char charAt12;
        int i32;
        char charAt13;
        int i33;
        char charAt14;
        int i34;
        char charAt15;
        if (!(zztpVar instanceof zzue)) {
            throw null;
        }
        zzue zzueVar2 = (zzue) zztpVar;
        String zzd = zzueVar2.zzd();
        int length = zzd.length();
        char charAt16 = zzd.charAt(0);
        char c = CharacterCompat.MIN_HIGH_SURROGATE;
        if (charAt16 >= 55296) {
            int i35 = 1;
            while (true) {
                i = i35 + 1;
                if (zzd.charAt(i35) < 55296) {
                    break;
                }
                i35 = i;
            }
        } else {
            i = 1;
        }
        int i36 = i + 1;
        int charAt17 = zzd.charAt(i);
        if (charAt17 >= 55296) {
            int i37 = charAt17 & 8191;
            int i38 = 13;
            while (true) {
                i34 = i36 + 1;
                charAt15 = zzd.charAt(i36);
                if (charAt15 < 55296) {
                    break;
                }
                i37 |= (charAt15 & 8191) << i38;
                i38 += 13;
                i36 = i34;
            }
            charAt17 = i37 | (charAt15 << i38);
            i36 = i34;
        }
        if (charAt17 == 0) {
            iArr = zza;
            i6 = 0;
            i4 = 0;
            charAt = 0;
            charAt2 = 0;
            i2 = 0;
            i5 = 0;
            i3 = 0;
        } else {
            int i39 = i36 + 1;
            int charAt18 = zzd.charAt(i36);
            if (charAt18 >= 55296) {
                int i40 = charAt18 & 8191;
                int i41 = 13;
                while (true) {
                    i14 = i39 + 1;
                    charAt10 = zzd.charAt(i39);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i40 |= (charAt10 & 8191) << i41;
                    i41 += 13;
                    i39 = i14;
                }
                charAt18 = i40 | (charAt10 << i41);
                i39 = i14;
            }
            int i42 = i39 + 1;
            int charAt19 = zzd.charAt(i39);
            if (charAt19 >= 55296) {
                int i43 = charAt19 & 8191;
                int i44 = 13;
                while (true) {
                    i13 = i42 + 1;
                    charAt9 = zzd.charAt(i42);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i43 |= (charAt9 & 8191) << i44;
                    i44 += 13;
                    i42 = i13;
                }
                charAt19 = i43 | (charAt9 << i44);
                i42 = i13;
            }
            int i45 = i42 + 1;
            int charAt20 = zzd.charAt(i42);
            if (charAt20 >= 55296) {
                int i46 = charAt20 & 8191;
                int i47 = 13;
                while (true) {
                    i12 = i45 + 1;
                    charAt8 = zzd.charAt(i45);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i46 |= (charAt8 & 8191) << i47;
                    i47 += 13;
                    i45 = i12;
                }
                charAt20 = i46 | (charAt8 << i47);
                i45 = i12;
            }
            int i48 = i45 + 1;
            int charAt21 = zzd.charAt(i45);
            if (charAt21 >= 55296) {
                int i49 = charAt21 & 8191;
                int i50 = 13;
                while (true) {
                    i11 = i48 + 1;
                    charAt7 = zzd.charAt(i48);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i49 |= (charAt7 & 8191) << i50;
                    i50 += 13;
                    i48 = i11;
                }
                charAt21 = i49 | (charAt7 << i50);
                i48 = i11;
            }
            int i51 = i48 + 1;
            charAt = zzd.charAt(i48);
            if (charAt >= 55296) {
                int i52 = charAt & 8191;
                int i53 = 13;
                while (true) {
                    i10 = i51 + 1;
                    charAt6 = zzd.charAt(i51);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i52 |= (charAt6 & 8191) << i53;
                    i53 += 13;
                    i51 = i10;
                }
                charAt = i52 | (charAt6 << i53);
                i51 = i10;
            }
            int i54 = i51 + 1;
            charAt2 = zzd.charAt(i51);
            if (charAt2 >= 55296) {
                int i55 = charAt2 & 8191;
                int i56 = 13;
                while (true) {
                    i9 = i54 + 1;
                    charAt5 = zzd.charAt(i54);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i55 |= (charAt5 & 8191) << i56;
                    i56 += 13;
                    i54 = i9;
                }
                charAt2 = i55 | (charAt5 << i56);
                i54 = i9;
            }
            int i57 = i54 + 1;
            int charAt22 = zzd.charAt(i54);
            if (charAt22 >= 55296) {
                int i58 = charAt22 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    charAt4 = zzd.charAt(i57);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i58 |= (charAt4 & 8191) << i59;
                    i59 += 13;
                    i57 = i8;
                }
                charAt22 = i58 | (charAt4 << i59);
                i57 = i8;
            }
            int i60 = i57 + 1;
            int charAt23 = zzd.charAt(i57);
            if (charAt23 >= 55296) {
                int i61 = charAt23 & 8191;
                int i62 = 13;
                while (true) {
                    i7 = i60 + 1;
                    charAt3 = zzd.charAt(i60);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i61 |= (charAt3 & 8191) << i62;
                    i62 += 13;
                    i60 = i7;
                }
                charAt23 = i61 | (charAt3 << i62);
                i60 = i7;
            }
            int i63 = charAt18 + charAt18 + charAt19;
            int[] iArr2 = new int[charAt23 + charAt2 + charAt22];
            i2 = charAt20;
            i3 = charAt23;
            i4 = i63;
            iArr = iArr2;
            i5 = charAt21;
            i6 = charAt18;
            i36 = i60;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzueVar2.zze();
        Class<?> cls3 = zzueVar2.zza().getClass();
        int i64 = i3 + charAt2;
        int i65 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i65];
        int i66 = i3;
        int i67 = i64;
        int i68 = 0;
        int i69 = 0;
        while (i36 < length) {
            int i70 = i36 + 1;
            int charAt24 = zzd.charAt(i36);
            if (charAt24 >= c) {
                int i71 = charAt24 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i33 = i72 + 1;
                    charAt14 = zzd.charAt(i72);
                    if (charAt14 < c) {
                        break;
                    }
                    i71 |= (charAt14 & 8191) << i73;
                    i73 += 13;
                    i72 = i33;
                }
                charAt24 = i71 | (charAt14 << i73);
                i15 = i33;
            } else {
                i15 = i70;
            }
            int i74 = i15 + 1;
            int charAt25 = zzd.charAt(i15);
            if (charAt25 >= c) {
                int i75 = charAt25 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i32 = i76 + 1;
                    charAt13 = zzd.charAt(i76);
                    if (charAt13 < c) {
                        break;
                    }
                    i75 |= (charAt13 & 8191) << i77;
                    i77 += 13;
                    i76 = i32;
                }
                charAt25 = i75 | (charAt13 << i77);
                i16 = i32;
            } else {
                i16 = i74;
            }
            if ((charAt25 & 1024) != 0) {
                iArr[i68] = i69;
                i68++;
            }
            int i78 = charAt25 & NotificationCenter.didReceiveSmsCode;
            int i79 = length;
            int i80 = charAt25 & 2048;
            int i81 = i5;
            if (i78 >= 51) {
                int i82 = i16 + 1;
                int charAt26 = zzd.charAt(i16);
                if (charAt26 >= 55296) {
                    int i83 = charAt26 & 8191;
                    int i84 = i82;
                    int i85 = 13;
                    while (true) {
                        i31 = i84 + 1;
                        charAt12 = zzd.charAt(i84);
                        i17 = i2;
                        if (charAt12 < 55296) {
                            break;
                        }
                        i83 |= (charAt12 & 8191) << i85;
                        i85 += 13;
                        i84 = i31;
                        i2 = i17;
                    }
                    charAt26 = i83 | (charAt12 << i85);
                    i29 = i31;
                } else {
                    i17 = i2;
                    i29 = i82;
                }
                int i86 = i78 - 51;
                int i87 = i29;
                if (i86 == 9 || i86 == 17) {
                    i30 = i4 + 1;
                    int i88 = i69 / 3;
                    objArr[i88 + i88 + 1] = zze[i4];
                } else {
                    if (i86 == 12) {
                        if (zzueVar2.zzc() == 1 || i80 != 0) {
                            i30 = i4 + 1;
                            int i89 = i69 / 3;
                            objArr[i89 + i89 + 1] = zze[i4];
                        } else {
                            i80 = 0;
                        }
                    }
                    int i90 = charAt26 + charAt26;
                    obj = zze[i90];
                    if (obj instanceof Field) {
                        zzC2 = zzC(cls3, (String) obj);
                        zze[i90] = zzC2;
                    } else {
                        zzC2 = (Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzC2);
                    int i91 = i90 + 1;
                    obj2 = zze[i91];
                    int i92 = i80;
                    if (obj2 instanceof Field) {
                        zzC3 = zzC(cls3, (String) obj2);
                        zze[i91] = zzC3;
                    } else {
                        zzC3 = (Field) obj2;
                    }
                    i22 = (int) unsafe.objectFieldOffset(zzC3);
                    objectFieldOffset = objectFieldOffset2;
                    i24 = i92;
                    zzueVar = zzueVar2;
                    cls2 = cls3;
                    i23 = i87;
                    i18 = charAt24;
                    str = zzd;
                    i21 = 0;
                }
                i4 = i30;
                int i902 = charAt26 + charAt26;
                obj = zze[i902];
                if (obj instanceof Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzC2);
                int i912 = i902 + 1;
                obj2 = zze[i912];
                int i922 = i80;
                if (obj2 instanceof Field) {
                }
                i22 = (int) unsafe.objectFieldOffset(zzC3);
                objectFieldOffset = objectFieldOffset22;
                i24 = i922;
                zzueVar = zzueVar2;
                cls2 = cls3;
                i23 = i87;
                i18 = charAt24;
                str = zzd;
                i21 = 0;
            } else {
                i17 = i2;
                int i93 = i4 + 1;
                Field zzC4 = zzC(cls3, (String) zze[i4]);
                i18 = charAt24;
                if (i78 == 9 || i78 == 17) {
                    zzueVar = zzueVar2;
                    int i94 = i69 / 3;
                    objArr[i94 + i94 + 1] = zzC4.getType();
                } else {
                    if (i78 == 27) {
                        zzueVar = zzueVar2;
                        i27 = 1;
                        i28 = i4 + 2;
                    } else if (i78 == 49) {
                        i28 = i4 + 2;
                        zzueVar = zzueVar2;
                        i27 = 1;
                    } else {
                        if (i78 == 12 || i78 == 30 || i78 == 44) {
                            zzueVar = zzueVar2;
                            if (zzueVar2.zzc() == 1 || i80 != 0) {
                                i28 = i4 + 2;
                                int i95 = i69 / 3;
                                objArr[i95 + i95 + 1] = zze[i93];
                                str = zzd;
                                i93 = i28;
                            } else {
                                str = zzd;
                                i80 = 0;
                            }
                        } else if (i78 == 50) {
                            int i96 = i4 + 2;
                            int i97 = i66 + 1;
                            iArr[i66] = i69;
                            int i98 = i69 / 3;
                            int i99 = i98 + i98;
                            objArr[i99] = zze[i93];
                            if (i80 != 0) {
                                i93 = i4 + 3;
                                objArr[i99 + 1] = zze[i96];
                                str = zzd;
                                i66 = i97;
                                zzueVar = zzueVar2;
                            } else {
                                i93 = i96;
                                i66 = i97;
                                i80 = 0;
                                zzueVar = zzueVar2;
                            }
                        } else {
                            zzueVar = zzueVar2;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                        if ((charAt25 & 4096) != 0 || i78 > 17) {
                            i19 = i80;
                            cls2 = cls3;
                            i20 = i16;
                            i21 = 0;
                            i22 = 1048575;
                        } else {
                            int i100 = i16 + 1;
                            int charAt27 = str.charAt(i16);
                            if (charAt27 >= 55296) {
                                int i101 = charAt27 & 8191;
                                int i102 = 13;
                                while (true) {
                                    i26 = i100 + 1;
                                    charAt11 = str.charAt(i100);
                                    if (charAt11 < 55296) {
                                        break;
                                    }
                                    i101 |= (charAt11 & 8191) << i102;
                                    i102 += 13;
                                    i100 = i26;
                                }
                                charAt27 = i101 | (charAt11 << i102);
                                i25 = i26;
                            } else {
                                i25 = i100;
                            }
                            int i103 = i6 + i6 + (charAt27 / 32);
                            Object obj3 = zze[i103];
                            i19 = i80;
                            if (obj3 instanceof Field) {
                                zzC = (Field) obj3;
                            } else {
                                zzC = zzC(cls3, (String) obj3);
                                zze[i103] = zzC;
                            }
                            cls2 = cls3;
                            i21 = charAt27 % 32;
                            i20 = i25;
                            i22 = (int) unsafe.objectFieldOffset(zzC);
                        }
                        if (i78 >= 18 || i78 > 49) {
                            i23 = i20;
                            i4 = i93;
                        } else {
                            iArr[i67] = objectFieldOffset;
                            i67++;
                            i4 = i93;
                            i23 = i20;
                        }
                        i24 = i19;
                    }
                    int i104 = i69 / 3;
                    objArr[i104 + i104 + i27] = zze[i93];
                    str = zzd;
                    i93 = i28;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                    if ((charAt25 & 4096) != 0) {
                    }
                    i19 = i80;
                    cls2 = cls3;
                    i20 = i16;
                    i21 = 0;
                    i22 = 1048575;
                    if (i78 >= 18) {
                    }
                    i23 = i20;
                    i4 = i93;
                    i24 = i19;
                }
                str = zzd;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                if ((charAt25 & 4096) != 0) {
                }
                i19 = i80;
                cls2 = cls3;
                i20 = i16;
                i21 = 0;
                i22 = 1048575;
                if (i78 >= 18) {
                }
                i23 = i20;
                i4 = i93;
                i24 = i19;
            }
            int i105 = i69 + 1;
            iArr3[i69] = i18;
            int i106 = i69 + 2;
            Class<?> cls4 = cls2;
            iArr3[i105] = ((charAt25 & 512) != 0 ? TLObject.FLAG_29 : 0) | ((charAt25 & 256) != 0 ? TLObject.FLAG_28 : 0) | (i24 != 0 ? TLObject.FLAG_31 : 0) | (i78 << 20) | objectFieldOffset;
            i69 += 3;
            iArr3[i106] = (i21 << 20) | i22;
            zzd = str;
            length = i79;
            i5 = i81;
            zzueVar2 = zzueVar;
            i2 = i17;
            c = CharacterCompat.MIN_HIGH_SURROGATE;
            i36 = i23;
            cls3 = cls4;
        }
        return new zztv(iArr3, objArr, i2, i5, zzueVar2.zza(), false, iArr, i3, i64, zztyVar, zztfVar, zzuvVar, zzrzVar, zztnVar);
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
        return (i >>> 20) & NotificationCenter.didReceiveSmsCode;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzvc.zzf(obj, j)).longValue();
    }

    private final zzsr zzw(int i) {
        int i2 = i / 3;
        return (zzsr) this.zzd[i2 + i2 + 1];
    }

    private final zzug zzx(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzug zzugVar = (zzug) objArr[i3];
        if (zzugVar != null) {
            return zzugVar;
        }
        zzug zzb2 = zzuc.zza().zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zzb2;
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
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final int zza(Object obj) {
        int i;
        int i2;
        int i3;
        int zzA;
        int zzA2;
        int zzA3;
        int zzB;
        int zzA4;
        int zzA5;
        int zzd;
        int zzA6;
        int zzh;
        int zzg;
        int size;
        int zzA7;
        int zzA8;
        int zzA9;
        int zze;
        int zzA10;
        int zzA11;
        int i4;
        Unsafe unsafe = zzb;
        boolean z = false;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i8 >= iArr.length) {
                int zza2 = i9 + ((zzsn) obj).zzc.zza();
                if (!this.zzh) {
                    return zza2;
                }
                zzuo zzuoVar = ((zzsk) obj).zzb.zza;
                int zzc = zzuoVar.zzc();
                int i10 = 0;
                for (int i11 = 0; i11 < zzc; i11++) {
                    Map.Entry zzg2 = zzuoVar.zzg(i11);
                    i10 += zzsd.zza((zzsc) ((zzuk) zzg2).zza(), zzg2.getValue());
                }
                for (Map.Entry entry : zzuoVar.zzd()) {
                    i10 += zzsd.zza((zzsc) entry.getKey(), entry.getValue());
                }
                return zza2 + i10;
            }
            int zzu = zzu(i8);
            int zzt = zzt(zzu);
            int i12 = iArr[i8];
            int i13 = iArr[i8 + 2];
            int i14 = i13 & i5;
            if (zzt <= 17) {
                if (i14 != i6) {
                    i7 = i14 == i5 ? 0 : unsafe.getInt(obj, i14);
                    i6 = i14;
                }
                i = i6;
                i2 = i7;
                i3 = 1 << (i13 >>> 20);
            } else {
                i = i6;
                i2 = i7;
                i3 = 0;
            }
            int i15 = zzu & i5;
            if (zzt >= zzse.zzJ.zza()) {
                zzse.zzW.zza();
            }
            long j = i15;
            switch (zzt) {
                case 0:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzA = zzqv.zzA(i12 << 3);
                        zzh = zzA + 8;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 1:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzA2 = zzqv.zzA(i12 << 3);
                        zzh = zzA2 + 4;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 2:
                    if (zzO(obj, i8, i, i2, i3)) {
                        long j2 = unsafe.getLong(obj, j);
                        zzA3 = zzqv.zzA(i12 << 3);
                        zzB = zzqv.zzB(j2);
                        zzh = zzA3 + zzB;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 3:
                    if (zzO(obj, i8, i, i2, i3)) {
                        long j3 = unsafe.getLong(obj, j);
                        zzA3 = zzqv.zzA(i12 << 3);
                        zzB = zzqv.zzB(j3);
                        zzh = zzA3 + zzB;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 4:
                    if (zzO(obj, i8, i, i2, i3)) {
                        long j4 = unsafe.getInt(obj, j);
                        zzA3 = zzqv.zzA(i12 << 3);
                        zzB = zzqv.zzB(j4);
                        zzh = zzA3 + zzB;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 5:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzA = zzqv.zzA(i12 << 3);
                        zzh = zzA + 8;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 6:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzA2 = zzqv.zzA(i12 << 3);
                        zzh = zzA2 + 4;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 7:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzA4 = zzqv.zzA(i12 << 3);
                        zzh = zzA4 + 1;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 8:
                    if (zzO(obj, i8, i, i2, i3)) {
                        int i16 = i12 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzqm) {
                            zzA5 = zzqv.zzA(i16);
                            zzd = ((zzqm) object).zzd();
                            zzA6 = zzqv.zzA(zzd);
                            zzh = zzA5 + zzA6 + zzd;
                            i9 += zzh;
                            i8 += 3;
                            i6 = i;
                            i7 = i2;
                            z = false;
                            i5 = 1048575;
                        } else {
                            zzA3 = zzqv.zzA(i16);
                            zzB = zzqv.zzz((String) object);
                            zzh = zzA3 + zzB;
                            i9 += zzh;
                            i8 += 3;
                            i6 = i;
                            i7 = i2;
                            z = false;
                            i5 = 1048575;
                        }
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 9:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzh = zzui.zzh(i12, unsafe.getObject(obj, j), zzx(i8));
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 10:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzqm zzqmVar = (zzqm) unsafe.getObject(obj, j);
                        zzA5 = zzqv.zzA(i12 << 3);
                        zzd = zzqmVar.zzd();
                        zzA6 = zzqv.zzA(zzd);
                        zzh = zzA5 + zzA6 + zzd;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 11:
                    if (zzO(obj, i8, i, i2, i3)) {
                        int i17 = unsafe.getInt(obj, j);
                        zzA3 = zzqv.zzA(i12 << 3);
                        zzB = zzqv.zzA(i17);
                        zzh = zzA3 + zzB;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 12:
                    if (zzO(obj, i8, i, i2, i3)) {
                        long j5 = unsafe.getInt(obj, j);
                        zzA3 = zzqv.zzA(i12 << 3);
                        zzB = zzqv.zzB(j5);
                        zzh = zzA3 + zzB;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 13:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzA2 = zzqv.zzA(i12 << 3);
                        zzh = zzA2 + 4;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 14:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzA = zzqv.zzA(i12 << 3);
                        zzh = zzA + 8;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 15:
                    if (zzO(obj, i8, i, i2, i3)) {
                        int i18 = unsafe.getInt(obj, j);
                        zzA3 = zzqv.zzA(i12 << 3);
                        zzB = zzqv.zzA((i18 >> 31) ^ (i18 + i18));
                        zzh = zzA3 + zzB;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 16:
                    if (zzO(obj, i8, i, i2, i3)) {
                        long j6 = unsafe.getLong(obj, j);
                        zzA3 = zzqv.zzA(i12 << 3);
                        zzB = zzqv.zzB((j6 >> 63) ^ (j6 + j6));
                        zzh = zzA3 + zzB;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 17:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzh = zzqv.zzw(i12, (zzts) unsafe.getObject(obj, j), zzx(i8));
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 18:
                    zzh = zzui.zzd(i12, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 19:
                    zzh = zzui.zzb(i12, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i19 = zzui.zza;
                    if (list.size() != 0) {
                        zzg = zzui.zzg(list) + (list.size() * zzqv.zzA(i12 << 3));
                        i9 += zzg;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                    zzg = 0;
                    i9 += zzg;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i20 = zzui.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzA3 = zzui.zzl(list2);
                        zzA7 = zzqv.zzA(i12 << 3);
                        zzB = size * zzA7;
                        zzh = zzA3 + zzB;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                    zzh = 0;
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i21 = zzui.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzA3 = zzui.zzf(list3);
                        zzA7 = zzqv.zzA(i12 << 3);
                        zzB = size * zzA7;
                        zzh = zzA3 + zzB;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                    zzh = 0;
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 23:
                    zzh = zzui.zzd(i12, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 24:
                    zzh = zzui.zzb(i12, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i22 = zzui.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzh = size2 * (zzqv.zzA(i12 << 3) + 1);
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                    zzh = 0;
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i23 = zzui.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzg = zzqv.zzA(i12 << 3) * size3;
                        if (list5 instanceof zzte) {
                            zzte zzteVar = (zzte) list5;
                            for (int i24 = 0; i24 < size3; i24++) {
                                Object zzc2 = zzteVar.zzc();
                                if (zzc2 instanceof zzqm) {
                                    int zzd2 = ((zzqm) zzc2).zzd();
                                    zzg += zzqv.zzA(zzd2) + zzd2;
                                } else {
                                    zzg += zzqv.zzz((String) zzc2);
                                }
                            }
                        } else {
                            for (int i25 = 0; i25 < size3; i25++) {
                                Object obj2 = list5.get(i25);
                                if (obj2 instanceof zzqm) {
                                    int zzd3 = ((zzqm) obj2).zzd();
                                    zzg += zzqv.zzA(zzd3) + zzd3;
                                } else {
                                    zzg += zzqv.zzz((String) obj2);
                                }
                            }
                        }
                        i9 += zzg;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                    zzg = 0;
                    i9 += zzg;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j);
                    zzug zzx = zzx(i8);
                    int i26 = zzui.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzA8 = 0;
                    } else {
                        zzA8 = zzqv.zzA(i12 << 3) * size4;
                        for (int i27 = 0; i27 < size4; i27++) {
                            Object obj3 = list6.get(i27);
                            if (obj3 instanceof zztd) {
                                int zza3 = ((zztd) obj3).zza();
                                zzA8 += zzqv.zzA(zza3) + zza3;
                            } else {
                                zzA8 += zzqv.zzy((zzts) obj3, zzx);
                            }
                        }
                    }
                    i9 += zzA8;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i28 = zzui.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        zzA9 = 0;
                    } else {
                        zzA9 = size5 * zzqv.zzA(i12 << 3);
                        for (int i29 = 0; i29 < list7.size(); i29++) {
                            int zzd4 = ((zzqm) list7.get(i29)).zzd();
                            zzA9 += zzqv.zzA(zzd4) + zzd4;
                        }
                    }
                    i9 += zzA9;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i30 = zzui.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzA3 = zzui.zzk(list8);
                        zzA7 = zzqv.zzA(i12 << 3);
                        zzB = size * zzA7;
                        zzh = zzA3 + zzB;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                    zzh = 0;
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i31 = zzui.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzA3 = zzui.zza(list9);
                        zzA7 = zzqv.zzA(i12 << 3);
                        zzB = size * zzA7;
                        zzh = zzA3 + zzB;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                    zzh = 0;
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 31:
                    zzh = zzui.zzb(i12, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 32:
                    zzh = zzui.zzd(i12, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j);
                    int i32 = zzui.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzA3 = zzui.zzi(list10);
                        zzA7 = zzqv.zzA(i12 << 3);
                        zzB = size * zzA7;
                        zzh = zzA3 + zzB;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                    zzh = 0;
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j);
                    int i33 = zzui.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzA3 = zzui.zzj(list11);
                        zzA7 = zzqv.zzA(i12 << 3);
                        zzB = size * zzA7;
                        zzh = zzA3 + zzB;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                    zzh = 0;
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 35:
                    zze = zzui.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzA10 = zzqv.zzA(i12 << 3);
                        zzA11 = zzqv.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i9 += zzA9;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 36:
                    zze = zzui.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzA10 = zzqv.zzA(i12 << 3);
                        zzA11 = zzqv.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i9 += zzA9;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 37:
                    zze = zzui.zzg((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzA10 = zzqv.zzA(i12 << 3);
                        zzA11 = zzqv.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i9 += zzA9;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 38:
                    zze = zzui.zzl((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzA10 = zzqv.zzA(i12 << 3);
                        zzA11 = zzqv.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i9 += zzA9;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 39:
                    zze = zzui.zzf((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzA10 = zzqv.zzA(i12 << 3);
                        zzA11 = zzqv.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i9 += zzA9;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 40:
                    zze = zzui.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzA10 = zzqv.zzA(i12 << 3);
                        zzA11 = zzqv.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i9 += zzA9;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 41:
                    zze = zzui.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzA10 = zzqv.zzA(i12 << 3);
                        zzA11 = zzqv.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i9 += zzA9;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j);
                    int i34 = zzui.zza;
                    zze = list12.size();
                    if (zze > 0) {
                        zzA10 = zzqv.zzA(i12 << 3);
                        zzA11 = zzqv.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i9 += zzA9;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 43:
                    zze = zzui.zzk((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzA10 = zzqv.zzA(i12 << 3);
                        zzA11 = zzqv.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i9 += zzA9;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 44:
                    zze = zzui.zza((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzA10 = zzqv.zzA(i12 << 3);
                        zzA11 = zzqv.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i9 += zzA9;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 45:
                    zze = zzui.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzA10 = zzqv.zzA(i12 << 3);
                        zzA11 = zzqv.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i9 += zzA9;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 46:
                    zze = zzui.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzA10 = zzqv.zzA(i12 << 3);
                        zzA11 = zzqv.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i9 += zzA9;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 47:
                    zze = zzui.zzi((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzA10 = zzqv.zzA(i12 << 3);
                        zzA11 = zzqv.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i9 += zzA9;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 48:
                    zze = zzui.zzj((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzA10 = zzqv.zzA(i12 << 3);
                        zzA11 = zzqv.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i9 += zzA9;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j);
                    zzug zzx2 = zzx(i8);
                    int i35 = zzui.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (int i36 = 0; i36 < size6; i36++) {
                            i4 += zzqv.zzw(i12, (zzts) list13.get(i36), zzx2);
                        }
                    }
                    i9 += i4;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 50:
                    zztm zztmVar = (zztm) unsafe.getObject(obj, j);
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
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 51:
                    if (zzR(obj, i12, i8)) {
                        zzA = zzqv.zzA(i12 << 3);
                        zzh = zzA + 8;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 52:
                    if (zzR(obj, i12, i8)) {
                        zzA2 = zzqv.zzA(i12 << 3);
                        zzh = zzA2 + 4;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 53:
                    if (zzR(obj, i12, i8)) {
                        long zzv = zzv(obj, j);
                        zzA3 = zzqv.zzA(i12 << 3);
                        zzB = zzqv.zzB(zzv);
                        zzh = zzA3 + zzB;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 54:
                    if (zzR(obj, i12, i8)) {
                        long zzv2 = zzv(obj, j);
                        zzA3 = zzqv.zzA(i12 << 3);
                        zzB = zzqv.zzB(zzv2);
                        zzh = zzA3 + zzB;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 55:
                    if (zzR(obj, i12, i8)) {
                        long zzp = zzp(obj, j);
                        zzA3 = zzqv.zzA(i12 << 3);
                        zzB = zzqv.zzB(zzp);
                        zzh = zzA3 + zzB;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 56:
                    if (zzR(obj, i12, i8)) {
                        zzA = zzqv.zzA(i12 << 3);
                        zzh = zzA + 8;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 57:
                    if (zzR(obj, i12, i8)) {
                        zzA2 = zzqv.zzA(i12 << 3);
                        zzh = zzA2 + 4;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 58:
                    if (zzR(obj, i12, i8)) {
                        zzA4 = zzqv.zzA(i12 << 3);
                        zzh = zzA4 + 1;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 59:
                    if (zzR(obj, i12, i8)) {
                        int i37 = i12 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzqm) {
                            zzA5 = zzqv.zzA(i37);
                            zzd = ((zzqm) object2).zzd();
                            zzA6 = zzqv.zzA(zzd);
                            zzh = zzA5 + zzA6 + zzd;
                            i9 += zzh;
                            i8 += 3;
                            i6 = i;
                            i7 = i2;
                            z = false;
                            i5 = 1048575;
                        } else {
                            zzA3 = zzqv.zzA(i37);
                            zzB = zzqv.zzz((String) object2);
                            zzh = zzA3 + zzB;
                            i9 += zzh;
                            i8 += 3;
                            i6 = i;
                            i7 = i2;
                            z = false;
                            i5 = 1048575;
                        }
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 60:
                    if (zzR(obj, i12, i8)) {
                        zzh = zzui.zzh(i12, unsafe.getObject(obj, j), zzx(i8));
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 61:
                    if (zzR(obj, i12, i8)) {
                        zzqm zzqmVar2 = (zzqm) unsafe.getObject(obj, j);
                        zzA5 = zzqv.zzA(i12 << 3);
                        zzd = zzqmVar2.zzd();
                        zzA6 = zzqv.zzA(zzd);
                        zzh = zzA5 + zzA6 + zzd;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 62:
                    if (zzR(obj, i12, i8)) {
                        int zzp2 = zzp(obj, j);
                        zzA3 = zzqv.zzA(i12 << 3);
                        zzB = zzqv.zzA(zzp2);
                        zzh = zzA3 + zzB;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 63:
                    if (zzR(obj, i12, i8)) {
                        long zzp3 = zzp(obj, j);
                        zzA3 = zzqv.zzA(i12 << 3);
                        zzB = zzqv.zzB(zzp3);
                        zzh = zzA3 + zzB;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 64:
                    if (zzR(obj, i12, i8)) {
                        zzA2 = zzqv.zzA(i12 << 3);
                        zzh = zzA2 + 4;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 65:
                    if (zzR(obj, i12, i8)) {
                        zzA = zzqv.zzA(i12 << 3);
                        zzh = zzA + 8;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 66:
                    if (zzR(obj, i12, i8)) {
                        int zzp4 = zzp(obj, j);
                        zzA3 = zzqv.zzA(i12 << 3);
                        zzB = zzqv.zzA((zzp4 >> 31) ^ (zzp4 + zzp4));
                        zzh = zzA3 + zzB;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 67:
                    if (zzR(obj, i12, i8)) {
                        long zzv3 = zzv(obj, j);
                        zzA3 = zzqv.zzA(i12 << 3);
                        zzB = zzqv.zzB((zzv3 >> 63) ^ (zzv3 + zzv3));
                        zzh = zzA3 + zzB;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 68:
                    if (zzR(obj, i12, i8)) {
                        zzh = zzqv.zzw(i12, (zzts) unsafe.getObject(obj, j), zzx(i8));
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                default:
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i4 >= iArr.length) {
                int hashCode = (i5 * 53) + ((zzsn) obj).zzc.hashCode();
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
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i5 * 53;
                    floatToIntBits = Float.floatToIntBits(zzvc.zzb(obj, j));
                    i5 = i2 + floatToIntBits;
                    break;
                case 2:
                    i = i5 * 53;
                    doubleToLongBits = zzvc.zzd(obj, j);
                    byte[] bArr2 = zzsv.zzb;
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i5 * 53;
                    doubleToLongBits = zzvc.zzd(obj, j);
                    byte[] bArr3 = zzsv.zzb;
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i5 * 53;
                    floatToIntBits = zzvc.zzc(obj, j);
                    i5 = i2 + floatToIntBits;
                    break;
                case 5:
                    i = i5 * 53;
                    doubleToLongBits = zzvc.zzd(obj, j);
                    byte[] bArr4 = zzsv.zzb;
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i5 * 53;
                    floatToIntBits = zzvc.zzc(obj, j);
                    i5 = i2 + floatToIntBits;
                    break;
                case 7:
                    i2 = i5 * 53;
                    floatToIntBits = zzsv.zza(zzvc.zzw(obj, j));
                    i5 = i2 + floatToIntBits;
                    break;
                case 8:
                    i2 = i5 * 53;
                    floatToIntBits = ((String) zzvc.zzf(obj, j)).hashCode();
                    i5 = i2 + floatToIntBits;
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
                    i5 = i2 + floatToIntBits;
                    break;
                case 11:
                    i2 = i5 * 53;
                    floatToIntBits = zzvc.zzc(obj, j);
                    i5 = i2 + floatToIntBits;
                    break;
                case 12:
                    i2 = i5 * 53;
                    floatToIntBits = zzvc.zzc(obj, j);
                    i5 = i2 + floatToIntBits;
                    break;
                case 13:
                    i2 = i5 * 53;
                    floatToIntBits = zzvc.zzc(obj, j);
                    i5 = i2 + floatToIntBits;
                    break;
                case 14:
                    i = i5 * 53;
                    doubleToLongBits = zzvc.zzd(obj, j);
                    byte[] bArr5 = zzsv.zzb;
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i5 * 53;
                    floatToIntBits = zzvc.zzc(obj, j);
                    i5 = i2 + floatToIntBits;
                    break;
                case 16:
                    i = i5 * 53;
                    doubleToLongBits = zzvc.zzd(obj, j);
                    byte[] bArr6 = zzsv.zzb;
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
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
                case 30:
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
                    i5 = i2 + floatToIntBits;
                    break;
                case 50:
                    i2 = i5 * 53;
                    floatToIntBits = zzvc.zzf(obj, j).hashCode();
                    i5 = i2 + floatToIntBits;
                    break;
                case 51:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zzsv.zzb;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 53:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zzsv.zzb;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zzsv.zzb;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 55:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzp(obj, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 56:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zzsv.zzb;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 57:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzp(obj, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 58:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzsv.zza(zzS(obj, j));
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 59:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = ((String) zzvc.zzf(obj, j)).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 60:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzvc.zzf(obj, j).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 61:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzvc.zzf(obj, j).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 62:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzp(obj, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 63:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzp(obj, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 64:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzp(obj, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 65:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zzsv.zzb;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzp(obj, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 67:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zzsv.zzb;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
                    if (!zzR(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzvc.zzf(obj, j).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    }
            }
            i4 += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0ddc, code lost:
    
        if (r11 == 1048575) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0dde, code lost:
    
        r12.putInt(r13, r11, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0de2, code lost:
    
        r10 = r7.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0de7, code lost:
    
        if (r10 >= r7.zzl) goto L638;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0de9, code lost:
    
        zzy(r33, r7.zzj[r10], null, r7.zzm, r33);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0dfe, code lost:
    
        if (r9 != 0) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0e02, code lost:
    
        if (r8 != r36) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0e0a, code lost:
    
        throw new com.google.android.recaptcha.internal.zzsx("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0e11, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0e0d, code lost:
    
        if (r8 > r36) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0e0f, code lost:
    
        if (r6 != r9) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0e17, code lost:
    
        throw new com.google.android.recaptcha.internal.zzsx("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x097d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0ca6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0cbb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzqb zzqbVar) {
        int i4;
        Object obj2;
        Unsafe unsafe;
        zztv<T> zztvVar;
        int i5;
        int i6;
        int zzq;
        zzqb zzqbVar2;
        int i7;
        int i8;
        int i9;
        int i10;
        int zzh;
        int i11;
        Object obj3;
        int i12;
        int i13;
        int i14;
        int i15;
        zzqb zzqbVar3;
        int i16;
        int i17;
        int zzi;
        Unsafe unsafe2;
        int i18;
        zzqb zzqbVar4;
        Unsafe unsafe3;
        int i19;
        Object obj4;
        int i20;
        int i21;
        int i22;
        long j;
        int i23;
        int i24;
        zzqb zzqbVar5;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        Unsafe unsafe4;
        int i31;
        int i32;
        int zzf;
        int zzi2;
        int zzi3;
        Object obj5;
        Unsafe unsafe5;
        int i33;
        int zzk;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        Object obj6;
        zztv<T> zztvVar2 = this;
        Object obj7 = obj;
        byte[] bArr2 = bArr;
        int i40 = i2;
        int i41 = i3;
        zzqb zzqbVar6 = zzqbVar;
        int i42 = 3;
        zzD(obj);
        Unsafe unsafe6 = zzb;
        int i43 = -1;
        int i44 = i;
        int i45 = -1;
        int i46 = 0;
        int i47 = 1048575;
        int i48 = 0;
        int i49 = 0;
        while (true) {
            if (i44 < i40) {
                int i50 = i44 + 1;
                int i51 = bArr2[i44];
                if (i51 < 0) {
                    i50 = zzqc.zzj(i51, bArr2, i50, zzqbVar6);
                    i51 = zzqbVar6.zza;
                }
                int i52 = i51 >>> 3;
                if (i52 > i45) {
                    zzq = (i52 < zztvVar2.zze || i52 > zztvVar2.zzf) ? -1 : zztvVar2.zzs(i52, i46 / i42);
                } else {
                    zzq = zztvVar2.zzq(i52);
                }
                i46 = zzq;
                Object obj8 = null;
                if (i46 == i43) {
                    i4 = i41;
                    obj2 = obj7;
                    i46 = 0;
                    zztvVar = zztvVar2;
                    zzqbVar2 = zzqbVar6;
                    i7 = i50;
                    i8 = i51;
                    Unsafe unsafe7 = unsafe6;
                    i9 = i52;
                    unsafe = unsafe7;
                } else {
                    int i53 = i51 & 7;
                    int[] iArr = zztvVar2.zzc;
                    int i54 = iArr[i46 + 1];
                    int zzt = zzt(i54);
                    long j2 = i54 & 1048575;
                    int i55 = i51;
                    if (zzt <= 17) {
                        int i56 = iArr[i46 + 2];
                        int i57 = 1 << (i56 >>> 20);
                        int i58 = 1048575;
                        int i59 = i56 & 1048575;
                        if (i59 != i47) {
                            if (i47 != 1048575) {
                                unsafe6.putInt(obj7, i47, i48);
                                i58 = 1048575;
                            }
                            i12 = i59 == i58 ? 0 : unsafe6.getInt(obj7, i59);
                            i13 = i59;
                        } else {
                            i12 = i48;
                            i13 = i47;
                        }
                        switch (zzt) {
                            case 0:
                                zzqbVar3 = zzqbVar;
                                i15 = i52;
                                i14 = i55;
                                if (i53 != 1) {
                                    i4 = i3;
                                    i7 = i50;
                                    obj2 = obj7;
                                    i8 = i14;
                                    unsafe = unsafe6;
                                    i47 = i13;
                                    i9 = i15;
                                    i48 = i12;
                                    zztvVar = zztvVar2;
                                    zzqbVar2 = zzqbVar3;
                                    break;
                                } else {
                                    i16 = i50 + 8;
                                    i12 |= i57;
                                    zzvc.zzo(obj7, j2, Double.longBitsToDouble(zzqc.zzp(bArr2, i50)));
                                    i40 = i2;
                                    i41 = i3;
                                    zzqbVar6 = zzqbVar3;
                                    i49 = i14;
                                    i47 = i13;
                                    i45 = i15;
                                    i43 = -1;
                                    i44 = i16;
                                    i48 = i12;
                                    i42 = 3;
                                }
                            case 1:
                                zzqbVar3 = zzqbVar;
                                i15 = i52;
                                i14 = i55;
                                if (i53 != 5) {
                                    i4 = i3;
                                    i7 = i50;
                                    obj2 = obj7;
                                    i8 = i14;
                                    unsafe = unsafe6;
                                    i47 = i13;
                                    i9 = i15;
                                    i48 = i12;
                                    zztvVar = zztvVar2;
                                    zzqbVar2 = zzqbVar3;
                                    break;
                                } else {
                                    i16 = i50 + 4;
                                    i12 |= i57;
                                    zzvc.zzp(obj7, j2, Float.intBitsToFloat(zzqc.zzb(bArr2, i50)));
                                    i40 = i2;
                                    i41 = i3;
                                    zzqbVar6 = zzqbVar3;
                                    i49 = i14;
                                    i47 = i13;
                                    i45 = i15;
                                    i43 = -1;
                                    i44 = i16;
                                    i48 = i12;
                                    i42 = 3;
                                }
                            case 2:
                            case 3:
                                zzqbVar3 = zzqbVar;
                                i15 = i52;
                                i14 = i55;
                                if (i53 != 0) {
                                    i4 = i3;
                                    i7 = i50;
                                    obj2 = obj7;
                                    i8 = i14;
                                    unsafe = unsafe6;
                                    i47 = i13;
                                    i9 = i15;
                                    i48 = i12;
                                    zztvVar = zztvVar2;
                                    zzqbVar2 = zzqbVar3;
                                    break;
                                } else {
                                    int i60 = i12 | i57;
                                    int zzl = zzqc.zzl(bArr2, i50, zzqbVar3);
                                    unsafe6.putLong(obj, j2, zzqbVar3.zzb);
                                    i40 = i2;
                                    i41 = i3;
                                    zzqbVar6 = zzqbVar3;
                                    i49 = i14;
                                    i44 = zzl;
                                    i47 = i13;
                                    i42 = 3;
                                    i43 = -1;
                                    i48 = i60;
                                    i45 = i15;
                                }
                            case 4:
                            case 11:
                                zzqbVar3 = zzqbVar;
                                i15 = i52;
                                i14 = i55;
                                if (i53 != 0) {
                                    i4 = i3;
                                    i7 = i50;
                                    obj2 = obj7;
                                    i8 = i14;
                                    unsafe = unsafe6;
                                    i47 = i13;
                                    i9 = i15;
                                    i48 = i12;
                                    zztvVar = zztvVar2;
                                    zzqbVar2 = zzqbVar3;
                                    break;
                                } else {
                                    i17 = i12 | i57;
                                    zzi = zzqc.zzi(bArr2, i50, zzqbVar3);
                                    unsafe6.putInt(obj7, j2, zzqbVar3.zza);
                                    i40 = i2;
                                    i41 = i3;
                                    zzqbVar6 = zzqbVar3;
                                    i49 = i14;
                                    i47 = i13;
                                    i45 = i15;
                                    i43 = -1;
                                    i48 = i17;
                                    i44 = zzi;
                                    i42 = 3;
                                }
                            case 5:
                            case 14:
                                zzqbVar3 = zzqbVar;
                                i15 = i52;
                                i14 = i55;
                                if (i53 != 1) {
                                    i4 = i3;
                                    i7 = i50;
                                    obj2 = obj7;
                                    i8 = i14;
                                    unsafe = unsafe6;
                                    i47 = i13;
                                    i9 = i15;
                                    i48 = i12;
                                    zztvVar = zztvVar2;
                                    zzqbVar2 = zzqbVar3;
                                    break;
                                } else {
                                    int i61 = i57 | i12;
                                    unsafe6.putLong(obj, j2, zzqc.zzp(bArr2, i50));
                                    i40 = i2;
                                    i41 = i3;
                                    zzqbVar6 = zzqbVar3;
                                    i44 = i50 + 8;
                                    i49 = i14;
                                    i47 = i13;
                                    i45 = i15;
                                    i42 = 3;
                                    i48 = i61;
                                    i43 = -1;
                                }
                            case 6:
                            case 13:
                                zzqbVar3 = zzqbVar;
                                i15 = i52;
                                i14 = i55;
                                if (i53 != 5) {
                                    i4 = i3;
                                    i7 = i50;
                                    obj2 = obj7;
                                    i8 = i14;
                                    unsafe = unsafe6;
                                    i47 = i13;
                                    i9 = i15;
                                    i48 = i12;
                                    zztvVar = zztvVar2;
                                    zzqbVar2 = zzqbVar3;
                                    break;
                                } else {
                                    i16 = i50 + 4;
                                    i12 |= i57;
                                    unsafe6.putInt(obj7, j2, zzqc.zzb(bArr2, i50));
                                    i40 = i2;
                                    i41 = i3;
                                    zzqbVar6 = zzqbVar3;
                                    i49 = i14;
                                    i47 = i13;
                                    i45 = i15;
                                    i43 = -1;
                                    i44 = i16;
                                    i48 = i12;
                                    i42 = 3;
                                }
                            case 7:
                                zzqbVar3 = zzqbVar;
                                i15 = i52;
                                i14 = i55;
                                if (i53 != 0) {
                                    i4 = i3;
                                    i7 = i50;
                                    obj2 = obj7;
                                    i8 = i14;
                                    unsafe = unsafe6;
                                    i47 = i13;
                                    i9 = i15;
                                    i48 = i12;
                                    zztvVar = zztvVar2;
                                    zzqbVar2 = zzqbVar3;
                                    break;
                                } else {
                                    i17 = i12 | i57;
                                    zzi = zzqc.zzl(bArr2, i50, zzqbVar3);
                                    zzvc.zzm(obj7, j2, zzqbVar3.zzb != 0);
                                    i40 = i2;
                                    i41 = i3;
                                    zzqbVar6 = zzqbVar3;
                                    i49 = i14;
                                    i47 = i13;
                                    i45 = i15;
                                    i43 = -1;
                                    i48 = i17;
                                    i44 = zzi;
                                    i42 = 3;
                                }
                            case 8:
                                zzqbVar3 = zzqbVar;
                                i15 = i52;
                                i14 = i55;
                                if (i53 != 2) {
                                    i4 = i3;
                                    i7 = i50;
                                    obj2 = obj7;
                                    i8 = i14;
                                    unsafe = unsafe6;
                                    i47 = i13;
                                    i9 = i15;
                                    i48 = i12;
                                    zztvVar = zztvVar2;
                                    zzqbVar2 = zzqbVar3;
                                    break;
                                } else {
                                    if (zzM(i54)) {
                                        i16 = zzqc.zzi(bArr2, i50, zzqbVar3);
                                        int i62 = zzqbVar3.zza;
                                        if (i62 < 0) {
                                            throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        i12 |= i57;
                                        if (i62 == 0) {
                                            zzqbVar3.zzc = "";
                                        } else {
                                            zzqbVar3.zzc = zzvf.zzd(bArr2, i16, i62);
                                            i16 += i62;
                                        }
                                    } else {
                                        i12 |= i57;
                                        i16 = zzqc.zzg(bArr2, i50, zzqbVar3);
                                    }
                                    unsafe6.putObject(obj7, j2, zzqbVar3.zzc);
                                    i40 = i2;
                                    i41 = i3;
                                    zzqbVar6 = zzqbVar3;
                                    i49 = i14;
                                    i47 = i13;
                                    i45 = i15;
                                    i43 = -1;
                                    i44 = i16;
                                    i48 = i12;
                                    i42 = 3;
                                }
                            case 9:
                                zzqbVar3 = zzqbVar;
                                i15 = i52;
                                unsafe2 = unsafe6;
                                i14 = i55;
                                if (i53 == 2) {
                                    int i63 = i12 | i57;
                                    Object zzA = zztvVar2.zzA(obj7, i46);
                                    unsafe6 = unsafe2;
                                    i40 = i2;
                                    int zzn = zzqc.zzn(zzA, zztvVar2.zzx(i46), bArr, i50, i40, zzqbVar);
                                    zztvVar2.zzJ(obj7, i46, zzA);
                                    i41 = i3;
                                    zzqbVar6 = zzqbVar3;
                                    i49 = i14;
                                    i47 = i13;
                                    i42 = 3;
                                    i43 = -1;
                                    i44 = zzn;
                                    i48 = i63;
                                    i45 = i15;
                                }
                                unsafe6 = unsafe2;
                                i4 = i3;
                                i7 = i50;
                                obj2 = obj7;
                                i8 = i14;
                                unsafe = unsafe6;
                                i47 = i13;
                                i9 = i15;
                                i48 = i12;
                                zztvVar = zztvVar2;
                                zzqbVar2 = zzqbVar3;
                                break;
                            case 10:
                                zzqbVar3 = zzqbVar;
                                i15 = i52;
                                unsafe2 = unsafe6;
                                i14 = i55;
                                if (i53 != 2) {
                                    bArr2 = bArr;
                                    unsafe6 = unsafe2;
                                    i4 = i3;
                                    i7 = i50;
                                    obj2 = obj7;
                                    i8 = i14;
                                    unsafe = unsafe6;
                                    i47 = i13;
                                    i9 = i15;
                                    i48 = i12;
                                    zztvVar = zztvVar2;
                                    zzqbVar2 = zzqbVar3;
                                    break;
                                } else {
                                    int i64 = i12 | i57;
                                    bArr2 = bArr;
                                    int zza2 = zzqc.zza(bArr2, i50, zzqbVar3);
                                    unsafe2.putObject(obj7, j2, zzqbVar3.zzc);
                                    i40 = i2;
                                    i41 = i3;
                                    unsafe6 = unsafe2;
                                    zzqbVar6 = zzqbVar3;
                                    i49 = i14;
                                    i47 = i13;
                                    i45 = i15;
                                    i43 = -1;
                                    i48 = i64;
                                    i44 = zza2;
                                    i42 = 3;
                                }
                            case 12:
                                zzqbVar3 = zzqbVar;
                                i15 = i52;
                                unsafe2 = unsafe6;
                                i14 = i55;
                                if (i53 != 0) {
                                    bArr2 = bArr;
                                    unsafe6 = unsafe2;
                                    i4 = i3;
                                    i7 = i50;
                                    obj2 = obj7;
                                    i8 = i14;
                                    unsafe = unsafe6;
                                    i47 = i13;
                                    i9 = i15;
                                    i48 = i12;
                                    zztvVar = zztvVar2;
                                    zzqbVar2 = zzqbVar3;
                                    break;
                                } else {
                                    i16 = zzqc.zzi(bArr2, i50, zzqbVar3);
                                    int i65 = zzqbVar3.zza;
                                    zzsr zzw = zztvVar2.zzw(i46);
                                    if ((i54 & TLObject.FLAG_31) == 0 || zzw == null || zzw.zza(i65)) {
                                        i12 |= i57;
                                        unsafe2.putInt(obj7, j2, i65);
                                    } else {
                                        zzd(obj).zzj(i14, Long.valueOf(i65));
                                    }
                                    bArr2 = bArr;
                                    i40 = i2;
                                    i41 = i3;
                                    unsafe6 = unsafe2;
                                    zzqbVar6 = zzqbVar3;
                                    i49 = i14;
                                    i47 = i13;
                                    i45 = i15;
                                    i43 = -1;
                                    i44 = i16;
                                    i48 = i12;
                                    i42 = 3;
                                }
                            case 15:
                                zzqbVar3 = zzqbVar;
                                i15 = i52;
                                i14 = i55;
                                Unsafe unsafe8 = unsafe6;
                                if (i53 != 0) {
                                    unsafe6 = unsafe8;
                                    i4 = i3;
                                    i7 = i50;
                                    obj2 = obj7;
                                    i8 = i14;
                                    unsafe = unsafe6;
                                    i47 = i13;
                                    i9 = i15;
                                    i48 = i12;
                                    zztvVar = zztvVar2;
                                    zzqbVar2 = zzqbVar3;
                                    break;
                                } else {
                                    i17 = i12 | i57;
                                    zzi = zzqc.zzi(bArr2, i50, zzqbVar3);
                                    unsafe8.putInt(obj7, j2, zzqq.zzF(zzqbVar3.zza));
                                    i40 = i2;
                                    i41 = i3;
                                    zzqbVar6 = zzqbVar3;
                                    unsafe6 = unsafe8;
                                    i49 = i14;
                                    i47 = i13;
                                    i45 = i15;
                                    i43 = -1;
                                    i48 = i17;
                                    i44 = zzi;
                                    i42 = 3;
                                }
                            case 16:
                                i14 = i55;
                                Unsafe unsafe9 = unsafe6;
                                if (i53 != 0) {
                                    i15 = i52;
                                    unsafe6 = unsafe9;
                                    zzqbVar3 = zzqbVar;
                                    i4 = i3;
                                    i7 = i50;
                                    obj2 = obj7;
                                    i8 = i14;
                                    unsafe = unsafe6;
                                    i47 = i13;
                                    i9 = i15;
                                    i48 = i12;
                                    zztvVar = zztvVar2;
                                    zzqbVar2 = zzqbVar3;
                                    break;
                                } else {
                                    int i66 = i12 | i57;
                                    int zzl2 = zzqc.zzl(bArr2, i50, zzqbVar);
                                    unsafe9.putLong(obj, j2, zzqq.zzG(zzqbVar.zzb));
                                    unsafe6 = unsafe9;
                                    i40 = i2;
                                    i41 = i3;
                                    zzqbVar6 = zzqbVar;
                                    i49 = i14;
                                    i45 = i52;
                                    i42 = 3;
                                    i43 = -1;
                                    int i67 = i13;
                                    i48 = i66;
                                    i44 = zzl2;
                                    i47 = i67;
                                }
                            default:
                                if (i53 != 3) {
                                    zzqbVar3 = zzqbVar;
                                    i15 = i52;
                                    i14 = i55;
                                    i4 = i3;
                                    i7 = i50;
                                    obj2 = obj7;
                                    i8 = i14;
                                    unsafe = unsafe6;
                                    i47 = i13;
                                    i9 = i15;
                                    i48 = i12;
                                    zztvVar = zztvVar2;
                                    zzqbVar2 = zzqbVar3;
                                    break;
                                } else {
                                    int i68 = i12 | i57;
                                    Object zzA2 = zztvVar2.zzA(obj7, i46);
                                    i44 = zzqc.zzm(zzA2, zztvVar2.zzx(i46), bArr, i50, i2, (i52 << 3) | 4, zzqbVar);
                                    zztvVar2.zzJ(obj7, i46, zzA2);
                                    unsafe6 = unsafe6;
                                    zzqbVar6 = zzqbVar;
                                    i45 = i52;
                                    i49 = i55;
                                    i46 = i46;
                                    i47 = i13;
                                    i42 = 3;
                                    i43 = -1;
                                    i40 = i2;
                                    i41 = i3;
                                    i48 = i68;
                                }
                        }
                    } else {
                        if (zzt != 27) {
                            i18 = i47;
                            unsafe3 = unsafe6;
                            int i69 = i55;
                            if (zzt > 49) {
                                int i70 = i50;
                                i20 = i52;
                                i21 = i69;
                                zzqbVar4 = zzqbVar;
                                i22 = i46;
                                if (zzt != 50) {
                                    zztvVar = this;
                                    long j3 = iArr[i22 + 2] & 1048575;
                                    switch (zzt) {
                                        case 51:
                                            obj2 = obj;
                                            i34 = i70;
                                            i35 = i22;
                                            unsafe = unsafe3;
                                            i9 = i20;
                                            i8 = i21;
                                            zzqbVar2 = zzqbVar4;
                                            if (i53 == 1) {
                                                i36 = i34 + 8;
                                                unsafe.putObject(obj2, j2, Double.valueOf(Double.longBitsToDouble(zzqc.zzp(bArr2, i34))));
                                                unsafe.putInt(obj2, j3, i9);
                                                if (i36 == i34) {
                                                    i4 = i3;
                                                    i7 = i36;
                                                    i47 = i18;
                                                    i46 = i35;
                                                    break;
                                                } else {
                                                    i40 = i2;
                                                    i41 = i3;
                                                    i44 = i36;
                                                    i49 = i8;
                                                    zzqbVar6 = zzqbVar2;
                                                    zztvVar2 = zztvVar;
                                                    obj7 = obj2;
                                                    i45 = i9;
                                                    i47 = i18;
                                                    i46 = i35;
                                                    i42 = 3;
                                                    i43 = -1;
                                                    unsafe6 = unsafe;
                                                }
                                            }
                                            i36 = i34;
                                            if (i36 == i34) {
                                            }
                                        case 52:
                                            obj2 = obj;
                                            i34 = i70;
                                            i35 = i22;
                                            unsafe = unsafe3;
                                            i9 = i20;
                                            i8 = i21;
                                            zzqbVar2 = zzqbVar4;
                                            if (i53 == 5) {
                                                i36 = i34 + 4;
                                                unsafe.putObject(obj2, j2, Float.valueOf(Float.intBitsToFloat(zzqc.zzb(bArr2, i34))));
                                                unsafe.putInt(obj2, j3, i9);
                                                if (i36 == i34) {
                                                }
                                            }
                                            i36 = i34;
                                            if (i36 == i34) {
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            obj2 = obj;
                                            i34 = i70;
                                            i35 = i22;
                                            unsafe = unsafe3;
                                            i9 = i20;
                                            i8 = i21;
                                            zzqbVar2 = zzqbVar4;
                                            if (i53 == 0) {
                                                i36 = zzqc.zzl(bArr2, i34, zzqbVar2);
                                                unsafe.putObject(obj2, j2, Long.valueOf(zzqbVar2.zzb));
                                                unsafe.putInt(obj2, j3, i9);
                                                if (i36 == i34) {
                                                }
                                            }
                                            i36 = i34;
                                            if (i36 == i34) {
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            obj2 = obj;
                                            i34 = i70;
                                            i35 = i22;
                                            unsafe = unsafe3;
                                            i9 = i20;
                                            i8 = i21;
                                            zzqbVar2 = zzqbVar4;
                                            if (i53 == 0) {
                                                i36 = zzqc.zzi(bArr2, i34, zzqbVar2);
                                                unsafe.putObject(obj2, j2, Integer.valueOf(zzqbVar2.zza));
                                                unsafe.putInt(obj2, j3, i9);
                                                if (i36 == i34) {
                                                }
                                            }
                                            i36 = i34;
                                            if (i36 == i34) {
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            obj2 = obj;
                                            i34 = i70;
                                            i35 = i22;
                                            unsafe = unsafe3;
                                            i9 = i20;
                                            i8 = i21;
                                            zzqbVar2 = zzqbVar4;
                                            if (i53 == 1) {
                                                i36 = i34 + 8;
                                                unsafe.putObject(obj2, j2, Long.valueOf(zzqc.zzp(bArr2, i34)));
                                                unsafe.putInt(obj2, j3, i9);
                                                if (i36 == i34) {
                                                }
                                            }
                                            i36 = i34;
                                            if (i36 == i34) {
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            obj2 = obj;
                                            i34 = i70;
                                            i35 = i22;
                                            unsafe = unsafe3;
                                            i9 = i20;
                                            i8 = i21;
                                            zzqbVar2 = zzqbVar4;
                                            if (i53 == 5) {
                                                i36 = i34 + 4;
                                                unsafe.putObject(obj2, j2, Integer.valueOf(zzqc.zzb(bArr2, i34)));
                                                unsafe.putInt(obj2, j3, i9);
                                                if (i36 == i34) {
                                                }
                                            }
                                            i36 = i34;
                                            if (i36 == i34) {
                                            }
                                            break;
                                        case 58:
                                            obj2 = obj;
                                            i34 = i70;
                                            i35 = i22;
                                            unsafe = unsafe3;
                                            i9 = i20;
                                            i8 = i21;
                                            zzqbVar2 = zzqbVar4;
                                            if (i53 == 0) {
                                                i36 = zzqc.zzl(bArr2, i34, zzqbVar2);
                                                unsafe.putObject(obj2, j2, Boolean.valueOf(zzqbVar2.zzb != 0));
                                                unsafe.putInt(obj2, j3, i9);
                                                if (i36 == i34) {
                                                }
                                            }
                                            i36 = i34;
                                            if (i36 == i34) {
                                            }
                                            break;
                                        case 59:
                                            i34 = i70;
                                            i35 = i22;
                                            obj2 = obj;
                                            unsafe = unsafe3;
                                            i9 = i20;
                                            i8 = i21;
                                            zzqbVar2 = zzqbVar4;
                                            if (i53 == 2) {
                                                int zzi4 = zzqc.zzi(bArr2, i34, zzqbVar2);
                                                int i71 = zzqbVar2.zza;
                                                if (i71 == 0) {
                                                    unsafe.putObject(obj2, j2, "");
                                                } else {
                                                    int i72 = zzi4 + i71;
                                                    if ((i54 & TLObject.FLAG_29) != 0 && !zzvf.zze(bArr2, zzi4, i72)) {
                                                        throw new zzsx("Protocol message had invalid UTF-8.");
                                                    }
                                                    unsafe.putObject(obj2, j2, new String(bArr2, zzi4, i71, zzsv.zza));
                                                    zzi4 = i72;
                                                }
                                                unsafe.putInt(obj2, j3, i9);
                                                i36 = zzi4;
                                                if (i36 == i34) {
                                                }
                                            }
                                            i36 = i34;
                                            if (i36 == i34) {
                                            }
                                            break;
                                        case 60:
                                            i34 = i70;
                                            zzqbVar2 = zzqbVar4;
                                            unsafe = unsafe3;
                                            if (i53 == 2) {
                                                Object zzB = zztvVar.zzB(obj, i20, i22);
                                                i9 = i20;
                                                obj2 = obj;
                                                i36 = zzqc.zzn(zzB, zztvVar.zzx(i22), bArr, i34, i2, zzqbVar);
                                                zztvVar.zzK(obj2, i9, i22, zzB);
                                                i8 = i21;
                                                i35 = i22;
                                                if (i36 == i34) {
                                                }
                                            } else {
                                                obj2 = obj;
                                                i9 = i20;
                                                i35 = i22;
                                                i8 = i21;
                                                i36 = i34;
                                                if (i36 == i34) {
                                                }
                                            }
                                            break;
                                        case 61:
                                            i34 = i70;
                                            i37 = i21;
                                            zzqbVar2 = zzqbVar4;
                                            unsafe = unsafe3;
                                            if (i53 == 2) {
                                                int zza3 = zzqc.zza(bArr2, i34, zzqbVar2);
                                                unsafe.putObject(obj, j2, zzqbVar2.zzc);
                                                unsafe.putInt(obj, j3, i20);
                                                obj2 = obj;
                                                i35 = i22;
                                                i9 = i20;
                                                i36 = zza3;
                                                i8 = i37;
                                                if (i36 == i34) {
                                                }
                                            } else {
                                                obj2 = obj;
                                                i35 = i22;
                                                i9 = i20;
                                                i8 = i37;
                                                i36 = i34;
                                                if (i36 == i34) {
                                                }
                                            }
                                            break;
                                        case 63:
                                            i34 = i70;
                                            i38 = i21;
                                            zzqbVar2 = zzqbVar4;
                                            i39 = i22;
                                            obj6 = obj;
                                            unsafe = unsafe3;
                                            if (i53 == 0) {
                                                i36 = zzqc.zzi(bArr2, i34, zzqbVar2);
                                                int i73 = zzqbVar2.zza;
                                                zzsr zzw2 = zztvVar.zzw(i39);
                                                if (zzw2 == null || zzw2.zza(i73)) {
                                                    i37 = i38;
                                                    unsafe.putObject(obj6, j2, Integer.valueOf(i73));
                                                    unsafe.putInt(obj6, j3, i20);
                                                } else {
                                                    i37 = i38;
                                                    zzd(obj).zzj(i37, Long.valueOf(i73));
                                                }
                                                obj2 = obj6;
                                                i35 = i39;
                                                i9 = i20;
                                                i8 = i37;
                                                if (i36 == i34) {
                                                }
                                            }
                                            obj2 = obj6;
                                            i35 = i39;
                                            i9 = i20;
                                            i8 = i38;
                                            i36 = i34;
                                            if (i36 == i34) {
                                            }
                                            break;
                                        case 66:
                                            i34 = i70;
                                            i38 = i21;
                                            zzqbVar2 = zzqbVar4;
                                            i39 = i22;
                                            obj6 = obj;
                                            unsafe = unsafe3;
                                            if (i53 == 0) {
                                                i36 = zzqc.zzi(bArr2, i34, zzqbVar2);
                                                unsafe.putObject(obj6, j2, Integer.valueOf(zzqq.zzF(zzqbVar2.zza)));
                                                unsafe.putInt(obj6, j3, i20);
                                                obj2 = obj6;
                                                i35 = i39;
                                                i9 = i20;
                                                i8 = i38;
                                                if (i36 == i34) {
                                                }
                                            }
                                            obj2 = obj6;
                                            i35 = i39;
                                            i9 = i20;
                                            i8 = i38;
                                            i36 = i34;
                                            if (i36 == i34) {
                                            }
                                            break;
                                        case 67:
                                            i38 = i21;
                                            zzqbVar2 = zzqbVar4;
                                            i39 = i22;
                                            obj6 = obj;
                                            unsafe = unsafe3;
                                            if (i53 == 0) {
                                                i34 = i70;
                                                i36 = zzqc.zzl(bArr2, i34, zzqbVar2);
                                                unsafe.putObject(obj6, j2, Long.valueOf(zzqq.zzG(zzqbVar2.zzb)));
                                                unsafe.putInt(obj6, j3, i20);
                                                obj2 = obj6;
                                                i35 = i39;
                                                i9 = i20;
                                                i8 = i38;
                                                if (i36 == i34) {
                                                }
                                            } else {
                                                i34 = i70;
                                                obj2 = obj6;
                                                i35 = i39;
                                                i9 = i20;
                                                i8 = i38;
                                                i36 = i34;
                                                if (i36 == i34) {
                                                }
                                            }
                                            break;
                                        case 68:
                                            if (i53 == 3) {
                                                int i74 = (i21 & (-8)) | 4;
                                                Object zzB2 = zztvVar.zzB(obj, i20, i22);
                                                zzqbVar2 = zzqbVar4;
                                                int zzm = zzqc.zzm(zzB2, zztvVar.zzx(i22), bArr, i70, i2, i74, zzqbVar);
                                                zztvVar.zzK(obj, i20, i22, zzB2);
                                                obj2 = obj;
                                                i35 = i22;
                                                i9 = i20;
                                                unsafe = unsafe3;
                                                i36 = zzm;
                                                i8 = i21;
                                                i34 = i70;
                                                if (i36 == i34) {
                                                }
                                            } else {
                                                zzqbVar2 = zzqbVar4;
                                                obj2 = obj;
                                                i34 = i70;
                                                i9 = i20;
                                                i35 = i22;
                                                i8 = i21;
                                                unsafe = unsafe3;
                                                i36 = i34;
                                                if (i36 == i34) {
                                                }
                                            }
                                            break;
                                        default:
                                            obj2 = obj;
                                            i34 = i70;
                                            i35 = i22;
                                            unsafe = unsafe3;
                                            i9 = i20;
                                            i8 = i21;
                                            zzqbVar2 = zzqbVar4;
                                            i36 = i34;
                                            if (i36 == i34) {
                                            }
                                            break;
                                    }
                                } else {
                                    if (i53 == 2) {
                                        Object zzz = zzz(i22);
                                        Object object = unsafe3.getObject(obj, j2);
                                        if (zztn.zza(object)) {
                                            zztm zzb2 = zztm.zza().zzb();
                                            zztn.zzb(zzb2, object);
                                            unsafe3.putObject(obj, j2, zzb2);
                                        }
                                        throw null;
                                    }
                                    zztvVar = this;
                                    i19 = i70;
                                    obj4 = obj;
                                }
                            } else {
                                long j4 = i54;
                                zzsu zzsuVar = (zzsu) unsafe3.getObject(obj7, j2);
                                if (zzsuVar.zzc()) {
                                    j = j4;
                                } else {
                                    int size = zzsuVar.size();
                                    j = j4;
                                    zzsu zzd = zzsuVar.zzd(size + size);
                                    unsafe3.putObject(obj7, j2, zzd);
                                    zzsuVar = zzd;
                                }
                                switch (zzt) {
                                    case 18:
                                    case 35:
                                        int i75 = i50;
                                        i23 = i52;
                                        i24 = i2;
                                        zzqbVar5 = zzqbVar;
                                        i25 = i46;
                                        if (i53 == 2) {
                                            int i76 = zzqc.zza;
                                            zzrs zzrsVar = (zzrs) zzsuVar;
                                            i27 = zzqc.zzi(bArr2, i75, zzqbVar5);
                                            int i77 = zzqbVar5.zza;
                                            int i78 = i27 + i77;
                                            if (i78 > bArr2.length) {
                                                throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzrsVar.zzg(zzrsVar.size() + (i77 / 8));
                                            while (i27 < i78) {
                                                zzrsVar.zzf(Double.longBitsToDouble(zzqc.zzp(bArr2, i27)));
                                                i27 += 8;
                                                i75 = i75;
                                            }
                                            i26 = i75;
                                            if (i27 != i78) {
                                                throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            i26 = i75;
                                            if (i53 == 1) {
                                                i27 = i26 + 8;
                                                int i79 = zzqc.zza;
                                                zzrs zzrsVar2 = (zzrs) zzsuVar;
                                                zzrsVar2.zzf(Double.longBitsToDouble(zzqc.zzp(bArr2, i26)));
                                                while (i27 < i24) {
                                                    int zzi5 = zzqc.zzi(bArr2, i27, zzqbVar5);
                                                    if (i69 == zzqbVar5.zza) {
                                                        zzrsVar2.zzf(Double.longBitsToDouble(zzqc.zzp(bArr2, zzi5)));
                                                        i27 = zzi5 + 8;
                                                    }
                                                }
                                            }
                                            i27 = i26;
                                        }
                                        if (i27 != i26) {
                                            zztvVar = this;
                                            obj2 = obj;
                                            i4 = i3;
                                            i7 = i27;
                                            zzqbVar2 = zzqbVar5;
                                            i9 = i23;
                                            i8 = i69;
                                            i46 = i25;
                                            unsafe = unsafe3;
                                            i47 = i18;
                                            break;
                                        } else {
                                            zztvVar2 = this;
                                            obj7 = obj;
                                            i41 = i3;
                                            i45 = i23;
                                            i40 = i24;
                                            i49 = i69;
                                            i46 = i25;
                                            zzqbVar6 = zzqbVar5;
                                            i42 = 3;
                                            i43 = -1;
                                            i44 = i27;
                                            unsafe6 = unsafe3;
                                            i47 = i18;
                                        }
                                    case 19:
                                    case 36:
                                        i28 = i50;
                                        i23 = i52;
                                        i24 = i2;
                                        zzqbVar5 = zzqbVar;
                                        i25 = i46;
                                        if (i53 == 2) {
                                            int i80 = zzqc.zza;
                                            zzsf zzsfVar = (zzsf) zzsuVar;
                                            i27 = zzqc.zzi(bArr2, i28, zzqbVar5);
                                            int i81 = zzqbVar5.zza;
                                            int i82 = i27 + i81;
                                            if (i82 > bArr2.length) {
                                                throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzsfVar.zzg(zzsfVar.size() + (i81 / 4));
                                            while (i27 < i82) {
                                                zzsfVar.zzf(Float.intBitsToFloat(zzqc.zzb(bArr2, i27)));
                                                i27 += 4;
                                            }
                                            if (i27 != i82) {
                                                throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            if (i53 == 5) {
                                                i27 = i28 + 4;
                                                int i83 = zzqc.zza;
                                                zzsf zzsfVar2 = (zzsf) zzsuVar;
                                                zzsfVar2.zzf(Float.intBitsToFloat(zzqc.zzb(bArr2, i28)));
                                                while (i27 < i24) {
                                                    int zzi6 = zzqc.zzi(bArr2, i27, zzqbVar5);
                                                    if (i69 == zzqbVar5.zza) {
                                                        zzsfVar2.zzf(Float.intBitsToFloat(zzqc.zzb(bArr2, zzi6)));
                                                        i27 = zzi6 + 4;
                                                    }
                                                }
                                            }
                                            i26 = i28;
                                            i27 = i26;
                                            if (i27 != i26) {
                                            }
                                        }
                                        i26 = i28;
                                        if (i27 != i26) {
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        i28 = i50;
                                        i23 = i52;
                                        i24 = i2;
                                        zzqbVar5 = zzqbVar;
                                        i25 = i46;
                                        if (i53 == 2) {
                                            int i84 = zzqc.zza;
                                            zzth zzthVar = (zzth) zzsuVar;
                                            i27 = zzqc.zzi(bArr2, i28, zzqbVar5);
                                            int i85 = zzqbVar5.zza + i27;
                                            while (i27 < i85) {
                                                i27 = zzqc.zzl(bArr2, i27, zzqbVar5);
                                                zzthVar.zzg(zzqbVar5.zzb);
                                            }
                                            if (i27 != i85) {
                                                throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            if (i53 == 0) {
                                                int i86 = zzqc.zza;
                                                zzth zzthVar2 = (zzth) zzsuVar;
                                                i27 = zzqc.zzl(bArr2, i28, zzqbVar5);
                                                zzthVar2.zzg(zzqbVar5.zzb);
                                                while (i27 < i24) {
                                                    int zzi7 = zzqc.zzi(bArr2, i27, zzqbVar5);
                                                    if (i69 == zzqbVar5.zza) {
                                                        i27 = zzqc.zzl(bArr2, zzi7, zzqbVar5);
                                                        zzthVar2.zzg(zzqbVar5.zzb);
                                                    }
                                                }
                                            }
                                            i26 = i28;
                                            i27 = i26;
                                            if (i27 != i26) {
                                            }
                                        }
                                        i26 = i28;
                                        if (i27 != i26) {
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        i28 = i50;
                                        i29 = i52;
                                        i30 = i69;
                                        unsafe4 = unsafe3;
                                        i31 = i46;
                                        i32 = i2;
                                        zzqbVar5 = zzqbVar;
                                        if (i53 == 2) {
                                            zzf = zzqc.zzf(bArr2, i28, zzsuVar, zzqbVar5);
                                            i25 = i31;
                                            i27 = zzf;
                                            unsafe3 = unsafe4;
                                            i24 = i32;
                                            i69 = i30;
                                            i23 = i29;
                                            i26 = i28;
                                            if (i27 != i26) {
                                            }
                                        } else {
                                            if (i53 == 0) {
                                                i25 = i31;
                                                unsafe3 = unsafe4;
                                                i26 = i28;
                                                i24 = i32;
                                                i69 = i30;
                                                i27 = zzqc.zzk(i30, bArr, i26, i2, zzsuVar, zzqbVar);
                                                i23 = i29;
                                                if (i27 != i26) {
                                                }
                                            }
                                            i25 = i31;
                                            unsafe3 = unsafe4;
                                            i24 = i32;
                                            i69 = i30;
                                            i23 = i29;
                                            i26 = i28;
                                            i27 = i26;
                                            if (i27 != i26) {
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        i28 = i50;
                                        i29 = i52;
                                        i30 = i69;
                                        unsafe4 = unsafe3;
                                        i31 = i46;
                                        i32 = i2;
                                        zzqbVar5 = zzqbVar;
                                        if (i53 == 2) {
                                            int i87 = zzqc.zza;
                                            zzth zzthVar3 = (zzth) zzsuVar;
                                            zzi2 = zzqc.zzi(bArr2, i28, zzqbVar5);
                                            int i88 = zzqbVar5.zza;
                                            int i89 = zzi2 + i88;
                                            if (i89 > bArr2.length) {
                                                throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzthVar3.zzh(zzthVar3.size() + (i88 / 8));
                                            while (zzi2 < i89) {
                                                zzthVar3.zzg(zzqc.zzp(bArr2, zzi2));
                                                zzi2 += 8;
                                            }
                                            if (zzi2 != i89) {
                                                throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i25 = i31;
                                            unsafe3 = unsafe4;
                                            i24 = i32;
                                            i69 = i30;
                                            i23 = i29;
                                            i27 = zzi2;
                                            i26 = i28;
                                            if (i27 != i26) {
                                            }
                                        } else {
                                            if (i53 == 1) {
                                                zzf = i28 + 8;
                                                int i90 = zzqc.zza;
                                                zzth zzthVar4 = (zzth) zzsuVar;
                                                zzthVar4.zzg(zzqc.zzp(bArr2, i28));
                                                while (zzf < i32) {
                                                    int zzi8 = zzqc.zzi(bArr2, zzf, zzqbVar5);
                                                    if (i30 == zzqbVar5.zza) {
                                                        zzthVar4.zzg(zzqc.zzp(bArr2, zzi8));
                                                        zzf = zzi8 + 8;
                                                    } else {
                                                        i25 = i31;
                                                        i27 = zzf;
                                                        unsafe3 = unsafe4;
                                                        i24 = i32;
                                                        i69 = i30;
                                                        i23 = i29;
                                                        i26 = i28;
                                                        if (i27 != i26) {
                                                        }
                                                    }
                                                }
                                                i25 = i31;
                                                i27 = zzf;
                                                unsafe3 = unsafe4;
                                                i24 = i32;
                                                i69 = i30;
                                                i23 = i29;
                                                i26 = i28;
                                                if (i27 != i26) {
                                                }
                                            }
                                            i25 = i31;
                                            unsafe3 = unsafe4;
                                            i24 = i32;
                                            i69 = i30;
                                            i23 = i29;
                                            i26 = i28;
                                            i27 = i26;
                                            if (i27 != i26) {
                                            }
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        i28 = i50;
                                        i29 = i52;
                                        i30 = i69;
                                        unsafe4 = unsafe3;
                                        i31 = i46;
                                        i32 = i2;
                                        zzqbVar5 = zzqbVar;
                                        if (i53 == 2) {
                                            int i91 = zzqc.zza;
                                            zzso zzsoVar = (zzso) zzsuVar;
                                            zzi2 = zzqc.zzi(bArr2, i28, zzqbVar5);
                                            int i92 = zzqbVar5.zza;
                                            int i93 = zzi2 + i92;
                                            if (i93 > bArr2.length) {
                                                throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzsoVar.zzi(zzsoVar.size() + (i92 / 4));
                                            while (zzi2 < i93) {
                                                zzsoVar.zzh(zzqc.zzb(bArr2, zzi2));
                                                zzi2 += 4;
                                            }
                                            if (zzi2 != i93) {
                                                throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i25 = i31;
                                            unsafe3 = unsafe4;
                                            i24 = i32;
                                            i69 = i30;
                                            i23 = i29;
                                            i27 = zzi2;
                                            i26 = i28;
                                            if (i27 != i26) {
                                            }
                                        } else {
                                            if (i53 == 5) {
                                                zzf = i28 + 4;
                                                int i94 = zzqc.zza;
                                                zzso zzsoVar2 = (zzso) zzsuVar;
                                                zzsoVar2.zzh(zzqc.zzb(bArr2, i28));
                                                while (zzf < i32) {
                                                    int zzi9 = zzqc.zzi(bArr2, zzf, zzqbVar5);
                                                    if (i30 == zzqbVar5.zza) {
                                                        zzsoVar2.zzh(zzqc.zzb(bArr2, zzi9));
                                                        zzf = zzi9 + 4;
                                                    } else {
                                                        i25 = i31;
                                                        i27 = zzf;
                                                        unsafe3 = unsafe4;
                                                        i24 = i32;
                                                        i69 = i30;
                                                        i23 = i29;
                                                        i26 = i28;
                                                        if (i27 != i26) {
                                                        }
                                                    }
                                                }
                                                i25 = i31;
                                                i27 = zzf;
                                                unsafe3 = unsafe4;
                                                i24 = i32;
                                                i69 = i30;
                                                i23 = i29;
                                                i26 = i28;
                                                if (i27 != i26) {
                                                }
                                            }
                                            i25 = i31;
                                            unsafe3 = unsafe4;
                                            i24 = i32;
                                            i69 = i30;
                                            i23 = i29;
                                            i26 = i28;
                                            i27 = i26;
                                            if (i27 != i26) {
                                            }
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        i28 = i50;
                                        i29 = i52;
                                        i30 = i69;
                                        unsafe4 = unsafe3;
                                        i31 = i46;
                                        i32 = i2;
                                        zzqbVar5 = zzqbVar;
                                        if (i53 == 2) {
                                            int i95 = zzqc.zza;
                                            zzqd zzqdVar = (zzqd) zzsuVar;
                                            zzi2 = zzqc.zzi(bArr2, i28, zzqbVar5);
                                            int i96 = zzqbVar5.zza + zzi2;
                                            while (zzi2 < i96) {
                                                zzi2 = zzqc.zzl(bArr2, zzi2, zzqbVar5);
                                                zzqdVar.zze(zzqbVar5.zzb != 0);
                                            }
                                            if (zzi2 != i96) {
                                                throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i25 = i31;
                                            unsafe3 = unsafe4;
                                            i24 = i32;
                                            i69 = i30;
                                            i23 = i29;
                                            i27 = zzi2;
                                            i26 = i28;
                                            if (i27 != i26) {
                                            }
                                        } else {
                                            if (i53 == 0) {
                                                int i97 = zzqc.zza;
                                                zzqd zzqdVar2 = (zzqd) zzsuVar;
                                                zzf = zzqc.zzl(bArr2, i28, zzqbVar5);
                                                zzqdVar2.zze(zzqbVar5.zzb != 0);
                                                while (zzf < i32) {
                                                    int zzi10 = zzqc.zzi(bArr2, zzf, zzqbVar5);
                                                    if (i30 == zzqbVar5.zza) {
                                                        zzf = zzqc.zzl(bArr2, zzi10, zzqbVar5);
                                                        zzqdVar2.zze(zzqbVar5.zzb != 0);
                                                    } else {
                                                        i25 = i31;
                                                        i27 = zzf;
                                                        unsafe3 = unsafe4;
                                                        i24 = i32;
                                                        i69 = i30;
                                                        i23 = i29;
                                                        i26 = i28;
                                                        if (i27 != i26) {
                                                        }
                                                    }
                                                }
                                                i25 = i31;
                                                i27 = zzf;
                                                unsafe3 = unsafe4;
                                                i24 = i32;
                                                i69 = i30;
                                                i23 = i29;
                                                i26 = i28;
                                                if (i27 != i26) {
                                                }
                                            }
                                            i25 = i31;
                                            unsafe3 = unsafe4;
                                            i24 = i32;
                                            i69 = i30;
                                            i23 = i29;
                                            i26 = i28;
                                            i27 = i26;
                                            if (i27 != i26) {
                                            }
                                        }
                                        break;
                                    case 26:
                                        i28 = i50;
                                        i29 = i52;
                                        i30 = i69;
                                        unsafe4 = unsafe3;
                                        i31 = i46;
                                        i32 = i2;
                                        zzqbVar5 = zzqbVar;
                                        if (i53 == 2) {
                                            if ((j & 536870912) == 0) {
                                                zzi3 = zzqc.zzi(bArr2, i28, zzqbVar5);
                                                int i98 = zzqbVar5.zza;
                                                if (i98 < 0) {
                                                    throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i98 == 0) {
                                                    obj5 = "";
                                                    zzsuVar.add(obj5);
                                                } else {
                                                    obj5 = "";
                                                    zzsuVar.add(new String(bArr2, zzi3, i98, zzsv.zza));
                                                    zzi3 += i98;
                                                }
                                                while (zzi3 < i32) {
                                                    int zzi11 = zzqc.zzi(bArr2, zzi3, zzqbVar5);
                                                    if (i30 == zzqbVar5.zza) {
                                                        zzi3 = zzqc.zzi(bArr2, zzi11, zzqbVar5);
                                                        int i99 = zzqbVar5.zza;
                                                        if (i99 < 0) {
                                                            throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i99 == 0) {
                                                            zzsuVar.add(obj5);
                                                        } else {
                                                            zzsuVar.add(new String(bArr2, zzi3, i99, zzsv.zza));
                                                            zzi3 += i99;
                                                        }
                                                    }
                                                }
                                            } else {
                                                zzi3 = zzqc.zzi(bArr2, i28, zzqbVar5);
                                                int i100 = zzqbVar5.zza;
                                                if (i100 < 0) {
                                                    throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i100 == 0) {
                                                    zzsuVar.add("");
                                                } else {
                                                    int i101 = zzi3 + i100;
                                                    if (!zzvf.zze(bArr2, zzi3, i101)) {
                                                        throw new zzsx("Protocol message had invalid UTF-8.");
                                                    }
                                                    zzsuVar.add(new String(bArr2, zzi3, i100, zzsv.zza));
                                                    zzi3 = i101;
                                                }
                                                while (zzi3 < i32) {
                                                    int zzi12 = zzqc.zzi(bArr2, zzi3, zzqbVar5);
                                                    if (i30 == zzqbVar5.zza) {
                                                        zzi3 = zzqc.zzi(bArr2, zzi12, zzqbVar5);
                                                        int i102 = zzqbVar5.zza;
                                                        if (i102 < 0) {
                                                            throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i102 == 0) {
                                                            zzsuVar.add("");
                                                        } else {
                                                            int i103 = zzi3 + i102;
                                                            if (!zzvf.zze(bArr2, zzi3, i103)) {
                                                                throw new zzsx("Protocol message had invalid UTF-8.");
                                                            }
                                                            zzsuVar.add(new String(bArr2, zzi3, i102, zzsv.zza));
                                                            zzi3 = i103;
                                                        }
                                                    }
                                                }
                                            }
                                            i25 = i31;
                                            unsafe3 = unsafe4;
                                            i69 = i30;
                                            i26 = i28;
                                            i27 = zzi3;
                                            i24 = i32;
                                            i23 = i29;
                                            if (i27 != i26) {
                                            }
                                        }
                                        i25 = i31;
                                        unsafe3 = unsafe4;
                                        i24 = i32;
                                        i69 = i30;
                                        i23 = i29;
                                        i26 = i28;
                                        i27 = i26;
                                        if (i27 != i26) {
                                        }
                                        break;
                                    case 27:
                                        i28 = i50;
                                        unsafe5 = unsafe3;
                                        i33 = i2;
                                        if (i53 == 2) {
                                            i29 = i52;
                                            i30 = i69;
                                            i32 = i33;
                                            unsafe4 = unsafe5;
                                            zzi3 = zzqc.zze(zztvVar2.zzx(i46), i69, bArr, i28, i2, zzsuVar, zzqbVar);
                                            i25 = i46;
                                            zzqbVar5 = zzqbVar;
                                            unsafe3 = unsafe4;
                                            i69 = i30;
                                            i26 = i28;
                                            i27 = zzi3;
                                            i24 = i32;
                                            i23 = i29;
                                            if (i27 != i26) {
                                            }
                                        }
                                        i26 = i28;
                                        i23 = i52;
                                        i24 = i33;
                                        unsafe3 = unsafe5;
                                        zzqbVar5 = zzqbVar;
                                        i25 = i46;
                                        i27 = i26;
                                        if (i27 != i26) {
                                        }
                                        break;
                                    case 28:
                                        i28 = i50;
                                        unsafe5 = unsafe3;
                                        i33 = i2;
                                        if (i53 == 2) {
                                            i27 = zzqc.zzi(bArr2, i28, zzqbVar);
                                            int i104 = zzqbVar.zza;
                                            if (i104 < 0) {
                                                throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i104 > bArr2.length - i27) {
                                                throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (i104 == 0) {
                                                zzsuVar.add(zzqm.zzb);
                                            } else {
                                                zzsuVar.add(zzqm.zzl(bArr2, i27, i104));
                                                i27 += i104;
                                            }
                                            while (i27 < i33) {
                                                int zzi13 = zzqc.zzi(bArr2, i27, zzqbVar);
                                                if (i69 == zzqbVar.zza) {
                                                    i27 = zzqc.zzi(bArr2, zzi13, zzqbVar);
                                                    int i105 = zzqbVar.zza;
                                                    if (i105 < 0) {
                                                        throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i105 > bArr2.length - i27) {
                                                        throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i105 == 0) {
                                                        zzsuVar.add(zzqm.zzb);
                                                    } else {
                                                        zzsuVar.add(zzqm.zzl(bArr2, i27, i105));
                                                        i27 += i105;
                                                    }
                                                } else {
                                                    i26 = i28;
                                                    i23 = i52;
                                                    i24 = i33;
                                                    unsafe3 = unsafe5;
                                                    zzqbVar5 = zzqbVar;
                                                    i25 = i46;
                                                    if (i27 != i26) {
                                                    }
                                                }
                                            }
                                            i26 = i28;
                                            i23 = i52;
                                            i24 = i33;
                                            unsafe3 = unsafe5;
                                            zzqbVar5 = zzqbVar;
                                            i25 = i46;
                                            if (i27 != i26) {
                                            }
                                        }
                                        i26 = i28;
                                        i23 = i52;
                                        i24 = i33;
                                        unsafe3 = unsafe5;
                                        zzqbVar5 = zzqbVar;
                                        i25 = i46;
                                        i27 = i26;
                                        if (i27 != i26) {
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        i28 = i50;
                                        unsafe5 = unsafe3;
                                        i33 = i2;
                                        if (i53 == 2) {
                                            zzk = zzqc.zzf(bArr2, i28, zzsuVar, zzqbVar);
                                        } else {
                                            if (i53 == 0) {
                                                zzk = zzqc.zzk(i69, bArr, i28, i2, zzsuVar, zzqbVar);
                                            }
                                            i26 = i28;
                                            i23 = i52;
                                            i24 = i33;
                                            unsafe3 = unsafe5;
                                            zzqbVar5 = zzqbVar;
                                            i25 = i46;
                                            i27 = i26;
                                            if (i27 != i26) {
                                            }
                                        }
                                        int i106 = zzk;
                                        zzui.zzn(obj, i52, zzsuVar, zztvVar2.zzw(i46), null, zztvVar2.zzm);
                                        i26 = i28;
                                        i23 = i52;
                                        i27 = i106;
                                        i24 = i33;
                                        unsafe3 = unsafe5;
                                        zzqbVar5 = zzqbVar;
                                        i25 = i46;
                                        if (i27 != i26) {
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        i28 = i50;
                                        unsafe5 = unsafe3;
                                        i33 = i2;
                                        if (i53 == 2) {
                                            int i107 = zzqc.zza;
                                            zzso zzsoVar3 = (zzso) zzsuVar;
                                            i27 = zzqc.zzi(bArr2, i28, zzqbVar);
                                            int i108 = zzqbVar.zza + i27;
                                            while (i27 < i108) {
                                                i27 = zzqc.zzi(bArr2, i27, zzqbVar);
                                                zzsoVar3.zzh(zzqq.zzF(zzqbVar.zza));
                                            }
                                            if (i27 != i108) {
                                                throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            if (i53 == 0) {
                                                int i109 = zzqc.zza;
                                                zzso zzsoVar4 = (zzso) zzsuVar;
                                                i27 = zzqc.zzi(bArr2, i28, zzqbVar);
                                                zzsoVar4.zzh(zzqq.zzF(zzqbVar.zza));
                                                while (i27 < i33) {
                                                    int zzi14 = zzqc.zzi(bArr2, i27, zzqbVar);
                                                    if (i69 == zzqbVar.zza) {
                                                        i27 = zzqc.zzi(bArr2, zzi14, zzqbVar);
                                                        zzsoVar4.zzh(zzqq.zzF(zzqbVar.zza));
                                                    }
                                                }
                                            }
                                            i26 = i28;
                                            i23 = i52;
                                            i24 = i33;
                                            unsafe3 = unsafe5;
                                            zzqbVar5 = zzqbVar;
                                            i25 = i46;
                                            i27 = i26;
                                            if (i27 != i26) {
                                            }
                                        }
                                        i26 = i28;
                                        i23 = i52;
                                        i24 = i33;
                                        unsafe3 = unsafe5;
                                        zzqbVar5 = zzqbVar;
                                        i25 = i46;
                                        if (i27 != i26) {
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        i28 = i50;
                                        unsafe5 = unsafe3;
                                        i33 = i2;
                                        if (i53 == 2) {
                                            int i110 = zzqc.zza;
                                            zzth zzthVar5 = (zzth) zzsuVar;
                                            i27 = zzqc.zzi(bArr2, i28, zzqbVar);
                                            int i111 = zzqbVar.zza + i27;
                                            while (i27 < i111) {
                                                i27 = zzqc.zzl(bArr2, i27, zzqbVar);
                                                zzthVar5.zzg(zzqq.zzG(zzqbVar.zzb));
                                            }
                                            if (i27 != i111) {
                                                throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            if (i53 == 0) {
                                                int i112 = zzqc.zza;
                                                zzth zzthVar6 = (zzth) zzsuVar;
                                                i27 = zzqc.zzl(bArr2, i28, zzqbVar);
                                                zzthVar6.zzg(zzqq.zzG(zzqbVar.zzb));
                                                while (i27 < i33) {
                                                    int zzi15 = zzqc.zzi(bArr2, i27, zzqbVar);
                                                    if (i69 == zzqbVar.zza) {
                                                        i27 = zzqc.zzl(bArr2, zzi15, zzqbVar);
                                                        zzthVar6.zzg(zzqq.zzG(zzqbVar.zzb));
                                                    }
                                                }
                                            }
                                            i26 = i28;
                                            i23 = i52;
                                            i24 = i33;
                                            unsafe3 = unsafe5;
                                            zzqbVar5 = zzqbVar;
                                            i25 = i46;
                                            i27 = i26;
                                            if (i27 != i26) {
                                            }
                                        }
                                        i26 = i28;
                                        i23 = i52;
                                        i24 = i33;
                                        unsafe3 = unsafe5;
                                        zzqbVar5 = zzqbVar;
                                        i25 = i46;
                                        if (i27 != i26) {
                                        }
                                        break;
                                    default:
                                        if (i53 == 3) {
                                            int i113 = (i69 & (-8)) | 4;
                                            zzug zzx = zztvVar2.zzx(i46);
                                            i28 = i50;
                                            i27 = zzqc.zzc(zzx, bArr, i50, i2, i113, zzqbVar);
                                            zzsuVar.add(zzqbVar.zzc);
                                            int i114 = i2;
                                            while (i27 < i114) {
                                                int zzi16 = zzqc.zzi(bArr2, i27, zzqbVar);
                                                if (i69 == zzqbVar.zza) {
                                                    i27 = zzqc.zzc(zzx, bArr, zzi16, i2, i113, zzqbVar);
                                                    zzsuVar.add(zzqbVar.zzc);
                                                    i114 = i114;
                                                    unsafe3 = unsafe3;
                                                } else {
                                                    unsafe5 = unsafe3;
                                                    i33 = i114;
                                                    i26 = i28;
                                                    i23 = i52;
                                                    i24 = i33;
                                                    unsafe3 = unsafe5;
                                                    zzqbVar5 = zzqbVar;
                                                    i25 = i46;
                                                    if (i27 != i26) {
                                                    }
                                                }
                                            }
                                            unsafe5 = unsafe3;
                                            i33 = i114;
                                            i26 = i28;
                                            i23 = i52;
                                            i24 = i33;
                                            unsafe3 = unsafe5;
                                            zzqbVar5 = zzqbVar;
                                            i25 = i46;
                                            if (i27 != i26) {
                                            }
                                        } else {
                                            i26 = i50;
                                            i23 = i52;
                                            i24 = i2;
                                            zzqbVar5 = zzqbVar;
                                            i25 = i46;
                                            i27 = i26;
                                            if (i27 != i26) {
                                            }
                                        }
                                        break;
                                }
                            }
                        } else if (i53 == 2) {
                            zzsu zzsuVar2 = (zzsu) unsafe6.getObject(obj7, j2);
                            if (!zzsuVar2.zzc()) {
                                int size2 = zzsuVar2.size();
                                zzsuVar2 = zzsuVar2.zzd(size2 == 0 ? 10 : size2 + size2);
                                unsafe6.putObject(obj7, j2, zzsuVar2);
                            }
                            i44 = zzqc.zze(zztvVar2.zzx(i46), i55, bArr, i50, i2, zzsuVar2, zzqbVar);
                            i46 = i46;
                            unsafe6 = unsafe6;
                            i49 = i55;
                            i45 = i52;
                            i47 = i47;
                            i43 = -1;
                            i40 = i2;
                            i41 = i3;
                            zzqbVar6 = zzqbVar;
                            i42 = 3;
                        } else {
                            i18 = i47;
                            Unsafe unsafe10 = unsafe6;
                            zzqbVar4 = zzqbVar;
                            unsafe3 = unsafe10;
                            i19 = i50;
                            obj4 = obj7;
                            i20 = i52;
                            zztvVar = zztvVar2;
                            i21 = i55;
                            i22 = i46;
                        }
                        i4 = i3;
                        obj2 = obj4;
                        i46 = i22;
                        i7 = i19;
                        unsafe = unsafe3;
                        i47 = i18;
                        zzqb zzqbVar7 = zzqbVar4;
                        i9 = i20;
                        i8 = i21;
                        zzqbVar2 = zzqbVar7;
                    }
                }
                if (i8 != i4 || i4 == 0) {
                    if (zztvVar.zzh) {
                        zzry zzryVar = zzqbVar2.zzd;
                        int i115 = zzry.zzb;
                        int i116 = zzuc.zza;
                        if (zzryVar != zzry.zza) {
                            zzts zztsVar = zztvVar.zzg;
                            int i117 = zzqc.zza;
                            zzsm zza4 = zzryVar.zza(zztsVar, i9);
                            if (zza4 == null) {
                                i10 = i8;
                                zzh = zzqc.zzh(i8, bArr, i7, i2, zzd(obj), zzqbVar);
                            } else {
                                i10 = i8;
                                zzsk zzskVar = (zzsk) obj2;
                                zzskVar.zzi();
                                zzsd zzsdVar = zzskVar.zzb;
                                zzsl zzslVar = zza4.zza;
                                zzvg zzvgVar = zzslVar.zzb;
                                if (zzvgVar == zzvg.zzn) {
                                    zzqc.zzi(bArr2, i7, zzqbVar2);
                                    throw null;
                                }
                                switch (zzvgVar.ordinal()) {
                                    case 0:
                                        i11 = i7 + 8;
                                        obj8 = Double.valueOf(Double.longBitsToDouble(zzqc.zzp(bArr2, i7)));
                                        i7 = i11;
                                        obj3 = obj8;
                                        zzsdVar.zzi(zzslVar, obj3);
                                        zzh = i7;
                                        break;
                                    case 1:
                                        i11 = i7 + 4;
                                        obj8 = Float.valueOf(Float.intBitsToFloat(zzqc.zzb(bArr2, i7)));
                                        i7 = i11;
                                        obj3 = obj8;
                                        zzsdVar.zzi(zzslVar, obj3);
                                        zzh = i7;
                                        break;
                                    case 2:
                                    case 3:
                                        i7 = zzqc.zzl(bArr2, i7, zzqbVar2);
                                        obj8 = Long.valueOf(zzqbVar2.zzb);
                                        obj3 = obj8;
                                        zzsdVar.zzi(zzslVar, obj3);
                                        zzh = i7;
                                        break;
                                    case 4:
                                    case 12:
                                        i7 = zzqc.zzi(bArr2, i7, zzqbVar2);
                                        obj8 = Integer.valueOf(zzqbVar2.zza);
                                        obj3 = obj8;
                                        zzsdVar.zzi(zzslVar, obj3);
                                        zzh = i7;
                                        break;
                                    case 5:
                                    case 15:
                                        i11 = i7 + 8;
                                        obj8 = Long.valueOf(zzqc.zzp(bArr2, i7));
                                        i7 = i11;
                                        obj3 = obj8;
                                        zzsdVar.zzi(zzslVar, obj3);
                                        zzh = i7;
                                        break;
                                    case 6:
                                    case 14:
                                        i11 = i7 + 4;
                                        obj8 = Integer.valueOf(zzqc.zzb(bArr2, i7));
                                        i7 = i11;
                                        obj3 = obj8;
                                        zzsdVar.zzi(zzslVar, obj3);
                                        zzh = i7;
                                        break;
                                    case 7:
                                        i7 = zzqc.zzl(bArr2, i7, zzqbVar2);
                                        obj8 = Boolean.valueOf(zzqbVar2.zzb != 0);
                                        obj3 = obj8;
                                        zzsdVar.zzi(zzslVar, obj3);
                                        zzh = i7;
                                        break;
                                    case 8:
                                        i7 = zzqc.zzg(bArr2, i7, zzqbVar2);
                                        obj3 = zzqbVar2.zzc;
                                        zzsdVar.zzi(zzslVar, obj3);
                                        zzh = i7;
                                        break;
                                    case 9:
                                        throw null;
                                    case 10:
                                        throw null;
                                    case 11:
                                        i7 = zzqc.zza(bArr2, i7, zzqbVar2);
                                        obj3 = zzqbVar2.zzc;
                                        zzsdVar.zzi(zzslVar, obj3);
                                        zzh = i7;
                                        break;
                                    case 13:
                                        throw new IllegalStateException("Shouldn't reach here.");
                                    case 16:
                                        i7 = zzqc.zzi(bArr2, i7, zzqbVar2);
                                        obj8 = Integer.valueOf(zzqq.zzF(zzqbVar2.zza));
                                        obj3 = obj8;
                                        zzsdVar.zzi(zzslVar, obj3);
                                        zzh = i7;
                                        break;
                                    case 17:
                                        i7 = zzqc.zzl(bArr2, i7, zzqbVar2);
                                        obj8 = Long.valueOf(zzqq.zzG(zzqbVar2.zzb));
                                        obj3 = obj8;
                                        zzsdVar.zzi(zzslVar, obj3);
                                        zzh = i7;
                                        break;
                                    default:
                                        obj3 = obj8;
                                        zzsdVar.zzi(zzslVar, obj3);
                                        zzh = i7;
                                        break;
                                }
                            }
                            i40 = i2;
                            zzqbVar6 = zzqbVar2;
                            zztvVar2 = zztvVar;
                            i49 = i10;
                            i41 = i4;
                            obj7 = obj2;
                            i45 = i9;
                            i42 = 3;
                            i43 = -1;
                            i44 = zzh;
                            unsafe6 = unsafe;
                        }
                    }
                    i10 = i8;
                    zzh = zzqc.zzh(i10, bArr, i7, i2, zzd(obj), zzqbVar);
                    i40 = i2;
                    zzqbVar6 = zzqbVar2;
                    zztvVar2 = zztvVar;
                    i49 = i10;
                    i41 = i4;
                    obj7 = obj2;
                    i45 = i9;
                    i42 = 3;
                    i43 = -1;
                    i44 = zzh;
                    unsafe6 = unsafe;
                } else {
                    i44 = i7;
                    i6 = i8;
                    i5 = i48;
                }
            } else {
                i4 = i41;
                obj2 = obj7;
                unsafe = unsafe6;
                zztvVar = zztvVar2;
                i5 = i48;
                i6 = i49;
            }
        }
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
                            case 30:
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
                case 30:
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
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!zzR(obj2, i3, i)) {
                        break;
                    } else {
                        zzvc.zzs(obj, j, zzvc.zzf(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    }
                case 60:
                    zzF(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzR(obj2, i3, i)) {
                        break;
                    } else {
                        zzvc.zzs(obj, j, zzvc.zzf(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final void zzh(Object obj, zzuf zzufVar, zzry zzryVar) {
        Object valueOf;
        Object zze;
        zzryVar.getClass();
        zzD(obj);
        zzuv zzuvVar = this.zzm;
        Object obj2 = null;
        zzsd zzsdVar = null;
        while (true) {
            try {
                int zzc = zzufVar.zzc();
                int zzq = zzq(zzc);
                if (zzq >= 0) {
                    int zzu = zzu(zzq);
                    try {
                    } catch (zzsw unused) {
                        if (obj2 == null) {
                            obj2 = zzuvVar.zza(obj);
                        }
                        if (!zzuvVar.zzk(obj2, zzufVar, 0)) {
                            for (int i = this.zzk; i < this.zzl; i++) {
                                zzy(obj, this.zzj[i], obj2, zzuvVar, obj);
                            }
                        }
                    }
                    switch (zzt(zzu)) {
                        case 0:
                            zzvc.zzo(obj, zzu & 1048575, zzufVar.zza());
                            zzH(obj, zzq);
                        case 1:
                            zzvc.zzp(obj, zzu & 1048575, zzufVar.zzb());
                            zzH(obj, zzq);
                        case 2:
                            zzvc.zzr(obj, zzu & 1048575, zzufVar.zzl());
                            zzH(obj, zzq);
                        case 3:
                            zzvc.zzr(obj, zzu & 1048575, zzufVar.zzo());
                            zzH(obj, zzq);
                        case 4:
                            zzvc.zzq(obj, zzu & 1048575, zzufVar.zzg());
                            zzH(obj, zzq);
                        case 5:
                            zzvc.zzr(obj, zzu & 1048575, zzufVar.zzk());
                            zzH(obj, zzq);
                        case 6:
                            zzvc.zzq(obj, zzu & 1048575, zzufVar.zzf());
                            zzH(obj, zzq);
                        case 7:
                            zzvc.zzm(obj, zzu & 1048575, zzufVar.zzN());
                            zzH(obj, zzq);
                        case 8:
                            zzG(obj, zzu, zzufVar);
                            zzH(obj, zzq);
                        case 9:
                            zzts zztsVar = (zzts) zzA(obj, zzq);
                            zzufVar.zzu(zztsVar, zzx(zzq), zzryVar);
                            zzJ(obj, zzq, zztsVar);
                        case 10:
                            zzvc.zzs(obj, zzu & 1048575, zzufVar.zzp());
                            zzH(obj, zzq);
                        case 11:
                            zzvc.zzq(obj, zzu & 1048575, zzufVar.zzj());
                            zzH(obj, zzq);
                        case 12:
                            int zze2 = zzufVar.zze();
                            zzsr zzw = zzw(zzq);
                            if (zzw != null && !zzw.zza(zze2)) {
                                obj2 = zzui.zzo(obj, zzc, zze2, obj2, zzuvVar);
                            }
                            zzvc.zzq(obj, zzu & 1048575, zze2);
                            zzH(obj, zzq);
                            break;
                        case 13:
                            zzvc.zzq(obj, zzu & 1048575, zzufVar.zzh());
                            zzH(obj, zzq);
                        case 14:
                            zzvc.zzr(obj, zzu & 1048575, zzufVar.zzm());
                            zzH(obj, zzq);
                        case 15:
                            zzvc.zzq(obj, zzu & 1048575, zzufVar.zzi());
                            zzH(obj, zzq);
                        case 16:
                            zzvc.zzr(obj, zzu & 1048575, zzufVar.zzn());
                            zzH(obj, zzq);
                        case 17:
                            zzts zztsVar2 = (zzts) zzA(obj, zzq);
                            zzufVar.zzt(zztsVar2, zzx(zzq), zzryVar);
                            zzJ(obj, zzq, zztsVar2);
                        case 18:
                            zzufVar.zzx(zztf.zza(obj, zzu & 1048575));
                        case 19:
                            zzufVar.zzB(zztf.zza(obj, zzu & 1048575));
                        case 20:
                            zzufVar.zzE(zztf.zza(obj, zzu & 1048575));
                        case 21:
                            zzufVar.zzM(zztf.zza(obj, zzu & 1048575));
                        case 22:
                            zzufVar.zzD(zztf.zza(obj, zzu & 1048575));
                        case 23:
                            zzufVar.zzA(zztf.zza(obj, zzu & 1048575));
                        case 24:
                            zzufVar.zzz(zztf.zza(obj, zzu & 1048575));
                        case 25:
                            zzufVar.zzv(zztf.zza(obj, zzu & 1048575));
                        case 26:
                            if (zzM(zzu)) {
                                ((zzqr) zzufVar).zzK(zztf.zza(obj, zzu & 1048575), true);
                            } else {
                                ((zzqr) zzufVar).zzK(zztf.zza(obj, zzu & 1048575), false);
                            }
                        case 27:
                            zzufVar.zzF(zztf.zza(obj, zzu & 1048575), zzx(zzq), zzryVar);
                        case 28:
                            zzufVar.zzw(zztf.zza(obj, zzu & 1048575));
                        case 29:
                            zzufVar.zzL(zztf.zza(obj, zzu & 1048575));
                        case 30:
                            List zza2 = zztf.zza(obj, zzu & 1048575);
                            zzufVar.zzy(zza2);
                            obj2 = zzui.zzn(obj, zzc, zza2, zzw(zzq), obj2, zzuvVar);
                        case 31:
                            zzufVar.zzG(zztf.zza(obj, zzu & 1048575));
                        case 32:
                            zzufVar.zzH(zztf.zza(obj, zzu & 1048575));
                        case 33:
                            zzufVar.zzI(zztf.zza(obj, zzu & 1048575));
                        case 34:
                            zzufVar.zzJ(zztf.zza(obj, zzu & 1048575));
                        case 35:
                            zzufVar.zzx(zztf.zza(obj, zzu & 1048575));
                        case 36:
                            zzufVar.zzB(zztf.zza(obj, zzu & 1048575));
                        case 37:
                            zzufVar.zzE(zztf.zza(obj, zzu & 1048575));
                        case 38:
                            zzufVar.zzM(zztf.zza(obj, zzu & 1048575));
                        case 39:
                            zzufVar.zzD(zztf.zza(obj, zzu & 1048575));
                        case 40:
                            zzufVar.zzA(zztf.zza(obj, zzu & 1048575));
                        case 41:
                            zzufVar.zzz(zztf.zza(obj, zzu & 1048575));
                        case 42:
                            zzufVar.zzv(zztf.zza(obj, zzu & 1048575));
                        case 43:
                            zzufVar.zzL(zztf.zza(obj, zzu & 1048575));
                        case 44:
                            List zza3 = zztf.zza(obj, zzu & 1048575);
                            zzufVar.zzy(zza3);
                            obj2 = zzui.zzn(obj, zzc, zza3, zzw(zzq), obj2, zzuvVar);
                        case 45:
                            zzufVar.zzG(zztf.zza(obj, zzu & 1048575));
                        case 46:
                            zzufVar.zzH(zztf.zza(obj, zzu & 1048575));
                        case 47:
                            zzufVar.zzI(zztf.zza(obj, zzu & 1048575));
                        case 48:
                            zzufVar.zzJ(zztf.zza(obj, zzu & 1048575));
                        case 49:
                            zzufVar.zzC(zztf.zza(obj, zzu & 1048575), zzx(zzq), zzryVar);
                        case 50:
                            Object zzz = zzz(zzq);
                            long zzu2 = zzu(zzq) & 1048575;
                            Object zzf = zzvc.zzf(obj, zzu2);
                            if (zzf == null) {
                                zzf = zztm.zza().zzb();
                                zzvc.zzs(obj, zzu2, zzf);
                            } else if (zztn.zza(zzf)) {
                                Object zzb2 = zztm.zza().zzb();
                                zztn.zzb(zzb2, zzf);
                                zzvc.zzs(obj, zzu2, zzb2);
                                zzf = zzb2;
                            }
                            throw null;
                            break;
                        case 51:
                            zzvc.zzs(obj, zzu & 1048575, Double.valueOf(zzufVar.zza()));
                            zzI(obj, zzc, zzq);
                        case 52:
                            zzvc.zzs(obj, zzu & 1048575, Float.valueOf(zzufVar.zzb()));
                            zzI(obj, zzc, zzq);
                        case 53:
                            zzvc.zzs(obj, zzu & 1048575, Long.valueOf(zzufVar.zzl()));
                            zzI(obj, zzc, zzq);
                        case 54:
                            zzvc.zzs(obj, zzu & 1048575, Long.valueOf(zzufVar.zzo()));
                            zzI(obj, zzc, zzq);
                        case 55:
                            zzvc.zzs(obj, zzu & 1048575, Integer.valueOf(zzufVar.zzg()));
                            zzI(obj, zzc, zzq);
                        case 56:
                            zzvc.zzs(obj, zzu & 1048575, Long.valueOf(zzufVar.zzk()));
                            zzI(obj, zzc, zzq);
                        case 57:
                            zzvc.zzs(obj, zzu & 1048575, Integer.valueOf(zzufVar.zzf()));
                            zzI(obj, zzc, zzq);
                        case 58:
                            zzvc.zzs(obj, zzu & 1048575, Boolean.valueOf(zzufVar.zzN()));
                            zzI(obj, zzc, zzq);
                        case 59:
                            zzG(obj, zzu, zzufVar);
                            zzI(obj, zzc, zzq);
                        case 60:
                            zzts zztsVar3 = (zzts) zzB(obj, zzc, zzq);
                            zzufVar.zzu(zztsVar3, zzx(zzq), zzryVar);
                            zzK(obj, zzc, zzq, zztsVar3);
                        case 61:
                            zzvc.zzs(obj, zzu & 1048575, zzufVar.zzp());
                            zzI(obj, zzc, zzq);
                        case 62:
                            zzvc.zzs(obj, zzu & 1048575, Integer.valueOf(zzufVar.zzj()));
                            zzI(obj, zzc, zzq);
                        case 63:
                            int zze3 = zzufVar.zze();
                            zzsr zzw2 = zzw(zzq);
                            if (zzw2 != null && !zzw2.zza(zze3)) {
                                obj2 = zzui.zzo(obj, zzc, zze3, obj2, zzuvVar);
                            }
                            zzvc.zzs(obj, zzu & 1048575, Integer.valueOf(zze3));
                            zzI(obj, zzc, zzq);
                            break;
                        case 64:
                            zzvc.zzs(obj, zzu & 1048575, Integer.valueOf(zzufVar.zzh()));
                            zzI(obj, zzc, zzq);
                        case 65:
                            zzvc.zzs(obj, zzu & 1048575, Long.valueOf(zzufVar.zzm()));
                            zzI(obj, zzc, zzq);
                        case 66:
                            zzvc.zzs(obj, zzu & 1048575, Integer.valueOf(zzufVar.zzi()));
                            zzI(obj, zzc, zzq);
                        case 67:
                            zzvc.zzs(obj, zzu & 1048575, Long.valueOf(zzufVar.zzn()));
                            zzI(obj, zzc, zzq);
                        case 68:
                            zzts zztsVar4 = (zzts) zzB(obj, zzc, zzq);
                            zzufVar.zzt(zztsVar4, zzx(zzq), zzryVar);
                            zzK(obj, zzc, zzq, zztsVar4);
                        default:
                            if (obj2 == null) {
                                obj2 = zzuvVar.zza(obj);
                            }
                            if (!zzuvVar.zzk(obj2, zzufVar, 0)) {
                                for (int i2 = this.zzk; i2 < this.zzl; i2++) {
                                    zzy(obj, this.zzj[i2], obj2, zzuvVar, obj);
                                }
                                break;
                            }
                    }
                } else if (zzc == Integer.MAX_VALUE) {
                    for (int i3 = this.zzk; i3 < this.zzl; i3++) {
                        zzy(obj, this.zzj[i3], obj2, zzuvVar, obj);
                    }
                } else {
                    zzsm zza4 = !this.zzh ? null : zzryVar.zza(this.zzg, zzc);
                    if (zza4 != null) {
                        if (zzsdVar == null) {
                            zzsdVar = ((zzsk) obj).zzi();
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
                                break;
                            case 1:
                                valueOf = Float.valueOf(zzufVar.zzb());
                                break;
                            case 2:
                                valueOf = Long.valueOf(zzufVar.zzl());
                                break;
                            case 3:
                                valueOf = Long.valueOf(zzufVar.zzo());
                                break;
                            case 4:
                                valueOf = Integer.valueOf(zzufVar.zzg());
                                break;
                            case 5:
                                valueOf = Long.valueOf(zzufVar.zzk());
                                break;
                            case 6:
                                valueOf = Integer.valueOf(zzufVar.zzf());
                                break;
                            case 7:
                                valueOf = Boolean.valueOf(zzufVar.zzN());
                                break;
                            case 8:
                                valueOf = zzufVar.zzr();
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
                                continue;
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
                                continue;
                            case 11:
                                valueOf = zzufVar.zzp();
                                break;
                            case 12:
                                valueOf = Integer.valueOf(zzufVar.zzj());
                                break;
                            case 13:
                                throw new IllegalStateException("Shouldn't reach here.");
                            case 14:
                                valueOf = Integer.valueOf(zzufVar.zzh());
                                break;
                            case 15:
                                valueOf = Long.valueOf(zzufVar.zzm());
                                break;
                            case 16:
                                valueOf = Integer.valueOf(zzufVar.zzi());
                                break;
                            case 17:
                                valueOf = Long.valueOf(zzufVar.zzn());
                                break;
                            default:
                                valueOf = null;
                                break;
                        }
                        int ordinal = zzvgVar2.ordinal();
                        if ((ordinal == 9 || ordinal == 10) && (zze = zzsdVar.zze(zzslVar)) != null) {
                            byte[] bArr = zzsv.zzb;
                            valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                        }
                        zzsdVar.zzi(zzslVar, valueOf);
                    } else {
                        if (obj2 == null) {
                            obj2 = zzuvVar.zza(obj);
                        }
                        if (!zzuvVar.zzk(obj2, zzufVar, 0)) {
                            for (int i4 = this.zzk; i4 < this.zzl; i4++) {
                                zzy(obj, this.zzj[i4], obj2, zzuvVar, obj);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.zzk; i5 < this.zzl; i5++) {
                    zzy(obj, this.zzj[i5], obj2, zzuvVar, obj);
                }
                if (obj2 != null) {
                    zzuvVar.zzj(obj, obj2);
                }
                throw th;
            }
        }
        if (obj2 != null) {
            zzuvVar.zzj(obj, obj2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzqb zzqbVar) {
        zzc(obj, bArr, i, i2, 0, zzqbVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    @Override // com.google.android.recaptcha.internal.zzug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(Object obj, zzvi zzviVar) {
        Map.Entry entry;
        Iterator it;
        int[] iArr;
        int i;
        int i2;
        int i3;
        Map.Entry entry2;
        int i4;
        int i5;
        int i6;
        Map.Entry entry3;
        Iterator it2;
        int[] iArr2;
        int i7;
        int i8;
        if (this.zzh) {
            zzsd zzsdVar = ((zzsk) obj).zzb;
            if (!zzsdVar.zza.isEmpty()) {
                Iterator zzf = zzsdVar.zzf();
                entry = (Map.Entry) zzf.next();
                it = zzf;
                iArr = this.zzc;
                Unsafe unsafe = zzb;
                int i9 = 1048575;
                int i10 = 1048575;
                int i11 = 0;
                i = 0;
                while (i < iArr.length) {
                    int zzu = zzu(i);
                    int zzt = zzt(zzu);
                    int i12 = iArr[i];
                    if (zzt <= 17) {
                        int i13 = iArr[i + 2];
                        int i14 = i13 & i9;
                        if (i14 != i10) {
                            if (i14 == i9) {
                                i2 = i12;
                                i11 = 0;
                            } else {
                                i2 = i12;
                                i11 = unsafe.getInt(obj, i14);
                            }
                            i10 = i14;
                        } else {
                            i2 = i12;
                        }
                        int i15 = 1 << (i13 >>> 20);
                        entry2 = entry;
                        i4 = i11;
                        i5 = i15;
                        i3 = i10;
                    } else {
                        i2 = i12;
                        i3 = i10;
                        entry2 = entry;
                        i4 = i11;
                        i5 = 0;
                    }
                    while (true) {
                        if (entry2 != null) {
                            zzrz zzrzVar = this.zzn;
                            i6 = i2;
                            if (((zzsl) entry2.getKey()).zza <= i6) {
                                zzrzVar.zzb(zzviVar, entry2);
                                if (it.hasNext()) {
                                    entry2 = (Map.Entry) it.next();
                                    i2 = i6;
                                } else {
                                    i2 = i6;
                                    entry2 = null;
                                }
                            }
                        } else {
                            i6 = i2;
                        }
                    }
                    long j = zzu & 1048575;
                    switch (zzt) {
                        case 0:
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            int i16 = i6;
                            i8 = i;
                            if (zzO(obj, i8, i3, i7, i5)) {
                                zzviVar.zzf(i16, zzvc.zza(obj, j));
                            }
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 1:
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            int i17 = i6;
                            i8 = i;
                            if (zzO(obj, i8, i3, i7, i5)) {
                                zzviVar.zzo(i17, zzvc.zzb(obj, j));
                            }
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 2:
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            int i18 = i6;
                            i8 = i;
                            if (zzO(obj, i8, i3, i7, i5)) {
                                zzviVar.zzt(i18, unsafe.getLong(obj, j));
                            }
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 3:
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            int i19 = i6;
                            i8 = i;
                            if (zzO(obj, i8, i3, i7, i5)) {
                                zzviVar.zzK(i19, unsafe.getLong(obj, j));
                            }
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 4:
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            int i20 = i6;
                            i8 = i;
                            if (zzO(obj, i8, i3, i7, i5)) {
                                zzviVar.zzr(i20, unsafe.getInt(obj, j));
                            }
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 5:
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            int i21 = i6;
                            i8 = i;
                            if (zzO(obj, i8, i3, i7, i5)) {
                                zzviVar.zzm(i21, unsafe.getLong(obj, j));
                            }
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 6:
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            int i22 = i6;
                            i8 = i;
                            if (zzO(obj, i8, i3, i7, i5)) {
                                zzviVar.zzk(i22, unsafe.getInt(obj, j));
                            }
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 7:
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            int i23 = i6;
                            i8 = i;
                            if (zzO(obj, i8, i3, i7, i5)) {
                                zzviVar.zzb(i23, zzvc.zzw(obj, j));
                            }
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 8:
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            int i24 = i6;
                            i8 = i;
                            if (zzO(obj, i8, i3, i7, i5)) {
                                zzT(i24, unsafe.getObject(obj, j), zzviVar);
                            }
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 9:
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            int i25 = i6;
                            i8 = i;
                            if (zzO(obj, i8, i3, i7, i5)) {
                                zzviVar.zzv(i25, unsafe.getObject(obj, j), zzx(i8));
                            }
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 10:
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            int i26 = i6;
                            i8 = i;
                            if (zzO(obj, i8, i3, i7, i5)) {
                                zzviVar.zzd(i26, (zzqm) unsafe.getObject(obj, j));
                            }
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 11:
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            int i27 = i6;
                            i8 = i;
                            if (zzO(obj, i8, i3, i7, i5)) {
                                zzviVar.zzI(i27, unsafe.getInt(obj, j));
                            }
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 12:
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            int i28 = i6;
                            i8 = i;
                            if (zzO(obj, i8, i3, i7, i5)) {
                                zzviVar.zzi(i28, unsafe.getInt(obj, j));
                            }
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 13:
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            int i29 = i6;
                            i8 = i;
                            if (zzO(obj, i8, i3, i7, i5)) {
                                zzviVar.zzx(i29, unsafe.getInt(obj, j));
                            }
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 14:
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            int i30 = i6;
                            i8 = i;
                            if (zzO(obj, i8, i3, i7, i5)) {
                                zzviVar.zzz(i30, unsafe.getLong(obj, j));
                            }
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 15:
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            int i31 = i6;
                            i8 = i;
                            if (zzO(obj, i8, i3, i7, i5)) {
                                zzviVar.zzB(i31, unsafe.getInt(obj, j));
                            }
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 16:
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            int i32 = i6;
                            i8 = i;
                            if (zzO(obj, i8, i3, i7, i5)) {
                                zzviVar.zzD(i32, unsafe.getLong(obj, j));
                            }
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 17:
                            entry3 = entry2;
                            it2 = it;
                            int i33 = i6;
                            iArr2 = iArr;
                            int i34 = i4;
                            i7 = i4;
                            i8 = i;
                            if (zzO(obj, i, i3, i34, i5)) {
                                zzviVar.zzq(i33, unsafe.getObject(obj, j), zzx(i8));
                            }
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 18:
                            zzui.zzs(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 19:
                            zzui.zzw(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 20:
                            zzui.zzy(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 21:
                            zzui.zzE(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 22:
                            zzui.zzx(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 23:
                            zzui.zzv(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 24:
                            zzui.zzu(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 25:
                            zzui.zzr(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 26:
                            int i35 = iArr[i];
                            List list = (List) unsafe.getObject(obj, j);
                            int i36 = zzui.zza;
                            if (list != null && !list.isEmpty()) {
                                zzviVar.zzH(i35, list);
                            }
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                            break;
                        case 27:
                            int i37 = iArr[i];
                            List list2 = (List) unsafe.getObject(obj, j);
                            zzug zzx = zzx(i);
                            int i38 = zzui.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i39 = 0; i39 < list2.size(); i39++) {
                                    ((zzqw) zzviVar).zzv(i37, list2.get(i39), zzx);
                                }
                            }
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                            break;
                        case 28:
                            int i40 = iArr[i];
                            List list3 = (List) unsafe.getObject(obj, j);
                            int i41 = zzui.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzviVar.zze(i40, list3);
                            }
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                            break;
                        case 29:
                            zzui.zzD(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 30:
                            zzui.zzt(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 31:
                            zzui.zzz(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 32:
                            zzui.zzA(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 33:
                            zzui.zzB(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 34:
                            zzui.zzC(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 35:
                            zzui.zzs(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, true);
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 36:
                            zzui.zzw(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, true);
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 37:
                            zzui.zzy(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, true);
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 38:
                            zzui.zzE(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, true);
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 39:
                            zzui.zzx(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, true);
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 40:
                            zzui.zzv(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, true);
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 41:
                            zzui.zzu(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, true);
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 42:
                            zzui.zzr(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, true);
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 43:
                            zzui.zzD(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, true);
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 44:
                            zzui.zzt(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, true);
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 45:
                            zzui.zzz(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, true);
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 46:
                            zzui.zzA(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, true);
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 47:
                            zzui.zzB(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, true);
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 48:
                            zzui.zzC(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, true);
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 49:
                            int i42 = iArr[i];
                            List list4 = (List) unsafe.getObject(obj, j);
                            zzug zzx2 = zzx(i);
                            int i43 = zzui.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i44 = 0; i44 < list4.size(); i44++) {
                                    ((zzqw) zzviVar).zzq(i42, list4.get(i44), zzx2);
                                }
                            }
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j) != null) {
                                throw null;
                            }
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 51:
                            if (zzR(obj, i6, i)) {
                                zzviVar.zzf(i6, zzn(obj, j));
                            }
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 52:
                            if (zzR(obj, i6, i)) {
                                zzviVar.zzo(i6, zzo(obj, j));
                            }
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 53:
                            if (zzR(obj, i6, i)) {
                                zzviVar.zzt(i6, zzv(obj, j));
                            }
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 54:
                            if (zzR(obj, i6, i)) {
                                zzviVar.zzK(i6, zzv(obj, j));
                            }
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 55:
                            if (zzR(obj, i6, i)) {
                                zzviVar.zzr(i6, zzp(obj, j));
                            }
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 56:
                            if (zzR(obj, i6, i)) {
                                zzviVar.zzm(i6, zzv(obj, j));
                            }
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 57:
                            if (zzR(obj, i6, i)) {
                                zzviVar.zzk(i6, zzp(obj, j));
                            }
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 58:
                            if (zzR(obj, i6, i)) {
                                zzviVar.zzb(i6, zzS(obj, j));
                            }
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 59:
                            if (zzR(obj, i6, i)) {
                                zzT(i6, unsafe.getObject(obj, j), zzviVar);
                            }
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 60:
                            if (zzR(obj, i6, i)) {
                                zzviVar.zzv(i6, unsafe.getObject(obj, j), zzx(i));
                            }
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 61:
                            if (zzR(obj, i6, i)) {
                                zzviVar.zzd(i6, (zzqm) unsafe.getObject(obj, j));
                            }
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 62:
                            if (zzR(obj, i6, i)) {
                                zzviVar.zzI(i6, zzp(obj, j));
                            }
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 63:
                            if (zzR(obj, i6, i)) {
                                zzviVar.zzi(i6, zzp(obj, j));
                            }
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 64:
                            if (zzR(obj, i6, i)) {
                                zzviVar.zzx(i6, zzp(obj, j));
                            }
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 65:
                            if (zzR(obj, i6, i)) {
                                zzviVar.zzz(i6, zzv(obj, j));
                            }
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 66:
                            if (zzR(obj, i6, i)) {
                                zzviVar.zzB(i6, zzp(obj, j));
                            }
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 67:
                            if (zzR(obj, i6, i)) {
                                zzviVar.zzD(i6, zzv(obj, j));
                            }
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        case 68:
                            if (zzR(obj, i6, i)) {
                                zzviVar.zzq(i6, unsafe.getObject(obj, j), zzx(i));
                            }
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                        default:
                            entry3 = entry2;
                            it2 = it;
                            iArr2 = iArr;
                            i7 = i4;
                            i8 = i;
                            i = i8 + 3;
                            i10 = i3;
                            it = it2;
                            entry = entry3;
                            iArr = iArr2;
                            i11 = i7;
                            i9 = 1048575;
                    }
                }
                Iterator it3 = it;
                while (entry != null) {
                    this.zzn.zzb(zzviVar, entry);
                    entry = it3.hasNext() ? (Map.Entry) it3.next() : null;
                }
                ((zzsn) obj).zzc.zzl(zzviVar);
            }
        }
        entry = null;
        it = null;
        iArr = this.zzc;
        Unsafe unsafe2 = zzb;
        int i92 = 1048575;
        int i102 = 1048575;
        int i112 = 0;
        i = 0;
        while (i < iArr.length) {
        }
        Iterator it32 = it;
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
                case 30:
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
                case 65:
                case 66:
                case 67:
                case 68:
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
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i5];
            int i7 = iArr2[i6];
            int zzu = zzu(i6);
            int i8 = iArr2[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & zzu) != 0 && !zzO(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt == 60 || zzt == 68) {
                        if (zzR(obj, i7, i6) && !zzP(obj, zzu, zzx(i6))) {
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
                    zzug zzx = zzx(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzx.zzl(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzO(obj, i6, i, i2, i10) && !zzP(obj, zzu, zzx(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.zzh || ((zzsk) obj).zzb.zzk();
    }
}
