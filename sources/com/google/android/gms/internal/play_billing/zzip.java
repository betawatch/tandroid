package com.google.android.gms.internal.play_billing;

import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
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

    /* JADX WARN: Removed duplicated region for block: B:103:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzip zzl(Class cls, zzij zzijVar, zzir zzirVar, zzhz zzhzVar, zzjj zzjjVar, zzgx zzgxVar, zzih zzihVar) {
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
        zziw zziwVar;
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
        Field zzz;
        int i26;
        char charAt11;
        int i27;
        int i28;
        int i29;
        int i30;
        Object obj;
        Field zzz2;
        Object obj2;
        Field zzz3;
        int i31;
        char charAt12;
        int i32;
        char charAt13;
        int i33;
        char charAt14;
        int i34;
        char charAt15;
        if (!(zzijVar instanceof zziw)) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzijVar);
            throw null;
        }
        zziw zziwVar2 = (zziw) zzijVar;
        String zzd = zziwVar2.zzd();
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
        Object[] zze = zziwVar2.zze();
        Class<?> cls3 = zziwVar2.zza().getClass();
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
            int i78 = charAt25 & NotificationCenter.needCheckSystemBarColors;
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
                        if (zziwVar2.zzc() == 1 || i80 != 0) {
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
                        zzz2 = zzz(cls3, (String) obj);
                        zze[i90] = zzz2;
                    } else {
                        zzz2 = (Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzz2);
                    int i91 = i90 + 1;
                    obj2 = zze[i91];
                    int i92 = i80;
                    if (obj2 instanceof Field) {
                        zzz3 = zzz(cls3, (String) obj2);
                        zze[i91] = zzz3;
                    } else {
                        zzz3 = (Field) obj2;
                    }
                    i22 = (int) unsafe.objectFieldOffset(zzz3);
                    objectFieldOffset = objectFieldOffset2;
                    i24 = i92;
                    zziwVar = zziwVar2;
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
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzz2);
                int i912 = i902 + 1;
                obj2 = zze[i912];
                int i922 = i80;
                if (obj2 instanceof Field) {
                }
                i22 = (int) unsafe.objectFieldOffset(zzz3);
                objectFieldOffset = objectFieldOffset22;
                i24 = i922;
                zziwVar = zziwVar2;
                cls2 = cls3;
                i23 = i87;
                i18 = charAt24;
                str = zzd;
                i21 = 0;
            } else {
                i17 = i2;
                int i93 = i4 + 1;
                Field zzz4 = zzz(cls3, (String) zze[i4]);
                i18 = charAt24;
                if (i78 == 9 || i78 == 17) {
                    zziwVar = zziwVar2;
                    int i94 = i69 / 3;
                    objArr[i94 + i94 + 1] = zzz4.getType();
                } else {
                    if (i78 == 27) {
                        zziwVar = zziwVar2;
                        i27 = 1;
                        i28 = i4 + 2;
                    } else if (i78 == 49) {
                        i28 = i4 + 2;
                        zziwVar = zziwVar2;
                        i27 = 1;
                    } else {
                        if (i78 == 12 || i78 == 30 || i78 == 44) {
                            zziwVar = zziwVar2;
                            if (zziwVar2.zzc() == 1 || i80 != 0) {
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
                                zziwVar = zziwVar2;
                            } else {
                                i93 = i96;
                                i66 = i97;
                                i80 = 0;
                                zziwVar = zziwVar2;
                            }
                        } else {
                            zziwVar = zziwVar2;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
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
                                zzz = (Field) obj3;
                            } else {
                                zzz = zzz(cls3, (String) obj3);
                                zze[i103] = zzz;
                            }
                            cls2 = cls3;
                            i21 = charAt27 % 32;
                            i20 = i25;
                            i22 = (int) unsafe.objectFieldOffset(zzz);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
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
            zziwVar2 = zziwVar;
            i2 = i17;
            c = CharacterCompat.MIN_HIGH_SURROGATE;
            i36 = i23;
            cls3 = cls4;
        }
        return new zzip(iArr3, objArr, i2, i5, zziwVar2.zza(), false, iArr, i3, i64, zzirVar, zzhzVar, zzjjVar, zzgxVar, zzihVar);
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
        return (i >>> 20) & NotificationCenter.needCheckSystemBarColors;
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.play_billing.zzix
    public final int zza(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        int zzz;
        int zzz2;
        int zzz3;
        int zzA;
        int i5;
        int i6;
        int zzz4;
        int zzz5;
        int zzz6;
        int zzd;
        int zzg;
        int size;
        int zzl;
        int zzz7;
        int zzz8;
        int zzz9;
        int size2;
        int zzk;
        int zzz10;
        int i7;
        int zze;
        int zzz11;
        int zzz12;
        int zzz13;
        int zzz14;
        int zzz15;
        int zzd2;
        int zzz16;
        Unsafe unsafe = zzb;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < this.zzc.length) {
            int zzs = zzs(i11);
            int zzr = zzr(zzs);
            int[] iArr = this.zzc;
            int i13 = iArr[i11];
            int i14 = iArr[i11 + 2];
            int i15 = i14 & i8;
            if (zzr <= 17) {
                if (i15 != i9) {
                    i10 = i15 == i8 ? 0 : unsafe.getInt(obj, i15);
                    i9 = i15;
                }
                i3 = 1 << (i14 >>> 20);
                i = i9;
                i2 = i10;
            } else {
                i = i9;
                i2 = i10;
                i3 = 0;
            }
            int i16 = zzs & i8;
            if (zzr >= zzhc.zzJ.zza()) {
                zzhc.zzW.zza();
            }
            long j = i16;
            switch (zzr) {
                case 0:
                    i4 = i11;
                    if (zzJ(obj, i4, i, i2, i3)) {
                        zzz = zzgr.zzz(i13 << 3);
                        i5 = zzz + 8;
                        i12 += i5;
                        i11 = i4 + 3;
                        i9 = i;
                        i10 = i2;
                        i8 = 1048575;
                    } else {
                        i11 = i4 + 3;
                        i9 = i;
                        i10 = i2;
                        i8 = 1048575;
                    }
                case 1:
                    i4 = i11;
                    if (zzJ(obj, i4, i, i2, i3)) {
                        zzz2 = zzgr.zzz(i13 << 3);
                        i5 = zzz2 + 4;
                        i12 += i5;
                        i11 = i4 + 3;
                        i9 = i;
                        i10 = i2;
                        i8 = 1048575;
                    } else {
                        i11 = i4 + 3;
                        i9 = i;
                        i10 = i2;
                        i8 = 1048575;
                    }
                case 2:
                    i4 = i11;
                    if (zzJ(obj, i4, i, i2, i3)) {
                        long j2 = unsafe.getLong(obj, j);
                        zzz3 = zzgr.zzz(i13 << 3);
                        zzA = zzgr.zzA(j2);
                        i5 = zzz3 + zzA;
                        i12 += i5;
                        i11 = i4 + 3;
                        i9 = i;
                        i10 = i2;
                        i8 = 1048575;
                    } else {
                        i11 = i4 + 3;
                        i9 = i;
                        i10 = i2;
                        i8 = 1048575;
                    }
                case 3:
                    i4 = i11;
                    if (zzJ(obj, i4, i, i2, i3)) {
                        long j3 = unsafe.getLong(obj, j);
                        zzz3 = zzgr.zzz(i13 << 3);
                        zzA = zzgr.zzA(j3);
                        i5 = zzz3 + zzA;
                        i12 += i5;
                        i11 = i4 + 3;
                        i9 = i;
                        i10 = i2;
                        i8 = 1048575;
                    } else {
                        i11 = i4 + 3;
                        i9 = i;
                        i10 = i2;
                        i8 = 1048575;
                    }
                case 4:
                    i4 = i11;
                    if (zzJ(obj, i4, i, i2, i3)) {
                        long j4 = unsafe.getInt(obj, j);
                        zzz3 = zzgr.zzz(i13 << 3);
                        zzA = zzgr.zzA(j4);
                        i5 = zzz3 + zzA;
                        i12 += i5;
                        i11 = i4 + 3;
                        i9 = i;
                        i10 = i2;
                        i8 = 1048575;
                    } else {
                        i11 = i4 + 3;
                        i9 = i;
                        i10 = i2;
                        i8 = 1048575;
                    }
                case 5:
                    i4 = i11;
                    if (zzJ(obj, i4, i, i2, i3)) {
                        zzz = zzgr.zzz(i13 << 3);
                        i5 = zzz + 8;
                        i12 += i5;
                        i11 = i4 + 3;
                        i9 = i;
                        i10 = i2;
                        i8 = 1048575;
                    } else {
                        i11 = i4 + 3;
                        i9 = i;
                        i10 = i2;
                        i8 = 1048575;
                    }
                case 6:
                    i4 = i11;
                    if (zzJ(obj, i4, i, i2, i3)) {
                        zzz2 = zzgr.zzz(i13 << 3);
                        i5 = zzz2 + 4;
                        i12 += i5;
                        i11 = i4 + 3;
                        i9 = i;
                        i10 = i2;
                        i8 = 1048575;
                    } else {
                        i11 = i4 + 3;
                        i9 = i;
                        i10 = i2;
                        i8 = 1048575;
                    }
                case 7:
                    i4 = i11;
                    if (zzJ(obj, i4, i, i2, i3)) {
                        i5 = zzgr.zzz(i13 << 3) + 1;
                        i12 += i5;
                        i11 = i4 + 3;
                        i9 = i;
                        i10 = i2;
                        i8 = 1048575;
                    } else {
                        i11 = i4 + 3;
                        i9 = i;
                        i10 = i2;
                        i8 = 1048575;
                    }
                case 8:
                    int i17 = i11;
                    i4 = i17;
                    if (zzJ(obj, i17, i, i2, i3)) {
                        int i18 = i13 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzgk) {
                            int zzz17 = zzgr.zzz(i18);
                            int zzd3 = ((zzgk) object).zzd();
                            i5 = zzz17 + zzgr.zzz(zzd3) + zzd3;
                            i12 += i5;
                            i11 = i4 + 3;
                            i9 = i;
                            i10 = i2;
                            i8 = 1048575;
                        } else {
                            zzz3 = zzgr.zzz(i18);
                            zzA = zzgr.zzy((String) object);
                            i5 = zzz3 + zzA;
                            i12 += i5;
                            i11 = i4 + 3;
                            i9 = i;
                            i10 = i2;
                            i8 = 1048575;
                        }
                    } else {
                        i11 = i4 + 3;
                        i9 = i;
                        i10 = i2;
                        i8 = 1048575;
                    }
                case 9:
                    i6 = i11;
                    if (zzJ(obj, i6, i, i2, i3)) {
                        i12 += zziz.zzh(i13, unsafe.getObject(obj, j), zzv(i6));
                        i4 = i6;
                        i11 = i4 + 3;
                        i9 = i;
                        i10 = i2;
                        i8 = 1048575;
                    }
                    i4 = i6;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 10:
                    i6 = i11;
                    if (zzJ(obj, i6, i, i2, i3)) {
                        zzgk zzgkVar = (zzgk) unsafe.getObject(obj, j);
                        int zzz18 = zzgr.zzz(i13 << 3);
                        int zzd4 = zzgkVar.zzd();
                        zzz4 = zzz18 + zzgr.zzz(zzd4) + zzd4;
                        i12 += zzz4;
                    }
                    i4 = i6;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 11:
                    i6 = i11;
                    if (zzJ(obj, i6, i, i2, i3)) {
                        int i19 = unsafe.getInt(obj, j);
                        zzz5 = zzgr.zzz(i13 << 3);
                        zzz6 = zzgr.zzz(i19);
                        zzz4 = zzz5 + zzz6;
                        i12 += zzz4;
                    }
                    i4 = i6;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 12:
                    i6 = i11;
                    if (zzJ(obj, i6, i, i2, i3)) {
                        long j5 = unsafe.getInt(obj, j);
                        zzz5 = zzgr.zzz(i13 << 3);
                        zzz6 = zzgr.zzA(j5);
                        zzz4 = zzz5 + zzz6;
                        i12 += zzz4;
                    }
                    i4 = i6;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 13:
                    i6 = i11;
                    if (zzJ(obj, i6, i, i2, i3)) {
                        zzz4 = zzgr.zzz(i13 << 3) + 4;
                        i12 += zzz4;
                    }
                    i4 = i6;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 14:
                    i6 = i11;
                    if (zzJ(obj, i6, i, i2, i3)) {
                        zzz4 = zzgr.zzz(i13 << 3) + 8;
                        i12 += zzz4;
                    }
                    i4 = i6;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 15:
                    i6 = i11;
                    if (zzJ(obj, i6, i, i2, i3)) {
                        int i20 = unsafe.getInt(obj, j);
                        zzz5 = zzgr.zzz(i13 << 3);
                        zzz6 = zzgr.zzz((i20 >> 31) ^ (i20 + i20));
                        zzz4 = zzz5 + zzz6;
                        i12 += zzz4;
                    }
                    i4 = i6;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 16:
                    i6 = i11;
                    if (zzJ(obj, i11, i, i2, i3)) {
                        long j6 = unsafe.getLong(obj, j);
                        zzz5 = zzgr.zzz(i13 << 3);
                        zzz6 = zzgr.zzA((j6 >> 63) ^ (j6 + j6));
                        zzz4 = zzz5 + zzz6;
                        i12 += zzz4;
                    }
                    i4 = i6;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 17:
                    if (zzJ(obj, i11, i, i2, i3)) {
                        i12 += zzgr.zzw(i13, (zzim) unsafe.getObject(obj, j), zzv(i11));
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 18:
                    zzd = zziz.zzd(i13, (List) unsafe.getObject(obj, j), false);
                    i12 += zzd;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 19:
                    zzd = zziz.zzb(i13, (List) unsafe.getObject(obj, j), false);
                    i12 += zzd;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i21 = zziz.$r8$clinit;
                    if (list.size() != 0) {
                        zzg = zziz.zzg(list) + (list.size() * zzgr.zzz(i13 << 3));
                        i12 += zzg;
                        i4 = i11;
                        i11 = i4 + 3;
                        i9 = i;
                        i10 = i2;
                        i8 = 1048575;
                    }
                    zzg = 0;
                    i12 += zzg;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i22 = zziz.$r8$clinit;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zziz.zzl(list2);
                        zzz7 = zzgr.zzz(i13 << 3);
                        zzg = zzl + (size * zzz7);
                        i12 += zzg;
                        i4 = i11;
                        i11 = i4 + 3;
                        i9 = i;
                        i10 = i2;
                        i8 = 1048575;
                    }
                    zzg = 0;
                    i12 += zzg;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i23 = zziz.$r8$clinit;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zziz.zzf(list3);
                        zzz7 = zzgr.zzz(i13 << 3);
                        zzg = zzl + (size * zzz7);
                        i12 += zzg;
                        i4 = i11;
                        i11 = i4 + 3;
                        i9 = i;
                        i10 = i2;
                        i8 = 1048575;
                    }
                    zzg = 0;
                    i12 += zzg;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 23:
                    zzd = zziz.zzd(i13, (List) unsafe.getObject(obj, j), false);
                    i12 += zzd;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 24:
                    zzd = zziz.zzb(i13, (List) unsafe.getObject(obj, j), false);
                    i12 += zzd;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i24 = zziz.$r8$clinit;
                    int size3 = list4.size();
                    if (size3 != 0) {
                        zzd = size3 * (zzgr.zzz(i13 << 3) + 1);
                        i12 += zzd;
                        i4 = i11;
                        i11 = i4 + 3;
                        i9 = i;
                        i10 = i2;
                        i8 = 1048575;
                    }
                    zzd = 0;
                    i12 += zzd;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i25 = zziz.$r8$clinit;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        int zzz19 = zzgr.zzz(i13 << 3) * size4;
                        if (list5 instanceof zzhy) {
                            zzhy zzhyVar = (zzhy) list5;
                            zzg = zzz19;
                            for (int i26 = 0; i26 < size4; i26++) {
                                Object zzc = zzhyVar.zzc();
                                if (zzc instanceof zzgk) {
                                    int zzd5 = ((zzgk) zzc).zzd();
                                    zzg += zzgr.zzz(zzd5) + zzd5;
                                } else {
                                    zzg += zzgr.zzy((String) zzc);
                                }
                            }
                        } else {
                            zzg = zzz19;
                            for (int i27 = 0; i27 < size4; i27++) {
                                Object obj2 = list5.get(i27);
                                if (obj2 instanceof zzgk) {
                                    int zzd6 = ((zzgk) obj2).zzd();
                                    zzg += zzgr.zzz(zzd6) + zzd6;
                                } else {
                                    zzg += zzgr.zzy((String) obj2);
                                }
                            }
                        }
                        i12 += zzg;
                        i4 = i11;
                        i11 = i4 + 3;
                        i9 = i;
                        i10 = i2;
                        i8 = 1048575;
                    }
                    zzg = 0;
                    i12 += zzg;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j);
                    zzix zzv = zzv(i11);
                    int i28 = zziz.$r8$clinit;
                    int size5 = list6.size();
                    if (size5 != 0) {
                        zzz8 = zzgr.zzz(i13 << 3) * size5;
                        for (int i29 = 0; i29 < size5; i29++) {
                            zzz8 += zzgr.zzx((zzim) list6.get(i29), zzv);
                        }
                        i12 += zzz8;
                        i4 = i11;
                        i11 = i4 + 3;
                        i9 = i;
                        i10 = i2;
                        i8 = 1048575;
                    }
                    zzz8 = 0;
                    i12 += zzz8;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i30 = zziz.$r8$clinit;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        zzz9 = 0;
                    } else {
                        zzz9 = size6 * zzgr.zzz(i13 << 3);
                        for (int i31 = 0; i31 < list7.size(); i31++) {
                            int zzd7 = ((zzgk) list7.get(i31)).zzd();
                            zzz9 += zzgr.zzz(zzd7) + zzd7;
                        }
                    }
                    i12 += zzz9;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i32 = zziz.$r8$clinit;
                    size2 = list8.size();
                    if (size2 != 0) {
                        zzk = zziz.zzk(list8);
                        zzz10 = zzgr.zzz(i13 << 3);
                        i7 = size2 * zzz10;
                        zzd = zzk + i7;
                        i12 += zzd;
                        i4 = i11;
                        i11 = i4 + 3;
                        i9 = i;
                        i10 = i2;
                        i8 = 1048575;
                    }
                    zzd = 0;
                    i12 += zzd;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i33 = zziz.$r8$clinit;
                    size2 = list9.size();
                    if (size2 != 0) {
                        zzk = zziz.zza(list9);
                        zzz10 = zzgr.zzz(i13 << 3);
                        i7 = size2 * zzz10;
                        zzd = zzk + i7;
                        i12 += zzd;
                        i4 = i11;
                        i11 = i4 + 3;
                        i9 = i;
                        i10 = i2;
                        i8 = 1048575;
                    }
                    zzd = 0;
                    i12 += zzd;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 31:
                    zzd = zziz.zzb(i13, (List) unsafe.getObject(obj, j), false);
                    i12 += zzd;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 32:
                    zzd = zziz.zzd(i13, (List) unsafe.getObject(obj, j), false);
                    i12 += zzd;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j);
                    int i34 = zziz.$r8$clinit;
                    size2 = list10.size();
                    if (size2 != 0) {
                        zzk = zziz.zzi(list10);
                        zzz10 = zzgr.zzz(i13 << 3);
                        i7 = size2 * zzz10;
                        zzd = zzk + i7;
                        i12 += zzd;
                        i4 = i11;
                        i11 = i4 + 3;
                        i9 = i;
                        i10 = i2;
                        i8 = 1048575;
                    }
                    zzd = 0;
                    i12 += zzd;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j);
                    int i35 = zziz.$r8$clinit;
                    size2 = list11.size();
                    if (size2 != 0) {
                        zzk = zziz.zzj(list11);
                        zzz10 = zzgr.zzz(i13 << 3);
                        i7 = size2 * zzz10;
                        zzd = zzk + i7;
                        i12 += zzd;
                        i4 = i11;
                        i11 = i4 + 3;
                        i9 = i;
                        i10 = i2;
                        i8 = 1048575;
                    }
                    zzd = 0;
                    i12 += zzd;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 35:
                    zze = zziz.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz11 = zzgr.zzz(i13 << 3);
                        zzz12 = zzgr.zzz(zze);
                        i12 += zzz11 + zzz12 + zze;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 36:
                    zze = zziz.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz11 = zzgr.zzz(i13 << 3);
                        zzz12 = zzgr.zzz(zze);
                        i12 += zzz11 + zzz12 + zze;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 37:
                    zze = zziz.zzg((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz11 = zzgr.zzz(i13 << 3);
                        zzz12 = zzgr.zzz(zze);
                        i12 += zzz11 + zzz12 + zze;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 38:
                    zze = zziz.zzl((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz11 = zzgr.zzz(i13 << 3);
                        zzz12 = zzgr.zzz(zze);
                        i12 += zzz11 + zzz12 + zze;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 39:
                    zze = zziz.zzf((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz11 = zzgr.zzz(i13 << 3);
                        zzz12 = zzgr.zzz(zze);
                        i12 += zzz11 + zzz12 + zze;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 40:
                    zze = zziz.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz11 = zzgr.zzz(i13 << 3);
                        zzz12 = zzgr.zzz(zze);
                        i12 += zzz11 + zzz12 + zze;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 41:
                    zze = zziz.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz11 = zzgr.zzz(i13 << 3);
                        zzz12 = zzgr.zzz(zze);
                        i12 += zzz11 + zzz12 + zze;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j);
                    int i36 = zziz.$r8$clinit;
                    zze = list12.size();
                    if (zze > 0) {
                        zzz11 = zzgr.zzz(i13 << 3);
                        zzz12 = zzgr.zzz(zze);
                        i12 += zzz11 + zzz12 + zze;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 43:
                    zze = zziz.zzk((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz11 = zzgr.zzz(i13 << 3);
                        zzz12 = zzgr.zzz(zze);
                        i12 += zzz11 + zzz12 + zze;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 44:
                    zze = zziz.zza((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz11 = zzgr.zzz(i13 << 3);
                        zzz12 = zzgr.zzz(zze);
                        i12 += zzz11 + zzz12 + zze;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 45:
                    zze = zziz.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz11 = zzgr.zzz(i13 << 3);
                        zzz12 = zzgr.zzz(zze);
                        i12 += zzz11 + zzz12 + zze;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 46:
                    zze = zziz.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz11 = zzgr.zzz(i13 << 3);
                        zzz12 = zzgr.zzz(zze);
                        i12 += zzz11 + zzz12 + zze;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 47:
                    zze = zziz.zzi((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz11 = zzgr.zzz(i13 << 3);
                        zzz12 = zzgr.zzz(zze);
                        i12 += zzz11 + zzz12 + zze;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 48:
                    zze = zziz.zzj((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz11 = zzgr.zzz(i13 << 3);
                        zzz12 = zzgr.zzz(zze);
                        i12 += zzz11 + zzz12 + zze;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j);
                    zzix zzv2 = zzv(i11);
                    int i37 = zziz.$r8$clinit;
                    int size7 = list13.size();
                    if (size7 != 0) {
                        zzz8 = 0;
                        for (int i38 = 0; i38 < size7; i38++) {
                            zzz8 += zzgr.zzw(i13, (zzim) list13.get(i38), zzv2);
                        }
                        i12 += zzz8;
                        i4 = i11;
                        i11 = i4 + 3;
                        i9 = i;
                        i10 = i2;
                        i8 = 1048575;
                    }
                    zzz8 = 0;
                    i12 += zzz8;
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 50:
                    zzig zzigVar = (zzig) unsafe.getObject(obj, j);
                    WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzw(i11));
                    if (!zzigVar.isEmpty()) {
                        Iterator it = zzigVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 51:
                    if (zzM(obj, i13, i11)) {
                        zzz13 = zzgr.zzz(i13 << 3);
                        zzd = zzz13 + 8;
                        i12 += zzd;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 52:
                    if (zzM(obj, i13, i11)) {
                        zzz14 = zzgr.zzz(i13 << 3);
                        zzd = zzz14 + 4;
                        i12 += zzd;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 53:
                    if (zzM(obj, i13, i11)) {
                        long zzt = zzt(obj, j);
                        zzk = zzgr.zzz(i13 << 3);
                        i7 = zzgr.zzA(zzt);
                        zzd = zzk + i7;
                        i12 += zzd;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 54:
                    if (zzM(obj, i13, i11)) {
                        long zzt2 = zzt(obj, j);
                        zzk = zzgr.zzz(i13 << 3);
                        i7 = zzgr.zzA(zzt2);
                        zzd = zzk + i7;
                        i12 += zzd;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 55:
                    if (zzM(obj, i13, i11)) {
                        long zzo = zzo(obj, j);
                        zzk = zzgr.zzz(i13 << 3);
                        i7 = zzgr.zzA(zzo);
                        zzd = zzk + i7;
                        i12 += zzd;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 56:
                    if (zzM(obj, i13, i11)) {
                        zzz13 = zzgr.zzz(i13 << 3);
                        zzd = zzz13 + 8;
                        i12 += zzd;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 57:
                    if (zzM(obj, i13, i11)) {
                        zzz14 = zzgr.zzz(i13 << 3);
                        zzd = zzz14 + 4;
                        i12 += zzd;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 58:
                    if (zzM(obj, i13, i11)) {
                        zzd = zzgr.zzz(i13 << 3) + 1;
                        i12 += zzd;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 59:
                    if (zzM(obj, i13, i11)) {
                        int i39 = i13 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzgk) {
                            zzz15 = zzgr.zzz(i39);
                            zzd2 = ((zzgk) object2).zzd();
                            zzz16 = zzgr.zzz(zzd2);
                            zzd = zzz15 + zzz16 + zzd2;
                            i12 += zzd;
                        } else {
                            zzk = zzgr.zzz(i39);
                            i7 = zzgr.zzy((String) object2);
                            zzd = zzk + i7;
                            i12 += zzd;
                        }
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 60:
                    if (zzM(obj, i13, i11)) {
                        zzd = zziz.zzh(i13, unsafe.getObject(obj, j), zzv(i11));
                        i12 += zzd;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 61:
                    if (zzM(obj, i13, i11)) {
                        zzgk zzgkVar2 = (zzgk) unsafe.getObject(obj, j);
                        zzz15 = zzgr.zzz(i13 << 3);
                        zzd2 = zzgkVar2.zzd();
                        zzz16 = zzgr.zzz(zzd2);
                        zzd = zzz15 + zzz16 + zzd2;
                        i12 += zzd;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 62:
                    if (zzM(obj, i13, i11)) {
                        int zzo2 = zzo(obj, j);
                        zzk = zzgr.zzz(i13 << 3);
                        i7 = zzgr.zzz(zzo2);
                        zzd = zzk + i7;
                        i12 += zzd;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 63:
                    if (zzM(obj, i13, i11)) {
                        long zzo3 = zzo(obj, j);
                        zzk = zzgr.zzz(i13 << 3);
                        i7 = zzgr.zzA(zzo3);
                        zzd = zzk + i7;
                        i12 += zzd;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 64:
                    if (zzM(obj, i13, i11)) {
                        zzz14 = zzgr.zzz(i13 << 3);
                        zzd = zzz14 + 4;
                        i12 += zzd;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 65:
                    if (zzM(obj, i13, i11)) {
                        zzz13 = zzgr.zzz(i13 << 3);
                        zzd = zzz13 + 8;
                        i12 += zzd;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 66:
                    if (zzM(obj, i13, i11)) {
                        int zzo4 = zzo(obj, j);
                        zzk = zzgr.zzz(i13 << 3);
                        i7 = zzgr.zzz((zzo4 >> 31) ^ (zzo4 + zzo4));
                        zzd = zzk + i7;
                        i12 += zzd;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 67:
                    if (zzM(obj, i13, i11)) {
                        long zzt3 = zzt(obj, j);
                        zzk = zzgr.zzz(i13 << 3);
                        i7 = zzgr.zzA((zzt3 >> 63) ^ (zzt3 + zzt3));
                        zzd = zzk + i7;
                        i12 += zzd;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                case 68:
                    if (zzM(obj, i13, i11)) {
                        zzd = zzgr.zzw(i13, (zzim) unsafe.getObject(obj, j), zzv(i11));
                        i12 += zzd;
                    }
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
                default:
                    i4 = i11;
                    i11 = i4 + 3;
                    i9 = i;
                    i10 = i2;
                    i8 = 1048575;
            }
        }
        int zza2 = i12 + ((zzhk) obj).zzc.zza();
        if (!this.zzh) {
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

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0d7f, code lost:
    
        if (r1 == 1048575) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0d81, code lost:
    
        r41.putInt(r45, r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0d87, code lost:
    
        r1 = r9.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0d8b, code lost:
    
        if (r1 >= r9.zzk) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0d8d, code lost:
    
        r2 = r9.zzi;
        r5 = r9.zzc;
        r2 = r2[r1];
        r5 = r5[r2];
        r5 = com.google.android.gms.internal.play_billing.zzjq.zzf(r45, r9.zzs(r2) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0d9f, code lost:
    
        if (r5 != null) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0daa, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0da7, code lost:
    
        if (r9.zzu(r2) != null) goto L663;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0dac, code lost:
    
        r5 = (com.google.android.gms.internal.play_billing.zzig) r5;
        androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(r9.zzw(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0db5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0db8, code lost:
    
        if (r0 != 0) goto L561;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0dbc, code lost:
    
        if (r8 != r48) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0dc4, code lost:
    
        throw new com.google.android.gms.internal.play_billing.zzhr("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0dcb, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0dc7, code lost:
    
        if (r8 > r48) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0dc9, code lost:
    
        if (r4 != r0) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0dd1, code lost:
    
        throw new com.google.android.gms.internal.play_billing.zzhr("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0a32 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0cfc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0d0b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:575:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0d28  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0a1f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzfz zzfzVar) {
        zzip zzipVar;
        int i4;
        Unsafe unsafe;
        int i5;
        int i6;
        int i7;
        int i8;
        int zzq;
        zzfz zzfzVar2;
        byte[] bArr2;
        int i9;
        int i10;
        int zzg;
        int i11;
        int i12;
        int i13;
        zzfz zzfzVar3;
        Unsafe unsafe2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        zzfz zzfzVar4;
        int i24;
        Object obj2;
        int i25;
        int i26;
        int i27;
        int i28;
        zzip zzipVar2;
        int zzh;
        zzip zzipVar3;
        int i29;
        int i30;
        Object obj3;
        int i31;
        int i32;
        int zzj;
        int i33;
        int i34;
        int i35;
        int zzh2;
        zzip zzipVar4 = this;
        byte[] bArr3 = bArr;
        int i36 = i2;
        int i37 = i3;
        zzfz zzfzVar5 = zzfzVar;
        int i38 = 3;
        zzA(obj);
        Unsafe unsafe3 = zzb;
        int i39 = 0;
        int i40 = -1;
        int i41 = i;
        int i42 = -1;
        int i43 = 0;
        int i44 = 1048575;
        int i45 = 0;
        int i46 = 0;
        while (true) {
            if (i41 < i36) {
                int i47 = i41 + 1;
                int i48 = bArr3[i41];
                if (i48 < 0) {
                    i47 = zzga.zzi(i48, bArr3, i47, zzfzVar5);
                    i48 = zzfzVar5.zza;
                }
                int i49 = i48 >>> 3;
                if (i49 > i42) {
                    zzq = (i49 < zzipVar4.zze || i49 > zzipVar4.zzf) ? -1 : zzipVar4.zzq(i49, i43 / i38);
                } else if (i49 < zzipVar4.zze || i49 > zzipVar4.zzf) {
                    i8 = -1;
                    if (i8 == i40) {
                        int i50 = i48 & 7;
                        int[] iArr = zzipVar4.zzc;
                        int i51 = iArr[i8 + 1];
                        int zzr = zzr(i51);
                        long j = i51 & 1048575;
                        int i52 = i48;
                        String str = "Protocol message had invalid UTF-8.";
                        if (zzr > 17) {
                            int i53 = i47;
                            int i54 = i49;
                            Unsafe unsafe4 = unsafe3;
                            int i55 = i8;
                            zzfz zzfzVar6 = zzfzVar5;
                            int i56 = i44;
                            int i57 = i45;
                            if (zzr != 27) {
                                i16 = i56;
                                zzfz zzfzVar7 = zzfzVar6;
                                if (zzr <= 49) {
                                    long j2 = i51;
                                    Unsafe unsafe5 = zzb;
                                    zzho zzhoVar = (zzho) unsafe5.getObject(obj, j);
                                    if (zzhoVar.zzc()) {
                                        obj2 = "";
                                    } else {
                                        int size = zzhoVar.size();
                                        obj2 = "";
                                        zzhoVar = zzhoVar.zzd(size + size);
                                        unsafe5.putObject(obj, j, zzhoVar);
                                    }
                                    zzho zzhoVar2 = zzhoVar;
                                    switch (zzr) {
                                        case 18:
                                        case 35:
                                            unsafe = unsafe4;
                                            i25 = i2;
                                            i26 = i52;
                                            i27 = i53;
                                            i28 = i55;
                                            zzipVar2 = zzipVar4;
                                            if (i50 == 2) {
                                                int i58 = zzga.$r8$clinit;
                                                WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzhoVar2);
                                                if (zzga.zzh(bArr3, i27, zzfzVar7) + zzfzVar7.zza > bArr3.length) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                throw null;
                                            }
                                            if (i50 == 1) {
                                                int i59 = zzga.$r8$clinit;
                                                WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzhoVar2);
                                                Double.longBitsToDouble(zzga.zzn(bArr3, i27));
                                                throw null;
                                            }
                                            zzh = i27;
                                            if (zzh == i27) {
                                                i4 = i3;
                                                i7 = i26;
                                                i43 = i28;
                                                zzfzVar2 = zzfzVar7;
                                                bArr2 = bArr3;
                                                i49 = i54;
                                                i9 = zzh;
                                                int i60 = i16;
                                                i45 = i57;
                                                i44 = i60;
                                                break;
                                            } else {
                                                i37 = i3;
                                                i41 = zzh;
                                                i46 = i26;
                                                zzipVar4 = zzipVar2;
                                                i43 = i28;
                                                i36 = i25;
                                                zzfzVar5 = zzfzVar7;
                                                i42 = i54;
                                                unsafe3 = unsafe;
                                                i38 = 3;
                                                i40 = -1;
                                                i39 = 0;
                                                int i61 = i16;
                                                i45 = i57;
                                                i44 = i61;
                                            }
                                        case 19:
                                        case 36:
                                            unsafe = unsafe4;
                                            i25 = i2;
                                            i26 = i52;
                                            i27 = i53;
                                            i28 = i55;
                                            zzipVar2 = zzipVar4;
                                            if (i50 == 2) {
                                                int i62 = zzga.$r8$clinit;
                                                WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzhoVar2);
                                                if (zzga.zzh(bArr3, i27, zzfzVar7) + zzfzVar7.zza > bArr3.length) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                throw null;
                                            }
                                            if (i50 == 5) {
                                                int i63 = zzga.$r8$clinit;
                                                WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzhoVar2);
                                                Float.intBitsToFloat(zzga.zzb(bArr3, i27));
                                                throw null;
                                            }
                                            zzh = i27;
                                            if (zzh == i27) {
                                            }
                                            break;
                                        case 20:
                                        case 21:
                                        case 37:
                                        case 38:
                                            unsafe = unsafe4;
                                            i25 = i2;
                                            i26 = i52;
                                            i27 = i53;
                                            i28 = i55;
                                            zzipVar2 = zzipVar4;
                                            if (i50 == 2) {
                                                int i64 = zzga.$r8$clinit;
                                                WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzhoVar2);
                                                zzh = zzga.zzh(bArr3, i27, zzfzVar7);
                                                int i65 = zzfzVar7.zza + zzh;
                                                if (zzh < i65) {
                                                    zzga.zzk(bArr3, zzh, zzfzVar7);
                                                    throw null;
                                                }
                                                if (zzh != i65) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                if (zzh == i27) {
                                                }
                                            } else {
                                                if (i50 == 0) {
                                                    int i66 = zzga.$r8$clinit;
                                                    WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzhoVar2);
                                                    zzga.zzk(bArr3, i27, zzfzVar7);
                                                    long j3 = zzfzVar7.zzb;
                                                    throw null;
                                                }
                                                zzh = i27;
                                                if (zzh == i27) {
                                                }
                                            }
                                            break;
                                        case 22:
                                        case 29:
                                        case 39:
                                        case 43:
                                            unsafe = unsafe4;
                                            i25 = i2;
                                            zzipVar3 = zzipVar4;
                                            i29 = i52;
                                            i27 = i53;
                                            i28 = i55;
                                            if (i50 == 2) {
                                                zzh = zzga.zzf(bArr3, i27, zzhoVar2, zzfzVar7);
                                                zzipVar2 = zzipVar3;
                                                i26 = i29;
                                                if (zzh == i27) {
                                                }
                                            } else if (i50 == 0) {
                                                zzipVar2 = zzipVar3;
                                                zzh = zzga.zzj(i29, bArr, i27, i2, zzhoVar2, zzfzVar);
                                                i26 = i29;
                                                if (zzh == i27) {
                                                }
                                            } else {
                                                zzipVar2 = zzipVar3;
                                                i26 = i29;
                                                zzh = i27;
                                                if (zzh == i27) {
                                                }
                                            }
                                            break;
                                        case 23:
                                        case 32:
                                        case 40:
                                        case 46:
                                            unsafe = unsafe4;
                                            i25 = i2;
                                            zzipVar3 = zzipVar4;
                                            i29 = i52;
                                            i27 = i53;
                                            i28 = i55;
                                            if (i50 == 2) {
                                                int i67 = zzga.$r8$clinit;
                                                WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzhoVar2);
                                                if (zzga.zzh(bArr3, i27, zzfzVar7) + zzfzVar7.zza > bArr3.length) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                throw null;
                                            }
                                            if (i50 == 1) {
                                                int i68 = zzga.$r8$clinit;
                                                WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzhoVar2);
                                                zzga.zzn(bArr3, i27);
                                                throw null;
                                            }
                                            zzipVar2 = zzipVar3;
                                            i26 = i29;
                                            zzh = i27;
                                            if (zzh == i27) {
                                            }
                                            break;
                                        case 24:
                                        case 31:
                                        case 41:
                                        case 45:
                                            unsafe = unsafe4;
                                            i25 = i2;
                                            zzipVar3 = zzipVar4;
                                            i29 = i52;
                                            i27 = i53;
                                            i28 = i55;
                                            if (i50 == 2) {
                                                int i69 = zzga.$r8$clinit;
                                                zzhl zzhlVar = (zzhl) zzhoVar2;
                                                i30 = zzga.zzh(bArr3, i27, zzfzVar7);
                                                int i70 = zzfzVar7.zza;
                                                int i71 = i30 + i70;
                                                if (i71 > bArr3.length) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzhlVar.zzh(zzhlVar.size() + (i70 / 4));
                                                while (i30 < i71) {
                                                    zzhlVar.zzg(zzga.zzb(bArr3, i30));
                                                    i30 += 4;
                                                }
                                                if (i30 != i71) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i50 == 5) {
                                                    i30 = i27 + 4;
                                                    int i72 = zzga.$r8$clinit;
                                                    zzhl zzhlVar2 = (zzhl) zzhoVar2;
                                                    zzhlVar2.zzg(zzga.zzb(bArr3, i27));
                                                    while (i30 < i25) {
                                                        int zzh3 = zzga.zzh(bArr3, i30, zzfzVar7);
                                                        if (i29 == zzfzVar7.zza) {
                                                            zzhlVar2.zzg(zzga.zzb(bArr3, zzh3));
                                                            i30 = zzh3 + 4;
                                                        }
                                                    }
                                                }
                                                zzipVar2 = zzipVar3;
                                                i26 = i29;
                                                zzh = i27;
                                                if (zzh == i27) {
                                                }
                                            }
                                            zzh = i30;
                                            zzipVar2 = zzipVar3;
                                            i26 = i29;
                                            if (zzh == i27) {
                                            }
                                            break;
                                        case 25:
                                        case 42:
                                            unsafe = unsafe4;
                                            i25 = i2;
                                            zzipVar3 = zzipVar4;
                                            i29 = i52;
                                            i27 = i53;
                                            i28 = i55;
                                            if (i50 == 2) {
                                                int i73 = zzga.$r8$clinit;
                                                WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzhoVar2);
                                                zzh = zzga.zzh(bArr3, i27, zzfzVar7);
                                                int i74 = zzfzVar7.zza + zzh;
                                                if (zzh < i74) {
                                                    zzga.zzk(bArr3, zzh, zzfzVar7);
                                                    throw null;
                                                }
                                                if (zzh != i74) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzipVar2 = zzipVar3;
                                                i26 = i29;
                                                if (zzh == i27) {
                                                }
                                            } else {
                                                if (i50 == 0) {
                                                    int i75 = zzga.$r8$clinit;
                                                    WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzhoVar2);
                                                    zzga.zzk(bArr3, i27, zzfzVar7);
                                                    long j4 = zzfzVar7.zzb;
                                                    throw null;
                                                }
                                                zzipVar2 = zzipVar3;
                                                i26 = i29;
                                                zzh = i27;
                                                if (zzh == i27) {
                                                }
                                            }
                                            break;
                                        case 26:
                                            unsafe = unsafe4;
                                            zzipVar3 = zzipVar4;
                                            i29 = i52;
                                            i28 = i55;
                                            if (i50 != 2) {
                                                i25 = i2;
                                                i27 = i53;
                                                i54 = i54;
                                                zzipVar2 = zzipVar3;
                                                i26 = i29;
                                                zzh = i27;
                                                if (zzh == i27) {
                                                }
                                            } else if ((536870912 & j2) == 0) {
                                                i27 = i53;
                                                int zzh4 = zzga.zzh(bArr3, i27, zzfzVar7);
                                                int i76 = zzfzVar7.zza;
                                                if (i76 < 0) {
                                                    throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i76 == 0) {
                                                    obj3 = obj2;
                                                    zzhoVar2.add(obj3);
                                                } else {
                                                    obj3 = obj2;
                                                    zzhoVar2.add(new String(bArr3, zzh4, i76, zzhp.zza));
                                                    zzh4 += i76;
                                                }
                                                i25 = i2;
                                                while (zzh4 < i25) {
                                                    int zzh5 = zzga.zzh(bArr3, zzh4, zzfzVar7);
                                                    if (i29 == zzfzVar7.zza) {
                                                        zzh4 = zzga.zzh(bArr3, zzh5, zzfzVar7);
                                                        int i77 = zzfzVar7.zza;
                                                        if (i77 < 0) {
                                                            throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i77 == 0) {
                                                            zzhoVar2.add(obj3);
                                                        } else {
                                                            zzhoVar2.add(new String(bArr3, zzh4, i77, zzhp.zza));
                                                            zzh4 += i77;
                                                        }
                                                    } else {
                                                        i54 = i54;
                                                        zzipVar2 = zzipVar3;
                                                        i26 = i29;
                                                        zzh = zzh4;
                                                        if (zzh == i27) {
                                                        }
                                                    }
                                                }
                                                i54 = i54;
                                                zzipVar2 = zzipVar3;
                                                i26 = i29;
                                                zzh = zzh4;
                                                if (zzh == i27) {
                                                }
                                            } else {
                                                i25 = i2;
                                                Object obj4 = obj2;
                                                i27 = i53;
                                                int zzh6 = zzga.zzh(bArr3, i27, zzfzVar7);
                                                int i78 = zzfzVar7.zza;
                                                if (i78 < 0) {
                                                    throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i78 == 0) {
                                                    zzhoVar2.add(obj4);
                                                    i54 = i54;
                                                } else {
                                                    int i79 = zzh6 + i78;
                                                    if (!zzjt.zzd(bArr3, zzh6, i79)) {
                                                        throw new zzhr(str);
                                                    }
                                                    i54 = i54;
                                                    zzhoVar2.add(new String(bArr3, zzh6, i78, zzhp.zza));
                                                    zzh6 = i79;
                                                }
                                                while (zzh6 < i25) {
                                                    int zzh7 = zzga.zzh(bArr3, zzh6, zzfzVar7);
                                                    if (i29 == zzfzVar7.zza) {
                                                        zzh6 = zzga.zzh(bArr3, zzh7, zzfzVar7);
                                                        int i80 = zzfzVar7.zza;
                                                        if (i80 < 0) {
                                                            throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i80 == 0) {
                                                            zzhoVar2.add(obj4);
                                                        } else {
                                                            int i81 = zzh6 + i80;
                                                            if (!zzjt.zzd(bArr3, zzh6, i81)) {
                                                                throw new zzhr(str);
                                                            }
                                                            zzhoVar2.add(new String(bArr3, zzh6, i80, zzhp.zza));
                                                            zzh6 = i81;
                                                        }
                                                    } else {
                                                        zzh = zzh6;
                                                        zzipVar2 = zzipVar3;
                                                        i26 = i29;
                                                        if (zzh == i27) {
                                                        }
                                                    }
                                                }
                                                zzh = zzh6;
                                                zzipVar2 = zzipVar3;
                                                i26 = i29;
                                                if (zzh == i27) {
                                                }
                                            }
                                            break;
                                        case 27:
                                            if (i50 == 2) {
                                                i25 = i2;
                                                unsafe = unsafe4;
                                                int zze = zzga.zze(zzv(i55), i52, bArr, i53, i25, zzhoVar2, zzfzVar);
                                                i54 = i54;
                                                i28 = i55;
                                                zzfzVar7 = zzfzVar7;
                                                zzipVar2 = this;
                                                i26 = i52;
                                                zzh = zze;
                                                i27 = i53;
                                                if (zzh == i27) {
                                                }
                                            } else {
                                                unsafe = unsafe4;
                                                i54 = i54;
                                                i26 = i52;
                                                i27 = i53;
                                                i25 = i2;
                                                i28 = i55;
                                                zzipVar2 = this;
                                                zzh = i27;
                                                if (zzh == i27) {
                                                }
                                            }
                                            break;
                                        case 28:
                                            i31 = i2;
                                            i32 = i53;
                                            if (i50 == 2) {
                                                int zzh8 = zzga.zzh(bArr3, i32, zzfzVar7);
                                                int i82 = zzfzVar7.zza;
                                                if (i82 < 0) {
                                                    throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i82 > bArr3.length - zzh8) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                if (i82 == 0) {
                                                    zzhoVar2.add(zzgk.zzb);
                                                } else {
                                                    zzhoVar2.add(zzgk.zzj(bArr3, zzh8, i82));
                                                    zzh8 += i82;
                                                }
                                                while (zzh8 < i31) {
                                                    int zzh9 = zzga.zzh(bArr3, zzh8, zzfzVar7);
                                                    if (i52 == zzfzVar7.zza) {
                                                        zzh8 = zzga.zzh(bArr3, zzh9, zzfzVar7);
                                                        int i83 = zzfzVar7.zza;
                                                        if (i83 < 0) {
                                                            throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i83 > bArr3.length - zzh8) {
                                                            throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        if (i83 == 0) {
                                                            zzhoVar2.add(zzgk.zzb);
                                                        } else {
                                                            zzhoVar2.add(zzgk.zzj(bArr3, zzh8, i83));
                                                            zzh8 += i83;
                                                        }
                                                    } else {
                                                        unsafe = unsafe4;
                                                        i54 = i54;
                                                        zzh = zzh8;
                                                        i26 = i52;
                                                        i28 = i55;
                                                        zzipVar2 = this;
                                                        int i84 = i31;
                                                        i27 = i32;
                                                        i25 = i84;
                                                        if (zzh == i27) {
                                                        }
                                                    }
                                                }
                                                unsafe = unsafe4;
                                                i54 = i54;
                                                zzh = zzh8;
                                                i26 = i52;
                                                i28 = i55;
                                                zzipVar2 = this;
                                                int i842 = i31;
                                                i27 = i32;
                                                i25 = i842;
                                                if (zzh == i27) {
                                                }
                                            } else {
                                                unsafe = unsafe4;
                                                i54 = i54;
                                                i26 = i52;
                                                i28 = i55;
                                                zzipVar2 = this;
                                                int i85 = i31;
                                                i27 = i32;
                                                i25 = i85;
                                                zzh = i27;
                                                if (zzh == i27) {
                                                }
                                            }
                                            break;
                                        case 30:
                                        case 44:
                                            i31 = i2;
                                            i32 = i53;
                                            if (i50 == 2) {
                                                zzj = zzga.zzf(bArr3, i32, zzhoVar2, zzfzVar7);
                                            } else if (i50 == 0) {
                                                zzj = zzga.zzj(i52, bArr, i32, i2, zzhoVar2, zzfzVar);
                                            } else {
                                                unsafe = unsafe4;
                                                i26 = i52;
                                                i28 = i55;
                                                zzipVar2 = this;
                                                int i852 = i31;
                                                i27 = i32;
                                                i25 = i852;
                                                zzh = i27;
                                                if (zzh == i27) {
                                                }
                                            }
                                            zzhm zzu = zzipVar4.zzu(i55);
                                            zzjj zzjjVar = zzipVar4.zzl;
                                            int i86 = zziz.$r8$clinit;
                                            if (zzu == null) {
                                                i33 = zzj;
                                                i34 = i54;
                                            } else if (zzhoVar2 instanceof RandomAccess) {
                                                int size2 = zzhoVar2.size();
                                                Object obj5 = null;
                                                int i87 = 0;
                                                int i88 = 0;
                                                while (i87 < size2) {
                                                    int i89 = zzj;
                                                    Integer num = (Integer) zzhoVar2.get(i87);
                                                    int intValue = num.intValue();
                                                    if (zzu.zza(intValue)) {
                                                        if (i87 != i88) {
                                                            zzhoVar2.set(i88, num);
                                                        }
                                                        i88++;
                                                        i35 = i54;
                                                    } else {
                                                        i35 = i54;
                                                        obj5 = zziz.zzn(obj, i35, intValue, obj5, zzjjVar);
                                                    }
                                                    i87++;
                                                    i54 = i35;
                                                    zzj = i89;
                                                }
                                                i33 = zzj;
                                                i34 = i54;
                                                if (i88 != size2) {
                                                    zzhoVar2.subList(i88, size2).clear();
                                                }
                                            } else {
                                                i33 = zzj;
                                                i34 = i54;
                                                Iterator it = zzhoVar2.iterator();
                                                Object obj6 = null;
                                                while (it.hasNext()) {
                                                    int intValue2 = ((Integer) it.next()).intValue();
                                                    if (!zzu.zza(intValue2)) {
                                                        obj6 = zziz.zzn(obj, i34, intValue2, obj6, zzjjVar);
                                                        it.remove();
                                                    }
                                                }
                                            }
                                            unsafe = unsafe4;
                                            i54 = i34;
                                            i26 = i52;
                                            zzh = i33;
                                            i28 = i55;
                                            zzipVar2 = this;
                                            int i8422 = i31;
                                            i27 = i32;
                                            i25 = i8422;
                                            if (zzh == i27) {
                                            }
                                            break;
                                        case 33:
                                        case 47:
                                            i31 = i2;
                                            i32 = i53;
                                            if (i50 == 2) {
                                                int i90 = zzga.$r8$clinit;
                                                zzhl zzhlVar3 = (zzhl) zzhoVar2;
                                                zzh2 = zzga.zzh(bArr3, i32, zzfzVar7);
                                                int i91 = zzfzVar7.zza + zzh2;
                                                while (zzh2 < i91) {
                                                    zzh2 = zzga.zzh(bArr3, zzh2, zzfzVar7);
                                                    zzhlVar3.zzg(zzgn.zzb(zzfzVar7.zza));
                                                }
                                                if (zzh2 != i91) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                unsafe = unsafe4;
                                                zzh = zzh2;
                                                i26 = i52;
                                                i28 = i55;
                                                zzipVar2 = zzipVar4;
                                                int i84222 = i31;
                                                i27 = i32;
                                                i25 = i84222;
                                                if (zzh == i27) {
                                                }
                                            } else {
                                                if (i50 == 0) {
                                                    int i92 = zzga.$r8$clinit;
                                                    zzhl zzhlVar4 = (zzhl) zzhoVar2;
                                                    zzh = zzga.zzh(bArr3, i32, zzfzVar7);
                                                    zzhlVar4.zzg(zzgn.zzb(zzfzVar7.zza));
                                                    while (zzh < i31) {
                                                        int zzh10 = zzga.zzh(bArr3, zzh, zzfzVar7);
                                                        if (i52 == zzfzVar7.zza) {
                                                            zzh = zzga.zzh(bArr3, zzh10, zzfzVar7);
                                                            zzhlVar4.zzg(zzgn.zzb(zzfzVar7.zza));
                                                        } else {
                                                            unsafe = unsafe4;
                                                            i26 = i52;
                                                            i28 = i55;
                                                            zzipVar2 = zzipVar4;
                                                            int i842222 = i31;
                                                            i27 = i32;
                                                            i25 = i842222;
                                                            if (zzh == i27) {
                                                            }
                                                        }
                                                    }
                                                    unsafe = unsafe4;
                                                    i26 = i52;
                                                    i28 = i55;
                                                    zzipVar2 = zzipVar4;
                                                    int i8422222 = i31;
                                                    i27 = i32;
                                                    i25 = i8422222;
                                                    if (zzh == i27) {
                                                    }
                                                }
                                                unsafe = unsafe4;
                                                i26 = i52;
                                                i28 = i55;
                                                zzipVar2 = zzipVar4;
                                                int i8522 = i31;
                                                i27 = i32;
                                                i25 = i8522;
                                                zzh = i27;
                                                if (zzh == i27) {
                                                }
                                            }
                                            break;
                                        case 34:
                                        case 48:
                                            i31 = i2;
                                            if (i50 == 2) {
                                                int i93 = zzga.$r8$clinit;
                                                WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzhoVar2);
                                                i32 = i53;
                                                zzh2 = zzga.zzh(bArr3, i32, zzfzVar7);
                                                int i94 = zzfzVar7.zza + zzh2;
                                                if (zzh2 < i94) {
                                                    zzga.zzk(bArr3, zzh2, zzfzVar7);
                                                    zzgn.zzc(zzfzVar7.zzb);
                                                    throw null;
                                                }
                                                if (zzh2 != i94) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                unsafe = unsafe4;
                                                zzh = zzh2;
                                                i26 = i52;
                                                i28 = i55;
                                                zzipVar2 = zzipVar4;
                                                int i84222222 = i31;
                                                i27 = i32;
                                                i25 = i84222222;
                                                if (zzh == i27) {
                                                }
                                            } else {
                                                i32 = i53;
                                                if (i50 == 0) {
                                                    int i95 = zzga.$r8$clinit;
                                                    WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzhoVar2);
                                                    zzga.zzk(bArr3, i32, zzfzVar7);
                                                    zzgn.zzc(zzfzVar7.zzb);
                                                    throw null;
                                                }
                                                unsafe = unsafe4;
                                                i26 = i52;
                                                i28 = i55;
                                                zzipVar2 = zzipVar4;
                                                int i85222 = i31;
                                                i27 = i32;
                                                i25 = i85222;
                                                zzh = i27;
                                                if (zzh == i27) {
                                                }
                                            }
                                            break;
                                        default:
                                            if (i50 == 3) {
                                                int i96 = (i52 & (-8)) | 4;
                                                zzix zzv = zzipVar4.zzv(i55);
                                                zzh = zzga.zzc(zzv, bArr, i53, i2, i96, zzfzVar);
                                                zzhoVar2.add(zzfzVar7.zzc);
                                                for (int i97 = i2; zzh < i97; i97 = i97) {
                                                    int zzh11 = zzga.zzh(bArr3, zzh, zzfzVar7);
                                                    if (i52 == zzfzVar7.zza) {
                                                        zzh = zzga.zzc(zzv, bArr, zzh11, i2, i96, zzfzVar);
                                                        zzhoVar2.add(zzfzVar7.zzc);
                                                    } else {
                                                        unsafe = unsafe4;
                                                        i26 = i52;
                                                        i25 = i97;
                                                        i27 = i53;
                                                        i28 = i55;
                                                        zzipVar2 = zzipVar4;
                                                        if (zzh == i27) {
                                                        }
                                                    }
                                                }
                                                unsafe = unsafe4;
                                                i26 = i52;
                                                i25 = i97;
                                                i27 = i53;
                                                i28 = i55;
                                                zzipVar2 = zzipVar4;
                                                if (zzh == i27) {
                                                }
                                            } else {
                                                unsafe = unsafe4;
                                                i25 = i2;
                                                i26 = i52;
                                                i27 = i53;
                                                i28 = i55;
                                                zzipVar2 = zzipVar4;
                                                zzh = i27;
                                                if (zzh == i27) {
                                                }
                                            }
                                            break;
                                    }
                                } else {
                                    i17 = i52;
                                    unsafe = unsafe4;
                                    i18 = i53;
                                    i19 = i54;
                                    i20 = i55;
                                    zzip zzipVar5 = zzipVar4;
                                    if (zzr != 50) {
                                        Unsafe unsafe6 = zzb;
                                        long j5 = iArr[i20 + 2] & 1048575;
                                        switch (zzr) {
                                            case 51:
                                                bArr2 = bArr;
                                                i7 = i17;
                                                i21 = i20;
                                                i22 = i18;
                                                i49 = i19;
                                                zzfzVar2 = zzfzVar;
                                                if (i50 == 1) {
                                                    i23 = i22 + 8;
                                                    unsafe6.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzga.zzn(bArr2, i22))));
                                                    unsafe6.putInt(obj, j5, i49);
                                                    i41 = i23;
                                                    if (i41 == i22) {
                                                        i43 = i21;
                                                        i4 = i3;
                                                        i9 = i41;
                                                        int i602 = i16;
                                                        i45 = i57;
                                                        i44 = i602;
                                                        break;
                                                    } else {
                                                        zzipVar4 = this;
                                                        i43 = i21;
                                                        i36 = i2;
                                                        i37 = i3;
                                                        i46 = i7;
                                                        i42 = i49;
                                                        bArr3 = bArr2;
                                                        zzfzVar5 = zzfzVar2;
                                                        unsafe3 = unsafe;
                                                        i38 = 3;
                                                        i40 = -1;
                                                        i39 = 0;
                                                        int i612 = i16;
                                                        i45 = i57;
                                                        i44 = i612;
                                                    }
                                                }
                                                i41 = i22;
                                                if (i41 == i22) {
                                                }
                                            case 52:
                                                bArr2 = bArr;
                                                i7 = i17;
                                                i21 = i20;
                                                i22 = i18;
                                                i49 = i19;
                                                zzfzVar2 = zzfzVar;
                                                if (i50 == 5) {
                                                    i23 = i22 + 4;
                                                    unsafe6.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzga.zzb(bArr2, i22))));
                                                    unsafe6.putInt(obj, j5, i49);
                                                    i41 = i23;
                                                    if (i41 == i22) {
                                                    }
                                                }
                                                i41 = i22;
                                                if (i41 == i22) {
                                                }
                                                break;
                                            case 53:
                                            case 54:
                                                bArr2 = bArr;
                                                i7 = i17;
                                                i21 = i20;
                                                i22 = i18;
                                                i49 = i19;
                                                zzfzVar2 = zzfzVar;
                                                if (i50 == 0) {
                                                    i23 = zzga.zzk(bArr2, i22, zzfzVar2);
                                                    unsafe6.putObject(obj, j, Long.valueOf(zzfzVar2.zzb));
                                                    unsafe6.putInt(obj, j5, i49);
                                                    i41 = i23;
                                                    if (i41 == i22) {
                                                    }
                                                }
                                                i41 = i22;
                                                if (i41 == i22) {
                                                }
                                                break;
                                            case 55:
                                            case 62:
                                                bArr2 = bArr;
                                                i7 = i17;
                                                i21 = i20;
                                                i22 = i18;
                                                i49 = i19;
                                                zzfzVar2 = zzfzVar;
                                                if (i50 == 0) {
                                                    i23 = zzga.zzh(bArr2, i22, zzfzVar2);
                                                    unsafe6.putObject(obj, j, Integer.valueOf(zzfzVar2.zza));
                                                    unsafe6.putInt(obj, j5, i49);
                                                    i41 = i23;
                                                    if (i41 == i22) {
                                                    }
                                                }
                                                i41 = i22;
                                                if (i41 == i22) {
                                                }
                                                break;
                                            case 56:
                                            case 65:
                                                bArr2 = bArr;
                                                i7 = i17;
                                                i21 = i20;
                                                i22 = i18;
                                                i49 = i19;
                                                zzfzVar2 = zzfzVar;
                                                if (i50 == 1) {
                                                    i23 = i22 + 8;
                                                    unsafe6.putObject(obj, j, Long.valueOf(zzga.zzn(bArr2, i22)));
                                                    unsafe6.putInt(obj, j5, i49);
                                                    i41 = i23;
                                                    if (i41 == i22) {
                                                    }
                                                }
                                                i41 = i22;
                                                if (i41 == i22) {
                                                }
                                                break;
                                            case 57:
                                            case 64:
                                                bArr2 = bArr;
                                                i7 = i17;
                                                i21 = i20;
                                                i22 = i18;
                                                i49 = i19;
                                                zzfzVar2 = zzfzVar;
                                                if (i50 == 5) {
                                                    i23 = i22 + 4;
                                                    unsafe6.putObject(obj, j, Integer.valueOf(zzga.zzb(bArr2, i22)));
                                                    unsafe6.putInt(obj, j5, i49);
                                                    i41 = i23;
                                                    if (i41 == i22) {
                                                    }
                                                }
                                                i41 = i22;
                                                if (i41 == i22) {
                                                }
                                                break;
                                            case 58:
                                                bArr2 = bArr;
                                                i7 = i17;
                                                i21 = i20;
                                                i22 = i18;
                                                i49 = i19;
                                                zzfzVar2 = zzfzVar;
                                                if (i50 == 0) {
                                                    i23 = zzga.zzk(bArr2, i22, zzfzVar2);
                                                    unsafe6.putObject(obj, j, Boolean.valueOf(zzfzVar2.zzb != 0));
                                                    unsafe6.putInt(obj, j5, i49);
                                                    i41 = i23;
                                                    if (i41 == i22) {
                                                    }
                                                }
                                                i41 = i22;
                                                if (i41 == i22) {
                                                }
                                                break;
                                            case 59:
                                                bArr2 = bArr;
                                                i7 = i17;
                                                i21 = i20;
                                                i22 = i18;
                                                i49 = i19;
                                                zzfzVar2 = zzfzVar;
                                                if (i50 == 2) {
                                                    int zzh12 = zzga.zzh(bArr2, i22, zzfzVar2);
                                                    int i98 = zzfzVar2.zza;
                                                    if (i98 == 0) {
                                                        unsafe6.putObject(obj, j, "");
                                                    } else {
                                                        int i99 = zzh12 + i98;
                                                        if ((i51 & TLObject.FLAG_29) != 0 && !zzjt.zzd(bArr2, zzh12, i99)) {
                                                            throw new zzhr(str);
                                                        }
                                                        unsafe6.putObject(obj, j, new String(bArr2, zzh12, i98, zzhp.zza));
                                                        zzh12 = i99;
                                                    }
                                                    unsafe6.putInt(obj, j5, i49);
                                                    i41 = zzh12;
                                                    if (i41 == i22) {
                                                    }
                                                }
                                                i41 = i22;
                                                if (i41 == i22) {
                                                }
                                                break;
                                            case 60:
                                                bArr2 = bArr;
                                                i22 = i18;
                                                i49 = i19;
                                                if (i50 == 2) {
                                                    Object zzy = zzipVar5.zzy(obj, i49, i20);
                                                    zzfzVar2 = zzfzVar;
                                                    int zzm = zzga.zzm(zzy, zzipVar5.zzv(i20), bArr, i22, i2, zzfzVar);
                                                    zzipVar5.zzG(obj, i49, i20, zzy);
                                                    i41 = zzm;
                                                    i7 = i17;
                                                    i21 = i20;
                                                    if (i41 == i22) {
                                                    }
                                                } else {
                                                    zzfzVar2 = zzfzVar;
                                                    i21 = i20;
                                                    i7 = i17;
                                                    i41 = i22;
                                                    if (i41 == i22) {
                                                    }
                                                }
                                                break;
                                            case 61:
                                                bArr2 = bArr;
                                                zzfzVar4 = zzfzVar;
                                                i24 = i20;
                                                i22 = i18;
                                                i49 = i19;
                                                if (i50 == 2) {
                                                    int zza2 = zzga.zza(bArr2, i22, zzfzVar4);
                                                    unsafe6.putObject(obj, j, zzfzVar4.zzc);
                                                    unsafe6.putInt(obj, j5, i49);
                                                    zzfzVar2 = zzfzVar4;
                                                    i21 = i24;
                                                    i41 = zza2;
                                                    i7 = i17;
                                                    if (i41 == i22) {
                                                    }
                                                }
                                                zzfzVar2 = zzfzVar4;
                                                i21 = i24;
                                                i7 = i17;
                                                i41 = i22;
                                                if (i41 == i22) {
                                                }
                                                break;
                                            case 63:
                                                bArr2 = bArr;
                                                zzfzVar4 = zzfzVar;
                                                i24 = i20;
                                                i22 = i18;
                                                i49 = i19;
                                                if (i50 == 0) {
                                                    i41 = zzga.zzh(bArr2, i22, zzfzVar4);
                                                    int i100 = zzfzVar4.zza;
                                                    zzhm zzu2 = zzipVar5.zzu(i24);
                                                    if (zzu2 == null || zzu2.zza(i100)) {
                                                        unsafe6.putObject(obj, j, Integer.valueOf(i100));
                                                        unsafe6.putInt(obj, j5, i49);
                                                    } else {
                                                        zzd(obj).zzj(i17, Long.valueOf(i100));
                                                    }
                                                    zzfzVar2 = zzfzVar4;
                                                    i21 = i24;
                                                    i7 = i17;
                                                    if (i41 == i22) {
                                                    }
                                                }
                                                zzfzVar2 = zzfzVar4;
                                                i21 = i24;
                                                i7 = i17;
                                                i41 = i22;
                                                if (i41 == i22) {
                                                }
                                                break;
                                            case 66:
                                                zzfzVar4 = zzfzVar;
                                                i24 = i20;
                                                i22 = i18;
                                                i49 = i19;
                                                if (i50 == 0) {
                                                    bArr2 = bArr;
                                                    i41 = zzga.zzh(bArr2, i22, zzfzVar4);
                                                    unsafe6.putObject(obj, j, Integer.valueOf(zzgn.zzb(zzfzVar4.zza)));
                                                    unsafe6.putInt(obj, j5, i49);
                                                    zzfzVar2 = zzfzVar4;
                                                    i21 = i24;
                                                    i7 = i17;
                                                    if (i41 == i22) {
                                                    }
                                                }
                                                bArr2 = bArr;
                                                zzfzVar2 = zzfzVar4;
                                                i21 = i24;
                                                i7 = i17;
                                                i41 = i22;
                                                if (i41 == i22) {
                                                }
                                                break;
                                            case 67:
                                                zzfzVar4 = zzfzVar;
                                                i24 = i20;
                                                i22 = i18;
                                                i49 = i19;
                                                if (i50 == 0) {
                                                    i41 = zzga.zzk(bArr, i22, zzfzVar4);
                                                    unsafe6.putObject(obj, j, Long.valueOf(zzgn.zzc(zzfzVar4.zzb)));
                                                    unsafe6.putInt(obj, j5, i49);
                                                    bArr2 = bArr;
                                                    zzfzVar2 = zzfzVar4;
                                                    i21 = i24;
                                                    i7 = i17;
                                                    if (i41 == i22) {
                                                    }
                                                }
                                                bArr2 = bArr;
                                                zzfzVar2 = zzfzVar4;
                                                i21 = i24;
                                                i7 = i17;
                                                i41 = i22;
                                                if (i41 == i22) {
                                                }
                                                break;
                                            case 68:
                                                if (i50 == 3) {
                                                    Object zzy2 = zzipVar5.zzy(obj, i19, i20);
                                                    i22 = i18;
                                                    i24 = i20;
                                                    i41 = zzga.zzl(zzy2, zzipVar5.zzv(i20), bArr, i18, i2, (i17 & (-8)) | 4, zzfzVar);
                                                    zzipVar5.zzG(obj, i19, i24, zzy2);
                                                    bArr2 = bArr;
                                                    zzfzVar2 = zzfzVar;
                                                    i49 = i19;
                                                    i21 = i24;
                                                    i7 = i17;
                                                    if (i41 == i22) {
                                                    }
                                                } else {
                                                    i22 = i18;
                                                    bArr2 = bArr;
                                                    zzfzVar2 = zzfzVar;
                                                    i7 = i17;
                                                    i21 = i20;
                                                    i49 = i19;
                                                    i41 = i22;
                                                    if (i41 == i22) {
                                                    }
                                                }
                                                break;
                                            default:
                                                bArr2 = bArr;
                                                i7 = i17;
                                                i21 = i20;
                                                i22 = i18;
                                                i49 = i19;
                                                zzfzVar2 = zzfzVar;
                                                i41 = i22;
                                                if (i41 == i22) {
                                                }
                                                break;
                                        }
                                    } else {
                                        if (i50 == 2) {
                                            Unsafe unsafe7 = zzb;
                                            Object zzw = zzipVar5.zzw(i20);
                                            Object object = unsafe7.getObject(obj, j);
                                            if (!((zzig) object).zze()) {
                                                zzig zzb2 = zzig.zza().zzb();
                                                zzih.zza(zzb2, object);
                                                unsafe7.putObject(obj, j, zzb2);
                                            }
                                            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzw);
                                            throw null;
                                        }
                                        i4 = i3;
                                        i7 = i17;
                                        i43 = i20;
                                        i9 = i18;
                                        bArr2 = bArr3;
                                        i49 = i19;
                                        zzfzVar2 = zzfzVar;
                                        int i6022 = i16;
                                        i45 = i57;
                                        i44 = i6022;
                                    }
                                }
                            } else if (i50 == 2) {
                                zzho zzhoVar3 = (zzho) unsafe4.getObject(obj, j);
                                if (!zzhoVar3.zzc()) {
                                    int size3 = zzhoVar3.size();
                                    zzhoVar3 = zzhoVar3.zzd(size3 == 0 ? 10 : size3 + size3);
                                    unsafe4.putObject(obj, j, zzhoVar3);
                                }
                                i16 = i56;
                                i41 = zzga.zze(zzipVar4.zzv(i55), i52, bArr, i53, i2, zzhoVar3, zzfzVar);
                                i36 = i2;
                                i43 = i55;
                                i46 = i52;
                                unsafe3 = unsafe4;
                                i42 = i54;
                                i38 = 3;
                                i40 = -1;
                                i39 = 0;
                                i37 = i3;
                                zzfzVar5 = zzfzVar6;
                                int i6122 = i16;
                                i45 = i57;
                                i44 = i6122;
                            } else {
                                i16 = i56;
                                unsafe = unsafe4;
                                i20 = i55;
                                i18 = i53;
                                i17 = i52;
                                i19 = i54;
                                i4 = i3;
                                i7 = i17;
                                i43 = i20;
                                i9 = i18;
                                bArr2 = bArr3;
                                i49 = i19;
                                zzfzVar2 = zzfzVar;
                                int i60222 = i16;
                                i45 = i57;
                                i44 = i60222;
                            }
                        } else {
                            int i101 = iArr[i8 + 2];
                            int i102 = 1 << (i101 >>> 20);
                            int i103 = i101 & 1048575;
                            int i104 = i44;
                            if (i103 != i104) {
                                if (i104 != 1048575) {
                                    unsafe3.putInt(obj, i104, i45);
                                }
                                i44 = i103;
                                i45 = i103 == 1048575 ? 0 : unsafe3.getInt(obj, i103);
                            } else {
                                i44 = i104;
                            }
                            switch (zzr) {
                                case 0:
                                    i13 = i47;
                                    i11 = i49;
                                    unsafe2 = unsafe3;
                                    i12 = i8;
                                    zzfzVar3 = zzfzVar5;
                                    if (i50 != 1) {
                                        i4 = i3;
                                        i9 = i13;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i7 = i52;
                                        i49 = i11;
                                        zzfzVar2 = zzfzVar3;
                                        i43 = i12;
                                        break;
                                    } else {
                                        i41 = i13 + 8;
                                        i45 |= i102;
                                        zzjq.zzo(obj, j, Double.longBitsToDouble(zzga.zzn(bArr3, i13)));
                                        i36 = i2;
                                        i37 = i3;
                                        zzfzVar5 = zzfzVar3;
                                        i43 = i12;
                                        i46 = i52;
                                        i42 = i11;
                                        i38 = 3;
                                        i40 = -1;
                                        unsafe3 = unsafe2;
                                        i39 = 0;
                                    }
                                case 1:
                                    i13 = i47;
                                    i11 = i49;
                                    unsafe2 = unsafe3;
                                    i12 = i8;
                                    zzfzVar3 = zzfzVar5;
                                    if (i50 != 5) {
                                        i4 = i3;
                                        i9 = i13;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i7 = i52;
                                        i49 = i11;
                                        zzfzVar2 = zzfzVar3;
                                        i43 = i12;
                                        break;
                                    } else {
                                        i41 = i13 + 4;
                                        i45 |= i102;
                                        zzjq.zzp(obj, j, Float.intBitsToFloat(zzga.zzb(bArr3, i13)));
                                        i36 = i2;
                                        i37 = i3;
                                        zzfzVar5 = zzfzVar3;
                                        i43 = i12;
                                        i46 = i52;
                                        i42 = i11;
                                        i38 = 3;
                                        i40 = -1;
                                        unsafe3 = unsafe2;
                                        i39 = 0;
                                    }
                                case 2:
                                case 3:
                                    i13 = i47;
                                    i11 = i49;
                                    unsafe2 = unsafe3;
                                    i12 = i8;
                                    zzfzVar3 = zzfzVar5;
                                    if (i50 != 0) {
                                        i4 = i3;
                                        i9 = i13;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i7 = i52;
                                        i49 = i11;
                                        zzfzVar2 = zzfzVar3;
                                        i43 = i12;
                                        break;
                                    } else {
                                        i45 |= i102;
                                        i41 = zzga.zzk(bArr3, i13, zzfzVar3);
                                        unsafe2.putLong(obj, j, zzfzVar3.zzb);
                                        i36 = i2;
                                        i37 = i3;
                                        zzfzVar5 = zzfzVar3;
                                        i43 = i12;
                                        i46 = i52;
                                        i42 = i11;
                                        i38 = 3;
                                        i40 = -1;
                                        unsafe3 = unsafe2;
                                        i39 = 0;
                                    }
                                case 4:
                                case 11:
                                    i13 = i47;
                                    i11 = i49;
                                    unsafe2 = unsafe3;
                                    i12 = i8;
                                    zzfzVar3 = zzfzVar5;
                                    if (i50 != 0) {
                                        i4 = i3;
                                        i9 = i13;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i7 = i52;
                                        i49 = i11;
                                        zzfzVar2 = zzfzVar3;
                                        i43 = i12;
                                        break;
                                    } else {
                                        i45 |= i102;
                                        i41 = zzga.zzh(bArr3, i13, zzfzVar3);
                                        unsafe2.putInt(obj, j, zzfzVar3.zza);
                                        i36 = i2;
                                        i37 = i3;
                                        zzfzVar5 = zzfzVar3;
                                        i43 = i12;
                                        i46 = i52;
                                        i42 = i11;
                                        i38 = 3;
                                        i40 = -1;
                                        unsafe3 = unsafe2;
                                        i39 = 0;
                                    }
                                case 5:
                                case 14:
                                    i13 = i47;
                                    i11 = i49;
                                    unsafe2 = unsafe3;
                                    i12 = i8;
                                    zzfzVar3 = zzfzVar5;
                                    if (i50 != 1) {
                                        i4 = i3;
                                        i9 = i13;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i7 = i52;
                                        i49 = i11;
                                        zzfzVar2 = zzfzVar3;
                                        i43 = i12;
                                        break;
                                    } else {
                                        i41 = i13 + 8;
                                        i45 |= i102;
                                        unsafe2.putLong(obj, j, zzga.zzn(bArr3, i13));
                                        i36 = i2;
                                        i37 = i3;
                                        zzfzVar5 = zzfzVar3;
                                        i43 = i12;
                                        i46 = i52;
                                        i42 = i11;
                                        i38 = 3;
                                        i40 = -1;
                                        unsafe3 = unsafe2;
                                        i39 = 0;
                                    }
                                case 6:
                                case 13:
                                    i13 = i47;
                                    i11 = i49;
                                    unsafe2 = unsafe3;
                                    i12 = i8;
                                    zzfzVar3 = zzfzVar5;
                                    if (i50 != 5) {
                                        i4 = i3;
                                        i9 = i13;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i7 = i52;
                                        i49 = i11;
                                        zzfzVar2 = zzfzVar3;
                                        i43 = i12;
                                        break;
                                    } else {
                                        i41 = i13 + 4;
                                        i45 |= i102;
                                        unsafe2.putInt(obj, j, zzga.zzb(bArr3, i13));
                                        i36 = i2;
                                        i37 = i3;
                                        zzfzVar5 = zzfzVar3;
                                        i43 = i12;
                                        i46 = i52;
                                        i42 = i11;
                                        i38 = 3;
                                        i40 = -1;
                                        unsafe3 = unsafe2;
                                        i39 = 0;
                                    }
                                case 7:
                                    i13 = i47;
                                    i11 = i49;
                                    unsafe2 = unsafe3;
                                    i12 = i8;
                                    zzfzVar3 = zzfzVar5;
                                    if (i50 != 0) {
                                        i4 = i3;
                                        i9 = i13;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i7 = i52;
                                        i49 = i11;
                                        zzfzVar2 = zzfzVar3;
                                        i43 = i12;
                                        break;
                                    } else {
                                        i45 |= i102;
                                        i41 = zzga.zzk(bArr3, i13, zzfzVar3);
                                        zzjq.zzm(obj, j, zzfzVar3.zzb != 0);
                                        i36 = i2;
                                        i37 = i3;
                                        zzfzVar5 = zzfzVar3;
                                        i43 = i12;
                                        i46 = i52;
                                        i42 = i11;
                                        i38 = 3;
                                        i40 = -1;
                                        unsafe3 = unsafe2;
                                        i39 = 0;
                                    }
                                case 8:
                                    i13 = i47;
                                    i11 = i49;
                                    unsafe2 = unsafe3;
                                    int i105 = i52;
                                    i12 = i8;
                                    zzfzVar3 = zzfzVar5;
                                    if (i50 != 2) {
                                        i52 = i105;
                                        i4 = i3;
                                        i9 = i13;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i7 = i52;
                                        i49 = i11;
                                        zzfzVar2 = zzfzVar3;
                                        i43 = i12;
                                        break;
                                    } else {
                                        if ((i51 & TLObject.FLAG_29) != 0) {
                                            int i106 = i45 | i102;
                                            int zzh13 = zzga.zzh(bArr3, i13, zzfzVar3);
                                            int i107 = zzfzVar3.zza;
                                            if (i107 < 0) {
                                                throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i107 == 0) {
                                                zzfzVar3.zzc = "";
                                                i14 = i106;
                                                i52 = i105;
                                            } else {
                                                int i108 = zzjt.$r8$clinit;
                                                int length = bArr3.length;
                                                if ((((length - zzh13) - i107) | zzh13 | i107) < 0) {
                                                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(zzh13), Integer.valueOf(i107)));
                                                }
                                                int i109 = zzh13 + i107;
                                                char[] cArr = new char[i107];
                                                int i110 = 0;
                                                while (zzh13 < i109) {
                                                    byte b = bArr3[zzh13];
                                                    if (zzjr.zzd(b)) {
                                                        zzh13++;
                                                        cArr[i110] = (char) b;
                                                        i110++;
                                                    } else {
                                                        while (true) {
                                                            while (zzh13 < i109) {
                                                                int i111 = zzh13 + 1;
                                                                byte b2 = bArr3[zzh13];
                                                                if (zzjr.zzd(b2)) {
                                                                    cArr[i110] = (char) b2;
                                                                    i110++;
                                                                    zzh13 = i111;
                                                                    while (zzh13 < i109) {
                                                                        byte b3 = bArr3[zzh13];
                                                                        if (zzjr.zzd(b3)) {
                                                                            zzh13++;
                                                                            cArr[i110] = (char) b3;
                                                                            i110++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    int i112 = i106;
                                                                    if (b2 >= -32) {
                                                                        int i113 = i105;
                                                                        String str2 = str;
                                                                        if (b2 < -16) {
                                                                            if (i111 >= i109 - 1) {
                                                                                throw new zzhr(str2);
                                                                            }
                                                                            int i114 = zzh13 + 2;
                                                                            zzh13 += 3;
                                                                            zzjr.zzb(b2, bArr3[i111], bArr3[i114], cArr, i110);
                                                                            str = str2;
                                                                            i110++;
                                                                        } else {
                                                                            if (i111 >= i109 - 2) {
                                                                                throw new zzhr(str2);
                                                                            }
                                                                            byte b4 = bArr3[i111];
                                                                            int i115 = zzh13 + 3;
                                                                            byte b5 = bArr3[zzh13 + 2];
                                                                            zzh13 += 4;
                                                                            zzjr.zza(b2, b4, b5, bArr3[i115], cArr, i110);
                                                                            i110 += 2;
                                                                            str = str2;
                                                                        }
                                                                        i105 = i113;
                                                                    } else {
                                                                        if (i111 >= i109) {
                                                                            throw new zzhr(str);
                                                                        }
                                                                        zzh13 += 2;
                                                                        zzjr.zzc(b2, bArr3[i111], cArr, i110);
                                                                        i110++;
                                                                    }
                                                                    i106 = i112;
                                                                }
                                                            }
                                                            i14 = i106;
                                                            i52 = i105;
                                                            zzfzVar3.zzc = new String(cArr, 0, i110);
                                                            zzh13 = i109;
                                                        }
                                                    }
                                                }
                                                while (true) {
                                                    while (zzh13 < i109) {
                                                    }
                                                    i14 = i106;
                                                    i52 = i105;
                                                    zzfzVar3.zzc = new String(cArr, 0, i110);
                                                    zzh13 = i109;
                                                }
                                            }
                                            i45 = i14;
                                            i41 = zzh13;
                                        } else {
                                            i52 = i105;
                                            int zzh14 = zzga.zzh(bArr3, i13, zzfzVar3);
                                            int i116 = zzfzVar3.zza;
                                            if (i116 < 0) {
                                                throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            int i117 = i45 | i102;
                                            if (i116 == 0) {
                                                zzfzVar3.zzc = "";
                                            } else {
                                                zzfzVar3.zzc = new String(bArr3, zzh14, i116, zzhp.zza);
                                                zzh14 += i116;
                                            }
                                            i41 = zzh14;
                                            i45 = i117;
                                        }
                                        unsafe2.putObject(obj, j, zzfzVar3.zzc);
                                        i36 = i2;
                                        i37 = i3;
                                        zzfzVar5 = zzfzVar3;
                                        i43 = i12;
                                        i46 = i52;
                                        i42 = i11;
                                        i38 = 3;
                                        i40 = -1;
                                        unsafe3 = unsafe2;
                                        i39 = 0;
                                    }
                                    break;
                                case 9:
                                    i11 = i49;
                                    unsafe2 = unsafe3;
                                    i15 = i52;
                                    i12 = i8;
                                    zzfzVar3 = zzfzVar5;
                                    if (i50 != 2) {
                                        i13 = i47;
                                        i52 = i15;
                                        i4 = i3;
                                        i9 = i13;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i7 = i52;
                                        i49 = i11;
                                        zzfzVar2 = zzfzVar3;
                                        i43 = i12;
                                        break;
                                    } else {
                                        i45 |= i102;
                                        Object zzx = zzipVar4.zzx(obj, i12);
                                        i36 = i2;
                                        int zzm2 = zzga.zzm(zzx, zzipVar4.zzv(i12), bArr, i47, i36, zzfzVar);
                                        zzipVar4.zzF(obj, i12, zzx);
                                        i37 = i3;
                                        i41 = zzm2;
                                        zzfzVar5 = zzfzVar3;
                                        i46 = i15;
                                        i43 = i12;
                                        i42 = i11;
                                        i38 = 3;
                                        i40 = -1;
                                        unsafe3 = unsafe2;
                                        i39 = 0;
                                    }
                                case 10:
                                    i11 = i49;
                                    unsafe2 = unsafe3;
                                    i15 = i52;
                                    i12 = i8;
                                    zzfzVar3 = zzfzVar5;
                                    if (i50 != 2) {
                                        i13 = i47;
                                        i52 = i15;
                                        i4 = i3;
                                        i9 = i13;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i7 = i52;
                                        i49 = i11;
                                        zzfzVar2 = zzfzVar3;
                                        i43 = i12;
                                        break;
                                    } else {
                                        i45 |= i102;
                                        i41 = zzga.zza(bArr3, i47, zzfzVar3);
                                        unsafe2.putObject(obj, j, zzfzVar3.zzc);
                                        i36 = i2;
                                        i37 = i3;
                                        zzfzVar5 = zzfzVar3;
                                        i46 = i15;
                                        i43 = i12;
                                        i42 = i11;
                                        i38 = 3;
                                        i40 = -1;
                                        unsafe3 = unsafe2;
                                        i39 = 0;
                                    }
                                case 12:
                                    i11 = i49;
                                    unsafe2 = unsafe3;
                                    i15 = i52;
                                    i12 = i8;
                                    zzfzVar3 = zzfzVar5;
                                    if (i50 != 0) {
                                        i13 = i47;
                                        i52 = i15;
                                        i4 = i3;
                                        i9 = i13;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i7 = i52;
                                        i49 = i11;
                                        zzfzVar2 = zzfzVar3;
                                        i43 = i12;
                                        break;
                                    } else {
                                        i41 = zzga.zzh(bArr3, i47, zzfzVar3);
                                        int i118 = zzfzVar3.zza;
                                        zzhm zzu3 = zzipVar4.zzu(i12);
                                        if ((i51 & TLObject.FLAG_31) == 0 || zzu3 == null || zzu3.zza(i118)) {
                                            i45 |= i102;
                                            unsafe2.putInt(obj, j, i118);
                                        } else {
                                            zzd(obj).zzj(i15, Long.valueOf(i118));
                                        }
                                        i36 = i2;
                                        i37 = i3;
                                        zzfzVar5 = zzfzVar3;
                                        i46 = i15;
                                        i43 = i12;
                                        i42 = i11;
                                        i38 = 3;
                                        i40 = -1;
                                        unsafe3 = unsafe2;
                                        i39 = 0;
                                    }
                                case 15:
                                    i11 = i49;
                                    unsafe2 = unsafe3;
                                    i15 = i52;
                                    i12 = i8;
                                    zzfzVar3 = zzfzVar5;
                                    if (i50 != 0) {
                                        i13 = i47;
                                        i52 = i15;
                                        i4 = i3;
                                        i9 = i13;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i7 = i52;
                                        i49 = i11;
                                        zzfzVar2 = zzfzVar3;
                                        i43 = i12;
                                        break;
                                    } else {
                                        i45 |= i102;
                                        i41 = zzga.zzh(bArr3, i47, zzfzVar3);
                                        unsafe2.putInt(obj, j, zzgn.zzb(zzfzVar3.zza));
                                        i36 = i2;
                                        i37 = i3;
                                        zzfzVar5 = zzfzVar3;
                                        i46 = i15;
                                        i43 = i12;
                                        i42 = i11;
                                        i38 = 3;
                                        i40 = -1;
                                        unsafe3 = unsafe2;
                                        i39 = 0;
                                    }
                                case 16:
                                    i11 = i49;
                                    Unsafe unsafe8 = unsafe3;
                                    i12 = i8;
                                    if (i50 != 0) {
                                        unsafe2 = unsafe8;
                                        i13 = i47;
                                        zzfzVar3 = zzfzVar5;
                                        i52 = i52;
                                        i4 = i3;
                                        i9 = i13;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i7 = i52;
                                        i49 = i11;
                                        zzfzVar2 = zzfzVar3;
                                        i43 = i12;
                                        break;
                                    } else {
                                        i45 |= i102;
                                        i41 = zzga.zzk(bArr3, i47, zzfzVar5);
                                        unsafe2 = unsafe8;
                                        unsafe8.putLong(obj, j, zzgn.zzc(zzfzVar5.zzb));
                                        i36 = i2;
                                        i37 = i3;
                                        i46 = i52;
                                        zzfzVar5 = zzfzVar5;
                                        i43 = i12;
                                        i42 = i11;
                                        i38 = 3;
                                        i40 = -1;
                                        unsafe3 = unsafe2;
                                        i39 = 0;
                                    }
                                default:
                                    i38 = 3;
                                    if (i50 != 3) {
                                        i11 = i49;
                                        Unsafe unsafe9 = unsafe3;
                                        i12 = i8;
                                        i13 = i47;
                                        zzfzVar3 = zzfzVar5;
                                        unsafe2 = unsafe9;
                                        i4 = i3;
                                        i9 = i13;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i7 = i52;
                                        i49 = i11;
                                        zzfzVar2 = zzfzVar3;
                                        i43 = i12;
                                        break;
                                    } else {
                                        i45 |= i102;
                                        Object zzx2 = zzipVar4.zzx(obj, i8);
                                        int i119 = i8;
                                        i41 = zzga.zzl(zzx2, zzipVar4.zzv(i8), bArr, i47, i2, (i49 << 3) | 4, zzfzVar);
                                        zzipVar4.zzF(obj, i119, zzx2);
                                        i43 = i119;
                                        unsafe3 = unsafe3;
                                        i46 = i52;
                                        i42 = i49;
                                        i40 = -1;
                                        i39 = 0;
                                        i36 = i2;
                                        i37 = i3;
                                    }
                            }
                        }
                    } else {
                        zzfzVar2 = zzfzVar5;
                        i4 = i37;
                        i7 = i48;
                        unsafe = unsafe3;
                        bArr2 = bArr3;
                        i43 = 0;
                        i9 = i47;
                    }
                    if (i7 == i4 || i4 == 0) {
                        if (this.zzh) {
                            zzgw zzgwVar = zzfzVar2.zzd;
                            zzgw zzgwVar2 = zzgw.zza;
                            int i120 = zziu.$r8$clinit;
                            if (zzgwVar != zzgw.zza) {
                                zzim zzimVar = this.zzg;
                                int i121 = zzga.$r8$clinit;
                                zzgwVar.zzb(zzimVar, i49);
                                i10 = i7;
                                zzg = zzga.zzg(i7, bArr, i9, i2, zzd(obj), zzfzVar);
                                i36 = i2;
                                i37 = i4;
                                i46 = i10;
                                zzipVar4 = this;
                                i42 = i49;
                                bArr3 = bArr2;
                                zzfzVar5 = zzfzVar2;
                                unsafe3 = unsafe;
                                i38 = 3;
                                i40 = -1;
                                i39 = 0;
                                i41 = zzg;
                            }
                        }
                        i10 = i7;
                        zzg = zzga.zzg(i10, bArr, i9, i2, zzd(obj), zzfzVar);
                        i36 = i2;
                        i37 = i4;
                        i46 = i10;
                        zzipVar4 = this;
                        i42 = i49;
                        bArr3 = bArr2;
                        zzfzVar5 = zzfzVar2;
                        unsafe3 = unsafe;
                        i38 = 3;
                        i40 = -1;
                        i39 = 0;
                        i41 = zzg;
                    } else {
                        zzipVar = this;
                        i41 = i9;
                        i6 = i44;
                        i5 = i45;
                    }
                } else {
                    zzq = zzipVar4.zzq(i49, i39);
                }
                i8 = zzq;
                if (i8 == i40) {
                }
                if (i7 == i4) {
                }
                if (this.zzh) {
                }
                i10 = i7;
                zzg = zzga.zzg(i10, bArr, i9, i2, zzd(obj), zzfzVar);
                i36 = i2;
                i37 = i4;
                i46 = i10;
                zzipVar4 = this;
                i42 = i49;
                bArr3 = bArr2;
                zzfzVar5 = zzfzVar2;
                unsafe3 = unsafe;
                i38 = 3;
                i40 = -1;
                i39 = 0;
                i41 = zzg;
            } else {
                zzipVar = zzipVar4;
                i4 = i37;
                unsafe = unsafe3;
                i5 = i45;
                i6 = i44;
                i7 = i46;
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

    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v20 */
    @Override // com.google.android.gms.internal.play_billing.zzix
    public final void zzi(Object obj, zzjw zzjwVar) {
        int i;
        int i2;
        int i3;
        ?? r9 = 1;
        Throwable th = null;
        if (this.zzh) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
            throw null;
        }
        int[] iArr = this.zzc;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i7 < iArr.length) {
            int zzs = zzs(i7);
            int[] iArr2 = this.zzc;
            int zzr = zzr(zzs);
            int i8 = iArr2[i7];
            if (zzr <= 17) {
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
            long j = zzs & i4;
            switch (zzr) {
                case 0:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzjwVar.zzf(i8, zzjq.zza(obj, j));
                        continue;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    r9 = 1;
                    th = null;
                    i4 = 1048575;
                case 1:
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzjwVar.zzo(i8, zzjq.zzb(obj, j));
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
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzjwVar.zzt(i8, unsafe.getLong(obj, j));
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
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzjwVar.zzK(i8, unsafe.getLong(obj, j));
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
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzjwVar.zzr(i8, unsafe.getInt(obj, j));
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
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzjwVar.zzm(i8, unsafe.getLong(obj, j));
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
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzjwVar.zzk(i8, unsafe.getInt(obj, j));
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
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzjwVar.zzb(i8, zzjq.zzw(obj, j));
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
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzO(i8, unsafe.getObject(obj, j), zzjwVar);
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
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzjwVar.zzv(i8, unsafe.getObject(obj, j), zzv(i7));
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
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzjwVar.zzd(i8, (zzgk) unsafe.getObject(obj, j));
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
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzjwVar.zzI(i8, unsafe.getInt(obj, j));
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
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzjwVar.zzi(i8, unsafe.getInt(obj, j));
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
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzjwVar.zzx(i8, unsafe.getInt(obj, j));
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
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzjwVar.zzz(i8, unsafe.getLong(obj, j));
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
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzjwVar.zzB(i8, unsafe.getInt(obj, j));
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
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzjwVar.zzD(i8, unsafe.getLong(obj, j));
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
                    if (zzJ(obj, i7, i, i2, i3)) {
                        zzjwVar.zzq(i8, unsafe.getObject(obj, j), zzv(i7));
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
                    zziz.zzr(this.zzc[i7], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    break;
                case 19:
                    zziz.zzv(this.zzc[i7], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    break;
                case 20:
                    zziz.zzx(this.zzc[i7], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    break;
                case 21:
                    zziz.zzD(this.zzc[i7], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    break;
                case 22:
                    zziz.zzw(this.zzc[i7], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    break;
                case 23:
                    zziz.zzu(this.zzc[i7], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    break;
                case 24:
                    zziz.zzt(this.zzc[i7], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    break;
                case 25:
                    zziz.zzq(this.zzc[i7], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    break;
                case 26:
                    int i11 = this.zzc[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    int i12 = zziz.$r8$clinit;
                    if (list != null && !list.isEmpty()) {
                        zzjwVar.zzH(i11, list);
                        break;
                    }
                    break;
                case 27:
                    int i13 = this.zzc[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zzix zzv = zzv(i7);
                    int i14 = zziz.$r8$clinit;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i15 = 0; i15 < list2.size(); i15 += r9) {
                            ((zzgs) zzjwVar).zzv(i13, list2.get(i15), zzv);
                        }
                        break;
                    }
                    break;
                case 28:
                    int i16 = this.zzc[i7];
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i17 = zziz.$r8$clinit;
                    if (list3 != null && !list3.isEmpty()) {
                        zzjwVar.zze(i16, list3);
                        break;
                    }
                    break;
                case 29:
                    zziz.zzC(this.zzc[i7], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    break;
                case 30:
                    zziz.zzs(this.zzc[i7], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    break;
                case 31:
                    zziz.zzy(this.zzc[i7], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    break;
                case 32:
                    zziz.zzz(this.zzc[i7], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    break;
                case 33:
                    zziz.zzA(this.zzc[i7], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    break;
                case 34:
                    zziz.zzB(this.zzc[i7], (List) unsafe.getObject(obj, j), zzjwVar, false);
                    break;
                case 35:
                    zziz.zzr(this.zzc[i7], (List) unsafe.getObject(obj, j), zzjwVar, r9);
                    break;
                case 36:
                    zziz.zzv(this.zzc[i7], (List) unsafe.getObject(obj, j), zzjwVar, r9);
                    break;
                case 37:
                    zziz.zzx(this.zzc[i7], (List) unsafe.getObject(obj, j), zzjwVar, r9);
                    break;
                case 38:
                    zziz.zzD(this.zzc[i7], (List) unsafe.getObject(obj, j), zzjwVar, r9);
                    break;
                case 39:
                    zziz.zzw(this.zzc[i7], (List) unsafe.getObject(obj, j), zzjwVar, r9);
                    break;
                case 40:
                    zziz.zzu(this.zzc[i7], (List) unsafe.getObject(obj, j), zzjwVar, r9);
                    break;
                case 41:
                    zziz.zzt(this.zzc[i7], (List) unsafe.getObject(obj, j), zzjwVar, r9);
                    break;
                case 42:
                    zziz.zzq(this.zzc[i7], (List) unsafe.getObject(obj, j), zzjwVar, r9);
                    break;
                case 43:
                    zziz.zzC(this.zzc[i7], (List) unsafe.getObject(obj, j), zzjwVar, r9);
                    break;
                case 44:
                    zziz.zzs(this.zzc[i7], (List) unsafe.getObject(obj, j), zzjwVar, r9);
                    break;
                case 45:
                    zziz.zzy(this.zzc[i7], (List) unsafe.getObject(obj, j), zzjwVar, r9);
                    break;
                case 46:
                    zziz.zzz(this.zzc[i7], (List) unsafe.getObject(obj, j), zzjwVar, r9);
                    break;
                case 47:
                    zziz.zzA(this.zzc[i7], (List) unsafe.getObject(obj, j), zzjwVar, r9);
                    break;
                case 48:
                    zziz.zzB(this.zzc[i7], (List) unsafe.getObject(obj, j), zzjwVar, r9);
                    break;
                case 49:
                    int i18 = this.zzc[i7];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zzix zzv2 = zzv(i7);
                    int i19 = zziz.$r8$clinit;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i20 = 0; i20 < list4.size(); i20 += r9) {
                            ((zzgs) zzjwVar).zzq(i18, list4.get(i20), zzv2);
                        }
                        break;
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzw(i7));
                        throw th;
                    }
                    break;
                case 51:
                    if (zzM(obj, i8, i7)) {
                        zzjwVar.zzf(i8, zzm(obj, j));
                        break;
                    }
                    break;
                case 52:
                    if (zzM(obj, i8, i7)) {
                        zzjwVar.zzo(i8, zzn(obj, j));
                        break;
                    }
                    break;
                case 53:
                    if (zzM(obj, i8, i7)) {
                        zzjwVar.zzt(i8, zzt(obj, j));
                        break;
                    }
                    break;
                case 54:
                    if (zzM(obj, i8, i7)) {
                        zzjwVar.zzK(i8, zzt(obj, j));
                        break;
                    }
                    break;
                case 55:
                    if (zzM(obj, i8, i7)) {
                        zzjwVar.zzr(i8, zzo(obj, j));
                        break;
                    }
                    break;
                case 56:
                    if (zzM(obj, i8, i7)) {
                        zzjwVar.zzm(i8, zzt(obj, j));
                        break;
                    }
                    break;
                case 57:
                    if (zzM(obj, i8, i7)) {
                        zzjwVar.zzk(i8, zzo(obj, j));
                        break;
                    }
                    break;
                case 58:
                    if (zzM(obj, i8, i7)) {
                        zzjwVar.zzb(i8, zzN(obj, j));
                        break;
                    }
                    break;
                case 59:
                    if (zzM(obj, i8, i7)) {
                        zzO(i8, unsafe.getObject(obj, j), zzjwVar);
                        break;
                    }
                    break;
                case 60:
                    if (zzM(obj, i8, i7)) {
                        zzjwVar.zzv(i8, unsafe.getObject(obj, j), zzv(i7));
                        break;
                    }
                    break;
                case 61:
                    if (zzM(obj, i8, i7)) {
                        zzjwVar.zzd(i8, (zzgk) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    if (zzM(obj, i8, i7)) {
                        zzjwVar.zzI(i8, zzo(obj, j));
                        break;
                    }
                    break;
                case 63:
                    if (zzM(obj, i8, i7)) {
                        zzjwVar.zzi(i8, zzo(obj, j));
                        break;
                    }
                    break;
                case 64:
                    if (zzM(obj, i8, i7)) {
                        zzjwVar.zzx(i8, zzo(obj, j));
                        break;
                    }
                    break;
                case 65:
                    if (zzM(obj, i8, i7)) {
                        zzjwVar.zzz(i8, zzt(obj, j));
                        break;
                    }
                    break;
                case 66:
                    if (zzM(obj, i8, i7)) {
                        zzjwVar.zzB(i8, zzo(obj, j));
                        break;
                    }
                    break;
                case 67:
                    if (zzM(obj, i8, i7)) {
                        zzjwVar.zzD(i8, zzt(obj, j));
                        break;
                    }
                    break;
                case 68:
                    if (zzM(obj, i8, i7)) {
                        zzjwVar.zzq(i8, unsafe.getObject(obj, j), zzv(i7));
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
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i5];
            int i7 = iArr2[i6];
            int zzs = zzs(i6);
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
            if ((268435456 & zzs) != 0 && !zzJ(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzr = zzr(zzs);
            if (zzr != 9 && zzr != 17) {
                if (zzr != 27) {
                    if (zzr == 60 || zzr == 68) {
                        if (zzM(obj, i7, i6) && !zzK(obj, zzs, zzv(i6))) {
                            return false;
                        }
                    } else if (zzr != 49) {
                        if (zzr == 50 && !((zzig) zzjq.zzf(obj, zzs & 1048575)).isEmpty()) {
                            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzw(i6));
                            throw null;
                        }
                    }
                }
                List list = (List) zzjq.zzf(obj, zzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzix zzv = zzv(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzv.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzJ(obj, i6, i, i2, i10) && !zzK(obj, zzs, zzv(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (!this.zzh) {
            return true;
        }
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }
}
