package com.google.android.gms.internal.cast;

import androidx.activity.result.ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.CharacterCompat;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzva implements zzvi {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzwj.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final zzux zze;
    private final boolean zzf;
    private final int[] zzg;
    private final int zzh;
    private final zzul zzi;
    private final zzvz zzj;
    private final zztf zzk;
    private final zzvc zzl;
    private final zzus zzm;

    private zzva(int[] iArr, Object[] objArr, int i, int i2, zzux zzuxVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzvc zzvcVar, zzul zzulVar, zzvz zzvzVar, zztf zztfVar, zzus zzusVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        boolean z2 = false;
        if (zztfVar != null && zztfVar.zzc(zzuxVar)) {
            z2 = true;
        }
        this.zzf = z2;
        this.zzg = iArr2;
        this.zzh = i4;
        this.zzl = zzvcVar;
        this.zzi = zzulVar;
        this.zzj = zzvzVar;
        this.zzk = zztfVar;
        this.zze = zzuxVar;
        this.zzm = zzusVar;
    }

    private static boolean zzA(Object obj, int i, zzvi zzviVar) {
        return zzviVar.zzh(zzwj.zzf(obj, i & 1048575));
    }

    private static boolean zzB(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zztp) {
            return ((zztp) obj).zzK();
        }
        return true;
    }

    private final boolean zzC(Object obj, int i, int i2) {
        return zzwj.zzc(obj, (long) (zzm(i2) & 1048575)) == i;
    }

    private static boolean zzD(Object obj, long j) {
        return ((Boolean) zzwj.zzf(obj, j)).booleanValue();
    }

    private static final void zzE(int i, Object obj, zzwq zzwqVar) {
        if (obj instanceof String) {
            zzwqVar.zzD(i, (String) obj);
        } else {
            zzwqVar.zzd(i, (zzsu) obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzva zzi(Class cls, zzuu zzuuVar, zzvc zzvcVar, zzul zzulVar, zzvz zzvzVar, zztf zztfVar, zzus zzusVar) {
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
        zzvh zzvhVar;
        int i19;
        String str;
        int i20;
        int i21;
        int i22;
        int i23;
        Field zzs;
        char charAt11;
        int i24;
        int i25;
        int i26;
        int i27;
        Object obj;
        Field zzs2;
        Object obj2;
        Field zzs3;
        int i28;
        char charAt12;
        int i29;
        char charAt13;
        int i30;
        char charAt14;
        int i31;
        char charAt15;
        if (!(zzuuVar instanceof zzvh)) {
            ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0.m(zzuuVar);
            throw null;
        }
        zzvh zzvhVar2 = (zzvh) zzuuVar;
        String zzd = zzvhVar2.zzd();
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
        Object[] zze = zzvhVar2.zze();
        Class<?> cls2 = zzvhVar2.zza().getClass();
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
            int i74 = charAt25 & NotificationCenter.didSetNewWallpapper;
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
                        if (zzvhVar2.zzc() == 1 || i75 != 0) {
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
                        zzs2 = zzs(cls2, (String) obj);
                        zze[i85] = zzs2;
                    } else {
                        zzs2 = (Field) obj;
                    }
                    i17 = i3;
                    i23 = (int) unsafe.objectFieldOffset(zzs2);
                    int i86 = i85 + 1;
                    obj2 = zze[i86];
                    if (obj2 instanceof Field) {
                        zzs3 = zzs(cls2, (String) obj2);
                        zze[i86] = zzs3;
                    } else {
                        zzs3 = (Field) obj2;
                    }
                    zzvhVar = zzvhVar2;
                    str = zzd;
                    i22 = i2;
                    i20 = i81;
                    i19 = (int) unsafe.objectFieldOffset(zzs3);
                    i21 = 0;
                }
                i2 = i27;
                int i852 = charAt26 + charAt26;
                obj = zze[i852];
                if (obj instanceof Field) {
                }
                i17 = i3;
                i23 = (int) unsafe.objectFieldOffset(zzs2);
                int i862 = i852 + 1;
                obj2 = zze[i862];
                if (obj2 instanceof Field) {
                }
                zzvhVar = zzvhVar2;
                str = zzd;
                i22 = i2;
                i20 = i81;
                i19 = (int) unsafe.objectFieldOffset(zzs3);
                i21 = 0;
            } else {
                i17 = i3;
                i18 = i6;
                int i87 = i2 + 1;
                Field zzs4 = zzs(cls2, (String) zze[i2]);
                if (i74 == 9 || i74 == 17) {
                    zzvhVar = zzvhVar2;
                    int i88 = i65 / 3;
                    objArr[i88 + i88 + 1] = zzs4.getType();
                } else {
                    if (i74 == 27) {
                        zzvhVar = zzvhVar2;
                        i24 = 1;
                        i25 = i2 + 2;
                    } else if (i74 == 49) {
                        i25 = i2 + 2;
                        zzvhVar = zzvhVar2;
                        i24 = 1;
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        zzvhVar = zzvhVar2;
                        if (zzvhVar2.zzc() == 1 || i75 != 0) {
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
                        zzvhVar = zzvhVar2;
                    }
                    int i94 = i65 / 3;
                    objArr[i94 + i94 + i24] = zze[i87];
                    i87 = i25;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(zzs4);
                i19 = 1048575;
                if ((charAt25 & LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM) == 0 || i74 > 17) {
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
                        zzs = (Field) obj3;
                    } else {
                        zzs = zzs(cls2, (String) obj3);
                        zze[i98] = zzs;
                    }
                    i21 = charAt27 % 32;
                    i19 = (int) unsafe.objectFieldOffset(zzs);
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
            iArr2[i99] = i23 | ((charAt25 & 256) != 0 ? 268435456 : 0) | ((charAt25 & 512) != 0 ? 536870912 : 0) | (i75 != 0 ? Integer.MIN_VALUE : 0) | (i74 << 20);
            i65 += 3;
            iArr2[i100] = (i21 << 20) | i19;
            i2 = i22;
            i33 = i20;
            length = i76;
            zzvhVar2 = zzvhVar;
            zzd = str;
            i6 = i18;
            i3 = i17;
            c = CharacterCompat.MIN_HIGH_SURROGATE;
        }
        zzvh zzvhVar3 = zzvhVar2;
        return new zzva(iArr2, objArr, i3, i6, zzvhVar3.zza(), zzvhVar3.zzc(), false, iArr, i4, i60, zzvcVar, zzulVar, zzvzVar, zztfVar, zzusVar);
    }

    private static double zzj(Object obj, long j) {
        return ((Double) zzwj.zzf(obj, j)).doubleValue();
    }

    private static float zzk(Object obj, long j) {
        return ((Float) zzwj.zzf(obj, j)).floatValue();
    }

    private static int zzl(Object obj, long j) {
        return ((Integer) zzwj.zzf(obj, j)).intValue();
    }

    private final int zzm(int i) {
        return this.zzc[i + 2];
    }

    private static int zzn(int i) {
        return (i >>> 20) & NotificationCenter.didSetNewWallpapper;
    }

    private final int zzo(int i) {
        return this.zzc[i + 1];
    }

    private static long zzp(Object obj, long j) {
        return ((Long) zzwj.zzf(obj, j)).longValue();
    }

    private final zzvi zzq(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzvi zzviVar = (zzvi) objArr[i3];
        if (zzviVar != null) {
            return zzviVar;
        }
        zzvi zzb2 = zzvf.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzr(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private static Field zzs(Class cls, String str) {
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

    private final void zzt(Object obj, Object obj2, int i) {
        if (zzy(obj2, i)) {
            int zzo = zzo(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzo;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzvi zzq = zzq(i);
            if (!zzy(obj, i)) {
                if (zzB(object)) {
                    Object zzc = zzq.zzc();
                    zzq.zze(zzc, object);
                    unsafe.putObject(obj, j, zzc);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzv(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzB(object2)) {
                Object zzc2 = zzq.zzc();
                zzq.zze(zzc2, object2);
                unsafe.putObject(obj, j, zzc2);
                object2 = zzc2;
            }
            zzq.zze(object2, object);
        }
    }

    private final void zzu(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzC(obj2, i2, i)) {
            int zzo = zzo(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzo;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzvi zzq = zzq(i);
            if (!zzC(obj, i2, i)) {
                if (zzB(object)) {
                    Object zzc = zzq.zzc();
                    zzq.zze(zzc, object);
                    unsafe.putObject(obj, j, zzc);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzw(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzB(object2)) {
                Object zzc2 = zzq.zzc();
                zzq.zze(zzc2, object2);
                unsafe.putObject(obj, j, zzc2);
                object2 = zzc2;
            }
            zzq.zze(object2, object);
        }
    }

    private final void zzv(Object obj, int i) {
        int zzm = zzm(i);
        long j = 1048575 & zzm;
        if (j == 1048575) {
            return;
        }
        zzwj.zzq(obj, j, (1 << (zzm >>> 20)) | zzwj.zzc(obj, j));
    }

    private final void zzw(Object obj, int i, int i2) {
        zzwj.zzq(obj, zzm(i2) & 1048575, i);
    }

    private final boolean zzx(Object obj, Object obj2, int i) {
        return zzy(obj, i) == zzy(obj2, i);
    }

    private final boolean zzy(Object obj, int i) {
        int zzm = zzm(i);
        long j = zzm & 1048575;
        if (j != 1048575) {
            return (zzwj.zzc(obj, j) & (1 << (zzm >>> 20))) != 0;
        }
        int zzo = zzo(i);
        long j2 = zzo & 1048575;
        switch (zzn(zzo)) {
            case 0:
                return Double.doubleToRawLongBits(zzwj.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzwj.zzb(obj, j2)) != 0;
            case 2:
                return zzwj.zzd(obj, j2) != 0;
            case 3:
                return zzwj.zzd(obj, j2) != 0;
            case 4:
                return zzwj.zzc(obj, j2) != 0;
            case 5:
                return zzwj.zzd(obj, j2) != 0;
            case 6:
                return zzwj.zzc(obj, j2) != 0;
            case 7:
                return zzwj.zzw(obj, j2);
            case 8:
                Object zzf = zzwj.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzsu) {
                    return !zzsu.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzwj.zzf(obj, j2) != null;
            case 10:
                return !zzsu.zzb.equals(zzwj.zzf(obj, j2));
            case 11:
                return zzwj.zzc(obj, j2) != 0;
            case 12:
                return zzwj.zzc(obj, j2) != 0;
            case 13:
                return zzwj.zzc(obj, j2) != 0;
            case 14:
                return zzwj.zzd(obj, j2) != 0;
            case 15:
                return zzwj.zzc(obj, j2) != 0;
            case 16:
                return zzwj.zzd(obj, j2) != 0;
            case 17:
                return zzwj.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzz(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzy(obj, i) : (i3 & i4) != 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x025d, code lost:
    
        if (r0 > 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x026b, code lost:
    
        if (r0 > 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0279, code lost:
    
        if (r0 > 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0287, code lost:
    
        if (r0 > 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ad, code lost:
    
        if (zzC(r21, r15, r12) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00af, code lost:
    
        r0 = com.google.android.gms.internal.cast.zztc.zzx(r15 << 3) + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bc, code lost:
    
        if (zzC(r21, r15, r12) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        r0 = com.google.android.gms.internal.cast.zztc.zzx(r15 << 3) + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cb, code lost:
    
        if (zzC(r21, r15, r12) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cd, code lost:
    
        r0 = r15 << 3;
        r1 = com.google.android.gms.internal.cast.zztc.zzu(zzl(r21, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014c, code lost:
    
        if (zzC(r21, r15, r12) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0154, code lost:
    
        if (zzC(r21, r15, r12) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015c, code lost:
    
        if (zzC(r21, r15, r12) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0164, code lost:
    
        if (zzC(r21, r15, r12) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0166, code lost:
    
        r0 = r15 << 3;
        r1 = com.google.android.gms.internal.cast.zztc.zzy(zzp(r21, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0176, code lost:
    
        if (zzC(r21, r15, r12) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017d, code lost:
    
        if (zzC(r21, r15, r12) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0185, code lost:
    
        if (zzC(r21, r15, r12) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ca, code lost:
    
        if (r0 > 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01cc, code lost:
    
        r13 = r13 + ((com.google.android.gms.internal.cast.zztc.zzx(r15 << 3) + com.google.android.gms.internal.cast.zztc.zzx(r0)) + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01e5, code lost:
    
        if (r0 > 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01f2, code lost:
    
        if (r0 > 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ff, code lost:
    
        if (r0 > 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x020c, code lost:
    
        if (r0 > 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0219, code lost:
    
        if (r0 > 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0228, code lost:
    
        if (r0 > 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0235, code lost:
    
        if (r0 > 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0242, code lost:
    
        if (r0 > 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x024f, code lost:
    
        if (r0 > 0) goto L93;
     */
    @Override // com.google.android.gms.internal.cast.zzvi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        int zzy;
        int zzx;
        int i6;
        int zzx2;
        int i7;
        int zzx3;
        int zzx4;
        int zzd;
        int zzg;
        int size;
        int i8;
        int zzl;
        boolean z;
        List list;
        List list2;
        boolean z2;
        int zzx5;
        int zzx6;
        int size2;
        int i9;
        int zzk;
        int zzx7;
        int zze;
        int i10;
        Object object;
        Unsafe unsafe = zzb;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i14 < this.zzc.length) {
            int zzo = zzo(i14);
            int zzn = zzn(zzo);
            int[] iArr = this.zzc;
            int i16 = iArr[i14];
            int i17 = iArr[i14 + 2];
            int i18 = i17 & i11;
            if (zzn <= 17) {
                if (i18 != i12) {
                    i13 = i18 == i11 ? 0 : unsafe.getInt(obj, i18);
                    i12 = i18;
                }
                i3 = 1 << (i17 >>> 20);
                i = i12;
                i2 = i13;
            } else {
                i = i12;
                i2 = i13;
                i3 = 0;
            }
            int i19 = zzo & i11;
            if (zzn >= zztk.zzJ.zza()) {
                zztk.zzW.zza();
            }
            long j2 = i19;
            switch (zzn) {
                case 0:
                    i4 = i14;
                    if (!zzz(obj, i4, i, i2, i3)) {
                        i14 = i4 + 3;
                        i12 = i;
                        i13 = i2;
                        i11 = 1048575;
                    }
                    zzx = zztc.zzx(i16 << 3) + 8;
                    i15 += zzx;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 1:
                    i4 = i14;
                    if (!zzz(obj, i4, i, i2, i3)) {
                        i14 = i4 + 3;
                        i12 = i;
                        i13 = i2;
                        i11 = 1048575;
                    }
                    zzx = zztc.zzx(i16 << 3) + 4;
                    i15 += zzx;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 2:
                    i4 = i14;
                    j = j2;
                    if (!zzz(obj, i4, i, i2, i3)) {
                        i14 = i4 + 3;
                        i12 = i;
                        i13 = i2;
                        i11 = 1048575;
                    }
                    i5 = i16 << 3;
                    zzy = zztc.zzy(unsafe.getLong(obj, j));
                    zzx = zztc.zzx(i5) + zzy;
                    i15 += zzx;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 3:
                    i4 = i14;
                    j = j2;
                    if (!zzz(obj, i4, i, i2, i3)) {
                        i14 = i4 + 3;
                        i12 = i;
                        i13 = i2;
                        i11 = 1048575;
                    }
                    i5 = i16 << 3;
                    zzy = zztc.zzy(unsafe.getLong(obj, j));
                    zzx = zztc.zzx(i5) + zzy;
                    i15 += zzx;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 4:
                    i4 = i14;
                    if (zzz(obj, i4, i, i2, i3)) {
                        i5 = i16 << 3;
                        zzy = zztc.zzu(unsafe.getInt(obj, j2));
                        zzx = zztc.zzx(i5) + zzy;
                        i15 += zzx;
                        i14 = i4 + 3;
                        i12 = i;
                        i13 = i2;
                        i11 = 1048575;
                    } else {
                        i14 = i4 + 3;
                        i12 = i;
                        i13 = i2;
                        i11 = 1048575;
                    }
                case 5:
                    i4 = i14;
                    if (!zzz(obj, i4, i, i2, i3)) {
                        i14 = i4 + 3;
                        i12 = i;
                        i13 = i2;
                        i11 = 1048575;
                    }
                    zzx = zztc.zzx(i16 << 3) + 8;
                    i15 += zzx;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 6:
                    i4 = i14;
                    if (!zzz(obj, i4, i, i2, i3)) {
                        i14 = i4 + 3;
                        i12 = i;
                        i13 = i2;
                        i11 = 1048575;
                    }
                    zzx = zztc.zzx(i16 << 3) + 4;
                    i15 += zzx;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 7:
                    i4 = i14;
                    if (zzz(obj, i4, i, i2, i3)) {
                        zzx = zztc.zzx(i16 << 3) + 1;
                        i15 += zzx;
                        i14 = i4 + 3;
                        i12 = i;
                        i13 = i2;
                        i11 = 1048575;
                    } else {
                        i14 = i4 + 3;
                        i12 = i;
                        i13 = i2;
                        i11 = 1048575;
                    }
                case 8:
                    int i20 = i14;
                    i4 = i20;
                    if (zzz(obj, i20, i, i2, i3)) {
                        i5 = i16 << 3;
                        Object object2 = unsafe.getObject(obj, j2);
                        if (object2 instanceof zzsu) {
                            int i21 = zztc.$r8$clinit;
                            int zzd2 = ((zzsu) object2).zzd();
                            zzx = zztc.zzx(i5) + zztc.zzx(zzd2) + zzd2;
                            i15 += zzx;
                            i14 = i4 + 3;
                            i12 = i;
                            i13 = i2;
                            i11 = 1048575;
                        } else {
                            zzy = zztc.zzw((String) object2);
                            zzx = zztc.zzx(i5) + zzy;
                            i15 += zzx;
                            i14 = i4 + 3;
                            i12 = i;
                            i13 = i2;
                            i11 = 1048575;
                        }
                    } else {
                        i14 = i4 + 3;
                        i12 = i;
                        i13 = i2;
                        i11 = 1048575;
                    }
                case 9:
                    i6 = i14;
                    if (zzz(obj, i6, i, i2, i3)) {
                        i15 += zzvk.zzh(i16, unsafe.getObject(obj, j2), zzq(i6));
                        i4 = i6;
                        i14 = i4 + 3;
                        i12 = i;
                        i13 = i2;
                        i11 = 1048575;
                    }
                    i4 = i6;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 10:
                    i6 = i14;
                    if (zzz(obj, i6, i, i2, i3)) {
                        zzsu zzsuVar = (zzsu) unsafe.getObject(obj, j2);
                        int i22 = zztc.$r8$clinit;
                        int zzd3 = zzsuVar.zzd();
                        zzx2 = zztc.zzx(i16 << 3) + zztc.zzx(zzd3) + zzd3;
                        i15 += zzx2;
                    }
                    i4 = i6;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 11:
                    i6 = i14;
                    if (zzz(obj, i6, i, i2, i3)) {
                        i7 = i16 << 3;
                        zzx3 = zztc.zzx(unsafe.getInt(obj, j2));
                        zzx4 = zztc.zzx(i7);
                        zzx2 = zzx4 + zzx3;
                        i15 += zzx2;
                    }
                    i4 = i6;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 12:
                    i6 = i14;
                    if (zzz(obj, i6, i, i2, i3)) {
                        i7 = i16 << 3;
                        zzx3 = zztc.zzu(unsafe.getInt(obj, j2));
                        zzx4 = zztc.zzx(i7);
                        zzx2 = zzx4 + zzx3;
                        i15 += zzx2;
                    }
                    i4 = i6;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 13:
                    i6 = i14;
                    if (zzz(obj, i6, i, i2, i3)) {
                        zzx2 = zztc.zzx(i16 << 3) + 4;
                        i15 += zzx2;
                    }
                    i4 = i6;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 14:
                    i6 = i14;
                    if (zzz(obj, i6, i, i2, i3)) {
                        zzx2 = zztc.zzx(i16 << 3) + 8;
                        i15 += zzx2;
                    }
                    i4 = i6;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 15:
                    i6 = i14;
                    if (zzz(obj, i6, i, i2, i3)) {
                        int i23 = unsafe.getInt(obj, j2);
                        zzx4 = zztc.zzx(i16 << 3);
                        zzx3 = zztc.zzx((i23 >> 31) ^ (i23 + i23));
                        zzx2 = zzx4 + zzx3;
                        i15 += zzx2;
                    }
                    i4 = i6;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 16:
                    i6 = i14;
                    if (zzz(obj, i14, i, i2, i3)) {
                        long j3 = unsafe.getLong(obj, j2);
                        zzx4 = zztc.zzx(i16 << 3);
                        zzx3 = zztc.zzy((j3 >> 63) ^ (j3 + j3));
                        zzx2 = zzx4 + zzx3;
                        i15 += zzx2;
                    }
                    i4 = i6;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 17:
                    if (zzz(obj, i14, i, i2, i3)) {
                        i15 += zztc.zzt(i16, (zzux) unsafe.getObject(obj, j2), zzq(i14));
                    }
                    i4 = i14;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 18:
                    zzd = zzvk.zzd(i16, (List) unsafe.getObject(obj, j2), false);
                    i15 += zzd;
                    i4 = i14;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 19:
                    zzd = zzvk.zzb(i16, (List) unsafe.getObject(obj, j2), false);
                    i15 += zzd;
                    i4 = i14;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 20:
                    List list3 = (List) unsafe.getObject(obj, j2);
                    int i24 = zzvk.$r8$clinit;
                    if (list3.size() != 0) {
                        zzg = zzvk.zzg(list3) + (list3.size() * zztc.zzx(i16 << 3));
                        i15 += zzg;
                        i4 = i14;
                        i14 = i4 + 3;
                        i12 = i;
                        i13 = i2;
                        i11 = 1048575;
                    }
                    zzg = 0;
                    i15 += zzg;
                    i4 = i14;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 21:
                    List list4 = (List) unsafe.getObject(obj, j2);
                    int i25 = zzvk.$r8$clinit;
                    size = list4.size();
                    if (size != 0) {
                        i8 = i16 << 3;
                        zzl = zzvk.zzl(list4);
                        zzg = zzl + (size * zztc.zzx(i8));
                        i15 += zzg;
                        i4 = i14;
                        i14 = i4 + 3;
                        i12 = i;
                        i13 = i2;
                        i11 = 1048575;
                    }
                    zzg = 0;
                    i15 += zzg;
                    i4 = i14;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 22:
                    List list5 = (List) unsafe.getObject(obj, j2);
                    int i26 = zzvk.$r8$clinit;
                    size = list5.size();
                    if (size != 0) {
                        i8 = i16 << 3;
                        zzl = zzvk.zzf(list5);
                        zzg = zzl + (size * zztc.zzx(i8));
                        i15 += zzg;
                        i4 = i14;
                        i14 = i4 + 3;
                        i12 = i;
                        i13 = i2;
                        i11 = 1048575;
                    }
                    zzg = 0;
                    i15 += zzg;
                    i4 = i14;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 23:
                    z = false;
                    list = (List) unsafe.getObject(obj, j2);
                    zzd = zzvk.zzd(i16, list, z);
                    i15 += zzd;
                    i4 = i14;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 24:
                    list2 = (List) unsafe.getObject(obj, j2);
                    z2 = false;
                    zzd = zzvk.zzb(i16, list2, z2);
                    i15 += zzd;
                    i4 = i14;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 25:
                    List list6 = (List) unsafe.getObject(obj, j2);
                    int i27 = zzvk.$r8$clinit;
                    int size3 = list6.size();
                    if (size3 != 0) {
                        zzd = size3 * (zztc.zzx(i16 << 3) + 1);
                        i15 += zzd;
                        i4 = i14;
                        i14 = i4 + 3;
                        i12 = i;
                        i13 = i2;
                        i11 = 1048575;
                    }
                    zzd = 0;
                    i15 += zzd;
                    i4 = i14;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 26:
                    List list7 = (List) unsafe.getObject(obj, j2);
                    int i28 = zzvk.$r8$clinit;
                    int size4 = list7.size();
                    if (size4 != 0) {
                        boolean z3 = list7 instanceof zzuf;
                        int zzx8 = zztc.zzx(i16 << 3) * size4;
                        if (z3) {
                            zzuf zzufVar = (zzuf) list7;
                            zzg = zzx8;
                            for (int i29 = 0; i29 < size4; i29++) {
                                Object zze2 = zzufVar.zze(i29);
                                if (zze2 instanceof zzsu) {
                                    int zzd4 = ((zzsu) zze2).zzd();
                                    zzg += zztc.zzx(zzd4) + zzd4;
                                } else {
                                    zzg += zztc.zzw((String) zze2);
                                }
                            }
                        } else {
                            zzg = zzx8;
                            for (int i30 = 0; i30 < size4; i30++) {
                                Object obj2 = list7.get(i30);
                                if (obj2 instanceof zzsu) {
                                    int zzd5 = ((zzsu) obj2).zzd();
                                    zzg += zztc.zzx(zzd5) + zzd5;
                                } else {
                                    zzg += zztc.zzw((String) obj2);
                                }
                            }
                        }
                        i15 += zzg;
                        i4 = i14;
                        i14 = i4 + 3;
                        i12 = i;
                        i13 = i2;
                        i11 = 1048575;
                    }
                    zzg = 0;
                    i15 += zzg;
                    i4 = i14;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 27:
                    List list8 = (List) unsafe.getObject(obj, j2);
                    zzvi zzq = zzq(i14);
                    int i31 = zzvk.$r8$clinit;
                    int size5 = list8.size();
                    if (size5 != 0) {
                        zzx5 = zztc.zzx(i16 << 3) * size5;
                        for (int i32 = 0; i32 < size5; i32++) {
                            zzx5 += zztc.zzv((zzux) list8.get(i32), zzq);
                        }
                        i15 += zzx5;
                        i4 = i14;
                        i14 = i4 + 3;
                        i12 = i;
                        i13 = i2;
                        i11 = 1048575;
                    }
                    zzx5 = 0;
                    i15 += zzx5;
                    i4 = i14;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 28:
                    List list9 = (List) unsafe.getObject(obj, j2);
                    int i33 = zzvk.$r8$clinit;
                    int size6 = list9.size();
                    if (size6 == 0) {
                        zzx6 = 0;
                    } else {
                        zzx6 = size6 * zztc.zzx(i16 << 3);
                        for (int i34 = 0; i34 < list9.size(); i34++) {
                            int zzd6 = ((zzsu) list9.get(i34)).zzd();
                            zzx6 += zztc.zzx(zzd6) + zzd6;
                        }
                    }
                    i15 += zzx6;
                    i4 = i14;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 29:
                    List list10 = (List) unsafe.getObject(obj, j2);
                    int i35 = zzvk.$r8$clinit;
                    size2 = list10.size();
                    if (size2 != 0) {
                        i9 = i16 << 3;
                        zzk = zzvk.zzk(list10);
                        zzx7 = size2 * zztc.zzx(i9);
                        zzd = zzk + zzx7;
                        i15 += zzd;
                        i4 = i14;
                        i14 = i4 + 3;
                        i12 = i;
                        i13 = i2;
                        i11 = 1048575;
                    }
                    zzd = 0;
                    i15 += zzd;
                    i4 = i14;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 30:
                    List list11 = (List) unsafe.getObject(obj, j2);
                    int i36 = zzvk.$r8$clinit;
                    size2 = list11.size();
                    if (size2 != 0) {
                        i9 = i16 << 3;
                        zzk = zzvk.zza(list11);
                        zzx7 = size2 * zztc.zzx(i9);
                        zzd = zzk + zzx7;
                        i15 += zzd;
                        i4 = i14;
                        i14 = i4 + 3;
                        i12 = i;
                        i13 = i2;
                        i11 = 1048575;
                    }
                    zzd = 0;
                    i15 += zzd;
                    i4 = i14;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 31:
                    z2 = false;
                    list2 = (List) unsafe.getObject(obj, j2);
                    zzd = zzvk.zzb(i16, list2, z2);
                    i15 += zzd;
                    i4 = i14;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 32:
                    list = (List) unsafe.getObject(obj, j2);
                    z = false;
                    zzd = zzvk.zzd(i16, list, z);
                    i15 += zzd;
                    i4 = i14;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 33:
                    List list12 = (List) unsafe.getObject(obj, j2);
                    int i37 = zzvk.$r8$clinit;
                    size2 = list12.size();
                    if (size2 != 0) {
                        i9 = i16 << 3;
                        zzk = zzvk.zzi(list12);
                        zzx7 = size2 * zztc.zzx(i9);
                        zzd = zzk + zzx7;
                        i15 += zzd;
                        i4 = i14;
                        i14 = i4 + 3;
                        i12 = i;
                        i13 = i2;
                        i11 = 1048575;
                    }
                    zzd = 0;
                    i15 += zzd;
                    i4 = i14;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 34:
                    List list13 = (List) unsafe.getObject(obj, j2);
                    int i38 = zzvk.$r8$clinit;
                    size2 = list13.size();
                    if (size2 != 0) {
                        i9 = i16 << 3;
                        zzk = zzvk.zzj(list13);
                        zzx7 = size2 * zztc.zzx(i9);
                        zzd = zzk + zzx7;
                        i15 += zzd;
                        i4 = i14;
                        i14 = i4 + 3;
                        i12 = i;
                        i13 = i2;
                        i11 = 1048575;
                    }
                    zzd = 0;
                    i15 += zzd;
                    i4 = i14;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 35:
                    zze = zzvk.zze((List) unsafe.getObject(obj, j2));
                    break;
                case 36:
                    zze = zzvk.zzc((List) unsafe.getObject(obj, j2));
                    break;
                case 37:
                    zze = zzvk.zzg((List) unsafe.getObject(obj, j2));
                    break;
                case 38:
                    zze = zzvk.zzl((List) unsafe.getObject(obj, j2));
                    break;
                case 39:
                    zze = zzvk.zzf((List) unsafe.getObject(obj, j2));
                    break;
                case 40:
                    zze = zzvk.zze((List) unsafe.getObject(obj, j2));
                    break;
                case 41:
                    zze = zzvk.zzc((List) unsafe.getObject(obj, j2));
                    break;
                case 42:
                    List list14 = (List) unsafe.getObject(obj, j2);
                    int i39 = zzvk.$r8$clinit;
                    zze = list14.size();
                    break;
                case 43:
                    zze = zzvk.zzk((List) unsafe.getObject(obj, j2));
                    break;
                case 44:
                    zze = zzvk.zza((List) unsafe.getObject(obj, j2));
                    break;
                case 45:
                    zze = zzvk.zzc((List) unsafe.getObject(obj, j2));
                    break;
                case 46:
                    zze = zzvk.zze((List) unsafe.getObject(obj, j2));
                    break;
                case 47:
                    zze = zzvk.zzi((List) unsafe.getObject(obj, j2));
                    break;
                case 48:
                    zze = zzvk.zzj((List) unsafe.getObject(obj, j2));
                    break;
                case 49:
                    List list15 = (List) unsafe.getObject(obj, j2);
                    zzvi zzq2 = zzq(i14);
                    int i40 = zzvk.$r8$clinit;
                    int size7 = list15.size();
                    if (size7 != 0) {
                        zzx5 = 0;
                        for (int i41 = 0; i41 < size7; i41++) {
                            zzx5 += zztc.zzt(i16, (zzux) list15.get(i41), zzq2);
                        }
                        i15 += zzx5;
                        i4 = i14;
                        i14 = i4 + 3;
                        i12 = i;
                        i13 = i2;
                        i11 = 1048575;
                    }
                    zzx5 = 0;
                    i15 += zzx5;
                    i4 = i14;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 50:
                    Object object3 = unsafe.getObject(obj, j2);
                    Object zzr = zzr(i14);
                    ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0.m(object3);
                    ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0.m(zzr);
                    throw null;
                case 51:
                    break;
                case 52:
                    break;
                case 53:
                    break;
                case 54:
                    break;
                case 55:
                    break;
                case 56:
                    break;
                case 57:
                    break;
                case 58:
                    if (zzC(obj, i16, i14)) {
                        zzd = zztc.zzx(i16 << 3) + 1;
                        i15 += zzd;
                    }
                    i4 = i14;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 59:
                    if (zzC(obj, i16, i14)) {
                        i10 = i16 << 3;
                        object = unsafe.getObject(obj, j2);
                        if (!(object instanceof zzsu)) {
                            zzx7 = zztc.zzw((String) object);
                            zzk = zztc.zzx(i10);
                            zzd = zzk + zzx7;
                            i15 += zzd;
                        }
                        int i42 = zztc.$r8$clinit;
                        int zzd7 = ((zzsu) object).zzd();
                        zzd = zztc.zzx(i10) + zztc.zzx(zzd7) + zzd7;
                        i15 += zzd;
                    }
                    i4 = i14;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 60:
                    if (zzC(obj, i16, i14)) {
                        zzd = zzvk.zzh(i16, unsafe.getObject(obj, j2), zzq(i14));
                        i15 += zzd;
                    }
                    i4 = i14;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 61:
                    if (zzC(obj, i16, i14)) {
                        i10 = i16 << 3;
                        object = unsafe.getObject(obj, j2);
                        int i422 = zztc.$r8$clinit;
                        int zzd72 = ((zzsu) object).zzd();
                        zzd = zztc.zzx(i10) + zztc.zzx(zzd72) + zzd72;
                        i15 += zzd;
                    }
                    i4 = i14;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 62:
                    if (zzC(obj, i16, i14)) {
                        i10 = i16 << 3;
                        zzx7 = zztc.zzx(zzl(obj, j2));
                        zzk = zztc.zzx(i10);
                        zzd = zzk + zzx7;
                        i15 += zzd;
                    }
                    i4 = i14;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 63:
                    break;
                case 64:
                    break;
                case 65:
                    break;
                case 66:
                    if (zzC(obj, i16, i14)) {
                        int zzl2 = zzl(obj, j2);
                        zzk = zztc.zzx(i16 << 3);
                        zzx7 = zztc.zzx((zzl2 >> 31) ^ (zzl2 + zzl2));
                        zzd = zzk + zzx7;
                        i15 += zzd;
                    }
                    i4 = i14;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 67:
                    if (zzC(obj, i16, i14)) {
                        long zzp = zzp(obj, j2);
                        zzk = zztc.zzx(i16 << 3);
                        zzx7 = zztc.zzy((zzp >> 63) ^ (zzp + zzp));
                        zzd = zzk + zzx7;
                        i15 += zzd;
                    }
                    i4 = i14;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                case 68:
                    if (zzC(obj, i16, i14)) {
                        zzd = zztc.zzt(i16, (zzux) unsafe.getObject(obj, j2), zzq(i14));
                        i15 += zzd;
                    }
                    i4 = i14;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
                default:
                    i4 = i14;
                    i14 = i4 + 3;
                    i12 = i;
                    i13 = i2;
                    i11 = 1048575;
            }
        }
        zzvz zzvzVar = this.zzj;
        int zza2 = i15 + zzvzVar.zza(zzvzVar.zzc(obj));
        if (!this.zzf) {
            return zza2;
        }
        this.zzk.zza(obj);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f3, code lost:
    
        if (r2 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f5, code lost:
    
        r6 = r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f9, code lost:
    
        r1 = r1 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0111, code lost:
    
        if (r2 != null) goto L69;
     */
    @Override // com.google.android.gms.internal.cast.zzvi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(Object obj) {
        int i;
        double zza2;
        int i2;
        float zzb2;
        boolean zzw;
        int i3;
        Object zzf;
        int zzc;
        long zzd;
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int zzo = zzo(i5);
            int[] iArr = this.zzc;
            int i6 = 1048575 & zzo;
            int zzn = zzn(zzo);
            int i7 = iArr[i5];
            long j = i6;
            int i8 = 37;
            switch (zzn) {
                case 0:
                    i = i4 * 53;
                    zza2 = zzwj.zza(obj, j);
                    zzd = Double.doubleToLongBits(zza2);
                    byte[] bArr = zzty.zzd;
                    i4 = i + ((int) (zzd ^ (zzd >>> 32)));
                    break;
                case 1:
                    i2 = i4 * 53;
                    zzb2 = zzwj.zzb(obj, j);
                    zzc = Float.floatToIntBits(zzb2);
                    i4 = i2 + zzc;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i = i4 * 53;
                    zzd = zzwj.zzd(obj, j);
                    byte[] bArr2 = zzty.zzd;
                    i4 = i + ((int) (zzd ^ (zzd >>> 32)));
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i2 = i4 * 53;
                    zzc = zzwj.zzc(obj, j);
                    i4 = i2 + zzc;
                    break;
                case 7:
                    i2 = i4 * 53;
                    zzw = zzwj.zzw(obj, j);
                    zzc = zzty.zza(zzw);
                    i4 = i2 + zzc;
                    break;
                case 8:
                    i2 = i4 * 53;
                    zzc = ((String) zzwj.zzf(obj, j)).hashCode();
                    i4 = i2 + zzc;
                    break;
                case 9:
                    i3 = i4 * 53;
                    zzf = zzwj.zzf(obj, j);
                    break;
                case 10:
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
                case 50:
                    i2 = i4 * 53;
                    zzc = zzwj.zzf(obj, j).hashCode();
                    i4 = i2 + zzc;
                    break;
                case 17:
                    i3 = i4 * 53;
                    zzf = zzwj.zzf(obj, j);
                    break;
                case 51:
                    if (zzC(obj, i7, i5)) {
                        i = i4 * 53;
                        zza2 = zzj(obj, j);
                        zzd = Double.doubleToLongBits(zza2);
                        byte[] bArr22 = zzty.zzd;
                        i4 = i + ((int) (zzd ^ (zzd >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzC(obj, i7, i5)) {
                        i2 = i4 * 53;
                        zzb2 = zzk(obj, j);
                        zzc = Float.floatToIntBits(zzb2);
                        i4 = i2 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (!zzC(obj, i7, i5)) {
                        break;
                    }
                    i = i4 * 53;
                    zzd = zzp(obj, j);
                    byte[] bArr222 = zzty.zzd;
                    i4 = i + ((int) (zzd ^ (zzd >>> 32)));
                    break;
                case 54:
                    if (!zzC(obj, i7, i5)) {
                        break;
                    }
                    i = i4 * 53;
                    zzd = zzp(obj, j);
                    byte[] bArr2222 = zzty.zzd;
                    i4 = i + ((int) (zzd ^ (zzd >>> 32)));
                    break;
                case 55:
                    if (!zzC(obj, i7, i5)) {
                        break;
                    }
                    i2 = i4 * 53;
                    zzc = zzl(obj, j);
                    i4 = i2 + zzc;
                    break;
                case 56:
                    if (!zzC(obj, i7, i5)) {
                        break;
                    }
                    i = i4 * 53;
                    zzd = zzp(obj, j);
                    byte[] bArr22222 = zzty.zzd;
                    i4 = i + ((int) (zzd ^ (zzd >>> 32)));
                    break;
                case 57:
                    if (!zzC(obj, i7, i5)) {
                        break;
                    }
                    i2 = i4 * 53;
                    zzc = zzl(obj, j);
                    i4 = i2 + zzc;
                    break;
                case 58:
                    if (zzC(obj, i7, i5)) {
                        i2 = i4 * 53;
                        zzw = zzD(obj, j);
                        zzc = zzty.zza(zzw);
                        i4 = i2 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzC(obj, i7, i5)) {
                        break;
                    }
                    i2 = i4 * 53;
                    zzc = ((String) zzwj.zzf(obj, j)).hashCode();
                    i4 = i2 + zzc;
                    break;
                case 60:
                    if (!zzC(obj, i7, i5)) {
                        break;
                    }
                    i2 = i4 * 53;
                    zzc = zzwj.zzf(obj, j).hashCode();
                    i4 = i2 + zzc;
                    break;
                case 61:
                    if (!zzC(obj, i7, i5)) {
                        break;
                    }
                    i2 = i4 * 53;
                    zzc = zzwj.zzf(obj, j).hashCode();
                    i4 = i2 + zzc;
                    break;
                case 62:
                    if (!zzC(obj, i7, i5)) {
                        break;
                    }
                    i2 = i4 * 53;
                    zzc = zzl(obj, j);
                    i4 = i2 + zzc;
                    break;
                case 63:
                    if (!zzC(obj, i7, i5)) {
                        break;
                    }
                    i2 = i4 * 53;
                    zzc = zzl(obj, j);
                    i4 = i2 + zzc;
                    break;
                case 64:
                    if (!zzC(obj, i7, i5)) {
                        break;
                    }
                    i2 = i4 * 53;
                    zzc = zzl(obj, j);
                    i4 = i2 + zzc;
                    break;
                case 65:
                    if (!zzC(obj, i7, i5)) {
                        break;
                    }
                    i = i4 * 53;
                    zzd = zzp(obj, j);
                    byte[] bArr222222 = zzty.zzd;
                    i4 = i + ((int) (zzd ^ (zzd >>> 32)));
                    break;
                case 66:
                    if (!zzC(obj, i7, i5)) {
                        break;
                    }
                    i2 = i4 * 53;
                    zzc = zzl(obj, j);
                    i4 = i2 + zzc;
                    break;
                case 67:
                    if (!zzC(obj, i7, i5)) {
                        break;
                    }
                    i = i4 * 53;
                    zzd = zzp(obj, j);
                    byte[] bArr2222222 = zzty.zzd;
                    i4 = i + ((int) (zzd ^ (zzd >>> 32)));
                    break;
                case 68:
                    if (!zzC(obj, i7, i5)) {
                        break;
                    }
                    i2 = i4 * 53;
                    zzc = zzwj.zzf(obj, j).hashCode();
                    i4 = i2 + zzc;
                    break;
            }
        }
        int hashCode = (i4 * 53) + this.zzj.zzc(obj).hashCode();
        if (!this.zzf) {
            return hashCode;
        }
        this.zzk.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.zzvi
    public final Object zzc() {
        return ((zztp) this.zze).zzx();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        continue;
     */
    @Override // com.google.android.gms.internal.cast.zzvi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(Object obj) {
        int i;
        if (zzB(obj)) {
            if (obj instanceof zztp) {
                zztp zztpVar = (zztp) obj;
                zztpVar.zzI(ConnectionsManager.DEFAULT_DATACENTER_ID);
                zztpVar.zza = 0;
                zztpVar.zzG();
            }
            int[] iArr = this.zzc;
            while (i < iArr.length) {
                int zzo = zzo(i);
                int i2 = 1048575 & zzo;
                int zzn = zzn(zzo);
                long j = i2;
                if (zzn != 9) {
                    if (zzn == 60 || zzn == 68) {
                        if (!zzC(obj, this.zzc[i], i)) {
                        }
                        zzq(i).zzd(zzb.getObject(obj, j));
                    } else {
                        switch (zzn) {
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
                                this.zzi.zza(obj, j);
                                continue;
                            case 50:
                                Object object = zzb.getObject(obj, j);
                                if (object != null) {
                                    ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0.m(object);
                                    throw null;
                                }
                                continue;
                        }
                        zzq(i).zzd(zzb.getObject(obj, j));
                    }
                }
                i = zzy(obj, i) ? 0 : i + 3;
                zzq(i).zzd(zzb.getObject(obj, j));
            }
            this.zzj.zze(obj);
            if (this.zzf) {
                this.zzk.zzb(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.zzvi
    public final void zze(Object obj, Object obj2) {
        int i;
        if (!zzB(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        while (i < this.zzc.length) {
            int zzo = zzo(i);
            int i2 = 1048575 & zzo;
            int[] iArr = this.zzc;
            int zzn = zzn(zzo);
            int i3 = iArr[i];
            long j = i2;
            switch (zzn) {
                case 0:
                    if (zzy(obj2, i)) {
                        zzwj.zzo(obj, j, zzwj.zza(obj2, j));
                        zzv(obj, i);
                    }
                case 1:
                    if (zzy(obj2, i)) {
                        zzwj.zzp(obj, j, zzwj.zzb(obj2, j));
                        zzv(obj, i);
                    }
                case 2:
                    i = zzy(obj2, i) ? 0 : i + 3;
                    zzwj.zzr(obj, j, zzwj.zzd(obj2, j));
                    zzv(obj, i);
                case 3:
                    if (!zzy(obj2, i)) {
                    }
                    zzwj.zzr(obj, j, zzwj.zzd(obj2, j));
                    zzv(obj, i);
                case 4:
                    if (!zzy(obj2, i)) {
                    }
                    zzwj.zzq(obj, j, zzwj.zzc(obj2, j));
                    zzv(obj, i);
                case 5:
                    if (!zzy(obj2, i)) {
                    }
                    zzwj.zzr(obj, j, zzwj.zzd(obj2, j));
                    zzv(obj, i);
                case 6:
                    if (!zzy(obj2, i)) {
                    }
                    zzwj.zzq(obj, j, zzwj.zzc(obj2, j));
                    zzv(obj, i);
                case 7:
                    if (zzy(obj2, i)) {
                        zzwj.zzm(obj, j, zzwj.zzw(obj2, j));
                        zzv(obj, i);
                    }
                case 8:
                    if (!zzy(obj2, i)) {
                    }
                    zzwj.zzs(obj, j, zzwj.zzf(obj2, j));
                    zzv(obj, i);
                case 9:
                case 17:
                    zzt(obj, obj2, i);
                case 10:
                    if (!zzy(obj2, i)) {
                    }
                    zzwj.zzs(obj, j, zzwj.zzf(obj2, j));
                    zzv(obj, i);
                case 11:
                    if (!zzy(obj2, i)) {
                    }
                    zzwj.zzq(obj, j, zzwj.zzc(obj2, j));
                    zzv(obj, i);
                case 12:
                    if (!zzy(obj2, i)) {
                    }
                    zzwj.zzq(obj, j, zzwj.zzc(obj2, j));
                    zzv(obj, i);
                case 13:
                    if (!zzy(obj2, i)) {
                    }
                    zzwj.zzq(obj, j, zzwj.zzc(obj2, j));
                    zzv(obj, i);
                case 14:
                    if (!zzy(obj2, i)) {
                    }
                    zzwj.zzr(obj, j, zzwj.zzd(obj2, j));
                    zzv(obj, i);
                case 15:
                    if (!zzy(obj2, i)) {
                    }
                    zzwj.zzq(obj, j, zzwj.zzc(obj2, j));
                    zzv(obj, i);
                case 16:
                    if (!zzy(obj2, i)) {
                    }
                    zzwj.zzr(obj, j, zzwj.zzd(obj2, j));
                    zzv(obj, i);
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
                    this.zzi.zzb(obj, obj2, j);
                case 50:
                    int i4 = zzvk.$r8$clinit;
                    Object zzf = zzwj.zzf(obj, j);
                    Object zzf2 = zzwj.zzf(obj2, j);
                    ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0.m(zzf);
                    ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0.m(zzf2);
                    throw null;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!zzC(obj2, i3, i)) {
                    }
                    zzwj.zzs(obj, j, zzwj.zzf(obj2, j));
                    zzw(obj, i3, i);
                case 60:
                case 68:
                    zzu(obj, obj2, i);
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzC(obj2, i3, i)) {
                    }
                    zzwj.zzs(obj, j, zzwj.zzf(obj2, j));
                    zzw(obj, i3, i);
                default:
            }
        }
        zzvk.zzo(this.zzj, obj, obj2);
        if (this.zzf) {
            this.zzk.zza(obj2);
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v20 */
    @Override // com.google.android.gms.internal.cast.zzvi
    public final void zzf(Object obj, zzwq zzwqVar) {
        int i;
        int i2;
        int i3;
        ?? r9 = 1;
        Throwable th = null;
        if (this.zzf) {
            this.zzk.zza(obj);
            throw null;
        }
        int[] iArr = this.zzc;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i7 < iArr.length) {
            int zzo = zzo(i7);
            int[] iArr2 = this.zzc;
            int zzn = zzn(zzo);
            int i8 = iArr2[i7];
            if (zzn <= 17) {
                int i9 = iArr2[i7 + 2];
                int i10 = i9 & i4;
                if (i10 != i5) {
                    i6 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i = i5;
                i2 = i6;
                i3 = r9 << (i9 >>> 20);
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
            }
            long j = zzo & i4;
            switch (zzn) {
                case 0:
                    if (zzz(obj, i7, i, i2, i3)) {
                        zzwqVar.zzf(i8, zzwj.zza(obj, j));
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 1:
                    if (zzz(obj, i7, i, i2, i3)) {
                        zzwqVar.zzn(i8, zzwj.zzb(obj, j));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 2:
                    if (zzz(obj, i7, i, i2, i3)) {
                        zzwqVar.zzs(i8, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 3:
                    if (zzz(obj, i7, i, i2, i3)) {
                        zzwqVar.zzH(i8, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 4:
                    if (zzz(obj, i7, i, i2, i3)) {
                        zzwqVar.zzq(i8, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 5:
                    if (zzz(obj, i7, i, i2, i3)) {
                        zzwqVar.zzl(i8, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 6:
                    if (zzz(obj, i7, i, i2, i3)) {
                        zzwqVar.zzj(i8, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 7:
                    if (zzz(obj, i7, i, i2, i3)) {
                        zzwqVar.zzb(i8, zzwj.zzw(obj, j));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 8:
                    if (zzz(obj, i7, i, i2, i3)) {
                        zzE(i8, unsafe.getObject(obj, j), zzwqVar);
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 9:
                    if (zzz(obj, i7, i, i2, i3)) {
                        zzwqVar.zzu(i8, unsafe.getObject(obj, j), zzq(i7));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 10:
                    if (zzz(obj, i7, i, i2, i3)) {
                        zzwqVar.zzd(i8, (zzsu) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 11:
                    if (zzz(obj, i7, i, i2, i3)) {
                        zzwqVar.zzF(i8, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 12:
                    if (zzz(obj, i7, i, i2, i3)) {
                        zzwqVar.zzh(i8, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 13:
                    if (zzz(obj, i7, i, i2, i3)) {
                        zzwqVar.zzv(i8, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 14:
                    if (zzz(obj, i7, i, i2, i3)) {
                        zzwqVar.zzx(i8, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 15:
                    if (zzz(obj, i7, i, i2, i3)) {
                        zzwqVar.zzz(i8, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 16:
                    if (zzz(obj, i7, i, i2, i3)) {
                        zzwqVar.zzB(i8, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 17:
                    if (zzz(obj, i7, i, i2, i3)) {
                        zzwqVar.zzp(i8, unsafe.getObject(obj, j), zzq(i7));
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 18:
                    zzvk.zzr(this.zzc[i7], (List) unsafe.getObject(obj, j), zzwqVar, false);
                    break;
                case 19:
                    zzvk.zzv(this.zzc[i7], (List) unsafe.getObject(obj, j), zzwqVar, false);
                    break;
                case 20:
                    zzvk.zzx(this.zzc[i7], (List) unsafe.getObject(obj, j), zzwqVar, false);
                    break;
                case 21:
                    zzvk.zzD(this.zzc[i7], (List) unsafe.getObject(obj, j), zzwqVar, false);
                    break;
                case 22:
                    zzvk.zzw(this.zzc[i7], (List) unsafe.getObject(obj, j), zzwqVar, false);
                    break;
                case 23:
                    zzvk.zzu(this.zzc[i7], (List) unsafe.getObject(obj, j), zzwqVar, false);
                    break;
                case 24:
                    zzvk.zzt(this.zzc[i7], (List) unsafe.getObject(obj, j), zzwqVar, false);
                    break;
                case 25:
                    zzvk.zzq(this.zzc[i7], (List) unsafe.getObject(obj, j), zzwqVar, false);
                    break;
                case 26:
                    int i11 = this.zzc[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    int i12 = zzvk.$r8$clinit;
                    if (list != null && !list.isEmpty()) {
                        zzwqVar.zzE(i11, list);
                        break;
                    }
                    break;
                case 27:
                    int i13 = this.zzc[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zzvi zzq = zzq(i7);
                    int i14 = zzvk.$r8$clinit;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i15 = 0; i15 < list2.size(); i15 += r9) {
                            ((zztd) zzwqVar).zzu(i13, list2.get(i15), zzq);
                        }
                        break;
                    }
                    break;
                case 28:
                    int i16 = this.zzc[i7];
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i17 = zzvk.$r8$clinit;
                    if (list3 != null && !list3.isEmpty()) {
                        zzwqVar.zze(i16, list3);
                        break;
                    }
                    break;
                case 29:
                    zzvk.zzC(this.zzc[i7], (List) unsafe.getObject(obj, j), zzwqVar, false);
                    break;
                case 30:
                    zzvk.zzs(this.zzc[i7], (List) unsafe.getObject(obj, j), zzwqVar, false);
                    break;
                case 31:
                    zzvk.zzy(this.zzc[i7], (List) unsafe.getObject(obj, j), zzwqVar, false);
                    break;
                case 32:
                    zzvk.zzz(this.zzc[i7], (List) unsafe.getObject(obj, j), zzwqVar, false);
                    break;
                case 33:
                    zzvk.zzA(this.zzc[i7], (List) unsafe.getObject(obj, j), zzwqVar, false);
                    break;
                case 34:
                    zzvk.zzB(this.zzc[i7], (List) unsafe.getObject(obj, j), zzwqVar, false);
                    break;
                case 35:
                    zzvk.zzr(this.zzc[i7], (List) unsafe.getObject(obj, j), zzwqVar, r9);
                    break;
                case 36:
                    zzvk.zzv(this.zzc[i7], (List) unsafe.getObject(obj, j), zzwqVar, r9);
                    break;
                case 37:
                    zzvk.zzx(this.zzc[i7], (List) unsafe.getObject(obj, j), zzwqVar, r9);
                    break;
                case 38:
                    zzvk.zzD(this.zzc[i7], (List) unsafe.getObject(obj, j), zzwqVar, r9);
                    break;
                case 39:
                    zzvk.zzw(this.zzc[i7], (List) unsafe.getObject(obj, j), zzwqVar, r9);
                    break;
                case 40:
                    zzvk.zzu(this.zzc[i7], (List) unsafe.getObject(obj, j), zzwqVar, r9);
                    break;
                case 41:
                    zzvk.zzt(this.zzc[i7], (List) unsafe.getObject(obj, j), zzwqVar, r9);
                    break;
                case 42:
                    zzvk.zzq(this.zzc[i7], (List) unsafe.getObject(obj, j), zzwqVar, r9);
                    break;
                case 43:
                    zzvk.zzC(this.zzc[i7], (List) unsafe.getObject(obj, j), zzwqVar, r9);
                    break;
                case 44:
                    zzvk.zzs(this.zzc[i7], (List) unsafe.getObject(obj, j), zzwqVar, r9);
                    break;
                case 45:
                    zzvk.zzy(this.zzc[i7], (List) unsafe.getObject(obj, j), zzwqVar, r9);
                    break;
                case 46:
                    zzvk.zzz(this.zzc[i7], (List) unsafe.getObject(obj, j), zzwqVar, r9);
                    break;
                case 47:
                    zzvk.zzA(this.zzc[i7], (List) unsafe.getObject(obj, j), zzwqVar, r9);
                    break;
                case 48:
                    zzvk.zzB(this.zzc[i7], (List) unsafe.getObject(obj, j), zzwqVar, r9);
                    break;
                case 49:
                    int i18 = this.zzc[i7];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zzvi zzq2 = zzq(i7);
                    int i19 = zzvk.$r8$clinit;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i20 = 0; i20 < list4.size(); i20 += r9) {
                            ((zztd) zzwqVar).zzp(i18, list4.get(i20), zzq2);
                        }
                        break;
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0.m(zzr(i7));
                        throw th;
                    }
                    break;
                case 51:
                    if (zzC(obj, i8, i7)) {
                        zzwqVar.zzf(i8, zzj(obj, j));
                        break;
                    }
                    break;
                case 52:
                    if (zzC(obj, i8, i7)) {
                        zzwqVar.zzn(i8, zzk(obj, j));
                        break;
                    }
                    break;
                case 53:
                    if (zzC(obj, i8, i7)) {
                        zzwqVar.zzs(i8, zzp(obj, j));
                        break;
                    }
                    break;
                case 54:
                    if (zzC(obj, i8, i7)) {
                        zzwqVar.zzH(i8, zzp(obj, j));
                        break;
                    }
                    break;
                case 55:
                    if (zzC(obj, i8, i7)) {
                        zzwqVar.zzq(i8, zzl(obj, j));
                        break;
                    }
                    break;
                case 56:
                    if (zzC(obj, i8, i7)) {
                        zzwqVar.zzl(i8, zzp(obj, j));
                        break;
                    }
                    break;
                case 57:
                    if (zzC(obj, i8, i7)) {
                        zzwqVar.zzj(i8, zzl(obj, j));
                        break;
                    }
                    break;
                case 58:
                    if (zzC(obj, i8, i7)) {
                        zzwqVar.zzb(i8, zzD(obj, j));
                        break;
                    }
                    break;
                case 59:
                    if (zzC(obj, i8, i7)) {
                        zzE(i8, unsafe.getObject(obj, j), zzwqVar);
                        break;
                    }
                    break;
                case 60:
                    if (zzC(obj, i8, i7)) {
                        zzwqVar.zzu(i8, unsafe.getObject(obj, j), zzq(i7));
                        break;
                    }
                    break;
                case 61:
                    if (zzC(obj, i8, i7)) {
                        zzwqVar.zzd(i8, (zzsu) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    if (zzC(obj, i8, i7)) {
                        zzwqVar.zzF(i8, zzl(obj, j));
                        break;
                    }
                    break;
                case 63:
                    if (zzC(obj, i8, i7)) {
                        zzwqVar.zzh(i8, zzl(obj, j));
                        break;
                    }
                    break;
                case 64:
                    if (zzC(obj, i8, i7)) {
                        zzwqVar.zzv(i8, zzl(obj, j));
                        break;
                    }
                    break;
                case 65:
                    if (zzC(obj, i8, i7)) {
                        zzwqVar.zzx(i8, zzp(obj, j));
                        break;
                    }
                    break;
                case 66:
                    if (zzC(obj, i8, i7)) {
                        zzwqVar.zzz(i8, zzl(obj, j));
                        break;
                    }
                    break;
                case 67:
                    if (zzC(obj, i8, i7)) {
                        zzwqVar.zzB(i8, zzp(obj, j));
                        break;
                    }
                    break;
                case 68:
                    if (zzC(obj, i8, i7)) {
                        zzwqVar.zzp(i8, unsafe.getObject(obj, j), zzq(i7));
                        break;
                    }
                    break;
            }
            i7 += 3;
            i5 = i;
            i6 = i2;
            r9 = 1;
            th = null;
            i4 = 1048575;
        }
        zzvz zzvzVar = this.zzj;
        zzvzVar.zzg(zzvzVar.zzc(obj), zzwqVar);
    }

    @Override // com.google.android.gms.internal.cast.zzvi
    public final boolean zzg(Object obj, Object obj2) {
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzo = zzo(i);
            long j = zzo & 1048575;
            switch (zzn(zzo)) {
                case 0:
                    if (zzx(obj, obj2, i) && Double.doubleToLongBits(zzwj.zza(obj, j)) == Double.doubleToLongBits(zzwj.zza(obj2, j))) {
                        break;
                    }
                    return false;
                case 1:
                    if (zzx(obj, obj2, i) && Float.floatToIntBits(zzwj.zzb(obj, j)) == Float.floatToIntBits(zzwj.zzb(obj2, j))) {
                        break;
                    }
                    return false;
                case 2:
                    if (zzx(obj, obj2, i) && zzwj.zzd(obj, j) == zzwj.zzd(obj2, j)) {
                        break;
                    }
                    return false;
                case 3:
                    if (zzx(obj, obj2, i) && zzwj.zzd(obj, j) == zzwj.zzd(obj2, j)) {
                        break;
                    }
                    return false;
                case 4:
                    if (zzx(obj, obj2, i) && zzwj.zzc(obj, j) == zzwj.zzc(obj2, j)) {
                        break;
                    }
                    return false;
                case 5:
                    if (zzx(obj, obj2, i) && zzwj.zzd(obj, j) == zzwj.zzd(obj2, j)) {
                        break;
                    }
                    return false;
                case 6:
                    if (zzx(obj, obj2, i) && zzwj.zzc(obj, j) == zzwj.zzc(obj2, j)) {
                        break;
                    }
                    return false;
                case 7:
                    if (zzx(obj, obj2, i) && zzwj.zzw(obj, j) == zzwj.zzw(obj2, j)) {
                        break;
                    }
                    return false;
                case 8:
                    if (zzx(obj, obj2, i) && zzvk.zzE(zzwj.zzf(obj, j), zzwj.zzf(obj2, j))) {
                        break;
                    }
                    return false;
                case 9:
                    if (zzx(obj, obj2, i) && zzvk.zzE(zzwj.zzf(obj, j), zzwj.zzf(obj2, j))) {
                        break;
                    }
                    return false;
                case 10:
                    if (zzx(obj, obj2, i) && zzvk.zzE(zzwj.zzf(obj, j), zzwj.zzf(obj2, j))) {
                        break;
                    }
                    return false;
                case 11:
                    if (zzx(obj, obj2, i) && zzwj.zzc(obj, j) == zzwj.zzc(obj2, j)) {
                        break;
                    }
                    return false;
                case 12:
                    if (zzx(obj, obj2, i) && zzwj.zzc(obj, j) == zzwj.zzc(obj2, j)) {
                        break;
                    }
                    return false;
                case 13:
                    if (zzx(obj, obj2, i) && zzwj.zzc(obj, j) == zzwj.zzc(obj2, j)) {
                        break;
                    }
                    return false;
                case 14:
                    if (zzx(obj, obj2, i) && zzwj.zzd(obj, j) == zzwj.zzd(obj2, j)) {
                        break;
                    }
                    return false;
                case 15:
                    if (zzx(obj, obj2, i) && zzwj.zzc(obj, j) == zzwj.zzc(obj2, j)) {
                        break;
                    }
                    return false;
                case 16:
                    if (zzx(obj, obj2, i) && zzwj.zzd(obj, j) == zzwj.zzd(obj2, j)) {
                        break;
                    }
                    return false;
                case 17:
                    if (zzx(obj, obj2, i) && zzvk.zzE(zzwj.zzf(obj, j), zzwj.zzf(obj2, j))) {
                        break;
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
                case 50:
                    if (!zzvk.zzE(zzwj.zzf(obj, j), zzwj.zzf(obj2, j))) {
                        return false;
                    }
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
                    long zzm = zzm(i) & 1048575;
                    if (zzwj.zzc(obj, zzm) == zzwj.zzc(obj2, zzm) && zzvk.zzE(zzwj.zzf(obj, j), zzwj.zzf(obj2, j))) {
                        break;
                    }
                    return false;
            }
        }
        if (!this.zzj.zzc(obj).equals(this.zzj.zzc(obj2))) {
            return false;
        }
        if (!this.zzf) {
            return true;
        }
        this.zzk.zza(obj);
        this.zzk.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.zzvi
    public final boolean zzh(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzh) {
            int[] iArr = this.zzg;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i5];
            int i7 = iArr2[i6];
            int zzo = zzo(i6);
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
            if ((268435456 & zzo) != 0 && !zzz(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzn = zzn(zzo);
            if (zzn != 9 && zzn != 17) {
                if (zzn != 27) {
                    if (zzn == 60 || zzn == 68) {
                        if (zzC(obj, i7, i6) && !zzA(obj, zzo, zzq(i6))) {
                            return false;
                        }
                    } else if (zzn != 49) {
                        if (zzn == 50) {
                            ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0.m(zzwj.zzf(obj, zzo & 1048575));
                            throw null;
                        }
                    }
                }
                List list = (List) zzwj.zzf(obj, zzo & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzvi zzq = zzq(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzq.zzh(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzz(obj, i6, i, i2, i10) && !zzA(obj, zzo, zzq(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (!this.zzf) {
            return true;
        }
        this.zzk.zza(obj);
        throw null;
    }
}
