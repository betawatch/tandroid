package com.google.android.gms.internal.play_billing;

import androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticNonNull0;
import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
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
final class zzip implements zzix {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzjq.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzim zzg;
    private final boolean zzh = false;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzjj zzl;
    private final zzgx zzm;

    private zzip(int[] iArr, Object[] objArr, int i, int i2, zzim zzimVar, boolean z, int[] iArr2, int i3, int i4, zzir zzirVar, zzhz zzhzVar, zzjj zzjjVar, zzgx zzgxVar, zzih zzihVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = iArr2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = zzjjVar;
        this.zzm = zzgxVar;
        this.zzg = zzimVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzB(Object obj, Object obj2, int i) {
        if (zzI(obj2, i)) {
            int zzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzix zzv = zzv(i);
            if (!zzI(obj, i)) {
                if (zzL(object)) {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzD(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzM(obj2, i2, i)) {
            int zzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzix zzv = zzv(i);
            if (!zzM(obj, i2, i)) {
                if (zzL(object)) {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzE(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i) {
        int zzp = zzp(i);
        long j = 1048575 & zzp;
        if (j == 1048575) {
            return;
        }
        zzjq.zzq(obj, j, (1 << (zzp >>> 20)) | zzjq.zzc(obj, j));
    }

    private final void zzE(Object obj, int i, int i2) {
        zzjq.zzq(obj, zzp(i2) & 1048575, i);
    }

    private final void zzF(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzs(i) & 1048575, obj2);
        zzD(obj, i);
    }

    private final void zzG(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzs(i2) & 1048575, obj2);
        zzE(obj, i, i2);
    }

    private final boolean zzH(Object obj, Object obj2, int i) {
        return zzI(obj, i) == zzI(obj2, i);
    }

    private final boolean zzI(Object obj, int i) {
        int zzp = zzp(i);
        long j = zzp & 1048575;
        if (j != 1048575) {
            return (zzjq.zzc(obj, j) & (1 << (zzp >>> 20))) != 0;
        }
        int zzs = zzs(i);
        long j2 = zzs & 1048575;
        switch (zzr(zzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzjq.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzjq.zzb(obj, j2)) != 0;
            case 2:
                return zzjq.zzd(obj, j2) != 0;
            case 3:
                return zzjq.zzd(obj, j2) != 0;
            case 4:
                return zzjq.zzc(obj, j2) != 0;
            case 5:
                return zzjq.zzd(obj, j2) != 0;
            case 6:
                return zzjq.zzc(obj, j2) != 0;
            case 7:
                return zzjq.zzw(obj, j2);
            case 8:
                Object zzf = zzjq.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzgk) {
                    return !zzgk.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzjq.zzf(obj, j2) != null;
            case 10:
                return !zzgk.zzb.equals(zzjq.zzf(obj, j2));
            case 11:
                return zzjq.zzc(obj, j2) != 0;
            case 12:
                return zzjq.zzc(obj, j2) != 0;
            case 13:
                return zzjq.zzc(obj, j2) != 0;
            case 14:
                return zzjq.zzd(obj, j2) != 0;
            case 15:
                return zzjq.zzc(obj, j2) != 0;
            case 16:
                return zzjq.zzd(obj, j2) != 0;
            case 17:
                return zzjq.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzI(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzK(Object obj, int i, zzix zzixVar) {
        return zzixVar.zzk(zzjq.zzf(obj, i & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzhk) {
            return ((zzhk) obj).zzA();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i, int i2) {
        return zzjq.zzc(obj, (long) (zzp(i2) & 1048575)) == i;
    }

    private static boolean zzN(Object obj, long j) {
        return ((Boolean) zzjq.zzf(obj, j)).booleanValue();
    }

    private static final void zzO(int i, Object obj, zzjw zzjwVar) {
        if (obj instanceof String) {
            zzjwVar.zzG(i, (String) obj);
        } else {
            zzjwVar.zzd(i, (zzgk) obj);
        }
    }

    static zzjk zzd(Object obj) {
        zzhk zzhkVar = (zzhk) obj;
        zzjk zzjkVar = zzhkVar.zzc;
        if (zzjkVar != zzjk.zzc()) {
            return zzjkVar;
        }
        zzjk zzf = zzjk.zzf();
        zzhkVar.zzc = zzf;
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
    static zzip zzl(Class cls, zzij zzijVar, zzir zzirVar, zzhz zzhzVar, zzjj zzjjVar, zzgx zzgxVar, zzih zzihVar) {
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
        Field zzz;
        char charAt10;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Object obj;
        Field zzz2;
        Object obj2;
        Field zzz3;
        int i29;
        char charAt11;
        int i30;
        char charAt12;
        int i31;
        char charAt13;
        int i32;
        char charAt14;
        if (!(zzijVar instanceof zziw)) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzijVar);
            throw null;
        }
        zziw zziwVar = (zziw) zzijVar;
        String zzd = zziwVar.zzd();
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
        Object[] zze = zziwVar.zze();
        Class<?> cls2 = zziwVar.zza().getClass();
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
            zziw zziwVar2 = zziwVar;
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
                        if (zziwVar2.zzc() == 1 || i78 != 0) {
                            i27 = i6 + 1;
                            int i86 = i68 / 3;
                            objArr[i86 + i86 + 1] = zze[i6];
                        } else {
                            i28 = 0;
                            int i87 = charAt26 + charAt26;
                            obj = zze[i87];
                            i78 = i28;
                            if (obj instanceof Field) {
                                zzz2 = (Field) obj;
                            } else {
                                zzz2 = zzz(cls2, (String) obj);
                                zze[i87] = zzz2;
                            }
                            int i88 = i7;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz2);
                            int i89 = i87 + 1;
                            obj2 = zze[i89];
                            i19 = i88;
                            if (obj2 instanceof Field) {
                                zzz3 = (Field) obj2;
                            } else {
                                zzz3 = zzz(cls2, (String) obj2);
                                zze[i89] = zzz3;
                            }
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzz3);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzz2);
                    int i892 = i872 + 1;
                    obj2 = zze[i892];
                    i19 = i882;
                    if (obj2 instanceof Field) {
                    }
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzz3);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzz2);
                int i8922 = i8722 + 1;
                obj2 = zze[i8922];
                i19 = i8822;
                if (obj2 instanceof Field) {
                }
                int objectFieldOffset222 = (int) unsafe.objectFieldOffset(zzz3);
                str = zzd;
                i17 = i83;
                i22 = 0;
                i21 = objectFieldOffset222;
            } else {
                i18 = length;
                i19 = i7;
                int i90 = i6 + 1;
                Field zzz4 = zzz(cls2, (String) zze[i6]);
                if (i77 == 9 || i77 == 17) {
                    i20 = i90;
                    int i91 = i68 / 3;
                    objArr[i91 + i91 + 1] = zzz4.getType();
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
                        if (zziwVar2.zzc() == 1 || i78 != 0) {
                            i6 += 2;
                            int i92 = i68 / 3;
                            objArr[i92 + i92 + 1] = zze[i90];
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
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
                                    zzz = (Field) obj3;
                                } else {
                                    zzz = zzz(cls2, (String) obj3);
                                    zze[i96] = zzz;
                                }
                                int i97 = charAt27;
                                i21 = (int) unsafe.objectFieldOffset(zzz);
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
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
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
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
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
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
                    i21 = 1048575;
                    if ((charAt25 & 4096) != 0) {
                    }
                    i22 = 0;
                    if (i77 >= 18) {
                    }
                }
                str = zzd;
                i6 = i20;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
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
            zziwVar = zziwVar2;
            length = i18;
            i7 = i19;
            c = CharacterCompat.MIN_HIGH_SURROGATE;
        }
        return new zzip(iArr3, objArr, i2, i4, zziwVar.zza(), false, iArr, i5, i63, zzirVar, zzhzVar, zzjjVar, zzgxVar, zzihVar);
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zzjq.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zzjq.zzf(obj, j)).floatValue();
    }

    private static int zzo(Object obj, long j) {
        return ((Integer) zzjq.zzf(obj, j)).intValue();
    }

    private final int zzp(int i) {
        return this.zzc[i + 2];
    }

    private final int zzq(int i, int i2) {
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

    private static int zzr(int i) {
        return (i >>> 20) & NotificationCenter.didReceiveSmsCode;
    }

    private final int zzs(int i) {
        return this.zzc[i + 1];
    }

    private static long zzt(Object obj, long j) {
        return ((Long) zzjq.zzf(obj, j)).longValue();
    }

    private final zzhm zzu(int i) {
        int i2 = i / 3;
        return (zzhm) this.zzd[i2 + i2 + 1];
    }

    private final zzix zzv(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzix zzixVar = (zzix) objArr[i3];
        if (zzixVar != null) {
            return zzixVar;
        }
        zzix zzb2 = zziu.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzw(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzx(Object obj, int i) {
        zzix zzv = zzv(i);
        int zzs = zzs(i) & 1048575;
        if (!zzI(obj, i)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs);
        if (zzL(object)) {
            return object;
        }
        Object zze = zzv.zze();
        if (object != null) {
            zzv.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzy(Object obj, int i, int i2) {
        zzix zzv = zzv(i2);
        if (!zzM(obj, i, i2)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i2) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object zze = zzv.zze();
        if (object != null) {
            zzv.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzz(Class cls, String str) {
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

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final int zza(Object obj) {
        int i;
        int zzz;
        int zzz2;
        int zzA;
        int zzz3;
        int zzz4;
        int zzz5;
        int zzd;
        int zzz6;
        int zzh;
        int zzg;
        int size;
        int zzl;
        int zzz7;
        int zzz8;
        int zzz9;
        int i2;
        int zze;
        int zzz10;
        int zzz11;
        int i3;
        int zzz12;
        int zzz13;
        int zzz14;
        int zzd2;
        int zzz15;
        zzip zzipVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i4 = 0;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i4 < zzipVar.zzc.length) {
            int zzs = zzipVar.zzs(i4);
            int zzr = zzr(zzs);
            int[] iArr = zzipVar.zzc;
            int i8 = iArr[i4];
            int i9 = iArr[i4 + 2];
            int i10 = i9 & 1048575;
            if (zzr <= 17) {
                if (i10 != i5) {
                    i6 = i10 == 1048575 ? 0 : unsafe.getInt(obj2, i10);
                    i5 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            int i11 = zzs & 1048575;
            if (zzr >= zzhc.zzJ.zza()) {
                zzhc.zzW.zza();
            }
            long j = i11;
            switch (zzr) {
                case 0:
                    if (zzipVar.zzJ(obj2, i4, i5, i6, i)) {
                        i7 += zzgr.zzz(i8 << 3) + 8;
                    }
                    i4 += 3;
                    obj2 = obj;
                case 1:
                    if (zzipVar.zzJ(obj2, i4, i5, i6, i)) {
                        zzz = zzgr.zzz(i8 << 3);
                        zzz4 = zzz + 4;
                        i7 += zzz4;
                    }
                    zzipVar = this;
                    i4 += 3;
                    obj2 = obj;
                case 2:
                    if (zzipVar.zzJ(obj2, i4, i5, i6, i)) {
                        long j2 = unsafe.getLong(obj2, j);
                        zzz2 = zzgr.zzz(i8 << 3);
                        zzA = zzgr.zzA(j2);
                        zzz4 = zzz2 + zzA;
                        i7 += zzz4;
                    }
                    zzipVar = this;
                    i4 += 3;
                    obj2 = obj;
                case 3:
                    if (zzipVar.zzJ(obj2, i4, i5, i6, i)) {
                        long j3 = unsafe.getLong(obj2, j);
                        zzz2 = zzgr.zzz(i8 << 3);
                        zzA = zzgr.zzA(j3);
                        zzz4 = zzz2 + zzA;
                        i7 += zzz4;
                    }
                    zzipVar = this;
                    i4 += 3;
                    obj2 = obj;
                case 4:
                    if (zzipVar.zzJ(obj2, i4, i5, i6, i)) {
                        long j4 = unsafe.getInt(obj2, j);
                        zzz2 = zzgr.zzz(i8 << 3);
                        zzA = zzgr.zzA(j4);
                        zzz4 = zzz2 + zzA;
                        i7 += zzz4;
                    }
                    zzipVar = this;
                    i4 += 3;
                    obj2 = obj;
                case 5:
                    if (zzipVar.zzJ(obj2, i4, i5, i6, i)) {
                        zzz3 = zzgr.zzz(i8 << 3);
                        zzz4 = zzz3 + 8;
                        i7 += zzz4;
                    }
                    zzipVar = this;
                    i4 += 3;
                    obj2 = obj;
                case 6:
                    if (zzipVar.zzJ(obj2, i4, i5, i6, i)) {
                        zzz = zzgr.zzz(i8 << 3);
                        zzz4 = zzz + 4;
                        i7 += zzz4;
                    }
                    zzipVar = this;
                    i4 += 3;
                    obj2 = obj;
                case 7:
                    if (zzipVar.zzJ(obj2, i4, i5, i6, i)) {
                        zzz4 = zzgr.zzz(i8 << 3) + 1;
                        i7 += zzz4;
                    }
                    zzipVar = this;
                    i4 += 3;
                    obj2 = obj;
                case 8:
                    if (zzipVar.zzJ(obj2, i4, i5, i6, i)) {
                        int i12 = i8 << 3;
                        Object object = unsafe.getObject(obj2, j);
                        if (object instanceof zzgk) {
                            zzz5 = zzgr.zzz(i12);
                            zzd = ((zzgk) object).zzd();
                            zzz6 = zzgr.zzz(zzd);
                            zzz4 = zzz5 + zzz6 + zzd;
                            i7 += zzz4;
                        } else {
                            zzz2 = zzgr.zzz(i12);
                            zzA = zzgr.zzy((String) object);
                            zzz4 = zzz2 + zzA;
                            i7 += zzz4;
                        }
                    }
                    zzipVar = this;
                    i4 += 3;
                    obj2 = obj;
                case 9:
                    if (zzipVar.zzJ(obj2, i4, i5, i6, i)) {
                        zzh = zziz.zzh(i8, unsafe.getObject(obj2, j), zzipVar.zzv(i4));
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 10:
                    if (zzipVar.zzJ(obj2, i4, i5, i6, i)) {
                        zzgk zzgkVar = (zzgk) unsafe.getObject(obj2, j);
                        zzz5 = zzgr.zzz(i8 << 3);
                        zzd = zzgkVar.zzd();
                        zzz6 = zzgr.zzz(zzd);
                        zzz4 = zzz5 + zzz6 + zzd;
                        i7 += zzz4;
                    }
                    zzipVar = this;
                    i4 += 3;
                    obj2 = obj;
                case 11:
                    if (zzipVar.zzJ(obj2, i4, i5, i6, i)) {
                        int i13 = unsafe.getInt(obj2, j);
                        zzz2 = zzgr.zzz(i8 << 3);
                        zzA = zzgr.zzz(i13);
                        zzz4 = zzz2 + zzA;
                        i7 += zzz4;
                    }
                    zzipVar = this;
                    i4 += 3;
                    obj2 = obj;
                case 12:
                    if (zzipVar.zzJ(obj2, i4, i5, i6, i)) {
                        long j5 = unsafe.getInt(obj2, j);
                        zzz2 = zzgr.zzz(i8 << 3);
                        zzA = zzgr.zzA(j5);
                        zzz4 = zzz2 + zzA;
                        i7 += zzz4;
                    }
                    zzipVar = this;
                    i4 += 3;
                    obj2 = obj;
                case 13:
                    if (zzipVar.zzJ(obj2, i4, i5, i6, i)) {
                        zzz = zzgr.zzz(i8 << 3);
                        zzz4 = zzz + 4;
                        i7 += zzz4;
                    }
                    zzipVar = this;
                    i4 += 3;
                    obj2 = obj;
                case 14:
                    if (zzipVar.zzJ(obj2, i4, i5, i6, i)) {
                        zzz3 = zzgr.zzz(i8 << 3);
                        zzz4 = zzz3 + 8;
                        i7 += zzz4;
                    }
                    zzipVar = this;
                    i4 += 3;
                    obj2 = obj;
                case 15:
                    if (zzipVar.zzJ(obj2, i4, i5, i6, i)) {
                        int i14 = unsafe.getInt(obj2, j);
                        zzz2 = zzgr.zzz(i8 << 3);
                        zzA = zzgr.zzz((i14 >> 31) ^ (i14 + i14));
                        zzz4 = zzz2 + zzA;
                        i7 += zzz4;
                    }
                    zzipVar = this;
                    i4 += 3;
                    obj2 = obj;
                case 16:
                    if (zzipVar.zzJ(obj2, i4, i5, i6, i)) {
                        long j6 = unsafe.getLong(obj2, j);
                        zzz2 = zzgr.zzz(i8 << 3);
                        zzA = zzgr.zzA((j6 >> 63) ^ (j6 + j6));
                        zzz4 = zzz2 + zzA;
                        i7 += zzz4;
                    }
                    zzipVar = this;
                    i4 += 3;
                    obj2 = obj;
                case 17:
                    if (zzipVar.zzJ(obj2, i4, i5, i6, i)) {
                        zzh = zzgr.zzw(i8, (zzim) unsafe.getObject(obj2, j), zzipVar.zzv(i4));
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 18:
                    zzh = zziz.zzd(i8, (List) unsafe.getObject(obj2, j), false);
                    i7 += zzh;
                    i4 += 3;
                    obj2 = obj;
                case 19:
                    zzh = zziz.zzb(i8, (List) unsafe.getObject(obj2, j), false);
                    i7 += zzh;
                    i4 += 3;
                    obj2 = obj;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j);
                    int i15 = zziz.$r8$clinit;
                    if (list.size() != 0) {
                        zzg = zziz.zzg(list) + (list.size() * zzgr.zzz(i8 << 3));
                        i7 += zzg;
                        i4 += 3;
                        obj2 = obj;
                    }
                    zzg = 0;
                    i7 += zzg;
                    i4 += 3;
                    obj2 = obj;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j);
                    int i16 = zziz.$r8$clinit;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zziz.zzl(list2);
                        zzz7 = zzgr.zzz(i8 << 3);
                        i2 = size * zzz7;
                        zzh = zzl + i2;
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                    }
                    zzh = 0;
                    i7 += zzh;
                    i4 += 3;
                    obj2 = obj;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j);
                    int i17 = zziz.$r8$clinit;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zziz.zzf(list3);
                        zzz7 = zzgr.zzz(i8 << 3);
                        i2 = size * zzz7;
                        zzh = zzl + i2;
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                    }
                    zzh = 0;
                    i7 += zzh;
                    i4 += 3;
                    obj2 = obj;
                case 23:
                    zzh = zziz.zzd(i8, (List) unsafe.getObject(obj2, j), false);
                    i7 += zzh;
                    i4 += 3;
                    obj2 = obj;
                case 24:
                    zzh = zziz.zzb(i8, (List) unsafe.getObject(obj2, j), false);
                    i7 += zzh;
                    i4 += 3;
                    obj2 = obj;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j);
                    int i18 = zziz.$r8$clinit;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzh = size2 * (zzgr.zzz(i8 << 3) + 1);
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                    }
                    zzh = 0;
                    i7 += zzh;
                    i4 += 3;
                    obj2 = obj;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j);
                    int i19 = zziz.$r8$clinit;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzg = zzgr.zzz(i8 << 3) * size3;
                        if (list5 instanceof zzhy) {
                            zzhy zzhyVar = (zzhy) list5;
                            for (int i20 = 0; i20 < size3; i20++) {
                                Object zzc = zzhyVar.zzc();
                                if (zzc instanceof zzgk) {
                                    int zzd3 = ((zzgk) zzc).zzd();
                                    zzg += zzgr.zzz(zzd3) + zzd3;
                                } else {
                                    zzg += zzgr.zzy((String) zzc);
                                }
                            }
                        } else {
                            for (int i21 = 0; i21 < size3; i21++) {
                                Object obj3 = list5.get(i21);
                                if (obj3 instanceof zzgk) {
                                    int zzd4 = ((zzgk) obj3).zzd();
                                    zzg += zzgr.zzz(zzd4) + zzd4;
                                } else {
                                    zzg += zzgr.zzy((String) obj3);
                                }
                            }
                        }
                        i7 += zzg;
                        i4 += 3;
                        obj2 = obj;
                    }
                    zzg = 0;
                    i7 += zzg;
                    i4 += 3;
                    obj2 = obj;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j);
                    zzix zzv = zzipVar.zzv(i4);
                    int i22 = zziz.$r8$clinit;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzz8 = 0;
                    } else {
                        zzz8 = zzgr.zzz(i8 << 3) * size4;
                        for (int i23 = 0; i23 < size4; i23++) {
                            zzz8 += zzgr.zzx((zzim) list6.get(i23), zzv);
                        }
                    }
                    i7 += zzz8;
                    i4 += 3;
                    obj2 = obj;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j);
                    int i24 = zziz.$r8$clinit;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        zzz9 = 0;
                    } else {
                        zzz9 = size5 * zzgr.zzz(i8 << 3);
                        for (int i25 = 0; i25 < list7.size(); i25++) {
                            int zzd5 = ((zzgk) list7.get(i25)).zzd();
                            zzz9 += zzgr.zzz(zzd5) + zzd5;
                        }
                    }
                    i7 += zzz9;
                    i4 += 3;
                    obj2 = obj;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j);
                    int i26 = zziz.$r8$clinit;
                    size = list8.size();
                    if (size != 0) {
                        zzl = zziz.zzk(list8);
                        zzz7 = zzgr.zzz(i8 << 3);
                        i2 = size * zzz7;
                        zzh = zzl + i2;
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                    }
                    zzh = 0;
                    i7 += zzh;
                    i4 += 3;
                    obj2 = obj;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j);
                    int i27 = zziz.$r8$clinit;
                    size = list9.size();
                    if (size != 0) {
                        zzl = zziz.zza(list9);
                        zzz7 = zzgr.zzz(i8 << 3);
                        i2 = size * zzz7;
                        zzh = zzl + i2;
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                    }
                    zzh = 0;
                    i7 += zzh;
                    i4 += 3;
                    obj2 = obj;
                case 31:
                    zzh = zziz.zzb(i8, (List) unsafe.getObject(obj2, j), false);
                    i7 += zzh;
                    i4 += 3;
                    obj2 = obj;
                case 32:
                    zzh = zziz.zzd(i8, (List) unsafe.getObject(obj2, j), false);
                    i7 += zzh;
                    i4 += 3;
                    obj2 = obj;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j);
                    int i28 = zziz.$r8$clinit;
                    size = list10.size();
                    if (size != 0) {
                        zzl = zziz.zzi(list10);
                        zzz7 = zzgr.zzz(i8 << 3);
                        i2 = size * zzz7;
                        zzh = zzl + i2;
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                    }
                    zzh = 0;
                    i7 += zzh;
                    i4 += 3;
                    obj2 = obj;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j);
                    int i29 = zziz.$r8$clinit;
                    size = list11.size();
                    if (size != 0) {
                        zzl = zziz.zzj(list11);
                        zzz7 = zzgr.zzz(i8 << 3);
                        i2 = size * zzz7;
                        zzh = zzl + i2;
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                    }
                    zzh = 0;
                    i7 += zzh;
                    i4 += 3;
                    obj2 = obj;
                case 35:
                    zze = zziz.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i8 << 3);
                        zzz11 = zzgr.zzz(zze);
                        zzz9 = zzz10 + zzz11 + zze;
                        i7 += zzz9;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 36:
                    zze = zziz.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i8 << 3);
                        zzz11 = zzgr.zzz(zze);
                        zzz9 = zzz10 + zzz11 + zze;
                        i7 += zzz9;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 37:
                    zze = zziz.zzg((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i8 << 3);
                        zzz11 = zzgr.zzz(zze);
                        zzz9 = zzz10 + zzz11 + zze;
                        i7 += zzz9;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 38:
                    zze = zziz.zzl((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i8 << 3);
                        zzz11 = zzgr.zzz(zze);
                        zzz9 = zzz10 + zzz11 + zze;
                        i7 += zzz9;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 39:
                    zze = zziz.zzf((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i8 << 3);
                        zzz11 = zzgr.zzz(zze);
                        zzz9 = zzz10 + zzz11 + zze;
                        i7 += zzz9;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 40:
                    zze = zziz.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i8 << 3);
                        zzz11 = zzgr.zzz(zze);
                        zzz9 = zzz10 + zzz11 + zze;
                        i7 += zzz9;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 41:
                    zze = zziz.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i8 << 3);
                        zzz11 = zzgr.zzz(zze);
                        zzz9 = zzz10 + zzz11 + zze;
                        i7 += zzz9;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j);
                    int i30 = zziz.$r8$clinit;
                    zze = list12.size();
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i8 << 3);
                        zzz11 = zzgr.zzz(zze);
                        zzz9 = zzz10 + zzz11 + zze;
                        i7 += zzz9;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 43:
                    zze = zziz.zzk((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i8 << 3);
                        zzz11 = zzgr.zzz(zze);
                        zzz9 = zzz10 + zzz11 + zze;
                        i7 += zzz9;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 44:
                    zze = zziz.zza((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i8 << 3);
                        zzz11 = zzgr.zzz(zze);
                        zzz9 = zzz10 + zzz11 + zze;
                        i7 += zzz9;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 45:
                    zze = zziz.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i8 << 3);
                        zzz11 = zzgr.zzz(zze);
                        zzz9 = zzz10 + zzz11 + zze;
                        i7 += zzz9;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 46:
                    zze = zziz.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i8 << 3);
                        zzz11 = zzgr.zzz(zze);
                        zzz9 = zzz10 + zzz11 + zze;
                        i7 += zzz9;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 47:
                    zze = zziz.zzi((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i8 << 3);
                        zzz11 = zzgr.zzz(zze);
                        zzz9 = zzz10 + zzz11 + zze;
                        i7 += zzz9;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 48:
                    zze = zziz.zzj((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i8 << 3);
                        zzz11 = zzgr.zzz(zze);
                        zzz9 = zzz10 + zzz11 + zze;
                        i7 += zzz9;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j);
                    zzix zzv2 = zzipVar.zzv(i4);
                    int i31 = zziz.$r8$clinit;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                        for (int i32 = 0; i32 < size6; i32++) {
                            i3 += zzgr.zzw(i8, (zzim) list13.get(i32), zzv2);
                        }
                    }
                    i7 += i3;
                    i4 += 3;
                    obj2 = obj;
                case 50:
                    zzig zzigVar = (zzig) unsafe.getObject(obj2, j);
                    WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzipVar.zzw(i4));
                    if (zzigVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzigVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i4 += 3;
                    obj2 = obj;
                case 51:
                    if (zzipVar.zzM(obj2, i8, i4)) {
                        zzz12 = zzgr.zzz(i8 << 3);
                        zzh = zzz12 + 8;
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 52:
                    if (zzipVar.zzM(obj2, i8, i4)) {
                        zzz13 = zzgr.zzz(i8 << 3);
                        zzh = zzz13 + 4;
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 53:
                    if (zzipVar.zzM(obj2, i8, i4)) {
                        long zzt = zzt(obj2, j);
                        zzl = zzgr.zzz(i8 << 3);
                        i2 = zzgr.zzA(zzt);
                        zzh = zzl + i2;
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 54:
                    if (zzipVar.zzM(obj2, i8, i4)) {
                        long zzt2 = zzt(obj2, j);
                        zzl = zzgr.zzz(i8 << 3);
                        i2 = zzgr.zzA(zzt2);
                        zzh = zzl + i2;
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 55:
                    if (zzipVar.zzM(obj2, i8, i4)) {
                        long zzo = zzo(obj2, j);
                        zzl = zzgr.zzz(i8 << 3);
                        i2 = zzgr.zzA(zzo);
                        zzh = zzl + i2;
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 56:
                    if (zzipVar.zzM(obj2, i8, i4)) {
                        zzz12 = zzgr.zzz(i8 << 3);
                        zzh = zzz12 + 8;
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 57:
                    if (zzipVar.zzM(obj2, i8, i4)) {
                        zzz13 = zzgr.zzz(i8 << 3);
                        zzh = zzz13 + 4;
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 58:
                    if (zzipVar.zzM(obj2, i8, i4)) {
                        zzh = zzgr.zzz(i8 << 3) + 1;
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 59:
                    if (zzipVar.zzM(obj2, i8, i4)) {
                        int i33 = i8 << 3;
                        Object object2 = unsafe.getObject(obj2, j);
                        if (object2 instanceof zzgk) {
                            zzz14 = zzgr.zzz(i33);
                            zzd2 = ((zzgk) object2).zzd();
                            zzz15 = zzgr.zzz(zzd2);
                            zzh = zzz14 + zzz15 + zzd2;
                            i7 += zzh;
                            i4 += 3;
                            obj2 = obj;
                        } else {
                            zzl = zzgr.zzz(i33);
                            i2 = zzgr.zzy((String) object2);
                            zzh = zzl + i2;
                            i7 += zzh;
                            i4 += 3;
                            obj2 = obj;
                        }
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 60:
                    if (zzipVar.zzM(obj2, i8, i4)) {
                        zzh = zziz.zzh(i8, unsafe.getObject(obj2, j), zzipVar.zzv(i4));
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 61:
                    if (zzipVar.zzM(obj2, i8, i4)) {
                        zzgk zzgkVar2 = (zzgk) unsafe.getObject(obj2, j);
                        zzz14 = zzgr.zzz(i8 << 3);
                        zzd2 = zzgkVar2.zzd();
                        zzz15 = zzgr.zzz(zzd2);
                        zzh = zzz14 + zzz15 + zzd2;
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 62:
                    if (zzipVar.zzM(obj2, i8, i4)) {
                        int zzo2 = zzo(obj2, j);
                        zzl = zzgr.zzz(i8 << 3);
                        i2 = zzgr.zzz(zzo2);
                        zzh = zzl + i2;
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 63:
                    if (zzipVar.zzM(obj2, i8, i4)) {
                        long zzo3 = zzo(obj2, j);
                        zzl = zzgr.zzz(i8 << 3);
                        i2 = zzgr.zzA(zzo3);
                        zzh = zzl + i2;
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 64:
                    if (zzipVar.zzM(obj2, i8, i4)) {
                        zzz13 = zzgr.zzz(i8 << 3);
                        zzh = zzz13 + 4;
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 65:
                    if (zzipVar.zzM(obj2, i8, i4)) {
                        zzz12 = zzgr.zzz(i8 << 3);
                        zzh = zzz12 + 8;
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 66:
                    if (zzipVar.zzM(obj2, i8, i4)) {
                        int zzo4 = zzo(obj2, j);
                        zzl = zzgr.zzz(i8 << 3);
                        i2 = zzgr.zzz((zzo4 >> 31) ^ (zzo4 + zzo4));
                        zzh = zzl + i2;
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 67:
                    if (zzipVar.zzM(obj2, i8, i4)) {
                        long zzt3 = zzt(obj2, j);
                        zzl = zzgr.zzz(i8 << 3);
                        i2 = zzgr.zzA((zzt3 >> 63) ^ (zzt3 + zzt3));
                        zzh = zzl + i2;
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                case 68:
                    if (zzipVar.zzM(obj2, i8, i4)) {
                        zzh = zzgr.zzw(i8, (zzim) unsafe.getObject(obj2, j), zzipVar.zzv(i4));
                        i7 += zzh;
                        i4 += 3;
                        obj2 = obj;
                    } else {
                        i4 += 3;
                        obj2 = obj;
                    }
                default:
                    i4 += 3;
                    obj2 = obj;
            }
        }
        int zza2 = i7 + ((zzhk) obj).zzc.zza();
        if (!zzipVar.zzh) {
            return zza2;
        }
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int zzs = zzs(i5);
            int[] iArr = this.zzc;
            int i6 = 1048575 & zzs;
            int zzr = zzr(zzs);
            int i7 = iArr[i5];
            long j = i6;
            int i8 = 37;
            switch (zzr) {
                case 0:
                    i = i4 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzjq.zza(obj, j));
                    byte[] bArr = zzhp.zzb;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i4 * 53;
                    floatToIntBits = Float.floatToIntBits(zzjq.zzb(obj, j));
                    i4 = i2 + floatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    doubleToLongBits = zzjq.zzd(obj, j);
                    byte[] bArr2 = zzhp.zzb;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i4 * 53;
                    doubleToLongBits = zzjq.zzd(obj, j);
                    byte[] bArr3 = zzhp.zzb;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i4 * 53;
                    floatToIntBits = zzjq.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    doubleToLongBits = zzjq.zzd(obj, j);
                    byte[] bArr4 = zzhp.zzb;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i4 * 53;
                    floatToIntBits = zzjq.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 7:
                    i2 = i4 * 53;
                    floatToIntBits = zzhp.zza(zzjq.zzw(obj, j));
                    i4 = i2 + floatToIntBits;
                    break;
                case 8:
                    i2 = i4 * 53;
                    floatToIntBits = ((String) zzjq.zzf(obj, j)).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 9:
                    i3 = i4 * 53;
                    Object zzf = zzjq.zzf(obj, j);
                    if (zzf != null) {
                        i8 = zzf.hashCode();
                    }
                    i4 = i3 + i8;
                    break;
                case 10:
                    i2 = i4 * 53;
                    floatToIntBits = zzjq.zzf(obj, j).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 11:
                    i2 = i4 * 53;
                    floatToIntBits = zzjq.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 12:
                    i2 = i4 * 53;
                    floatToIntBits = zzjq.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 13:
                    i2 = i4 * 53;
                    floatToIntBits = zzjq.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 14:
                    i = i4 * 53;
                    doubleToLongBits = zzjq.zzd(obj, j);
                    byte[] bArr5 = zzhp.zzb;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i4 * 53;
                    floatToIntBits = zzjq.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    doubleToLongBits = zzjq.zzd(obj, j);
                    byte[] bArr6 = zzhp.zzb;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i3 = i4 * 53;
                    Object zzf2 = zzjq.zzf(obj, j);
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
                    floatToIntBits = zzjq.zzf(obj, j).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 50:
                    i2 = i4 * 53;
                    floatToIntBits = zzjq.zzf(obj, j).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 51:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzhp.zzb;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j));
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr8 = zzhp.zzb;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr9 = zzhp.zzb;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr10 = zzhp.zzb;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzhp.zza(zzN(obj, j));
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = ((String) zzjq.zzf(obj, j)).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzjq.zzf(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzjq.zzf(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr11 = zzhp.zzb;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr12 = zzhp.zzb;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzjq.zzf(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i4 * 53) + ((zzhk) obj).zzc.hashCode();
        if (!this.zzh) {
            return hashCode;
        }
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0e16, code lost:
    
        if (r13 == 1048575) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0e18, code lost:
    
        r30.putInt(r8, r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0e1e, code lost:
    
        r1 = r10.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0e22, code lost:
    
        if (r1 >= r10.zzk) goto L678;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0e24, code lost:
    
        r2 = r10.zzi;
        r3 = r10.zzc;
        r2 = r2[r1];
        r3 = r3[r2];
        r3 = com.google.android.gms.internal.play_billing.zzjq.zzf(r8, r10.zzs(r2) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0e3a, code lost:
    
        if (r3 != null) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0e46, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0e43, code lost:
    
        if (r10.zzu(r2) != null) goto L679;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0e49, code lost:
    
        r3 = (com.google.android.gms.internal.play_billing.zzig) r3;
        androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(r10.zzw(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0e52, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0e55, code lost:
    
        if (r0 != 0) goto L567;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0e57, code lost:
    
        if (r7 != r4) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0e5f, code lost:
    
        throw new com.google.android.gms.internal.play_billing.zzhr("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0e64, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0e60, code lost:
    
        if (r7 > r4) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0e62, code lost:
    
        if (r11 != r0) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0e6a, code lost:
    
        throw new com.google.android.gms.internal.play_billing.zzhr("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0b09 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0b23 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0d92 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0dac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0db7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0dc4  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x0056 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzfz zzfzVar) {
        zzip zzipVar;
        Unsafe unsafe;
        Object obj2;
        int i4;
        int i5;
        int zzq;
        byte[] bArr2;
        zzfz zzfzVar2;
        int i6;
        int zzg;
        int i7;
        int i8;
        int i9;
        Unsafe unsafe2;
        Object obj3;
        byte[] bArr3;
        zzfz zzfzVar3;
        int i10;
        int i11;
        int i12;
        Unsafe unsafe3;
        Object obj4;
        zzfz zzfzVar4;
        byte[] bArr4;
        int zzh;
        int i13;
        int i14;
        int i15;
        byte[] bArr5;
        int i16;
        int i17;
        zzfz zzfzVar5;
        zzfz zzfzVar6;
        int zzh2;
        int i18;
        zzfz zzfzVar7;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        zzfz zzfzVar8;
        int i24;
        int i25;
        int zzh3;
        zzfz zzfzVar9;
        int i26;
        zzfz zzfzVar10;
        int i27;
        int i28;
        int i29;
        int zzj;
        int i30;
        int i31;
        int zzh4;
        int i32;
        int i33;
        byte[] bArr6;
        zzfz zzfzVar11;
        int zza2;
        int zzh5;
        zzip zzipVar2 = this;
        Object obj5 = obj;
        byte[] bArr7 = bArr;
        int i34 = i2;
        zzfz zzfzVar12 = zzfzVar;
        zzA(obj5);
        Unsafe unsafe4 = zzb;
        int i35 = 0;
        int i36 = -1;
        int i37 = i;
        int i38 = -1;
        int i39 = 0;
        int i40 = 0;
        int i41 = 1048575;
        int i42 = 1;
        int i43 = 0;
        while (true) {
            if (i37 < i34) {
                int i44 = i37 + 1;
                int i45 = bArr7[i37];
                if (i45 < 0) {
                    i44 = zzga.zzi(i45, bArr7, i44, zzfzVar12);
                    i45 = zzfzVar12.zza;
                }
                i43 = i45;
                int i46 = i43 >>> 3;
                if (i46 > i38) {
                    int i47 = i39 / 3;
                    if (i46 >= zzipVar2.zze && i46 <= zzipVar2.zzf) {
                        zzq = zzipVar2.zzq(i46, i47);
                        if (zzq != i36) {
                            zzipVar = zzipVar2;
                            unsafe = unsafe4;
                            obj2 = obj5;
                            bArr2 = bArr7;
                            zzfzVar2 = zzfzVar12;
                            i6 = i44;
                            i5 = i43;
                            i39 = 0;
                        } else {
                            int i48 = i43 & 7;
                            int[] iArr = zzipVar2.zzc;
                            int i49 = iArr[zzq + 1];
                            int zzr = zzr(i49);
                            long j = i49 & 1048575;
                            if (zzr <= 17) {
                                int i50 = iArr[zzq + 2];
                                int i51 = i42 << (i50 >>> 20);
                                int i52 = i50 & 1048575;
                                int i53 = i44;
                                if (i52 != i41) {
                                    i7 = i49;
                                    if (i41 != 1048575) {
                                        unsafe4.putInt(obj5, i41, i40);
                                    }
                                    i40 = i52 == 1048575 ? 0 : unsafe4.getInt(obj5, i52);
                                    i41 = i52;
                                } else {
                                    i7 = i49;
                                }
                                switch (zzr) {
                                    case 0:
                                        Object obj6 = obj5;
                                        unsafe2 = unsafe4;
                                        obj3 = obj6;
                                        zzfzVar3 = zzfzVar;
                                        i8 = zzq;
                                        i9 = i46;
                                        i12 = i53;
                                        bArr3 = bArr;
                                        i10 = i40;
                                        i11 = i41;
                                        if (i48 != 1) {
                                            unsafe = unsafe2;
                                            i6 = i12;
                                            bArr2 = bArr3;
                                            zzfzVar2 = zzfzVar3;
                                            i46 = i9;
                                            i39 = i8;
                                            i5 = i43;
                                            i41 = i11;
                                            i40 = i10;
                                            zzipVar = zzipVar2;
                                            obj2 = obj3;
                                            break;
                                        } else {
                                            i37 = i12 + 8;
                                            i40 = i10 | i51;
                                            zzjq.zzo(obj3, j, Double.longBitsToDouble(zzga.zzn(bArr3, i12)));
                                            Unsafe unsafe5 = unsafe2;
                                            obj5 = obj3;
                                            unsafe4 = unsafe5;
                                            i34 = i2;
                                            bArr7 = bArr3;
                                            zzfzVar12 = zzfzVar3;
                                            i38 = i9;
                                            i39 = i8;
                                            i41 = i11;
                                            i35 = 0;
                                            i36 = -1;
                                            i42 = 1;
                                        }
                                    case 1:
                                        Object obj7 = obj5;
                                        unsafe2 = unsafe4;
                                        obj3 = obj7;
                                        zzfzVar3 = zzfzVar;
                                        i8 = zzq;
                                        i9 = i46;
                                        i12 = i53;
                                        bArr3 = bArr;
                                        i10 = i40;
                                        i11 = i41;
                                        if (i48 != 5) {
                                            unsafe = unsafe2;
                                            i6 = i12;
                                            bArr2 = bArr3;
                                            zzfzVar2 = zzfzVar3;
                                            i46 = i9;
                                            i39 = i8;
                                            i5 = i43;
                                            i41 = i11;
                                            i40 = i10;
                                            zzipVar = zzipVar2;
                                            obj2 = obj3;
                                            break;
                                        } else {
                                            i37 = i12 + 4;
                                            i40 = i10 | i51;
                                            zzjq.zzp(obj3, j, Float.intBitsToFloat(zzga.zzb(bArr3, i12)));
                                            Unsafe unsafe52 = unsafe2;
                                            obj5 = obj3;
                                            unsafe4 = unsafe52;
                                            i34 = i2;
                                            bArr7 = bArr3;
                                            zzfzVar12 = zzfzVar3;
                                            i38 = i9;
                                            i39 = i8;
                                            i41 = i11;
                                            i35 = 0;
                                            i36 = -1;
                                            i42 = 1;
                                        }
                                    case 2:
                                    case 3:
                                        zzfzVar3 = zzfzVar;
                                        i8 = zzq;
                                        i9 = i46;
                                        i12 = i53;
                                        bArr3 = bArr;
                                        i10 = i40;
                                        i11 = i41;
                                        if (i48 != 0) {
                                            Object obj8 = obj5;
                                            unsafe2 = unsafe4;
                                            obj3 = obj8;
                                            unsafe = unsafe2;
                                            i6 = i12;
                                            bArr2 = bArr3;
                                            zzfzVar2 = zzfzVar3;
                                            i46 = i9;
                                            i39 = i8;
                                            i5 = i43;
                                            i41 = i11;
                                            i40 = i10;
                                            zzipVar = zzipVar2;
                                            obj2 = obj3;
                                            break;
                                        } else {
                                            i40 = i10 | i51;
                                            i37 = zzga.zzk(bArr3, i12, zzfzVar3);
                                            unsafe4.putLong(obj5, j, zzfzVar3.zzb);
                                            Object obj9 = obj5;
                                            unsafe2 = unsafe4;
                                            obj3 = obj9;
                                            Unsafe unsafe522 = unsafe2;
                                            obj5 = obj3;
                                            unsafe4 = unsafe522;
                                            i34 = i2;
                                            bArr7 = bArr3;
                                            zzfzVar12 = zzfzVar3;
                                            i38 = i9;
                                            i39 = i8;
                                            i41 = i11;
                                            i35 = 0;
                                            i36 = -1;
                                            i42 = 1;
                                        }
                                    case 4:
                                    case 11:
                                        zzfzVar3 = zzfzVar;
                                        i8 = zzq;
                                        i9 = i46;
                                        i12 = i53;
                                        bArr3 = bArr;
                                        i10 = i40;
                                        i11 = i41;
                                        if (i48 != 0) {
                                            Object obj82 = obj5;
                                            unsafe2 = unsafe4;
                                            obj3 = obj82;
                                            unsafe = unsafe2;
                                            i6 = i12;
                                            bArr2 = bArr3;
                                            zzfzVar2 = zzfzVar3;
                                            i46 = i9;
                                            i39 = i8;
                                            i5 = i43;
                                            i41 = i11;
                                            i40 = i10;
                                            zzipVar = zzipVar2;
                                            obj2 = obj3;
                                            break;
                                        } else {
                                            i40 = i10 | i51;
                                            i37 = zzga.zzh(bArr3, i12, zzfzVar3);
                                            unsafe4.putInt(obj5, j, zzfzVar3.zza);
                                            i34 = i2;
                                            bArr7 = bArr3;
                                            zzfzVar12 = zzfzVar3;
                                            i38 = i9;
                                            i39 = i8;
                                            i41 = i11;
                                            i35 = 0;
                                            i36 = -1;
                                            i42 = 1;
                                        }
                                    case 5:
                                    case 14:
                                        i8 = zzq;
                                        i9 = i46;
                                        i12 = i53;
                                        Object obj10 = obj5;
                                        i10 = i40;
                                        i11 = i41;
                                        unsafe3 = unsafe4;
                                        if (i48 != 1) {
                                            zzfzVar3 = zzfzVar;
                                            bArr3 = bArr;
                                            obj3 = obj10;
                                            unsafe2 = unsafe3;
                                            unsafe = unsafe2;
                                            i6 = i12;
                                            bArr2 = bArr3;
                                            zzfzVar2 = zzfzVar3;
                                            i46 = i9;
                                            i39 = i8;
                                            i5 = i43;
                                            i41 = i11;
                                            i40 = i10;
                                            zzipVar = zzipVar2;
                                            obj2 = obj3;
                                            break;
                                        } else {
                                            i37 = i12 + 8;
                                            i40 = i10 | i51;
                                            zzfzVar3 = zzfzVar;
                                            obj5 = obj10;
                                            bArr3 = bArr;
                                            unsafe4 = unsafe3;
                                            unsafe4.putLong(obj5, j, zzga.zzn(bArr, i12));
                                            i34 = i2;
                                            bArr7 = bArr3;
                                            zzfzVar12 = zzfzVar3;
                                            i38 = i9;
                                            i39 = i8;
                                            i41 = i11;
                                            i35 = 0;
                                            i36 = -1;
                                            i42 = 1;
                                        }
                                    case 6:
                                    case 13:
                                        i8 = zzq;
                                        i9 = i46;
                                        i12 = i53;
                                        obj4 = obj5;
                                        i10 = i40;
                                        i11 = i41;
                                        zzfzVar4 = zzfzVar;
                                        unsafe3 = unsafe4;
                                        bArr4 = bArr;
                                        if (i48 != 5) {
                                            Object obj11 = obj4;
                                            bArr3 = bArr4;
                                            obj3 = obj11;
                                            zzfzVar3 = zzfzVar4;
                                            unsafe2 = unsafe3;
                                            unsafe = unsafe2;
                                            i6 = i12;
                                            bArr2 = bArr3;
                                            zzfzVar2 = zzfzVar3;
                                            i46 = i9;
                                            i39 = i8;
                                            i5 = i43;
                                            i41 = i11;
                                            i40 = i10;
                                            zzipVar = zzipVar2;
                                            obj2 = obj3;
                                            break;
                                        } else {
                                            i37 = i12 + 4;
                                            i40 = i10 | i51;
                                            unsafe3.putInt(obj4, j, zzga.zzb(bArr4, i12));
                                            i34 = i2;
                                            bArr7 = bArr4;
                                            zzfzVar12 = zzfzVar4;
                                            obj5 = obj4;
                                            i38 = i9;
                                            unsafe4 = unsafe3;
                                            i39 = i8;
                                            i41 = i11;
                                            i35 = 0;
                                            i36 = -1;
                                        }
                                    case 7:
                                        i8 = zzq;
                                        i9 = i46;
                                        i12 = i53;
                                        obj4 = obj5;
                                        i10 = i40;
                                        i11 = i41;
                                        zzfzVar4 = zzfzVar;
                                        unsafe3 = unsafe4;
                                        bArr4 = bArr;
                                        if (i48 != 0) {
                                            Object obj112 = obj4;
                                            bArr3 = bArr4;
                                            obj3 = obj112;
                                            zzfzVar3 = zzfzVar4;
                                            unsafe2 = unsafe3;
                                            unsafe = unsafe2;
                                            i6 = i12;
                                            bArr2 = bArr3;
                                            zzfzVar2 = zzfzVar3;
                                            i46 = i9;
                                            i39 = i8;
                                            i5 = i43;
                                            i41 = i11;
                                            i40 = i10;
                                            zzipVar = zzipVar2;
                                            obj2 = obj3;
                                            break;
                                        } else {
                                            i40 = i10 | i51;
                                            i37 = zzga.zzk(bArr4, i12, zzfzVar4);
                                            zzjq.zzm(obj4, j, zzfzVar4.zzb != 0);
                                            i34 = i2;
                                            bArr7 = bArr4;
                                            zzfzVar12 = zzfzVar4;
                                            obj5 = obj4;
                                            i38 = i9;
                                            unsafe4 = unsafe3;
                                            i39 = i8;
                                            i41 = i11;
                                            i35 = 0;
                                            i36 = -1;
                                        }
                                    case 8:
                                        i8 = zzq;
                                        i9 = i46;
                                        i12 = i53;
                                        obj4 = obj5;
                                        zzfzVar4 = zzfzVar;
                                        i10 = i40;
                                        i11 = i41;
                                        unsafe3 = unsafe4;
                                        bArr4 = bArr;
                                        if (i48 != 2) {
                                            Object obj1122 = obj4;
                                            bArr3 = bArr4;
                                            obj3 = obj1122;
                                            zzfzVar3 = zzfzVar4;
                                            unsafe2 = unsafe3;
                                            unsafe = unsafe2;
                                            i6 = i12;
                                            bArr2 = bArr3;
                                            zzfzVar2 = zzfzVar3;
                                            i46 = i9;
                                            i39 = i8;
                                            i5 = i43;
                                            i41 = i11;
                                            i40 = i10;
                                            zzipVar = zzipVar2;
                                            obj2 = obj3;
                                            break;
                                        } else {
                                            if ((i7 & TLObject.FLAG_29) != 0) {
                                                int i54 = i10 | i51;
                                                zzh = zzga.zzh(bArr4, i12, zzfzVar4);
                                                int i55 = zzfzVar4.zza;
                                                if (i55 < 0) {
                                                    throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i55 == 0) {
                                                    zzfzVar4.zzc = "";
                                                    i14 = i54;
                                                } else {
                                                    int i56 = zzjt.$r8$clinit;
                                                    int length = bArr4.length;
                                                    if ((zzh | i55 | ((length - zzh) - i55)) < 0) {
                                                        Integer valueOf = Integer.valueOf(length);
                                                        Integer valueOf2 = Integer.valueOf(zzh);
                                                        Integer valueOf3 = Integer.valueOf(i55);
                                                        Object[] objArr = new Object[3];
                                                        objArr[0] = valueOf;
                                                        objArr[i42] = valueOf2;
                                                        objArr[2] = valueOf3;
                                                        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", objArr));
                                                    }
                                                    int i57 = zzh + i55;
                                                    char[] cArr = new char[i55];
                                                    int i58 = 0;
                                                    while (true) {
                                                        i13 = zzh;
                                                        if (zzh < i57) {
                                                            byte b = bArr4[i13];
                                                            if (zzjr.zzd(b)) {
                                                                cArr[i58] = (char) b;
                                                                zzh = i13 + 1;
                                                                i58++;
                                                            }
                                                        }
                                                    }
                                                    while (true) {
                                                        int i59 = i13;
                                                        while (i59 < i57) {
                                                            int i60 = i59;
                                                            i59 = i60 + 1;
                                                            int i61 = i54;
                                                            byte b2 = bArr4[i60];
                                                            if (zzjr.zzd(b2)) {
                                                                int i62 = i58 + 1;
                                                                cArr[i58] = (char) b2;
                                                                while (true) {
                                                                    i58 = i62;
                                                                    if (i59 < i57) {
                                                                        byte b3 = bArr4[i59];
                                                                        if (zzjr.zzd(b3)) {
                                                                            i59++;
                                                                            i62 = i58 + 1;
                                                                            cArr[i58] = (char) b3;
                                                                        }
                                                                    }
                                                                }
                                                                i54 = i61;
                                                            } else if (b2 >= -32) {
                                                                if (b2 >= -16) {
                                                                    i15 = i57;
                                                                    if (i59 >= i15 - 2) {
                                                                        throw new zzhr("Protocol message had invalid UTF-8.");
                                                                    }
                                                                    char[] cArr2 = cArr;
                                                                    int i63 = i58;
                                                                    zzjr.zza(b2, bArr4[i59], bArr4[i60 + 2], bArr4[i60 + 3], cArr2, i63);
                                                                    i58 = i63 + 2;
                                                                    i54 = i61;
                                                                    cArr = cArr2;
                                                                    i59 = i60 + 4;
                                                                } else {
                                                                    if (i59 >= i57 - 1) {
                                                                        throw new zzhr("Protocol message had invalid UTF-8.");
                                                                    }
                                                                    i15 = i57;
                                                                    zzjr.zzb(b2, bArr4[i59], bArr4[i60 + 2], cArr, i58);
                                                                    i54 = i61;
                                                                    i58++;
                                                                    i59 = i60 + 3;
                                                                }
                                                                i57 = i15;
                                                            } else {
                                                                if (i59 >= i57) {
                                                                    throw new zzhr("Protocol message had invalid UTF-8.");
                                                                }
                                                                i13 = i60 + 2;
                                                                zzjr.zzc(b2, bArr4[i59], cArr, i58);
                                                                i54 = i61;
                                                                i58++;
                                                            }
                                                        }
                                                        i14 = i54;
                                                        zzfzVar4.zzc = new String(cArr, 0, i58);
                                                        zzh = i57;
                                                    }
                                                }
                                                i40 = i14;
                                            } else {
                                                zzh = zzga.zzh(bArr4, i12, zzfzVar4);
                                                int i64 = zzfzVar4.zza;
                                                if (i64 < 0) {
                                                    throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                int i65 = i10 | i51;
                                                if (i64 == 0) {
                                                    zzfzVar4.zzc = "";
                                                } else {
                                                    zzfzVar4.zzc = new String(bArr4, zzh, i64, zzhp.zza);
                                                    zzh += i64;
                                                }
                                                i40 = i65;
                                            }
                                            i37 = zzh;
                                            unsafe3.putObject(obj4, j, zzfzVar4.zzc);
                                            i34 = i2;
                                            bArr7 = bArr4;
                                            zzfzVar12 = zzfzVar4;
                                            obj5 = obj4;
                                            i38 = i9;
                                            unsafe4 = unsafe3;
                                            i39 = i8;
                                            i41 = i11;
                                            i35 = 0;
                                            i36 = -1;
                                        }
                                    case 9:
                                        Object obj12 = obj5;
                                        Unsafe unsafe6 = unsafe4;
                                        obj3 = obj12;
                                        bArr5 = bArr;
                                        i8 = zzq;
                                        i10 = i40;
                                        i11 = i41;
                                        i9 = i46;
                                        if (i48 != 2) {
                                            i43 = i43;
                                            i12 = i53;
                                            zzfzVar3 = zzfzVar;
                                            unsafe2 = unsafe6;
                                            bArr3 = bArr5;
                                            unsafe = unsafe2;
                                            i6 = i12;
                                            bArr2 = bArr3;
                                            zzfzVar2 = zzfzVar3;
                                            i46 = i9;
                                            i39 = i8;
                                            i5 = i43;
                                            i41 = i11;
                                            i40 = i10;
                                            zzipVar = zzipVar2;
                                            obj2 = obj3;
                                            break;
                                        } else {
                                            Object zzx = zzipVar2.zzx(obj3, i8);
                                            unsafe3 = unsafe6;
                                            i43 = i43;
                                            zzfzVar12 = zzfzVar;
                                            i37 = zzga.zzm(zzx, zzipVar2.zzv(i8), bArr5, i53, i2, zzfzVar12);
                                            zzipVar2.zzF(obj3, i8, zzx);
                                            i34 = i2;
                                            bArr7 = bArr5;
                                            obj5 = obj3;
                                            i40 = i10 | i51;
                                            i38 = i9;
                                            unsafe4 = unsafe3;
                                            i39 = i8;
                                            i41 = i11;
                                            i35 = 0;
                                            i36 = -1;
                                        }
                                    case 10:
                                        Object obj13 = obj5;
                                        unsafe2 = unsafe4;
                                        obj3 = obj13;
                                        bArr5 = bArr;
                                        i8 = zzq;
                                        i16 = i43;
                                        i9 = i46;
                                        i17 = i53;
                                        zzfzVar5 = zzfzVar;
                                        i10 = i40;
                                        i11 = i41;
                                        if (i48 != 2) {
                                            i43 = i16;
                                            i12 = i17;
                                            zzfzVar3 = zzfzVar5;
                                            bArr3 = bArr5;
                                            unsafe = unsafe2;
                                            i6 = i12;
                                            bArr2 = bArr3;
                                            zzfzVar2 = zzfzVar3;
                                            i46 = i9;
                                            i39 = i8;
                                            i5 = i43;
                                            i41 = i11;
                                            i40 = i10;
                                            zzipVar = zzipVar2;
                                            obj2 = obj3;
                                            break;
                                        } else {
                                            int zza3 = zzga.zza(bArr5, i17, zzfzVar5);
                                            unsafe2.putObject(obj3, j, zzfzVar5.zzc);
                                            obj5 = obj3;
                                            unsafe4 = unsafe2;
                                            i34 = i2;
                                            i43 = i16;
                                            bArr7 = bArr5;
                                            i40 = i10 | i51;
                                            i39 = i8;
                                            i41 = i11;
                                            i35 = 0;
                                            i36 = -1;
                                            i37 = zza3;
                                            zzfzVar12 = zzfzVar5;
                                            i38 = i9;
                                        }
                                    case 12:
                                        Object obj14 = obj5;
                                        unsafe2 = unsafe4;
                                        obj3 = obj14;
                                        bArr5 = bArr;
                                        i8 = zzq;
                                        i16 = i43;
                                        i9 = i46;
                                        i17 = i53;
                                        zzfzVar5 = zzfzVar;
                                        if (i48 != 0) {
                                            i10 = i40;
                                            i11 = i41;
                                            i43 = i16;
                                            i12 = i17;
                                            zzfzVar3 = zzfzVar5;
                                            bArr3 = bArr5;
                                            unsafe = unsafe2;
                                            i6 = i12;
                                            bArr2 = bArr3;
                                            zzfzVar2 = zzfzVar3;
                                            i46 = i9;
                                            i39 = i8;
                                            i5 = i43;
                                            i41 = i11;
                                            i40 = i10;
                                            zzipVar = zzipVar2;
                                            obj2 = obj3;
                                            break;
                                        } else {
                                            int zzh6 = zzga.zzh(bArr5, i17, zzfzVar5);
                                            int i66 = zzfzVar5.zza;
                                            zzhm zzu = zzipVar2.zzu(i8);
                                            if ((i7 & TLObject.FLAG_31) == 0 || zzu == null || zzu.zza(i66)) {
                                                int i67 = i41;
                                                i40 |= i51;
                                                unsafe2.putInt(obj3, j, i66);
                                                obj5 = obj3;
                                                unsafe4 = unsafe2;
                                                i34 = i2;
                                                bArr7 = bArr5;
                                                zzfzVar12 = zzfzVar5;
                                                i38 = i9;
                                                i39 = i8;
                                                i37 = zzh6;
                                                i41 = i67;
                                            } else {
                                                zzd(obj3).zzj(i16, Long.valueOf(i66));
                                                obj5 = obj3;
                                                unsafe4 = unsafe2;
                                                i34 = i2;
                                                bArr7 = bArr5;
                                                zzfzVar12 = zzfzVar5;
                                                i38 = i9;
                                                i39 = i8;
                                                i37 = zzh6;
                                                i41 = i41;
                                                i40 = i40;
                                            }
                                            i35 = 0;
                                            i36 = -1;
                                            i43 = i16;
                                        }
                                    case 15:
                                        Object obj15 = obj5;
                                        unsafe2 = unsafe4;
                                        obj3 = obj15;
                                        bArr5 = bArr;
                                        i8 = zzq;
                                        i9 = i46;
                                        zzfzVar6 = zzfzVar;
                                        if (i48 != 0) {
                                            i43 = i43;
                                            zzfzVar3 = zzfzVar6;
                                            i10 = i40;
                                            i11 = i41;
                                            i12 = i53;
                                            bArr3 = bArr5;
                                            unsafe = unsafe2;
                                            i6 = i12;
                                            bArr2 = bArr3;
                                            zzfzVar2 = zzfzVar3;
                                            i46 = i9;
                                            i39 = i8;
                                            i5 = i43;
                                            i41 = i11;
                                            i40 = i10;
                                            zzipVar = zzipVar2;
                                            obj2 = obj3;
                                            break;
                                        } else {
                                            i40 |= i51;
                                            zzh2 = zzga.zzh(bArr5, i53, zzfzVar6);
                                            unsafe2.putInt(obj3, j, zzgn.zzb(zzfzVar6.zza));
                                            obj5 = obj3;
                                            unsafe4 = unsafe2;
                                            i34 = i2;
                                            i43 = i43;
                                            bArr7 = bArr5;
                                            zzfzVar12 = zzfzVar6;
                                            i37 = zzh2;
                                            i38 = i9;
                                            i39 = i8;
                                            i35 = 0;
                                            i36 = -1;
                                        }
                                    case 16:
                                        bArr5 = bArr;
                                        i8 = zzq;
                                        i9 = i46;
                                        zzfzVar6 = zzfzVar;
                                        if (i48 != 0) {
                                            Object obj16 = obj5;
                                            unsafe2 = unsafe4;
                                            obj3 = obj16;
                                            i12 = i53;
                                            zzfzVar3 = zzfzVar6;
                                            i10 = i40;
                                            i11 = i41;
                                            bArr3 = bArr5;
                                            unsafe = unsafe2;
                                            i6 = i12;
                                            bArr2 = bArr3;
                                            zzfzVar2 = zzfzVar3;
                                            i46 = i9;
                                            i39 = i8;
                                            i5 = i43;
                                            i41 = i11;
                                            i40 = i10;
                                            zzipVar = zzipVar2;
                                            obj2 = obj3;
                                            break;
                                        } else {
                                            i40 |= i51;
                                            zzh2 = zzga.zzk(bArr5, i53, zzfzVar6);
                                            unsafe4.putLong(obj5, j, zzgn.zzc(zzfzVar6.zzb));
                                            obj5 = obj5;
                                            unsafe4 = unsafe4;
                                            i34 = i2;
                                            bArr7 = bArr5;
                                            zzfzVar12 = zzfzVar6;
                                            i37 = zzh2;
                                            i38 = i9;
                                            i39 = i8;
                                            i35 = 0;
                                            i36 = -1;
                                        }
                                    default:
                                        if (i48 != 3) {
                                            i8 = zzq;
                                            i9 = i46;
                                            Object obj17 = obj5;
                                            unsafe2 = unsafe4;
                                            obj3 = obj17;
                                            bArr3 = bArr;
                                            zzfzVar3 = zzfzVar;
                                            i10 = i40;
                                            i11 = i41;
                                            i12 = i53;
                                            unsafe = unsafe2;
                                            i6 = i12;
                                            bArr2 = bArr3;
                                            zzfzVar2 = zzfzVar3;
                                            i46 = i9;
                                            i39 = i8;
                                            i5 = i43;
                                            i41 = i11;
                                            i40 = i10;
                                            zzipVar = zzipVar2;
                                            obj2 = obj3;
                                            break;
                                        } else {
                                            i40 |= i51;
                                            Object zzx2 = zzipVar2.zzx(obj5, zzq);
                                            int i68 = zzq;
                                            int zzl = zzga.zzl(zzx2, zzipVar2.zzv(zzq), bArr, i53, i2, (i46 << 3) | 4, zzfzVar);
                                            zzipVar2.zzF(obj5, i68, zzx2);
                                            bArr7 = bArr;
                                            zzfzVar12 = zzfzVar;
                                            i38 = i46;
                                            i39 = i68;
                                            i35 = 0;
                                            i36 = -1;
                                            i37 = zzl;
                                            i34 = i2;
                                        }
                                }
                            } else {
                                Object obj18 = obj5;
                                Unsafe unsafe7 = unsafe4;
                                int i69 = i44;
                                int i70 = zzq;
                                if (zzr != 27) {
                                    obj2 = obj18;
                                    if (zzr > 49) {
                                        i18 = i46;
                                        i5 = i43;
                                        bArr2 = bArr;
                                        zzfzVar7 = zzfzVar;
                                        i19 = i40;
                                        i21 = i69;
                                        unsafe = unsafe7;
                                        i20 = i41;
                                        zzipVar = zzipVar2;
                                        if (zzr != 50) {
                                            Unsafe unsafe8 = zzb;
                                            long j2 = iArr[i70 + 2] & 1048575;
                                            switch (zzr) {
                                                case 51:
                                                    zzfzVar2 = zzfzVar7;
                                                    i46 = i18;
                                                    i32 = i70;
                                                    if (i48 == 1) {
                                                        i33 = i21 + 8;
                                                        unsafe8.putObject(obj2, j, Double.valueOf(Double.longBitsToDouble(zzga.zzn(bArr2, i21))));
                                                        unsafe8.putInt(obj2, j2, i46);
                                                        if (i33 != i21) {
                                                            i4 = i3;
                                                            i6 = i33;
                                                            i39 = i32;
                                                            i41 = i20;
                                                            i40 = i19;
                                                            if (i5 != i4 && i4 != 0) {
                                                                i34 = i2;
                                                                i37 = i6;
                                                                break;
                                                            } else {
                                                                if (zzipVar.zzh) {
                                                                    zzgw zzgwVar = zzfzVar2.zzd;
                                                                    zzgw zzgwVar2 = zzgw.zza;
                                                                    int i71 = zziu.$r8$clinit;
                                                                    if (zzgwVar != zzgw.zza) {
                                                                        zzim zzimVar = zzipVar.zzg;
                                                                        int i72 = zzga.$r8$clinit;
                                                                        zzgwVar.zzb(zzimVar, i46);
                                                                        i34 = i2;
                                                                        int i73 = i5;
                                                                        zzg = zzga.zzg(i73, bArr2, i6, i34, zzd(obj2), zzfzVar);
                                                                        i43 = i73;
                                                                        zzfzVar12 = zzfzVar;
                                                                        obj5 = obj2;
                                                                        zzipVar2 = zzipVar;
                                                                        unsafe4 = unsafe;
                                                                        i35 = 0;
                                                                        i36 = -1;
                                                                        i42 = 1;
                                                                        i38 = i46;
                                                                        i37 = zzg;
                                                                        bArr7 = bArr;
                                                                        break;
                                                                    }
                                                                }
                                                                i43 = i5;
                                                                i34 = i2;
                                                                zzg = zzga.zzg(i43, bArr, i6, i34, zzd(obj2), zzfzVar);
                                                                zzfzVar12 = zzfzVar;
                                                                obj5 = obj2;
                                                                zzipVar2 = zzipVar;
                                                                unsafe4 = unsafe;
                                                                i35 = 0;
                                                                i36 = -1;
                                                                i42 = 1;
                                                                i38 = i46;
                                                                i37 = zzg;
                                                                bArr7 = bArr;
                                                            }
                                                        } else {
                                                            i34 = i2;
                                                            bArr7 = bArr2;
                                                            obj5 = obj2;
                                                            zzipVar2 = zzipVar;
                                                            i39 = i32;
                                                            i41 = i20;
                                                            unsafe4 = unsafe;
                                                            i40 = i19;
                                                            i35 = 0;
                                                            i36 = -1;
                                                            i42 = 1;
                                                            i38 = i46;
                                                            i43 = i5;
                                                            i37 = i33;
                                                            zzfzVar12 = zzfzVar2;
                                                            break;
                                                        }
                                                    }
                                                    i33 = i21;
                                                    if (i33 != i21) {
                                                    }
                                                case 52:
                                                    zzfzVar2 = zzfzVar7;
                                                    i46 = i18;
                                                    i32 = i70;
                                                    if (i48 == 5) {
                                                        i33 = i21 + 4;
                                                        unsafe8.putObject(obj2, j, Float.valueOf(Float.intBitsToFloat(zzga.zzb(bArr2, i21))));
                                                        unsafe8.putInt(obj2, j2, i46);
                                                        if (i33 != i21) {
                                                        }
                                                    }
                                                    i33 = i21;
                                                    if (i33 != i21) {
                                                    }
                                                    break;
                                                case 53:
                                                case 54:
                                                    zzfzVar2 = zzfzVar7;
                                                    i46 = i18;
                                                    i32 = i70;
                                                    if (i48 == 0) {
                                                        i33 = zzga.zzk(bArr2, i21, zzfzVar2);
                                                        unsafe8.putObject(obj2, j, Long.valueOf(zzfzVar2.zzb));
                                                        unsafe8.putInt(obj2, j2, i46);
                                                        if (i33 != i21) {
                                                        }
                                                    }
                                                    i33 = i21;
                                                    if (i33 != i21) {
                                                    }
                                                    break;
                                                case 55:
                                                case 62:
                                                    zzfzVar2 = zzfzVar7;
                                                    i46 = i18;
                                                    i32 = i70;
                                                    if (i48 == 0) {
                                                        i33 = zzga.zzh(bArr2, i21, zzfzVar2);
                                                        unsafe8.putObject(obj2, j, Integer.valueOf(zzfzVar2.zza));
                                                        unsafe8.putInt(obj2, j2, i46);
                                                        if (i33 != i21) {
                                                        }
                                                    }
                                                    i33 = i21;
                                                    if (i33 != i21) {
                                                    }
                                                    break;
                                                case 56:
                                                case 65:
                                                    zzfzVar2 = zzfzVar7;
                                                    i46 = i18;
                                                    i32 = i70;
                                                    if (i48 == 1) {
                                                        i33 = i21 + 8;
                                                        unsafe8.putObject(obj2, j, Long.valueOf(zzga.zzn(bArr2, i21)));
                                                        unsafe8.putInt(obj2, j2, i46);
                                                        if (i33 != i21) {
                                                        }
                                                    }
                                                    i33 = i21;
                                                    if (i33 != i21) {
                                                    }
                                                    break;
                                                case 57:
                                                case 64:
                                                    zzfzVar2 = zzfzVar7;
                                                    i46 = i18;
                                                    i32 = i70;
                                                    if (i48 == 5) {
                                                        i33 = i21 + 4;
                                                        unsafe8.putObject(obj2, j, Integer.valueOf(zzga.zzb(bArr2, i21)));
                                                        unsafe8.putInt(obj2, j2, i46);
                                                        if (i33 != i21) {
                                                        }
                                                    }
                                                    i33 = i21;
                                                    if (i33 != i21) {
                                                    }
                                                    break;
                                                case 58:
                                                    zzfzVar2 = zzfzVar7;
                                                    i46 = i18;
                                                    i32 = i70;
                                                    if (i48 == 0) {
                                                        i33 = zzga.zzk(bArr2, i21, zzfzVar2);
                                                        unsafe8.putObject(obj2, j, Boolean.valueOf(zzfzVar2.zzb != 0));
                                                        unsafe8.putInt(obj2, j2, i46);
                                                        if (i33 != i21) {
                                                        }
                                                    }
                                                    i33 = i21;
                                                    if (i33 != i21) {
                                                    }
                                                    break;
                                                case 59:
                                                    zzfzVar2 = zzfzVar7;
                                                    i46 = i18;
                                                    i32 = i70;
                                                    if (i48 == 2) {
                                                        int zzh7 = zzga.zzh(bArr2, i21, zzfzVar2);
                                                        int i74 = zzfzVar2.zza;
                                                        if (i74 == 0) {
                                                            unsafe8.putObject(obj2, j, "");
                                                        } else {
                                                            int i75 = zzh7 + i74;
                                                            if ((i49 & TLObject.FLAG_29) != 0 && !zzjt.zzd(bArr2, zzh7, i75)) {
                                                                throw new zzhr("Protocol message had invalid UTF-8.");
                                                            }
                                                            unsafe8.putObject(obj2, j, new String(bArr2, zzh7, i74, zzhp.zza));
                                                            zzh7 = i75;
                                                        }
                                                        unsafe8.putInt(obj2, j2, i46);
                                                        i33 = zzh7;
                                                        if (i33 != i21) {
                                                        }
                                                    }
                                                    i33 = i21;
                                                    if (i33 != i21) {
                                                    }
                                                    break;
                                                case 60:
                                                    bArr6 = bArr2;
                                                    zzfzVar11 = zzfzVar7;
                                                    i46 = i18;
                                                    if (i48 == 2) {
                                                        Object zzy = zzipVar.zzy(obj2, i46, i70);
                                                        int zzm = zzga.zzm(zzy, zzipVar.zzv(i70), bArr6, i21, i2, zzfzVar11);
                                                        bArr2 = bArr6;
                                                        zzfzVar2 = zzfzVar11;
                                                        zzipVar.zzG(obj2, i46, i70, zzy);
                                                        i33 = zzm;
                                                        i32 = i70;
                                                        if (i33 != i21) {
                                                        }
                                                    }
                                                    bArr2 = bArr6;
                                                    zzfzVar2 = zzfzVar11;
                                                    i32 = i70;
                                                    i33 = i21;
                                                    if (i33 != i21) {
                                                    }
                                                    break;
                                                case 61:
                                                    bArr6 = bArr2;
                                                    zzfzVar11 = zzfzVar7;
                                                    i46 = i18;
                                                    if (i48 == 2) {
                                                        zza2 = zzga.zza(bArr6, i21, zzfzVar11);
                                                        unsafe8.putObject(obj2, j, zzfzVar11.zzc);
                                                        unsafe8.putInt(obj2, j2, i46);
                                                        zzfz zzfzVar13 = zzfzVar11;
                                                        i33 = zza2;
                                                        bArr2 = bArr6;
                                                        zzfzVar2 = zzfzVar13;
                                                        i32 = i70;
                                                        if (i33 != i21) {
                                                        }
                                                    }
                                                    bArr2 = bArr6;
                                                    zzfzVar2 = zzfzVar11;
                                                    i32 = i70;
                                                    i33 = i21;
                                                    if (i33 != i21) {
                                                    }
                                                    break;
                                                case 63:
                                                    bArr6 = bArr2;
                                                    zzfzVar11 = zzfzVar7;
                                                    i46 = i18;
                                                    if (i48 == 0) {
                                                        zza2 = zzga.zzh(bArr6, i21, zzfzVar11);
                                                        int i76 = zzfzVar11.zza;
                                                        zzipVar = this;
                                                        zzhm zzu2 = zzipVar.zzu(i70);
                                                        if (zzu2 == null || zzu2.zza(i76)) {
                                                            unsafe8.putObject(obj2, j, Integer.valueOf(i76));
                                                            unsafe8.putInt(obj2, j2, i46);
                                                        } else {
                                                            zzd(obj2).zzj(i5, Long.valueOf(i76));
                                                        }
                                                        zzfz zzfzVar132 = zzfzVar11;
                                                        i33 = zza2;
                                                        bArr2 = bArr6;
                                                        zzfzVar2 = zzfzVar132;
                                                        i32 = i70;
                                                        if (i33 != i21) {
                                                        }
                                                    }
                                                    zzipVar = this;
                                                    bArr2 = bArr6;
                                                    zzfzVar2 = zzfzVar11;
                                                    i32 = i70;
                                                    i33 = i21;
                                                    if (i33 != i21) {
                                                    }
                                                    break;
                                                case 66:
                                                    bArr6 = bArr2;
                                                    zzfzVar11 = zzfzVar7;
                                                    i46 = i18;
                                                    if (i48 == 0) {
                                                        zzh5 = zzga.zzh(bArr6, i21, zzfzVar11);
                                                        unsafe8.putObject(obj2, j, Integer.valueOf(zzgn.zzb(zzfzVar11.zza)));
                                                        unsafe8.putInt(obj2, j2, i46);
                                                        zzfz zzfzVar14 = zzfzVar11;
                                                        i33 = zzh5;
                                                        bArr2 = bArr6;
                                                        zzfzVar2 = zzfzVar14;
                                                        zzipVar = this;
                                                        i32 = i70;
                                                        if (i33 != i21) {
                                                        }
                                                    }
                                                    zzipVar = this;
                                                    bArr2 = bArr6;
                                                    zzfzVar2 = zzfzVar11;
                                                    i32 = i70;
                                                    i33 = i21;
                                                    if (i33 != i21) {
                                                    }
                                                    break;
                                                case 67:
                                                    bArr6 = bArr2;
                                                    zzfzVar11 = zzfzVar7;
                                                    i46 = i18;
                                                    if (i48 == 0) {
                                                        zzh5 = zzga.zzk(bArr6, i21, zzfzVar11);
                                                        unsafe8.putObject(obj2, j, Long.valueOf(zzgn.zzc(zzfzVar11.zzb)));
                                                        unsafe8.putInt(obj2, j2, i46);
                                                        zzfz zzfzVar142 = zzfzVar11;
                                                        i33 = zzh5;
                                                        bArr2 = bArr6;
                                                        zzfzVar2 = zzfzVar142;
                                                        zzipVar = this;
                                                        i32 = i70;
                                                        if (i33 != i21) {
                                                        }
                                                    }
                                                    zzipVar = this;
                                                    bArr2 = bArr6;
                                                    zzfzVar2 = zzfzVar11;
                                                    i32 = i70;
                                                    i33 = i21;
                                                    if (i33 != i21) {
                                                    }
                                                    break;
                                                case 68:
                                                    if (i48 == 3) {
                                                        Object zzy2 = zzipVar.zzy(obj2, i18, i70);
                                                        int zzl2 = zzga.zzl(zzy2, zzipVar.zzv(i70), bArr, i21, i2, (i5 & (-8)) | 4, zzfzVar7);
                                                        zzipVar.zzG(obj2, i18, i70, zzy2);
                                                        i33 = zzl2;
                                                        bArr2 = bArr;
                                                        zzfzVar2 = zzfzVar7;
                                                        i46 = i18;
                                                        i32 = i70;
                                                        if (i33 != i21) {
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    zzfzVar2 = zzfzVar7;
                                                    i46 = i18;
                                                    i32 = i70;
                                                    i33 = i21;
                                                    if (i33 != i21) {
                                                    }
                                                    break;
                                            }
                                        } else if (i48 == 2) {
                                            Unsafe unsafe9 = zzb;
                                            Object zzw = zzipVar.zzw(i70);
                                            Object object = unsafe9.getObject(obj2, j);
                                            if (!((zzig) object).zze()) {
                                                zzig zzb2 = zzig.zza().zzb();
                                                zzih.zza(zzb2, object);
                                                unsafe9.putObject(obj2, j, zzb2);
                                            }
                                            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzw);
                                            throw null;
                                        }
                                    } else {
                                        long j3 = i49;
                                        Unsafe unsafe10 = zzb;
                                        zzho zzhoVar = (zzho) unsafe10.getObject(obj2, j);
                                        if (zzhoVar.zzc()) {
                                            i22 = i40;
                                        } else {
                                            int size = zzhoVar.size();
                                            i22 = i40;
                                            zzhoVar = zzhoVar.zzd(size + size);
                                            unsafe10.putObject(obj2, j, zzhoVar);
                                        }
                                        zzho zzhoVar2 = zzhoVar;
                                        switch (zzr) {
                                            case 18:
                                            case 35:
                                                i23 = i46;
                                                i5 = i43;
                                                bArr2 = bArr;
                                                zzfzVar8 = zzfzVar;
                                                i24 = i41;
                                                i25 = i69;
                                                unsafe = unsafe7;
                                                zzipVar = zzipVar2;
                                                if (i48 != 2) {
                                                    if (i48 == 1) {
                                                        int i77 = zzga.$r8$clinit;
                                                        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzhoVar2);
                                                        Double.longBitsToDouble(zzga.zzn(bArr2, i25));
                                                        throw null;
                                                    }
                                                    zzh3 = i25;
                                                    if (zzh3 == i25) {
                                                        i6 = zzh3;
                                                        zzfzVar2 = zzfzVar8;
                                                        i39 = i70;
                                                        i46 = i23;
                                                        i41 = i24;
                                                        i40 = i22;
                                                        break;
                                                    } else {
                                                        i34 = i2;
                                                        bArr7 = bArr2;
                                                        zzfzVar12 = zzfzVar8;
                                                        obj5 = obj2;
                                                        i39 = i70;
                                                        i38 = i23;
                                                        i41 = i24;
                                                        unsafe4 = unsafe;
                                                        i40 = i22;
                                                        i35 = 0;
                                                        i36 = -1;
                                                        i42 = 1;
                                                        i37 = zzh3;
                                                        zzipVar2 = zzipVar;
                                                        i43 = i5;
                                                        break;
                                                    }
                                                } else {
                                                    int i78 = zzga.$r8$clinit;
                                                    WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzhoVar2);
                                                    if (zzga.zzh(bArr2, i25, zzfzVar8) + zzfzVar8.zza > bArr2.length) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    throw null;
                                                }
                                            case 19:
                                            case 36:
                                                i23 = i46;
                                                i5 = i43;
                                                bArr2 = bArr;
                                                zzfzVar8 = zzfzVar;
                                                i24 = i41;
                                                i25 = i69;
                                                unsafe = unsafe7;
                                                zzipVar = zzipVar2;
                                                if (i48 == 2) {
                                                    int i79 = zzga.$r8$clinit;
                                                    WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzhoVar2);
                                                    if (zzga.zzh(bArr2, i25, zzfzVar8) + zzfzVar8.zza > bArr2.length) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    throw null;
                                                }
                                                if (i48 == 5) {
                                                    int i80 = zzga.$r8$clinit;
                                                    WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzhoVar2);
                                                    Float.intBitsToFloat(zzga.zzb(bArr2, i25));
                                                    throw null;
                                                }
                                                zzh3 = i25;
                                                if (zzh3 == i25) {
                                                }
                                                break;
                                            case 20:
                                            case 21:
                                            case 37:
                                            case 38:
                                                i23 = i46;
                                                i5 = i43;
                                                bArr2 = bArr;
                                                zzfzVar8 = zzfzVar;
                                                i24 = i41;
                                                i25 = i69;
                                                unsafe = unsafe7;
                                                zzipVar = zzipVar2;
                                                if (i48 == 2) {
                                                    int i81 = zzga.$r8$clinit;
                                                    WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzhoVar2);
                                                    zzh3 = zzga.zzh(bArr2, i25, zzfzVar8);
                                                    int i82 = zzfzVar8.zza + zzh3;
                                                    if (zzh3 < i82) {
                                                        zzga.zzk(bArr2, zzh3, zzfzVar8);
                                                        throw null;
                                                    }
                                                    if (zzh3 != i82) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (zzh3 == i25) {
                                                    }
                                                } else {
                                                    if (i48 == 0) {
                                                        int i83 = zzga.$r8$clinit;
                                                        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzhoVar2);
                                                        zzga.zzk(bArr2, i25, zzfzVar8);
                                                        long j4 = zzfzVar8.zzb;
                                                        throw null;
                                                    }
                                                    zzh3 = i25;
                                                    if (zzh3 == i25) {
                                                    }
                                                }
                                                break;
                                            case 22:
                                            case 29:
                                            case 39:
                                            case 43:
                                                bArr2 = bArr;
                                                zzfzVar9 = zzfzVar;
                                                i24 = i41;
                                                i26 = i43;
                                                i23 = i46;
                                                i25 = i69;
                                                unsafe = unsafe7;
                                                zzipVar = zzipVar2;
                                                if (i48 == 2) {
                                                    zzh3 = zzga.zzf(bArr2, i25, zzhoVar2, zzfzVar9);
                                                    zzfzVar8 = zzfzVar9;
                                                    i5 = i26;
                                                    if (zzh3 == i25) {
                                                    }
                                                } else {
                                                    if (i48 == 0) {
                                                        i5 = i26;
                                                        zzfzVar8 = zzfzVar9;
                                                        zzh3 = zzga.zzj(i26, bArr2, i25, i2, zzhoVar2, zzfzVar9);
                                                        if (zzh3 == i25) {
                                                        }
                                                    }
                                                    zzfzVar8 = zzfzVar9;
                                                    i5 = i26;
                                                    zzh3 = i25;
                                                    if (zzh3 == i25) {
                                                    }
                                                }
                                                break;
                                            case 23:
                                            case 32:
                                            case 40:
                                            case 46:
                                                bArr2 = bArr;
                                                zzfzVar9 = zzfzVar;
                                                i24 = i41;
                                                i26 = i43;
                                                i23 = i46;
                                                i25 = i69;
                                                unsafe = unsafe7;
                                                zzipVar = zzipVar2;
                                                if (i48 == 2) {
                                                    int i84 = zzga.$r8$clinit;
                                                    WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzhoVar2);
                                                    if (zzga.zzh(bArr2, i25, zzfzVar9) + zzfzVar9.zza > bArr2.length) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    throw null;
                                                }
                                                if (i48 == 1) {
                                                    int i85 = zzga.$r8$clinit;
                                                    WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzhoVar2);
                                                    zzga.zzn(bArr2, i25);
                                                    throw null;
                                                }
                                                zzfzVar8 = zzfzVar9;
                                                i5 = i26;
                                                zzh3 = i25;
                                                if (zzh3 == i25) {
                                                }
                                                break;
                                            case 24:
                                            case 31:
                                            case 41:
                                            case 45:
                                                bArr2 = bArr;
                                                zzfzVar9 = zzfzVar;
                                                i24 = i41;
                                                i26 = i43;
                                                i23 = i46;
                                                i25 = i69;
                                                unsafe = unsafe7;
                                                zzipVar = zzipVar2;
                                                if (i48 == 2) {
                                                    int i86 = zzga.$r8$clinit;
                                                    zzhl zzhlVar = (zzhl) zzhoVar2;
                                                    int zzh8 = zzga.zzh(bArr2, i25, zzfzVar9);
                                                    int i87 = zzfzVar9.zza;
                                                    int i88 = zzh8 + i87;
                                                    if (i88 > bArr2.length) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    zzhlVar.zzh(zzhlVar.size() + (i87 / 4));
                                                    while (zzh8 < i88) {
                                                        zzhlVar.zzg(zzga.zzb(bArr2, zzh8));
                                                        zzh8 += 4;
                                                    }
                                                    if (zzh8 != i88) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    zzfzVar8 = zzfzVar9;
                                                    i5 = i26;
                                                    zzh3 = zzh8;
                                                    if (zzh3 == i25) {
                                                    }
                                                } else {
                                                    if (i48 == 5) {
                                                        int i89 = i25 + 4;
                                                        int i90 = zzga.$r8$clinit;
                                                        zzhl zzhlVar2 = (zzhl) zzhoVar2;
                                                        zzhlVar2.zzg(zzga.zzb(bArr2, i25));
                                                        while (i89 < i2) {
                                                            int zzh9 = zzga.zzh(bArr2, i89, zzfzVar9);
                                                            if (i26 == zzfzVar9.zza) {
                                                                zzhlVar2.zzg(zzga.zzb(bArr2, zzh9));
                                                                i89 = zzh9 + 4;
                                                            } else {
                                                                zzfzVar8 = zzfzVar9;
                                                                zzh3 = i89;
                                                                i5 = i26;
                                                                if (zzh3 == i25) {
                                                                }
                                                            }
                                                        }
                                                        zzfzVar8 = zzfzVar9;
                                                        zzh3 = i89;
                                                        i5 = i26;
                                                        if (zzh3 == i25) {
                                                        }
                                                    }
                                                    zzfzVar8 = zzfzVar9;
                                                    i5 = i26;
                                                    zzh3 = i25;
                                                    if (zzh3 == i25) {
                                                    }
                                                }
                                                break;
                                            case 25:
                                            case 42:
                                                bArr2 = bArr;
                                                zzfzVar9 = zzfzVar;
                                                i24 = i41;
                                                i26 = i43;
                                                i23 = i46;
                                                i25 = i69;
                                                unsafe = unsafe7;
                                                zzipVar = zzipVar2;
                                                if (i48 == 2) {
                                                    int i91 = zzga.$r8$clinit;
                                                    WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzhoVar2);
                                                    zzh3 = zzga.zzh(bArr2, i25, zzfzVar9);
                                                    int i92 = zzfzVar9.zza + zzh3;
                                                    if (zzh3 < i92) {
                                                        zzga.zzk(bArr2, zzh3, zzfzVar9);
                                                        throw null;
                                                    }
                                                    if (zzh3 != i92) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    zzfzVar8 = zzfzVar9;
                                                    i5 = i26;
                                                    if (zzh3 == i25) {
                                                    }
                                                } else {
                                                    if (i48 == 0) {
                                                        int i93 = zzga.$r8$clinit;
                                                        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzhoVar2);
                                                        zzga.zzk(bArr2, i25, zzfzVar9);
                                                        long j5 = zzfzVar9.zzb;
                                                        throw null;
                                                    }
                                                    zzfzVar8 = zzfzVar9;
                                                    i5 = i26;
                                                    zzh3 = i25;
                                                    if (zzh3 == i25) {
                                                    }
                                                }
                                                break;
                                            case 26:
                                                bArr2 = bArr;
                                                zzfzVar9 = zzfzVar;
                                                i24 = i41;
                                                i26 = i43;
                                                i25 = i69;
                                                unsafe = unsafe7;
                                                zzipVar = zzipVar2;
                                                if (i48 != 2) {
                                                    i23 = i46;
                                                    zzfzVar8 = zzfzVar9;
                                                    i5 = i26;
                                                    zzh3 = i25;
                                                    if (zzh3 == i25) {
                                                    }
                                                } else if ((j3 & 536870912) == 0) {
                                                    zzh3 = zzga.zzh(bArr2, i25, zzfzVar9);
                                                    int i94 = zzfzVar9.zza;
                                                    if (i94 < 0) {
                                                        throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i94 == 0) {
                                                        zzhoVar2.add("");
                                                    } else {
                                                        zzhoVar2.add(new String(bArr2, zzh3, i94, zzhp.zza));
                                                        zzh3 += i94;
                                                    }
                                                    while (zzh3 < i2) {
                                                        int zzh10 = zzga.zzh(bArr2, zzh3, zzfzVar9);
                                                        if (i26 == zzfzVar9.zza) {
                                                            zzh3 = zzga.zzh(bArr2, zzh10, zzfzVar9);
                                                            int i95 = zzfzVar9.zza;
                                                            if (i95 < 0) {
                                                                throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i95 == 0) {
                                                                zzhoVar2.add("");
                                                            } else {
                                                                zzhoVar2.add(new String(bArr2, zzh3, i95, zzhp.zza));
                                                                zzh3 += i95;
                                                            }
                                                        } else {
                                                            zzfzVar8 = zzfzVar9;
                                                            i23 = i46;
                                                            i5 = i26;
                                                            if (zzh3 == i25) {
                                                            }
                                                        }
                                                    }
                                                    zzfzVar8 = zzfzVar9;
                                                    i23 = i46;
                                                    i5 = i26;
                                                    if (zzh3 == i25) {
                                                    }
                                                } else {
                                                    zzh3 = zzga.zzh(bArr2, i25, zzfzVar9);
                                                    int i96 = zzfzVar9.zza;
                                                    if (i96 < 0) {
                                                        throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i96 == 0) {
                                                        zzhoVar2.add("");
                                                        i23 = i46;
                                                    } else {
                                                        int i97 = zzh3 + i96;
                                                        if (!zzjt.zzd(bArr2, zzh3, i97)) {
                                                            throw new zzhr("Protocol message had invalid UTF-8.");
                                                        }
                                                        i23 = i46;
                                                        zzhoVar2.add(new String(bArr2, zzh3, i96, zzhp.zza));
                                                        zzh3 = i97;
                                                    }
                                                    while (zzh3 < i2) {
                                                        int zzh11 = zzga.zzh(bArr2, zzh3, zzfzVar9);
                                                        if (i26 == zzfzVar9.zza) {
                                                            zzh3 = zzga.zzh(bArr2, zzh11, zzfzVar9);
                                                            int i98 = zzfzVar9.zza;
                                                            if (i98 < 0) {
                                                                throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i98 == 0) {
                                                                zzhoVar2.add("");
                                                            } else {
                                                                int i99 = zzh3 + i98;
                                                                if (!zzjt.zzd(bArr2, zzh3, i99)) {
                                                                    throw new zzhr("Protocol message had invalid UTF-8.");
                                                                }
                                                                zzhoVar2.add(new String(bArr2, zzh3, i98, zzhp.zza));
                                                                zzh3 = i99;
                                                            }
                                                        } else {
                                                            zzfzVar8 = zzfzVar9;
                                                            i5 = i26;
                                                            if (zzh3 == i25) {
                                                            }
                                                        }
                                                    }
                                                    zzfzVar8 = zzfzVar9;
                                                    i5 = i26;
                                                    if (zzh3 == i25) {
                                                    }
                                                }
                                                break;
                                            case 27:
                                                bArr2 = bArr;
                                                i24 = i41;
                                                i26 = i43;
                                                unsafe = unsafe7;
                                                if (i48 == 2) {
                                                    zzipVar = this;
                                                    i70 = i70;
                                                    zzfzVar8 = zzfzVar;
                                                    int zze = zzga.zze(zzipVar.zzv(i70), i26, bArr2, i69, i2, zzhoVar2, zzfzVar8);
                                                    i25 = i69;
                                                    i26 = i26;
                                                    bArr2 = bArr2;
                                                    zzh3 = zze;
                                                    i23 = i46;
                                                    i5 = i26;
                                                    if (zzh3 == i25) {
                                                    }
                                                } else {
                                                    zzipVar = this;
                                                    i70 = i70;
                                                    i25 = i69;
                                                    zzfzVar8 = zzfzVar;
                                                    i23 = i46;
                                                    i5 = i26;
                                                    zzh3 = i25;
                                                    if (zzh3 == i25) {
                                                    }
                                                }
                                                break;
                                            case 28:
                                                bArr2 = bArr;
                                                zzfzVar10 = zzfzVar;
                                                i24 = i41;
                                                i26 = i43;
                                                i27 = i69;
                                                unsafe = unsafe7;
                                                i28 = i70;
                                                if (i48 == 2) {
                                                    zzh3 = zzga.zzh(bArr2, i27, zzfzVar10);
                                                    int i100 = zzfzVar10.zza;
                                                    if (i100 < 0) {
                                                        throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i100 > bArr2.length - zzh3) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i100 == 0) {
                                                        zzhoVar2.add(zzgk.zzb);
                                                    } else {
                                                        zzhoVar2.add(zzgk.zzj(bArr2, zzh3, i100));
                                                        zzh3 += i100;
                                                    }
                                                    while (zzh3 < i2) {
                                                        int zzh12 = zzga.zzh(bArr2, zzh3, zzfzVar10);
                                                        if (i26 == zzfzVar10.zza) {
                                                            zzh3 = zzga.zzh(bArr2, zzh12, zzfzVar10);
                                                            int i101 = zzfzVar10.zza;
                                                            if (i101 < 0) {
                                                                throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i101 > bArr2.length - zzh3) {
                                                                throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            }
                                                            if (i101 == 0) {
                                                                zzhoVar2.add(zzgk.zzb);
                                                            } else {
                                                                zzhoVar2.add(zzgk.zzj(bArr2, zzh3, i101));
                                                                zzh3 += i101;
                                                            }
                                                        } else {
                                                            zzipVar = this;
                                                            i25 = i27;
                                                            zzfzVar8 = zzfzVar10;
                                                            i70 = i28;
                                                            i23 = i46;
                                                            i5 = i26;
                                                            if (zzh3 == i25) {
                                                            }
                                                        }
                                                    }
                                                    zzipVar = this;
                                                    i25 = i27;
                                                    zzfzVar8 = zzfzVar10;
                                                    i70 = i28;
                                                    i23 = i46;
                                                    i5 = i26;
                                                    if (zzh3 == i25) {
                                                    }
                                                } else {
                                                    zzipVar = this;
                                                    i25 = i27;
                                                    zzfzVar8 = zzfzVar10;
                                                    i70 = i28;
                                                    i23 = i46;
                                                    i5 = i26;
                                                    zzh3 = i25;
                                                    if (zzh3 == i25) {
                                                    }
                                                }
                                                break;
                                            case 30:
                                            case 44:
                                                bArr2 = bArr;
                                                zzfzVar10 = zzfzVar;
                                                i29 = i43;
                                                if (i48 == 2) {
                                                    zzj = zzga.zzf(bArr2, i69, zzhoVar2, zzfzVar10);
                                                    i26 = i29;
                                                    i27 = i69;
                                                } else if (i48 == 0) {
                                                    i27 = i69;
                                                    i26 = i29;
                                                    zzj = zzga.zzj(i29, bArr2, i27, i2, zzhoVar2, zzfzVar10);
                                                } else {
                                                    unsafe = unsafe7;
                                                    i24 = i41;
                                                    zzipVar = this;
                                                    i23 = i46;
                                                    i25 = i69;
                                                    i5 = i29;
                                                    zzfzVar8 = zzfzVar10;
                                                    zzh3 = i25;
                                                    if (zzh3 == i25) {
                                                    }
                                                }
                                                zzhm zzu3 = zzipVar2.zzu(i70);
                                                zzjj zzjjVar = zzipVar2.zzl;
                                                int i102 = zziz.$r8$clinit;
                                                if (zzu3 == null) {
                                                    i30 = zzj;
                                                    unsafe = unsafe7;
                                                    i24 = i41;
                                                    i28 = i70;
                                                } else if (OnBackPressedDispatcher$$ExternalSyntheticNonNull0.m(zzhoVar2)) {
                                                    int size2 = zzhoVar2.size();
                                                    i30 = zzj;
                                                    unsafe = unsafe7;
                                                    i24 = i41;
                                                    Object obj19 = null;
                                                    int i103 = 0;
                                                    int i104 = 0;
                                                    while (i103 < size2) {
                                                        Integer num = (Integer) zzhoVar2.get(i103);
                                                        int i105 = i70;
                                                        int intValue = num.intValue();
                                                        if (zzu3.zza(intValue)) {
                                                            if (i103 != i104) {
                                                                zzhoVar2.set(i104, num);
                                                            }
                                                            i104++;
                                                        } else {
                                                            obj19 = zziz.zzn(obj2, i46, intValue, obj19, zzjjVar);
                                                        }
                                                        i103++;
                                                        i70 = i105;
                                                    }
                                                    i28 = i70;
                                                    if (i104 != size2) {
                                                        zzhoVar2.subList(i104, size2).clear();
                                                    }
                                                } else {
                                                    i30 = zzj;
                                                    unsafe = unsafe7;
                                                    i24 = i41;
                                                    i28 = i70;
                                                    Iterator it = zzhoVar2.iterator();
                                                    Object obj20 = null;
                                                    while (it.hasNext()) {
                                                        int intValue2 = ((Integer) it.next()).intValue();
                                                        if (!zzu3.zza(intValue2)) {
                                                            obj20 = zziz.zzn(obj2, i46, intValue2, obj20, zzjjVar);
                                                            it.remove();
                                                        }
                                                    }
                                                }
                                                zzipVar = this;
                                                zzh3 = i30;
                                                i25 = i27;
                                                zzfzVar8 = zzfzVar10;
                                                i70 = i28;
                                                i23 = i46;
                                                i5 = i26;
                                                if (zzh3 == i25) {
                                                }
                                                break;
                                            case 33:
                                            case 47:
                                                bArr2 = bArr;
                                                zzfzVar10 = zzfzVar;
                                                i29 = i43;
                                                i31 = i69;
                                                if (i48 == 2) {
                                                    int i106 = zzga.$r8$clinit;
                                                    zzhl zzhlVar3 = (zzhl) zzhoVar2;
                                                    zzh4 = zzga.zzh(bArr2, i31, zzfzVar10);
                                                    int i107 = zzfzVar10.zza + zzh4;
                                                    while (zzh4 < i107) {
                                                        zzh4 = zzga.zzh(bArr2, zzh4, zzfzVar10);
                                                        zzhlVar3.zzg(zzgn.zzb(zzfzVar10.zza));
                                                    }
                                                    if (zzh4 != i107) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    unsafe = unsafe7;
                                                    i23 = i46;
                                                    i24 = i41;
                                                    i25 = i31;
                                                    zzipVar = zzipVar2;
                                                    zzh3 = zzh4;
                                                    i5 = i29;
                                                    zzfzVar8 = zzfzVar10;
                                                    if (zzh3 == i25) {
                                                    }
                                                } else {
                                                    if (i48 == 0) {
                                                        int i108 = zzga.$r8$clinit;
                                                        zzhl zzhlVar4 = (zzhl) zzhoVar2;
                                                        int zzh13 = zzga.zzh(bArr2, i31, zzfzVar10);
                                                        zzhlVar4.zzg(zzgn.zzb(zzfzVar10.zza));
                                                        while (zzh13 < i2) {
                                                            int zzh14 = zzga.zzh(bArr2, zzh13, zzfzVar10);
                                                            if (i29 == zzfzVar10.zza) {
                                                                zzh13 = zzga.zzh(bArr2, zzh14, zzfzVar10);
                                                                zzhlVar4.zzg(zzgn.zzb(zzfzVar10.zza));
                                                            } else {
                                                                unsafe = unsafe7;
                                                                i23 = i46;
                                                                i24 = i41;
                                                                i25 = i31;
                                                                zzipVar = zzipVar2;
                                                                zzh3 = zzh13;
                                                                i5 = i29;
                                                                zzfzVar8 = zzfzVar10;
                                                                if (zzh3 == i25) {
                                                                }
                                                            }
                                                        }
                                                        unsafe = unsafe7;
                                                        i23 = i46;
                                                        i24 = i41;
                                                        i25 = i31;
                                                        zzipVar = zzipVar2;
                                                        zzh3 = zzh13;
                                                        i5 = i29;
                                                        zzfzVar8 = zzfzVar10;
                                                        if (zzh3 == i25) {
                                                        }
                                                    }
                                                    unsafe = unsafe7;
                                                    i23 = i46;
                                                    i24 = i41;
                                                    i25 = i31;
                                                    zzipVar = zzipVar2;
                                                    i5 = i29;
                                                    zzfzVar8 = zzfzVar10;
                                                    zzh3 = i25;
                                                    if (zzh3 == i25) {
                                                    }
                                                }
                                                break;
                                            case 34:
                                            case 48:
                                                bArr2 = bArr;
                                                zzfzVar10 = zzfzVar;
                                                i29 = i43;
                                                i31 = i69;
                                                if (i48 == 2) {
                                                    int i109 = zzga.$r8$clinit;
                                                    WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzhoVar2);
                                                    zzh4 = zzga.zzh(bArr2, i31, zzfzVar10);
                                                    int i110 = zzfzVar10.zza + zzh4;
                                                    if (zzh4 < i110) {
                                                        zzga.zzk(bArr2, zzh4, zzfzVar10);
                                                        zzgn.zzc(zzfzVar10.zzb);
                                                        throw null;
                                                    }
                                                    if (zzh4 != i110) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    unsafe = unsafe7;
                                                    i23 = i46;
                                                    i24 = i41;
                                                    i25 = i31;
                                                    zzipVar = zzipVar2;
                                                    zzh3 = zzh4;
                                                    i5 = i29;
                                                    zzfzVar8 = zzfzVar10;
                                                    if (zzh3 == i25) {
                                                    }
                                                } else {
                                                    if (i48 == 0) {
                                                        int i111 = zzga.$r8$clinit;
                                                        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzhoVar2);
                                                        zzga.zzk(bArr2, i31, zzfzVar10);
                                                        zzgn.zzc(zzfzVar10.zzb);
                                                        throw null;
                                                    }
                                                    unsafe = unsafe7;
                                                    i23 = i46;
                                                    i24 = i41;
                                                    i25 = i31;
                                                    zzipVar = zzipVar2;
                                                    i5 = i29;
                                                    zzfzVar8 = zzfzVar10;
                                                    zzh3 = i25;
                                                    if (zzh3 == i25) {
                                                    }
                                                }
                                                break;
                                            default:
                                                if (i48 == 3) {
                                                    int i112 = (i43 & (-8)) | 4;
                                                    zzix zzv = zzipVar2.zzv(i70);
                                                    bArr2 = bArr;
                                                    zzfzVar10 = zzfzVar;
                                                    int zzc = zzga.zzc(zzv, bArr2, i69, i2, i112, zzfzVar10);
                                                    zzhoVar2.add(zzfzVar10.zzc);
                                                    while (zzc < i2) {
                                                        int zzh15 = zzga.zzh(bArr2, zzc, zzfzVar10);
                                                        zzix zzixVar = zzv;
                                                        if (i43 == zzfzVar10.zza) {
                                                            zzv = zzixVar;
                                                            zzc = zzga.zzc(zzv, bArr2, zzh15, i2, i112, zzfzVar10);
                                                            zzhoVar2.add(zzfzVar10.zzc);
                                                        } else {
                                                            unsafe = unsafe7;
                                                            i23 = i46;
                                                            i24 = i41;
                                                            i25 = i69;
                                                            zzipVar = zzipVar2;
                                                            i5 = i43;
                                                            zzh3 = zzc;
                                                            zzfzVar8 = zzfzVar10;
                                                            if (zzh3 == i25) {
                                                            }
                                                        }
                                                    }
                                                    unsafe = unsafe7;
                                                    i23 = i46;
                                                    i24 = i41;
                                                    i25 = i69;
                                                    zzipVar = zzipVar2;
                                                    i5 = i43;
                                                    zzh3 = zzc;
                                                    zzfzVar8 = zzfzVar10;
                                                    if (zzh3 == i25) {
                                                    }
                                                } else {
                                                    i23 = i46;
                                                    i5 = i43;
                                                    bArr2 = bArr;
                                                    zzfzVar8 = zzfzVar;
                                                    i24 = i41;
                                                    i25 = i69;
                                                    unsafe = unsafe7;
                                                    zzipVar = zzipVar2;
                                                    zzh3 = i25;
                                                    if (zzh3 == i25) {
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                } else if (i48 == 2) {
                                    zzho zzhoVar3 = (zzho) unsafe7.getObject(obj18, j);
                                    if (!zzhoVar3.zzc()) {
                                        int size3 = zzhoVar3.size();
                                        zzhoVar3 = zzhoVar3.zzd(size3 == 0 ? 10 : size3 + size3);
                                        unsafe7.putObject(obj18, j, zzhoVar3);
                                    }
                                    bArr7 = bArr;
                                    i34 = i2;
                                    zzfzVar12 = zzfzVar;
                                    i37 = zzga.zze(zzipVar2.zzv(i70), i43, bArr7, i69, i2, zzhoVar3, zzfzVar);
                                    obj5 = obj;
                                    unsafe4 = unsafe7;
                                    i38 = i46;
                                    i39 = i70;
                                    i35 = 0;
                                    i36 = -1;
                                    i42 = 1;
                                } else {
                                    obj2 = obj18;
                                    i18 = i46;
                                    i5 = i43;
                                    zzfzVar7 = zzfzVar;
                                    zzipVar = zzipVar2;
                                    i19 = i40;
                                    i20 = i41;
                                    i21 = i69;
                                    unsafe = unsafe7;
                                    bArr2 = bArr;
                                }
                                i4 = i3;
                                zzfzVar2 = zzfzVar7;
                                i6 = i21;
                                i39 = i70;
                                i46 = i18;
                                i41 = i20;
                                i40 = i19;
                                if (i5 != i4) {
                                }
                                if (zzipVar.zzh) {
                                }
                                i43 = i5;
                                i34 = i2;
                                zzg = zzga.zzg(i43, bArr, i6, i34, zzd(obj2), zzfzVar);
                                zzfzVar12 = zzfzVar;
                                obj5 = obj2;
                                zzipVar2 = zzipVar;
                                unsafe4 = unsafe;
                                i35 = 0;
                                i36 = -1;
                                i42 = 1;
                                i38 = i46;
                                i37 = zzg;
                                bArr7 = bArr;
                            }
                        }
                        i4 = i3;
                        if (i5 != i4) {
                        }
                        if (zzipVar.zzh) {
                        }
                        i43 = i5;
                        i34 = i2;
                        zzg = zzga.zzg(i43, bArr, i6, i34, zzd(obj2), zzfzVar);
                        zzfzVar12 = zzfzVar;
                        obj5 = obj2;
                        zzipVar2 = zzipVar;
                        unsafe4 = unsafe;
                        i35 = 0;
                        i36 = -1;
                        i42 = 1;
                        i38 = i46;
                        i37 = zzg;
                        bArr7 = bArr;
                    }
                    zzq = -1;
                    if (zzq != i36) {
                    }
                    i4 = i3;
                    if (i5 != i4) {
                    }
                    if (zzipVar.zzh) {
                    }
                    i43 = i5;
                    i34 = i2;
                    zzg = zzga.zzg(i43, bArr, i6, i34, zzd(obj2), zzfzVar);
                    zzfzVar12 = zzfzVar;
                    obj5 = obj2;
                    zzipVar2 = zzipVar;
                    unsafe4 = unsafe;
                    i35 = 0;
                    i36 = -1;
                    i42 = 1;
                    i38 = i46;
                    i37 = zzg;
                    bArr7 = bArr;
                } else {
                    if (i46 >= zzipVar2.zze && i46 <= zzipVar2.zzf) {
                        zzq = zzipVar2.zzq(i46, i35);
                        if (zzq != i36) {
                        }
                        i4 = i3;
                        if (i5 != i4) {
                        }
                        if (zzipVar.zzh) {
                        }
                        i43 = i5;
                        i34 = i2;
                        zzg = zzga.zzg(i43, bArr, i6, i34, zzd(obj2), zzfzVar);
                        zzfzVar12 = zzfzVar;
                        obj5 = obj2;
                        zzipVar2 = zzipVar;
                        unsafe4 = unsafe;
                        i35 = 0;
                        i36 = -1;
                        i42 = 1;
                        i38 = i46;
                        i37 = zzg;
                        bArr7 = bArr;
                    }
                    zzq = -1;
                    if (zzq != i36) {
                    }
                    i4 = i3;
                    if (i5 != i4) {
                    }
                    if (zzipVar.zzh) {
                    }
                    i43 = i5;
                    i34 = i2;
                    zzg = zzga.zzg(i43, bArr, i6, i34, zzd(obj2), zzfzVar);
                    zzfzVar12 = zzfzVar;
                    obj5 = obj2;
                    zzipVar2 = zzipVar;
                    unsafe4 = unsafe;
                    i35 = 0;
                    i36 = -1;
                    i42 = 1;
                    i38 = i46;
                    i37 = zzg;
                    bArr7 = bArr;
                }
            } else {
                zzipVar = zzipVar2;
                unsafe = unsafe4;
                obj2 = obj5;
                i4 = i3;
                i5 = i43;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final Object zze() {
        return ((zzhk) this.zzg).zzp();
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzhk) {
                zzhk zzhkVar = (zzhk) obj;
                zzhkVar.zzy(ConnectionsManager.DEFAULT_DATACENTER_ID);
                zzhkVar.zza = 0;
                zzhkVar.zzw();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zzs = zzs(i);
                int i2 = 1048575 & zzs;
                int zzr = zzr(zzs);
                long j = i2;
                if (zzr != 9) {
                    if (zzr != 60 && zzr != 68) {
                        switch (zzr) {
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
                                ((zzho) zzjq.zzf(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzig) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzM(obj, this.zzc[i], i)) {
                        zzv(i).zzf(zzb.getObject(obj, j));
                    }
                }
                if (zzI(obj, i)) {
                    zzv(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzl.zza(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzs = zzs(i);
            int i2 = 1048575 & zzs;
            int[] iArr = this.zzc;
            int zzr = zzr(zzs);
            int i3 = iArr[i];
            long j = i2;
            switch (zzr) {
                case 0:
                    if (zzI(obj2, i)) {
                        zzjq.zzo(obj, j, zzjq.zza(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzI(obj2, i)) {
                        zzjq.zzp(obj, j, zzjq.zzb(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzI(obj2, i)) {
                        zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzI(obj2, i)) {
                        zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzI(obj2, i)) {
                        zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzI(obj2, i)) {
                        zzjq.zzm(obj, j, zzjq.zzw(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzI(obj2, i)) {
                        zzjq.zzs(obj, j, zzjq.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (zzI(obj2, i)) {
                        zzjq.zzs(obj, j, zzjq.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzI(obj2, i)) {
                        zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzI(obj2, i)) {
                        zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i);
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
                    zzho zzhoVar = (zzho) zzjq.zzf(obj, j);
                    zzho zzhoVar2 = (zzho) zzjq.zzf(obj2, j);
                    int size = zzhoVar.size();
                    int size2 = zzhoVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzhoVar.zzc()) {
                            zzhoVar = zzhoVar.zzd(size2 + size);
                        }
                        zzhoVar.addAll(zzhoVar2);
                    }
                    if (size > 0) {
                        zzhoVar2 = zzhoVar;
                    }
                    zzjq.zzs(obj, j, zzhoVar2);
                    break;
                case 50:
                    int i4 = zziz.$r8$clinit;
                    zzjq.zzs(obj, j, zzih.zza(zzjq.zzf(obj, j), zzjq.zzf(obj2, j)));
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
                    if (zzM(obj2, i3, i)) {
                        zzjq.zzs(obj, j, zzjq.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzC(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzM(obj2, i3, i)) {
                        zzjq.zzs(obj, j, zzjq.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
        }
        zziz.zzp(this.zzl, obj, obj2);
        if (this.zzh) {
            zziz.zzo(this.zzm, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzfz zzfzVar) {
        zzc(obj, bArr, i, i2, 0, zzfzVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final void zzi(Object obj, zzjw zzjwVar) {
        int i;
        zzip zzipVar = this;
        if (zzipVar.zzh) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
            throw null;
        }
        int[] iArr = zzipVar.zzc;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 1048575;
        int i5 = 0;
        while (i3 < iArr.length) {
            int zzs = zzipVar.zzs(i3);
            int[] iArr2 = zzipVar.zzc;
            int zzr = zzr(zzs);
            int i6 = iArr2[i3];
            if (zzr <= 17) {
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
            long j = zzs & i2;
            switch (zzr) {
                case 0:
                    if (zzipVar.zzJ(obj, i3, i4, i5, i)) {
                        zzjwVar.zzf(i6, zzjq.zza(obj, j));
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 1:
                    if (zzipVar.zzJ(obj, i3, i4, i5, i)) {
                        zzjwVar.zzo(i6, zzjq.zzb(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 2:
                    if (zzipVar.zzJ(obj, i3, i4, i5, i)) {
                        zzjwVar.zzt(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 3:
                    if (zzipVar.zzJ(obj, i3, i4, i5, i)) {
                        zzjwVar.zzK(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 4:
                    if (zzipVar.zzJ(obj, i3, i4, i5, i)) {
                        zzjwVar.zzr(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 5:
                    if (zzipVar.zzJ(obj, i3, i4, i5, i)) {
                        zzjwVar.zzm(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 6:
                    if (zzipVar.zzJ(obj, i3, i4, i5, i)) {
                        zzjwVar.zzk(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 7:
                    if (zzipVar.zzJ(obj, i3, i4, i5, i)) {
                        zzjwVar.zzb(i6, zzjq.zzw(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 8:
                    if (zzipVar.zzJ(obj, i3, i4, i5, i)) {
                        zzO(i6, unsafe.getObject(obj, j), zzjwVar);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 9:
                    if (zzipVar.zzJ(obj, i3, i4, i5, i)) {
                        zzjwVar.zzv(i6, unsafe.getObject(obj, j), zzipVar.zzv(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 10:
                    if (zzipVar.zzJ(obj, i3, i4, i5, i)) {
                        zzjwVar.zzd(i6, (zzgk) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 11:
                    if (zzipVar.zzJ(obj, i3, i4, i5, i)) {
                        zzjwVar.zzI(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 12:
                    if (zzipVar.zzJ(obj, i3, i4, i5, i)) {
                        zzjwVar.zzi(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 13:
                    if (zzipVar.zzJ(obj, i3, i4, i5, i)) {
                        zzjwVar.zzx(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 14:
                    if (zzipVar.zzJ(obj, i3, i4, i5, i)) {
                        zzjwVar.zzz(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 15:
                    if (zzipVar.zzJ(obj, i3, i4, i5, i)) {
                        zzjwVar.zzB(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 16:
                    if (zzipVar.zzJ(obj, i3, i4, i5, i)) {
                        zzjwVar.zzD(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 17:
                    if (zzipVar.zzJ(obj, i3, i4, i5, i)) {
                        zzjwVar.zzq(i6, unsafe.getObject(obj, j), zzipVar.zzv(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 18:
                    zziz.zzr(zzipVar.zzc[i3], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 19:
                    zziz.zzv(zzipVar.zzc[i3], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 20:
                    zziz.zzx(zzipVar.zzc[i3], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 21:
                    zziz.zzD(zzipVar.zzc[i3], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 22:
                    zziz.zzw(zzipVar.zzc[i3], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 23:
                    zziz.zzu(zzipVar.zzc[i3], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 24:
                    zziz.zzt(zzipVar.zzc[i3], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 25:
                    zziz.zzq(zzipVar.zzc[i3], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 26:
                    int i9 = zzipVar.zzc[i3];
                    List list = (List) unsafe.getObject(obj, j);
                    int i10 = zziz.$r8$clinit;
                    if (list != null && !list.isEmpty()) {
                        zzjwVar.zzH(i9, list);
                        break;
                    }
                    break;
                case 27:
                    int i11 = zzipVar.zzc[i3];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zzix zzv = zzipVar.zzv(i3);
                    int i12 = zziz.$r8$clinit;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i13 = 0; i13 < list2.size(); i13++) {
                            ((zzgs) zzjwVar).zzv(i11, list2.get(i13), zzv);
                        }
                        break;
                    }
                    break;
                case 28:
                    int i14 = zzipVar.zzc[i3];
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i15 = zziz.$r8$clinit;
                    if (list3 != null && !list3.isEmpty()) {
                        zzjwVar.zze(i14, list3);
                        break;
                    }
                    break;
                case 29:
                    zziz.zzC(zzipVar.zzc[i3], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 30:
                    zziz.zzs(zzipVar.zzc[i3], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 31:
                    zziz.zzy(zzipVar.zzc[i3], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 32:
                    zziz.zzz(zzipVar.zzc[i3], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 33:
                    zziz.zzA(zzipVar.zzc[i3], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 34:
                    zziz.zzB(zzipVar.zzc[i3], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    zzipVar = this;
                case 35:
                    zziz.zzr(zzipVar.zzc[i3], (List) unsafe.getObject(obj, j), zzjwVar, true);
                    break;
                case 36:
                    zziz.zzv(zzipVar.zzc[i3], (List) unsafe.getObject(obj, j), zzjwVar, true);
                    break;
                case 37:
                    zziz.zzx(zzipVar.zzc[i3], (List) unsafe.getObject(obj, j), zzjwVar, true);
                    break;
                case 38:
                    zziz.zzD(zzipVar.zzc[i3], (List) unsafe.getObject(obj, j), zzjwVar, true);
                    break;
                case 39:
                    zziz.zzw(zzipVar.zzc[i3], (List) unsafe.getObject(obj, j), zzjwVar, true);
                    break;
                case 40:
                    zziz.zzu(zzipVar.zzc[i3], (List) unsafe.getObject(obj, j), zzjwVar, true);
                    break;
                case 41:
                    zziz.zzt(zzipVar.zzc[i3], (List) unsafe.getObject(obj, j), zzjwVar, true);
                    break;
                case 42:
                    zziz.zzq(zzipVar.zzc[i3], (List) unsafe.getObject(obj, j), zzjwVar, true);
                    break;
                case 43:
                    zziz.zzC(zzipVar.zzc[i3], (List) unsafe.getObject(obj, j), zzjwVar, true);
                    break;
                case 44:
                    zziz.zzs(zzipVar.zzc[i3], (List) unsafe.getObject(obj, j), zzjwVar, true);
                    break;
                case 45:
                    zziz.zzy(zzipVar.zzc[i3], (List) unsafe.getObject(obj, j), zzjwVar, true);
                    break;
                case 46:
                    zziz.zzz(zzipVar.zzc[i3], (List) unsafe.getObject(obj, j), zzjwVar, true);
                    break;
                case 47:
                    zziz.zzA(zzipVar.zzc[i3], (List) unsafe.getObject(obj, j), zzjwVar, true);
                    break;
                case 48:
                    zziz.zzB(zzipVar.zzc[i3], (List) unsafe.getObject(obj, j), zzjwVar, true);
                    break;
                case 49:
                    int i16 = zzipVar.zzc[i3];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zzix zzv2 = zzipVar.zzv(i3);
                    int i17 = zziz.$r8$clinit;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i18 = 0; i18 < list4.size(); i18++) {
                            ((zzgs) zzjwVar).zzq(i16, list4.get(i18), zzv2);
                        }
                        break;
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzipVar.zzw(i3));
                        throw null;
                    }
                    break;
                case 51:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        zzjwVar.zzf(i6, zzm(obj, j));
                        break;
                    }
                    break;
                case 52:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        zzjwVar.zzo(i6, zzn(obj, j));
                        break;
                    }
                    break;
                case 53:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        zzjwVar.zzt(i6, zzt(obj, j));
                        break;
                    }
                    break;
                case 54:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        zzjwVar.zzK(i6, zzt(obj, j));
                        break;
                    }
                    break;
                case 55:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        zzjwVar.zzr(i6, zzo(obj, j));
                        break;
                    }
                    break;
                case 56:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        zzjwVar.zzm(i6, zzt(obj, j));
                        break;
                    }
                    break;
                case 57:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        zzjwVar.zzk(i6, zzo(obj, j));
                        break;
                    }
                    break;
                case 58:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        zzjwVar.zzb(i6, zzN(obj, j));
                        break;
                    }
                    break;
                case 59:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        zzO(i6, unsafe.getObject(obj, j), zzjwVar);
                        break;
                    }
                    break;
                case 60:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        zzjwVar.zzv(i6, unsafe.getObject(obj, j), zzipVar.zzv(i3));
                        break;
                    }
                    break;
                case 61:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        zzjwVar.zzd(i6, (zzgk) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        zzjwVar.zzI(i6, zzo(obj, j));
                        break;
                    }
                    break;
                case 63:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        zzjwVar.zzi(i6, zzo(obj, j));
                        break;
                    }
                    break;
                case 64:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        zzjwVar.zzx(i6, zzo(obj, j));
                        break;
                    }
                    break;
                case 65:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        zzjwVar.zzz(i6, zzt(obj, j));
                        break;
                    }
                    break;
                case 66:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        zzjwVar.zzB(i6, zzo(obj, j));
                        break;
                    }
                    break;
                case 67:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        zzjwVar.zzD(i6, zzt(obj, j));
                        break;
                    }
                    break;
                case 68:
                    if (zzipVar.zzM(obj, i6, i3)) {
                        zzjwVar.zzq(i6, unsafe.getObject(obj, j), zzipVar.zzv(i3));
                        break;
                    }
                    break;
            }
            i3 += 3;
            i2 = 1048575;
            zzipVar = this;
        }
        ((zzhk) obj).zzc.zzl(zzjwVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzE;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzs = zzs(i);
            long j = zzs & 1048575;
            switch (zzr(zzs)) {
                case 0:
                    if (zzH(obj, obj2, i) && Double.doubleToLongBits(zzjq.zza(obj, j)) == Double.doubleToLongBits(zzjq.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzH(obj, obj2, i) && Float.floatToIntBits(zzjq.zzb(obj, j)) == Float.floatToIntBits(zzjq.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzH(obj, obj2, i) && zzjq.zzd(obj, j) == zzjq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzH(obj, obj2, i) && zzjq.zzd(obj, j) == zzjq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzH(obj, obj2, i) && zzjq.zzc(obj, j) == zzjq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzH(obj, obj2, i) && zzjq.zzd(obj, j) == zzjq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzH(obj, obj2, i) && zzjq.zzc(obj, j) == zzjq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzH(obj, obj2, i) && zzjq.zzw(obj, j) == zzjq.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzH(obj, obj2, i) && zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzH(obj, obj2, i) && zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzH(obj, obj2, i) && zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzH(obj, obj2, i) && zzjq.zzc(obj, j) == zzjq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzH(obj, obj2, i) && zzjq.zzc(obj, j) == zzjq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzH(obj, obj2, i) && zzjq.zzc(obj, j) == zzjq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzH(obj, obj2, i) && zzjq.zzd(obj, j) == zzjq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzH(obj, obj2, i) && zzjq.zzc(obj, j) == zzjq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzH(obj, obj2, i) && zzjq.zzd(obj, j) == zzjq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzH(obj, obj2, i) && zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
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
                    zzE = zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j));
                    break;
                case 50:
                    zzE = zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j));
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
                    long zzp = zzp(i) & 1048575;
                    if (zzjq.zzc(obj, zzp) == zzjq.zzc(obj2, zzp) && zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzE) {
                return false;
            }
        }
        if (!((zzhk) obj).zzc.equals(((zzhk) obj2).zzc)) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i7 = iArr[i6];
            int i8 = iArr2[i7];
            int zzs = zzs(i7);
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
            if ((268435456 & zzs) != 0) {
                i2 = i7;
                i3 = i4;
                if (!zzJ(obj, i2, i3, i, i11)) {
                    return false;
                }
            } else {
                i2 = i7;
                i3 = i4;
            }
            int zzr = zzr(zzs);
            if (zzr != 9 && zzr != 17) {
                if (zzr != 27) {
                    if (zzr == 60 || zzr == 68) {
                        if (zzM(obj, i8, i2) && !zzK(obj, zzs, zzv(i2))) {
                            return false;
                        }
                    } else if (zzr != 49) {
                        if (zzr == 50 && !((zzig) zzjq.zzf(obj, zzs & 1048575)).isEmpty()) {
                            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzw(i2));
                            throw null;
                        }
                    }
                }
                List list = (List) zzjq.zzf(obj, zzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzix zzv = zzv(i2);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!zzv.zzk(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (zzJ(obj, i2, i3, i, i11) && !zzK(obj, zzs, zzv(i2))) {
                return false;
            }
            i6++;
            i4 = i3;
            i5 = i;
        }
        if (!this.zzh) {
            return true;
        }
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }
}
