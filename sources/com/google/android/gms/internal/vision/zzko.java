package com.google.android.gms.internal.vision;

import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.CharacterCompat;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzko implements zzlc {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzma.zzc();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzkk zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final int[] zzl;
    private final int zzm;
    private final int zzn;
    private final zzks zzo;
    private final zzju zzp;
    private final zzlu zzq;
    private final zziq zzr;
    private final zzkh zzs;

    private zzko(int[] iArr, Object[] objArr, int i, int i2, zzkk zzkkVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzks zzksVar, zzju zzjuVar, zzlu zzluVar, zziq zziqVar, zzkh zzkhVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzkkVar instanceof zzjb;
        this.zzj = z;
        this.zzh = zziqVar != null && zziqVar.zza(zzkkVar);
        this.zzk = false;
        this.zzl = iArr2;
        this.zzm = i3;
        this.zzn = i4;
        this.zzo = zzksVar;
        this.zzp = zzjuVar;
        this.zzq = zzluVar;
        this.zzr = zziqVar;
        this.zzg = zzkkVar;
        this.zzs = zzkhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzko zza(Class cls, zzki zzkiVar, zzks zzksVar, zzju zzjuVar, zzlu zzluVar, zziq zziqVar, zzkh zzkhVar) {
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int charAt4;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        char charAt5;
        int i5;
        char charAt6;
        int i6;
        char charAt7;
        int i7;
        char charAt8;
        int i8;
        char charAt9;
        int i9;
        char charAt10;
        int i10;
        char charAt11;
        int i11;
        char charAt12;
        int i12;
        int i13;
        int i14;
        int objectFieldOffset;
        String str;
        int i15;
        int i16;
        int i17;
        int i18;
        Field zza2;
        char charAt13;
        int i19;
        Object obj;
        Field zza3;
        Object obj2;
        Field zza4;
        int i20;
        char charAt14;
        int i21;
        char charAt15;
        int i22;
        int i23;
        char charAt16;
        int i24;
        char charAt17;
        if (zzkiVar instanceof zzla) {
            zzla zzlaVar = (zzla) zzkiVar;
            int i25 = 0;
            boolean z = zzlaVar.zza() == zzkz.zzb;
            String zzd = zzlaVar.zzd();
            int length = zzd.length();
            if (zzd.charAt(0) >= 55296) {
                int i26 = 1;
                while (true) {
                    i = i26 + 1;
                    if (zzd.charAt(i26) < 55296) {
                        break;
                    }
                    i26 = i;
                }
            } else {
                i = 1;
            }
            int i27 = i + 1;
            int charAt18 = zzd.charAt(i);
            if (charAt18 >= 55296) {
                int i28 = charAt18 & 8191;
                int i29 = 13;
                while (true) {
                    i24 = i27 + 1;
                    charAt17 = zzd.charAt(i27);
                    if (charAt17 < 55296) {
                        break;
                    }
                    i28 |= (charAt17 & 8191) << i29;
                    i29 += 13;
                    i27 = i24;
                }
                charAt18 = i28 | (charAt17 << i29);
                i27 = i24;
            }
            if (charAt18 == 0) {
                iArr = zza;
                i3 = 0;
                charAt = 0;
                charAt2 = 0;
                charAt3 = 0;
                i2 = 0;
                charAt4 = 0;
            } else {
                int i30 = i27 + 1;
                int charAt19 = zzd.charAt(i27);
                if (charAt19 >= 55296) {
                    int i31 = charAt19 & 8191;
                    int i32 = 13;
                    while (true) {
                        i11 = i30 + 1;
                        charAt12 = zzd.charAt(i30);
                        if (charAt12 < 55296) {
                            break;
                        }
                        i31 |= (charAt12 & 8191) << i32;
                        i32 += 13;
                        i30 = i11;
                    }
                    charAt19 = i31 | (charAt12 << i32);
                    i30 = i11;
                }
                int i33 = i30 + 1;
                int charAt20 = zzd.charAt(i30);
                if (charAt20 >= 55296) {
                    int i34 = charAt20 & 8191;
                    int i35 = 13;
                    while (true) {
                        i10 = i33 + 1;
                        charAt11 = zzd.charAt(i33);
                        if (charAt11 < 55296) {
                            break;
                        }
                        i34 |= (charAt11 & 8191) << i35;
                        i35 += 13;
                        i33 = i10;
                    }
                    charAt20 = i34 | (charAt11 << i35);
                    i33 = i10;
                }
                int i36 = i33 + 1;
                charAt = zzd.charAt(i33);
                if (charAt >= 55296) {
                    int i37 = charAt & 8191;
                    int i38 = 13;
                    while (true) {
                        i9 = i36 + 1;
                        charAt10 = zzd.charAt(i36);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i37 |= (charAt10 & 8191) << i38;
                        i38 += 13;
                        i36 = i9;
                    }
                    charAt = i37 | (charAt10 << i38);
                    i36 = i9;
                }
                int i39 = i36 + 1;
                charAt2 = zzd.charAt(i36);
                if (charAt2 >= 55296) {
                    int i40 = charAt2 & 8191;
                    int i41 = 13;
                    while (true) {
                        i8 = i39 + 1;
                        charAt9 = zzd.charAt(i39);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i40 |= (charAt9 & 8191) << i41;
                        i41 += 13;
                        i39 = i8;
                    }
                    charAt2 = i40 | (charAt9 << i41);
                    i39 = i8;
                }
                int i42 = i39 + 1;
                charAt3 = zzd.charAt(i39);
                if (charAt3 >= 55296) {
                    int i43 = charAt3 & 8191;
                    int i44 = 13;
                    while (true) {
                        i7 = i42 + 1;
                        charAt8 = zzd.charAt(i42);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i43 |= (charAt8 & 8191) << i44;
                        i44 += 13;
                        i42 = i7;
                    }
                    charAt3 = i43 | (charAt8 << i44);
                    i42 = i7;
                }
                int i45 = i42 + 1;
                int charAt21 = zzd.charAt(i42);
                if (charAt21 >= 55296) {
                    int i46 = charAt21 & 8191;
                    int i47 = 13;
                    while (true) {
                        i6 = i45 + 1;
                        charAt7 = zzd.charAt(i45);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i46 |= (charAt7 & 8191) << i47;
                        i47 += 13;
                        i45 = i6;
                    }
                    charAt21 = i46 | (charAt7 << i47);
                    i45 = i6;
                }
                int i48 = i45 + 1;
                int charAt22 = zzd.charAt(i45);
                if (charAt22 >= 55296) {
                    int i49 = charAt22 & 8191;
                    int i50 = 13;
                    while (true) {
                        i5 = i48 + 1;
                        charAt6 = zzd.charAt(i48);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i49 |= (charAt6 & 8191) << i50;
                        i50 += 13;
                        i48 = i5;
                    }
                    charAt22 = i49 | (charAt6 << i50);
                    i48 = i5;
                }
                int i51 = i48 + 1;
                charAt4 = zzd.charAt(i48);
                if (charAt4 >= 55296) {
                    int i52 = charAt4 & 8191;
                    int i53 = i51;
                    int i54 = 13;
                    while (true) {
                        i4 = i53 + 1;
                        charAt5 = zzd.charAt(i53);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i52 |= (charAt5 & 8191) << i54;
                        i54 += 13;
                        i53 = i4;
                    }
                    charAt4 = i52 | (charAt5 << i54);
                    i51 = i4;
                }
                int[] iArr2 = new int[charAt4 + charAt21 + charAt22];
                i2 = (charAt19 << 1) + charAt20;
                i3 = charAt21;
                iArr = iArr2;
                i25 = charAt19;
                i27 = i51;
            }
            Unsafe unsafe = zzb;
            Object[] zze = zzlaVar.zze();
            Class<?> cls2 = zzlaVar.zzc().getClass();
            int[] iArr3 = new int[charAt3 * 3];
            Object[] objArr = new Object[charAt3 << 1];
            int i55 = i3 + charAt4;
            int i56 = i55;
            int i57 = charAt4;
            int i58 = 0;
            int i59 = 0;
            while (i27 < length) {
                int i60 = i27 + 1;
                int charAt23 = zzd.charAt(i27);
                zzla zzlaVar2 = zzlaVar;
                if (charAt23 >= 55296) {
                    int i61 = charAt23 & 8191;
                    int i62 = i60;
                    int i63 = 13;
                    while (true) {
                        i23 = i62 + 1;
                        charAt16 = zzd.charAt(i62);
                        i12 = length;
                        if (charAt16 < 55296) {
                            break;
                        }
                        i61 |= (charAt16 & 8191) << i63;
                        i63 += 13;
                        i62 = i23;
                        length = i12;
                    }
                    charAt23 = i61 | (charAt16 << i63);
                    i13 = i23;
                } else {
                    i12 = length;
                    i13 = i60;
                }
                int i64 = i13 + 1;
                int charAt24 = zzd.charAt(i13);
                if (charAt24 >= 55296) {
                    int i65 = charAt24 & 8191;
                    int i66 = i64;
                    int i67 = 13;
                    while (true) {
                        i21 = i66 + 1;
                        charAt15 = zzd.charAt(i66);
                        i22 = i65;
                        if (charAt15 < 55296) {
                            break;
                        }
                        i65 = i22 | ((charAt15 & 8191) << i67);
                        i67 += 13;
                        i66 = i21;
                    }
                    charAt24 = i22 | (charAt15 << i67);
                    i14 = i21;
                } else {
                    i14 = i64;
                }
                int i68 = i25;
                int i69 = charAt24 & NotificationCenter.didReceiveSmsCode;
                int i70 = charAt23;
                if ((charAt24 & 1024) != 0) {
                    iArr[i58] = i59;
                    i58++;
                }
                int[] iArr4 = iArr3;
                if (i69 >= 51) {
                    int i71 = i14 + 1;
                    int charAt25 = zzd.charAt(i14);
                    char c = CharacterCompat.MIN_HIGH_SURROGATE;
                    if (charAt25 >= 55296) {
                        int i72 = charAt25 & 8191;
                        int i73 = 13;
                        while (true) {
                            i20 = i71 + 1;
                            charAt14 = zzd.charAt(i71);
                            if (charAt14 < c) {
                                break;
                            }
                            i72 |= (charAt14 & 8191) << i73;
                            i73 += 13;
                            i71 = i20;
                            c = CharacterCompat.MIN_HIGH_SURROGATE;
                        }
                        charAt25 = i72 | (charAt14 << i73);
                        i71 = i20;
                    }
                    int i74 = i69 - 51;
                    int i75 = charAt25;
                    if (i74 == 9 || i74 == 17) {
                        i19 = i2 + 1;
                        objArr[((i59 / 3) << 1) + 1] = zze[i2];
                    } else {
                        if (i74 == 12 && !z) {
                            i19 = i2 + 1;
                            objArr[((i59 / 3) << 1) + 1] = zze[i2];
                        }
                        int i76 = i75 << 1;
                        obj = zze[i76];
                        if (!(obj instanceof Field)) {
                            zza3 = (Field) obj;
                        } else {
                            zza3 = zza((Class) cls2, (String) obj);
                            zze[i76] = zza3;
                        }
                        int i77 = i71;
                        int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zza3);
                        int i78 = i76 + 1;
                        obj2 = zze[i78];
                        if (!(obj2 instanceof Field)) {
                            zza4 = (Field) obj2;
                        } else {
                            zza4 = zza((Class) cls2, (String) obj2);
                            zze[i78] = zza4;
                        }
                        str = zzd;
                        i15 = (int) unsafe.objectFieldOffset(zza4);
                        i27 = i77;
                        i18 = objectFieldOffset2;
                        i17 = 0;
                    }
                    i2 = i19;
                    int i762 = i75 << 1;
                    obj = zze[i762];
                    if (!(obj instanceof Field)) {
                    }
                    int i772 = i71;
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zza3);
                    int i782 = i762 + 1;
                    obj2 = zze[i782];
                    if (!(obj2 instanceof Field)) {
                    }
                    str = zzd;
                    i15 = (int) unsafe.objectFieldOffset(zza4);
                    i27 = i772;
                    i18 = objectFieldOffset22;
                    i17 = 0;
                } else {
                    int i79 = i2 + 1;
                    Field zza5 = zza((Class) cls2, (String) zze[i2]);
                    if (i69 == 9 || i69 == 17) {
                        objArr[((i59 / 3) << 1) + 1] = zza5.getType();
                    } else {
                        if (i69 == 27 || i69 == 49) {
                            i2 += 2;
                            objArr[((i59 / 3) << 1) + 1] = zze[i79];
                        } else if (i69 == 12 || i69 == 30 || i69 == 44) {
                            if (!z) {
                                i2 += 2;
                                objArr[((i59 / 3) << 1) + 1] = zze[i79];
                            }
                        } else if (i69 == 50) {
                            int i80 = i57 + 1;
                            iArr[i57] = i59;
                            int i81 = (i59 / 3) << 1;
                            int i82 = i2 + 2;
                            objArr[i81] = zze[i79];
                            if ((charAt24 & 2048) != 0) {
                                objArr[i81 + 1] = zze[i82];
                                i2 += 3;
                            } else {
                                i2 = i82;
                            }
                            i57 = i80;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zza5);
                        if ((charAt24 & 4096) == 4096 || i69 > 17) {
                            str = zzd;
                            i15 = 1048575;
                            i16 = i14;
                            i17 = 0;
                        } else {
                            int i83 = i14 + 1;
                            int charAt26 = zzd.charAt(i14);
                            if (charAt26 >= 55296) {
                                int i84 = charAt26 & 8191;
                                int i85 = 13;
                                while (true) {
                                    i16 = i83 + 1;
                                    charAt13 = zzd.charAt(i83);
                                    if (charAt13 < 55296) {
                                        break;
                                    }
                                    i84 |= (charAt13 & 8191) << i85;
                                    i85 += 13;
                                    i83 = i16;
                                }
                                charAt26 = i84 | (charAt13 << i85);
                            } else {
                                i16 = i83;
                            }
                            int i86 = (i68 << 1) + (charAt26 / 32);
                            Object obj3 = zze[i86];
                            str = zzd;
                            if (obj3 instanceof Field) {
                                zza2 = (Field) obj3;
                            } else {
                                zza2 = zza((Class) cls2, (String) obj3);
                                zze[i86] = zza2;
                            }
                            i15 = (int) unsafe.objectFieldOffset(zza2);
                            i17 = charAt26 % 32;
                        }
                        if (i69 >= 18 && i69 <= 49) {
                            iArr[i56] = objectFieldOffset;
                            i56++;
                        }
                        i18 = objectFieldOffset;
                        i27 = i16;
                    }
                    i2 = i79;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zza5);
                    if ((charAt24 & 4096) == 4096) {
                    }
                    str = zzd;
                    i15 = 1048575;
                    i16 = i14;
                    i17 = 0;
                    if (i69 >= 18) {
                        iArr[i56] = objectFieldOffset;
                        i56++;
                    }
                    i18 = objectFieldOffset;
                    i27 = i16;
                }
                int i87 = i59 + 1;
                iArr4[i59] = i70;
                int i88 = i59 + 2;
                int i89 = i15;
                iArr4[i87] = ((charAt24 & 256) != 0 ? TLObject.FLAG_28 : 0) | ((charAt24 & 512) != 0 ? TLObject.FLAG_29 : 0) | (i69 << 20) | i18;
                i59 += 3;
                iArr4[i88] = (i17 << 20) | i89;
                i25 = i68;
                zzlaVar = zzlaVar2;
                length = i12;
                iArr3 = iArr4;
                zzd = str;
            }
            return new zzko(iArr3, objArr, charAt, charAt2, zzlaVar.zzc(), z, false, iArr, charAt4, i55, zzksVar, zzjuVar, zzluVar, zziqVar, zzkhVar);
        }
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzkiVar);
        throw null;
    }

    private static Field zza(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final Object zza() {
        return this.zzo.zza(this.zzg);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (com.google.android.gms.internal.vision.zzle.zza(com.google.android.gms.internal.vision.zzma.zzf(r10, r6), com.google.android.gms.internal.vision.zzma.zzf(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (com.google.android.gms.internal.vision.zzma.zzb(r10, r6) == com.google.android.gms.internal.vision.zzma.zzb(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (com.google.android.gms.internal.vision.zzma.zza(r10, r6) == com.google.android.gms.internal.vision.zzma.zza(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
    
        if (com.google.android.gms.internal.vision.zzma.zzb(r10, r6) == com.google.android.gms.internal.vision.zzma.zzb(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        if (com.google.android.gms.internal.vision.zzma.zza(r10, r6) == com.google.android.gms.internal.vision.zzma.zza(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c4, code lost:
    
        if (com.google.android.gms.internal.vision.zzma.zza(r10, r6) == com.google.android.gms.internal.vision.zzma.zza(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:
    
        if (com.google.android.gms.internal.vision.zzma.zza(r10, r6) == com.google.android.gms.internal.vision.zzma.zza(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
    
        if (com.google.android.gms.internal.vision.zzle.zza(com.google.android.gms.internal.vision.zzma.zzf(r10, r6), com.google.android.gms.internal.vision.zzma.zzf(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0102, code lost:
    
        if (com.google.android.gms.internal.vision.zzle.zza(com.google.android.gms.internal.vision.zzma.zzf(r10, r6), com.google.android.gms.internal.vision.zzma.zzf(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0118, code lost:
    
        if (com.google.android.gms.internal.vision.zzle.zza(com.google.android.gms.internal.vision.zzma.zzf(r10, r6), com.google.android.gms.internal.vision.zzma.zzf(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012a, code lost:
    
        if (com.google.android.gms.internal.vision.zzma.zzc(r10, r6) == com.google.android.gms.internal.vision.zzma.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013c, code lost:
    
        if (com.google.android.gms.internal.vision.zzma.zza(r10, r6) == com.google.android.gms.internal.vision.zzma.zza(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0150, code lost:
    
        if (com.google.android.gms.internal.vision.zzma.zzb(r10, r6) == com.google.android.gms.internal.vision.zzma.zzb(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0162, code lost:
    
        if (com.google.android.gms.internal.vision.zzma.zza(r10, r6) == com.google.android.gms.internal.vision.zzma.zza(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0176, code lost:
    
        if (com.google.android.gms.internal.vision.zzma.zzb(r10, r6) == com.google.android.gms.internal.vision.zzma.zzb(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018a, code lost:
    
        if (com.google.android.gms.internal.vision.zzma.zzb(r10, r6) == com.google.android.gms.internal.vision.zzma.zzb(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.vision.zzma.zzd(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.vision.zzma.zzd(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c0, code lost:
    
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.vision.zzma.zze(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.vision.zzma.zze(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.vision.zzle.zza(com.google.android.gms.internal.vision.zzma.zzf(r10, r6), com.google.android.gms.internal.vision.zzma.zzf(r11, r6)) != false) goto L105;
     */
    @Override // com.google.android.gms.internal.vision.zzlc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(Object obj, Object obj2) {
        int length = this.zzc.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int zzd = zzd(i);
                long j = zzd & 1048575;
                switch ((zzd & 267386880) >>> 20) {
                    case 0:
                        if (zzc(obj, obj2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (zzc(obj, obj2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (zzc(obj, obj2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (zzc(obj, obj2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (zzc(obj, obj2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (zzc(obj, obj2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (zzc(obj, obj2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (zzc(obj, obj2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (zzc(obj, obj2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (zzc(obj, obj2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (zzc(obj, obj2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (zzc(obj, obj2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (zzc(obj, obj2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (zzc(obj, obj2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (zzc(obj, obj2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (zzc(obj, obj2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (zzc(obj, obj2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (zzc(obj, obj2, i)) {
                            break;
                        }
                        z = false;
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
                        z = zzle.zza(zzma.zzf(obj, j), zzma.zzf(obj2, j));
                        break;
                    case 50:
                        z = zzle.zza(zzma.zzf(obj, j), zzma.zzf(obj2, j));
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
                        long zze = zze(i) & 1048575;
                        if (zzma.zza(obj, zze) == zzma.zza(obj2, zze)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (!z) {
                    return false;
                }
                i += 3;
            } else {
                if (!this.zzq.zzb(obj).equals(this.zzq.zzb(obj2))) {
                    return false;
                }
                if (this.zzh) {
                    return this.zzr.zza(obj).equals(this.zzr.zza(obj2));
                }
                return true;
            }
        }
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final int zza(Object obj) {
        int i;
        int zza2;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzd = zzd(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzd;
            int i5 = 37;
            switch ((zzd & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    zza2 = zzjf.zza(Double.doubleToLongBits(zzma.zze(obj, j)));
                    i2 = i + zza2;
                    break;
                case 1:
                    i = i2 * 53;
                    zza2 = Float.floatToIntBits(zzma.zzd(obj, j));
                    i2 = i + zza2;
                    break;
                case 2:
                    i = i2 * 53;
                    zza2 = zzjf.zza(zzma.zzb(obj, j));
                    i2 = i + zza2;
                    break;
                case 3:
                    i = i2 * 53;
                    zza2 = zzjf.zza(zzma.zzb(obj, j));
                    i2 = i + zza2;
                    break;
                case 4:
                    i = i2 * 53;
                    zza2 = zzma.zza(obj, j);
                    i2 = i + zza2;
                    break;
                case 5:
                    i = i2 * 53;
                    zza2 = zzjf.zza(zzma.zzb(obj, j));
                    i2 = i + zza2;
                    break;
                case 6:
                    i = i2 * 53;
                    zza2 = zzma.zza(obj, j);
                    i2 = i + zza2;
                    break;
                case 7:
                    i = i2 * 53;
                    zza2 = zzjf.zza(zzma.zzc(obj, j));
                    i2 = i + zza2;
                    break;
                case 8:
                    i = i2 * 53;
                    zza2 = ((String) zzma.zzf(obj, j)).hashCode();
                    i2 = i + zza2;
                    break;
                case 9:
                    Object zzf = zzma.zzf(obj, j);
                    if (zzf != null) {
                        i5 = zzf.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zza2 = zzma.zzf(obj, j).hashCode();
                    i2 = i + zza2;
                    break;
                case 11:
                    i = i2 * 53;
                    zza2 = zzma.zza(obj, j);
                    i2 = i + zza2;
                    break;
                case 12:
                    i = i2 * 53;
                    zza2 = zzma.zza(obj, j);
                    i2 = i + zza2;
                    break;
                case 13:
                    i = i2 * 53;
                    zza2 = zzma.zza(obj, j);
                    i2 = i + zza2;
                    break;
                case 14:
                    i = i2 * 53;
                    zza2 = zzjf.zza(zzma.zzb(obj, j));
                    i2 = i + zza2;
                    break;
                case 15:
                    i = i2 * 53;
                    zza2 = zzma.zza(obj, j);
                    i2 = i + zza2;
                    break;
                case 16:
                    i = i2 * 53;
                    zza2 = zzjf.zza(zzma.zzb(obj, j));
                    i2 = i + zza2;
                    break;
                case 17:
                    Object zzf2 = zzma.zzf(obj, j);
                    if (zzf2 != null) {
                        i5 = zzf2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
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
                    i = i2 * 53;
                    zza2 = zzma.zzf(obj, j).hashCode();
                    i2 = i + zza2;
                    break;
                case 50:
                    i = i2 * 53;
                    zza2 = zzma.zzf(obj, j).hashCode();
                    i2 = i + zza2;
                    break;
                case 51:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjf.zza(Double.doubleToLongBits(zzb(obj, j)));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = Float.floatToIntBits(zzc(obj, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjf.zza(zze(obj, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjf.zza(zze(obj, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(obj, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjf.zza(zze(obj, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(obj, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjf.zza(zzf(obj, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = ((String) zzma.zzf(obj, j)).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzma.zzf(obj, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzma.zzf(obj, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(obj, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(obj, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(obj, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjf.zza(zze(obj, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(obj, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjf.zza(zze(obj, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzma.zzf(obj, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzq.zzb(obj).hashCode();
        return this.zzh ? (hashCode * 53) + this.zzr.zza(obj).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final void zzb(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzd = zzd(i);
            long j = 1048575 & zzd;
            int i2 = this.zzc[i];
            switch ((zzd & 267386880) >>> 20) {
                case 0:
                    if (zza(obj2, i)) {
                        zzma.zza(obj, j, zzma.zze(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza(obj2, i)) {
                        zzma.zza(obj, j, zzma.zzd(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zza(obj2, i)) {
                        zzma.zza(obj, j, zzma.zzb(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zza(obj2, i)) {
                        zzma.zza(obj, j, zzma.zzb(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zza(obj2, i)) {
                        zzma.zza(obj, j, zzma.zza(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zza(obj2, i)) {
                        zzma.zza(obj, j, zzma.zzb(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza(obj2, i)) {
                        zzma.zza(obj, j, zzma.zza(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zza(obj2, i)) {
                        zzma.zza(obj, j, zzma.zzc(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zza(obj2, i)) {
                        zzma.zza(obj, j, zzma.zzf(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(obj, obj2, i);
                    break;
                case 10:
                    if (zza(obj2, i)) {
                        zzma.zza(obj, j, zzma.zzf(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zza(obj2, i)) {
                        zzma.zza(obj, j, zzma.zza(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zza(obj2, i)) {
                        zzma.zza(obj, j, zzma.zza(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zza(obj2, i)) {
                        zzma.zza(obj, j, zzma.zza(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zza(obj2, i)) {
                        zzma.zza(obj, j, zzma.zzb(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zza(obj2, i)) {
                        zzma.zza(obj, j, zzma.zza(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zza(obj2, i)) {
                        zzma.zza(obj, j, zzma.zzb(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(obj, obj2, i);
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
                    this.zzp.zza(obj, obj2, j);
                    break;
                case 50:
                    zzle.zza(this.zzs, obj, obj2, j);
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
                    if (zza(obj2, i2, i)) {
                        zzma.zza(obj, j, zzma.zzf(obj2, j));
                        zzb(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zza(obj2, i2, i)) {
                        zzma.zza(obj, j, zzma.zzf(obj2, j));
                        zzb(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(obj, obj2, i);
                    break;
            }
        }
        zzle.zza(this.zzq, obj, obj2);
        if (this.zzh) {
            zzle.zza(this.zzr, obj, obj2);
        }
    }

    private final void zza(Object obj, Object obj2, int i) {
        long zzd = zzd(i) & 1048575;
        if (zza(obj2, i)) {
            Object zzf = zzma.zzf(obj, zzd);
            Object zzf2 = zzma.zzf(obj2, zzd);
            if (zzf != null && zzf2 != null) {
                zzma.zza(obj, zzd, zzjf.zza(zzf, zzf2));
                zzb(obj, i);
            } else if (zzf2 != null) {
                zzma.zza(obj, zzd, zzf2);
                zzb(obj, i);
            }
        }
    }

    private final void zzb(Object obj, Object obj2, int i) {
        int zzd = zzd(i);
        int i2 = this.zzc[i];
        long j = zzd & 1048575;
        if (zza(obj2, i2, i)) {
            Object zzf = zza(obj, i2, i) ? zzma.zzf(obj, j) : null;
            Object zzf2 = zzma.zzf(obj2, j);
            if (zzf != null && zzf2 != null) {
                zzma.zza(obj, j, zzjf.zza(zzf, zzf2));
                zzb(obj, i2, i);
            } else if (zzf2 != null) {
                zzma.zza(obj, j, zzf2);
                zzb(obj, i2, i);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.vision.zzlc
    public final int zzb(Object obj) {
        int i;
        int zzd;
        int zzb2;
        int zzj;
        int zzi;
        int zze;
        int zzg;
        int zzb3;
        int zzi2;
        int zze2;
        int zzg2;
        int i2 = 267386880;
        if (this.zzj) {
            Unsafe unsafe = zzb;
            int i3 = 0;
            int i4 = 0;
            while (i3 < this.zzc.length) {
                int zzd2 = zzd(i3);
                int i5 = (zzd2 & i2) >>> 20;
                int i6 = this.zzc[i3];
                long j = zzd2 & 1048575;
                if (i5 >= zziv.zza.zza() && i5 <= zziv.zzb.zza()) {
                    int i7 = this.zzc[i3 + 2];
                }
                switch (i5) {
                    case 0:
                        if (zza(obj, i3)) {
                            zzb3 = zzii.zzb(i6, 0.0d);
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zza(obj, i3)) {
                            zzb3 = zzii.zzb(i6, 0.0f);
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zza(obj, i3)) {
                            zzb3 = zzii.zzd(i6, zzma.zzb(obj, j));
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zza(obj, i3)) {
                            zzb3 = zzii.zze(i6, zzma.zzb(obj, j));
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zza(obj, i3)) {
                            zzb3 = zzii.zzf(i6, zzma.zza(obj, j));
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zza(obj, i3)) {
                            zzb3 = zzii.zzg(i6, 0L);
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zza(obj, i3)) {
                            zzb3 = zzii.zzi(i6, 0);
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zza(obj, i3)) {
                            zzb3 = zzii.zzb(i6, true);
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zza(obj, i3)) {
                            Object zzf = zzma.zzf(obj, j);
                            if (zzf instanceof zzht) {
                                zzb3 = zzii.zzc(i6, (zzht) zzf);
                            } else {
                                zzb3 = zzii.zzb(i6, (String) zzf);
                            }
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zza(obj, i3)) {
                            zzb3 = zzle.zza(i6, zzma.zzf(obj, j), zza(i3));
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zza(obj, i3)) {
                            zzb3 = zzii.zzc(i6, (zzht) zzma.zzf(obj, j));
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zza(obj, i3)) {
                            zzb3 = zzii.zzg(i6, zzma.zza(obj, j));
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zza(obj, i3)) {
                            zzb3 = zzii.zzk(i6, zzma.zza(obj, j));
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zza(obj, i3)) {
                            zzb3 = zzii.zzj(i6, 0);
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zza(obj, i3)) {
                            zzb3 = zzii.zzh(i6, 0L);
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zza(obj, i3)) {
                            zzb3 = zzii.zzh(i6, zzma.zza(obj, j));
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zza(obj, i3)) {
                            zzb3 = zzii.zzf(i6, zzma.zzb(obj, j));
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zza(obj, i3)) {
                            zzb3 = zzii.zzc(i6, (zzkk) zzma.zzf(obj, j), zza(i3));
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzb3 = zzle.zzi(i6, zza(obj, j), false);
                        i4 += zzb3;
                        break;
                    case 19:
                        zzb3 = zzle.zzh(i6, zza(obj, j), false);
                        i4 += zzb3;
                        break;
                    case 20:
                        zzb3 = zzle.zza(i6, zza(obj, j), false);
                        i4 += zzb3;
                        break;
                    case 21:
                        zzb3 = zzle.zzb(i6, zza(obj, j), false);
                        i4 += zzb3;
                        break;
                    case 22:
                        zzb3 = zzle.zze(i6, zza(obj, j), false);
                        i4 += zzb3;
                        break;
                    case 23:
                        zzb3 = zzle.zzi(i6, zza(obj, j), false);
                        i4 += zzb3;
                        break;
                    case 24:
                        zzb3 = zzle.zzh(i6, zza(obj, j), false);
                        i4 += zzb3;
                        break;
                    case 25:
                        zzb3 = zzle.zzj(i6, zza(obj, j), false);
                        i4 += zzb3;
                        break;
                    case 26:
                        zzb3 = zzle.zza(i6, zza(obj, j));
                        i4 += zzb3;
                        break;
                    case 27:
                        zzb3 = zzle.zza(i6, zza(obj, j), zza(i3));
                        i4 += zzb3;
                        break;
                    case 28:
                        zzb3 = zzle.zzb(i6, zza(obj, j));
                        i4 += zzb3;
                        break;
                    case 29:
                        zzb3 = zzle.zzf(i6, zza(obj, j), false);
                        i4 += zzb3;
                        break;
                    case 30:
                        zzb3 = zzle.zzd(i6, zza(obj, j), false);
                        i4 += zzb3;
                        break;
                    case 31:
                        zzb3 = zzle.zzh(i6, zza(obj, j), false);
                        i4 += zzb3;
                        break;
                    case 32:
                        zzb3 = zzle.zzi(i6, zza(obj, j), false);
                        i4 += zzb3;
                        break;
                    case 33:
                        zzb3 = zzle.zzg(i6, zza(obj, j), false);
                        i4 += zzb3;
                        break;
                    case 34:
                        zzb3 = zzle.zzc(i6, zza(obj, j), false);
                        i4 += zzb3;
                        break;
                    case 35:
                        zzi2 = zzle.zzi((List) unsafe.getObject(obj, j));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i6);
                            zzg2 = zzii.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        zzi2 = zzle.zzh((List) unsafe.getObject(obj, j));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i6);
                            zzg2 = zzii.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        zzi2 = zzle.zza((List) unsafe.getObject(obj, j));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i6);
                            zzg2 = zzii.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        zzi2 = zzle.zzb((List) unsafe.getObject(obj, j));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i6);
                            zzg2 = zzii.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        zzi2 = zzle.zze((List) unsafe.getObject(obj, j));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i6);
                            zzg2 = zzii.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        zzi2 = zzle.zzi((List) unsafe.getObject(obj, j));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i6);
                            zzg2 = zzii.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        zzi2 = zzle.zzh((List) unsafe.getObject(obj, j));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i6);
                            zzg2 = zzii.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        zzi2 = zzle.zzj((List) unsafe.getObject(obj, j));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i6);
                            zzg2 = zzii.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        zzi2 = zzle.zzf((List) unsafe.getObject(obj, j));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i6);
                            zzg2 = zzii.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        zzi2 = zzle.zzd((List) unsafe.getObject(obj, j));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i6);
                            zzg2 = zzii.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        zzi2 = zzle.zzh((List) unsafe.getObject(obj, j));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i6);
                            zzg2 = zzii.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        zzi2 = zzle.zzi((List) unsafe.getObject(obj, j));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i6);
                            zzg2 = zzii.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        zzi2 = zzle.zzg((List) unsafe.getObject(obj, j));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i6);
                            zzg2 = zzii.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        zzi2 = zzle.zzc((List) unsafe.getObject(obj, j));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i6);
                            zzg2 = zzii.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        zzb3 = zzle.zzb(i6, zza(obj, j), zza(i3));
                        i4 += zzb3;
                        break;
                    case 50:
                        zzb3 = this.zzs.zza(i6, zzma.zzf(obj, j), zzb(i3));
                        i4 += zzb3;
                        break;
                    case 51:
                        if (zza(obj, i6, i3)) {
                            zzb3 = zzii.zzb(i6, 0.0d);
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zza(obj, i6, i3)) {
                            zzb3 = zzii.zzb(i6, 0.0f);
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zza(obj, i6, i3)) {
                            zzb3 = zzii.zzd(i6, zze(obj, j));
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zza(obj, i6, i3)) {
                            zzb3 = zzii.zze(i6, zze(obj, j));
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zza(obj, i6, i3)) {
                            zzb3 = zzii.zzf(i6, zzd(obj, j));
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zza(obj, i6, i3)) {
                            zzb3 = zzii.zzg(i6, 0L);
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zza(obj, i6, i3)) {
                            zzb3 = zzii.zzi(i6, 0);
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zza(obj, i6, i3)) {
                            zzb3 = zzii.zzb(i6, true);
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zza(obj, i6, i3)) {
                            Object zzf2 = zzma.zzf(obj, j);
                            if (zzf2 instanceof zzht) {
                                zzb3 = zzii.zzc(i6, (zzht) zzf2);
                            } else {
                                zzb3 = zzii.zzb(i6, (String) zzf2);
                            }
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zza(obj, i6, i3)) {
                            zzb3 = zzle.zza(i6, zzma.zzf(obj, j), zza(i3));
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zza(obj, i6, i3)) {
                            zzb3 = zzii.zzc(i6, (zzht) zzma.zzf(obj, j));
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zza(obj, i6, i3)) {
                            zzb3 = zzii.zzg(i6, zzd(obj, j));
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zza(obj, i6, i3)) {
                            zzb3 = zzii.zzk(i6, zzd(obj, j));
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zza(obj, i6, i3)) {
                            zzb3 = zzii.zzj(i6, 0);
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zza(obj, i6, i3)) {
                            zzb3 = zzii.zzh(i6, 0L);
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zza(obj, i6, i3)) {
                            zzb3 = zzii.zzh(i6, zzd(obj, j));
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zza(obj, i6, i3)) {
                            zzb3 = zzii.zzf(i6, zze(obj, j));
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zza(obj, i6, i3)) {
                            zzb3 = zzii.zzc(i6, (zzkk) zzma.zzf(obj, j), zza(i3));
                            i4 += zzb3;
                            break;
                        } else {
                            break;
                        }
                }
                i3 += 3;
                i2 = 267386880;
            }
            return i4 + zza(this.zzq, obj);
        }
        Unsafe unsafe2 = zzb;
        int i8 = 0;
        int i9 = 1048575;
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzc.length; i11 += 3) {
            int zzd3 = zzd(i11);
            int[] iArr = this.zzc;
            int i12 = iArr[i11];
            int i13 = (zzd3 & 267386880) >>> 20;
            if (i13 <= 17) {
                int i14 = iArr[i11 + 2];
                int i15 = i14 & 1048575;
                i = 1 << (i14 >>> 20);
                if (i15 != i9) {
                    i10 = unsafe2.getInt(obj, i15);
                    i9 = i15;
                }
            } else {
                i = 0;
            }
            long j2 = zzd3 & 1048575;
            switch (i13) {
                case 0:
                    if ((i & i10) != 0) {
                        i8 += zzii.zzb(i12, 0.0d);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i & i10) != 0) {
                        i8 += zzii.zzb(i12, 0.0f);
                        break;
                    }
                case 2:
                    if ((i & i10) != 0) {
                        zzd = zzii.zzd(i12, unsafe2.getLong(obj, j2));
                        i8 += zzd;
                    }
                    break;
                case 3:
                    if ((i & i10) != 0) {
                        zzd = zzii.zze(i12, unsafe2.getLong(obj, j2));
                        i8 += zzd;
                    }
                    break;
                case 4:
                    if ((i & i10) != 0) {
                        zzd = zzii.zzf(i12, unsafe2.getInt(obj, j2));
                        i8 += zzd;
                    }
                    break;
                case 5:
                    if ((i & i10) != 0) {
                        zzd = zzii.zzg(i12, 0L);
                        i8 += zzd;
                    }
                    break;
                case 6:
                    if ((i & i10) != 0) {
                        zzd = zzii.zzi(i12, 0);
                        i8 += zzd;
                        break;
                    }
                case 7:
                    if ((i & i10) != 0) {
                        zzb2 = zzii.zzb(i12, true);
                        i8 += zzb2;
                    }
                    break;
                case 8:
                    if ((i & i10) != 0) {
                        Object object = unsafe2.getObject(obj, j2);
                        if (object instanceof zzht) {
                            zzb2 = zzii.zzc(i12, (zzht) object);
                        } else {
                            zzb2 = zzii.zzb(i12, (String) object);
                        }
                        i8 += zzb2;
                    }
                    break;
                case 9:
                    if ((i & i10) != 0) {
                        zzb2 = zzle.zza(i12, unsafe2.getObject(obj, j2), zza(i11));
                        i8 += zzb2;
                    }
                    break;
                case 10:
                    if ((i & i10) != 0) {
                        zzb2 = zzii.zzc(i12, (zzht) unsafe2.getObject(obj, j2));
                        i8 += zzb2;
                    }
                    break;
                case 11:
                    if ((i & i10) != 0) {
                        zzb2 = zzii.zzg(i12, unsafe2.getInt(obj, j2));
                        i8 += zzb2;
                    }
                    break;
                case 12:
                    if ((i & i10) != 0) {
                        zzb2 = zzii.zzk(i12, unsafe2.getInt(obj, j2));
                        i8 += zzb2;
                    }
                    break;
                case 13:
                    if ((i & i10) != 0) {
                        zzj = zzii.zzj(i12, 0);
                        i8 += zzj;
                    }
                    break;
                case 14:
                    if ((i & i10) != 0) {
                        zzb2 = zzii.zzh(i12, 0L);
                        i8 += zzb2;
                    }
                    break;
                case 15:
                    if ((i & i10) != 0) {
                        zzb2 = zzii.zzh(i12, unsafe2.getInt(obj, j2));
                        i8 += zzb2;
                    }
                    break;
                case 16:
                    if ((i & i10) != 0) {
                        zzb2 = zzii.zzf(i12, unsafe2.getLong(obj, j2));
                        i8 += zzb2;
                    }
                    break;
                case 17:
                    if ((i & i10) != 0) {
                        zzb2 = zzii.zzc(i12, (zzkk) unsafe2.getObject(obj, j2), zza(i11));
                        i8 += zzb2;
                    }
                    break;
                case 18:
                    zzb2 = zzle.zzi(i12, (List) unsafe2.getObject(obj, j2), false);
                    i8 += zzb2;
                    break;
                case 19:
                    zzd = zzle.zzh(i12, (List) unsafe2.getObject(obj, j2), false);
                    i8 += zzd;
                    break;
                case 20:
                    zzd = zzle.zza(i12, (List) unsafe2.getObject(obj, j2), false);
                    i8 += zzd;
                    break;
                case 21:
                    zzd = zzle.zzb(i12, (List) unsafe2.getObject(obj, j2), false);
                    i8 += zzd;
                    break;
                case 22:
                    zzd = zzle.zze(i12, (List) unsafe2.getObject(obj, j2), false);
                    i8 += zzd;
                    break;
                case 23:
                    zzd = zzle.zzi(i12, (List) unsafe2.getObject(obj, j2), false);
                    i8 += zzd;
                    break;
                case 24:
                    zzd = zzle.zzh(i12, (List) unsafe2.getObject(obj, j2), false);
                    i8 += zzd;
                    break;
                case 25:
                    zzd = zzle.zzj(i12, (List) unsafe2.getObject(obj, j2), false);
                    i8 += zzd;
                    break;
                case 26:
                    zzb2 = zzle.zza(i12, (List) unsafe2.getObject(obj, j2));
                    i8 += zzb2;
                    break;
                case 27:
                    zzb2 = zzle.zza(i12, (List) unsafe2.getObject(obj, j2), zza(i11));
                    i8 += zzb2;
                    break;
                case 28:
                    zzb2 = zzle.zzb(i12, (List) unsafe2.getObject(obj, j2));
                    i8 += zzb2;
                    break;
                case 29:
                    zzb2 = zzle.zzf(i12, (List) unsafe2.getObject(obj, j2), false);
                    i8 += zzb2;
                    break;
                case 30:
                    zzd = zzle.zzd(i12, (List) unsafe2.getObject(obj, j2), false);
                    i8 += zzd;
                    break;
                case 31:
                    zzd = zzle.zzh(i12, (List) unsafe2.getObject(obj, j2), false);
                    i8 += zzd;
                    break;
                case 32:
                    zzd = zzle.zzi(i12, (List) unsafe2.getObject(obj, j2), false);
                    i8 += zzd;
                    break;
                case 33:
                    zzd = zzle.zzg(i12, (List) unsafe2.getObject(obj, j2), false);
                    i8 += zzd;
                    break;
                case 34:
                    zzd = zzle.zzc(i12, (List) unsafe2.getObject(obj, j2), false);
                    i8 += zzd;
                    break;
                case 35:
                    zzi = zzle.zzi((List) unsafe2.getObject(obj, j2));
                    if (zzi > 0) {
                        zze = zzii.zze(i12);
                        zzg = zzii.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i8 += zzj;
                    }
                    break;
                case 36:
                    zzi = zzle.zzh((List) unsafe2.getObject(obj, j2));
                    if (zzi > 0) {
                        zze = zzii.zze(i12);
                        zzg = zzii.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i8 += zzj;
                    }
                    break;
                case 37:
                    zzi = zzle.zza((List) unsafe2.getObject(obj, j2));
                    if (zzi > 0) {
                        zze = zzii.zze(i12);
                        zzg = zzii.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i8 += zzj;
                    }
                    break;
                case 38:
                    zzi = zzle.zzb((List) unsafe2.getObject(obj, j2));
                    if (zzi > 0) {
                        zze = zzii.zze(i12);
                        zzg = zzii.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i8 += zzj;
                    }
                    break;
                case 39:
                    zzi = zzle.zze((List) unsafe2.getObject(obj, j2));
                    if (zzi > 0) {
                        zze = zzii.zze(i12);
                        zzg = zzii.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i8 += zzj;
                    }
                    break;
                case 40:
                    zzi = zzle.zzi((List) unsafe2.getObject(obj, j2));
                    if (zzi > 0) {
                        zze = zzii.zze(i12);
                        zzg = zzii.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i8 += zzj;
                    }
                    break;
                case 41:
                    zzi = zzle.zzh((List) unsafe2.getObject(obj, j2));
                    if (zzi > 0) {
                        zze = zzii.zze(i12);
                        zzg = zzii.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i8 += zzj;
                    }
                    break;
                case 42:
                    zzi = zzle.zzj((List) unsafe2.getObject(obj, j2));
                    if (zzi > 0) {
                        zze = zzii.zze(i12);
                        zzg = zzii.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i8 += zzj;
                    }
                    break;
                case 43:
                    zzi = zzle.zzf((List) unsafe2.getObject(obj, j2));
                    if (zzi > 0) {
                        zze = zzii.zze(i12);
                        zzg = zzii.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i8 += zzj;
                    }
                    break;
                case 44:
                    zzi = zzle.zzd((List) unsafe2.getObject(obj, j2));
                    if (zzi > 0) {
                        zze = zzii.zze(i12);
                        zzg = zzii.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i8 += zzj;
                    }
                    break;
                case 45:
                    zzi = zzle.zzh((List) unsafe2.getObject(obj, j2));
                    if (zzi > 0) {
                        zze = zzii.zze(i12);
                        zzg = zzii.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i8 += zzj;
                    }
                    break;
                case 46:
                    zzi = zzle.zzi((List) unsafe2.getObject(obj, j2));
                    if (zzi > 0) {
                        zze = zzii.zze(i12);
                        zzg = zzii.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i8 += zzj;
                    }
                    break;
                case 47:
                    zzi = zzle.zzg((List) unsafe2.getObject(obj, j2));
                    if (zzi > 0) {
                        zze = zzii.zze(i12);
                        zzg = zzii.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i8 += zzj;
                    }
                    break;
                case 48:
                    zzi = zzle.zzc((List) unsafe2.getObject(obj, j2));
                    if (zzi > 0) {
                        zze = zzii.zze(i12);
                        zzg = zzii.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i8 += zzj;
                    }
                    break;
                case 49:
                    zzb2 = zzle.zzb(i12, (List) unsafe2.getObject(obj, j2), zza(i11));
                    i8 += zzb2;
                    break;
                case 50:
                    zzb2 = this.zzs.zza(i12, unsafe2.getObject(obj, j2), zzb(i11));
                    i8 += zzb2;
                    break;
                case 51:
                    if (zza(obj, i12, i11)) {
                        i8 += zzii.zzb(i12, 0.0d);
                    }
                    break;
                case 52:
                    if (zza(obj, i12, i11)) {
                        zzj = zzii.zzb(i12, 0.0f);
                        i8 += zzj;
                    }
                    break;
                case 53:
                    if (zza(obj, i12, i11)) {
                        zzb2 = zzii.zzd(i12, zze(obj, j2));
                        i8 += zzb2;
                    }
                    break;
                case 54:
                    if (zza(obj, i12, i11)) {
                        zzb2 = zzii.zze(i12, zze(obj, j2));
                        i8 += zzb2;
                    }
                    break;
                case 55:
                    if (zza(obj, i12, i11)) {
                        zzb2 = zzii.zzf(i12, zzd(obj, j2));
                        i8 += zzb2;
                    }
                    break;
                case 56:
                    if (zza(obj, i12, i11)) {
                        zzb2 = zzii.zzg(i12, 0L);
                        i8 += zzb2;
                    }
                    break;
                case 57:
                    if (zza(obj, i12, i11)) {
                        zzj = zzii.zzi(i12, 0);
                        i8 += zzj;
                    }
                    break;
                case 58:
                    if (zza(obj, i12, i11)) {
                        zzb2 = zzii.zzb(i12, true);
                        i8 += zzb2;
                    }
                    break;
                case 59:
                    if (zza(obj, i12, i11)) {
                        Object object2 = unsafe2.getObject(obj, j2);
                        if (object2 instanceof zzht) {
                            zzb2 = zzii.zzc(i12, (zzht) object2);
                        } else {
                            zzb2 = zzii.zzb(i12, (String) object2);
                        }
                        i8 += zzb2;
                    }
                    break;
                case 60:
                    if (zza(obj, i12, i11)) {
                        zzb2 = zzle.zza(i12, unsafe2.getObject(obj, j2), zza(i11));
                        i8 += zzb2;
                    }
                    break;
                case 61:
                    if (zza(obj, i12, i11)) {
                        zzb2 = zzii.zzc(i12, (zzht) unsafe2.getObject(obj, j2));
                        i8 += zzb2;
                    }
                    break;
                case 62:
                    if (zza(obj, i12, i11)) {
                        zzb2 = zzii.zzg(i12, zzd(obj, j2));
                        i8 += zzb2;
                    }
                    break;
                case 63:
                    if (zza(obj, i12, i11)) {
                        zzb2 = zzii.zzk(i12, zzd(obj, j2));
                        i8 += zzb2;
                    }
                    break;
                case 64:
                    if (zza(obj, i12, i11)) {
                        zzj = zzii.zzj(i12, 0);
                        i8 += zzj;
                    }
                    break;
                case 65:
                    if (zza(obj, i12, i11)) {
                        zzb2 = zzii.zzh(i12, 0L);
                        i8 += zzb2;
                    }
                    break;
                case 66:
                    if (zza(obj, i12, i11)) {
                        zzb2 = zzii.zzh(i12, zzd(obj, j2));
                        i8 += zzb2;
                    }
                    break;
                case 67:
                    if (zza(obj, i12, i11)) {
                        zzb2 = zzii.zzf(i12, zze(obj, j2));
                        i8 += zzb2;
                    }
                    break;
                case 68:
                    if (zza(obj, i12, i11)) {
                        zzb2 = zzii.zzc(i12, (zzkk) unsafe2.getObject(obj, j2), zza(i11));
                        i8 += zzb2;
                    }
                    break;
            }
        }
        int i16 = 0;
        int zza2 = i8 + zza(this.zzq, obj);
        if (!this.zzh) {
            return zza2;
        }
        zziu zza3 = this.zzr.zza(obj);
        for (int i17 = 0; i17 < zza3.zza.zzc(); i17++) {
            Map.Entry zzb4 = zza3.zza.zzb(i17);
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzb4.getKey());
            i16 += zziu.zzc(null, zzb4.getValue());
        }
        for (Map.Entry entry : zza3.zza.zzd()) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(entry.getKey());
            i16 += zziu.zzc(null, entry.getValue());
        }
        return zza2 + i16;
    }

    private static int zza(zzlu zzluVar, Object obj) {
        return zzluVar.zzf(zzluVar.zzb(obj));
    }

    private static List zza(Object obj, long j) {
        return (List) zzma.zzf(obj, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0a2a  */
    @Override // com.google.android.gms.internal.vision.zzlc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Object obj, zzmr zzmrVar) {
        Iterator it;
        Map.Entry entry;
        int length;
        int i;
        Iterator it2;
        Map.Entry entry2;
        int length2;
        if (zzmrVar.zza() == zzmq.zzb) {
            zza(this.zzq, obj, zzmrVar);
            if (this.zzh) {
                zziu zza2 = this.zzr.zza(obj);
                if (!zza2.zza.isEmpty()) {
                    it2 = zza2.zze();
                    entry2 = (Map.Entry) it2.next();
                    for (length2 = this.zzc.length - 3; length2 >= 0; length2 -= 3) {
                        int zzd = zzd(length2);
                        int i2 = this.zzc[length2];
                        while (entry2 != null && this.zzr.zza(entry2) > i2) {
                            this.zzr.zza(zzmrVar, entry2);
                            entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                        }
                        switch ((zzd & 267386880) >>> 20) {
                            case 0:
                                if (zza(obj, length2)) {
                                    zzmrVar.zza(i2, zzma.zze(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (zza(obj, length2)) {
                                    zzmrVar.zza(i2, zzma.zzd(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (zza(obj, length2)) {
                                    zzmrVar.zza(i2, zzma.zzb(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (zza(obj, length2)) {
                                    zzmrVar.zzc(i2, zzma.zzb(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (zza(obj, length2)) {
                                    zzmrVar.zzc(i2, zzma.zza(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (zza(obj, length2)) {
                                    zzmrVar.zzd(i2, zzma.zzb(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (zza(obj, length2)) {
                                    zzmrVar.zzd(i2, zzma.zza(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (zza(obj, length2)) {
                                    zzmrVar.zza(i2, zzma.zzc(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (zza(obj, length2)) {
                                    zza(i2, zzma.zzf(obj, zzd & 1048575), zzmrVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (zza(obj, length2)) {
                                    zzmrVar.zza(i2, zzma.zzf(obj, zzd & 1048575), zza(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (zza(obj, length2)) {
                                    zzmrVar.zza(i2, (zzht) zzma.zzf(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (zza(obj, length2)) {
                                    zzmrVar.zze(i2, zzma.zza(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (zza(obj, length2)) {
                                    zzmrVar.zzb(i2, zzma.zza(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (zza(obj, length2)) {
                                    zzmrVar.zza(i2, zzma.zza(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (zza(obj, length2)) {
                                    zzmrVar.zzb(i2, zzma.zzb(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (zza(obj, length2)) {
                                    zzmrVar.zzf(i2, zzma.zza(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (zza(obj, length2)) {
                                    zzmrVar.zze(i2, zzma.zzb(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (zza(obj, length2)) {
                                    zzmrVar.zzb(i2, zzma.zzf(obj, zzd & 1048575), zza(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                zzle.zza(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, false);
                                break;
                            case 19:
                                zzle.zzb(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, false);
                                break;
                            case 20:
                                zzle.zzc(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, false);
                                break;
                            case 21:
                                zzle.zzd(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, false);
                                break;
                            case 22:
                                zzle.zzh(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, false);
                                break;
                            case 23:
                                zzle.zzf(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, false);
                                break;
                            case 24:
                                zzle.zzk(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, false);
                                break;
                            case 25:
                                zzle.zzn(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, false);
                                break;
                            case 26:
                                zzle.zza(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar);
                                break;
                            case 27:
                                zzle.zza(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, zza(length2));
                                break;
                            case 28:
                                zzle.zzb(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar);
                                break;
                            case 29:
                                zzle.zzi(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, false);
                                break;
                            case 30:
                                zzle.zzm(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, false);
                                break;
                            case 31:
                                zzle.zzl(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, false);
                                break;
                            case 32:
                                zzle.zzg(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, false);
                                break;
                            case 33:
                                zzle.zzj(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, false);
                                break;
                            case 34:
                                zzle.zze(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, false);
                                break;
                            case 35:
                                zzle.zza(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, true);
                                break;
                            case 36:
                                zzle.zzb(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, true);
                                break;
                            case 37:
                                zzle.zzc(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, true);
                                break;
                            case 38:
                                zzle.zzd(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, true);
                                break;
                            case 39:
                                zzle.zzh(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, true);
                                break;
                            case 40:
                                zzle.zzf(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, true);
                                break;
                            case 41:
                                zzle.zzk(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, true);
                                break;
                            case 42:
                                zzle.zzn(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, true);
                                break;
                            case 43:
                                zzle.zzi(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, true);
                                break;
                            case 44:
                                zzle.zzm(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, true);
                                break;
                            case 45:
                                zzle.zzl(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, true);
                                break;
                            case 46:
                                zzle.zzg(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, true);
                                break;
                            case 47:
                                zzle.zzj(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, true);
                                break;
                            case 48:
                                zzle.zze(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, true);
                                break;
                            case 49:
                                zzle.zzb(this.zzc[length2], (List) zzma.zzf(obj, zzd & 1048575), zzmrVar, zza(length2));
                                break;
                            case 50:
                                zza(zzmrVar, i2, zzma.zzf(obj, zzd & 1048575), length2);
                                break;
                            case 51:
                                if (zza(obj, i2, length2)) {
                                    zzmrVar.zza(i2, zzb(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (zza(obj, i2, length2)) {
                                    zzmrVar.zza(i2, zzc(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (zza(obj, i2, length2)) {
                                    zzmrVar.zza(i2, zze(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (zza(obj, i2, length2)) {
                                    zzmrVar.zzc(i2, zze(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (zza(obj, i2, length2)) {
                                    zzmrVar.zzc(i2, zzd(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (zza(obj, i2, length2)) {
                                    zzmrVar.zzd(i2, zze(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (zza(obj, i2, length2)) {
                                    zzmrVar.zzd(i2, zzd(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (zza(obj, i2, length2)) {
                                    zzmrVar.zza(i2, zzf(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (zza(obj, i2, length2)) {
                                    zza(i2, zzma.zzf(obj, zzd & 1048575), zzmrVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
                                if (zza(obj, i2, length2)) {
                                    zzmrVar.zza(i2, zzma.zzf(obj, zzd & 1048575), zza(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
                                if (zza(obj, i2, length2)) {
                                    zzmrVar.zza(i2, (zzht) zzma.zzf(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (zza(obj, i2, length2)) {
                                    zzmrVar.zze(i2, zzd(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (zza(obj, i2, length2)) {
                                    zzmrVar.zzb(i2, zzd(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (zza(obj, i2, length2)) {
                                    zzmrVar.zza(i2, zzd(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (zza(obj, i2, length2)) {
                                    zzmrVar.zzb(i2, zze(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (zza(obj, i2, length2)) {
                                    zzmrVar.zzf(i2, zzd(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (zza(obj, i2, length2)) {
                                    zzmrVar.zze(i2, zze(obj, zzd & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (zza(obj, i2, length2)) {
                                    zzmrVar.zzb(i2, zzma.zzf(obj, zzd & 1048575), zza(length2));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry2 != null) {
                        this.zzr.zza(zzmrVar, entry2);
                        entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                    }
                    return;
                }
            }
            it2 = null;
            entry2 = null;
            while (length2 >= 0) {
            }
            while (entry2 != null) {
            }
            return;
        }
        if (this.zzj) {
            if (this.zzh) {
                zziu zza3 = this.zzr.zza(obj);
                if (!zza3.zza.isEmpty()) {
                    it = zza3.zzd();
                    entry = (Map.Entry) it.next();
                    length = this.zzc.length;
                    for (i = 0; i < length; i += 3) {
                        int zzd2 = zzd(i);
                        int i3 = this.zzc[i];
                        while (entry != null && this.zzr.zza(entry) <= i3) {
                            this.zzr.zza(zzmrVar, entry);
                            entry = it.hasNext() ? (Map.Entry) it.next() : null;
                        }
                        switch ((zzd2 & 267386880) >>> 20) {
                            case 0:
                                if (zza(obj, i)) {
                                    zzmrVar.zza(i3, zzma.zze(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (zza(obj, i)) {
                                    zzmrVar.zza(i3, zzma.zzd(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (zza(obj, i)) {
                                    zzmrVar.zza(i3, zzma.zzb(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (zza(obj, i)) {
                                    zzmrVar.zzc(i3, zzma.zzb(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (zza(obj, i)) {
                                    zzmrVar.zzc(i3, zzma.zza(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (zza(obj, i)) {
                                    zzmrVar.zzd(i3, zzma.zzb(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (zza(obj, i)) {
                                    zzmrVar.zzd(i3, zzma.zza(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (zza(obj, i)) {
                                    zzmrVar.zza(i3, zzma.zzc(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (zza(obj, i)) {
                                    zza(i3, zzma.zzf(obj, zzd2 & 1048575), zzmrVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (zza(obj, i)) {
                                    zzmrVar.zza(i3, zzma.zzf(obj, zzd2 & 1048575), zza(i));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (zza(obj, i)) {
                                    zzmrVar.zza(i3, (zzht) zzma.zzf(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (zza(obj, i)) {
                                    zzmrVar.zze(i3, zzma.zza(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (zza(obj, i)) {
                                    zzmrVar.zzb(i3, zzma.zza(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (zza(obj, i)) {
                                    zzmrVar.zza(i3, zzma.zza(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (zza(obj, i)) {
                                    zzmrVar.zzb(i3, zzma.zzb(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (zza(obj, i)) {
                                    zzmrVar.zzf(i3, zzma.zza(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (zza(obj, i)) {
                                    zzmrVar.zze(i3, zzma.zzb(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (zza(obj, i)) {
                                    zzmrVar.zzb(i3, zzma.zzf(obj, zzd2 & 1048575), zza(i));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                zzle.zza(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, false);
                                break;
                            case 19:
                                zzle.zzb(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, false);
                                break;
                            case 20:
                                zzle.zzc(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, false);
                                break;
                            case 21:
                                zzle.zzd(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, false);
                                break;
                            case 22:
                                zzle.zzh(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, false);
                                break;
                            case 23:
                                zzle.zzf(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, false);
                                break;
                            case 24:
                                zzle.zzk(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, false);
                                break;
                            case 25:
                                zzle.zzn(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, false);
                                break;
                            case 26:
                                zzle.zza(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar);
                                break;
                            case 27:
                                zzle.zza(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, zza(i));
                                break;
                            case 28:
                                zzle.zzb(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar);
                                break;
                            case 29:
                                zzle.zzi(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, false);
                                break;
                            case 30:
                                zzle.zzm(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, false);
                                break;
                            case 31:
                                zzle.zzl(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, false);
                                break;
                            case 32:
                                zzle.zzg(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, false);
                                break;
                            case 33:
                                zzle.zzj(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, false);
                                break;
                            case 34:
                                zzle.zze(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, false);
                                break;
                            case 35:
                                zzle.zza(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, true);
                                break;
                            case 36:
                                zzle.zzb(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, true);
                                break;
                            case 37:
                                zzle.zzc(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, true);
                                break;
                            case 38:
                                zzle.zzd(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, true);
                                break;
                            case 39:
                                zzle.zzh(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, true);
                                break;
                            case 40:
                                zzle.zzf(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, true);
                                break;
                            case 41:
                                zzle.zzk(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, true);
                                break;
                            case 42:
                                zzle.zzn(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, true);
                                break;
                            case 43:
                                zzle.zzi(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, true);
                                break;
                            case 44:
                                zzle.zzm(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, true);
                                break;
                            case 45:
                                zzle.zzl(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, true);
                                break;
                            case 46:
                                zzle.zzg(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, true);
                                break;
                            case 47:
                                zzle.zzj(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, true);
                                break;
                            case 48:
                                zzle.zze(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, true);
                                break;
                            case 49:
                                zzle.zzb(this.zzc[i], (List) zzma.zzf(obj, zzd2 & 1048575), zzmrVar, zza(i));
                                break;
                            case 50:
                                zza(zzmrVar, i3, zzma.zzf(obj, zzd2 & 1048575), i);
                                break;
                            case 51:
                                if (zza(obj, i3, i)) {
                                    zzmrVar.zza(i3, zzb(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (zza(obj, i3, i)) {
                                    zzmrVar.zza(i3, zzc(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (zza(obj, i3, i)) {
                                    zzmrVar.zza(i3, zze(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (zza(obj, i3, i)) {
                                    zzmrVar.zzc(i3, zze(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (zza(obj, i3, i)) {
                                    zzmrVar.zzc(i3, zzd(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (zza(obj, i3, i)) {
                                    zzmrVar.zzd(i3, zze(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (zza(obj, i3, i)) {
                                    zzmrVar.zzd(i3, zzd(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (zza(obj, i3, i)) {
                                    zzmrVar.zza(i3, zzf(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (zza(obj, i3, i)) {
                                    zza(i3, zzma.zzf(obj, zzd2 & 1048575), zzmrVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
                                if (zza(obj, i3, i)) {
                                    zzmrVar.zza(i3, zzma.zzf(obj, zzd2 & 1048575), zza(i));
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
                                if (zza(obj, i3, i)) {
                                    zzmrVar.zza(i3, (zzht) zzma.zzf(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (zza(obj, i3, i)) {
                                    zzmrVar.zze(i3, zzd(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (zza(obj, i3, i)) {
                                    zzmrVar.zzb(i3, zzd(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (zza(obj, i3, i)) {
                                    zzmrVar.zza(i3, zzd(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (zza(obj, i3, i)) {
                                    zzmrVar.zzb(i3, zze(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (zza(obj, i3, i)) {
                                    zzmrVar.zzf(i3, zzd(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (zza(obj, i3, i)) {
                                    zzmrVar.zze(i3, zze(obj, zzd2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (zza(obj, i3, i)) {
                                    zzmrVar.zzb(i3, zzma.zzf(obj, zzd2 & 1048575), zza(i));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry != null) {
                        this.zzr.zza(zzmrVar, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    zza(this.zzq, obj, zzmrVar);
                    return;
                }
            }
            it = null;
            entry = null;
            length = this.zzc.length;
            while (i < length) {
            }
            while (entry != null) {
            }
            zza(this.zzq, obj, zzmrVar);
            return;
        }
        zzb(obj, zzmrVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzb(Object obj, zzmr zzmrVar) {
        Iterator it;
        Map.Entry entry;
        int length;
        int i;
        int i2;
        if (this.zzh) {
            zziu zza2 = this.zzr.zza(obj);
            if (!zza2.zza.isEmpty()) {
                it = zza2.zzd();
                entry = (Map.Entry) it.next();
                length = this.zzc.length;
                Unsafe unsafe = zzb;
                int i3 = 1048575;
                int i4 = 0;
                for (i = 0; i < length; i += 3) {
                    int zzd = zzd(i);
                    int[] iArr = this.zzc;
                    int i5 = iArr[i];
                    int i6 = (zzd & 267386880) >>> 20;
                    if (i6 <= 17) {
                        int i7 = iArr[i + 2];
                        int i8 = i7 & 1048575;
                        if (i8 != i3) {
                            i4 = unsafe.getInt(obj, i8);
                            i3 = i8;
                        }
                        i2 = 1 << (i7 >>> 20);
                    } else {
                        i2 = 0;
                    }
                    while (entry != null && this.zzr.zza(entry) <= i5) {
                        this.zzr.zza(zzmrVar, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long j = zzd & 1048575;
                    switch (i6) {
                        case 0:
                            if ((i4 & i2) == 0) {
                                break;
                            } else {
                                zzmrVar.zza(i5, zzma.zze(obj, j));
                                continue;
                            }
                        case 1:
                            if ((i4 & i2) != 0) {
                                zzmrVar.zza(i5, zzma.zzd(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if ((i4 & i2) != 0) {
                                zzmrVar.zza(i5, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if ((i4 & i2) != 0) {
                                zzmrVar.zzc(i5, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if ((i4 & i2) != 0) {
                                zzmrVar.zzc(i5, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if ((i4 & i2) != 0) {
                                zzmrVar.zzd(i5, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if ((i4 & i2) != 0) {
                                zzmrVar.zzd(i5, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if ((i4 & i2) != 0) {
                                zzmrVar.zza(i5, zzma.zzc(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 8:
                            if ((i4 & i2) != 0) {
                                zza(i5, unsafe.getObject(obj, j), zzmrVar);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            if ((i4 & i2) != 0) {
                                zzmrVar.zza(i5, unsafe.getObject(obj, j), zza(i));
                                break;
                            } else {
                                continue;
                            }
                        case 10:
                            if ((i4 & i2) != 0) {
                                zzmrVar.zza(i5, (zzht) unsafe.getObject(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if ((i4 & i2) != 0) {
                                zzmrVar.zze(i5, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 12:
                            if ((i4 & i2) != 0) {
                                zzmrVar.zzb(i5, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 13:
                            if ((i4 & i2) != 0) {
                                zzmrVar.zza(i5, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 14:
                            if ((i4 & i2) != 0) {
                                zzmrVar.zzb(i5, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 15:
                            if ((i4 & i2) != 0) {
                                zzmrVar.zzf(i5, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 16:
                            if ((i4 & i2) != 0) {
                                zzmrVar.zze(i5, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 17:
                            if ((i4 & i2) != 0) {
                                zzmrVar.zzb(i5, unsafe.getObject(obj, j), zza(i));
                                break;
                            } else {
                                continue;
                            }
                        case 18:
                            zzle.zza(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, false);
                            continue;
                        case 19:
                            zzle.zzb(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, false);
                            continue;
                        case 20:
                            zzle.zzc(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, false);
                            continue;
                        case 21:
                            zzle.zzd(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, false);
                            continue;
                        case 22:
                            zzle.zzh(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, false);
                            continue;
                        case 23:
                            zzle.zzf(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, false);
                            continue;
                        case 24:
                            zzle.zzk(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, false);
                            continue;
                        case 25:
                            zzle.zzn(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, false);
                            continue;
                        case 26:
                            zzle.zza(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar);
                            break;
                        case 27:
                            zzle.zza(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, zza(i));
                            break;
                        case 28:
                            zzle.zzb(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar);
                            break;
                        case 29:
                            zzle.zzi(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, false);
                            continue;
                        case 30:
                            zzle.zzm(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, false);
                            continue;
                        case 31:
                            zzle.zzl(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, false);
                            continue;
                        case 32:
                            zzle.zzg(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, false);
                            continue;
                        case 33:
                            zzle.zzj(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, false);
                            continue;
                        case 34:
                            zzle.zze(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, false);
                            continue;
                        case 35:
                            zzle.zza(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, true);
                            break;
                        case 36:
                            zzle.zzb(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, true);
                            break;
                        case 37:
                            zzle.zzc(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, true);
                            break;
                        case 38:
                            zzle.zzd(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, true);
                            break;
                        case 39:
                            zzle.zzh(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, true);
                            break;
                        case 40:
                            zzle.zzf(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, true);
                            break;
                        case 41:
                            zzle.zzk(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, true);
                            break;
                        case 42:
                            zzle.zzn(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, true);
                            break;
                        case 43:
                            zzle.zzi(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, true);
                            break;
                        case 44:
                            zzle.zzm(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, true);
                            break;
                        case 45:
                            zzle.zzl(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, true);
                            break;
                        case 46:
                            zzle.zzg(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, true);
                            break;
                        case 47:
                            zzle.zzj(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, true);
                            break;
                        case 48:
                            zzle.zze(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, true);
                            break;
                        case 49:
                            zzle.zzb(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, zza(i));
                            break;
                        case 50:
                            zza(zzmrVar, i5, unsafe.getObject(obj, j), i);
                            break;
                        case 51:
                            if (zza(obj, i5, i)) {
                                zzmrVar.zza(i5, zzb(obj, j));
                                break;
                            }
                            break;
                        case 52:
                            if (zza(obj, i5, i)) {
                                zzmrVar.zza(i5, zzc(obj, j));
                                break;
                            }
                            break;
                        case 53:
                            if (zza(obj, i5, i)) {
                                zzmrVar.zza(i5, zze(obj, j));
                                break;
                            }
                            break;
                        case 54:
                            if (zza(obj, i5, i)) {
                                zzmrVar.zzc(i5, zze(obj, j));
                                break;
                            }
                            break;
                        case 55:
                            if (zza(obj, i5, i)) {
                                zzmrVar.zzc(i5, zzd(obj, j));
                                break;
                            }
                            break;
                        case 56:
                            if (zza(obj, i5, i)) {
                                zzmrVar.zzd(i5, zze(obj, j));
                                break;
                            }
                            break;
                        case 57:
                            if (zza(obj, i5, i)) {
                                zzmrVar.zzd(i5, zzd(obj, j));
                                break;
                            }
                            break;
                        case 58:
                            if (zza(obj, i5, i)) {
                                zzmrVar.zza(i5, zzf(obj, j));
                                break;
                            }
                            break;
                        case 59:
                            if (zza(obj, i5, i)) {
                                zza(i5, unsafe.getObject(obj, j), zzmrVar);
                                break;
                            }
                            break;
                        case 60:
                            if (zza(obj, i5, i)) {
                                zzmrVar.zza(i5, unsafe.getObject(obj, j), zza(i));
                                break;
                            }
                            break;
                        case 61:
                            if (zza(obj, i5, i)) {
                                zzmrVar.zza(i5, (zzht) unsafe.getObject(obj, j));
                                break;
                            }
                            break;
                        case 62:
                            if (zza(obj, i5, i)) {
                                zzmrVar.zze(i5, zzd(obj, j));
                                break;
                            }
                            break;
                        case 63:
                            if (zza(obj, i5, i)) {
                                zzmrVar.zzb(i5, zzd(obj, j));
                                break;
                            }
                            break;
                        case 64:
                            if (zza(obj, i5, i)) {
                                zzmrVar.zza(i5, zzd(obj, j));
                                break;
                            }
                            break;
                        case 65:
                            if (zza(obj, i5, i)) {
                                zzmrVar.zzb(i5, zze(obj, j));
                                break;
                            }
                            break;
                        case 66:
                            if (zza(obj, i5, i)) {
                                zzmrVar.zzf(i5, zzd(obj, j));
                                break;
                            }
                            break;
                        case 67:
                            if (zza(obj, i5, i)) {
                                zzmrVar.zze(i5, zze(obj, j));
                                break;
                            }
                            break;
                        case 68:
                            if (zza(obj, i5, i)) {
                                zzmrVar.zzb(i5, unsafe.getObject(obj, j), zza(i));
                                break;
                            }
                            break;
                    }
                }
                while (entry != null) {
                    this.zzr.zza(zzmrVar, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                zza(this.zzq, obj, zzmrVar);
            }
        }
        it = null;
        entry = null;
        length = this.zzc.length;
        Unsafe unsafe2 = zzb;
        int i32 = 1048575;
        int i42 = 0;
        while (i < length) {
        }
        while (entry != null) {
        }
        zza(this.zzq, obj, zzmrVar);
    }

    private final void zza(zzmr zzmrVar, int i, Object obj, int i2) {
        if (obj != null) {
            this.zzs.zzb(zzb(i2));
            zzmrVar.zza(i, (zzkf) null, this.zzs.zzc(obj));
        }
    }

    private static void zza(zzlu zzluVar, Object obj, zzmr zzmrVar) {
        zzluVar.zza(zzluVar.zzb(obj), zzmrVar);
    }

    private static zzlx zze(Object obj) {
        zzjb zzjbVar = (zzjb) obj;
        zzlx zzlxVar = zzjbVar.zzb;
        if (zzlxVar != zzlx.zza()) {
            return zzlxVar;
        }
        zzlx zzb2 = zzlx.zzb();
        zzjbVar.zzb = zzb2;
        return zzb2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zza(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzhn zzhnVar) {
        int zza2;
        Unsafe unsafe = zzb;
        zzjl zzjlVar = (zzjl) unsafe.getObject(obj, j2);
        if (!zzjlVar.zza()) {
            int size = zzjlVar.size();
            zzjlVar = zzjlVar.zza(size == 0 ? 10 : size << 1);
            unsafe.putObject(obj, j2, zzjlVar);
        }
        zzjl zzjlVar2 = zzjlVar;
        switch (i7) {
            case 18:
            case 35:
                if (i5 != 2) {
                    if (i5 == 1) {
                        zzhl.zzc(bArr, i);
                        throw null;
                    }
                    return i;
                }
                int zza3 = zzhl.zza(bArr, i, zzhnVar);
                int i8 = zzhnVar.zza + zza3;
                if (zza3 < i8) {
                    zzhl.zzc(bArr, zza3);
                    throw null;
                }
                if (zza3 == i8) {
                    return zza3;
                }
                throw zzjk.zza();
            case 19:
            case 36:
                if (i5 != 2) {
                    if (i5 == 5) {
                        zzhl.zzd(bArr, i);
                        throw null;
                    }
                    return i;
                }
                int zza4 = zzhl.zza(bArr, i, zzhnVar);
                int i9 = zzhnVar.zza + zza4;
                if (zza4 < i9) {
                    zzhl.zzd(bArr, zza4);
                    throw null;
                }
                if (zza4 == i9) {
                    return zza4;
                }
                throw zzjk.zza();
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 != 2) {
                    if (i5 == 0) {
                        zzhl.zzb(bArr, i, zzhnVar);
                        long j3 = zzhnVar.zzb;
                        throw null;
                    }
                    return i;
                }
                int zza5 = zzhl.zza(bArr, i, zzhnVar);
                int i10 = zzhnVar.zza + zza5;
                if (zza5 < i10) {
                    zzhl.zzb(bArr, zza5, zzhnVar);
                    throw null;
                }
                if (zza5 == i10) {
                    return zza5;
                }
                throw zzjk.zza();
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzhl.zza(bArr, i, zzjlVar2, zzhnVar);
                }
                if (i5 == 0) {
                    return zzhl.zza(i3, bArr, i, i2, zzjlVar2, zzhnVar);
                }
                return i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 != 2) {
                    if (i5 == 1) {
                        zzhl.zzb(bArr, i);
                        throw null;
                    }
                    return i;
                }
                int zza6 = zzhl.zza(bArr, i, zzhnVar);
                int i11 = zzhnVar.zza + zza6;
                if (zza6 < i11) {
                    zzhl.zzb(bArr, zza6);
                    throw null;
                }
                if (zza6 == i11) {
                    return zza6;
                }
                throw zzjk.zza();
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    zzjd zzjdVar = (zzjd) zzjlVar2;
                    int zza7 = zzhl.zza(bArr, i, zzhnVar);
                    int i12 = zzhnVar.zza + zza7;
                    while (zza7 < i12) {
                        zzjdVar.zzc(zzhl.zza(bArr, zza7));
                        zza7 += 4;
                    }
                    if (zza7 == i12) {
                        return zza7;
                    }
                    throw zzjk.zza();
                }
                if (i5 == 5) {
                    zzjd zzjdVar2 = (zzjd) zzjlVar2;
                    zzjdVar2.zzc(zzhl.zza(bArr, i));
                    int i13 = i + 4;
                    while (i13 < i2) {
                        int zza8 = zzhl.zza(bArr, i13, zzhnVar);
                        if (i3 != zzhnVar.zza) {
                            return i13;
                        }
                        zzjdVar2.zzc(zzhl.zza(bArr, zza8));
                        i13 = zza8 + 4;
                    }
                    return i13;
                }
                return i;
            case 25:
            case 42:
                if (i5 != 2) {
                    if (i5 == 0) {
                        zzhl.zzb(bArr, i, zzhnVar);
                        long j4 = zzhnVar.zzb;
                        throw null;
                    }
                    return i;
                }
                int zza9 = zzhl.zza(bArr, i, zzhnVar);
                int i14 = zzhnVar.zza + zza9;
                if (zza9 < i14) {
                    zzhl.zzb(bArr, zza9, zzhnVar);
                    throw null;
                }
                if (zza9 == i14) {
                    return zza9;
                }
                throw zzjk.zza();
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int zza10 = zzhl.zza(bArr, i, zzhnVar);
                        int i15 = zzhnVar.zza;
                        if (i15 < 0) {
                            throw zzjk.zzb();
                        }
                        if (i15 == 0) {
                            zzjlVar2.add("");
                        } else {
                            zzjlVar2.add(new String(bArr, zza10, i15, zzjf.zza));
                            zza10 += i15;
                        }
                        while (zza10 < i2) {
                            int zza11 = zzhl.zza(bArr, zza10, zzhnVar);
                            if (i3 != zzhnVar.zza) {
                                return zza10;
                            }
                            zza10 = zzhl.zza(bArr, zza11, zzhnVar);
                            int i16 = zzhnVar.zza;
                            if (i16 < 0) {
                                throw zzjk.zzb();
                            }
                            if (i16 == 0) {
                                zzjlVar2.add("");
                            } else {
                                zzjlVar2.add(new String(bArr, zza10, i16, zzjf.zza));
                                zza10 += i16;
                            }
                        }
                        return zza10;
                    }
                    int zza12 = zzhl.zza(bArr, i, zzhnVar);
                    int i17 = zzhnVar.zza;
                    if (i17 < 0) {
                        throw zzjk.zzb();
                    }
                    if (i17 == 0) {
                        zzjlVar2.add("");
                    } else {
                        int i18 = zza12 + i17;
                        if (!zzmd.zza(bArr, zza12, i18)) {
                            throw zzjk.zzh();
                        }
                        zzjlVar2.add(new String(bArr, zza12, i17, zzjf.zza));
                        zza12 = i18;
                    }
                    while (zza12 < i2) {
                        int zza13 = zzhl.zza(bArr, zza12, zzhnVar);
                        if (i3 != zzhnVar.zza) {
                            return zza12;
                        }
                        zza12 = zzhl.zza(bArr, zza13, zzhnVar);
                        int i19 = zzhnVar.zza;
                        if (i19 < 0) {
                            throw zzjk.zzb();
                        }
                        if (i19 == 0) {
                            zzjlVar2.add("");
                        } else {
                            int i20 = zza12 + i19;
                            if (!zzmd.zza(bArr, zza12, i20)) {
                                throw zzjk.zzh();
                            }
                            zzjlVar2.add(new String(bArr, zza12, i19, zzjf.zza));
                            zza12 = i20;
                        }
                    }
                    return zza12;
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return zzhl.zza(zza(i6), i3, bArr, i, i2, zzjlVar2, zzhnVar);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    int zza14 = zzhl.zza(bArr, i, zzhnVar);
                    int i21 = zzhnVar.zza;
                    if (i21 < 0) {
                        throw zzjk.zzb();
                    }
                    if (i21 > bArr.length - zza14) {
                        throw zzjk.zza();
                    }
                    if (i21 == 0) {
                        zzjlVar2.add(zzht.zza);
                    } else {
                        zzjlVar2.add(zzht.zza(bArr, zza14, i21));
                        zza14 += i21;
                    }
                    while (zza14 < i2) {
                        int zza15 = zzhl.zza(bArr, zza14, zzhnVar);
                        if (i3 != zzhnVar.zza) {
                            return zza14;
                        }
                        zza14 = zzhl.zza(bArr, zza15, zzhnVar);
                        int i22 = zzhnVar.zza;
                        if (i22 < 0) {
                            throw zzjk.zzb();
                        }
                        if (i22 > bArr.length - zza14) {
                            throw zzjk.zza();
                        }
                        if (i22 == 0) {
                            zzjlVar2.add(zzht.zza);
                        } else {
                            zzjlVar2.add(zzht.zza(bArr, zza14, i22));
                            zza14 += i22;
                        }
                    }
                    return zza14;
                }
                return i;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        zza2 = zzhl.zza(i3, bArr, i, i2, zzjlVar2, zzhnVar);
                    }
                    return i;
                }
                zza2 = zzhl.zza(bArr, i, zzjlVar2, zzhnVar);
                zzjb zzjbVar = (zzjb) obj;
                zzlx zzlxVar = zzjbVar.zzb;
                zzlx zzlxVar2 = (zzlx) zzle.zza(i4, zzjlVar2, zzc(i6), zzlxVar != zzlx.zza() ? zzlxVar : null, this.zzq);
                if (zzlxVar2 != null) {
                    zzjbVar.zzb = zzlxVar2;
                }
                return zza2;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzjd zzjdVar3 = (zzjd) zzjlVar2;
                    int zza16 = zzhl.zza(bArr, i, zzhnVar);
                    int i23 = zzhnVar.zza + zza16;
                    while (zza16 < i23) {
                        zza16 = zzhl.zza(bArr, zza16, zzhnVar);
                        zzjdVar3.zzc(zzif.zze(zzhnVar.zza));
                    }
                    if (zza16 == i23) {
                        return zza16;
                    }
                    throw zzjk.zza();
                }
                if (i5 == 0) {
                    zzjd zzjdVar4 = (zzjd) zzjlVar2;
                    int zza17 = zzhl.zza(bArr, i, zzhnVar);
                    zzjdVar4.zzc(zzif.zze(zzhnVar.zza));
                    while (zza17 < i2) {
                        int zza18 = zzhl.zza(bArr, zza17, zzhnVar);
                        if (i3 != zzhnVar.zza) {
                            return zza17;
                        }
                        zza17 = zzhl.zza(bArr, zza18, zzhnVar);
                        zzjdVar4.zzc(zzif.zze(zzhnVar.zza));
                    }
                    return zza17;
                }
                return i;
            case 34:
            case 48:
                if (i5 != 2) {
                    if (i5 == 0) {
                        zzhl.zzb(bArr, i, zzhnVar);
                        zzif.zza(zzhnVar.zzb);
                        throw null;
                    }
                    return i;
                }
                int zza19 = zzhl.zza(bArr, i, zzhnVar);
                int i24 = zzhnVar.zza + zza19;
                if (zza19 >= i24) {
                    if (zza19 == i24) {
                        return zza19;
                    }
                    throw zzjk.zza();
                }
                zzhl.zzb(bArr, zza19, zzhnVar);
                zzif.zza(zzhnVar.zzb);
                throw null;
            case 49:
                if (i5 == 3) {
                    zzlc zza20 = zza(i6);
                    int i25 = (i3 & (-8)) | 4;
                    int zza21 = zzhl.zza(zza20, bArr, i, i2, i25, zzhnVar);
                    int i26 = i25;
                    zzhn zzhnVar2 = zzhnVar;
                    zzjlVar2.add(zzhnVar2.zzc);
                    while (zza21 < i2) {
                        int zza22 = zzhl.zza(bArr, zza21, zzhnVar2);
                        if (i3 != zzhnVar2.zza) {
                            return zza21;
                        }
                        int i27 = i26;
                        zzhn zzhnVar3 = zzhnVar2;
                        zza21 = zzhl.zza(zza20, bArr, zza22, i2, i27, zzhnVar3);
                        zzjlVar2.add(zzhnVar3.zzc);
                        i26 = i27;
                        zzhnVar2 = zzhnVar3;
                    }
                    return zza21;
                }
                return i;
            default:
                return i;
        }
    }

    private final int zza(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzhn zzhnVar) {
        Unsafe unsafe = zzb;
        Object zzb2 = zzb(i3);
        Object object = unsafe.getObject(obj, j);
        if (this.zzs.zzd(object)) {
            Object zzf = this.zzs.zzf(zzb2);
            this.zzs.zza(zzf, object);
            unsafe.putObject(obj, j, zzf);
            object = zzf;
        }
        this.zzs.zzb(zzb2);
        this.zzs.zza(object);
        int zza2 = zzhl.zza(bArr, i, zzhnVar);
        int i4 = zzhnVar.zza;
        if (i4 < 0 || i4 > i2 - zza2) {
            throw zzjk.zza();
        }
        throw null;
    }

    private final int zza(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzhn zzhnVar) {
        int i9;
        int i10;
        int zzb2;
        Object object;
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                i9 = i;
                if (i5 != 1) {
                    return i9;
                }
                unsafe.putObject(obj, j, Double.valueOf(zzhl.zzc(bArr, i)));
                zzb2 = i9 + 8;
                unsafe.putInt(obj, j2, i4);
                return zzb2;
            case 52:
                i10 = i;
                if (i5 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j, Float.valueOf(zzhl.zzd(bArr, i)));
                zzb2 = i10 + 4;
                unsafe.putInt(obj, j2, i4);
                return zzb2;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                zzb2 = zzhl.zzb(bArr, i, zzhnVar);
                unsafe.putObject(obj, j, Long.valueOf(zzhnVar.zzb));
                unsafe.putInt(obj, j2, i4);
                return zzb2;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                zzb2 = zzhl.zza(bArr, i, zzhnVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzhnVar.zza));
                unsafe.putInt(obj, j2, i4);
                return zzb2;
            case 56:
            case 65:
                i9 = i;
                if (i5 != 1) {
                    return i9;
                }
                unsafe.putObject(obj, j, Long.valueOf(zzhl.zzb(bArr, i)));
                zzb2 = i9 + 8;
                unsafe.putInt(obj, j2, i4);
                return zzb2;
            case 57:
            case 64:
                i10 = i;
                if (i5 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j, Integer.valueOf(zzhl.zza(bArr, i)));
                zzb2 = i10 + 4;
                unsafe.putInt(obj, j2, i4);
                return zzb2;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                zzb2 = zzhl.zzb(bArr, i, zzhnVar);
                unsafe.putObject(obj, j, Boolean.valueOf(zzhnVar.zzb != 0));
                unsafe.putInt(obj, j2, i4);
                return zzb2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int zza2 = zzhl.zza(bArr, i, zzhnVar);
                int i11 = zzhnVar.zza;
                if (i11 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & TLObject.FLAG_29) != 0 && !zzmd.zza(bArr, zza2, zza2 + i11)) {
                        throw zzjk.zzh();
                    }
                    unsafe.putObject(obj, j, new String(bArr, zza2, i11, zzjf.zza));
                    zza2 += i11;
                }
                unsafe.putInt(obj, j2, i4);
                return zza2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int zza3 = zzhl.zza(zza(i8), bArr, i, i2, zzhnVar);
                object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                if (object == null) {
                    unsafe.putObject(obj, j, zzhnVar.zzc);
                } else {
                    unsafe.putObject(obj, j, zzjf.zza(object, zzhnVar.zzc));
                }
                unsafe.putInt(obj, j2, i4);
                return zza3;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                zzb2 = zzhl.zze(bArr, i, zzhnVar);
                unsafe.putObject(obj, j, zzhnVar.zzc);
                unsafe.putInt(obj, j2, i4);
                return zzb2;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int zza4 = zzhl.zza(bArr, i, zzhnVar);
                int i12 = zzhnVar.zza;
                zzjg zzc = zzc(i8);
                if (zzc == null || zzc.zza(i12)) {
                    unsafe.putObject(obj, j, Integer.valueOf(i12));
                    zzb2 = zza4;
                    unsafe.putInt(obj, j2, i4);
                    return zzb2;
                }
                zze(obj).zza(i3, Long.valueOf(i12));
                return zza4;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                zzb2 = zzhl.zza(bArr, i, zzhnVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzif.zze(zzhnVar.zza)));
                unsafe.putInt(obj, j2, i4);
                return zzb2;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                zzb2 = zzhl.zzb(bArr, i, zzhnVar);
                unsafe.putObject(obj, j, Long.valueOf(zzif.zza(zzhnVar.zzb)));
                unsafe.putInt(obj, j2, i4);
                return zzb2;
            case 68:
                if (i5 == 3) {
                    zzb2 = zzhl.zza(zza(i8), bArr, i, i2, (i3 & (-8)) | 4, zzhnVar);
                    object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, zzhnVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzjf.zza(object, zzhnVar.zzc));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzb2;
                }
            default:
                return i;
        }
    }

    private final zzlc zza(int i) {
        int i2 = (i / 3) << 1;
        zzlc zzlcVar = (zzlc) this.zzd[i2];
        if (zzlcVar != null) {
            return zzlcVar;
        }
        zzlc zza2 = zzky.zza().zza((Class) this.zzd[i2 + 1]);
        this.zzd[i2] = zza2;
        return zza2;
    }

    private final Object zzb(int i) {
        return this.zzd[(i / 3) << 1];
    }

    private final zzjg zzc(int i) {
        return (zzjg) this.zzd[((i / 3) << 1) + 1];
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:102:0x008b. Please report as an issue. */
    final int zza(Object obj, byte[] bArr, int i, int i2, int i3, zzhn zzhnVar) {
        int i4;
        zzko zzkoVar;
        Object obj2;
        Unsafe unsafe;
        int i5;
        int zzg;
        int i6;
        int i7;
        zzhn zzhnVar2;
        Unsafe unsafe2;
        int i8;
        int i9;
        byte[] bArr2;
        Unsafe unsafe3;
        byte[] bArr3;
        int i10;
        int i11;
        Unsafe unsafe4;
        int zzd;
        byte[] bArr4;
        int i12;
        int i13;
        int zza2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        zzko zzkoVar2 = this;
        Object obj3 = obj;
        byte[] bArr5 = bArr;
        int i19 = i2;
        zzhn zzhnVar3 = zzhnVar;
        Unsafe unsafe5 = zzb;
        int i20 = -1;
        int i21 = i;
        int i22 = -1;
        int i23 = 0;
        int i24 = 1048575;
        int i25 = 0;
        int i26 = 0;
        while (true) {
            if (i21 < i19) {
                int i27 = i21 + 1;
                int i28 = bArr5[i21];
                if (i28 < 0) {
                    i27 = zzhl.zza(i28, bArr5, i27, zzhnVar3);
                    i28 = zzhnVar3.zza;
                }
                int i29 = i27;
                i26 = i28;
                int i30 = i26 >>> 3;
                int i31 = i23;
                int i32 = i26 & 7;
                if (i30 > i22) {
                    zzg = zzkoVar2.zza(i30, i31 / 3);
                } else {
                    zzg = zzkoVar2.zzg(i30);
                }
                if (zzg == i20) {
                    zzkoVar = zzkoVar2;
                    obj2 = obj3;
                    i6 = i29;
                    unsafe = unsafe5;
                    i22 = i30;
                    i23 = 0;
                    i5 = 1048575;
                    i4 = i3;
                } else {
                    int[] iArr = zzkoVar2.zzc;
                    int i33 = iArr[zzg + 1];
                    int i34 = (i33 & 267386880) >>> 20;
                    long j = i33 & 1048575;
                    if (i34 <= 17) {
                        int i35 = iArr[zzg + 2];
                        int i36 = 1 << (i35 >>> 20);
                        int i37 = i35 & 1048575;
                        if (i37 != i24) {
                            if (i24 != 1048575) {
                                unsafe5.putInt(obj3, i24, i25);
                            }
                            i24 = i37;
                            i25 = unsafe5.getInt(obj3, i37);
                        }
                        switch (i34) {
                            case 0:
                                i7 = zzg;
                                unsafe2 = unsafe5;
                                i8 = i29;
                                i9 = i2;
                                bArr2 = bArr;
                                zzhnVar2 = zzhnVar3;
                                if (i32 != 1) {
                                    unsafe = unsafe2;
                                    i6 = i8;
                                    i23 = i7;
                                    zzhnVar3 = zzhnVar2;
                                    i22 = i30;
                                    i5 = 1048575;
                                    i4 = i3;
                                    zzkoVar = zzkoVar2;
                                    obj2 = obj3;
                                    break;
                                } else {
                                    zzma.zza(obj3, j, zzhl.zzc(bArr2, i8));
                                    i21 = i8 + 8;
                                    i25 |= i36;
                                    int i38 = i9;
                                    unsafe5 = unsafe2;
                                    i19 = i38;
                                    i23 = i7;
                                    zzhnVar3 = zzhnVar2;
                                    bArr5 = bArr2;
                                    i22 = i30;
                                    i20 = -1;
                                }
                            case 1:
                                i7 = zzg;
                                unsafe2 = unsafe5;
                                i8 = i29;
                                i9 = i2;
                                bArr2 = bArr;
                                zzhnVar2 = zzhnVar3;
                                if (i32 != 5) {
                                    unsafe = unsafe2;
                                    i6 = i8;
                                    i23 = i7;
                                    zzhnVar3 = zzhnVar2;
                                    i22 = i30;
                                    i5 = 1048575;
                                    i4 = i3;
                                    zzkoVar = zzkoVar2;
                                    obj2 = obj3;
                                    break;
                                } else {
                                    zzma.zza(obj3, j, zzhl.zzd(bArr2, i8));
                                    i21 = i8 + 4;
                                    i25 |= i36;
                                    int i382 = i9;
                                    unsafe5 = unsafe2;
                                    i19 = i382;
                                    i23 = i7;
                                    zzhnVar3 = zzhnVar2;
                                    bArr5 = bArr2;
                                    i22 = i30;
                                    i20 = -1;
                                }
                            case 2:
                            case 3:
                                i7 = zzg;
                                unsafe3 = unsafe5;
                                i8 = i29;
                                bArr2 = bArr;
                                zzhnVar2 = zzhnVar3;
                                if (i32 != 0) {
                                    unsafe2 = unsafe3;
                                    unsafe = unsafe2;
                                    i6 = i8;
                                    i23 = i7;
                                    zzhnVar3 = zzhnVar2;
                                    i22 = i30;
                                    i5 = 1048575;
                                    i4 = i3;
                                    zzkoVar = zzkoVar2;
                                    obj2 = obj3;
                                    break;
                                } else {
                                    int zzb2 = zzhl.zzb(bArr2, i8, zzhnVar2);
                                    unsafe3.putLong(obj, j, zzhnVar2.zzb);
                                    obj3 = obj;
                                    i25 |= i36;
                                    unsafe5 = unsafe3;
                                    i19 = i2;
                                    i21 = zzb2;
                                    i23 = i7;
                                    zzhnVar3 = zzhnVar2;
                                    bArr5 = bArr2;
                                    i22 = i30;
                                    i20 = -1;
                                }
                            case 4:
                            case 11:
                                i7 = zzg;
                                unsafe3 = unsafe5;
                                i8 = i29;
                                bArr3 = bArr;
                                i10 = i2;
                                zzhnVar2 = zzhnVar3;
                                if (i32 != 0) {
                                    unsafe2 = unsafe3;
                                    unsafe = unsafe2;
                                    i6 = i8;
                                    i23 = i7;
                                    zzhnVar3 = zzhnVar2;
                                    i22 = i30;
                                    i5 = 1048575;
                                    i4 = i3;
                                    zzkoVar = zzkoVar2;
                                    obj2 = obj3;
                                    break;
                                } else {
                                    int zza3 = zzhl.zza(bArr3, i8, zzhnVar2);
                                    unsafe3.putInt(obj3, j, zzhnVar2.zza);
                                    i25 |= i36;
                                    i21 = zza3;
                                    i19 = i10;
                                    i23 = i7;
                                    zzhnVar3 = zzhnVar2;
                                    bArr5 = bArr3;
                                    i20 = -1;
                                    unsafe5 = unsafe3;
                                    i22 = i30;
                                }
                            case 5:
                            case 14:
                                zzhnVar2 = zzhnVar3;
                                bArr3 = bArr;
                                i7 = zzg;
                                unsafe3 = unsafe5;
                                i11 = i29;
                                i10 = i2;
                                if (i32 != 1) {
                                    i8 = i11;
                                    unsafe2 = unsafe3;
                                    unsafe = unsafe2;
                                    i6 = i8;
                                    i23 = i7;
                                    zzhnVar3 = zzhnVar2;
                                    i22 = i30;
                                    i5 = 1048575;
                                    i4 = i3;
                                    zzkoVar = zzkoVar2;
                                    obj2 = obj3;
                                    break;
                                } else {
                                    unsafe3.putLong(obj, j, zzhl.zzb(bArr3, i11));
                                    unsafe3 = unsafe3;
                                    obj3 = obj;
                                    i21 = i11 + 8;
                                    i25 |= i36;
                                    i19 = i10;
                                    i23 = i7;
                                    zzhnVar3 = zzhnVar2;
                                    bArr5 = bArr3;
                                    i20 = -1;
                                    unsafe5 = unsafe3;
                                    i22 = i30;
                                }
                            case 6:
                            case 13:
                                zzhnVar2 = zzhnVar3;
                                bArr3 = bArr;
                                i7 = zzg;
                                unsafe3 = unsafe5;
                                i11 = i29;
                                i10 = i2;
                                if (i32 != 5) {
                                    i8 = i11;
                                    unsafe2 = unsafe3;
                                    unsafe = unsafe2;
                                    i6 = i8;
                                    i23 = i7;
                                    zzhnVar3 = zzhnVar2;
                                    i22 = i30;
                                    i5 = 1048575;
                                    i4 = i3;
                                    zzkoVar = zzkoVar2;
                                    obj2 = obj3;
                                    break;
                                } else {
                                    unsafe3.putInt(obj3, j, zzhl.zza(bArr3, i11));
                                    i21 = i11 + 4;
                                    i25 |= i36;
                                    i19 = i10;
                                    i23 = i7;
                                    zzhnVar3 = zzhnVar2;
                                    bArr5 = bArr3;
                                    i20 = -1;
                                    unsafe5 = unsafe3;
                                    i22 = i30;
                                }
                            case 7:
                                zzhnVar2 = zzhnVar3;
                                bArr3 = bArr;
                                i7 = zzg;
                                unsafe3 = unsafe5;
                                i11 = i29;
                                i10 = i2;
                                if (i32 != 0) {
                                    i8 = i11;
                                    unsafe2 = unsafe3;
                                    unsafe = unsafe2;
                                    i6 = i8;
                                    i23 = i7;
                                    zzhnVar3 = zzhnVar2;
                                    i22 = i30;
                                    i5 = 1048575;
                                    i4 = i3;
                                    zzkoVar = zzkoVar2;
                                    obj2 = obj3;
                                    break;
                                } else {
                                    int zzb3 = zzhl.zzb(bArr3, i11, zzhnVar2);
                                    zzma.zza(obj3, j, zzhnVar2.zzb != 0);
                                    i25 |= i36;
                                    i21 = zzb3;
                                    i19 = i10;
                                    i23 = i7;
                                    zzhnVar3 = zzhnVar2;
                                    bArr5 = bArr3;
                                    i20 = -1;
                                    unsafe5 = unsafe3;
                                    i22 = i30;
                                }
                            case 8:
                                i7 = zzg;
                                zzhnVar2 = zzhnVar3;
                                unsafe4 = unsafe5;
                                if (i32 != 2) {
                                    i8 = i29;
                                    unsafe2 = unsafe4;
                                    unsafe = unsafe2;
                                    i6 = i8;
                                    i23 = i7;
                                    zzhnVar3 = zzhnVar2;
                                    i22 = i30;
                                    i5 = 1048575;
                                    i4 = i3;
                                    zzkoVar = zzkoVar2;
                                    obj2 = obj3;
                                    break;
                                } else {
                                    if ((536870912 & i33) == 0) {
                                        zzd = zzhl.zzc(bArr, i29, zzhnVar2);
                                    } else {
                                        zzd = zzhl.zzd(bArr, i29, zzhnVar2);
                                    }
                                    unsafe4.putObject(obj3, j, zzhnVar2.zzc);
                                    i25 |= i36;
                                    i21 = zzd;
                                    i19 = i2;
                                    i23 = i7;
                                    bArr5 = bArr;
                                    i22 = i30;
                                    i20 = -1;
                                    unsafe5 = unsafe4;
                                    zzhnVar3 = zzhnVar2;
                                }
                            case 9:
                                bArr4 = bArr;
                                i7 = zzg;
                                i12 = i29;
                                zzhnVar2 = zzhnVar3;
                                unsafe4 = unsafe5;
                                i13 = i2;
                                if (i32 != 2) {
                                    unsafe2 = unsafe4;
                                    i8 = i12;
                                    unsafe = unsafe2;
                                    i6 = i8;
                                    i23 = i7;
                                    zzhnVar3 = zzhnVar2;
                                    i22 = i30;
                                    i5 = 1048575;
                                    i4 = i3;
                                    zzkoVar = zzkoVar2;
                                    obj2 = obj3;
                                    break;
                                } else {
                                    zza2 = zzhl.zza(zzkoVar2.zza(i7), bArr4, i12, i13, zzhnVar2);
                                    if ((i25 & i36) == 0) {
                                        unsafe4.putObject(obj3, j, zzhnVar2.zzc);
                                    } else {
                                        unsafe4.putObject(obj3, j, zzjf.zza(unsafe4.getObject(obj3, j), zzhnVar2.zzc));
                                    }
                                    i25 |= i36;
                                    i21 = zza2;
                                    i19 = i13;
                                    bArr5 = bArr4;
                                    i23 = i7;
                                    i22 = i30;
                                    i20 = -1;
                                    unsafe5 = unsafe4;
                                    zzhnVar3 = zzhnVar2;
                                }
                            case 10:
                                bArr4 = bArr;
                                i7 = zzg;
                                i12 = i29;
                                zzhnVar2 = zzhnVar3;
                                unsafe4 = unsafe5;
                                i13 = i2;
                                if (i32 != 2) {
                                    unsafe2 = unsafe4;
                                    i8 = i12;
                                    unsafe = unsafe2;
                                    i6 = i8;
                                    i23 = i7;
                                    zzhnVar3 = zzhnVar2;
                                    i22 = i30;
                                    i5 = 1048575;
                                    i4 = i3;
                                    zzkoVar = zzkoVar2;
                                    obj2 = obj3;
                                    break;
                                } else {
                                    zza2 = zzhl.zze(bArr4, i12, zzhnVar2);
                                    unsafe4.putObject(obj3, j, zzhnVar2.zzc);
                                    i25 |= i36;
                                    i21 = zza2;
                                    i19 = i13;
                                    bArr5 = bArr4;
                                    i23 = i7;
                                    i22 = i30;
                                    i20 = -1;
                                    unsafe5 = unsafe4;
                                    zzhnVar3 = zzhnVar2;
                                }
                            case 12:
                                bArr4 = bArr;
                                i7 = zzg;
                                i12 = i29;
                                zzhnVar2 = zzhnVar3;
                                unsafe4 = unsafe5;
                                i13 = i2;
                                if (i32 != 0) {
                                    unsafe2 = unsafe4;
                                    i8 = i12;
                                    unsafe = unsafe2;
                                    i6 = i8;
                                    i23 = i7;
                                    zzhnVar3 = zzhnVar2;
                                    i22 = i30;
                                    i5 = 1048575;
                                    i4 = i3;
                                    zzkoVar = zzkoVar2;
                                    obj2 = obj3;
                                    break;
                                } else {
                                    zza2 = zzhl.zza(bArr4, i12, zzhnVar2);
                                    int i39 = zzhnVar2.zza;
                                    zzjg zzc = zzkoVar2.zzc(i7);
                                    if (zzc == null || zzc.zza(i39)) {
                                        unsafe4.putInt(obj3, j, i39);
                                        i25 |= i36;
                                        i21 = zza2;
                                        i19 = i13;
                                        bArr5 = bArr4;
                                        i23 = i7;
                                        i22 = i30;
                                        i20 = -1;
                                        unsafe5 = unsafe4;
                                        zzhnVar3 = zzhnVar2;
                                    } else {
                                        zze(obj3).zza(i26, Long.valueOf(i39));
                                        i21 = zza2;
                                        i19 = i13;
                                        bArr5 = bArr4;
                                        i23 = i7;
                                        i22 = i30;
                                        i20 = -1;
                                        unsafe5 = unsafe4;
                                        zzhnVar3 = zzhnVar2;
                                    }
                                }
                                break;
                            case 15:
                                bArr4 = bArr;
                                i7 = zzg;
                                i12 = i29;
                                zzhnVar2 = zzhnVar3;
                                unsafe4 = unsafe5;
                                i13 = i2;
                                if (i32 != 0) {
                                    unsafe2 = unsafe4;
                                    i8 = i12;
                                    unsafe = unsafe2;
                                    i6 = i8;
                                    i23 = i7;
                                    zzhnVar3 = zzhnVar2;
                                    i22 = i30;
                                    i5 = 1048575;
                                    i4 = i3;
                                    zzkoVar = zzkoVar2;
                                    obj2 = obj3;
                                    break;
                                } else {
                                    zza2 = zzhl.zza(bArr4, i12, zzhnVar2);
                                    unsafe4.putInt(obj3, j, zzif.zze(zzhnVar2.zza));
                                    i25 |= i36;
                                    i21 = zza2;
                                    i19 = i13;
                                    bArr5 = bArr4;
                                    i23 = i7;
                                    i22 = i30;
                                    i20 = -1;
                                    unsafe5 = unsafe4;
                                    zzhnVar3 = zzhnVar2;
                                }
                            case 16:
                                bArr4 = bArr;
                                zzhn zzhnVar4 = zzhnVar3;
                                i7 = zzg;
                                i12 = i29;
                                if (i32 != 0) {
                                    zzhnVar2 = zzhnVar4;
                                    unsafe4 = unsafe5;
                                    unsafe2 = unsafe4;
                                    i8 = i12;
                                    unsafe = unsafe2;
                                    i6 = i8;
                                    i23 = i7;
                                    zzhnVar3 = zzhnVar2;
                                    i22 = i30;
                                    i5 = 1048575;
                                    i4 = i3;
                                    zzkoVar = zzkoVar2;
                                    obj2 = obj3;
                                    break;
                                } else {
                                    int zzb4 = zzhl.zzb(bArr4, i12, zzhnVar4);
                                    zzhnVar2 = zzhnVar4;
                                    Object obj4 = obj3;
                                    Unsafe unsafe6 = unsafe5;
                                    i13 = i2;
                                    unsafe6.putLong(obj4, j, zzif.zza(zzhnVar4.zzb));
                                    unsafe4 = unsafe6;
                                    obj3 = obj4;
                                    i25 |= i36;
                                    i21 = zzb4;
                                    i19 = i13;
                                    bArr5 = bArr4;
                                    i23 = i7;
                                    i22 = i30;
                                    i20 = -1;
                                    unsafe5 = unsafe4;
                                    zzhnVar3 = zzhnVar2;
                                }
                            case 17:
                                if (i32 != 3) {
                                    i7 = zzg;
                                    zzhnVar2 = zzhnVar3;
                                    unsafe2 = unsafe5;
                                    i8 = i29;
                                    unsafe = unsafe2;
                                    i6 = i8;
                                    i23 = i7;
                                    zzhnVar3 = zzhnVar2;
                                    i22 = i30;
                                    i5 = 1048575;
                                    i4 = i3;
                                    zzkoVar = zzkoVar2;
                                    obj2 = obj3;
                                    break;
                                } else {
                                    zzhn zzhnVar5 = zzhnVar3;
                                    int i40 = zzg;
                                    int zza4 = zzhl.zza(zzkoVar2.zza(zzg), bArr, i29, i2, (i30 << 3) | 4, zzhnVar5);
                                    if ((i25 & i36) == 0) {
                                        unsafe5.putObject(obj3, j, zzhnVar5.zzc);
                                    } else {
                                        unsafe5.putObject(obj3, j, zzjf.zza(unsafe5.getObject(obj3, j), zzhnVar5.zzc));
                                    }
                                    i25 |= i36;
                                    i19 = i2;
                                    zzhnVar3 = zzhnVar5;
                                    i23 = i40;
                                    i22 = i30;
                                    i20 = -1;
                                    i21 = zza4;
                                    bArr5 = bArr;
                                }
                            default:
                                zzhnVar2 = zzhnVar3;
                                i7 = zzg;
                                unsafe2 = unsafe5;
                                i8 = i29;
                                unsafe = unsafe2;
                                i6 = i8;
                                i23 = i7;
                                zzhnVar3 = zzhnVar2;
                                i22 = i30;
                                i5 = 1048575;
                                i4 = i3;
                                zzkoVar = zzkoVar2;
                                obj2 = obj3;
                                break;
                        }
                    } else {
                        int i41 = zzg;
                        Unsafe unsafe7 = unsafe5;
                        zzhn zzhnVar6 = zzhnVar3;
                        if (i34 != 27) {
                            i14 = i29;
                            if (i34 <= 49) {
                                i15 = i41;
                                i16 = i24;
                                i17 = i25;
                                unsafe = unsafe7;
                                i5 = 1048575;
                                int zza5 = zzkoVar2.zza(obj, bArr, i14, i2, i26, i30, i32, i15, i33, i34, j, zzhnVar);
                                i26 = i26;
                                i18 = i30;
                                if (zza5 == i14) {
                                    zzkoVar = this;
                                    i4 = i3;
                                    zzhnVar3 = zzhnVar;
                                    i6 = zza5;
                                    i23 = i15;
                                    i22 = i18;
                                    i24 = i16;
                                    i25 = i17;
                                    obj2 = obj;
                                } else {
                                    zzkoVar2 = this;
                                    obj3 = obj;
                                    bArr5 = bArr;
                                    i19 = i2;
                                    zzhnVar3 = zzhnVar;
                                    i21 = zza5;
                                    i23 = i15;
                                    i22 = i18;
                                    i24 = i16;
                                    i25 = i17;
                                    unsafe5 = unsafe;
                                    i20 = -1;
                                }
                            } else {
                                i15 = i41;
                                i16 = i24;
                                i17 = i25;
                                unsafe = unsafe7;
                                i18 = i30;
                                i5 = 1048575;
                                if (i34 != 50) {
                                    i22 = i18;
                                    int zza6 = zza(obj, bArr, i14, i2, i26, i22, i32, i33, i34, j, i15, zzhnVar);
                                    i26 = i26;
                                    zzhnVar3 = zzhnVar;
                                    zzkoVar = this;
                                    obj2 = obj;
                                    i4 = i3;
                                    if (zza6 == i14) {
                                        i6 = zza6;
                                        i23 = i15;
                                        i24 = i16;
                                        i25 = i17;
                                    } else {
                                        bArr5 = bArr;
                                        i19 = i2;
                                        zzhnVar3 = zzhnVar;
                                        i21 = zza6;
                                        i23 = i15;
                                        zzkoVar2 = zzkoVar;
                                        obj3 = obj2;
                                        i24 = i16;
                                        i25 = i17;
                                        unsafe5 = unsafe;
                                        i20 = -1;
                                    }
                                } else if (i32 == 2) {
                                    int zza7 = zza(obj, bArr, i14, i2, i15, j, zzhnVar);
                                    i15 = i15;
                                    if (zza7 == i14) {
                                        zzkoVar = this;
                                        i4 = i3;
                                        zzhnVar3 = zzhnVar;
                                        i6 = zza7;
                                        i23 = i15;
                                        i22 = i18;
                                        i24 = i16;
                                        i25 = i17;
                                        obj2 = obj;
                                    } else {
                                        zzkoVar2 = this;
                                        obj3 = obj;
                                        bArr5 = bArr;
                                        i19 = i2;
                                        zzhnVar3 = zzhnVar;
                                        i21 = zza7;
                                        i23 = i15;
                                        i22 = i18;
                                        i24 = i16;
                                        i25 = i17;
                                        unsafe5 = unsafe;
                                        i20 = -1;
                                    }
                                }
                            }
                        } else if (i32 == 2) {
                            zzjl zzjlVar = (zzjl) unsafe7.getObject(obj3, j);
                            if (!zzjlVar.zza()) {
                                int size = zzjlVar.size();
                                zzjlVar = zzjlVar.zza(size == 0 ? 10 : size << 1);
                                unsafe7.putObject(obj3, j, zzjlVar);
                            }
                            int zza8 = zzhl.zza(zzkoVar2.zza(i41), i26, bArr, i29, i2, zzjlVar, zzhnVar6);
                            bArr5 = bArr;
                            i19 = i2;
                            zzhnVar3 = zzhnVar;
                            i21 = zza8;
                            i23 = i41;
                            unsafe5 = unsafe7;
                            i22 = i30;
                            i20 = -1;
                            obj3 = obj;
                        } else {
                            i15 = i41;
                            i16 = i24;
                            i17 = i25;
                            i14 = i29;
                            i18 = i30;
                            i5 = 1048575;
                            unsafe = unsafe7;
                        }
                        zzkoVar = this;
                        i4 = i3;
                        zzhnVar3 = zzhnVar;
                        i6 = i14;
                        i23 = i15;
                        i22 = i18;
                        i24 = i16;
                        i25 = i17;
                        obj2 = obj;
                    }
                }
                if (i26 != i4 || i4 == 0) {
                    if (zzkoVar.zzh && zzhnVar3.zzd != zzio.zzb()) {
                        zzhnVar3.zzd.zza(zzkoVar.zzg, i22);
                        int zza9 = zzhl.zza(i26, bArr, i6, i2, zze(obj2), zzhnVar3);
                        i19 = i2;
                        zzhnVar3 = zzhnVar;
                        i21 = zza9;
                        zzkoVar2 = zzkoVar;
                        obj3 = obj2;
                        unsafe5 = unsafe;
                        i20 = -1;
                    } else {
                        zzhnVar3 = zzhnVar;
                        int zza10 = zzhl.zza(i26, bArr, i6, i2, zze(obj2), zzhnVar3);
                        i19 = i2;
                        zzkoVar2 = zzkoVar;
                        obj3 = obj2;
                        unsafe5 = unsafe;
                        i20 = -1;
                        i21 = zza10;
                    }
                    bArr5 = bArr;
                } else {
                    i19 = i2;
                    i21 = i6;
                }
            } else {
                i4 = i3;
                zzkoVar = zzkoVar2;
                obj2 = obj3;
                unsafe = unsafe5;
                i5 = 1048575;
            }
        }
        if (i24 != i5) {
            unsafe.putInt(obj2, i24, i25);
        }
        zzlx zzlxVar = null;
        for (int i42 = zzkoVar.zzm; i42 < zzkoVar.zzn; i42++) {
            zzlxVar = (zzlx) zzkoVar.zza(obj2, zzkoVar.zzl[i42], zzlxVar, zzkoVar.zzq);
        }
        if (zzlxVar != null) {
            zzkoVar.zzq.zzb(obj2, zzlxVar);
        }
        if (i4 == 0) {
            if (i21 != i19) {
                throw zzjk.zzg();
            }
        } else if (i21 > i19 || i26 != i4) {
            throw zzjk.zzg();
        }
        return i21;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0086. Please report as an issue. */
    @Override // com.google.android.gms.internal.vision.zzlc
    public final void zza(Object obj, byte[] bArr, int i, int i2, zzhn zzhnVar) {
        int zzg;
        Object obj2;
        Unsafe unsafe;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        zzko zzkoVar = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i12 = i2;
        zzhn zzhnVar2 = zzhnVar;
        if (zzkoVar.zzj) {
            Unsafe unsafe2 = zzb;
            int i13 = -1;
            int i14 = i;
            int i15 = -1;
            int i16 = 0;
            int i17 = 1048575;
            int i18 = 0;
            while (i14 < i12) {
                int i19 = i14 + 1;
                int i20 = bArr2[i14];
                if (i20 < 0) {
                    i19 = zzhl.zza(i20, bArr2, i19, zzhnVar2);
                    i20 = zzhnVar2.zza;
                }
                int i21 = i19;
                int i22 = i20 >>> 3;
                int i23 = i20 & 7;
                if (i22 > i15) {
                    zzg = zzkoVar.zza(i22, i16 / 3);
                } else {
                    zzg = zzkoVar.zzg(i22);
                }
                if (zzg == i13) {
                    obj2 = obj3;
                    unsafe = unsafe2;
                    i3 = i20;
                    i4 = i22;
                    i5 = 0;
                } else {
                    int[] iArr = zzkoVar.zzc;
                    int i24 = iArr[zzg + 1];
                    int i25 = (i24 & 267386880) >>> 20;
                    int i26 = i20;
                    int i27 = zzg;
                    long j = i24 & 1048575;
                    if (i25 <= 17) {
                        int i28 = iArr[i27 + 2];
                        int i29 = 1 << (i28 >>> 20);
                        int i30 = i28 & 1048575;
                        int i31 = 1048575;
                        if (i30 != i17) {
                            if (i17 != 1048575) {
                                unsafe2.putInt(obj3, i17, i18);
                                i31 = 1048575;
                            }
                            if (i30 != i31) {
                                i18 = unsafe2.getInt(obj3, i30);
                            }
                            i17 = i30;
                        }
                        switch (i25) {
                            case 0:
                                if (i23 != 1) {
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i4 = i22;
                                    i5 = i27;
                                    i3 = i26;
                                    break;
                                } else {
                                    zzma.zza(obj3, j, zzhl.zzc(bArr2, i21));
                                    i14 = i21 + 8;
                                    i18 |= i29;
                                    i12 = i2;
                                    i15 = i22;
                                    i16 = i27;
                                    i13 = -1;
                                    break;
                                }
                            case 1:
                                if (i23 != 5) {
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i4 = i22;
                                    i5 = i27;
                                    i3 = i26;
                                    break;
                                } else {
                                    zzma.zza(obj3, j, zzhl.zzd(bArr2, i21));
                                    i14 = i21 + 4;
                                    i18 |= i29;
                                    i12 = i2;
                                    i15 = i22;
                                    i16 = i27;
                                    i13 = -1;
                                    break;
                                }
                            case 2:
                            case 3:
                                if (i23 != 0) {
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i4 = i22;
                                    i5 = i27;
                                    i3 = i26;
                                    break;
                                } else {
                                    int zzb2 = zzhl.zzb(bArr2, i21, zzhnVar2);
                                    Unsafe unsafe3 = unsafe2;
                                    Object obj4 = obj3;
                                    unsafe3.putLong(obj4, j, zzhnVar2.zzb);
                                    unsafe2 = unsafe3;
                                    obj3 = obj4;
                                    i18 |= i29;
                                    i14 = zzb2;
                                    i15 = i22;
                                    i16 = i27;
                                    i13 = -1;
                                    i12 = i2;
                                    break;
                                }
                            case 4:
                            case 11:
                                if (i23 != 0) {
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i4 = i22;
                                    i5 = i27;
                                    i3 = i26;
                                    break;
                                } else {
                                    int zza2 = zzhl.zza(bArr2, i21, zzhnVar2);
                                    unsafe2.putInt(obj3, j, zzhnVar2.zza);
                                    i18 |= i29;
                                    i12 = i2;
                                    i14 = zza2;
                                    i15 = i22;
                                    i16 = i27;
                                    i13 = -1;
                                    break;
                                }
                            case 5:
                            case 14:
                                if (i23 != 1) {
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i4 = i22;
                                    i5 = i27;
                                    i3 = i26;
                                    break;
                                } else {
                                    Unsafe unsafe4 = unsafe2;
                                    Object obj5 = obj3;
                                    unsafe4.putLong(obj5, j, zzhl.zzb(bArr2, i21));
                                    unsafe2 = unsafe4;
                                    obj3 = obj5;
                                    i14 = i21 + 8;
                                    i18 |= i29;
                                    i12 = i2;
                                    i15 = i22;
                                    i16 = i27;
                                    i13 = -1;
                                    break;
                                }
                            case 6:
                            case 13:
                                if (i23 != 5) {
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i4 = i22;
                                    i5 = i27;
                                    i3 = i26;
                                    break;
                                } else {
                                    unsafe2.putInt(obj3, j, zzhl.zza(bArr2, i21));
                                    i14 = i21 + 4;
                                    i18 |= i29;
                                    i12 = i2;
                                    i15 = i22;
                                    i16 = i27;
                                    i13 = -1;
                                    break;
                                }
                            case 7:
                                if (i23 != 0) {
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i4 = i22;
                                    i5 = i27;
                                    i3 = i26;
                                    break;
                                } else {
                                    i14 = zzhl.zzb(bArr2, i21, zzhnVar2);
                                    zzma.zza(obj3, j, zzhnVar2.zzb != 0);
                                    i18 |= i29;
                                    i12 = i2;
                                    i15 = i22;
                                    i16 = i27;
                                    i13 = -1;
                                    break;
                                }
                            case 8:
                                if (i23 != 2) {
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i4 = i22;
                                    i5 = i27;
                                    i3 = i26;
                                    break;
                                } else {
                                    if ((536870912 & i24) == 0) {
                                        i14 = zzhl.zzc(bArr2, i21, zzhnVar2);
                                    } else {
                                        i14 = zzhl.zzd(bArr2, i21, zzhnVar2);
                                    }
                                    unsafe2.putObject(obj3, j, zzhnVar2.zzc);
                                    i18 |= i29;
                                    i15 = i22;
                                    i16 = i27;
                                    i13 = -1;
                                    break;
                                }
                            case 9:
                                i11 = i27;
                                if (i23 != 2) {
                                    i27 = i11;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i4 = i22;
                                    i5 = i27;
                                    i3 = i26;
                                    break;
                                } else {
                                    i14 = zzhl.zza(zzkoVar.zza(i11), bArr2, i21, i12, zzhnVar2);
                                    Object object = unsafe2.getObject(obj3, j);
                                    if (object == null) {
                                        unsafe2.putObject(obj3, j, zzhnVar2.zzc);
                                    } else {
                                        unsafe2.putObject(obj3, j, zzjf.zza(object, zzhnVar2.zzc));
                                    }
                                    i18 |= i29;
                                    i15 = i22;
                                    i16 = i11;
                                    i13 = -1;
                                    break;
                                }
                            case 10:
                                i11 = i27;
                                if (i23 != 2) {
                                    i27 = i11;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i4 = i22;
                                    i5 = i27;
                                    i3 = i26;
                                    break;
                                } else {
                                    i14 = zzhl.zze(bArr2, i21, zzhnVar2);
                                    unsafe2.putObject(obj3, j, zzhnVar2.zzc);
                                    i18 |= i29;
                                    i15 = i22;
                                    i16 = i11;
                                    i13 = -1;
                                    break;
                                }
                            case 12:
                                i11 = i27;
                                if (i23 != 0) {
                                    i27 = i11;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i4 = i22;
                                    i5 = i27;
                                    i3 = i26;
                                    break;
                                } else {
                                    i14 = zzhl.zza(bArr2, i21, zzhnVar2);
                                    unsafe2.putInt(obj3, j, zzhnVar2.zza);
                                    i18 |= i29;
                                    i15 = i22;
                                    i16 = i11;
                                    i13 = -1;
                                    break;
                                }
                            case 15:
                                i11 = i27;
                                if (i23 != 0) {
                                    i27 = i11;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i4 = i22;
                                    i5 = i27;
                                    i3 = i26;
                                    break;
                                } else {
                                    i14 = zzhl.zza(bArr2, i21, zzhnVar2);
                                    unsafe2.putInt(obj3, j, zzif.zze(zzhnVar2.zza));
                                    i18 |= i29;
                                    i15 = i22;
                                    i16 = i11;
                                    i13 = -1;
                                    break;
                                }
                            case 16:
                                if (i23 != 0) {
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i4 = i22;
                                    i5 = i27;
                                    i3 = i26;
                                    break;
                                } else {
                                    int zzb3 = zzhl.zzb(bArr2, i21, zzhnVar2);
                                    Unsafe unsafe5 = unsafe2;
                                    Object obj6 = obj3;
                                    i11 = i27;
                                    unsafe5.putLong(obj6, j, zzif.zza(zzhnVar2.zzb));
                                    unsafe2 = unsafe5;
                                    obj3 = obj6;
                                    i18 |= i29;
                                    i14 = zzb3;
                                    i15 = i22;
                                    i16 = i11;
                                    i13 = -1;
                                    break;
                                }
                            default:
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i4 = i22;
                                i5 = i27;
                                i3 = i26;
                                break;
                        }
                    } else {
                        i5 = i27;
                        if (i25 != 27) {
                            i6 = i21;
                            Unsafe unsafe6 = unsafe2;
                            if (i25 <= 49) {
                                int i32 = i17;
                                i7 = i18;
                                unsafe = unsafe6;
                                int zza3 = zzkoVar.zza(obj, bArr, i6, i2, i26, i22, i23, i5, i24, i25, j, zzhnVar);
                                if (zza3 == i6) {
                                    i21 = zza3;
                                    i4 = i22;
                                    i3 = i26;
                                    i18 = i7;
                                    obj2 = obj;
                                    i17 = i32;
                                } else {
                                    zzkoVar = this;
                                    obj3 = obj;
                                    i17 = i32;
                                    zzhnVar2 = zzhnVar;
                                    i14 = zza3;
                                    i16 = i5;
                                    i15 = i22;
                                    i18 = i7;
                                    unsafe2 = unsafe;
                                    i13 = -1;
                                    bArr2 = bArr;
                                    i12 = i2;
                                }
                            } else {
                                i7 = i18;
                                unsafe = unsafe6;
                                i8 = i22;
                                i9 = i17;
                                i10 = i26;
                                if (i25 != 50) {
                                    i4 = i8;
                                    int zza4 = zza(obj, bArr, i6, i2, i10, i4, i23, i24, i25, j, i5, zzhnVar);
                                    obj2 = obj;
                                    i3 = i10;
                                    i5 = i5;
                                    if (zza4 == i6) {
                                        i21 = zza4;
                                        i17 = i9;
                                        i18 = i7;
                                    } else {
                                        zzkoVar = this;
                                        zzhnVar2 = zzhnVar;
                                        i15 = i4;
                                        i14 = zza4;
                                        i16 = i5;
                                        obj3 = obj2;
                                        i17 = i9;
                                        i18 = i7;
                                        unsafe2 = unsafe;
                                        i13 = -1;
                                        bArr2 = bArr;
                                        i12 = i2;
                                    }
                                } else if (i23 == 2) {
                                    int zza5 = zza(obj, bArr, i6, i2, i5, j, zzhnVar);
                                    i5 = i5;
                                    if (zza5 == i6) {
                                        i21 = zza5;
                                        i4 = i8;
                                        i3 = i10;
                                        i17 = i9;
                                        i18 = i7;
                                        obj2 = obj;
                                    } else {
                                        zzkoVar = this;
                                        obj3 = obj;
                                        bArr2 = bArr;
                                        zzhnVar2 = zzhnVar;
                                        i14 = zza5;
                                        i16 = i5;
                                        i15 = i8;
                                        i17 = i9;
                                        i18 = i7;
                                        unsafe2 = unsafe;
                                        i13 = -1;
                                        i12 = i2;
                                    }
                                } else {
                                    i5 = i5;
                                    i21 = i6;
                                    i4 = i8;
                                    i3 = i10;
                                    i17 = i9;
                                    i18 = i7;
                                    obj2 = obj;
                                }
                            }
                        } else if (i23 == 2) {
                            zzjl zzjlVar = (zzjl) unsafe2.getObject(obj3, j);
                            if (!zzjlVar.zza()) {
                                int size = zzjlVar.size();
                                zzjlVar = zzjlVar.zza(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(obj3, j, zzjlVar);
                            }
                            int zza6 = zzhl.zza(zzkoVar.zza(i5), i26, bArr2, i21, i2, zzjlVar, zzhnVar2);
                            bArr2 = bArr;
                            zzhnVar2 = zzhnVar;
                            i14 = zza6;
                            i16 = i5;
                            unsafe2 = unsafe2;
                            i15 = i22;
                            i13 = -1;
                            obj3 = obj;
                            i12 = i2;
                        } else {
                            i6 = i21;
                            i7 = i18;
                            unsafe = unsafe2;
                            i8 = i22;
                            i9 = i17;
                            i10 = i26;
                            i21 = i6;
                            i4 = i8;
                            i3 = i10;
                            i17 = i9;
                            i18 = i7;
                            obj2 = obj;
                        }
                    }
                }
                int zza7 = zzhl.zza(i3, bArr, i21, i2, zze(obj2), zzhnVar);
                bArr2 = bArr;
                zzhnVar2 = zzhnVar;
                i15 = i4;
                i16 = i5;
                obj3 = obj2;
                unsafe2 = unsafe;
                i13 = -1;
                i12 = i2;
                i14 = zza7;
                zzkoVar = this;
            }
            Object obj7 = obj3;
            Unsafe unsafe7 = unsafe2;
            int i33 = i12;
            int i34 = i17;
            int i35 = i18;
            if (i34 != 1048575) {
                unsafe7.putInt(obj7, i34, i35);
            }
            if (i14 != i33) {
                throw zzjk.zzg();
            }
            return;
        }
        zza(obj3, bArr, i, i12, 0, zzhnVar);
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final void zzc(Object obj) {
        int i;
        int i2 = this.zzm;
        while (true) {
            i = this.zzn;
            if (i2 >= i) {
                break;
            }
            long zzd = zzd(this.zzl[i2]) & 1048575;
            Object zzf = zzma.zzf(obj, zzd);
            if (zzf != null) {
                zzma.zza(obj, zzd, this.zzs.zze(zzf));
            }
            i2++;
        }
        int length = this.zzl.length;
        while (i < length) {
            this.zzp.zzb(obj, this.zzl[i]);
            i++;
        }
        this.zzq.zzd(obj);
        if (this.zzh) {
            this.zzr.zzc(obj);
        }
    }

    private final Object zza(Object obj, int i, Object obj2, zzlu zzluVar) {
        zzjg zzc;
        int i2 = this.zzc[i];
        Object zzf = zzma.zzf(obj, zzd(i) & 1048575);
        return (zzf == null || (zzc = zzc(i)) == null) ? obj2 : zza(i, i2, this.zzs.zza(zzf), zzc, obj2, zzluVar);
    }

    private final Object zza(int i, int i2, Map map, zzjg zzjgVar, Object obj, zzlu zzluVar) {
        this.zzs.zzb(zzb(i));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzjgVar.zza(((Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = zzluVar.zza();
                }
                zzib zzc = zzht.zzc(zzkc.zza(null, entry.getKey(), entry.getValue()));
                try {
                    zzkc.zza(zzc.zzb(), null, entry.getKey(), entry.getValue());
                    zzluVar.zza(obj, i2, zzc.zza());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final boolean zzd(Object obj) {
        int i;
        int i2;
        zzko zzkoVar;
        Object obj2;
        int i3 = 0;
        int i4 = 1048575;
        int i5 = 0;
        while (i3 < this.zzm) {
            int i6 = this.zzl[i3];
            int i7 = this.zzc[i6];
            int zzd = zzd(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i4) {
                if (i9 != 1048575) {
                    i5 = zzb.getInt(obj, i9);
                }
                i2 = i5;
                i = i9;
            } else {
                i = i4;
                i2 = i5;
            }
            if ((268435456 & zzd) != 0) {
                zzkoVar = this;
                obj2 = obj;
                if (!zzkoVar.zza(obj2, i6, i, i2, i10)) {
                    return false;
                }
            } else {
                zzkoVar = this;
                obj2 = obj;
            }
            int i11 = (267386880 & zzd) >>> 20;
            if (i11 == 9 || i11 == 17) {
                if (zzkoVar.zza(obj2, i6, i, i2, i10) && !zza(obj2, zzd, zza(i6))) {
                    return false;
                }
            } else {
                if (i11 != 27) {
                    if (i11 == 60 || i11 == 68) {
                        if (zza(obj2, i7, i6) && !zza(obj2, zzd, zza(i6))) {
                            return false;
                        }
                    } else if (i11 != 49) {
                        if (i11 == 50 && !zzkoVar.zzs.zzc(zzma.zzf(obj2, zzd & 1048575)).isEmpty()) {
                            zzkoVar.zzs.zzb(zzb(i6));
                            throw null;
                        }
                    }
                }
                List list = (List) zzma.zzf(obj2, zzd & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzlc zza2 = zza(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!zza2.zzd(list.get(i12))) {
                            return false;
                        }
                    }
                }
            }
            i3++;
            obj = obj2;
            i4 = i;
            i5 = i2;
        }
        return !this.zzh || this.zzr.zza(obj).zzf();
    }

    private static boolean zza(Object obj, int i, zzlc zzlcVar) {
        return zzlcVar.zzd(zzma.zzf(obj, i & 1048575));
    }

    private static void zza(int i, Object obj, zzmr zzmrVar) {
        if (obj instanceof String) {
            zzmrVar.zza(i, (String) obj);
        } else {
            zzmrVar.zza(i, (zzht) obj);
        }
    }

    private final int zzd(int i) {
        return this.zzc[i + 1];
    }

    private final int zze(int i) {
        return this.zzc[i + 2];
    }

    private static double zzb(Object obj, long j) {
        return ((Double) zzma.zzf(obj, j)).doubleValue();
    }

    private static float zzc(Object obj, long j) {
        return ((Float) zzma.zzf(obj, j)).floatValue();
    }

    private static int zzd(Object obj, long j) {
        return ((Integer) zzma.zzf(obj, j)).intValue();
    }

    private static long zze(Object obj, long j) {
        return ((Long) zzma.zzf(obj, j)).longValue();
    }

    private static boolean zzf(Object obj, long j) {
        return ((Boolean) zzma.zzf(obj, j)).booleanValue();
    }

    private final boolean zzc(Object obj, Object obj2, int i) {
        return zza(obj, i) == zza(obj2, i);
    }

    private final boolean zza(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zza(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private final boolean zza(Object obj, int i) {
        int zze = zze(i);
        long j = zze & 1048575;
        if (j != 1048575) {
            return (zzma.zza(obj, j) & (1 << (zze >>> 20))) != 0;
        }
        int zzd = zzd(i);
        long j2 = zzd & 1048575;
        switch ((zzd & 267386880) >>> 20) {
            case 0:
                return zzma.zze(obj, j2) != 0.0d;
            case 1:
                return zzma.zzd(obj, j2) != 0.0f;
            case 2:
                return zzma.zzb(obj, j2) != 0;
            case 3:
                return zzma.zzb(obj, j2) != 0;
            case 4:
                return zzma.zza(obj, j2) != 0;
            case 5:
                return zzma.zzb(obj, j2) != 0;
            case 6:
                return zzma.zza(obj, j2) != 0;
            case 7:
                return zzma.zzc(obj, j2);
            case 8:
                Object zzf = zzma.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzht) {
                    return !zzht.zza.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzma.zzf(obj, j2) != null;
            case 10:
                return !zzht.zza.equals(zzma.zzf(obj, j2));
            case 11:
                return zzma.zza(obj, j2) != 0;
            case 12:
                return zzma.zza(obj, j2) != 0;
            case 13:
                return zzma.zza(obj, j2) != 0;
            case 14:
                return zzma.zzb(obj, j2) != 0;
            case 15:
                return zzma.zza(obj, j2) != 0;
            case 16:
                return zzma.zzb(obj, j2) != 0;
            case 17:
                return zzma.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzb(Object obj, int i) {
        int zze = zze(i);
        long j = 1048575 & zze;
        if (j == 1048575) {
            return;
        }
        zzma.zza(obj, j, (1 << (zze >>> 20)) | zzma.zza(obj, j));
    }

    private final boolean zza(Object obj, int i, int i2) {
        return zzma.zza(obj, (long) (zze(i2) & 1048575)) == i;
    }

    private final void zzb(Object obj, int i, int i2) {
        zzma.zza(obj, zze(i2) & 1048575, i);
    }

    private final int zzg(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzb(i, 0);
    }

    private final int zza(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzb(i, i2);
    }

    private final int zzb(int i, int i2) {
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
}
