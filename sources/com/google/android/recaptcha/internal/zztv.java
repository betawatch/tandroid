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

    /* JADX WARN: Removed duplicated region for block: B:105:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zztv zzm(Class cls, zztp zztpVar, zzty zztyVar, zztf zztfVar, zzuv zzuvVar, zzrz zzrzVar, zztn zztnVar) {
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
        String str;
        int objectFieldOffset;
        int i21;
        int i22;
        int i23;
        Field zzC;
        char charAt10;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Object obj;
        Field zzC2;
        Object obj2;
        Field zzC3;
        int i29;
        char charAt11;
        int i30;
        char charAt12;
        int i31;
        char charAt13;
        int i32;
        char charAt14;
        if (!(zztpVar instanceof zzue)) {
            throw null;
        }
        zzue zzueVar = (zzue) zztpVar;
        String zzd = zzueVar.zzd();
        int length = zzd.length();
        char charAt15 = zzd.charAt(0);
        char c = CharacterCompat.MIN_HIGH_SURROGATE;
        if (charAt15 >= 55296) {
            int i33 = 1;
            while (true) {
                i = i33 + 1;
                if (zzd.charAt(i33) < 55296) {
                    break;
                }
                i33 = i;
            }
        } else {
            i = 1;
        }
        int i34 = i + 1;
        int charAt16 = zzd.charAt(i);
        if (charAt16 >= 55296) {
            int i35 = charAt16 & 8191;
            int i36 = 13;
            while (true) {
                i32 = i34 + 1;
                charAt14 = zzd.charAt(i34);
                if (charAt14 < 55296) {
                    break;
                }
                i35 |= (charAt14 & 8191) << i36;
                i36 += 13;
                i34 = i32;
            }
            charAt16 = i35 | (charAt14 << i36);
            i34 = i32;
        }
        if (charAt16 == 0) {
            iArr = zza;
            i7 = 0;
            i3 = 0;
            i6 = 0;
            charAt = 0;
            i2 = 0;
            i4 = 0;
            i5 = 0;
        } else {
            int i37 = i34 + 1;
            int charAt17 = zzd.charAt(i34);
            if (charAt17 >= 55296) {
                int i38 = charAt17 & 8191;
                int i39 = 13;
                while (true) {
                    i15 = i37 + 1;
                    charAt9 = zzd.charAt(i37);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i38 |= (charAt9 & 8191) << i39;
                    i39 += 13;
                    i37 = i15;
                }
                charAt17 = i38 | (charAt9 << i39);
                i37 = i15;
            }
            int i40 = i37 + 1;
            int charAt18 = zzd.charAt(i37);
            if (charAt18 >= 55296) {
                int i41 = charAt18 & 8191;
                int i42 = 13;
                while (true) {
                    i14 = i40 + 1;
                    charAt8 = zzd.charAt(i40);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i41 |= (charAt8 & 8191) << i42;
                    i42 += 13;
                    i40 = i14;
                }
                charAt18 = i41 | (charAt8 << i42);
                i40 = i14;
            }
            int i43 = i40 + 1;
            int charAt19 = zzd.charAt(i40);
            if (charAt19 >= 55296) {
                int i44 = charAt19 & 8191;
                int i45 = 13;
                while (true) {
                    i13 = i43 + 1;
                    charAt7 = zzd.charAt(i43);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i44 |= (charAt7 & 8191) << i45;
                    i45 += 13;
                    i43 = i13;
                }
                charAt19 = i44 | (charAt7 << i45);
                i43 = i13;
            }
            int i46 = i43 + 1;
            int charAt20 = zzd.charAt(i43);
            if (charAt20 >= 55296) {
                int i47 = charAt20 & 8191;
                int i48 = 13;
                while (true) {
                    i12 = i46 + 1;
                    charAt6 = zzd.charAt(i46);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i47 |= (charAt6 & 8191) << i48;
                    i48 += 13;
                    i46 = i12;
                }
                charAt20 = i47 | (charAt6 << i48);
                i46 = i12;
            }
            int i49 = i46 + 1;
            charAt = zzd.charAt(i46);
            if (charAt >= 55296) {
                int i50 = charAt & 8191;
                int i51 = 13;
                while (true) {
                    i11 = i49 + 1;
                    charAt5 = zzd.charAt(i49);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i50 |= (charAt5 & 8191) << i51;
                    i51 += 13;
                    i49 = i11;
                }
                charAt = i50 | (charAt5 << i51);
                i49 = i11;
            }
            int i52 = i49 + 1;
            int charAt21 = zzd.charAt(i49);
            if (charAt21 >= 55296) {
                int i53 = charAt21 & 8191;
                int i54 = 13;
                while (true) {
                    i10 = i52 + 1;
                    charAt4 = zzd.charAt(i52);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i53 |= (charAt4 & 8191) << i54;
                    i54 += 13;
                    i52 = i10;
                }
                charAt21 = i53 | (charAt4 << i54);
                i52 = i10;
            }
            int i55 = i52 + 1;
            int charAt22 = zzd.charAt(i52);
            if (charAt22 >= 55296) {
                int i56 = charAt22 & 8191;
                int i57 = 13;
                while (true) {
                    i9 = i55 + 1;
                    charAt3 = zzd.charAt(i55);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i56 |= (charAt3 & 8191) << i57;
                    i57 += 13;
                    i55 = i9;
                }
                charAt22 = i56 | (charAt3 << i57);
                i55 = i9;
            }
            int i58 = i55 + 1;
            int charAt23 = zzd.charAt(i55);
            if (charAt23 >= 55296) {
                int i59 = charAt23 & 8191;
                int i60 = 13;
                while (true) {
                    i8 = i58 + 1;
                    charAt2 = zzd.charAt(i58);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i59 |= (charAt2 & 8191) << i60;
                    i60 += 13;
                    i58 = i8;
                }
                charAt23 = i59 | (charAt2 << i60);
                i58 = i8;
            }
            int i61 = charAt17 + charAt17 + charAt18;
            int[] iArr2 = new int[charAt23 + charAt21 + charAt22];
            int i62 = charAt21;
            i2 = charAt19;
            i3 = i62;
            i4 = charAt20;
            i5 = charAt23;
            i6 = i61;
            iArr = iArr2;
            i7 = charAt17;
            i34 = i58;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzueVar.zze();
        Class<?> cls2 = zzueVar.zza().getClass();
        int i63 = i5 + i3;
        int i64 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i64];
        int i65 = i5;
        int i66 = i63;
        int i67 = 0;
        int i68 = 0;
        while (i34 < length) {
            int i69 = i34 + 1;
            int charAt24 = zzd.charAt(i34);
            if (charAt24 >= c) {
                int i70 = charAt24 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i31 = i71 + 1;
                    charAt13 = zzd.charAt(i71);
                    if (charAt13 < c) {
                        break;
                    }
                    i70 |= (charAt13 & 8191) << i72;
                    i72 += 13;
                    i71 = i31;
                }
                charAt24 = i70 | (charAt13 << i72);
                i16 = i31;
            } else {
                i16 = i69;
            }
            int i73 = i16 + 1;
            int charAt25 = zzd.charAt(i16);
            if (charAt25 >= c) {
                int i74 = charAt25 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i30 = i75 + 1;
                    charAt12 = zzd.charAt(i75);
                    if (charAt12 < c) {
                        break;
                    }
                    i74 |= (charAt12 & 8191) << i76;
                    i76 += 13;
                    i75 = i30;
                }
                charAt25 = i74 | (charAt12 << i76);
                i17 = i30;
            } else {
                i17 = i73;
            }
            if ((charAt25 & 1024) != 0) {
                iArr[i67] = i68;
                i67++;
            }
            int i77 = charAt25 & NotificationCenter.didReceiveSmsCode;
            zzue zzueVar2 = zzueVar;
            int i78 = charAt25 & 2048;
            if (i77 >= 51) {
                int i79 = i17 + 1;
                int charAt26 = zzd.charAt(i17);
                char c2 = CharacterCompat.MIN_HIGH_SURROGATE;
                if (charAt26 >= 55296) {
                    int i80 = charAt26 & 8191;
                    int i81 = i79;
                    int i82 = 13;
                    while (true) {
                        i29 = i81 + 1;
                        charAt11 = zzd.charAt(i81);
                        if (charAt11 < c2) {
                            break;
                        }
                        i80 |= (charAt11 & 8191) << i82;
                        i82 += 13;
                        i81 = i29;
                        c2 = CharacterCompat.MIN_HIGH_SURROGATE;
                    }
                    charAt26 = i80 | (charAt11 << i82);
                    i26 = i29;
                } else {
                    i26 = i79;
                }
                int i83 = i26;
                int i84 = i77 - 51;
                i18 = length;
                if (i84 == 9 || i84 == 17) {
                    i27 = i6 + 1;
                    int i85 = i68 / 3;
                    objArr[i85 + i85 + 1] = zze[i6];
                } else {
                    if (i84 == 12) {
                        if (zzueVar2.zzc() == 1 || i78 != 0) {
                            i27 = i6 + 1;
                            int i86 = i68 / 3;
                            objArr[i86 + i86 + 1] = zze[i6];
                        } else {
                            i28 = 0;
                            int i87 = charAt26 + charAt26;
                            obj = zze[i87];
                            i78 = i28;
                            if (obj instanceof Field) {
                                zzC2 = (Field) obj;
                            } else {
                                zzC2 = zzC(cls2, (String) obj);
                                zze[i87] = zzC2;
                            }
                            int i88 = i7;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC2);
                            int i89 = i87 + 1;
                            obj2 = zze[i89];
                            i19 = i88;
                            if (obj2 instanceof Field) {
                                zzC3 = (Field) obj2;
                            } else {
                                zzC3 = zzC(cls2, (String) obj2);
                                zze[i89] = zzC3;
                            }
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzC3);
                            str = zzd;
                            i17 = i83;
                            i22 = 0;
                            i21 = objectFieldOffset2;
                        }
                    }
                    i28 = i78;
                    int i872 = charAt26 + charAt26;
                    obj = zze[i872];
                    i78 = i28;
                    if (obj instanceof Field) {
                    }
                    int i882 = i7;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzC2);
                    int i892 = i872 + 1;
                    obj2 = zze[i892];
                    i19 = i882;
                    if (obj2 instanceof Field) {
                    }
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzC3);
                    str = zzd;
                    i17 = i83;
                    i22 = 0;
                    i21 = objectFieldOffset22;
                }
                i6 = i27;
                i28 = i78;
                int i8722 = charAt26 + charAt26;
                obj = zze[i8722];
                i78 = i28;
                if (obj instanceof Field) {
                }
                int i8822 = i7;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzC2);
                int i8922 = i8722 + 1;
                obj2 = zze[i8922];
                i19 = i8822;
                if (obj2 instanceof Field) {
                }
                int objectFieldOffset222 = (int) unsafe.objectFieldOffset(zzC3);
                str = zzd;
                i17 = i83;
                i22 = 0;
                i21 = objectFieldOffset222;
            } else {
                i18 = length;
                i19 = i7;
                int i90 = i6 + 1;
                Field zzC4 = zzC(cls2, (String) zze[i6]);
                if (i77 == 9 || i77 == 17) {
                    i20 = i90;
                    int i91 = i68 / 3;
                    objArr[i91 + i91 + 1] = zzC4.getType();
                } else {
                    if (i77 == 27) {
                        i24 = i90;
                        i25 = 1;
                        i6 += 2;
                    } else if (i77 == 49) {
                        i6 += 2;
                        i24 = i90;
                        i25 = 1;
                    } else if (i77 == 12 || i77 == 30 || i77 == 44) {
                        if (zzueVar2.zzc() == 1 || i78 != 0) {
                            i6 += 2;
                            int i92 = i68 / 3;
                            objArr[i92 + i92 + 1] = zze[i90];
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                            i21 = 1048575;
                            if ((charAt25 & 4096) != 0 || i77 > 17) {
                                i22 = 0;
                            } else {
                                int i93 = i17 + 1;
                                int charAt27 = str.charAt(i17);
                                if (charAt27 >= 55296) {
                                    int i94 = charAt27 & 8191;
                                    int i95 = 13;
                                    while (true) {
                                        i23 = i93 + 1;
                                        charAt10 = str.charAt(i93);
                                        if (charAt10 < 55296) {
                                            break;
                                        }
                                        i94 |= (charAt10 & 8191) << i95;
                                        i95 += 13;
                                        i93 = i23;
                                    }
                                    charAt27 = i94 | (charAt10 << i95);
                                } else {
                                    i23 = i93;
                                }
                                int i96 = i19 + i19 + (charAt27 / 32);
                                Object obj3 = zze[i96];
                                if (obj3 instanceof Field) {
                                    zzC = (Field) obj3;
                                } else {
                                    zzC = zzC(cls2, (String) obj3);
                                    zze[i96] = zzC;
                                }
                                int i97 = charAt27;
                                i21 = (int) unsafe.objectFieldOffset(zzC);
                                i17 = i23;
                                i22 = i97 % 32;
                            }
                            if (i77 >= 18 && i77 <= 49) {
                                iArr[i66] = objectFieldOffset;
                                i66++;
                            }
                        } else {
                            str = zzd;
                            i6 = i90;
                            i78 = 0;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                            i21 = 1048575;
                            if ((charAt25 & 4096) != 0) {
                            }
                            i22 = 0;
                            if (i77 >= 18) {
                                iArr[i66] = objectFieldOffset;
                                i66++;
                            }
                        }
                    } else if (i77 == 50) {
                        int i98 = i6 + 2;
                        int i99 = i65 + 1;
                        iArr[i65] = i68;
                        int i100 = i68 / 3;
                        int i101 = i100 + i100;
                        objArr[i101] = zze[i90];
                        if (i78 != 0) {
                            objArr[i101 + 1] = zze[i98];
                            i6 += 3;
                            str = zzd;
                            i65 = i99;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                            i21 = 1048575;
                            if ((charAt25 & 4096) != 0) {
                            }
                            i22 = 0;
                            if (i77 >= 18) {
                            }
                        } else {
                            i6 = i98;
                            i65 = i99;
                            i78 = 0;
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                            i21 = 1048575;
                            if ((charAt25 & 4096) != 0) {
                            }
                            i22 = 0;
                            if (i77 >= 18) {
                            }
                        }
                    } else {
                        i20 = i90;
                    }
                    int i102 = i68 / 3;
                    objArr[i102 + i102 + i25] = zze[i24];
                    str = zzd;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                    i21 = 1048575;
                    if ((charAt25 & 4096) != 0) {
                    }
                    i22 = 0;
                    if (i77 >= 18) {
                    }
                }
                str = zzd;
                i6 = i20;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                i21 = 1048575;
                if ((charAt25 & 4096) != 0) {
                }
                i22 = 0;
                if (i77 >= 18) {
                }
            }
            int i103 = i78;
            int i104 = i68 + 1;
            iArr3[i68] = charAt24;
            int i105 = i68 + 2;
            iArr3[i104] = ((charAt25 & 512) != 0 ? TLObject.FLAG_29 : 0) | ((charAt25 & 256) != 0 ? TLObject.FLAG_28 : 0) | (i103 != 0 ? TLObject.FLAG_31 : 0) | (i77 << 20) | objectFieldOffset;
            i68 += 3;
            iArr3[i105] = (i22 << 20) | i21;
            i34 = i17;
            zzd = str;
            zzueVar = zzueVar2;
            length = i18;
            i7 = i19;
            c = CharacterCompat.MIN_HIGH_SURROGATE;
        }
        return new zztv(iArr3, objArr, i2, i4, zzueVar.zza(), false, iArr, i5, i63, zztyVar, zztfVar, zzuvVar, zzrzVar, zztnVar);
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.recaptcha.internal.zzug
    public final int zza(Object obj) {
        int i;
        int zzA;
        int zzA2;
        int zzB;
        int zzA3;
        int zzA4;
        int zzA5;
        int zzd;
        int zzA6;
        int zzh;
        int zzg;
        int size;
        int zzl;
        int zzA7;
        int zzA8;
        int zzA9;
        int zze;
        int zzA10;
        int zzA11;
        int i2;
        int zzA12;
        int zzA13;
        int zzA14;
        int zzB2;
        int zzA15;
        int zzA16;
        int zzd2;
        int zzA17;
        zztv<T> zztvVar = this;
        Object obj2 = obj;
        int i3 = 1;
        Unsafe unsafe = zzb;
        int i4 = 0;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr = zztvVar.zzc;
            if (i4 >= iArr.length) {
                int zza2 = i7 + ((zzsn) obj).zzc.zza();
                if (!zztvVar.zzh) {
                    return zza2;
                }
                zzuo zzuoVar = ((zzsk) obj).zzb.zza;
                int zzc = zzuoVar.zzc();
                int i8 = 0;
                for (int i9 = 0; i9 < zzc; i9++) {
                    Map.Entry zzg2 = zzuoVar.zzg(i9);
                    i8 += zzsd.zza((zzsc) ((zzuk) zzg2).zza(), zzg2.getValue());
                }
                for (Map.Entry entry : zzuoVar.zzd()) {
                    i8 += zzsd.zza((zzsc) entry.getKey(), entry.getValue());
                }
                return zza2 + i8;
            }
            int zzu = zztvVar.zzu(i4);
            int zzt = zzt(zzu);
            int i10 = iArr[i4];
            int i11 = iArr[i4 + 2];
            int i12 = i11 & 1048575;
            if (zzt <= 17) {
                if (i12 != i5) {
                    i6 = i12 == 1048575 ? 0 : unsafe.getInt(obj2, i12);
                    i5 = i12;
                }
                i = i3 << (i11 >>> 20);
            } else {
                i = 0;
            }
            int i13 = zzu & 1048575;
            if (zzt >= zzse.zzJ.zza()) {
                zzse.zzW.zza();
            }
            long j = i13;
            switch (zzt) {
                case 0:
                    if (zztvVar.zzO(obj2, i4, i5, i6, i)) {
                        i7 += zzqv.zzA(i10 << 3) + 8;
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 1:
                    if (zztvVar.zzO(obj2, i4, i5, i6, i)) {
                        zzA = zzqv.zzA(i10 << 3);
                        zzA4 = zzA + 4;
                        i7 += zzA4;
                    }
                    zztvVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 2:
                    if (zztvVar.zzO(obj2, i4, i5, i6, i)) {
                        long j2 = unsafe.getLong(obj2, j);
                        zzA2 = zzqv.zzA(i10 << 3);
                        zzB = zzqv.zzB(j2);
                        zzA4 = zzA2 + zzB;
                        i7 += zzA4;
                    }
                    zztvVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 3:
                    if (zztvVar.zzO(obj2, i4, i5, i6, i)) {
                        long j3 = unsafe.getLong(obj2, j);
                        zzA2 = zzqv.zzA(i10 << 3);
                        zzB = zzqv.zzB(j3);
                        zzA4 = zzA2 + zzB;
                        i7 += zzA4;
                    }
                    zztvVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 4:
                    if (zztvVar.zzO(obj2, i4, i5, i6, i)) {
                        long j4 = unsafe.getInt(obj2, j);
                        zzA2 = zzqv.zzA(i10 << 3);
                        zzB = zzqv.zzB(j4);
                        zzA4 = zzA2 + zzB;
                        i7 += zzA4;
                    }
                    zztvVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 5:
                    if (zztvVar.zzO(obj2, i4, i5, i6, i)) {
                        zzA3 = zzqv.zzA(i10 << 3);
                        zzA4 = zzA3 + 8;
                        i7 += zzA4;
                    }
                    zztvVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 6:
                    if (zztvVar.zzO(obj2, i4, i5, i6, i)) {
                        zzA = zzqv.zzA(i10 << 3);
                        zzA4 = zzA + 4;
                        i7 += zzA4;
                    }
                    zztvVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 7:
                    if (zztvVar.zzO(obj2, i4, i5, i6, i)) {
                        zzA4 = zzqv.zzA(i10 << 3) + 1;
                        i7 += zzA4;
                    }
                    zztvVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 8:
                    if (zztvVar.zzO(obj2, i4, i5, i6, i)) {
                        int i14 = i10 << 3;
                        Object object = unsafe.getObject(obj2, j);
                        if (object instanceof zzqm) {
                            zzA5 = zzqv.zzA(i14);
                            zzd = ((zzqm) object).zzd();
                            zzA6 = zzqv.zzA(zzd);
                            zzA4 = zzA5 + zzA6 + zzd;
                            i7 += zzA4;
                        } else {
                            zzA2 = zzqv.zzA(i14);
                            zzB = zzqv.zzz((String) object);
                            zzA4 = zzA2 + zzB;
                            i7 += zzA4;
                        }
                    }
                    zztvVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 9:
                    if (zztvVar.zzO(obj2, i4, i5, i6, i)) {
                        zzh = zzui.zzh(i10, unsafe.getObject(obj2, j), zztvVar.zzx(i4));
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    }
                case 10:
                    if (zztvVar.zzO(obj2, i4, i5, i6, i)) {
                        zzqm zzqmVar = (zzqm) unsafe.getObject(obj2, j);
                        zzA5 = zzqv.zzA(i10 << 3);
                        zzd = zzqmVar.zzd();
                        zzA6 = zzqv.zzA(zzd);
                        zzA4 = zzA5 + zzA6 + zzd;
                        i7 += zzA4;
                    }
                    zztvVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 11:
                    if (zztvVar.zzO(obj2, i4, i5, i6, i)) {
                        int i15 = unsafe.getInt(obj2, j);
                        zzA2 = zzqv.zzA(i10 << 3);
                        zzB = zzqv.zzA(i15);
                        zzA4 = zzA2 + zzB;
                        i7 += zzA4;
                    }
                    zztvVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 12:
                    if (zztvVar.zzO(obj2, i4, i5, i6, i)) {
                        long j5 = unsafe.getInt(obj2, j);
                        zzA2 = zzqv.zzA(i10 << 3);
                        zzB = zzqv.zzB(j5);
                        zzA4 = zzA2 + zzB;
                        i7 += zzA4;
                    }
                    zztvVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 13:
                    if (zztvVar.zzO(obj2, i4, i5, i6, i)) {
                        zzA = zzqv.zzA(i10 << 3);
                        zzA4 = zzA + 4;
                        i7 += zzA4;
                    }
                    zztvVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 14:
                    if (zztvVar.zzO(obj2, i4, i5, i6, i)) {
                        zzA3 = zzqv.zzA(i10 << 3);
                        zzA4 = zzA3 + 8;
                        i7 += zzA4;
                    }
                    zztvVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 15:
                    if (zztvVar.zzO(obj2, i4, i5, i6, i)) {
                        int i16 = unsafe.getInt(obj2, j);
                        zzA2 = zzqv.zzA(i10 << 3);
                        zzB = zzqv.zzA((i16 >> 31) ^ (i16 + i16));
                        zzA4 = zzA2 + zzB;
                        i7 += zzA4;
                    }
                    zztvVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 16:
                    if (zztvVar.zzO(obj2, i4, i5, i6, i)) {
                        long j6 = unsafe.getLong(obj2, j);
                        zzA2 = zzqv.zzA(i10 << 3);
                        zzB = zzqv.zzB((j6 >> 63) ^ (j6 + j6));
                        zzA4 = zzA2 + zzB;
                        i7 += zzA4;
                    }
                    zztvVar = this;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 17:
                    if (zztvVar.zzO(obj2, i4, i5, i6, i)) {
                        zzh = zzqv.zzw(i10, (zzts) unsafe.getObject(obj2, j), zztvVar.zzx(i4));
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    }
                case 18:
                    zzh = zzui.zzd(i10, (List) unsafe.getObject(obj2, j), false);
                    i7 += zzh;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 19:
                    zzh = zzui.zzb(i10, (List) unsafe.getObject(obj2, j), false);
                    i7 += zzh;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j);
                    int i17 = zzui.zza;
                    if (list.size() != 0) {
                        zzg = zzui.zzg(list) + (list.size() * zzqv.zzA(i10 << 3));
                        i7 += zzg;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    }
                    zzg = 0;
                    i7 += zzg;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j);
                    int i18 = zzui.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zzui.zzl(list2);
                        zzA7 = zzqv.zzA(i10 << 3);
                        zzh = zzl + (size * zzA7);
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    }
                    zzh = 0;
                    i7 += zzh;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j);
                    int i19 = zzui.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zzui.zzf(list3);
                        zzA7 = zzqv.zzA(i10 << 3);
                        zzh = zzl + (size * zzA7);
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    }
                    zzh = 0;
                    i7 += zzh;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 23:
                    zzh = zzui.zzd(i10, (List) unsafe.getObject(obj2, j), false);
                    i7 += zzh;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 24:
                    zzh = zzui.zzb(i10, (List) unsafe.getObject(obj2, j), false);
                    i7 += zzh;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j);
                    int i20 = zzui.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzh = size2 * (zzqv.zzA(i10 << 3) + 1);
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    }
                    zzh = 0;
                    i7 += zzh;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j);
                    int i21 = zzui.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzg = zzqv.zzA(i10 << 3) * size3;
                        if (list5 instanceof zzte) {
                            zzte zzteVar = (zzte) list5;
                            for (int i22 = 0; i22 < size3; i22++) {
                                Object zzc2 = zzteVar.zzc();
                                if (zzc2 instanceof zzqm) {
                                    int zzd3 = ((zzqm) zzc2).zzd();
                                    zzg += zzqv.zzA(zzd3) + zzd3;
                                } else {
                                    zzg += zzqv.zzz((String) zzc2);
                                }
                            }
                        } else {
                            for (int i23 = 0; i23 < size3; i23++) {
                                Object obj3 = list5.get(i23);
                                if (obj3 instanceof zzqm) {
                                    int zzd4 = ((zzqm) obj3).zzd();
                                    zzg += zzqv.zzA(zzd4) + zzd4;
                                } else {
                                    zzg += zzqv.zzz((String) obj3);
                                }
                            }
                        }
                        i7 += zzg;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    }
                    zzg = 0;
                    i7 += zzg;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j);
                    zzug zzx = zztvVar.zzx(i4);
                    int i24 = zzui.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzA8 = 0;
                    } else {
                        zzA8 = zzqv.zzA(i10 << 3) * size4;
                        for (int i25 = 0; i25 < size4; i25++) {
                            Object obj4 = list6.get(i25);
                            if (obj4 instanceof zztd) {
                                int zza3 = ((zztd) obj4).zza();
                                zzA8 += zzqv.zzA(zza3) + zza3;
                            } else {
                                zzA8 += zzqv.zzy((zzts) obj4, zzx);
                            }
                        }
                    }
                    i7 += zzA8;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j);
                    int i26 = zzui.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        zzA9 = 0;
                    } else {
                        zzA9 = size5 * zzqv.zzA(i10 << 3);
                        for (int i27 = 0; i27 < list7.size(); i27++) {
                            int zzd5 = ((zzqm) list7.get(i27)).zzd();
                            zzA9 += zzqv.zzA(zzd5) + zzd5;
                        }
                    }
                    i7 += zzA9;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j);
                    int i28 = zzui.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzl = zzui.zzk(list8);
                        zzA7 = zzqv.zzA(i10 << 3);
                        zzh = zzl + (size * zzA7);
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    }
                    zzh = 0;
                    i7 += zzh;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j);
                    int i29 = zzui.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzl = zzui.zza(list9);
                        zzA7 = zzqv.zzA(i10 << 3);
                        zzh = zzl + (size * zzA7);
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    }
                    zzh = 0;
                    i7 += zzh;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 31:
                    zzh = zzui.zzb(i10, (List) unsafe.getObject(obj2, j), false);
                    i7 += zzh;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 32:
                    zzh = zzui.zzd(i10, (List) unsafe.getObject(obj2, j), false);
                    i7 += zzh;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j);
                    int i30 = zzui.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzl = zzui.zzi(list10);
                        zzA7 = zzqv.zzA(i10 << 3);
                        zzh = zzl + (size * zzA7);
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    }
                    zzh = 0;
                    i7 += zzh;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j);
                    int i31 = zzui.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzl = zzui.zzj(list11);
                        zzA7 = zzqv.zzA(i10 << 3);
                        zzh = zzl + (size * zzA7);
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    }
                    zzh = 0;
                    i7 += zzh;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 35:
                    zze = zzui.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzqv.zzA(i10 << 3);
                        zzA11 = zzqv.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i7 += zzA9;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    }
                case 36:
                    zze = zzui.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzqv.zzA(i10 << 3);
                        zzA11 = zzqv.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i7 += zzA9;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    }
                case 37:
                    zze = zzui.zzg((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzqv.zzA(i10 << 3);
                        zzA11 = zzqv.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i7 += zzA9;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    }
                case 38:
                    zze = zzui.zzl((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzqv.zzA(i10 << 3);
                        zzA11 = zzqv.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i7 += zzA9;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    }
                case 39:
                    zze = zzui.zzf((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzqv.zzA(i10 << 3);
                        zzA11 = zzqv.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i7 += zzA9;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    }
                case 40:
                    zze = zzui.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzqv.zzA(i10 << 3);
                        zzA11 = zzqv.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i7 += zzA9;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    }
                case 41:
                    zze = zzui.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzqv.zzA(i10 << 3);
                        zzA11 = zzqv.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i7 += zzA9;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    }
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j);
                    int i32 = zzui.zza;
                    zze = list12.size();
                    if (zze > 0) {
                        zzA10 = zzqv.zzA(i10 << 3);
                        zzA11 = zzqv.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i7 += zzA9;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    }
                case 43:
                    zze = zzui.zzk((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzqv.zzA(i10 << 3);
                        zzA11 = zzqv.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i7 += zzA9;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    }
                case 44:
                    zze = zzui.zza((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzqv.zzA(i10 << 3);
                        zzA11 = zzqv.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i7 += zzA9;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    }
                case 45:
                    zze = zzui.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzqv.zzA(i10 << 3);
                        zzA11 = zzqv.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i7 += zzA9;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    }
                case 46:
                    zze = zzui.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzqv.zzA(i10 << 3);
                        zzA11 = zzqv.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i7 += zzA9;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    }
                case 47:
                    zze = zzui.zzi((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzqv.zzA(i10 << 3);
                        zzA11 = zzqv.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i7 += zzA9;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    }
                case 48:
                    zze = zzui.zzj((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzqv.zzA(i10 << 3);
                        zzA11 = zzqv.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i7 += zzA9;
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                        i3 = 1;
                    }
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j);
                    zzug zzx2 = zztvVar.zzx(i4);
                    int i33 = zzui.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                        for (int i34 = 0; i34 < size6; i34++) {
                            i2 += zzqv.zzw(i10, (zzts) list13.get(i34), zzx2);
                        }
                    }
                    i7 += i2;
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 50:
                    zztm zztmVar = (zztm) unsafe.getObject(obj2, j);
                    if (!zztmVar.isEmpty()) {
                        Iterator it = zztmVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            entry2.getKey();
                            entry2.getValue();
                            throw null;
                        }
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 51:
                    if (zztvVar.zzR(obj2, i10, i4)) {
                        zzA12 = zzqv.zzA(i10 << 3);
                        zzA15 = zzA12 + 8;
                        i7 += zzA15;
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 52:
                    if (zztvVar.zzR(obj2, i10, i4)) {
                        zzA13 = zzqv.zzA(i10 << 3);
                        zzA15 = zzA13 + 4;
                        i7 += zzA15;
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 53:
                    if (zztvVar.zzR(obj2, i10, i4)) {
                        long zzv = zzv(obj2, j);
                        zzA14 = zzqv.zzA(i10 << 3);
                        zzB2 = zzqv.zzB(zzv);
                        zzA15 = zzA14 + zzB2;
                        i7 += zzA15;
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 54:
                    if (zztvVar.zzR(obj2, i10, i4)) {
                        long zzv2 = zzv(obj2, j);
                        zzA14 = zzqv.zzA(i10 << 3);
                        zzB2 = zzqv.zzB(zzv2);
                        zzA15 = zzA14 + zzB2;
                        i7 += zzA15;
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 55:
                    if (zztvVar.zzR(obj2, i10, i4)) {
                        long zzp = zzp(obj2, j);
                        zzA14 = zzqv.zzA(i10 << 3);
                        zzB2 = zzqv.zzB(zzp);
                        zzA15 = zzA14 + zzB2;
                        i7 += zzA15;
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 56:
                    if (zztvVar.zzR(obj2, i10, i4)) {
                        zzA12 = zzqv.zzA(i10 << 3);
                        zzA15 = zzA12 + 8;
                        i7 += zzA15;
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 57:
                    if (zztvVar.zzR(obj2, i10, i4)) {
                        zzA13 = zzqv.zzA(i10 << 3);
                        zzA15 = zzA13 + 4;
                        i7 += zzA15;
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 58:
                    if (zztvVar.zzR(obj2, i10, i4)) {
                        zzA15 = zzqv.zzA(i10 << 3) + i3;
                        i7 += zzA15;
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 59:
                    if (zztvVar.zzR(obj2, i10, i4)) {
                        int i35 = i10 << 3;
                        Object object2 = unsafe.getObject(obj2, j);
                        if (object2 instanceof zzqm) {
                            zzA16 = zzqv.zzA(i35);
                            zzd2 = ((zzqm) object2).zzd();
                            zzA17 = zzqv.zzA(zzd2);
                            zzA15 = zzA16 + zzA17 + zzd2;
                            i7 += zzA15;
                        } else {
                            zzA14 = zzqv.zzA(i35);
                            zzB2 = zzqv.zzz((String) object2);
                            zzA15 = zzA14 + zzB2;
                            i7 += zzA15;
                        }
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 60:
                    if (zztvVar.zzR(obj2, i10, i4)) {
                        zzA15 = zzui.zzh(i10, unsafe.getObject(obj2, j), zztvVar.zzx(i4));
                        i7 += zzA15;
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 61:
                    if (zztvVar.zzR(obj2, i10, i4)) {
                        zzqm zzqmVar2 = (zzqm) unsafe.getObject(obj2, j);
                        zzA16 = zzqv.zzA(i10 << 3);
                        zzd2 = zzqmVar2.zzd();
                        zzA17 = zzqv.zzA(zzd2);
                        zzA15 = zzA16 + zzA17 + zzd2;
                        i7 += zzA15;
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 62:
                    if (zztvVar.zzR(obj2, i10, i4)) {
                        int zzp2 = zzp(obj2, j);
                        zzA14 = zzqv.zzA(i10 << 3);
                        zzB2 = zzqv.zzA(zzp2);
                        zzA15 = zzA14 + zzB2;
                        i7 += zzA15;
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 63:
                    if (zztvVar.zzR(obj2, i10, i4)) {
                        long zzp3 = zzp(obj2, j);
                        zzA14 = zzqv.zzA(i10 << 3);
                        zzB2 = zzqv.zzB(zzp3);
                        zzA15 = zzA14 + zzB2;
                        i7 += zzA15;
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 64:
                    if (zztvVar.zzR(obj2, i10, i4)) {
                        zzA13 = zzqv.zzA(i10 << 3);
                        zzA15 = zzA13 + 4;
                        i7 += zzA15;
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 65:
                    if (zztvVar.zzR(obj2, i10, i4)) {
                        zzA12 = zzqv.zzA(i10 << 3);
                        zzA15 = zzA12 + 8;
                        i7 += zzA15;
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 66:
                    if (zztvVar.zzR(obj2, i10, i4)) {
                        int zzp4 = zzp(obj2, j);
                        zzA14 = zzqv.zzA(i10 << 3);
                        zzB2 = zzqv.zzA((zzp4 >> 31) ^ (zzp4 + zzp4));
                        zzA15 = zzA14 + zzB2;
                        i7 += zzA15;
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 67:
                    if (zztvVar.zzR(obj2, i10, i4)) {
                        long zzv3 = zzv(obj2, j);
                        zzA14 = zzqv.zzA(i10 << 3);
                        zzB2 = zzqv.zzB((zzv3 >> 63) ^ (zzv3 + zzv3));
                        zzA15 = zzA14 + zzB2;
                        i7 += zzA15;
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                case 68:
                    if (zztvVar.zzR(obj2, i10, i4)) {
                        zzA15 = zzqv.zzw(i10, (zzts) unsafe.getObject(obj2, j), zztvVar.zzx(i4));
                        i7 += zzA15;
                    }
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
                default:
                    i4 += 3;
                    obj2 = obj;
                    i3 = 1;
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

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0cd0, code lost:
    
        r1 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0e1b, code lost:
    
        if (r14 == 1048575) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0e1d, code lost:
    
        r12.putInt(r13, r14, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0e21, code lost:
    
        r8 = r0.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0e26, code lost:
    
        if (r8 >= r0.zzl) goto L662;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0e28, code lost:
    
        r0.zzy(r13, r0.zzj[r8], null, r0.zzm, r34);
        r8 = r8 + 1;
        r0 = r33;
        r13 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0e40, code lost:
    
        if (r11 != 0) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0e42, code lost:
    
        if (r7 != r6) goto L557;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0e4a, code lost:
    
        throw new com.google.android.recaptcha.internal.zzsx("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0e4f, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0e4b, code lost:
    
        if (r7 > r6) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0e4d, code lost:
    
        if (r10 != r11) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0e55, code lost:
    
        throw new com.google.android.recaptcha.internal.zzsx("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0a44 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0a5a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0ccb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0cb0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0cc2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0cdb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzqb zzqbVar) {
        int i4;
        Unsafe unsafe;
        int i5;
        int i6;
        Object obj2;
        int i7;
        int zzq;
        zzqb zzqbVar2;
        Throwable th;
        int i8;
        byte[] bArr2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Object valueOf;
        int i15;
        zzqb zzqbVar3;
        Unsafe unsafe2;
        Object obj3;
        int i16;
        int i17;
        byte[] bArr3;
        int i18;
        Unsafe unsafe3;
        Object obj4;
        zzqb zzqbVar4;
        int i19;
        int i20;
        int zza2;
        int i21;
        Unsafe unsafe4;
        int i22;
        Unsafe unsafe5;
        int zzg;
        int i23;
        Unsafe unsafe6;
        int i24;
        zzqb zzqbVar5;
        int i25;
        Object obj5;
        Unsafe unsafe7;
        int i26;
        int i27;
        int zzi;
        int i28;
        int zzn;
        long j;
        int i29;
        Unsafe unsafe8;
        int i30;
        int i31;
        int zzi2;
        byte[] bArr4;
        int i32;
        Unsafe unsafe9;
        int i33;
        int i34;
        zzqb zzqbVar6;
        int i35;
        Unsafe unsafe10;
        int i36;
        zzqb zzqbVar7;
        int zzi3;
        int zzi4;
        Unsafe unsafe11;
        int i37;
        int i38;
        int i39;
        int i40;
        zzsu zzsuVar;
        byte[] bArr5;
        zzqb zzqbVar8;
        int i41;
        byte[] bArr6;
        int i42;
        Unsafe unsafe12;
        int zzi5;
        zztv<T> zztvVar = this;
        Object obj6 = obj;
        byte[] bArr7 = bArr;
        int i43 = i2;
        zzqb zzqbVar9 = zzqbVar;
        int i44 = 3;
        zzD(obj6);
        Unsafe unsafe13 = zzb;
        int i45 = -1;
        int i46 = i;
        int i47 = -1;
        int i48 = 0;
        int i49 = 0;
        int i50 = 1048575;
        int i51 = 1;
        int i52 = 0;
        while (true) {
            if (i46 < i43) {
                int i53 = i46 + 1;
                int i54 = bArr7[i46];
                if (i54 < 0) {
                    i53 = zzqc.zzj(i54, bArr7, i53, zzqbVar9);
                    i54 = zzqbVar9.zza;
                }
                i52 = i54;
                int i55 = i52 >>> 3;
                if (i55 > i47) {
                    zzq = (i55 < zztvVar.zze || i55 > zztvVar.zzf) ? -1 : zztvVar.zzs(i55, i48 / i44);
                } else {
                    zzq = zztvVar.zzq(i55);
                }
                if (zzq == i45) {
                    unsafe = unsafe13;
                    zzqbVar2 = zzqbVar9;
                    i47 = i55;
                    i6 = i49;
                    i7 = i52;
                    th = null;
                    i8 = 0;
                    obj2 = obj6;
                    bArr2 = bArr7;
                    i9 = i53;
                } else {
                    th = null;
                    int i56 = i52 & 7;
                    int[] iArr = zztvVar.zzc;
                    int i57 = iArr[zzq + 1];
                    int zzt = zzt(i57);
                    long j2 = i57 & 1048575;
                    if (zzt <= 17) {
                        int i58 = iArr[zzq + 2];
                        int i59 = i51 << (i58 >>> 20);
                        int i60 = i58 & 1048575;
                        if (i60 != i50) {
                            int i61 = 1048575;
                            i15 = zzq;
                            if (i50 != 1048575) {
                                unsafe13.putInt(obj6, i50, i49);
                                i61 = 1048575;
                            }
                            i50 = i60;
                            i49 = i60 == i61 ? 0 : unsafe13.getInt(obj6, i60);
                        } else {
                            i15 = zzq;
                        }
                        switch (zzt) {
                            case 0:
                                bArr2 = bArr;
                                zzqbVar4 = zzqbVar;
                                unsafe4 = unsafe13;
                                obj4 = obj6;
                                i16 = i53;
                                i17 = i15;
                                i6 = i49;
                                i18 = i50;
                                if (i56 != 1) {
                                    obj2 = obj4;
                                    unsafe = unsafe4;
                                    zzqbVar2 = zzqbVar4;
                                    i8 = i17;
                                    i7 = i52;
                                    i50 = i18;
                                    i47 = i55;
                                    i4 = i3;
                                    i9 = i16;
                                    if (i7 != i4 && i4 != 0) {
                                        i5 = i2;
                                        i46 = i9;
                                        break;
                                    } else {
                                        if (zztvVar.zzh) {
                                            zzry zzryVar = zzqbVar2.zzd;
                                            int i62 = zzry.zzb;
                                            int i63 = zzuc.zza;
                                            if (zzryVar != zzry.zza) {
                                                zzts zztsVar = zztvVar.zzg;
                                                int i64 = zzqc.zza;
                                                zzsm zza3 = zzryVar.zza(zztsVar, i47);
                                                if (zza3 == null) {
                                                    zzqb zzqbVar10 = zzqbVar2;
                                                    i11 = i7;
                                                    int zzh = zzqc.zzh(i11, bArr2, i9, i2, zzd(obj2), zzqbVar10);
                                                    i13 = i2;
                                                    i46 = zzh;
                                                    i10 = i47;
                                                    i12 = i8;
                                                    bArr7 = bArr;
                                                    i52 = i11;
                                                    i43 = i13;
                                                    i48 = i12;
                                                    unsafe13 = unsafe;
                                                    obj6 = obj2;
                                                    i49 = i6;
                                                    i47 = i10;
                                                    i44 = 3;
                                                    i45 = -1;
                                                    i51 = 1;
                                                    zzqbVar9 = zzqbVar;
                                                    break;
                                                } else {
                                                    zzqb zzqbVar11 = zzqbVar2;
                                                    i11 = i7;
                                                    zzsk zzskVar = (zzsk) obj2;
                                                    zzskVar.zzi();
                                                    zzsd zzsdVar = zzskVar.zzb;
                                                    zzsl zzslVar = zza3.zza;
                                                    zzvg zzvgVar = zzslVar.zzb;
                                                    if (zzvgVar == zzvg.zzn) {
                                                        zzqc.zzi(bArr2, i9, zzqbVar11);
                                                        throw th;
                                                    }
                                                    switch (zzvgVar.ordinal()) {
                                                        case 0:
                                                            i10 = i47;
                                                            i12 = i8;
                                                            i14 = i9 + 8;
                                                            valueOf = Double.valueOf(Double.longBitsToDouble(zzqc.zzp(bArr2, i9)));
                                                            i9 = i14;
                                                            zzsdVar.zzi(zzslVar, valueOf);
                                                            i13 = i2;
                                                            i46 = i9;
                                                            bArr7 = bArr;
                                                            i52 = i11;
                                                            i43 = i13;
                                                            i48 = i12;
                                                            unsafe13 = unsafe;
                                                            obj6 = obj2;
                                                            i49 = i6;
                                                            i47 = i10;
                                                            i44 = 3;
                                                            i45 = -1;
                                                            i51 = 1;
                                                            zzqbVar9 = zzqbVar;
                                                            break;
                                                        case 1:
                                                            i10 = i47;
                                                            i12 = i8;
                                                            i14 = i9 + 4;
                                                            valueOf = Float.valueOf(Float.intBitsToFloat(zzqc.zzb(bArr2, i9)));
                                                            i9 = i14;
                                                            zzsdVar.zzi(zzslVar, valueOf);
                                                            i13 = i2;
                                                            i46 = i9;
                                                            bArr7 = bArr;
                                                            i52 = i11;
                                                            i43 = i13;
                                                            i48 = i12;
                                                            unsafe13 = unsafe;
                                                            obj6 = obj2;
                                                            i49 = i6;
                                                            i47 = i10;
                                                            i44 = 3;
                                                            i45 = -1;
                                                            i51 = 1;
                                                            zzqbVar9 = zzqbVar;
                                                            break;
                                                        case 2:
                                                        case 3:
                                                            i10 = i47;
                                                            i12 = i8;
                                                            i9 = zzqc.zzl(bArr2, i9, zzqbVar11);
                                                            valueOf = Long.valueOf(zzqbVar11.zzb);
                                                            zzsdVar.zzi(zzslVar, valueOf);
                                                            i13 = i2;
                                                            i46 = i9;
                                                            bArr7 = bArr;
                                                            i52 = i11;
                                                            i43 = i13;
                                                            i48 = i12;
                                                            unsafe13 = unsafe;
                                                            obj6 = obj2;
                                                            i49 = i6;
                                                            i47 = i10;
                                                            i44 = 3;
                                                            i45 = -1;
                                                            i51 = 1;
                                                            zzqbVar9 = zzqbVar;
                                                            break;
                                                        case 4:
                                                        case 12:
                                                            i10 = i47;
                                                            i12 = i8;
                                                            i9 = zzqc.zzi(bArr2, i9, zzqbVar11);
                                                            valueOf = Integer.valueOf(zzqbVar11.zza);
                                                            zzsdVar.zzi(zzslVar, valueOf);
                                                            i13 = i2;
                                                            i46 = i9;
                                                            bArr7 = bArr;
                                                            i52 = i11;
                                                            i43 = i13;
                                                            i48 = i12;
                                                            unsafe13 = unsafe;
                                                            obj6 = obj2;
                                                            i49 = i6;
                                                            i47 = i10;
                                                            i44 = 3;
                                                            i45 = -1;
                                                            i51 = 1;
                                                            zzqbVar9 = zzqbVar;
                                                            break;
                                                        case 5:
                                                        case 15:
                                                            i10 = i47;
                                                            i12 = i8;
                                                            i14 = i9 + 8;
                                                            valueOf = Long.valueOf(zzqc.zzp(bArr2, i9));
                                                            i9 = i14;
                                                            zzsdVar.zzi(zzslVar, valueOf);
                                                            i13 = i2;
                                                            i46 = i9;
                                                            bArr7 = bArr;
                                                            i52 = i11;
                                                            i43 = i13;
                                                            i48 = i12;
                                                            unsafe13 = unsafe;
                                                            obj6 = obj2;
                                                            i49 = i6;
                                                            i47 = i10;
                                                            i44 = 3;
                                                            i45 = -1;
                                                            i51 = 1;
                                                            zzqbVar9 = zzqbVar;
                                                            break;
                                                        case 6:
                                                        case 14:
                                                            i10 = i47;
                                                            i12 = i8;
                                                            i14 = i9 + 4;
                                                            valueOf = Integer.valueOf(zzqc.zzb(bArr2, i9));
                                                            i9 = i14;
                                                            zzsdVar.zzi(zzslVar, valueOf);
                                                            i13 = i2;
                                                            i46 = i9;
                                                            bArr7 = bArr;
                                                            i52 = i11;
                                                            i43 = i13;
                                                            i48 = i12;
                                                            unsafe13 = unsafe;
                                                            obj6 = obj2;
                                                            i49 = i6;
                                                            i47 = i10;
                                                            i44 = 3;
                                                            i45 = -1;
                                                            i51 = 1;
                                                            zzqbVar9 = zzqbVar;
                                                            break;
                                                        case 7:
                                                            i10 = i47;
                                                            i12 = i8;
                                                            i9 = zzqc.zzl(bArr2, i9, zzqbVar11);
                                                            valueOf = Boolean.valueOf(zzqbVar11.zzb != 0);
                                                            zzsdVar.zzi(zzslVar, valueOf);
                                                            i13 = i2;
                                                            i46 = i9;
                                                            bArr7 = bArr;
                                                            i52 = i11;
                                                            i43 = i13;
                                                            i48 = i12;
                                                            unsafe13 = unsafe;
                                                            obj6 = obj2;
                                                            i49 = i6;
                                                            i47 = i10;
                                                            i44 = 3;
                                                            i45 = -1;
                                                            i51 = 1;
                                                            zzqbVar9 = zzqbVar;
                                                            break;
                                                        case 8:
                                                            i10 = i47;
                                                            i12 = i8;
                                                            i9 = zzqc.zzg(bArr2, i9, zzqbVar11);
                                                            valueOf = zzqbVar11.zzc;
                                                            zzsdVar.zzi(zzslVar, valueOf);
                                                            i13 = i2;
                                                            i46 = i9;
                                                            bArr7 = bArr;
                                                            i52 = i11;
                                                            i43 = i13;
                                                            i48 = i12;
                                                            unsafe13 = unsafe;
                                                            obj6 = obj2;
                                                            i49 = i6;
                                                            i47 = i10;
                                                            i44 = 3;
                                                            i45 = -1;
                                                            i51 = 1;
                                                            zzqbVar9 = zzqbVar;
                                                            break;
                                                        case 9:
                                                            throw th;
                                                        case 10:
                                                            throw th;
                                                        case 11:
                                                            i10 = i47;
                                                            i12 = i8;
                                                            i9 = zzqc.zza(bArr2, i9, zzqbVar11);
                                                            valueOf = zzqbVar11.zzc;
                                                            zzsdVar.zzi(zzslVar, valueOf);
                                                            i13 = i2;
                                                            i46 = i9;
                                                            bArr7 = bArr;
                                                            i52 = i11;
                                                            i43 = i13;
                                                            i48 = i12;
                                                            unsafe13 = unsafe;
                                                            obj6 = obj2;
                                                            i49 = i6;
                                                            i47 = i10;
                                                            i44 = 3;
                                                            i45 = -1;
                                                            i51 = 1;
                                                            zzqbVar9 = zzqbVar;
                                                            break;
                                                        case 13:
                                                            throw new IllegalStateException("Shouldn't reach here.");
                                                        case 16:
                                                            i10 = i47;
                                                            i12 = i8;
                                                            i9 = zzqc.zzi(bArr2, i9, zzqbVar11);
                                                            valueOf = Integer.valueOf(zzqq.zzF(zzqbVar11.zza));
                                                            zzsdVar.zzi(zzslVar, valueOf);
                                                            i13 = i2;
                                                            i46 = i9;
                                                            bArr7 = bArr;
                                                            i52 = i11;
                                                            i43 = i13;
                                                            i48 = i12;
                                                            unsafe13 = unsafe;
                                                            obj6 = obj2;
                                                            i49 = i6;
                                                            i47 = i10;
                                                            i44 = 3;
                                                            i45 = -1;
                                                            i51 = 1;
                                                            zzqbVar9 = zzqbVar;
                                                            break;
                                                        case 17:
                                                            i9 = zzqc.zzl(bArr2, i9, zzqbVar11);
                                                            i10 = i47;
                                                            i12 = i8;
                                                            valueOf = Long.valueOf(zzqq.zzG(zzqbVar11.zzb));
                                                            zzsdVar.zzi(zzslVar, valueOf);
                                                            i13 = i2;
                                                            i46 = i9;
                                                            bArr7 = bArr;
                                                            i52 = i11;
                                                            i43 = i13;
                                                            i48 = i12;
                                                            unsafe13 = unsafe;
                                                            obj6 = obj2;
                                                            i49 = i6;
                                                            i47 = i10;
                                                            i44 = 3;
                                                            i45 = -1;
                                                            i51 = 1;
                                                            zzqbVar9 = zzqbVar;
                                                            break;
                                                        default:
                                                            i10 = i47;
                                                            i12 = i8;
                                                            valueOf = th;
                                                            zzsdVar.zzi(zzslVar, valueOf);
                                                            i13 = i2;
                                                            i46 = i9;
                                                            bArr7 = bArr;
                                                            i52 = i11;
                                                            i43 = i13;
                                                            i48 = i12;
                                                            unsafe13 = unsafe;
                                                            obj6 = obj2;
                                                            i49 = i6;
                                                            i47 = i10;
                                                            i44 = 3;
                                                            i45 = -1;
                                                            i51 = 1;
                                                            zzqbVar9 = zzqbVar;
                                                            break;
                                                    }
                                                }
                                            }
                                        }
                                        zzqb zzqbVar12 = zzqbVar2;
                                        i10 = i47;
                                        i11 = i7;
                                        i12 = i8;
                                        i9 = zzqc.zzh(i11, bArr2, i9, i2, zzd(obj2), zzqbVar12);
                                        i13 = i2;
                                        i46 = i9;
                                        bArr7 = bArr;
                                        i52 = i11;
                                        i43 = i13;
                                        i48 = i12;
                                        unsafe13 = unsafe;
                                        obj6 = obj2;
                                        i49 = i6;
                                        i47 = i10;
                                        i44 = 3;
                                        i45 = -1;
                                        i51 = 1;
                                        zzqbVar9 = zzqbVar;
                                    }
                                } else {
                                    i22 = i16 + 8;
                                    i49 = i6 | i59;
                                    zzvc.zzo(obj4, j2, Double.longBitsToDouble(zzqc.zzp(bArr2, i16)));
                                    i43 = i2;
                                    obj6 = obj4;
                                    unsafe13 = unsafe4;
                                    bArr7 = bArr2;
                                    i48 = i17;
                                    i50 = i18;
                                    i44 = 3;
                                    i45 = -1;
                                    i51 = 1;
                                    i46 = i22;
                                    zzqbVar9 = zzqbVar4;
                                    i47 = i55;
                                    break;
                                }
                            case 1:
                                bArr2 = bArr;
                                zzqbVar4 = zzqbVar;
                                unsafe4 = unsafe13;
                                obj4 = obj6;
                                i16 = i53;
                                i17 = i15;
                                i6 = i49;
                                i18 = i50;
                                if (i56 != 5) {
                                    obj2 = obj4;
                                    unsafe = unsafe4;
                                    zzqbVar2 = zzqbVar4;
                                    i8 = i17;
                                    i7 = i52;
                                    i50 = i18;
                                    i47 = i55;
                                    i4 = i3;
                                    i9 = i16;
                                    if (i7 != i4) {
                                    }
                                    if (zztvVar.zzh) {
                                    }
                                    zzqb zzqbVar122 = zzqbVar2;
                                    i10 = i47;
                                    i11 = i7;
                                    i12 = i8;
                                    i9 = zzqc.zzh(i11, bArr2, i9, i2, zzd(obj2), zzqbVar122);
                                    i13 = i2;
                                    i46 = i9;
                                    bArr7 = bArr;
                                    i52 = i11;
                                    i43 = i13;
                                    i48 = i12;
                                    unsafe13 = unsafe;
                                    obj6 = obj2;
                                    i49 = i6;
                                    i47 = i10;
                                    i44 = 3;
                                    i45 = -1;
                                    i51 = 1;
                                    zzqbVar9 = zzqbVar;
                                    break;
                                } else {
                                    i22 = i16 + 4;
                                    i49 = i6 | i59;
                                    zzvc.zzp(obj4, j2, Float.intBitsToFloat(zzqc.zzb(bArr2, i16)));
                                    i43 = i2;
                                    obj6 = obj4;
                                    unsafe13 = unsafe4;
                                    bArr7 = bArr2;
                                    i48 = i17;
                                    i50 = i18;
                                    i44 = 3;
                                    i45 = -1;
                                    i51 = 1;
                                    i46 = i22;
                                    zzqbVar9 = zzqbVar4;
                                    i47 = i55;
                                    break;
                                }
                                break;
                            case 2:
                            case 3:
                                bArr2 = bArr;
                                zzqbVar4 = zzqbVar;
                                unsafe5 = unsafe13;
                                obj4 = obj6;
                                i16 = i53;
                                i17 = i15;
                                i6 = i49;
                                i18 = i50;
                                if (i56 != 0) {
                                    unsafe4 = unsafe5;
                                    obj2 = obj4;
                                    unsafe = unsafe4;
                                    zzqbVar2 = zzqbVar4;
                                    i8 = i17;
                                    i7 = i52;
                                    i50 = i18;
                                    i47 = i55;
                                    i4 = i3;
                                    i9 = i16;
                                    if (i7 != i4) {
                                    }
                                    if (zztvVar.zzh) {
                                    }
                                    zzqb zzqbVar1222 = zzqbVar2;
                                    i10 = i47;
                                    i11 = i7;
                                    i12 = i8;
                                    i9 = zzqc.zzh(i11, bArr2, i9, i2, zzd(obj2), zzqbVar1222);
                                    i13 = i2;
                                    i46 = i9;
                                    bArr7 = bArr;
                                    i52 = i11;
                                    i43 = i13;
                                    i48 = i12;
                                    unsafe13 = unsafe;
                                    obj6 = obj2;
                                    i49 = i6;
                                    i47 = i10;
                                    i44 = 3;
                                    i45 = -1;
                                    i51 = 1;
                                    zzqbVar9 = zzqbVar;
                                    break;
                                } else {
                                    i49 = i6 | i59;
                                    int zzl = zzqc.zzl(bArr2, i16, zzqbVar4);
                                    obj6 = obj4;
                                    unsafe13 = unsafe5;
                                    unsafe13.putLong(obj6, j2, zzqbVar4.zzb);
                                    i43 = i2;
                                    bArr7 = bArr2;
                                    zzqbVar9 = zzqbVar4;
                                    i46 = zzl;
                                    i48 = i17;
                                    i50 = i18;
                                    i47 = i55;
                                    i44 = 3;
                                    i45 = -1;
                                    i51 = 1;
                                    break;
                                }
                                break;
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                zzqbVar4 = zzqbVar;
                                unsafe5 = unsafe13;
                                obj4 = obj6;
                                i16 = i53;
                                i17 = i15;
                                i6 = i49;
                                i18 = i50;
                                if (i56 != 0) {
                                    unsafe4 = unsafe5;
                                    obj2 = obj4;
                                    unsafe = unsafe4;
                                    zzqbVar2 = zzqbVar4;
                                    i8 = i17;
                                    i7 = i52;
                                    i50 = i18;
                                    i47 = i55;
                                    i4 = i3;
                                    i9 = i16;
                                    if (i7 != i4) {
                                    }
                                    if (zztvVar.zzh) {
                                    }
                                    zzqb zzqbVar12222 = zzqbVar2;
                                    i10 = i47;
                                    i11 = i7;
                                    i12 = i8;
                                    i9 = zzqc.zzh(i11, bArr2, i9, i2, zzd(obj2), zzqbVar12222);
                                    i13 = i2;
                                    i46 = i9;
                                    bArr7 = bArr;
                                    i52 = i11;
                                    i43 = i13;
                                    i48 = i12;
                                    unsafe13 = unsafe;
                                    obj6 = obj2;
                                    i49 = i6;
                                    i47 = i10;
                                    i44 = 3;
                                    i45 = -1;
                                    i51 = 1;
                                    zzqbVar9 = zzqbVar;
                                    break;
                                } else {
                                    i49 = i6 | i59;
                                    int zzi6 = zzqc.zzi(bArr2, i16, zzqbVar4);
                                    unsafe5.putInt(obj4, j2, zzqbVar4.zza);
                                    i43 = i2;
                                    bArr7 = bArr2;
                                    i48 = i17;
                                    i50 = i18;
                                    i44 = 3;
                                    i45 = -1;
                                    i51 = 1;
                                    i46 = zzi6;
                                    obj6 = obj4;
                                    unsafe13 = unsafe5;
                                    zzqbVar9 = zzqbVar4;
                                    i47 = i55;
                                    break;
                                }
                                break;
                            case 5:
                            case 14:
                                Unsafe unsafe14 = unsafe13;
                                Object obj7 = obj6;
                                i16 = i53;
                                i17 = i15;
                                i18 = i50;
                                i6 = i49;
                                if (i56 != 1) {
                                    bArr2 = bArr;
                                    obj4 = obj7;
                                    unsafe5 = unsafe14;
                                    zzqbVar4 = zzqbVar;
                                    unsafe4 = unsafe5;
                                    obj2 = obj4;
                                    unsafe = unsafe4;
                                    zzqbVar2 = zzqbVar4;
                                    i8 = i17;
                                    i7 = i52;
                                    i50 = i18;
                                    i47 = i55;
                                    i4 = i3;
                                    i9 = i16;
                                    if (i7 != i4) {
                                    }
                                    if (zztvVar.zzh) {
                                    }
                                    zzqb zzqbVar122222 = zzqbVar2;
                                    i10 = i47;
                                    i11 = i7;
                                    i12 = i8;
                                    i9 = zzqc.zzh(i11, bArr2, i9, i2, zzd(obj2), zzqbVar122222);
                                    i13 = i2;
                                    i46 = i9;
                                    bArr7 = bArr;
                                    i52 = i11;
                                    i43 = i13;
                                    i48 = i12;
                                    unsafe13 = unsafe;
                                    obj6 = obj2;
                                    i49 = i6;
                                    i47 = i10;
                                    i44 = 3;
                                    i45 = -1;
                                    i51 = 1;
                                    zzqbVar9 = zzqbVar;
                                    break;
                                } else {
                                    int i65 = i16 + 8;
                                    long zzp = zzqc.zzp(bArr, i16);
                                    obj6 = obj7;
                                    unsafe13 = unsafe14;
                                    unsafe13.putLong(obj6, j2, zzp);
                                    i43 = i2;
                                    bArr7 = bArr;
                                    zzqbVar9 = zzqbVar;
                                    i46 = i65;
                                    i48 = i17;
                                    i49 = i6 | i59;
                                    i50 = i18;
                                    i47 = i55;
                                    i44 = 3;
                                    i45 = -1;
                                    i51 = 1;
                                    break;
                                }
                                break;
                            case 6:
                            case 13:
                                zzqbVar3 = zzqbVar;
                                unsafe2 = unsafe13;
                                obj3 = obj6;
                                i16 = i53;
                                i17 = i15;
                                bArr3 = bArr;
                                i18 = i50;
                                i6 = i49;
                                if (i56 != 5) {
                                    Object obj8 = obj3;
                                    bArr2 = bArr3;
                                    obj4 = obj8;
                                    Unsafe unsafe15 = unsafe2;
                                    zzqbVar4 = zzqbVar3;
                                    unsafe4 = unsafe15;
                                    obj2 = obj4;
                                    unsafe = unsafe4;
                                    zzqbVar2 = zzqbVar4;
                                    i8 = i17;
                                    i7 = i52;
                                    i50 = i18;
                                    i47 = i55;
                                    i4 = i3;
                                    i9 = i16;
                                    if (i7 != i4) {
                                    }
                                    if (zztvVar.zzh) {
                                    }
                                    zzqb zzqbVar1222222 = zzqbVar2;
                                    i10 = i47;
                                    i11 = i7;
                                    i12 = i8;
                                    i9 = zzqc.zzh(i11, bArr2, i9, i2, zzd(obj2), zzqbVar1222222);
                                    i13 = i2;
                                    i46 = i9;
                                    bArr7 = bArr;
                                    i52 = i11;
                                    i43 = i13;
                                    i48 = i12;
                                    unsafe13 = unsafe;
                                    obj6 = obj2;
                                    i49 = i6;
                                    i47 = i10;
                                    i44 = 3;
                                    i45 = -1;
                                    i51 = 1;
                                    zzqbVar9 = zzqbVar;
                                    break;
                                } else {
                                    int i66 = i16 + 4;
                                    unsafe2.putInt(obj3, j2, zzqc.zzb(bArr3, i16));
                                    zzqbVar9 = zzqbVar3;
                                    i49 = i6 | i59;
                                    obj6 = obj3;
                                    i48 = i17;
                                    i50 = i18;
                                    i44 = 3;
                                    i45 = -1;
                                    bArr7 = bArr3;
                                    i46 = i66;
                                    unsafe13 = unsafe2;
                                    i47 = i55;
                                    i43 = i2;
                                    break;
                                }
                                break;
                            case 7:
                                zzqbVar3 = zzqbVar;
                                unsafe2 = unsafe13;
                                obj3 = obj6;
                                i16 = i53;
                                i17 = i15;
                                bArr3 = bArr;
                                i18 = i50;
                                i6 = i49;
                                if (i56 != 0) {
                                    Object obj82 = obj3;
                                    bArr2 = bArr3;
                                    obj4 = obj82;
                                    Unsafe unsafe152 = unsafe2;
                                    zzqbVar4 = zzqbVar3;
                                    unsafe4 = unsafe152;
                                    obj2 = obj4;
                                    unsafe = unsafe4;
                                    zzqbVar2 = zzqbVar4;
                                    i8 = i17;
                                    i7 = i52;
                                    i50 = i18;
                                    i47 = i55;
                                    i4 = i3;
                                    i9 = i16;
                                    if (i7 != i4) {
                                    }
                                    if (zztvVar.zzh) {
                                    }
                                    zzqb zzqbVar12222222 = zzqbVar2;
                                    i10 = i47;
                                    i11 = i7;
                                    i12 = i8;
                                    i9 = zzqc.zzh(i11, bArr2, i9, i2, zzd(obj2), zzqbVar12222222);
                                    i13 = i2;
                                    i46 = i9;
                                    bArr7 = bArr;
                                    i52 = i11;
                                    i43 = i13;
                                    i48 = i12;
                                    unsafe13 = unsafe;
                                    obj6 = obj2;
                                    i49 = i6;
                                    i47 = i10;
                                    i44 = 3;
                                    i45 = -1;
                                    i51 = 1;
                                    zzqbVar9 = zzqbVar;
                                    break;
                                } else {
                                    int i67 = i6 | i59;
                                    int zzl2 = zzqc.zzl(bArr3, i16, zzqbVar3);
                                    zzvc.zzm(obj3, j2, zzqbVar3.zzb != 0);
                                    i46 = zzl2;
                                    obj6 = obj3;
                                    zzqbVar9 = zzqbVar3;
                                    i49 = i67;
                                    i48 = i17;
                                    i50 = i18;
                                    i44 = 3;
                                    i45 = -1;
                                    i43 = i2;
                                    bArr7 = bArr3;
                                    unsafe13 = unsafe2;
                                    i47 = i55;
                                    break;
                                }
                                break;
                            case 8:
                                zzqbVar3 = zzqbVar;
                                unsafe2 = unsafe13;
                                obj3 = obj6;
                                i16 = i53;
                                i17 = i15;
                                bArr3 = bArr;
                                i18 = i50;
                                i6 = i49;
                                if (i56 != 2) {
                                    Object obj822 = obj3;
                                    bArr2 = bArr3;
                                    obj4 = obj822;
                                    Unsafe unsafe1522 = unsafe2;
                                    zzqbVar4 = zzqbVar3;
                                    unsafe4 = unsafe1522;
                                    obj2 = obj4;
                                    unsafe = unsafe4;
                                    zzqbVar2 = zzqbVar4;
                                    i8 = i17;
                                    i7 = i52;
                                    i50 = i18;
                                    i47 = i55;
                                    i4 = i3;
                                    i9 = i16;
                                    if (i7 != i4) {
                                    }
                                    if (zztvVar.zzh) {
                                    }
                                    zzqb zzqbVar122222222 = zzqbVar2;
                                    i10 = i47;
                                    i11 = i7;
                                    i12 = i8;
                                    i9 = zzqc.zzh(i11, bArr2, i9, i2, zzd(obj2), zzqbVar122222222);
                                    i13 = i2;
                                    i46 = i9;
                                    bArr7 = bArr;
                                    i52 = i11;
                                    i43 = i13;
                                    i48 = i12;
                                    unsafe13 = unsafe;
                                    obj6 = obj2;
                                    i49 = i6;
                                    i47 = i10;
                                    i44 = 3;
                                    i45 = -1;
                                    i51 = 1;
                                    zzqbVar9 = zzqbVar;
                                    break;
                                } else {
                                    if (zzM(i57)) {
                                        zzg = zzqc.zzi(bArr3, i16, zzqbVar3);
                                        int i68 = zzqbVar3.zza;
                                        if (i68 < 0) {
                                            throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        i23 = i6 | i59;
                                        if (i68 == 0) {
                                            zzqbVar3.zzc = "";
                                        } else {
                                            zzqbVar3.zzc = zzvf.zzd(bArr3, zzg, i68);
                                            zzg += i68;
                                        }
                                    } else {
                                        zzg = zzqc.zzg(bArr3, i16, zzqbVar3);
                                        i23 = i6 | i59;
                                    }
                                    unsafe2.putObject(obj3, j2, zzqbVar3.zzc);
                                    i46 = zzg;
                                    obj6 = obj3;
                                    i43 = i2;
                                    i49 = i23;
                                    i48 = i17;
                                    i50 = i18;
                                    i44 = 3;
                                    i45 = -1;
                                    zzqbVar9 = zzqbVar3;
                                    bArr7 = bArr3;
                                    unsafe13 = unsafe2;
                                    i47 = i55;
                                    break;
                                }
                                break;
                            case 9:
                                Object obj9 = obj6;
                                Unsafe unsafe16 = unsafe13;
                                int i69 = i53;
                                i17 = i15;
                                if (i56 != 2) {
                                    i52 = i52;
                                    i16 = i69;
                                    bArr2 = bArr;
                                    obj4 = obj9;
                                    zzqbVar4 = zzqbVar;
                                    unsafe4 = unsafe16;
                                    i6 = i49;
                                    i18 = i50;
                                    obj2 = obj4;
                                    unsafe = unsafe4;
                                    zzqbVar2 = zzqbVar4;
                                    i8 = i17;
                                    i7 = i52;
                                    i50 = i18;
                                    i47 = i55;
                                    i4 = i3;
                                    i9 = i16;
                                    if (i7 != i4) {
                                    }
                                    if (zztvVar.zzh) {
                                    }
                                    zzqb zzqbVar1222222222 = zzqbVar2;
                                    i10 = i47;
                                    i11 = i7;
                                    i12 = i8;
                                    i9 = zzqc.zzh(i11, bArr2, i9, i2, zzd(obj2), zzqbVar1222222222);
                                    i13 = i2;
                                    i46 = i9;
                                    bArr7 = bArr;
                                    i52 = i11;
                                    i43 = i13;
                                    i48 = i12;
                                    unsafe13 = unsafe;
                                    obj6 = obj2;
                                    i49 = i6;
                                    i47 = i10;
                                    i44 = 3;
                                    i45 = -1;
                                    i51 = 1;
                                    zzqbVar9 = zzqbVar;
                                    break;
                                } else {
                                    i49 |= i59;
                                    Object zzA = zztvVar.zzA(obj9, i17);
                                    unsafe2 = unsafe16;
                                    zzqbVar9 = zzqbVar;
                                    i52 = i52;
                                    int zzn2 = zzqc.zzn(zzA, zztvVar.zzx(i17), bArr, i69, i2, zzqbVar9);
                                    bArr3 = bArr;
                                    zztvVar.zzJ(obj9, i17, zzA);
                                    i46 = zzn2;
                                    obj6 = obj9;
                                    i43 = i2;
                                    i48 = i17;
                                    i44 = 3;
                                    i45 = -1;
                                    bArr7 = bArr3;
                                    unsafe13 = unsafe2;
                                    i47 = i55;
                                    break;
                                }
                                break;
                            case 10:
                                Object obj10 = obj6;
                                unsafe3 = unsafe13;
                                obj4 = obj10;
                                bArr2 = bArr;
                                zzqbVar4 = zzqbVar;
                                i19 = i53;
                                i20 = i52;
                                i17 = i15;
                                if (i56 != 2) {
                                    i52 = i20;
                                    i6 = i49;
                                    i18 = i50;
                                    unsafe4 = unsafe3;
                                    i16 = i19;
                                    obj2 = obj4;
                                    unsafe = unsafe4;
                                    zzqbVar2 = zzqbVar4;
                                    i8 = i17;
                                    i7 = i52;
                                    i50 = i18;
                                    i47 = i55;
                                    i4 = i3;
                                    i9 = i16;
                                    if (i7 != i4) {
                                    }
                                    if (zztvVar.zzh) {
                                    }
                                    zzqb zzqbVar12222222222 = zzqbVar2;
                                    i10 = i47;
                                    i11 = i7;
                                    i12 = i8;
                                    i9 = zzqc.zzh(i11, bArr2, i9, i2, zzd(obj2), zzqbVar12222222222);
                                    i13 = i2;
                                    i46 = i9;
                                    bArr7 = bArr;
                                    i52 = i11;
                                    i43 = i13;
                                    i48 = i12;
                                    unsafe13 = unsafe;
                                    obj6 = obj2;
                                    i49 = i6;
                                    i47 = i10;
                                    i44 = 3;
                                    i45 = -1;
                                    i51 = 1;
                                    zzqbVar9 = zzqbVar;
                                    break;
                                } else {
                                    i49 |= i59;
                                    zza2 = zzqc.zza(bArr2, i19, zzqbVar4);
                                    unsafe3.putObject(obj4, j2, zzqbVar4.zzc);
                                    obj6 = obj4;
                                    unsafe13 = unsafe3;
                                    i52 = i20;
                                    bArr7 = bArr2;
                                    zzqbVar9 = zzqbVar4;
                                    i48 = i17;
                                    i47 = i55;
                                    i44 = 3;
                                    i45 = -1;
                                    i46 = zza2;
                                    i43 = i2;
                                    break;
                                }
                                break;
                            case 12:
                                Object obj11 = obj6;
                                unsafe3 = unsafe13;
                                obj4 = obj11;
                                bArr2 = bArr;
                                zzqbVar4 = zzqbVar;
                                i19 = i53;
                                i20 = i52;
                                i17 = i15;
                                if (i56 != 0) {
                                    i52 = i20;
                                    i6 = i49;
                                    i18 = i50;
                                    unsafe4 = unsafe3;
                                    i16 = i19;
                                    obj2 = obj4;
                                    unsafe = unsafe4;
                                    zzqbVar2 = zzqbVar4;
                                    i8 = i17;
                                    i7 = i52;
                                    i50 = i18;
                                    i47 = i55;
                                    i4 = i3;
                                    i9 = i16;
                                    if (i7 != i4) {
                                    }
                                    if (zztvVar.zzh) {
                                    }
                                    zzqb zzqbVar122222222222 = zzqbVar2;
                                    i10 = i47;
                                    i11 = i7;
                                    i12 = i8;
                                    i9 = zzqc.zzh(i11, bArr2, i9, i2, zzd(obj2), zzqbVar122222222222);
                                    i13 = i2;
                                    i46 = i9;
                                    bArr7 = bArr;
                                    i52 = i11;
                                    i43 = i13;
                                    i48 = i12;
                                    unsafe13 = unsafe;
                                    obj6 = obj2;
                                    i49 = i6;
                                    i47 = i10;
                                    i44 = 3;
                                    i45 = -1;
                                    i51 = 1;
                                    zzqbVar9 = zzqbVar;
                                    break;
                                } else {
                                    int zzi7 = zzqc.zzi(bArr2, i19, zzqbVar4);
                                    int i70 = zzqbVar4.zza;
                                    zzsr zzw = zztvVar.zzw(i17);
                                    if ((i57 & TLObject.FLAG_31) == 0 || zzw == null || zzw.zza(i70)) {
                                        i49 |= i59;
                                        unsafe3.putInt(obj4, j2, i70);
                                    } else {
                                        zzd(obj4).zzj(i20, Long.valueOf(i70));
                                    }
                                    obj6 = obj4;
                                    unsafe13 = unsafe3;
                                    i43 = i2;
                                    i52 = i20;
                                    bArr7 = bArr2;
                                    zzqbVar9 = zzqbVar4;
                                    i48 = i17;
                                    i47 = i55;
                                    i44 = 3;
                                    i45 = -1;
                                    i46 = zzi7;
                                    break;
                                }
                                break;
                            case 15:
                                Object obj12 = obj6;
                                unsafe6 = unsafe13;
                                obj4 = obj12;
                                bArr2 = bArr;
                                zzqbVar4 = zzqbVar;
                                i21 = i53;
                                i17 = i15;
                                if (i56 != 0) {
                                    unsafe4 = unsafe6;
                                    i16 = i21;
                                    i6 = i49;
                                    i18 = i50;
                                    obj2 = obj4;
                                    unsafe = unsafe4;
                                    zzqbVar2 = zzqbVar4;
                                    i8 = i17;
                                    i7 = i52;
                                    i50 = i18;
                                    i47 = i55;
                                    i4 = i3;
                                    i9 = i16;
                                    if (i7 != i4) {
                                    }
                                    if (zztvVar.zzh) {
                                    }
                                    zzqb zzqbVar1222222222222 = zzqbVar2;
                                    i10 = i47;
                                    i11 = i7;
                                    i12 = i8;
                                    i9 = zzqc.zzh(i11, bArr2, i9, i2, zzd(obj2), zzqbVar1222222222222);
                                    i13 = i2;
                                    i46 = i9;
                                    bArr7 = bArr;
                                    i52 = i11;
                                    i43 = i13;
                                    i48 = i12;
                                    unsafe13 = unsafe;
                                    obj6 = obj2;
                                    i49 = i6;
                                    i47 = i10;
                                    i44 = 3;
                                    i45 = -1;
                                    i51 = 1;
                                    zzqbVar9 = zzqbVar;
                                    break;
                                } else {
                                    i49 |= i59;
                                    int zzi8 = zzqc.zzi(bArr2, i21, zzqbVar4);
                                    unsafe6.putInt(obj4, j2, zzqq.zzF(zzqbVar4.zza));
                                    obj6 = obj4;
                                    unsafe13 = unsafe6;
                                    i46 = zzi8;
                                    bArr7 = bArr2;
                                    i43 = i2;
                                    zzqbVar9 = zzqbVar4;
                                    i48 = i17;
                                    i47 = i55;
                                    i44 = 3;
                                    i45 = -1;
                                    break;
                                }
                                break;
                            case 16:
                                bArr2 = bArr;
                                zzqbVar4 = zzqbVar;
                                i21 = i53;
                                i17 = i15;
                                if (i56 != 0) {
                                    Object obj13 = obj6;
                                    unsafe6 = unsafe13;
                                    obj4 = obj13;
                                    unsafe4 = unsafe6;
                                    i16 = i21;
                                    i6 = i49;
                                    i18 = i50;
                                    obj2 = obj4;
                                    unsafe = unsafe4;
                                    zzqbVar2 = zzqbVar4;
                                    i8 = i17;
                                    i7 = i52;
                                    i50 = i18;
                                    i47 = i55;
                                    i4 = i3;
                                    i9 = i16;
                                    if (i7 != i4) {
                                    }
                                    if (zztvVar.zzh) {
                                    }
                                    zzqb zzqbVar12222222222222 = zzqbVar2;
                                    i10 = i47;
                                    i11 = i7;
                                    i12 = i8;
                                    i9 = zzqc.zzh(i11, bArr2, i9, i2, zzd(obj2), zzqbVar12222222222222);
                                    i13 = i2;
                                    i46 = i9;
                                    bArr7 = bArr;
                                    i52 = i11;
                                    i43 = i13;
                                    i48 = i12;
                                    unsafe13 = unsafe;
                                    obj6 = obj2;
                                    i49 = i6;
                                    i47 = i10;
                                    i44 = 3;
                                    i45 = -1;
                                    i51 = 1;
                                    zzqbVar9 = zzqbVar;
                                    break;
                                } else {
                                    i49 |= i59;
                                    int zzl3 = zzqc.zzl(bArr2, i21, zzqbVar4);
                                    unsafe13.putLong(obj6, j2, zzqq.zzG(zzqbVar4.zzb));
                                    obj6 = obj6;
                                    unsafe13 = unsafe13;
                                    i43 = i2;
                                    bArr7 = bArr2;
                                    zzqbVar9 = zzqbVar4;
                                    i46 = zzl3;
                                    i48 = i17;
                                    i47 = i55;
                                    i44 = 3;
                                    i45 = -1;
                                    break;
                                }
                                break;
                            default:
                                if (i56 != 3) {
                                    i21 = i53;
                                    i17 = i15;
                                    bArr2 = bArr;
                                    zzqbVar4 = zzqbVar;
                                    unsafe4 = unsafe13;
                                    obj4 = obj6;
                                    i16 = i21;
                                    i6 = i49;
                                    i18 = i50;
                                    obj2 = obj4;
                                    unsafe = unsafe4;
                                    zzqbVar2 = zzqbVar4;
                                    i8 = i17;
                                    i7 = i52;
                                    i50 = i18;
                                    i47 = i55;
                                    i4 = i3;
                                    i9 = i16;
                                    if (i7 != i4) {
                                    }
                                    if (zztvVar.zzh) {
                                    }
                                    zzqb zzqbVar122222222222222 = zzqbVar2;
                                    i10 = i47;
                                    i11 = i7;
                                    i12 = i8;
                                    i9 = zzqc.zzh(i11, bArr2, i9, i2, zzd(obj2), zzqbVar122222222222222);
                                    i13 = i2;
                                    i46 = i9;
                                    bArr7 = bArr;
                                    i52 = i11;
                                    i43 = i13;
                                    i48 = i12;
                                    unsafe13 = unsafe;
                                    obj6 = obj2;
                                    i49 = i6;
                                    i47 = i10;
                                    i44 = 3;
                                    i45 = -1;
                                    i51 = 1;
                                    zzqbVar9 = zzqbVar;
                                    break;
                                } else {
                                    i49 |= i59;
                                    int i71 = i15;
                                    Object zzA2 = zztvVar.zzA(obj6, i71);
                                    int i72 = i53;
                                    i17 = i71;
                                    zza2 = zzqc.zzm(zzA2, zztvVar.zzx(i71), bArr, i72, i2, (i55 << 3) | 4, zzqbVar);
                                    bArr2 = bArr;
                                    zzqbVar4 = zzqbVar;
                                    zztvVar.zzJ(obj6, i17, zzA2);
                                    bArr7 = bArr2;
                                    zzqbVar9 = zzqbVar4;
                                    i48 = i17;
                                    i47 = i55;
                                    i44 = 3;
                                    i45 = -1;
                                    i46 = zza2;
                                    i43 = i2;
                                    break;
                                }
                                break;
                        }
                    } else {
                        Unsafe unsafe17 = unsafe13;
                        Object obj14 = obj6;
                        int i73 = i53;
                        int i74 = zzq;
                        if (zzt != 27) {
                            i6 = i49;
                            i24 = i50;
                            if (zzt > 49) {
                                zzqbVar5 = zzqbVar;
                                i7 = i52;
                                i25 = i73;
                                i47 = i55;
                                bArr2 = bArr;
                                if (zzt != 50) {
                                    unsafe = unsafe17;
                                    long j3 = iArr[i74 + 2] & 1048575;
                                    switch (zzt) {
                                        case 51:
                                            zzqbVar2 = zzqbVar;
                                            i26 = i74;
                                            i27 = i25;
                                            obj2 = obj;
                                            if (i56 == 1) {
                                                zza2 = i27 + 8;
                                                unsafe.putObject(obj2, j2, Double.valueOf(Double.longBitsToDouble(zzqc.zzp(bArr2, i27))));
                                                unsafe.putInt(obj2, j3, i47);
                                                if (zza2 == i27) {
                                                    i4 = i3;
                                                    i9 = zza2;
                                                    i8 = i26;
                                                    i50 = i24;
                                                    break;
                                                } else {
                                                    zzqbVar9 = zzqbVar2;
                                                    bArr7 = bArr2;
                                                    i52 = i7;
                                                    unsafe13 = unsafe;
                                                    obj6 = obj2;
                                                    i48 = i26;
                                                    i49 = i6;
                                                    i50 = i24;
                                                    i44 = 3;
                                                    i45 = -1;
                                                    i51 = 1;
                                                    i46 = zza2;
                                                    i43 = i2;
                                                    break;
                                                }
                                            }
                                            zza2 = i27;
                                            if (zza2 == i27) {
                                            }
                                        case 52:
                                            zzqbVar2 = zzqbVar;
                                            i26 = i74;
                                            i27 = i25;
                                            obj2 = obj;
                                            if (i56 == 5) {
                                                zza2 = i27 + 4;
                                                unsafe.putObject(obj2, j2, Float.valueOf(Float.intBitsToFloat(zzqc.zzb(bArr2, i27))));
                                                unsafe.putInt(obj2, j3, i47);
                                                if (zza2 == i27) {
                                                }
                                            }
                                            zza2 = i27;
                                            if (zza2 == i27) {
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            zzqbVar2 = zzqbVar;
                                            i26 = i74;
                                            i27 = i25;
                                            obj2 = obj;
                                            if (i56 == 0) {
                                                zza2 = zzqc.zzl(bArr2, i27, zzqbVar2);
                                                unsafe.putObject(obj2, j2, Long.valueOf(zzqbVar2.zzb));
                                                unsafe.putInt(obj2, j3, i47);
                                                if (zza2 == i27) {
                                                }
                                            }
                                            zza2 = i27;
                                            if (zza2 == i27) {
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            zzqbVar2 = zzqbVar;
                                            i26 = i74;
                                            i27 = i25;
                                            obj2 = obj;
                                            if (i56 == 0) {
                                                zza2 = zzqc.zzi(bArr2, i27, zzqbVar2);
                                                unsafe.putObject(obj2, j2, Integer.valueOf(zzqbVar2.zza));
                                                unsafe.putInt(obj2, j3, i47);
                                                if (zza2 == i27) {
                                                }
                                            }
                                            zza2 = i27;
                                            if (zza2 == i27) {
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            zzqbVar2 = zzqbVar;
                                            i26 = i74;
                                            i27 = i25;
                                            obj2 = obj;
                                            if (i56 == 1) {
                                                zza2 = i27 + 8;
                                                unsafe.putObject(obj2, j2, Long.valueOf(zzqc.zzp(bArr2, i27)));
                                                unsafe.putInt(obj2, j3, i47);
                                                if (zza2 == i27) {
                                                }
                                            }
                                            zza2 = i27;
                                            if (zza2 == i27) {
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            zzqbVar2 = zzqbVar;
                                            i26 = i74;
                                            i27 = i25;
                                            obj2 = obj;
                                            if (i56 == 5) {
                                                zza2 = i27 + 4;
                                                unsafe.putObject(obj2, j2, Integer.valueOf(zzqc.zzb(bArr2, i27)));
                                                unsafe.putInt(obj2, j3, i47);
                                                if (zza2 == i27) {
                                                }
                                            }
                                            zza2 = i27;
                                            if (zza2 == i27) {
                                            }
                                            break;
                                        case 58:
                                            zzqbVar2 = zzqbVar;
                                            i26 = i74;
                                            i27 = i25;
                                            obj2 = obj;
                                            if (i56 == 0) {
                                                zza2 = zzqc.zzl(bArr2, i27, zzqbVar2);
                                                unsafe.putObject(obj2, j2, Boolean.valueOf(zzqbVar2.zzb != 0));
                                                unsafe.putInt(obj2, j3, i47);
                                                if (zza2 == i27) {
                                                }
                                            }
                                            zza2 = i27;
                                            if (zza2 == i27) {
                                            }
                                            break;
                                        case 59:
                                            zzqbVar2 = zzqbVar;
                                            i26 = i74;
                                            i27 = i25;
                                            obj2 = obj;
                                            if (i56 == 2) {
                                                zzi = zzqc.zzi(bArr2, i27, zzqbVar2);
                                                int i75 = zzqbVar2.zza;
                                                if (i75 == 0) {
                                                    unsafe.putObject(obj2, j2, "");
                                                } else {
                                                    int i76 = zzi + i75;
                                                    if ((i57 & TLObject.FLAG_29) != 0 && !zzvf.zze(bArr2, zzi, i76)) {
                                                        throw new zzsx("Protocol message had invalid UTF-8.");
                                                    }
                                                    unsafe.putObject(obj2, j2, new String(bArr2, zzi, i75, zzsv.zza));
                                                    zzi = i76;
                                                }
                                                unsafe.putInt(obj2, j3, i47);
                                                zza2 = zzi;
                                                if (zza2 == i27) {
                                                }
                                            }
                                            zza2 = i27;
                                            if (zza2 == i27) {
                                            }
                                            break;
                                        case 60:
                                            zzqbVar2 = zzqbVar;
                                            i28 = i25;
                                            obj2 = obj;
                                            if (i56 == 2) {
                                                Object zzB = zztvVar.zzB(obj2, i47, i74);
                                                zzn = zzqc.zzn(zzB, zztvVar.zzx(i74), bArr2, i28, i2, zzqbVar);
                                                zzqbVar2 = zzqbVar;
                                                zztvVar.zzK(obj2, i47, i74, zzB);
                                                i26 = i74;
                                                i27 = i28;
                                                zza2 = zzn;
                                                if (zza2 == i27) {
                                                }
                                            }
                                            i26 = i74;
                                            i27 = i28;
                                            zza2 = i27;
                                            if (zza2 == i27) {
                                            }
                                            break;
                                        case 61:
                                            zzqbVar2 = zzqbVar;
                                            i28 = i25;
                                            obj2 = obj;
                                            if (i56 == 2) {
                                                zzi = zzqc.zza(bArr2, i28, zzqbVar2);
                                                unsafe.putObject(obj2, j2, zzqbVar2.zzc);
                                                unsafe.putInt(obj2, j3, i47);
                                                i26 = i74;
                                                i27 = i28;
                                                zza2 = zzi;
                                                if (zza2 == i27) {
                                                }
                                            }
                                            i26 = i74;
                                            i27 = i28;
                                            zza2 = i27;
                                            if (zza2 == i27) {
                                            }
                                            break;
                                        case 63:
                                            zzqbVar2 = zzqbVar;
                                            i28 = i25;
                                            obj2 = obj;
                                            if (i56 == 0) {
                                                zzi = zzqc.zzi(bArr2, i28, zzqbVar2);
                                                int i77 = zzqbVar2.zza;
                                                zzsr zzw2 = zztvVar.zzw(i74);
                                                if (zzw2 == null || zzw2.zza(i77)) {
                                                    unsafe.putObject(obj2, j2, Integer.valueOf(i77));
                                                    unsafe.putInt(obj2, j3, i47);
                                                } else {
                                                    zzd(obj2).zzj(i7, Long.valueOf(i77));
                                                }
                                                i26 = i74;
                                                i27 = i28;
                                                zza2 = zzi;
                                                if (zza2 == i27) {
                                                }
                                            }
                                            i26 = i74;
                                            i27 = i28;
                                            zza2 = i27;
                                            if (zza2 == i27) {
                                            }
                                            break;
                                        case 66:
                                            zzqbVar2 = zzqbVar;
                                            i28 = i25;
                                            obj2 = obj;
                                            if (i56 == 0) {
                                                zzi = zzqc.zzi(bArr2, i28, zzqbVar2);
                                                unsafe.putObject(obj2, j2, Integer.valueOf(zzqq.zzF(zzqbVar2.zza)));
                                                unsafe.putInt(obj2, j3, i47);
                                                i26 = i74;
                                                i27 = i28;
                                                zza2 = zzi;
                                                if (zza2 == i27) {
                                                }
                                            }
                                            i26 = i74;
                                            i27 = i28;
                                            zza2 = i27;
                                            if (zza2 == i27) {
                                            }
                                            break;
                                        case 67:
                                            zzqbVar2 = zzqbVar;
                                            i28 = i25;
                                            obj2 = obj;
                                            if (i56 == 0) {
                                                zzi = zzqc.zzl(bArr2, i28, zzqbVar2);
                                                unsafe.putObject(obj2, j2, Long.valueOf(zzqq.zzG(zzqbVar2.zzb)));
                                                unsafe.putInt(obj2, j3, i47);
                                                i26 = i74;
                                                i27 = i28;
                                                zza2 = zzi;
                                                if (zza2 == i27) {
                                                }
                                            }
                                            i26 = i74;
                                            i27 = i28;
                                            zza2 = i27;
                                            if (zza2 == i27) {
                                            }
                                            break;
                                        case 68:
                                            if (i56 == 3) {
                                                Object zzB2 = zztvVar.zzB(obj, i47, i74);
                                                i28 = i25;
                                                obj2 = obj;
                                                zzn = zzqc.zzm(zzB2, zztvVar.zzx(i74), bArr2, i28, i2, (i7 & (-8)) | 4, zzqbVar);
                                                zzqbVar2 = zzqbVar;
                                                bArr2 = bArr2;
                                                zztvVar.zzK(obj2, i47, i74, zzB2);
                                                i26 = i74;
                                                i27 = i28;
                                                zza2 = zzn;
                                                if (zza2 == i27) {
                                                }
                                            } else {
                                                i28 = i25;
                                                obj2 = obj;
                                                zzqbVar2 = zzqbVar;
                                                i26 = i74;
                                                i27 = i28;
                                                zza2 = i27;
                                                if (zza2 == i27) {
                                                }
                                            }
                                            break;
                                        default:
                                            zzqbVar2 = zzqbVar;
                                            i26 = i74;
                                            i27 = i25;
                                            obj2 = obj;
                                            zza2 = i27;
                                            if (zza2 == i27) {
                                            }
                                            break;
                                    }
                                } else {
                                    if (i56 == 2) {
                                        Object zzz = zztvVar.zzz(i74);
                                        Object object = unsafe17.getObject(obj, j2);
                                        if (zztn.zza(object)) {
                                            zztm zzb2 = zztm.zza().zzb();
                                            zztn.zzb(zzb2, object);
                                            unsafe17.putObject(obj, j2, zzb2);
                                        }
                                        throw null;
                                    }
                                    obj5 = obj;
                                    unsafe7 = unsafe17;
                                    unsafe = unsafe7;
                                    zzqbVar2 = zzqbVar5;
                                    i8 = i74;
                                    i9 = i25;
                                    i50 = i24;
                                    i4 = i3;
                                    obj2 = obj5;
                                }
                            } else {
                                long j4 = i57;
                                zzsu zzsuVar2 = (zzsu) unsafe17.getObject(obj14, j2);
                                if (zzsuVar2.zzc()) {
                                    j = j4;
                                } else {
                                    int size = zzsuVar2.size();
                                    j = j4;
                                    zzsuVar2 = zzsuVar2.zzd(size + size);
                                    unsafe17.putObject(obj14, j2, zzsuVar2);
                                }
                                switch (zzt) {
                                    case 18:
                                    case 35:
                                        zzqbVar9 = zzqbVar;
                                        i7 = i52;
                                        zzsu zzsuVar3 = zzsuVar2;
                                        i29 = i73;
                                        bArr2 = bArr;
                                        unsafe8 = unsafe17;
                                        i30 = i2;
                                        if (i56 == 2) {
                                            int i78 = zzqc.zza;
                                            zzrs zzrsVar = (zzrs) zzsuVar3;
                                            zzi2 = zzqc.zzi(bArr2, i29, zzqbVar9);
                                            int i79 = zzqbVar9.zza;
                                            int i80 = zzi2 + i79;
                                            if (i80 > bArr2.length) {
                                                throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzrsVar.zzg(zzrsVar.size() + (i79 / 8));
                                            while (zzi2 < i80) {
                                                zzrsVar.zzf(Double.longBitsToDouble(zzqc.zzp(bArr2, zzi2)));
                                                zzi2 += 8;
                                            }
                                            if (zzi2 != i80) {
                                                throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i31 = zzi2;
                                            if (i31 == i29) {
                                                obj2 = obj;
                                                i9 = i31;
                                                zzqbVar2 = zzqbVar9;
                                                i8 = i74;
                                                unsafe = unsafe8;
                                                i50 = i24;
                                                i47 = i55;
                                                break;
                                            } else {
                                                i43 = i30;
                                                bArr7 = bArr2;
                                                i48 = i74;
                                                unsafe13 = unsafe8;
                                                i49 = i6;
                                                i50 = i24;
                                                i47 = i55;
                                                i44 = 3;
                                                i45 = -1;
                                                i51 = 1;
                                                i46 = i31;
                                                i52 = i7;
                                                obj6 = obj;
                                                break;
                                            }
                                        } else {
                                            if (i56 == 1) {
                                                i31 = i29 + 8;
                                                int i81 = zzqc.zza;
                                                zzrs zzrsVar2 = (zzrs) zzsuVar3;
                                                zzrsVar2.zzf(Double.longBitsToDouble(zzqc.zzp(bArr2, i29)));
                                                while (i31 < i30) {
                                                    int zzi9 = zzqc.zzi(bArr2, i31, zzqbVar9);
                                                    if (i7 == zzqbVar9.zza) {
                                                        zzrsVar2.zzf(Double.longBitsToDouble(zzqc.zzp(bArr2, zzi9)));
                                                        i31 = zzi9 + 8;
                                                    } else if (i31 == i29) {
                                                    }
                                                }
                                                if (i31 == i29) {
                                                }
                                            }
                                            i31 = i29;
                                            if (i31 == i29) {
                                            }
                                        }
                                    case 19:
                                    case 36:
                                        zzqbVar9 = zzqbVar;
                                        i7 = i52;
                                        zzsu zzsuVar4 = zzsuVar2;
                                        i29 = i73;
                                        bArr2 = bArr;
                                        unsafe8 = unsafe17;
                                        i30 = i2;
                                        if (i56 == 2) {
                                            int i82 = zzqc.zza;
                                            zzsf zzsfVar = (zzsf) zzsuVar4;
                                            zzi2 = zzqc.zzi(bArr2, i29, zzqbVar9);
                                            int i83 = zzqbVar9.zza;
                                            int i84 = zzi2 + i83;
                                            if (i84 > bArr2.length) {
                                                throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzsfVar.zzg(zzsfVar.size() + (i83 / 4));
                                            while (zzi2 < i84) {
                                                zzsfVar.zzf(Float.intBitsToFloat(zzqc.zzb(bArr2, zzi2)));
                                                zzi2 += 4;
                                            }
                                            if (zzi2 != i84) {
                                                throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i31 = zzi2;
                                            if (i31 == i29) {
                                            }
                                        } else {
                                            if (i56 == 5) {
                                                i31 = i29 + 4;
                                                int i85 = zzqc.zza;
                                                zzsf zzsfVar2 = (zzsf) zzsuVar4;
                                                zzsfVar2.zzf(Float.intBitsToFloat(zzqc.zzb(bArr2, i29)));
                                                while (i31 < i30) {
                                                    int zzi10 = zzqc.zzi(bArr2, i31, zzqbVar9);
                                                    if (i7 == zzqbVar9.zza) {
                                                        zzsfVar2.zzf(Float.intBitsToFloat(zzqc.zzb(bArr2, zzi10)));
                                                        i31 = zzi10 + 4;
                                                    } else if (i31 == i29) {
                                                    }
                                                }
                                                if (i31 == i29) {
                                                }
                                            }
                                            i31 = i29;
                                            if (i31 == i29) {
                                            }
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        zzqbVar9 = zzqbVar;
                                        Unsafe unsafe18 = unsafe17;
                                        i7 = i52;
                                        zzsu zzsuVar5 = zzsuVar2;
                                        i29 = i73;
                                        bArr2 = bArr;
                                        i30 = i2;
                                        if (i56 == 2) {
                                            int i86 = zzqc.zza;
                                            zzth zzthVar = (zzth) zzsuVar5;
                                            zzi2 = zzqc.zzi(bArr2, i29, zzqbVar9);
                                            int i87 = zzqbVar9.zza + zzi2;
                                            while (zzi2 < i87) {
                                                zzi2 = zzqc.zzl(bArr2, zzi2, zzqbVar9);
                                                zzthVar.zzg(zzqbVar9.zzb);
                                                unsafe18 = unsafe18;
                                            }
                                            unsafe8 = unsafe18;
                                            if (zzi2 != i87) {
                                                throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i31 = zzi2;
                                            if (i31 == i29) {
                                            }
                                        } else {
                                            unsafe8 = unsafe18;
                                            if (i56 == 0) {
                                                int i88 = zzqc.zza;
                                                zzth zzthVar2 = (zzth) zzsuVar5;
                                                i31 = zzqc.zzl(bArr2, i29, zzqbVar9);
                                                zzthVar2.zzg(zzqbVar9.zzb);
                                                while (i31 < i30) {
                                                    int zzi11 = zzqc.zzi(bArr2, i31, zzqbVar9);
                                                    if (i7 == zzqbVar9.zza) {
                                                        i31 = zzqc.zzl(bArr2, zzi11, zzqbVar9);
                                                        zzthVar2.zzg(zzqbVar9.zzb);
                                                    } else if (i31 == i29) {
                                                    }
                                                }
                                                if (i31 == i29) {
                                                }
                                            }
                                            i31 = i29;
                                            if (i31 == i29) {
                                            }
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        bArr4 = bArr;
                                        i32 = i2;
                                        unsafe9 = unsafe17;
                                        i33 = i52;
                                        zzsu zzsuVar6 = zzsuVar2;
                                        i34 = i73;
                                        zzqbVar6 = zzqbVar;
                                        if (i56 == 2) {
                                            i31 = zzqc.zzf(bArr4, i34, zzsuVar6, zzqbVar6);
                                            i7 = i33;
                                            i30 = i32;
                                            zzqbVar9 = zzqbVar6;
                                            unsafe8 = unsafe9;
                                            i29 = i34;
                                            bArr2 = bArr4;
                                            if (i31 == i29) {
                                            }
                                        } else if (i56 == 0) {
                                            zzqbVar9 = zzqbVar6;
                                            int zzk = zzqc.zzk(i33, bArr4, i34, i32, zzsuVar6, zzqbVar9);
                                            i7 = i33;
                                            bArr2 = bArr4;
                                            i29 = i34;
                                            i30 = i32;
                                            i31 = zzk;
                                            unsafe8 = unsafe9;
                                            if (i31 == i29) {
                                            }
                                        } else {
                                            i7 = i33;
                                            i30 = i32;
                                            zzqbVar9 = zzqbVar6;
                                            i29 = i34;
                                            bArr2 = bArr4;
                                            unsafe8 = unsafe9;
                                            i31 = i29;
                                            if (i31 == i29) {
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        bArr4 = bArr;
                                        i32 = i2;
                                        Unsafe unsafe19 = unsafe17;
                                        i33 = i52;
                                        zzsu zzsuVar7 = zzsuVar2;
                                        i34 = i73;
                                        zzqbVar6 = zzqbVar;
                                        if (i56 == 2) {
                                            int i89 = zzqc.zza;
                                            zzth zzthVar3 = (zzth) zzsuVar7;
                                            int zzi12 = zzqc.zzi(bArr4, i34, zzqbVar6);
                                            int i90 = zzqbVar6.zza;
                                            int i91 = zzi12 + i90;
                                            if (i91 > bArr4.length) {
                                                throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzthVar3.zzh(zzthVar3.size() + (i90 / 8));
                                            while (zzi12 < i91) {
                                                zzthVar3.zzg(zzqc.zzp(bArr4, zzi12));
                                                zzi12 += 8;
                                                unsafe19 = unsafe19;
                                            }
                                            unsafe9 = unsafe19;
                                            if (zzi12 != i91) {
                                                throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i7 = i33;
                                            i30 = i32;
                                            i31 = zzi12;
                                            zzqbVar9 = zzqbVar6;
                                            unsafe8 = unsafe9;
                                            i29 = i34;
                                            bArr2 = bArr4;
                                            if (i31 == i29) {
                                            }
                                        } else {
                                            unsafe9 = unsafe19;
                                            if (i56 == 1) {
                                                i31 = i34 + 8;
                                                int i92 = zzqc.zza;
                                                zzth zzthVar4 = (zzth) zzsuVar7;
                                                zzthVar4.zzg(zzqc.zzp(bArr4, i34));
                                                while (i31 < i32) {
                                                    int zzi13 = zzqc.zzi(bArr4, i31, zzqbVar6);
                                                    if (i33 == zzqbVar6.zza) {
                                                        zzthVar4.zzg(zzqc.zzp(bArr4, zzi13));
                                                        i31 = zzi13 + 8;
                                                    } else {
                                                        i7 = i33;
                                                        i30 = i32;
                                                        zzqbVar9 = zzqbVar6;
                                                        unsafe8 = unsafe9;
                                                        i29 = i34;
                                                        bArr2 = bArr4;
                                                        if (i31 == i29) {
                                                        }
                                                    }
                                                }
                                                i7 = i33;
                                                i30 = i32;
                                                zzqbVar9 = zzqbVar6;
                                                unsafe8 = unsafe9;
                                                i29 = i34;
                                                bArr2 = bArr4;
                                                if (i31 == i29) {
                                                }
                                            } else {
                                                i7 = i33;
                                                i30 = i32;
                                                zzqbVar9 = zzqbVar6;
                                                unsafe8 = unsafe9;
                                                i29 = i34;
                                                bArr2 = bArr4;
                                                i31 = i29;
                                                if (i31 == i29) {
                                                }
                                            }
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        bArr4 = bArr;
                                        i35 = i2;
                                        unsafe10 = unsafe17;
                                        i36 = i52;
                                        zzsu zzsuVar8 = zzsuVar2;
                                        i34 = i73;
                                        zzqbVar7 = zzqbVar;
                                        if (i56 == 2) {
                                            int i93 = zzqc.zza;
                                            zzso zzsoVar = (zzso) zzsuVar8;
                                            zzi3 = zzqc.zzi(bArr4, i34, zzqbVar7);
                                            int i94 = zzqbVar7.zza;
                                            int i95 = zzi3 + i94;
                                            if (i95 > bArr4.length) {
                                                throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzsoVar.zzi(zzsoVar.size() + (i94 / 4));
                                            while (zzi3 < i95) {
                                                zzsoVar.zzh(zzqc.zzb(bArr4, zzi3));
                                                zzi3 += 4;
                                            }
                                            if (zzi3 != i95) {
                                                throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i7 = i36;
                                            i30 = i35;
                                            i31 = zzi3;
                                            zzqbVar9 = zzqbVar7;
                                            unsafe8 = unsafe10;
                                            i29 = i34;
                                            bArr2 = bArr4;
                                            if (i31 == i29) {
                                            }
                                        } else {
                                            if (i56 == 5) {
                                                i31 = i34 + 4;
                                                int i96 = zzqc.zza;
                                                zzso zzsoVar2 = (zzso) zzsuVar8;
                                                zzsoVar2.zzh(zzqc.zzb(bArr4, i34));
                                                while (i31 < i35) {
                                                    int zzi14 = zzqc.zzi(bArr4, i31, zzqbVar7);
                                                    if (i36 == zzqbVar7.zza) {
                                                        zzsoVar2.zzh(zzqc.zzb(bArr4, zzi14));
                                                        i31 = zzi14 + 4;
                                                    } else {
                                                        i7 = i36;
                                                        i30 = i35;
                                                        zzqbVar9 = zzqbVar7;
                                                        unsafe8 = unsafe10;
                                                        i29 = i34;
                                                        bArr2 = bArr4;
                                                        if (i31 == i29) {
                                                        }
                                                    }
                                                }
                                                i7 = i36;
                                                i30 = i35;
                                                zzqbVar9 = zzqbVar7;
                                                unsafe8 = unsafe10;
                                                i29 = i34;
                                                bArr2 = bArr4;
                                                if (i31 == i29) {
                                                }
                                            }
                                            i7 = i36;
                                            i30 = i35;
                                            zzqbVar9 = zzqbVar7;
                                            unsafe8 = unsafe10;
                                            i29 = i34;
                                            bArr2 = bArr4;
                                            i31 = i29;
                                            if (i31 == i29) {
                                            }
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        bArr4 = bArr;
                                        i35 = i2;
                                        unsafe10 = unsafe17;
                                        i36 = i52;
                                        zzsu zzsuVar9 = zzsuVar2;
                                        i34 = i73;
                                        zzqbVar7 = zzqbVar;
                                        if (i56 == 2) {
                                            int i97 = zzqc.zza;
                                            zzqd zzqdVar = (zzqd) zzsuVar9;
                                            zzi3 = zzqc.zzi(bArr4, i34, zzqbVar7);
                                            int i98 = zzqbVar7.zza + zzi3;
                                            while (zzi3 < i98) {
                                                zzi3 = zzqc.zzl(bArr4, zzi3, zzqbVar7);
                                                zzqdVar.zze(zzqbVar7.zzb != 0);
                                            }
                                            if (zzi3 != i98) {
                                                throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i7 = i36;
                                            i30 = i35;
                                            i31 = zzi3;
                                            zzqbVar9 = zzqbVar7;
                                            unsafe8 = unsafe10;
                                            i29 = i34;
                                            bArr2 = bArr4;
                                            if (i31 == i29) {
                                            }
                                        } else {
                                            if (i56 == 0) {
                                                int i99 = zzqc.zza;
                                                zzqd zzqdVar2 = (zzqd) zzsuVar9;
                                                int zzl4 = zzqc.zzl(bArr4, i34, zzqbVar7);
                                                zzqdVar2.zze(zzqbVar7.zzb != 0);
                                                while (zzl4 < i35) {
                                                    int zzi15 = zzqc.zzi(bArr4, zzl4, zzqbVar7);
                                                    if (i36 == zzqbVar7.zza) {
                                                        zzl4 = zzqc.zzl(bArr4, zzi15, zzqbVar7);
                                                        zzqdVar2.zze(zzqbVar7.zzb != 0);
                                                    } else {
                                                        i7 = i36;
                                                        i31 = zzl4;
                                                        i30 = i35;
                                                        zzqbVar9 = zzqbVar7;
                                                        unsafe8 = unsafe10;
                                                        i29 = i34;
                                                        bArr2 = bArr4;
                                                        if (i31 == i29) {
                                                        }
                                                    }
                                                }
                                                i7 = i36;
                                                i31 = zzl4;
                                                i30 = i35;
                                                zzqbVar9 = zzqbVar7;
                                                unsafe8 = unsafe10;
                                                i29 = i34;
                                                bArr2 = bArr4;
                                                if (i31 == i29) {
                                                }
                                            }
                                            i7 = i36;
                                            i30 = i35;
                                            zzqbVar9 = zzqbVar7;
                                            unsafe8 = unsafe10;
                                            i29 = i34;
                                            bArr2 = bArr4;
                                            i31 = i29;
                                            if (i31 == i29) {
                                            }
                                        }
                                        break;
                                    case 26:
                                        bArr4 = bArr;
                                        i35 = i2;
                                        unsafe10 = unsafe17;
                                        i36 = i52;
                                        zzsu zzsuVar10 = zzsuVar2;
                                        i34 = i73;
                                        zzqbVar7 = zzqbVar;
                                        if (i56 == 2) {
                                            if ((j & 536870912) == 0) {
                                                zzi4 = zzqc.zzi(bArr4, i34, zzqbVar7);
                                                int i100 = zzqbVar7.zza;
                                                if (i100 < 0) {
                                                    throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i100 == 0) {
                                                    zzsuVar10.add("");
                                                } else {
                                                    zzsuVar10.add(new String(bArr4, zzi4, i100, zzsv.zza));
                                                    zzi4 += i100;
                                                }
                                                while (zzi4 < i35) {
                                                    int zzi16 = zzqc.zzi(bArr4, zzi4, zzqbVar7);
                                                    if (i36 == zzqbVar7.zza) {
                                                        zzi4 = zzqc.zzi(bArr4, zzi16, zzqbVar7);
                                                        int i101 = zzqbVar7.zza;
                                                        if (i101 < 0) {
                                                            throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i101 == 0) {
                                                            zzsuVar10.add("");
                                                        } else {
                                                            zzsuVar10.add(new String(bArr4, zzi4, i101, zzsv.zza));
                                                            zzi4 += i101;
                                                        }
                                                    }
                                                }
                                            } else {
                                                zzi4 = zzqc.zzi(bArr4, i34, zzqbVar7);
                                                int i102 = zzqbVar7.zza;
                                                if (i102 < 0) {
                                                    throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i102 == 0) {
                                                    zzsuVar10.add("");
                                                } else {
                                                    int i103 = zzi4 + i102;
                                                    if (!zzvf.zze(bArr4, zzi4, i103)) {
                                                        throw new zzsx("Protocol message had invalid UTF-8.");
                                                    }
                                                    zzsuVar10.add(new String(bArr4, zzi4, i102, zzsv.zza));
                                                    zzi4 = i103;
                                                }
                                                while (zzi4 < i35) {
                                                    int zzi17 = zzqc.zzi(bArr4, zzi4, zzqbVar7);
                                                    if (i36 == zzqbVar7.zza) {
                                                        zzi4 = zzqc.zzi(bArr4, zzi17, zzqbVar7);
                                                        int i104 = zzqbVar7.zza;
                                                        if (i104 < 0) {
                                                            throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i104 == 0) {
                                                            zzsuVar10.add("");
                                                        } else {
                                                            int i105 = zzi4 + i104;
                                                            if (!zzvf.zze(bArr4, zzi4, i105)) {
                                                                throw new zzsx("Protocol message had invalid UTF-8.");
                                                            }
                                                            zzsuVar10.add(new String(bArr4, zzi4, i104, zzsv.zza));
                                                            zzi4 = i105;
                                                        }
                                                    }
                                                }
                                            }
                                            i7 = i36;
                                            i30 = i35;
                                            zzqbVar9 = zzqbVar7;
                                            i31 = zzi4;
                                            unsafe8 = unsafe10;
                                            i29 = i34;
                                            bArr2 = bArr4;
                                            if (i31 == i29) {
                                            }
                                        }
                                        i7 = i36;
                                        i30 = i35;
                                        zzqbVar9 = zzqbVar7;
                                        unsafe8 = unsafe10;
                                        i29 = i34;
                                        bArr2 = bArr4;
                                        i31 = i29;
                                        if (i31 == i29) {
                                        }
                                        break;
                                    case 27:
                                        unsafe11 = unsafe17;
                                        i37 = i52;
                                        zzsu zzsuVar11 = zzsuVar2;
                                        i38 = i73;
                                        if (i56 == 2) {
                                            i31 = zzqc.zze(zztvVar.zzx(i74), i37, bArr, i38, i2, zzsuVar11, zzqbVar);
                                            i7 = i37;
                                            i30 = i2;
                                            zzqbVar9 = zzqbVar;
                                            unsafe8 = unsafe11;
                                            bArr2 = bArr;
                                            i29 = i38;
                                            if (i31 == i29) {
                                            }
                                        } else {
                                            i30 = i2;
                                            zzqbVar9 = zzqbVar;
                                            bArr2 = bArr;
                                            unsafe8 = unsafe11;
                                            i7 = i37;
                                            i29 = i38;
                                            i31 = i29;
                                            if (i31 == i29) {
                                            }
                                        }
                                        break;
                                    case 28:
                                        i39 = i2;
                                        unsafe11 = unsafe17;
                                        i37 = i52;
                                        zzsu zzsuVar12 = zzsuVar2;
                                        i38 = i73;
                                        if (i56 == 2) {
                                            int zzi18 = zzqc.zzi(bArr, i38, zzqbVar);
                                            int i106 = zzqbVar.zza;
                                            if (i106 < 0) {
                                                throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i106 > bArr.length - zzi18) {
                                                throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (i106 == 0) {
                                                zzsuVar12.add(zzqm.zzb);
                                            } else {
                                                zzsuVar12.add(zzqm.zzl(bArr, zzi18, i106));
                                                zzi18 += i106;
                                            }
                                            while (zzi18 < i39) {
                                                int zzi19 = zzqc.zzi(bArr, zzi18, zzqbVar);
                                                if (i37 == zzqbVar.zza) {
                                                    zzi18 = zzqc.zzi(bArr, zzi19, zzqbVar);
                                                    int i107 = zzqbVar.zza;
                                                    if (i107 < 0) {
                                                        throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i107 > bArr.length - zzi18) {
                                                        throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i107 == 0) {
                                                        zzsuVar12.add(zzqm.zzb);
                                                    } else {
                                                        zzsuVar12.add(zzqm.zzl(bArr, zzi18, i107));
                                                        zzi18 += i107;
                                                    }
                                                } else {
                                                    i31 = zzi18;
                                                    zzqbVar9 = zzqbVar;
                                                    bArr2 = bArr;
                                                    i30 = i39;
                                                    unsafe8 = unsafe11;
                                                    i7 = i37;
                                                    i29 = i38;
                                                    if (i31 == i29) {
                                                    }
                                                }
                                            }
                                            i31 = zzi18;
                                            zzqbVar9 = zzqbVar;
                                            bArr2 = bArr;
                                            i30 = i39;
                                            unsafe8 = unsafe11;
                                            i7 = i37;
                                            i29 = i38;
                                            if (i31 == i29) {
                                            }
                                        } else {
                                            zzqbVar9 = zzqbVar;
                                            bArr2 = bArr;
                                            i30 = i39;
                                            unsafe8 = unsafe11;
                                            i7 = i37;
                                            i29 = i38;
                                            i31 = i29;
                                            if (i31 == i29) {
                                            }
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        zzqbVar9 = zzqbVar;
                                        unsafe11 = unsafe17;
                                        i40 = i73;
                                        if (i56 == 2) {
                                            int zzf = zzqc.zzf(bArr, i40, zzsuVar2, zzqbVar9);
                                            bArr5 = bArr;
                                            i37 = i52;
                                            zzsuVar = zzsuVar2;
                                            i38 = i40;
                                            i41 = zzf;
                                            zzqbVar8 = zzqbVar9;
                                            i39 = i2;
                                        } else if (i56 == 0) {
                                            zzsuVar = zzsuVar2;
                                            int zzk2 = zzqc.zzk(i52, bArr, i40, i2, zzsuVar, zzqbVar9);
                                            i37 = i52;
                                            bArr5 = bArr;
                                            i38 = i40;
                                            i39 = i2;
                                            zzqbVar8 = zzqbVar9;
                                            i41 = zzk2;
                                        } else {
                                            bArr2 = bArr;
                                            i30 = i2;
                                            unsafe8 = unsafe11;
                                            i7 = i52;
                                            i29 = i40;
                                            i31 = i29;
                                            if (i31 == i29) {
                                            }
                                        }
                                        zzui.zzn(obj, i55, zzsuVar, zztvVar.zzw(i74), null, zztvVar.zzm);
                                        zzqbVar9 = zzqbVar8;
                                        bArr2 = bArr5;
                                        i31 = i41;
                                        i30 = i39;
                                        unsafe8 = unsafe11;
                                        i7 = i37;
                                        i29 = i38;
                                        if (i31 == i29) {
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        bArr6 = bArr;
                                        i42 = i2;
                                        zzqbVar9 = zzqbVar;
                                        unsafe12 = unsafe17;
                                        i40 = i73;
                                        if (i56 == 2) {
                                            int i108 = zzqc.zza;
                                            zzso zzsoVar3 = (zzso) zzsuVar2;
                                            zzi5 = zzqc.zzi(bArr6, i40, zzqbVar9);
                                            int i109 = zzqbVar9.zza + zzi5;
                                            while (zzi5 < i109) {
                                                zzi5 = zzqc.zzi(bArr6, zzi5, zzqbVar9);
                                                zzsoVar3.zzh(zzqq.zzF(zzqbVar9.zza));
                                            }
                                            if (zzi5 != i109) {
                                                throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            if (i56 == 0) {
                                                int i110 = zzqc.zza;
                                                zzso zzsoVar4 = (zzso) zzsuVar2;
                                                zzi5 = zzqc.zzi(bArr6, i40, zzqbVar9);
                                                zzsoVar4.zzh(zzqq.zzF(zzqbVar9.zza));
                                                while (zzi5 < i42) {
                                                    int zzi20 = zzqc.zzi(bArr6, zzi5, zzqbVar9);
                                                    if (i52 == zzqbVar9.zza) {
                                                        zzi5 = zzqc.zzi(bArr6, zzi20, zzqbVar9);
                                                        zzsoVar4.zzh(zzqq.zzF(zzqbVar9.zza));
                                                    }
                                                }
                                            }
                                            i30 = i42;
                                            i7 = i52;
                                            unsafe8 = unsafe12;
                                            bArr2 = bArr6;
                                            i29 = i40;
                                            i31 = i29;
                                            if (i31 == i29) {
                                            }
                                        }
                                        i31 = zzi5;
                                        i30 = i42;
                                        i7 = i52;
                                        unsafe8 = unsafe12;
                                        bArr2 = bArr6;
                                        i29 = i40;
                                        if (i31 == i29) {
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        bArr6 = bArr;
                                        i42 = i2;
                                        zzqbVar9 = zzqbVar;
                                        unsafe12 = unsafe17;
                                        i40 = i73;
                                        if (i56 == 2) {
                                            int i111 = zzqc.zza;
                                            zzth zzthVar5 = (zzth) zzsuVar2;
                                            zzi5 = zzqc.zzi(bArr6, i40, zzqbVar9);
                                            int i112 = zzqbVar9.zza + zzi5;
                                            while (zzi5 < i112) {
                                                zzi5 = zzqc.zzl(bArr6, zzi5, zzqbVar9);
                                                zzthVar5.zzg(zzqq.zzG(zzqbVar9.zzb));
                                            }
                                            if (zzi5 != i112) {
                                                throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            if (i56 == 0) {
                                                int i113 = zzqc.zza;
                                                zzth zzthVar6 = (zzth) zzsuVar2;
                                                zzi5 = zzqc.zzl(bArr6, i40, zzqbVar9);
                                                zzthVar6.zzg(zzqq.zzG(zzqbVar9.zzb));
                                                while (zzi5 < i42) {
                                                    int zzi21 = zzqc.zzi(bArr6, zzi5, zzqbVar9);
                                                    if (i52 == zzqbVar9.zza) {
                                                        zzi5 = zzqc.zzl(bArr6, zzi21, zzqbVar9);
                                                        zzthVar6.zzg(zzqq.zzG(zzqbVar9.zzb));
                                                    }
                                                }
                                            }
                                            i30 = i42;
                                            i7 = i52;
                                            unsafe8 = unsafe12;
                                            bArr2 = bArr6;
                                            i29 = i40;
                                            i31 = i29;
                                            if (i31 == i29) {
                                            }
                                        }
                                        i31 = zzi5;
                                        i30 = i42;
                                        i7 = i52;
                                        unsafe8 = unsafe12;
                                        bArr2 = bArr6;
                                        i29 = i40;
                                        if (i31 == i29) {
                                        }
                                        break;
                                    default:
                                        if (i56 == 3) {
                                            int i114 = (i52 & (-8)) | 4;
                                            zzug zzx = zztvVar.zzx(i74);
                                            zzqbVar9 = zzqbVar;
                                            unsafe12 = unsafe17;
                                            byte[] bArr8 = bArr;
                                            int zzc = zzqc.zzc(zzx, bArr8, i73, i2, i114, zzqbVar9);
                                            i40 = i73;
                                            zzsuVar2.add(zzqbVar9.zzc);
                                            while (zzc < i2) {
                                                int zzi22 = zzqc.zzi(bArr8, zzc, zzqbVar9);
                                                if (i52 == zzqbVar9.zza) {
                                                    zzc = zzqc.zzc(zzx, bArr8, zzi22, i2, i114, zzqbVar9);
                                                    zzsuVar2.add(zzqbVar9.zzc);
                                                    bArr8 = bArr8;
                                                } else {
                                                    bArr6 = bArr8;
                                                    i30 = i2;
                                                    i7 = i52;
                                                    i31 = zzc;
                                                    unsafe8 = unsafe12;
                                                    bArr2 = bArr6;
                                                    i29 = i40;
                                                    if (i31 == i29) {
                                                    }
                                                }
                                            }
                                            bArr6 = bArr8;
                                            i30 = i2;
                                            i7 = i52;
                                            i31 = zzc;
                                            unsafe8 = unsafe12;
                                            bArr2 = bArr6;
                                            i29 = i40;
                                            if (i31 == i29) {
                                            }
                                        } else {
                                            zzqbVar9 = zzqbVar;
                                            i7 = i52;
                                            i29 = i73;
                                            bArr2 = bArr;
                                            unsafe8 = unsafe17;
                                            i30 = i2;
                                            i31 = i29;
                                            if (i31 == i29) {
                                            }
                                        }
                                        break;
                                }
                            }
                        } else if (i56 == 2) {
                            zzsu zzsuVar13 = (zzsu) unsafe17.getObject(obj14, j2);
                            if (!zzsuVar13.zzc()) {
                                int size2 = zzsuVar13.size();
                                zzsuVar13 = zzsuVar13.zzd(size2 == 0 ? 10 : size2 + size2);
                                unsafe17.putObject(obj14, j2, zzsuVar13);
                            }
                            int zze = zzqc.zze(zztvVar.zzx(i74), i52, bArr, i73, i2, zzsuVar13, zzqbVar);
                            bArr7 = bArr;
                            i43 = i2;
                            zzqbVar9 = zzqbVar;
                            i52 = i52;
                            obj6 = obj;
                            i47 = i55;
                            i44 = 3;
                            i45 = -1;
                            i51 = 1;
                            i46 = zze;
                            unsafe13 = unsafe17;
                            i48 = i74;
                        } else {
                            bArr2 = bArr;
                            zzqbVar5 = zzqbVar;
                            obj5 = obj14;
                            unsafe7 = unsafe17;
                            i6 = i49;
                            i24 = i50;
                            i7 = i52;
                            i47 = i55;
                            i25 = i73;
                            unsafe = unsafe7;
                            zzqbVar2 = zzqbVar5;
                            i8 = i74;
                            i9 = i25;
                            i50 = i24;
                            i4 = i3;
                            obj2 = obj5;
                        }
                        if (i7 != i4) {
                        }
                        if (zztvVar.zzh) {
                        }
                        zzqb zzqbVar1222222222222222 = zzqbVar2;
                        i10 = i47;
                        i11 = i7;
                        i12 = i8;
                        i9 = zzqc.zzh(i11, bArr2, i9, i2, zzd(obj2), zzqbVar1222222222222222);
                        i13 = i2;
                        i46 = i9;
                        bArr7 = bArr;
                        i52 = i11;
                        i43 = i13;
                        i48 = i12;
                        unsafe13 = unsafe;
                        obj6 = obj2;
                        i49 = i6;
                        i47 = i10;
                        i44 = 3;
                        i45 = -1;
                        i51 = 1;
                        zzqbVar9 = zzqbVar;
                    }
                }
                i4 = i3;
                if (i7 != i4) {
                }
                if (zztvVar.zzh) {
                }
                zzqb zzqbVar12222222222222222 = zzqbVar2;
                i10 = i47;
                i11 = i7;
                i12 = i8;
                i9 = zzqc.zzh(i11, bArr2, i9, i2, zzd(obj2), zzqbVar12222222222222222);
                i13 = i2;
                i46 = i9;
                bArr7 = bArr;
                i52 = i11;
                i43 = i13;
                i48 = i12;
                unsafe13 = unsafe;
                obj6 = obj2;
                i49 = i6;
                i47 = i10;
                i44 = 3;
                i45 = -1;
                i51 = 1;
                zzqbVar9 = zzqbVar;
            } else {
                i4 = i3;
                unsafe = unsafe13;
                i5 = i43;
                i6 = i49;
                obj2 = obj6;
                i7 = i52;
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

    /* JADX WARN: Code restructure failed: missing block: B:32:0x003e, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x084f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0876 A[LOOP:3: B:54:0x0872->B:56:0x0876, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0842 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // com.google.android.recaptcha.internal.zzug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(Object obj, zzuf zzufVar, zzry zzryVar) {
        Object obj2;
        zztv<T> zztvVar;
        Object obj3;
        int i;
        int i2;
        zzuv zzuvVar;
        zzuv zzuvVar2;
        Object obj4;
        zzuv zzuvVar3;
        Object obj5;
        Object valueOf;
        int ordinal;
        Object zze;
        Object obj6;
        Object obj7;
        zztv<T> zztvVar2 = this;
        boolean z = true;
        zzryVar.getClass();
        zzD(obj);
        zzuv zzuvVar4 = zztvVar2.zzm;
        ?? r9 = 0;
        Object obj8 = null;
        zzsd zzsdVar = null;
        while (true) {
            try {
                int zzc = zzufVar.zzc();
                int zzq = zztvVar2.zzq(zzc);
                if (zzq >= 0) {
                    obj5 = obj;
                    zzuvVar3 = zzuvVar4;
                    obj4 = obj8;
                    try {
                        int zzu = zztvVar2.zzu(zzq);
                        try {
                        } catch (zzsw unused) {
                            zztvVar = zztvVar2;
                            obj3 = obj4;
                            zzuvVar4 = zzuvVar3;
                            obj2 = obj5;
                        }
                        switch (zzt(zzu)) {
                            case 0:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzvc.zzo(obj5, zzu & 1048575, zzufVar.zza());
                                zztvVar.zzH(obj5, zzq);
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 1:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzvc.zzp(obj5, zzu & 1048575, zzufVar.zzb());
                                zztvVar.zzH(obj5, zzq);
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 2:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzvc.zzr(obj5, zzu & 1048575, zzufVar.zzl());
                                zztvVar.zzH(obj5, zzq);
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 3:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzvc.zzr(obj5, zzu & 1048575, zzufVar.zzo());
                                zztvVar.zzH(obj5, zzq);
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 4:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzvc.zzq(obj5, zzu & 1048575, zzufVar.zzg());
                                zztvVar.zzH(obj5, zzq);
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 5:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzvc.zzr(obj5, zzu & 1048575, zzufVar.zzk());
                                zztvVar.zzH(obj5, zzq);
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 6:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzvc.zzq(obj5, zzu & 1048575, zzufVar.zzf());
                                zztvVar.zzH(obj5, zzq);
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 7:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzvc.zzm(obj5, zzu & 1048575, zzufVar.zzN());
                                zztvVar.zzH(obj5, zzq);
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 8:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zztvVar.zzG(obj5, zzu, zzufVar);
                                zztvVar.zzH(obj5, zzq);
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 9:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzts zztsVar = (zzts) zztvVar.zzA(obj5, zzq);
                                zzufVar.zzu(zztsVar, zztvVar.zzx(zzq), zzryVar);
                                zztvVar.zzJ(obj5, zzq, zztsVar);
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 10:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzvc.zzs(obj5, zzu & 1048575, zzufVar.zzp());
                                zztvVar.zzH(obj5, zzq);
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 11:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzvc.zzq(obj5, zzu & 1048575, zzufVar.zzj());
                                zztvVar.zzH(obj5, zzq);
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 12:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                int zze2 = zzufVar.zze();
                                zzsr zzw = zztvVar.zzw(zzq);
                                if (zzw != null && !zzw.zza(zze2)) {
                                    obj8 = zzui.zzo(obj5, zzc, zze2, obj3, zzuvVar4);
                                    zztvVar2 = zztvVar;
                                    z = true;
                                    r9 = 0;
                                }
                                zzvc.zzq(obj5, zzu & 1048575, zze2);
                                zztvVar.zzH(obj5, zzq);
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                                break;
                            case 13:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzvc.zzq(obj5, zzu & 1048575, zzufVar.zzh());
                                zztvVar.zzH(obj5, zzq);
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 14:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzvc.zzr(obj5, zzu & 1048575, zzufVar.zzm());
                                zztvVar.zzH(obj5, zzq);
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 15:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzvc.zzq(obj5, zzu & 1048575, zzufVar.zzi());
                                zztvVar.zzH(obj5, zzq);
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 16:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                obj2 = obj5;
                                try {
                                    i = 1;
                                } catch (zzsw unused2) {
                                    i = 1;
                                    obj8 = obj3;
                                    if (obj8 == null) {
                                    }
                                    if (!zzuvVar4.zzk(obj8, zzufVar, 0)) {
                                    }
                                    zztvVar2 = zztvVar;
                                    z = true;
                                    r9 = 0;
                                }
                                try {
                                    zzvc.zzr(obj2, zzu & 1048575, zzufVar.zzn());
                                    zztvVar.zzH(obj2, zzq);
                                    obj8 = obj3;
                                } catch (zzsw unused3) {
                                    obj8 = obj3;
                                    if (obj8 == null) {
                                    }
                                    if (!zzuvVar4.zzk(obj8, zzufVar, 0)) {
                                    }
                                    zztvVar2 = zztvVar;
                                    z = true;
                                    r9 = 0;
                                } catch (Throwable th) {
                                    th = th;
                                    obj8 = obj3;
                                    i2 = zztvVar.zzk;
                                    while (i2 < zztvVar.zzl) {
                                    }
                                    if (obj8 != null) {
                                    }
                                    throw th;
                                }
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                                break;
                            case 17:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzts zztsVar2 = (zzts) zztvVar.zzA(obj5, zzq);
                                zzufVar.zzt(zztsVar2, zztvVar.zzx(zzq), zzryVar);
                                zztvVar.zzJ(obj5, zzq, zztsVar2);
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 18:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzufVar.zzx(zztf.zza(obj5, zzu & 1048575));
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 19:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzufVar.zzB(zztf.zza(obj5, zzu & 1048575));
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 20:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzufVar.zzE(zztf.zza(obj5, zzu & 1048575));
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 21:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzufVar.zzM(zztf.zza(obj5, zzu & 1048575));
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 22:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzufVar.zzD(zztf.zza(obj5, zzu & 1048575));
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 23:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzufVar.zzA(zztf.zza(obj5, zzu & 1048575));
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 24:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzufVar.zzz(zztf.zza(obj5, zzu & 1048575));
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 25:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzufVar.zzv(zztf.zza(obj5, zzu & 1048575));
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 26:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                if (zzM(zzu)) {
                                    ((zzqr) zzufVar).zzK(zztf.zza(obj5, zzu & 1048575), z);
                                } else {
                                    ((zzqr) zzufVar).zzK(zztf.zza(obj5, zzu & 1048575), false);
                                }
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 27:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzufVar.zzF(zztf.zza(obj5, zzu & 1048575), zztvVar.zzx(zzq), zzryVar);
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 28:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzufVar.zzw(zztf.zza(obj5, zzu & 1048575));
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 29:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzufVar.zzL(zztf.zza(obj5, zzu & 1048575));
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 30:
                                zztvVar = zztvVar2;
                                List zza2 = zztf.zza(obj5, zzu & 1048575);
                                zzufVar.zzy(zza2);
                                zzuvVar2 = zzuvVar3;
                                obj8 = zzui.zzn(obj5, zzc, zza2, zztvVar.zzw(zzq), obj4, zzuvVar2);
                                zzuvVar4 = zzuvVar2;
                                zztvVar2 = zztvVar;
                            case 31:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzufVar.zzG(zztf.zza(obj5, zzu & 1048575));
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 32:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzufVar.zzH(zztf.zza(obj5, zzu & 1048575));
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 33:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzufVar.zzI(zztf.zza(obj5, zzu & 1048575));
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 34:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzufVar.zzJ(zztf.zza(obj5, zzu & 1048575));
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 35:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzufVar.zzx(zztf.zza(obj5, zzu & 1048575));
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 36:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzufVar.zzB(zztf.zza(obj5, zzu & 1048575));
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 37:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzufVar.zzE(zztf.zza(obj5, zzu & 1048575));
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 38:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzufVar.zzM(zztf.zza(obj5, zzu & 1048575));
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 39:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzufVar.zzD(zztf.zza(obj5, zzu & 1048575));
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 40:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzufVar.zzA(zztf.zza(obj5, zzu & 1048575));
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 41:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzufVar.zzz(zztf.zza(obj5, zzu & 1048575));
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 42:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                zzufVar.zzv(zztf.zza(obj5, zzu & 1048575));
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 43:
                                zztvVar = zztvVar2;
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar3;
                                obj2 = obj5;
                                try {
                                    try {
                                        zzufVar.zzL(zztf.zza(obj2, zzu & 1048575));
                                        obj8 = obj3;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        i = 1;
                                        obj8 = obj3;
                                        i2 = zztvVar.zzk;
                                        while (i2 < zztvVar.zzl) {
                                        }
                                        if (obj8 != null) {
                                        }
                                        throw th;
                                    }
                                } catch (zzsw unused4) {
                                    i = 1;
                                    obj8 = obj3;
                                    if (obj8 == null) {
                                    }
                                    if (!zzuvVar4.zzk(obj8, zzufVar, 0)) {
                                    }
                                    zztvVar2 = zztvVar;
                                    z = true;
                                    r9 = 0;
                                }
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                                break;
                            case 44:
                                zztvVar = zztvVar2;
                                zzuvVar2 = zzuvVar3;
                                try {
                                    List zza3 = zztf.zza(obj5, zzu & 1048575);
                                    zzufVar.zzy(zza3);
                                    obj8 = zzui.zzn(obj5, zzc, zza3, zztvVar.zzw(zzq), obj4, zzuvVar2);
                                    zzuvVar4 = zzuvVar2;
                                    zztvVar2 = zztvVar;
                                } catch (zzsw unused5) {
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzuvVar4 = zzuvVar2;
                                    i = 1;
                                    obj8 = obj3;
                                    if (obj8 == null) {
                                    }
                                    if (!zzuvVar4.zzk(obj8, zzufVar, 0)) {
                                    }
                                    zztvVar2 = zztvVar;
                                    z = true;
                                    r9 = 0;
                                }
                                break;
                            case 45:
                                zztvVar = zztvVar2;
                                obj6 = obj5;
                                zzuvVar2 = zzuvVar3;
                                zzufVar.zzG(zztf.zza(obj6, zzu & 1048575));
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar2;
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 46:
                                zztvVar = zztvVar2;
                                obj6 = obj5;
                                zzuvVar2 = zzuvVar3;
                                zzufVar.zzH(zztf.zza(obj6, zzu & 1048575));
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar2;
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 47:
                                zztvVar = zztvVar2;
                                obj6 = obj5;
                                zzuvVar2 = zzuvVar3;
                                zzufVar.zzI(zztf.zza(obj6, zzu & 1048575));
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar2;
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 48:
                                zztvVar = zztvVar2;
                                obj6 = obj5;
                                zzuvVar2 = zzuvVar3;
                                zzufVar.zzJ(zztf.zza(obj6, zzu & 1048575));
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar2;
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 49:
                                zztvVar = zztvVar2;
                                obj6 = obj5;
                                zzuvVar2 = zzuvVar3;
                                zzufVar.zzC(zztf.zza(obj6, zzu & 1048575), zztvVar.zzx(zzq), zzryVar);
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar2;
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 50:
                                zztvVar = zztvVar2;
                                obj6 = obj5;
                                zzuvVar2 = zzuvVar3;
                                Object zzz = zztvVar.zzz(zzq);
                                long zzu2 = zztvVar.zzu(zzq) & 1048575;
                                Object zzf = zzvc.zzf(obj6, zzu2);
                                if (zzf != null) {
                                    boolean zza4 = zztn.zza(zzf);
                                    obj7 = zzf;
                                    if (zza4) {
                                        zztm zzb2 = zztm.zza().zzb();
                                        zztn.zzb(zzb2, zzf);
                                        zzvc.zzs(obj6, zzu2, zzb2);
                                        obj7 = zzb2;
                                    }
                                } else {
                                    zztm zzb3 = zztm.zza().zzb();
                                    zzvc.zzs(obj6, zzu2, zzb3);
                                    obj7 = zzb3;
                                }
                                throw r9;
                                break;
                            case 51:
                                zztvVar = zztvVar2;
                                obj6 = obj5;
                                zzuvVar2 = zzuvVar3;
                                zzvc.zzs(obj6, zzu & 1048575, Double.valueOf(zzufVar.zza()));
                                zztvVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar2;
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 52:
                                zztvVar = zztvVar2;
                                obj6 = obj5;
                                zzuvVar2 = zzuvVar3;
                                zzvc.zzs(obj6, zzu & 1048575, Float.valueOf(zzufVar.zzb()));
                                zztvVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar2;
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 53:
                                zztvVar = zztvVar2;
                                obj6 = obj5;
                                zzuvVar2 = zzuvVar3;
                                zzvc.zzs(obj6, zzu & 1048575, Long.valueOf(zzufVar.zzl()));
                                zztvVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar2;
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 54:
                                zztvVar = zztvVar2;
                                obj6 = obj5;
                                zzuvVar2 = zzuvVar3;
                                zzvc.zzs(obj6, zzu & 1048575, Long.valueOf(zzufVar.zzo()));
                                zztvVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar2;
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 55:
                                zztvVar = zztvVar2;
                                obj6 = obj5;
                                zzuvVar2 = zzuvVar3;
                                zzvc.zzs(obj6, zzu & 1048575, Integer.valueOf(zzufVar.zzg()));
                                zztvVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar2;
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 56:
                                zztvVar = zztvVar2;
                                obj6 = obj5;
                                zzuvVar2 = zzuvVar3;
                                zzvc.zzs(obj6, zzu & 1048575, Long.valueOf(zzufVar.zzk()));
                                zztvVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar2;
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 57:
                                zztvVar = zztvVar2;
                                obj6 = obj5;
                                zzuvVar2 = zzuvVar3;
                                zzvc.zzs(obj6, zzu & 1048575, Integer.valueOf(zzufVar.zzf()));
                                zztvVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar2;
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 58:
                                zztvVar = zztvVar2;
                                obj6 = obj5;
                                zzuvVar2 = zzuvVar3;
                                zzvc.zzs(obj6, zzu & 1048575, Boolean.valueOf(zzufVar.zzN()));
                                zztvVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar2;
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 59:
                                zztvVar = zztvVar2;
                                obj6 = obj5;
                                zzuvVar2 = zzuvVar3;
                                zztvVar.zzG(obj6, zzu, zzufVar);
                                zztvVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar2;
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 60:
                                zztvVar = zztvVar2;
                                obj6 = obj5;
                                zzuvVar2 = zzuvVar3;
                                zzts zztsVar3 = (zzts) zztvVar.zzB(obj6, zzc, zzq);
                                zzufVar.zzu(zztsVar3, zztvVar.zzx(zzq), zzryVar);
                                zztvVar.zzK(obj6, zzc, zzq, zztsVar3);
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar2;
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 61:
                                zztvVar = zztvVar2;
                                obj6 = obj5;
                                zzuvVar2 = zzuvVar3;
                                zzvc.zzs(obj6, zzu & 1048575, zzufVar.zzp());
                                zztvVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar2;
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 62:
                                zztvVar = zztvVar2;
                                obj6 = obj5;
                                zzuvVar2 = zzuvVar3;
                                zzvc.zzs(obj6, zzu & 1048575, Integer.valueOf(zzufVar.zzj()));
                                zztvVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar2;
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 63:
                                zztvVar = zztvVar2;
                                obj6 = obj5;
                                zzuvVar2 = zzuvVar3;
                                int zze3 = zzufVar.zze();
                                zzsr zzw2 = zztvVar.zzw(zzq);
                                if (zzw2 != null && !zzw2.zza(zze3)) {
                                    obj8 = zzui.zzo(obj6, zzc, zze3, obj4, zzuvVar2);
                                    zzuvVar4 = zzuvVar2;
                                    zztvVar2 = zztvVar;
                                }
                                zzvc.zzs(obj6, zzu & 1048575, Integer.valueOf(zze3));
                                zztvVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar2;
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                                break;
                            case 64:
                                zztvVar = zztvVar2;
                                obj6 = obj5;
                                zzuvVar2 = zzuvVar3;
                                zzvc.zzs(obj6, zzu & 1048575, Integer.valueOf(zzufVar.zzh()));
                                zztvVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar2;
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 65:
                                zztvVar = zztvVar2;
                                obj6 = obj5;
                                zzuvVar2 = zzuvVar3;
                                zzvc.zzs(obj6, zzu & 1048575, Long.valueOf(zzufVar.zzm()));
                                zztvVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar2;
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 66:
                                zztvVar = zztvVar2;
                                obj6 = obj5;
                                zzuvVar2 = zzuvVar3;
                                zzvc.zzs(obj6, zzu & 1048575, Integer.valueOf(zzufVar.zzi()));
                                zztvVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar2;
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 67:
                                zztvVar = zztvVar2;
                                obj6 = obj5;
                                zzuvVar2 = zzuvVar3;
                                zzvc.zzs(obj6, zzu & 1048575, Long.valueOf(zzufVar.zzn()));
                                zztvVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzuvVar4 = zzuvVar2;
                                obj8 = obj3;
                                zztvVar2 = zztvVar;
                                z = true;
                                r9 = 0;
                            case 68:
                                zztvVar = zztvVar2;
                                obj6 = obj5;
                                zzuvVar2 = zzuvVar3;
                                try {
                                    try {
                                        zzts zztsVar4 = (zzts) zztvVar.zzB(obj6, zzc, zzq);
                                        zzufVar.zzt(zztsVar4, zztvVar.zzx(zzq), zzryVar);
                                        zztvVar.zzK(obj6, zzc, zzq, zztsVar4);
                                        obj3 = obj4;
                                        zzuvVar4 = zzuvVar2;
                                        obj8 = obj3;
                                    } catch (zzsw unused6) {
                                        obj2 = obj6;
                                        obj3 = obj4;
                                        zzuvVar4 = zzuvVar2;
                                        i = 1;
                                        obj8 = obj3;
                                        if (obj8 == null) {
                                            try {
                                                obj8 = zzuvVar4.zza(obj2);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                i2 = zztvVar.zzk;
                                                while (i2 < zztvVar.zzl) {
                                                }
                                                if (obj8 != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                        if (!zzuvVar4.zzk(obj8, zzufVar, 0)) {
                                            for (int i3 = zztvVar.zzk; i3 < zztvVar.zzl; i3 += i) {
                                                zztvVar.zzy(obj2, zztvVar.zzj[i3], obj8, zzuvVar4, obj);
                                            }
                                            if (obj8 == null) {
                                            }
                                        }
                                        zztvVar2 = zztvVar;
                                        z = true;
                                        r9 = 0;
                                    }
                                    zztvVar2 = zztvVar;
                                    z = true;
                                    r9 = 0;
                                } catch (Throwable th4) {
                                    th = th4;
                                    obj2 = obj6;
                                    obj3 = obj4;
                                    zzuvVar4 = zzuvVar2;
                                    i = 1;
                                    obj8 = obj3;
                                    i2 = zztvVar.zzk;
                                    while (i2 < zztvVar.zzl) {
                                    }
                                    if (obj8 != null) {
                                    }
                                    throw th;
                                }
                                break;
                            default:
                                if (obj4 == null) {
                                    try {
                                        obj8 = zzuvVar3.zza(obj5);
                                    } catch (zzsw unused7) {
                                        zztvVar = zztvVar2;
                                        obj3 = obj4;
                                        zzuvVar4 = zzuvVar3;
                                        obj2 = obj5;
                                        i = 1;
                                        obj8 = obj3;
                                        if (obj8 == null) {
                                        }
                                        if (!zzuvVar4.zzk(obj8, zzufVar, 0)) {
                                        }
                                        zztvVar2 = zztvVar;
                                        z = true;
                                        r9 = 0;
                                    }
                                } else {
                                    obj8 = obj4;
                                }
                                try {
                                } catch (zzsw unused8) {
                                    zztvVar = zztvVar2;
                                    obj2 = obj5;
                                    zzuvVar4 = zzuvVar3;
                                    i = 1;
                                    if (obj8 == null) {
                                    }
                                    if (!zzuvVar4.zzk(obj8, zzufVar, 0)) {
                                    }
                                    zztvVar2 = zztvVar;
                                    z = true;
                                    r9 = 0;
                                } catch (Throwable th5) {
                                    th = th5;
                                    zztvVar = zztvVar2;
                                    obj2 = obj5;
                                    zzuvVar4 = zzuvVar3;
                                    i = 1;
                                    i2 = zztvVar.zzk;
                                    while (i2 < zztvVar.zzl) {
                                    }
                                    if (obj8 != null) {
                                    }
                                    throw th;
                                }
                                if (!zzuvVar3.zzk(obj8, zzufVar, 0)) {
                                    int i4 = zztvVar2.zzk;
                                    while (i4 < zztvVar2.zzl) {
                                        zzuv zzuvVar5 = zzuvVar3;
                                        zztvVar2.zzy(obj, zztvVar2.zzj[i4], obj8, zzuvVar5, obj);
                                        i4 += z ? 1 : 0;
                                        obj5 = obj;
                                        zztvVar2 = zztvVar2;
                                        zzuvVar3 = zzuvVar5;
                                    }
                                    Object obj9 = obj5;
                                    zzuvVar = zzuvVar3;
                                    obj2 = obj9;
                                    break;
                                } else {
                                    zztvVar = zztvVar2;
                                    zzuvVar2 = zzuvVar3;
                                    zzuvVar4 = zzuvVar2;
                                    zztvVar2 = zztvVar;
                                }
                                break;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        zzuv zzuvVar6 = zzuvVar3;
                        zztvVar = zztvVar2;
                        obj3 = obj4;
                        zzuvVar4 = zzuvVar6;
                        obj2 = obj5;
                        i = 1;
                        obj8 = obj3;
                        i2 = zztvVar.zzk;
                        while (i2 < zztvVar.zzl) {
                        }
                        if (obj8 != null) {
                        }
                        throw th;
                    }
                } else if (zzc == Integer.MAX_VALUE) {
                    int i5 = zztvVar2.zzk;
                    while (i5 < zztvVar2.zzl) {
                        zztvVar2.zzy(obj, zztvVar2.zzj[i5], obj8, zzuvVar4, obj);
                        i5 += z ? 1 : 0;
                        zzuvVar4 = zzuvVar4;
                    }
                    zzuvVar = zzuvVar4;
                    obj2 = obj;
                } else {
                    Object obj10 = obj;
                    zzuvVar2 = zzuvVar4;
                    obj4 = obj8;
                    try {
                        zzsm zza5 = !zztvVar2.zzh ? r9 : zzryVar.zza(zztvVar2.zzg, zzc);
                        if (zza5 != null) {
                            if (zzsdVar == null) {
                                try {
                                    zzsdVar = ((zzsk) obj10).zzi();
                                } catch (Throwable th7) {
                                    th = th7;
                                    zztvVar = zztvVar2;
                                    obj2 = obj10;
                                    obj3 = obj4;
                                    zzuvVar4 = zzuvVar2;
                                    i = 1;
                                    obj8 = obj3;
                                    i2 = zztvVar.zzk;
                                    while (i2 < zztvVar.zzl) {
                                    }
                                    if (obj8 != null) {
                                    }
                                    throw th;
                                }
                            }
                            zzsl zzslVar = zza5.zza;
                            zzvg zzvgVar = zzvg.zzn;
                            zzvg zzvgVar2 = zzslVar.zzb;
                            if (zzvgVar2 == zzvgVar) {
                                zzufVar.zzg();
                                throw r9;
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
                                    obj8 = obj4;
                                    zzuvVar4 = zzuvVar2;
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
                                    obj8 = obj4;
                                    zzuvVar4 = zzuvVar2;
                                    break;
                                case 2:
                                    valueOf = Long.valueOf(zzufVar.zzl());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj8 = obj4;
                                    zzuvVar4 = zzuvVar2;
                                    break;
                                case 3:
                                    valueOf = Long.valueOf(zzufVar.zzo());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj8 = obj4;
                                    zzuvVar4 = zzuvVar2;
                                    break;
                                case 4:
                                    valueOf = Integer.valueOf(zzufVar.zzg());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr2222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj8 = obj4;
                                    zzuvVar4 = zzuvVar2;
                                    break;
                                case 5:
                                    valueOf = Long.valueOf(zzufVar.zzk());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj8 = obj4;
                                    zzuvVar4 = zzuvVar2;
                                    break;
                                case 6:
                                    valueOf = Integer.valueOf(zzufVar.zzf());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj8 = obj4;
                                    zzuvVar4 = zzuvVar2;
                                    break;
                                case 7:
                                    valueOf = Boolean.valueOf(zzufVar.zzN());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr2222222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj8 = obj4;
                                    zzuvVar4 = zzuvVar2;
                                    break;
                                case 8:
                                    valueOf = zzufVar.zzr();
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22222222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj8 = obj4;
                                    zzuvVar4 = zzuvVar2;
                                    break;
                                case 9:
                                    Object zze4 = zzsdVar.zze(zzslVar);
                                    if (!(zze4 instanceof zzsn)) {
                                        throw r9;
                                    }
                                    zzug zzb4 = zzuc.zza().zzb(zze4.getClass());
                                    if (!((zzsn) zze4).zzL()) {
                                        Object zze5 = zzb4.zze();
                                        zzb4.zzg(zze5, zze4);
                                        zzsdVar.zzi(zzslVar, zze5);
                                        zze4 = zze5;
                                    }
                                    zzufVar.zzt(zze4, zzb4, zzryVar);
                                    obj8 = obj4;
                                    zzuvVar4 = zzuvVar2;
                                    break;
                                case 10:
                                    Object zze6 = zzsdVar.zze(zzslVar);
                                    if (!(zze6 instanceof zzsn)) {
                                        throw r9;
                                    }
                                    zzug zzb5 = zzuc.zza().zzb(zze6.getClass());
                                    if (!((zzsn) zze6).zzL()) {
                                        Object zze7 = zzb5.zze();
                                        zzb5.zzg(zze7, zze6);
                                        zzsdVar.zzi(zzslVar, zze7);
                                        zze6 = zze7;
                                    }
                                    zzufVar.zzu(zze6, zzb5, zzryVar);
                                    obj8 = obj4;
                                    zzuvVar4 = zzuvVar2;
                                    break;
                                case 11:
                                    valueOf = zzufVar.zzp();
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222222222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj8 = obj4;
                                    zzuvVar4 = zzuvVar2;
                                    break;
                                case 12:
                                    valueOf = Integer.valueOf(zzufVar.zzj());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr2222222222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj8 = obj4;
                                    zzuvVar4 = zzuvVar2;
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
                                    obj8 = obj4;
                                    zzuvVar4 = zzuvVar2;
                                    break;
                                case 15:
                                    valueOf = Long.valueOf(zzufVar.zzm());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222222222222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj8 = obj4;
                                    zzuvVar4 = zzuvVar2;
                                    break;
                                case 16:
                                    valueOf = Integer.valueOf(zzufVar.zzi());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr2222222222222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj8 = obj4;
                                    zzuvVar4 = zzuvVar2;
                                    break;
                                case 17:
                                    valueOf = Long.valueOf(zzufVar.zzn());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22222222222222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj8 = obj4;
                                    zzuvVar4 = zzuvVar2;
                                    break;
                                default:
                                    valueOf = r9;
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222222222222222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj8 = obj4;
                                    zzuvVar4 = zzuvVar2;
                                    break;
                            }
                        } else {
                            obj8 = obj4 == null ? zzuvVar2.zza(obj10) : obj4;
                            try {
                                if (zzuvVar2.zzk(obj8, zzufVar, 0)) {
                                    zzuvVar4 = zzuvVar2;
                                } else {
                                    int i6 = zztvVar2.zzk;
                                    while (i6 < zztvVar2.zzl) {
                                        zzuv zzuvVar7 = zzuvVar2;
                                        Object obj11 = obj10;
                                        zztvVar2.zzy(obj11, zztvVar2.zzj[i6], obj8, zzuvVar7, obj);
                                        i6 += z ? 1 : 0;
                                        obj10 = obj11;
                                        zzuvVar2 = zzuvVar7;
                                    }
                                    obj2 = obj10;
                                    zzuvVar4 = zzuvVar2;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                obj2 = obj10;
                                zzuvVar4 = zzuvVar2;
                                i = 1;
                                zztvVar = zztvVar2;
                                i2 = zztvVar.zzk;
                                while (i2 < zztvVar.zzl) {
                                    zztvVar.zzy(obj2, zztvVar.zzj[i2], obj8, zzuvVar4, obj);
                                    i2 += i;
                                    zztvVar = this;
                                }
                                if (obj8 != null) {
                                    zzuvVar4.zzj(obj2, obj8);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        zzuvVar3 = zzuvVar2;
                        obj5 = obj10;
                        zzuv zzuvVar62 = zzuvVar3;
                        zztvVar = zztvVar2;
                        obj3 = obj4;
                        zzuvVar4 = zzuvVar62;
                        obj2 = obj5;
                        i = 1;
                        obj8 = obj3;
                        i2 = zztvVar.zzk;
                        while (i2 < zztvVar.zzl) {
                        }
                        if (obj8 != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th10) {
                th = th10;
                obj2 = obj;
                zztvVar = zztvVar2;
                obj3 = obj8;
            }
        }
        if (obj8 == null) {
            zzuvVar4.zzj(obj2, obj8);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzqb zzqbVar) {
        zzc(obj, bArr, i, i2, 0, zzqbVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04fb  */
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
                i = 0;
                int i7 = 1048575;
                int i8 = 0;
                while (i < iArr.length) {
                    int zzu = zztvVar.zzu(i);
                    int zzt = zzt(zzu);
                    int i9 = iArr[i];
                    if (zzt <= 17) {
                        int i10 = iArr[i + 2];
                        int i11 = i10 & i6;
                        if (i11 != i7) {
                            i8 = i11 == i6 ? 0 : unsafe.getInt(obj, i11);
                            i7 = i11;
                        }
                        entry2 = entry;
                        i2 = i7;
                        i3 = i8;
                        i4 = 1 << (i10 >>> 20);
                    } else {
                        entry2 = entry;
                        i2 = i7;
                        i3 = i8;
                        i4 = 0;
                    }
                    while (true) {
                        if (entry2 != null) {
                            zzrz zzrzVar = zztvVar.zzn;
                            i5 = 1048575;
                            if (((zzsl) entry2.getKey()).zza <= i9) {
                                zzrzVar.zzb(zzviVar, entry2);
                                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                            }
                        } else {
                            i5 = 1048575;
                        }
                    }
                    long j = zzu & i5;
                    switch (zzt) {
                        case 0:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzf(i9, zzvc.zza(obj, j));
                            }
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 1:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzo(i9, zzvc.zzb(obj, j));
                            }
                            zztvVar = this;
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 2:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzt(i9, unsafe.getLong(obj, j));
                            }
                            zztvVar = this;
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 3:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzK(i9, unsafe.getLong(obj, j));
                            }
                            zztvVar = this;
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 4:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzr(i9, unsafe.getInt(obj, j));
                            }
                            zztvVar = this;
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 5:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzm(i9, unsafe.getLong(obj, j));
                            }
                            zztvVar = this;
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 6:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzk(i9, unsafe.getInt(obj, j));
                            }
                            zztvVar = this;
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 7:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzb(i9, zzvc.zzw(obj, j));
                            }
                            zztvVar = this;
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 8:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzT(i9, unsafe.getObject(obj, j), zzviVar);
                            }
                            zztvVar = this;
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 9:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzv(i9, unsafe.getObject(obj, j), zztvVar.zzx(i));
                            }
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 10:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzd(i9, (zzqm) unsafe.getObject(obj, j));
                            }
                            zztvVar = this;
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 11:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzI(i9, unsafe.getInt(obj, j));
                            }
                            zztvVar = this;
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 12:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzi(i9, unsafe.getInt(obj, j));
                            }
                            zztvVar = this;
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 13:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzx(i9, unsafe.getInt(obj, j));
                            }
                            zztvVar = this;
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 14:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzz(i9, unsafe.getLong(obj, j));
                            }
                            zztvVar = this;
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 15:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzB(i9, unsafe.getInt(obj, j));
                            }
                            zztvVar = this;
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 16:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzD(i9, unsafe.getLong(obj, j));
                            }
                            zztvVar = this;
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 17:
                            if (zztvVar.zzO(obj, i, i2, i3, i4)) {
                                zzviVar.zzq(i9, unsafe.getObject(obj, j), zztvVar.zzx(i));
                            }
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 18:
                            zzui.zzs(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 19:
                            zzui.zzw(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 20:
                            zzui.zzy(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 21:
                            zzui.zzE(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 22:
                            zzui.zzx(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 23:
                            zzui.zzv(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 24:
                            zzui.zzu(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 25:
                            zzui.zzr(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 26:
                            int i12 = iArr[i];
                            List list = (List) unsafe.getObject(obj, j);
                            int i13 = zzui.zza;
                            if (list != null && !list.isEmpty()) {
                                zzviVar.zzH(i12, list);
                            }
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                            break;
                        case 27:
                            int i14 = iArr[i];
                            List list2 = (List) unsafe.getObject(obj, j);
                            zzug zzx = zztvVar.zzx(i);
                            int i15 = zzui.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i16 = 0; i16 < list2.size(); i16++) {
                                    ((zzqw) zzviVar).zzv(i14, list2.get(i16), zzx);
                                }
                            }
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                            break;
                        case 28:
                            int i17 = iArr[i];
                            List list3 = (List) unsafe.getObject(obj, j);
                            int i18 = zzui.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzviVar.zze(i17, list3);
                            }
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                            break;
                        case 29:
                            zzui.zzD(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 30:
                            zzui.zzt(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 31:
                            zzui.zzz(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 32:
                            zzui.zzA(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 33:
                            zzui.zzB(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 34:
                            zzui.zzC(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, false);
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 35:
                            zzui.zzs(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, true);
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 36:
                            zzui.zzw(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, true);
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 37:
                            zzui.zzy(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, true);
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 38:
                            zzui.zzE(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, true);
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 39:
                            zzui.zzx(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, true);
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 40:
                            zzui.zzv(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, true);
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 41:
                            zzui.zzu(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, true);
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 42:
                            zzui.zzr(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, true);
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 43:
                            zzui.zzD(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, true);
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 44:
                            zzui.zzt(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, true);
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 45:
                            zzui.zzz(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, true);
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 46:
                            zzui.zzA(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, true);
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 47:
                            zzui.zzB(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, true);
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 48:
                            zzui.zzC(iArr[i], (List) unsafe.getObject(obj, j), zzviVar, true);
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 49:
                            int i19 = iArr[i];
                            List list4 = (List) unsafe.getObject(obj, j);
                            zzug zzx2 = zztvVar.zzx(i);
                            int i20 = zzui.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i21 = 0; i21 < list4.size(); i21++) {
                                    ((zzqw) zzviVar).zzq(i19, list4.get(i21), zzx2);
                                }
                            }
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j) != null) {
                                throw null;
                            }
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 51:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzf(i9, zzn(obj, j));
                            }
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 52:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzo(i9, zzo(obj, j));
                            }
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 53:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzt(i9, zzv(obj, j));
                            }
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 54:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzK(i9, zzv(obj, j));
                            }
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 55:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzr(i9, zzp(obj, j));
                            }
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 56:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzm(i9, zzv(obj, j));
                            }
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 57:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzk(i9, zzp(obj, j));
                            }
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 58:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzb(i9, zzS(obj, j));
                            }
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 59:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzT(i9, unsafe.getObject(obj, j), zzviVar);
                            }
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 60:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzv(i9, unsafe.getObject(obj, j), zztvVar.zzx(i));
                            }
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 61:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzd(i9, (zzqm) unsafe.getObject(obj, j));
                            }
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 62:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzI(i9, zzp(obj, j));
                            }
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 63:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzi(i9, zzp(obj, j));
                            }
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 64:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzx(i9, zzp(obj, j));
                            }
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 65:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzz(i9, zzv(obj, j));
                            }
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 66:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzB(i9, zzp(obj, j));
                            }
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 67:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzD(i9, zzv(obj, j));
                            }
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        case 68:
                            if (zztvVar.zzR(obj, i9, i)) {
                                zzviVar.zzq(i9, unsafe.getObject(obj, j), zztvVar.zzx(i));
                            }
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                        default:
                            i += 3;
                            i8 = i3;
                            i6 = 1048575;
                            i7 = i2;
                            entry = entry2;
                    }
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
        i = 0;
        int i72 = 1048575;
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
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i7 = iArr[i6];
            int i8 = iArr2[i7];
            int zzu = zzu(i7);
            int i9 = iArr2[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = zzb.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i5;
                i = i10;
            } else {
                int i12 = i5;
                i = i4;
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
            i6++;
            i4 = i;
            i5 = i3;
        }
        return !this.zzh || ((zzsk) obj).zzb.zzk();
    }
}
