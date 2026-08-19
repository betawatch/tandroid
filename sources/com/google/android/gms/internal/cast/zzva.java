package com.google.android.gms.internal.cast;

import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.CharacterCompat;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
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

    /* JADX WARN: Removed duplicated region for block: B:104:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzva zzi(Class cls, zzuu zzuuVar, zzvc zzvcVar, zzul zzulVar, zzvz zzvzVar, zztf zztfVar, zzus zzusVar) {
        int i;
        int charAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
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
        int i21;
        int objectFieldOffset;
        int i22;
        int i23;
        int i24;
        String str;
        int i25;
        int i26;
        int i27;
        Field zzs;
        char charAt10;
        int i28;
        int i29;
        int i30;
        int i31;
        Object obj;
        Field zzs2;
        Object obj2;
        Field zzs3;
        int i32;
        char charAt11;
        int i33;
        char charAt12;
        int i34;
        char charAt13;
        int i35;
        char charAt14;
        if (!(zzuuVar instanceof zzvh)) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzuuVar);
            throw null;
        }
        zzvh zzvhVar = (zzvh) zzuuVar;
        String zzd = zzvhVar.zzd();
        int length = zzd.length();
        char charAt15 = zzd.charAt(0);
        char c = CharacterCompat.MIN_HIGH_SURROGATE;
        if (charAt15 >= 55296) {
            int i36 = 1;
            while (true) {
                i = i36 + 1;
                if (zzd.charAt(i36) < 55296) {
                    break;
                }
                i36 = i;
            }
        } else {
            i = 1;
        }
        int i37 = i + 1;
        int charAt16 = zzd.charAt(i);
        if (charAt16 >= 55296) {
            int i38 = charAt16 & 8191;
            int i39 = 13;
            while (true) {
                i35 = i37 + 1;
                charAt14 = zzd.charAt(i37);
                if (charAt14 < 55296) {
                    break;
                }
                i38 |= (charAt14 & 8191) << i39;
                i39 += 13;
                i37 = i35;
            }
            charAt16 = i38 | (charAt14 << i39);
            i37 = i35;
        }
        if (charAt16 == 0) {
            iArr = zza;
            i7 = 0;
            i4 = 0;
            charAt = 0;
            i3 = 0;
            i5 = 0;
            i2 = 0;
            i6 = 0;
        } else {
            int i40 = i37 + 1;
            int charAt17 = zzd.charAt(i37);
            if (charAt17 >= 55296) {
                int i41 = charAt17 & 8191;
                int i42 = 13;
                while (true) {
                    i15 = i40 + 1;
                    charAt9 = zzd.charAt(i40);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i41 |= (charAt9 & 8191) << i42;
                    i42 += 13;
                    i40 = i15;
                }
                charAt17 = i41 | (charAt9 << i42);
                i40 = i15;
            }
            int i43 = i40 + 1;
            int charAt18 = zzd.charAt(i40);
            if (charAt18 >= 55296) {
                int i44 = charAt18 & 8191;
                int i45 = 13;
                while (true) {
                    i14 = i43 + 1;
                    charAt8 = zzd.charAt(i43);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i44 |= (charAt8 & 8191) << i45;
                    i45 += 13;
                    i43 = i14;
                }
                charAt18 = i44 | (charAt8 << i45);
                i43 = i14;
            }
            int i46 = i43 + 1;
            int charAt19 = zzd.charAt(i43);
            if (charAt19 >= 55296) {
                int i47 = charAt19 & 8191;
                int i48 = 13;
                while (true) {
                    i13 = i46 + 1;
                    charAt7 = zzd.charAt(i46);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i47 |= (charAt7 & 8191) << i48;
                    i48 += 13;
                    i46 = i13;
                }
                charAt19 = i47 | (charAt7 << i48);
                i46 = i13;
            }
            int i49 = i46 + 1;
            int charAt20 = zzd.charAt(i46);
            if (charAt20 >= 55296) {
                int i50 = charAt20 & 8191;
                int i51 = 13;
                while (true) {
                    i12 = i49 + 1;
                    charAt6 = zzd.charAt(i49);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i50 |= (charAt6 & 8191) << i51;
                    i51 += 13;
                    i49 = i12;
                }
                charAt20 = i50 | (charAt6 << i51);
                i49 = i12;
            }
            int i52 = i49 + 1;
            charAt = zzd.charAt(i49);
            if (charAt >= 55296) {
                int i53 = charAt & 8191;
                int i54 = 13;
                while (true) {
                    i11 = i52 + 1;
                    charAt5 = zzd.charAt(i52);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i53 |= (charAt5 & 8191) << i54;
                    i54 += 13;
                    i52 = i11;
                }
                charAt = i53 | (charAt5 << i54);
                i52 = i11;
            }
            int i55 = i52 + 1;
            int charAt21 = zzd.charAt(i52);
            if (charAt21 >= 55296) {
                int i56 = charAt21 & 8191;
                int i57 = 13;
                while (true) {
                    i10 = i55 + 1;
                    charAt4 = zzd.charAt(i55);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i56 |= (charAt4 & 8191) << i57;
                    i57 += 13;
                    i55 = i10;
                }
                charAt21 = i56 | (charAt4 << i57);
                i55 = i10;
            }
            int i58 = i55 + 1;
            int charAt22 = zzd.charAt(i55);
            if (charAt22 >= 55296) {
                int i59 = charAt22 & 8191;
                int i60 = 13;
                while (true) {
                    i9 = i58 + 1;
                    charAt3 = zzd.charAt(i58);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i59 |= (charAt3 & 8191) << i60;
                    i60 += 13;
                    i58 = i9;
                }
                charAt22 = i59 | (charAt3 << i60);
                i58 = i9;
            }
            int i61 = i58 + 1;
            int charAt23 = zzd.charAt(i58);
            if (charAt23 >= 55296) {
                int i62 = charAt23 & 8191;
                int i63 = 13;
                while (true) {
                    i8 = i61 + 1;
                    charAt2 = zzd.charAt(i61);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i62 |= (charAt2 & 8191) << i63;
                    i63 += 13;
                    i61 = i8;
                }
                charAt23 = i62 | (charAt2 << i63);
                i61 = i8;
            }
            i2 = charAt17 + charAt17 + charAt18;
            int[] iArr2 = new int[charAt23 + charAt21 + charAt22];
            int i64 = charAt21;
            i3 = charAt19;
            i4 = i64;
            iArr = iArr2;
            i5 = charAt20;
            i6 = charAt23;
            i7 = charAt17;
            i37 = i61;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzvhVar.zze();
        Class<?> cls2 = zzvhVar.zza().getClass();
        int i65 = i6 + i4;
        int i66 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i66];
        int i67 = i6;
        int i68 = i65;
        int i69 = 0;
        int i70 = 0;
        while (i37 < length) {
            int i71 = i37 + 1;
            int charAt24 = zzd.charAt(i37);
            if (charAt24 >= c) {
                int i72 = charAt24 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i34 = i73 + 1;
                    charAt13 = zzd.charAt(i73);
                    if (charAt13 < c) {
                        break;
                    }
                    i72 |= (charAt13 & 8191) << i74;
                    i74 += 13;
                    i73 = i34;
                }
                charAt24 = i72 | (charAt13 << i74);
                i16 = i34;
            } else {
                i16 = i71;
            }
            int i75 = i16 + 1;
            int charAt25 = zzd.charAt(i16);
            if (charAt25 >= c) {
                int i76 = charAt25 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i33 = i77 + 1;
                    charAt12 = zzd.charAt(i77);
                    if (charAt12 < c) {
                        break;
                    }
                    i76 |= (charAt12 & 8191) << i78;
                    i78 += 13;
                    i77 = i33;
                }
                charAt25 = i76 | (charAt12 << i78);
                i17 = i33;
            } else {
                i17 = i75;
            }
            if ((charAt25 & 1024) != 0) {
                iArr[i69] = i70;
                i69++;
            }
            int i79 = charAt25 & NotificationCenter.didReceiveSmsCode;
            int i80 = charAt25 & 2048;
            zzvh zzvhVar2 = zzvhVar;
            if (i79 >= 51) {
                int i81 = i17 + 1;
                int charAt26 = zzd.charAt(i17);
                char c2 = CharacterCompat.MIN_HIGH_SURROGATE;
                if (charAt26 >= 55296) {
                    int i82 = charAt26 & 8191;
                    int i83 = i81;
                    int i84 = 13;
                    while (true) {
                        i32 = i83 + 1;
                        charAt11 = zzd.charAt(i83);
                        if (charAt11 < c2) {
                            break;
                        }
                        i82 |= (charAt11 & 8191) << i84;
                        i84 += 13;
                        i83 = i32;
                        c2 = CharacterCompat.MIN_HIGH_SURROGATE;
                    }
                    charAt26 = i82 | (charAt11 << i84);
                    i30 = i32;
                } else {
                    i30 = i81;
                }
                int i85 = i30;
                int i86 = i79 - 51;
                i18 = length;
                if (i86 == 9 || i86 == 17) {
                    i31 = i2 + 1;
                    int i87 = i70 / 3;
                    objArr[i87 + i87 + 1] = zze[i2];
                } else {
                    if (i86 == 12) {
                        if (zzvhVar2.zzc() == 1 || i80 != 0) {
                            i31 = i2 + 1;
                            int i88 = i70 / 3;
                            objArr[i88 + i88 + 1] = zze[i2];
                        } else {
                            i80 = 0;
                        }
                    }
                    int i89 = charAt26 + charAt26;
                    obj = zze[i89];
                    if (obj instanceof Field) {
                        zzs2 = zzs(cls2, (String) obj);
                        zze[i89] = zzs2;
                    } else {
                        zzs2 = (Field) obj;
                    }
                    int i90 = charAt24;
                    int i91 = i80;
                    i27 = (int) unsafe.objectFieldOffset(zzs2);
                    int i92 = i89 + 1;
                    obj2 = zze[i92];
                    if (obj2 instanceof Field) {
                        zzs3 = zzs(cls2, (String) obj2);
                        zze[i92] = zzs3;
                    } else {
                        zzs3 = (Field) obj2;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzs3);
                    str = zzd;
                    i37 = i85;
                    i26 = 0;
                    i24 = i2;
                    i23 = objectFieldOffset2;
                    i80 = i91;
                    i19 = i90;
                    i22 = charAt25;
                }
                i2 = i31;
                int i892 = charAt26 + charAt26;
                obj = zze[i892];
                if (obj instanceof Field) {
                }
                int i902 = charAt24;
                int i912 = i80;
                i27 = (int) unsafe.objectFieldOffset(zzs2);
                int i922 = i892 + 1;
                obj2 = zze[i922];
                if (obj2 instanceof Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzs3);
                str = zzd;
                i37 = i85;
                i26 = 0;
                i24 = i2;
                i23 = objectFieldOffset22;
                i80 = i912;
                i19 = i902;
                i22 = charAt25;
            } else {
                i18 = length;
                int i93 = charAt24;
                int i94 = i2 + 1;
                Field zzs4 = zzs(cls2, (String) zze[i2]);
                if (i79 == 9 || i79 == 17) {
                    i19 = i93;
                    int i95 = i70 / 3;
                    objArr[i95 + i95 + 1] = zzs4.getType();
                } else {
                    if (i79 == 27) {
                        i19 = i93;
                        i28 = 1;
                        i29 = i2 + 2;
                    } else if (i79 == 49) {
                        i29 = i2 + 2;
                        i19 = i93;
                        i28 = 1;
                    } else {
                        if (i79 == 12 || i79 == 30 || i79 == 44) {
                            i19 = i93;
                            if (zzvhVar2.zzc() == 1 || i80 != 0) {
                                i29 = i2 + 2;
                                int i96 = i70 / 3;
                                objArr[i96 + i96 + 1] = zze[i94];
                                i21 = i29;
                                i20 = charAt25;
                            } else {
                                i20 = charAt25;
                                i21 = i94;
                                i80 = 0;
                            }
                        } else if (i79 == 50) {
                            i21 = i2 + 2;
                            int i97 = i67 + 1;
                            iArr[i67] = i70;
                            int i98 = i70 / 3;
                            int i99 = i98 + i98;
                            objArr[i99] = zze[i94];
                            if (i80 != 0) {
                                objArr[i99 + 1] = zze[i21];
                                i21 = i2 + 3;
                                i67 = i97;
                                i19 = i93;
                                i20 = charAt25;
                            } else {
                                i20 = charAt25;
                                i67 = i97;
                                i80 = 0;
                                i19 = i93;
                            }
                        } else {
                            i19 = i93;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zzs4);
                        i22 = i20;
                        i23 = 1048575;
                        if ((i22 & 4096) != 0 || i79 > 17) {
                            i24 = i21;
                            str = zzd;
                            i25 = i17;
                            i26 = 0;
                        } else {
                            int i100 = i17 + 1;
                            int charAt27 = zzd.charAt(i17);
                            i24 = i21;
                            if (charAt27 >= 55296) {
                                int i101 = charAt27 & 8191;
                                int i102 = 13;
                                while (true) {
                                    i25 = i100 + 1;
                                    charAt10 = zzd.charAt(i100);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i101 |= (charAt10 & 8191) << i102;
                                    i102 += 13;
                                    i100 = i25;
                                }
                                charAt27 = i101 | (charAt10 << i102);
                            } else {
                                i25 = i100;
                            }
                            int i103 = i7 + i7 + (charAt27 / 32);
                            Object obj3 = zze[i103];
                            str = zzd;
                            if (obj3 instanceof Field) {
                                zzs = (Field) obj3;
                            } else {
                                zzs = zzs(cls2, (String) obj3);
                                zze[i103] = zzs;
                            }
                            i26 = charAt27 % 32;
                            i23 = (int) unsafe.objectFieldOffset(zzs);
                        }
                        if (i79 >= 18 && i79 <= 49) {
                            iArr[i68] = objectFieldOffset;
                            i68++;
                        }
                        i27 = objectFieldOffset;
                        i37 = i25;
                    }
                    int i104 = i70 / 3;
                    objArr[i104 + i104 + i28] = zze[i94];
                    i21 = i29;
                    i20 = charAt25;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzs4);
                    i22 = i20;
                    i23 = 1048575;
                    if ((i22 & 4096) != 0) {
                    }
                    i24 = i21;
                    str = zzd;
                    i25 = i17;
                    i26 = 0;
                    if (i79 >= 18) {
                        iArr[i68] = objectFieldOffset;
                        i68++;
                    }
                    i27 = objectFieldOffset;
                    i37 = i25;
                }
                i20 = charAt25;
                i21 = i94;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzs4);
                i22 = i20;
                i23 = 1048575;
                if ((i22 & 4096) != 0) {
                }
                i24 = i21;
                str = zzd;
                i25 = i17;
                i26 = 0;
                if (i79 >= 18) {
                }
                i27 = objectFieldOffset;
                i37 = i25;
            }
            int i105 = i70 + 1;
            iArr3[i70] = i19;
            int i106 = i70 + 2;
            iArr3[i105] = ((i22 & 512) != 0 ? TLObject.FLAG_29 : 0) | ((i22 & 256) != 0 ? TLObject.FLAG_28 : 0) | (i80 != 0 ? TLObject.FLAG_31 : 0) | (i79 << 20) | i27;
            i70 += 3;
            iArr3[i106] = (i26 << 20) | i23;
            zzvhVar = zzvhVar2;
            i2 = i24;
            zzd = str;
            length = i18;
            c = CharacterCompat.MIN_HIGH_SURROGATE;
        }
        zzvh zzvhVar3 = zzvhVar;
        return new zzva(iArr3, objArr, i3, i5, zzvhVar3.zza(), zzvhVar3.zzc(), false, iArr, i6, i65, zzvcVar, zzulVar, zzvzVar, zztfVar, zzusVar);
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
        return (i >>> 20) & NotificationCenter.didReceiveSmsCode;
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

    @Override // com.google.android.gms.internal.cast.zzvi
    public final int zza(Object obj) {
        int i;
        int zzx;
        int zzx2;
        int zzy;
        int zzx3;
        int zzx4;
        int zzx5;
        int zzx6;
        int zzx7;
        int zzh;
        int i2;
        int zzg;
        int size;
        int zzl;
        int zzx8;
        int zzx9;
        int zzx10;
        int i3;
        int zze;
        int zzx11;
        int zzx12;
        int i4;
        int zzx13;
        int zzx14;
        int zzx15;
        zzva zzvaVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < zzvaVar.zzc.length; i8 += 3) {
            int zzo = zzvaVar.zzo(i8);
            int zzn = zzn(zzo);
            int[] iArr = zzvaVar.zzc;
            int i9 = iArr[i8];
            int i10 = iArr[i8 + 2];
            int i11 = i10 & 1048575;
            if (zzn <= 17) {
                if (i11 != i5) {
                    i6 = i11 == 1048575 ? 0 : unsafe.getInt(obj2, i11);
                    i5 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            int i12 = zzo & 1048575;
            if (zzn >= zztk.zzJ.zza()) {
                zztk.zzW.zza();
            }
            long j = i12;
            switch (zzn) {
                case 0:
                    if (zzvaVar.zzz(obj2, i8, i5, i6, i)) {
                        zzx = zztc.zzx(i9 << 3);
                        zzh = zzx + 8;
                        i7 += zzh;
                    }
                case 1:
                    if (zzvaVar.zzz(obj2, i8, i5, i6, i)) {
                        zzx2 = zztc.zzx(i9 << 3);
                        zzx5 = zzx2 + 4;
                        i7 += zzx5;
                    }
                    zzvaVar = this;
                    obj2 = obj;
                case 2:
                    if (zzvaVar.zzz(obj2, i8, i5, i6, i)) {
                        zzy = zztc.zzy(unsafe.getLong(obj2, j));
                        zzx3 = zztc.zzx(i9 << 3);
                        i2 = zzx3 + zzy;
                        i7 += i2;
                    }
                    zzvaVar = this;
                case 3:
                    if (zzvaVar.zzz(obj2, i8, i5, i6, i)) {
                        zzy = zztc.zzy(unsafe.getLong(obj2, j));
                        zzx3 = zztc.zzx(i9 << 3);
                        i2 = zzx3 + zzy;
                        i7 += i2;
                    }
                    zzvaVar = this;
                case 4:
                    if (zzvaVar.zzz(obj2, i8, i5, i6, i)) {
                        zzy = zztc.zzu(unsafe.getInt(obj2, j));
                        zzx3 = zztc.zzx(i9 << 3);
                        i2 = zzx3 + zzy;
                        i7 += i2;
                    }
                    zzvaVar = this;
                case 5:
                    if (zzvaVar.zzz(obj2, i8, i5, i6, i)) {
                        zzx4 = zztc.zzx(i9 << 3);
                        zzx5 = zzx4 + 8;
                        i7 += zzx5;
                    }
                    zzvaVar = this;
                    obj2 = obj;
                case 6:
                    if (zzvaVar.zzz(obj2, i8, i5, i6, i)) {
                        zzx2 = zztc.zzx(i9 << 3);
                        zzx5 = zzx2 + 4;
                        i7 += zzx5;
                    }
                    zzvaVar = this;
                    obj2 = obj;
                case 7:
                    if (zzvaVar.zzz(obj2, i8, i5, i6, i)) {
                        zzx5 = zztc.zzx(i9 << 3) + 1;
                        i7 += zzx5;
                    }
                    zzvaVar = this;
                    obj2 = obj;
                case 8:
                    if (zzvaVar.zzz(obj2, i8, i5, i6, i)) {
                        int i13 = i9 << 3;
                        Object object = unsafe.getObject(obj2, j);
                        if (object instanceof zzsu) {
                            int i14 = zztc.$r8$clinit;
                            int zzd = ((zzsu) object).zzd();
                            zzx6 = zztc.zzx(zzd) + zzd;
                            zzx7 = zztc.zzx(i13);
                            i2 = zzx7 + zzx6;
                            i7 += i2;
                        } else {
                            zzy = zztc.zzw((String) object);
                            zzx3 = zztc.zzx(i13);
                            i2 = zzx3 + zzy;
                            i7 += i2;
                        }
                    }
                    zzvaVar = this;
                case 9:
                    if (zzvaVar.zzz(obj2, i8, i5, i6, i)) {
                        zzh = zzvk.zzh(i9, unsafe.getObject(obj2, j), zzvaVar.zzq(i8));
                        i7 += zzh;
                    }
                case 10:
                    if (zzvaVar.zzz(obj2, i8, i5, i6, i)) {
                        zzsu zzsuVar = (zzsu) unsafe.getObject(obj2, j);
                        int i15 = zztc.$r8$clinit;
                        int zzd2 = zzsuVar.zzd();
                        zzx6 = zztc.zzx(zzd2) + zzd2;
                        zzx7 = zztc.zzx(i9 << 3);
                        i2 = zzx7 + zzx6;
                        i7 += i2;
                    }
                    zzvaVar = this;
                case 11:
                    if (zzvaVar.zzz(obj2, i8, i5, i6, i)) {
                        zzy = zztc.zzx(unsafe.getInt(obj2, j));
                        zzx3 = zztc.zzx(i9 << 3);
                        i2 = zzx3 + zzy;
                        i7 += i2;
                    }
                    zzvaVar = this;
                case 12:
                    if (zzvaVar.zzz(obj2, i8, i5, i6, i)) {
                        zzy = zztc.zzu(unsafe.getInt(obj2, j));
                        zzx3 = zztc.zzx(i9 << 3);
                        i2 = zzx3 + zzy;
                        i7 += i2;
                    }
                    zzvaVar = this;
                case 13:
                    if (zzvaVar.zzz(obj2, i8, i5, i6, i)) {
                        zzx2 = zztc.zzx(i9 << 3);
                        zzx5 = zzx2 + 4;
                        i7 += zzx5;
                    }
                    zzvaVar = this;
                    obj2 = obj;
                case 14:
                    if (zzvaVar.zzz(obj2, i8, i5, i6, i)) {
                        zzx4 = zztc.zzx(i9 << 3);
                        zzx5 = zzx4 + 8;
                        i7 += zzx5;
                    }
                    zzvaVar = this;
                    obj2 = obj;
                case 15:
                    if (zzvaVar.zzz(obj2, i8, i5, i6, i)) {
                        int i16 = unsafe.getInt(obj2, j);
                        zzx3 = zztc.zzx(i9 << 3);
                        zzy = zztc.zzx((i16 >> 31) ^ (i16 + i16));
                        i2 = zzx3 + zzy;
                        i7 += i2;
                    }
                    zzvaVar = this;
                case 16:
                    if (zzvaVar.zzz(obj2, i8, i5, i6, i)) {
                        long j2 = unsafe.getLong(obj2, j);
                        zzx3 = zztc.zzx(i9 << 3);
                        zzy = zztc.zzy((j2 >> 63) ^ (j2 + j2));
                        i2 = zzx3 + zzy;
                        i7 += i2;
                    }
                    zzvaVar = this;
                case 17:
                    if (zzvaVar.zzz(obj2, i8, i5, i6, i)) {
                        zzh = zztc.zzt(i9, (zzux) unsafe.getObject(obj2, j), zzvaVar.zzq(i8));
                        i7 += zzh;
                    }
                case 18:
                    zzh = zzvk.zzd(i9, (List) unsafe.getObject(obj2, j), false);
                    i7 += zzh;
                case 19:
                    zzh = zzvk.zzb(i9, (List) unsafe.getObject(obj2, j), false);
                    i7 += zzh;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j);
                    int i17 = zzvk.$r8$clinit;
                    if (list.size() != 0) {
                        zzg = zzvk.zzg(list) + (list.size() * zztc.zzx(i9 << 3));
                        i7 += zzg;
                    }
                    zzg = 0;
                    i7 += zzg;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j);
                    int i18 = zzvk.$r8$clinit;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zzvk.zzl(list2);
                        zzx8 = zztc.zzx(i9 << 3);
                        i3 = size * zzx8;
                        zzh = zzl + i3;
                        i7 += zzh;
                    }
                    zzh = 0;
                    i7 += zzh;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j);
                    int i19 = zzvk.$r8$clinit;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zzvk.zzf(list3);
                        zzx8 = zztc.zzx(i9 << 3);
                        i3 = size * zzx8;
                        zzh = zzl + i3;
                        i7 += zzh;
                    }
                    zzh = 0;
                    i7 += zzh;
                case 23:
                    zzh = zzvk.zzd(i9, (List) unsafe.getObject(obj2, j), false);
                    i7 += zzh;
                case 24:
                    zzh = zzvk.zzb(i9, (List) unsafe.getObject(obj2, j), false);
                    i7 += zzh;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j);
                    int i20 = zzvk.$r8$clinit;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzh = size2 * (zztc.zzx(i9 << 3) + 1);
                        i7 += zzh;
                    }
                    zzh = 0;
                    i7 += zzh;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j);
                    int i21 = zzvk.$r8$clinit;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        boolean z = list5 instanceof zzuf;
                        zzg = zztc.zzx(i9 << 3) * size3;
                        if (z) {
                            zzuf zzufVar = (zzuf) list5;
                            for (int i22 = 0; i22 < size3; i22++) {
                                Object zze2 = zzufVar.zze(i22);
                                if (zze2 instanceof zzsu) {
                                    int zzd3 = ((zzsu) zze2).zzd();
                                    zzg += zztc.zzx(zzd3) + zzd3;
                                } else {
                                    zzg += zztc.zzw((String) zze2);
                                }
                            }
                        } else {
                            for (int i23 = 0; i23 < size3; i23++) {
                                Object obj3 = list5.get(i23);
                                if (obj3 instanceof zzsu) {
                                    int zzd4 = ((zzsu) obj3).zzd();
                                    zzg += zztc.zzx(zzd4) + zzd4;
                                } else {
                                    zzg += zztc.zzw((String) obj3);
                                }
                            }
                        }
                        i7 += zzg;
                    }
                    zzg = 0;
                    i7 += zzg;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j);
                    zzvi zzq = zzvaVar.zzq(i8);
                    int i24 = zzvk.$r8$clinit;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzx9 = 0;
                    } else {
                        zzx9 = zztc.zzx(i9 << 3) * size4;
                        for (int i25 = 0; i25 < size4; i25++) {
                            zzx9 += zztc.zzv((zzux) list6.get(i25), zzq);
                        }
                    }
                    i7 += zzx9;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j);
                    int i26 = zzvk.$r8$clinit;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        zzx10 = 0;
                    } else {
                        zzx10 = size5 * zztc.zzx(i9 << 3);
                        for (int i27 = 0; i27 < list7.size(); i27++) {
                            int zzd5 = ((zzsu) list7.get(i27)).zzd();
                            zzx10 += zztc.zzx(zzd5) + zzd5;
                        }
                    }
                    i7 += zzx10;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j);
                    int i28 = zzvk.$r8$clinit;
                    size = list8.size();
                    if (size != 0) {
                        zzl = zzvk.zzk(list8);
                        zzx8 = zztc.zzx(i9 << 3);
                        i3 = size * zzx8;
                        zzh = zzl + i3;
                        i7 += zzh;
                    }
                    zzh = 0;
                    i7 += zzh;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j);
                    int i29 = zzvk.$r8$clinit;
                    size = list9.size();
                    if (size != 0) {
                        zzl = zzvk.zza(list9);
                        zzx8 = zztc.zzx(i9 << 3);
                        i3 = size * zzx8;
                        zzh = zzl + i3;
                        i7 += zzh;
                    }
                    zzh = 0;
                    i7 += zzh;
                case 31:
                    zzh = zzvk.zzb(i9, (List) unsafe.getObject(obj2, j), false);
                    i7 += zzh;
                case 32:
                    zzh = zzvk.zzd(i9, (List) unsafe.getObject(obj2, j), false);
                    i7 += zzh;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j);
                    int i30 = zzvk.$r8$clinit;
                    size = list10.size();
                    if (size != 0) {
                        zzl = zzvk.zzi(list10);
                        zzx8 = zztc.zzx(i9 << 3);
                        i3 = size * zzx8;
                        zzh = zzl + i3;
                        i7 += zzh;
                    }
                    zzh = 0;
                    i7 += zzh;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j);
                    int i31 = zzvk.$r8$clinit;
                    size = list11.size();
                    if (size != 0) {
                        zzl = zzvk.zzj(list11);
                        zzx8 = zztc.zzx(i9 << 3);
                        i3 = size * zzx8;
                        zzh = zzl + i3;
                        i7 += zzh;
                    }
                    zzh = 0;
                    i7 += zzh;
                case 35:
                    zze = zzvk.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzx11 = zztc.zzx(zze);
                        zzx12 = zztc.zzx(i9 << 3);
                        zzx10 = zzx12 + zzx11 + zze;
                        i7 += zzx10;
                    }
                case 36:
                    zze = zzvk.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzx11 = zztc.zzx(zze);
                        zzx12 = zztc.zzx(i9 << 3);
                        zzx10 = zzx12 + zzx11 + zze;
                        i7 += zzx10;
                    }
                case 37:
                    zze = zzvk.zzg((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzx11 = zztc.zzx(zze);
                        zzx12 = zztc.zzx(i9 << 3);
                        zzx10 = zzx12 + zzx11 + zze;
                        i7 += zzx10;
                    }
                case 38:
                    zze = zzvk.zzl((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzx11 = zztc.zzx(zze);
                        zzx12 = zztc.zzx(i9 << 3);
                        zzx10 = zzx12 + zzx11 + zze;
                        i7 += zzx10;
                    }
                case 39:
                    zze = zzvk.zzf((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzx11 = zztc.zzx(zze);
                        zzx12 = zztc.zzx(i9 << 3);
                        zzx10 = zzx12 + zzx11 + zze;
                        i7 += zzx10;
                    }
                case 40:
                    zze = zzvk.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzx11 = zztc.zzx(zze);
                        zzx12 = zztc.zzx(i9 << 3);
                        zzx10 = zzx12 + zzx11 + zze;
                        i7 += zzx10;
                    }
                case 41:
                    zze = zzvk.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzx11 = zztc.zzx(zze);
                        zzx12 = zztc.zzx(i9 << 3);
                        zzx10 = zzx12 + zzx11 + zze;
                        i7 += zzx10;
                    }
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j);
                    int i32 = zzvk.$r8$clinit;
                    zze = list12.size();
                    if (zze > 0) {
                        zzx11 = zztc.zzx(zze);
                        zzx12 = zztc.zzx(i9 << 3);
                        zzx10 = zzx12 + zzx11 + zze;
                        i7 += zzx10;
                    }
                case 43:
                    zze = zzvk.zzk((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzx11 = zztc.zzx(zze);
                        zzx12 = zztc.zzx(i9 << 3);
                        zzx10 = zzx12 + zzx11 + zze;
                        i7 += zzx10;
                    }
                case 44:
                    zze = zzvk.zza((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzx11 = zztc.zzx(zze);
                        zzx12 = zztc.zzx(i9 << 3);
                        zzx10 = zzx12 + zzx11 + zze;
                        i7 += zzx10;
                    }
                case 45:
                    zze = zzvk.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzx11 = zztc.zzx(zze);
                        zzx12 = zztc.zzx(i9 << 3);
                        zzx10 = zzx12 + zzx11 + zze;
                        i7 += zzx10;
                    }
                case 46:
                    zze = zzvk.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzx11 = zztc.zzx(zze);
                        zzx12 = zztc.zzx(i9 << 3);
                        zzx10 = zzx12 + zzx11 + zze;
                        i7 += zzx10;
                    }
                case 47:
                    zze = zzvk.zzi((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzx11 = zztc.zzx(zze);
                        zzx12 = zztc.zzx(i9 << 3);
                        zzx10 = zzx12 + zzx11 + zze;
                        i7 += zzx10;
                    }
                case 48:
                    zze = zzvk.zzj((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzx11 = zztc.zzx(zze);
                        zzx12 = zztc.zzx(i9 << 3);
                        zzx10 = zzx12 + zzx11 + zze;
                        i7 += zzx10;
                    }
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j);
                    zzvi zzq2 = zzvaVar.zzq(i8);
                    int i33 = zzvk.$r8$clinit;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (int i34 = 0; i34 < size6; i34++) {
                            i4 += zztc.zzt(i9, (zzux) list13.get(i34), zzq2);
                        }
                    }
                    i7 += i4;
                case 50:
                    Object object2 = unsafe.getObject(obj2, j);
                    Object zzr = zzvaVar.zzr(i8);
                    WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(object2);
                    WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzr);
                    throw null;
                case 51:
                    if (zzvaVar.zzC(obj2, i9, i8)) {
                        zzx = zztc.zzx(i9 << 3);
                        zzh = zzx + 8;
                        i7 += zzh;
                    }
                case 52:
                    if (zzvaVar.zzC(obj2, i9, i8)) {
                        zzx13 = zztc.zzx(i9 << 3);
                        zzh = zzx13 + 4;
                        i7 += zzh;
                    }
                case 53:
                    if (zzvaVar.zzC(obj2, i9, i8)) {
                        i3 = zztc.zzy(zzp(obj2, j));
                        zzl = zztc.zzx(i9 << 3);
                        zzh = zzl + i3;
                        i7 += zzh;
                    }
                case 54:
                    if (zzvaVar.zzC(obj2, i9, i8)) {
                        i3 = zztc.zzy(zzp(obj2, j));
                        zzl = zztc.zzx(i9 << 3);
                        zzh = zzl + i3;
                        i7 += zzh;
                    }
                case 55:
                    if (zzvaVar.zzC(obj2, i9, i8)) {
                        i3 = zztc.zzu(zzl(obj2, j));
                        zzl = zztc.zzx(i9 << 3);
                        zzh = zzl + i3;
                        i7 += zzh;
                    }
                case 56:
                    if (zzvaVar.zzC(obj2, i9, i8)) {
                        zzx = zztc.zzx(i9 << 3);
                        zzh = zzx + 8;
                        i7 += zzh;
                    }
                case 57:
                    if (zzvaVar.zzC(obj2, i9, i8)) {
                        zzx13 = zztc.zzx(i9 << 3);
                        zzh = zzx13 + 4;
                        i7 += zzh;
                    }
                case 58:
                    if (zzvaVar.zzC(obj2, i9, i8)) {
                        zzh = zztc.zzx(i9 << 3) + 1;
                        i7 += zzh;
                    }
                case 59:
                    if (zzvaVar.zzC(obj2, i9, i8)) {
                        int i35 = i9 << 3;
                        Object object3 = unsafe.getObject(obj2, j);
                        if (object3 instanceof zzsu) {
                            int i36 = zztc.$r8$clinit;
                            int zzd6 = ((zzsu) object3).zzd();
                            zzx14 = zztc.zzx(zzd6) + zzd6;
                            zzx15 = zztc.zzx(i35);
                            zzh = zzx15 + zzx14;
                            i7 += zzh;
                        } else {
                            i3 = zztc.zzw((String) object3);
                            zzl = zztc.zzx(i35);
                            zzh = zzl + i3;
                            i7 += zzh;
                        }
                    }
                case 60:
                    if (zzvaVar.zzC(obj2, i9, i8)) {
                        zzh = zzvk.zzh(i9, unsafe.getObject(obj2, j), zzvaVar.zzq(i8));
                        i7 += zzh;
                    }
                case 61:
                    if (zzvaVar.zzC(obj2, i9, i8)) {
                        zzsu zzsuVar2 = (zzsu) unsafe.getObject(obj2, j);
                        int i37 = zztc.$r8$clinit;
                        int zzd7 = zzsuVar2.zzd();
                        zzx14 = zztc.zzx(zzd7) + zzd7;
                        zzx15 = zztc.zzx(i9 << 3);
                        zzh = zzx15 + zzx14;
                        i7 += zzh;
                    }
                case 62:
                    if (zzvaVar.zzC(obj2, i9, i8)) {
                        i3 = zztc.zzx(zzl(obj2, j));
                        zzl = zztc.zzx(i9 << 3);
                        zzh = zzl + i3;
                        i7 += zzh;
                    }
                case 63:
                    if (zzvaVar.zzC(obj2, i9, i8)) {
                        i3 = zztc.zzu(zzl(obj2, j));
                        zzl = zztc.zzx(i9 << 3);
                        zzh = zzl + i3;
                        i7 += zzh;
                    }
                case 64:
                    if (zzvaVar.zzC(obj2, i9, i8)) {
                        zzx13 = zztc.zzx(i9 << 3);
                        zzh = zzx13 + 4;
                        i7 += zzh;
                    }
                case 65:
                    if (zzvaVar.zzC(obj2, i9, i8)) {
                        zzx = zztc.zzx(i9 << 3);
                        zzh = zzx + 8;
                        i7 += zzh;
                    }
                case 66:
                    if (zzvaVar.zzC(obj2, i9, i8)) {
                        int zzl2 = zzl(obj2, j);
                        zzl = zztc.zzx(i9 << 3);
                        i3 = zztc.zzx((zzl2 >> 31) ^ (zzl2 + zzl2));
                        zzh = zzl + i3;
                        i7 += zzh;
                    }
                case 67:
                    if (zzvaVar.zzC(obj2, i9, i8)) {
                        long zzp = zzp(obj2, j);
                        zzl = zztc.zzx(i9 << 3);
                        i3 = zztc.zzy((zzp >> 63) ^ (zzp + zzp));
                        zzh = zzl + i3;
                        i7 += zzh;
                    }
                case 68:
                    if (zzvaVar.zzC(obj2, i9, i8)) {
                        zzh = zztc.zzt(i9, (zzux) unsafe.getObject(obj2, j), zzvaVar.zzq(i8));
                        i7 += zzh;
                    }
                default:
            }
        }
        zzvz zzvzVar = zzvaVar.zzj;
        int zza2 = i7 + zzvzVar.zza(zzvzVar.zzc(obj2));
        if (!zzvaVar.zzf) {
            return zza2;
        }
        zzvaVar.zzk.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.zzvi
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
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
                    doubleToLongBits = Double.doubleToLongBits(zzwj.zza(obj, j));
                    byte[] bArr = zzty.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i4 * 53;
                    floatToIntBits = Float.floatToIntBits(zzwj.zzb(obj, j));
                    i4 = i2 + floatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    doubleToLongBits = zzwj.zzd(obj, j);
                    byte[] bArr2 = zzty.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i4 * 53;
                    doubleToLongBits = zzwj.zzd(obj, j);
                    byte[] bArr3 = zzty.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i4 * 53;
                    floatToIntBits = zzwj.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    doubleToLongBits = zzwj.zzd(obj, j);
                    byte[] bArr4 = zzty.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i4 * 53;
                    floatToIntBits = zzwj.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 7:
                    i2 = i4 * 53;
                    floatToIntBits = zzty.zza(zzwj.zzw(obj, j));
                    i4 = i2 + floatToIntBits;
                    break;
                case 8:
                    i2 = i4 * 53;
                    floatToIntBits = ((String) zzwj.zzf(obj, j)).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 9:
                    i3 = i4 * 53;
                    Object zzf = zzwj.zzf(obj, j);
                    if (zzf != null) {
                        i8 = zzf.hashCode();
                    }
                    i4 = i3 + i8;
                    break;
                case 10:
                    i2 = i4 * 53;
                    floatToIntBits = zzwj.zzf(obj, j).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 11:
                    i2 = i4 * 53;
                    floatToIntBits = zzwj.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 12:
                    i2 = i4 * 53;
                    floatToIntBits = zzwj.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 13:
                    i2 = i4 * 53;
                    floatToIntBits = zzwj.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 14:
                    i = i4 * 53;
                    doubleToLongBits = zzwj.zzd(obj, j);
                    byte[] bArr5 = zzty.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i4 * 53;
                    floatToIntBits = zzwj.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    doubleToLongBits = zzwj.zzd(obj, j);
                    byte[] bArr6 = zzty.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i3 = i4 * 53;
                    Object zzf2 = zzwj.zzf(obj, j);
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
                    floatToIntBits = zzwj.zzf(obj, j).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 50:
                    i2 = i4 * 53;
                    floatToIntBits = zzwj.zzf(obj, j).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 51:
                    if (zzC(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzj(obj, j));
                        byte[] bArr7 = zzty.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzC(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(zzk(obj, j));
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzC(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr8 = zzty.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzC(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr9 = zzty.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzC(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzl(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzC(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr10 = zzty.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzC(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzl(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzC(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzty.zza(zzD(obj, j));
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzC(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = ((String) zzwj.zzf(obj, j)).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzC(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzwj.zzf(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzC(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzwj.zzf(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzC(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzl(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzC(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzl(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzC(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzl(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzC(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr11 = zzty.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzC(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzl(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzC(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr12 = zzty.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzC(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzwj.zzf(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
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

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        continue;
     */
    @Override // com.google.android.gms.internal.cast.zzvi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(Object obj) {
        if (zzB(obj)) {
            if (obj instanceof zztp) {
                zztp zztpVar = (zztp) obj;
                zztpVar.zzI(ConnectionsManager.DEFAULT_DATACENTER_ID);
                zztpVar.zza = 0;
                zztpVar.zzG();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zzo = zzo(i);
                int i2 = 1048575 & zzo;
                int zzn = zzn(zzo);
                long j = i2;
                if (zzn != 9) {
                    if (zzn != 60 && zzn != 68) {
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
                                break;
                            case 50:
                                Object object = zzb.getObject(obj, j);
                                if (object != null) {
                                    WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(object);
                                    throw null;
                                }
                                break;
                        }
                    } else if (zzC(obj, this.zzc[i], i)) {
                        zzq(i).zzd(zzb.getObject(obj, j));
                    }
                }
                if (zzy(obj, i)) {
                    zzq(i).zzd(zzb.getObject(obj, j));
                }
            }
            this.zzj.zze(obj);
            if (this.zzf) {
                this.zzk.zzb(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.zzvi
    public final void zze(Object obj, Object obj2) {
        if (!zzB(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
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
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzy(obj2, i)) {
                        zzwj.zzp(obj, j, zzwj.zzb(obj2, j));
                        zzv(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzy(obj2, i)) {
                        zzwj.zzr(obj, j, zzwj.zzd(obj2, j));
                        zzv(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzy(obj2, i)) {
                        zzwj.zzr(obj, j, zzwj.zzd(obj2, j));
                        zzv(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzy(obj2, i)) {
                        zzwj.zzq(obj, j, zzwj.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzy(obj2, i)) {
                        zzwj.zzr(obj, j, zzwj.zzd(obj2, j));
                        zzv(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzy(obj2, i)) {
                        zzwj.zzq(obj, j, zzwj.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzy(obj2, i)) {
                        zzwj.zzm(obj, j, zzwj.zzw(obj2, j));
                        zzv(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzy(obj2, i)) {
                        zzwj.zzs(obj, j, zzwj.zzf(obj2, j));
                        zzv(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzt(obj, obj2, i);
                    break;
                case 10:
                    if (zzy(obj2, i)) {
                        zzwj.zzs(obj, j, zzwj.zzf(obj2, j));
                        zzv(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzy(obj2, i)) {
                        zzwj.zzq(obj, j, zzwj.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzy(obj2, i)) {
                        zzwj.zzq(obj, j, zzwj.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzy(obj2, i)) {
                        zzwj.zzq(obj, j, zzwj.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzy(obj2, i)) {
                        zzwj.zzr(obj, j, zzwj.zzd(obj2, j));
                        zzv(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzy(obj2, i)) {
                        zzwj.zzq(obj, j, zzwj.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzy(obj2, i)) {
                        zzwj.zzr(obj, j, zzwj.zzd(obj2, j));
                        zzv(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzt(obj, obj2, i);
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
                    this.zzi.zzb(obj, obj2, j);
                    break;
                case 50:
                    int i4 = zzvk.$r8$clinit;
                    Object zzf = zzwj.zzf(obj, j);
                    Object zzf2 = zzwj.zzf(obj2, j);
                    WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzf);
                    WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzf2);
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
                    if (zzC(obj2, i3, i)) {
                        zzwj.zzs(obj, j, zzwj.zzf(obj2, j));
                        zzw(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzu(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzC(obj2, i3, i)) {
                        zzwj.zzs(obj, j, zzwj.zzf(obj2, j));
                        zzw(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzu(obj, obj2, i);
                    break;
            }
        }
        zzvk.zzo(this.zzj, obj, obj2);
        if (this.zzf) {
            this.zzk.zza(obj2);
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.cast.zzvi
    public final void zzf(Object obj, zzwq zzwqVar) {
        int i;
        zzva zzvaVar = this;
        if (zzvaVar.zzf) {
            zzvaVar.zzk.zza(obj);
            throw null;
        }
        int[] iArr = zzvaVar.zzc;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 1048575;
        int i5 = 0;
        while (i3 < iArr.length) {
            int zzo = zzvaVar.zzo(i3);
            int[] iArr2 = zzvaVar.zzc;
            int zzn = zzn(zzo);
            int i6 = iArr2[i3];
            if (zzn <= 17) {
                int i7 = iArr2[i3 + 2];
                int i8 = i7 & i2;
                if (i8 != i4) {
                    i5 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i4 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = zzo & i2;
            switch (zzn) {
                case 0:
                    if (zzvaVar.zzz(obj, i3, i4, i5, i)) {
                        zzwqVar.zzf(i6, zzwj.zza(obj, j));
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 1:
                    if (zzvaVar.zzz(obj, i3, i4, i5, i)) {
                        zzwqVar.zzn(i6, zzwj.zzb(obj, j));
                    }
                    zzvaVar = this;
                    i3 += 3;
                    i2 = 1048575;
                case 2:
                    if (zzvaVar.zzz(obj, i3, i4, i5, i)) {
                        zzwqVar.zzs(i6, unsafe.getLong(obj, j));
                    }
                    zzvaVar = this;
                    i3 += 3;
                    i2 = 1048575;
                case 3:
                    if (zzvaVar.zzz(obj, i3, i4, i5, i)) {
                        zzwqVar.zzH(i6, unsafe.getLong(obj, j));
                    }
                    zzvaVar = this;
                    i3 += 3;
                    i2 = 1048575;
                case 4:
                    if (zzvaVar.zzz(obj, i3, i4, i5, i)) {
                        zzwqVar.zzq(i6, unsafe.getInt(obj, j));
                    }
                    zzvaVar = this;
                    i3 += 3;
                    i2 = 1048575;
                case 5:
                    if (zzvaVar.zzz(obj, i3, i4, i5, i)) {
                        zzwqVar.zzl(i6, unsafe.getLong(obj, j));
                    }
                    zzvaVar = this;
                    i3 += 3;
                    i2 = 1048575;
                case 6:
                    if (zzvaVar.zzz(obj, i3, i4, i5, i)) {
                        zzwqVar.zzj(i6, unsafe.getInt(obj, j));
                    }
                    zzvaVar = this;
                    i3 += 3;
                    i2 = 1048575;
                case 7:
                    if (zzvaVar.zzz(obj, i3, i4, i5, i)) {
                        zzwqVar.zzb(i6, zzwj.zzw(obj, j));
                    }
                    zzvaVar = this;
                    i3 += 3;
                    i2 = 1048575;
                case 8:
                    if (zzvaVar.zzz(obj, i3, i4, i5, i)) {
                        zzE(i6, unsafe.getObject(obj, j), zzwqVar);
                    }
                    zzvaVar = this;
                    i3 += 3;
                    i2 = 1048575;
                case 9:
                    if (zzvaVar.zzz(obj, i3, i4, i5, i)) {
                        zzwqVar.zzu(i6, unsafe.getObject(obj, j), zzvaVar.zzq(i3));
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 10:
                    if (zzvaVar.zzz(obj, i3, i4, i5, i)) {
                        zzwqVar.zzd(i6, (zzsu) unsafe.getObject(obj, j));
                    }
                    zzvaVar = this;
                    i3 += 3;
                    i2 = 1048575;
                case 11:
                    if (zzvaVar.zzz(obj, i3, i4, i5, i)) {
                        zzwqVar.zzF(i6, unsafe.getInt(obj, j));
                    }
                    zzvaVar = this;
                    i3 += 3;
                    i2 = 1048575;
                case 12:
                    if (zzvaVar.zzz(obj, i3, i4, i5, i)) {
                        zzwqVar.zzh(i6, unsafe.getInt(obj, j));
                    }
                    zzvaVar = this;
                    i3 += 3;
                    i2 = 1048575;
                case 13:
                    if (zzvaVar.zzz(obj, i3, i4, i5, i)) {
                        zzwqVar.zzv(i6, unsafe.getInt(obj, j));
                    }
                    zzvaVar = this;
                    i3 += 3;
                    i2 = 1048575;
                case 14:
                    if (zzvaVar.zzz(obj, i3, i4, i5, i)) {
                        zzwqVar.zzx(i6, unsafe.getLong(obj, j));
                    }
                    zzvaVar = this;
                    i3 += 3;
                    i2 = 1048575;
                case 15:
                    if (zzvaVar.zzz(obj, i3, i4, i5, i)) {
                        zzwqVar.zzz(i6, unsafe.getInt(obj, j));
                    }
                    zzvaVar = this;
                    i3 += 3;
                    i2 = 1048575;
                case 16:
                    if (zzvaVar.zzz(obj, i3, i4, i5, i)) {
                        zzwqVar.zzB(i6, unsafe.getLong(obj, j));
                    }
                    zzvaVar = this;
                    i3 += 3;
                    i2 = 1048575;
                case 17:
                    if (zzvaVar.zzz(obj, i3, i4, i5, i)) {
                        zzwqVar.zzp(i6, unsafe.getObject(obj, j), zzvaVar.zzq(i3));
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 18:
                    zzvk.zzr(zzvaVar.zzc[i3], (List) unsafe.getObject(obj, j), zzwqVar, false);
                    i3 += 3;
                    i2 = 1048575;
                case 19:
                    zzvk.zzv(zzvaVar.zzc[i3], (List) unsafe.getObject(obj, j), zzwqVar, false);
                    i3 += 3;
                    i2 = 1048575;
                case 20:
                    zzvk.zzx(zzvaVar.zzc[i3], (List) unsafe.getObject(obj, j), zzwqVar, false);
                    i3 += 3;
                    i2 = 1048575;
                case 21:
                    zzvk.zzD(zzvaVar.zzc[i3], (List) unsafe.getObject(obj, j), zzwqVar, false);
                    i3 += 3;
                    i2 = 1048575;
                case 22:
                    zzvk.zzw(zzvaVar.zzc[i3], (List) unsafe.getObject(obj, j), zzwqVar, false);
                    i3 += 3;
                    i2 = 1048575;
                case 23:
                    zzvk.zzu(zzvaVar.zzc[i3], (List) unsafe.getObject(obj, j), zzwqVar, false);
                    i3 += 3;
                    i2 = 1048575;
                case 24:
                    zzvk.zzt(zzvaVar.zzc[i3], (List) unsafe.getObject(obj, j), zzwqVar, false);
                    i3 += 3;
                    i2 = 1048575;
                case 25:
                    zzvk.zzq(zzvaVar.zzc[i3], (List) unsafe.getObject(obj, j), zzwqVar, false);
                    i3 += 3;
                    i2 = 1048575;
                case 26:
                    int i9 = zzvaVar.zzc[i3];
                    List list = (List) unsafe.getObject(obj, j);
                    int i10 = zzvk.$r8$clinit;
                    if (list != null && !list.isEmpty()) {
                        zzwqVar.zzE(i9, list);
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 27:
                    int i11 = zzvaVar.zzc[i3];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zzvi zzq = zzvaVar.zzq(i3);
                    int i12 = zzvk.$r8$clinit;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i13 = 0; i13 < list2.size(); i13++) {
                            ((zztd) zzwqVar).zzu(i11, list2.get(i13), zzq);
                        }
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 28:
                    int i14 = zzvaVar.zzc[i3];
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i15 = zzvk.$r8$clinit;
                    if (list3 != null && !list3.isEmpty()) {
                        zzwqVar.zze(i14, list3);
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 29:
                    zzvk.zzC(zzvaVar.zzc[i3], (List) unsafe.getObject(obj, j), zzwqVar, false);
                    i3 += 3;
                    i2 = 1048575;
                case 30:
                    zzvk.zzs(zzvaVar.zzc[i3], (List) unsafe.getObject(obj, j), zzwqVar, false);
                    i3 += 3;
                    i2 = 1048575;
                case 31:
                    zzvk.zzy(zzvaVar.zzc[i3], (List) unsafe.getObject(obj, j), zzwqVar, false);
                    i3 += 3;
                    i2 = 1048575;
                case 32:
                    zzvk.zzz(zzvaVar.zzc[i3], (List) unsafe.getObject(obj, j), zzwqVar, false);
                    i3 += 3;
                    i2 = 1048575;
                case 33:
                    zzvk.zzA(zzvaVar.zzc[i3], (List) unsafe.getObject(obj, j), zzwqVar, false);
                    i3 += 3;
                    i2 = 1048575;
                case 34:
                    zzvk.zzB(zzvaVar.zzc[i3], (List) unsafe.getObject(obj, j), zzwqVar, false);
                    i3 += 3;
                    i2 = 1048575;
                case 35:
                    zzvk.zzr(zzvaVar.zzc[i3], (List) unsafe.getObject(obj, j), zzwqVar, true);
                    i3 += 3;
                    i2 = 1048575;
                case 36:
                    zzvk.zzv(zzvaVar.zzc[i3], (List) unsafe.getObject(obj, j), zzwqVar, true);
                    i3 += 3;
                    i2 = 1048575;
                case 37:
                    zzvk.zzx(zzvaVar.zzc[i3], (List) unsafe.getObject(obj, j), zzwqVar, true);
                    i3 += 3;
                    i2 = 1048575;
                case 38:
                    zzvk.zzD(zzvaVar.zzc[i3], (List) unsafe.getObject(obj, j), zzwqVar, true);
                    i3 += 3;
                    i2 = 1048575;
                case 39:
                    zzvk.zzw(zzvaVar.zzc[i3], (List) unsafe.getObject(obj, j), zzwqVar, true);
                    i3 += 3;
                    i2 = 1048575;
                case 40:
                    zzvk.zzu(zzvaVar.zzc[i3], (List) unsafe.getObject(obj, j), zzwqVar, true);
                    i3 += 3;
                    i2 = 1048575;
                case 41:
                    zzvk.zzt(zzvaVar.zzc[i3], (List) unsafe.getObject(obj, j), zzwqVar, true);
                    i3 += 3;
                    i2 = 1048575;
                case 42:
                    zzvk.zzq(zzvaVar.zzc[i3], (List) unsafe.getObject(obj, j), zzwqVar, true);
                    i3 += 3;
                    i2 = 1048575;
                case 43:
                    zzvk.zzC(zzvaVar.zzc[i3], (List) unsafe.getObject(obj, j), zzwqVar, true);
                    i3 += 3;
                    i2 = 1048575;
                case 44:
                    zzvk.zzs(zzvaVar.zzc[i3], (List) unsafe.getObject(obj, j), zzwqVar, true);
                    i3 += 3;
                    i2 = 1048575;
                case 45:
                    zzvk.zzy(zzvaVar.zzc[i3], (List) unsafe.getObject(obj, j), zzwqVar, true);
                    i3 += 3;
                    i2 = 1048575;
                case 46:
                    zzvk.zzz(zzvaVar.zzc[i3], (List) unsafe.getObject(obj, j), zzwqVar, true);
                    i3 += 3;
                    i2 = 1048575;
                case 47:
                    zzvk.zzA(zzvaVar.zzc[i3], (List) unsafe.getObject(obj, j), zzwqVar, true);
                    i3 += 3;
                    i2 = 1048575;
                case 48:
                    zzvk.zzB(zzvaVar.zzc[i3], (List) unsafe.getObject(obj, j), zzwqVar, true);
                    i3 += 3;
                    i2 = 1048575;
                case 49:
                    int i16 = zzvaVar.zzc[i3];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zzvi zzq2 = zzvaVar.zzq(i3);
                    int i17 = zzvk.$r8$clinit;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i18 = 0; i18 < list4.size(); i18++) {
                            ((zztd) zzwqVar).zzp(i16, list4.get(i18), zzq2);
                        }
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzvaVar.zzr(i3));
                        throw null;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 51:
                    if (zzvaVar.zzC(obj, i6, i3)) {
                        zzwqVar.zzf(i6, zzj(obj, j));
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 52:
                    if (zzvaVar.zzC(obj, i6, i3)) {
                        zzwqVar.zzn(i6, zzk(obj, j));
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 53:
                    if (zzvaVar.zzC(obj, i6, i3)) {
                        zzwqVar.zzs(i6, zzp(obj, j));
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 54:
                    if (zzvaVar.zzC(obj, i6, i3)) {
                        zzwqVar.zzH(i6, zzp(obj, j));
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 55:
                    if (zzvaVar.zzC(obj, i6, i3)) {
                        zzwqVar.zzq(i6, zzl(obj, j));
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 56:
                    if (zzvaVar.zzC(obj, i6, i3)) {
                        zzwqVar.zzl(i6, zzp(obj, j));
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 57:
                    if (zzvaVar.zzC(obj, i6, i3)) {
                        zzwqVar.zzj(i6, zzl(obj, j));
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 58:
                    if (zzvaVar.zzC(obj, i6, i3)) {
                        zzwqVar.zzb(i6, zzD(obj, j));
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 59:
                    if (zzvaVar.zzC(obj, i6, i3)) {
                        zzE(i6, unsafe.getObject(obj, j), zzwqVar);
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 60:
                    if (zzvaVar.zzC(obj, i6, i3)) {
                        zzwqVar.zzu(i6, unsafe.getObject(obj, j), zzvaVar.zzq(i3));
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 61:
                    if (zzvaVar.zzC(obj, i6, i3)) {
                        zzwqVar.zzd(i6, (zzsu) unsafe.getObject(obj, j));
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 62:
                    if (zzvaVar.zzC(obj, i6, i3)) {
                        zzwqVar.zzF(i6, zzl(obj, j));
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 63:
                    if (zzvaVar.zzC(obj, i6, i3)) {
                        zzwqVar.zzh(i6, zzl(obj, j));
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 64:
                    if (zzvaVar.zzC(obj, i6, i3)) {
                        zzwqVar.zzv(i6, zzl(obj, j));
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 65:
                    if (zzvaVar.zzC(obj, i6, i3)) {
                        zzwqVar.zzx(i6, zzp(obj, j));
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 66:
                    if (zzvaVar.zzC(obj, i6, i3)) {
                        zzwqVar.zzz(i6, zzl(obj, j));
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 67:
                    if (zzvaVar.zzC(obj, i6, i3)) {
                        zzwqVar.zzB(i6, zzp(obj, j));
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 68:
                    if (zzvaVar.zzC(obj, i6, i3)) {
                        zzwqVar.zzp(i6, unsafe.getObject(obj, j), zzvaVar.zzq(i3));
                    }
                    i3 += 3;
                    i2 = 1048575;
                default:
                    i3 += 3;
                    i2 = 1048575;
            }
        }
        zzvz zzvzVar = zzvaVar.zzj;
        zzvzVar.zzg(zzvzVar.zzc(obj), zzwqVar);
    }

    @Override // com.google.android.gms.internal.cast.zzvi
    public final boolean zzg(Object obj, Object obj2) {
        boolean zzE;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzo = zzo(i);
            long j = zzo & 1048575;
            switch (zzn(zzo)) {
                case 0:
                    if (zzx(obj, obj2, i) && Double.doubleToLongBits(zzwj.zza(obj, j)) == Double.doubleToLongBits(zzwj.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzx(obj, obj2, i) && Float.floatToIntBits(zzwj.zzb(obj, j)) == Float.floatToIntBits(zzwj.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzx(obj, obj2, i) && zzwj.zzd(obj, j) == zzwj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzx(obj, obj2, i) && zzwj.zzd(obj, j) == zzwj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzx(obj, obj2, i) && zzwj.zzc(obj, j) == zzwj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzx(obj, obj2, i) && zzwj.zzd(obj, j) == zzwj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzx(obj, obj2, i) && zzwj.zzc(obj, j) == zzwj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzx(obj, obj2, i) && zzwj.zzw(obj, j) == zzwj.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzx(obj, obj2, i) && zzvk.zzE(zzwj.zzf(obj, j), zzwj.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzx(obj, obj2, i) && zzvk.zzE(zzwj.zzf(obj, j), zzwj.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzx(obj, obj2, i) && zzvk.zzE(zzwj.zzf(obj, j), zzwj.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzx(obj, obj2, i) && zzwj.zzc(obj, j) == zzwj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzx(obj, obj2, i) && zzwj.zzc(obj, j) == zzwj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzx(obj, obj2, i) && zzwj.zzc(obj, j) == zzwj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzx(obj, obj2, i) && zzwj.zzd(obj, j) == zzwj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzx(obj, obj2, i) && zzwj.zzc(obj, j) == zzwj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzx(obj, obj2, i) && zzwj.zzd(obj, j) == zzwj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzx(obj, obj2, i) && zzvk.zzE(zzwj.zzf(obj, j), zzwj.zzf(obj2, j))) {
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
                    zzE = zzvk.zzE(zzwj.zzf(obj, j), zzwj.zzf(obj2, j));
                    break;
                case 50:
                    zzE = zzvk.zzE(zzwj.zzf(obj, j), zzwj.zzf(obj2, j));
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
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzE) {
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
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.zzh) {
            int[] iArr = this.zzg;
            int[] iArr2 = this.zzc;
            int i7 = iArr[i6];
            int i8 = iArr2[i7];
            int zzo = zzo(i7);
            int i9 = this.zzc[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = zzb.getInt(obj, i10);
                }
                i = i5;
                i4 = i10;
            } else {
                i = i5;
            }
            if ((268435456 & zzo) != 0) {
                i2 = i7;
                i3 = i4;
                if (!zzz(obj, i2, i3, i, i11)) {
                    return false;
                }
            } else {
                i2 = i7;
                i3 = i4;
            }
            int zzn = zzn(zzo);
            if (zzn != 9 && zzn != 17) {
                if (zzn != 27) {
                    if (zzn == 60 || zzn == 68) {
                        if (zzC(obj, i8, i2) && !zzA(obj, zzo, zzq(i2))) {
                            return false;
                        }
                    } else if (zzn != 49) {
                        if (zzn == 50) {
                            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzwj.zzf(obj, zzo & 1048575));
                            throw null;
                        }
                    }
                }
                List list = (List) zzwj.zzf(obj, zzo & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzvi zzq = zzq(i2);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!zzq.zzh(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (zzz(obj, i2, i3, i, i11) && !zzA(obj, zzo, zzq(i2))) {
                return false;
            }
            i6++;
            i4 = i3;
            i5 = i;
        }
        if (!this.zzf) {
            return true;
        }
        this.zzk.zza(obj);
        throw null;
    }
}
