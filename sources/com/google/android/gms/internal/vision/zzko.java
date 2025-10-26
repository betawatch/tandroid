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

    /* JADX WARN: Removed duplicated region for block: B:106:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0399  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzko zza(Class cls, zzki zzkiVar, zzks zzksVar, zzju zzjuVar, zzlu zzluVar, zziq zziqVar, zzkh zzkhVar) {
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int charAt4;
        int charAt5;
        int i2;
        int[] iArr;
        int i3;
        char charAt6;
        int i4;
        char charAt7;
        int i5;
        char charAt8;
        int i6;
        char charAt9;
        int i7;
        char charAt10;
        int i8;
        char charAt11;
        int i9;
        char charAt12;
        int i10;
        char charAt13;
        int i11;
        int i12;
        int i13;
        int i14;
        zzla zzlaVar;
        int i15;
        int objectFieldOffset;
        int i16;
        String str;
        int i17;
        int i18;
        int i19;
        Field zza2;
        char charAt14;
        int i20;
        int i21;
        Field zza3;
        Field zza4;
        int i22;
        char charAt15;
        int i23;
        char charAt16;
        int i24;
        char charAt17;
        int i25;
        char charAt18;
        if (zzkiVar instanceof zzla) {
            zzla zzlaVar2 = (zzla) zzkiVar;
            int i26 = 0;
            boolean z = zzlaVar2.zza() == zzkz.zzb;
            String zzd = zzlaVar2.zzd();
            int length = zzd.length();
            if (zzd.charAt(0) >= 55296) {
                int i27 = 1;
                while (true) {
                    i = i27 + 1;
                    if (zzd.charAt(i27) < 55296) {
                        break;
                    }
                    i27 = i;
                }
            } else {
                i = 1;
            }
            int i28 = i + 1;
            int charAt19 = zzd.charAt(i);
            if (charAt19 >= 55296) {
                int i29 = charAt19 & 8191;
                int i30 = 13;
                while (true) {
                    i25 = i28 + 1;
                    charAt18 = zzd.charAt(i28);
                    if (charAt18 < 55296) {
                        break;
                    }
                    i29 |= (charAt18 & 8191) << i30;
                    i30 += 13;
                    i28 = i25;
                }
                charAt19 = i29 | (charAt18 << i30);
                i28 = i25;
            }
            if (charAt19 == 0) {
                iArr = zza;
                i2 = 0;
                charAt = 0;
                charAt2 = 0;
                charAt3 = 0;
                charAt4 = 0;
                charAt5 = 0;
            } else {
                int i31 = i28 + 1;
                int charAt20 = zzd.charAt(i28);
                if (charAt20 >= 55296) {
                    int i32 = charAt20 & 8191;
                    int i33 = 13;
                    while (true) {
                        i10 = i31 + 1;
                        charAt13 = zzd.charAt(i31);
                        if (charAt13 < 55296) {
                            break;
                        }
                        i32 |= (charAt13 & 8191) << i33;
                        i33 += 13;
                        i31 = i10;
                    }
                    charAt20 = i32 | (charAt13 << i33);
                    i31 = i10;
                }
                int i34 = i31 + 1;
                int charAt21 = zzd.charAt(i31);
                if (charAt21 >= 55296) {
                    int i35 = charAt21 & 8191;
                    int i36 = 13;
                    while (true) {
                        i9 = i34 + 1;
                        charAt12 = zzd.charAt(i34);
                        if (charAt12 < 55296) {
                            break;
                        }
                        i35 |= (charAt12 & 8191) << i36;
                        i36 += 13;
                        i34 = i9;
                    }
                    charAt21 = i35 | (charAt12 << i36);
                    i34 = i9;
                }
                int i37 = i34 + 1;
                charAt = zzd.charAt(i34);
                if (charAt >= 55296) {
                    int i38 = charAt & 8191;
                    int i39 = 13;
                    while (true) {
                        i8 = i37 + 1;
                        charAt11 = zzd.charAt(i37);
                        if (charAt11 < 55296) {
                            break;
                        }
                        i38 |= (charAt11 & 8191) << i39;
                        i39 += 13;
                        i37 = i8;
                    }
                    charAt = i38 | (charAt11 << i39);
                    i37 = i8;
                }
                int i40 = i37 + 1;
                charAt2 = zzd.charAt(i37);
                if (charAt2 >= 55296) {
                    int i41 = charAt2 & 8191;
                    int i42 = 13;
                    while (true) {
                        i7 = i40 + 1;
                        charAt10 = zzd.charAt(i40);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i41 |= (charAt10 & 8191) << i42;
                        i42 += 13;
                        i40 = i7;
                    }
                    charAt2 = i41 | (charAt10 << i42);
                    i40 = i7;
                }
                int i43 = i40 + 1;
                charAt3 = zzd.charAt(i40);
                if (charAt3 >= 55296) {
                    int i44 = charAt3 & 8191;
                    int i45 = 13;
                    while (true) {
                        i6 = i43 + 1;
                        charAt9 = zzd.charAt(i43);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i44 |= (charAt9 & 8191) << i45;
                        i45 += 13;
                        i43 = i6;
                    }
                    charAt3 = i44 | (charAt9 << i45);
                    i43 = i6;
                }
                int i46 = i43 + 1;
                charAt4 = zzd.charAt(i43);
                if (charAt4 >= 55296) {
                    int i47 = charAt4 & 8191;
                    int i48 = 13;
                    while (true) {
                        i5 = i46 + 1;
                        charAt8 = zzd.charAt(i46);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i47 |= (charAt8 & 8191) << i48;
                        i48 += 13;
                        i46 = i5;
                    }
                    charAt4 = i47 | (charAt8 << i48);
                    i46 = i5;
                }
                int i49 = i46 + 1;
                int charAt22 = zzd.charAt(i46);
                if (charAt22 >= 55296) {
                    int i50 = charAt22 & 8191;
                    int i51 = 13;
                    while (true) {
                        i4 = i49 + 1;
                        charAt7 = zzd.charAt(i49);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i50 |= (charAt7 & 8191) << i51;
                        i51 += 13;
                        i49 = i4;
                    }
                    charAt22 = i50 | (charAt7 << i51);
                    i49 = i4;
                }
                int i52 = i49 + 1;
                charAt5 = zzd.charAt(i49);
                if (charAt5 >= 55296) {
                    int i53 = charAt5 & 8191;
                    int i54 = i52;
                    int i55 = 13;
                    while (true) {
                        i3 = i54 + 1;
                        charAt6 = zzd.charAt(i54);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i53 |= (charAt6 & 8191) << i55;
                        i55 += 13;
                        i54 = i3;
                    }
                    charAt5 = i53 | (charAt6 << i55);
                    i52 = i3;
                }
                i2 = (charAt20 << 1) + charAt21;
                iArr = new int[charAt5 + charAt4 + charAt22];
                i26 = charAt20;
                i28 = i52;
            }
            Unsafe unsafe = zzb;
            Object[] zze = zzlaVar2.zze();
            Class<?> cls2 = zzlaVar2.zzc().getClass();
            int i56 = i28;
            int[] iArr2 = new int[charAt3 * 3];
            Object[] objArr = new Object[charAt3 << 1];
            int i57 = charAt5 + charAt4;
            int i58 = i2;
            int i59 = charAt5;
            int i60 = i56;
            int i61 = i57;
            int i62 = 0;
            int i63 = 0;
            while (i60 < length) {
                int i64 = i60 + 1;
                int charAt23 = zzd.charAt(i60);
                if (charAt23 >= 55296) {
                    int i65 = charAt23 & 8191;
                    int i66 = i64;
                    int i67 = 13;
                    while (true) {
                        i24 = i66 + 1;
                        charAt17 = zzd.charAt(i66);
                        i11 = length;
                        if (charAt17 < 55296) {
                            break;
                        }
                        i65 |= (charAt17 & 8191) << i67;
                        i67 += 13;
                        i66 = i24;
                        length = i11;
                    }
                    charAt23 = i65 | (charAt17 << i67);
                    i12 = i24;
                } else {
                    i11 = length;
                    i12 = i64;
                }
                int i68 = i12 + 1;
                int charAt24 = zzd.charAt(i12);
                if (charAt24 >= 55296) {
                    int i69 = charAt24 & 8191;
                    int i70 = i68;
                    int i71 = 13;
                    while (true) {
                        i23 = i70 + 1;
                        charAt16 = zzd.charAt(i70);
                        i13 = charAt5;
                        if (charAt16 < 55296) {
                            break;
                        }
                        i69 |= (charAt16 & 8191) << i71;
                        i71 += 13;
                        i70 = i23;
                        charAt5 = i13;
                    }
                    charAt24 = i69 | (charAt16 << i71);
                    i14 = i23;
                } else {
                    i13 = charAt5;
                    i14 = i68;
                }
                int i72 = charAt24 & NotificationCenter.didReplacedPhotoInMemCache;
                int i73 = charAt2;
                if ((charAt24 & 1024) != 0) {
                    iArr[i62] = i63;
                    i62++;
                }
                int i74 = charAt;
                if (i72 >= 51) {
                    int i75 = i14 + 1;
                    int charAt25 = zzd.charAt(i14);
                    char c = CharacterCompat.MIN_HIGH_SURROGATE;
                    if (charAt25 >= 55296) {
                        int i76 = charAt25 & 8191;
                        int i77 = 13;
                        while (true) {
                            i22 = i75 + 1;
                            charAt15 = zzd.charAt(i75);
                            if (charAt15 < c) {
                                break;
                            }
                            i76 |= (charAt15 & 8191) << i77;
                            i77 += 13;
                            i75 = i22;
                            c = CharacterCompat.MIN_HIGH_SURROGATE;
                        }
                        charAt25 = i76 | (charAt15 << i77);
                        i75 = i22;
                    }
                    int i78 = i72 - 51;
                    int i79 = i75;
                    if (i78 == 9 || i78 == 17) {
                        i21 = 1;
                        objArr[((i63 / 3) << 1) + 1] = zze[i58];
                        i58++;
                    } else {
                        if (i78 == 12 && !z) {
                            objArr[((i63 / 3) << 1) + 1] = zze[i58];
                            i58++;
                        }
                        i21 = 1;
                    }
                    int i80 = charAt25 << i21;
                    Object obj = zze[i80];
                    if (obj instanceof Field) {
                        zza3 = (Field) obj;
                    } else {
                        zza3 = zza((Class) cls2, (String) obj);
                        zze[i80] = zza3;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zza3);
                    int i81 = i80 + 1;
                    Object obj2 = zze[i81];
                    if (obj2 instanceof Field) {
                        zza4 = (Field) obj2;
                    } else {
                        zza4 = zza((Class) cls2, (String) obj2);
                        zze[i81] = zza4;
                    }
                    i16 = i58;
                    objectFieldOffset = objectFieldOffset2;
                    i18 = i79;
                    zzlaVar = zzlaVar2;
                    str = zzd;
                    i17 = (int) unsafe.objectFieldOffset(zza4);
                    i19 = 0;
                } else {
                    int i82 = i58 + 1;
                    Field zza5 = zza((Class) cls2, (String) zze[i58]);
                    zzlaVar = zzlaVar2;
                    if (i72 == 9 || i72 == 17) {
                        objArr[((i63 / 3) << 1) + 1] = zza5.getType();
                    } else {
                        if (i72 == 27 || i72 == 49) {
                            i20 = i58 + 2;
                            objArr[((i63 / 3) << 1) + 1] = zze[i82];
                        } else if (i72 == 12 || i72 == 30 || i72 == 44) {
                            if (!z) {
                                i20 = i58 + 2;
                                objArr[((i63 / 3) << 1) + 1] = zze[i82];
                            }
                        } else if (i72 == 50) {
                            int i83 = i59 + 1;
                            iArr[i59] = i63;
                            int i84 = (i63 / 3) << 1;
                            int i85 = i58 + 2;
                            objArr[i84] = zze[i82];
                            if ((charAt24 & 2048) != 0) {
                                i82 = i58 + 3;
                                objArr[i84 + 1] = zze[i85];
                                i59 = i83;
                            } else {
                                i59 = i83;
                                i15 = i85;
                                objectFieldOffset = (int) unsafe.objectFieldOffset(zza5);
                                if ((charAt24 & 4096) == 4096 || i72 > 17) {
                                    i16 = i15;
                                    str = zzd;
                                    i17 = 1048575;
                                    i18 = i14;
                                    i19 = 0;
                                } else {
                                    int i86 = i14 + 1;
                                    int charAt26 = zzd.charAt(i14);
                                    if (charAt26 >= 55296) {
                                        int i87 = charAt26 & 8191;
                                        int i88 = 13;
                                        while (true) {
                                            i18 = i86 + 1;
                                            charAt14 = zzd.charAt(i86);
                                            if (charAt14 < 55296) {
                                                break;
                                            }
                                            i87 |= (charAt14 & 8191) << i88;
                                            i88 += 13;
                                            i86 = i18;
                                        }
                                        charAt26 = i87 | (charAt14 << i88);
                                    } else {
                                        i18 = i86;
                                    }
                                    int i89 = (i26 << 1) + (charAt26 / 32);
                                    Object obj3 = zze[i89];
                                    if (obj3 instanceof Field) {
                                        zza2 = (Field) obj3;
                                    } else {
                                        zza2 = zza((Class) cls2, (String) obj3);
                                        zze[i89] = zza2;
                                    }
                                    i16 = i15;
                                    str = zzd;
                                    i19 = charAt26 % 32;
                                    i17 = (int) unsafe.objectFieldOffset(zza2);
                                }
                                if (i72 >= 18 && i72 <= 49) {
                                    iArr[i61] = objectFieldOffset;
                                    i61++;
                                }
                            }
                        }
                        i15 = i20;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zza5);
                        if ((charAt24 & 4096) == 4096) {
                        }
                        i16 = i15;
                        str = zzd;
                        i17 = 1048575;
                        i18 = i14;
                        i19 = 0;
                        if (i72 >= 18) {
                            iArr[i61] = objectFieldOffset;
                            i61++;
                        }
                    }
                    i15 = i82;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zza5);
                    if ((charAt24 & 4096) == 4096) {
                    }
                    i16 = i15;
                    str = zzd;
                    i17 = 1048575;
                    i18 = i14;
                    i19 = 0;
                    if (i72 >= 18) {
                    }
                }
                int i90 = i63 + 1;
                iArr2[i63] = charAt23;
                int i91 = i63 + 2;
                iArr2[i90] = ((charAt24 & 256) != 0 ? TLObject.FLAG_28 : 0) | ((charAt24 & 512) != 0 ? TLObject.FLAG_29 : 0) | (i72 << 20) | objectFieldOffset;
                i63 += 3;
                iArr2[i91] = i17 | (i19 << 20);
                zzd = str;
                i58 = i16;
                charAt2 = i73;
                i60 = i18;
                length = i11;
                charAt5 = i13;
                charAt = i74;
                zzlaVar2 = zzlaVar;
            }
            return new zzko(iArr2, objArr, charAt, charAt2, zzlaVar2.zzc(), z, false, iArr, charAt5, i57, zzksVar, zzjuVar, zzluVar, zziqVar, zzkhVar);
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
        long j;
        int zzd;
        int zzb2;
        int zzb3;
        int zzh;
        int zzi;
        int zze;
        int zzg;
        int zzb4;
        int zzi2;
        int zze2;
        int zzg2;
        int i2 = 267386880;
        int i3 = 1048575;
        int i4 = 1;
        if (this.zzj) {
            Unsafe unsafe = zzb;
            int i5 = 0;
            int i6 = 0;
            while (i5 < this.zzc.length) {
                int zzd2 = zzd(i5);
                int i7 = (zzd2 & i2) >>> 20;
                int i8 = this.zzc[i5];
                long j2 = zzd2 & 1048575;
                if (i7 >= zziv.zza.zza() && i7 <= zziv.zzb.zza()) {
                    int i9 = this.zzc[i5 + 2];
                }
                switch (i7) {
                    case 0:
                        if (zza(obj, i5)) {
                            zzb4 = zzii.zzb(i8, 0.0d);
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zza(obj, i5)) {
                            zzb4 = zzii.zzb(i8, 0.0f);
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zza(obj, i5)) {
                            zzb4 = zzii.zzd(i8, zzma.zzb(obj, j2));
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zza(obj, i5)) {
                            zzb4 = zzii.zze(i8, zzma.zzb(obj, j2));
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zza(obj, i5)) {
                            zzb4 = zzii.zzf(i8, zzma.zza(obj, j2));
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zza(obj, i5)) {
                            zzb4 = zzii.zzg(i8, 0L);
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zza(obj, i5)) {
                            zzb4 = zzii.zzi(i8, 0);
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zza(obj, i5)) {
                            zzb4 = zzii.zzb(i8, true);
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zza(obj, i5)) {
                            Object zzf = zzma.zzf(obj, j2);
                            if (zzf instanceof zzht) {
                                zzb4 = zzii.zzc(i8, (zzht) zzf);
                            } else {
                                zzb4 = zzii.zzb(i8, (String) zzf);
                            }
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zza(obj, i5)) {
                            zzb4 = zzle.zza(i8, zzma.zzf(obj, j2), zza(i5));
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zza(obj, i5)) {
                            zzb4 = zzii.zzc(i8, (zzht) zzma.zzf(obj, j2));
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zza(obj, i5)) {
                            zzb4 = zzii.zzg(i8, zzma.zza(obj, j2));
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zza(obj, i5)) {
                            zzb4 = zzii.zzk(i8, zzma.zza(obj, j2));
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zza(obj, i5)) {
                            zzb4 = zzii.zzj(i8, 0);
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zza(obj, i5)) {
                            zzb4 = zzii.zzh(i8, 0L);
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zza(obj, i5)) {
                            zzb4 = zzii.zzh(i8, zzma.zza(obj, j2));
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zza(obj, i5)) {
                            zzb4 = zzii.zzf(i8, zzma.zzb(obj, j2));
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zza(obj, i5)) {
                            zzb4 = zzii.zzc(i8, (zzkk) zzma.zzf(obj, j2), zza(i5));
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzb4 = zzle.zzi(i8, zza(obj, j2), false);
                        i6 += zzb4;
                        break;
                    case 19:
                        zzb4 = zzle.zzh(i8, zza(obj, j2), false);
                        i6 += zzb4;
                        break;
                    case 20:
                        zzb4 = zzle.zza(i8, zza(obj, j2), false);
                        i6 += zzb4;
                        break;
                    case 21:
                        zzb4 = zzle.zzb(i8, zza(obj, j2), false);
                        i6 += zzb4;
                        break;
                    case 22:
                        zzb4 = zzle.zze(i8, zza(obj, j2), false);
                        i6 += zzb4;
                        break;
                    case 23:
                        zzb4 = zzle.zzi(i8, zza(obj, j2), false);
                        i6 += zzb4;
                        break;
                    case 24:
                        zzb4 = zzle.zzh(i8, zza(obj, j2), false);
                        i6 += zzb4;
                        break;
                    case 25:
                        zzb4 = zzle.zzj(i8, zza(obj, j2), false);
                        i6 += zzb4;
                        break;
                    case 26:
                        zzb4 = zzle.zza(i8, zza(obj, j2));
                        i6 += zzb4;
                        break;
                    case 27:
                        zzb4 = zzle.zza(i8, zza(obj, j2), zza(i5));
                        i6 += zzb4;
                        break;
                    case 28:
                        zzb4 = zzle.zzb(i8, zza(obj, j2));
                        i6 += zzb4;
                        break;
                    case 29:
                        zzb4 = zzle.zzf(i8, zza(obj, j2), false);
                        i6 += zzb4;
                        break;
                    case 30:
                        zzb4 = zzle.zzd(i8, zza(obj, j2), false);
                        i6 += zzb4;
                        break;
                    case 31:
                        zzb4 = zzle.zzh(i8, zza(obj, j2), false);
                        i6 += zzb4;
                        break;
                    case 32:
                        zzb4 = zzle.zzi(i8, zza(obj, j2), false);
                        i6 += zzb4;
                        break;
                    case 33:
                        zzb4 = zzle.zzg(i8, zza(obj, j2), false);
                        i6 += zzb4;
                        break;
                    case 34:
                        zzb4 = zzle.zzc(i8, zza(obj, j2), false);
                        i6 += zzb4;
                        break;
                    case 35:
                        zzi2 = zzle.zzi((List) unsafe.getObject(obj, j2));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(zzi2);
                            zzb4 = zze2 + zzg2 + zzi2;
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        zzi2 = zzle.zzh((List) unsafe.getObject(obj, j2));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(zzi2);
                            zzb4 = zze2 + zzg2 + zzi2;
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        zzi2 = zzle.zza((List) unsafe.getObject(obj, j2));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(zzi2);
                            zzb4 = zze2 + zzg2 + zzi2;
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        zzi2 = zzle.zzb((List) unsafe.getObject(obj, j2));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(zzi2);
                            zzb4 = zze2 + zzg2 + zzi2;
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        zzi2 = zzle.zze((List) unsafe.getObject(obj, j2));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(zzi2);
                            zzb4 = zze2 + zzg2 + zzi2;
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        zzi2 = zzle.zzi((List) unsafe.getObject(obj, j2));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(zzi2);
                            zzb4 = zze2 + zzg2 + zzi2;
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        zzi2 = zzle.zzh((List) unsafe.getObject(obj, j2));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(zzi2);
                            zzb4 = zze2 + zzg2 + zzi2;
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        zzi2 = zzle.zzj((List) unsafe.getObject(obj, j2));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(zzi2);
                            zzb4 = zze2 + zzg2 + zzi2;
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        zzi2 = zzle.zzf((List) unsafe.getObject(obj, j2));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(zzi2);
                            zzb4 = zze2 + zzg2 + zzi2;
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        zzi2 = zzle.zzd((List) unsafe.getObject(obj, j2));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(zzi2);
                            zzb4 = zze2 + zzg2 + zzi2;
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        zzi2 = zzle.zzh((List) unsafe.getObject(obj, j2));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(zzi2);
                            zzb4 = zze2 + zzg2 + zzi2;
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        zzi2 = zzle.zzi((List) unsafe.getObject(obj, j2));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(zzi2);
                            zzb4 = zze2 + zzg2 + zzi2;
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        zzi2 = zzle.zzg((List) unsafe.getObject(obj, j2));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(zzi2);
                            zzb4 = zze2 + zzg2 + zzi2;
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        zzi2 = zzle.zzc((List) unsafe.getObject(obj, j2));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(zzi2);
                            zzb4 = zze2 + zzg2 + zzi2;
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        zzb4 = zzle.zzb(i8, zza(obj, j2), zza(i5));
                        i6 += zzb4;
                        break;
                    case 50:
                        zzb4 = this.zzs.zza(i8, zzma.zzf(obj, j2), zzb(i5));
                        i6 += zzb4;
                        break;
                    case 51:
                        if (zza(obj, i8, i5)) {
                            zzb4 = zzii.zzb(i8, 0.0d);
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zza(obj, i8, i5)) {
                            zzb4 = zzii.zzb(i8, 0.0f);
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zza(obj, i8, i5)) {
                            zzb4 = zzii.zzd(i8, zze(obj, j2));
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zza(obj, i8, i5)) {
                            zzb4 = zzii.zze(i8, zze(obj, j2));
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zza(obj, i8, i5)) {
                            zzb4 = zzii.zzf(i8, zzd(obj, j2));
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zza(obj, i8, i5)) {
                            zzb4 = zzii.zzg(i8, 0L);
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zza(obj, i8, i5)) {
                            zzb4 = zzii.zzi(i8, 0);
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zza(obj, i8, i5)) {
                            zzb4 = zzii.zzb(i8, true);
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zza(obj, i8, i5)) {
                            Object zzf2 = zzma.zzf(obj, j2);
                            if (zzf2 instanceof zzht) {
                                zzb4 = zzii.zzc(i8, (zzht) zzf2);
                            } else {
                                zzb4 = zzii.zzb(i8, (String) zzf2);
                            }
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zza(obj, i8, i5)) {
                            zzb4 = zzle.zza(i8, zzma.zzf(obj, j2), zza(i5));
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zza(obj, i8, i5)) {
                            zzb4 = zzii.zzc(i8, (zzht) zzma.zzf(obj, j2));
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zza(obj, i8, i5)) {
                            zzb4 = zzii.zzg(i8, zzd(obj, j2));
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zza(obj, i8, i5)) {
                            zzb4 = zzii.zzk(i8, zzd(obj, j2));
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zza(obj, i8, i5)) {
                            zzb4 = zzii.zzj(i8, 0);
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zza(obj, i8, i5)) {
                            zzb4 = zzii.zzh(i8, 0L);
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zza(obj, i8, i5)) {
                            zzb4 = zzii.zzh(i8, zzd(obj, j2));
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zza(obj, i8, i5)) {
                            zzb4 = zzii.zzf(i8, zze(obj, j2));
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zza(obj, i8, i5)) {
                            zzb4 = zzii.zzc(i8, (zzkk) zzma.zzf(obj, j2), zza(i5));
                            i6 += zzb4;
                            break;
                        } else {
                            break;
                        }
                }
                i5 += 3;
                i2 = 267386880;
            }
            return i6 + zza(this.zzq, obj);
        }
        Unsafe unsafe2 = zzb;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        int i13 = 0;
        while (i10 < this.zzc.length) {
            int zzd3 = zzd(i10);
            int[] iArr = this.zzc;
            int i14 = iArr[i10];
            int i15 = (zzd3 & 267386880) >>> 20;
            if (i15 <= 17) {
                int i16 = iArr[i10 + 2];
                int i17 = i16 & i3;
                i = i4 << (i16 >>> 20);
                if (i17 != i12) {
                    i13 = unsafe2.getInt(obj, i17);
                    i12 = i17;
                }
            } else {
                i = 0;
            }
            long j3 = zzd3 & i3;
            switch (i15) {
                case 0:
                    j = 0;
                    if ((i13 & i) != 0) {
                        i11 += zzii.zzb(i14, 0.0d);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    j = 0;
                    if ((i13 & i) != 0) {
                        i11 += zzii.zzb(i14, 0.0f);
                    }
                    break;
                case 2:
                    j = 0;
                    if ((i & i13) != 0) {
                        zzd = zzii.zzd(i14, unsafe2.getLong(obj, j3));
                        i11 += zzd;
                    }
                    break;
                case 3:
                    j = 0;
                    if ((i & i13) != 0) {
                        zzd = zzii.zze(i14, unsafe2.getLong(obj, j3));
                        i11 += zzd;
                    }
                    break;
                case 4:
                    j = 0;
                    if ((i & i13) != 0) {
                        zzd = zzii.zzf(i14, unsafe2.getInt(obj, j3));
                        i11 += zzd;
                    }
                    break;
                case 5:
                    j = 0;
                    if ((i13 & i) != 0) {
                        zzd = zzii.zzg(i14, 0L);
                        i11 += zzd;
                    }
                    break;
                case 6:
                    if ((i13 & i) != 0) {
                        i11 += zzii.zzi(i14, 0);
                    }
                    j = 0;
                    break;
                case 7:
                    if ((i13 & i) != 0) {
                        zzb2 = zzii.zzb(i14, true);
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 8:
                    if ((i13 & i) != 0) {
                        Object object = unsafe2.getObject(obj, j3);
                        if (object instanceof zzht) {
                            zzb3 = zzii.zzc(i14, (zzht) object);
                        } else {
                            zzb3 = zzii.zzb(i14, (String) object);
                        }
                        i11 += zzb3;
                    }
                    j = 0;
                    break;
                case 9:
                    if ((i13 & i) != 0) {
                        zzb3 = zzle.zza(i14, unsafe2.getObject(obj, j3), zza(i10));
                        i11 += zzb3;
                    }
                    j = 0;
                    break;
                case 10:
                    if ((i13 & i) != 0) {
                        zzb3 = zzii.zzc(i14, (zzht) unsafe2.getObject(obj, j3));
                        i11 += zzb3;
                    }
                    j = 0;
                    break;
                case 11:
                    if ((i13 & i) != 0) {
                        zzb3 = zzii.zzg(i14, unsafe2.getInt(obj, j3));
                        i11 += zzb3;
                    }
                    j = 0;
                    break;
                case 12:
                    if ((i13 & i) != 0) {
                        zzb3 = zzii.zzk(i14, unsafe2.getInt(obj, j3));
                        i11 += zzb3;
                    }
                    j = 0;
                    break;
                case 13:
                    if ((i13 & i) != 0) {
                        zzb2 = zzii.zzj(i14, 0);
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 14:
                    if ((i13 & i) != 0) {
                        zzb3 = zzii.zzh(i14, 0L);
                        i11 += zzb3;
                    }
                    j = 0;
                    break;
                case 15:
                    if ((i13 & i) != 0) {
                        zzb3 = zzii.zzh(i14, unsafe2.getInt(obj, j3));
                        i11 += zzb3;
                    }
                    j = 0;
                    break;
                case 16:
                    if ((i13 & i) != 0) {
                        zzb3 = zzii.zzf(i14, unsafe2.getLong(obj, j3));
                        i11 += zzb3;
                    }
                    j = 0;
                    break;
                case 17:
                    if ((i13 & i) != 0) {
                        zzb3 = zzii.zzc(i14, (zzkk) unsafe2.getObject(obj, j3), zza(i10));
                        i11 += zzb3;
                    }
                    j = 0;
                    break;
                case 18:
                    zzb3 = zzle.zzi(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += zzb3;
                    j = 0;
                    break;
                case 19:
                    zzh = zzle.zzh(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += zzh;
                    j = 0;
                    break;
                case 20:
                    zzh = zzle.zza(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += zzh;
                    j = 0;
                    break;
                case 21:
                    zzh = zzle.zzb(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += zzh;
                    j = 0;
                    break;
                case 22:
                    zzh = zzle.zze(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += zzh;
                    j = 0;
                    break;
                case 23:
                    zzh = zzle.zzi(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += zzh;
                    j = 0;
                    break;
                case 24:
                    zzh = zzle.zzh(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += zzh;
                    j = 0;
                    break;
                case 25:
                    zzh = zzle.zzj(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += zzh;
                    j = 0;
                    break;
                case 26:
                    zzb3 = zzle.zza(i14, (List) unsafe2.getObject(obj, j3));
                    i11 += zzb3;
                    j = 0;
                    break;
                case 27:
                    zzb3 = zzle.zza(i14, (List) unsafe2.getObject(obj, j3), zza(i10));
                    i11 += zzb3;
                    j = 0;
                    break;
                case 28:
                    zzb3 = zzle.zzb(i14, (List) unsafe2.getObject(obj, j3));
                    i11 += zzb3;
                    j = 0;
                    break;
                case 29:
                    zzb3 = zzle.zzf(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += zzb3;
                    j = 0;
                    break;
                case 30:
                    zzh = zzle.zzd(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += zzh;
                    j = 0;
                    break;
                case 31:
                    zzh = zzle.zzh(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += zzh;
                    j = 0;
                    break;
                case 32:
                    zzh = zzle.zzi(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += zzh;
                    j = 0;
                    break;
                case 33:
                    zzh = zzle.zzg(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += zzh;
                    j = 0;
                    break;
                case 34:
                    zzh = zzle.zzc(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += zzh;
                    j = 0;
                    break;
                case 35:
                    zzi = zzle.zzi((List) unsafe2.getObject(obj, j3));
                    if (zzi > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(zzi);
                        zzb2 = zze + zzg + zzi;
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 36:
                    zzi = zzle.zzh((List) unsafe2.getObject(obj, j3));
                    if (zzi > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(zzi);
                        zzb2 = zze + zzg + zzi;
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 37:
                    zzi = zzle.zza((List) unsafe2.getObject(obj, j3));
                    if (zzi > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(zzi);
                        zzb2 = zze + zzg + zzi;
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 38:
                    zzi = zzle.zzb((List) unsafe2.getObject(obj, j3));
                    if (zzi > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(zzi);
                        zzb2 = zze + zzg + zzi;
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 39:
                    zzi = zzle.zze((List) unsafe2.getObject(obj, j3));
                    if (zzi > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(zzi);
                        zzb2 = zze + zzg + zzi;
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 40:
                    zzi = zzle.zzi((List) unsafe2.getObject(obj, j3));
                    if (zzi > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(zzi);
                        zzb2 = zze + zzg + zzi;
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 41:
                    zzi = zzle.zzh((List) unsafe2.getObject(obj, j3));
                    if (zzi > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(zzi);
                        zzb2 = zze + zzg + zzi;
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 42:
                    zzi = zzle.zzj((List) unsafe2.getObject(obj, j3));
                    if (zzi > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(zzi);
                        zzb2 = zze + zzg + zzi;
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 43:
                    zzi = zzle.zzf((List) unsafe2.getObject(obj, j3));
                    if (zzi > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(zzi);
                        zzb2 = zze + zzg + zzi;
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 44:
                    zzi = zzle.zzd((List) unsafe2.getObject(obj, j3));
                    if (zzi > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(zzi);
                        zzb2 = zze + zzg + zzi;
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 45:
                    zzi = zzle.zzh((List) unsafe2.getObject(obj, j3));
                    if (zzi > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(zzi);
                        zzb2 = zze + zzg + zzi;
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 46:
                    zzi = zzle.zzi((List) unsafe2.getObject(obj, j3));
                    if (zzi > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(zzi);
                        zzb2 = zze + zzg + zzi;
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 47:
                    zzi = zzle.zzg((List) unsafe2.getObject(obj, j3));
                    if (zzi > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(zzi);
                        zzb2 = zze + zzg + zzi;
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 48:
                    zzi = zzle.zzc((List) unsafe2.getObject(obj, j3));
                    if (zzi > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(zzi);
                        zzb2 = zze + zzg + zzi;
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 49:
                    zzb3 = zzle.zzb(i14, (List) unsafe2.getObject(obj, j3), zza(i10));
                    i11 += zzb3;
                    j = 0;
                    break;
                case 50:
                    zzb3 = this.zzs.zza(i14, unsafe2.getObject(obj, j3), zzb(i10));
                    i11 += zzb3;
                    j = 0;
                    break;
                case 51:
                    if (zza(obj, i14, i10)) {
                        zzb3 = zzii.zzb(i14, 0.0d);
                        i11 += zzb3;
                    }
                    j = 0;
                    break;
                case 52:
                    if (zza(obj, i14, i10)) {
                        zzb2 = zzii.zzb(i14, 0.0f);
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 53:
                    if (zza(obj, i14, i10)) {
                        zzb3 = zzii.zzd(i14, zze(obj, j3));
                        i11 += zzb3;
                    }
                    j = 0;
                    break;
                case 54:
                    if (zza(obj, i14, i10)) {
                        zzb3 = zzii.zze(i14, zze(obj, j3));
                        i11 += zzb3;
                    }
                    j = 0;
                    break;
                case 55:
                    if (zza(obj, i14, i10)) {
                        zzb3 = zzii.zzf(i14, zzd(obj, j3));
                        i11 += zzb3;
                    }
                    j = 0;
                    break;
                case 56:
                    if (zza(obj, i14, i10)) {
                        zzb3 = zzii.zzg(i14, 0L);
                        i11 += zzb3;
                    }
                    j = 0;
                    break;
                case 57:
                    if (zza(obj, i14, i10)) {
                        zzb2 = zzii.zzi(i14, 0);
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 58:
                    if (zza(obj, i14, i10)) {
                        zzb2 = zzii.zzb(i14, true);
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 59:
                    if (zza(obj, i14, i10)) {
                        Object object2 = unsafe2.getObject(obj, j3);
                        if (object2 instanceof zzht) {
                            zzb3 = zzii.zzc(i14, (zzht) object2);
                        } else {
                            zzb3 = zzii.zzb(i14, (String) object2);
                        }
                        i11 += zzb3;
                    }
                    j = 0;
                    break;
                case 60:
                    if (zza(obj, i14, i10)) {
                        zzb3 = zzle.zza(i14, unsafe2.getObject(obj, j3), zza(i10));
                        i11 += zzb3;
                    }
                    j = 0;
                    break;
                case 61:
                    if (zza(obj, i14, i10)) {
                        zzb3 = zzii.zzc(i14, (zzht) unsafe2.getObject(obj, j3));
                        i11 += zzb3;
                    }
                    j = 0;
                    break;
                case 62:
                    if (zza(obj, i14, i10)) {
                        zzb3 = zzii.zzg(i14, zzd(obj, j3));
                        i11 += zzb3;
                    }
                    j = 0;
                    break;
                case 63:
                    if (zza(obj, i14, i10)) {
                        zzb3 = zzii.zzk(i14, zzd(obj, j3));
                        i11 += zzb3;
                    }
                    j = 0;
                    break;
                case 64:
                    if (zza(obj, i14, i10)) {
                        zzb2 = zzii.zzj(i14, 0);
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 65:
                    if (zza(obj, i14, i10)) {
                        zzb3 = zzii.zzh(i14, 0L);
                        i11 += zzb3;
                    }
                    j = 0;
                    break;
                case 66:
                    if (zza(obj, i14, i10)) {
                        zzb3 = zzii.zzh(i14, zzd(obj, j3));
                        i11 += zzb3;
                    }
                    j = 0;
                    break;
                case 67:
                    if (zza(obj, i14, i10)) {
                        zzb3 = zzii.zzf(i14, zze(obj, j3));
                        i11 += zzb3;
                    }
                    j = 0;
                    break;
                case 68:
                    if (zza(obj, i14, i10)) {
                        zzb3 = zzii.zzc(i14, (zzkk) unsafe2.getObject(obj, j3), zza(i10));
                        i11 += zzb3;
                    }
                    j = 0;
                    break;
                default:
                    j = 0;
                    break;
            }
            i10 += 3;
            i3 = 1048575;
            i4 = 1;
        }
        int i18 = 0;
        int zza2 = i11 + zza(this.zzq, obj);
        if (!this.zzh) {
            return zza2;
        }
        zziu zza3 = this.zzr.zza(obj);
        for (int i19 = 0; i19 < zza3.zza.zzc(); i19++) {
            Map.Entry zzb5 = zza3.zza.zzb(i19);
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzb5.getKey());
            i18 += zziu.zzc(null, zzb5.getValue());
        }
        for (Map.Entry entry : zza3.zza.zzd()) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(entry.getKey());
            i18 += zziu.zzc(null, entry.getValue());
        }
        return zza2 + i18;
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

    /* JADX WARN: Removed duplicated region for block: B:214:0x0491  */
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
                            if ((i2 & i4) == 0) {
                                break;
                            } else {
                                zzmrVar.zza(i5, zzma.zze(obj, j));
                                continue;
                            }
                        case 1:
                            if ((i2 & i4) != 0) {
                                zzmrVar.zza(i5, zzma.zzd(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if ((i2 & i4) != 0) {
                                zzmrVar.zza(i5, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if ((i2 & i4) != 0) {
                                zzmrVar.zzc(i5, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if ((i2 & i4) != 0) {
                                zzmrVar.zzc(i5, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if ((i2 & i4) != 0) {
                                zzmrVar.zzd(i5, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if ((i2 & i4) != 0) {
                                zzmrVar.zzd(i5, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if ((i2 & i4) != 0) {
                                zzmrVar.zza(i5, zzma.zzc(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 8:
                            if ((i2 & i4) != 0) {
                                zza(i5, unsafe.getObject(obj, j), zzmrVar);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            if ((i2 & i4) != 0) {
                                zzmrVar.zza(i5, unsafe.getObject(obj, j), zza(i));
                                break;
                            } else {
                                continue;
                            }
                        case 10:
                            if ((i2 & i4) != 0) {
                                zzmrVar.zza(i5, (zzht) unsafe.getObject(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if ((i2 & i4) != 0) {
                                zzmrVar.zze(i5, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 12:
                            if ((i2 & i4) != 0) {
                                zzmrVar.zzb(i5, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 13:
                            if ((i2 & i4) != 0) {
                                zzmrVar.zza(i5, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 14:
                            if ((i2 & i4) != 0) {
                                zzmrVar.zzb(i5, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 15:
                            if ((i2 & i4) != 0) {
                                zzmrVar.zzf(i5, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 16:
                            if ((i2 & i4) != 0) {
                                zzmrVar.zze(i5, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 17:
                            if ((i2 & i4) != 0) {
                                zzmrVar.zzb(i5, unsafe.getObject(obj, j), zza(i));
                                break;
                            } else {
                                continue;
                            }
                        case 18:
                            zzle.zza(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, false);
                            break;
                        case 19:
                            zzle.zzb(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, false);
                            break;
                        case 20:
                            zzle.zzc(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, false);
                            break;
                        case 21:
                            zzle.zzd(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, false);
                            break;
                        case 22:
                            zzle.zzh(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, false);
                            break;
                        case 23:
                            zzle.zzf(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, false);
                            break;
                        case 24:
                            zzle.zzk(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, false);
                            break;
                        case 25:
                            zzle.zzn(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, false);
                            break;
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
                            break;
                        case 30:
                            zzle.zzm(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, false);
                            break;
                        case 31:
                            zzle.zzl(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, false);
                            break;
                        case 32:
                            zzle.zzg(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, false);
                            break;
                        case 33:
                            zzle.zzj(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, false);
                            break;
                        case 34:
                            zzle.zze(this.zzc[i], (List) unsafe.getObject(obj, j), zzmrVar, false);
                            break;
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

    private final int zza(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzhn zzhnVar) {
        int zza2;
        int i8 = i;
        Unsafe unsafe = zzb;
        zzjl zzjlVar = (zzjl) unsafe.getObject(obj, j2);
        if (!zzjlVar.zza()) {
            int size = zzjlVar.size();
            zzjlVar = zzjlVar.zza(size == 0 ? 10 : size << 1);
            unsafe.putObject(obj, j2, zzjlVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    int zza3 = zzhl.zza(bArr, i8, zzhnVar);
                    int i9 = zzhnVar.zza + zza3;
                    if (zza3 < i9) {
                        zzhl.zzc(bArr, zza3);
                        throw null;
                    }
                    if (zza3 == i9) {
                        return zza3;
                    }
                    throw zzjk.zza();
                }
                if (i5 == 1) {
                    zzhl.zzc(bArr, i);
                    throw null;
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    int zza4 = zzhl.zza(bArr, i8, zzhnVar);
                    int i10 = zzhnVar.zza + zza4;
                    if (zza4 < i10) {
                        zzhl.zzd(bArr, zza4);
                        throw null;
                    }
                    if (zza4 == i10) {
                        return zza4;
                    }
                    throw zzjk.zza();
                }
                if (i5 == 5) {
                    zzhl.zzd(bArr, i);
                    throw null;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    int zza5 = zzhl.zza(bArr, i8, zzhnVar);
                    int i11 = zzhnVar.zza + zza5;
                    if (zza5 < i11) {
                        zzhl.zzb(bArr, zza5, zzhnVar);
                        throw null;
                    }
                    if (zza5 == i11) {
                        return zza5;
                    }
                    throw zzjk.zza();
                }
                if (i5 == 0) {
                    zzhl.zzb(bArr, i8, zzhnVar);
                    long j3 = zzhnVar.zzb;
                    throw null;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzhl.zza(bArr, i8, zzjlVar, zzhnVar);
                }
                if (i5 == 0) {
                    return zzhl.zza(i3, bArr, i, i2, zzjlVar, zzhnVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    int zza6 = zzhl.zza(bArr, i8, zzhnVar);
                    int i12 = zzhnVar.zza + zza6;
                    if (zza6 < i12) {
                        zzhl.zzb(bArr, zza6);
                        throw null;
                    }
                    if (zza6 == i12) {
                        return zza6;
                    }
                    throw zzjk.zza();
                }
                if (i5 == 1) {
                    zzhl.zzb(bArr, i);
                    throw null;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    zzjd zzjdVar = (zzjd) zzjlVar;
                    int zza7 = zzhl.zza(bArr, i8, zzhnVar);
                    int i13 = zzhnVar.zza + zza7;
                    while (zza7 < i13) {
                        zzjdVar.zzc(zzhl.zza(bArr, zza7));
                        zza7 += 4;
                    }
                    if (zza7 == i13) {
                        return zza7;
                    }
                    throw zzjk.zza();
                }
                if (i5 == 5) {
                    zzjd zzjdVar2 = (zzjd) zzjlVar;
                    zzjdVar2.zzc(zzhl.zza(bArr, i));
                    while (true) {
                        int i14 = i8 + 4;
                        if (i14 >= i2) {
                            return i14;
                        }
                        i8 = zzhl.zza(bArr, i14, zzhnVar);
                        if (i3 != zzhnVar.zza) {
                            return i14;
                        }
                        zzjdVar2.zzc(zzhl.zza(bArr, i8));
                    }
                }
                break;
            case 25:
            case 42:
                if (i5 == 2) {
                    int zza8 = zzhl.zza(bArr, i8, zzhnVar);
                    int i15 = zzhnVar.zza + zza8;
                    if (zza8 < i15) {
                        zzhl.zzb(bArr, zza8, zzhnVar);
                        throw null;
                    }
                    if (zza8 == i15) {
                        return zza8;
                    }
                    throw zzjk.zza();
                }
                if (i5 == 0) {
                    zzhl.zzb(bArr, i8, zzhnVar);
                    long j4 = zzhnVar.zzb;
                    throw null;
                }
                break;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        i8 = zzhl.zza(bArr, i8, zzhnVar);
                        int i16 = zzhnVar.zza;
                        if (i16 < 0) {
                            throw zzjk.zzb();
                        }
                        if (i16 == 0) {
                            zzjlVar.add("");
                        } else {
                            zzjlVar.add(new String(bArr, i8, i16, zzjf.zza));
                            i8 += i16;
                        }
                        while (i8 < i2) {
                            int zza9 = zzhl.zza(bArr, i8, zzhnVar);
                            if (i3 != zzhnVar.zza) {
                                break;
                            } else {
                                i8 = zzhl.zza(bArr, zza9, zzhnVar);
                                int i17 = zzhnVar.zza;
                                if (i17 < 0) {
                                    throw zzjk.zzb();
                                }
                                if (i17 == 0) {
                                    zzjlVar.add("");
                                } else {
                                    zzjlVar.add(new String(bArr, i8, i17, zzjf.zza));
                                    i8 += i17;
                                }
                            }
                        }
                        break;
                    } else {
                        i8 = zzhl.zza(bArr, i8, zzhnVar);
                        int i18 = zzhnVar.zza;
                        if (i18 < 0) {
                            throw zzjk.zzb();
                        }
                        if (i18 == 0) {
                            zzjlVar.add("");
                        } else {
                            int i19 = i8 + i18;
                            if (!zzmd.zza(bArr, i8, i19)) {
                                throw zzjk.zzh();
                            }
                            zzjlVar.add(new String(bArr, i8, i18, zzjf.zza));
                            i8 = i19;
                        }
                        while (i8 < i2) {
                            int zza10 = zzhl.zza(bArr, i8, zzhnVar);
                            if (i3 != zzhnVar.zza) {
                                break;
                            } else {
                                i8 = zzhl.zza(bArr, zza10, zzhnVar);
                                int i20 = zzhnVar.zza;
                                if (i20 < 0) {
                                    throw zzjk.zzb();
                                }
                                if (i20 == 0) {
                                    zzjlVar.add("");
                                } else {
                                    int i21 = i8 + i20;
                                    if (!zzmd.zza(bArr, i8, i21)) {
                                        throw zzjk.zzh();
                                    }
                                    zzjlVar.add(new String(bArr, i8, i20, zzjf.zza));
                                    i8 = i21;
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 27:
                if (i5 == 2) {
                    return zzhl.zza(zza(i6), i3, bArr, i, i2, zzjlVar, zzhnVar);
                }
                break;
            case 28:
                if (i5 == 2) {
                    int zza11 = zzhl.zza(bArr, i8, zzhnVar);
                    int i22 = zzhnVar.zza;
                    if (i22 < 0) {
                        throw zzjk.zzb();
                    }
                    if (i22 > bArr.length - zza11) {
                        throw zzjk.zza();
                    }
                    if (i22 == 0) {
                        zzjlVar.add(zzht.zza);
                    } else {
                        zzjlVar.add(zzht.zza(bArr, zza11, i22));
                        zza11 += i22;
                    }
                    while (zza11 < i2) {
                        int zza12 = zzhl.zza(bArr, zza11, zzhnVar);
                        if (i3 != zzhnVar.zza) {
                            return zza11;
                        }
                        zza11 = zzhl.zza(bArr, zza12, zzhnVar);
                        int i23 = zzhnVar.zza;
                        if (i23 < 0) {
                            throw zzjk.zzb();
                        }
                        if (i23 > bArr.length - zza11) {
                            throw zzjk.zza();
                        }
                        if (i23 == 0) {
                            zzjlVar.add(zzht.zza);
                        } else {
                            zzjlVar.add(zzht.zza(bArr, zza11, i23));
                            zza11 += i23;
                        }
                    }
                    return zza11;
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    zza2 = zzhl.zza(bArr, i8, zzjlVar, zzhnVar);
                } else if (i5 == 0) {
                    zza2 = zzhl.zza(i3, bArr, i, i2, zzjlVar, zzhnVar);
                }
                zzjb zzjbVar = (zzjb) obj;
                zzlx zzlxVar = zzjbVar.zzb;
                zzlx zzlxVar2 = (zzlx) zzle.zza(i4, zzjlVar, zzc(i6), zzlxVar != zzlx.zza() ? zzlxVar : null, this.zzq);
                if (zzlxVar2 != null) {
                    zzjbVar.zzb = zzlxVar2;
                }
                return zza2;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzjd zzjdVar3 = (zzjd) zzjlVar;
                    int zza13 = zzhl.zza(bArr, i8, zzhnVar);
                    int i24 = zzhnVar.zza + zza13;
                    while (zza13 < i24) {
                        zza13 = zzhl.zza(bArr, zza13, zzhnVar);
                        zzjdVar3.zzc(zzif.zze(zzhnVar.zza));
                    }
                    if (zza13 == i24) {
                        return zza13;
                    }
                    throw zzjk.zza();
                }
                if (i5 == 0) {
                    zzjd zzjdVar4 = (zzjd) zzjlVar;
                    int zza14 = zzhl.zza(bArr, i8, zzhnVar);
                    zzjdVar4.zzc(zzif.zze(zzhnVar.zza));
                    while (zza14 < i2) {
                        int zza15 = zzhl.zza(bArr, zza14, zzhnVar);
                        if (i3 != zzhnVar.zza) {
                            return zza14;
                        }
                        zza14 = zzhl.zza(bArr, zza15, zzhnVar);
                        zzjdVar4.zzc(zzif.zze(zzhnVar.zza));
                    }
                    return zza14;
                }
                break;
            case 34:
            case 48:
                if (i5 == 2) {
                    int zza16 = zzhl.zza(bArr, i8, zzhnVar);
                    int i25 = zzhnVar.zza + zza16;
                    if (zza16 >= i25) {
                        if (zza16 == i25) {
                            return zza16;
                        }
                        throw zzjk.zza();
                    }
                    zzhl.zzb(bArr, zza16, zzhnVar);
                    zzif.zza(zzhnVar.zzb);
                    throw null;
                }
                if (i5 == 0) {
                    zzhl.zzb(bArr, i8, zzhnVar);
                    zzif.zza(zzhnVar.zzb);
                    throw null;
                }
                break;
            case 49:
                if (i5 == 3) {
                    zzlc zza17 = zza(i6);
                    int i26 = (i3 & (-8)) | 4;
                    i8 = zzhl.zza(zza17, bArr, i, i2, i26, zzhnVar);
                    zzjlVar.add(zzhnVar.zzc);
                    while (i8 < i2) {
                        int zza18 = zzhl.zza(bArr, i8, zzhnVar);
                        if (i3 != zzhnVar.zza) {
                            break;
                        } else {
                            i8 = zzhl.zza(zza17, bArr, zza18, i2, i26, zzhnVar);
                            zzjlVar.add(zzhnVar.zzc);
                        }
                    }
                    break;
                }
                break;
        }
        return i8;
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zza(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzhn zzhnVar) {
        int zzb2;
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(zzhl.zzc(bArr, i)));
                    zzb2 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return zzb2;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(zzhl.zzd(bArr, i)));
                    zzb2 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return zzb2;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    zzb2 = zzhl.zzb(bArr, i, zzhnVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzhnVar.zzb));
                    unsafe.putInt(obj, j2, i4);
                    return zzb2;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    zzb2 = zzhl.zza(bArr, i, zzhnVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzhnVar.zza));
                    unsafe.putInt(obj, j2, i4);
                    return zzb2;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzhl.zzb(bArr, i)));
                    zzb2 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return zzb2;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzhl.zza(bArr, i)));
                    zzb2 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return zzb2;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    zzb2 = zzhl.zzb(bArr, i, zzhnVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzhnVar.zzb != 0));
                    unsafe.putInt(obj, j2, i4);
                    return zzb2;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int zza2 = zzhl.zza(bArr, i, zzhnVar);
                    int i9 = zzhnVar.zza;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & TLObject.FLAG_29) != 0 && !zzmd.zza(bArr, zza2, zza2 + i9)) {
                            throw zzjk.zzh();
                        }
                        unsafe.putObject(obj, j, new String(bArr, zza2, i9, zzjf.zza));
                        zza2 += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zza2;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    int zza3 = zzhl.zza(zza(i8), bArr, i, i2, zzhnVar);
                    Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, zzhnVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzjf.zza(object, zzhnVar.zzc));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zza3;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    zzb2 = zzhl.zze(bArr, i, zzhnVar);
                    unsafe.putObject(obj, j, zzhnVar.zzc);
                    unsafe.putInt(obj, j2, i4);
                    return zzb2;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int zza4 = zzhl.zza(bArr, i, zzhnVar);
                    int i10 = zzhnVar.zza;
                    zzjg zzc = zzc(i8);
                    if (zzc == null || zzc.zza(i10)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i10));
                        zzb2 = zza4;
                        unsafe.putInt(obj, j2, i4);
                        return zzb2;
                    }
                    zze(obj).zza(i3, Long.valueOf(i10));
                    return zza4;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    zzb2 = zzhl.zza(bArr, i, zzhnVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzif.zze(zzhnVar.zza)));
                    unsafe.putInt(obj, j2, i4);
                    return zzb2;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    zzb2 = zzhl.zzb(bArr, i, zzhnVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzif.zza(zzhnVar.zzb)));
                    unsafe.putInt(obj, j2, i4);
                    return zzb2;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    zzb2 = zzhl.zza(zza(i8), bArr, i, i2, (i3 & (-8)) | 4, zzhnVar);
                    Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, zzhnVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzjf.zza(object2, zzhnVar.zzc));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzb2;
                }
                return i;
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

    /* JADX WARN: Failed to find 'out' block for switch in B:107:0x008c. Please report as an issue. */
    final int zza(Object obj, byte[] bArr, int i, int i2, int i3, zzhn zzhnVar) {
        Unsafe unsafe;
        int i4;
        zzko zzkoVar;
        int i5;
        Object obj2;
        int i6;
        int zzg;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        zzhn zzhnVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int zzb2;
        int i18;
        int i19;
        int i20;
        int i21;
        zzko zzkoVar2 = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i22 = i2;
        int i23 = i3;
        zzhn zzhnVar3 = zzhnVar;
        Unsafe unsafe2 = zzb;
        int i24 = i;
        int i25 = -1;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 1048575;
        while (true) {
            if (i24 < i22) {
                int i30 = i24 + 1;
                byte b = bArr2[i24];
                if (b < 0) {
                    int zza2 = zzhl.zza(b, bArr2, i30, zzhnVar3);
                    i6 = zzhnVar3.zza;
                    i30 = zza2;
                } else {
                    i6 = b;
                }
                int i31 = i6 >>> 3;
                int i32 = i6 & 7;
                if (i31 > i25) {
                    zzg = zzkoVar2.zza(i31, i26 / 3);
                } else {
                    zzg = zzkoVar2.zzg(i31);
                }
                int i33 = zzg;
                if (i33 == -1) {
                    i7 = i31;
                    i8 = i30;
                    i9 = i6;
                    i10 = i28;
                    unsafe = unsafe2;
                    i4 = i23;
                    i11 = 0;
                } else {
                    int[] iArr = zzkoVar2.zzc;
                    int i34 = iArr[i33 + 1];
                    int i35 = (i34 & 267386880) >>> 20;
                    int i36 = i6;
                    long j = i34 & 1048575;
                    if (i35 <= 17) {
                        int i37 = iArr[i33 + 2];
                        int i38 = 1 << (i37 >>> 20);
                        int i39 = i37 & 1048575;
                        if (i39 != i29) {
                            if (i29 != 1048575) {
                                unsafe2.putInt(obj3, i29, i28);
                            }
                            i28 = unsafe2.getInt(obj3, i39);
                            i13 = i39;
                        } else {
                            i13 = i29;
                        }
                        int i40 = i28;
                        switch (i35) {
                            case 0:
                                i14 = i31;
                                i15 = i13;
                                i16 = i36;
                                bArr2 = bArr;
                                i17 = i33;
                                if (i32 == 1) {
                                    zzma.zza(obj3, j, zzhl.zzc(bArr2, i30));
                                    i24 = i30 + 8;
                                    i28 = i40 | i38;
                                    i29 = i15;
                                    i27 = i16;
                                    i25 = i14;
                                    i26 = i17;
                                    i22 = i2;
                                    i23 = i3;
                                    break;
                                } else {
                                    i8 = i30;
                                    i10 = i40;
                                    i9 = i16;
                                    unsafe = unsafe2;
                                    i11 = i17;
                                    i29 = i15;
                                    i4 = i3;
                                    i7 = i14;
                                    break;
                                }
                            case 1:
                                i14 = i31;
                                i15 = i13;
                                i16 = i36;
                                bArr2 = bArr;
                                i17 = i33;
                                if (i32 == 5) {
                                    zzma.zza(obj3, j, zzhl.zzd(bArr2, i30));
                                    i24 = i30 + 4;
                                    i28 = i40 | i38;
                                    i29 = i15;
                                    i27 = i16;
                                    i25 = i14;
                                    i26 = i17;
                                    i22 = i2;
                                    i23 = i3;
                                    break;
                                } else {
                                    i8 = i30;
                                    i10 = i40;
                                    i9 = i16;
                                    unsafe = unsafe2;
                                    i11 = i17;
                                    i29 = i15;
                                    i4 = i3;
                                    i7 = i14;
                                    break;
                                }
                            case 2:
                            case 3:
                                i14 = i31;
                                i15 = i13;
                                i16 = i36;
                                bArr2 = bArr;
                                i17 = i33;
                                if (i32 == 0) {
                                    zzb2 = zzhl.zzb(bArr2, i30, zzhnVar3);
                                    unsafe2.putLong(obj, j, zzhnVar3.zzb);
                                    i28 = i40 | i38;
                                    i29 = i15;
                                    i27 = i16;
                                    i24 = zzb2;
                                    i25 = i14;
                                    i26 = i17;
                                    i22 = i2;
                                    i23 = i3;
                                    break;
                                } else {
                                    i8 = i30;
                                    i10 = i40;
                                    i9 = i16;
                                    unsafe = unsafe2;
                                    i11 = i17;
                                    i29 = i15;
                                    i4 = i3;
                                    i7 = i14;
                                    break;
                                }
                            case 4:
                            case 11:
                                i14 = i31;
                                i15 = i13;
                                i16 = i36;
                                bArr2 = bArr;
                                i17 = i33;
                                if (i32 == 0) {
                                    i24 = zzhl.zza(bArr2, i30, zzhnVar3);
                                    unsafe2.putInt(obj3, j, zzhnVar3.zza);
                                    i28 = i40 | i38;
                                    i29 = i15;
                                    i27 = i16;
                                    i25 = i14;
                                    i26 = i17;
                                    i22 = i2;
                                    i23 = i3;
                                    break;
                                } else {
                                    i8 = i30;
                                    i10 = i40;
                                    i9 = i16;
                                    unsafe = unsafe2;
                                    i11 = i17;
                                    i29 = i15;
                                    i4 = i3;
                                    i7 = i14;
                                    break;
                                }
                            case 5:
                            case 14:
                                i14 = i31;
                                i15 = i13;
                                i16 = i36;
                                bArr2 = bArr;
                                i17 = i33;
                                if (i32 == 1) {
                                    unsafe2.putLong(obj, j, zzhl.zzb(bArr2, i30));
                                    i24 = i30 + 8;
                                    i28 = i40 | i38;
                                    i29 = i15;
                                    i27 = i16;
                                    i25 = i14;
                                    i26 = i17;
                                    i22 = i2;
                                    i23 = i3;
                                    break;
                                } else {
                                    i8 = i30;
                                    i10 = i40;
                                    i9 = i16;
                                    unsafe = unsafe2;
                                    i11 = i17;
                                    i29 = i15;
                                    i4 = i3;
                                    i7 = i14;
                                    break;
                                }
                            case 6:
                            case 13:
                                i14 = i31;
                                i15 = i13;
                                i16 = i36;
                                bArr2 = bArr;
                                i17 = i33;
                                i18 = i2;
                                if (i32 == 5) {
                                    unsafe2.putInt(obj3, j, zzhl.zza(bArr2, i30));
                                    i24 = i30 + 4;
                                    i28 = i40 | i38;
                                    i29 = i15;
                                    i27 = i16;
                                    i25 = i14;
                                    i23 = i3;
                                    int i41 = i17;
                                    i22 = i18;
                                    i26 = i41;
                                    break;
                                } else {
                                    i8 = i30;
                                    i10 = i40;
                                    i9 = i16;
                                    unsafe = unsafe2;
                                    i11 = i17;
                                    i29 = i15;
                                    i4 = i3;
                                    i7 = i14;
                                    break;
                                }
                            case 7:
                                i14 = i31;
                                i15 = i13;
                                i16 = i36;
                                bArr2 = bArr;
                                i17 = i33;
                                i18 = i2;
                                if (i32 == 0) {
                                    int zzb3 = zzhl.zzb(bArr2, i30, zzhnVar3);
                                    zzma.zza(obj3, j, zzhnVar3.zzb != 0);
                                    i28 = i40 | i38;
                                    i29 = i15;
                                    i24 = zzb3;
                                    i27 = i16;
                                    i25 = i14;
                                    i23 = i3;
                                    int i412 = i17;
                                    i22 = i18;
                                    i26 = i412;
                                    break;
                                } else {
                                    i8 = i30;
                                    i10 = i40;
                                    i9 = i16;
                                    unsafe = unsafe2;
                                    i11 = i17;
                                    i29 = i15;
                                    i4 = i3;
                                    i7 = i14;
                                    break;
                                }
                            case 8:
                                i14 = i31;
                                i15 = i13;
                                i16 = i36;
                                bArr2 = bArr;
                                i17 = i33;
                                i18 = i2;
                                if (i32 == 2) {
                                    if ((i34 & TLObject.FLAG_29) == 0) {
                                        i24 = zzhl.zzc(bArr2, i30, zzhnVar3);
                                    } else {
                                        i24 = zzhl.zzd(bArr2, i30, zzhnVar3);
                                    }
                                    unsafe2.putObject(obj3, j, zzhnVar3.zzc);
                                    i28 = i40 | i38;
                                    i29 = i15;
                                    i27 = i16;
                                    i25 = i14;
                                    i23 = i3;
                                    int i4122 = i17;
                                    i22 = i18;
                                    i26 = i4122;
                                    break;
                                } else {
                                    i8 = i30;
                                    i10 = i40;
                                    i9 = i16;
                                    unsafe = unsafe2;
                                    i11 = i17;
                                    i29 = i15;
                                    i4 = i3;
                                    i7 = i14;
                                    break;
                                }
                            case 9:
                                i14 = i31;
                                i15 = i13;
                                i16 = i36;
                                bArr2 = bArr;
                                i17 = i33;
                                if (i32 == 2) {
                                    i18 = i2;
                                    i24 = zzhl.zza(zzkoVar2.zza(i17), bArr2, i30, i18, zzhnVar3);
                                    if ((i40 & i38) == 0) {
                                        unsafe2.putObject(obj3, j, zzhnVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj3, j, zzjf.zza(unsafe2.getObject(obj3, j), zzhnVar3.zzc));
                                    }
                                    i28 = i40 | i38;
                                    i29 = i15;
                                    i27 = i16;
                                    i25 = i14;
                                    i23 = i3;
                                    int i41222 = i17;
                                    i22 = i18;
                                    i26 = i41222;
                                    break;
                                } else {
                                    i8 = i30;
                                    i10 = i40;
                                    i9 = i16;
                                    unsafe = unsafe2;
                                    i11 = i17;
                                    i29 = i15;
                                    i4 = i3;
                                    i7 = i14;
                                    break;
                                }
                            case 10:
                                i14 = i31;
                                i15 = i13;
                                i16 = i36;
                                bArr2 = bArr;
                                i17 = i33;
                                if (i32 == 2) {
                                    i24 = zzhl.zze(bArr2, i30, zzhnVar3);
                                    unsafe2.putObject(obj3, j, zzhnVar3.zzc);
                                    i28 = i40 | i38;
                                    i29 = i15;
                                    i27 = i16;
                                    i25 = i14;
                                    i26 = i17;
                                    i22 = i2;
                                    i23 = i3;
                                    break;
                                } else {
                                    i8 = i30;
                                    i10 = i40;
                                    i9 = i16;
                                    unsafe = unsafe2;
                                    i11 = i17;
                                    i29 = i15;
                                    i4 = i3;
                                    i7 = i14;
                                    break;
                                }
                            case 12:
                                i14 = i31;
                                i15 = i13;
                                i16 = i36;
                                bArr2 = bArr;
                                i17 = i33;
                                if (i32 != 0) {
                                    i8 = i30;
                                    i10 = i40;
                                    i9 = i16;
                                    unsafe = unsafe2;
                                    i11 = i17;
                                    i29 = i15;
                                    i4 = i3;
                                    i7 = i14;
                                    break;
                                } else {
                                    i24 = zzhl.zza(bArr2, i30, zzhnVar3);
                                    int i42 = zzhnVar3.zza;
                                    zzjg zzc = zzkoVar2.zzc(i17);
                                    if (zzc == null || zzc.zza(i42)) {
                                        unsafe2.putInt(obj3, j, i42);
                                        i28 = i40 | i38;
                                        i29 = i15;
                                        i27 = i16;
                                        i25 = i14;
                                        i26 = i17;
                                        i22 = i2;
                                        i23 = i3;
                                        break;
                                    } else {
                                        zze(obj).zza(i16, Long.valueOf(i42));
                                        i28 = i40;
                                        i27 = i16;
                                        i25 = i14;
                                        i26 = i17;
                                        i29 = i15;
                                        i22 = i2;
                                        i23 = i3;
                                    }
                                }
                                break;
                            case 15:
                                i14 = i31;
                                i15 = i13;
                                i16 = i36;
                                bArr2 = bArr;
                                i17 = i33;
                                if (i32 == 0) {
                                    i24 = zzhl.zza(bArr2, i30, zzhnVar3);
                                    unsafe2.putInt(obj3, j, zzif.zze(zzhnVar3.zza));
                                    i28 = i40 | i38;
                                    i29 = i15;
                                    i27 = i16;
                                    i25 = i14;
                                    i26 = i17;
                                    i22 = i2;
                                    i23 = i3;
                                    break;
                                } else {
                                    i8 = i30;
                                    i10 = i40;
                                    i9 = i16;
                                    unsafe = unsafe2;
                                    i11 = i17;
                                    i29 = i15;
                                    i4 = i3;
                                    i7 = i14;
                                    break;
                                }
                            case 16:
                                i14 = i31;
                                i15 = i13;
                                i16 = i36;
                                if (i32 == 0) {
                                    bArr2 = bArr;
                                    zzb2 = zzhl.zzb(bArr2, i30, zzhnVar3);
                                    i17 = i33;
                                    unsafe2.putLong(obj, j, zzif.zza(zzhnVar3.zzb));
                                    i28 = i40 | i38;
                                    i29 = i15;
                                    i27 = i16;
                                    i24 = zzb2;
                                    i25 = i14;
                                    i26 = i17;
                                    i22 = i2;
                                    i23 = i3;
                                    break;
                                } else {
                                    i17 = i33;
                                    i8 = i30;
                                    i10 = i40;
                                    i9 = i16;
                                    unsafe = unsafe2;
                                    i11 = i17;
                                    i29 = i15;
                                    i4 = i3;
                                    i7 = i14;
                                    break;
                                }
                            case 17:
                                if (i32 == 3) {
                                    int i43 = i13;
                                    i24 = zzhl.zza(zzkoVar2.zza(i33), bArr, i30, i2, (i31 << 3) | 4, zzhnVar);
                                    if ((i40 & i38) == 0) {
                                        unsafe2.putObject(obj3, j, zzhnVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj3, j, zzjf.zza(unsafe2.getObject(obj3, j), zzhnVar3.zzc));
                                    }
                                    i28 = i40 | i38;
                                    bArr2 = bArr;
                                    i29 = i43;
                                    i22 = i2;
                                    i27 = i36;
                                    i26 = i33;
                                    i25 = i31;
                                    i23 = i3;
                                    break;
                                } else {
                                    i14 = i31;
                                    i15 = i13;
                                    i16 = i36;
                                    i17 = i33;
                                    i8 = i30;
                                    i10 = i40;
                                    i9 = i16;
                                    unsafe = unsafe2;
                                    i11 = i17;
                                    i29 = i15;
                                    i4 = i3;
                                    i7 = i14;
                                    break;
                                }
                            default:
                                i14 = i31;
                                i17 = i33;
                                i15 = i13;
                                i16 = i36;
                                i8 = i30;
                                i10 = i40;
                                i9 = i16;
                                unsafe = unsafe2;
                                i11 = i17;
                                i29 = i15;
                                i4 = i3;
                                i7 = i14;
                                break;
                        }
                    } else {
                        bArr2 = bArr;
                        if (i35 != 27) {
                            i10 = i28;
                            i19 = i29;
                            if (i35 <= 49) {
                                int i44 = i30;
                                i7 = i31;
                                i21 = i36;
                                unsafe = unsafe2;
                                i11 = i33;
                                i24 = zza(obj, bArr, i30, i2, i36, i7, i32, i33, i34, i35, j, zzhnVar);
                                if (i24 == i44) {
                                    i4 = i3;
                                    i8 = i24;
                                    i29 = i19;
                                    i9 = i21;
                                } else {
                                    zzkoVar2 = this;
                                    obj3 = obj;
                                    bArr2 = bArr;
                                    i25 = i7;
                                    i22 = i2;
                                    i23 = i3;
                                    zzhnVar3 = zzhnVar;
                                    i26 = i11;
                                    i28 = i10;
                                    i29 = i19;
                                    i27 = i21;
                                    unsafe2 = unsafe;
                                }
                            } else {
                                i20 = i30;
                                i7 = i31;
                                i21 = i36;
                                unsafe = unsafe2;
                                i11 = i33;
                                if (i35 != 50) {
                                    i24 = zza(obj, bArr, i20, i2, i21, i7, i32, i34, i35, j, i11, zzhnVar);
                                    if (i24 != i20) {
                                        zzkoVar2 = this;
                                        obj3 = obj;
                                        bArr2 = bArr;
                                        i22 = i2;
                                        zzhnVar3 = zzhnVar;
                                        i27 = i21;
                                        i25 = i7;
                                        i26 = i11;
                                        i28 = i10;
                                        i29 = i19;
                                        unsafe2 = unsafe;
                                        i23 = i3;
                                    }
                                } else if (i32 == 2) {
                                    i24 = zza(obj, bArr, i20, i2, i11, j, zzhnVar);
                                    if (i24 != i20) {
                                        zzkoVar2 = this;
                                        obj3 = obj;
                                        bArr2 = bArr;
                                        i25 = i7;
                                        i22 = i2;
                                        i23 = i3;
                                        zzhnVar3 = zzhnVar;
                                        i26 = i11;
                                        i28 = i10;
                                        i29 = i19;
                                        i27 = i21;
                                        unsafe2 = unsafe;
                                    }
                                }
                                i4 = i3;
                                i8 = i24;
                                i29 = i19;
                                i9 = i21;
                            }
                        } else if (i32 == 2) {
                            zzjl zzjlVar = (zzjl) unsafe2.getObject(obj3, j);
                            if (!zzjlVar.zza()) {
                                int size = zzjlVar.size();
                                zzjlVar = zzjlVar.zza(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(obj3, j, zzjlVar);
                            }
                            i24 = zzhl.zza(zzkoVar2.zza(i33), i36, bArr, i30, i2, zzjlVar, zzhnVar);
                            i27 = i36;
                            i25 = i31;
                            i26 = i33;
                            i28 = i28;
                            i29 = i29;
                            i22 = i2;
                            i23 = i3;
                        } else {
                            i10 = i28;
                            i19 = i29;
                            i20 = i30;
                            i7 = i31;
                            i21 = i36;
                            unsafe = unsafe2;
                            i11 = i33;
                        }
                        i4 = i3;
                        i8 = i20;
                        i29 = i19;
                        i9 = i21;
                    }
                }
                if (i9 != i4 || i4 == 0) {
                    if (this.zzh) {
                        zzhnVar2 = zzhnVar;
                        if (zzhnVar2.zzd != zzio.zzb()) {
                            i12 = i7;
                            zzhnVar2.zzd.zza(this.zzg, i12);
                            i24 = zzhl.zza(i9, bArr, i8, i2, zze(obj), zzhnVar);
                            obj3 = obj;
                            bArr2 = bArr;
                            i22 = i2;
                            i27 = i9;
                            zzkoVar2 = this;
                            zzhnVar3 = zzhnVar2;
                            i25 = i12;
                            i26 = i11;
                            i28 = i10;
                            unsafe2 = unsafe;
                            i23 = i4;
                        } else {
                            i12 = i7;
                        }
                    } else {
                        i12 = i7;
                        zzhnVar2 = zzhnVar;
                    }
                    i24 = zzhl.zza(i9, bArr, i8, i2, zze(obj), zzhnVar);
                    obj3 = obj;
                    bArr2 = bArr;
                    i22 = i2;
                    i27 = i9;
                    zzkoVar2 = this;
                    zzhnVar3 = zzhnVar2;
                    i25 = i12;
                    i26 = i11;
                    i28 = i10;
                    unsafe2 = unsafe;
                    i23 = i4;
                } else {
                    i5 = 1048575;
                    zzkoVar = this;
                    i24 = i8;
                    i27 = i9;
                    i28 = i10;
                }
            } else {
                unsafe = unsafe2;
                i4 = i23;
                zzkoVar = zzkoVar2;
                i5 = 1048575;
            }
        }
        if (i29 != i5) {
            obj2 = obj;
            unsafe.putInt(obj2, i29, i28);
        } else {
            obj2 = obj;
        }
        zzlx zzlxVar = null;
        for (int i45 = zzkoVar.zzm; i45 < zzkoVar.zzn; i45++) {
            zzlxVar = (zzlx) zzkoVar.zza(obj2, zzkoVar.zzl[i45], zzlxVar, zzkoVar.zzq);
        }
        if (zzlxVar != null) {
            zzkoVar.zzq.zzb(obj2, zzlxVar);
        }
        if (i4 == 0) {
            if (i24 != i2) {
                throw zzjk.zzg();
            }
        } else if (i24 > i2 || i27 != i4) {
            throw zzjk.zzg();
        }
        return i24;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x02de, code lost:
    
        if (r0 == r5) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02e0, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02e7, code lost:
    
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r18;
        r1 = r25;
        r6 = r27;
        r7 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x032c, code lost:
    
        if (r0 == r15) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x034b, code lost:
    
        if (r0 == r15) goto L104;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0095. Please report as an issue. */
    @Override // com.google.android.gms.internal.vision.zzlc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Object obj, byte[] bArr, int i, int i2, zzhn zzhnVar) {
        int i3;
        int i4;
        int zzg;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Unsafe unsafe;
        int i10;
        int i11;
        Unsafe unsafe2;
        int i12;
        int i13;
        Unsafe unsafe3;
        Unsafe unsafe4;
        zzko zzkoVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i14 = i2;
        zzhn zzhnVar2 = zzhnVar;
        if (zzkoVar.zzj) {
            Unsafe unsafe5 = zzb;
            int i15 = -1;
            int i16 = 1048575;
            int i17 = i;
            int i18 = -1;
            int i19 = 0;
            int i20 = 0;
            int i21 = 1048575;
            while (i17 < i14) {
                int i22 = i17 + 1;
                byte b = bArr2[i17];
                if (b < 0) {
                    i4 = zzhl.zza(b, bArr2, i22, zzhnVar2);
                    i3 = zzhnVar2.zza;
                } else {
                    i3 = b;
                    i4 = i22;
                }
                int i23 = i3 >>> 3;
                int i24 = i3 & 7;
                if (i23 > i18) {
                    zzg = zzkoVar.zza(i23, i19 / 3);
                } else {
                    zzg = zzkoVar.zzg(i23);
                }
                int i25 = zzg;
                if (i25 == i15) {
                    i11 = i4;
                    i5 = i23;
                    unsafe = unsafe5;
                    i7 = 0;
                } else {
                    int[] iArr = zzkoVar.zzc;
                    int i26 = iArr[i25 + 1];
                    int i27 = (i26 & 267386880) >>> 20;
                    Unsafe unsafe6 = unsafe5;
                    long j = i26 & i16;
                    if (i27 <= 17) {
                        int i28 = iArr[i25 + 2];
                        int i29 = 1 << (i28 >>> 20);
                        int i30 = i28 & 1048575;
                        if (i30 != i21) {
                            if (i21 != 1048575) {
                                long j2 = i21;
                                unsafe4 = unsafe6;
                                unsafe4.putInt(obj2, j2, i20);
                            } else {
                                unsafe4 = unsafe6;
                            }
                            if (i30 != 1048575) {
                                i20 = unsafe4.getInt(obj2, i30);
                            }
                            unsafe2 = unsafe4;
                            i21 = i30;
                        } else {
                            unsafe2 = unsafe6;
                        }
                        switch (i27) {
                            case 0:
                                i5 = i23;
                                i12 = i4;
                                i13 = i25;
                                i6 = i21;
                                unsafe3 = unsafe2;
                                if (i24 == 1) {
                                    zzma.zza(obj2, j, zzhl.zzc(bArr2, i12));
                                    i17 = i12 + 8;
                                    i20 |= i29;
                                    unsafe5 = unsafe3;
                                    i19 = i13;
                                    break;
                                }
                                i11 = i12;
                                unsafe = unsafe3;
                                i7 = i13;
                                i21 = i6;
                                break;
                            case 1:
                                i5 = i23;
                                i12 = i4;
                                i13 = i25;
                                i6 = i21;
                                unsafe3 = unsafe2;
                                if (i24 == 5) {
                                    zzma.zza(obj2, j, zzhl.zzd(bArr2, i12));
                                    i17 = i12 + 4;
                                    i20 |= i29;
                                    unsafe5 = unsafe3;
                                    i19 = i13;
                                    break;
                                }
                                i11 = i12;
                                unsafe = unsafe3;
                                i7 = i13;
                                i21 = i6;
                                break;
                            case 2:
                            case 3:
                                i5 = i23;
                                i12 = i4;
                                i13 = i25;
                                i6 = i21;
                                unsafe3 = unsafe2;
                                if (i24 == 0) {
                                    int zzb2 = zzhl.zzb(bArr2, i12, zzhnVar2);
                                    unsafe3.putLong(obj, j, zzhnVar2.zzb);
                                    i20 |= i29;
                                    unsafe5 = unsafe3;
                                    i19 = i13;
                                    i17 = zzb2;
                                    break;
                                }
                                i11 = i12;
                                unsafe = unsafe3;
                                i7 = i13;
                                i21 = i6;
                                break;
                            case 4:
                            case 11:
                                i5 = i23;
                                i12 = i4;
                                i13 = i25;
                                i6 = i21;
                                unsafe3 = unsafe2;
                                if (i24 == 0) {
                                    i17 = zzhl.zza(bArr2, i12, zzhnVar2);
                                    unsafe3.putInt(obj2, j, zzhnVar2.zza);
                                    i20 |= i29;
                                    unsafe5 = unsafe3;
                                    i19 = i13;
                                    break;
                                }
                                i11 = i12;
                                unsafe = unsafe3;
                                i7 = i13;
                                i21 = i6;
                                break;
                            case 5:
                            case 14:
                                i5 = i23;
                                i13 = i25;
                                i6 = i21;
                                unsafe3 = unsafe2;
                                if (i24 == 1) {
                                    unsafe3.putLong(obj, j, zzhl.zzb(bArr2, i4));
                                    i17 = i4 + 8;
                                    i20 |= i29;
                                    unsafe5 = unsafe3;
                                    i19 = i13;
                                    break;
                                }
                                i12 = i4;
                                i11 = i12;
                                unsafe = unsafe3;
                                i7 = i13;
                                i21 = i6;
                                break;
                            case 6:
                            case 13:
                                i5 = i23;
                                i13 = i25;
                                i6 = i21;
                                unsafe3 = unsafe2;
                                if (i24 == 5) {
                                    unsafe3.putInt(obj2, j, zzhl.zza(bArr2, i4));
                                    i17 = i4 + 4;
                                    i20 |= i29;
                                    unsafe5 = unsafe3;
                                    i19 = i13;
                                    break;
                                }
                                i12 = i4;
                                i11 = i12;
                                unsafe = unsafe3;
                                i7 = i13;
                                i21 = i6;
                                break;
                            case 7:
                                i5 = i23;
                                i13 = i25;
                                i6 = i21;
                                unsafe3 = unsafe2;
                                if (i24 == 0) {
                                    i17 = zzhl.zzb(bArr2, i4, zzhnVar2);
                                    zzma.zza(obj2, j, zzhnVar2.zzb != 0);
                                    i20 |= i29;
                                    unsafe5 = unsafe3;
                                    i19 = i13;
                                    break;
                                }
                                i12 = i4;
                                i11 = i12;
                                unsafe = unsafe3;
                                i7 = i13;
                                i21 = i6;
                                break;
                            case 8:
                                i5 = i23;
                                i13 = i25;
                                i6 = i21;
                                unsafe3 = unsafe2;
                                if (i24 == 2) {
                                    if ((i26 & TLObject.FLAG_29) == 0) {
                                        i17 = zzhl.zzc(bArr2, i4, zzhnVar2);
                                    } else {
                                        i17 = zzhl.zzd(bArr2, i4, zzhnVar2);
                                    }
                                    unsafe3.putObject(obj2, j, zzhnVar2.zzc);
                                    i20 |= i29;
                                    unsafe5 = unsafe3;
                                    i19 = i13;
                                    break;
                                }
                                i12 = i4;
                                i11 = i12;
                                unsafe = unsafe3;
                                i7 = i13;
                                i21 = i6;
                                break;
                            case 9:
                                i5 = i23;
                                i13 = i25;
                                i6 = i21;
                                unsafe3 = unsafe2;
                                if (i24 == 2) {
                                    i17 = zzhl.zza(zzkoVar.zza(i13), bArr2, i4, i14, zzhnVar2);
                                    Object object = unsafe3.getObject(obj2, j);
                                    if (object == null) {
                                        unsafe3.putObject(obj2, j, zzhnVar2.zzc);
                                    } else {
                                        unsafe3.putObject(obj2, j, zzjf.zza(object, zzhnVar2.zzc));
                                    }
                                    i20 |= i29;
                                    unsafe5 = unsafe3;
                                    i19 = i13;
                                    break;
                                }
                                i12 = i4;
                                i11 = i12;
                                unsafe = unsafe3;
                                i7 = i13;
                                i21 = i6;
                                break;
                            case 10:
                                i5 = i23;
                                i13 = i25;
                                i6 = i21;
                                unsafe3 = unsafe2;
                                if (i24 == 2) {
                                    i17 = zzhl.zze(bArr2, i4, zzhnVar2);
                                    unsafe3.putObject(obj2, j, zzhnVar2.zzc);
                                    i20 |= i29;
                                    unsafe5 = unsafe3;
                                    i19 = i13;
                                    break;
                                }
                                i12 = i4;
                                i11 = i12;
                                unsafe = unsafe3;
                                i7 = i13;
                                i21 = i6;
                                break;
                            case 12:
                                i5 = i23;
                                i13 = i25;
                                i6 = i21;
                                unsafe3 = unsafe2;
                                if (i24 == 0) {
                                    i17 = zzhl.zza(bArr2, i4, zzhnVar2);
                                    unsafe3.putInt(obj2, j, zzhnVar2.zza);
                                    i20 |= i29;
                                    unsafe5 = unsafe3;
                                    i19 = i13;
                                    break;
                                }
                                i12 = i4;
                                i11 = i12;
                                unsafe = unsafe3;
                                i7 = i13;
                                i21 = i6;
                                break;
                            case 15:
                                i5 = i23;
                                i13 = i25;
                                i6 = i21;
                                unsafe3 = unsafe2;
                                if (i24 == 0) {
                                    i17 = zzhl.zza(bArr2, i4, zzhnVar2);
                                    unsafe3.putInt(obj2, j, zzif.zze(zzhnVar2.zza));
                                    i20 |= i29;
                                    unsafe5 = unsafe3;
                                    i19 = i13;
                                    break;
                                }
                                i12 = i4;
                                i11 = i12;
                                unsafe = unsafe3;
                                i7 = i13;
                                i21 = i6;
                                break;
                            case 16:
                                if (i24 != 0) {
                                    i5 = i23;
                                    i6 = i21;
                                    unsafe3 = unsafe2;
                                    i12 = i4;
                                    i13 = i25;
                                    i11 = i12;
                                    unsafe = unsafe3;
                                    i7 = i13;
                                    i21 = i6;
                                    break;
                                } else {
                                    int zzb3 = zzhl.zzb(bArr2, i4, zzhnVar2);
                                    i6 = i21;
                                    i5 = i23;
                                    unsafe2.putLong(obj, j, zzif.zza(zzhnVar2.zzb));
                                    i20 |= i29;
                                    unsafe5 = unsafe2;
                                    i19 = i25;
                                    i17 = zzb3;
                                    break;
                                }
                            default:
                                i5 = i23;
                                i12 = i4;
                                i13 = i25;
                                i6 = i21;
                                unsafe3 = unsafe2;
                                i11 = i12;
                                unsafe = unsafe3;
                                i7 = i13;
                                i21 = i6;
                                break;
                        }
                        i16 = 1048575;
                        i15 = -1;
                    } else {
                        i5 = i23;
                        int i31 = i4;
                        i6 = i21;
                        if (i27 != 27) {
                            i7 = i25;
                            if (i27 <= 49) {
                                i9 = i20;
                                i10 = i6;
                                unsafe = unsafe6;
                                i17 = zza(obj, bArr, i31, i2, i3, i5, i24, i7, i26, i27, j, zzhnVar);
                            } else {
                                i8 = i31;
                                i9 = i20;
                                unsafe = unsafe6;
                                i10 = i6;
                                if (i27 != 50) {
                                    i17 = zza(obj, bArr, i8, i2, i3, i5, i24, i26, i27, j, i7, zzhnVar);
                                } else if (i24 == 2) {
                                    i17 = zza(obj, bArr, i8, i2, i7, j, zzhnVar);
                                }
                            }
                            unsafe5 = unsafe;
                            i16 = 1048575;
                            i15 = -1;
                        } else if (i24 == 2) {
                            zzjl zzjlVar = (zzjl) unsafe6.getObject(obj2, j);
                            if (!zzjlVar.zza()) {
                                int size = zzjlVar.size();
                                zzjlVar = zzjlVar.zza(size == 0 ? 10 : size << 1);
                                unsafe6.putObject(obj2, j, zzjlVar);
                            }
                            i17 = zzhl.zza(zzkoVar.zza(i25), i3, bArr, i31, i2, zzjlVar, zzhnVar);
                            unsafe5 = unsafe6;
                            i20 = i20;
                            i19 = i25;
                        } else {
                            i7 = i25;
                            i8 = i31;
                            i9 = i20;
                            unsafe = unsafe6;
                            i10 = i6;
                        }
                        i11 = i8;
                        i20 = i9;
                        i21 = i10;
                        i17 = zzhl.zza(i3, bArr, i11, i2, zze(obj), zzhnVar);
                        zzkoVar = this;
                        obj2 = obj;
                        bArr2 = bArr;
                        i14 = i2;
                        zzhnVar2 = zzhnVar;
                        i19 = i7;
                        i18 = i5;
                        unsafe5 = unsafe;
                        i16 = 1048575;
                        i15 = -1;
                    }
                    i21 = i6;
                    i18 = i5;
                    i16 = 1048575;
                    i15 = -1;
                }
                i17 = zzhl.zza(i3, bArr, i11, i2, zze(obj), zzhnVar);
                zzkoVar = this;
                obj2 = obj;
                bArr2 = bArr;
                i14 = i2;
                zzhnVar2 = zzhnVar;
                i19 = i7;
                i18 = i5;
                unsafe5 = unsafe;
                i16 = 1048575;
                i15 = -1;
            }
            int i32 = i20;
            Unsafe unsafe7 = unsafe5;
            if (i21 != 1048575) {
                unsafe7.putInt(obj, i21, i32);
            }
            if (i17 != i2) {
                throw zzjk.zzg();
            }
            return;
        }
        zza(obj, bArr, i, i2, 0, zzhnVar);
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
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzm) {
            int i6 = this.zzl[i5];
            int i7 = this.zzc[i6];
            int zzd = zzd(i6);
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
            if ((268435456 & zzd) != 0 && !zza(obj, i6, i, i2, i10)) {
                return false;
            }
            int i11 = (267386880 & zzd) >>> 20;
            if (i11 == 9 || i11 == 17) {
                if (zza(obj, i6, i, i2, i10) && !zza(obj, zzd, zza(i6))) {
                    return false;
                }
            } else {
                if (i11 != 27) {
                    if (i11 == 60 || i11 == 68) {
                        if (zza(obj, i7, i6) && !zza(obj, zzd, zza(i6))) {
                            return false;
                        }
                    } else if (i11 != 49) {
                        if (i11 == 50 && !this.zzs.zzc(zzma.zzf(obj, zzd & 1048575)).isEmpty()) {
                            this.zzs.zzb(zzb(i6));
                            throw null;
                        }
                    }
                }
                List list = (List) zzma.zzf(obj, zzd & 1048575);
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
            i5++;
            i3 = i;
            i4 = i2;
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
