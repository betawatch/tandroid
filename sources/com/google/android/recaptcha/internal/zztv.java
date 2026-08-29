package com.google.android.recaptcha.internal;

import androidx.car.app.navigation.model.Maneuver;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.CharacterCompat;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.th;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    private zztv(int[] iArr, Object[] objArr, int i10, int i11, zzts zztsVar, boolean z10, int[] iArr2, int i12, int i13, zzty zztyVar, zztf zztfVar, zzuv zzuvVar, zzrz zzrzVar, zztn zztnVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zztsVar instanceof zzsn;
        boolean z11 = false;
        if (zzrzVar != null && (zztsVar instanceof zzsk)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzm = zzuvVar;
        this.zzn = zzrzVar;
        this.zzg = zztsVar;
    }

    private final Object zzA(Object obj, int i10) {
        zzug zzx = zzx(i10);
        int zzu = zzu(i10) & 1048575;
        if (!zzN(obj, i10)) {
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

    private final Object zzB(Object obj, int i10, int i11) {
        zzug zzx = zzx(i11);
        if (!zzR(obj, i10, i11)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i11) & 1048575);
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
            StringBuilder k9 = th.k("Field ", str, " for ", name, " not found. Known fields are ");
            k9.append(arrays);
            throw new RuntimeException(k9.toString(), e10);
        }
    }

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i10) {
        if (zzN(obj2, i10)) {
            int zzu = zzu(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = zzu;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzug zzx = zzx(i10);
            if (!zzN(obj, i10)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j10, zze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzH(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j10, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i10) {
        int[] iArr = this.zzc;
        int i11 = iArr[i10];
        if (zzR(obj2, i11, i10)) {
            int zzu = zzu(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = zzu;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2.toString());
            }
            zzug zzx = zzx(i10);
            if (!zzR(obj, i11, i10)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j10, zze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzI(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j10, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i10, zzuf zzufVar) {
        long j10 = i10 & 1048575;
        if (zzM(i10)) {
            zzvc.zzs(obj, j10, zzufVar.zzs());
        } else if (this.zzi) {
            zzvc.zzs(obj, j10, zzufVar.zzr());
        } else {
            zzvc.zzs(obj, j10, zzufVar.zzp());
        }
    }

    private final void zzH(Object obj, int i10) {
        int zzr = zzr(i10);
        long j10 = 1048575 & zzr;
        if (j10 == 1048575) {
            return;
        }
        zzvc.zzq(obj, j10, (1 << (zzr >>> 20)) | zzvc.zzc(obj, j10));
    }

    private final void zzI(Object obj, int i10, int i11) {
        zzvc.zzq(obj, zzr(i11) & 1048575, i10);
    }

    private final void zzJ(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzu(i10) & 1048575, obj2);
        zzH(obj, i10);
    }

    private final void zzK(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzu(i11) & 1048575, obj2);
        zzI(obj, i10, i11);
    }

    private final boolean zzL(Object obj, Object obj2, int i10) {
        return zzN(obj, i10) == zzN(obj2, i10);
    }

    private static boolean zzM(int i10) {
        return (i10 & TLObject.FLAG_29) != 0;
    }

    private final boolean zzN(Object obj, int i10) {
        int zzr = zzr(i10);
        long j10 = zzr & 1048575;
        if (j10 != 1048575) {
            return (zzvc.zzc(obj, j10) & (1 << (zzr >>> 20))) != 0;
        }
        int zzu = zzu(i10);
        long j11 = zzu & 1048575;
        switch (zzt(zzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzvc.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzvc.zzb(obj, j11)) != 0;
            case 2:
                return zzvc.zzd(obj, j11) != 0;
            case 3:
                return zzvc.zzd(obj, j11) != 0;
            case 4:
                return zzvc.zzc(obj, j11) != 0;
            case 5:
                return zzvc.zzd(obj, j11) != 0;
            case 6:
                return zzvc.zzc(obj, j11) != 0;
            case 7:
                return zzvc.zzw(obj, j11);
            case 8:
                Object zzf = zzvc.zzf(obj, j11);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzqm) {
                    return !zzqm.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzvc.zzf(obj, j11) != null;
            case 10:
                return !zzqm.zzb.equals(zzvc.zzf(obj, j11));
            case 11:
                return zzvc.zzc(obj, j11) != 0;
            case 12:
                return zzvc.zzc(obj, j11) != 0;
            case 13:
                return zzvc.zzc(obj, j11) != 0;
            case 14:
                return zzvc.zzd(obj, j11) != 0;
            case 15:
                return zzvc.zzc(obj, j11) != 0;
            case 16:
                return zzvc.zzd(obj, j11) != 0;
            case 17:
                return zzvc.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzN(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean zzP(Object obj, int i10, zzug zzugVar) {
        return zzugVar.zzl(zzvc.zzf(obj, i10 & 1048575));
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

    private final boolean zzR(Object obj, int i10, int i11) {
        return zzvc.zzc(obj, (long) (zzr(i11) & 1048575)) == i10;
    }

    private static boolean zzS(Object obj, long j10) {
        return ((Boolean) zzvc.zzf(obj, j10)).booleanValue();
    }

    private static final void zzT(int i10, Object obj, zzvi zzviVar) {
        if (obj instanceof String) {
            zzviVar.zzG(i10, (String) obj);
        } else {
            zzviVar.zzd(i10, (zzqm) obj);
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

    /* JADX WARN: Removed duplicated region for block: B:105:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zztv zzm(Class cls, zztp zztpVar, zzty zztyVar, zztf zztfVar, zzuv zzuvVar, zzrz zzrzVar, zztn zztnVar) {
        int i10;
        int charAt;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        int i17;
        char charAt2;
        int i18;
        char charAt3;
        int i19;
        char charAt4;
        int i20;
        char charAt5;
        int i21;
        char charAt6;
        int i22;
        char charAt7;
        int i23;
        char charAt8;
        int i24;
        char charAt9;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        String str;
        int objectFieldOffset;
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
        char charAt15 = zzd.charAt(0);
        char c3 = CharacterCompat.MIN_HIGH_SURROGATE;
        if (charAt15 >= 55296) {
            int i42 = 1;
            while (true) {
                i10 = i42 + 1;
                if (zzd.charAt(i42) < 55296) {
                    break;
                }
                i42 = i10;
            }
        } else {
            i10 = 1;
        }
        int i43 = i10 + 1;
        int charAt16 = zzd.charAt(i10);
        if (charAt16 >= 55296) {
            int i44 = charAt16 & 8191;
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
            charAt16 = i44 | (charAt14 << i45);
            i43 = i41;
        }
        if (charAt16 == 0) {
            iArr = zza;
            i16 = 0;
            i12 = 0;
            i15 = 0;
            charAt = 0;
            i11 = 0;
            i13 = 0;
            i14 = 0;
        } else {
            int i46 = i43 + 1;
            int charAt17 = zzd.charAt(i43);
            if (charAt17 >= 55296) {
                int i47 = charAt17 & 8191;
                int i48 = 13;
                while (true) {
                    i24 = i46 + 1;
                    charAt9 = zzd.charAt(i46);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i47 |= (charAt9 & 8191) << i48;
                    i48 += 13;
                    i46 = i24;
                }
                charAt17 = i47 | (charAt9 << i48);
                i46 = i24;
            }
            int i49 = i46 + 1;
            int charAt18 = zzd.charAt(i46);
            if (charAt18 >= 55296) {
                int i50 = charAt18 & 8191;
                int i51 = 13;
                while (true) {
                    i23 = i49 + 1;
                    charAt8 = zzd.charAt(i49);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i50 |= (charAt8 & 8191) << i51;
                    i51 += 13;
                    i49 = i23;
                }
                charAt18 = i50 | (charAt8 << i51);
                i49 = i23;
            }
            int i52 = i49 + 1;
            int charAt19 = zzd.charAt(i49);
            if (charAt19 >= 55296) {
                int i53 = charAt19 & 8191;
                int i54 = 13;
                while (true) {
                    i22 = i52 + 1;
                    charAt7 = zzd.charAt(i52);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i53 |= (charAt7 & 8191) << i54;
                    i54 += 13;
                    i52 = i22;
                }
                charAt19 = i53 | (charAt7 << i54);
                i52 = i22;
            }
            int i55 = i52 + 1;
            int charAt20 = zzd.charAt(i52);
            if (charAt20 >= 55296) {
                int i56 = charAt20 & 8191;
                int i57 = 13;
                while (true) {
                    i21 = i55 + 1;
                    charAt6 = zzd.charAt(i55);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i56 |= (charAt6 & 8191) << i57;
                    i57 += 13;
                    i55 = i21;
                }
                charAt20 = i56 | (charAt6 << i57);
                i55 = i21;
            }
            int i58 = i55 + 1;
            charAt = zzd.charAt(i55);
            if (charAt >= 55296) {
                int i59 = charAt & 8191;
                int i60 = 13;
                while (true) {
                    i20 = i58 + 1;
                    charAt5 = zzd.charAt(i58);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i59 |= (charAt5 & 8191) << i60;
                    i60 += 13;
                    i58 = i20;
                }
                charAt = i59 | (charAt5 << i60);
                i58 = i20;
            }
            int i61 = i58 + 1;
            int charAt21 = zzd.charAt(i58);
            if (charAt21 >= 55296) {
                int i62 = charAt21 & 8191;
                int i63 = 13;
                while (true) {
                    i19 = i61 + 1;
                    charAt4 = zzd.charAt(i61);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i62 |= (charAt4 & 8191) << i63;
                    i63 += 13;
                    i61 = i19;
                }
                charAt21 = i62 | (charAt4 << i63);
                i61 = i19;
            }
            int i64 = i61 + 1;
            int charAt22 = zzd.charAt(i61);
            if (charAt22 >= 55296) {
                int i65 = charAt22 & 8191;
                int i66 = 13;
                while (true) {
                    i18 = i64 + 1;
                    charAt3 = zzd.charAt(i64);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i65 |= (charAt3 & 8191) << i66;
                    i66 += 13;
                    i64 = i18;
                }
                charAt22 = i65 | (charAt3 << i66);
                i64 = i18;
            }
            int i67 = i64 + 1;
            int charAt23 = zzd.charAt(i64);
            if (charAt23 >= 55296) {
                int i68 = charAt23 & 8191;
                int i69 = 13;
                while (true) {
                    i17 = i67 + 1;
                    charAt2 = zzd.charAt(i67);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i68 |= (charAt2 & 8191) << i69;
                    i69 += 13;
                    i67 = i17;
                }
                charAt23 = i68 | (charAt2 << i69);
                i67 = i17;
            }
            int i70 = charAt17 + charAt17 + charAt18;
            int[] iArr2 = new int[charAt23 + charAt21 + charAt22];
            int i71 = charAt21;
            i11 = charAt19;
            i12 = i71;
            i13 = charAt20;
            i14 = charAt23;
            i15 = i70;
            iArr = iArr2;
            i16 = charAt17;
            i43 = i67;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzueVar.zze();
        Class<?> cls2 = zzueVar.zza().getClass();
        int i72 = i14 + i12;
        int i73 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i73];
        int i74 = i14;
        int i75 = i72;
        int i76 = 0;
        int i77 = 0;
        while (i43 < length) {
            int i78 = i43 + 1;
            int charAt24 = zzd.charAt(i43);
            if (charAt24 >= c3) {
                int i79 = charAt24 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i40 = i80 + 1;
                    charAt13 = zzd.charAt(i80);
                    if (charAt13 < c3) {
                        break;
                    }
                    i79 |= (charAt13 & 8191) << i81;
                    i81 += 13;
                    i80 = i40;
                }
                charAt24 = i79 | (charAt13 << i81);
                i25 = i40;
            } else {
                i25 = i78;
            }
            int i82 = i25 + 1;
            int charAt25 = zzd.charAt(i25);
            if (charAt25 >= c3) {
                int i83 = charAt25 & 8191;
                int i84 = i82;
                int i85 = 13;
                while (true) {
                    i39 = i84 + 1;
                    charAt12 = zzd.charAt(i84);
                    if (charAt12 < c3) {
                        break;
                    }
                    i83 |= (charAt12 & 8191) << i85;
                    i85 += 13;
                    i84 = i39;
                }
                charAt25 = i83 | (charAt12 << i85);
                i26 = i39;
            } else {
                i26 = i82;
            }
            if ((charAt25 & 1024) != 0) {
                iArr[i76] = i77;
                i76++;
            }
            int i86 = charAt25 & 255;
            zzue zzueVar2 = zzueVar;
            int i87 = charAt25 & 2048;
            if (i86 >= 51) {
                int i88 = i26 + 1;
                int charAt26 = zzd.charAt(i26);
                char c6 = CharacterCompat.MIN_HIGH_SURROGATE;
                if (charAt26 >= 55296) {
                    int i89 = charAt26 & 8191;
                    int i90 = i88;
                    int i91 = 13;
                    while (true) {
                        i38 = i90 + 1;
                        charAt11 = zzd.charAt(i90);
                        if (charAt11 < c6) {
                            break;
                        }
                        i89 |= (charAt11 & 8191) << i91;
                        i91 += 13;
                        i90 = i38;
                        c6 = CharacterCompat.MIN_HIGH_SURROGATE;
                    }
                    charAt26 = i89 | (charAt11 << i91);
                    i35 = i38;
                } else {
                    i35 = i88;
                }
                int i92 = i35;
                int i93 = i86 - 51;
                i27 = length;
                if (i93 == 9 || i93 == 17) {
                    i36 = i15 + 1;
                    int i94 = i77 / 3;
                    objArr[i94 + i94 + 1] = zze[i15];
                } else {
                    if (i93 == 12) {
                        if (zzueVar2.zzc() == 1 || i87 != 0) {
                            i36 = i15 + 1;
                            int i95 = i77 / 3;
                            objArr[i95 + i95 + 1] = zze[i15];
                        } else {
                            i37 = 0;
                            int i96 = charAt26 + charAt26;
                            obj = zze[i96];
                            i87 = i37;
                            if (obj instanceof Field) {
                                zzC2 = (Field) obj;
                            } else {
                                zzC2 = zzC(cls2, (String) obj);
                                zze[i96] = zzC2;
                            }
                            int i97 = i16;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC2);
                            int i98 = i96 + 1;
                            obj2 = zze[i98];
                            i28 = i97;
                            if (obj2 instanceof Field) {
                                zzC3 = (Field) obj2;
                            } else {
                                zzC3 = zzC(cls2, (String) obj2);
                                zze[i98] = zzC3;
                            }
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzC3);
                            str = zzd;
                            i26 = i92;
                            i31 = 0;
                            i30 = objectFieldOffset2;
                        }
                    }
                    i37 = i87;
                    int i962 = charAt26 + charAt26;
                    obj = zze[i962];
                    i87 = i37;
                    if (obj instanceof Field) {
                    }
                    int i972 = i16;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzC2);
                    int i982 = i962 + 1;
                    obj2 = zze[i982];
                    i28 = i972;
                    if (obj2 instanceof Field) {
                    }
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzC3);
                    str = zzd;
                    i26 = i92;
                    i31 = 0;
                    i30 = objectFieldOffset22;
                }
                i15 = i36;
                i37 = i87;
                int i9622 = charAt26 + charAt26;
                obj = zze[i9622];
                i87 = i37;
                if (obj instanceof Field) {
                }
                int i9722 = i16;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzC2);
                int i9822 = i9622 + 1;
                obj2 = zze[i9822];
                i28 = i9722;
                if (obj2 instanceof Field) {
                }
                int objectFieldOffset222 = (int) unsafe.objectFieldOffset(zzC3);
                str = zzd;
                i26 = i92;
                i31 = 0;
                i30 = objectFieldOffset222;
            } else {
                i27 = length;
                i28 = i16;
                int i99 = i15 + 1;
                Field zzC4 = zzC(cls2, (String) zze[i15]);
                if (i86 == 9 || i86 == 17) {
                    i29 = i99;
                    int i100 = i77 / 3;
                    objArr[i100 + i100 + 1] = zzC4.getType();
                } else {
                    if (i86 == 27) {
                        i33 = i99;
                        i34 = 1;
                        i15 += 2;
                    } else if (i86 == 49) {
                        i15 += 2;
                        i33 = i99;
                        i34 = 1;
                    } else if (i86 == 12 || i86 == 30 || i86 == 44) {
                        if (zzueVar2.zzc() == 1 || i87 != 0) {
                            i15 += 2;
                            int i101 = i77 / 3;
                            objArr[i101 + i101 + 1] = zze[i99];
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                            i30 = 1048575;
                            if ((charAt25 & 4096) != 0 || i86 > 17) {
                                i31 = 0;
                            } else {
                                int i102 = i26 + 1;
                                int charAt27 = str.charAt(i26);
                                if (charAt27 >= 55296) {
                                    int i103 = charAt27 & 8191;
                                    int i104 = 13;
                                    while (true) {
                                        i32 = i102 + 1;
                                        charAt10 = str.charAt(i102);
                                        if (charAt10 < 55296) {
                                            break;
                                        }
                                        i103 |= (charAt10 & 8191) << i104;
                                        i104 += 13;
                                        i102 = i32;
                                    }
                                    charAt27 = i103 | (charAt10 << i104);
                                } else {
                                    i32 = i102;
                                }
                                int i105 = (charAt27 / 32) + i28 + i28;
                                Object obj3 = zze[i105];
                                if (obj3 instanceof Field) {
                                    zzC = (Field) obj3;
                                } else {
                                    zzC = zzC(cls2, (String) obj3);
                                    zze[i105] = zzC;
                                }
                                int i106 = charAt27;
                                i30 = (int) unsafe.objectFieldOffset(zzC);
                                int i107 = i106 % 32;
                                i26 = i32;
                                i31 = i107;
                            }
                            if (i86 >= 18 && i86 <= 49) {
                                iArr[i75] = objectFieldOffset;
                                i75++;
                            }
                        } else {
                            str = zzd;
                            i15 = i99;
                            i87 = 0;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                            i30 = 1048575;
                            if ((charAt25 & 4096) != 0) {
                            }
                            i31 = 0;
                            if (i86 >= 18) {
                                iArr[i75] = objectFieldOffset;
                                i75++;
                            }
                        }
                    } else if (i86 == 50) {
                        int i108 = i15 + 2;
                        int i109 = i74 + 1;
                        iArr[i74] = i77;
                        int i110 = i77 / 3;
                        int i111 = i110 + i110;
                        objArr[i111] = zze[i99];
                        if (i87 != 0) {
                            objArr[i111 + 1] = zze[i108];
                            i15 += 3;
                            str = zzd;
                            i74 = i109;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                            i30 = 1048575;
                            if ((charAt25 & 4096) != 0) {
                            }
                            i31 = 0;
                            if (i86 >= 18) {
                            }
                        } else {
                            i15 = i108;
                            i74 = i109;
                            i87 = 0;
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                            i30 = 1048575;
                            if ((charAt25 & 4096) != 0) {
                            }
                            i31 = 0;
                            if (i86 >= 18) {
                            }
                        }
                    } else {
                        i29 = i99;
                    }
                    int i112 = i77 / 3;
                    objArr[i112 + i112 + i34] = zze[i33];
                    str = zzd;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                    i30 = 1048575;
                    if ((charAt25 & 4096) != 0) {
                    }
                    i31 = 0;
                    if (i86 >= 18) {
                    }
                }
                str = zzd;
                i15 = i29;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                i30 = 1048575;
                if ((charAt25 & 4096) != 0) {
                }
                i31 = 0;
                if (i86 >= 18) {
                }
            }
            int i113 = i87;
            int i114 = i77 + 1;
            iArr3[i77] = charAt24;
            int i115 = i77 + 2;
            iArr3[i114] = ((charAt25 & 512) != 0 ? TLObject.FLAG_29 : 0) | ((charAt25 & 256) != 0 ? TLObject.FLAG_28 : 0) | (i113 != 0 ? TLObject.FLAG_31 : 0) | (i86 << 20) | objectFieldOffset;
            i77 += 3;
            iArr3[i115] = (i31 << 20) | i30;
            i43 = i26;
            zzd = str;
            zzueVar = zzueVar2;
            length = i27;
            i16 = i28;
            c3 = CharacterCompat.MIN_HIGH_SURROGATE;
        }
        return new zztv(iArr3, objArr, i11, i13, zzueVar.zza(), false, iArr, i14, i72, zztyVar, zztfVar, zzuvVar, zzrzVar, zztnVar);
    }

    private static double zzn(Object obj, long j10) {
        return ((Double) zzvc.zzf(obj, j10)).doubleValue();
    }

    private static float zzo(Object obj, long j10) {
        return ((Float) zzvc.zzf(obj, j10)).floatValue();
    }

    private static int zzp(Object obj, long j10) {
        return ((Integer) zzvc.zzf(obj, j10)).intValue();
    }

    private final int zzq(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzs(i10, 0);
    }

    private final int zzr(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzs(int i10, int i11) {
        int[] iArr = this.zzc;
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

    private static int zzt(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzu(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzv(Object obj, long j10) {
        return ((Long) zzvc.zzf(obj, j10)).longValue();
    }

    private final zzsr zzw(int i10) {
        int i11 = i10 / 3;
        return (zzsr) this.zzd[i11 + i11 + 1];
    }

    private final zzug zzx(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzug zzugVar = (zzug) objArr[i12];
        if (zzugVar != null) {
            return zzugVar;
        }
        zzug zzb2 = zzuc.zza().zzb((Class) objArr[i12 + 1]);
        objArr[i12] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i10, Object obj2, zzuv zzuvVar, Object obj3) {
        int i11 = this.zzc[i10];
        Object zzf = zzvc.zzf(obj, zzu(i10) & 1048575);
        if (zzf == null || zzw(i10) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final int zza(Object obj) {
        int i10;
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
        int i11;
        int zzA10;
        int zzB2;
        zztv<T> zztvVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int[] iArr = zztvVar.zzc;
            if (i13 >= iArr.length) {
                int zza2 = ((zzsn) obj).zzc.zza() + i16;
                if (!zztvVar.zzh) {
                    return zza2;
                }
                zzuo zzuoVar = ((zzsk) obj).zzb.zza;
                int zzc = zzuoVar.zzc();
                int i17 = 0;
                for (int i18 = 0; i18 < zzc; i18++) {
                    Map.Entry zzg = zzuoVar.zzg(i18);
                    i17 += zzsd.zza((zzsc) ((zzuk) zzg).zza(), zzg.getValue());
                }
                for (Map.Entry entry : zzuoVar.zzd()) {
                    i17 += zzsd.zza((zzsc) entry.getKey(), entry.getValue());
                }
                return zza2 + i17;
            }
            int zzu = zztvVar.zzu(i13);
            int zzt = zzt(zzu);
            int i19 = iArr[i13];
            int i20 = iArr[i13 + 2];
            int i21 = i20 & i12;
            if (zzt <= 17) {
                if (i21 != i14) {
                    i15 = i21 == i12 ? 0 : unsafe.getInt(obj2, i21);
                    i14 = i21;
                }
                i10 = 1 << (i20 >>> 20);
            } else {
                i10 = 0;
            }
            int i22 = zzu & i12;
            if (zzt >= zzse.zzJ.zza()) {
                zzse.zzW.zza();
            }
            long j10 = i22;
            switch (zzt) {
                case 0:
                    if (zztvVar.zzO(obj2, i13, i14, i15, i10)) {
                        i16 = a.e(i19 << 3, 8, i16);
                    }
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 1:
                    if (zztvVar.zzO(obj2, i13, i14, i15, i10)) {
                        i16 = a.e(i19 << 3, 4, i16);
                    }
                    zztvVar = this;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 2:
                    if (zztvVar.zzO(obj2, i13, i14, i15, i10)) {
                        long j11 = unsafe.getLong(obj2, j10);
                        zzA = zzqv.zzA(i19 << 3);
                        zzB = zzqv.zzB(j11);
                        i16 += zzB + zzA;
                    }
                    zztvVar = this;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 3:
                    if (zztvVar.zzO(obj2, i13, i14, i15, i10)) {
                        long j12 = unsafe.getLong(obj2, j10);
                        zzA = zzqv.zzA(i19 << 3);
                        zzB = zzqv.zzB(j12);
                        i16 += zzB + zzA;
                    }
                    zztvVar = this;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 4:
                    if (zztvVar.zzO(obj2, i13, i14, i15, i10)) {
                        long j13 = unsafe.getInt(obj2, j10);
                        zzA = zzqv.zzA(i19 << 3);
                        zzB = zzqv.zzB(j13);
                        i16 += zzB + zzA;
                    }
                    zztvVar = this;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 5:
                    if (zztvVar.zzO(obj2, i13, i14, i15, i10)) {
                        i16 = a.e(i19 << 3, 8, i16);
                    }
                    zztvVar = this;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 6:
                    if (zztvVar.zzO(obj2, i13, i14, i15, i10)) {
                        i16 = a.e(i19 << 3, 4, i16);
                    }
                    zztvVar = this;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 7:
                    if (zztvVar.zzO(obj2, i13, i14, i15, i10)) {
                        i16 = a.e(i19 << 3, 1, i16);
                    }
                    zztvVar = this;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 8:
                    if (zztvVar.zzO(obj2, i13, i14, i15, i10)) {
                        int i23 = i19 << 3;
                        Object object = unsafe.getObject(obj2, j10);
                        if (object instanceof zzqm) {
                            zzA2 = zzqv.zzA(i23);
                            zzd = ((zzqm) object).zzd();
                            zzA3 = zzqv.zzA(zzd);
                            i16 += zzA3 + zzd + zzA2;
                        } else {
                            zzA = zzqv.zzA(i23);
                            zzB = zzqv.zzz((String) object);
                            i16 += zzB + zzA;
                        }
                    }
                    zztvVar = this;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 9:
                    if (zztvVar.zzO(obj2, i13, i14, i15, i10)) {
                        zzh = zzui.zzh(i19, unsafe.getObject(obj2, j10), zztvVar.zzx(i13));
                        i16 += zzh;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    } else {
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                case 10:
                    if (zztvVar.zzO(obj2, i13, i14, i15, i10)) {
                        zzqm zzqmVar = (zzqm) unsafe.getObject(obj2, j10);
                        zzA2 = zzqv.zzA(i19 << 3);
                        zzd = zzqmVar.zzd();
                        zzA3 = zzqv.zzA(zzd);
                        i16 += zzA3 + zzd + zzA2;
                    }
                    zztvVar = this;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 11:
                    if (zztvVar.zzO(obj2, i13, i14, i15, i10)) {
                        i16 = a.e(unsafe.getInt(obj2, j10), zzqv.zzA(i19 << 3), i16);
                    }
                    zztvVar = this;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 12:
                    if (zztvVar.zzO(obj2, i13, i14, i15, i10)) {
                        long j14 = unsafe.getInt(obj2, j10);
                        zzA = zzqv.zzA(i19 << 3);
                        zzB = zzqv.zzB(j14);
                        i16 += zzB + zzA;
                    }
                    zztvVar = this;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 13:
                    if (zztvVar.zzO(obj2, i13, i14, i15, i10)) {
                        i16 = a.e(i19 << 3, 4, i16);
                    }
                    zztvVar = this;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 14:
                    if (zztvVar.zzO(obj2, i13, i14, i15, i10)) {
                        i16 = a.e(i19 << 3, 8, i16);
                    }
                    zztvVar = this;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 15:
                    if (zztvVar.zzO(obj2, i13, i14, i15, i10)) {
                        int i24 = unsafe.getInt(obj2, j10);
                        i16 = a.e((i24 >> 31) ^ (i24 + i24), zzqv.zzA(i19 << 3), i16);
                    }
                    zztvVar = this;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 16:
                    if (zztvVar.zzO(obj2, i13, i14, i15, i10)) {
                        long j15 = unsafe.getLong(obj2, j10);
                        zzA = zzqv.zzA(i19 << 3);
                        zzB = zzqv.zzB((j15 >> 63) ^ (j15 + j15));
                        i16 += zzB + zzA;
                    }
                    zztvVar = this;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 17:
                    if (zztvVar.zzO(obj2, i13, i14, i15, i10)) {
                        zzw = zzqv.zzw(i19, (zzts) unsafe.getObject(obj2, j10), zztvVar.zzx(i13));
                        i16 += zzw;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    } else {
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                case 18:
                    zzh = zzui.zzd(i19, (List) unsafe.getObject(obj2, j10), false);
                    i16 += zzh;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 19:
                    zzh = zzui.zzb(i19, (List) unsafe.getObject(obj2, j10), false);
                    i16 += zzh;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j10);
                    int i25 = zzui.zza;
                    if (list.size() != 0) {
                        zzA4 = (zzqv.zzA(i19 << 3) * list.size()) + zzui.zzg(list);
                        i16 += zzA4;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    zzA4 = 0;
                    i16 += zzA4;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j10);
                    int i26 = zzui.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zzui.zzl(list2);
                        zzA5 = zzqv.zzA(i19 << 3);
                        zzA6 = (zzA5 * size) + zzl;
                        i16 += zzA6;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    zzA6 = 0;
                    i16 += zzA6;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j10);
                    int i27 = zzui.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zzui.zzf(list3);
                        zzA5 = zzqv.zzA(i19 << 3);
                        zzA6 = (zzA5 * size) + zzl;
                        i16 += zzA6;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    zzA6 = 0;
                    i16 += zzA6;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 23:
                    zzh = zzui.zzd(i19, (List) unsafe.getObject(obj2, j10), false);
                    i16 += zzh;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 24:
                    zzh = zzui.zzb(i19, (List) unsafe.getObject(obj2, j10), false);
                    i16 += zzh;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j10);
                    int i28 = zzui.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzA4 = (zzqv.zzA(i19 << 3) + 1) * size2;
                        i16 += zzA4;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    zzA4 = 0;
                    i16 += zzA4;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j10);
                    int i29 = zzui.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzA6 = zzqv.zzA(i19 << 3) * size3;
                        if (list5 instanceof zzte) {
                            zzte zzteVar = (zzte) list5;
                            for (int i30 = 0; i30 < size3; i30++) {
                                Object zzc2 = zzteVar.zzc();
                                if (zzc2 instanceof zzqm) {
                                    int zzd2 = ((zzqm) zzc2).zzd();
                                    zzA6 = a.e(zzd2, zzd2, zzA6);
                                } else {
                                    zzA6 = zzqv.zzz((String) zzc2) + zzA6;
                                }
                            }
                        } else {
                            for (int i31 = 0; i31 < size3; i31++) {
                                Object obj3 = list5.get(i31);
                                if (obj3 instanceof zzqm) {
                                    int zzd3 = ((zzqm) obj3).zzd();
                                    zzA6 = a.e(zzd3, zzd3, zzA6);
                                } else {
                                    zzA6 = zzqv.zzz((String) obj3) + zzA6;
                                }
                            }
                        }
                        i16 += zzA6;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    zzA6 = 0;
                    i16 += zzA6;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j10);
                    zzug zzx = zztvVar.zzx(i13);
                    int i32 = zzui.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzA7 = 0;
                    } else {
                        zzA7 = zzqv.zzA(i19 << 3) * size4;
                        for (int i33 = 0; i33 < size4; i33++) {
                            Object obj4 = list6.get(i33);
                            if (obj4 instanceof zztd) {
                                int zza3 = ((zztd) obj4).zza();
                                zzA7 = a.e(zza3, zza3, zzA7);
                            } else {
                                zzA7 = zzqv.zzy((zzts) obj4, zzx) + zzA7;
                            }
                        }
                    }
                    i16 += zzA7;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j10);
                    int i34 = zzui.zza;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        zzA6 = zzqv.zzA(i19 << 3) * size5;
                        for (int i35 = 0; i35 < list7.size(); i35++) {
                            int zzd4 = ((zzqm) list7.get(i35)).zzd();
                            zzA6 = a.e(zzd4, zzd4, zzA6);
                        }
                        i16 += zzA6;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    zzA6 = 0;
                    i16 += zzA6;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j10);
                    int i36 = zzui.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzl = zzui.zzk(list8);
                        zzA5 = zzqv.zzA(i19 << 3);
                        zzA6 = (zzA5 * size) + zzl;
                        i16 += zzA6;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    zzA6 = 0;
                    i16 += zzA6;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    List list9 = (List) unsafe.getObject(obj2, j10);
                    int i37 = zzui.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzl = zzui.zza(list9);
                        zzA5 = zzqv.zzA(i19 << 3);
                        zzA6 = (zzA5 * size) + zzl;
                        i16 += zzA6;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    zzA6 = 0;
                    i16 += zzA6;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    zzh = zzui.zzb(i19, (List) unsafe.getObject(obj2, j10), false);
                    i16 += zzh;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 32:
                    zzh = zzui.zzd(i19, (List) unsafe.getObject(obj2, j10), false);
                    i16 += zzh;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j10);
                    int i38 = zzui.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzl = zzui.zzi(list10);
                        zzA5 = zzqv.zzA(i19 << 3);
                        zzA6 = (zzA5 * size) + zzl;
                        i16 += zzA6;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    zzA6 = 0;
                    i16 += zzA6;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j10);
                    int i39 = zzui.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzl = zzui.zzj(list11);
                        zzA5 = zzqv.zzA(i19 << 3);
                        zzA6 = (zzA5 * size) + zzl;
                        i16 += zzA6;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    zzA6 = 0;
                    i16 += zzA6;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 35:
                    zze = zzui.zze((List) unsafe.getObject(obj2, j10));
                    if (zze > 0) {
                        zzA8 = zzqv.zzA(i19 << 3);
                        zzA9 = zzqv.zzA(zze);
                        i16 += zzA9 + zzA8 + zze;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    } else {
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                case 36:
                    zze = zzui.zzc((List) unsafe.getObject(obj2, j10));
                    if (zze > 0) {
                        zzA8 = zzqv.zzA(i19 << 3);
                        zzA9 = zzqv.zzA(zze);
                        i16 += zzA9 + zzA8 + zze;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    } else {
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                case 37:
                    zze = zzui.zzg((List) unsafe.getObject(obj2, j10));
                    if (zze > 0) {
                        zzA8 = zzqv.zzA(i19 << 3);
                        zzA9 = zzqv.zzA(zze);
                        i16 += zzA9 + zzA8 + zze;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    } else {
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                case 38:
                    zze = zzui.zzl((List) unsafe.getObject(obj2, j10));
                    if (zze > 0) {
                        zzA8 = zzqv.zzA(i19 << 3);
                        zzA9 = zzqv.zzA(zze);
                        i16 += zzA9 + zzA8 + zze;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    } else {
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    zze = zzui.zzf((List) unsafe.getObject(obj2, j10));
                    if (zze > 0) {
                        zzA8 = zzqv.zzA(i19 << 3);
                        zzA9 = zzqv.zzA(zze);
                        i16 += zzA9 + zzA8 + zze;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    } else {
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    zze = zzui.zze((List) unsafe.getObject(obj2, j10));
                    if (zze > 0) {
                        zzA8 = zzqv.zzA(i19 << 3);
                        zzA9 = zzqv.zzA(zze);
                        i16 += zzA9 + zzA8 + zze;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    } else {
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    zze = zzui.zzc((List) unsafe.getObject(obj2, j10));
                    if (zze > 0) {
                        zzA8 = zzqv.zzA(i19 << 3);
                        zzA9 = zzqv.zzA(zze);
                        i16 += zzA9 + zzA8 + zze;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    } else {
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    List list12 = (List) unsafe.getObject(obj2, j10);
                    int i40 = zzui.zza;
                    zze = list12.size();
                    if (zze > 0) {
                        zzA8 = zzqv.zzA(i19 << 3);
                        zzA9 = zzqv.zzA(zze);
                        i16 += zzA9 + zzA8 + zze;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    } else {
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    zze = zzui.zzk((List) unsafe.getObject(obj2, j10));
                    if (zze > 0) {
                        zzA8 = zzqv.zzA(i19 << 3);
                        zzA9 = zzqv.zzA(zze);
                        i16 += zzA9 + zzA8 + zze;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    } else {
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    zze = zzui.zza((List) unsafe.getObject(obj2, j10));
                    if (zze > 0) {
                        zzA8 = zzqv.zzA(i19 << 3);
                        zzA9 = zzqv.zzA(zze);
                        i16 += zzA9 + zzA8 + zze;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    } else {
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    zze = zzui.zzc((List) unsafe.getObject(obj2, j10));
                    if (zze > 0) {
                        zzA8 = zzqv.zzA(i19 << 3);
                        zzA9 = zzqv.zzA(zze);
                        i16 += zzA9 + zzA8 + zze;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    } else {
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    zze = zzui.zze((List) unsafe.getObject(obj2, j10));
                    if (zze > 0) {
                        zzA8 = zzqv.zzA(i19 << 3);
                        zzA9 = zzqv.zzA(zze);
                        i16 += zzA9 + zzA8 + zze;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    } else {
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    zze = zzui.zzi((List) unsafe.getObject(obj2, j10));
                    if (zze > 0) {
                        zzA8 = zzqv.zzA(i19 << 3);
                        zzA9 = zzqv.zzA(zze);
                        i16 += zzA9 + zzA8 + zze;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    } else {
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                case 48:
                    zze = zzui.zzj((List) unsafe.getObject(obj2, j10));
                    if (zze > 0) {
                        zzA8 = zzqv.zzA(i19 << 3);
                        zzA9 = zzqv.zzA(zze);
                        i16 += zzA9 + zzA8 + zze;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    } else {
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    List list13 = (List) unsafe.getObject(obj2, j10);
                    zzug zzx2 = zztvVar.zzx(i13);
                    int i41 = zzui.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 0;
                        for (int i42 = 0; i42 < size6; i42++) {
                            i11 += zzqv.zzw(i19, (zzts) list13.get(i42), zzx2);
                        }
                    }
                    i16 += i11;
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    zztm zztmVar = (zztm) unsafe.getObject(obj2, j10);
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
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 51:
                    if (zztvVar.zzR(obj2, i19, i13)) {
                        i16 = a.e(i19 << 3, 8, i16);
                    }
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 52:
                    if (zztvVar.zzR(obj2, i19, i13)) {
                        i16 = a.e(i19 << 3, 4, i16);
                    }
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 53:
                    if (zztvVar.zzR(obj2, i19, i13)) {
                        long zzv = zzv(obj2, j10);
                        zzA10 = zzqv.zzA(i19 << 3);
                        zzB2 = zzqv.zzB(zzv);
                        i16 += zzB2 + zzA10;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    } else {
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                case 54:
                    if (zztvVar.zzR(obj2, i19, i13)) {
                        long zzv2 = zzv(obj2, j10);
                        zzA10 = zzqv.zzA(i19 << 3);
                        zzB2 = zzqv.zzB(zzv2);
                        i16 += zzB2 + zzA10;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    } else {
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                case 55:
                    if (zztvVar.zzR(obj2, i19, i13)) {
                        long zzp = zzp(obj2, j10);
                        zzA10 = zzqv.zzA(i19 << 3);
                        zzB2 = zzqv.zzB(zzp);
                        i16 += zzB2 + zzA10;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    } else {
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                case 56:
                    if (zztvVar.zzR(obj2, i19, i13)) {
                        i16 = a.e(i19 << 3, 8, i16);
                    }
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 57:
                    if (zztvVar.zzR(obj2, i19, i13)) {
                        i16 = a.e(i19 << 3, 4, i16);
                    }
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 58:
                    if (zztvVar.zzR(obj2, i19, i13)) {
                        i16 = a.e(i19 << 3, 1, i16);
                    }
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 59:
                    if (zztvVar.zzR(obj2, i19, i13)) {
                        int i43 = i19 << 3;
                        Object object2 = unsafe.getObject(obj2, j10);
                        if (object2 instanceof zzqm) {
                            zze = zzqv.zzA(i43);
                            zzA8 = ((zzqm) object2).zzd();
                            zzA9 = zzqv.zzA(zzA8);
                            i16 += zzA9 + zzA8 + zze;
                            i13 += 3;
                            obj2 = obj;
                            i12 = 1048575;
                        } else {
                            zzA10 = zzqv.zzA(i43);
                            zzB2 = zzqv.zzz((String) object2);
                            i16 += zzB2 + zzA10;
                            i13 += 3;
                            obj2 = obj;
                            i12 = 1048575;
                        }
                    } else {
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                case 60:
                    if (zztvVar.zzR(obj2, i19, i13)) {
                        zzh = zzui.zzh(i19, unsafe.getObject(obj2, j10), zztvVar.zzx(i13));
                        i16 += zzh;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    } else {
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                case 61:
                    if (zztvVar.zzR(obj2, i19, i13)) {
                        zzqm zzqmVar2 = (zzqm) unsafe.getObject(obj2, j10);
                        zze = zzqv.zzA(i19 << 3);
                        zzA8 = zzqmVar2.zzd();
                        zzA9 = zzqv.zzA(zzA8);
                        i16 += zzA9 + zzA8 + zze;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    } else {
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                case 62:
                    if (zztvVar.zzR(obj2, i19, i13)) {
                        i16 = a.e(zzp(obj2, j10), zzqv.zzA(i19 << 3), i16);
                    }
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 63:
                    if (zztvVar.zzR(obj2, i19, i13)) {
                        long zzp2 = zzp(obj2, j10);
                        zzA10 = zzqv.zzA(i19 << 3);
                        zzB2 = zzqv.zzB(zzp2);
                        i16 += zzB2 + zzA10;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    } else {
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                case 64:
                    if (zztvVar.zzR(obj2, i19, i13)) {
                        i16 = a.e(i19 << 3, 4, i16);
                    }
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (zztvVar.zzR(obj2, i19, i13)) {
                        i16 = a.e(i19 << 3, 8, i16);
                    }
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 66:
                    if (zztvVar.zzR(obj2, i19, i13)) {
                        int zzp3 = zzp(obj2, j10);
                        i16 = a.e((zzp3 >> 31) ^ (zzp3 + zzp3), zzqv.zzA(i19 << 3), i16);
                    }
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 67:
                    if (zztvVar.zzR(obj2, i19, i13)) {
                        long zzv3 = zzv(obj2, j10);
                        zzA10 = zzqv.zzA(i19 << 3);
                        zzB2 = zzqv.zzB((zzv3 >> 63) ^ (zzv3 + zzv3));
                        i16 += zzB2 + zzA10;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    } else {
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                case 68:
                    if (zztvVar.zzR(obj2, i19, i13)) {
                        zzw = zzqv.zzw(i19, (zzts) unsafe.getObject(obj2, j10), zztvVar.zzx(i13));
                        i16 += zzw;
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    } else {
                        i13 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                default:
                    i13 += 3;
                    obj2 = obj;
                    i12 = 1048575;
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final int zzb(Object obj) {
        int i10;
        long doubleToLongBits;
        int i11;
        int floatToIntBits;
        int i12;
        int zzc;
        int i13;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i14 >= iArr.length) {
                int hashCode = ((zzsn) obj).zzc.hashCode() + (i15 * 53);
                return this.zzh ? (hashCode * 53) + ((zzsk) obj).zzb.zza.hashCode() : hashCode;
            }
            int zzu = zzu(i14);
            int i16 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i17 = iArr[i14];
            long j10 = i16;
            int i18 = 37;
            switch (zzt) {
                case 0:
                    i10 = i15 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzvc.zza(obj, j10));
                    byte[] bArr = zzsv.zzb;
                    i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i11 = i15 * 53;
                    floatToIntBits = Float.floatToIntBits(zzvc.zzb(obj, j10));
                    i15 = floatToIntBits + i11;
                    break;
                case 2:
                    i10 = i15 * 53;
                    doubleToLongBits = zzvc.zzd(obj, j10);
                    byte[] bArr2 = zzsv.zzb;
                    i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i10 = i15 * 53;
                    doubleToLongBits = zzvc.zzd(obj, j10);
                    byte[] bArr3 = zzsv.zzb;
                    i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i12 = i15 * 53;
                    zzc = zzvc.zzc(obj, j10);
                    i15 = i12 + zzc;
                    break;
                case 5:
                    i10 = i15 * 53;
                    doubleToLongBits = zzvc.zzd(obj, j10);
                    byte[] bArr4 = zzsv.zzb;
                    i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i12 = i15 * 53;
                    zzc = zzvc.zzc(obj, j10);
                    i15 = i12 + zzc;
                    break;
                case 7:
                    i11 = i15 * 53;
                    floatToIntBits = zzsv.zza(zzvc.zzw(obj, j10));
                    i15 = floatToIntBits + i11;
                    break;
                case 8:
                    i11 = i15 * 53;
                    floatToIntBits = ((String) zzvc.zzf(obj, j10)).hashCode();
                    i15 = floatToIntBits + i11;
                    break;
                case 9:
                    i13 = i15 * 53;
                    Object zzf = zzvc.zzf(obj, j10);
                    if (zzf != null) {
                        i18 = zzf.hashCode();
                    }
                    i15 = i13 + i18;
                    break;
                case 10:
                    i11 = i15 * 53;
                    floatToIntBits = zzvc.zzf(obj, j10).hashCode();
                    i15 = floatToIntBits + i11;
                    break;
                case 11:
                    i12 = i15 * 53;
                    zzc = zzvc.zzc(obj, j10);
                    i15 = i12 + zzc;
                    break;
                case 12:
                    i12 = i15 * 53;
                    zzc = zzvc.zzc(obj, j10);
                    i15 = i12 + zzc;
                    break;
                case 13:
                    i12 = i15 * 53;
                    zzc = zzvc.zzc(obj, j10);
                    i15 = i12 + zzc;
                    break;
                case 14:
                    i10 = i15 * 53;
                    doubleToLongBits = zzvc.zzd(obj, j10);
                    byte[] bArr5 = zzsv.zzb;
                    i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i12 = i15 * 53;
                    zzc = zzvc.zzc(obj, j10);
                    i15 = i12 + zzc;
                    break;
                case 16:
                    i10 = i15 * 53;
                    doubleToLongBits = zzvc.zzd(obj, j10);
                    byte[] bArr6 = zzsv.zzb;
                    i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i13 = i15 * 53;
                    Object zzf2 = zzvc.zzf(obj, j10);
                    if (zzf2 != null) {
                        i18 = zzf2.hashCode();
                    }
                    i15 = i13 + i18;
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
                    i11 = i15 * 53;
                    floatToIntBits = zzvc.zzf(obj, j10).hashCode();
                    i15 = floatToIntBits + i11;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    i11 = i15 * 53;
                    floatToIntBits = zzvc.zzf(obj, j10).hashCode();
                    i15 = floatToIntBits + i11;
                    break;
                case 51:
                    if (!zzR(obj, i17, i14)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j10));
                        byte[] bArr7 = zzsv.zzb;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!zzR(obj, i17, i14)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j10));
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 53:
                    if (!zzR(obj, i17, i14)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = zzv(obj, j10);
                        byte[] bArr8 = zzsv.zzb;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!zzR(obj, i17, i14)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = zzv(obj, j10);
                        byte[] bArr9 = zzsv.zzb;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 55:
                    if (!zzR(obj, i17, i14)) {
                        break;
                    } else {
                        i12 = i15 * 53;
                        zzc = zzp(obj, j10);
                        i15 = i12 + zzc;
                        break;
                    }
                case 56:
                    if (!zzR(obj, i17, i14)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = zzv(obj, j10);
                        byte[] bArr10 = zzsv.zzb;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 57:
                    if (!zzR(obj, i17, i14)) {
                        break;
                    } else {
                        i12 = i15 * 53;
                        zzc = zzp(obj, j10);
                        i15 = i12 + zzc;
                        break;
                    }
                case 58:
                    if (!zzR(obj, i17, i14)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = zzsv.zza(zzS(obj, j10));
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 59:
                    if (!zzR(obj, i17, i14)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = ((String) zzvc.zzf(obj, j10)).hashCode();
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 60:
                    if (!zzR(obj, i17, i14)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = zzvc.zzf(obj, j10).hashCode();
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 61:
                    if (!zzR(obj, i17, i14)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = zzvc.zzf(obj, j10).hashCode();
                        i15 = floatToIntBits + i11;
                        break;
                    }
                case 62:
                    if (!zzR(obj, i17, i14)) {
                        break;
                    } else {
                        i12 = i15 * 53;
                        zzc = zzp(obj, j10);
                        i15 = i12 + zzc;
                        break;
                    }
                case 63:
                    if (!zzR(obj, i17, i14)) {
                        break;
                    } else {
                        i12 = i15 * 53;
                        zzc = zzp(obj, j10);
                        i15 = i12 + zzc;
                        break;
                    }
                case 64:
                    if (!zzR(obj, i17, i14)) {
                        break;
                    } else {
                        i12 = i15 * 53;
                        zzc = zzp(obj, j10);
                        i15 = i12 + zzc;
                        break;
                    }
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                    if (!zzR(obj, i17, i14)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = zzv(obj, j10);
                        byte[] bArr11 = zzsv.zzb;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!zzR(obj, i17, i14)) {
                        break;
                    } else {
                        i12 = i15 * 53;
                        zzc = zzp(obj, j10);
                        i15 = i12 + zzc;
                        break;
                    }
                case 67:
                    if (!zzR(obj, i17, i14)) {
                        break;
                    } else {
                        i10 = i15 * 53;
                        doubleToLongBits = zzv(obj, j10);
                        byte[] bArr12 = zzsv.zzb;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
                    if (!zzR(obj, i17, i14)) {
                        break;
                    } else {
                        i11 = i15 * 53;
                        floatToIntBits = zzvc.zzf(obj, j10).hashCode();
                        i15 = floatToIntBits + i11;
                        break;
                    }
            }
            i14 += 3;
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
            Method dump skipped, instructions count: 3828
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
            for (int i10 = 0; i10 < iArr.length; i10 += 3) {
                int zzu = zzu(i10);
                int i11 = 1048575 & zzu;
                int zzt = zzt(zzu);
                long j10 = i11;
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
                                ((zzsu) zzvc.zzf(obj, j10)).zzb();
                                break;
                            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zztm) object).zzc();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzR(obj, iArr[i10], i10)) {
                        zzx(i10).zzf(zzb.getObject(obj, j10));
                    }
                }
                if (zzN(obj, i10)) {
                    zzx(i10).zzf(zzb.getObject(obj, j10));
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
        int i10 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i10 >= iArr.length) {
                zzui.zzq(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzui.zzp(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
            int zzu = zzu(i10);
            int i11 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (zzt) {
                case 0:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzvc.zzo(obj, j10, zzvc.zza(obj2, j10));
                        zzH(obj, i10);
                        break;
                    }
                case 1:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzvc.zzp(obj, j10, zzvc.zzb(obj2, j10));
                        zzH(obj, i10);
                        break;
                    }
                case 2:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzvc.zzr(obj, j10, zzvc.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    }
                case 3:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzvc.zzr(obj, j10, zzvc.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    }
                case 4:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzvc.zzq(obj, j10, zzvc.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    }
                case 5:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzvc.zzr(obj, j10, zzvc.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    }
                case 6:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzvc.zzq(obj, j10, zzvc.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    }
                case 7:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzvc.zzm(obj, j10, zzvc.zzw(obj2, j10));
                        zzH(obj, i10);
                        break;
                    }
                case 8:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzvc.zzs(obj, j10, zzvc.zzf(obj2, j10));
                        zzH(obj, i10);
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i10);
                    break;
                case 10:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzvc.zzs(obj, j10, zzvc.zzf(obj2, j10));
                        zzH(obj, i10);
                        break;
                    }
                case 11:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzvc.zzq(obj, j10, zzvc.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    }
                case 12:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzvc.zzq(obj, j10, zzvc.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    }
                case 13:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzvc.zzq(obj, j10, zzvc.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    }
                case 14:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzvc.zzr(obj, j10, zzvc.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    }
                case 15:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzvc.zzq(obj, j10, zzvc.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    }
                case 16:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzvc.zzr(obj, j10, zzvc.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i10);
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
                    zzsu zzsuVar = (zzsu) zzvc.zzf(obj, j10);
                    zzsu zzsuVar2 = (zzsu) zzvc.zzf(obj2, j10);
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
                    zzvc.zzs(obj, j10, zzsuVar2);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    int i13 = zzui.zza;
                    zzvc.zzs(obj, j10, zztn.zzb(zzvc.zzf(obj, j10), zzvc.zzf(obj2, j10)));
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
                    if (!zzR(obj2, i12, i10)) {
                        break;
                    } else {
                        zzvc.zzs(obj, j10, zzvc.zzf(obj2, j10));
                        zzI(obj, i12, i10);
                        break;
                    }
                case 60:
                    zzF(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case VoIPService.CALL_MIN_LAYER /* 65 */:
                case 66:
                case 67:
                    if (!zzR(obj2, i12, i10)) {
                        break;
                    } else {
                        zzvc.zzs(obj, j10, zzvc.zzf(obj2, j10));
                        zzI(obj, i12, i10);
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i10);
                    break;
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:289:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0722 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0747 A[LOOP:3: B:52:0x0743->B:54:0x0747, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0714 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(Object obj, zzuf zzufVar, zzry zzryVar) {
        Object obj2;
        Object obj3;
        zztv<T> zztvVar;
        Throwable th2;
        int i10;
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
                            case MessageObject.TYPE_GIFT_STARS /* 30 */:
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
                                    i10 = zztvVar.zzk;
                                    while (i10 < zztvVar.zzl) {
                                    }
                                    if (obj6 == null) {
                                    }
                                }
                                obj = obj2;
                                break;
                            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
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
                            case Maneuver.TYPE_DESTINATION /* 39 */:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzufVar.zzD(zztf.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzufVar.zzA(zztf.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzufVar.zzz(zztf.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                zzufVar.zzv(zztf.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                try {
                                    zzufVar.zzL(zztf.zza(obj2, zzu & 1048575));
                                    obj6 = obj3;
                                } catch (zzsw unused3) {
                                    obj6 = obj3;
                                    if (obj6 == null) {
                                        try {
                                            obj6 = zzuvVar2.zza(obj2);
                                        } catch (Throwable th4) {
                                            th2 = th4;
                                            i10 = zztvVar.zzk;
                                            while (i10 < zztvVar.zzl) {
                                            }
                                            if (obj6 == null) {
                                            }
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
                                } catch (Throwable th5) {
                                    th = th5;
                                    th2 = th;
                                    obj6 = obj3;
                                    i10 = zztvVar.zzk;
                                    while (i10 < zztvVar.zzl) {
                                    }
                                    if (obj6 == null) {
                                    }
                                }
                                obj = obj2;
                                break;
                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
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
                                } catch (Throwable th6) {
                                    th = th6;
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzuvVar2 = zzuvVar;
                                    th2 = th;
                                    obj6 = obj3;
                                    i10 = zztvVar.zzk;
                                    while (i10 < zztvVar.zzl) {
                                    }
                                    if (obj6 == null) {
                                    }
                                }
                                obj = obj2;
                                break;
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                zzufVar.zzG(zztf.zza(obj5, zzu & 1048575));
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                zzufVar.zzH(zztf.zza(obj5, zzu & 1048575));
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
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
                            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                zzufVar.zzC(zztf.zza(obj5, zzu & 1048575), zzx(zzq), zzryVar);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
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
                            case 51:
                                zzvc.zzs(obj5, zzu & 1048575, Double.valueOf(zzufVar.zza()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 52:
                                zzvc.zzs(obj5, zzu & 1048575, Float.valueOf(zzufVar.zzb()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 53:
                                zzvc.zzs(obj5, zzu & 1048575, Long.valueOf(zzufVar.zzl()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 54:
                                zzvc.zzs(obj5, zzu & 1048575, Long.valueOf(zzufVar.zzo()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 55:
                                zzvc.zzs(obj5, zzu & 1048575, Integer.valueOf(zzufVar.zzg()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 56:
                                zzvc.zzs(obj5, zzu & 1048575, Long.valueOf(zzufVar.zzk()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 57:
                                zzvc.zzs(obj5, zzu & 1048575, Integer.valueOf(zzufVar.zzf()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 58:
                                zzvc.zzs(obj5, zzu & 1048575, Boolean.valueOf(zzufVar.zzN()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 59:
                                zzG(obj5, zzu, zzufVar);
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 60:
                                zzts zztsVar3 = (zzts) zzB(obj5, zzc, zzq);
                                zzufVar.zzu(zztsVar3, zzx(zzq), zzryVar);
                                zzK(obj5, zzc, zzq, zztsVar3);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 61:
                                zzvc.zzs(obj5, zzu & 1048575, zzufVar.zzp());
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 62:
                                zzvc.zzs(obj5, zzu & 1048575, Integer.valueOf(zzufVar.zzj()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 63:
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
                            case VoIPService.CALL_MIN_LAYER /* 65 */:
                                zzvc.zzs(obj5, zzu & 1048575, Long.valueOf(zzufVar.zzm()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 66:
                                zzvc.zzs(obj5, zzu & 1048575, Integer.valueOf(zzufVar.zzi()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 67:
                                zzvc.zzs(obj5, zzu & 1048575, Long.valueOf(zzufVar.zzn()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzuvVar2 = zzuvVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 68:
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
                                    } catch (zzsw unused5) {
                                        obj2 = obj5;
                                        obj3 = obj4;
                                        zzuvVar2 = zzuvVar;
                                        obj6 = obj3;
                                        if (obj6 == null) {
                                        }
                                        if (!zzuvVar2.zzk(obj6, zzufVar, 0)) {
                                        }
                                        obj = obj2;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        th2 = th;
                                        obj2 = obj5;
                                        obj3 = obj4;
                                        zzuvVar2 = zzuvVar;
                                        obj6 = obj3;
                                        i10 = zztvVar.zzk;
                                        while (i10 < zztvVar.zzl) {
                                        }
                                        if (obj6 == null) {
                                        }
                                    }
                                } else {
                                    obj6 = obj4;
                                }
                                try {
                                    if (!zzuvVar.zzk(obj6, zzufVar, 0)) {
                                        for (int i12 = zztvVar.zzk; i12 < zztvVar.zzl; i12++) {
                                            zzuv zzuvVar3 = zzuvVar;
                                            Object obj7 = obj5;
                                            zztvVar.zzy(obj7, zztvVar.zzj[i12], obj6, zzuvVar3, obj5);
                                            obj5 = obj7;
                                            zzuvVar = zzuvVar3;
                                        }
                                        break;
                                    }
                                    obj = obj5;
                                    break;
                                } catch (zzsw unused6) {
                                    obj2 = obj5;
                                    zzuvVar2 = zzuvVar;
                                    if (obj6 == null) {
                                    }
                                    if (!zzuvVar2.zzk(obj6, zzufVar, 0)) {
                                    }
                                    obj = obj2;
                                } catch (Throwable th8) {
                                    th = th8;
                                    th2 = th;
                                    obj2 = obj5;
                                    zzuvVar2 = zzuvVar;
                                    i10 = zztvVar.zzk;
                                    while (i10 < zztvVar.zzl) {
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
                    int i13 = this.zzk;
                    while (i13 < this.zzl) {
                        zzy(obj, this.zzj[i13], obj6, zzuvVar2, obj);
                        i13++;
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
                                    i10 = zztvVar.zzk;
                                    while (i10 < zztvVar.zzl) {
                                        zztvVar.zzy(obj2, zztvVar.zzj[i10], obj6, zzuvVar2, obj2);
                                        i10++;
                                        zztvVar = this;
                                    }
                                    if (obj6 == null) {
                                        throw th2;
                                    }
                                    zzuvVar2.zzj(obj2, obj6);
                                    throw th2;
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
                                    int i14 = this.zzk;
                                    while (i14 < this.zzl) {
                                        zzuv zzuvVar4 = zzuvVar;
                                        Object obj8 = obj;
                                        zzy(obj8, this.zzj[i14], obj6, zzuvVar4, obj);
                                        zzuvVar = zzuvVar4;
                                        i14++;
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
                                i10 = zztvVar.zzk;
                                while (i10 < zztvVar.zzl) {
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
                        i10 = zztvVar.zzk;
                        while (i10 < zztvVar.zzl) {
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
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzqb zzqbVar) {
        zzc(obj, bArr, i10, i11, 0, zzqbVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    @Override // com.google.android.recaptcha.internal.zzug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(Object obj, zzvi zzviVar) {
        Map.Entry entry;
        Iterator it;
        int[] iArr;
        int i10;
        Map.Entry entry2;
        int i11;
        int i12;
        int i13;
        int i14;
        zztv<T> zztvVar = this;
        if (zztvVar.zzh) {
            zzsd zzsdVar = ((zzsk) obj).zzb;
            if (!zzsdVar.zza.isEmpty()) {
                Iterator zzf = zzsdVar.zzf();
                entry = (Map.Entry) zzf.next();
                it = zzf;
                iArr = zztvVar.zzc;
                Unsafe unsafe = zzb;
                int i15 = 1048575;
                i10 = 0;
                int i16 = 1048575;
                int i17 = 0;
                while (i10 < iArr.length) {
                    int zzu = zztvVar.zzu(i10);
                    int zzt = zzt(zzu);
                    int i18 = iArr[i10];
                    if (zzt <= 17) {
                        int i19 = iArr[i10 + 2];
                        int i20 = i19 & i15;
                        if (i20 != i16) {
                            i17 = i20 == i15 ? 0 : unsafe.getInt(obj, i20);
                            i16 = i20;
                        }
                        int i21 = 1 << (i19 >>> 20);
                        entry2 = entry;
                        i11 = i16;
                        i12 = i17;
                        i13 = i21;
                    } else {
                        entry2 = entry;
                        i11 = i16;
                        i12 = i17;
                        i13 = 0;
                    }
                    while (true) {
                        if (entry2 != null) {
                            zzrz zzrzVar = zztvVar.zzn;
                            i14 = 1048575;
                            if (((zzsl) entry2.getKey()).zza <= i18) {
                                zzrzVar.zzb(zzviVar, entry2);
                                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                            }
                        } else {
                            i14 = 1048575;
                        }
                    }
                    long j10 = zzu & i14;
                    switch (zzt) {
                        case 0:
                            if (zztvVar.zzO(obj, i10, i11, i12, i13)) {
                                zzviVar.zzf(i18, zzvc.zza(obj, j10));
                            }
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 1:
                            if (zztvVar.zzO(obj, i10, i11, i12, i13)) {
                                zzviVar.zzo(i18, zzvc.zzb(obj, j10));
                            }
                            zztvVar = this;
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 2:
                            if (zztvVar.zzO(obj, i10, i11, i12, i13)) {
                                zzviVar.zzt(i18, unsafe.getLong(obj, j10));
                            }
                            zztvVar = this;
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 3:
                            if (zztvVar.zzO(obj, i10, i11, i12, i13)) {
                                zzviVar.zzK(i18, unsafe.getLong(obj, j10));
                            }
                            zztvVar = this;
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 4:
                            if (zztvVar.zzO(obj, i10, i11, i12, i13)) {
                                zzviVar.zzr(i18, unsafe.getInt(obj, j10));
                            }
                            zztvVar = this;
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 5:
                            if (zztvVar.zzO(obj, i10, i11, i12, i13)) {
                                zzviVar.zzm(i18, unsafe.getLong(obj, j10));
                            }
                            zztvVar = this;
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 6:
                            if (zztvVar.zzO(obj, i10, i11, i12, i13)) {
                                zzviVar.zzk(i18, unsafe.getInt(obj, j10));
                            }
                            zztvVar = this;
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 7:
                            if (zztvVar.zzO(obj, i10, i11, i12, i13)) {
                                zzviVar.zzb(i18, zzvc.zzw(obj, j10));
                            }
                            zztvVar = this;
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 8:
                            if (zztvVar.zzO(obj, i10, i11, i12, i13)) {
                                zzT(i18, unsafe.getObject(obj, j10), zzviVar);
                            }
                            zztvVar = this;
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 9:
                            if (zztvVar.zzO(obj, i10, i11, i12, i13)) {
                                zzviVar.zzv(i18, unsafe.getObject(obj, j10), zztvVar.zzx(i10));
                            }
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 10:
                            if (zztvVar.zzO(obj, i10, i11, i12, i13)) {
                                zzviVar.zzd(i18, (zzqm) unsafe.getObject(obj, j10));
                            }
                            zztvVar = this;
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 11:
                            if (zztvVar.zzO(obj, i10, i11, i12, i13)) {
                                zzviVar.zzI(i18, unsafe.getInt(obj, j10));
                            }
                            zztvVar = this;
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 12:
                            if (zztvVar.zzO(obj, i10, i11, i12, i13)) {
                                zzviVar.zzi(i18, unsafe.getInt(obj, j10));
                            }
                            zztvVar = this;
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 13:
                            if (zztvVar.zzO(obj, i10, i11, i12, i13)) {
                                zzviVar.zzx(i18, unsafe.getInt(obj, j10));
                            }
                            zztvVar = this;
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 14:
                            if (zztvVar.zzO(obj, i10, i11, i12, i13)) {
                                zzviVar.zzz(i18, unsafe.getLong(obj, j10));
                            }
                            zztvVar = this;
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 15:
                            if (zztvVar.zzO(obj, i10, i11, i12, i13)) {
                                zzviVar.zzB(i18, unsafe.getInt(obj, j10));
                            }
                            zztvVar = this;
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 16:
                            if (zztvVar.zzO(obj, i10, i11, i12, i13)) {
                                zzviVar.zzD(i18, unsafe.getLong(obj, j10));
                            }
                            zztvVar = this;
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 17:
                            if (zztvVar.zzO(obj, i10, i11, i12, i13)) {
                                zzviVar.zzq(i18, unsafe.getObject(obj, j10), zztvVar.zzx(i10));
                            }
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 18:
                            zzui.zzs(iArr[i10], (List) unsafe.getObject(obj, j10), zzviVar, false);
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 19:
                            zzui.zzw(iArr[i10], (List) unsafe.getObject(obj, j10), zzviVar, false);
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 20:
                            zzui.zzy(iArr[i10], (List) unsafe.getObject(obj, j10), zzviVar, false);
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 21:
                            zzui.zzE(iArr[i10], (List) unsafe.getObject(obj, j10), zzviVar, false);
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 22:
                            zzui.zzx(iArr[i10], (List) unsafe.getObject(obj, j10), zzviVar, false);
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 23:
                            zzui.zzv(iArr[i10], (List) unsafe.getObject(obj, j10), zzviVar, false);
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 24:
                            zzui.zzu(iArr[i10], (List) unsafe.getObject(obj, j10), zzviVar, false);
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 25:
                            zzui.zzr(iArr[i10], (List) unsafe.getObject(obj, j10), zzviVar, false);
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 26:
                            int i22 = iArr[i10];
                            List list = (List) unsafe.getObject(obj, j10);
                            int i23 = zzui.zza;
                            if (list != null && !list.isEmpty()) {
                                zzviVar.zzH(i22, list);
                            }
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                            break;
                        case 27:
                            int i24 = iArr[i10];
                            List list2 = (List) unsafe.getObject(obj, j10);
                            zzug zzx = zztvVar.zzx(i10);
                            int i25 = zzui.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i26 = 0; i26 < list2.size(); i26++) {
                                    ((zzqw) zzviVar).zzv(i24, list2.get(i26), zzx);
                                }
                            }
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                            break;
                        case 28:
                            int i27 = iArr[i10];
                            List list3 = (List) unsafe.getObject(obj, j10);
                            int i28 = zzui.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzviVar.zze(i27, list3);
                            }
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                            break;
                        case 29:
                            zzui.zzD(iArr[i10], (List) unsafe.getObject(obj, j10), zzviVar, false);
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case MessageObject.TYPE_GIFT_STARS /* 30 */:
                            zzui.zzt(iArr[i10], (List) unsafe.getObject(obj, j10), zzviVar, false);
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                            zzui.zzz(iArr[i10], (List) unsafe.getObject(obj, j10), zzviVar, false);
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 32:
                            zzui.zzA(iArr[i10], (List) unsafe.getObject(obj, j10), zzviVar, false);
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 33:
                            zzui.zzB(iArr[i10], (List) unsafe.getObject(obj, j10), zzviVar, false);
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 34:
                            zzui.zzC(iArr[i10], (List) unsafe.getObject(obj, j10), zzviVar, false);
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 35:
                            zzui.zzs(iArr[i10], (List) unsafe.getObject(obj, j10), zzviVar, true);
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 36:
                            zzui.zzw(iArr[i10], (List) unsafe.getObject(obj, j10), zzviVar, true);
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 37:
                            zzui.zzy(iArr[i10], (List) unsafe.getObject(obj, j10), zzviVar, true);
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 38:
                            zzui.zzE(iArr[i10], (List) unsafe.getObject(obj, j10), zzviVar, true);
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case Maneuver.TYPE_DESTINATION /* 39 */:
                            zzui.zzx(iArr[i10], (List) unsafe.getObject(obj, j10), zzviVar, true);
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                            zzui.zzv(iArr[i10], (List) unsafe.getObject(obj, j10), zzviVar, true);
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                            zzui.zzu(iArr[i10], (List) unsafe.getObject(obj, j10), zzviVar, true);
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                            zzui.zzr(iArr[i10], (List) unsafe.getObject(obj, j10), zzviVar, true);
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                            zzui.zzD(iArr[i10], (List) unsafe.getObject(obj, j10), zzviVar, true);
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                            zzui.zzt(iArr[i10], (List) unsafe.getObject(obj, j10), zzviVar, true);
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                            zzui.zzz(iArr[i10], (List) unsafe.getObject(obj, j10), zzviVar, true);
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                            zzui.zzA(iArr[i10], (List) unsafe.getObject(obj, j10), zzviVar, true);
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                            zzui.zzB(iArr[i10], (List) unsafe.getObject(obj, j10), zzviVar, true);
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 48:
                            zzui.zzC(iArr[i10], (List) unsafe.getObject(obj, j10), zzviVar, true);
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                            int i29 = iArr[i10];
                            List list4 = (List) unsafe.getObject(obj, j10);
                            zzug zzx2 = zztvVar.zzx(i10);
                            int i30 = zzui.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i31 = 0; i31 < list4.size(); i31++) {
                                    ((zzqw) zzviVar).zzq(i29, list4.get(i31), zzx2);
                                }
                            }
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                            break;
                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                            if (unsafe.getObject(obj, j10) != null) {
                                throw null;
                            }
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 51:
                            if (zztvVar.zzR(obj, i18, i10)) {
                                zzviVar.zzf(i18, zzn(obj, j10));
                            }
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 52:
                            if (zztvVar.zzR(obj, i18, i10)) {
                                zzviVar.zzo(i18, zzo(obj, j10));
                            }
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 53:
                            if (zztvVar.zzR(obj, i18, i10)) {
                                zzviVar.zzt(i18, zzv(obj, j10));
                            }
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 54:
                            if (zztvVar.zzR(obj, i18, i10)) {
                                zzviVar.zzK(i18, zzv(obj, j10));
                            }
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 55:
                            if (zztvVar.zzR(obj, i18, i10)) {
                                zzviVar.zzr(i18, zzp(obj, j10));
                            }
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 56:
                            if (zztvVar.zzR(obj, i18, i10)) {
                                zzviVar.zzm(i18, zzv(obj, j10));
                            }
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 57:
                            if (zztvVar.zzR(obj, i18, i10)) {
                                zzviVar.zzk(i18, zzp(obj, j10));
                            }
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 58:
                            if (zztvVar.zzR(obj, i18, i10)) {
                                zzviVar.zzb(i18, zzS(obj, j10));
                            }
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 59:
                            if (zztvVar.zzR(obj, i18, i10)) {
                                zzT(i18, unsafe.getObject(obj, j10), zzviVar);
                            }
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 60:
                            if (zztvVar.zzR(obj, i18, i10)) {
                                zzviVar.zzv(i18, unsafe.getObject(obj, j10), zztvVar.zzx(i10));
                            }
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 61:
                            if (zztvVar.zzR(obj, i18, i10)) {
                                zzviVar.zzd(i18, (zzqm) unsafe.getObject(obj, j10));
                            }
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 62:
                            if (zztvVar.zzR(obj, i18, i10)) {
                                zzviVar.zzI(i18, zzp(obj, j10));
                            }
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 63:
                            if (zztvVar.zzR(obj, i18, i10)) {
                                zzviVar.zzi(i18, zzp(obj, j10));
                            }
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 64:
                            if (zztvVar.zzR(obj, i18, i10)) {
                                zzviVar.zzx(i18, zzp(obj, j10));
                            }
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case VoIPService.CALL_MIN_LAYER /* 65 */:
                            if (zztvVar.zzR(obj, i18, i10)) {
                                zzviVar.zzz(i18, zzv(obj, j10));
                            }
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 66:
                            if (zztvVar.zzR(obj, i18, i10)) {
                                zzviVar.zzB(i18, zzp(obj, j10));
                            }
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 67:
                            if (zztvVar.zzR(obj, i18, i10)) {
                                zzviVar.zzD(i18, zzv(obj, j10));
                            }
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        case 68:
                            if (zztvVar.zzR(obj, i18, i10)) {
                                zzviVar.zzq(i18, unsafe.getObject(obj, j10), zztvVar.zzx(i10));
                            }
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
                            entry = entry2;
                        default:
                            i10 += 3;
                            i17 = i12;
                            i15 = 1048575;
                            i16 = i11;
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
        int i152 = 1048575;
        i10 = 0;
        int i162 = 1048575;
        int i172 = 0;
        while (i10 < iArr.length) {
        }
        while (entry != null) {
        }
        ((zzsn) obj).zzc.zzl(zzviVar);
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final boolean zzk(Object obj, Object obj2) {
        boolean zzF;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzu = zzu(i10);
            long j10 = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (zzL(obj, obj2, i10) && Double.doubleToLongBits(zzvc.zza(obj, j10)) == Double.doubleToLongBits(zzvc.zza(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i10) && Float.floatToIntBits(zzvc.zzb(obj, j10)) == Float.floatToIntBits(zzvc.zzb(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i10) && zzvc.zzd(obj, j10) == zzvc.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i10) && zzvc.zzd(obj, j10) == zzvc.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i10) && zzvc.zzc(obj, j10) == zzvc.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i10) && zzvc.zzd(obj, j10) == zzvc.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i10) && zzvc.zzc(obj, j10) == zzvc.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i10) && zzvc.zzw(obj, j10) == zzvc.zzw(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i10) && zzui.zzF(zzvc.zzf(obj, j10), zzvc.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i10) && zzui.zzF(zzvc.zzf(obj, j10), zzvc.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i10) && zzui.zzF(zzvc.zzf(obj, j10), zzvc.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i10) && zzvc.zzc(obj, j10) == zzvc.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i10) && zzvc.zzc(obj, j10) == zzvc.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i10) && zzvc.zzc(obj, j10) == zzvc.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i10) && zzvc.zzd(obj, j10) == zzvc.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i10) && zzvc.zzc(obj, j10) == zzvc.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i10) && zzvc.zzd(obj, j10) == zzvc.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i10) && zzui.zzF(zzvc.zzf(obj, j10), zzvc.zzf(obj2, j10))) {
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
                    zzF = zzui.zzF(zzvc.zzf(obj, j10), zzvc.zzf(obj2, j10));
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    zzF = zzui.zzF(zzvc.zzf(obj, j10), zzvc.zzf(obj2, j10));
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
                    long zzr = zzr(i10) & 1048575;
                    if (zzvc.zzc(obj, zzr) == zzvc.zzc(obj2, zzr) && zzui.zzF(zzvc.zzf(obj, j10), zzvc.zzf(obj2, j10))) {
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
        int i10;
        int i11;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i16 = iArr[i15];
            int i17 = iArr2[i16];
            int zzu = zzu(i16);
            int i18 = iArr2[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i13) {
                if (i19 != 1048575) {
                    i14 = zzb.getInt(obj, i19);
                }
                i11 = i16;
                i12 = i14;
                i10 = i19;
            } else {
                int i21 = i14;
                i10 = i13;
                i11 = i16;
                i12 = i21;
            }
            if ((268435456 & zzu) != 0 && !zzO(obj, i11, i10, i12, i20)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt == 60 || zzt == 68) {
                        if (zzR(obj, i17, i11) && !zzP(obj, zzu, zzx(i11))) {
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
                    zzug zzx = zzx(i11);
                    for (int i22 = 0; i22 < list.size(); i22++) {
                        if (!zzx.zzl(list.get(i22))) {
                            return false;
                        }
                    }
                }
            } else if (zzO(obj, i11, i10, i12, i20) && !zzP(obj, zzu, zzx(i11))) {
                return false;
            }
            i15++;
            i13 = i10;
            i14 = i12;
        }
        return !this.zzh || ((zzsk) obj).zzb.zzk();
    }
}
