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
final class zzgo implements zzgv {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzho.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgl zzg;
    private final boolean zzh = false;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzhh zzl;
    private final zzev zzm;

    private zzgo(int[] iArr, Object[] objArr, int i, int i2, zzgl zzglVar, boolean z, int[] iArr2, int i3, int i4, zzgq zzgqVar, zzfy zzfyVar, zzhh zzhhVar, zzev zzevVar, zzgg zzggVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = iArr2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = zzhhVar;
        this.zzm = zzevVar;
        this.zzg = zzglVar;
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
            zzgv zzv = zzv(i);
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
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzM(obj2, i2, i)) {
            int zzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            zzgv zzv = zzv(i);
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
        zzho.zzq(obj, j, (1 << (zzp >>> 20)) | zzho.zzc(obj, j));
    }

    private final void zzE(Object obj, int i, int i2) {
        zzho.zzq(obj, zzp(i2) & 1048575, i);
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
            return (zzho.zzc(obj, j) & (1 << (zzp >>> 20))) != 0;
        }
        int zzs = zzs(i);
        long j2 = zzs & 1048575;
        switch (zzr(zzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzho.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzho.zzb(obj, j2)) != 0;
            case 2:
                return zzho.zzd(obj, j2) != 0;
            case 3:
                return zzho.zzd(obj, j2) != 0;
            case 4:
                return zzho.zzc(obj, j2) != 0;
            case 5:
                return zzho.zzd(obj, j2) != 0;
            case 6:
                return zzho.zzc(obj, j2) != 0;
            case 7:
                return zzho.zzw(obj, j2);
            case 8:
                Object zzf = zzho.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzei) {
                    return !zzei.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzho.zzf(obj, j2) != null;
            case 10:
                return !zzei.zzb.equals(zzho.zzf(obj, j2));
            case 11:
                return zzho.zzc(obj, j2) != 0;
            case 12:
                return zzho.zzc(obj, j2) != 0;
            case 13:
                return zzho.zzc(obj, j2) != 0;
            case 14:
                return zzho.zzd(obj, j2) != 0;
            case 15:
                return zzho.zzc(obj, j2) != 0;
            case 16:
                return zzho.zzd(obj, j2) != 0;
            case 17:
                return zzho.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzI(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzK(Object obj, int i, zzgv zzgvVar) {
        return zzgvVar.zzk(zzho.zzf(obj, i & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzfi) {
            return ((zzfi) obj).zzz();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i, int i2) {
        return zzho.zzc(obj, (long) (zzp(i2) & 1048575)) == i;
    }

    private static boolean zzN(Object obj, long j) {
        return ((Boolean) zzho.zzf(obj, j)).booleanValue();
    }

    private static final void zzO(int i, Object obj, zzhu zzhuVar) {
        if (obj instanceof String) {
            zzhuVar.zzG(i, (String) obj);
        } else {
            zzhuVar.zzd(i, (zzei) obj);
        }
    }

    static zzhi zzd(Object obj) {
        zzfi zzfiVar = (zzfi) obj;
        zzhi zzhiVar = zzfiVar.zzc;
        if (zzhiVar != zzhi.zzc()) {
            return zzhiVar;
        }
        zzhi zzf = zzhi.zzf();
        zzfiVar.zzc = zzf;
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
    static zzgo zzl(Class cls, zzgi zzgiVar, zzgq zzgqVar, zzfy zzfyVar, zzhh zzhhVar, zzev zzevVar, zzgg zzggVar) {
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
        if (!(zzgiVar instanceof zzgu)) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzgiVar);
            throw null;
        }
        zzgu zzguVar = (zzgu) zzgiVar;
        String zzd = zzguVar.zzd();
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
        Object[] zze = zzguVar.zze();
        Class<?> cls2 = zzguVar.zza().getClass();
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
            zzgu zzguVar2 = zzguVar;
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
                        if (zzguVar2.zzc() == 1 || i78 != 0) {
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
                        if (zzguVar2.zzc() == 1 || i78 != 0) {
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
            zzguVar = zzguVar2;
            length = i18;
            i7 = i19;
            c = CharacterCompat.MIN_HIGH_SURROGATE;
        }
        return new zzgo(iArr3, objArr, i2, i4, zzguVar.zza(), false, iArr, i5, i63, zzgqVar, zzfyVar, zzhhVar, zzevVar, zzggVar);
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zzho.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zzho.zzf(obj, j)).floatValue();
    }

    private static int zzo(Object obj, long j) {
        return ((Integer) zzho.zzf(obj, j)).intValue();
    }

    private final int zzp(int i) {
        return this.zzc[i + 2];
    }

    private final int zzq(int i, int i2) {
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

    private static int zzr(int i) {
        return (i >>> 20) & NotificationCenter.didReceiveSmsCode;
    }

    private final int zzs(int i) {
        return this.zzc[i + 1];
    }

    private static long zzt(Object obj, long j) {
        return ((Long) zzho.zzf(obj, j)).longValue();
    }

    private final zzfl zzu(int i) {
        int i2 = i / 3;
        return (zzfl) this.zzd[i2 + i2 + 1];
    }

    private final zzgv zzv(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzgv zzgvVar = (zzgv) objArr[i3];
        if (zzgvVar != null) {
            return zzgvVar;
        }
        zzgv zzb2 = zzgs.zza().zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zzb2;
        return zzb2;
    }

    private final Object zzw(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzx(Object obj, int i) {
        zzgv zzv = zzv(i);
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
        zzgv zzv = zzv(i2);
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final int zza(Object obj) {
        int i;
        int zzC;
        int zzC2;
        int zzD;
        int zzC3;
        int zzC4;
        int zzC5;
        int zzd;
        int zzC6;
        int zzh;
        int zzg;
        int size;
        int zzl;
        int zzC7;
        int zzC8;
        int zzC9;
        int i2;
        int zze;
        int zzC10;
        int zzC11;
        int i3;
        int zzC12;
        int zzC13;
        int zzC14;
        int zzd2;
        int zzC15;
        zzgo zzgoVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int[] iArr = zzgoVar.zzc;
            if (i5 >= iArr.length) {
                int zza2 = i8 + ((zzfi) obj).zzc.zza();
                if (!zzgoVar.zzh) {
                    return zza2;
                }
                WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                throw null;
            }
            int zzs = zzgoVar.zzs(i5);
            int zzr = zzr(zzs);
            int i9 = iArr[i5];
            int i10 = iArr[i5 + 2];
            int i11 = i10 & i4;
            if (zzr <= 17) {
                if (i11 != i6) {
                    i7 = i11 == i4 ? 0 : unsafe.getInt(obj2, i11);
                    i6 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            int i12 = zzs & i4;
            if (zzr >= zzfa.zzJ.zza()) {
                zzfa.zzW.zza();
            }
            int i13 = i8;
            long j = i12;
            switch (zzr) {
                case 0:
                    if (zzgoVar.zzJ(obj2, i5, i6, i7, i)) {
                        i8 = i13 + zzep.zzC(i9 << 3) + 8;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 1:
                    if (zzgoVar.zzJ(obj2, i5, i6, i7, i)) {
                        zzC = zzep.zzC(i9 << 3);
                        zzC4 = zzC + 4;
                        i8 = i13 + zzC4;
                        zzgoVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzgoVar = this;
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 2:
                    if (zzgoVar.zzJ(obj2, i5, i6, i7, i)) {
                        long j2 = unsafe.getLong(obj2, j);
                        zzC2 = zzep.zzC(i9 << 3);
                        zzD = zzep.zzD(j2);
                        zzC4 = zzC2 + zzD;
                        i8 = i13 + zzC4;
                        zzgoVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzgoVar = this;
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 3:
                    if (zzgoVar.zzJ(obj2, i5, i6, i7, i)) {
                        long j3 = unsafe.getLong(obj2, j);
                        zzC2 = zzep.zzC(i9 << 3);
                        zzD = zzep.zzD(j3);
                        zzC4 = zzC2 + zzD;
                        i8 = i13 + zzC4;
                        zzgoVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzgoVar = this;
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 4:
                    if (zzgoVar.zzJ(obj2, i5, i6, i7, i)) {
                        long j4 = unsafe.getInt(obj2, j);
                        zzC2 = zzep.zzC(i9 << 3);
                        zzD = zzep.zzD(j4);
                        zzC4 = zzC2 + zzD;
                        i8 = i13 + zzC4;
                        zzgoVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzgoVar = this;
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 5:
                    if (zzgoVar.zzJ(obj2, i5, i6, i7, i)) {
                        zzC3 = zzep.zzC(i9 << 3);
                        zzC4 = zzC3 + 8;
                        i8 = i13 + zzC4;
                        zzgoVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzgoVar = this;
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 6:
                    if (zzgoVar.zzJ(obj2, i5, i6, i7, i)) {
                        zzC = zzep.zzC(i9 << 3);
                        zzC4 = zzC + 4;
                        i8 = i13 + zzC4;
                        zzgoVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzgoVar = this;
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 7:
                    if (zzgoVar.zzJ(obj2, i5, i6, i7, i)) {
                        zzC4 = zzep.zzC(i9 << 3) + 1;
                        i8 = i13 + zzC4;
                        zzgoVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzgoVar = this;
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 8:
                    if (zzgoVar.zzJ(obj2, i5, i6, i7, i)) {
                        int i14 = i9 << 3;
                        Object object = unsafe.getObject(obj2, j);
                        if (object instanceof zzei) {
                            zzC5 = zzep.zzC(i14);
                            zzd = ((zzei) object).zzd();
                            zzC6 = zzep.zzC(zzd);
                            zzC4 = zzC5 + zzC6 + zzd;
                            i8 = i13 + zzC4;
                            zzgoVar = this;
                            i5 += 3;
                            obj2 = obj;
                            i4 = 1048575;
                        } else {
                            zzC2 = zzep.zzC(i14);
                            zzD = zzep.zzB((String) object);
                            zzC4 = zzC2 + zzD;
                            i8 = i13 + zzC4;
                            zzgoVar = this;
                            i5 += 3;
                            obj2 = obj;
                            i4 = 1048575;
                        }
                    }
                    zzgoVar = this;
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 9:
                    if (zzgoVar.zzJ(obj2, i5, i6, i7, i)) {
                        zzh = zzgx.zzh(i9, unsafe.getObject(obj2, j), zzgoVar.zzv(i5));
                        i8 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 10:
                    if (zzgoVar.zzJ(obj2, i5, i6, i7, i)) {
                        zzei zzeiVar = (zzei) unsafe.getObject(obj2, j);
                        zzC5 = zzep.zzC(i9 << 3);
                        zzd = zzeiVar.zzd();
                        zzC6 = zzep.zzC(zzd);
                        zzC4 = zzC5 + zzC6 + zzd;
                        i8 = i13 + zzC4;
                        zzgoVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzgoVar = this;
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 11:
                    if (zzgoVar.zzJ(obj2, i5, i6, i7, i)) {
                        int i15 = unsafe.getInt(obj2, j);
                        zzC2 = zzep.zzC(i9 << 3);
                        zzD = zzep.zzC(i15);
                        zzC4 = zzC2 + zzD;
                        i8 = i13 + zzC4;
                        zzgoVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzgoVar = this;
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 12:
                    if (zzgoVar.zzJ(obj2, i5, i6, i7, i)) {
                        long j5 = unsafe.getInt(obj2, j);
                        zzC2 = zzep.zzC(i9 << 3);
                        zzD = zzep.zzD(j5);
                        zzC4 = zzC2 + zzD;
                        i8 = i13 + zzC4;
                        zzgoVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzgoVar = this;
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 13:
                    if (zzgoVar.zzJ(obj2, i5, i6, i7, i)) {
                        zzC = zzep.zzC(i9 << 3);
                        zzC4 = zzC + 4;
                        i8 = i13 + zzC4;
                        zzgoVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzgoVar = this;
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 14:
                    if (zzgoVar.zzJ(obj2, i5, i6, i7, i)) {
                        zzC3 = zzep.zzC(i9 << 3);
                        zzC4 = zzC3 + 8;
                        i8 = i13 + zzC4;
                        zzgoVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzgoVar = this;
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 15:
                    if (zzgoVar.zzJ(obj2, i5, i6, i7, i)) {
                        int i16 = unsafe.getInt(obj2, j);
                        zzC2 = zzep.zzC(i9 << 3);
                        zzD = zzep.zzC((i16 >> 31) ^ (i16 + i16));
                        zzC4 = zzC2 + zzD;
                        i8 = i13 + zzC4;
                        zzgoVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzgoVar = this;
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 16:
                    if (zzgoVar.zzJ(obj2, i5, i6, i7, i)) {
                        long j6 = unsafe.getLong(obj2, j);
                        zzC2 = zzep.zzC(i9 << 3);
                        zzD = zzep.zzD((j6 >> 63) ^ (j6 + j6));
                        zzC4 = zzC2 + zzD;
                        i8 = i13 + zzC4;
                        zzgoVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzgoVar = this;
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 17:
                    if (zzgoVar.zzJ(obj2, i5, i6, i7, i)) {
                        zzh = zzep.zzy(i9, (zzgl) unsafe.getObject(obj2, j), zzgoVar.zzv(i5));
                        i8 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 18:
                    zzh = zzgx.zzd(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 19:
                    zzh = zzgx.zzb(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j);
                    int i17 = zzgx.$r8$clinit;
                    if (list.size() != 0) {
                        zzg = zzgx.zzg(list) + (list.size() * zzep.zzC(i9 << 3));
                        i8 = i13 + zzg;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzg = 0;
                    i8 = i13 + zzg;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j);
                    int i18 = zzgx.$r8$clinit;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zzgx.zzl(list2);
                        zzC7 = zzep.zzC(i9 << 3);
                        i2 = size * zzC7;
                        zzh = zzl + i2;
                        i8 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzh = 0;
                    i8 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j);
                    int i19 = zzgx.$r8$clinit;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zzgx.zzf(list3);
                        zzC7 = zzep.zzC(i9 << 3);
                        i2 = size * zzC7;
                        zzh = zzl + i2;
                        i8 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzh = 0;
                    i8 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 23:
                    zzh = zzgx.zzd(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 24:
                    zzh = zzgx.zzb(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j);
                    int i20 = zzgx.$r8$clinit;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzh = size2 * (zzep.zzC(i9 << 3) + 1);
                        i8 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzh = 0;
                    i8 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j);
                    int i21 = zzgx.$r8$clinit;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzg = zzep.zzC(i9 << 3) * size3;
                        if (list5 instanceof zzfx) {
                            zzfx zzfxVar = (zzfx) list5;
                            for (int i22 = 0; i22 < size3; i22++) {
                                Object zza3 = zzfxVar.zza();
                                if (zza3 instanceof zzei) {
                                    int zzd3 = ((zzei) zza3).zzd();
                                    zzg += zzep.zzC(zzd3) + zzd3;
                                } else {
                                    zzg += zzep.zzB((String) zza3);
                                }
                            }
                        } else {
                            for (int i23 = 0; i23 < size3; i23++) {
                                Object obj3 = list5.get(i23);
                                if (obj3 instanceof zzei) {
                                    int zzd4 = ((zzei) obj3).zzd();
                                    zzg += zzep.zzC(zzd4) + zzd4;
                                } else {
                                    zzg += zzep.zzB((String) obj3);
                                }
                            }
                        }
                        i8 = i13 + zzg;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzg = 0;
                    i8 = i13 + zzg;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j);
                    zzgv zzv = zzgoVar.zzv(i5);
                    int i24 = zzgx.$r8$clinit;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzC8 = 0;
                    } else {
                        zzC8 = zzep.zzC(i9 << 3) * size4;
                        for (int i25 = 0; i25 < size4; i25++) {
                            zzC8 += zzep.zzA((zzgl) list6.get(i25), zzv);
                        }
                    }
                    i8 = zzC8 + i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j);
                    int i26 = zzgx.$r8$clinit;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        zzC9 = 0;
                    } else {
                        zzC9 = size5 * zzep.zzC(i9 << 3);
                        for (int i27 = 0; i27 < list7.size(); i27++) {
                            int zzd5 = ((zzei) list7.get(i27)).zzd();
                            zzC9 += zzep.zzC(zzd5) + zzd5;
                        }
                    }
                    i8 = i13 + zzC9;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j);
                    int i28 = zzgx.$r8$clinit;
                    size = list8.size();
                    if (size != 0) {
                        zzl = zzgx.zzk(list8);
                        zzC7 = zzep.zzC(i9 << 3);
                        i2 = size * zzC7;
                        zzh = zzl + i2;
                        i8 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzh = 0;
                    i8 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j);
                    int i29 = zzgx.$r8$clinit;
                    size = list9.size();
                    if (size != 0) {
                        zzl = zzgx.zza(list9);
                        zzC7 = zzep.zzC(i9 << 3);
                        i2 = size * zzC7;
                        zzh = zzl + i2;
                        i8 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzh = 0;
                    i8 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 31:
                    zzh = zzgx.zzb(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 32:
                    zzh = zzgx.zzd(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j);
                    int i30 = zzgx.$r8$clinit;
                    size = list10.size();
                    if (size != 0) {
                        zzl = zzgx.zzi(list10);
                        zzC7 = zzep.zzC(i9 << 3);
                        i2 = size * zzC7;
                        zzh = zzl + i2;
                        i8 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzh = 0;
                    i8 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j);
                    int i31 = zzgx.$r8$clinit;
                    size = list11.size();
                    if (size != 0) {
                        zzl = zzgx.zzj(list11);
                        zzC7 = zzep.zzC(i9 << 3);
                        i2 = size * zzC7;
                        zzh = zzl + i2;
                        i8 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzh = 0;
                    i8 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 35:
                    zze = zzgx.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzC10 = zzep.zzC(i9 << 3);
                        zzC11 = zzep.zzC(zze);
                        zzC9 = zzC10 + zzC11 + zze;
                        i8 = i13 + zzC9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 36:
                    zze = zzgx.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzC10 = zzep.zzC(i9 << 3);
                        zzC11 = zzep.zzC(zze);
                        zzC9 = zzC10 + zzC11 + zze;
                        i8 = i13 + zzC9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 37:
                    zze = zzgx.zzg((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzC10 = zzep.zzC(i9 << 3);
                        zzC11 = zzep.zzC(zze);
                        zzC9 = zzC10 + zzC11 + zze;
                        i8 = i13 + zzC9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 38:
                    zze = zzgx.zzl((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzC10 = zzep.zzC(i9 << 3);
                        zzC11 = zzep.zzC(zze);
                        zzC9 = zzC10 + zzC11 + zze;
                        i8 = i13 + zzC9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 39:
                    zze = zzgx.zzf((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzC10 = zzep.zzC(i9 << 3);
                        zzC11 = zzep.zzC(zze);
                        zzC9 = zzC10 + zzC11 + zze;
                        i8 = i13 + zzC9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 40:
                    zze = zzgx.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzC10 = zzep.zzC(i9 << 3);
                        zzC11 = zzep.zzC(zze);
                        zzC9 = zzC10 + zzC11 + zze;
                        i8 = i13 + zzC9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 41:
                    zze = zzgx.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzC10 = zzep.zzC(i9 << 3);
                        zzC11 = zzep.zzC(zze);
                        zzC9 = zzC10 + zzC11 + zze;
                        i8 = i13 + zzC9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j);
                    int i32 = zzgx.$r8$clinit;
                    zze = list12.size();
                    if (zze > 0) {
                        zzC10 = zzep.zzC(i9 << 3);
                        zzC11 = zzep.zzC(zze);
                        zzC9 = zzC10 + zzC11 + zze;
                        i8 = i13 + zzC9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 43:
                    zze = zzgx.zzk((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzC10 = zzep.zzC(i9 << 3);
                        zzC11 = zzep.zzC(zze);
                        zzC9 = zzC10 + zzC11 + zze;
                        i8 = i13 + zzC9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 44:
                    zze = zzgx.zza((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzC10 = zzep.zzC(i9 << 3);
                        zzC11 = zzep.zzC(zze);
                        zzC9 = zzC10 + zzC11 + zze;
                        i8 = i13 + zzC9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 45:
                    zze = zzgx.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzC10 = zzep.zzC(i9 << 3);
                        zzC11 = zzep.zzC(zze);
                        zzC9 = zzC10 + zzC11 + zze;
                        i8 = i13 + zzC9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 46:
                    zze = zzgx.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzC10 = zzep.zzC(i9 << 3);
                        zzC11 = zzep.zzC(zze);
                        zzC9 = zzC10 + zzC11 + zze;
                        i8 = i13 + zzC9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 47:
                    zze = zzgx.zzi((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzC10 = zzep.zzC(i9 << 3);
                        zzC11 = zzep.zzC(zze);
                        zzC9 = zzC10 + zzC11 + zze;
                        i8 = i13 + zzC9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 48:
                    zze = zzgx.zzj((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzC10 = zzep.zzC(i9 << 3);
                        zzC11 = zzep.zzC(zze);
                        zzC9 = zzC10 + zzC11 + zze;
                        i8 = i13 + zzC9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j);
                    zzgv zzv2 = zzgoVar.zzv(i5);
                    int i33 = zzgx.$r8$clinit;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                        for (int i34 = 0; i34 < size6; i34++) {
                            i3 += zzep.zzy(i9, (zzgl) list13.get(i34), zzv2);
                        }
                    }
                    i8 = i13 + i3;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 50:
                    zzgf zzgfVar = (zzgf) unsafe.getObject(obj2, j);
                    WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzgoVar.zzw(i5));
                    if (!zzgfVar.isEmpty()) {
                        Iterator it = zzgfVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 51:
                    if (zzgoVar.zzM(obj2, i9, i5)) {
                        zzC12 = zzep.zzC(i9 << 3);
                        zzh = zzC12 + 8;
                        i8 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 52:
                    if (zzgoVar.zzM(obj2, i9, i5)) {
                        zzC13 = zzep.zzC(i9 << 3);
                        zzh = zzC13 + 4;
                        i8 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 53:
                    if (zzgoVar.zzM(obj2, i9, i5)) {
                        long zzt = zzt(obj2, j);
                        zzl = zzep.zzC(i9 << 3);
                        i2 = zzep.zzD(zzt);
                        zzh = zzl + i2;
                        i8 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 54:
                    if (zzgoVar.zzM(obj2, i9, i5)) {
                        long zzt2 = zzt(obj2, j);
                        zzl = zzep.zzC(i9 << 3);
                        i2 = zzep.zzD(zzt2);
                        zzh = zzl + i2;
                        i8 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 55:
                    if (zzgoVar.zzM(obj2, i9, i5)) {
                        long zzo = zzo(obj2, j);
                        zzl = zzep.zzC(i9 << 3);
                        i2 = zzep.zzD(zzo);
                        zzh = zzl + i2;
                        i8 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 56:
                    if (zzgoVar.zzM(obj2, i9, i5)) {
                        zzC12 = zzep.zzC(i9 << 3);
                        zzh = zzC12 + 8;
                        i8 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 57:
                    if (zzgoVar.zzM(obj2, i9, i5)) {
                        zzC13 = zzep.zzC(i9 << 3);
                        zzh = zzC13 + 4;
                        i8 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 58:
                    if (zzgoVar.zzM(obj2, i9, i5)) {
                        zzh = zzep.zzC(i9 << 3) + 1;
                        i8 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 59:
                    if (zzgoVar.zzM(obj2, i9, i5)) {
                        int i35 = i9 << 3;
                        Object object2 = unsafe.getObject(obj2, j);
                        if (object2 instanceof zzei) {
                            zzC14 = zzep.zzC(i35);
                            zzd2 = ((zzei) object2).zzd();
                            zzC15 = zzep.zzC(zzd2);
                            zzh = zzC14 + zzC15 + zzd2;
                            i8 = i13 + zzh;
                            i5 += 3;
                            obj2 = obj;
                            i4 = 1048575;
                        } else {
                            zzl = zzep.zzC(i35);
                            i2 = zzep.zzB((String) object2);
                            zzh = zzl + i2;
                            i8 = i13 + zzh;
                            i5 += 3;
                            obj2 = obj;
                            i4 = 1048575;
                        }
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 60:
                    if (zzgoVar.zzM(obj2, i9, i5)) {
                        zzh = zzgx.zzh(i9, unsafe.getObject(obj2, j), zzgoVar.zzv(i5));
                        i8 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 61:
                    if (zzgoVar.zzM(obj2, i9, i5)) {
                        zzei zzeiVar2 = (zzei) unsafe.getObject(obj2, j);
                        zzC14 = zzep.zzC(i9 << 3);
                        zzd2 = zzeiVar2.zzd();
                        zzC15 = zzep.zzC(zzd2);
                        zzh = zzC14 + zzC15 + zzd2;
                        i8 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 62:
                    if (zzgoVar.zzM(obj2, i9, i5)) {
                        int zzo2 = zzo(obj2, j);
                        zzl = zzep.zzC(i9 << 3);
                        i2 = zzep.zzC(zzo2);
                        zzh = zzl + i2;
                        i8 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 63:
                    if (zzgoVar.zzM(obj2, i9, i5)) {
                        long zzo3 = zzo(obj2, j);
                        zzl = zzep.zzC(i9 << 3);
                        i2 = zzep.zzD(zzo3);
                        zzh = zzl + i2;
                        i8 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 64:
                    if (zzgoVar.zzM(obj2, i9, i5)) {
                        zzC13 = zzep.zzC(i9 << 3);
                        zzh = zzC13 + 4;
                        i8 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 65:
                    if (zzgoVar.zzM(obj2, i9, i5)) {
                        zzC12 = zzep.zzC(i9 << 3);
                        zzh = zzC12 + 8;
                        i8 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 66:
                    if (zzgoVar.zzM(obj2, i9, i5)) {
                        int zzo4 = zzo(obj2, j);
                        zzl = zzep.zzC(i9 << 3);
                        i2 = zzep.zzC((zzo4 >> 31) ^ (zzo4 + zzo4));
                        zzh = zzl + i2;
                        i8 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 67:
                    if (zzgoVar.zzM(obj2, i9, i5)) {
                        long zzt3 = zzt(obj2, j);
                        zzl = zzep.zzC(i9 << 3);
                        i2 = zzep.zzD((zzt3 >> 63) ^ (zzt3 + zzt3));
                        zzh = zzl + i2;
                        i8 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 68:
                    if (zzgoVar.zzM(obj2, i9, i5)) {
                        zzh = zzep.zzy(i9, (zzgl) unsafe.getObject(obj2, j), zzgoVar.zzv(i5));
                        i8 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                default:
                    i8 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
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
                int hashCode = (i5 * 53) + ((zzfi) obj).zzc.hashCode();
                if (!this.zzh) {
                    return hashCode;
                }
                WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                throw null;
            }
            int zzs = zzs(i4);
            int i6 = 1048575 & zzs;
            int zzr = zzr(zzs);
            int i7 = iArr[i4];
            long j = i6;
            int i8 = 37;
            switch (zzr) {
                case 0:
                    i = i5 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzho.zza(obj, j));
                    byte[] bArr = zzfo.zzb;
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i5 * 53;
                    floatToIntBits = Float.floatToIntBits(zzho.zzb(obj, j));
                    i5 = i2 + floatToIntBits;
                    break;
                case 2:
                    i = i5 * 53;
                    doubleToLongBits = zzho.zzd(obj, j);
                    byte[] bArr2 = zzfo.zzb;
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i5 * 53;
                    doubleToLongBits = zzho.zzd(obj, j);
                    byte[] bArr3 = zzfo.zzb;
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i5 * 53;
                    floatToIntBits = zzho.zzc(obj, j);
                    i5 = i2 + floatToIntBits;
                    break;
                case 5:
                    i = i5 * 53;
                    doubleToLongBits = zzho.zzd(obj, j);
                    byte[] bArr4 = zzfo.zzb;
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i5 * 53;
                    floatToIntBits = zzho.zzc(obj, j);
                    i5 = i2 + floatToIntBits;
                    break;
                case 7:
                    i2 = i5 * 53;
                    floatToIntBits = zzfo.zza(zzho.zzw(obj, j));
                    i5 = i2 + floatToIntBits;
                    break;
                case 8:
                    i2 = i5 * 53;
                    floatToIntBits = ((String) zzho.zzf(obj, j)).hashCode();
                    i5 = i2 + floatToIntBits;
                    break;
                case 9:
                    i3 = i5 * 53;
                    Object zzf = zzho.zzf(obj, j);
                    if (zzf != null) {
                        i8 = zzf.hashCode();
                    }
                    i5 = i3 + i8;
                    break;
                case 10:
                    i2 = i5 * 53;
                    floatToIntBits = zzho.zzf(obj, j).hashCode();
                    i5 = i2 + floatToIntBits;
                    break;
                case 11:
                    i2 = i5 * 53;
                    floatToIntBits = zzho.zzc(obj, j);
                    i5 = i2 + floatToIntBits;
                    break;
                case 12:
                    i2 = i5 * 53;
                    floatToIntBits = zzho.zzc(obj, j);
                    i5 = i2 + floatToIntBits;
                    break;
                case 13:
                    i2 = i5 * 53;
                    floatToIntBits = zzho.zzc(obj, j);
                    i5 = i2 + floatToIntBits;
                    break;
                case 14:
                    i = i5 * 53;
                    doubleToLongBits = zzho.zzd(obj, j);
                    byte[] bArr5 = zzfo.zzb;
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i5 * 53;
                    floatToIntBits = zzho.zzc(obj, j);
                    i5 = i2 + floatToIntBits;
                    break;
                case 16:
                    i = i5 * 53;
                    doubleToLongBits = zzho.zzd(obj, j);
                    byte[] bArr6 = zzfo.zzb;
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i3 = i5 * 53;
                    Object zzf2 = zzho.zzf(obj, j);
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
                    floatToIntBits = zzho.zzf(obj, j).hashCode();
                    i5 = i2 + floatToIntBits;
                    break;
                case 50:
                    i2 = i5 * 53;
                    floatToIntBits = zzho.zzf(obj, j).hashCode();
                    i5 = i2 + floatToIntBits;
                    break;
                case 51:
                    if (!zzM(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzfo.zzb;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!zzM(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j));
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 53:
                    if (!zzM(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr8 = zzfo.zzb;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!zzM(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr9 = zzfo.zzb;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 55:
                    if (!zzM(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzo(obj, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 56:
                    if (!zzM(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr10 = zzfo.zzb;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 57:
                    if (!zzM(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzo(obj, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 58:
                    if (!zzM(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzfo.zza(zzN(obj, j));
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 59:
                    if (!zzM(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = ((String) zzho.zzf(obj, j)).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 60:
                    if (!zzM(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzho.zzf(obj, j).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 61:
                    if (!zzM(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzho.zzf(obj, j).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 62:
                    if (!zzM(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzo(obj, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 63:
                    if (!zzM(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzo(obj, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 64:
                    if (!zzM(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzo(obj, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 65:
                    if (!zzM(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr11 = zzfo.zzb;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!zzM(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzo(obj, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 67:
                    if (!zzM(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr12 = zzfo.zzb;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
                    if (!zzM(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzho.zzf(obj, j).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    }
            }
            i4 += 3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0cd9, code lost:
    
        r1 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0d2c, code lost:
    
        if (r1 == 1048575) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0d2e, code lost:
    
        r13.putInt(r8, r1, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0d32, code lost:
    
        r1 = r0.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0d36, code lost:
    
        if (r1 >= r0.zzk) goto L616;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0d38, code lost:
    
        r2 = r0.zzi;
        r3 = r0.zzc;
        r2 = r2[r1];
        r3 = r3[r2];
        r3 = com.google.android.gms.internal.play_billing.zzho.zzf(r8, r0.zzs(r2) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0d4e, code lost:
    
        if (r3 != null) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0d5a, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0d57, code lost:
    
        if (r0.zzu(r2) != null) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0d5d, code lost:
    
        r3 = (com.google.android.gms.internal.play_billing.zzgf) r3;
        androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(r0.zzw(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0d66, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0d69, code lost:
    
        if (r14 != 0) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0d6b, code lost:
    
        if (r7 != r4) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0d73, code lost:
    
        throw new com.google.android.gms.internal.play_billing.zzfq("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0d78, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0d74, code lost:
    
        if (r7 > r4) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0d76, code lost:
    
        if (r10 != r14) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0d7e, code lost:
    
        throw new com.google.android.gms.internal.play_billing.zzfq("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0a19 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0cd4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0cba  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0ccb  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0ce3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0a02 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzdw zzdwVar) {
        int i4;
        Object obj2;
        int i5;
        Unsafe unsafe;
        int i6;
        int zzq;
        zzdw zzdwVar2;
        byte[] bArr2;
        int i7;
        int i8;
        int i9;
        int zzh;
        int i10;
        Unsafe unsafe2;
        Object obj3;
        byte[] bArr3;
        zzdw zzdwVar3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        zzdw zzdwVar4;
        Unsafe unsafe3;
        Object obj4;
        int i16;
        byte[] bArr4;
        int i17;
        int zza2;
        Unsafe unsafe4;
        int i18;
        int i19;
        int i20;
        Unsafe unsafe5;
        int zzi;
        int i21;
        int i22;
        byte[] bArr5;
        zzdw zzdwVar5;
        int i23;
        int i24;
        int i25;
        int i26;
        zzdw zzdwVar6;
        int i27;
        int zzi2;
        long j;
        Unsafe unsafe6;
        int i28;
        byte[] bArr6;
        zzdw zzdwVar7;
        int i29;
        byte[] bArr7;
        int i30;
        zzdw zzdwVar8;
        int zzi3;
        int i31;
        zzfn zzfnVar;
        int i32;
        int i33;
        int i34;
        zzdw zzdwVar9;
        Unsafe unsafe7;
        int zzi4;
        zzgo zzgoVar = this;
        Object obj5 = obj;
        byte[] bArr8 = bArr;
        int i35 = i2;
        zzdw zzdwVar10 = zzdwVar;
        zzA(obj5);
        Unsafe unsafe8 = zzb;
        int i36 = 0;
        int i37 = -1;
        int i38 = i;
        int i39 = -1;
        int i40 = 0;
        int i41 = 0;
        int i42 = 1048575;
        int i43 = 1;
        int i44 = 0;
        while (true) {
            if (i38 < i35) {
                int i45 = i38 + 1;
                int i46 = bArr8[i38];
                if (i46 < 0) {
                    i45 = zzdx.zzj(i46, bArr8, i45, zzdwVar10);
                    i46 = zzdwVar10.zza;
                }
                i44 = i46;
                int i47 = i44 >>> 3;
                if (i47 > i39) {
                    int i48 = i40 / 3;
                    if (i47 >= zzgoVar.zze && i47 <= zzgoVar.zzf) {
                        zzq = zzgoVar.zzq(i47, i48);
                        if (zzq != i37) {
                            i4 = i3;
                            obj2 = obj5;
                            zzdwVar2 = zzdwVar10;
                            i5 = i42;
                            i6 = i44;
                            i40 = 0;
                            unsafe = unsafe8;
                            bArr2 = bArr8;
                            i7 = i45;
                            i8 = i47;
                        } else {
                            int i49 = i44 & 7;
                            int[] iArr = zzgoVar.zzc;
                            int i50 = iArr[zzq + 1];
                            int zzr = zzr(i50);
                            long j2 = i50 & 1048575;
                            if (zzr <= 17) {
                                int i51 = iArr[zzq + 2];
                                int i52 = i43 << (i51 >>> 20);
                                int i53 = i51 & 1048575;
                                if (i53 != i42) {
                                    int i54 = 1048575;
                                    i10 = zzq;
                                    if (i42 != 1048575) {
                                        unsafe8.putInt(obj5, i42, i41);
                                        i54 = 1048575;
                                    }
                                    i42 = i53;
                                    i41 = i53 == i54 ? 0 : unsafe8.getInt(obj5, i53);
                                } else {
                                    i10 = zzq;
                                }
                                switch (zzr) {
                                    case 0:
                                        i13 = i41;
                                        i14 = i10;
                                        i15 = i44;
                                        bArr3 = bArr;
                                        zzdwVar3 = zzdwVar;
                                        unsafe4 = unsafe8;
                                        obj3 = obj5;
                                        i16 = i45;
                                        i8 = i47;
                                        i17 = i42;
                                        if (i49 != 1) {
                                            i4 = i3;
                                            unsafe = unsafe4;
                                            zzdwVar2 = zzdwVar3;
                                            i40 = i14;
                                            i41 = i13;
                                            i6 = i15;
                                            i5 = i17;
                                            obj2 = obj3;
                                            i7 = i16;
                                            bArr2 = bArr3;
                                            break;
                                        } else {
                                            i19 = i16 + 8;
                                            i20 = i13 | i52;
                                            zzho.zzo(obj3, j2, Double.longBitsToDouble(zzdx.zzo(bArr3, i16)));
                                            int i55 = i14;
                                            i41 = i20;
                                            i40 = i55;
                                            i35 = i2;
                                            obj5 = obj3;
                                            unsafe8 = unsafe4;
                                            bArr8 = bArr3;
                                            i44 = i15;
                                            i42 = i17;
                                            i36 = 0;
                                            i37 = -1;
                                            i43 = 1;
                                            i38 = i19;
                                            zzdwVar10 = zzdwVar3;
                                            i39 = i8;
                                        }
                                    case 1:
                                        i13 = i41;
                                        i14 = i10;
                                        i15 = i44;
                                        bArr3 = bArr;
                                        zzdwVar3 = zzdwVar;
                                        unsafe4 = unsafe8;
                                        obj3 = obj5;
                                        i16 = i45;
                                        i8 = i47;
                                        i17 = i42;
                                        if (i49 != 5) {
                                            i4 = i3;
                                            unsafe = unsafe4;
                                            zzdwVar2 = zzdwVar3;
                                            i40 = i14;
                                            i41 = i13;
                                            i6 = i15;
                                            i5 = i17;
                                            obj2 = obj3;
                                            i7 = i16;
                                            bArr2 = bArr3;
                                            break;
                                        } else {
                                            i19 = i16 + 4;
                                            i20 = i13 | i52;
                                            zzho.zzp(obj3, j2, Float.intBitsToFloat(zzdx.zzb(bArr3, i16)));
                                            int i552 = i14;
                                            i41 = i20;
                                            i40 = i552;
                                            i35 = i2;
                                            obj5 = obj3;
                                            unsafe8 = unsafe4;
                                            bArr8 = bArr3;
                                            i44 = i15;
                                            i42 = i17;
                                            i36 = 0;
                                            i37 = -1;
                                            i43 = 1;
                                            i38 = i19;
                                            zzdwVar10 = zzdwVar3;
                                            i39 = i8;
                                        }
                                    case 2:
                                    case 3:
                                        i13 = i41;
                                        i14 = i10;
                                        i15 = i44;
                                        bArr3 = bArr;
                                        zzdwVar3 = zzdwVar;
                                        unsafe5 = unsafe8;
                                        obj3 = obj5;
                                        i16 = i45;
                                        i8 = i47;
                                        i17 = i42;
                                        if (i49 == 0) {
                                            int zzl = zzdx.zzl(bArr3, i16, zzdwVar3);
                                            obj5 = obj3;
                                            unsafe8 = unsafe5;
                                            unsafe8.putLong(obj5, j2, zzdwVar3.zzb);
                                            i41 = i13 | i52;
                                            i40 = i14;
                                            i35 = i2;
                                            bArr8 = bArr3;
                                            zzdwVar10 = zzdwVar3;
                                            i39 = i8;
                                            i38 = zzl;
                                            i44 = i15;
                                            i42 = i17;
                                            i36 = 0;
                                            i37 = -1;
                                            i43 = 1;
                                        }
                                        unsafe4 = unsafe5;
                                        i4 = i3;
                                        unsafe = unsafe4;
                                        zzdwVar2 = zzdwVar3;
                                        i40 = i14;
                                        i41 = i13;
                                        i6 = i15;
                                        i5 = i17;
                                        obj2 = obj3;
                                        i7 = i16;
                                        bArr2 = bArr3;
                                        break;
                                    case 4:
                                    case 11:
                                        i13 = i41;
                                        i14 = i10;
                                        i15 = i44;
                                        bArr3 = bArr;
                                        zzdwVar3 = zzdwVar;
                                        unsafe5 = unsafe8;
                                        obj3 = obj5;
                                        i16 = i45;
                                        i8 = i47;
                                        i17 = i42;
                                        if (i49 != 0) {
                                            unsafe4 = unsafe5;
                                            i4 = i3;
                                            unsafe = unsafe4;
                                            zzdwVar2 = zzdwVar3;
                                            i40 = i14;
                                            i41 = i13;
                                            i6 = i15;
                                            i5 = i17;
                                            obj2 = obj3;
                                            i7 = i16;
                                            bArr2 = bArr3;
                                            break;
                                        } else {
                                            int i56 = i13 | i52;
                                            int zzi5 = zzdx.zzi(bArr3, i16, zzdwVar3);
                                            unsafe5.putInt(obj3, j2, zzdwVar3.zza);
                                            i35 = i2;
                                            bArr8 = bArr3;
                                            i40 = i14;
                                            i44 = i15;
                                            i42 = i17;
                                            i36 = 0;
                                            i37 = -1;
                                            i43 = 1;
                                            i38 = zzi5;
                                            i41 = i56;
                                            obj5 = obj3;
                                            unsafe8 = unsafe5;
                                            zzdwVar10 = zzdwVar3;
                                            i39 = i8;
                                        }
                                    case 5:
                                    case 14:
                                        i13 = i41;
                                        i14 = i10;
                                        i15 = i44;
                                        Unsafe unsafe9 = unsafe8;
                                        Object obj6 = obj5;
                                        i16 = i45;
                                        i8 = i47;
                                        i17 = i42;
                                        if (i49 != 1) {
                                            bArr3 = bArr;
                                            obj3 = obj6;
                                            unsafe5 = unsafe9;
                                            zzdwVar3 = zzdwVar;
                                            unsafe4 = unsafe5;
                                            i4 = i3;
                                            unsafe = unsafe4;
                                            zzdwVar2 = zzdwVar3;
                                            i40 = i14;
                                            i41 = i13;
                                            i6 = i15;
                                            i5 = i17;
                                            obj2 = obj3;
                                            i7 = i16;
                                            bArr2 = bArr3;
                                            break;
                                        } else {
                                            int i57 = i16 + 8;
                                            long zzo = zzdx.zzo(bArr, i16);
                                            obj5 = obj6;
                                            unsafe8 = unsafe9;
                                            unsafe8.putLong(obj5, j2, zzo);
                                            i35 = i2;
                                            bArr8 = bArr;
                                            zzdwVar10 = zzdwVar;
                                            i38 = i57;
                                            i40 = i14;
                                            i39 = i8;
                                            i41 = i13 | i52;
                                            i44 = i15;
                                            i42 = i17;
                                            i36 = 0;
                                            i37 = -1;
                                            i43 = 1;
                                        }
                                    case 6:
                                    case 13:
                                        i13 = i41;
                                        i14 = i10;
                                        i15 = i44;
                                        zzdwVar4 = zzdwVar;
                                        unsafe3 = unsafe8;
                                        obj4 = obj5;
                                        i16 = i45;
                                        i8 = i47;
                                        bArr4 = bArr;
                                        i17 = i42;
                                        if (i49 != 5) {
                                            Object obj7 = obj4;
                                            bArr3 = bArr4;
                                            obj3 = obj7;
                                            Unsafe unsafe10 = unsafe3;
                                            zzdwVar3 = zzdwVar4;
                                            unsafe4 = unsafe10;
                                            i4 = i3;
                                            unsafe = unsafe4;
                                            zzdwVar2 = zzdwVar3;
                                            i40 = i14;
                                            i41 = i13;
                                            i6 = i15;
                                            i5 = i17;
                                            obj2 = obj3;
                                            i7 = i16;
                                            bArr2 = bArr3;
                                            break;
                                        } else {
                                            int i58 = i16 + 4;
                                            int i59 = i13 | i52;
                                            unsafe3.putInt(obj4, j2, zzdx.zzb(bArr4, i16));
                                            zzdwVar10 = zzdwVar4;
                                            obj5 = obj4;
                                            i40 = i14;
                                            i44 = i15;
                                            i42 = i17;
                                            i36 = 0;
                                            i37 = -1;
                                            bArr8 = bArr4;
                                            i38 = i58;
                                            i41 = i59;
                                            unsafe8 = unsafe3;
                                            i39 = i8;
                                            i35 = i2;
                                        }
                                    case 7:
                                        i13 = i41;
                                        i14 = i10;
                                        i15 = i44;
                                        zzdwVar4 = zzdwVar;
                                        unsafe3 = unsafe8;
                                        obj4 = obj5;
                                        i16 = i45;
                                        i8 = i47;
                                        bArr4 = bArr;
                                        i17 = i42;
                                        if (i49 != 0) {
                                            Object obj72 = obj4;
                                            bArr3 = bArr4;
                                            obj3 = obj72;
                                            Unsafe unsafe102 = unsafe3;
                                            zzdwVar3 = zzdwVar4;
                                            unsafe4 = unsafe102;
                                            i4 = i3;
                                            unsafe = unsafe4;
                                            zzdwVar2 = zzdwVar3;
                                            i40 = i14;
                                            i41 = i13;
                                            i6 = i15;
                                            i5 = i17;
                                            obj2 = obj3;
                                            i7 = i16;
                                            bArr2 = bArr3;
                                            break;
                                        } else {
                                            int i60 = i13 | i52;
                                            int zzl2 = zzdx.zzl(bArr4, i16, zzdwVar4);
                                            zzho.zzm(obj4, j2, zzdwVar4.zzb != 0);
                                            i38 = zzl2;
                                            obj5 = obj4;
                                            zzdwVar10 = zzdwVar4;
                                            i40 = i14;
                                            i44 = i15;
                                            i42 = i17;
                                            i36 = 0;
                                            i37 = -1;
                                            bArr8 = bArr4;
                                            i41 = i60;
                                            unsafe8 = unsafe3;
                                            i39 = i8;
                                            i35 = i2;
                                        }
                                    case 8:
                                        i13 = i41;
                                        i14 = i10;
                                        i15 = i44;
                                        zzdwVar4 = zzdwVar;
                                        unsafe3 = unsafe8;
                                        obj4 = obj5;
                                        i16 = i45;
                                        i8 = i47;
                                        bArr4 = bArr;
                                        i17 = i42;
                                        if (i49 != 2) {
                                            Object obj722 = obj4;
                                            bArr3 = bArr4;
                                            obj3 = obj722;
                                            Unsafe unsafe1022 = unsafe3;
                                            zzdwVar3 = zzdwVar4;
                                            unsafe4 = unsafe1022;
                                            i4 = i3;
                                            unsafe = unsafe4;
                                            zzdwVar2 = zzdwVar3;
                                            i40 = i14;
                                            i41 = i13;
                                            i6 = i15;
                                            i5 = i17;
                                            obj2 = obj3;
                                            i7 = i16;
                                            bArr2 = bArr3;
                                            break;
                                        } else {
                                            if ((i50 & TLObject.FLAG_29) != 0) {
                                                zzi = zzdx.zzg(bArr4, i16, zzdwVar4);
                                                i21 = i13 | i52;
                                            } else {
                                                zzi = zzdx.zzi(bArr4, i16, zzdwVar4);
                                                int i61 = zzdwVar4.zza;
                                                if (i61 < 0) {
                                                    throw new zzfq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                i21 = i13 | i52;
                                                if (i61 == 0) {
                                                    zzdwVar4.zzc = "";
                                                } else {
                                                    zzdwVar4.zzc = new String(bArr4, zzi, i61, zzfo.zza);
                                                    zzi += i61;
                                                }
                                            }
                                            unsafe3.putObject(obj4, j2, zzdwVar4.zzc);
                                            i38 = zzi;
                                            obj5 = obj4;
                                            i35 = i2;
                                            i40 = i14;
                                            i44 = i15;
                                            i42 = i17;
                                            i36 = 0;
                                            i37 = -1;
                                            i41 = i21;
                                            zzdwVar10 = zzdwVar4;
                                            bArr8 = bArr4;
                                            unsafe8 = unsafe3;
                                            i39 = i8;
                                        }
                                    case 9:
                                        Object obj8 = obj5;
                                        Unsafe unsafe11 = unsafe8;
                                        int i62 = i45;
                                        i8 = i47;
                                        i13 = i41;
                                        i14 = i10;
                                        if (i49 != 2) {
                                            i15 = i44;
                                            i16 = i62;
                                            bArr3 = bArr;
                                            obj3 = obj8;
                                            zzdwVar3 = zzdwVar;
                                            unsafe4 = unsafe11;
                                            i17 = i42;
                                            i4 = i3;
                                            unsafe = unsafe4;
                                            zzdwVar2 = zzdwVar3;
                                            i40 = i14;
                                            i41 = i13;
                                            i6 = i15;
                                            i5 = i17;
                                            obj2 = obj3;
                                            i7 = i16;
                                            bArr2 = bArr3;
                                            break;
                                        } else {
                                            Object zzx = zzgoVar.zzx(obj8, i14);
                                            unsafe3 = unsafe11;
                                            zzdwVar10 = zzdwVar;
                                            int zzn = zzdx.zzn(zzx, zzgoVar.zzv(i14), bArr, i62, i2, zzdwVar10);
                                            bArr4 = bArr;
                                            zzgoVar.zzF(obj8, i14, zzx);
                                            i38 = zzn;
                                            obj5 = obj8;
                                            i41 = i13 | i52;
                                            i40 = i14;
                                            i35 = i2;
                                            i44 = i44;
                                            i36 = 0;
                                            i37 = -1;
                                            bArr8 = bArr4;
                                            unsafe8 = unsafe3;
                                            i39 = i8;
                                        }
                                    case 10:
                                        Object obj9 = obj5;
                                        unsafe2 = unsafe8;
                                        obj3 = obj9;
                                        bArr3 = bArr;
                                        zzdwVar3 = zzdwVar;
                                        i11 = i45;
                                        i12 = i44;
                                        i8 = i47;
                                        i13 = i41;
                                        i14 = i10;
                                        if (i49 != 2) {
                                            i15 = i12;
                                            i17 = i42;
                                            unsafe4 = unsafe2;
                                            i16 = i11;
                                            i4 = i3;
                                            unsafe = unsafe4;
                                            zzdwVar2 = zzdwVar3;
                                            i40 = i14;
                                            i41 = i13;
                                            i6 = i15;
                                            i5 = i17;
                                            obj2 = obj3;
                                            i7 = i16;
                                            bArr2 = bArr3;
                                            break;
                                        } else {
                                            zza2 = zzdx.zza(bArr3, i11, zzdwVar3);
                                            unsafe2.putObject(obj3, j2, zzdwVar3.zzc);
                                            obj5 = obj3;
                                            unsafe8 = unsafe2;
                                            i41 = i13 | i52;
                                            i40 = i14;
                                            i44 = i12;
                                            bArr8 = bArr3;
                                            zzdwVar10 = zzdwVar3;
                                            i39 = i8;
                                            i36 = 0;
                                            i37 = -1;
                                            i38 = zza2;
                                            i35 = i2;
                                        }
                                    case 12:
                                        Object obj10 = obj5;
                                        unsafe2 = unsafe8;
                                        obj3 = obj10;
                                        bArr3 = bArr;
                                        zzdwVar3 = zzdwVar;
                                        i11 = i45;
                                        i12 = i44;
                                        i8 = i47;
                                        i13 = i41;
                                        i14 = i10;
                                        if (i49 != 0) {
                                            i15 = i12;
                                            i17 = i42;
                                            unsafe4 = unsafe2;
                                            i16 = i11;
                                            i4 = i3;
                                            unsafe = unsafe4;
                                            zzdwVar2 = zzdwVar3;
                                            i40 = i14;
                                            i41 = i13;
                                            i6 = i15;
                                            i5 = i17;
                                            obj2 = obj3;
                                            i7 = i16;
                                            bArr2 = bArr3;
                                            break;
                                        } else {
                                            int zzi6 = zzdx.zzi(bArr3, i11, zzdwVar3);
                                            int i63 = zzdwVar3.zza;
                                            zzfl zzu = zzgoVar.zzu(i14);
                                            if ((i50 & TLObject.FLAG_31) == 0 || zzu == null || zzu.zza(i63)) {
                                                int i64 = i13 | i52;
                                                unsafe2.putInt(obj3, j2, i63);
                                                obj5 = obj3;
                                                unsafe8 = unsafe2;
                                                i44 = i12;
                                                bArr8 = bArr3;
                                                zzdwVar10 = zzdwVar3;
                                                i40 = i14;
                                                i39 = i8;
                                                i36 = 0;
                                                i37 = -1;
                                                i38 = zzi6;
                                                i41 = i64;
                                                i35 = i2;
                                            } else {
                                                zzd(obj3).zzj(i12, Long.valueOf(i63));
                                                obj5 = obj3;
                                                unsafe8 = unsafe2;
                                                i35 = i2;
                                                zzdwVar10 = zzdwVar3;
                                                i40 = i14;
                                                i39 = i8;
                                                i41 = i13;
                                                i36 = 0;
                                                i37 = -1;
                                                i44 = i12;
                                                bArr8 = bArr3;
                                                i38 = zzi6;
                                            }
                                        }
                                        break;
                                    case 15:
                                        Object obj11 = obj5;
                                        unsafe2 = unsafe8;
                                        obj3 = obj11;
                                        bArr3 = bArr;
                                        zzdwVar3 = zzdwVar;
                                        i11 = i45;
                                        i18 = i10;
                                        i8 = i47;
                                        if (i49 != 0) {
                                            i15 = i44;
                                            i13 = i41;
                                            i17 = i42;
                                            i14 = i18;
                                            unsafe4 = unsafe2;
                                            i16 = i11;
                                            i4 = i3;
                                            unsafe = unsafe4;
                                            zzdwVar2 = zzdwVar3;
                                            i40 = i14;
                                            i41 = i13;
                                            i6 = i15;
                                            i5 = i17;
                                            obj2 = obj3;
                                            i7 = i16;
                                            bArr2 = bArr3;
                                            break;
                                        } else {
                                            i41 |= i52;
                                            zza2 = zzdx.zzi(bArr3, i11, zzdwVar3);
                                            unsafe2.putInt(obj3, j2, zzel.zzb(zzdwVar3.zza));
                                            obj5 = obj3;
                                            unsafe8 = unsafe2;
                                            i44 = i44;
                                            bArr8 = bArr3;
                                            zzdwVar10 = zzdwVar3;
                                            i39 = i8;
                                            i40 = i18;
                                            i36 = 0;
                                            i37 = -1;
                                            i38 = zza2;
                                            i35 = i2;
                                        }
                                    case 16:
                                        bArr3 = bArr;
                                        zzdwVar3 = zzdwVar;
                                        int i65 = i45;
                                        int i66 = i10;
                                        i8 = i47;
                                        if (i49 != 0) {
                                            Object obj12 = obj5;
                                            Unsafe unsafe12 = unsafe8;
                                            obj3 = obj12;
                                            unsafe4 = unsafe12;
                                            i16 = i65;
                                            i17 = i42;
                                            i15 = i44;
                                            i13 = i41;
                                            i14 = i66;
                                            i4 = i3;
                                            unsafe = unsafe4;
                                            zzdwVar2 = zzdwVar3;
                                            i40 = i14;
                                            i41 = i13;
                                            i6 = i15;
                                            i5 = i17;
                                            obj2 = obj3;
                                            i7 = i16;
                                            bArr2 = bArr3;
                                            break;
                                        } else {
                                            i41 |= i52;
                                            int zzl3 = zzdx.zzl(bArr3, i65, zzdwVar3);
                                            unsafe8.putLong(obj5, j2, zzel.zzc(zzdwVar3.zzb));
                                            obj5 = obj5;
                                            unsafe8 = unsafe8;
                                            i35 = i2;
                                            bArr8 = bArr3;
                                            zzdwVar10 = zzdwVar3;
                                            i38 = zzl3;
                                            i39 = i8;
                                            i40 = i66;
                                            i36 = 0;
                                            i37 = -1;
                                        }
                                    default:
                                        if (i49 != 3) {
                                            int i67 = i45;
                                            i8 = i47;
                                            i13 = i41;
                                            i14 = i10;
                                            i15 = i44;
                                            bArr3 = bArr;
                                            zzdwVar3 = zzdwVar;
                                            unsafe4 = unsafe8;
                                            obj3 = obj5;
                                            i16 = i67;
                                            i17 = i42;
                                            i4 = i3;
                                            unsafe = unsafe4;
                                            zzdwVar2 = zzdwVar3;
                                            i40 = i14;
                                            i41 = i13;
                                            i6 = i15;
                                            i5 = i17;
                                            obj2 = obj3;
                                            i7 = i16;
                                            bArr2 = bArr3;
                                            break;
                                        } else {
                                            i41 |= i52;
                                            i18 = i10;
                                            Object zzx2 = zzgoVar.zzx(obj5, i18);
                                            int i68 = i45;
                                            i8 = i47;
                                            zza2 = zzdx.zzm(zzx2, zzgoVar.zzv(i18), bArr, i68, i2, (i47 << 3) | 4, zzdwVar);
                                            bArr3 = bArr;
                                            zzdwVar3 = zzdwVar;
                                            zzgoVar.zzF(obj5, i18, zzx2);
                                            bArr8 = bArr3;
                                            zzdwVar10 = zzdwVar3;
                                            i39 = i8;
                                            i40 = i18;
                                            i36 = 0;
                                            i37 = -1;
                                            i38 = zza2;
                                            i35 = i2;
                                        }
                                }
                            } else {
                                Unsafe unsafe13 = unsafe8;
                                Object obj13 = obj5;
                                int i69 = i45;
                                i8 = i47;
                                int i70 = i41;
                                int i71 = zzq;
                                if (zzr != 27) {
                                    obj2 = obj13;
                                    i5 = i42;
                                    if (zzr > 49) {
                                        i6 = i44;
                                        i22 = i69;
                                        bArr5 = bArr;
                                        zzdwVar5 = zzdwVar;
                                        if (zzr != 50) {
                                            unsafe = unsafe13;
                                            long j3 = iArr[i71 + 2] & 1048575;
                                            switch (zzr) {
                                                case 51:
                                                    zzdwVar2 = zzdwVar;
                                                    bArr2 = bArr5;
                                                    i23 = i71;
                                                    i24 = i22;
                                                    if (i49 == 1) {
                                                        i25 = i24 + 8;
                                                        unsafe.putObject(obj2, j2, Double.valueOf(Double.longBitsToDouble(zzdx.zzo(bArr2, i24))));
                                                        unsafe.putInt(obj2, j3, i8);
                                                        i38 = i25;
                                                        if (i38 != i24) {
                                                            i4 = i3;
                                                            i7 = i38;
                                                            i40 = i23;
                                                            i41 = i70;
                                                            break;
                                                        } else {
                                                            i35 = i2;
                                                            bArr8 = bArr2;
                                                            zzdwVar10 = zzdwVar2;
                                                            obj5 = obj2;
                                                            i44 = i6;
                                                            i39 = i8;
                                                            unsafe8 = unsafe;
                                                            i40 = i23;
                                                            i42 = i5;
                                                            i41 = i70;
                                                            i36 = 0;
                                                            i37 = -1;
                                                            i43 = 1;
                                                        }
                                                    }
                                                    i38 = i24;
                                                    if (i38 != i24) {
                                                    }
                                                case 52:
                                                    zzdwVar2 = zzdwVar;
                                                    bArr2 = bArr5;
                                                    i23 = i71;
                                                    i24 = i22;
                                                    if (i49 == 5) {
                                                        i25 = i24 + 4;
                                                        unsafe.putObject(obj2, j2, Float.valueOf(Float.intBitsToFloat(zzdx.zzb(bArr2, i24))));
                                                        unsafe.putInt(obj2, j3, i8);
                                                        i38 = i25;
                                                        if (i38 != i24) {
                                                        }
                                                    }
                                                    i38 = i24;
                                                    if (i38 != i24) {
                                                    }
                                                    break;
                                                case 53:
                                                case 54:
                                                    zzdwVar2 = zzdwVar;
                                                    bArr2 = bArr5;
                                                    i23 = i71;
                                                    i24 = i22;
                                                    if (i49 == 0) {
                                                        i25 = zzdx.zzl(bArr2, i24, zzdwVar2);
                                                        unsafe.putObject(obj2, j2, Long.valueOf(zzdwVar2.zzb));
                                                        unsafe.putInt(obj2, j3, i8);
                                                        i38 = i25;
                                                        if (i38 != i24) {
                                                        }
                                                    }
                                                    i38 = i24;
                                                    if (i38 != i24) {
                                                    }
                                                    break;
                                                case 55:
                                                case 62:
                                                    zzdwVar2 = zzdwVar;
                                                    bArr2 = bArr5;
                                                    i23 = i71;
                                                    i24 = i22;
                                                    if (i49 == 0) {
                                                        i25 = zzdx.zzi(bArr2, i24, zzdwVar2);
                                                        unsafe.putObject(obj2, j2, Integer.valueOf(zzdwVar2.zza));
                                                        unsafe.putInt(obj2, j3, i8);
                                                        i38 = i25;
                                                        if (i38 != i24) {
                                                        }
                                                    }
                                                    i38 = i24;
                                                    if (i38 != i24) {
                                                    }
                                                    break;
                                                case 56:
                                                case 65:
                                                    zzdwVar2 = zzdwVar;
                                                    bArr2 = bArr5;
                                                    i23 = i71;
                                                    i24 = i22;
                                                    if (i49 == 1) {
                                                        i25 = i24 + 8;
                                                        unsafe.putObject(obj2, j2, Long.valueOf(zzdx.zzo(bArr2, i24)));
                                                        unsafe.putInt(obj2, j3, i8);
                                                        i38 = i25;
                                                        if (i38 != i24) {
                                                        }
                                                    }
                                                    i38 = i24;
                                                    if (i38 != i24) {
                                                    }
                                                    break;
                                                case 57:
                                                case 64:
                                                    zzdwVar2 = zzdwVar;
                                                    bArr2 = bArr5;
                                                    i23 = i71;
                                                    i24 = i22;
                                                    if (i49 == 5) {
                                                        i25 = i24 + 4;
                                                        unsafe.putObject(obj2, j2, Integer.valueOf(zzdx.zzb(bArr2, i24)));
                                                        unsafe.putInt(obj2, j3, i8);
                                                        i38 = i25;
                                                        if (i38 != i24) {
                                                        }
                                                    }
                                                    i38 = i24;
                                                    if (i38 != i24) {
                                                    }
                                                    break;
                                                case 58:
                                                    zzdwVar2 = zzdwVar;
                                                    bArr2 = bArr5;
                                                    i23 = i71;
                                                    i24 = i22;
                                                    if (i49 == 0) {
                                                        i25 = zzdx.zzl(bArr2, i24, zzdwVar2);
                                                        unsafe.putObject(obj2, j2, Boolean.valueOf(zzdwVar2.zzb != 0));
                                                        unsafe.putInt(obj2, j3, i8);
                                                        i38 = i25;
                                                        if (i38 != i24) {
                                                        }
                                                    }
                                                    i38 = i24;
                                                    if (i38 != i24) {
                                                    }
                                                    break;
                                                case 59:
                                                    zzdwVar2 = zzdwVar;
                                                    bArr2 = bArr5;
                                                    i23 = i71;
                                                    i24 = i22;
                                                    if (i49 == 2) {
                                                        int zzi7 = zzdx.zzi(bArr2, i24, zzdwVar2);
                                                        int i72 = zzdwVar2.zza;
                                                        if (i72 == 0) {
                                                            unsafe.putObject(obj2, j2, "");
                                                        } else {
                                                            int i73 = zzi7 + i72;
                                                            if ((i50 & TLObject.FLAG_29) != 0 && !zzhr.zzd(bArr2, zzi7, i73)) {
                                                                throw new zzfq("Protocol message had invalid UTF-8.");
                                                            }
                                                            unsafe.putObject(obj2, j2, new String(bArr2, zzi7, i72, zzfo.zza));
                                                            zzi7 = i73;
                                                        }
                                                        unsafe.putInt(obj2, j3, i8);
                                                        i38 = zzi7;
                                                        if (i38 != i24) {
                                                        }
                                                    }
                                                    i38 = i24;
                                                    if (i38 != i24) {
                                                    }
                                                    break;
                                                case 60:
                                                    i26 = i22;
                                                    if (i49 == 2) {
                                                        Object zzy = zzgoVar.zzy(obj2, i8, i71);
                                                        int zzn2 = zzdx.zzn(zzy, zzgoVar.zzv(i71), bArr5, i26, i2, zzdwVar);
                                                        bArr2 = bArr5;
                                                        zzdwVar2 = zzdwVar;
                                                        zzgoVar.zzG(obj2, i8, i71, zzy);
                                                        i38 = zzn2;
                                                        i23 = i71;
                                                        i24 = i26;
                                                        if (i38 != i24) {
                                                        }
                                                    } else {
                                                        zzdwVar2 = zzdwVar;
                                                        bArr2 = bArr5;
                                                        i23 = i71;
                                                        i24 = i26;
                                                        i38 = i24;
                                                        if (i38 != i24) {
                                                        }
                                                    }
                                                    break;
                                                case 61:
                                                    zzdwVar6 = zzdwVar;
                                                    i26 = i22;
                                                    if (i49 == 2) {
                                                        int zza3 = zzdx.zza(bArr5, i26, zzdwVar6);
                                                        unsafe.putObject(obj2, j2, zzdwVar6.zzc);
                                                        unsafe.putInt(obj2, j3, i8);
                                                        bArr2 = bArr5;
                                                        i23 = i71;
                                                        i24 = i26;
                                                        i38 = zza3;
                                                        zzdwVar2 = zzdwVar6;
                                                        if (i38 != i24) {
                                                        }
                                                    }
                                                    zzdwVar2 = zzdwVar6;
                                                    bArr2 = bArr5;
                                                    i23 = i71;
                                                    i24 = i26;
                                                    i38 = i24;
                                                    if (i38 != i24) {
                                                    }
                                                    break;
                                                case 63:
                                                    zzdwVar6 = zzdwVar;
                                                    i26 = i22;
                                                    if (i49 == 0) {
                                                        int zzi8 = zzdx.zzi(bArr5, i26, zzdwVar6);
                                                        int i74 = zzdwVar6.zza;
                                                        zzfl zzu2 = zzgoVar.zzu(i71);
                                                        if (zzu2 == null || zzu2.zza(i74)) {
                                                            i6 = i6;
                                                            unsafe.putObject(obj2, j2, Integer.valueOf(i74));
                                                            unsafe.putInt(obj2, j3, i8);
                                                        } else {
                                                            i6 = i6;
                                                            zzd(obj2).zzj(i6, Long.valueOf(i74));
                                                        }
                                                        i38 = zzi8;
                                                        bArr2 = bArr5;
                                                        zzdwVar2 = zzdwVar6;
                                                        i23 = i71;
                                                        i24 = i26;
                                                        if (i38 != i24) {
                                                        }
                                                    } else {
                                                        i6 = i6;
                                                        zzdwVar2 = zzdwVar6;
                                                        bArr2 = bArr5;
                                                        i23 = i71;
                                                        i24 = i26;
                                                        i38 = i24;
                                                        if (i38 != i24) {
                                                        }
                                                    }
                                                    break;
                                                case 66:
                                                    zzdwVar6 = zzdwVar;
                                                    i26 = i22;
                                                    i27 = i6;
                                                    if (i49 == 0) {
                                                        zzi2 = zzdx.zzi(bArr5, i26, zzdwVar6);
                                                        unsafe.putObject(obj2, j2, Integer.valueOf(zzel.zzb(zzdwVar6.zza)));
                                                        unsafe.putInt(obj2, j3, i8);
                                                        i38 = zzi2;
                                                        bArr2 = bArr5;
                                                        zzdwVar2 = zzdwVar6;
                                                        i23 = i71;
                                                        i6 = i27;
                                                        i24 = i26;
                                                        if (i38 != i24) {
                                                        }
                                                    } else {
                                                        zzdwVar2 = zzdwVar6;
                                                        bArr2 = bArr5;
                                                        i23 = i71;
                                                        i6 = i27;
                                                        i24 = i26;
                                                        i38 = i24;
                                                        if (i38 != i24) {
                                                        }
                                                    }
                                                    break;
                                                case 67:
                                                    zzdwVar6 = zzdwVar;
                                                    i26 = i22;
                                                    if (i49 == 0) {
                                                        zzi2 = zzdx.zzl(bArr5, i26, zzdwVar6);
                                                        i27 = i6;
                                                        unsafe.putObject(obj2, j2, Long.valueOf(zzel.zzc(zzdwVar6.zzb)));
                                                        unsafe.putInt(obj2, j3, i8);
                                                        i38 = zzi2;
                                                        bArr2 = bArr5;
                                                        zzdwVar2 = zzdwVar6;
                                                        i23 = i71;
                                                        i6 = i27;
                                                        i24 = i26;
                                                        if (i38 != i24) {
                                                        }
                                                    }
                                                    zzdwVar2 = zzdwVar6;
                                                    bArr2 = bArr5;
                                                    i23 = i71;
                                                    i24 = i26;
                                                    i38 = i24;
                                                    if (i38 != i24) {
                                                    }
                                                    break;
                                                case 68:
                                                    if (i49 == 3) {
                                                        Object zzy2 = zzgoVar.zzy(obj2, i8, i71);
                                                        i26 = i22;
                                                        int zzm = zzdx.zzm(zzy2, zzgoVar.zzv(i71), bArr5, i26, i2, (i6 & (-8)) | 4, zzdwVar);
                                                        zzgoVar.zzG(obj2, i8, i71, zzy2);
                                                        zzdwVar2 = zzdwVar;
                                                        bArr2 = bArr5;
                                                        i23 = i71;
                                                        i38 = zzm;
                                                        i24 = i26;
                                                        if (i38 != i24) {
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    zzdwVar2 = zzdwVar;
                                                    bArr2 = bArr5;
                                                    i23 = i71;
                                                    i24 = i22;
                                                    i38 = i24;
                                                    if (i38 != i24) {
                                                    }
                                                    break;
                                            }
                                        } else {
                                            if (i49 == 2) {
                                                Object zzw = zzgoVar.zzw(i71);
                                                Object object = unsafe13.getObject(obj2, j2);
                                                if (!((zzgf) object).zze()) {
                                                    zzgf zzb2 = zzgf.zza().zzb();
                                                    zzgg.zza(zzb2, object);
                                                    unsafe13.putObject(obj2, j2, zzb2);
                                                }
                                                WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzw);
                                                throw null;
                                            }
                                            unsafe = unsafe13;
                                        }
                                    } else {
                                        long j4 = i50;
                                        zzfn zzfnVar2 = (zzfn) unsafe13.getObject(obj2, j2);
                                        if (zzfnVar2.zzc()) {
                                            j = j4;
                                        } else {
                                            int size = zzfnVar2.size();
                                            j = j4;
                                            zzfnVar2 = zzfnVar2.zzd(size + size);
                                            unsafe13.putObject(obj2, j2, zzfnVar2);
                                        }
                                        switch (zzr) {
                                            case 18:
                                            case 35:
                                                unsafe6 = unsafe13;
                                                i6 = i44;
                                                zzfn zzfnVar3 = zzfnVar2;
                                                i28 = i69;
                                                bArr6 = bArr;
                                                zzdwVar7 = zzdwVar;
                                                if (i49 != 2) {
                                                    if (i49 == 1) {
                                                        int i75 = zzdx.$r8$clinit;
                                                        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzfnVar3);
                                                        Double.longBitsToDouble(zzdx.zzo(bArr6, i28));
                                                        throw null;
                                                    }
                                                    i29 = i28;
                                                    if (i29 != i28) {
                                                        i4 = i3;
                                                        zzdwVar2 = zzdwVar7;
                                                        i7 = i29;
                                                        bArr2 = bArr6;
                                                        i40 = i71;
                                                        i41 = i70;
                                                        unsafe = unsafe6;
                                                        break;
                                                    } else {
                                                        i35 = i2;
                                                        zzdwVar10 = zzdwVar7;
                                                        bArr8 = bArr6;
                                                        i44 = i6;
                                                        i40 = i71;
                                                        i42 = i5;
                                                        i41 = i70;
                                                        unsafe8 = unsafe6;
                                                        i36 = 0;
                                                        i37 = -1;
                                                        i43 = 1;
                                                        i38 = i29;
                                                        obj5 = obj2;
                                                        i39 = i8;
                                                    }
                                                } else {
                                                    int i76 = zzdx.$r8$clinit;
                                                    WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzfnVar3);
                                                    if (zzdx.zzi(bArr6, i28, zzdwVar7) + zzdwVar7.zza > bArr6.length) {
                                                        throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    throw null;
                                                }
                                            case 19:
                                            case 36:
                                                unsafe6 = unsafe13;
                                                i6 = i44;
                                                zzfn zzfnVar4 = zzfnVar2;
                                                i28 = i69;
                                                bArr6 = bArr;
                                                zzdwVar7 = zzdwVar;
                                                if (i49 == 2) {
                                                    int i77 = zzdx.$r8$clinit;
                                                    WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzfnVar4);
                                                    if (zzdx.zzi(bArr6, i28, zzdwVar7) + zzdwVar7.zza > bArr6.length) {
                                                        throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    throw null;
                                                }
                                                if (i49 == 5) {
                                                    int i78 = zzdx.$r8$clinit;
                                                    WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzfnVar4);
                                                    Float.intBitsToFloat(zzdx.zzb(bArr6, i28));
                                                    throw null;
                                                }
                                                i29 = i28;
                                                if (i29 != i28) {
                                                }
                                                break;
                                            case 20:
                                            case 21:
                                            case 37:
                                            case 38:
                                                unsafe6 = unsafe13;
                                                i6 = i44;
                                                zzfn zzfnVar5 = zzfnVar2;
                                                i28 = i69;
                                                bArr6 = bArr;
                                                zzdwVar7 = zzdwVar;
                                                if (i49 == 2) {
                                                    int i79 = zzdx.$r8$clinit;
                                                    WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzfnVar5);
                                                    int zzi9 = zzdx.zzi(bArr6, i28, zzdwVar7);
                                                    int i80 = zzdwVar7.zza + zzi9;
                                                    if (zzi9 < i80) {
                                                        zzdx.zzl(bArr6, zzi9, zzdwVar7);
                                                        throw null;
                                                    }
                                                    if (zzi9 != i80) {
                                                        throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    i29 = zzi9;
                                                    if (i29 != i28) {
                                                    }
                                                } else {
                                                    if (i49 == 0) {
                                                        int i81 = zzdx.$r8$clinit;
                                                        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzfnVar5);
                                                        zzdx.zzl(bArr6, i28, zzdwVar7);
                                                        long j5 = zzdwVar7.zzb;
                                                        throw null;
                                                    }
                                                    i29 = i28;
                                                    if (i29 != i28) {
                                                    }
                                                }
                                                break;
                                            case 22:
                                            case 29:
                                            case 39:
                                            case 43:
                                                bArr7 = bArr;
                                                unsafe6 = unsafe13;
                                                i30 = i44;
                                                zzfn zzfnVar6 = zzfnVar2;
                                                i28 = i69;
                                                zzdwVar8 = zzdwVar;
                                                if (i49 == 2) {
                                                    i29 = zzdx.zzf(bArr7, i28, zzfnVar6, zzdwVar8);
                                                    i6 = i30;
                                                    zzdwVar7 = zzdwVar8;
                                                    bArr6 = bArr7;
                                                    if (i29 != i28) {
                                                    }
                                                } else {
                                                    if (i49 == 0) {
                                                        int zzk = zzdx.zzk(i30, bArr7, i28, i2, zzfnVar6, zzdwVar8);
                                                        i6 = i30;
                                                        bArr6 = bArr7;
                                                        zzdwVar7 = zzdwVar8;
                                                        i29 = zzk;
                                                        if (i29 != i28) {
                                                        }
                                                    }
                                                    i6 = i30;
                                                    zzdwVar7 = zzdwVar8;
                                                    bArr6 = bArr7;
                                                    i29 = i28;
                                                    if (i29 != i28) {
                                                    }
                                                }
                                                break;
                                            case 23:
                                            case 32:
                                            case 40:
                                            case 46:
                                                bArr7 = bArr;
                                                unsafe6 = unsafe13;
                                                i30 = i44;
                                                zzfn zzfnVar7 = zzfnVar2;
                                                i28 = i69;
                                                zzdwVar8 = zzdwVar;
                                                if (i49 == 2) {
                                                    int i82 = zzdx.$r8$clinit;
                                                    WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzfnVar7);
                                                    if (zzdx.zzi(bArr7, i28, zzdwVar8) + zzdwVar8.zza > bArr7.length) {
                                                        throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    throw null;
                                                }
                                                if (i49 == 1) {
                                                    int i83 = zzdx.$r8$clinit;
                                                    WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzfnVar7);
                                                    zzdx.zzo(bArr7, i28);
                                                    throw null;
                                                }
                                                i6 = i30;
                                                zzdwVar7 = zzdwVar8;
                                                bArr6 = bArr7;
                                                i29 = i28;
                                                if (i29 != i28) {
                                                }
                                                break;
                                            case 24:
                                            case 31:
                                            case 41:
                                            case 45:
                                                bArr7 = bArr;
                                                unsafe6 = unsafe13;
                                                i30 = i44;
                                                zzfn zzfnVar8 = zzfnVar2;
                                                i28 = i69;
                                                zzdwVar8 = zzdwVar;
                                                if (i49 == 2) {
                                                    int i84 = zzdx.$r8$clinit;
                                                    zzfj zzfjVar = (zzfj) zzfnVar8;
                                                    zzi3 = zzdx.zzi(bArr7, i28, zzdwVar8);
                                                    int i85 = zzdwVar8.zza;
                                                    int i86 = zzi3 + i85;
                                                    if (i86 > bArr7.length) {
                                                        throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    zzfjVar.zzh(zzfjVar.size() + (i85 / 4));
                                                    while (zzi3 < i86) {
                                                        zzfjVar.zzg(zzdx.zzb(bArr7, zzi3));
                                                        zzi3 += 4;
                                                    }
                                                    if (zzi3 != i86) {
                                                        throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    i6 = i30;
                                                    i29 = zzi3;
                                                    zzdwVar7 = zzdwVar8;
                                                    bArr6 = bArr7;
                                                    if (i29 != i28) {
                                                    }
                                                } else {
                                                    if (i49 == 5) {
                                                        i29 = i28 + 4;
                                                        int i87 = zzdx.$r8$clinit;
                                                        zzfj zzfjVar2 = (zzfj) zzfnVar8;
                                                        zzfjVar2.zzg(zzdx.zzb(bArr7, i28));
                                                        while (i29 < i2) {
                                                            int zzi10 = zzdx.zzi(bArr7, i29, zzdwVar8);
                                                            if (i30 == zzdwVar8.zza) {
                                                                zzfjVar2.zzg(zzdx.zzb(bArr7, zzi10));
                                                                i29 = zzi10 + 4;
                                                            } else {
                                                                i6 = i30;
                                                                zzdwVar7 = zzdwVar8;
                                                                bArr6 = bArr7;
                                                                if (i29 != i28) {
                                                                }
                                                            }
                                                        }
                                                        i6 = i30;
                                                        zzdwVar7 = zzdwVar8;
                                                        bArr6 = bArr7;
                                                        if (i29 != i28) {
                                                        }
                                                    }
                                                    i6 = i30;
                                                    zzdwVar7 = zzdwVar8;
                                                    bArr6 = bArr7;
                                                    i29 = i28;
                                                    if (i29 != i28) {
                                                    }
                                                }
                                                break;
                                            case 25:
                                            case 42:
                                                bArr7 = bArr;
                                                unsafe6 = unsafe13;
                                                i30 = i44;
                                                zzfn zzfnVar9 = zzfnVar2;
                                                i28 = i69;
                                                zzdwVar8 = zzdwVar;
                                                if (i49 == 2) {
                                                    int i88 = zzdx.$r8$clinit;
                                                    WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzfnVar9);
                                                    zzi3 = zzdx.zzi(bArr7, i28, zzdwVar8);
                                                    int i89 = zzdwVar8.zza + zzi3;
                                                    if (zzi3 < i89) {
                                                        zzdx.zzl(bArr7, zzi3, zzdwVar8);
                                                        throw null;
                                                    }
                                                    if (zzi3 != i89) {
                                                        throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    i6 = i30;
                                                    i29 = zzi3;
                                                    zzdwVar7 = zzdwVar8;
                                                    bArr6 = bArr7;
                                                    if (i29 != i28) {
                                                    }
                                                } else {
                                                    if (i49 == 0) {
                                                        int i90 = zzdx.$r8$clinit;
                                                        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzfnVar9);
                                                        zzdx.zzl(bArr7, i28, zzdwVar8);
                                                        long j6 = zzdwVar8.zzb;
                                                        throw null;
                                                    }
                                                    i6 = i30;
                                                    zzdwVar7 = zzdwVar8;
                                                    bArr6 = bArr7;
                                                    i29 = i28;
                                                    if (i29 != i28) {
                                                    }
                                                }
                                                break;
                                            case 26:
                                                bArr7 = bArr;
                                                unsafe6 = unsafe13;
                                                i30 = i44;
                                                zzfn zzfnVar10 = zzfnVar2;
                                                i28 = i69;
                                                zzdwVar8 = zzdwVar;
                                                if (i49 == 2) {
                                                    if ((j & 536870912) == 0) {
                                                        i29 = zzdx.zzi(bArr7, i28, zzdwVar8);
                                                        int i91 = zzdwVar8.zza;
                                                        if (i91 < 0) {
                                                            throw new zzfq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i91 == 0) {
                                                            zzfnVar10.add("");
                                                        } else {
                                                            zzfnVar10.add(new String(bArr7, i29, i91, zzfo.zza));
                                                            i29 += i91;
                                                        }
                                                        while (i29 < i2) {
                                                            int zzi11 = zzdx.zzi(bArr7, i29, zzdwVar8);
                                                            if (i30 == zzdwVar8.zza) {
                                                                i29 = zzdx.zzi(bArr7, zzi11, zzdwVar8);
                                                                int i92 = zzdwVar8.zza;
                                                                if (i92 < 0) {
                                                                    throw new zzfq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                }
                                                                if (i92 == 0) {
                                                                    zzfnVar10.add("");
                                                                } else {
                                                                    zzfnVar10.add(new String(bArr7, i29, i92, zzfo.zza));
                                                                    i29 += i92;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        i29 = zzdx.zzi(bArr7, i28, zzdwVar8);
                                                        int i93 = zzdwVar8.zza;
                                                        if (i93 < 0) {
                                                            throw new zzfq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i93 == 0) {
                                                            zzfnVar10.add("");
                                                        } else {
                                                            int i94 = i29 + i93;
                                                            if (!zzhr.zzd(bArr7, i29, i94)) {
                                                                throw new zzfq("Protocol message had invalid UTF-8.");
                                                            }
                                                            zzfnVar10.add(new String(bArr7, i29, i93, zzfo.zza));
                                                            i29 = i94;
                                                        }
                                                        while (i29 < i2) {
                                                            int zzi12 = zzdx.zzi(bArr7, i29, zzdwVar8);
                                                            if (i30 == zzdwVar8.zza) {
                                                                i29 = zzdx.zzi(bArr7, zzi12, zzdwVar8);
                                                                int i95 = zzdwVar8.zza;
                                                                if (i95 < 0) {
                                                                    throw new zzfq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                }
                                                                if (i95 == 0) {
                                                                    zzfnVar10.add("");
                                                                } else {
                                                                    int i96 = i29 + i95;
                                                                    if (!zzhr.zzd(bArr7, i29, i96)) {
                                                                        throw new zzfq("Protocol message had invalid UTF-8.");
                                                                    }
                                                                    zzfnVar10.add(new String(bArr7, i29, i95, zzfo.zza));
                                                                    i29 = i96;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    i6 = i30;
                                                    zzdwVar7 = zzdwVar8;
                                                    bArr6 = bArr7;
                                                    if (i29 != i28) {
                                                    }
                                                }
                                                i6 = i30;
                                                zzdwVar7 = zzdwVar8;
                                                bArr6 = bArr7;
                                                i29 = i28;
                                                if (i29 != i28) {
                                                }
                                                break;
                                            case 27:
                                                bArr7 = bArr;
                                                unsafe6 = unsafe13;
                                                i30 = i44;
                                                zzfn zzfnVar11 = zzfnVar2;
                                                i28 = i69;
                                                zzdwVar8 = zzdwVar;
                                                if (i49 == 2) {
                                                    zzgoVar = this;
                                                    i71 = i71;
                                                    i29 = zzdx.zze(zzgoVar.zzv(i71), i30, bArr7, i28, i2, zzfnVar11, zzdwVar8);
                                                    i30 = i30;
                                                    i6 = i30;
                                                    zzdwVar7 = zzdwVar8;
                                                    bArr6 = bArr7;
                                                    if (i29 != i28) {
                                                    }
                                                } else {
                                                    zzgoVar = this;
                                                    i71 = i71;
                                                    i6 = i30;
                                                    zzdwVar7 = zzdwVar8;
                                                    bArr6 = bArr7;
                                                    i29 = i28;
                                                    if (i29 != i28) {
                                                    }
                                                }
                                                break;
                                            case 28:
                                                bArr7 = bArr;
                                                unsafe6 = unsafe13;
                                                zzfn zzfnVar12 = zzfnVar2;
                                                i28 = i69;
                                                if (i49 == 2) {
                                                    int zzi13 = zzdx.zzi(bArr7, i28, zzdwVar);
                                                    int i97 = zzdwVar.zza;
                                                    if (i97 < 0) {
                                                        throw new zzfq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i97 > bArr7.length - zzi13) {
                                                        throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i97 == 0) {
                                                        zzfnVar12.add(zzei.zzb);
                                                    } else {
                                                        zzfnVar12.add(zzei.zzj(bArr7, zzi13, i97));
                                                        zzi13 += i97;
                                                    }
                                                    while (zzi13 < i2) {
                                                        int zzi14 = zzdx.zzi(bArr7, zzi13, zzdwVar);
                                                        if (i44 == zzdwVar.zza) {
                                                            zzi13 = zzdx.zzi(bArr7, zzi14, zzdwVar);
                                                            int i98 = zzdwVar.zza;
                                                            if (i98 < 0) {
                                                                throw new zzfq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i98 > bArr7.length - zzi13) {
                                                                throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            }
                                                            if (i98 == 0) {
                                                                zzfnVar12.add(zzei.zzb);
                                                            } else {
                                                                zzfnVar12.add(zzei.zzj(bArr7, zzi13, i98));
                                                                zzi13 += i98;
                                                            }
                                                        } else {
                                                            i29 = zzi13;
                                                            i6 = i44;
                                                            zzdwVar7 = zzdwVar;
                                                            i71 = i71;
                                                            zzgoVar = this;
                                                            bArr6 = bArr7;
                                                            if (i29 != i28) {
                                                            }
                                                        }
                                                    }
                                                    i29 = zzi13;
                                                    i6 = i44;
                                                    zzdwVar7 = zzdwVar;
                                                    i71 = i71;
                                                    zzgoVar = this;
                                                    bArr6 = bArr7;
                                                    if (i29 != i28) {
                                                    }
                                                } else {
                                                    zzgoVar = this;
                                                    i6 = i44;
                                                    zzdwVar7 = zzdwVar;
                                                    i71 = i71;
                                                    bArr6 = bArr7;
                                                    i29 = i28;
                                                    if (i29 != i28) {
                                                    }
                                                }
                                                break;
                                            case 30:
                                            case 44:
                                                bArr7 = bArr;
                                                i28 = i69;
                                                if (i49 == 2) {
                                                    i32 = zzdx.zzf(bArr7, i28, zzfnVar2, zzdwVar);
                                                    i31 = i44;
                                                    zzfnVar = zzfnVar2;
                                                } else if (i49 == 0) {
                                                    i31 = i44;
                                                    zzfnVar = zzfnVar2;
                                                    int zzk2 = zzdx.zzk(i31, bArr7, i28, i2, zzfnVar, zzdwVar);
                                                    bArr7 = bArr7;
                                                    i32 = zzk2;
                                                } else {
                                                    unsafe6 = unsafe13;
                                                    zzgoVar = this;
                                                    i6 = i44;
                                                    bArr6 = bArr7;
                                                    zzdwVar7 = zzdwVar;
                                                    i29 = i28;
                                                    if (i29 != i28) {
                                                    }
                                                }
                                                zzfl zzu3 = zzgoVar.zzu(i71);
                                                zzhh zzhhVar = zzgoVar.zzl;
                                                int i99 = zzgx.$r8$clinit;
                                                if (zzu3 == null) {
                                                    i33 = i32;
                                                    i34 = i71;
                                                    unsafe6 = unsafe13;
                                                } else if (OnBackPressedDispatcher$$ExternalSyntheticNonNull0.m(zzfnVar)) {
                                                    int size2 = zzfnVar.size();
                                                    i33 = i32;
                                                    unsafe6 = unsafe13;
                                                    Object obj14 = null;
                                                    int i100 = 0;
                                                    int i101 = 0;
                                                    while (i100 < size2) {
                                                        Integer num = (Integer) zzfnVar.get(i100);
                                                        int i102 = i71;
                                                        int intValue = num.intValue();
                                                        if (zzu3.zza(intValue)) {
                                                            if (i100 != i101) {
                                                                zzfnVar.set(i101, num);
                                                            }
                                                            i101++;
                                                        } else {
                                                            obj14 = zzgx.zzn(obj2, i8, intValue, obj14, zzhhVar);
                                                        }
                                                        i100++;
                                                        i71 = i102;
                                                    }
                                                    i34 = i71;
                                                    if (i101 != size2) {
                                                        zzfnVar.subList(i101, size2).clear();
                                                    }
                                                } else {
                                                    i33 = i32;
                                                    i34 = i71;
                                                    unsafe6 = unsafe13;
                                                    Iterator it = zzfnVar.iterator();
                                                    Object obj15 = null;
                                                    while (it.hasNext()) {
                                                        int intValue2 = ((Integer) it.next()).intValue();
                                                        if (!zzu3.zza(intValue2)) {
                                                            obj15 = zzgx.zzn(obj2, i8, intValue2, obj15, zzhhVar);
                                                            it.remove();
                                                        }
                                                    }
                                                }
                                                zzgoVar = this;
                                                i29 = i33;
                                                i6 = i31;
                                                zzdwVar7 = zzdwVar;
                                                i71 = i34;
                                                bArr6 = bArr7;
                                                if (i29 != i28) {
                                                }
                                                break;
                                            case 33:
                                            case 47:
                                                bArr7 = bArr;
                                                zzdwVar9 = zzdwVar;
                                                unsafe7 = unsafe13;
                                                i28 = i69;
                                                if (i49 == 2) {
                                                    int i103 = zzdx.$r8$clinit;
                                                    zzfj zzfjVar3 = (zzfj) zzfnVar2;
                                                    zzi4 = zzdx.zzi(bArr7, i28, zzdwVar9);
                                                    int i104 = zzdwVar9.zza + zzi4;
                                                    while (zzi4 < i104) {
                                                        zzi4 = zzdx.zzi(bArr7, zzi4, zzdwVar9);
                                                        zzfjVar3.zzg(zzel.zzb(zzdwVar9.zza));
                                                    }
                                                    if (zzi4 != i104) {
                                                        throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                } else {
                                                    if (i49 == 0) {
                                                        int i105 = zzdx.$r8$clinit;
                                                        zzfj zzfjVar4 = (zzfj) zzfnVar2;
                                                        zzi4 = zzdx.zzi(bArr7, i28, zzdwVar9);
                                                        zzfjVar4.zzg(zzel.zzb(zzdwVar9.zza));
                                                        while (zzi4 < i2) {
                                                            int zzi15 = zzdx.zzi(bArr7, zzi4, zzdwVar9);
                                                            if (i44 == zzdwVar9.zza) {
                                                                zzi4 = zzdx.zzi(bArr7, zzi15, zzdwVar9);
                                                                zzfjVar4.zzg(zzel.zzb(zzdwVar9.zza));
                                                            }
                                                        }
                                                    }
                                                    zzdwVar7 = zzdwVar9;
                                                    i6 = i44;
                                                    unsafe6 = unsafe7;
                                                    bArr6 = bArr7;
                                                    i29 = i28;
                                                    if (i29 != i28) {
                                                    }
                                                }
                                                i29 = zzi4;
                                                zzdwVar7 = zzdwVar9;
                                                i6 = i44;
                                                unsafe6 = unsafe7;
                                                bArr6 = bArr7;
                                                if (i29 != i28) {
                                                }
                                                break;
                                            case 34:
                                            case 48:
                                                bArr7 = bArr;
                                                zzdwVar9 = zzdwVar;
                                                unsafe7 = unsafe13;
                                                i28 = i69;
                                                if (i49 == 2) {
                                                    int i106 = zzdx.$r8$clinit;
                                                    WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzfnVar2);
                                                    zzi4 = zzdx.zzi(bArr7, i28, zzdwVar9);
                                                    int i107 = zzdwVar9.zza + zzi4;
                                                    if (zzi4 < i107) {
                                                        zzdx.zzl(bArr7, zzi4, zzdwVar9);
                                                        zzel.zzc(zzdwVar9.zzb);
                                                        throw null;
                                                    }
                                                    if (zzi4 != i107) {
                                                        throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    i29 = zzi4;
                                                    zzdwVar7 = zzdwVar9;
                                                    i6 = i44;
                                                    unsafe6 = unsafe7;
                                                    bArr6 = bArr7;
                                                    if (i29 != i28) {
                                                    }
                                                } else {
                                                    if (i49 == 0) {
                                                        int i108 = zzdx.$r8$clinit;
                                                        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzfnVar2);
                                                        zzdx.zzl(bArr7, i28, zzdwVar9);
                                                        zzel.zzc(zzdwVar9.zzb);
                                                        throw null;
                                                    }
                                                    zzdwVar7 = zzdwVar9;
                                                    i6 = i44;
                                                    unsafe6 = unsafe7;
                                                    bArr6 = bArr7;
                                                    i29 = i28;
                                                    if (i29 != i28) {
                                                    }
                                                }
                                                break;
                                            default:
                                                if (i49 == 3) {
                                                    int i109 = (i44 & (-8)) | 4;
                                                    zzgv zzv = zzgoVar.zzv(i71);
                                                    unsafe7 = unsafe13;
                                                    byte[] bArr9 = bArr;
                                                    int zzc = zzdx.zzc(zzv, bArr9, i69, i2, i109, zzdwVar);
                                                    i28 = i69;
                                                    zzfnVar2.add(zzdwVar.zzc);
                                                    while (zzc < i2) {
                                                        int zzi16 = zzdx.zzi(bArr9, zzc, zzdwVar);
                                                        zzgv zzgvVar = zzv;
                                                        if (i44 == zzdwVar.zza) {
                                                            zzv = zzgvVar;
                                                            zzc = zzdx.zzc(zzv, bArr9, zzi16, i2, i109, zzdwVar);
                                                            zzfnVar2.add(zzdwVar.zzc);
                                                            bArr9 = bArr9;
                                                        } else {
                                                            bArr7 = bArr9;
                                                            zzdwVar7 = zzdwVar;
                                                            i6 = i44;
                                                            i29 = zzc;
                                                            unsafe6 = unsafe7;
                                                            bArr6 = bArr7;
                                                            if (i29 != i28) {
                                                            }
                                                        }
                                                    }
                                                    bArr7 = bArr9;
                                                    zzdwVar7 = zzdwVar;
                                                    i6 = i44;
                                                    i29 = zzc;
                                                    unsafe6 = unsafe7;
                                                    bArr6 = bArr7;
                                                    if (i29 != i28) {
                                                    }
                                                } else {
                                                    unsafe6 = unsafe13;
                                                    i6 = i44;
                                                    i28 = i69;
                                                    bArr6 = bArr;
                                                    zzdwVar7 = zzdwVar;
                                                    i29 = i28;
                                                    if (i29 != i28) {
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                } else if (i49 == 2) {
                                    zzfn zzfnVar13 = (zzfn) unsafe13.getObject(obj13, j2);
                                    if (!zzfnVar13.zzc()) {
                                        int size3 = zzfnVar13.size();
                                        zzfnVar13 = zzfnVar13.zzd(size3 == 0 ? 10 : size3 + size3);
                                        unsafe13.putObject(obj13, j2, zzfnVar13);
                                    }
                                    int zze = zzdx.zze(zzgoVar.zzv(i71), i44, bArr, i69, i2, zzfnVar13, zzdwVar);
                                    bArr8 = bArr;
                                    i35 = i2;
                                    zzdwVar10 = zzdwVar;
                                    i44 = i44;
                                    obj5 = obj;
                                    i39 = i8;
                                    i36 = 0;
                                    i37 = -1;
                                    i43 = 1;
                                    i38 = zze;
                                    unsafe8 = unsafe13;
                                    i40 = i71;
                                    i41 = i70;
                                } else {
                                    obj2 = obj13;
                                    bArr5 = bArr;
                                    zzdwVar5 = zzdwVar;
                                    i22 = i69;
                                    i6 = i44;
                                    i5 = i42;
                                    unsafe = unsafe13;
                                }
                                zzdwVar2 = zzdwVar5;
                                bArr2 = bArr5;
                                i40 = i71;
                                i7 = i22;
                                i41 = i70;
                                i4 = i3;
                            }
                        }
                        if (i6 == i4 || i4 == 0) {
                            if (zzgoVar.zzh) {
                                zzeu zzeuVar = zzdwVar2.zzd;
                                zzeu zzeuVar2 = zzeu.zza;
                                int i110 = zzgs.$r8$clinit;
                                if (zzeuVar != zzeu.zza) {
                                    zzgl zzglVar = zzgoVar.zzg;
                                    int i111 = zzdx.$r8$clinit;
                                    zzeuVar.zzb(zzglVar, i8);
                                    i35 = i2;
                                    byte[] bArr10 = bArr2;
                                    i9 = i6;
                                    zzh = zzdx.zzh(i9, bArr10, i7, i35, zzd(obj2), zzdwVar);
                                    i38 = zzh;
                                    bArr8 = bArr;
                                    zzdwVar10 = zzdwVar;
                                    i44 = i9;
                                    obj5 = obj2;
                                    i39 = i8;
                                    unsafe8 = unsafe;
                                    i42 = i5;
                                    i36 = 0;
                                    i37 = -1;
                                    i43 = 1;
                                }
                            }
                            i9 = i6;
                            i35 = i2;
                            zzh = zzdx.zzh(i9, bArr, i7, i35, zzd(obj2), zzdwVar);
                            i38 = zzh;
                            bArr8 = bArr;
                            zzdwVar10 = zzdwVar;
                            i44 = i9;
                            obj5 = obj2;
                            i39 = i8;
                            unsafe8 = unsafe;
                            i42 = i5;
                            i36 = 0;
                            i37 = -1;
                            i43 = 1;
                        } else {
                            i35 = i2;
                            i38 = i7;
                        }
                    }
                    zzq = -1;
                    if (zzq != i37) {
                    }
                    if (i6 == i4) {
                    }
                    if (zzgoVar.zzh) {
                    }
                    i9 = i6;
                    i35 = i2;
                    zzh = zzdx.zzh(i9, bArr, i7, i35, zzd(obj2), zzdwVar);
                    i38 = zzh;
                    bArr8 = bArr;
                    zzdwVar10 = zzdwVar;
                    i44 = i9;
                    obj5 = obj2;
                    i39 = i8;
                    unsafe8 = unsafe;
                    i42 = i5;
                    i36 = 0;
                    i37 = -1;
                    i43 = 1;
                } else {
                    if (i47 >= zzgoVar.zze && i47 <= zzgoVar.zzf) {
                        zzq = zzgoVar.zzq(i47, i36);
                        if (zzq != i37) {
                        }
                        if (i6 == i4) {
                        }
                        if (zzgoVar.zzh) {
                        }
                        i9 = i6;
                        i35 = i2;
                        zzh = zzdx.zzh(i9, bArr, i7, i35, zzd(obj2), zzdwVar);
                        i38 = zzh;
                        bArr8 = bArr;
                        zzdwVar10 = zzdwVar;
                        i44 = i9;
                        obj5 = obj2;
                        i39 = i8;
                        unsafe8 = unsafe;
                        i42 = i5;
                        i36 = 0;
                        i37 = -1;
                        i43 = 1;
                    }
                    zzq = -1;
                    if (zzq != i37) {
                    }
                    if (i6 == i4) {
                    }
                    if (zzgoVar.zzh) {
                    }
                    i9 = i6;
                    i35 = i2;
                    zzh = zzdx.zzh(i9, bArr, i7, i35, zzd(obj2), zzdwVar);
                    i38 = zzh;
                    bArr8 = bArr;
                    zzdwVar10 = zzdwVar;
                    i44 = i9;
                    obj5 = obj2;
                    i39 = i8;
                    unsafe8 = unsafe;
                    i42 = i5;
                    i36 = 0;
                    i37 = -1;
                    i43 = 1;
                }
            } else {
                i4 = i3;
                obj2 = obj5;
                i5 = i42;
                unsafe = unsafe8;
                i6 = i44;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final Object zze() {
        return ((zzfi) this.zzg).zzo();
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzfi) {
                zzfi zzfiVar = (zzfi) obj;
                zzfiVar.zzx(ConnectionsManager.DEFAULT_DATACENTER_ID);
                zzfiVar.zza = 0;
                zzfiVar.zzv();
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
                                ((zzfn) zzho.zzf(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzgf) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzM(obj, iArr[i], i)) {
                        zzv(i).zzf(zzb.getObject(obj, j));
                    }
                }
                if (zzI(obj, i)) {
                    zzv(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzl.zzb(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                zzgx.zzp(this.zzl, obj, obj2);
                if (this.zzh) {
                    zzgx.zzo(this.zzm, obj, obj2);
                    return;
                }
                return;
            }
            int zzs = zzs(i);
            int i2 = 1048575 & zzs;
            int zzr = zzr(zzs);
            int i3 = iArr[i];
            long j = i2;
            switch (zzr) {
                case 0:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzo(obj, j, zzho.zza(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 1:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzp(obj, j, zzho.zzb(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 2:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzr(obj, j, zzho.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 3:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzr(obj, j, zzho.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 4:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzq(obj, j, zzho.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 5:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzr(obj, j, zzho.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 6:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzq(obj, j, zzho.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 7:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzm(obj, j, zzho.zzw(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 8:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzs(obj, j, zzho.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzs(obj, j, zzho.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 11:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzq(obj, j, zzho.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 12:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzq(obj, j, zzho.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 13:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzq(obj, j, zzho.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 14:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzr(obj, j, zzho.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 15:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzq(obj, j, zzho.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 16:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzr(obj, j, zzho.zzd(obj2, j));
                        zzD(obj, i);
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
                    zzfn zzfnVar = (zzfn) zzho.zzf(obj, j);
                    zzfn zzfnVar2 = (zzfn) zzho.zzf(obj2, j);
                    int size = zzfnVar.size();
                    int size2 = zzfnVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzfnVar.zzc()) {
                            zzfnVar = zzfnVar.zzd(size2 + size);
                        }
                        zzfnVar.addAll(zzfnVar2);
                    }
                    if (size > 0) {
                        zzfnVar2 = zzfnVar;
                    }
                    zzho.zzs(obj, j, zzfnVar2);
                    break;
                case 50:
                    int i4 = zzgx.$r8$clinit;
                    zzho.zzs(obj, j, zzgg.zza(zzho.zzf(obj, j), zzho.zzf(obj2, j)));
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
                    if (!zzM(obj2, i3, i)) {
                        break;
                    } else {
                        zzho.zzs(obj, j, zzho.zzf(obj2, j));
                        zzE(obj, i3, i);
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
                    if (!zzM(obj2, i3, i)) {
                        break;
                    } else {
                        zzho.zzs(obj, j, zzho.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzdw zzdwVar) {
        zzc(obj, bArr, i, i2, 0, zzdwVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzi(Object obj, zzhu zzhuVar) {
        Throwable th;
        int i;
        zzgo zzgoVar = this;
        if (zzgoVar.zzh) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
            throw null;
        }
        int[] iArr = zzgoVar.zzc;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 1048575;
        int i5 = 0;
        while (i3 < iArr.length) {
            int zzs = zzgoVar.zzs(i3);
            int zzr = zzr(zzs);
            int i6 = iArr[i3];
            if (zzr <= 17) {
                int i7 = iArr[i3 + 2];
                th = null;
                int i8 = i7 & i2;
                if (i8 != i4) {
                    i5 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i4 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                th = null;
                i = 0;
            }
            long j = zzs & i2;
            switch (zzr) {
                case 0:
                    if (zzgoVar.zzJ(obj, i3, i4, i5, i)) {
                        zzhuVar.zzf(i6, zzho.zza(obj, j));
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 1:
                    if (zzgoVar.zzJ(obj, i3, i4, i5, i)) {
                        zzhuVar.zzo(i6, zzho.zzb(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 2:
                    if (zzgoVar.zzJ(obj, i3, i4, i5, i)) {
                        zzhuVar.zzt(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 3:
                    if (zzgoVar.zzJ(obj, i3, i4, i5, i)) {
                        zzhuVar.zzK(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 4:
                    if (zzgoVar.zzJ(obj, i3, i4, i5, i)) {
                        zzhuVar.zzr(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 5:
                    if (zzgoVar.zzJ(obj, i3, i4, i5, i)) {
                        zzhuVar.zzm(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 6:
                    if (zzgoVar.zzJ(obj, i3, i4, i5, i)) {
                        zzhuVar.zzk(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 7:
                    if (zzgoVar.zzJ(obj, i3, i4, i5, i)) {
                        zzhuVar.zzb(i6, zzho.zzw(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 8:
                    if (zzgoVar.zzJ(obj, i3, i4, i5, i)) {
                        zzO(i6, unsafe.getObject(obj, j), zzhuVar);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 9:
                    if (zzgoVar.zzJ(obj, i3, i4, i5, i)) {
                        zzhuVar.zzv(i6, unsafe.getObject(obj, j), zzgoVar.zzv(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 10:
                    if (zzgoVar.zzJ(obj, i3, i4, i5, i)) {
                        zzhuVar.zzd(i6, (zzei) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 11:
                    if (zzgoVar.zzJ(obj, i3, i4, i5, i)) {
                        zzhuVar.zzI(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 12:
                    if (zzgoVar.zzJ(obj, i3, i4, i5, i)) {
                        zzhuVar.zzi(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 13:
                    if (zzgoVar.zzJ(obj, i3, i4, i5, i)) {
                        zzhuVar.zzx(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 14:
                    if (zzgoVar.zzJ(obj, i3, i4, i5, i)) {
                        zzhuVar.zzz(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 15:
                    if (zzgoVar.zzJ(obj, i3, i4, i5, i)) {
                        zzhuVar.zzB(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 16:
                    if (zzgoVar.zzJ(obj, i3, i4, i5, i)) {
                        zzhuVar.zzD(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 17:
                    if (zzgoVar.zzJ(obj, i3, i4, i5, i)) {
                        zzhuVar.zzq(i6, unsafe.getObject(obj, j), zzgoVar.zzv(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 18:
                    zzgx.zzr(iArr[i3], (List) unsafe.getObject(obj, j), zzhuVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 19:
                    zzgx.zzv(iArr[i3], (List) unsafe.getObject(obj, j), zzhuVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 20:
                    zzgx.zzx(iArr[i3], (List) unsafe.getObject(obj, j), zzhuVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 21:
                    zzgx.zzD(iArr[i3], (List) unsafe.getObject(obj, j), zzhuVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 22:
                    zzgx.zzw(iArr[i3], (List) unsafe.getObject(obj, j), zzhuVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 23:
                    zzgx.zzu(iArr[i3], (List) unsafe.getObject(obj, j), zzhuVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 24:
                    zzgx.zzt(iArr[i3], (List) unsafe.getObject(obj, j), zzhuVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 25:
                    zzgx.zzq(iArr[i3], (List) unsafe.getObject(obj, j), zzhuVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 26:
                    int i9 = iArr[i3];
                    List list = (List) unsafe.getObject(obj, j);
                    int i10 = zzgx.$r8$clinit;
                    if (list != null && !list.isEmpty()) {
                        zzhuVar.zzH(i9, list);
                        break;
                    }
                    break;
                case 27:
                    int i11 = iArr[i3];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zzgv zzv = zzgoVar.zzv(i3);
                    int i12 = zzgx.$r8$clinit;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i13 = 0; i13 < list2.size(); i13++) {
                            ((zzeq) zzhuVar).zzv(i11, list2.get(i13), zzv);
                        }
                        break;
                    }
                    break;
                case 28:
                    int i14 = iArr[i3];
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i15 = zzgx.$r8$clinit;
                    if (list3 != null && !list3.isEmpty()) {
                        zzhuVar.zze(i14, list3);
                        break;
                    }
                    break;
                case 29:
                    zzgx.zzC(iArr[i3], (List) unsafe.getObject(obj, j), zzhuVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 30:
                    zzgx.zzs(iArr[i3], (List) unsafe.getObject(obj, j), zzhuVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 31:
                    zzgx.zzy(iArr[i3], (List) unsafe.getObject(obj, j), zzhuVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 32:
                    zzgx.zzz(iArr[i3], (List) unsafe.getObject(obj, j), zzhuVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 33:
                    zzgx.zzA(iArr[i3], (List) unsafe.getObject(obj, j), zzhuVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 34:
                    zzgx.zzB(iArr[i3], (List) unsafe.getObject(obj, j), zzhuVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    zzgoVar = this;
                case 35:
                    zzgx.zzr(iArr[i3], (List) unsafe.getObject(obj, j), zzhuVar, true);
                    break;
                case 36:
                    zzgx.zzv(iArr[i3], (List) unsafe.getObject(obj, j), zzhuVar, true);
                    break;
                case 37:
                    zzgx.zzx(iArr[i3], (List) unsafe.getObject(obj, j), zzhuVar, true);
                    break;
                case 38:
                    zzgx.zzD(iArr[i3], (List) unsafe.getObject(obj, j), zzhuVar, true);
                    break;
                case 39:
                    zzgx.zzw(iArr[i3], (List) unsafe.getObject(obj, j), zzhuVar, true);
                    break;
                case 40:
                    zzgx.zzu(iArr[i3], (List) unsafe.getObject(obj, j), zzhuVar, true);
                    break;
                case 41:
                    zzgx.zzt(iArr[i3], (List) unsafe.getObject(obj, j), zzhuVar, true);
                    break;
                case 42:
                    zzgx.zzq(iArr[i3], (List) unsafe.getObject(obj, j), zzhuVar, true);
                    break;
                case 43:
                    zzgx.zzC(iArr[i3], (List) unsafe.getObject(obj, j), zzhuVar, true);
                    break;
                case 44:
                    zzgx.zzs(iArr[i3], (List) unsafe.getObject(obj, j), zzhuVar, true);
                    break;
                case 45:
                    zzgx.zzy(iArr[i3], (List) unsafe.getObject(obj, j), zzhuVar, true);
                    break;
                case 46:
                    zzgx.zzz(iArr[i3], (List) unsafe.getObject(obj, j), zzhuVar, true);
                    break;
                case 47:
                    zzgx.zzA(iArr[i3], (List) unsafe.getObject(obj, j), zzhuVar, true);
                    break;
                case 48:
                    zzgx.zzB(iArr[i3], (List) unsafe.getObject(obj, j), zzhuVar, true);
                    break;
                case 49:
                    int i16 = iArr[i3];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zzgv zzv2 = zzgoVar.zzv(i3);
                    int i17 = zzgx.$r8$clinit;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i18 = 0; i18 < list4.size(); i18++) {
                            ((zzeq) zzhuVar).zzq(i16, list4.get(i18), zzv2);
                        }
                        break;
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzgoVar.zzw(i3));
                        throw th;
                    }
                    break;
                case 51:
                    if (zzgoVar.zzM(obj, i6, i3)) {
                        zzhuVar.zzf(i6, zzm(obj, j));
                        break;
                    }
                    break;
                case 52:
                    if (zzgoVar.zzM(obj, i6, i3)) {
                        zzhuVar.zzo(i6, zzn(obj, j));
                        break;
                    }
                    break;
                case 53:
                    if (zzgoVar.zzM(obj, i6, i3)) {
                        zzhuVar.zzt(i6, zzt(obj, j));
                        break;
                    }
                    break;
                case 54:
                    if (zzgoVar.zzM(obj, i6, i3)) {
                        zzhuVar.zzK(i6, zzt(obj, j));
                        break;
                    }
                    break;
                case 55:
                    if (zzgoVar.zzM(obj, i6, i3)) {
                        zzhuVar.zzr(i6, zzo(obj, j));
                        break;
                    }
                    break;
                case 56:
                    if (zzgoVar.zzM(obj, i6, i3)) {
                        zzhuVar.zzm(i6, zzt(obj, j));
                        break;
                    }
                    break;
                case 57:
                    if (zzgoVar.zzM(obj, i6, i3)) {
                        zzhuVar.zzk(i6, zzo(obj, j));
                        break;
                    }
                    break;
                case 58:
                    if (zzgoVar.zzM(obj, i6, i3)) {
                        zzhuVar.zzb(i6, zzN(obj, j));
                        break;
                    }
                    break;
                case 59:
                    if (zzgoVar.zzM(obj, i6, i3)) {
                        zzO(i6, unsafe.getObject(obj, j), zzhuVar);
                        break;
                    }
                    break;
                case 60:
                    if (zzgoVar.zzM(obj, i6, i3)) {
                        zzhuVar.zzv(i6, unsafe.getObject(obj, j), zzgoVar.zzv(i3));
                        break;
                    }
                    break;
                case 61:
                    if (zzgoVar.zzM(obj, i6, i3)) {
                        zzhuVar.zzd(i6, (zzei) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    if (zzgoVar.zzM(obj, i6, i3)) {
                        zzhuVar.zzI(i6, zzo(obj, j));
                        break;
                    }
                    break;
                case 63:
                    if (zzgoVar.zzM(obj, i6, i3)) {
                        zzhuVar.zzi(i6, zzo(obj, j));
                        break;
                    }
                    break;
                case 64:
                    if (zzgoVar.zzM(obj, i6, i3)) {
                        zzhuVar.zzx(i6, zzo(obj, j));
                        break;
                    }
                    break;
                case 65:
                    if (zzgoVar.zzM(obj, i6, i3)) {
                        zzhuVar.zzz(i6, zzt(obj, j));
                        break;
                    }
                    break;
                case 66:
                    if (zzgoVar.zzM(obj, i6, i3)) {
                        zzhuVar.zzB(i6, zzo(obj, j));
                        break;
                    }
                    break;
                case 67:
                    if (zzgoVar.zzM(obj, i6, i3)) {
                        zzhuVar.zzD(i6, zzt(obj, j));
                        break;
                    }
                    break;
                case 68:
                    if (zzgoVar.zzM(obj, i6, i3)) {
                        zzhuVar.zzq(i6, unsafe.getObject(obj, j), zzgoVar.zzv(i3));
                        break;
                    }
                    break;
            }
            i3 += 3;
            i2 = 1048575;
            zzgoVar = this;
        }
        ((zzfi) obj).zzc.zzl(zzhuVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzE;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzs = zzs(i);
            long j = zzs & 1048575;
            switch (zzr(zzs)) {
                case 0:
                    if (zzH(obj, obj2, i) && Double.doubleToLongBits(zzho.zza(obj, j)) == Double.doubleToLongBits(zzho.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzH(obj, obj2, i) && Float.floatToIntBits(zzho.zzb(obj, j)) == Float.floatToIntBits(zzho.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzH(obj, obj2, i) && zzho.zzd(obj, j) == zzho.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzH(obj, obj2, i) && zzho.zzd(obj, j) == zzho.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzH(obj, obj2, i) && zzho.zzc(obj, j) == zzho.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzH(obj, obj2, i) && zzho.zzd(obj, j) == zzho.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzH(obj, obj2, i) && zzho.zzc(obj, j) == zzho.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzH(obj, obj2, i) && zzho.zzw(obj, j) == zzho.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzH(obj, obj2, i) && zzgx.zzE(zzho.zzf(obj, j), zzho.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzH(obj, obj2, i) && zzgx.zzE(zzho.zzf(obj, j), zzho.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzH(obj, obj2, i) && zzgx.zzE(zzho.zzf(obj, j), zzho.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzH(obj, obj2, i) && zzho.zzc(obj, j) == zzho.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzH(obj, obj2, i) && zzho.zzc(obj, j) == zzho.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzH(obj, obj2, i) && zzho.zzc(obj, j) == zzho.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzH(obj, obj2, i) && zzho.zzd(obj, j) == zzho.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzH(obj, obj2, i) && zzho.zzc(obj, j) == zzho.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzH(obj, obj2, i) && zzho.zzd(obj, j) == zzho.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzH(obj, obj2, i) && zzgx.zzE(zzho.zzf(obj, j), zzho.zzf(obj2, j))) {
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
                    zzE = zzgx.zzE(zzho.zzf(obj, j), zzho.zzf(obj2, j));
                    break;
                case 50:
                    zzE = zzgx.zzE(zzho.zzf(obj, j), zzho.zzf(obj2, j));
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
                    if (zzho.zzc(obj, zzp) == zzho.zzc(obj2, zzp) && zzgx.zzE(zzho.zzf(obj, j), zzho.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzE) {
                return false;
            }
        }
        if (!((zzfi) obj).zzc.equals(((zzfi) obj2).zzc)) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
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
            int i9 = iArr2[i7 + 2];
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
                        if (zzr == 50 && !((zzgf) zzho.zzf(obj, zzs & 1048575)).isEmpty()) {
                            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzw(i2));
                            throw null;
                        }
                    }
                }
                List list = (List) zzho.zzf(obj, zzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgv zzv = zzv(i2);
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
