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
final class zzkh<T> implements zzkr<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzlv.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzke zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzjs zzm;
    private final zzll zzn;
    private final zzif zzo;
    private final zzkk zzp;
    private final zzjz zzq;

    private zzkh(int[] iArr, Object[] objArr, int i, int i2, zzke zzkeVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzkk zzkkVar, zzjs zzjsVar, zzll zzllVar, zzif zzifVar, zzjz zzjzVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzkeVar instanceof zzit;
        boolean z2 = false;
        if (zzifVar != null && zzifVar.zzj(zzkeVar)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i4;
        this.zzl = i5;
        this.zzp = zzkkVar;
        this.zzm = zzjsVar;
        this.zzn = zzllVar;
        this.zzo = zzifVar;
        this.zzg = zzkeVar;
        this.zzq = zzjzVar;
    }

    private final Object zzA(Object obj, int i) {
        zzkr zzx = zzx(i);
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
        zzkr zzx = zzx(i2);
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
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
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
            zzkr zzx = zzx(i);
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
        int i2 = this.zzc[i];
        if (zzR(obj2, i2, i)) {
            int zzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzkr zzx = zzx(i);
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

    private final void zzG(Object obj, int i, zzkq zzkqVar) {
        long j = i & 1048575;
        if (zzM(i)) {
            zzlv.zzs(obj, j, zzkqVar.zzs());
        } else if (this.zzi) {
            zzlv.zzs(obj, j, zzkqVar.zzr());
        } else {
            zzlv.zzs(obj, j, zzkqVar.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int zzr = zzr(i);
        long j = 1048575 & zzr;
        if (j == 1048575) {
            return;
        }
        zzlv.zzq(obj, j, (1 << (zzr >>> 20)) | zzlv.zzc(obj, j));
    }

    private final void zzI(Object obj, int i, int i2) {
        zzlv.zzq(obj, zzr(i2) & 1048575, i);
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
            return (zzlv.zzc(obj, j) & (1 << (zzr >>> 20))) != 0;
        }
        int zzu = zzu(i);
        long j2 = zzu & 1048575;
        switch (zzt(zzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzlv.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzlv.zzb(obj, j2)) != 0;
            case 2:
                return zzlv.zzd(obj, j2) != 0;
            case 3:
                return zzlv.zzd(obj, j2) != 0;
            case 4:
                return zzlv.zzc(obj, j2) != 0;
            case 5:
                return zzlv.zzd(obj, j2) != 0;
            case 6:
                return zzlv.zzc(obj, j2) != 0;
            case 7:
                return zzlv.zzw(obj, j2);
            case 8:
                Object zzf = zzlv.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzgw) {
                    return !zzgw.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzlv.zzf(obj, j2) != null;
            case 10:
                return !zzgw.zzb.equals(zzlv.zzf(obj, j2));
            case 11:
                return zzlv.zzc(obj, j2) != 0;
            case 12:
                return zzlv.zzc(obj, j2) != 0;
            case 13:
                return zzlv.zzc(obj, j2) != 0;
            case 14:
                return zzlv.zzd(obj, j2) != 0;
            case 15:
                return zzlv.zzc(obj, j2) != 0;
            case 16:
                return zzlv.zzd(obj, j2) != 0;
            case 17:
                return zzlv.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzN(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzP(Object obj, int i, zzkr zzkrVar) {
        return zzkrVar.zzl(zzlv.zzf(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzit) {
            return ((zzit) obj).zzG();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzlv.zzc(obj, (long) (zzr(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzlv.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzmd zzmdVar) {
        if (obj instanceof String) {
            zzmdVar.zzG(i, (String) obj);
        } else {
            zzmdVar.zzd(i, (zzgw) obj);
        }
    }

    static zzlm zzd(Object obj) {
        zzit zzitVar = (zzit) obj;
        zzlm zzlmVar = zzitVar.zzc;
        if (zzlmVar != zzlm.zzc()) {
            return zzlmVar;
        }
        zzlm zzf = zzlm.zzf();
        zzitVar.zzc = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzkh zzm(Class cls, zzkb zzkbVar, zzkk zzkkVar, zzjs zzjsVar, zzll zzllVar, zzif zzifVar, zzjz zzjzVar) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
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
        zzkp zzkpVar;
        int i19;
        String str;
        int i20;
        int i21;
        int i22;
        int i23;
        Field zzC;
        char charAt11;
        int i24;
        int i25;
        int i26;
        int i27;
        Object obj;
        Field zzC2;
        Object obj2;
        Field zzC3;
        int i28;
        char charAt12;
        int i29;
        char charAt13;
        int i30;
        char charAt14;
        int i31;
        char charAt15;
        if (!(zzkbVar instanceof zzkp)) {
            throw null;
        }
        zzkp zzkpVar2 = (zzkp) zzkbVar;
        String zzd = zzkpVar2.zzd();
        int length = zzd.length();
        char charAt16 = zzd.charAt(0);
        char c = CharacterCompat.MIN_HIGH_SURROGATE;
        if (charAt16 >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (zzd.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int charAt17 = zzd.charAt(i);
        if (charAt17 >= 55296) {
            int i34 = charAt17 & 8191;
            int i35 = 13;
            while (true) {
                i31 = i33 + 1;
                charAt15 = zzd.charAt(i33);
                if (charAt15 < 55296) {
                    break;
                }
                i34 |= (charAt15 & 8191) << i35;
                i35 += 13;
                i33 = i31;
            }
            charAt17 = i34 | (charAt15 << i35);
            i33 = i31;
        }
        if (charAt17 == 0) {
            iArr = zza;
            i5 = 0;
            charAt = 0;
            charAt2 = 0;
            i3 = 0;
            i6 = 0;
            i2 = 0;
            i4 = 0;
        } else {
            int i36 = i33 + 1;
            int charAt18 = zzd.charAt(i33);
            if (charAt18 >= 55296) {
                int i37 = charAt18 & 8191;
                int i38 = 13;
                while (true) {
                    i14 = i36 + 1;
                    charAt10 = zzd.charAt(i36);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i37 |= (charAt10 & 8191) << i38;
                    i38 += 13;
                    i36 = i14;
                }
                charAt18 = i37 | (charAt10 << i38);
                i36 = i14;
            }
            int i39 = i36 + 1;
            int charAt19 = zzd.charAt(i36);
            if (charAt19 >= 55296) {
                int i40 = charAt19 & 8191;
                int i41 = 13;
                while (true) {
                    i13 = i39 + 1;
                    charAt9 = zzd.charAt(i39);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i40 |= (charAt9 & 8191) << i41;
                    i41 += 13;
                    i39 = i13;
                }
                charAt19 = i40 | (charAt9 << i41);
                i39 = i13;
            }
            int i42 = i39 + 1;
            int charAt20 = zzd.charAt(i39);
            if (charAt20 >= 55296) {
                int i43 = charAt20 & 8191;
                int i44 = 13;
                while (true) {
                    i12 = i42 + 1;
                    charAt8 = zzd.charAt(i42);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i43 |= (charAt8 & 8191) << i44;
                    i44 += 13;
                    i42 = i12;
                }
                charAt20 = i43 | (charAt8 << i44);
                i42 = i12;
            }
            int i45 = i42 + 1;
            int charAt21 = zzd.charAt(i42);
            if (charAt21 >= 55296) {
                int i46 = charAt21 & 8191;
                int i47 = 13;
                while (true) {
                    i11 = i45 + 1;
                    charAt7 = zzd.charAt(i45);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i46 |= (charAt7 & 8191) << i47;
                    i47 += 13;
                    i45 = i11;
                }
                charAt21 = i46 | (charAt7 << i47);
                i45 = i11;
            }
            int i48 = i45 + 1;
            charAt = zzd.charAt(i45);
            if (charAt >= 55296) {
                int i49 = charAt & 8191;
                int i50 = 13;
                while (true) {
                    i10 = i48 + 1;
                    charAt6 = zzd.charAt(i48);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i49 |= (charAt6 & 8191) << i50;
                    i50 += 13;
                    i48 = i10;
                }
                charAt = i49 | (charAt6 << i50);
                i48 = i10;
            }
            int i51 = i48 + 1;
            charAt2 = zzd.charAt(i48);
            if (charAt2 >= 55296) {
                int i52 = charAt2 & 8191;
                int i53 = 13;
                while (true) {
                    i9 = i51 + 1;
                    charAt5 = zzd.charAt(i51);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i52 |= (charAt5 & 8191) << i53;
                    i53 += 13;
                    i51 = i9;
                }
                charAt2 = i52 | (charAt5 << i53);
                i51 = i9;
            }
            int i54 = i51 + 1;
            int charAt22 = zzd.charAt(i51);
            if (charAt22 >= 55296) {
                int i55 = charAt22 & 8191;
                int i56 = 13;
                while (true) {
                    i8 = i54 + 1;
                    charAt4 = zzd.charAt(i54);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i55 |= (charAt4 & 8191) << i56;
                    i56 += 13;
                    i54 = i8;
                }
                charAt22 = i55 | (charAt4 << i56);
                i54 = i8;
            }
            int i57 = i54 + 1;
            int charAt23 = zzd.charAt(i54);
            if (charAt23 >= 55296) {
                int i58 = charAt23 & 8191;
                int i59 = 13;
                while (true) {
                    i7 = i57 + 1;
                    charAt3 = zzd.charAt(i57);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i58 |= (charAt3 & 8191) << i59;
                    i59 += 13;
                    i57 = i7;
                }
                charAt23 = i58 | (charAt3 << i59);
                i57 = i7;
            }
            i2 = charAt18 + charAt18 + charAt19;
            iArr = new int[charAt23 + charAt2 + charAt22];
            i3 = charAt20;
            i4 = charAt23;
            i5 = charAt18;
            i6 = charAt21;
            i33 = i57;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzkpVar2.zze();
        Class<?> cls2 = zzkpVar2.zza().getClass();
        int i60 = i4 + charAt2;
        int i61 = charAt + charAt;
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr = new Object[i61];
        int i62 = i4;
        int i63 = i60;
        int i64 = 0;
        int i65 = 0;
        while (i33 < length) {
            int i66 = i33 + 1;
            int charAt24 = zzd.charAt(i33);
            if (charAt24 >= c) {
                int i67 = charAt24 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i30 = i68 + 1;
                    charAt14 = zzd.charAt(i68);
                    if (charAt14 < c) {
                        break;
                    }
                    i67 |= (charAt14 & 8191) << i69;
                    i69 += 13;
                    i68 = i30;
                }
                charAt24 = i67 | (charAt14 << i69);
                i15 = i30;
            } else {
                i15 = i66;
            }
            int i70 = i15 + 1;
            int charAt25 = zzd.charAt(i15);
            if (charAt25 >= c) {
                int i71 = charAt25 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i29 = i72 + 1;
                    charAt13 = zzd.charAt(i72);
                    if (charAt13 < c) {
                        break;
                    }
                    i71 |= (charAt13 & 8191) << i73;
                    i73 += 13;
                    i72 = i29;
                }
                charAt25 = i71 | (charAt13 << i73);
                i16 = i29;
            } else {
                i16 = i70;
            }
            if ((charAt25 & 1024) != 0) {
                iArr[i64] = i65;
                i64++;
            }
            int i74 = charAt25 & NotificationCenter.cameraInitied;
            int i75 = charAt25 & 2048;
            int i76 = length;
            if (i74 >= 51) {
                int i77 = i16 + 1;
                int charAt26 = zzd.charAt(i16);
                char c2 = CharacterCompat.MIN_HIGH_SURROGATE;
                if (charAt26 >= 55296) {
                    int i78 = 13;
                    int i79 = charAt26 & 8191;
                    int i80 = i77;
                    while (true) {
                        i28 = i80 + 1;
                        charAt12 = zzd.charAt(i80);
                        if (charAt12 < c2) {
                            break;
                        }
                        i79 |= (charAt12 & 8191) << i78;
                        i78 += 13;
                        i80 = i28;
                        c2 = CharacterCompat.MIN_HIGH_SURROGATE;
                    }
                    charAt26 = i79 | (charAt12 << i78);
                    i26 = i28;
                } else {
                    i26 = i77;
                }
                int i81 = i26;
                int i82 = i74 - 51;
                i18 = i6;
                if (i82 == 9 || i82 == 17) {
                    i27 = i2 + 1;
                    int i83 = i65 / 3;
                    objArr[i83 + i83 + 1] = zze[i2];
                } else {
                    if (i82 == 12) {
                        if (zzkpVar2.zzc() == 1 || i75 != 0) {
                            i27 = i2 + 1;
                            int i84 = i65 / 3;
                            objArr[i84 + i84 + 1] = zze[i2];
                        } else {
                            i75 = 0;
                        }
                    }
                    int i85 = charAt26 + charAt26;
                    obj = zze[i85];
                    if (obj instanceof Field) {
                        zzC2 = zzC(cls2, (String) obj);
                        zze[i85] = zzC2;
                    } else {
                        zzC2 = (Field) obj;
                    }
                    i17 = i3;
                    i23 = (int) unsafe.objectFieldOffset(zzC2);
                    int i86 = i85 + 1;
                    obj2 = zze[i86];
                    if (obj2 instanceof Field) {
                        zzC3 = zzC(cls2, (String) obj2);
                        zze[i86] = zzC3;
                    } else {
                        zzC3 = (Field) obj2;
                    }
                    zzkpVar = zzkpVar2;
                    str = zzd;
                    i22 = i2;
                    i20 = i81;
                    i19 = (int) unsafe.objectFieldOffset(zzC3);
                    i21 = 0;
                }
                i2 = i27;
                int i852 = charAt26 + charAt26;
                obj = zze[i852];
                if (obj instanceof Field) {
                }
                i17 = i3;
                i23 = (int) unsafe.objectFieldOffset(zzC2);
                int i862 = i852 + 1;
                obj2 = zze[i862];
                if (obj2 instanceof Field) {
                }
                zzkpVar = zzkpVar2;
                str = zzd;
                i22 = i2;
                i20 = i81;
                i19 = (int) unsafe.objectFieldOffset(zzC3);
                i21 = 0;
            } else {
                i17 = i3;
                i18 = i6;
                int i87 = i2 + 1;
                Field zzC4 = zzC(cls2, (String) zze[i2]);
                if (i74 == 9 || i74 == 17) {
                    zzkpVar = zzkpVar2;
                    int i88 = i65 / 3;
                    objArr[i88 + i88 + 1] = zzC4.getType();
                } else {
                    if (i74 == 27) {
                        zzkpVar = zzkpVar2;
                        i24 = 1;
                        i25 = i2 + 2;
                    } else if (i74 == 49) {
                        i25 = i2 + 2;
                        zzkpVar = zzkpVar2;
                        i24 = 1;
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        zzkpVar = zzkpVar2;
                        if (zzkpVar2.zzc() == 1 || i75 != 0) {
                            i25 = i2 + 2;
                            int i89 = i65 / 3;
                            objArr[i89 + i89 + 1] = zze[i87];
                            i87 = i25;
                        } else {
                            i75 = 0;
                        }
                    } else {
                        if (i74 == 50) {
                            int i90 = i2 + 2;
                            int i91 = i62 + 1;
                            iArr[i62] = i65;
                            int i92 = i65 / 3;
                            int i93 = i92 + i92;
                            objArr[i93] = zze[i87];
                            if (i75 != 0) {
                                i87 = i2 + 3;
                                objArr[i93 + 1] = zze[i90];
                                i62 = i91;
                            } else {
                                i87 = i90;
                                i62 = i91;
                                i75 = 0;
                            }
                        }
                        zzkpVar = zzkpVar2;
                    }
                    int i94 = i65 / 3;
                    objArr[i94 + i94 + i24] = zze[i87];
                    i87 = i25;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                i19 = 1048575;
                if ((charAt25 & 4096) == 0 || i74 > 17) {
                    str = zzd;
                    i20 = i16;
                    i21 = 0;
                } else {
                    int i95 = i16 + 1;
                    int charAt27 = zzd.charAt(i16);
                    if (charAt27 >= 55296) {
                        int i96 = charAt27 & 8191;
                        int i97 = 13;
                        while (true) {
                            i20 = i95 + 1;
                            charAt11 = zzd.charAt(i95);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i96 |= (charAt11 & 8191) << i97;
                            i97 += 13;
                            i95 = i20;
                        }
                        charAt27 = i96 | (charAt11 << i97);
                    } else {
                        i20 = i95;
                    }
                    int i98 = i5 + i5 + (charAt27 / 32);
                    Object obj3 = zze[i98];
                    str = zzd;
                    if (obj3 instanceof Field) {
                        zzC = (Field) obj3;
                    } else {
                        zzC = zzC(cls2, (String) obj3);
                        zze[i98] = zzC;
                    }
                    i21 = charAt27 % 32;
                    i19 = (int) unsafe.objectFieldOffset(zzC);
                }
                if (i74 >= 18 && i74 <= 49) {
                    iArr[i63] = objectFieldOffset;
                    i63++;
                }
                i22 = i87;
                i23 = objectFieldOffset;
            }
            int i99 = i65 + 1;
            iArr2[i65] = charAt24;
            int i100 = i65 + 2;
            iArr2[i99] = i23 | ((charAt25 & 256) != 0 ? TLObject.FLAG_28 : 0) | ((charAt25 & 512) != 0 ? TLObject.FLAG_29 : 0) | (i75 != 0 ? TLObject.FLAG_31 : 0) | (i74 << 20);
            i65 += 3;
            iArr2[i100] = (i21 << 20) | i19;
            i2 = i22;
            i33 = i20;
            length = i76;
            zzkpVar2 = zzkpVar;
            zzd = str;
            i6 = i18;
            i3 = i17;
            c = CharacterCompat.MIN_HIGH_SURROGATE;
        }
        zzkp zzkpVar3 = zzkpVar2;
        return new zzkh(iArr2, objArr, i3, i6, zzkpVar3.zza(), zzkpVar3.zzc(), false, iArr, i4, i60, zzkkVar, zzjsVar, zzllVar, zzifVar, zzjzVar);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzlv.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzlv.zzf(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzlv.zzf(obj, j)).intValue();
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
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
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
        return (i >>> 20) & NotificationCenter.cameraInitied;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzlv.zzf(obj, j)).longValue();
    }

    private final zzix zzw(int i) {
        int i2 = i / 3;
        return (zzix) this.zzd[i2 + i2 + 1];
    }

    private final zzkr zzx(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzkr zzkrVar = (zzkr) objArr[i3];
        if (zzkrVar != null) {
            return zzkrVar;
        }
        zzkr zzb2 = zzkn.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzll zzllVar, Object obj3) {
        int i2 = this.zzc[i];
        Object zzf = zzlv.zzf(obj, zzu(i) & 1048575);
        if (zzf == null || zzw(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final int zza(Object obj) {
        int i;
        int i2;
        int i3;
        int zzy;
        int zzy2;
        int zzz;
        int zzy3;
        int zzy4;
        int zzy5;
        int zzy6;
        int zzh;
        int zzg;
        int size;
        int zzy7;
        int zzy8;
        int zzy9;
        int zze;
        int zzy10;
        int zzy11;
        int i4;
        Unsafe unsafe = zzb;
        boolean z = false;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i8 < this.zzc.length) {
            int zzu = zzu(i8);
            int zzt = zzt(zzu);
            int[] iArr = this.zzc;
            int i10 = iArr[i8];
            int i11 = iArr[i8 + 2];
            int i12 = i11 & i5;
            if (zzt <= 17) {
                if (i12 != i6) {
                    i7 = i12 == i5 ? 0 : unsafe.getInt(obj, i12);
                    i6 = i12;
                }
                i = i6;
                i2 = i7;
                i3 = 1 << (i11 >>> 20);
            } else {
                i = i6;
                i2 = i7;
                i3 = 0;
            }
            int i13 = zzu & i5;
            if (zzt >= zzik.zzJ.zza()) {
                zzik.zzW.zza();
            }
            long j = i13;
            switch (zzt) {
                case 0:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzy = zzhh.zzy(i10 << 3);
                        zzh = zzy + 8;
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
                        zzy2 = zzhh.zzy(i10 << 3);
                        zzh = zzy2 + 4;
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
                        zzz = zzhh.zzz(unsafe.getLong(obj, j));
                        zzy3 = zzhh.zzy(i10 << 3);
                        zzh = zzy3 + zzz;
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
                        zzz = zzhh.zzz(unsafe.getLong(obj, j));
                        zzy3 = zzhh.zzy(i10 << 3);
                        zzh = zzy3 + zzz;
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
                        zzz = zzhh.zzu(unsafe.getInt(obj, j));
                        zzy3 = zzhh.zzy(i10 << 3);
                        zzh = zzy3 + zzz;
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
                        zzy = zzhh.zzy(i10 << 3);
                        zzh = zzy + 8;
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
                        zzy2 = zzhh.zzy(i10 << 3);
                        zzh = zzy2 + 4;
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
                        zzy4 = zzhh.zzy(i10 << 3);
                        zzh = zzy4 + 1;
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
                        int i14 = i10 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzgw) {
                            int i15 = zzhh.zzb;
                            int zzd = ((zzgw) object).zzd();
                            zzy5 = zzhh.zzy(zzd) + zzd;
                            zzy6 = zzhh.zzy(i14);
                            zzh = zzy6 + zzy5;
                            i9 += zzh;
                            i8 += 3;
                            i6 = i;
                            i7 = i2;
                            z = false;
                            i5 = 1048575;
                        } else {
                            zzz = zzhh.zzx((String) object);
                            zzy3 = zzhh.zzy(i14);
                            zzh = zzy3 + zzz;
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
                        zzh = zzkt.zzh(i10, unsafe.getObject(obj, j), zzx(i8));
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
                        zzgw zzgwVar = (zzgw) unsafe.getObject(obj, j);
                        int i16 = zzhh.zzb;
                        int zzd2 = zzgwVar.zzd();
                        zzy5 = zzhh.zzy(zzd2) + zzd2;
                        zzy6 = zzhh.zzy(i10 << 3);
                        zzh = zzy6 + zzy5;
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
                        zzz = zzhh.zzy(unsafe.getInt(obj, j));
                        zzy3 = zzhh.zzy(i10 << 3);
                        zzh = zzy3 + zzz;
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
                        zzz = zzhh.zzu(unsafe.getInt(obj, j));
                        zzy3 = zzhh.zzy(i10 << 3);
                        zzh = zzy3 + zzz;
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
                        zzy2 = zzhh.zzy(i10 << 3);
                        zzh = zzy2 + 4;
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
                        zzy = zzhh.zzy(i10 << 3);
                        zzh = zzy + 8;
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
                        int i17 = unsafe.getInt(obj, j);
                        zzy3 = zzhh.zzy(i10 << 3);
                        zzz = zzhh.zzy((i17 >> 31) ^ (i17 + i17));
                        zzh = zzy3 + zzz;
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
                        long j2 = unsafe.getLong(obj, j);
                        zzy3 = zzhh.zzy(i10 << 3);
                        zzz = zzhh.zzz((j2 >> 63) ^ (j2 + j2));
                        zzh = zzy3 + zzz;
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
                        zzh = zzhh.zzt(i10, (zzke) unsafe.getObject(obj, j), zzx(i8));
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
                    zzh = zzkt.zzd(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 19:
                    zzh = zzkt.zzb(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i18 = zzkt.zza;
                    if (list.size() != 0) {
                        zzg = zzkt.zzg(list) + (list.size() * zzhh.zzy(i10 << 3));
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
                    int i19 = zzkt.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzy3 = zzkt.zzl(list2);
                        zzy7 = zzhh.zzy(i10 << 3);
                        zzz = size * zzy7;
                        zzh = zzy3 + zzz;
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
                    int i20 = zzkt.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzy3 = zzkt.zzf(list3);
                        zzy7 = zzhh.zzy(i10 << 3);
                        zzz = size * zzy7;
                        zzh = zzy3 + zzz;
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
                    zzh = zzkt.zzd(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 24:
                    zzh = zzkt.zzb(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i21 = zzkt.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzh = size2 * (zzhh.zzy(i10 << 3) + 1);
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
                    int i22 = zzkt.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        boolean z2 = list5 instanceof zzjm;
                        zzg = zzhh.zzy(i10 << 3) * size3;
                        if (z2) {
                            zzjm zzjmVar = (zzjm) list5;
                            for (int i23 = 0; i23 < size3; i23++) {
                                Object zzf = zzjmVar.zzf(i23);
                                if (zzf instanceof zzgw) {
                                    int zzd3 = ((zzgw) zzf).zzd();
                                    zzg += zzhh.zzy(zzd3) + zzd3;
                                } else {
                                    zzg += zzhh.zzx((String) zzf);
                                }
                            }
                        } else {
                            for (int i24 = 0; i24 < size3; i24++) {
                                Object obj2 = list5.get(i24);
                                if (obj2 instanceof zzgw) {
                                    int zzd4 = ((zzgw) obj2).zzd();
                                    zzg += zzhh.zzy(zzd4) + zzd4;
                                } else {
                                    zzg += zzhh.zzx((String) obj2);
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
                    zzkr zzx = zzx(i8);
                    int i25 = zzkt.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzy8 = 0;
                    } else {
                        zzy8 = zzhh.zzy(i10 << 3) * size4;
                        for (int i26 = 0; i26 < size4; i26++) {
                            Object obj3 = list6.get(i26);
                            if (obj3 instanceof zzjk) {
                                int zza2 = ((zzjk) obj3).zza();
                                zzy8 += zzhh.zzy(zza2) + zza2;
                            } else {
                                zzy8 += zzhh.zzw((zzke) obj3, zzx);
                            }
                        }
                    }
                    i9 += zzy8;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i27 = zzkt.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        zzy9 = 0;
                    } else {
                        zzy9 = size5 * zzhh.zzy(i10 << 3);
                        for (int i28 = 0; i28 < list7.size(); i28++) {
                            int zzd5 = ((zzgw) list7.get(i28)).zzd();
                            zzy9 += zzhh.zzy(zzd5) + zzd5;
                        }
                    }
                    i9 += zzy9;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i29 = zzkt.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzy3 = zzkt.zzk(list8);
                        zzy7 = zzhh.zzy(i10 << 3);
                        zzz = size * zzy7;
                        zzh = zzy3 + zzz;
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
                    int i30 = zzkt.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzy3 = zzkt.zza(list9);
                        zzy7 = zzhh.zzy(i10 << 3);
                        zzz = size * zzy7;
                        zzh = zzy3 + zzz;
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
                    zzh = zzkt.zzb(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 32:
                    zzh = zzkt.zzd(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j);
                    int i31 = zzkt.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzy3 = zzkt.zzi(list10);
                        zzy7 = zzhh.zzy(i10 << 3);
                        zzz = size * zzy7;
                        zzh = zzy3 + zzz;
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
                    int i32 = zzkt.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzy3 = zzkt.zzj(list11);
                        zzy7 = zzhh.zzy(i10 << 3);
                        zzz = size * zzy7;
                        zzh = zzy3 + zzz;
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
                    zze = zzkt.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzy10 = zzhh.zzy(zze);
                        zzy11 = zzhh.zzy(i10 << 3);
                        zzy9 = zzy11 + zzy10 + zze;
                        i9 += zzy9;
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
                    zze = zzkt.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzy10 = zzhh.zzy(zze);
                        zzy11 = zzhh.zzy(i10 << 3);
                        zzy9 = zzy11 + zzy10 + zze;
                        i9 += zzy9;
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
                    zze = zzkt.zzg((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzy10 = zzhh.zzy(zze);
                        zzy11 = zzhh.zzy(i10 << 3);
                        zzy9 = zzy11 + zzy10 + zze;
                        i9 += zzy9;
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
                    zze = zzkt.zzl((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzy10 = zzhh.zzy(zze);
                        zzy11 = zzhh.zzy(i10 << 3);
                        zzy9 = zzy11 + zzy10 + zze;
                        i9 += zzy9;
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
                    zze = zzkt.zzf((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzy10 = zzhh.zzy(zze);
                        zzy11 = zzhh.zzy(i10 << 3);
                        zzy9 = zzy11 + zzy10 + zze;
                        i9 += zzy9;
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
                    zze = zzkt.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzy10 = zzhh.zzy(zze);
                        zzy11 = zzhh.zzy(i10 << 3);
                        zzy9 = zzy11 + zzy10 + zze;
                        i9 += zzy9;
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
                    zze = zzkt.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzy10 = zzhh.zzy(zze);
                        zzy11 = zzhh.zzy(i10 << 3);
                        zzy9 = zzy11 + zzy10 + zze;
                        i9 += zzy9;
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
                    int i33 = zzkt.zza;
                    zze = list12.size();
                    if (zze > 0) {
                        zzy10 = zzhh.zzy(zze);
                        zzy11 = zzhh.zzy(i10 << 3);
                        zzy9 = zzy11 + zzy10 + zze;
                        i9 += zzy9;
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
                    zze = zzkt.zzk((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzy10 = zzhh.zzy(zze);
                        zzy11 = zzhh.zzy(i10 << 3);
                        zzy9 = zzy11 + zzy10 + zze;
                        i9 += zzy9;
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
                    zze = zzkt.zza((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzy10 = zzhh.zzy(zze);
                        zzy11 = zzhh.zzy(i10 << 3);
                        zzy9 = zzy11 + zzy10 + zze;
                        i9 += zzy9;
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
                    zze = zzkt.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzy10 = zzhh.zzy(zze);
                        zzy11 = zzhh.zzy(i10 << 3);
                        zzy9 = zzy11 + zzy10 + zze;
                        i9 += zzy9;
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
                    zze = zzkt.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzy10 = zzhh.zzy(zze);
                        zzy11 = zzhh.zzy(i10 << 3);
                        zzy9 = zzy11 + zzy10 + zze;
                        i9 += zzy9;
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
                    zze = zzkt.zzi((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzy10 = zzhh.zzy(zze);
                        zzy11 = zzhh.zzy(i10 << 3);
                        zzy9 = zzy11 + zzy10 + zze;
                        i9 += zzy9;
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
                    zze = zzkt.zzj((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzy10 = zzhh.zzy(zze);
                        zzy11 = zzhh.zzy(i10 << 3);
                        zzy9 = zzy11 + zzy10 + zze;
                        i9 += zzy9;
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
                    zzkr zzx2 = zzx(i8);
                    int i34 = zzkt.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (int i35 = 0; i35 < size6; i35++) {
                            i4 += zzhh.zzt(i10, (zzke) list13.get(i35), zzx2);
                        }
                    }
                    i9 += i4;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 50:
                    zzjy zzjyVar = (zzjy) unsafe.getObject(obj, j);
                    if (zzjyVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzjyVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 51:
                    if (zzR(obj, i10, i8)) {
                        zzy = zzhh.zzy(i10 << 3);
                        zzh = zzy + 8;
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
                    if (zzR(obj, i10, i8)) {
                        zzy2 = zzhh.zzy(i10 << 3);
                        zzh = zzy2 + 4;
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
                    if (zzR(obj, i10, i8)) {
                        zzz = zzhh.zzz(zzv(obj, j));
                        zzy3 = zzhh.zzy(i10 << 3);
                        zzh = zzy3 + zzz;
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
                    if (zzR(obj, i10, i8)) {
                        zzz = zzhh.zzz(zzv(obj, j));
                        zzy3 = zzhh.zzy(i10 << 3);
                        zzh = zzy3 + zzz;
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
                    if (zzR(obj, i10, i8)) {
                        zzz = zzhh.zzu(zzp(obj, j));
                        zzy3 = zzhh.zzy(i10 << 3);
                        zzh = zzy3 + zzz;
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
                    if (zzR(obj, i10, i8)) {
                        zzy = zzhh.zzy(i10 << 3);
                        zzh = zzy + 8;
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
                    if (zzR(obj, i10, i8)) {
                        zzy2 = zzhh.zzy(i10 << 3);
                        zzh = zzy2 + 4;
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
                    if (zzR(obj, i10, i8)) {
                        zzy4 = zzhh.zzy(i10 << 3);
                        zzh = zzy4 + 1;
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
                    if (zzR(obj, i10, i8)) {
                        int i36 = i10 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzgw) {
                            int i37 = zzhh.zzb;
                            int zzd6 = ((zzgw) object2).zzd();
                            zzy5 = zzhh.zzy(zzd6) + zzd6;
                            zzy6 = zzhh.zzy(i36);
                            zzh = zzy6 + zzy5;
                            i9 += zzh;
                            i8 += 3;
                            i6 = i;
                            i7 = i2;
                            z = false;
                            i5 = 1048575;
                        } else {
                            zzz = zzhh.zzx((String) object2);
                            zzy3 = zzhh.zzy(i36);
                            zzh = zzy3 + zzz;
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
                    if (zzR(obj, i10, i8)) {
                        zzh = zzkt.zzh(i10, unsafe.getObject(obj, j), zzx(i8));
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
                    if (zzR(obj, i10, i8)) {
                        zzgw zzgwVar2 = (zzgw) unsafe.getObject(obj, j);
                        int i38 = zzhh.zzb;
                        int zzd7 = zzgwVar2.zzd();
                        zzy5 = zzhh.zzy(zzd7) + zzd7;
                        zzy6 = zzhh.zzy(i10 << 3);
                        zzh = zzy6 + zzy5;
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
                    if (zzR(obj, i10, i8)) {
                        zzz = zzhh.zzy(zzp(obj, j));
                        zzy3 = zzhh.zzy(i10 << 3);
                        zzh = zzy3 + zzz;
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
                    if (zzR(obj, i10, i8)) {
                        zzz = zzhh.zzu(zzp(obj, j));
                        zzy3 = zzhh.zzy(i10 << 3);
                        zzh = zzy3 + zzz;
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
                    if (zzR(obj, i10, i8)) {
                        zzy2 = zzhh.zzy(i10 << 3);
                        zzh = zzy2 + 4;
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
                    if (zzR(obj, i10, i8)) {
                        zzy = zzhh.zzy(i10 << 3);
                        zzh = zzy + 8;
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
                    if (zzR(obj, i10, i8)) {
                        int zzp = zzp(obj, j);
                        zzy3 = zzhh.zzy(i10 << 3);
                        zzz = zzhh.zzy((zzp >> 31) ^ (zzp + zzp));
                        zzh = zzy3 + zzz;
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
                    if (zzR(obj, i10, i8)) {
                        long zzv = zzv(obj, j);
                        zzy3 = zzhh.zzy(i10 << 3);
                        zzz = zzhh.zzz((zzv >> 63) ^ (zzv + zzv));
                        zzh = zzy3 + zzz;
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
                    if (zzR(obj, i10, i8)) {
                        zzh = zzhh.zzt(i10, (zzke) unsafe.getObject(obj, j), zzx(i8));
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
        zzll zzllVar = this.zzn;
        int zza3 = i9 + zzllVar.zza(zzllVar.zzd(obj));
        if (!this.zzh) {
            return zza3;
        }
        zzij zzb2 = this.zzo.zzb(obj);
        int i39 = 0;
        for (int i40 = 0; i40 < zzb2.zza.zzb(); i40++) {
            Map.Entry zzg2 = zzb2.zza.zzg(i40);
            i39 += zzij.zza((zzii) zzg2.getKey(), zzg2.getValue());
        }
        for (Map.Entry entry2 : zzb2.zza.zzc()) {
            i39 += zzij.zza((zzii) entry2.getKey(), entry2.getValue());
        }
        return zza3 + i39;
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int zzu = zzu(i5);
            int[] iArr = this.zzc;
            int i6 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i7 = iArr[i5];
            long j = i6;
            int i8 = 37;
            switch (zzt) {
                case 0:
                    i = i4 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzlv.zza(obj, j));
                    byte[] bArr = zzjc.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i4 * 53;
                    floatToIntBits = Float.floatToIntBits(zzlv.zzb(obj, j));
                    i4 = i2 + floatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    doubleToLongBits = zzlv.zzd(obj, j);
                    byte[] bArr2 = zzjc.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i4 * 53;
                    doubleToLongBits = zzlv.zzd(obj, j);
                    byte[] bArr3 = zzjc.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i4 * 53;
                    floatToIntBits = zzlv.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    doubleToLongBits = zzlv.zzd(obj, j);
                    byte[] bArr4 = zzjc.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i4 * 53;
                    floatToIntBits = zzlv.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 7:
                    i2 = i4 * 53;
                    floatToIntBits = zzjc.zza(zzlv.zzw(obj, j));
                    i4 = i2 + floatToIntBits;
                    break;
                case 8:
                    i2 = i4 * 53;
                    floatToIntBits = ((String) zzlv.zzf(obj, j)).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 9:
                    i3 = i4 * 53;
                    Object zzf = zzlv.zzf(obj, j);
                    if (zzf != null) {
                        i8 = zzf.hashCode();
                    }
                    i4 = i3 + i8;
                    break;
                case 10:
                    i2 = i4 * 53;
                    floatToIntBits = zzlv.zzf(obj, j).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 11:
                    i2 = i4 * 53;
                    floatToIntBits = zzlv.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 12:
                    i2 = i4 * 53;
                    floatToIntBits = zzlv.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 13:
                    i2 = i4 * 53;
                    floatToIntBits = zzlv.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 14:
                    i = i4 * 53;
                    doubleToLongBits = zzlv.zzd(obj, j);
                    byte[] bArr5 = zzjc.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i4 * 53;
                    floatToIntBits = zzlv.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    doubleToLongBits = zzlv.zzd(obj, j);
                    byte[] bArr6 = zzjc.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i3 = i4 * 53;
                    Object zzf2 = zzlv.zzf(obj, j);
                    if (zzf2 != null) {
                        i8 = zzf2.hashCode();
                    }
                    i4 = i3 + i8;
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
                    i2 = i4 * 53;
                    floatToIntBits = zzlv.zzf(obj, j).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 50:
                    i2 = i4 * 53;
                    floatToIntBits = zzlv.zzf(obj, j).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 51:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zzjc.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zzjc.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zzjc.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzp(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zzjc.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzp(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzjc.zza(zzS(obj, j));
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = ((String) zzlv.zzf(obj, j)).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzlv.zzf(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzlv.zzf(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzp(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzp(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzp(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zzjc.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzp(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zzjc.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzlv.zzf(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i4 * 53) + this.zzn.zzd(obj).hashCode();
        return this.zzh ? (hashCode * 53) + this.zzo.zzb(obj).zza.hashCode() : hashCode;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0bc9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0bdb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x08f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x090e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzgj zzgjVar) {
        int i4;
        Unsafe unsafe;
        int i5;
        int i6;
        int i7;
        int i8;
        zzgj zzgjVar2;
        int i9;
        int i10;
        int i11;
        int zzh;
        zzie zzieVar;
        int i12;
        Object obj2;
        int i13;
        int i14;
        int i15;
        int i16;
        zzgj zzgjVar3;
        int i17;
        int i18;
        int zzi;
        Unsafe unsafe2;
        int i19;
        zzgj zzgjVar4;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int zza2;
        long j;
        int i30;
        int i31;
        int i32;
        int i33;
        zzgj zzgjVar5;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        zzgj zzgjVar6;
        int zzf;
        int zzi2;
        Object obj3;
        int i40;
        int zzk;
        int i41;
        zzkh<T> zzkhVar = this;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        int i42 = i2;
        int i43 = i3;
        zzgj zzgjVar7 = zzgjVar;
        int i44 = 3;
        zzD(obj);
        Unsafe unsafe3 = zzb;
        int i45 = -1;
        int i46 = i;
        int i47 = -1;
        int i48 = 0;
        int i49 = 1048575;
        int i50 = 0;
        int i51 = 0;
        while (true) {
            if (i46 < i42) {
                int i52 = i46 + 1;
                int i53 = bArr2[i46];
                if (i53 < 0) {
                    i52 = zzgk.zzj(i53, bArr2, i52, zzgjVar7);
                    i53 = zzgjVar7.zza;
                }
                int i54 = i53 >>> 3;
                i48 = i54 > i47 ? (i54 < zzkhVar.zze || i54 > zzkhVar.zzf) ? -1 : zzkhVar.zzs(i54, i48 / i44) : zzkhVar.zzq(i54);
                Object obj5 = null;
                if (i48 == i45) {
                    i4 = i43;
                    i7 = i53;
                    unsafe = unsafe3;
                    i8 = 0;
                    i5 = 1;
                    int i55 = i52;
                    zzgjVar2 = zzgjVar7;
                    i9 = i54;
                    i10 = i55;
                } else {
                    int i56 = i53 & 7;
                    int[] iArr = zzkhVar.zzc;
                    int i57 = iArr[i48 + 1];
                    int zzt = zzt(i57);
                    long j2 = i57 & 1048575;
                    int i58 = i53;
                    if (zzt <= 17) {
                        int i59 = iArr[i48 + 2];
                        int i60 = 1 << (i59 >>> 20);
                        int i61 = 1048575;
                        int i62 = i59 & 1048575;
                        if (i62 != i49) {
                            if (i49 != 1048575) {
                                unsafe3.putInt(obj4, i49, i50);
                                i61 = 1048575;
                            }
                            i13 = i62 == i61 ? 0 : unsafe3.getInt(obj4, i62);
                            i14 = i62;
                        } else {
                            i13 = i50;
                            i14 = i49;
                        }
                        switch (zzt) {
                            case 0:
                                zzgjVar3 = zzgjVar;
                                i16 = i54;
                                i15 = i58;
                                if (i56 == 1) {
                                    i17 = i52 + 8;
                                    i13 |= i60;
                                    zzlv.zzo(obj4, j2, Double.longBitsToDouble(zzgk.zzp(bArr2, i52)));
                                    i42 = i2;
                                    i43 = i3;
                                    zzgjVar7 = zzgjVar3;
                                    i51 = i15;
                                    i49 = i14;
                                    i47 = i16;
                                    i45 = -1;
                                    i46 = i17;
                                    i50 = i13;
                                    i44 = 3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i15;
                                    unsafe = unsafe3;
                                    i49 = i14;
                                    i9 = i16;
                                    i50 = i13;
                                    i10 = i52;
                                    zzgjVar2 = zzgjVar3;
                                    i8 = i48;
                                    i5 = 1;
                                    break;
                                }
                            case 1:
                                zzgjVar3 = zzgjVar;
                                i16 = i54;
                                i15 = i58;
                                if (i56 == 5) {
                                    i17 = i52 + 4;
                                    i13 |= i60;
                                    zzlv.zzp(obj4, j2, Float.intBitsToFloat(zzgk.zzb(bArr2, i52)));
                                    i42 = i2;
                                    i43 = i3;
                                    zzgjVar7 = zzgjVar3;
                                    i51 = i15;
                                    i49 = i14;
                                    i47 = i16;
                                    i45 = -1;
                                    i46 = i17;
                                    i50 = i13;
                                    i44 = 3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i15;
                                    unsafe = unsafe3;
                                    i49 = i14;
                                    i9 = i16;
                                    i50 = i13;
                                    i10 = i52;
                                    zzgjVar2 = zzgjVar3;
                                    i8 = i48;
                                    i5 = 1;
                                    break;
                                }
                            case 2:
                            case 3:
                                zzgjVar3 = zzgjVar;
                                i16 = i54;
                                i15 = i58;
                                if (i56 == 0) {
                                    int i63 = i13 | i60;
                                    int zzl = zzgk.zzl(bArr2, i52, zzgjVar3);
                                    unsafe3.putLong(obj, j2, zzgjVar3.zzb);
                                    i42 = i2;
                                    i43 = i3;
                                    zzgjVar7 = zzgjVar3;
                                    i51 = i15;
                                    i46 = zzl;
                                    i49 = i14;
                                    i44 = 3;
                                    i45 = -1;
                                    i50 = i63;
                                    i47 = i16;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i15;
                                    unsafe = unsafe3;
                                    i49 = i14;
                                    i9 = i16;
                                    i50 = i13;
                                    i10 = i52;
                                    zzgjVar2 = zzgjVar3;
                                    i8 = i48;
                                    i5 = 1;
                                    break;
                                }
                            case 4:
                            case 11:
                                zzgjVar3 = zzgjVar;
                                i16 = i54;
                                i15 = i58;
                                if (i56 == 0) {
                                    i18 = i13 | i60;
                                    zzi = zzgk.zzi(bArr2, i52, zzgjVar3);
                                    unsafe3.putInt(obj4, j2, zzgjVar3.zza);
                                    i42 = i2;
                                    i43 = i3;
                                    zzgjVar7 = zzgjVar3;
                                    i51 = i15;
                                    i49 = i14;
                                    i47 = i16;
                                    i45 = -1;
                                    i50 = i18;
                                    i46 = zzi;
                                    i44 = 3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i15;
                                    unsafe = unsafe3;
                                    i49 = i14;
                                    i9 = i16;
                                    i50 = i13;
                                    i10 = i52;
                                    zzgjVar2 = zzgjVar3;
                                    i8 = i48;
                                    i5 = 1;
                                    break;
                                }
                            case 5:
                            case 14:
                                zzgjVar3 = zzgjVar;
                                i16 = i54;
                                i15 = i58;
                                if (i56 == 1) {
                                    int i64 = i60 | i13;
                                    unsafe3.putLong(obj, j2, zzgk.zzp(bArr2, i52));
                                    i42 = i2;
                                    i43 = i3;
                                    zzgjVar7 = zzgjVar3;
                                    i46 = i52 + 8;
                                    i51 = i15;
                                    i49 = i14;
                                    i47 = i16;
                                    i44 = 3;
                                    i50 = i64;
                                    i45 = -1;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i15;
                                    unsafe = unsafe3;
                                    i49 = i14;
                                    i9 = i16;
                                    i50 = i13;
                                    i10 = i52;
                                    zzgjVar2 = zzgjVar3;
                                    i8 = i48;
                                    i5 = 1;
                                    break;
                                }
                            case 6:
                            case 13:
                                zzgjVar3 = zzgjVar;
                                i16 = i54;
                                i15 = i58;
                                if (i56 == 5) {
                                    i17 = i52 + 4;
                                    i13 |= i60;
                                    unsafe3.putInt(obj4, j2, zzgk.zzb(bArr2, i52));
                                    i42 = i2;
                                    i43 = i3;
                                    zzgjVar7 = zzgjVar3;
                                    i51 = i15;
                                    i49 = i14;
                                    i47 = i16;
                                    i45 = -1;
                                    i46 = i17;
                                    i50 = i13;
                                    i44 = 3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i15;
                                    unsafe = unsafe3;
                                    i49 = i14;
                                    i9 = i16;
                                    i50 = i13;
                                    i10 = i52;
                                    zzgjVar2 = zzgjVar3;
                                    i8 = i48;
                                    i5 = 1;
                                    break;
                                }
                            case 7:
                                zzgjVar3 = zzgjVar;
                                i16 = i54;
                                i15 = i58;
                                if (i56 == 0) {
                                    i18 = i13 | i60;
                                    zzi = zzgk.zzl(bArr2, i52, zzgjVar3);
                                    zzlv.zzm(obj4, j2, zzgjVar3.zzb != 0);
                                    i42 = i2;
                                    i43 = i3;
                                    zzgjVar7 = zzgjVar3;
                                    i51 = i15;
                                    i49 = i14;
                                    i47 = i16;
                                    i45 = -1;
                                    i50 = i18;
                                    i46 = zzi;
                                    i44 = 3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i15;
                                    unsafe = unsafe3;
                                    i49 = i14;
                                    i9 = i16;
                                    i50 = i13;
                                    i10 = i52;
                                    zzgjVar2 = zzgjVar3;
                                    i8 = i48;
                                    i5 = 1;
                                    break;
                                }
                            case 8:
                                zzgjVar3 = zzgjVar;
                                i16 = i54;
                                i15 = i58;
                                if (i56 == 2) {
                                    if (zzM(i57)) {
                                        i17 = zzgk.zzi(bArr2, i52, zzgjVar3);
                                        int i65 = zzgjVar3.zza;
                                        if (i65 < 0) {
                                            throw zzje.zzf();
                                        }
                                        i13 |= i60;
                                        if (i65 == 0) {
                                            zzgjVar3.zzc = "";
                                        } else {
                                            zzgjVar3.zzc = zzma.zzd(bArr2, i17, i65);
                                            i17 += i65;
                                        }
                                    } else {
                                        i13 |= i60;
                                        i17 = zzgk.zzg(bArr2, i52, zzgjVar3);
                                    }
                                    unsafe3.putObject(obj4, j2, zzgjVar3.zzc);
                                    i42 = i2;
                                    i43 = i3;
                                    zzgjVar7 = zzgjVar3;
                                    i51 = i15;
                                    i49 = i14;
                                    i47 = i16;
                                    i45 = -1;
                                    i46 = i17;
                                    i50 = i13;
                                    i44 = 3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i15;
                                    unsafe = unsafe3;
                                    i49 = i14;
                                    i9 = i16;
                                    i50 = i13;
                                    i10 = i52;
                                    zzgjVar2 = zzgjVar3;
                                    i8 = i48;
                                    i5 = 1;
                                    break;
                                }
                            case 9:
                                zzgjVar3 = zzgjVar;
                                i16 = i54;
                                unsafe2 = unsafe3;
                                i15 = i58;
                                if (i56 == 2) {
                                    int i66 = i13 | i60;
                                    Object zzA = zzkhVar.zzA(obj4, i48);
                                    unsafe3 = unsafe2;
                                    i42 = i2;
                                    int zzn = zzgk.zzn(zzA, zzkhVar.zzx(i48), bArr, i52, i42, zzgjVar);
                                    zzkhVar.zzJ(obj4, i48, zzA);
                                    i43 = i3;
                                    zzgjVar7 = zzgjVar3;
                                    i51 = i15;
                                    i49 = i14;
                                    i44 = 3;
                                    i45 = -1;
                                    i46 = zzn;
                                    i50 = i66;
                                    i47 = i16;
                                    break;
                                }
                                unsafe3 = unsafe2;
                                i4 = i3;
                                i7 = i15;
                                unsafe = unsafe3;
                                i49 = i14;
                                i9 = i16;
                                i50 = i13;
                                i10 = i52;
                                zzgjVar2 = zzgjVar3;
                                i8 = i48;
                                i5 = 1;
                                break;
                            case 10:
                                zzgjVar3 = zzgjVar;
                                i16 = i54;
                                unsafe2 = unsafe3;
                                i15 = i58;
                                if (i56 == 2) {
                                    int i67 = i13 | i60;
                                    bArr2 = bArr;
                                    int zza3 = zzgk.zza(bArr2, i52, zzgjVar3);
                                    unsafe2.putObject(obj4, j2, zzgjVar3.zzc);
                                    i42 = i2;
                                    i43 = i3;
                                    unsafe3 = unsafe2;
                                    zzgjVar7 = zzgjVar3;
                                    i51 = i15;
                                    i49 = i14;
                                    i47 = i16;
                                    i45 = -1;
                                    i50 = i67;
                                    i46 = zza3;
                                    i44 = 3;
                                    break;
                                } else {
                                    bArr2 = bArr;
                                    unsafe3 = unsafe2;
                                    i4 = i3;
                                    i7 = i15;
                                    unsafe = unsafe3;
                                    i49 = i14;
                                    i9 = i16;
                                    i50 = i13;
                                    i10 = i52;
                                    zzgjVar2 = zzgjVar3;
                                    i8 = i48;
                                    i5 = 1;
                                    break;
                                }
                            case 12:
                                zzgjVar3 = zzgjVar;
                                i16 = i54;
                                unsafe2 = unsafe3;
                                i15 = i58;
                                if (i56 == 0) {
                                    i17 = zzgk.zzi(bArr2, i52, zzgjVar3);
                                    int i68 = zzgjVar3.zza;
                                    zzix zzw = zzkhVar.zzw(i48);
                                    if ((i57 & TLObject.FLAG_31) == 0 || zzw == null || zzw.zza(i68)) {
                                        i13 |= i60;
                                        unsafe2.putInt(obj4, j2, i68);
                                    } else {
                                        zzd(obj).zzj(i15, Long.valueOf(i68));
                                    }
                                    bArr2 = bArr;
                                    i42 = i2;
                                    i43 = i3;
                                    unsafe3 = unsafe2;
                                    zzgjVar7 = zzgjVar3;
                                    i51 = i15;
                                    i49 = i14;
                                    i47 = i16;
                                    i45 = -1;
                                    i46 = i17;
                                    i50 = i13;
                                    i44 = 3;
                                    break;
                                } else {
                                    bArr2 = bArr;
                                    unsafe3 = unsafe2;
                                    i4 = i3;
                                    i7 = i15;
                                    unsafe = unsafe3;
                                    i49 = i14;
                                    i9 = i16;
                                    i50 = i13;
                                    i10 = i52;
                                    zzgjVar2 = zzgjVar3;
                                    i8 = i48;
                                    i5 = 1;
                                    break;
                                }
                            case 15:
                                zzgjVar3 = zzgjVar;
                                i16 = i54;
                                i15 = i58;
                                Unsafe unsafe4 = unsafe3;
                                if (i56 == 0) {
                                    i18 = i13 | i60;
                                    zzi = zzgk.zzi(bArr2, i52, zzgjVar3);
                                    unsafe4.putInt(obj4, j2, zzhc.zzF(zzgjVar3.zza));
                                    i42 = i2;
                                    i43 = i3;
                                    zzgjVar7 = zzgjVar3;
                                    unsafe3 = unsafe4;
                                    i51 = i15;
                                    i49 = i14;
                                    i47 = i16;
                                    i45 = -1;
                                    i50 = i18;
                                    i46 = zzi;
                                    i44 = 3;
                                    break;
                                } else {
                                    unsafe3 = unsafe4;
                                    i4 = i3;
                                    i7 = i15;
                                    unsafe = unsafe3;
                                    i49 = i14;
                                    i9 = i16;
                                    i50 = i13;
                                    i10 = i52;
                                    zzgjVar2 = zzgjVar3;
                                    i8 = i48;
                                    i5 = 1;
                                    break;
                                }
                            case 16:
                                i15 = i58;
                                Unsafe unsafe5 = unsafe3;
                                if (i56 == 0) {
                                    int i69 = i13 | i60;
                                    int zzl2 = zzgk.zzl(bArr2, i52, zzgjVar);
                                    unsafe5.putLong(obj, j2, zzhc.zzG(zzgjVar.zzb));
                                    unsafe3 = unsafe5;
                                    i42 = i2;
                                    i43 = i3;
                                    zzgjVar7 = zzgjVar;
                                    i51 = i15;
                                    i47 = i54;
                                    i44 = 3;
                                    i45 = -1;
                                    int i70 = i14;
                                    i50 = i69;
                                    i46 = zzl2;
                                    i49 = i70;
                                    break;
                                } else {
                                    i16 = i54;
                                    unsafe3 = unsafe5;
                                    zzgjVar3 = zzgjVar;
                                    i4 = i3;
                                    i7 = i15;
                                    unsafe = unsafe3;
                                    i49 = i14;
                                    i9 = i16;
                                    i50 = i13;
                                    i10 = i52;
                                    zzgjVar2 = zzgjVar3;
                                    i8 = i48;
                                    i5 = 1;
                                    break;
                                }
                            default:
                                if (i56 == 3) {
                                    int i71 = i13 | i60;
                                    Object zzA2 = zzkhVar.zzA(obj4, i48);
                                    i46 = zzgk.zzm(zzA2, zzkhVar.zzx(i48), bArr, i52, i2, (i54 << 3) | 4, zzgjVar);
                                    zzkhVar.zzJ(obj4, i48, zzA2);
                                    unsafe3 = unsafe3;
                                    zzgjVar7 = zzgjVar;
                                    i47 = i54;
                                    i51 = i58;
                                    i48 = i48;
                                    i49 = i14;
                                    i44 = 3;
                                    i45 = -1;
                                    i42 = i2;
                                    i43 = i3;
                                    i50 = i71;
                                    break;
                                } else {
                                    zzgjVar3 = zzgjVar;
                                    i16 = i54;
                                    i15 = i58;
                                    i4 = i3;
                                    i7 = i15;
                                    unsafe = unsafe3;
                                    i49 = i14;
                                    i9 = i16;
                                    i50 = i13;
                                    i10 = i52;
                                    zzgjVar2 = zzgjVar3;
                                    i8 = i48;
                                    i5 = 1;
                                    break;
                                }
                        }
                    } else {
                        zzgj zzgjVar8 = zzgjVar7;
                        if (zzt != 27) {
                            i19 = i49;
                            Unsafe unsafe6 = unsafe3;
                            if (zzt <= 49) {
                                long j3 = i57;
                                Unsafe unsafe7 = zzb;
                                zzjb zzjbVar = (zzjb) unsafe7.getObject(obj4, j2);
                                if (zzjbVar.zzc()) {
                                    j = j3;
                                } else {
                                    int size = zzjbVar.size();
                                    if (size == 0) {
                                        j = j3;
                                        i41 = 10;
                                    } else {
                                        j = j3;
                                        i41 = size + size;
                                    }
                                    zzjbVar = zzjbVar.zzd(i41);
                                    unsafe7.putObject(obj4, j2, zzjbVar);
                                }
                                zzjb zzjbVar2 = zzjbVar;
                                switch (zzt) {
                                    case 18:
                                    case 35:
                                        unsafe = unsafe6;
                                        i30 = i52;
                                        i31 = i48;
                                        i32 = i54;
                                        i33 = i58;
                                        zzgjVar5 = zzgjVar8;
                                        i34 = i2;
                                        if (i56 == 2) {
                                            zzhy zzhyVar = (zzhy) zzjbVar2;
                                            i35 = zzgk.zzi(bArr2, i30, zzgjVar5);
                                            int i72 = zzgjVar5.zza + i35;
                                            while (i35 < i72) {
                                                zzhyVar.zze(Double.longBitsToDouble(zzgk.zzp(bArr2, i35)));
                                                i35 += 8;
                                            }
                                            if (i35 != i72) {
                                                throw zzje.zzj();
                                            }
                                        } else {
                                            if (i56 == 1) {
                                                i35 = i30 + 8;
                                                zzhy zzhyVar2 = (zzhy) zzjbVar2;
                                                zzhyVar2.zze(Double.longBitsToDouble(zzgk.zzp(bArr2, i30)));
                                                while (i35 < i34) {
                                                    int zzi3 = zzgk.zzi(bArr2, i35, zzgjVar5);
                                                    if (i33 == zzgjVar5.zza) {
                                                        zzhyVar2.zze(Double.longBitsToDouble(zzgk.zzp(bArr2, zzi3)));
                                                        i35 = zzi3 + 8;
                                                    }
                                                }
                                            }
                                            i35 = i30;
                                        }
                                        zzkhVar = this;
                                        if (i35 == i30) {
                                            obj4 = obj;
                                            i43 = i3;
                                            i47 = i32;
                                            i42 = i34;
                                            i51 = i33;
                                            i49 = i19;
                                            unsafe3 = unsafe;
                                            i44 = 3;
                                            i45 = -1;
                                            i46 = i35;
                                            zzgj zzgjVar9 = zzgjVar5;
                                            i48 = i31;
                                            zzgjVar7 = zzgjVar9;
                                            break;
                                        } else {
                                            obj4 = obj;
                                            i4 = i3;
                                            i10 = i35;
                                            i8 = i31;
                                            i9 = i32;
                                            zzgjVar2 = zzgjVar5;
                                            i7 = i33;
                                            i49 = i19;
                                            i5 = 1;
                                            break;
                                        }
                                    case 19:
                                    case 36:
                                        unsafe = unsafe6;
                                        i30 = i52;
                                        i31 = i48;
                                        i32 = i54;
                                        i33 = i58;
                                        zzgjVar5 = zzgjVar8;
                                        i34 = i2;
                                        if (i56 == 2) {
                                            zzil zzilVar = (zzil) zzjbVar2;
                                            i35 = zzgk.zzi(bArr2, i30, zzgjVar5);
                                            int i73 = zzgjVar5.zza + i35;
                                            while (i35 < i73) {
                                                zzilVar.zze(Float.intBitsToFloat(zzgk.zzb(bArr2, i35)));
                                                i35 += 4;
                                            }
                                            if (i35 != i73) {
                                                throw zzje.zzj();
                                            }
                                        } else {
                                            if (i56 == 5) {
                                                i35 = i30 + 4;
                                                zzil zzilVar2 = (zzil) zzjbVar2;
                                                zzilVar2.zze(Float.intBitsToFloat(zzgk.zzb(bArr2, i30)));
                                                while (i35 < i34) {
                                                    int zzi4 = zzgk.zzi(bArr2, i35, zzgjVar5);
                                                    if (i33 == zzgjVar5.zza) {
                                                        zzilVar2.zze(Float.intBitsToFloat(zzgk.zzb(bArr2, zzi4)));
                                                        i35 = zzi4 + 4;
                                                    }
                                                }
                                            }
                                            i35 = i30;
                                        }
                                        zzkhVar = this;
                                        if (i35 == i30) {
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        unsafe = unsafe6;
                                        i30 = i52;
                                        i31 = i48;
                                        i32 = i54;
                                        i33 = i58;
                                        zzgjVar5 = zzgjVar8;
                                        i34 = i2;
                                        if (i56 == 2) {
                                            zzjt zzjtVar = (zzjt) zzjbVar2;
                                            i35 = zzgk.zzi(bArr2, i30, zzgjVar5);
                                            int i74 = zzgjVar5.zza + i35;
                                            while (i35 < i74) {
                                                i35 = zzgk.zzl(bArr2, i35, zzgjVar5);
                                                zzjtVar.zzg(zzgjVar5.zzb);
                                            }
                                            if (i35 != i74) {
                                                throw zzje.zzj();
                                            }
                                        } else {
                                            if (i56 == 0) {
                                                zzjt zzjtVar2 = (zzjt) zzjbVar2;
                                                i35 = zzgk.zzl(bArr2, i30, zzgjVar5);
                                                zzjtVar2.zzg(zzgjVar5.zzb);
                                                while (i35 < i34) {
                                                    int zzi5 = zzgk.zzi(bArr2, i35, zzgjVar5);
                                                    if (i33 == zzgjVar5.zza) {
                                                        i35 = zzgk.zzl(bArr2, zzi5, zzgjVar5);
                                                        zzjtVar2.zzg(zzgjVar5.zzb);
                                                    }
                                                }
                                            }
                                            i35 = i30;
                                        }
                                        zzkhVar = this;
                                        if (i35 == i30) {
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        unsafe = unsafe6;
                                        i36 = i2;
                                        i30 = i52;
                                        i37 = i48;
                                        i38 = i54;
                                        i39 = i58;
                                        zzgjVar6 = zzgjVar8;
                                        if (i56 == 2) {
                                            zzf = zzgk.zzf(bArr2, i30, zzjbVar2, zzgjVar6);
                                            zzgjVar5 = zzgjVar6;
                                            i33 = i39;
                                            i32 = i38;
                                            i31 = i37;
                                            i35 = zzf;
                                            i34 = i36;
                                            zzkhVar = this;
                                            if (i35 == i30) {
                                            }
                                        } else if (i56 == 0) {
                                            i34 = i36;
                                            zzgjVar5 = zzgjVar6;
                                            i33 = i39;
                                            i35 = zzgk.zzk(i39, bArr, i30, i2, zzjbVar2, zzgjVar);
                                            i32 = i38;
                                            i31 = i37;
                                            zzkhVar = this;
                                            if (i35 == i30) {
                                            }
                                        } else {
                                            i34 = i36;
                                            zzgjVar5 = zzgjVar6;
                                            i33 = i39;
                                            i32 = i38;
                                            i31 = i37;
                                            i35 = i30;
                                            zzkhVar = this;
                                            if (i35 == i30) {
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        unsafe = unsafe6;
                                        i36 = i2;
                                        i30 = i52;
                                        i37 = i48;
                                        i38 = i54;
                                        i39 = i58;
                                        zzgjVar6 = zzgjVar8;
                                        if (i56 == 2) {
                                            zzjt zzjtVar3 = (zzjt) zzjbVar2;
                                            zzi2 = zzgk.zzi(bArr2, i30, zzgjVar6);
                                            int i75 = zzgjVar6.zza + zzi2;
                                            while (zzi2 < i75) {
                                                zzjtVar3.zzg(zzgk.zzp(bArr2, zzi2));
                                                zzi2 += 8;
                                            }
                                            if (zzi2 != i75) {
                                                throw zzje.zzj();
                                            }
                                            zzgjVar5 = zzgjVar6;
                                            i33 = i39;
                                            i32 = i38;
                                            i31 = i37;
                                            i35 = zzi2;
                                            i34 = i36;
                                            zzkhVar = this;
                                            if (i35 == i30) {
                                            }
                                        } else if (i56 == 1) {
                                            zzf = i30 + 8;
                                            zzjt zzjtVar4 = (zzjt) zzjbVar2;
                                            zzjtVar4.zzg(zzgk.zzp(bArr2, i30));
                                            while (zzf < i36) {
                                                int zzi6 = zzgk.zzi(bArr2, zzf, zzgjVar6);
                                                if (i39 == zzgjVar6.zza) {
                                                    zzjtVar4.zzg(zzgk.zzp(bArr2, zzi6));
                                                    zzf = zzi6 + 8;
                                                } else {
                                                    zzgjVar5 = zzgjVar6;
                                                    i33 = i39;
                                                    i32 = i38;
                                                    i31 = i37;
                                                    i35 = zzf;
                                                    i34 = i36;
                                                    zzkhVar = this;
                                                    if (i35 == i30) {
                                                    }
                                                }
                                            }
                                            zzgjVar5 = zzgjVar6;
                                            i33 = i39;
                                            i32 = i38;
                                            i31 = i37;
                                            i35 = zzf;
                                            i34 = i36;
                                            zzkhVar = this;
                                            if (i35 == i30) {
                                            }
                                        } else {
                                            i34 = i36;
                                            zzgjVar5 = zzgjVar6;
                                            i33 = i39;
                                            i32 = i38;
                                            i31 = i37;
                                            i35 = i30;
                                            zzkhVar = this;
                                            if (i35 == i30) {
                                            }
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        unsafe = unsafe6;
                                        i36 = i2;
                                        i30 = i52;
                                        i37 = i48;
                                        i38 = i54;
                                        i39 = i58;
                                        zzgjVar6 = zzgjVar8;
                                        if (i56 == 2) {
                                            zziu zziuVar = (zziu) zzjbVar2;
                                            zzi2 = zzgk.zzi(bArr2, i30, zzgjVar6);
                                            int i76 = zzgjVar6.zza + zzi2;
                                            while (zzi2 < i76) {
                                                zziuVar.zzg(zzgk.zzb(bArr2, zzi2));
                                                zzi2 += 4;
                                            }
                                            if (zzi2 != i76) {
                                                throw zzje.zzj();
                                            }
                                        } else {
                                            if (i56 == 5) {
                                                zzi2 = i30 + 4;
                                                zziu zziuVar2 = (zziu) zzjbVar2;
                                                zziuVar2.zzg(zzgk.zzb(bArr2, i30));
                                                while (zzi2 < i36) {
                                                    int zzi7 = zzgk.zzi(bArr2, zzi2, zzgjVar6);
                                                    if (i39 == zzgjVar6.zza) {
                                                        zziuVar2.zzg(zzgk.zzb(bArr2, zzi7));
                                                        zzi2 = zzi7 + 4;
                                                    }
                                                }
                                            }
                                            i34 = i36;
                                            zzgjVar5 = zzgjVar6;
                                            i33 = i39;
                                            i32 = i38;
                                            i31 = i37;
                                            i35 = i30;
                                            zzkhVar = this;
                                            if (i35 == i30) {
                                            }
                                        }
                                        zzgjVar5 = zzgjVar6;
                                        i33 = i39;
                                        i32 = i38;
                                        i31 = i37;
                                        i35 = zzi2;
                                        i34 = i36;
                                        zzkhVar = this;
                                        if (i35 == i30) {
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        unsafe = unsafe6;
                                        i36 = i2;
                                        i30 = i52;
                                        i37 = i48;
                                        i38 = i54;
                                        i39 = i58;
                                        zzgjVar6 = zzgjVar8;
                                        if (i56 == 2) {
                                            zzgl zzglVar = (zzgl) zzjbVar2;
                                            zzi2 = zzgk.zzi(bArr2, i30, zzgjVar6);
                                            int i77 = zzgjVar6.zza + zzi2;
                                            while (zzi2 < i77) {
                                                zzi2 = zzgk.zzl(bArr2, zzi2, zzgjVar6);
                                                zzglVar.zze(zzgjVar6.zzb != 0);
                                            }
                                            if (zzi2 != i77) {
                                                throw zzje.zzj();
                                            }
                                        } else {
                                            if (i56 == 0) {
                                                zzgl zzglVar2 = (zzgl) zzjbVar2;
                                                zzi2 = zzgk.zzl(bArr2, i30, zzgjVar6);
                                                zzglVar2.zze(zzgjVar6.zzb != 0);
                                                while (zzi2 < i36) {
                                                    int zzi8 = zzgk.zzi(bArr2, zzi2, zzgjVar6);
                                                    if (i39 == zzgjVar6.zza) {
                                                        zzi2 = zzgk.zzl(bArr2, zzi8, zzgjVar6);
                                                        zzglVar2.zze(zzgjVar6.zzb != 0);
                                                    }
                                                }
                                            }
                                            i34 = i36;
                                            zzgjVar5 = zzgjVar6;
                                            i33 = i39;
                                            i32 = i38;
                                            i31 = i37;
                                            i35 = i30;
                                            zzkhVar = this;
                                            if (i35 == i30) {
                                            }
                                        }
                                        zzgjVar5 = zzgjVar6;
                                        i33 = i39;
                                        i32 = i38;
                                        i31 = i37;
                                        i35 = zzi2;
                                        i34 = i36;
                                        zzkhVar = this;
                                        if (i35 == i30) {
                                        }
                                        break;
                                    case 26:
                                        unsafe = unsafe6;
                                        i36 = i2;
                                        i30 = i52;
                                        i37 = i48;
                                        i38 = i54;
                                        i39 = i58;
                                        zzgjVar6 = zzgjVar8;
                                        if (i56 == 2) {
                                            if ((j & 536870912) == 0) {
                                                zzi2 = zzgk.zzi(bArr2, i30, zzgjVar6);
                                                int i78 = zzgjVar6.zza;
                                                if (i78 < 0) {
                                                    throw zzje.zzf();
                                                }
                                                if (i78 == 0) {
                                                    obj3 = "";
                                                    zzjbVar2.add(obj3);
                                                } else {
                                                    obj3 = "";
                                                    zzjbVar2.add(new String(bArr2, zzi2, i78, zzjc.zzb));
                                                    zzi2 += i78;
                                                }
                                                while (zzi2 < i36) {
                                                    int zzi9 = zzgk.zzi(bArr2, zzi2, zzgjVar6);
                                                    if (i39 == zzgjVar6.zza) {
                                                        zzi2 = zzgk.zzi(bArr2, zzi9, zzgjVar6);
                                                        int i79 = zzgjVar6.zza;
                                                        if (i79 < 0) {
                                                            throw zzje.zzf();
                                                        }
                                                        if (i79 == 0) {
                                                            zzjbVar2.add(obj3);
                                                        } else {
                                                            zzjbVar2.add(new String(bArr2, zzi2, i79, zzjc.zzb));
                                                            zzi2 += i79;
                                                        }
                                                    }
                                                }
                                            } else {
                                                zzi2 = zzgk.zzi(bArr2, i30, zzgjVar6);
                                                int i80 = zzgjVar6.zza;
                                                if (i80 < 0) {
                                                    throw zzje.zzf();
                                                }
                                                if (i80 == 0) {
                                                    zzjbVar2.add("");
                                                } else {
                                                    int i81 = zzi2 + i80;
                                                    if (!zzma.zzf(bArr2, zzi2, i81)) {
                                                        throw zzje.zzd();
                                                    }
                                                    zzjbVar2.add(new String(bArr2, zzi2, i80, zzjc.zzb));
                                                    zzi2 = i81;
                                                }
                                                while (zzi2 < i36) {
                                                    int zzi10 = zzgk.zzi(bArr2, zzi2, zzgjVar6);
                                                    if (i39 == zzgjVar6.zza) {
                                                        zzi2 = zzgk.zzi(bArr2, zzi10, zzgjVar6);
                                                        int i82 = zzgjVar6.zza;
                                                        if (i82 < 0) {
                                                            throw zzje.zzf();
                                                        }
                                                        if (i82 == 0) {
                                                            zzjbVar2.add("");
                                                        } else {
                                                            int i83 = zzi2 + i82;
                                                            if (!zzma.zzf(bArr2, zzi2, i83)) {
                                                                throw zzje.zzd();
                                                            }
                                                            zzjbVar2.add(new String(bArr2, zzi2, i82, zzjc.zzb));
                                                            zzi2 = i83;
                                                        }
                                                    }
                                                }
                                            }
                                            zzgjVar5 = zzgjVar6;
                                            i33 = i39;
                                            i32 = i38;
                                            i31 = i37;
                                            i35 = zzi2;
                                            i34 = i36;
                                            zzkhVar = this;
                                            if (i35 == i30) {
                                            }
                                        }
                                        i34 = i36;
                                        zzgjVar5 = zzgjVar6;
                                        i33 = i39;
                                        i32 = i38;
                                        i31 = i37;
                                        i35 = i30;
                                        zzkhVar = this;
                                        if (i35 == i30) {
                                        }
                                        break;
                                    case 27:
                                        unsafe = unsafe6;
                                        i30 = i52;
                                        if (i56 == 2) {
                                            i37 = i48;
                                            i38 = i54;
                                            i39 = i58;
                                            zzgjVar6 = zzgjVar8;
                                            i36 = i2;
                                            zzi2 = zzgk.zze(zzkhVar.zzx(i48), i58, bArr, i30, i2, zzjbVar2, zzgjVar);
                                            zzgjVar5 = zzgjVar6;
                                            i33 = i39;
                                            i32 = i38;
                                            i31 = i37;
                                            i35 = zzi2;
                                            i34 = i36;
                                            zzkhVar = this;
                                            if (i35 == i30) {
                                            }
                                        } else {
                                            i31 = i48;
                                            i32 = i54;
                                            zzgjVar5 = zzgjVar8;
                                            i34 = i2;
                                            i33 = i58;
                                            i35 = i30;
                                            zzkhVar = this;
                                            if (i35 == i30) {
                                            }
                                        }
                                        break;
                                    case 28:
                                        unsafe = unsafe6;
                                        i40 = i2;
                                        i30 = i52;
                                        if (i56 == 2) {
                                            i35 = zzgk.zzi(bArr2, i30, zzgjVar8);
                                            int i84 = zzgjVar8.zza;
                                            if (i84 < 0) {
                                                throw zzje.zzf();
                                            }
                                            if (i84 > bArr2.length - i35) {
                                                throw zzje.zzj();
                                            }
                                            if (i84 == 0) {
                                                zzjbVar2.add(zzgw.zzb);
                                            } else {
                                                zzjbVar2.add(zzgw.zzm(bArr2, i35, i84));
                                                i35 += i84;
                                            }
                                            while (i35 < i40) {
                                                int zzi11 = zzgk.zzi(bArr2, i35, zzgjVar8);
                                                if (i58 == zzgjVar8.zza) {
                                                    i35 = zzgk.zzi(bArr2, zzi11, zzgjVar8);
                                                    int i85 = zzgjVar8.zza;
                                                    if (i85 < 0) {
                                                        throw zzje.zzf();
                                                    }
                                                    if (i85 > bArr2.length - i35) {
                                                        throw zzje.zzj();
                                                    }
                                                    if (i85 == 0) {
                                                        zzjbVar2.add(zzgw.zzb);
                                                    } else {
                                                        zzjbVar2.add(zzgw.zzm(bArr2, i35, i85));
                                                        i35 += i85;
                                                    }
                                                } else {
                                                    i31 = i48;
                                                    i32 = i54;
                                                    zzgjVar5 = zzgjVar8;
                                                    i34 = i40;
                                                    i33 = i58;
                                                    zzkhVar = this;
                                                    if (i35 == i30) {
                                                    }
                                                }
                                            }
                                            i31 = i48;
                                            i32 = i54;
                                            zzgjVar5 = zzgjVar8;
                                            i34 = i40;
                                            i33 = i58;
                                            zzkhVar = this;
                                            if (i35 == i30) {
                                            }
                                        }
                                        i31 = i48;
                                        i32 = i54;
                                        zzgjVar5 = zzgjVar8;
                                        i34 = i40;
                                        i33 = i58;
                                        i35 = i30;
                                        zzkhVar = this;
                                        if (i35 == i30) {
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        unsafe = unsafe6;
                                        i40 = i2;
                                        i30 = i52;
                                        if (i56 == 2) {
                                            zzk = zzgk.zzf(bArr2, i30, zzjbVar2, zzgjVar8);
                                        } else {
                                            if (i56 == 0) {
                                                zzk = zzgk.zzk(i58, bArr, i30, i2, zzjbVar2, zzgjVar);
                                            }
                                            i31 = i48;
                                            i32 = i54;
                                            zzgjVar5 = zzgjVar8;
                                            i34 = i40;
                                            i33 = i58;
                                            i35 = i30;
                                            zzkhVar = this;
                                            if (i35 == i30) {
                                            }
                                        }
                                        int i86 = zzk;
                                        zzkt.zzo(obj, i54, zzjbVar2, zzkhVar.zzw(i48), null, zzkhVar.zzn);
                                        i31 = i48;
                                        i35 = i86;
                                        i32 = i54;
                                        zzgjVar5 = zzgjVar8;
                                        i34 = i40;
                                        i33 = i58;
                                        zzkhVar = this;
                                        if (i35 == i30) {
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        unsafe = unsafe6;
                                        i40 = i2;
                                        i30 = i52;
                                        if (i56 == 2) {
                                            zziu zziuVar3 = (zziu) zzjbVar2;
                                            i35 = zzgk.zzi(bArr2, i30, zzgjVar8);
                                            int i87 = zzgjVar8.zza + i35;
                                            while (i35 < i87) {
                                                i35 = zzgk.zzi(bArr2, i35, zzgjVar8);
                                                zziuVar3.zzg(zzhc.zzF(zzgjVar8.zza));
                                            }
                                            if (i35 != i87) {
                                                throw zzje.zzj();
                                            }
                                        } else {
                                            if (i56 == 0) {
                                                zziu zziuVar4 = (zziu) zzjbVar2;
                                                i35 = zzgk.zzi(bArr2, i30, zzgjVar8);
                                                zziuVar4.zzg(zzhc.zzF(zzgjVar8.zza));
                                                while (i35 < i40) {
                                                    int zzi12 = zzgk.zzi(bArr2, i35, zzgjVar8);
                                                    if (i58 == zzgjVar8.zza) {
                                                        i35 = zzgk.zzi(bArr2, zzi12, zzgjVar8);
                                                        zziuVar4.zzg(zzhc.zzF(zzgjVar8.zza));
                                                    }
                                                }
                                            }
                                            i31 = i48;
                                            i32 = i54;
                                            zzgjVar5 = zzgjVar8;
                                            i34 = i40;
                                            i33 = i58;
                                            i35 = i30;
                                            zzkhVar = this;
                                            if (i35 == i30) {
                                            }
                                        }
                                        i31 = i48;
                                        i32 = i54;
                                        zzgjVar5 = zzgjVar8;
                                        i34 = i40;
                                        i33 = i58;
                                        zzkhVar = this;
                                        if (i35 == i30) {
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        unsafe = unsafe6;
                                        i40 = i2;
                                        i30 = i52;
                                        if (i56 == 2) {
                                            zzjt zzjtVar5 = (zzjt) zzjbVar2;
                                            i35 = zzgk.zzi(bArr2, i30, zzgjVar8);
                                            int i88 = zzgjVar8.zza + i35;
                                            while (i35 < i88) {
                                                i35 = zzgk.zzl(bArr2, i35, zzgjVar8);
                                                zzjtVar5.zzg(zzhc.zzG(zzgjVar8.zzb));
                                            }
                                            if (i35 != i88) {
                                                throw zzje.zzj();
                                            }
                                        } else {
                                            if (i56 == 0) {
                                                zzjt zzjtVar6 = (zzjt) zzjbVar2;
                                                i35 = zzgk.zzl(bArr2, i30, zzgjVar8);
                                                zzjtVar6.zzg(zzhc.zzG(zzgjVar8.zzb));
                                                while (i35 < i40) {
                                                    int zzi13 = zzgk.zzi(bArr2, i35, zzgjVar8);
                                                    if (i58 == zzgjVar8.zza) {
                                                        i35 = zzgk.zzl(bArr2, zzi13, zzgjVar8);
                                                        zzjtVar6.zzg(zzhc.zzG(zzgjVar8.zzb));
                                                    }
                                                }
                                            }
                                            i31 = i48;
                                            i32 = i54;
                                            zzgjVar5 = zzgjVar8;
                                            i34 = i40;
                                            i33 = i58;
                                            i35 = i30;
                                            zzkhVar = this;
                                            if (i35 == i30) {
                                            }
                                        }
                                        i31 = i48;
                                        i32 = i54;
                                        zzgjVar5 = zzgjVar8;
                                        i34 = i40;
                                        i33 = i58;
                                        zzkhVar = this;
                                        if (i35 == i30) {
                                        }
                                        break;
                                    default:
                                        if (i56 == 3) {
                                            int i89 = (i58 & (-8)) | 4;
                                            zzkr zzx = zzkhVar.zzx(i48);
                                            i30 = i52;
                                            unsafe = unsafe6;
                                            i35 = zzgk.zzc(zzx, bArr, i52, i2, i89, zzgjVar);
                                            zzjbVar2.add(zzgjVar8.zzc);
                                            for (int i90 = i2; i35 < i90; i90 = i90) {
                                                int zzi14 = zzgk.zzi(bArr2, i35, zzgjVar8);
                                                if (i58 == zzgjVar8.zza) {
                                                    i35 = zzgk.zzc(zzx, bArr, zzi14, i2, i89, zzgjVar);
                                                    zzjbVar2.add(zzgjVar8.zzc);
                                                } else {
                                                    i40 = i90;
                                                    i31 = i48;
                                                    i32 = i54;
                                                    zzgjVar5 = zzgjVar8;
                                                    i34 = i40;
                                                    i33 = i58;
                                                    zzkhVar = this;
                                                    if (i35 == i30) {
                                                    }
                                                }
                                            }
                                            i40 = i90;
                                            i31 = i48;
                                            i32 = i54;
                                            zzgjVar5 = zzgjVar8;
                                            i34 = i40;
                                            i33 = i58;
                                            zzkhVar = this;
                                            if (i35 == i30) {
                                            }
                                        } else {
                                            unsafe = unsafe6;
                                            i30 = i52;
                                            i31 = i48;
                                            i32 = i54;
                                            i33 = i58;
                                            zzgjVar5 = zzgjVar8;
                                            i34 = i2;
                                            i35 = i30;
                                            zzkhVar = this;
                                            if (i35 == i30) {
                                            }
                                        }
                                        break;
                                }
                            } else {
                                unsafe = unsafe6;
                                int i91 = i52;
                                i20 = i48;
                                i22 = i54;
                                i21 = i58;
                                zzgjVar4 = zzgjVar8;
                                if (zzt != 50) {
                                    zzkhVar = this;
                                    obj4 = obj;
                                    Unsafe unsafe8 = zzb;
                                    long j4 = iArr[i20 + 2] & 1048575;
                                    switch (zzt) {
                                        case 51:
                                            i23 = i20;
                                            i9 = i22;
                                            i24 = i91;
                                            i25 = i21;
                                            i5 = 1;
                                            zzgjVar2 = zzgjVar4;
                                            if (i56 == 1) {
                                                i26 = i24 + 8;
                                                unsafe8.putObject(obj4, j2, Double.valueOf(Double.longBitsToDouble(zzgk.zzp(bArr2, i24))));
                                                unsafe8.putInt(obj4, j4, i9);
                                                i46 = i26;
                                                if (i46 != i24) {
                                                    i48 = i23;
                                                    i42 = i2;
                                                    i43 = i3;
                                                    i47 = i9;
                                                    zzgjVar7 = zzgjVar2;
                                                    i51 = i25;
                                                    i49 = i19;
                                                    unsafe3 = unsafe;
                                                    i44 = 3;
                                                    i45 = -1;
                                                    break;
                                                } else {
                                                    i4 = i3;
                                                    i10 = i46;
                                                    i7 = i25;
                                                    i49 = i19;
                                                    i8 = i23;
                                                    break;
                                                }
                                            }
                                            i46 = i24;
                                            if (i46 != i24) {
                                            }
                                        case 52:
                                            i23 = i20;
                                            i9 = i22;
                                            i24 = i91;
                                            i25 = i21;
                                            i5 = 1;
                                            zzgjVar2 = zzgjVar4;
                                            if (i56 == 5) {
                                                i26 = i24 + 4;
                                                unsafe8.putObject(obj4, j2, Float.valueOf(Float.intBitsToFloat(zzgk.zzb(bArr2, i24))));
                                                unsafe8.putInt(obj4, j4, i9);
                                                i46 = i26;
                                                if (i46 != i24) {
                                                }
                                            }
                                            i46 = i24;
                                            if (i46 != i24) {
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            i23 = i20;
                                            i9 = i22;
                                            i24 = i91;
                                            i27 = i21;
                                            i5 = 1;
                                            zzgjVar2 = zzgjVar4;
                                            if (i56 == 0) {
                                                i26 = zzgk.zzl(bArr2, i24, zzgjVar2);
                                                i25 = i27;
                                                unsafe8.putObject(obj4, j2, Long.valueOf(zzgjVar2.zzb));
                                                unsafe8.putInt(obj4, j4, i9);
                                                i46 = i26;
                                                if (i46 != i24) {
                                                }
                                            }
                                            i25 = i27;
                                            i46 = i24;
                                            if (i46 != i24) {
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            i23 = i20;
                                            i9 = i22;
                                            i24 = i91;
                                            i27 = i21;
                                            i5 = 1;
                                            zzgjVar2 = zzgjVar4;
                                            if (i56 == 0) {
                                                i26 = zzgk.zzi(bArr2, i24, zzgjVar2);
                                                unsafe8.putObject(obj4, j2, Integer.valueOf(zzgjVar2.zza));
                                                unsafe8.putInt(obj4, j4, i9);
                                                i25 = i27;
                                                i46 = i26;
                                                if (i46 != i24) {
                                                }
                                            }
                                            i25 = i27;
                                            i46 = i24;
                                            if (i46 != i24) {
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            i23 = i20;
                                            i9 = i22;
                                            i24 = i91;
                                            i27 = i21;
                                            i5 = 1;
                                            zzgjVar2 = zzgjVar4;
                                            if (i56 == 1) {
                                                i26 = i24 + 8;
                                                unsafe8.putObject(obj4, j2, Long.valueOf(zzgk.zzp(bArr2, i24)));
                                                unsafe8.putInt(obj4, j4, i9);
                                                i25 = i27;
                                                i46 = i26;
                                                if (i46 != i24) {
                                                }
                                            }
                                            i25 = i27;
                                            i46 = i24;
                                            if (i46 != i24) {
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            i23 = i20;
                                            i9 = i22;
                                            i24 = i91;
                                            i28 = i21;
                                            zzgjVar2 = zzgjVar4;
                                            if (i56 == 5) {
                                                i26 = i24 + 4;
                                                unsafe8.putObject(obj4, j2, Integer.valueOf(zzgk.zzb(bArr2, i24)));
                                                unsafe8.putInt(obj4, j4, i9);
                                                i25 = i28;
                                                i5 = 1;
                                                i46 = i26;
                                                if (i46 != i24) {
                                                }
                                            }
                                            i25 = i28;
                                            i5 = 1;
                                            i46 = i24;
                                            if (i46 != i24) {
                                            }
                                            break;
                                        case 58:
                                            i23 = i20;
                                            i9 = i22;
                                            i24 = i91;
                                            i28 = i21;
                                            zzgjVar2 = zzgjVar4;
                                            if (i56 == 0) {
                                                i26 = zzgk.zzl(bArr2, i24, zzgjVar2);
                                                unsafe8.putObject(obj4, j2, Boolean.valueOf(zzgjVar2.zzb != 0));
                                                unsafe8.putInt(obj4, j4, i9);
                                                i25 = i28;
                                                i5 = 1;
                                                i46 = i26;
                                                if (i46 != i24) {
                                                }
                                            }
                                            i25 = i28;
                                            i5 = 1;
                                            i46 = i24;
                                            if (i46 != i24) {
                                            }
                                            break;
                                        case 59:
                                            i23 = i20;
                                            i9 = i22;
                                            i24 = i91;
                                            i28 = i21;
                                            zzgjVar2 = zzgjVar4;
                                            if (i56 == 2) {
                                                int zzi15 = zzgk.zzi(bArr2, i24, zzgjVar2);
                                                int i92 = zzgjVar2.zza;
                                                if (i92 == 0) {
                                                    unsafe8.putObject(obj4, j2, "");
                                                } else {
                                                    int i93 = zzi15 + i92;
                                                    if ((i57 & TLObject.FLAG_29) != 0 && !zzma.zzf(bArr2, zzi15, i93)) {
                                                        throw zzje.zzd();
                                                    }
                                                    unsafe8.putObject(obj4, j2, new String(bArr2, zzi15, i92, zzjc.zzb));
                                                    zzi15 = i93;
                                                }
                                                unsafe8.putInt(obj4, j4, i9);
                                                i25 = i28;
                                                i46 = zzi15;
                                                i5 = 1;
                                                if (i46 != i24) {
                                                }
                                            }
                                            i25 = i28;
                                            i5 = 1;
                                            i46 = i24;
                                            if (i46 != i24) {
                                            }
                                            break;
                                        case 60:
                                            i24 = i91;
                                            i29 = i21;
                                            if (i56 == 2) {
                                                Object zzB = zzkhVar.zzB(obj4, i22, i20);
                                                int zzn2 = zzgk.zzn(zzB, zzkhVar.zzx(i20), bArr, i24, i2, zzgjVar);
                                                zzkhVar.zzK(obj4, i22, i20, zzB);
                                                zzgjVar2 = zzgjVar4;
                                                i23 = i20;
                                                i9 = i22;
                                                i25 = i29;
                                                i46 = zzn2;
                                                i24 = i24;
                                                i5 = 1;
                                                if (i46 != i24) {
                                                }
                                            } else {
                                                i23 = i20;
                                                i9 = i22;
                                                i25 = i29;
                                                i5 = 1;
                                                zzgjVar2 = zzgjVar4;
                                                i46 = i24;
                                                if (i46 != i24) {
                                                }
                                            }
                                            break;
                                        case 61:
                                            i24 = i91;
                                            i29 = i21;
                                            if (i56 == 2) {
                                                zza2 = zzgk.zza(bArr2, i24, zzgjVar4);
                                                unsafe8.putObject(obj4, j2, zzgjVar4.zzc);
                                                unsafe8.putInt(obj4, j4, i22);
                                                i23 = i20;
                                                i9 = i22;
                                                i25 = i29;
                                                i46 = zza2;
                                                i5 = 1;
                                                zzgjVar2 = zzgjVar4;
                                                if (i46 != i24) {
                                                }
                                            }
                                            i23 = i20;
                                            i9 = i22;
                                            i25 = i29;
                                            i5 = 1;
                                            zzgjVar2 = zzgjVar4;
                                            i46 = i24;
                                            if (i46 != i24) {
                                            }
                                            break;
                                        case 63:
                                            i24 = i91;
                                            i29 = i21;
                                            if (i56 == 0) {
                                                zza2 = zzgk.zzi(bArr2, i24, zzgjVar4);
                                                int i94 = zzgjVar4.zza;
                                                zzix zzw2 = zzkhVar.zzw(i20);
                                                if (zzw2 == null || zzw2.zza(i94)) {
                                                    unsafe8.putObject(obj4, j2, Integer.valueOf(i94));
                                                    unsafe8.putInt(obj4, j4, i22);
                                                } else {
                                                    zzd(obj).zzj(i29, Long.valueOf(i94));
                                                }
                                                i23 = i20;
                                                i9 = i22;
                                                i25 = i29;
                                                i46 = zza2;
                                                i5 = 1;
                                                zzgjVar2 = zzgjVar4;
                                                if (i46 != i24) {
                                                }
                                            }
                                            i23 = i20;
                                            i9 = i22;
                                            i25 = i29;
                                            i5 = 1;
                                            zzgjVar2 = zzgjVar4;
                                            i46 = i24;
                                            if (i46 != i24) {
                                            }
                                            break;
                                        case 66:
                                            i24 = i91;
                                            i29 = i21;
                                            if (i56 == 0) {
                                                zza2 = zzgk.zzi(bArr2, i24, zzgjVar4);
                                                unsafe8.putObject(obj4, j2, Integer.valueOf(zzhc.zzF(zzgjVar4.zza)));
                                                unsafe8.putInt(obj4, j4, i22);
                                                i23 = i20;
                                                i9 = i22;
                                                i25 = i29;
                                                i46 = zza2;
                                                i5 = 1;
                                                zzgjVar2 = zzgjVar4;
                                                if (i46 != i24) {
                                                }
                                            }
                                            i23 = i20;
                                            i9 = i22;
                                            i25 = i29;
                                            i5 = 1;
                                            zzgjVar2 = zzgjVar4;
                                            i46 = i24;
                                            if (i46 != i24) {
                                            }
                                            break;
                                        case 67:
                                            i24 = i91;
                                            i29 = i21;
                                            if (i56 == 0) {
                                                zza2 = zzgk.zzl(bArr2, i24, zzgjVar4);
                                                unsafe8.putObject(obj4, j2, Long.valueOf(zzhc.zzG(zzgjVar4.zzb)));
                                                unsafe8.putInt(obj4, j4, i22);
                                                i23 = i20;
                                                i9 = i22;
                                                i25 = i29;
                                                i46 = zza2;
                                                i5 = 1;
                                                zzgjVar2 = zzgjVar4;
                                                if (i46 != i24) {
                                                }
                                            }
                                            i23 = i20;
                                            i9 = i22;
                                            i25 = i29;
                                            i5 = 1;
                                            zzgjVar2 = zzgjVar4;
                                            i46 = i24;
                                            if (i46 != i24) {
                                            }
                                            break;
                                        case 68:
                                            if (i56 == 3) {
                                                Object zzB2 = zzkhVar.zzB(obj4, i22, i20);
                                                i24 = i91;
                                                i46 = zzgk.zzm(zzB2, zzkhVar.zzx(i20), bArr, i91, i2, (i21 & (-8)) | 4, zzgjVar);
                                                zzkhVar.zzK(obj4, i22, i20, zzB2);
                                                i23 = i20;
                                                i9 = i22;
                                                i25 = i21;
                                                i5 = 1;
                                                zzgjVar2 = zzgjVar4;
                                                if (i46 != i24) {
                                                }
                                            } else {
                                                i23 = i20;
                                                i9 = i22;
                                                i24 = i91;
                                                i25 = i21;
                                                i5 = 1;
                                                zzgjVar2 = zzgjVar4;
                                                i46 = i24;
                                                if (i46 != i24) {
                                                }
                                            }
                                            break;
                                        default:
                                            i23 = i20;
                                            i9 = i22;
                                            i24 = i91;
                                            i25 = i21;
                                            i5 = 1;
                                            zzgjVar2 = zzgjVar4;
                                            i46 = i24;
                                            if (i46 != i24) {
                                            }
                                            break;
                                    }
                                } else {
                                    if (i56 == 2) {
                                        Unsafe unsafe9 = zzb;
                                        Object zzz = zzz(i20);
                                        Object object = unsafe9.getObject(obj, j2);
                                        if (zzjz.zza(object)) {
                                            zzjy zzb2 = zzjy.zza().zzb();
                                            zzjz.zzb(zzb2, object);
                                            unsafe9.putObject(obj, j2, zzb2);
                                        }
                                        throw null;
                                    }
                                    zzkhVar = this;
                                    i10 = i91;
                                    obj4 = obj;
                                }
                            }
                        } else if (i56 == 2) {
                            zzjb zzjbVar3 = (zzjb) unsafe3.getObject(obj4, j2);
                            if (!zzjbVar3.zzc()) {
                                int size2 = zzjbVar3.size();
                                zzjbVar3 = zzjbVar3.zzd(size2 == 0 ? 10 : size2 + size2);
                                unsafe3.putObject(obj4, j2, zzjbVar3);
                            }
                            i46 = zzgk.zze(zzkhVar.zzx(i48), i58, bArr, i52, i2, zzjbVar3, zzgjVar);
                            i48 = i48;
                            unsafe3 = unsafe3;
                            i51 = i58;
                            i47 = i54;
                            i49 = i49;
                            i45 = -1;
                            i42 = i2;
                            i43 = i3;
                            zzgjVar7 = zzgjVar8;
                            i44 = 3;
                        } else {
                            i19 = i49;
                            unsafe = unsafe3;
                            zzgjVar4 = zzgjVar8;
                            i20 = i48;
                            i21 = i58;
                            i10 = i52;
                            i22 = i54;
                        }
                        i4 = i3;
                        i8 = i20;
                        i9 = i22;
                        i49 = i19;
                        i7 = i21;
                        i5 = 1;
                        zzgjVar2 = zzgjVar4;
                    }
                }
                if (i7 != i4 || i4 == 0) {
                    if (zzkhVar.zzh && (zzieVar = zzgjVar2.zzd) != zzie.zza) {
                        zzir zza4 = zzieVar.zza(zzkhVar.zzg, i9);
                        if (zza4 != null) {
                            i11 = i9;
                            zzgj zzgjVar10 = zzgjVar2;
                            zzip zzipVar = (zzip) obj4;
                            zzipVar.zzi();
                            zzij zzijVar = zzipVar.zzb;
                            zzmb zzmbVar = zza4.zzb.zzb;
                            if (zzmbVar == zzmb.zzn) {
                                zzgk.zzi(bArr2, i10, zzgjVar10);
                                throw null;
                            }
                            switch (zzmbVar.ordinal()) {
                                case 0:
                                    i12 = i10 + 8;
                                    obj5 = Double.valueOf(Double.longBitsToDouble(zzgk.zzp(bArr2, i10)));
                                    i10 = i12;
                                    obj2 = obj5;
                                    zzijVar.zzi(zza4.zzb, obj2);
                                    zzh = i10;
                                    break;
                                case 1:
                                    i12 = i10 + 4;
                                    obj5 = Float.valueOf(Float.intBitsToFloat(zzgk.zzb(bArr2, i10)));
                                    i10 = i12;
                                    obj2 = obj5;
                                    zzijVar.zzi(zza4.zzb, obj2);
                                    zzh = i10;
                                    break;
                                case 2:
                                case 3:
                                    i10 = zzgk.zzl(bArr2, i10, zzgjVar10);
                                    obj5 = Long.valueOf(zzgjVar10.zzb);
                                    obj2 = obj5;
                                    zzijVar.zzi(zza4.zzb, obj2);
                                    zzh = i10;
                                    break;
                                case 4:
                                case 12:
                                    i10 = zzgk.zzi(bArr2, i10, zzgjVar10);
                                    obj5 = Integer.valueOf(zzgjVar10.zza);
                                    obj2 = obj5;
                                    zzijVar.zzi(zza4.zzb, obj2);
                                    zzh = i10;
                                    break;
                                case 5:
                                case 15:
                                    i12 = i10 + 8;
                                    obj5 = Long.valueOf(zzgk.zzp(bArr2, i10));
                                    i10 = i12;
                                    obj2 = obj5;
                                    zzijVar.zzi(zza4.zzb, obj2);
                                    zzh = i10;
                                    break;
                                case 6:
                                case 14:
                                    i12 = i10 + 4;
                                    obj5 = Integer.valueOf(zzgk.zzb(bArr2, i10));
                                    i10 = i12;
                                    obj2 = obj5;
                                    zzijVar.zzi(zza4.zzb, obj2);
                                    zzh = i10;
                                    break;
                                case 7:
                                    i10 = zzgk.zzl(bArr2, i10, zzgjVar10);
                                    obj5 = Boolean.valueOf(zzgjVar10.zzb != 0);
                                    obj2 = obj5;
                                    zzijVar.zzi(zza4.zzb, obj2);
                                    zzh = i10;
                                    break;
                                case 8:
                                    i10 = zzgk.zzg(bArr2, i10, zzgjVar10);
                                    obj2 = zzgjVar10.zzc;
                                    zzijVar.zzi(zza4.zzb, obj2);
                                    zzh = i10;
                                    break;
                                case 9:
                                    int i95 = zzkn.zza;
                                    throw null;
                                case 10:
                                    int i96 = zzkn.zza;
                                    throw null;
                                case 11:
                                    i10 = zzgk.zza(bArr2, i10, zzgjVar10);
                                    obj2 = zzgjVar10.zzc;
                                    zzijVar.zzi(zza4.zzb, obj2);
                                    zzh = i10;
                                    break;
                                case 13:
                                    throw new IllegalStateException("Shouldn't reach here.");
                                case 16:
                                    i10 = zzgk.zzi(bArr2, i10, zzgjVar10);
                                    obj5 = Integer.valueOf(zzhc.zzF(zzgjVar10.zza));
                                    obj2 = obj5;
                                    zzijVar.zzi(zza4.zzb, obj2);
                                    zzh = i10;
                                    break;
                                case 17:
                                    i10 = zzgk.zzl(bArr2, i10, zzgjVar10);
                                    obj5 = Long.valueOf(zzhc.zzG(zzgjVar10.zzb));
                                    obj2 = obj5;
                                    zzijVar.zzi(zza4.zzb, obj2);
                                    zzh = i10;
                                    break;
                                default:
                                    obj2 = obj5;
                                    zzijVar.zzi(zza4.zzb, obj2);
                                    zzh = i10;
                                    break;
                            }
                        } else {
                            i11 = i9;
                            zzh = zzgk.zzh(i7, bArr, i10, i2, zzd(obj), zzgjVar);
                        }
                    } else {
                        i11 = i9;
                        zzh = zzgk.zzh(i7, bArr, i10, i2, zzd(obj), zzgjVar);
                    }
                    i42 = i2;
                    zzgjVar7 = zzgjVar;
                    i48 = i8;
                    i43 = i4;
                    i51 = i7;
                    i47 = i11;
                    unsafe3 = unsafe;
                    i44 = 3;
                    i45 = -1;
                    i46 = zzh;
                } else {
                    i46 = i10;
                    i6 = i50;
                }
            } else {
                i4 = i43;
                unsafe = unsafe3;
                i5 = 1;
                i6 = i50;
                i7 = i51;
            }
        }
        if (i49 != 1048575) {
            unsafe.putInt(obj4, i49, i6);
        }
        for (int i97 = zzkhVar.zzk; i97 < zzkhVar.zzl; i97 += i5) {
            zzy(obj, zzkhVar.zzj[i97], null, zzkhVar.zzn, obj);
        }
        if (i4 == 0) {
            if (i46 != i2) {
                throw zzje.zzg();
            }
        } else if (i46 > i2 || i7 != i4) {
            throw zzje.zzg();
        }
        return i46;
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final Object zze() {
        return ((zzit) this.zzg).zzs();
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zzit) {
                zzit zzitVar = (zzit) obj;
                zzitVar.zzE(ConnectionsManager.DEFAULT_DATACENTER_ID);
                zzitVar.zza = 0;
                zzitVar.zzC();
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
                                this.zzm.zzb(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzjy) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzR(obj, this.zzc[i], i)) {
                        zzx(i).zzf(zzb.getObject(obj, j));
                    }
                }
                if (zzN(obj, i)) {
                    zzx(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzn.zzm(obj);
            if (this.zzh) {
                this.zzo.zzf(obj);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzu = zzu(i);
            int i2 = 1048575 & zzu;
            int[] iArr = this.zzc;
            int zzt = zzt(zzu);
            int i3 = iArr[i];
            long j = i2;
            switch (zzt) {
                case 0:
                    if (zzN(obj2, i)) {
                        zzlv.zzo(obj, j, zzlv.zza(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i)) {
                        zzlv.zzp(obj, j, zzlv.zzb(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i)) {
                        zzlv.zzr(obj, j, zzlv.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i)) {
                        zzlv.zzr(obj, j, zzlv.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i)) {
                        zzlv.zzq(obj, j, zzlv.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i)) {
                        zzlv.zzr(obj, j, zzlv.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i)) {
                        zzlv.zzq(obj, j, zzlv.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i)) {
                        zzlv.zzm(obj, j, zzlv.zzw(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i)) {
                        zzlv.zzs(obj, j, zzlv.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i);
                    break;
                case 10:
                    if (zzN(obj2, i)) {
                        zzlv.zzs(obj, j, zzlv.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i)) {
                        zzlv.zzq(obj, j, zzlv.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i)) {
                        zzlv.zzq(obj, j, zzlv.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i)) {
                        zzlv.zzq(obj, j, zzlv.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i)) {
                        zzlv.zzr(obj, j, zzlv.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i)) {
                        zzlv.zzq(obj, j, zzlv.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i)) {
                        zzlv.zzr(obj, j, zzlv.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
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
                    this.zzm.zzc(obj, obj2, j);
                    break;
                case 50:
                    int i4 = zzkt.zza;
                    zzlv.zzs(obj, j, zzjz.zzb(zzlv.zzf(obj, j), zzlv.zzf(obj2, j)));
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
                    if (zzR(obj2, i3, i)) {
                        zzlv.zzs(obj, j, zzlv.zzf(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
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
                    if (zzR(obj2, i3, i)) {
                        zzlv.zzs(obj, j, zzlv.zzf(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i);
                    break;
            }
        }
        zzkt.zzr(this.zzn, obj, obj2);
        if (this.zzh) {
            zzkt.zzq(this.zzo, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0621 A[Catch: all -> 0x00fc, TryCatch #7 {all -> 0x00fc, blocks: (B:16:0x00da, B:36:0x061c, B:38:0x0621, B:39:0x0626, B:101:0x02df, B:104:0x02e8, B:105:0x02f8, B:106:0x0308, B:107:0x0318, B:108:0x0328, B:109:0x0338, B:110:0x0348, B:111:0x0358, B:112:0x0369, B:113:0x037a, B:114:0x038b, B:115:0x039c, B:116:0x03ad, B:117:0x03be, B:118:0x03da, B:119:0x03eb, B:120:0x03fc, B:121:0x0411, B:123:0x041a, B:124:0x042c, B:125:0x043e, B:126:0x044f, B:127:0x0460, B:128:0x0471, B:129:0x0482, B:130:0x0493, B:131:0x04a4, B:132:0x04b5, B:133:0x04c6, B:134:0x04db, B:135:0x04ed, B:136:0x04ff, B:137:0x0511, B:138:0x0523, B:140:0x0530, B:143:0x0537, B:144:0x053d, B:145:0x0548, B:146:0x055a, B:147:0x056c, B:148:0x0581, B:149:0x058c, B:150:0x059e, B:151:0x05b0, B:152:0x05c2, B:153:0x05d4, B:154:0x05e6, B:155:0x05f8, B:156:0x060a), top: B:15:0x00da }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x062c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0651 A[LOOP:3: B:50:0x064d->B:52:0x0651, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0665  */
    @Override // com.google.android.recaptcha.internal.zzkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(Object obj, zzkq zzkqVar, zzie zzieVar) {
        zzll zzllVar;
        Object obj2;
        int i;
        Object obj3;
        zzie zzieVar2;
        zzif zzifVar;
        Object obj4 = obj;
        zzie zzieVar3 = zzieVar;
        zzieVar.getClass();
        zzD(obj);
        zzll zzllVar2 = this.zzn;
        zzif zzifVar2 = this.zzo;
        zzij zzijVar = null;
        Object obj5 = null;
        while (true) {
            try {
                int zzc = zzkqVar.zzc();
                int zzq = zzq(zzc);
                if (zzq >= 0) {
                    obj3 = obj5;
                    zzllVar = zzllVar2;
                    obj2 = obj4;
                    try {
                        int zzu = zzu(zzq);
                        try {
                        } catch (zzjd unused) {
                            obj5 = obj3;
                        }
                        switch (zzt(zzu)) {
                            case 0:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzlv.zzo(obj2, zzu & 1048575, zzkqVar.zza());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 1:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzlv.zzp(obj2, zzu & 1048575, zzkqVar.zzb());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 2:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzlv.zzr(obj2, zzu & 1048575, zzkqVar.zzl());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 3:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzlv.zzr(obj2, zzu & 1048575, zzkqVar.zzo());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 4:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzlv.zzq(obj2, zzu & 1048575, zzkqVar.zzg());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 5:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzlv.zzr(obj2, zzu & 1048575, zzkqVar.zzk());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 6:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzlv.zzq(obj2, zzu & 1048575, zzkqVar.zzf());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 7:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzlv.zzm(obj2, zzu & 1048575, zzkqVar.zzN());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 8:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzG(obj2, zzu, zzkqVar);
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 9:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzke zzkeVar = (zzke) zzA(obj2, zzq);
                                zzkqVar.zzu(zzkeVar, zzx(zzq), zzieVar2);
                                zzJ(obj2, zzq, zzkeVar);
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 10:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzlv.zzs(obj2, zzu & 1048575, zzkqVar.zzp());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 11:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzlv.zzq(obj2, zzu & 1048575, zzkqVar.zzj());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 12:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                int zze = zzkqVar.zze();
                                zzix zzw = zzw(zzq);
                                if (zzw != null && !zzw.zza(zze)) {
                                    obj5 = zzkt.zzp(obj2, zzc, zze, obj5, zzllVar);
                                    obj4 = obj2;
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                }
                                zzlv.zzq(obj2, zzu & 1048575, zze);
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                                break;
                            case 13:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzlv.zzq(obj2, zzu & 1048575, zzkqVar.zzh());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 14:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzlv.zzr(obj2, zzu & 1048575, zzkqVar.zzm());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 15:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzlv.zzq(obj2, zzu & 1048575, zzkqVar.zzi());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 16:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzlv.zzr(obj2, zzu & 1048575, zzkqVar.zzn());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 17:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzke zzkeVar2 = (zzke) zzA(obj2, zzq);
                                zzkqVar.zzt(zzkeVar2, zzx(zzq), zzieVar2);
                                zzJ(obj2, zzq, zzkeVar2);
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 18:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzkqVar.zzx(this.zzm.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 19:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzkqVar.zzB(this.zzm.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 20:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzkqVar.zzE(this.zzm.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 21:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzkqVar.zzM(this.zzm.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 22:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzkqVar.zzD(this.zzm.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 23:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzkqVar.zzA(this.zzm.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 24:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzkqVar.zzz(this.zzm.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 25:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzkqVar.zzv(this.zzm.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 26:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                if (zzM(zzu)) {
                                    ((zzhd) zzkqVar).zzK(this.zzm.zza(obj2, zzu & 1048575), true);
                                } else {
                                    ((zzhd) zzkqVar).zzK(this.zzm.zza(obj2, zzu & 1048575), false);
                                }
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 27:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzkqVar.zzF(this.zzm.zza(obj2, zzu & 1048575), zzx(zzq), zzieVar2);
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 28:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzkqVar.zzw(this.zzm.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 29:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzkqVar.zzL(this.zzm.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 30:
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                List zza2 = this.zzm.zza(obj2, zzu & 1048575);
                                zzkqVar.zzy(zza2);
                                obj5 = zzkt.zzo(obj, zzc, zza2, zzw(zzq), obj3, zzllVar);
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 31:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzkqVar.zzG(this.zzm.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 32:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzkqVar.zzH(this.zzm.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 33:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzkqVar.zzI(this.zzm.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 34:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzkqVar.zzJ(this.zzm.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 35:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzkqVar.zzx(this.zzm.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 36:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzkqVar.zzB(this.zzm.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 37:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzkqVar.zzE(this.zzm.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 38:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzkqVar.zzM(this.zzm.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 39:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzkqVar.zzD(this.zzm.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 40:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzkqVar.zzA(this.zzm.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 41:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzkqVar.zzz(this.zzm.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 42:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzkqVar.zzv(this.zzm.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 43:
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                zzkqVar.zzL(this.zzm.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 44:
                                List zza3 = this.zzm.zza(obj2, zzu & 1048575);
                                zzkqVar.zzy(zza3);
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                try {
                                    obj5 = zzkt.zzo(obj, zzc, zza3, zzw(zzq), obj5, zzllVar);
                                } catch (zzjd unused2) {
                                    zzllVar.zzs(zzkqVar);
                                    if (obj5 == null) {
                                        obj5 = zzllVar.zzc(obj2);
                                    }
                                    if (!zzllVar.zzr(obj5, zzkqVar)) {
                                        for (int i2 = this.zzk; i2 < this.zzl; i2++) {
                                            zzy(obj, this.zzj[i2], obj5, zzllVar, obj);
                                        }
                                        if (obj5 == null) {
                                        }
                                    }
                                    obj4 = obj2;
                                    zzifVar2 = zzifVar;
                                    zzieVar3 = zzieVar2;
                                    zzllVar2 = zzllVar;
                                }
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                                break;
                            case 45:
                                zzkqVar.zzG(this.zzm.zza(obj2, zzu & 1048575));
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 46:
                                zzkqVar.zzH(this.zzm.zza(obj2, zzu & 1048575));
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 47:
                                zzkqVar.zzI(this.zzm.zza(obj2, zzu & 1048575));
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 48:
                                zzkqVar.zzJ(this.zzm.zza(obj2, zzu & 1048575));
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 49:
                                zzkqVar.zzC(this.zzm.zza(obj2, zzu & 1048575), zzx(zzq), zzieVar3);
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 50:
                                Object zzz = zzz(zzq);
                                long zzu2 = zzu(zzq) & 1048575;
                                Object zzf = zzlv.zzf(obj2, zzu2);
                                if (zzf == null) {
                                    zzf = zzjy.zza().zzb();
                                    zzlv.zzs(obj2, zzu2, zzf);
                                } else if (zzjz.zza(zzf)) {
                                    Object zzb2 = zzjy.zza().zzb();
                                    zzjz.zzb(zzb2, zzf);
                                    zzlv.zzs(obj2, zzu2, zzb2);
                                    zzf = zzb2;
                                }
                                throw null;
                                break;
                            case 51:
                                zzlv.zzs(obj2, zzu & 1048575, Double.valueOf(zzkqVar.zza()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 52:
                                zzlv.zzs(obj2, zzu & 1048575, Float.valueOf(zzkqVar.zzb()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 53:
                                zzlv.zzs(obj2, zzu & 1048575, Long.valueOf(zzkqVar.zzl()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 54:
                                zzlv.zzs(obj2, zzu & 1048575, Long.valueOf(zzkqVar.zzo()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 55:
                                zzlv.zzs(obj2, zzu & 1048575, Integer.valueOf(zzkqVar.zzg()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 56:
                                zzlv.zzs(obj2, zzu & 1048575, Long.valueOf(zzkqVar.zzk()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 57:
                                zzlv.zzs(obj2, zzu & 1048575, Integer.valueOf(zzkqVar.zzf()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 58:
                                zzlv.zzs(obj2, zzu & 1048575, Boolean.valueOf(zzkqVar.zzN()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 59:
                                zzG(obj2, zzu, zzkqVar);
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 60:
                                zzke zzkeVar3 = (zzke) zzB(obj2, zzc, zzq);
                                zzkqVar.zzu(zzkeVar3, zzx(zzq), zzieVar3);
                                zzK(obj2, zzc, zzq, zzkeVar3);
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 61:
                                zzlv.zzs(obj2, zzu & 1048575, zzkqVar.zzp());
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 62:
                                zzlv.zzs(obj2, zzu & 1048575, Integer.valueOf(zzkqVar.zzj()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 63:
                                int zze2 = zzkqVar.zze();
                                zzix zzw2 = zzw(zzq);
                                if (zzw2 != null && !zzw2.zza(zze2)) {
                                    obj5 = zzkt.zzp(obj2, zzc, zze2, obj3, zzllVar);
                                    obj4 = obj2;
                                    zzllVar2 = zzllVar;
                                }
                                zzlv.zzs(obj2, zzu & 1048575, Integer.valueOf(zze2));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                                break;
                            case 64:
                                zzlv.zzs(obj2, zzu & 1048575, Integer.valueOf(zzkqVar.zzh()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 65:
                                zzlv.zzs(obj2, zzu & 1048575, Long.valueOf(zzkqVar.zzm()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 66:
                                zzlv.zzs(obj2, zzu & 1048575, Integer.valueOf(zzkqVar.zzi()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 67:
                                zzlv.zzs(obj2, zzu & 1048575, Long.valueOf(zzkqVar.zzn()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            case 68:
                                zzke zzkeVar4 = (zzke) zzB(obj2, zzc, zzq);
                                zzkqVar.zzt(zzkeVar4, zzx(zzq), zzieVar3);
                                zzK(obj2, zzc, zzq, zzkeVar4);
                                obj5 = obj3;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                obj4 = obj2;
                                zzifVar2 = zzifVar;
                                zzieVar3 = zzieVar2;
                                zzllVar2 = zzllVar;
                            default:
                                obj5 = obj3 == null ? zzllVar.zzc(obj2) : obj3;
                                try {
                                    try {
                                        if (!zzllVar.zzr(obj5, zzkqVar)) {
                                            for (int i3 = this.zzk; i3 < this.zzl; i3++) {
                                                zzy(obj, this.zzj[i3], obj5, zzllVar, obj);
                                            }
                                            break;
                                        }
                                        obj4 = obj2;
                                    } catch (zzjd unused3) {
                                        zzifVar = zzifVar2;
                                        zzieVar2 = zzieVar3;
                                        zzllVar.zzs(zzkqVar);
                                        if (obj5 == null) {
                                        }
                                        if (!zzllVar.zzr(obj5, zzkqVar)) {
                                        }
                                        obj4 = obj2;
                                        zzifVar2 = zzifVar;
                                        zzieVar3 = zzieVar2;
                                        zzllVar2 = zzllVar;
                                    }
                                    zzllVar2 = zzllVar;
                                } catch (Throwable th) {
                                    th = th;
                                    while (i < this.zzl) {
                                    }
                                    if (obj5 != null) {
                                    }
                                    throw th;
                                }
                                break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj5 = obj3;
                        while (i < this.zzl) {
                        }
                        if (obj5 != null) {
                        }
                        throw th;
                    }
                } else if (zzc == Integer.MAX_VALUE) {
                    for (int i4 = this.zzk; i4 < this.zzl; i4++) {
                        zzy(obj, this.zzj[i4], obj5, zzllVar2, obj);
                    }
                    zzllVar = zzllVar2;
                    obj2 = obj4;
                } else {
                    try {
                        Object zzd = !this.zzh ? null : zzifVar2.zzd(zzieVar3, this.zzg, zzc);
                        if (zzd != null) {
                            zzij zzc2 = zzijVar == null ? zzifVar2.zzc(obj4) : zzijVar;
                            obj3 = obj5;
                            zzll zzllVar3 = zzllVar2;
                            Object obj6 = obj4;
                            try {
                                zzifVar2.zze(obj, zzkqVar, zzd, zzieVar, zzc2, obj3, zzllVar3);
                                zzijVar = zzc2;
                                obj4 = obj6;
                                zzllVar2 = zzllVar3;
                                obj5 = obj3;
                            } catch (Throwable th3) {
                                th = th3;
                                obj2 = obj6;
                                zzllVar = zzllVar3;
                                obj5 = obj3;
                                while (i < this.zzl) {
                                }
                                if (obj5 != null) {
                                }
                                throw th;
                            }
                        } else {
                            Object obj7 = obj5;
                            zzll zzllVar4 = zzllVar2;
                            Object obj8 = obj4;
                            zzllVar4.zzs(zzkqVar);
                            obj5 = obj7 == null ? zzllVar4.zzc(obj8) : obj7;
                            try {
                                if (zzllVar4.zzr(obj5, zzkqVar)) {
                                    obj4 = obj8;
                                    zzllVar2 = zzllVar4;
                                } else {
                                    int i5 = this.zzk;
                                    while (i5 < this.zzl) {
                                        zzll zzllVar5 = zzllVar4;
                                        zzy(obj, this.zzj[i5], obj5, zzllVar5, obj);
                                        i5++;
                                        obj8 = obj8;
                                        zzllVar4 = zzllVar5;
                                    }
                                    obj2 = obj8;
                                    zzllVar = zzllVar4;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                obj2 = obj8;
                                zzllVar = zzllVar4;
                                for (i = this.zzk; i < this.zzl; i++) {
                                    zzy(obj, this.zzj[i], obj5, zzllVar, obj);
                                }
                                if (obj5 != null) {
                                    zzllVar.zzn(obj2, obj5);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        zzllVar = zzllVar2;
                        obj2 = obj4;
                        while (i < this.zzl) {
                        }
                        if (obj5 != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
        if (obj5 == null) {
            zzllVar.zzn(obj2, obj5);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgj zzgjVar) {
        zzc(obj, bArr, i, i2, 0, zzgjVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:254:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    @Override // com.google.android.recaptcha.internal.zzkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(Object obj, zzmd zzmdVar) {
        Map.Entry entry;
        Iterator it;
        int[] iArr;
        int i;
        int i2;
        int i3;
        Map.Entry entry2;
        int i4;
        int i5;
        Iterator it2;
        int[] iArr2;
        Map.Entry entry3;
        int i6;
        if (this.zzh) {
            zzij zzb2 = this.zzo.zzb(obj);
            if (!zzb2.zza.isEmpty()) {
                Iterator zzf = zzb2.zzf();
                entry = (Map.Entry) zzf.next();
                it = zzf;
                iArr = this.zzc;
                Unsafe unsafe = zzb;
                int i7 = 1048575;
                int i8 = 1048575;
                int i9 = 0;
                i = 0;
                while (i < iArr.length) {
                    int zzu = zzu(i);
                    int[] iArr3 = this.zzc;
                    int zzt = zzt(zzu);
                    int i10 = iArr3[i];
                    if (zzt <= 17) {
                        int i11 = iArr3[i + 2];
                        int i12 = i11 & i7;
                        if (i12 != i8) {
                            if (i12 == i7) {
                                i2 = zzt;
                                i9 = 0;
                            } else {
                                i2 = zzt;
                                i9 = unsafe.getInt(obj, i12);
                            }
                            i8 = i12;
                        } else {
                            i2 = zzt;
                        }
                        i3 = i8;
                        entry2 = entry;
                        i4 = i9;
                        i5 = 1 << (i11 >>> 20);
                    } else {
                        i2 = zzt;
                        i3 = i8;
                        entry2 = entry;
                        i4 = i9;
                        i5 = 0;
                    }
                    while (entry2 != null && this.zzo.zza(entry2) <= i10) {
                        this.zzo.zzi(zzmdVar, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long j = zzu & 1048575;
                    switch (i2) {
                        case 0:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            if (zzO(obj, i6, i3, i4, i5)) {
                                zzmdVar.zzf(i10, zzlv.zza(obj, j));
                            }
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 1:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            if (zzO(obj, i6, i3, i4, i5)) {
                                zzmdVar.zzo(i10, zzlv.zzb(obj, j));
                            }
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 2:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            if (zzO(obj, i6, i3, i4, i5)) {
                                zzmdVar.zzt(i10, unsafe.getLong(obj, j));
                            }
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 3:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            if (zzO(obj, i6, i3, i4, i5)) {
                                zzmdVar.zzK(i10, unsafe.getLong(obj, j));
                            }
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 4:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            if (zzO(obj, i6, i3, i4, i5)) {
                                zzmdVar.zzr(i10, unsafe.getInt(obj, j));
                            }
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 5:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            if (zzO(obj, i6, i3, i4, i5)) {
                                zzmdVar.zzm(i10, unsafe.getLong(obj, j));
                            }
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 6:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            if (zzO(obj, i6, i3, i4, i5)) {
                                zzmdVar.zzk(i10, unsafe.getInt(obj, j));
                            }
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 7:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            if (zzO(obj, i6, i3, i4, i5)) {
                                zzmdVar.zzb(i10, zzlv.zzw(obj, j));
                            }
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 8:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            if (zzO(obj, i6, i3, i4, i5)) {
                                zzT(i10, unsafe.getObject(obj, j), zzmdVar);
                            }
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 9:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            if (zzO(obj, i6, i3, i4, i5)) {
                                zzmdVar.zzv(i10, unsafe.getObject(obj, j), zzx(i6));
                            }
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 10:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            if (zzO(obj, i6, i3, i4, i5)) {
                                zzmdVar.zzd(i10, (zzgw) unsafe.getObject(obj, j));
                            }
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 11:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            if (zzO(obj, i6, i3, i4, i5)) {
                                zzmdVar.zzI(i10, unsafe.getInt(obj, j));
                            }
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 12:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            if (zzO(obj, i6, i3, i4, i5)) {
                                zzmdVar.zzi(i10, unsafe.getInt(obj, j));
                            }
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 13:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            if (zzO(obj, i6, i3, i4, i5)) {
                                zzmdVar.zzx(i10, unsafe.getInt(obj, j));
                            }
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 14:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            if (zzO(obj, i6, i3, i4, i5)) {
                                zzmdVar.zzz(i10, unsafe.getLong(obj, j));
                            }
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 15:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            if (zzO(obj, i6, i3, i4, i5)) {
                                zzmdVar.zzB(i10, unsafe.getInt(obj, j));
                            }
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 16:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            if (zzO(obj, i6, i3, i4, i5)) {
                                zzmdVar.zzD(i10, unsafe.getLong(obj, j));
                            }
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 17:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            if (zzO(obj, i, i3, i4, i5)) {
                                zzmdVar.zzq(i10, unsafe.getObject(obj, j), zzx(i6));
                            }
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 18:
                            zzkt.zzu(this.zzc[i], (List) unsafe.getObject(obj, j), zzmdVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 19:
                            zzkt.zzy(this.zzc[i], (List) unsafe.getObject(obj, j), zzmdVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 20:
                            zzkt.zzA(this.zzc[i], (List) unsafe.getObject(obj, j), zzmdVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 21:
                            zzkt.zzG(this.zzc[i], (List) unsafe.getObject(obj, j), zzmdVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 22:
                            zzkt.zzz(this.zzc[i], (List) unsafe.getObject(obj, j), zzmdVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 23:
                            zzkt.zzx(this.zzc[i], (List) unsafe.getObject(obj, j), zzmdVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 24:
                            zzkt.zzw(this.zzc[i], (List) unsafe.getObject(obj, j), zzmdVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 25:
                            zzkt.zzt(this.zzc[i], (List) unsafe.getObject(obj, j), zzmdVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 26:
                            int i13 = this.zzc[i];
                            List list = (List) unsafe.getObject(obj, j);
                            int i14 = zzkt.zza;
                            if (list != null && !list.isEmpty()) {
                                zzmdVar.zzH(i13, list);
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                            break;
                        case 27:
                            int i15 = this.zzc[i];
                            List list2 = (List) unsafe.getObject(obj, j);
                            zzkr zzx = zzx(i);
                            int i16 = zzkt.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i17 = 0; i17 < list2.size(); i17++) {
                                    ((zzhi) zzmdVar).zzv(i15, list2.get(i17), zzx);
                                }
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                            break;
                        case 28:
                            int i18 = this.zzc[i];
                            List list3 = (List) unsafe.getObject(obj, j);
                            int i19 = zzkt.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzmdVar.zze(i18, list3);
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                            break;
                        case 29:
                            zzkt.zzF(this.zzc[i], (List) unsafe.getObject(obj, j), zzmdVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 30:
                            zzkt.zzv(this.zzc[i], (List) unsafe.getObject(obj, j), zzmdVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 31:
                            zzkt.zzB(this.zzc[i], (List) unsafe.getObject(obj, j), zzmdVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 32:
                            zzkt.zzC(this.zzc[i], (List) unsafe.getObject(obj, j), zzmdVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 33:
                            zzkt.zzD(this.zzc[i], (List) unsafe.getObject(obj, j), zzmdVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 34:
                            zzkt.zzE(this.zzc[i], (List) unsafe.getObject(obj, j), zzmdVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 35:
                            zzkt.zzu(this.zzc[i], (List) unsafe.getObject(obj, j), zzmdVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 36:
                            zzkt.zzy(this.zzc[i], (List) unsafe.getObject(obj, j), zzmdVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 37:
                            zzkt.zzA(this.zzc[i], (List) unsafe.getObject(obj, j), zzmdVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 38:
                            zzkt.zzG(this.zzc[i], (List) unsafe.getObject(obj, j), zzmdVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 39:
                            zzkt.zzz(this.zzc[i], (List) unsafe.getObject(obj, j), zzmdVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 40:
                            zzkt.zzx(this.zzc[i], (List) unsafe.getObject(obj, j), zzmdVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 41:
                            zzkt.zzw(this.zzc[i], (List) unsafe.getObject(obj, j), zzmdVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 42:
                            zzkt.zzt(this.zzc[i], (List) unsafe.getObject(obj, j), zzmdVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 43:
                            zzkt.zzF(this.zzc[i], (List) unsafe.getObject(obj, j), zzmdVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 44:
                            zzkt.zzv(this.zzc[i], (List) unsafe.getObject(obj, j), zzmdVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 45:
                            zzkt.zzB(this.zzc[i], (List) unsafe.getObject(obj, j), zzmdVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 46:
                            zzkt.zzC(this.zzc[i], (List) unsafe.getObject(obj, j), zzmdVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 47:
                            zzkt.zzD(this.zzc[i], (List) unsafe.getObject(obj, j), zzmdVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 48:
                            zzkt.zzE(this.zzc[i], (List) unsafe.getObject(obj, j), zzmdVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 49:
                            int i20 = this.zzc[i];
                            List list4 = (List) unsafe.getObject(obj, j);
                            zzkr zzx2 = zzx(i);
                            int i21 = zzkt.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i22 = 0; i22 < list4.size(); i22++) {
                                    ((zzhi) zzmdVar).zzq(i20, list4.get(i22), zzx2);
                                }
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j) != null) {
                                throw null;
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 51:
                            if (zzR(obj, i10, i)) {
                                zzmdVar.zzf(i10, zzn(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 52:
                            if (zzR(obj, i10, i)) {
                                zzmdVar.zzo(i10, zzo(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 53:
                            if (zzR(obj, i10, i)) {
                                zzmdVar.zzt(i10, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 54:
                            if (zzR(obj, i10, i)) {
                                zzmdVar.zzK(i10, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 55:
                            if (zzR(obj, i10, i)) {
                                zzmdVar.zzr(i10, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 56:
                            if (zzR(obj, i10, i)) {
                                zzmdVar.zzm(i10, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 57:
                            if (zzR(obj, i10, i)) {
                                zzmdVar.zzk(i10, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 58:
                            if (zzR(obj, i10, i)) {
                                zzmdVar.zzb(i10, zzS(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 59:
                            if (zzR(obj, i10, i)) {
                                zzT(i10, unsafe.getObject(obj, j), zzmdVar);
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 60:
                            if (zzR(obj, i10, i)) {
                                zzmdVar.zzv(i10, unsafe.getObject(obj, j), zzx(i));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 61:
                            if (zzR(obj, i10, i)) {
                                zzmdVar.zzd(i10, (zzgw) unsafe.getObject(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 62:
                            if (zzR(obj, i10, i)) {
                                zzmdVar.zzI(i10, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 63:
                            if (zzR(obj, i10, i)) {
                                zzmdVar.zzi(i10, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 64:
                            if (zzR(obj, i10, i)) {
                                zzmdVar.zzx(i10, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 65:
                            if (zzR(obj, i10, i)) {
                                zzmdVar.zzz(i10, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 66:
                            if (zzR(obj, i10, i)) {
                                zzmdVar.zzB(i10, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 67:
                            if (zzR(obj, i10, i)) {
                                zzmdVar.zzD(i10, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        case 68:
                            if (zzR(obj, i10, i)) {
                                zzmdVar.zzq(i10, unsafe.getObject(obj, j), zzx(i));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                        default:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i6 = i;
                            i = i6 + 3;
                            i8 = i3;
                            i9 = i4;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            i7 = 1048575;
                    }
                }
                Iterator it3 = it;
                while (entry != null) {
                    this.zzo.zzi(zzmdVar, entry);
                    entry = it3.hasNext() ? (Map.Entry) it3.next() : null;
                }
                zzll zzllVar = this.zzn;
                zzllVar.zzq(zzllVar.zzd(obj), zzmdVar);
            }
        }
        entry = null;
        it = null;
        iArr = this.zzc;
        Unsafe unsafe2 = zzb;
        int i72 = 1048575;
        int i82 = 1048575;
        int i92 = 0;
        i = 0;
        while (i < iArr.length) {
        }
        Iterator it32 = it;
        while (entry != null) {
        }
        zzll zzllVar2 = this.zzn;
        zzllVar2.zzq(zzllVar2.zzd(obj), zzmdVar);
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final boolean zzk(Object obj, Object obj2) {
        boolean zzH;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzu = zzu(i);
            long j = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (zzL(obj, obj2, i) && Double.doubleToLongBits(zzlv.zza(obj, j)) == Double.doubleToLongBits(zzlv.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i) && Float.floatToIntBits(zzlv.zzb(obj, j)) == Float.floatToIntBits(zzlv.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i) && zzlv.zzd(obj, j) == zzlv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i) && zzlv.zzd(obj, j) == zzlv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i) && zzlv.zzc(obj, j) == zzlv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i) && zzlv.zzd(obj, j) == zzlv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i) && zzlv.zzc(obj, j) == zzlv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i) && zzlv.zzw(obj, j) == zzlv.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i) && zzkt.zzH(zzlv.zzf(obj, j), zzlv.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i) && zzkt.zzH(zzlv.zzf(obj, j), zzlv.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i) && zzkt.zzH(zzlv.zzf(obj, j), zzlv.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i) && zzlv.zzc(obj, j) == zzlv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i) && zzlv.zzc(obj, j) == zzlv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i) && zzlv.zzc(obj, j) == zzlv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i) && zzlv.zzd(obj, j) == zzlv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i) && zzlv.zzc(obj, j) == zzlv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i) && zzlv.zzd(obj, j) == zzlv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i) && zzkt.zzH(zzlv.zzf(obj, j), zzlv.zzf(obj2, j))) {
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
                    zzH = zzkt.zzH(zzlv.zzf(obj, j), zzlv.zzf(obj2, j));
                    break;
                case 50:
                    zzH = zzkt.zzH(zzlv.zzf(obj, j), zzlv.zzf(obj2, j));
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
                    if (zzlv.zzc(obj, zzr) == zzlv.zzc(obj2, zzr) && zzkt.zzH(zzlv.zzf(obj, j), zzlv.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzH) {
                return false;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzo.zzb(obj).equals(this.zzo.zzb(obj2));
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzkr
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
            int i8 = this.zzc[i6 + 2];
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
                        if (zzt == 50 && !((zzjy) zzlv.zzf(obj, zzu & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzlv.zzf(obj, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzkr zzx = zzx(i6);
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
        return !this.zzh || this.zzo.zzb(obj).zzk();
    }
}
