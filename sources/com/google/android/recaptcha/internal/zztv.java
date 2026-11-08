package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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

    private zztv(int[] iArr, Object[] objArr, int i7, int i10, zzts zztsVar, boolean z9, int[] iArr2, int i11, int i12, zzty zztyVar, zztf zztfVar, zzuv zzuvVar, zzrz zzrzVar, zztn zztnVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i7;
        this.zzf = i10;
        this.zzi = zztsVar instanceof zzsn;
        boolean z10 = false;
        if (zzrzVar != null && (zztsVar instanceof zzsk)) {
            z10 = true;
        }
        this.zzh = z10;
        this.zzj = iArr2;
        this.zzk = i11;
        this.zzl = i12;
        this.zzm = zzuvVar;
        this.zzn = zzrzVar;
        this.zzg = zztsVar;
    }

    private final Object zzA(Object obj, int i7) {
        zzug zzx = zzx(i7);
        int zzu = zzu(i7) & 1048575;
        if (!zzN(obj, i7)) {
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

    private final Object zzB(Object obj, int i7, int i10) {
        zzug zzx = zzx(i10);
        if (!zzR(obj, i7, i10)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i10) & 1048575);
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
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder n10 = a.n("Field ", str, " for ", name, " not found. Known fields are ");
            n10.append(arrays);
            throw new RuntimeException(n10.toString(), e10);
        }
    }

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i7) {
        if (zzN(obj2, i7)) {
            int zzu = zzu(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j3 = zzu;
            Object object = unsafe.getObject(obj2, j3);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + obj2.toString());
            }
            zzug zzx = zzx(i7);
            if (!zzN(obj, i7)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j3, zze);
                } else {
                    unsafe.putObject(obj, j3, object);
                }
                zzH(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j3);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j3, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i7) {
        int[] iArr = this.zzc;
        int i10 = iArr[i7];
        if (zzR(obj2, i10, i7)) {
            int zzu = zzu(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j3 = zzu;
            Object object = unsafe.getObject(obj2, j3);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i7] + " is present but null: " + obj2.toString());
            }
            zzug zzx = zzx(i7);
            if (!zzR(obj, i10, i7)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j3, zze);
                } else {
                    unsafe.putObject(obj, j3, object);
                }
                zzI(obj, i10, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j3);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j3, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i7, zzuf zzufVar) {
        long j3 = i7 & 1048575;
        if (zzM(i7)) {
            zzvc.zzs(obj, j3, zzufVar.zzs());
        } else if (this.zzi) {
            zzvc.zzs(obj, j3, zzufVar.zzr());
        } else {
            zzvc.zzs(obj, j3, zzufVar.zzp());
        }
    }

    private final void zzH(Object obj, int i7) {
        int zzr = zzr(i7);
        long j3 = 1048575 & zzr;
        if (j3 == 1048575) {
            return;
        }
        zzvc.zzq(obj, j3, (1 << (zzr >>> 20)) | zzvc.zzc(obj, j3));
    }

    private final void zzI(Object obj, int i7, int i10) {
        zzvc.zzq(obj, zzr(i10) & 1048575, i7);
    }

    private final void zzJ(Object obj, int i7, Object obj2) {
        zzb.putObject(obj, zzu(i7) & 1048575, obj2);
        zzH(obj, i7);
    }

    private final void zzK(Object obj, int i7, int i10, Object obj2) {
        zzb.putObject(obj, zzu(i10) & 1048575, obj2);
        zzI(obj, i7, i10);
    }

    private final boolean zzL(Object obj, Object obj2, int i7) {
        return zzN(obj, i7) == zzN(obj2, i7);
    }

    private static boolean zzM(int i7) {
        return (i7 & TLObject.FLAG_29) != 0;
    }

    private final boolean zzN(Object obj, int i7) {
        int zzr = zzr(i7);
        long j3 = zzr & 1048575;
        if (j3 != 1048575) {
            return (zzvc.zzc(obj, j3) & (1 << (zzr >>> 20))) != 0;
        }
        int zzu = zzu(i7);
        long j10 = zzu & 1048575;
        switch (zzt(zzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzvc.zza(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzvc.zzb(obj, j10)) != 0;
            case 2:
                return zzvc.zzd(obj, j10) != 0;
            case 3:
                return zzvc.zzd(obj, j10) != 0;
            case 4:
                return zzvc.zzc(obj, j10) != 0;
            case 5:
                return zzvc.zzd(obj, j10) != 0;
            case 6:
                return zzvc.zzc(obj, j10) != 0;
            case 7:
                return zzvc.zzw(obj, j10);
            case 8:
                Object zzf = zzvc.zzf(obj, j10);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzqm) {
                    return !zzqm.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzvc.zzf(obj, j10) != null;
            case 10:
                return !zzqm.zzb.equals(zzvc.zzf(obj, j10));
            case 11:
                return zzvc.zzc(obj, j10) != 0;
            case 12:
                return zzvc.zzc(obj, j10) != 0;
            case 13:
                return zzvc.zzc(obj, j10) != 0;
            case 14:
                return zzvc.zzd(obj, j10) != 0;
            case 15:
                return zzvc.zzc(obj, j10) != 0;
            case 16:
                return zzvc.zzd(obj, j10) != 0;
            case 17:
                return zzvc.zzf(obj, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i7, int i10, int i11, int i12) {
        return i10 == 1048575 ? zzN(obj, i7) : (i11 & i12) != 0;
    }

    private static boolean zzP(Object obj, int i7, zzug zzugVar) {
        return zzugVar.zzl(zzvc.zzf(obj, i7 & 1048575));
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

    private final boolean zzR(Object obj, int i7, int i10) {
        return zzvc.zzc(obj, (long) (zzr(i10) & 1048575)) == i7;
    }

    private static boolean zzS(Object obj, long j3) {
        return ((Boolean) zzvc.zzf(obj, j3)).booleanValue();
    }

    private static final void zzT(int i7, Object obj, zzvi zzviVar) {
        if (obj instanceof String) {
            zzviVar.zzG(i7, (String) obj);
        } else {
            zzviVar.zzd(i7, (zzqm) obj);
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

    /* JADX WARN: Removed duplicated region for block: B:104:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zztv zzm(Class cls, zztp zztpVar, zzty zztyVar, zztf zztfVar, zzuv zzuvVar, zzrz zzrzVar, zztn zztnVar) {
        int i7;
        int charAt;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        char charAt2;
        int i17;
        char charAt3;
        int i18;
        char charAt4;
        int i19;
        char charAt5;
        int i20;
        char charAt6;
        int i21;
        char charAt7;
        int i22;
        char charAt8;
        int i23;
        char charAt9;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        String str;
        int objectFieldOffset;
        char c10;
        int i29;
        int i30;
        int i31;
        int i32;
        Field zzC;
        char charAt10;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        Object obj;
        Field zzC2;
        Object obj2;
        Field zzC3;
        int i38;
        char charAt11;
        int i39;
        char charAt12;
        int i40;
        char charAt13;
        int i41;
        char charAt14;
        if (!(zztpVar instanceof zzue)) {
            throw null;
        }
        zzue zzueVar = (zzue) zztpVar;
        String zzd = zzueVar.zzd();
        int length = zzd.length();
        char c11 = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i42 = 1;
            while (true) {
                i7 = i42 + 1;
                if (zzd.charAt(i42) < 55296) {
                    break;
                }
                i42 = i7;
            }
        } else {
            i7 = 1;
        }
        int i43 = i7 + 1;
        int charAt15 = zzd.charAt(i7);
        if (charAt15 >= 55296) {
            int i44 = charAt15 & 8191;
            int i45 = 13;
            while (true) {
                i41 = i43 + 1;
                charAt14 = zzd.charAt(i43);
                if (charAt14 < 55296) {
                    break;
                }
                i44 |= (charAt14 & 8191) << i45;
                i45 += 13;
                i43 = i41;
            }
            charAt15 = i44 | (charAt14 << i45);
            i43 = i41;
        }
        if (charAt15 == 0) {
            i11 = 0;
            i14 = 0;
            charAt = 0;
            i10 = 0;
            i12 = 0;
            i13 = 0;
            iArr = zza;
            i15 = 0;
        } else {
            int i46 = i43 + 1;
            int charAt16 = zzd.charAt(i43);
            if (charAt16 >= 55296) {
                int i47 = charAt16 & 8191;
                int i48 = 13;
                while (true) {
                    i23 = i46 + 1;
                    charAt9 = zzd.charAt(i46);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i47 |= (charAt9 & 8191) << i48;
                    i48 += 13;
                    i46 = i23;
                }
                charAt16 = i47 | (charAt9 << i48);
                i46 = i23;
            }
            int i49 = i46 + 1;
            int charAt17 = zzd.charAt(i46);
            if (charAt17 >= 55296) {
                int i50 = charAt17 & 8191;
                int i51 = 13;
                while (true) {
                    i22 = i49 + 1;
                    charAt8 = zzd.charAt(i49);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i50 |= (charAt8 & 8191) << i51;
                    i51 += 13;
                    i49 = i22;
                }
                charAt17 = i50 | (charAt8 << i51);
                i49 = i22;
            }
            int i52 = i49 + 1;
            int charAt18 = zzd.charAt(i49);
            if (charAt18 >= 55296) {
                int i53 = charAt18 & 8191;
                int i54 = 13;
                while (true) {
                    i21 = i52 + 1;
                    charAt7 = zzd.charAt(i52);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i53 |= (charAt7 & 8191) << i54;
                    i54 += 13;
                    i52 = i21;
                }
                charAt18 = i53 | (charAt7 << i54);
                i52 = i21;
            }
            int i55 = i52 + 1;
            int charAt19 = zzd.charAt(i52);
            if (charAt19 >= 55296) {
                int i56 = charAt19 & 8191;
                int i57 = 13;
                while (true) {
                    i20 = i55 + 1;
                    charAt6 = zzd.charAt(i55);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i56 |= (charAt6 & 8191) << i57;
                    i57 += 13;
                    i55 = i20;
                }
                charAt19 = i56 | (charAt6 << i57);
                i55 = i20;
            }
            int i58 = i55 + 1;
            charAt = zzd.charAt(i55);
            if (charAt >= 55296) {
                int i59 = charAt & 8191;
                int i60 = 13;
                while (true) {
                    i19 = i58 + 1;
                    charAt5 = zzd.charAt(i58);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i59 |= (charAt5 & 8191) << i60;
                    i60 += 13;
                    i58 = i19;
                }
                charAt = i59 | (charAt5 << i60);
                i58 = i19;
            }
            int i61 = i58 + 1;
            int charAt20 = zzd.charAt(i58);
            if (charAt20 >= 55296) {
                int i62 = charAt20 & 8191;
                int i63 = 13;
                while (true) {
                    i18 = i61 + 1;
                    charAt4 = zzd.charAt(i61);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i62 |= (charAt4 & 8191) << i63;
                    i63 += 13;
                    i61 = i18;
                }
                charAt20 = i62 | (charAt4 << i63);
                i61 = i18;
            }
            int i64 = i61 + 1;
            int charAt21 = zzd.charAt(i61);
            if (charAt21 >= 55296) {
                int i65 = charAt21 & 8191;
                int i66 = 13;
                while (true) {
                    i17 = i64 + 1;
                    charAt3 = zzd.charAt(i64);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i65 |= (charAt3 & 8191) << i66;
                    i66 += 13;
                    i64 = i17;
                }
                charAt21 = i65 | (charAt3 << i66);
                i64 = i17;
            }
            int i67 = i64 + 1;
            int charAt22 = zzd.charAt(i64);
            if (charAt22 >= 55296) {
                int i68 = charAt22 & 8191;
                int i69 = 13;
                while (true) {
                    i16 = i67 + 1;
                    charAt2 = zzd.charAt(i67);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i68 |= (charAt2 & 8191) << i69;
                    i69 += 13;
                    i67 = i16;
                }
                charAt22 = i68 | (charAt2 << i69);
                i67 = i16;
            }
            int i70 = charAt16 + charAt16 + charAt17;
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i71 = charAt20;
            i10 = charAt18;
            i11 = i71;
            i12 = charAt19;
            i13 = charAt22;
            i14 = i70;
            iArr = iArr2;
            i15 = charAt16;
            i43 = i67;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzueVar.zze();
        Class<?> cls2 = zzueVar.zza().getClass();
        int i72 = i13 + i11;
        int i73 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i73];
        int i74 = i13;
        int i75 = i72;
        int i76 = 0;
        int i77 = 0;
        while (i43 < length) {
            int i78 = i43 + 1;
            int charAt23 = zzd.charAt(i43);
            if (charAt23 >= c11) {
                int i79 = charAt23 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i40 = i80 + 1;
                    charAt13 = zzd.charAt(i80);
                    if (charAt13 < c11) {
                        break;
                    }
                    i79 |= (charAt13 & 8191) << i81;
                    i81 += 13;
                    i80 = i40;
                }
                charAt23 = i79 | (charAt13 << i81);
                i24 = i40;
            } else {
                i24 = i78;
            }
            int i82 = i24 + 1;
            int charAt24 = zzd.charAt(i24);
            if (charAt24 >= c11) {
                int i83 = charAt24 & 8191;
                int i84 = i82;
                int i85 = 13;
                while (true) {
                    i39 = i84 + 1;
                    charAt12 = zzd.charAt(i84);
                    if (charAt12 < c11) {
                        break;
                    }
                    i83 |= (charAt12 & 8191) << i85;
                    i85 += 13;
                    i84 = i39;
                }
                charAt24 = i83 | (charAt12 << i85);
                i25 = i39;
            } else {
                i25 = i82;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i76] = i77;
                i76++;
            }
            int i86 = charAt24 & qs.e4;
            zzue zzueVar2 = zzueVar;
            int i87 = charAt24 & 2048;
            if (i86 >= 51) {
                int i88 = i25 + 1;
                int charAt25 = zzd.charAt(i25);
                char c12 = 55296;
                if (charAt25 >= 55296) {
                    int i89 = charAt25 & 8191;
                    int i90 = i88;
                    int i91 = 13;
                    while (true) {
                        i38 = i90 + 1;
                        charAt11 = zzd.charAt(i90);
                        if (charAt11 < c12) {
                            break;
                        }
                        i89 |= (charAt11 & 8191) << i91;
                        i91 += 13;
                        i90 = i38;
                        c12 = 55296;
                    }
                    charAt25 = i89 | (charAt11 << i91);
                    i35 = i38;
                } else {
                    i35 = i88;
                }
                int i92 = i35;
                int i93 = i86 - 51;
                i26 = length;
                if (i93 == 9 || i93 == 17) {
                    i36 = i14 + 1;
                    int i94 = i77 / 3;
                    objArr[i94 + i94 + 1] = zze[i14];
                } else {
                    if (i93 == 12) {
                        if (zzueVar2.zzc() == 1 || i87 != 0) {
                            i36 = i14 + 1;
                            int i95 = i77 / 3;
                            objArr[i95 + i95 + 1] = zze[i14];
                        } else {
                            i37 = 0;
                            int i96 = charAt25 + charAt25;
                            obj = zze[i96];
                            int i97 = i37;
                            if (obj instanceof Field) {
                                zzC2 = (Field) obj;
                            } else {
                                zzC2 = zzC(cls2, (String) obj);
                                zze[i96] = zzC2;
                            }
                            int i98 = i15;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC2);
                            int i99 = i96 + 1;
                            obj2 = zze[i99];
                            i27 = i98;
                            if (obj2 instanceof Field) {
                                zzC3 = (Field) obj2;
                            } else {
                                zzC3 = zzC(cls2, (String) obj2);
                                zze[i99] = zzC3;
                            }
                            i29 = (int) unsafe.objectFieldOffset(zzC3);
                            str = zzd;
                            i31 = i97;
                            i25 = i92;
                            i30 = 0;
                            c10 = 55296;
                        }
                    }
                    i37 = i87;
                    int i962 = charAt25 + charAt25;
                    obj = zze[i962];
                    int i972 = i37;
                    if (obj instanceof Field) {
                    }
                    int i982 = i15;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzC2);
                    int i992 = i962 + 1;
                    obj2 = zze[i992];
                    i27 = i982;
                    if (obj2 instanceof Field) {
                    }
                    i29 = (int) unsafe.objectFieldOffset(zzC3);
                    str = zzd;
                    i31 = i972;
                    i25 = i92;
                    i30 = 0;
                    c10 = 55296;
                }
                i14 = i36;
                i37 = i87;
                int i9622 = charAt25 + charAt25;
                obj = zze[i9622];
                int i9722 = i37;
                if (obj instanceof Field) {
                }
                int i9822 = i15;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzC2);
                int i9922 = i9622 + 1;
                obj2 = zze[i9922];
                i27 = i9822;
                if (obj2 instanceof Field) {
                }
                i29 = (int) unsafe.objectFieldOffset(zzC3);
                str = zzd;
                i31 = i9722;
                i25 = i92;
                i30 = 0;
                c10 = 55296;
            } else {
                i26 = length;
                i27 = i15;
                int i100 = i14 + 1;
                Field zzC4 = zzC(cls2, (String) zze[i14]);
                if (i86 == 9 || i86 == 17) {
                    i28 = i100;
                    int i101 = i77 / 3;
                    objArr[i101 + i101 + 1] = zzC4.getType();
                } else {
                    if (i86 == 27) {
                        i33 = i100;
                        i34 = 1;
                        i14 += 2;
                    } else if (i86 == 49) {
                        i14 += 2;
                        i33 = i100;
                        i34 = 1;
                    } else if (i86 == 12 || i86 == 30 || i86 == 44) {
                        if (zzueVar2.zzc() == 1 || i87 != 0) {
                            i14 += 2;
                            int i102 = i77 / 3;
                            objArr[i102 + i102 + 1] = zze[i100];
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                            if ((charAt24 & TLObject.FLAG_12) != 0 || i86 > 17) {
                                c10 = 55296;
                                i29 = 1048575;
                                i30 = 0;
                            } else {
                                int i103 = i25 + 1;
                                int charAt26 = str.charAt(i25);
                                if (charAt26 >= 55296) {
                                    int i104 = charAt26 & 8191;
                                    int i105 = 13;
                                    while (true) {
                                        i32 = i103 + 1;
                                        charAt10 = str.charAt(i103);
                                        if (charAt10 < 55296) {
                                            break;
                                        }
                                        i104 |= (charAt10 & 8191) << i105;
                                        i105 += 13;
                                        i103 = i32;
                                    }
                                    charAt26 = i104 | (charAt10 << i105);
                                } else {
                                    i32 = i103;
                                }
                                int i106 = (charAt26 / 32) + i27 + i27;
                                Object obj3 = zze[i106];
                                if (obj3 instanceof Field) {
                                    zzC = (Field) obj3;
                                } else {
                                    zzC = zzC(cls2, (String) obj3);
                                    zze[i106] = zzC;
                                }
                                i30 = charAt26 % 32;
                                i25 = i32;
                                c10 = 55296;
                                i29 = (int) unsafe.objectFieldOffset(zzC);
                            }
                            if (i86 >= 18 && i86 <= 49) {
                                iArr[i75] = objectFieldOffset;
                                i75++;
                            }
                            i31 = i87;
                        } else {
                            str = zzd;
                            i14 = i100;
                            i87 = 0;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                            if ((charAt24 & TLObject.FLAG_12) != 0) {
                            }
                            c10 = 55296;
                            i29 = 1048575;
                            i30 = 0;
                            if (i86 >= 18) {
                                iArr[i75] = objectFieldOffset;
                                i75++;
                            }
                            i31 = i87;
                        }
                    } else if (i86 == 50) {
                        int i107 = i14 + 2;
                        int i108 = i74 + 1;
                        iArr[i74] = i77;
                        int i109 = i77 / 3;
                        int i110 = i109 + i109;
                        objArr[i110] = zze[i100];
                        if (i87 != 0) {
                            objArr[i110 + 1] = zze[i107];
                            i14 += 3;
                            str = zzd;
                            i74 = i108;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                            if ((charAt24 & TLObject.FLAG_12) != 0) {
                            }
                            c10 = 55296;
                            i29 = 1048575;
                            i30 = 0;
                            if (i86 >= 18) {
                            }
                            i31 = i87;
                        } else {
                            i14 = i107;
                            i74 = i108;
                            i87 = 0;
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                            if ((charAt24 & TLObject.FLAG_12) != 0) {
                            }
                            c10 = 55296;
                            i29 = 1048575;
                            i30 = 0;
                            if (i86 >= 18) {
                            }
                            i31 = i87;
                        }
                    } else {
                        i28 = i100;
                    }
                    int i111 = i77 / 3;
                    objArr[i111 + i111 + i34] = zze[i33];
                    str = zzd;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                    if ((charAt24 & TLObject.FLAG_12) != 0) {
                    }
                    c10 = 55296;
                    i29 = 1048575;
                    i30 = 0;
                    if (i86 >= 18) {
                    }
                    i31 = i87;
                }
                str = zzd;
                i14 = i28;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                if ((charAt24 & TLObject.FLAG_12) != 0) {
                }
                c10 = 55296;
                i29 = 1048575;
                i30 = 0;
                if (i86 >= 18) {
                }
                i31 = i87;
            }
            int i112 = i77 + 1;
            iArr3[i77] = charAt23;
            int i113 = i77 + 2;
            iArr3[i112] = ((charAt24 & 512) != 0 ? TLObject.FLAG_29 : 0) | ((charAt24 & 256) != 0 ? TLObject.FLAG_28 : 0) | (i31 != 0 ? TLObject.FLAG_31 : 0) | (i86 << 20) | objectFieldOffset;
            i77 += 3;
            iArr3[i113] = (i30 << 20) | i29;
            i43 = i25;
            zzd = str;
            c11 = c10;
            zzueVar = zzueVar2;
            length = i26;
            i15 = i27;
        }
        return new zztv(iArr3, objArr, i10, i12, zzueVar.zza(), false, iArr, i13, i72, zztyVar, zztfVar, zzuvVar, zzrzVar, zztnVar);
    }

    private static double zzn(Object obj, long j3) {
        return ((Double) zzvc.zzf(obj, j3)).doubleValue();
    }

    private static float zzo(Object obj, long j3) {
        return ((Float) zzvc.zzf(obj, j3)).floatValue();
    }

    private static int zzp(Object obj, long j3) {
        return ((Integer) zzvc.zzf(obj, j3)).intValue();
    }

    private final int zzq(int i7) {
        if (i7 < this.zze || i7 > this.zzf) {
            return -1;
        }
        return zzs(i7, 0);
    }

    private final int zzr(int i7) {
        return this.zzc[i7 + 2];
    }

    private final int zzs(int i7, int i10) {
        int[] iArr = this.zzc;
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

    private static int zzt(int i7) {
        return (i7 >>> 20) & qs.e4;
    }

    private final int zzu(int i7) {
        return this.zzc[i7 + 1];
    }

    private static long zzv(Object obj, long j3) {
        return ((Long) zzvc.zzf(obj, j3)).longValue();
    }

    private final zzsr zzw(int i7) {
        int i10 = i7 / 3;
        return (zzsr) this.zzd[i10 + i10 + 1];
    }

    private final zzug zzx(int i7) {
        Object[] objArr = this.zzd;
        int i10 = i7 / 3;
        int i11 = i10 + i10;
        zzug zzugVar = (zzug) objArr[i11];
        if (zzugVar != null) {
            return zzugVar;
        }
        zzug zzb2 = zzuc.zza().zzb((Class) objArr[i11 + 1]);
        objArr[i11] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i7, Object obj2, zzuv zzuvVar, Object obj3) {
        int i10 = this.zzc[i7];
        Object zzf = zzvc.zzf(obj, zzu(i7) & 1048575);
        if (zzf == null || zzw(i7) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i7) {
        int i10 = i7 / 3;
        return this.zzd[i10 + i10];
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final int zza(Object obj) {
        int i7;
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
        int zzA7;
        int zze;
        int zzA8;
        int zzA9;
        int i10;
        int zzA10;
        int zzB2;
        zztv<T> zztvVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (true) {
            int[] iArr = zztvVar.zzc;
            if (i12 >= iArr.length) {
                int zza2 = ((zzsn) obj).zzc.zza() + i14;
                if (!zztvVar.zzh) {
                    return zza2;
                }
                zzuo zzuoVar = ((zzsk) obj).zzb.zza;
                int zzc = zzuoVar.zzc();
                int i16 = 0;
                for (int i17 = 0; i17 < zzc; i17++) {
                    Map.Entry zzg = zzuoVar.zzg(i17);
                    i16 += zzsd.zza((zzsc) ((zzuk) zzg).zza(), zzg.getValue());
                }
                for (Map.Entry entry : zzuoVar.zzd()) {
                    i16 += zzsd.zza((zzsc) entry.getKey(), entry.getValue());
                }
                return zza2 + i16;
            }
            int zzu = zztvVar.zzu(i12);
            int zzt = zzt(zzu);
            int i18 = iArr[i12];
            int i19 = iArr[i12 + 2];
            int i20 = i19 & i11;
            if (zzt <= 17) {
                if (i20 != i15) {
                    i13 = i20 == i11 ? 0 : unsafe.getInt(obj2, i20);
                    i15 = i20;
                }
                i7 = 1 << (i19 >>> 20);
            } else {
                i7 = 0;
            }
            int i21 = zzu & i11;
            if (zzt >= zzse.zzJ.zza()) {
                zzse.zzW.zza();
            }
            long j3 = i21;
            switch (zzt) {
                case 0:
                    if (zztvVar.zzO(obj2, i12, i15, i13, i7)) {
                        i14 = a.d(i18 << 3, 8, i14);
                    }
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 1:
                    if (zztvVar.zzO(obj2, i12, i15, i13, i7)) {
                        i14 = a.d(i18 << 3, 4, i14);
                    }
                    zztvVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 2:
                    if (zztvVar.zzO(obj2, i12, i15, i13, i7)) {
                        long j10 = unsafe.getLong(obj2, j3);
                        zzA = zzqv.zzA(i18 << 3);
                        zzB = zzqv.zzB(j10);
                        i14 += zzB + zzA;
                    }
                    zztvVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 3:
                    if (zztvVar.zzO(obj2, i12, i15, i13, i7)) {
                        long j11 = unsafe.getLong(obj2, j3);
                        zzA = zzqv.zzA(i18 << 3);
                        zzB = zzqv.zzB(j11);
                        i14 += zzB + zzA;
                    }
                    zztvVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 4:
                    if (zztvVar.zzO(obj2, i12, i15, i13, i7)) {
                        long j12 = unsafe.getInt(obj2, j3);
                        zzA = zzqv.zzA(i18 << 3);
                        zzB = zzqv.zzB(j12);
                        i14 += zzB + zzA;
                    }
                    zztvVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 5:
                    if (zztvVar.zzO(obj2, i12, i15, i13, i7)) {
                        i14 = a.d(i18 << 3, 8, i14);
                    }
                    zztvVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 6:
                    if (zztvVar.zzO(obj2, i12, i15, i13, i7)) {
                        i14 = a.d(i18 << 3, 4, i14);
                    }
                    zztvVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 7:
                    if (zztvVar.zzO(obj2, i12, i15, i13, i7)) {
                        i14 = a.d(i18 << 3, 1, i14);
                    }
                    zztvVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 8:
                    if (zztvVar.zzO(obj2, i12, i15, i13, i7)) {
                        int i22 = i18 << 3;
                        Object object = unsafe.getObject(obj2, j3);
                        if (object instanceof zzqm) {
                            zzA2 = zzqv.zzA(i22);
                            zzd = ((zzqm) object).zzd();
                            zzA3 = zzqv.zzA(zzd);
                            i14 += zzA3 + zzd + zzA2;
                        } else {
                            zzA = zzqv.zzA(i22);
                            zzB = zzqv.zzz((String) object);
                            i14 += zzB + zzA;
                        }
                    }
                    zztvVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 9:
                    if (zztvVar.zzO(obj2, i12, i15, i13, i7)) {
                        zzh = zzui.zzh(i18, unsafe.getObject(obj2, j3), zztvVar.zzx(i12));
                        i14 += zzh;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 10:
                    if (zztvVar.zzO(obj2, i12, i15, i13, i7)) {
                        zzqm zzqmVar = (zzqm) unsafe.getObject(obj2, j3);
                        zzA2 = zzqv.zzA(i18 << 3);
                        zzd = zzqmVar.zzd();
                        zzA3 = zzqv.zzA(zzd);
                        i14 += zzA3 + zzd + zzA2;
                    }
                    zztvVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 11:
                    if (zztvVar.zzO(obj2, i12, i15, i13, i7)) {
                        i14 = a.d(unsafe.getInt(obj2, j3), zzqv.zzA(i18 << 3), i14);
                    }
                    zztvVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 12:
                    if (zztvVar.zzO(obj2, i12, i15, i13, i7)) {
                        long j13 = unsafe.getInt(obj2, j3);
                        zzA = zzqv.zzA(i18 << 3);
                        zzB = zzqv.zzB(j13);
                        i14 += zzB + zzA;
                    }
                    zztvVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 13:
                    if (zztvVar.zzO(obj2, i12, i15, i13, i7)) {
                        i14 = a.d(i18 << 3, 4, i14);
                    }
                    zztvVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 14:
                    if (zztvVar.zzO(obj2, i12, i15, i13, i7)) {
                        i14 = a.d(i18 << 3, 8, i14);
                    }
                    zztvVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 15:
                    if (zztvVar.zzO(obj2, i12, i15, i13, i7)) {
                        int i23 = unsafe.getInt(obj2, j3);
                        i14 = a.d((i23 >> 31) ^ (i23 + i23), zzqv.zzA(i18 << 3), i14);
                    }
                    zztvVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 16:
                    if (zztvVar.zzO(obj2, i12, i15, i13, i7)) {
                        long j14 = unsafe.getLong(obj2, j3);
                        zzA = zzqv.zzA(i18 << 3);
                        zzB = zzqv.zzB((j14 >> 63) ^ (j14 + j14));
                        i14 += zzB + zzA;
                    }
                    zztvVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 17:
                    if (zztvVar.zzO(obj2, i12, i15, i13, i7)) {
                        zzw = zzqv.zzw(i18, (zzts) unsafe.getObject(obj2, j3), zztvVar.zzx(i12));
                        i14 += zzw;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 18:
                    zzh = zzui.zzd(i18, (List) unsafe.getObject(obj2, j3), false);
                    i14 += zzh;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 19:
                    zzh = zzui.zzb(i18, (List) unsafe.getObject(obj2, j3), false);
                    i14 += zzh;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j3);
                    int i24 = zzui.zza;
                    if (list.size() != 0) {
                        zzA4 = (zzqv.zzA(i18 << 3) * list.size()) + zzui.zzg(list);
                        i14 += zzA4;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                    zzA4 = 0;
                    i14 += zzA4;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j3);
                    int i25 = zzui.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zzui.zzl(list2);
                        zzA5 = zzqv.zzA(i18 << 3);
                        zzA6 = (zzA5 * size) + zzl;
                        i14 += zzA6;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                    zzA6 = 0;
                    i14 += zzA6;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j3);
                    int i26 = zzui.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zzui.zzf(list3);
                        zzA5 = zzqv.zzA(i18 << 3);
                        zzA6 = (zzA5 * size) + zzl;
                        i14 += zzA6;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                    zzA6 = 0;
                    i14 += zzA6;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 23:
                    zzh = zzui.zzd(i18, (List) unsafe.getObject(obj2, j3), false);
                    i14 += zzh;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 24:
                    zzh = zzui.zzb(i18, (List) unsafe.getObject(obj2, j3), false);
                    i14 += zzh;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j3);
                    int i27 = zzui.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzA4 = (zzqv.zzA(i18 << 3) + 1) * size2;
                        i14 += zzA4;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                    zzA4 = 0;
                    i14 += zzA4;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j3);
                    int i28 = zzui.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzA6 = zzqv.zzA(i18 << 3) * size3;
                        if (list5 instanceof zzte) {
                            zzte zzteVar = (zzte) list5;
                            for (int i29 = 0; i29 < size3; i29++) {
                                Object zzc2 = zzteVar.zzc();
                                if (zzc2 instanceof zzqm) {
                                    int zzd2 = ((zzqm) zzc2).zzd();
                                    zzA6 = a.d(zzd2, zzd2, zzA6);
                                } else {
                                    zzA6 = zzqv.zzz((String) zzc2) + zzA6;
                                }
                            }
                        } else {
                            for (int i30 = 0; i30 < size3; i30++) {
                                Object obj3 = list5.get(i30);
                                if (obj3 instanceof zzqm) {
                                    int zzd3 = ((zzqm) obj3).zzd();
                                    zzA6 = a.d(zzd3, zzd3, zzA6);
                                } else {
                                    zzA6 = zzqv.zzz((String) obj3) + zzA6;
                                }
                            }
                        }
                        i14 += zzA6;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                    zzA6 = 0;
                    i14 += zzA6;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j3);
                    zzug zzx = zztvVar.zzx(i12);
                    int i31 = zzui.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzA7 = 0;
                    } else {
                        zzA7 = zzqv.zzA(i18 << 3) * size4;
                        for (int i32 = 0; i32 < size4; i32++) {
                            Object obj4 = list6.get(i32);
                            if (obj4 instanceof zztd) {
                                int zza3 = ((zztd) obj4).zza();
                                zzA7 = a.d(zza3, zza3, zzA7);
                            } else {
                                zzA7 = zzqv.zzy((zzts) obj4, zzx) + zzA7;
                            }
                        }
                    }
                    i14 += zzA7;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j3);
                    int i33 = zzui.zza;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        zzA6 = zzqv.zzA(i18 << 3) * size5;
                        for (int i34 = 0; i34 < list7.size(); i34++) {
                            int zzd4 = ((zzqm) list7.get(i34)).zzd();
                            zzA6 = a.d(zzd4, zzd4, zzA6);
                        }
                        i14 += zzA6;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                    zzA6 = 0;
                    i14 += zzA6;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j3);
                    int i35 = zzui.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzl = zzui.zzk(list8);
                        zzA5 = zzqv.zzA(i18 << 3);
                        zzA6 = (zzA5 * size) + zzl;
                        i14 += zzA6;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                    zzA6 = 0;
                    i14 += zzA6;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case qs.T /* 30 */:
                    List list9 = (List) unsafe.getObject(obj2, j3);
                    int i36 = zzui.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzl = zzui.zza(list9);
                        zzA5 = zzqv.zzA(i18 << 3);
                        zzA6 = (zzA5 * size) + zzl;
                        i14 += zzA6;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                    zzA6 = 0;
                    i14 += zzA6;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case qs.U /* 31 */:
                    zzh = zzui.zzb(i18, (List) unsafe.getObject(obj2, j3), false);
                    i14 += zzh;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 32:
                    zzh = zzui.zzd(i18, (List) unsafe.getObject(obj2, j3), false);
                    i14 += zzh;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j3);
                    int i37 = zzui.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzl = zzui.zzi(list10);
                        zzA5 = zzqv.zzA(i18 << 3);
                        zzA6 = (zzA5 * size) + zzl;
                        i14 += zzA6;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                    zzA6 = 0;
                    i14 += zzA6;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j3);
                    int i38 = zzui.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzl = zzui.zzj(list11);
                        zzA5 = zzqv.zzA(i18 << 3);
                        zzA6 = (zzA5 * size) + zzl;
                        i14 += zzA6;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                    zzA6 = 0;
                    i14 += zzA6;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 35:
                    zze = zzui.zze((List) unsafe.getObject(obj2, j3));
                    if (zze > 0) {
                        zzA8 = zzqv.zzA(i18 << 3);
                        zzA9 = zzqv.zzA(zze);
                        i14 += zzA9 + zzA8 + zze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 36:
                    zze = zzui.zzc((List) unsafe.getObject(obj2, j3));
                    if (zze > 0) {
                        zzA8 = zzqv.zzA(i18 << 3);
                        zzA9 = zzqv.zzA(zze);
                        i14 += zzA9 + zzA8 + zze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 37:
                    zze = zzui.zzg((List) unsafe.getObject(obj2, j3));
                    if (zze > 0) {
                        zzA8 = zzqv.zzA(i18 << 3);
                        zzA9 = zzqv.zzA(zze);
                        i14 += zzA9 + zzA8 + zze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 38:
                    zze = zzui.zzl((List) unsafe.getObject(obj2, j3));
                    if (zze > 0) {
                        zzA8 = zzqv.zzA(i18 << 3);
                        zzA9 = zzqv.zzA(zze);
                        i14 += zzA9 + zzA8 + zze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 39:
                    zze = zzui.zzf((List) unsafe.getObject(obj2, j3));
                    if (zze > 0) {
                        zzA8 = zzqv.zzA(i18 << 3);
                        zzA9 = zzqv.zzA(zze);
                        i14 += zzA9 + zzA8 + zze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 40:
                    zze = zzui.zze((List) unsafe.getObject(obj2, j3));
                    if (zze > 0) {
                        zzA8 = zzqv.zzA(i18 << 3);
                        zzA9 = zzqv.zzA(zze);
                        i14 += zzA9 + zzA8 + zze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 41:
                    zze = zzui.zzc((List) unsafe.getObject(obj2, j3));
                    if (zze > 0) {
                        zzA8 = zzqv.zzA(i18 << 3);
                        zzA9 = zzqv.zzA(zze);
                        i14 += zzA9 + zzA8 + zze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j3);
                    int i39 = zzui.zza;
                    zze = list12.size();
                    if (zze > 0) {
                        zzA8 = zzqv.zzA(i18 << 3);
                        zzA9 = zzqv.zzA(zze);
                        i14 += zzA9 + zzA8 + zze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 43:
                    zze = zzui.zzk((List) unsafe.getObject(obj2, j3));
                    if (zze > 0) {
                        zzA8 = zzqv.zzA(i18 << 3);
                        zzA9 = zzqv.zzA(zze);
                        i14 += zzA9 + zzA8 + zze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 44:
                    zze = zzui.zza((List) unsafe.getObject(obj2, j3));
                    if (zze > 0) {
                        zzA8 = zzqv.zzA(i18 << 3);
                        zzA9 = zzqv.zzA(zze);
                        i14 += zzA9 + zzA8 + zze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 45:
                    zze = zzui.zzc((List) unsafe.getObject(obj2, j3));
                    if (zze > 0) {
                        zzA8 = zzqv.zzA(i18 << 3);
                        zzA9 = zzqv.zzA(zze);
                        i14 += zzA9 + zzA8 + zze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 46:
                    zze = zzui.zze((List) unsafe.getObject(obj2, j3));
                    if (zze > 0) {
                        zzA8 = zzqv.zzA(i18 << 3);
                        zzA9 = zzqv.zzA(zze);
                        i14 += zzA9 + zzA8 + zze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 47:
                    zze = zzui.zzi((List) unsafe.getObject(obj2, j3));
                    if (zze > 0) {
                        zzA8 = zzqv.zzA(i18 << 3);
                        zzA9 = zzqv.zzA(zze);
                        i14 += zzA9 + zzA8 + zze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 48:
                    zze = zzui.zzj((List) unsafe.getObject(obj2, j3));
                    if (zze > 0) {
                        zzA8 = zzqv.zzA(i18 << 3);
                        zzA9 = zzqv.zzA(zze);
                        i14 += zzA9 + zzA8 + zze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j3);
                    zzug zzx2 = zztvVar.zzx(i12);
                    int i40 = zzui.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 0;
                        for (int i41 = 0; i41 < size6; i41++) {
                            i10 += zzqv.zzw(i18, (zzts) list13.get(i41), zzx2);
                        }
                    }
                    i14 += i10;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 50:
                    zztm zztmVar = (zztm) unsafe.getObject(obj2, j3);
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
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case qs.o0 /* 51 */:
                    if (zztvVar.zzR(obj2, i18, i12)) {
                        i14 = a.d(i18 << 3, 8, i14);
                    }
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case qs.p0 /* 52 */:
                    if (zztvVar.zzR(obj2, i18, i12)) {
                        i14 = a.d(i18 << 3, 4, i14);
                    }
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case qs.q0 /* 53 */:
                    if (zztvVar.zzR(obj2, i18, i12)) {
                        long zzv = zzv(obj2, j3);
                        zzA10 = zzqv.zzA(i18 << 3);
                        zzB2 = zzqv.zzB(zzv);
                        i14 += zzB2 + zzA10;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case qs.r0 /* 54 */:
                    if (zztvVar.zzR(obj2, i18, i12)) {
                        long zzv2 = zzv(obj2, j3);
                        zzA10 = zzqv.zzA(i18 << 3);
                        zzB2 = zzqv.zzB(zzv2);
                        i14 += zzB2 + zzA10;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case qs.s0 /* 55 */:
                    if (zztvVar.zzR(obj2, i18, i12)) {
                        long zzp = zzp(obj2, j3);
                        zzA10 = zzqv.zzA(i18 << 3);
                        zzB2 = zzqv.zzB(zzp);
                        i14 += zzB2 + zzA10;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case qs.t0 /* 56 */:
                    if (zztvVar.zzR(obj2, i18, i12)) {
                        i14 = a.d(i18 << 3, 8, i14);
                    }
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case qs.u0 /* 57 */:
                    if (zztvVar.zzR(obj2, i18, i12)) {
                        i14 = a.d(i18 << 3, 4, i14);
                    }
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case qs.v0 /* 58 */:
                    if (zztvVar.zzR(obj2, i18, i12)) {
                        i14 = a.d(i18 << 3, 1, i14);
                    }
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case qs.w0 /* 59 */:
                    if (zztvVar.zzR(obj2, i18, i12)) {
                        int i42 = i18 << 3;
                        Object object2 = unsafe.getObject(obj2, j3);
                        if (object2 instanceof zzqm) {
                            zze = zzqv.zzA(i42);
                            zzA8 = ((zzqm) object2).zzd();
                            zzA9 = zzqv.zzA(zzA8);
                            i14 += zzA9 + zzA8 + zze;
                            i12 += 3;
                            obj2 = obj;
                            i11 = 1048575;
                        } else {
                            zzA10 = zzqv.zzA(i42);
                            zzB2 = zzqv.zzz((String) object2);
                            i14 += zzB2 + zzA10;
                            i12 += 3;
                            obj2 = obj;
                            i11 = 1048575;
                        }
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case qs.x0 /* 60 */:
                    if (zztvVar.zzR(obj2, i18, i12)) {
                        zzh = zzui.zzh(i18, unsafe.getObject(obj2, j3), zztvVar.zzx(i12));
                        i14 += zzh;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case qs.y0 /* 61 */:
                    if (zztvVar.zzR(obj2, i18, i12)) {
                        zzqm zzqmVar2 = (zzqm) unsafe.getObject(obj2, j3);
                        zze = zzqv.zzA(i18 << 3);
                        zzA8 = zzqmVar2.zzd();
                        zzA9 = zzqv.zzA(zzA8);
                        i14 += zzA9 + zzA8 + zze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case qs.z0 /* 62 */:
                    if (zztvVar.zzR(obj2, i18, i12)) {
                        i14 = a.d(zzp(obj2, j3), zzqv.zzA(i18 << 3), i14);
                    }
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case qs.A0 /* 63 */:
                    if (zztvVar.zzR(obj2, i18, i12)) {
                        long zzp2 = zzp(obj2, j3);
                        zzA10 = zzqv.zzA(i18 << 3);
                        zzB2 = zzqv.zzB(zzp2);
                        i14 += zzB2 + zzA10;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 64:
                    if (zztvVar.zzR(obj2, i18, i12)) {
                        i14 = a.d(i18 << 3, 4, i14);
                    }
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 65:
                    if (zztvVar.zzR(obj2, i18, i12)) {
                        i14 = a.d(i18 << 3, 8, i14);
                    }
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case qs.D0 /* 66 */:
                    if (zztvVar.zzR(obj2, i18, i12)) {
                        int zzp3 = zzp(obj2, j3);
                        i14 = a.d((zzp3 >> 31) ^ (zzp3 + zzp3), zzqv.zzA(i18 << 3), i14);
                    }
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case qs.E0 /* 67 */:
                    if (zztvVar.zzR(obj2, i18, i12)) {
                        long zzv3 = zzv(obj2, j3);
                        zzA10 = zzqv.zzA(i18 << 3);
                        zzB2 = zzqv.zzB((zzv3 >> 63) ^ (zzv3 + zzv3));
                        i14 += zzB2 + zzA10;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case qs.F0 /* 68 */:
                    if (zztvVar.zzR(obj2, i18, i12)) {
                        zzw = zzqv.zzw(i18, (zzts) unsafe.getObject(obj2, j3), zztvVar.zzx(i12));
                        i14 += zzw;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                default:
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final int zzb(Object obj) {
        int i7;
        long doubleToLongBits;
        int i10;
        int floatToIntBits;
        int zzc;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i12 >= iArr.length) {
                int hashCode = ((zzsn) obj).zzc.hashCode() + (i13 * 53);
                return this.zzh ? (hashCode * 53) + ((zzsk) obj).zzb.zza.hashCode() : hashCode;
            }
            int zzu = zzu(i12);
            int i14 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i15 = iArr[i12];
            long j3 = i14;
            int i16 = 37;
            switch (zzt) {
                case 0:
                    i7 = i13 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzvc.zza(obj, j3));
                    byte[] bArr = zzsv.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i7 + zzc;
                    break;
                case 1:
                    i10 = i13 * 53;
                    floatToIntBits = Float.floatToIntBits(zzvc.zzb(obj, j3));
                    i13 = floatToIntBits + i10;
                    break;
                case 2:
                    i7 = i13 * 53;
                    doubleToLongBits = zzvc.zzd(obj, j3);
                    byte[] bArr2 = zzsv.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i7 + zzc;
                    break;
                case 3:
                    i7 = i13 * 53;
                    doubleToLongBits = zzvc.zzd(obj, j3);
                    byte[] bArr3 = zzsv.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i7 + zzc;
                    break;
                case 4:
                    i7 = i13 * 53;
                    zzc = zzvc.zzc(obj, j3);
                    i13 = i7 + zzc;
                    break;
                case 5:
                    i7 = i13 * 53;
                    doubleToLongBits = zzvc.zzd(obj, j3);
                    byte[] bArr4 = zzsv.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i7 + zzc;
                    break;
                case 6:
                    i7 = i13 * 53;
                    zzc = zzvc.zzc(obj, j3);
                    i13 = i7 + zzc;
                    break;
                case 7:
                    i10 = i13 * 53;
                    floatToIntBits = zzsv.zza(zzvc.zzw(obj, j3));
                    i13 = floatToIntBits + i10;
                    break;
                case 8:
                    i10 = i13 * 53;
                    floatToIntBits = ((String) zzvc.zzf(obj, j3)).hashCode();
                    i13 = floatToIntBits + i10;
                    break;
                case 9:
                    i11 = i13 * 53;
                    Object zzf = zzvc.zzf(obj, j3);
                    if (zzf != null) {
                        i16 = zzf.hashCode();
                    }
                    i13 = i11 + i16;
                    break;
                case 10:
                    i10 = i13 * 53;
                    floatToIntBits = zzvc.zzf(obj, j3).hashCode();
                    i13 = floatToIntBits + i10;
                    break;
                case 11:
                    i7 = i13 * 53;
                    zzc = zzvc.zzc(obj, j3);
                    i13 = i7 + zzc;
                    break;
                case 12:
                    i7 = i13 * 53;
                    zzc = zzvc.zzc(obj, j3);
                    i13 = i7 + zzc;
                    break;
                case 13:
                    i7 = i13 * 53;
                    zzc = zzvc.zzc(obj, j3);
                    i13 = i7 + zzc;
                    break;
                case 14:
                    i7 = i13 * 53;
                    doubleToLongBits = zzvc.zzd(obj, j3);
                    byte[] bArr5 = zzsv.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i7 + zzc;
                    break;
                case 15:
                    i7 = i13 * 53;
                    zzc = zzvc.zzc(obj, j3);
                    i13 = i7 + zzc;
                    break;
                case 16:
                    i7 = i13 * 53;
                    doubleToLongBits = zzvc.zzd(obj, j3);
                    byte[] bArr6 = zzsv.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i7 + zzc;
                    break;
                case 17:
                    i11 = i13 * 53;
                    Object zzf2 = zzvc.zzf(obj, j3);
                    if (zzf2 != null) {
                        i16 = zzf2.hashCode();
                    }
                    i13 = i11 + i16;
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
                case qs.T /* 30 */:
                case qs.U /* 31 */:
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
                    i10 = i13 * 53;
                    floatToIntBits = zzvc.zzf(obj, j3).hashCode();
                    i13 = floatToIntBits + i10;
                    break;
                case 50:
                    i10 = i13 * 53;
                    floatToIntBits = zzvc.zzf(obj, j3).hashCode();
                    i13 = floatToIntBits + i10;
                    break;
                case qs.o0 /* 51 */:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i7 = i13 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j3));
                        byte[] bArr7 = zzsv.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i7 + zzc;
                        break;
                    }
                case qs.p0 /* 52 */:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j3));
                        i13 = floatToIntBits + i10;
                        break;
                    }
                case qs.q0 /* 53 */:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i7 = i13 * 53;
                        doubleToLongBits = zzv(obj, j3);
                        byte[] bArr8 = zzsv.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i7 + zzc;
                        break;
                    }
                case qs.r0 /* 54 */:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i7 = i13 * 53;
                        doubleToLongBits = zzv(obj, j3);
                        byte[] bArr9 = zzsv.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i7 + zzc;
                        break;
                    }
                case qs.s0 /* 55 */:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i7 = i13 * 53;
                        zzc = zzp(obj, j3);
                        i13 = i7 + zzc;
                        break;
                    }
                case qs.t0 /* 56 */:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i7 = i13 * 53;
                        doubleToLongBits = zzv(obj, j3);
                        byte[] bArr10 = zzsv.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i7 + zzc;
                        break;
                    }
                case qs.u0 /* 57 */:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i7 = i13 * 53;
                        zzc = zzp(obj, j3);
                        i13 = i7 + zzc;
                        break;
                    }
                case qs.v0 /* 58 */:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = zzsv.zza(zzS(obj, j3));
                        i13 = floatToIntBits + i10;
                        break;
                    }
                case qs.w0 /* 59 */:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = ((String) zzvc.zzf(obj, j3)).hashCode();
                        i13 = floatToIntBits + i10;
                        break;
                    }
                case qs.x0 /* 60 */:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = zzvc.zzf(obj, j3).hashCode();
                        i13 = floatToIntBits + i10;
                        break;
                    }
                case qs.y0 /* 61 */:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = zzvc.zzf(obj, j3).hashCode();
                        i13 = floatToIntBits + i10;
                        break;
                    }
                case qs.z0 /* 62 */:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i7 = i13 * 53;
                        zzc = zzp(obj, j3);
                        i13 = i7 + zzc;
                        break;
                    }
                case qs.A0 /* 63 */:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i7 = i13 * 53;
                        zzc = zzp(obj, j3);
                        i13 = i7 + zzc;
                        break;
                    }
                case 64:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i7 = i13 * 53;
                        zzc = zzp(obj, j3);
                        i13 = i7 + zzc;
                        break;
                    }
                case 65:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i7 = i13 * 53;
                        doubleToLongBits = zzv(obj, j3);
                        byte[] bArr11 = zzsv.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i7 + zzc;
                        break;
                    }
                case qs.D0 /* 66 */:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i7 = i13 * 53;
                        zzc = zzp(obj, j3);
                        i13 = i7 + zzc;
                        break;
                    }
                case qs.E0 /* 67 */:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i7 = i13 * 53;
                        doubleToLongBits = zzv(obj, j3);
                        byte[] bArr12 = zzsv.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i7 + zzc;
                        break;
                    }
                case qs.F0 /* 68 */:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = zzvc.zzf(obj, j3).hashCode();
                        i13 = floatToIntBits + i10;
                        break;
                    }
            }
            i12 += 3;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zzc(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, com.google.android.recaptcha.internal.zzqb r37) {
        /*
            Method dump skipped, instructions count: 3830
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
            for (int i7 = 0; i7 < iArr.length; i7 += 3) {
                int zzu = zzu(i7);
                int i10 = 1048575 & zzu;
                int zzt = zzt(zzu);
                long j3 = i10;
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
                            case qs.T /* 30 */:
                            case qs.U /* 31 */:
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
                                ((zzsu) zzvc.zzf(obj, j3)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j3);
                                if (object != null) {
                                    ((zztm) object).zzc();
                                    unsafe.putObject(obj, j3, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzR(obj, iArr[i7], i7)) {
                        zzx(i7).zzf(zzb.getObject(obj, j3));
                    }
                }
                if (zzN(obj, i7)) {
                    zzx(i7).zzf(zzb.getObject(obj, j3));
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
        int i7 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i7 >= iArr.length) {
                zzui.zzq(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzui.zzp(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
            int zzu = zzu(i7);
            int i10 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i11 = iArr[i7];
            long j3 = i10;
            switch (zzt) {
                case 0:
                    if (!zzN(obj2, i7)) {
                        break;
                    } else {
                        zzvc.zzo(obj, j3, zzvc.zza(obj2, j3));
                        zzH(obj, i7);
                        break;
                    }
                case 1:
                    if (!zzN(obj2, i7)) {
                        break;
                    } else {
                        zzvc.zzp(obj, j3, zzvc.zzb(obj2, j3));
                        zzH(obj, i7);
                        break;
                    }
                case 2:
                    if (!zzN(obj2, i7)) {
                        break;
                    } else {
                        zzvc.zzr(obj, j3, zzvc.zzd(obj2, j3));
                        zzH(obj, i7);
                        break;
                    }
                case 3:
                    if (!zzN(obj2, i7)) {
                        break;
                    } else {
                        zzvc.zzr(obj, j3, zzvc.zzd(obj2, j3));
                        zzH(obj, i7);
                        break;
                    }
                case 4:
                    if (!zzN(obj2, i7)) {
                        break;
                    } else {
                        zzvc.zzq(obj, j3, zzvc.zzc(obj2, j3));
                        zzH(obj, i7);
                        break;
                    }
                case 5:
                    if (!zzN(obj2, i7)) {
                        break;
                    } else {
                        zzvc.zzr(obj, j3, zzvc.zzd(obj2, j3));
                        zzH(obj, i7);
                        break;
                    }
                case 6:
                    if (!zzN(obj2, i7)) {
                        break;
                    } else {
                        zzvc.zzq(obj, j3, zzvc.zzc(obj2, j3));
                        zzH(obj, i7);
                        break;
                    }
                case 7:
                    if (!zzN(obj2, i7)) {
                        break;
                    } else {
                        zzvc.zzm(obj, j3, zzvc.zzw(obj2, j3));
                        zzH(obj, i7);
                        break;
                    }
                case 8:
                    if (!zzN(obj2, i7)) {
                        break;
                    } else {
                        zzvc.zzs(obj, j3, zzvc.zzf(obj2, j3));
                        zzH(obj, i7);
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i7);
                    break;
                case 10:
                    if (!zzN(obj2, i7)) {
                        break;
                    } else {
                        zzvc.zzs(obj, j3, zzvc.zzf(obj2, j3));
                        zzH(obj, i7);
                        break;
                    }
                case 11:
                    if (!zzN(obj2, i7)) {
                        break;
                    } else {
                        zzvc.zzq(obj, j3, zzvc.zzc(obj2, j3));
                        zzH(obj, i7);
                        break;
                    }
                case 12:
                    if (!zzN(obj2, i7)) {
                        break;
                    } else {
                        zzvc.zzq(obj, j3, zzvc.zzc(obj2, j3));
                        zzH(obj, i7);
                        break;
                    }
                case 13:
                    if (!zzN(obj2, i7)) {
                        break;
                    } else {
                        zzvc.zzq(obj, j3, zzvc.zzc(obj2, j3));
                        zzH(obj, i7);
                        break;
                    }
                case 14:
                    if (!zzN(obj2, i7)) {
                        break;
                    } else {
                        zzvc.zzr(obj, j3, zzvc.zzd(obj2, j3));
                        zzH(obj, i7);
                        break;
                    }
                case 15:
                    if (!zzN(obj2, i7)) {
                        break;
                    } else {
                        zzvc.zzq(obj, j3, zzvc.zzc(obj2, j3));
                        zzH(obj, i7);
                        break;
                    }
                case 16:
                    if (!zzN(obj2, i7)) {
                        break;
                    } else {
                        zzvc.zzr(obj, j3, zzvc.zzd(obj2, j3));
                        zzH(obj, i7);
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i7);
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
                case qs.T /* 30 */:
                case qs.U /* 31 */:
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
                    zzsu zzsuVar = (zzsu) zzvc.zzf(obj, j3);
                    zzsu zzsuVar2 = (zzsu) zzvc.zzf(obj2, j3);
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
                    zzvc.zzs(obj, j3, zzsuVar2);
                    break;
                case 50:
                    int i12 = zzui.zza;
                    zzvc.zzs(obj, j3, zztn.zzb(zzvc.zzf(obj, j3), zzvc.zzf(obj2, j3)));
                    break;
                case qs.o0 /* 51 */:
                case qs.p0 /* 52 */:
                case qs.q0 /* 53 */:
                case qs.r0 /* 54 */:
                case qs.s0 /* 55 */:
                case qs.t0 /* 56 */:
                case qs.u0 /* 57 */:
                case qs.v0 /* 58 */:
                case qs.w0 /* 59 */:
                    if (!zzR(obj2, i11, i7)) {
                        break;
                    } else {
                        zzvc.zzs(obj, j3, zzvc.zzf(obj2, j3));
                        zzI(obj, i11, i7);
                        break;
                    }
                case qs.x0 /* 60 */:
                    zzF(obj, obj2, i7);
                    break;
                case qs.y0 /* 61 */:
                case qs.z0 /* 62 */:
                case qs.A0 /* 63 */:
                case 64:
                case 65:
                case qs.D0 /* 66 */:
                case qs.E0 /* 67 */:
                    if (!zzR(obj2, i11, i7)) {
                        break;
                    } else {
                        zzvc.zzs(obj, j3, zzvc.zzf(obj2, j3));
                        zzI(obj, i11, i7);
                        break;
                    }
                case qs.F0 /* 68 */:
                    zzF(obj, obj2, i7);
                    break;
            }
            i7 += 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:287:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x071b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0740 A[LOOP:3: B:52:0x073c->B:54:0x0740, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x070d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(Object obj, zzuf zzufVar, zzry zzryVar) {
        Object obj2;
        Object obj3;
        zztv<T> zztvVar;
        Throwable th2;
        int i7;
        zzuv zzuvVar;
        Object obj4;
        Object obj5;
        Object valueOf;
        int ordinal;
        Object zze;
        zzryVar.getClass();
        zzD(obj);
        zzuv zzuvVar2 = this.zzm;
        Object obj6 = null;
        zzsd zzsdVar = null;
        while (true) {
            try {
                int zzc = zzufVar.zzc();
                int zzq = zzq(zzc);
                if (zzq >= 0) {
                    obj5 = obj;
                    zzuvVar = zzuvVar2;
                    zztvVar = this;
                    obj4 = obj6;
                    try {
                        int zzu = zzu(zzq);
                        try {
                        } catch (zzsw unused) {
                            obj2 = obj5;
                        }
                        switch (zzt(zzu)) {
                            case 0:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzvc.zzo(obj2, zzu & 1048575, zzufVar.zza());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 1:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzvc.zzp(obj2, zzu & 1048575, zzufVar.zzb());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 2:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzvc.zzr(obj2, zzu & 1048575, zzufVar.zzl());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 3:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzvc.zzr(obj2, zzu & 1048575, zzufVar.zzo());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 4:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzvc.zzq(obj2, zzu & 1048575, zzufVar.zzg());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 5:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzvc.zzr(obj2, zzu & 1048575, zzufVar.zzk());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 6:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzvc.zzq(obj2, zzu & 1048575, zzufVar.zzf());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 7:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzvc.zzm(obj2, zzu & 1048575, zzufVar.zzN());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 8:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzG(obj2, zzu, zzufVar);
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 9:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzts zztsVar = (zzts) zzA(obj2, zzq);
                                zzufVar.zzu(zztsVar, zzx(zzq), zzryVar);
                                zzJ(obj2, zzq, zztsVar);
                                obj6 = obj3;
                                obj = obj2;
                            case 10:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzvc.zzs(obj2, zzu & 1048575, zzufVar.zzp());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 11:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzvc.zzq(obj2, zzu & 1048575, zzufVar.zzj());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 12:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                int zze2 = zzufVar.zze();
                                zzsr zzw = zzw(zzq);
                                if (zzw != null && !zzw.zza(zze2)) {
                                    obj6 = zzui.zzo(obj2, zzc, zze2, obj3, zzuvVar2);
                                    obj = obj2;
                                }
                                zzvc.zzq(obj2, zzu & 1048575, zze2);
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 13:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzvc.zzq(obj2, zzu & 1048575, zzufVar.zzh());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 14:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzvc.zzr(obj2, zzu & 1048575, zzufVar.zzm());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 15:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzvc.zzq(obj2, zzu & 1048575, zzufVar.zzi());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 16:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzvc.zzr(obj2, zzu & 1048575, zzufVar.zzn());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 17:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzts zztsVar2 = (zzts) zzA(obj2, zzq);
                                zzufVar.zzt(zztsVar2, zzx(zzq), zzryVar);
                                zzJ(obj2, zzq, zztsVar2);
                                obj6 = obj3;
                                obj = obj2;
                            case 18:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzufVar.zzx(zztf.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 19:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzufVar.zzB(zztf.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 20:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzufVar.zzE(zztf.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 21:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzufVar.zzM(zztf.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 22:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzufVar.zzD(zztf.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 23:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzufVar.zzA(zztf.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 24:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzufVar.zzz(zztf.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 25:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzufVar.zzv(zztf.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 26:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                if (zzM(zzu)) {
                                    ((zzqr) zzufVar).zzK(zztf.zza(obj2, zzu & 1048575), true);
                                } else {
                                    ((zzqr) zzufVar).zzK(zztf.zza(obj2, zzu & 1048575), false);
                                }
                                obj6 = obj3;
                                obj = obj2;
                            case 27:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzufVar.zzF(zztf.zza(obj2, zzu & 1048575), zzx(zzq), zzryVar);
                                obj6 = obj3;
                                obj = obj2;
                            case 28:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzufVar.zzw(zztf.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 29:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzufVar.zzL(zztf.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case qs.T /* 30 */:
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                try {
                                    List zza2 = zztf.zza(obj5, zzu & 1048575);
                                    zzufVar.zzy(zza2);
                                    obj6 = zzui.zzn(obj5, zzc, zza2, zzw(zzq), obj3, zzuvVar2);
                                    obj2 = obj5;
                                    zzuvVar2 = zzuvVar2;
                                } catch (zzsw unused2) {
                                    obj2 = obj5;
                                    obj6 = obj3;
                                    if (obj6 == null) {
                                    }
                                    if (!zzuvVar2.zzk(obj6, zzufVar, 0)) {
                                    }
                                    obj = obj2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj2 = obj5;
                                    th2 = th;
                                    obj6 = obj3;
                                    i7 = zztvVar.zzk;
                                    while (i7 < zztvVar.zzl) {
                                    }
                                    if (obj6 == null) {
                                    }
                                }
                                obj = obj2;
                                break;
                            case qs.U /* 31 */:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzufVar.zzG(zztf.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 32:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzufVar.zzH(zztf.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 33:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzufVar.zzI(zztf.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 34:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzufVar.zzJ(zztf.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 35:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzufVar.zzx(zztf.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 36:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzufVar.zzB(zztf.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 37:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzufVar.zzE(zztf.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 38:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzufVar.zzM(zztf.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 39:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzufVar.zzD(zztf.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 40:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzufVar.zzA(zztf.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 41:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzufVar.zzz(zztf.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 42:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzufVar.zzv(zztf.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 43:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                try {
                                    zzufVar.zzL(zztf.zza(obj2, zzu & 1048575));
                                    obj6 = obj3;
                                } catch (zzsw unused3) {
                                    obj6 = obj3;
                                    if (obj6 == null) {
                                    }
                                    if (!zzuvVar2.zzk(obj6, zzufVar, 0)) {
                                    }
                                    obj = obj2;
                                } catch (Throwable th4) {
                                    th = th4;
                                    th2 = th;
                                    obj6 = obj3;
                                    i7 = zztvVar.zzk;
                                    while (i7 < zztvVar.zzl) {
                                    }
                                    if (obj6 == null) {
                                    }
                                }
                                obj = obj2;
                                break;
                            case 44:
                                List zza3 = zztf.zza(obj5, zzu & 1048575);
                                zzufVar.zzy(zza3);
                                try {
                                    obj6 = zzui.zzn(obj5, zzc, zza3, zzw(zzq), obj4, zzuvVar);
                                    obj2 = obj5;
                                    zzuvVar2 = zzuvVar;
                                } catch (zzsw unused4) {
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzuvVar2 = zzuvVar;
                                    obj6 = obj3;
                                    if (obj6 == null) {
                                    }
                                    if (!zzuvVar2.zzk(obj6, zzufVar, 0)) {
                                    }
                                    obj = obj2;
                                } catch (Throwable th5) {
                                    th = th5;
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzuvVar2 = zzuvVar;
                                    th2 = th;
                                    obj6 = obj3;
                                    i7 = zztvVar.zzk;
                                    while (i7 < zztvVar.zzl) {
                                    }
                                    if (obj6 == null) {
                                    }
                                }
                                obj = obj2;
                                break;
                            case 45:
                                zzufVar.zzG(zztf.zza(obj5, zzu & 1048575));
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 46:
                                zzufVar.zzH(zztf.zza(obj5, zzu & 1048575));
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 47:
                                zzufVar.zzI(zztf.zza(obj5, zzu & 1048575));
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 48:
                                zzufVar.zzJ(zztf.zza(obj5, zzu & 1048575));
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 49:
                                zzufVar.zzC(zztf.zza(obj5, zzu & 1048575), zzx(zzq), zzryVar);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 50:
                                Object zzz = zzz(zzq);
                                long zzu2 = zzu(zzq) & 1048575;
                                Object zzf = zzvc.zzf(obj5, zzu2);
                                if (zzf == null) {
                                    zzf = zztm.zza().zzb();
                                    zzvc.zzs(obj5, zzu2, zzf);
                                } else if (zztn.zza(zzf)) {
                                    Object zzb2 = zztm.zza().zzb();
                                    zztn.zzb(zzb2, zzf);
                                    zzvc.zzs(obj5, zzu2, zzb2);
                                    zzf = zzb2;
                                }
                                throw null;
                                break;
                            case qs.o0 /* 51 */:
                                zzvc.zzs(obj5, zzu & 1048575, Double.valueOf(zzufVar.zza()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case qs.p0 /* 52 */:
                                zzvc.zzs(obj5, zzu & 1048575, Float.valueOf(zzufVar.zzb()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case qs.q0 /* 53 */:
                                zzvc.zzs(obj5, zzu & 1048575, Long.valueOf(zzufVar.zzl()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case qs.r0 /* 54 */:
                                zzvc.zzs(obj5, zzu & 1048575, Long.valueOf(zzufVar.zzo()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case qs.s0 /* 55 */:
                                zzvc.zzs(obj5, zzu & 1048575, Integer.valueOf(zzufVar.zzg()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case qs.t0 /* 56 */:
                                zzvc.zzs(obj5, zzu & 1048575, Long.valueOf(zzufVar.zzk()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case qs.u0 /* 57 */:
                                zzvc.zzs(obj5, zzu & 1048575, Integer.valueOf(zzufVar.zzf()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case qs.v0 /* 58 */:
                                zzvc.zzs(obj5, zzu & 1048575, Boolean.valueOf(zzufVar.zzN()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case qs.w0 /* 59 */:
                                zzG(obj5, zzu, zzufVar);
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case qs.x0 /* 60 */:
                                zzts zztsVar3 = (zzts) zzB(obj5, zzc, zzq);
                                zzufVar.zzu(zztsVar3, zzx(zzq), zzryVar);
                                zzK(obj5, zzc, zzq, zztsVar3);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case qs.y0 /* 61 */:
                                zzvc.zzs(obj5, zzu & 1048575, zzufVar.zzp());
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case qs.z0 /* 62 */:
                                zzvc.zzs(obj5, zzu & 1048575, Integer.valueOf(zzufVar.zzj()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case qs.A0 /* 63 */:
                                int zze3 = zzufVar.zze();
                                zzsr zzw2 = zzw(zzq);
                                if (zzw2 != null && !zzw2.zza(zze3)) {
                                    obj6 = zzui.zzo(obj5, zzc, zze3, obj4, zzuvVar);
                                    obj = obj5;
                                    break;
                                }
                                zzvc.zzs(obj5, zzu & 1048575, Integer.valueOf(zze3));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 64:
                                zzvc.zzs(obj5, zzu & 1048575, Integer.valueOf(zzufVar.zzh()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 65:
                                zzvc.zzs(obj5, zzu & 1048575, Long.valueOf(zzufVar.zzm()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case qs.D0 /* 66 */:
                                zzvc.zzs(obj5, zzu & 1048575, Integer.valueOf(zzufVar.zzi()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case qs.E0 /* 67 */:
                                zzvc.zzs(obj5, zzu & 1048575, Long.valueOf(zzufVar.zzn()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case qs.F0 /* 68 */:
                                zzts zztsVar4 = (zzts) zzB(obj5, zzc, zzq);
                                zzufVar.zzt(zztsVar4, zzx(zzq), zzryVar);
                                zzK(obj5, zzc, zzq, zztsVar4);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            default:
                                if (obj4 == null) {
                                    try {
                                        obj6 = zzuvVar.zza(obj5);
                                    } catch (Throwable th6) {
                                        th = th6;
                                        th2 = th;
                                        obj2 = obj5;
                                        obj3 = obj4;
                                        zzuvVar2 = zzuvVar;
                                        obj6 = obj3;
                                        i7 = zztvVar.zzk;
                                        while (i7 < zztvVar.zzl) {
                                        }
                                        if (obj6 == null) {
                                        }
                                    }
                                } else {
                                    obj6 = obj4;
                                }
                                try {
                                    if (!zzuvVar.zzk(obj6, zzufVar, 0)) {
                                        for (int i10 = zztvVar.zzk; i10 < zztvVar.zzl; i10++) {
                                            zzuv zzuvVar3 = zzuvVar;
                                            Object obj7 = obj5;
                                            zztvVar.zzy(obj7, zztvVar.zzj[i10], obj6, zzuvVar3, obj5);
                                            obj5 = obj7;
                                            zzuvVar = zzuvVar3;
                                        }
                                        break;
                                    }
                                    obj = obj5;
                                    break;
                                } catch (zzsw unused5) {
                                    obj2 = obj5;
                                    zzuvVar2 = zzuvVar;
                                    if (obj6 == null) {
                                        try {
                                            obj6 = zzuvVar2.zza(obj2);
                                        } catch (Throwable th7) {
                                            th2 = th7;
                                            i7 = zztvVar.zzk;
                                            while (i7 < zztvVar.zzl) {
                                                zztvVar.zzy(obj2, zztvVar.zzj[i7], obj6, zzuvVar2, obj2);
                                                i7++;
                                                zztvVar = this;
                                            }
                                            if (obj6 == null) {
                                                throw th2;
                                            }
                                            zzuvVar2.zzj(obj2, obj6);
                                            throw th2;
                                        }
                                    }
                                    if (!zzuvVar2.zzk(obj6, zzufVar, 0)) {
                                        for (int i11 = zztvVar.zzk; i11 < zztvVar.zzl; i11++) {
                                            zztvVar.zzy(obj2, zztvVar.zzj[i11], obj6, zzuvVar2, obj2);
                                        }
                                        if (obj6 == null) {
                                        }
                                    }
                                    obj = obj2;
                                } catch (Throwable th8) {
                                    th = th8;
                                    th2 = th;
                                    obj2 = obj5;
                                    zzuvVar2 = zzuvVar;
                                    i7 = zztvVar.zzk;
                                    while (i7 < zztvVar.zzl) {
                                    }
                                    if (obj6 == null) {
                                    }
                                }
                                break;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        obj2 = obj5;
                    }
                } else if (zzc == Integer.MAX_VALUE) {
                    int i12 = this.zzk;
                    while (i12 < this.zzl) {
                        zzy(obj, this.zzj[i12], obj6, zzuvVar2, obj);
                        i12++;
                        zzuvVar2 = zzuvVar2;
                    }
                    obj2 = obj;
                    zzuvVar2 = zzuvVar2;
                } else {
                    zzuvVar = zzuvVar2;
                    obj4 = obj6;
                    try {
                        zzsm zza4 = !this.zzh ? null : zzryVar.zza(this.zzg, zzc);
                        if (zza4 != null) {
                            if (zzsdVar == null) {
                                try {
                                    zzsdVar = ((zzsk) obj).zzi();
                                } catch (Throwable th10) {
                                    th2 = th10;
                                    obj2 = obj;
                                    zztvVar = this;
                                    obj3 = obj4;
                                    zzuvVar2 = zzuvVar;
                                    obj6 = obj3;
                                    i7 = zztvVar.zzk;
                                    while (i7 < zztvVar.zzl) {
                                    }
                                    if (obj6 == null) {
                                    }
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
                                    obj6 = obj4;
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
                                    obj6 = obj4;
                                    break;
                                case 2:
                                    valueOf = Long.valueOf(zzufVar.zzl());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 3:
                                    valueOf = Long.valueOf(zzufVar.zzo());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 4:
                                    valueOf = Integer.valueOf(zzufVar.zzg());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr2222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 5:
                                    valueOf = Long.valueOf(zzufVar.zzk());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 6:
                                    valueOf = Integer.valueOf(zzufVar.zzf());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 7:
                                    valueOf = Boolean.valueOf(zzufVar.zzN());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr2222222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 8:
                                    valueOf = zzufVar.zzr();
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22222222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj6 = obj4;
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
                                    obj6 = obj4;
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
                                    obj6 = obj4;
                                    break;
                                case 11:
                                    valueOf = zzufVar.zzp();
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222222222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 12:
                                    valueOf = Integer.valueOf(zzufVar.zzj());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr2222222222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj6 = obj4;
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
                                    obj6 = obj4;
                                    break;
                                case 15:
                                    valueOf = Long.valueOf(zzufVar.zzm());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222222222222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 16:
                                    valueOf = Integer.valueOf(zzufVar.zzi());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr2222222222222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 17:
                                    valueOf = Long.valueOf(zzufVar.zzn());
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22222222222222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj6 = obj4;
                                    break;
                                default:
                                    valueOf = null;
                                    ordinal = zzvgVar2.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222222222222222 = zzsv.zzb;
                                    valueOf = ((zzts) zze).zzag().zzc((zzts) valueOf).zzl();
                                    zzsdVar.zzi(zzslVar, valueOf);
                                    obj6 = obj4;
                                    break;
                            }
                        } else {
                            obj6 = obj4 == null ? zzuvVar.zza(obj) : obj4;
                            try {
                                if (zzuvVar.zzk(obj6, zzufVar, 0)) {
                                    obj5 = obj;
                                    obj = obj5;
                                } else {
                                    int i13 = this.zzk;
                                    while (i13 < this.zzl) {
                                        zzuv zzuvVar4 = zzuvVar;
                                        Object obj8 = obj;
                                        zzy(obj8, this.zzj[i13], obj6, zzuvVar4, obj);
                                        zzuvVar = zzuvVar4;
                                        i13++;
                                        obj = obj8;
                                    }
                                    obj5 = obj;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                obj5 = obj;
                                zztvVar = this;
                                th2 = th;
                                obj2 = obj5;
                                zzuvVar2 = zzuvVar;
                                i7 = zztvVar.zzk;
                                while (i7 < zztvVar.zzl) {
                                }
                                if (obj6 == null) {
                                }
                            }
                        }
                    } catch (Throwable th12) {
                        th = th12;
                        obj5 = obj;
                        zztvVar = this;
                        th2 = th;
                        obj2 = obj5;
                        obj3 = obj4;
                        zzuvVar2 = zzuvVar;
                        obj6 = obj3;
                        i7 = zztvVar.zzk;
                        while (i7 < zztvVar.zzl) {
                        }
                        if (obj6 == null) {
                        }
                    }
                }
                zzuvVar2 = zzuvVar;
            } catch (Throwable th13) {
                th = th13;
                obj2 = obj;
                obj3 = obj6;
                zztvVar = this;
            }
        }
        obj2 = obj5;
        zzuvVar2 = zzuvVar;
        if (obj6 == null) {
            zzuvVar2.zzj(obj2, obj6);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final void zzi(Object obj, byte[] bArr, int i7, int i10, zzqb zzqbVar) {
        zzc(obj, bArr, i7, i10, 0, zzqbVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // com.google.android.recaptcha.internal.zzug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(Object obj, zzvi zzviVar) {
        Map.Entry entry;
        Iterator it;
        int[] iArr;
        int i7;
        boolean z9;
        Map.Entry entry2;
        int i10;
        int i11;
        int i12;
        int i13;
        zztv<T> zztvVar = this;
        if (zztvVar.zzh) {
            zzsd zzsdVar = ((zzsk) obj).zzb;
            if (!zzsdVar.zza.isEmpty()) {
                Iterator zzf = zzsdVar.zzf();
                entry = (Map.Entry) zzf.next();
                it = zzf;
                iArr = zztvVar.zzc;
                Unsafe unsafe = zzb;
                int i14 = 1048575;
                int i15 = 1048575;
                i7 = 0;
                int i16 = 0;
                while (i7 < iArr.length) {
                    int zzu = zztvVar.zzu(i7);
                    int zzt = zzt(zzu);
                    int i17 = iArr[i7];
                    if (zzt <= 17) {
                        int i18 = iArr[i7 + 2];
                        z9 = true;
                        int i19 = i18 & i14;
                        if (i19 != i15) {
                            i16 = i19 == i14 ? 0 : unsafe.getInt(obj, i19);
                            i15 = i19;
                        }
                        int i20 = 1 << (i18 >>> 20);
                        entry2 = entry;
                        i10 = i15;
                        i11 = i16;
                        i12 = i20;
                    } else {
                        z9 = true;
                        entry2 = entry;
                        i10 = i15;
                        i11 = i16;
                        i12 = 0;
                    }
                    while (true) {
                        if (entry2 != null) {
                            zzrz zzrzVar = zztvVar.zzn;
                            i13 = i14;
                            if (((zzsl) entry2.getKey()).zza <= i17) {
                                zzrzVar.zzb(zzviVar, entry2);
                                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                                i14 = i13;
                            }
                        } else {
                            i13 = i14;
                        }
                    }
                    long j3 = zzu & i13;
                    switch (zzt) {
                        case 0:
                            if (zztvVar.zzO(obj, i7, i10, i11, i12)) {
                                zzviVar.zzf(i17, zzvc.zza(obj, j3));
                            }
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 1:
                            if (zztvVar.zzO(obj, i7, i10, i11, i12)) {
                                zzviVar.zzo(i17, zzvc.zzb(obj, j3));
                            }
                            zztvVar = this;
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 2:
                            if (zztvVar.zzO(obj, i7, i10, i11, i12)) {
                                zzviVar.zzt(i17, unsafe.getLong(obj, j3));
                            }
                            zztvVar = this;
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 3:
                            if (zztvVar.zzO(obj, i7, i10, i11, i12)) {
                                zzviVar.zzK(i17, unsafe.getLong(obj, j3));
                            }
                            zztvVar = this;
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 4:
                            if (zztvVar.zzO(obj, i7, i10, i11, i12)) {
                                zzviVar.zzr(i17, unsafe.getInt(obj, j3));
                            }
                            zztvVar = this;
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 5:
                            if (zztvVar.zzO(obj, i7, i10, i11, i12)) {
                                zzviVar.zzm(i17, unsafe.getLong(obj, j3));
                            }
                            zztvVar = this;
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 6:
                            if (zztvVar.zzO(obj, i7, i10, i11, i12)) {
                                zzviVar.zzk(i17, unsafe.getInt(obj, j3));
                            }
                            zztvVar = this;
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 7:
                            if (zztvVar.zzO(obj, i7, i10, i11, i12)) {
                                zzviVar.zzb(i17, zzvc.zzw(obj, j3));
                            }
                            zztvVar = this;
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 8:
                            if (zztvVar.zzO(obj, i7, i10, i11, i12)) {
                                zzT(i17, unsafe.getObject(obj, j3), zzviVar);
                            }
                            zztvVar = this;
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 9:
                            if (zztvVar.zzO(obj, i7, i10, i11, i12)) {
                                zzviVar.zzv(i17, unsafe.getObject(obj, j3), zztvVar.zzx(i7));
                            }
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 10:
                            if (zztvVar.zzO(obj, i7, i10, i11, i12)) {
                                zzviVar.zzd(i17, (zzqm) unsafe.getObject(obj, j3));
                            }
                            zztvVar = this;
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 11:
                            if (zztvVar.zzO(obj, i7, i10, i11, i12)) {
                                zzviVar.zzI(i17, unsafe.getInt(obj, j3));
                            }
                            zztvVar = this;
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 12:
                            if (zztvVar.zzO(obj, i7, i10, i11, i12)) {
                                zzviVar.zzi(i17, unsafe.getInt(obj, j3));
                            }
                            zztvVar = this;
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 13:
                            if (zztvVar.zzO(obj, i7, i10, i11, i12)) {
                                zzviVar.zzx(i17, unsafe.getInt(obj, j3));
                            }
                            zztvVar = this;
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 14:
                            if (zztvVar.zzO(obj, i7, i10, i11, i12)) {
                                zzviVar.zzz(i17, unsafe.getLong(obj, j3));
                            }
                            zztvVar = this;
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 15:
                            if (zztvVar.zzO(obj, i7, i10, i11, i12)) {
                                zzviVar.zzB(i17, unsafe.getInt(obj, j3));
                            }
                            zztvVar = this;
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 16:
                            if (zztvVar.zzO(obj, i7, i10, i11, i12)) {
                                zzviVar.zzD(i17, unsafe.getLong(obj, j3));
                            }
                            zztvVar = this;
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 17:
                            if (zztvVar.zzO(obj, i7, i10, i11, i12)) {
                                zzviVar.zzq(i17, unsafe.getObject(obj, j3), zztvVar.zzx(i7));
                            }
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 18:
                            zzui.zzs(iArr[i7], (List) unsafe.getObject(obj, j3), zzviVar, false);
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 19:
                            zzui.zzw(iArr[i7], (List) unsafe.getObject(obj, j3), zzviVar, false);
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 20:
                            zzui.zzy(iArr[i7], (List) unsafe.getObject(obj, j3), zzviVar, false);
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 21:
                            zzui.zzE(iArr[i7], (List) unsafe.getObject(obj, j3), zzviVar, false);
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 22:
                            zzui.zzx(iArr[i7], (List) unsafe.getObject(obj, j3), zzviVar, false);
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 23:
                            zzui.zzv(iArr[i7], (List) unsafe.getObject(obj, j3), zzviVar, false);
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 24:
                            zzui.zzu(iArr[i7], (List) unsafe.getObject(obj, j3), zzviVar, false);
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 25:
                            zzui.zzr(iArr[i7], (List) unsafe.getObject(obj, j3), zzviVar, false);
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 26:
                            int i21 = iArr[i7];
                            List list = (List) unsafe.getObject(obj, j3);
                            int i22 = zzui.zza;
                            if (list != null && !list.isEmpty()) {
                                zzviVar.zzH(i21, list);
                            }
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                            break;
                        case 27:
                            int i23 = iArr[i7];
                            List list2 = (List) unsafe.getObject(obj, j3);
                            zzug zzx = zztvVar.zzx(i7);
                            int i24 = zzui.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i25 = 0; i25 < list2.size(); i25++) {
                                    ((zzqw) zzviVar).zzv(i23, list2.get(i25), zzx);
                                }
                            }
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                            break;
                        case 28:
                            int i26 = iArr[i7];
                            List list3 = (List) unsafe.getObject(obj, j3);
                            int i27 = zzui.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzviVar.zze(i26, list3);
                            }
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                            break;
                        case 29:
                            zzui.zzD(iArr[i7], (List) unsafe.getObject(obj, j3), zzviVar, false);
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case qs.T /* 30 */:
                            zzui.zzt(iArr[i7], (List) unsafe.getObject(obj, j3), zzviVar, false);
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case qs.U /* 31 */:
                            zzui.zzz(iArr[i7], (List) unsafe.getObject(obj, j3), zzviVar, false);
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 32:
                            zzui.zzA(iArr[i7], (List) unsafe.getObject(obj, j3), zzviVar, false);
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 33:
                            zzui.zzB(iArr[i7], (List) unsafe.getObject(obj, j3), zzviVar, false);
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 34:
                            zzui.zzC(iArr[i7], (List) unsafe.getObject(obj, j3), zzviVar, false);
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 35:
                            zzui.zzs(iArr[i7], (List) unsafe.getObject(obj, j3), zzviVar, z9);
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 36:
                            zzui.zzw(iArr[i7], (List) unsafe.getObject(obj, j3), zzviVar, z9);
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 37:
                            zzui.zzy(iArr[i7], (List) unsafe.getObject(obj, j3), zzviVar, z9);
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 38:
                            zzui.zzE(iArr[i7], (List) unsafe.getObject(obj, j3), zzviVar, z9);
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 39:
                            zzui.zzx(iArr[i7], (List) unsafe.getObject(obj, j3), zzviVar, z9);
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 40:
                            zzui.zzv(iArr[i7], (List) unsafe.getObject(obj, j3), zzviVar, z9);
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 41:
                            zzui.zzu(iArr[i7], (List) unsafe.getObject(obj, j3), zzviVar, z9);
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 42:
                            zzui.zzr(iArr[i7], (List) unsafe.getObject(obj, j3), zzviVar, z9);
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 43:
                            zzui.zzD(iArr[i7], (List) unsafe.getObject(obj, j3), zzviVar, z9);
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 44:
                            zzui.zzt(iArr[i7], (List) unsafe.getObject(obj, j3), zzviVar, z9);
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 45:
                            zzui.zzz(iArr[i7], (List) unsafe.getObject(obj, j3), zzviVar, z9);
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 46:
                            zzui.zzA(iArr[i7], (List) unsafe.getObject(obj, j3), zzviVar, z9);
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 47:
                            zzui.zzB(iArr[i7], (List) unsafe.getObject(obj, j3), zzviVar, z9);
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 48:
                            zzui.zzC(iArr[i7], (List) unsafe.getObject(obj, j3), zzviVar, z9);
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 49:
                            int i28 = iArr[i7];
                            List list4 = (List) unsafe.getObject(obj, j3);
                            zzug zzx2 = zztvVar.zzx(i7);
                            int i29 = zzui.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i30 = 0; i30 < list4.size(); i30++) {
                                    ((zzqw) zzviVar).zzq(i28, list4.get(i30), zzx2);
                                }
                            }
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j3) != null) {
                                throw null;
                            }
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case qs.o0 /* 51 */:
                            if (zztvVar.zzR(obj, i17, i7)) {
                                zzviVar.zzf(i17, zzn(obj, j3));
                            }
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case qs.p0 /* 52 */:
                            if (zztvVar.zzR(obj, i17, i7)) {
                                zzviVar.zzo(i17, zzo(obj, j3));
                            }
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case qs.q0 /* 53 */:
                            if (zztvVar.zzR(obj, i17, i7)) {
                                zzviVar.zzt(i17, zzv(obj, j3));
                            }
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case qs.r0 /* 54 */:
                            if (zztvVar.zzR(obj, i17, i7)) {
                                zzviVar.zzK(i17, zzv(obj, j3));
                            }
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case qs.s0 /* 55 */:
                            if (zztvVar.zzR(obj, i17, i7)) {
                                zzviVar.zzr(i17, zzp(obj, j3));
                            }
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case qs.t0 /* 56 */:
                            if (zztvVar.zzR(obj, i17, i7)) {
                                zzviVar.zzm(i17, zzv(obj, j3));
                            }
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case qs.u0 /* 57 */:
                            if (zztvVar.zzR(obj, i17, i7)) {
                                zzviVar.zzk(i17, zzp(obj, j3));
                            }
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case qs.v0 /* 58 */:
                            if (zztvVar.zzR(obj, i17, i7)) {
                                zzviVar.zzb(i17, zzS(obj, j3));
                            }
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case qs.w0 /* 59 */:
                            if (zztvVar.zzR(obj, i17, i7)) {
                                zzT(i17, unsafe.getObject(obj, j3), zzviVar);
                            }
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case qs.x0 /* 60 */:
                            if (zztvVar.zzR(obj, i17, i7)) {
                                zzviVar.zzv(i17, unsafe.getObject(obj, j3), zztvVar.zzx(i7));
                            }
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case qs.y0 /* 61 */:
                            if (zztvVar.zzR(obj, i17, i7)) {
                                zzviVar.zzd(i17, (zzqm) unsafe.getObject(obj, j3));
                            }
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case qs.z0 /* 62 */:
                            if (zztvVar.zzR(obj, i17, i7)) {
                                zzviVar.zzI(i17, zzp(obj, j3));
                            }
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case qs.A0 /* 63 */:
                            if (zztvVar.zzR(obj, i17, i7)) {
                                zzviVar.zzi(i17, zzp(obj, j3));
                            }
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 64:
                            if (zztvVar.zzR(obj, i17, i7)) {
                                zzviVar.zzx(i17, zzp(obj, j3));
                            }
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case 65:
                            if (zztvVar.zzR(obj, i17, i7)) {
                                zzviVar.zzz(i17, zzv(obj, j3));
                            }
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case qs.D0 /* 66 */:
                            if (zztvVar.zzR(obj, i17, i7)) {
                                zzviVar.zzB(i17, zzp(obj, j3));
                            }
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case qs.E0 /* 67 */:
                            if (zztvVar.zzR(obj, i17, i7)) {
                                zzviVar.zzD(i17, zzv(obj, j3));
                            }
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        case qs.F0 /* 68 */:
                            if (zztvVar.zzR(obj, i17, i7)) {
                                zzviVar.zzq(i17, unsafe.getObject(obj, j3), zztvVar.zzx(i7));
                            }
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
                            entry = entry2;
                        default:
                            i7 += 3;
                            i16 = i11;
                            i14 = i13;
                            i15 = i10;
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
        int i142 = 1048575;
        int i152 = 1048575;
        i7 = 0;
        int i162 = 0;
        while (i7 < iArr.length) {
        }
        while (entry != null) {
        }
        ((zzsn) obj).zzc.zzl(zzviVar);
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final boolean zzk(Object obj, Object obj2) {
        boolean zzF;
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int zzu = zzu(i7);
            long j3 = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (zzL(obj, obj2, i7) && Double.doubleToLongBits(zzvc.zza(obj, j3)) == Double.doubleToLongBits(zzvc.zza(obj2, j3))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i7) && Float.floatToIntBits(zzvc.zzb(obj, j3)) == Float.floatToIntBits(zzvc.zzb(obj2, j3))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i7) && zzvc.zzd(obj, j3) == zzvc.zzd(obj2, j3)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i7) && zzvc.zzd(obj, j3) == zzvc.zzd(obj2, j3)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i7) && zzvc.zzc(obj, j3) == zzvc.zzc(obj2, j3)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i7) && zzvc.zzd(obj, j3) == zzvc.zzd(obj2, j3)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i7) && zzvc.zzc(obj, j3) == zzvc.zzc(obj2, j3)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i7) && zzvc.zzw(obj, j3) == zzvc.zzw(obj2, j3)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i7) && zzui.zzF(zzvc.zzf(obj, j3), zzvc.zzf(obj2, j3))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i7) && zzui.zzF(zzvc.zzf(obj, j3), zzvc.zzf(obj2, j3))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i7) && zzui.zzF(zzvc.zzf(obj, j3), zzvc.zzf(obj2, j3))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i7) && zzvc.zzc(obj, j3) == zzvc.zzc(obj2, j3)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i7) && zzvc.zzc(obj, j3) == zzvc.zzc(obj2, j3)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i7) && zzvc.zzc(obj, j3) == zzvc.zzc(obj2, j3)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i7) && zzvc.zzd(obj, j3) == zzvc.zzd(obj2, j3)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i7) && zzvc.zzc(obj, j3) == zzvc.zzc(obj2, j3)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i7) && zzvc.zzd(obj, j3) == zzvc.zzd(obj2, j3)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i7) && zzui.zzF(zzvc.zzf(obj, j3), zzvc.zzf(obj2, j3))) {
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
                case qs.T /* 30 */:
                case qs.U /* 31 */:
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
                    zzF = zzui.zzF(zzvc.zzf(obj, j3), zzvc.zzf(obj2, j3));
                    break;
                case 50:
                    zzF = zzui.zzF(zzvc.zzf(obj, j3), zzvc.zzf(obj2, j3));
                    break;
                case qs.o0 /* 51 */:
                case qs.p0 /* 52 */:
                case qs.q0 /* 53 */:
                case qs.r0 /* 54 */:
                case qs.s0 /* 55 */:
                case qs.t0 /* 56 */:
                case qs.u0 /* 57 */:
                case qs.v0 /* 58 */:
                case qs.w0 /* 59 */:
                case qs.x0 /* 60 */:
                case qs.y0 /* 61 */:
                case qs.z0 /* 62 */:
                case qs.A0 /* 63 */:
                case 64:
                case 65:
                case qs.D0 /* 66 */:
                case qs.E0 /* 67 */:
                case qs.F0 /* 68 */:
                    long zzr = zzr(i7) & 1048575;
                    if (zzvc.zzc(obj, zzr) == zzvc.zzc(obj2, zzr) && zzui.zzF(zzvc.zzf(obj, j3), zzvc.zzf(obj2, j3))) {
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
        int i7;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i15 = iArr[i13];
            int i16 = iArr2[i15];
            int zzu = zzu(i15);
            int i17 = iArr2[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = zzb.getInt(obj, i18);
                }
                i10 = i15;
                i11 = i12;
                i7 = i18;
            } else {
                int i20 = i12;
                i7 = i14;
                i10 = i15;
                i11 = i20;
            }
            if ((268435456 & zzu) != 0 && !zzO(obj, i10, i7, i11, i19)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt == 60 || zzt == 68) {
                        if (zzR(obj, i16, i10) && !zzP(obj, zzu, zzx(i10))) {
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
                    zzug zzx = zzx(i10);
                    for (int i21 = 0; i21 < list.size(); i21++) {
                        if (!zzx.zzl(list.get(i21))) {
                            return false;
                        }
                    }
                }
            } else if (zzO(obj, i10, i7, i11, i19) && !zzP(obj, zzu, zzx(i10))) {
                return false;
            }
            i13++;
            i14 = i7;
            i12 = i11;
        }
        return !this.zzh || ((zzsk) obj).zzb.zzk();
    }
}
