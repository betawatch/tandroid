package com.google.android.gms.internal.clearcut;

import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
import com.google.android.gms.internal.clearcut.zzcg;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzds implements zzef {
    private static final Unsafe zzmh = zzfd.zzef();
    private final int[] zzmi;
    private final Object[] zzmj;
    private final int zzmk;
    private final int zzml;
    private final int zzmm;
    private final zzdo zzmn;
    private final boolean zzmo;
    private final boolean zzmp;
    private final boolean zzmq;
    private final boolean zzmr;
    private final int[] zzms;
    private final int[] zzmt;
    private final int[] zzmu;
    private final zzdw zzmv;
    private final zzcy zzmw;
    private final zzex zzmx;
    private final zzbu zzmy;
    private final zzdj zzmz;

    private zzds(int[] iArr, Object[] objArr, int i, int i2, int i3, zzdo zzdoVar, boolean z, boolean z2, int[] iArr2, int[] iArr3, int[] iArr4, zzdw zzdwVar, zzcy zzcyVar, zzex zzexVar, zzbu zzbuVar, zzdj zzdjVar) {
        this.zzmi = iArr;
        this.zzmj = objArr;
        this.zzmk = i;
        this.zzml = i2;
        this.zzmm = i3;
        this.zzmp = zzdoVar instanceof zzcg;
        this.zzmq = z;
        this.zzmo = zzbuVar != null && zzbuVar.zze(zzdoVar);
        this.zzmr = false;
        this.zzms = iArr2;
        this.zzmt = iArr3;
        this.zzmu = iArr4;
        this.zzmv = zzdwVar;
        this.zzmw = zzcyVar;
        this.zzmx = zzexVar;
        this.zzmy = zzbuVar;
        this.zzmn = zzdoVar;
        this.zzmz = zzdjVar;
    }

    private static int zza(int i, byte[] bArr, int i2, int i3, Object obj, zzay zzayVar) {
        return zzax.zza(i, bArr, i2, i3, zzn(obj), zzayVar);
    }

    private static int zza(zzef zzefVar, int i, byte[] bArr, int i2, int i3, zzcn zzcnVar, zzay zzayVar) {
        int zza = zza(zzefVar, bArr, i2, i3, zzayVar);
        while (true) {
            zzcnVar.add(zzayVar.zzff);
            if (zza >= i3) {
                break;
            }
            int zza2 = zzax.zza(bArr, zza, zzayVar);
            if (i != zzayVar.zzfd) {
                break;
            }
            zza = zza(zzefVar, bArr, zza2, i3, zzayVar);
        }
        return zza;
    }

    private static int zza(zzef zzefVar, byte[] bArr, int i, int i2, int i3, zzay zzayVar) {
        zzds zzdsVar = (zzds) zzefVar;
        Object newInstance = zzdsVar.newInstance();
        int zza = zzdsVar.zza(newInstance, bArr, i, i2, i3, zzayVar);
        zzdsVar.zzc(newInstance);
        zzayVar.zzff = newInstance;
        return zza;
    }

    private static int zza(zzef zzefVar, byte[] bArr, int i, int i2, zzay zzayVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzax.zza(i4, bArr, i3, zzayVar);
            i4 = zzayVar.zzfd;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzco.zzbl();
        }
        Object newInstance = zzefVar.newInstance();
        int i6 = i5 + i4;
        zzefVar.zza(newInstance, bArr, i5, i6, zzayVar);
        zzefVar.zzc(newInstance);
        zzayVar.zzff = newInstance;
        return i6;
    }

    private static int zza(zzex zzexVar, Object obj) {
        return zzexVar.zzm(zzexVar.zzq(obj));
    }

    private final int zza(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzay zzayVar) {
        int i9;
        Object valueOf;
        int i10;
        Object valueOf2;
        int zzb;
        long j2;
        int i11;
        Object valueOf3;
        Object object;
        Unsafe unsafe = zzmh;
        long j3 = this.zzmi[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                i9 = i;
                if (i5 != 1) {
                    return i9;
                }
                valueOf = Double.valueOf(zzax.zze(bArr, i));
                unsafe.putObject(obj, j, valueOf);
                zzb = i9 + 8;
                unsafe.putInt(obj, j3, i4);
                return zzb;
            case 52:
                i10 = i;
                if (i5 != 5) {
                    return i10;
                }
                valueOf2 = Float.valueOf(zzax.zzf(bArr, i));
                unsafe.putObject(obj, j, valueOf2);
                zzb = i10 + 4;
                unsafe.putInt(obj, j3, i4);
                return zzb;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                zzb = zzax.zzb(bArr, i, zzayVar);
                j2 = zzayVar.zzfe;
                valueOf3 = Long.valueOf(j2);
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j3, i4);
                return zzb;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                zzb = zzax.zza(bArr, i, zzayVar);
                i11 = zzayVar.zzfd;
                valueOf3 = Integer.valueOf(i11);
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j3, i4);
                return zzb;
            case 56:
            case 65:
                i9 = i;
                if (i5 != 1) {
                    return i9;
                }
                valueOf = Long.valueOf(zzax.zzd(bArr, i));
                unsafe.putObject(obj, j, valueOf);
                zzb = i9 + 8;
                unsafe.putInt(obj, j3, i4);
                return zzb;
            case 57:
            case 64:
                i10 = i;
                if (i5 != 5) {
                    return i10;
                }
                valueOf2 = Integer.valueOf(zzax.zzc(bArr, i));
                unsafe.putObject(obj, j, valueOf2);
                zzb = i10 + 4;
                unsafe.putInt(obj, j3, i4);
                return zzb;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                zzb = zzax.zzb(bArr, i, zzayVar);
                valueOf3 = Boolean.valueOf(zzayVar.zzfe != 0);
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j3, i4);
                return zzb;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int zza = zzax.zza(bArr, i, zzayVar);
                int i12 = zzayVar.zzfd;
                if (i12 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & TLObject.FLAG_29) != 0 && !zzff.zze(bArr, zza, zza + i12)) {
                        throw zzco.zzbp();
                    }
                    unsafe.putObject(obj, j, new String(bArr, zza, i12, zzci.UTF_8));
                    zza += i12;
                }
                unsafe.putInt(obj, j3, i4);
                return zza;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int zza2 = zza(zzad(i8), bArr, i, i2, zzayVar);
                object = unsafe.getInt(obj, j3) == i4 ? unsafe.getObject(obj, j) : null;
                Object obj2 = zzayVar.zzff;
                if (object != null) {
                    obj2 = zzci.zza(object, obj2);
                }
                unsafe.putObject(obj, j, obj2);
                unsafe.putInt(obj, j3, i4);
                return zza2;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int zza3 = zzax.zza(bArr, i, zzayVar);
                int i13 = zzayVar.zzfd;
                if (i13 == 0) {
                    unsafe.putObject(obj, j, zzbb.zzfi);
                } else {
                    unsafe.putObject(obj, j, zzbb.zzb(bArr, zza3, i13));
                    zza3 += i13;
                }
                unsafe.putInt(obj, j3, i4);
                return zza3;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int zza4 = zzax.zza(bArr, i, zzayVar);
                int i14 = zzayVar.zzfd;
                zzck zzaf = zzaf(i8);
                if (zzaf != null && zzaf.zzb(i14) == null) {
                    zzn(obj).zzb(i3, Long.valueOf(i14));
                    return zza4;
                }
                unsafe.putObject(obj, j, Integer.valueOf(i14));
                zzb = zza4;
                unsafe.putInt(obj, j3, i4);
                return zzb;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                zzb = zzax.zza(bArr, i, zzayVar);
                i11 = zzbk.zzm(zzayVar.zzfd);
                valueOf3 = Integer.valueOf(i11);
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j3, i4);
                return zzb;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                zzb = zzax.zzb(bArr, i, zzayVar);
                j2 = zzbk.zza(zzayVar.zzfe);
                valueOf3 = Long.valueOf(j2);
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j3, i4);
                return zzb;
            case 68:
                if (i5 == 3) {
                    zzb = zza(zzad(i8), bArr, i, i2, (i3 & (-8)) | 4, zzayVar);
                    object = unsafe.getInt(obj, j3) == i4 ? unsafe.getObject(obj, j) : null;
                    valueOf3 = zzayVar.zzff;
                    if (object != null) {
                        valueOf3 = zzci.zza(object, valueOf3);
                    }
                    unsafe.putObject(obj, j, valueOf3);
                    unsafe.putInt(obj, j3, i4);
                    return zzb;
                }
            default:
                return i;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0119, code lost:
    
        if (r1 == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011b, code lost:
    
        r4.add(com.google.android.gms.internal.clearcut.zzbb.zzfi);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0129, code lost:
    
        if (r14 >= r15) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012b, code lost:
    
        r1 = com.google.android.gms.internal.clearcut.zzax.zza(r13, r14, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0131, code lost:
    
        if (r16 != r25.zzfd) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0133, code lost:
    
        r14 = com.google.android.gms.internal.clearcut.zzax.zza(r13, r1, r25);
        r1 = r25.zzfd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0139, code lost:
    
        if (r1 != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0121, code lost:
    
        r4.add(com.google.android.gms.internal.clearcut.zzbb.zzb(r13, r14, r1));
        r14 = r14 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013c, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0129, code lost:
    
        r4.add(com.google.android.gms.internal.clearcut.zzbb.zzb(r13, r14, r1));
        r14 = r14 + r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0185  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0139 -> B:61:0x011b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0193 -> B:78:0x0174). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x01c8 -> B:89:0x01a1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zza(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzay zzayVar) {
        int zza;
        Unsafe unsafe = zzmh;
        zzcn zzcnVar = (zzcn) unsafe.getObject(obj, j2);
        if (!zzcnVar.zzu()) {
            int size = zzcnVar.size();
            zzcnVar = zzcnVar.zzi(size == 0 ? 10 : size << 1);
            unsafe.putObject(obj, j2, zzcnVar);
        }
        zzcn zzcnVar2 = zzcnVar;
        switch (i7) {
            case 18:
            case 35:
                if (i5 != 2) {
                    if (i5 == 1) {
                        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzcnVar2);
                        zzax.zze(bArr, i);
                        throw null;
                    }
                    return i;
                }
                WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzcnVar2);
                int zza2 = zzax.zza(bArr, i, zzayVar);
                int i8 = zzayVar.zzfd + zza2;
                if (zza2 < i8) {
                    zzax.zze(bArr, zza2);
                    throw null;
                }
                if (zza2 == i8) {
                    return zza2;
                }
                throw zzco.zzbl();
            case 19:
            case 36:
                if (i5 != 2) {
                    if (i5 == 5) {
                        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzcnVar2);
                        zzax.zzf(bArr, i);
                        throw null;
                    }
                    return i;
                }
                WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzcnVar2);
                int zza3 = zzax.zza(bArr, i, zzayVar);
                int i9 = zzayVar.zzfd + zza3;
                if (zza3 < i9) {
                    zzax.zzf(bArr, zza3);
                    throw null;
                }
                if (zza3 == i9) {
                    return zza3;
                }
                throw zzco.zzbl();
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 != 2) {
                    if (i5 == 0) {
                        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzcnVar2);
                        zzax.zzb(bArr, i, zzayVar);
                        long j3 = zzayVar.zzfe;
                        throw null;
                    }
                    return i;
                }
                WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzcnVar2);
                int zza4 = zzax.zza(bArr, i, zzayVar);
                int i10 = zzayVar.zzfd + zza4;
                if (zza4 < i10) {
                    zzax.zzb(bArr, zza4, zzayVar);
                    throw null;
                }
                if (zza4 == i10) {
                    return zza4;
                }
                throw zzco.zzbl();
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzax.zza(bArr, i, zzcnVar2, zzayVar);
                }
                if (i5 == 0) {
                    return zzax.zza(i3, bArr, i, i2, zzcnVar2, zzayVar);
                }
                return i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 != 2) {
                    if (i5 == 1) {
                        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzcnVar2);
                        zzax.zzd(bArr, i);
                        throw null;
                    }
                    return i;
                }
                WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzcnVar2);
                int zza5 = zzax.zza(bArr, i, zzayVar);
                int i11 = zzayVar.zzfd + zza5;
                if (zza5 < i11) {
                    zzax.zzd(bArr, zza5);
                    throw null;
                }
                if (zza5 == i11) {
                    return zza5;
                }
                throw zzco.zzbl();
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 != 2) {
                    if (i5 == 5) {
                        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzcnVar2);
                        zzax.zzc(bArr, i);
                        throw null;
                    }
                    return i;
                }
                WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzcnVar2);
                int zza6 = zzax.zza(bArr, i, zzayVar);
                int i12 = zzayVar.zzfd + zza6;
                if (zza6 < i12) {
                    zzax.zzc(bArr, zza6);
                    throw null;
                }
                if (zza6 == i12) {
                    return zza6;
                }
                throw zzco.zzbl();
            case 25:
            case 42:
                if (i5 != 2) {
                    if (i5 == 0) {
                        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzcnVar2);
                        zzax.zzb(bArr, i, zzayVar);
                        long j4 = zzayVar.zzfe;
                        throw null;
                    }
                    return i;
                }
                WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzcnVar2);
                int zza7 = zzax.zza(bArr, i, zzayVar);
                int i13 = zzayVar.zzfd + zza7;
                if (zza7 < i13) {
                    zzax.zzb(bArr, zza7, zzayVar);
                    throw null;
                }
                if (zza7 == i13) {
                    return zza7;
                }
                throw zzco.zzbl();
            case 26:
                if (i5 == 2) {
                    long j5 = j & 536870912;
                    int zza8 = zzax.zza(bArr, i, zzayVar);
                    int i14 = zzayVar.zzfd;
                    if (j5 == 0) {
                        if (i14 != 0) {
                            zzcnVar2.add(new String(bArr, zza8, i14, zzci.UTF_8));
                            zza8 += i14;
                            while (zza8 < i2) {
                                int zza9 = zzax.zza(bArr, zza8, zzayVar);
                                if (i3 != zzayVar.zzfd) {
                                    return zza8;
                                }
                                zza8 = zzax.zza(bArr, zza9, zzayVar);
                                int i15 = zzayVar.zzfd;
                                if (i15 != 0) {
                                    zzcnVar2.add(new String(bArr, zza8, i15, zzci.UTF_8));
                                    zza8 += i15;
                                }
                            }
                            return zza8;
                        }
                        zzcnVar2.add("");
                        while (zza8 < i2) {
                        }
                        return zza8;
                    }
                    if (i14 != 0) {
                        int i16 = zza8 + i14;
                        if (!zzff.zze(bArr, zza8, i16)) {
                            throw zzco.zzbp();
                        }
                        zzcnVar2.add(new String(bArr, zza8, i14, zzci.UTF_8));
                        zza8 = i16;
                        while (zza8 < i2) {
                            int zza10 = zzax.zza(bArr, zza8, zzayVar);
                            if (i3 != zzayVar.zzfd) {
                                return zza8;
                            }
                            zza8 = zzax.zza(bArr, zza10, zzayVar);
                            int i17 = zzayVar.zzfd;
                            if (i17 != 0) {
                                int i18 = zza8 + i17;
                                if (!zzff.zze(bArr, zza8, i18)) {
                                    throw zzco.zzbp();
                                }
                                zzcnVar2.add(new String(bArr, zza8, i17, zzci.UTF_8));
                                zza8 = i18;
                            }
                        }
                        return zza8;
                    }
                    zzcnVar2.add("");
                    while (zza8 < i2) {
                    }
                    return zza8;
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return zza(zzad(i6), i3, bArr, i, i2, zzcnVar2, zzayVar);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    int zza11 = zzax.zza(bArr, i, zzayVar);
                    int i19 = zzayVar.zzfd;
                    break;
                }
                return i;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        zza = zzax.zza(i3, bArr, i, i2, zzcnVar2, zzayVar);
                    }
                    return i;
                }
                zza = zzax.zza(bArr, i, zzcnVar2, zzayVar);
                zzcg zzcgVar = (zzcg) obj;
                zzey zzeyVar = zzcgVar.zzjp;
                zzey zzeyVar2 = (zzey) zzeh.zza(i4, zzcnVar2, zzaf(i6), zzeyVar != zzey.zzea() ? zzeyVar : null, this.zzmx);
                if (zzeyVar2 != null) {
                    zzcgVar.zzjp = zzeyVar2;
                }
                return zza;
            case 33:
            case 47:
                if (i5 != 2) {
                    if (i5 == 0) {
                        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzcnVar2);
                        zzax.zza(bArr, i, zzayVar);
                        zzbk.zzm(zzayVar.zzfd);
                        throw null;
                    }
                    return i;
                }
                WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzcnVar2);
                int zza12 = zzax.zza(bArr, i, zzayVar);
                int i20 = zzayVar.zzfd + zza12;
                if (zza12 >= i20) {
                    if (zza12 == i20) {
                        return zza12;
                    }
                    throw zzco.zzbl();
                }
                zzax.zza(bArr, zza12, zzayVar);
                zzbk.zzm(zzayVar.zzfd);
                throw null;
            case 34:
            case 48:
                if (i5 != 2) {
                    if (i5 == 0) {
                        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzcnVar2);
                        zzax.zzb(bArr, i, zzayVar);
                        zzbk.zza(zzayVar.zzfe);
                        throw null;
                    }
                    return i;
                }
                WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzcnVar2);
                int zza13 = zzax.zza(bArr, i, zzayVar);
                int i21 = zzayVar.zzfd + zza13;
                if (zza13 >= i21) {
                    if (zza13 == i21) {
                        return zza13;
                    }
                    throw zzco.zzbl();
                }
                zzax.zzb(bArr, zza13, zzayVar);
                zzbk.zza(zzayVar.zzfe);
                throw null;
            case 49:
                if (i5 == 3) {
                    zzef zzad = zzad(i6);
                    int i22 = (i3 & (-8)) | 4;
                    int zza14 = zza(zzad, bArr, i, i2, i22, zzayVar);
                    int i23 = i22;
                    zzcnVar2.add(zzayVar.zzff);
                    while (zza14 < i2) {
                        int zza15 = zzax.zza(bArr, zza14, zzayVar);
                        if (i3 != zzayVar.zzfd) {
                            return zza14;
                        }
                        int i24 = i23;
                        zza14 = zza(zzad, bArr, zza15, i2, i24, zzayVar);
                        zzcnVar2.add(zzayVar.zzff);
                        i23 = i24;
                    }
                    return zza14;
                }
                return i;
            default:
                return i;
        }
    }

    private final int zza(Object obj, byte[] bArr, int i, int i2, int i3, int i4, long j, zzay zzayVar) {
        Unsafe unsafe = zzmh;
        Object zzae = zzae(i3);
        Object object = unsafe.getObject(obj, j);
        if (this.zzmz.zzi(object)) {
            Object zzk = this.zzmz.zzk(zzae);
            this.zzmz.zzb(zzk, object);
            unsafe.putObject(obj, j, zzk);
            object = zzk;
        }
        this.zzmz.zzl(zzae);
        this.zzmz.zzg(object);
        int zza = zzax.zza(bArr, i, zzayVar);
        int i5 = zzayVar.zzfd;
        if (i5 < 0 || i5 > i2 - zza) {
            throw zzco.zzbl();
        }
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:108:0x0066. Please report as an issue. */
    private final int zza(Object obj, byte[] bArr, int i, int i2, int i3, zzay zzayVar) {
        zzds zzdsVar;
        Object obj2;
        int i4;
        Unsafe unsafe;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        zzds zzdsVar2;
        zzck zzaf;
        int i10;
        int i11;
        int i12;
        byte[] bArr2;
        Unsafe unsafe2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        zzay zzayVar2;
        int i19;
        long j;
        Object zza;
        zzay zzayVar3;
        int zzb;
        Unsafe unsafe3;
        int i20;
        zzds zzdsVar3 = this;
        Object obj3 = obj;
        byte[] bArr3 = bArr;
        int i21 = i2;
        zzay zzayVar4 = zzayVar;
        Unsafe unsafe4 = zzmh;
        int i22 = -1;
        int i23 = i;
        int i24 = 0;
        int i25 = -1;
        int i26 = 0;
        while (true) {
            if (i23 < i21) {
                int i27 = i23 + 1;
                int i28 = bArr3[i23];
                if (i28 < 0) {
                    i27 = zzax.zza(i28, bArr3, i27, zzayVar4);
                    i28 = zzayVar4.zzfd;
                }
                int i29 = i28;
                i23 = i27;
                int i30 = i29 >>> 3;
                int i31 = i29 & 7;
                int zzai = zzdsVar3.zzai(i30);
                if (zzai != i22) {
                    int[] iArr = zzdsVar3.zzmi;
                    int i32 = iArr[zzai + 1];
                    int i33 = (i32 & 267386880) >>> 20;
                    long j2 = i32 & 1048575;
                    if (i33 <= 17) {
                        int i34 = iArr[zzai + 2];
                        int i35 = 1 << (i34 >>> 20);
                        int i36 = i34 & 1048575;
                        i5 = -1;
                        if (i36 != i25) {
                            if (i25 != -1) {
                                unsafe4.putInt(obj3, i25, i26);
                            }
                            i25 = i36;
                            i26 = unsafe4.getInt(obj3, i36);
                        }
                        switch (i33) {
                            case 0:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i13 = i29;
                                i14 = i2;
                                i15 = i25;
                                i16 = i23;
                                i11 = i26;
                                if (i31 != 1) {
                                    i6 = i3;
                                    zzdsVar = zzdsVar3;
                                    unsafe = unsafe2;
                                    i12 = i13;
                                    i23 = i16;
                                    i25 = i15;
                                    i26 = i11;
                                    break;
                                } else {
                                    zzfd.zza(obj3, j2, zzax.zze(bArr2, i16));
                                    i17 = i16 + 8;
                                    i26 = i11 | i35;
                                    zzayVar4 = zzayVar;
                                    i24 = i13;
                                    i21 = i14;
                                    i25 = i15;
                                    unsafe4 = unsafe2;
                                    i23 = i17;
                                    bArr3 = bArr2;
                                    i22 = -1;
                                }
                            case 1:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i13 = i29;
                                i14 = i2;
                                i15 = i25;
                                i16 = i23;
                                i11 = i26;
                                if (i31 != 5) {
                                    i6 = i3;
                                    zzdsVar = zzdsVar3;
                                    unsafe = unsafe2;
                                    i12 = i13;
                                    i23 = i16;
                                    i25 = i15;
                                    i26 = i11;
                                    break;
                                } else {
                                    zzfd.zza(obj3, j2, zzax.zzf(bArr2, i16));
                                    i17 = i16 + 4;
                                    i26 = i11 | i35;
                                    zzayVar4 = zzayVar;
                                    i24 = i13;
                                    i21 = i14;
                                    i25 = i15;
                                    unsafe4 = unsafe2;
                                    i23 = i17;
                                    bArr3 = bArr2;
                                    i22 = -1;
                                }
                            case 2:
                            case 3:
                                unsafe2 = unsafe4;
                                zzayVar3 = zzayVar;
                                i15 = i25;
                                i16 = i23;
                                i11 = i26;
                                if (i31 != 0) {
                                    i13 = i29;
                                    i6 = i3;
                                    zzdsVar = zzdsVar3;
                                    unsafe = unsafe2;
                                    i12 = i13;
                                    i23 = i16;
                                    i25 = i15;
                                    i26 = i11;
                                    break;
                                } else {
                                    zzb = zzax.zzb(bArr, i16, zzayVar3);
                                    Object obj4 = obj3;
                                    unsafe2.putLong(obj4, j2, zzayVar3.zzfe);
                                    unsafe3 = unsafe2;
                                    obj3 = obj4;
                                    i26 = i11 | i35;
                                    i21 = i2;
                                    bArr3 = bArr;
                                    i24 = i29;
                                    i25 = i15;
                                    i22 = -1;
                                    unsafe4 = unsafe3;
                                    i23 = zzb;
                                    zzayVar4 = zzayVar3;
                                }
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i18 = i2;
                                zzayVar2 = zzayVar;
                                i15 = i25;
                                i16 = i23;
                                i11 = i26;
                                if (i31 != 0) {
                                    i13 = i29;
                                    i6 = i3;
                                    zzdsVar = zzdsVar3;
                                    unsafe = unsafe2;
                                    i12 = i13;
                                    i23 = i16;
                                    i25 = i15;
                                    i26 = i11;
                                    break;
                                } else {
                                    i17 = zzax.zza(bArr2, i16, zzayVar2);
                                    unsafe2.putInt(obj3, j2, zzayVar2.zzfd);
                                    i26 = i11 | i35;
                                    i21 = i18;
                                    i24 = i29;
                                    zzayVar4 = zzayVar2;
                                    i25 = i15;
                                    unsafe4 = unsafe2;
                                    i23 = i17;
                                    bArr3 = bArr2;
                                    i22 = -1;
                                }
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i19 = i23;
                                i18 = i2;
                                i11 = i26;
                                zzayVar2 = zzayVar;
                                i15 = i25;
                                if (i31 != 1) {
                                    i16 = i19;
                                    i13 = i29;
                                    i6 = i3;
                                    zzdsVar = zzdsVar3;
                                    unsafe = unsafe2;
                                    i12 = i13;
                                    i23 = i16;
                                    i25 = i15;
                                    i26 = i11;
                                    break;
                                } else {
                                    Object obj5 = obj3;
                                    unsafe2.putLong(obj5, j2, zzax.zzd(bArr2, i19));
                                    unsafe2 = unsafe2;
                                    obj3 = obj5;
                                    i17 = i19 + 8;
                                    i26 = i11 | i35;
                                    i21 = i18;
                                    i24 = i29;
                                    zzayVar4 = zzayVar2;
                                    i25 = i15;
                                    unsafe4 = unsafe2;
                                    i23 = i17;
                                    bArr3 = bArr2;
                                    i22 = -1;
                                }
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i19 = i23;
                                i18 = i2;
                                i11 = i26;
                                zzayVar2 = zzayVar;
                                i15 = i25;
                                if (i31 != 5) {
                                    i16 = i19;
                                    i13 = i29;
                                    i6 = i3;
                                    zzdsVar = zzdsVar3;
                                    unsafe = unsafe2;
                                    i12 = i13;
                                    i23 = i16;
                                    i25 = i15;
                                    i26 = i11;
                                    break;
                                } else {
                                    unsafe2.putInt(obj3, j2, zzax.zzc(bArr2, i19));
                                    i17 = i19 + 4;
                                    i26 = i11 | i35;
                                    i21 = i18;
                                    i24 = i29;
                                    zzayVar4 = zzayVar2;
                                    i25 = i15;
                                    unsafe4 = unsafe2;
                                    i23 = i17;
                                    bArr3 = bArr2;
                                    i22 = -1;
                                }
                            case 7:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i19 = i23;
                                i18 = i2;
                                i11 = i26;
                                zzayVar2 = zzayVar;
                                i15 = i25;
                                if (i31 != 0) {
                                    i16 = i19;
                                    i13 = i29;
                                    i6 = i3;
                                    zzdsVar = zzdsVar3;
                                    unsafe = unsafe2;
                                    i12 = i13;
                                    i23 = i16;
                                    i25 = i15;
                                    i26 = i11;
                                    break;
                                } else {
                                    i17 = zzax.zzb(bArr2, i19, zzayVar2);
                                    zzfd.zza(obj3, j2, zzayVar2.zzfe != 0);
                                    i26 = i11 | i35;
                                    i21 = i18;
                                    i24 = i29;
                                    zzayVar4 = zzayVar2;
                                    i25 = i15;
                                    unsafe4 = unsafe2;
                                    i23 = i17;
                                    bArr3 = bArr2;
                                    i22 = -1;
                                }
                            case 8:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i19 = i23;
                                i18 = i2;
                                i11 = i26;
                                zzayVar2 = zzayVar;
                                i15 = i25;
                                j = j2;
                                if (i31 != 2) {
                                    i16 = i19;
                                    i13 = i29;
                                    i6 = i3;
                                    zzdsVar = zzdsVar3;
                                    unsafe = unsafe2;
                                    i12 = i13;
                                    i23 = i16;
                                    i25 = i15;
                                    i26 = i11;
                                    break;
                                } else {
                                    i17 = (i32 & TLObject.FLAG_29) == 0 ? zzax.zzc(bArr2, i19, zzayVar2) : zzax.zzd(bArr2, i19, zzayVar2);
                                    zza = zzayVar2.zzff;
                                    unsafe2.putObject(obj3, j, zza);
                                    i26 = i11 | i35;
                                    i21 = i18;
                                    i24 = i29;
                                    zzayVar4 = zzayVar2;
                                    i25 = i15;
                                    unsafe4 = unsafe2;
                                    i23 = i17;
                                    bArr3 = bArr2;
                                    i22 = -1;
                                }
                            case 9:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i19 = i23;
                                i18 = i2;
                                i11 = i26;
                                zzayVar2 = zzayVar;
                                i15 = i25;
                                j = j2;
                                if (i31 != 2) {
                                    i16 = i19;
                                    i13 = i29;
                                    i6 = i3;
                                    zzdsVar = zzdsVar3;
                                    unsafe = unsafe2;
                                    i12 = i13;
                                    i23 = i16;
                                    i25 = i15;
                                    i26 = i11;
                                    break;
                                } else {
                                    i17 = zza(zzdsVar3.zzad(zzai), bArr2, i19, i18, zzayVar2);
                                    zza = (i11 & i35) == 0 ? zzayVar2.zzff : zzci.zza(unsafe2.getObject(obj3, j), zzayVar2.zzff);
                                    unsafe2.putObject(obj3, j, zza);
                                    i26 = i11 | i35;
                                    i21 = i18;
                                    i24 = i29;
                                    zzayVar4 = zzayVar2;
                                    i25 = i15;
                                    unsafe4 = unsafe2;
                                    i23 = i17;
                                    bArr3 = bArr2;
                                    i22 = -1;
                                }
                            case 10:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i19 = i23;
                                i18 = i2;
                                i11 = i26;
                                zzayVar2 = zzayVar;
                                i15 = i25;
                                j = j2;
                                if (i31 != 2) {
                                    i16 = i19;
                                    i13 = i29;
                                    i6 = i3;
                                    zzdsVar = zzdsVar3;
                                    unsafe = unsafe2;
                                    i12 = i13;
                                    i23 = i16;
                                    i25 = i15;
                                    i26 = i11;
                                    break;
                                } else {
                                    i17 = zzax.zze(bArr2, i19, zzayVar2);
                                    zza = zzayVar2.zzff;
                                    unsafe2.putObject(obj3, j, zza);
                                    i26 = i11 | i35;
                                    i21 = i18;
                                    i24 = i29;
                                    zzayVar4 = zzayVar2;
                                    i25 = i15;
                                    unsafe4 = unsafe2;
                                    i23 = i17;
                                    bArr3 = bArr2;
                                    i22 = -1;
                                }
                            case 12:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i19 = i23;
                                i18 = i2;
                                i11 = i26;
                                zzayVar2 = zzayVar;
                                i15 = i25;
                                if (i31 != 0) {
                                    i16 = i19;
                                    i13 = i29;
                                    i6 = i3;
                                    zzdsVar = zzdsVar3;
                                    unsafe = unsafe2;
                                    i12 = i13;
                                    i23 = i16;
                                    i25 = i15;
                                    i26 = i11;
                                    break;
                                } else {
                                    i17 = zzax.zza(bArr2, i19, zzayVar2);
                                    int i37 = zzayVar2.zzfd;
                                    zzck zzaf2 = zzdsVar3.zzaf(zzai);
                                    if (zzaf2 == null || zzaf2.zzb(i37) != null) {
                                        unsafe2.putInt(obj3, j2, i37);
                                        i26 = i11 | i35;
                                        i21 = i18;
                                        i24 = i29;
                                        zzayVar4 = zzayVar2;
                                        i25 = i15;
                                        unsafe4 = unsafe2;
                                        i23 = i17;
                                        bArr3 = bArr2;
                                        i22 = -1;
                                    } else {
                                        zzn(obj3).zzb(i29, Long.valueOf(i37));
                                        i21 = i18;
                                        i24 = i29;
                                        zzayVar4 = zzayVar2;
                                        i25 = i15;
                                        i26 = i11;
                                        unsafe4 = unsafe2;
                                        i23 = i17;
                                        bArr3 = bArr2;
                                        i22 = -1;
                                    }
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i19 = i23;
                                if (i31 != 0) {
                                    i15 = i25;
                                    i11 = i26;
                                    i16 = i19;
                                    i13 = i29;
                                    i6 = i3;
                                    zzdsVar = zzdsVar3;
                                    unsafe = unsafe2;
                                    i12 = i13;
                                    i23 = i16;
                                    i25 = i15;
                                    i26 = i11;
                                    break;
                                } else {
                                    i17 = zzax.zza(bArr2, i19, zzayVar);
                                    unsafe2.putInt(obj3, j2, zzbk.zzm(zzayVar.zzfd));
                                    i26 |= i35;
                                    i21 = i2;
                                    i24 = i29;
                                    zzayVar4 = zzayVar;
                                    unsafe4 = unsafe2;
                                    i23 = i17;
                                    bArr3 = bArr2;
                                    i22 = -1;
                                }
                            case 16:
                                i19 = i23;
                                if (i31 != 0) {
                                    unsafe2 = unsafe4;
                                    i15 = i25;
                                    i11 = i26;
                                    i16 = i19;
                                    i13 = i29;
                                    i6 = i3;
                                    zzdsVar = zzdsVar3;
                                    unsafe = unsafe2;
                                    i12 = i13;
                                    i23 = i16;
                                    i25 = i15;
                                    i26 = i11;
                                    break;
                                } else {
                                    zzb = zzax.zzb(bArr, i19, zzayVar);
                                    zzayVar3 = zzayVar;
                                    Object obj6 = obj3;
                                    Unsafe unsafe5 = unsafe4;
                                    unsafe5.putLong(obj6, j2, zzbk.zza(zzayVar.zzfe));
                                    unsafe3 = unsafe5;
                                    obj3 = obj6;
                                    i26 |= i35;
                                    i21 = i2;
                                    bArr3 = bArr;
                                    i24 = i29;
                                    i22 = -1;
                                    unsafe4 = unsafe3;
                                    i23 = zzb;
                                    zzayVar4 = zzayVar3;
                                }
                            case 17:
                                if (i31 != 3) {
                                    unsafe2 = unsafe4;
                                    i15 = i25;
                                    i13 = i29;
                                    i16 = i23;
                                    i11 = i26;
                                    i6 = i3;
                                    zzdsVar = zzdsVar3;
                                    unsafe = unsafe2;
                                    i12 = i13;
                                    i23 = i16;
                                    i25 = i15;
                                    i26 = i11;
                                    break;
                                } else {
                                    i17 = zza(zzdsVar3.zzad(zzai), bArr, i23, i2, (i30 << 3) | 4, zzayVar);
                                    bArr2 = bArr;
                                    unsafe4.putObject(obj3, j2, (i26 & i35) == 0 ? zzayVar.zzff : zzci.zza(unsafe4.getObject(obj3, j2), zzayVar.zzff));
                                    i26 |= i35;
                                    i21 = i2;
                                    zzayVar4 = zzayVar;
                                    i24 = i29;
                                    i23 = i17;
                                    bArr3 = bArr2;
                                    i22 = -1;
                                }
                            default:
                                unsafe2 = unsafe4;
                                i15 = i25;
                                i13 = i29;
                                i16 = i23;
                                i11 = i26;
                                i6 = i3;
                                zzdsVar = zzdsVar3;
                                unsafe = unsafe2;
                                i12 = i13;
                                i23 = i16;
                                i25 = i15;
                                i26 = i11;
                                break;
                        }
                    } else {
                        Unsafe unsafe6 = unsafe4;
                        i5 = -1;
                        int i38 = i21;
                        if (i33 != 27) {
                            i23 = i23;
                            if (i33 <= 49) {
                                i11 = i26;
                                unsafe = unsafe6;
                                i10 = i25;
                                int zza2 = zzdsVar3.zza(obj, bArr, i23, i2, i29, i30, i31, zzai, i32, i33, j2, zzayVar);
                                i20 = i29;
                                if (zza2 == i23) {
                                    zzdsVar = this;
                                    i6 = i3;
                                    i23 = zza2;
                                    i12 = i20;
                                    i26 = i11;
                                    i25 = i10;
                                } else {
                                    zzdsVar3 = this;
                                    obj3 = obj;
                                    bArr3 = bArr;
                                    i21 = i2;
                                    zzayVar4 = zzayVar;
                                    i23 = zza2;
                                    i24 = i20;
                                    unsafe4 = unsafe;
                                    i26 = i11;
                                    i22 = -1;
                                    i25 = i10;
                                }
                            } else {
                                unsafe = unsafe6;
                                i10 = i25;
                                i11 = i26;
                                i20 = i29;
                                if (i33 != 50) {
                                    int zza3 = zza(obj, bArr, i23, i2, i20, i30, i31, i32, i33, j2, zzai, zzayVar);
                                    zzdsVar = this;
                                    i12 = i20;
                                    if (zza3 == i23) {
                                        i25 = i10;
                                        i6 = i3;
                                        i23 = zza3;
                                        i26 = i11;
                                    } else {
                                        obj3 = obj;
                                        i25 = i10;
                                        i21 = i2;
                                        i24 = i12;
                                        i23 = zza3;
                                        zzdsVar3 = zzdsVar;
                                        unsafe4 = unsafe;
                                        i26 = i11;
                                        i22 = -1;
                                        bArr3 = bArr;
                                        zzayVar4 = zzayVar;
                                    }
                                } else if (i31 == 2) {
                                    int zza4 = zza(obj, bArr, i23, i2, zzai, i30, j2, zzayVar);
                                    if (zza4 == i23) {
                                        zzdsVar = this;
                                        i6 = i3;
                                        i23 = zza4;
                                        i12 = i20;
                                        i26 = i11;
                                        i25 = i10;
                                    } else {
                                        zzdsVar3 = this;
                                        obj3 = obj;
                                        bArr3 = bArr;
                                        i21 = i2;
                                        zzayVar4 = zzayVar;
                                        i23 = zza4;
                                        i24 = i20;
                                        unsafe4 = unsafe;
                                        i26 = i11;
                                        i22 = -1;
                                        i25 = i10;
                                    }
                                } else {
                                    zzdsVar = this;
                                    i12 = i20;
                                }
                            }
                        } else if (i31 == 2) {
                            zzcn zzcnVar = (zzcn) unsafe6.getObject(obj3, j2);
                            if (!zzcnVar.zzu()) {
                                int size = zzcnVar.size();
                                zzcnVar = zzcnVar.zzi(size == 0 ? 10 : size << 1);
                                unsafe6.putObject(obj3, j2, zzcnVar);
                            }
                            zzayVar4 = zzayVar;
                            unsafe4 = unsafe6;
                            i21 = i2;
                            i23 = zza(zzdsVar3.zzad(zzai), i29, bArr, i23, i38, zzcnVar, zzayVar4);
                            i24 = i29;
                            i22 = -1;
                            obj3 = obj;
                            bArr3 = bArr;
                        } else {
                            zzdsVar = zzdsVar3;
                            i12 = i29;
                            unsafe = unsafe6;
                            i10 = i25;
                            i23 = i23;
                            i11 = i26;
                        }
                    }
                    if (i12 == i6 || i6 == 0) {
                        int i39 = i12;
                        int zza5 = zza(i39, bArr, i23, i2, obj, zzayVar);
                        i24 = i39;
                        obj3 = obj;
                        zzdsVar3 = zzdsVar;
                        unsafe4 = unsafe;
                        i22 = -1;
                        zzayVar4 = zzayVar;
                        i21 = i2;
                        i23 = zza5;
                        bArr3 = bArr;
                    } else {
                        obj2 = obj;
                        i4 = i2;
                        i7 = i25;
                        i9 = i26;
                        i8 = i12;
                    }
                } else {
                    zzdsVar = zzdsVar3;
                    unsafe = unsafe4;
                    i10 = i25;
                    i11 = i26;
                    i12 = i29;
                    i5 = -1;
                }
                i25 = i10;
                i6 = i3;
                i26 = i11;
                if (i12 == i6) {
                }
                int i392 = i12;
                int zza52 = zza(i392, bArr, i23, i2, obj, zzayVar);
                i24 = i392;
                obj3 = obj;
                zzdsVar3 = zzdsVar;
                unsafe4 = unsafe;
                i22 = -1;
                zzayVar4 = zzayVar;
                i21 = i2;
                i23 = zza52;
                bArr3 = bArr;
            } else {
                zzdsVar = zzdsVar3;
                obj2 = obj3;
                i4 = i21;
                unsafe = unsafe4;
                int i40 = i26;
                i5 = -1;
                i6 = i3;
                i7 = i25;
                i8 = i24;
                i9 = i40;
            }
        }
        int i41 = i23;
        if (i7 != i5) {
            unsafe.putInt(obj2, i7, i9);
        }
        int[] iArr2 = zzdsVar.zzmt;
        if (iArr2 != null) {
            int length = iArr2.length;
            Object obj7 = null;
            int i42 = 0;
            while (i42 < length) {
                int i43 = iArr2[i42];
                zzex zzexVar = zzdsVar.zzmx;
                int i44 = zzdsVar.zzmi[i43];
                Object zzo = zzfd.zzo(obj2, zzdsVar.zzag(i43) & 1048575);
                if (zzo == null || (zzaf = zzdsVar.zzaf(i43)) == null) {
                    zzdsVar2 = zzdsVar;
                } else {
                    Map zzg = zzdsVar.zzmz.zzg(zzo);
                    zzdsVar2 = zzdsVar;
                    obj7 = zzdsVar2.zza(i43, i44, zzg, zzaf, obj7, zzexVar);
                }
                obj7 = (zzey) obj7;
                i42++;
                zzdsVar = zzdsVar2;
            }
            zzds zzdsVar4 = zzdsVar;
            if (obj7 != null) {
                zzdsVar4.zzmx.zzf(obj2, obj7);
            }
        }
        if (i6 == 0) {
            if (i41 != i4) {
                throw zzco.zzbo();
            }
        } else if (i41 > i4 || i8 != i6) {
            throw zzco.zzbo();
        }
        return i41;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016b A[EDGE_INSN: B:50:0x016b->B:71:0x016b BREAK  A[LOOP:0: B:18:0x0066->B:27:0x0167], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzds zza(Class cls, zzdm zzdmVar, zzdw zzdwVar, zzcy zzcyVar, zzex zzexVar, zzbu zzbuVar, zzdj zzdjVar) {
        int zzcu;
        int i;
        int i2;
        int zza;
        int i3;
        int zzdg;
        int zzcy;
        if (!(zzdmVar instanceof zzec)) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(zzdmVar);
            throw null;
        }
        zzec zzecVar = (zzec) zzdmVar;
        boolean z = zzecVar.zzcf() == zzcg.zzg.zzkm;
        if (zzecVar.getFieldCount() == 0) {
            zzcu = 0;
            i = 0;
            i2 = 0;
        } else {
            int zzcp = zzecVar.zzcp();
            int zzcq = zzecVar.zzcq();
            zzcu = zzecVar.zzcu();
            i = zzcp;
            i2 = zzcq;
        }
        int[] iArr = new int[zzcu << 2];
        Object[] objArr = new Object[zzcu << 1];
        int[] iArr2 = zzecVar.zzcr() > 0 ? new int[zzecVar.zzcr()] : null;
        int[] iArr3 = zzecVar.zzcs() > 0 ? new int[zzecVar.zzcs()] : null;
        zzed zzco = zzecVar.zzco();
        if (zzco.next()) {
            int zzcx = zzco.zzcx();
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (zzcx >= zzecVar.zzcv() || i4 >= ((zzcx - i) << 2)) {
                    if (zzco.zzda()) {
                        zza = (int) zzfd.zza(zzco.zzdb());
                        i3 = (int) zzfd.zza(zzco.zzdc());
                    } else {
                        zza = (int) zzfd.zza(zzco.zzdd());
                        if (zzco.zzde()) {
                            i3 = (int) zzfd.zza(zzco.zzdf());
                            zzdg = zzco.zzdg();
                            iArr[i4] = zzco.zzcx();
                            int i7 = i4 + 1;
                            iArr[i7] = (!zzco.zzdi() ? TLObject.FLAG_29 : 0) | (!zzco.zzdh() ? TLObject.FLAG_28 : 0) | (zzco.zzcy() << 20) | zza;
                            iArr[i4 + 2] = i3 | (zzdg << 20);
                            if (zzco.zzdl() == null) {
                                int i8 = (i4 / 4) << 1;
                                objArr[i8] = zzco.zzdl();
                                if (zzco.zzdj() != null) {
                                    objArr[i8 + 1] = zzco.zzdj();
                                } else if (zzco.zzdk() != null) {
                                    objArr[i8 + 1] = zzco.zzdk();
                                }
                            } else if (zzco.zzdj() != null) {
                                objArr[((i4 / 4) << 1) + 1] = zzco.zzdj();
                            } else if (zzco.zzdk() != null) {
                                objArr[((i4 / 4) << 1) + 1] = zzco.zzdk();
                            }
                            zzcy = zzco.zzcy();
                            if (zzcy != zzcb.zziw.ordinal()) {
                                iArr2[i5] = i4;
                                i5++;
                            } else if (zzcy >= 18 && zzcy <= 49) {
                                iArr3[i6] = iArr[i7] & 1048575;
                                i6++;
                            }
                            if (zzco.next()) {
                                break;
                            }
                            zzcx = zzco.zzcx();
                        } else {
                            i3 = 0;
                        }
                    }
                    zzdg = 0;
                    iArr[i4] = zzco.zzcx();
                    int i72 = i4 + 1;
                    iArr[i72] = (!zzco.zzdi() ? TLObject.FLAG_29 : 0) | (!zzco.zzdh() ? TLObject.FLAG_28 : 0) | (zzco.zzcy() << 20) | zza;
                    iArr[i4 + 2] = i3 | (zzdg << 20);
                    if (zzco.zzdl() == null) {
                    }
                    zzcy = zzco.zzcy();
                    if (zzcy != zzcb.zziw.ordinal()) {
                    }
                    if (zzco.next()) {
                    }
                } else {
                    for (int i9 = 0; i9 < 4; i9++) {
                        iArr[i4 + i9] = -1;
                    }
                }
                i4 += 4;
            }
        }
        return new zzds(iArr, objArr, i, i2, zzecVar.zzcv(), zzecVar.zzch(), z, false, zzecVar.zzct(), iArr2, iArr3, zzdwVar, zzcyVar, zzexVar, zzbuVar, zzdjVar);
    }

    private final Object zza(int i, int i2, Map map, zzck zzckVar, Object obj, zzex zzexVar) {
        this.zzmz.zzl(zzae(i));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (zzckVar.zzb(((Integer) entry.getValue()).intValue()) == null) {
                if (obj == null) {
                    obj = zzexVar.zzdz();
                }
                zzbg zzk = zzbb.zzk(zzdg.zza(null, entry.getKey(), entry.getValue()));
                try {
                    zzdg.zza(zzk.zzae(), null, entry.getKey(), entry.getValue());
                    zzexVar.zza(obj, i2, zzk.zzad());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj;
    }

    private static void zza(int i, Object obj, zzfr zzfrVar) {
        if (obj instanceof String) {
            zzfrVar.zza(i, (String) obj);
        } else {
            zzfrVar.zza(i, (zzbb) obj);
        }
    }

    private static void zza(zzex zzexVar, Object obj, zzfr zzfrVar) {
        zzexVar.zza(zzexVar.zzq(obj), zzfrVar);
    }

    private final void zza(zzfr zzfrVar, int i, Object obj, int i2) {
        if (obj != null) {
            this.zzmz.zzl(zzae(i2));
            zzfrVar.zza(i, (zzdh) null, this.zzmz.zzh(obj));
        }
    }

    private final void zza(Object obj, Object obj2, int i) {
        long zzag = zzag(i) & 1048575;
        if (zza(obj2, i)) {
            Object zzo = zzfd.zzo(obj, zzag);
            Object zzo2 = zzfd.zzo(obj2, zzag);
            if (zzo != null && zzo2 != null) {
                zzo2 = zzci.zza(zzo, zzo2);
            } else if (zzo2 == null) {
                return;
            }
            zzfd.zza(obj, zzag, zzo2);
            zzb(obj, i);
        }
    }

    private final boolean zza(Object obj, int i) {
        if (!this.zzmq) {
            int zzah = zzah(i);
            return (zzfd.zzj(obj, (long) (zzah & 1048575)) & (1 << (zzah >>> 20))) != 0;
        }
        int zzag = zzag(i);
        long j = zzag & 1048575;
        switch ((zzag & 267386880) >>> 20) {
            case 0:
                return zzfd.zzn(obj, j) != 0.0d;
            case 1:
                return zzfd.zzm(obj, j) != 0.0f;
            case 2:
                return zzfd.zzk(obj, j) != 0;
            case 3:
                return zzfd.zzk(obj, j) != 0;
            case 4:
                return zzfd.zzj(obj, j) != 0;
            case 5:
                return zzfd.zzk(obj, j) != 0;
            case 6:
                return zzfd.zzj(obj, j) != 0;
            case 7:
                return zzfd.zzl(obj, j);
            case 8:
                Object zzo = zzfd.zzo(obj, j);
                if (zzo instanceof String) {
                    return !((String) zzo).isEmpty();
                }
                if (zzo instanceof zzbb) {
                    return !zzbb.zzfi.equals(zzo);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzfd.zzo(obj, j) != null;
            case 10:
                return !zzbb.zzfi.equals(zzfd.zzo(obj, j));
            case 11:
                return zzfd.zzj(obj, j) != 0;
            case 12:
                return zzfd.zzj(obj, j) != 0;
            case 13:
                return zzfd.zzj(obj, j) != 0;
            case 14:
                return zzfd.zzk(obj, j) != 0;
            case 15:
                return zzfd.zzj(obj, j) != 0;
            case 16:
                return zzfd.zzk(obj, j) != 0;
            case 17:
                return zzfd.zzo(obj, j) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zza(Object obj, int i, int i2) {
        return zzfd.zzj(obj, (long) (zzah(i2) & 1048575)) == i;
    }

    private final boolean zza(Object obj, int i, int i2, int i3) {
        return this.zzmq ? zza(obj, i) : (i2 & i3) != 0;
    }

    private static boolean zza(Object obj, int i, zzef zzefVar) {
        return zzefVar.zzo(zzfd.zzo(obj, i & 1048575));
    }

    private final zzef zzad(int i) {
        int i2 = (i / 4) << 1;
        zzef zzefVar = (zzef) this.zzmj[i2];
        if (zzefVar != null) {
            return zzefVar;
        }
        zzef zze = zzea.zzcm().zze((Class) this.zzmj[i2 + 1]);
        this.zzmj[i2] = zze;
        return zze;
    }

    private final Object zzae(int i) {
        return this.zzmj[(i / 4) << 1];
    }

    private final zzck zzaf(int i) {
        return (zzck) this.zzmj[((i / 4) << 1) + 1];
    }

    private final int zzag(int i) {
        return this.zzmi[i + 1];
    }

    private final int zzah(int i) {
        return this.zzmi[i + 2];
    }

    private final int zzai(int i) {
        int i2 = this.zzmk;
        if (i >= i2) {
            int i3 = this.zzmm;
            if (i < i3) {
                int i4 = (i - i2) << 2;
                if (this.zzmi[i4] == i) {
                    return i4;
                }
                return -1;
            }
            if (i <= this.zzml) {
                int i5 = i3 - i2;
                int length = (this.zzmi.length / 4) - 1;
                while (i5 <= length) {
                    int i6 = (length + i5) >>> 1;
                    int i7 = i6 << 2;
                    int i8 = this.zzmi[i7];
                    if (i == i8) {
                        return i7;
                    }
                    if (i < i8) {
                        length = i6 - 1;
                    } else {
                        i5 = i6 + 1;
                    }
                }
            }
        }
        return -1;
    }

    private final void zzb(Object obj, int i) {
        if (this.zzmq) {
            return;
        }
        int zzah = zzah(i);
        long j = zzah & 1048575;
        zzfd.zza(obj, j, zzfd.zzj(obj, j) | (1 << (zzah >>> 20)));
    }

    private final void zzb(Object obj, int i, int i2) {
        zzfd.zza(obj, zzah(i2) & 1048575, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzb(Object obj, zzfr zzfrVar) {
        Iterator it;
        Map.Entry entry;
        int length;
        int i;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        int i8;
        List list;
        boolean z6;
        if (this.zzmo) {
            zzby zza = this.zzmy.zza(obj);
            if (!zza.isEmpty()) {
                it = zza.iterator();
                entry = (Map.Entry) it.next();
                length = this.zzmi.length;
                Unsafe unsafe = zzmh;
                int i9 = -1;
                int i10 = 0;
                for (i = 0; i < length; i += 4) {
                    int zzag = zzag(i);
                    int[] iArr = this.zzmi;
                    int i11 = iArr[i];
                    int i12 = (267386880 & zzag) >>> 20;
                    if (this.zzmq || i12 > 17) {
                        i2 = 0;
                    } else {
                        int i13 = iArr[i + 2];
                        int i14 = i13 & 1048575;
                        if (i14 != i9) {
                            i10 = unsafe.getInt(obj, i14);
                            i9 = i14;
                        }
                        i2 = 1 << (i13 >>> 20);
                    }
                    while (entry != null && this.zzmy.zza(entry) <= i11) {
                        this.zzmy.zza(zzfrVar, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long j = zzag & 1048575;
                    switch (i12) {
                        case 0:
                            if ((i2 & i10) != 0) {
                                zzfrVar.zza(i11, zzfd.zzn(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if ((i2 & i10) != 0) {
                                zzfrVar.zza(i11, zzfd.zzm(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if ((i2 & i10) != 0) {
                                zzfrVar.zzi(i11, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if ((i2 & i10) != 0) {
                                zzfrVar.zza(i11, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if ((i2 & i10) != 0) {
                                zzfrVar.zzc(i11, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if ((i2 & i10) != 0) {
                                zzfrVar.zzc(i11, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if ((i2 & i10) != 0) {
                                zzfrVar.zzf(i11, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if ((i2 & i10) != 0) {
                                zzfrVar.zzb(i11, zzfd.zzl(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if ((i2 & i10) != 0) {
                                zza(i11, unsafe.getObject(obj, j), zzfrVar);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if ((i2 & i10) != 0) {
                                zzfrVar.zza(i11, unsafe.getObject(obj, j), zzad(i));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if ((i2 & i10) != 0) {
                                zzfrVar.zza(i11, (zzbb) unsafe.getObject(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if ((i2 & i10) != 0) {
                                zzfrVar.zzd(i11, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if ((i2 & i10) != 0) {
                                zzfrVar.zzn(i11, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if ((i2 & i10) != 0) {
                                zzfrVar.zzm(i11, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if ((i2 & i10) != 0) {
                                zzfrVar.zzj(i11, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if ((i2 & i10) != 0) {
                                zzfrVar.zze(i11, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if ((i2 & i10) != 0) {
                                zzfrVar.zzb(i11, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if ((i2 & i10) != 0) {
                                zzfrVar.zzb(i11, unsafe.getObject(obj, j), zzad(i));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            zzeh.zza(this.zzmi[i], (List) unsafe.getObject(obj, j), zzfrVar, false);
                            break;
                        case 19:
                            zzeh.zzb(this.zzmi[i], (List) unsafe.getObject(obj, j), zzfrVar, false);
                            break;
                        case 20:
                            zzeh.zzc(this.zzmi[i], (List) unsafe.getObject(obj, j), zzfrVar, false);
                            break;
                        case 21:
                            zzeh.zzd(this.zzmi[i], (List) unsafe.getObject(obj, j), zzfrVar, false);
                            break;
                        case 22:
                            zzeh.zzh(this.zzmi[i], (List) unsafe.getObject(obj, j), zzfrVar, false);
                            break;
                        case 23:
                            zzeh.zzf(this.zzmi[i], (List) unsafe.getObject(obj, j), zzfrVar, false);
                            break;
                        case 24:
                            zzeh.zzk(this.zzmi[i], (List) unsafe.getObject(obj, j), zzfrVar, false);
                            break;
                        case 25:
                            zzeh.zzn(this.zzmi[i], (List) unsafe.getObject(obj, j), zzfrVar, false);
                            break;
                        case 26:
                            zzeh.zza(this.zzmi[i], (List) unsafe.getObject(obj, j), zzfrVar);
                            break;
                        case 27:
                            zzeh.zza(this.zzmi[i], (List) unsafe.getObject(obj, j), zzfrVar, zzad(i));
                            break;
                        case 28:
                            zzeh.zzb(this.zzmi[i], (List) unsafe.getObject(obj, j), zzfrVar);
                            break;
                        case 29:
                            z = false;
                            i3 = this.zzmi[i];
                            zzeh.zzi(i3, (List) unsafe.getObject(obj, j), zzfrVar, z);
                            break;
                        case 30:
                            z2 = false;
                            i4 = this.zzmi[i];
                            zzeh.zzm(i4, (List) unsafe.getObject(obj, j), zzfrVar, z2);
                            break;
                        case 31:
                            z3 = false;
                            i5 = this.zzmi[i];
                            zzeh.zzl(i5, (List) unsafe.getObject(obj, j), zzfrVar, z3);
                            break;
                        case 32:
                            z4 = false;
                            i6 = this.zzmi[i];
                            zzeh.zzg(i6, (List) unsafe.getObject(obj, j), zzfrVar, z4);
                            break;
                        case 33:
                            z5 = false;
                            i7 = this.zzmi[i];
                            zzeh.zzj(i7, (List) unsafe.getObject(obj, j), zzfrVar, z5);
                            break;
                        case 34:
                            i8 = this.zzmi[i];
                            list = (List) unsafe.getObject(obj, j);
                            z6 = false;
                            zzeh.zze(i8, list, zzfrVar, z6);
                            break;
                        case 35:
                            zzeh.zza(this.zzmi[i], (List) unsafe.getObject(obj, j), zzfrVar, true);
                            break;
                        case 36:
                            zzeh.zzb(this.zzmi[i], (List) unsafe.getObject(obj, j), zzfrVar, true);
                            break;
                        case 37:
                            zzeh.zzc(this.zzmi[i], (List) unsafe.getObject(obj, j), zzfrVar, true);
                            break;
                        case 38:
                            zzeh.zzd(this.zzmi[i], (List) unsafe.getObject(obj, j), zzfrVar, true);
                            break;
                        case 39:
                            zzeh.zzh(this.zzmi[i], (List) unsafe.getObject(obj, j), zzfrVar, true);
                            break;
                        case 40:
                            zzeh.zzf(this.zzmi[i], (List) unsafe.getObject(obj, j), zzfrVar, true);
                            break;
                        case 41:
                            zzeh.zzk(this.zzmi[i], (List) unsafe.getObject(obj, j), zzfrVar, true);
                            break;
                        case 42:
                            zzeh.zzn(this.zzmi[i], (List) unsafe.getObject(obj, j), zzfrVar, true);
                            break;
                        case 43:
                            z = true;
                            i3 = this.zzmi[i];
                            zzeh.zzi(i3, (List) unsafe.getObject(obj, j), zzfrVar, z);
                            break;
                        case 44:
                            z2 = true;
                            i4 = this.zzmi[i];
                            zzeh.zzm(i4, (List) unsafe.getObject(obj, j), zzfrVar, z2);
                            break;
                        case 45:
                            z3 = true;
                            i5 = this.zzmi[i];
                            zzeh.zzl(i5, (List) unsafe.getObject(obj, j), zzfrVar, z3);
                            break;
                        case 46:
                            z4 = true;
                            i6 = this.zzmi[i];
                            zzeh.zzg(i6, (List) unsafe.getObject(obj, j), zzfrVar, z4);
                            break;
                        case 47:
                            z5 = true;
                            i7 = this.zzmi[i];
                            zzeh.zzj(i7, (List) unsafe.getObject(obj, j), zzfrVar, z5);
                            break;
                        case 48:
                            i8 = this.zzmi[i];
                            list = (List) unsafe.getObject(obj, j);
                            z6 = true;
                            zzeh.zze(i8, list, zzfrVar, z6);
                            break;
                        case 49:
                            zzeh.zzb(this.zzmi[i], (List) unsafe.getObject(obj, j), zzfrVar, zzad(i));
                            break;
                        case 50:
                            zza(zzfrVar, i11, unsafe.getObject(obj, j), i);
                            break;
                        case 51:
                            if (zza(obj, i11, i)) {
                                zzfrVar.zza(i11, zze(obj, j));
                            }
                            break;
                        case 52:
                            if (zza(obj, i11, i)) {
                                zzfrVar.zza(i11, zzf(obj, j));
                            }
                            break;
                        case 53:
                            if (zza(obj, i11, i)) {
                                zzfrVar.zzi(i11, zzh(obj, j));
                            }
                            break;
                        case 54:
                            if (zza(obj, i11, i)) {
                                zzfrVar.zza(i11, zzh(obj, j));
                            }
                            break;
                        case 55:
                            if (zza(obj, i11, i)) {
                                zzfrVar.zzc(i11, zzg(obj, j));
                            }
                            break;
                        case 56:
                            if (zza(obj, i11, i)) {
                                zzfrVar.zzc(i11, zzh(obj, j));
                            }
                            break;
                        case 57:
                            if (zza(obj, i11, i)) {
                                zzfrVar.zzf(i11, zzg(obj, j));
                            }
                            break;
                        case 58:
                            if (zza(obj, i11, i)) {
                                zzfrVar.zzb(i11, zzi(obj, j));
                            }
                            break;
                        case 59:
                            if (zza(obj, i11, i)) {
                                zza(i11, unsafe.getObject(obj, j), zzfrVar);
                            }
                            break;
                        case 60:
                            if (zza(obj, i11, i)) {
                                zzfrVar.zza(i11, unsafe.getObject(obj, j), zzad(i));
                            }
                            break;
                        case 61:
                            if (zza(obj, i11, i)) {
                                zzfrVar.zza(i11, (zzbb) unsafe.getObject(obj, j));
                            }
                            break;
                        case 62:
                            if (zza(obj, i11, i)) {
                                zzfrVar.zzd(i11, zzg(obj, j));
                            }
                            break;
                        case 63:
                            if (zza(obj, i11, i)) {
                                zzfrVar.zzn(i11, zzg(obj, j));
                            }
                            break;
                        case 64:
                            if (zza(obj, i11, i)) {
                                zzfrVar.zzm(i11, zzg(obj, j));
                            }
                            break;
                        case 65:
                            if (zza(obj, i11, i)) {
                                zzfrVar.zzj(i11, zzh(obj, j));
                            }
                            break;
                        case 66:
                            if (zza(obj, i11, i)) {
                                zzfrVar.zze(i11, zzg(obj, j));
                            }
                            break;
                        case 67:
                            if (zza(obj, i11, i)) {
                                zzfrVar.zzb(i11, zzh(obj, j));
                            }
                            break;
                        case 68:
                            if (zza(obj, i11, i)) {
                                zzfrVar.zzb(i11, unsafe.getObject(obj, j), zzad(i));
                            }
                            break;
                    }
                }
                while (entry != null) {
                    this.zzmy.zza(zzfrVar, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                zza(this.zzmx, obj, zzfrVar);
            }
        }
        it = null;
        entry = null;
        length = this.zzmi.length;
        Unsafe unsafe2 = zzmh;
        int i92 = -1;
        int i102 = 0;
        while (i < length) {
        }
        while (entry != null) {
        }
        zza(this.zzmx, obj, zzfrVar);
    }

    private final void zzb(Object obj, Object obj2, int i) {
        int zzag = zzag(i);
        int i2 = this.zzmi[i];
        long j = zzag & 1048575;
        if (zza(obj2, i2, i)) {
            Object zzo = zzfd.zzo(obj, j);
            Object zzo2 = zzfd.zzo(obj2, j);
            if (zzo != null && zzo2 != null) {
                zzo2 = zzci.zza(zzo, zzo2);
            } else if (zzo2 == null) {
                return;
            }
            zzfd.zza(obj, j, zzo2);
            zzb(obj, i2, i);
        }
    }

    private final boolean zzc(Object obj, Object obj2, int i) {
        return zza(obj, i) == zza(obj2, i);
    }

    private static List zzd(Object obj, long j) {
        return (List) zzfd.zzo(obj, j);
    }

    private static double zze(Object obj, long j) {
        return ((Double) zzfd.zzo(obj, j)).doubleValue();
    }

    private static float zzf(Object obj, long j) {
        return ((Float) zzfd.zzo(obj, j)).floatValue();
    }

    private static int zzg(Object obj, long j) {
        return ((Integer) zzfd.zzo(obj, j)).intValue();
    }

    private static long zzh(Object obj, long j) {
        return ((Long) zzfd.zzo(obj, j)).longValue();
    }

    private static boolean zzi(Object obj, long j) {
        return ((Boolean) zzfd.zzo(obj, j)).booleanValue();
    }

    private static zzey zzn(Object obj) {
        zzcg zzcgVar = (zzcg) obj;
        zzey zzeyVar = zzcgVar.zzjp;
        if (zzeyVar != zzey.zzea()) {
            return zzeyVar;
        }
        zzey zzeb = zzey.zzeb();
        zzcgVar.zzjp = zzeb;
        return zzeb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if (com.google.android.gms.internal.clearcut.zzeh.zzd(com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6), com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        if (com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
    
        if (com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
    
        if (com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c7, code lost:
    
        if (com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dd, code lost:
    
        if (com.google.android.gms.internal.clearcut.zzeh.zzd(com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6), com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f3, code lost:
    
        if (com.google.android.gms.internal.clearcut.zzeh.zzd(com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6), com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0109, code lost:
    
        if (com.google.android.gms.internal.clearcut.zzeh.zzd(com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6), com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011b, code lost:
    
        if (com.google.android.gms.internal.clearcut.zzfd.zzl(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzl(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012d, code lost:
    
        if (com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0141, code lost:
    
        if (com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0153, code lost:
    
        if (com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0167, code lost:
    
        if (com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017b, code lost:
    
        if (com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018d, code lost:
    
        if (com.google.android.gms.internal.clearcut.zzfd.zzj(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzj(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a1, code lost:
    
        if (com.google.android.gms.internal.clearcut.zzfd.zzk(r10, r6) == com.google.android.gms.internal.clearcut.zzfd.zzk(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.clearcut.zzeh.zzd(com.google.android.gms.internal.clearcut.zzfd.zzo(r10, r6), com.google.android.gms.internal.clearcut.zzfd.zzo(r11, r6)) != false) goto L104;
     */
    @Override // com.google.android.gms.internal.clearcut.zzef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj, Object obj2) {
        int length = this.zzmi.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                if (!this.zzmx.zzq(obj).equals(this.zzmx.zzq(obj2))) {
                    return false;
                }
                if (this.zzmo) {
                    return this.zzmy.zza(obj).equals(this.zzmy.zza(obj2));
                }
                return true;
            }
            int zzag = zzag(i);
            long j = zzag & 1048575;
            switch ((zzag & 267386880) >>> 20) {
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
                case 50:
                    z = zzeh.zzd(zzfd.zzo(obj, j), zzfd.zzo(obj2, j));
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
                    long zzah = zzah(i) & 1048575;
                    if (zzfd.zzj(obj, zzah) == zzfd.zzj(obj2, zzah)) {
                        break;
                    }
                    z = false;
                    break;
            }
            if (!z) {
                return false;
            }
            i += 4;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f2, code lost:
    
        if (r3 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f4, code lost:
    
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f8, code lost:
    
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0110, code lost:
    
        if (r3 != null) goto L69;
     */
    @Override // com.google.android.gms.internal.clearcut.zzef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int hashCode(Object obj) {
        int i;
        double zzn;
        float zzm;
        boolean zzl;
        Object zzo;
        int zzj;
        long zzk;
        Object zzo2;
        int length = this.zzmi.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 4) {
            int zzag = zzag(i3);
            int i4 = this.zzmi[i3];
            long j = 1048575 & zzag;
            int i5 = 37;
            switch ((zzag & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    zzn = zzfd.zzn(obj, j);
                    zzk = Double.doubleToLongBits(zzn);
                    zzj = zzci.zzl(zzk);
                    i2 = i + zzj;
                    break;
                case 1:
                    i = i2 * 53;
                    zzm = zzfd.zzm(obj, j);
                    zzj = Float.floatToIntBits(zzm);
                    i2 = i + zzj;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i = i2 * 53;
                    zzk = zzfd.zzk(obj, j);
                    zzj = zzci.zzl(zzk);
                    i2 = i + zzj;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i = i2 * 53;
                    zzj = zzfd.zzj(obj, j);
                    i2 = i + zzj;
                    break;
                case 7:
                    i = i2 * 53;
                    zzl = zzfd.zzl(obj, j);
                    zzj = zzci.zzc(zzl);
                    i2 = i + zzj;
                    break;
                case 8:
                    i = i2 * 53;
                    zzj = ((String) zzfd.zzo(obj, j)).hashCode();
                    i2 = i + zzj;
                    break;
                case 9:
                    zzo = zzfd.zzo(obj, j);
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
                    i = i2 * 53;
                    zzo2 = zzfd.zzo(obj, j);
                    zzj = zzo2.hashCode();
                    i2 = i + zzj;
                    break;
                case 17:
                    zzo = zzfd.zzo(obj, j);
                    break;
                case 51:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zzn = zze(obj, j);
                        zzk = Double.doubleToLongBits(zzn);
                        zzj = zzci.zzl(zzk);
                        i2 = i + zzj;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zzm = zzf(obj, j);
                        zzj = Float.floatToIntBits(zzm);
                        i2 = i + zzj;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (!zza(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzk = zzh(obj, j);
                    zzj = zzci.zzl(zzk);
                    i2 = i + zzj;
                    break;
                case 54:
                    if (!zza(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzk = zzh(obj, j);
                    zzj = zzci.zzl(zzk);
                    i2 = i + zzj;
                    break;
                case 55:
                    if (!zza(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzj = zzg(obj, j);
                    i2 = i + zzj;
                    break;
                case 56:
                    if (!zza(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzk = zzh(obj, j);
                    zzj = zzci.zzl(zzk);
                    i2 = i + zzj;
                    break;
                case 57:
                    if (!zza(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzj = zzg(obj, j);
                    i2 = i + zzj;
                    break;
                case 58:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zzl = zzi(obj, j);
                        zzj = zzci.zzc(zzl);
                        i2 = i + zzj;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zza(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzj = ((String) zzfd.zzo(obj, j)).hashCode();
                    i2 = i + zzj;
                    break;
                case 60:
                    if (!zza(obj, i4, i3)) {
                        break;
                    }
                    zzo2 = zzfd.zzo(obj, j);
                    i = i2 * 53;
                    zzj = zzo2.hashCode();
                    i2 = i + zzj;
                    break;
                case 61:
                    if (!zza(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzo2 = zzfd.zzo(obj, j);
                    zzj = zzo2.hashCode();
                    i2 = i + zzj;
                    break;
                case 62:
                    if (!zza(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzj = zzg(obj, j);
                    i2 = i + zzj;
                    break;
                case 63:
                    if (!zza(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzj = zzg(obj, j);
                    i2 = i + zzj;
                    break;
                case 64:
                    if (!zza(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzj = zzg(obj, j);
                    i2 = i + zzj;
                    break;
                case 65:
                    if (!zza(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzk = zzh(obj, j);
                    zzj = zzci.zzl(zzk);
                    i2 = i + zzj;
                    break;
                case 66:
                    if (!zza(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzj = zzg(obj, j);
                    i2 = i + zzj;
                    break;
                case 67:
                    if (!zza(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzk = zzh(obj, j);
                    zzj = zzci.zzl(zzk);
                    i2 = i + zzj;
                    break;
                case 68:
                    if (!zza(obj, i4, i3)) {
                        break;
                    }
                    zzo2 = zzfd.zzo(obj, j);
                    i = i2 * 53;
                    zzj = zzo2.hashCode();
                    i2 = i + zzj;
                    break;
            }
        }
        int hashCode = (i2 * 53) + this.zzmx.zzq(obj).hashCode();
        return this.zzmo ? (hashCode * 53) + this.zzmy.zza(obj).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final Object newInstance() {
        return this.zzmv.newInstance(this.zzmn);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0986  */
    @Override // com.google.android.gms.internal.clearcut.zzef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Object obj, zzfr zzfrVar) {
        Iterator it;
        Map.Entry entry;
        int length;
        int i;
        double zzn;
        float zzm;
        long zzk;
        long zzk2;
        int zzj;
        long zzk3;
        int zzj2;
        boolean zzl;
        int zzj3;
        int zzj4;
        int zzj5;
        long zzk4;
        int zzj6;
        long zzk5;
        Iterator it2;
        Map.Entry entry2;
        int length2;
        double zzn2;
        float zzm2;
        long zzk6;
        long zzk7;
        int zzj7;
        long zzk8;
        int zzj8;
        boolean zzl2;
        int zzj9;
        int zzj10;
        int zzj11;
        long zzk9;
        int zzj12;
        long zzk10;
        if (zzfrVar.zzaj() == zzcg.zzg.zzkp) {
            zza(this.zzmx, obj, zzfrVar);
            if (this.zzmo) {
                zzby zza = this.zzmy.zza(obj);
                if (!zza.isEmpty()) {
                    it2 = zza.descendingIterator();
                    entry2 = (Map.Entry) it2.next();
                    for (length2 = this.zzmi.length - 4; length2 >= 0; length2 -= 4) {
                        int zzag = zzag(length2);
                        int i2 = this.zzmi[length2];
                        while (entry2 != null && this.zzmy.zza(entry2) > i2) {
                            this.zzmy.zza(zzfrVar, entry2);
                            entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                        }
                        switch ((zzag & 267386880) >>> 20) {
                            case 0:
                                if (zza(obj, length2)) {
                                    zzn2 = zzfd.zzn(obj, zzag & 1048575);
                                    zzfrVar.zza(i2, zzn2);
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (zza(obj, length2)) {
                                    zzm2 = zzfd.zzm(obj, zzag & 1048575);
                                    zzfrVar.zza(i2, zzm2);
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (zza(obj, length2)) {
                                    zzk6 = zzfd.zzk(obj, zzag & 1048575);
                                    zzfrVar.zzi(i2, zzk6);
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (zza(obj, length2)) {
                                    zzk7 = zzfd.zzk(obj, zzag & 1048575);
                                    zzfrVar.zza(i2, zzk7);
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (zza(obj, length2)) {
                                    zzj7 = zzfd.zzj(obj, zzag & 1048575);
                                    zzfrVar.zzc(i2, zzj7);
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (zza(obj, length2)) {
                                    zzk8 = zzfd.zzk(obj, zzag & 1048575);
                                    zzfrVar.zzc(i2, zzk8);
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (zza(obj, length2)) {
                                    zzj8 = zzfd.zzj(obj, zzag & 1048575);
                                    zzfrVar.zzf(i2, zzj8);
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (zza(obj, length2)) {
                                    zzl2 = zzfd.zzl(obj, zzag & 1048575);
                                    zzfrVar.zzb(i2, zzl2);
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (!zza(obj, length2)) {
                                    break;
                                }
                                zza(i2, zzfd.zzo(obj, zzag & 1048575), zzfrVar);
                                break;
                            case 9:
                                if (!zza(obj, length2)) {
                                    break;
                                }
                                zzfrVar.zza(i2, zzfd.zzo(obj, zzag & 1048575), zzad(length2));
                                break;
                            case 10:
                                if (!zza(obj, length2)) {
                                    break;
                                }
                                zzfrVar.zza(i2, (zzbb) zzfd.zzo(obj, zzag & 1048575));
                                break;
                            case 11:
                                if (zza(obj, length2)) {
                                    zzj9 = zzfd.zzj(obj, zzag & 1048575);
                                    zzfrVar.zzd(i2, zzj9);
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (zza(obj, length2)) {
                                    zzj10 = zzfd.zzj(obj, zzag & 1048575);
                                    zzfrVar.zzn(i2, zzj10);
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (zza(obj, length2)) {
                                    zzj11 = zzfd.zzj(obj, zzag & 1048575);
                                    zzfrVar.zzm(i2, zzj11);
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (zza(obj, length2)) {
                                    zzk9 = zzfd.zzk(obj, zzag & 1048575);
                                    zzfrVar.zzj(i2, zzk9);
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (zza(obj, length2)) {
                                    zzj12 = zzfd.zzj(obj, zzag & 1048575);
                                    zzfrVar.zze(i2, zzj12);
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (zza(obj, length2)) {
                                    zzk10 = zzfd.zzk(obj, zzag & 1048575);
                                    zzfrVar.zzb(i2, zzk10);
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (!zza(obj, length2)) {
                                    break;
                                }
                                zzfrVar.zzb(i2, zzfd.zzo(obj, zzag & 1048575), zzad(length2));
                                break;
                            case 18:
                                zzeh.zza(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, false);
                                break;
                            case 19:
                                zzeh.zzb(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, false);
                                break;
                            case 20:
                                zzeh.zzc(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, false);
                                break;
                            case 21:
                                zzeh.zzd(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, false);
                                break;
                            case 22:
                                zzeh.zzh(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, false);
                                break;
                            case 23:
                                zzeh.zzf(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, false);
                                break;
                            case 24:
                                zzeh.zzk(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, false);
                                break;
                            case 25:
                                zzeh.zzn(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, false);
                                break;
                            case 26:
                                zzeh.zza(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar);
                                break;
                            case 27:
                                zzeh.zza(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, zzad(length2));
                                break;
                            case 28:
                                zzeh.zzb(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar);
                                break;
                            case 29:
                                zzeh.zzi(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, false);
                                break;
                            case 30:
                                zzeh.zzm(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, false);
                                break;
                            case 31:
                                zzeh.zzl(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, false);
                                break;
                            case 32:
                                zzeh.zzg(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, false);
                                break;
                            case 33:
                                zzeh.zzj(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, false);
                                break;
                            case 34:
                                zzeh.zze(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, false);
                                break;
                            case 35:
                                zzeh.zza(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, true);
                                break;
                            case 36:
                                zzeh.zzb(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, true);
                                break;
                            case 37:
                                zzeh.zzc(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, true);
                                break;
                            case 38:
                                zzeh.zzd(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, true);
                                break;
                            case 39:
                                zzeh.zzh(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, true);
                                break;
                            case 40:
                                zzeh.zzf(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, true);
                                break;
                            case 41:
                                zzeh.zzk(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, true);
                                break;
                            case 42:
                                zzeh.zzn(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, true);
                                break;
                            case 43:
                                zzeh.zzi(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, true);
                                break;
                            case 44:
                                zzeh.zzm(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, true);
                                break;
                            case 45:
                                zzeh.zzl(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, true);
                                break;
                            case 46:
                                zzeh.zzg(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, true);
                                break;
                            case 47:
                                zzeh.zzj(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, true);
                                break;
                            case 48:
                                zzeh.zze(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, true);
                                break;
                            case 49:
                                zzeh.zzb(this.zzmi[length2], (List) zzfd.zzo(obj, zzag & 1048575), zzfrVar, zzad(length2));
                                break;
                            case 50:
                                zza(zzfrVar, i2, zzfd.zzo(obj, zzag & 1048575), length2);
                                break;
                            case 51:
                                if (zza(obj, i2, length2)) {
                                    zzn2 = zze(obj, zzag & 1048575);
                                    zzfrVar.zza(i2, zzn2);
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (zza(obj, i2, length2)) {
                                    zzm2 = zzf(obj, zzag & 1048575);
                                    zzfrVar.zza(i2, zzm2);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (zza(obj, i2, length2)) {
                                    zzk6 = zzh(obj, zzag & 1048575);
                                    zzfrVar.zzi(i2, zzk6);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (zza(obj, i2, length2)) {
                                    zzk7 = zzh(obj, zzag & 1048575);
                                    zzfrVar.zza(i2, zzk7);
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (zza(obj, i2, length2)) {
                                    zzj7 = zzg(obj, zzag & 1048575);
                                    zzfrVar.zzc(i2, zzj7);
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (zza(obj, i2, length2)) {
                                    zzk8 = zzh(obj, zzag & 1048575);
                                    zzfrVar.zzc(i2, zzk8);
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (zza(obj, i2, length2)) {
                                    zzj8 = zzg(obj, zzag & 1048575);
                                    zzfrVar.zzf(i2, zzj8);
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (zza(obj, i2, length2)) {
                                    zzl2 = zzi(obj, zzag & 1048575);
                                    zzfrVar.zzb(i2, zzl2);
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (!zza(obj, i2, length2)) {
                                    break;
                                }
                                zza(i2, zzfd.zzo(obj, zzag & 1048575), zzfrVar);
                                break;
                            case 60:
                                if (!zza(obj, i2, length2)) {
                                    break;
                                }
                                zzfrVar.zza(i2, zzfd.zzo(obj, zzag & 1048575), zzad(length2));
                                break;
                            case 61:
                                if (!zza(obj, i2, length2)) {
                                    break;
                                }
                                zzfrVar.zza(i2, (zzbb) zzfd.zzo(obj, zzag & 1048575));
                                break;
                            case 62:
                                if (zza(obj, i2, length2)) {
                                    zzj9 = zzg(obj, zzag & 1048575);
                                    zzfrVar.zzd(i2, zzj9);
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (zza(obj, i2, length2)) {
                                    zzj10 = zzg(obj, zzag & 1048575);
                                    zzfrVar.zzn(i2, zzj10);
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (zza(obj, i2, length2)) {
                                    zzj11 = zzg(obj, zzag & 1048575);
                                    zzfrVar.zzm(i2, zzj11);
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (zza(obj, i2, length2)) {
                                    zzk9 = zzh(obj, zzag & 1048575);
                                    zzfrVar.zzj(i2, zzk9);
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (zza(obj, i2, length2)) {
                                    zzj12 = zzg(obj, zzag & 1048575);
                                    zzfrVar.zze(i2, zzj12);
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (zza(obj, i2, length2)) {
                                    zzk10 = zzh(obj, zzag & 1048575);
                                    zzfrVar.zzb(i2, zzk10);
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (!zza(obj, i2, length2)) {
                                    break;
                                }
                                zzfrVar.zzb(i2, zzfd.zzo(obj, zzag & 1048575), zzad(length2));
                                break;
                        }
                    }
                    while (entry2 != null) {
                        this.zzmy.zza(zzfrVar, entry2);
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
        if (!this.zzmq) {
            zzb(obj, zzfrVar);
            return;
        }
        if (this.zzmo) {
            zzby zza2 = this.zzmy.zza(obj);
            if (!zza2.isEmpty()) {
                it = zza2.iterator();
                entry = (Map.Entry) it.next();
                length = this.zzmi.length;
                for (i = 0; i < length; i += 4) {
                    int zzag2 = zzag(i);
                    int i3 = this.zzmi[i];
                    while (entry != null && this.zzmy.zza(entry) <= i3) {
                        this.zzmy.zza(zzfrVar, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    switch ((zzag2 & 267386880) >>> 20) {
                        case 0:
                            if (zza(obj, i)) {
                                zzn = zzfd.zzn(obj, zzag2 & 1048575);
                                zzfrVar.zza(i3, zzn);
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (zza(obj, i)) {
                                zzm = zzfd.zzm(obj, zzag2 & 1048575);
                                zzfrVar.zza(i3, zzm);
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (zza(obj, i)) {
                                zzk = zzfd.zzk(obj, zzag2 & 1048575);
                                zzfrVar.zzi(i3, zzk);
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (zza(obj, i)) {
                                zzk2 = zzfd.zzk(obj, zzag2 & 1048575);
                                zzfrVar.zza(i3, zzk2);
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (zza(obj, i)) {
                                zzj = zzfd.zzj(obj, zzag2 & 1048575);
                                zzfrVar.zzc(i3, zzj);
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (zza(obj, i)) {
                                zzk3 = zzfd.zzk(obj, zzag2 & 1048575);
                                zzfrVar.zzc(i3, zzk3);
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (zza(obj, i)) {
                                zzj2 = zzfd.zzj(obj, zzag2 & 1048575);
                                zzfrVar.zzf(i3, zzj2);
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (zza(obj, i)) {
                                zzl = zzfd.zzl(obj, zzag2 & 1048575);
                                zzfrVar.zzb(i3, zzl);
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (!zza(obj, i)) {
                                break;
                            }
                            zza(i3, zzfd.zzo(obj, zzag2 & 1048575), zzfrVar);
                            break;
                        case 9:
                            if (!zza(obj, i)) {
                                break;
                            }
                            zzfrVar.zza(i3, zzfd.zzo(obj, zzag2 & 1048575), zzad(i));
                            break;
                        case 10:
                            if (!zza(obj, i)) {
                                break;
                            }
                            zzfrVar.zza(i3, (zzbb) zzfd.zzo(obj, zzag2 & 1048575));
                            break;
                        case 11:
                            if (zza(obj, i)) {
                                zzj3 = zzfd.zzj(obj, zzag2 & 1048575);
                                zzfrVar.zzd(i3, zzj3);
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (zza(obj, i)) {
                                zzj4 = zzfd.zzj(obj, zzag2 & 1048575);
                                zzfrVar.zzn(i3, zzj4);
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (zza(obj, i)) {
                                zzj5 = zzfd.zzj(obj, zzag2 & 1048575);
                                zzfrVar.zzm(i3, zzj5);
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (zza(obj, i)) {
                                zzk4 = zzfd.zzk(obj, zzag2 & 1048575);
                                zzfrVar.zzj(i3, zzk4);
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (zza(obj, i)) {
                                zzj6 = zzfd.zzj(obj, zzag2 & 1048575);
                                zzfrVar.zze(i3, zzj6);
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (zza(obj, i)) {
                                zzk5 = zzfd.zzk(obj, zzag2 & 1048575);
                                zzfrVar.zzb(i3, zzk5);
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (!zza(obj, i)) {
                                break;
                            }
                            zzfrVar.zzb(i3, zzfd.zzo(obj, zzag2 & 1048575), zzad(i));
                            break;
                        case 18:
                            zzeh.zza(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, false);
                            break;
                        case 19:
                            zzeh.zzb(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, false);
                            break;
                        case 20:
                            zzeh.zzc(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, false);
                            break;
                        case 21:
                            zzeh.zzd(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, false);
                            break;
                        case 22:
                            zzeh.zzh(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, false);
                            break;
                        case 23:
                            zzeh.zzf(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, false);
                            break;
                        case 24:
                            zzeh.zzk(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, false);
                            break;
                        case 25:
                            zzeh.zzn(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, false);
                            break;
                        case 26:
                            zzeh.zza(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar);
                            break;
                        case 27:
                            zzeh.zza(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, zzad(i));
                            break;
                        case 28:
                            zzeh.zzb(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar);
                            break;
                        case 29:
                            zzeh.zzi(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, false);
                            break;
                        case 30:
                            zzeh.zzm(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, false);
                            break;
                        case 31:
                            zzeh.zzl(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, false);
                            break;
                        case 32:
                            zzeh.zzg(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, false);
                            break;
                        case 33:
                            zzeh.zzj(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, false);
                            break;
                        case 34:
                            zzeh.zze(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, false);
                            break;
                        case 35:
                            zzeh.zza(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, true);
                            break;
                        case 36:
                            zzeh.zzb(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, true);
                            break;
                        case 37:
                            zzeh.zzc(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, true);
                            break;
                        case 38:
                            zzeh.zzd(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, true);
                            break;
                        case 39:
                            zzeh.zzh(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, true);
                            break;
                        case 40:
                            zzeh.zzf(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, true);
                            break;
                        case 41:
                            zzeh.zzk(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, true);
                            break;
                        case 42:
                            zzeh.zzn(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, true);
                            break;
                        case 43:
                            zzeh.zzi(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, true);
                            break;
                        case 44:
                            zzeh.zzm(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, true);
                            break;
                        case 45:
                            zzeh.zzl(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, true);
                            break;
                        case 46:
                            zzeh.zzg(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, true);
                            break;
                        case 47:
                            zzeh.zzj(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, true);
                            break;
                        case 48:
                            zzeh.zze(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, true);
                            break;
                        case 49:
                            zzeh.zzb(this.zzmi[i], (List) zzfd.zzo(obj, zzag2 & 1048575), zzfrVar, zzad(i));
                            break;
                        case 50:
                            zza(zzfrVar, i3, zzfd.zzo(obj, zzag2 & 1048575), i);
                            break;
                        case 51:
                            if (zza(obj, i3, i)) {
                                zzn = zze(obj, zzag2 & 1048575);
                                zzfrVar.zza(i3, zzn);
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (zza(obj, i3, i)) {
                                zzm = zzf(obj, zzag2 & 1048575);
                                zzfrVar.zza(i3, zzm);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (zza(obj, i3, i)) {
                                zzk = zzh(obj, zzag2 & 1048575);
                                zzfrVar.zzi(i3, zzk);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (zza(obj, i3, i)) {
                                zzk2 = zzh(obj, zzag2 & 1048575);
                                zzfrVar.zza(i3, zzk2);
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (zza(obj, i3, i)) {
                                zzj = zzg(obj, zzag2 & 1048575);
                                zzfrVar.zzc(i3, zzj);
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (zza(obj, i3, i)) {
                                zzk3 = zzh(obj, zzag2 & 1048575);
                                zzfrVar.zzc(i3, zzk3);
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (zza(obj, i3, i)) {
                                zzj2 = zzg(obj, zzag2 & 1048575);
                                zzfrVar.zzf(i3, zzj2);
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (zza(obj, i3, i)) {
                                zzl = zzi(obj, zzag2 & 1048575);
                                zzfrVar.zzb(i3, zzl);
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (!zza(obj, i3, i)) {
                                break;
                            }
                            zza(i3, zzfd.zzo(obj, zzag2 & 1048575), zzfrVar);
                            break;
                        case 60:
                            if (!zza(obj, i3, i)) {
                                break;
                            }
                            zzfrVar.zza(i3, zzfd.zzo(obj, zzag2 & 1048575), zzad(i));
                            break;
                        case 61:
                            if (!zza(obj, i3, i)) {
                                break;
                            }
                            zzfrVar.zza(i3, (zzbb) zzfd.zzo(obj, zzag2 & 1048575));
                            break;
                        case 62:
                            if (zza(obj, i3, i)) {
                                zzj3 = zzg(obj, zzag2 & 1048575);
                                zzfrVar.zzd(i3, zzj3);
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (zza(obj, i3, i)) {
                                zzj4 = zzg(obj, zzag2 & 1048575);
                                zzfrVar.zzn(i3, zzj4);
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (zza(obj, i3, i)) {
                                zzj5 = zzg(obj, zzag2 & 1048575);
                                zzfrVar.zzm(i3, zzj5);
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (zza(obj, i3, i)) {
                                zzk4 = zzh(obj, zzag2 & 1048575);
                                zzfrVar.zzj(i3, zzk4);
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (zza(obj, i3, i)) {
                                zzj6 = zzg(obj, zzag2 & 1048575);
                                zzfrVar.zze(i3, zzj6);
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (zza(obj, i3, i)) {
                                zzk5 = zzh(obj, zzag2 & 1048575);
                                zzfrVar.zzb(i3, zzk5);
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (!zza(obj, i3, i)) {
                                break;
                            }
                            zzfrVar.zzb(i3, zzfd.zzo(obj, zzag2 & 1048575), zzad(i));
                            break;
                    }
                }
                while (entry != null) {
                    this.zzmy.zza(zzfrVar, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                zza(this.zzmx, obj, zzfrVar);
            }
        }
        it = null;
        entry = null;
        length = this.zzmi.length;
        while (i < length) {
        }
        while (entry != null) {
        }
        zza(this.zzmx, obj, zzfrVar);
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final void zza(Object obj, byte[] bArr, int i, int i2, zzay zzayVar) {
        Unsafe unsafe;
        zzay zzayVar2;
        Object obj2;
        int i3;
        int i4;
        byte[] bArr2;
        int i5;
        int i6;
        int zza;
        Unsafe unsafe2;
        Object obj3;
        Object zza2;
        Object obj4;
        int i7;
        zzds zzdsVar = this;
        byte[] bArr3 = bArr;
        int i8 = i2;
        zzay zzayVar3 = zzayVar;
        if (!zzdsVar.zzmq) {
            zza(obj, bArr, i, i8, 0, zzayVar);
            return;
        }
        Unsafe unsafe3 = zzmh;
        int i9 = i;
        while (i9 < i8) {
            int i10 = i9 + 1;
            int i11 = bArr3[i9];
            if (i11 < 0) {
                i10 = zzax.zza(i11, bArr3, i10, zzayVar3);
                i11 = zzayVar3.zzfd;
            }
            int i12 = i11;
            int i13 = i10;
            int i14 = i12 >>> 3;
            int i15 = i12 & 7;
            int zzai = zzdsVar.zzai(i14);
            if (zzai >= 0) {
                int i16 = zzdsVar.zzmi[zzai + 1];
                int i17 = (267386880 & i16) >>> 20;
                long j = 1048575 & i16;
                if (i17 <= 17) {
                    switch (i17) {
                        case 0:
                            unsafe = unsafe3;
                            if (i15 == 1) {
                                zzfd.zza(obj, j, zzax.zze(bArr3, i13));
                                i9 = i13 + 8;
                                unsafe3 = unsafe;
                                break;
                            }
                            i6 = i13;
                            obj2 = obj;
                            bArr2 = bArr;
                            i4 = i6;
                            i5 = i12;
                            i3 = i2;
                            zzayVar2 = zzayVar;
                            break;
                        case 1:
                            unsafe = unsafe3;
                            if (i15 == 5) {
                                zzfd.zza(obj, j, zzax.zzf(bArr3, i13));
                                i9 = i13 + 4;
                                unsafe3 = unsafe;
                                break;
                            }
                            i6 = i13;
                            obj2 = obj;
                            bArr2 = bArr;
                            i4 = i6;
                            i5 = i12;
                            i3 = i2;
                            zzayVar2 = zzayVar;
                            break;
                        case 2:
                        case 3:
                            Unsafe unsafe4 = unsafe3;
                            if (i15 != 0) {
                                unsafe = unsafe4;
                                i6 = i13;
                                obj2 = obj;
                                bArr2 = bArr;
                                i4 = i6;
                                i5 = i12;
                                i3 = i2;
                                zzayVar2 = zzayVar;
                                break;
                            } else {
                                int zzb = zzax.zzb(bArr3, i13, zzayVar3);
                                unsafe3 = unsafe4;
                                unsafe3.putLong(obj, j, zzayVar3.zzfe);
                                i9 = zzb;
                                break;
                            }
                        case 4:
                        case 11:
                            unsafe2 = unsafe3;
                            if (i15 != 0) {
                                i6 = i13;
                                unsafe = unsafe2;
                                obj2 = obj;
                                bArr2 = bArr;
                                i4 = i6;
                                i5 = i12;
                                i3 = i2;
                                zzayVar2 = zzayVar;
                                break;
                            } else {
                                i9 = zzax.zza(bArr3, i13, zzayVar3);
                                unsafe2.putInt(obj, j, zzayVar3.zzfd);
                                unsafe3 = unsafe2;
                                break;
                            }
                        case 5:
                        case 14:
                            unsafe2 = unsafe3;
                            if (i15 != 1) {
                                i6 = i13;
                                unsafe = unsafe2;
                                obj2 = obj;
                                bArr2 = bArr;
                                i4 = i6;
                                i5 = i12;
                                i3 = i2;
                                zzayVar2 = zzayVar;
                                break;
                            } else {
                                unsafe2.putLong(obj, j, zzax.zzd(bArr3, i13));
                                i9 = i13 + 8;
                                unsafe3 = unsafe2;
                                break;
                            }
                        case 6:
                        case 13:
                            unsafe2 = unsafe3;
                            if (i15 != 5) {
                                i6 = i13;
                                unsafe = unsafe2;
                                obj2 = obj;
                                bArr2 = bArr;
                                i4 = i6;
                                i5 = i12;
                                i3 = i2;
                                zzayVar2 = zzayVar;
                                break;
                            } else {
                                unsafe2.putInt(obj, j, zzax.zzc(bArr3, i13));
                                i9 = i13 + 4;
                                unsafe3 = unsafe2;
                                break;
                            }
                        case 7:
                            unsafe2 = unsafe3;
                            if (i15 != 0) {
                                i6 = i13;
                                unsafe = unsafe2;
                                obj2 = obj;
                                bArr2 = bArr;
                                i4 = i6;
                                i5 = i12;
                                i3 = i2;
                                zzayVar2 = zzayVar;
                                break;
                            } else {
                                i9 = zzax.zzb(bArr3, i13, zzayVar3);
                                zzfd.zza(obj, j, zzayVar3.zzfe != 0);
                                unsafe3 = unsafe2;
                                break;
                            }
                        case 8:
                            unsafe2 = unsafe3;
                            obj3 = obj;
                            if (i15 != 2) {
                                i6 = i13;
                                unsafe = unsafe2;
                                obj2 = obj;
                                bArr2 = bArr;
                                i4 = i6;
                                i5 = i12;
                                i3 = i2;
                                zzayVar2 = zzayVar;
                                break;
                            } else {
                                i9 = (536870912 & i16) == 0 ? zzax.zzc(bArr3, i13, zzayVar3) : zzax.zzd(bArr3, i13, zzayVar3);
                                zza2 = zzayVar3.zzff;
                                unsafe2.putObject(obj3, j, zza2);
                                unsafe3 = unsafe2;
                                break;
                            }
                        case 9:
                            unsafe2 = unsafe3;
                            obj3 = obj;
                            if (i15 != 2) {
                                i6 = i13;
                                unsafe = unsafe2;
                                obj2 = obj;
                                bArr2 = bArr;
                                i4 = i6;
                                i5 = i12;
                                i3 = i2;
                                zzayVar2 = zzayVar;
                                break;
                            } else {
                                i9 = zza(zzdsVar.zzad(zzai), bArr3, i13, i8, zzayVar3);
                                Object object = unsafe2.getObject(obj3, j);
                                zza2 = object == null ? zzayVar3.zzff : zzci.zza(object, zzayVar3.zzff);
                                unsafe2.putObject(obj3, j, zza2);
                                unsafe3 = unsafe2;
                                break;
                            }
                        case 10:
                            unsafe2 = unsafe3;
                            obj3 = obj;
                            if (i15 != 2) {
                                i6 = i13;
                                unsafe = unsafe2;
                                obj2 = obj;
                                bArr2 = bArr;
                                i4 = i6;
                                i5 = i12;
                                i3 = i2;
                                zzayVar2 = zzayVar;
                                break;
                            } else {
                                i9 = zzax.zze(bArr3, i13, zzayVar3);
                                zza2 = zzayVar3.zzff;
                                unsafe2.putObject(obj3, j, zza2);
                                unsafe3 = unsafe2;
                                break;
                            }
                        case 12:
                            unsafe2 = unsafe3;
                            obj4 = obj;
                            if (i15 != 0) {
                                i6 = i13;
                                unsafe = unsafe2;
                                obj2 = obj;
                                bArr2 = bArr;
                                i4 = i6;
                                i5 = i12;
                                i3 = i2;
                                zzayVar2 = zzayVar;
                                break;
                            } else {
                                i9 = zzax.zza(bArr3, i13, zzayVar3);
                                i7 = zzayVar3.zzfd;
                                unsafe2.putInt(obj4, j, i7);
                                unsafe3 = unsafe2;
                                break;
                            }
                        case 15:
                            unsafe2 = unsafe3;
                            obj4 = obj;
                            if (i15 != 0) {
                                i6 = i13;
                                unsafe = unsafe2;
                                obj2 = obj;
                                bArr2 = bArr;
                                i4 = i6;
                                i5 = i12;
                                i3 = i2;
                                zzayVar2 = zzayVar;
                                break;
                            } else {
                                i9 = zzax.zza(bArr3, i13, zzayVar3);
                                i7 = zzbk.zzm(zzayVar3.zzfd);
                                unsafe2.putInt(obj4, j, i7);
                                unsafe3 = unsafe2;
                                break;
                            }
                        case 16:
                            if (i15 != 0) {
                                unsafe2 = unsafe3;
                                i6 = i13;
                                unsafe = unsafe2;
                                obj2 = obj;
                                bArr2 = bArr;
                                i4 = i6;
                                i5 = i12;
                                i3 = i2;
                                zzayVar2 = zzayVar;
                                break;
                            } else {
                                int zzb2 = zzax.zzb(bArr3, i13, zzayVar3);
                                unsafe3.putLong(obj, j, zzbk.zza(zzayVar3.zzfe));
                                unsafe2 = unsafe3;
                                i9 = zzb2;
                                unsafe3 = unsafe2;
                                break;
                            }
                    }
                } else {
                    unsafe = unsafe3;
                    if (i17 != 27) {
                        if (i17 <= 49) {
                            zza = zzdsVar.zza(obj, bArr, i13, i2, i12, i14, i15, zzai, i16, i17, j, zzayVar);
                            if (zza == i13) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i3 = i2;
                                zzayVar2 = zzayVar;
                                i4 = zza;
                                i5 = i12;
                            }
                        } else {
                            if (i17 != 50) {
                                zza = zza(obj, bArr, i13, i2, i12, i14, i15, i16, i17, j, zzai, zzayVar);
                                if (zza == i13) {
                                    obj2 = obj;
                                    bArr2 = bArr;
                                    i3 = i2;
                                    i5 = i12;
                                    i4 = zza;
                                }
                            } else if (i15 == 2) {
                                int zza3 = zza(obj, bArr, i13, i2, zzai, i14, j, zzayVar);
                                if (zza3 == i13) {
                                    obj2 = obj;
                                    bArr2 = bArr;
                                    i3 = i2;
                                    i4 = zza3;
                                    i5 = i12;
                                } else {
                                    zzdsVar = this;
                                    bArr3 = bArr;
                                    i8 = i2;
                                    zzayVar3 = zzayVar;
                                    i9 = zza3;
                                }
                            } else {
                                i6 = i13;
                                i12 = i12;
                                obj2 = obj;
                                bArr2 = bArr;
                                i4 = i6;
                                i5 = i12;
                                i3 = i2;
                            }
                            zzayVar2 = zzayVar;
                        }
                        zzdsVar = this;
                        bArr3 = bArr;
                        i8 = i2;
                        zzayVar3 = zzayVar;
                        i9 = zza;
                    } else if (i15 == 2) {
                        zzcn zzcnVar = (zzcn) unsafe.getObject(obj, j);
                        if (!zzcnVar.zzu()) {
                            int size = zzcnVar.size();
                            zzcnVar = zzcnVar.zzi(size == 0 ? 10 : size << 1);
                            unsafe.putObject(obj, j, zzcnVar);
                        }
                        i9 = zza(zzdsVar.zzad(zzai), i12, bArr3, i13, i8, zzcnVar, zzayVar3);
                        bArr3 = bArr;
                        i8 = i2;
                        zzayVar3 = zzayVar;
                    } else {
                        i12 = i12;
                        i6 = i13;
                        obj2 = obj;
                        bArr2 = bArr;
                        i4 = i6;
                        i5 = i12;
                        i3 = i2;
                        zzayVar2 = zzayVar;
                    }
                    unsafe3 = unsafe;
                }
                i9 = zza(i5, bArr2, i4, i3, obj2, zzayVar2);
                zzdsVar = this;
                bArr3 = bArr;
                zzayVar3 = zzayVar;
                i8 = i3;
                unsafe3 = unsafe;
            }
            unsafe = unsafe3;
            i6 = i13;
            obj2 = obj;
            bArr2 = bArr;
            i4 = i6;
            i5 = i12;
            i3 = i2;
            zzayVar2 = zzayVar;
            i9 = zza(i5, bArr2, i4, i3, obj2, zzayVar2);
            zzdsVar = this;
            bArr3 = bArr;
            zzayVar3 = zzayVar;
            i8 = i3;
            unsafe3 = unsafe;
        }
        if (i9 != i8) {
            throw zzco.zzbo();
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final void zzc(Object obj) {
        int[] iArr = this.zzmt;
        if (iArr != null) {
            for (int i : iArr) {
                long zzag = zzag(i) & 1048575;
                Object zzo = zzfd.zzo(obj, zzag);
                if (zzo != null) {
                    zzfd.zza(obj, zzag, this.zzmz.zzj(zzo));
                }
            }
        }
        int[] iArr2 = this.zzmu;
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                this.zzmw.zza(obj, i2);
            }
        }
        this.zzmx.zzc(obj);
        if (this.zzmo) {
            this.zzmy.zzc(obj);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final void zzc(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.zzmi.length; i += 4) {
            int zzag = zzag(i);
            long j = 1048575 & zzag;
            int i2 = this.zzmi[i];
            switch ((zzag & 267386880) >>> 20) {
                case 0:
                    if (zza(obj2, i)) {
                        zzfd.zza(obj, j, zzfd.zzn(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza(obj2, i)) {
                        zzfd.zza(obj, j, zzfd.zzm(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!zza(obj2, i)) {
                        break;
                    }
                    zzfd.zza(obj, j, zzfd.zzk(obj2, j));
                    zzb(obj, i);
                    break;
                case 3:
                    if (!zza(obj2, i)) {
                        break;
                    }
                    zzfd.zza(obj, j, zzfd.zzk(obj2, j));
                    zzb(obj, i);
                    break;
                case 4:
                    if (!zza(obj2, i)) {
                        break;
                    }
                    zzfd.zza(obj, j, zzfd.zzj(obj2, j));
                    zzb(obj, i);
                    break;
                case 5:
                    if (!zza(obj2, i)) {
                        break;
                    }
                    zzfd.zza(obj, j, zzfd.zzk(obj2, j));
                    zzb(obj, i);
                    break;
                case 6:
                    if (!zza(obj2, i)) {
                        break;
                    }
                    zzfd.zza(obj, j, zzfd.zzj(obj2, j));
                    zzb(obj, i);
                    break;
                case 7:
                    if (zza(obj2, i)) {
                        zzfd.zza(obj, j, zzfd.zzl(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zza(obj2, i)) {
                        break;
                    }
                    zzfd.zza(obj, j, zzfd.zzo(obj2, j));
                    zzb(obj, i);
                    break;
                case 9:
                case 17:
                    zza(obj, obj2, i);
                    break;
                case 10:
                    if (!zza(obj2, i)) {
                        break;
                    }
                    zzfd.zza(obj, j, zzfd.zzo(obj2, j));
                    zzb(obj, i);
                    break;
                case 11:
                    if (!zza(obj2, i)) {
                        break;
                    }
                    zzfd.zza(obj, j, zzfd.zzj(obj2, j));
                    zzb(obj, i);
                    break;
                case 12:
                    if (!zza(obj2, i)) {
                        break;
                    }
                    zzfd.zza(obj, j, zzfd.zzj(obj2, j));
                    zzb(obj, i);
                    break;
                case 13:
                    if (!zza(obj2, i)) {
                        break;
                    }
                    zzfd.zza(obj, j, zzfd.zzj(obj2, j));
                    zzb(obj, i);
                    break;
                case 14:
                    if (!zza(obj2, i)) {
                        break;
                    }
                    zzfd.zza(obj, j, zzfd.zzk(obj2, j));
                    zzb(obj, i);
                    break;
                case 15:
                    if (!zza(obj2, i)) {
                        break;
                    }
                    zzfd.zza(obj, j, zzfd.zzj(obj2, j));
                    zzb(obj, i);
                    break;
                case 16:
                    if (!zza(obj2, i)) {
                        break;
                    }
                    zzfd.zza(obj, j, zzfd.zzk(obj2, j));
                    zzb(obj, i);
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
                    this.zzmw.zza(obj, obj2, j);
                    break;
                case 50:
                    zzeh.zza(this.zzmz, obj, obj2, j);
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
                    if (!zza(obj2, i2, i)) {
                        break;
                    }
                    zzfd.zza(obj, j, zzfd.zzo(obj2, j));
                    zzb(obj, i2, i);
                    break;
                case 60:
                case 68:
                    zzb(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zza(obj2, i2, i)) {
                        break;
                    }
                    zzfd.zza(obj, j, zzfd.zzo(obj2, j));
                    zzb(obj, i2, i);
                    break;
            }
        }
        if (this.zzmq) {
            return;
        }
        zzeh.zza(this.zzmx, obj, obj2);
        if (this.zzmo) {
            zzeh.zza(this.zzmy, obj, obj2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0187, code lost:
    
        if (r20.zzmr != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0189, code lost:
    
        r2.putInt(r21, r14, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018d, code lost:
    
        r3 = (com.google.android.gms.internal.clearcut.zzbn.zzr(r3) + com.google.android.gms.internal.clearcut.zzbn.zzt(r4)) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01a7, code lost:
    
        if (r20.zzmr != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01b8, code lost:
    
        if (r20.zzmr != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01c9, code lost:
    
        if (r20.zzmr != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01da, code lost:
    
        if (r20.zzmr != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01eb, code lost:
    
        if (r20.zzmr != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01fc, code lost:
    
        if (r20.zzmr != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x020d, code lost:
    
        if (r20.zzmr != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x021f, code lost:
    
        if (r20.zzmr != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0231, code lost:
    
        if (r20.zzmr != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0243, code lost:
    
        if (r20.zzmr != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0255, code lost:
    
        if (r20.zzmr != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0267, code lost:
    
        if (r20.zzmr != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0279, code lost:
    
        if (r20.zzmr != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0367, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.clearcut.zzbb) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0424, code lost:
    
        if (zza(r21, r15, r4) != false) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0426, code lost:
    
        r6 = com.google.android.gms.internal.clearcut.zzbn.zzc(r15, (com.google.android.gms.internal.clearcut.zzdo) r2.getObject(r21, r13), zzad(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x045d, code lost:
    
        if (zza(r21, r15, r4) != false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x045f, code lost:
    
        r6 = com.google.android.gms.internal.clearcut.zzbn.zzh(r15, 0L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0468, code lost:
    
        if (zza(r21, r15, r4) != false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x046a, code lost:
    
        r8 = com.google.android.gms.internal.clearcut.zzbn.zzk(r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0493, code lost:
    
        if (zza(r21, r15, r4) != false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0495, code lost:
    
        r6 = r2.getObject(r21, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0499, code lost:
    
        r6 = com.google.android.gms.internal.clearcut.zzbn.zzc(r15, (com.google.android.gms.internal.clearcut.zzbb) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x04a4, code lost:
    
        if (zza(r21, r15, r4) != false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x04a6, code lost:
    
        r6 = com.google.android.gms.internal.clearcut.zzeh.zzc(r15, r2.getObject(r21, r13), zzad(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x04bf, code lost:
    
        if ((r6 instanceof com.google.android.gms.internal.clearcut.zzbb) != false) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x04c2, code lost:
    
        r6 = com.google.android.gms.internal.clearcut.zzbn.zzb(r15, (java.lang.String) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x04ce, code lost:
    
        if (zza(r21, r15, r4) != false) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x04d0, code lost:
    
        r6 = com.google.android.gms.internal.clearcut.zzbn.zzc(r15, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0567, code lost:
    
        if (r20.zzmr != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0569, code lost:
    
        r2.putInt(r21, r6, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x056d, code lost:
    
        r6 = (com.google.android.gms.internal.clearcut.zzbn.zzr(r15) + com.google.android.gms.internal.clearcut.zzbn.zzt(r8)) + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0587, code lost:
    
        if (r20.zzmr != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0598, code lost:
    
        if (r20.zzmr != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x05a9, code lost:
    
        if (r20.zzmr != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x05ba, code lost:
    
        if (r20.zzmr != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x05cb, code lost:
    
        if (r20.zzmr != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x05dc, code lost:
    
        if (r20.zzmr != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x05ed, code lost:
    
        if (r20.zzmr != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x05ff, code lost:
    
        if (r20.zzmr != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0611, code lost:
    
        if (r20.zzmr != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0623, code lost:
    
        if (r20.zzmr != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0635, code lost:
    
        if (r20.zzmr != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0647, code lost:
    
        if (r20.zzmr != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0659, code lost:
    
        if (r20.zzmr != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0709, code lost:
    
        if ((r12 & r19) != 0) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0723, code lost:
    
        if ((r12 & r19) != 0) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0729, code lost:
    
        if ((r12 & r19) != 0) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0743, code lost:
    
        if ((r12 & r19) != 0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0749, code lost:
    
        if ((r12 & r19) != 0) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0757, code lost:
    
        if ((r6 instanceof com.google.android.gms.internal.clearcut.zzbb) != false) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x075d, code lost:
    
        if ((r12 & r19) != 0) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e2, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.clearcut.zzbb) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e5, code lost:
    
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzb(r3, (java.lang.String) r4);
     */
    @Override // com.google.android.gms.internal.clearcut.zzef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzm(Object obj) {
        int i;
        int i2;
        int zzd;
        Object object;
        int i3;
        int i4;
        int i5;
        long j;
        int zzo;
        int zzi;
        int zzb;
        long zzk;
        long zzk2;
        int zzj;
        Object zzo2;
        int zzj2;
        int zzj3;
        int zzj4;
        long zzk3;
        int zzo3;
        int zzi2;
        int i6 = 267386880;
        if (!this.zzmq) {
            Unsafe unsafe = zzmh;
            int i7 = -1;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i8 < this.zzmi.length) {
                int zzag = zzag(i8);
                int[] iArr = this.zzmi;
                int i11 = iArr[i8];
                int i12 = (zzag & 267386880) >>> 20;
                if (i12 <= 17) {
                    i = iArr[i8 + 2];
                    int i13 = i & 1048575;
                    i2 = 1 << (i >>> 20);
                    if (i13 != i7) {
                        i10 = unsafe.getInt(obj, i13);
                        i7 = i13;
                    }
                } else {
                    i = (!this.zzmr || i12 < zzcb.zzih.id() || i12 > zzcb.zziu.id()) ? 0 : this.zzmi[i8 + 2] & 1048575;
                    i2 = 0;
                }
                long j2 = zzag & 1048575;
                switch (i12) {
                    case 0:
                        if ((i10 & i2) == 0) {
                            break;
                        } else {
                            i9 += zzbn.zzb(i11, 0.0d);
                            break;
                        }
                    case 1:
                        if ((i10 & i2) != 0) {
                            i9 += zzbn.zzb(i11, 0.0f);
                            break;
                        }
                    case 2:
                        if ((i10 & i2) != 0) {
                            zzd = zzbn.zzd(i11, unsafe.getLong(obj, j2));
                            i9 += zzd;
                        }
                        break;
                    case 3:
                        if ((i10 & i2) != 0) {
                            zzd = zzbn.zze(i11, unsafe.getLong(obj, j2));
                            i9 += zzd;
                        }
                        break;
                    case 4:
                        if ((i10 & i2) != 0) {
                            zzd = zzbn.zzg(i11, unsafe.getInt(obj, j2));
                            i9 += zzd;
                        }
                        break;
                    case 5:
                        if ((i10 & i2) != 0) {
                            zzd = zzbn.zzg(i11, 0L);
                            i9 += zzd;
                        }
                        break;
                    case 6:
                        if ((i10 & i2) != 0) {
                            zzd = zzbn.zzj(i11, 0);
                            i9 += zzd;
                            break;
                        }
                    case 8:
                        if ((i10 & i2) != 0) {
                            object = unsafe.getObject(obj, j2);
                            break;
                        }
                        break;
                    case 11:
                        if ((i10 & i2) != 0) {
                            i3 = unsafe.getInt(obj, j2);
                            zzo = zzbn.zzh(i11, i3);
                            i9 += zzo;
                        }
                        break;
                    case 12:
                        if ((i10 & i2) != 0) {
                            i4 = unsafe.getInt(obj, j2);
                            zzo = zzbn.zzl(i11, i4);
                            i9 += zzo;
                        }
                        break;
                    case 15:
                        if ((i10 & i2) != 0) {
                            i5 = unsafe.getInt(obj, j2);
                            zzo = zzbn.zzi(i11, i5);
                            i9 += zzo;
                        }
                        break;
                    case 16:
                        if ((i10 & i2) != 0) {
                            j = unsafe.getLong(obj, j2);
                            zzo = zzbn.zzf(i11, j);
                            i9 += zzo;
                        }
                        break;
                    case 18:
                    case 23:
                    case 32:
                        zzo = zzeh.zzw(i11, (List) unsafe.getObject(obj, j2), false);
                        i9 += zzo;
                        break;
                    case 19:
                    case 24:
                    case 31:
                        zzo = zzeh.zzv(i11, (List) unsafe.getObject(obj, j2), false);
                        i9 += zzo;
                        break;
                    case 20:
                        zzo = zzeh.zzo(i11, (List) unsafe.getObject(obj, j2), false);
                        i9 += zzo;
                        break;
                    case 21:
                        zzo = zzeh.zzp(i11, (List) unsafe.getObject(obj, j2), false);
                        i9 += zzo;
                        break;
                    case 22:
                        zzo = zzeh.zzs(i11, (List) unsafe.getObject(obj, j2), false);
                        i9 += zzo;
                        break;
                    case 25:
                        zzo = zzeh.zzx(i11, (List) unsafe.getObject(obj, j2), false);
                        i9 += zzo;
                        break;
                    case 26:
                        zzo = zzeh.zzc(i11, (List) unsafe.getObject(obj, j2));
                        i9 += zzo;
                        break;
                    case 27:
                        zzo = zzeh.zzc(i11, (List) unsafe.getObject(obj, j2), zzad(i8));
                        i9 += zzo;
                        break;
                    case 28:
                        zzo = zzeh.zzd(i11, (List) unsafe.getObject(obj, j2));
                        i9 += zzo;
                        break;
                    case 29:
                        zzo = zzeh.zzt(i11, (List) unsafe.getObject(obj, j2), false);
                        i9 += zzo;
                        break;
                    case 30:
                        zzo = zzeh.zzr(i11, (List) unsafe.getObject(obj, j2), false);
                        i9 += zzo;
                        break;
                    case 33:
                        zzo = zzeh.zzu(i11, (List) unsafe.getObject(obj, j2), false);
                        i9 += zzo;
                        break;
                    case 34:
                        zzo = zzeh.zzq(i11, (List) unsafe.getObject(obj, j2), false);
                        i9 += zzo;
                        break;
                    case 35:
                        zzi = zzeh.zzi((List) unsafe.getObject(obj, j2));
                        if (zzi > 0) {
                            break;
                        }
                        break;
                    case 36:
                        zzi = zzeh.zzh((List) unsafe.getObject(obj, j2));
                        if (zzi > 0) {
                            break;
                        }
                        break;
                    case 37:
                        zzi = zzeh.zza((List) unsafe.getObject(obj, j2));
                        if (zzi > 0) {
                            break;
                        }
                        break;
                    case 38:
                        zzi = zzeh.zzb((List) unsafe.getObject(obj, j2));
                        if (zzi > 0) {
                            break;
                        }
                        break;
                    case 39:
                        zzi = zzeh.zze((List) unsafe.getObject(obj, j2));
                        if (zzi > 0) {
                            break;
                        }
                        break;
                    case 40:
                        zzi = zzeh.zzi((List) unsafe.getObject(obj, j2));
                        if (zzi > 0) {
                            break;
                        }
                        break;
                    case 41:
                        zzi = zzeh.zzh((List) unsafe.getObject(obj, j2));
                        if (zzi > 0) {
                            break;
                        }
                        break;
                    case 42:
                        zzi = zzeh.zzj((List) unsafe.getObject(obj, j2));
                        if (zzi > 0) {
                            break;
                        }
                        break;
                    case 43:
                        zzi = zzeh.zzf((List) unsafe.getObject(obj, j2));
                        if (zzi > 0) {
                            break;
                        }
                        break;
                    case 44:
                        zzi = zzeh.zzd((List) unsafe.getObject(obj, j2));
                        if (zzi > 0) {
                            break;
                        }
                        break;
                    case 45:
                        zzi = zzeh.zzh((List) unsafe.getObject(obj, j2));
                        if (zzi > 0) {
                            break;
                        }
                        break;
                    case 46:
                        zzi = zzeh.zzi((List) unsafe.getObject(obj, j2));
                        if (zzi > 0) {
                            break;
                        }
                        break;
                    case 47:
                        zzi = zzeh.zzg((List) unsafe.getObject(obj, j2));
                        if (zzi > 0) {
                            break;
                        }
                        break;
                    case 48:
                        zzi = zzeh.zzc((List) unsafe.getObject(obj, j2));
                        if (zzi > 0) {
                            break;
                        }
                        break;
                    case 49:
                        zzo = zzeh.zzd(i11, (List) unsafe.getObject(obj, j2), zzad(i8));
                        i9 += zzo;
                        break;
                    case 50:
                        zzo = this.zzmz.zzb(i11, unsafe.getObject(obj, j2), zzae(i8));
                        i9 += zzo;
                        break;
                    case 51:
                        if (zza(obj, i11, i8)) {
                            zzo = zzbn.zzb(i11, 0.0d);
                            i9 += zzo;
                        }
                        break;
                    case 52:
                        if (zza(obj, i11, i8)) {
                            zzb = zzbn.zzb(i11, 0.0f);
                            i9 += zzb;
                        }
                        break;
                    case 53:
                        if (zza(obj, i11, i8)) {
                            zzo = zzbn.zzd(i11, zzh(obj, j2));
                            i9 += zzo;
                        }
                        break;
                    case 54:
                        if (zza(obj, i11, i8)) {
                            zzo = zzbn.zze(i11, zzh(obj, j2));
                            i9 += zzo;
                        }
                        break;
                    case 55:
                        if (zza(obj, i11, i8)) {
                            zzo = zzbn.zzg(i11, zzg(obj, j2));
                            i9 += zzo;
                        }
                        break;
                    case 56:
                        if (zza(obj, i11, i8)) {
                            zzo = zzbn.zzg(i11, 0L);
                            i9 += zzo;
                        }
                        break;
                    case 57:
                        if (zza(obj, i11, i8)) {
                            zzb = zzbn.zzj(i11, 0);
                            i9 += zzb;
                        }
                        break;
                    case 59:
                        if (zza(obj, i11, i8)) {
                            object = unsafe.getObject(obj, j2);
                            break;
                        }
                        break;
                    case 62:
                        if (zza(obj, i11, i8)) {
                            i3 = zzg(obj, j2);
                            zzo = zzbn.zzh(i11, i3);
                            i9 += zzo;
                        }
                        break;
                    case 63:
                        if (zza(obj, i11, i8)) {
                            i4 = zzg(obj, j2);
                            zzo = zzbn.zzl(i11, i4);
                            i9 += zzo;
                        }
                        break;
                    case 66:
                        if (zza(obj, i11, i8)) {
                            i5 = zzg(obj, j2);
                            zzo = zzbn.zzi(i11, i5);
                            i9 += zzo;
                        }
                        break;
                    case 67:
                        if (zza(obj, i11, i8)) {
                            j = zzh(obj, j2);
                            zzo = zzbn.zzf(i11, j);
                            i9 += zzo;
                        }
                        break;
                }
                i8 += 4;
            }
            int zza = i9 + zza(this.zzmx, obj);
            return this.zzmo ? zza + this.zzmy.zza(obj).zzas() : zza;
        }
        Unsafe unsafe2 = zzmh;
        int i14 = 0;
        int i15 = 0;
        while (i14 < this.zzmi.length) {
            int zzag2 = zzag(i14);
            int i16 = (zzag2 & i6) >>> 20;
            int i17 = this.zzmi[i14];
            long j3 = zzag2 & 1048575;
            int i18 = (i16 < zzcb.zzih.id() || i16 > zzcb.zziu.id()) ? 0 : this.zzmi[i14 + 2] & 1048575;
            switch (i16) {
                case 0:
                    if (!zza(obj, i14)) {
                        break;
                    }
                    zzo3 = zzbn.zzb(i17, 0.0d);
                    i15 += zzo3;
                    break;
                case 1:
                    if (!zza(obj, i14)) {
                        break;
                    }
                    zzo3 = zzbn.zzb(i17, 0.0f);
                    i15 += zzo3;
                    break;
                case 2:
                    if (!zza(obj, i14)) {
                        break;
                    } else {
                        zzk = zzfd.zzk(obj, j3);
                        zzo3 = zzbn.zzd(i17, zzk);
                        i15 += zzo3;
                        break;
                    }
                case 3:
                    if (!zza(obj, i14)) {
                        break;
                    } else {
                        zzk2 = zzfd.zzk(obj, j3);
                        zzo3 = zzbn.zze(i17, zzk2);
                        i15 += zzo3;
                        break;
                    }
                case 4:
                    if (!zza(obj, i14)) {
                        break;
                    } else {
                        zzj = zzfd.zzj(obj, j3);
                        zzo3 = zzbn.zzg(i17, zzj);
                        i15 += zzo3;
                        break;
                    }
                case 5:
                    if (!zza(obj, i14)) {
                        break;
                    }
                    zzo3 = zzbn.zzg(i17, 0L);
                    i15 += zzo3;
                    break;
                case 6:
                    if (!zza(obj, i14)) {
                        break;
                    }
                    zzo3 = zzbn.zzj(i17, 0);
                    i15 += zzo3;
                    break;
                case 7:
                    if (!zza(obj, i14)) {
                        break;
                    }
                    zzo3 = zzbn.zzc(i17, true);
                    i15 += zzo3;
                    break;
                case 8:
                    if (!zza(obj, i14)) {
                        break;
                    } else {
                        zzo2 = zzfd.zzo(obj, j3);
                        break;
                    }
                case 9:
                    if (!zza(obj, i14)) {
                        break;
                    }
                    zzo3 = zzeh.zzc(i17, zzfd.zzo(obj, j3), zzad(i14));
                    i15 += zzo3;
                    break;
                case 10:
                    if (!zza(obj, i14)) {
                        break;
                    }
                    zzo2 = zzfd.zzo(obj, j3);
                    zzo3 = zzbn.zzc(i17, (zzbb) zzo2);
                    i15 += zzo3;
                    break;
                case 11:
                    if (!zza(obj, i14)) {
                        break;
                    } else {
                        zzj2 = zzfd.zzj(obj, j3);
                        zzo3 = zzbn.zzh(i17, zzj2);
                        i15 += zzo3;
                        break;
                    }
                case 12:
                    if (!zza(obj, i14)) {
                        break;
                    } else {
                        zzj3 = zzfd.zzj(obj, j3);
                        zzo3 = zzbn.zzl(i17, zzj3);
                        i15 += zzo3;
                        break;
                    }
                case 13:
                    if (!zza(obj, i14)) {
                        break;
                    }
                    zzo3 = zzbn.zzk(i17, 0);
                    i15 += zzo3;
                    break;
                case 14:
                    if (!zza(obj, i14)) {
                        break;
                    }
                    zzo3 = zzbn.zzh(i17, 0L);
                    i15 += zzo3;
                    break;
                case 15:
                    if (!zza(obj, i14)) {
                        break;
                    } else {
                        zzj4 = zzfd.zzj(obj, j3);
                        zzo3 = zzbn.zzi(i17, zzj4);
                        i15 += zzo3;
                        break;
                    }
                case 16:
                    if (!zza(obj, i14)) {
                        break;
                    } else {
                        zzk3 = zzfd.zzk(obj, j3);
                        zzo3 = zzbn.zzf(i17, zzk3);
                        i15 += zzo3;
                        break;
                    }
                case 17:
                    if (!zza(obj, i14)) {
                        break;
                    }
                    zzo3 = zzbn.zzc(i17, (zzdo) zzfd.zzo(obj, j3), zzad(i14));
                    i15 += zzo3;
                    break;
                case 18:
                case 23:
                case 32:
                    zzo3 = zzeh.zzw(i17, zzd(obj, j3), false);
                    i15 += zzo3;
                    break;
                case 19:
                case 24:
                case 31:
                    zzo3 = zzeh.zzv(i17, zzd(obj, j3), false);
                    i15 += zzo3;
                    break;
                case 20:
                    zzo3 = zzeh.zzo(i17, zzd(obj, j3), false);
                    i15 += zzo3;
                    break;
                case 21:
                    zzo3 = zzeh.zzp(i17, zzd(obj, j3), false);
                    i15 += zzo3;
                    break;
                case 22:
                    zzo3 = zzeh.zzs(i17, zzd(obj, j3), false);
                    i15 += zzo3;
                    break;
                case 25:
                    zzo3 = zzeh.zzx(i17, zzd(obj, j3), false);
                    i15 += zzo3;
                    break;
                case 26:
                    zzo3 = zzeh.zzc(i17, zzd(obj, j3));
                    i15 += zzo3;
                    break;
                case 27:
                    zzo3 = zzeh.zzc(i17, zzd(obj, j3), zzad(i14));
                    i15 += zzo3;
                    break;
                case 28:
                    zzo3 = zzeh.zzd(i17, zzd(obj, j3));
                    i15 += zzo3;
                    break;
                case 29:
                    zzo3 = zzeh.zzt(i17, zzd(obj, j3), false);
                    i15 += zzo3;
                    break;
                case 30:
                    zzo3 = zzeh.zzr(i17, zzd(obj, j3), false);
                    i15 += zzo3;
                    break;
                case 33:
                    zzo3 = zzeh.zzu(i17, zzd(obj, j3), false);
                    i15 += zzo3;
                    break;
                case 34:
                    zzo3 = zzeh.zzq(i17, zzd(obj, j3), false);
                    i15 += zzo3;
                    break;
                case 35:
                    zzi2 = zzeh.zzi((List) unsafe2.getObject(obj, j3));
                    if (zzi2 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzi2 = zzeh.zzh((List) unsafe2.getObject(obj, j3));
                    if (zzi2 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzi2 = zzeh.zza((List) unsafe2.getObject(obj, j3));
                    if (zzi2 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzi2 = zzeh.zzb((List) unsafe2.getObject(obj, j3));
                    if (zzi2 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzi2 = zzeh.zze((List) unsafe2.getObject(obj, j3));
                    if (zzi2 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzi2 = zzeh.zzi((List) unsafe2.getObject(obj, j3));
                    if (zzi2 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzi2 = zzeh.zzh((List) unsafe2.getObject(obj, j3));
                    if (zzi2 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 42:
                    zzi2 = zzeh.zzj((List) unsafe2.getObject(obj, j3));
                    if (zzi2 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzi2 = zzeh.zzf((List) unsafe2.getObject(obj, j3));
                    if (zzi2 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzi2 = zzeh.zzd((List) unsafe2.getObject(obj, j3));
                    if (zzi2 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzi2 = zzeh.zzh((List) unsafe2.getObject(obj, j3));
                    if (zzi2 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzi2 = zzeh.zzi((List) unsafe2.getObject(obj, j3));
                    if (zzi2 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzi2 = zzeh.zzg((List) unsafe2.getObject(obj, j3));
                    if (zzi2 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzi2 = zzeh.zzc((List) unsafe2.getObject(obj, j3));
                    if (zzi2 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzo3 = zzeh.zzd(i17, zzd(obj, j3), zzad(i14));
                    i15 += zzo3;
                    break;
                case 50:
                    zzo3 = this.zzmz.zzb(i17, zzfd.zzo(obj, j3), zzae(i14));
                    i15 += zzo3;
                    break;
                case 51:
                    if (!zza(obj, i17, i14)) {
                        break;
                    }
                    zzo3 = zzbn.zzb(i17, 0.0d);
                    i15 += zzo3;
                    break;
                case 52:
                    if (!zza(obj, i17, i14)) {
                        break;
                    }
                    zzo3 = zzbn.zzb(i17, 0.0f);
                    i15 += zzo3;
                    break;
                case 53:
                    if (!zza(obj, i17, i14)) {
                        break;
                    } else {
                        zzk = zzh(obj, j3);
                        zzo3 = zzbn.zzd(i17, zzk);
                        i15 += zzo3;
                        break;
                    }
                case 54:
                    if (!zza(obj, i17, i14)) {
                        break;
                    } else {
                        zzk2 = zzh(obj, j3);
                        zzo3 = zzbn.zze(i17, zzk2);
                        i15 += zzo3;
                        break;
                    }
                case 55:
                    if (!zza(obj, i17, i14)) {
                        break;
                    } else {
                        zzj = zzg(obj, j3);
                        zzo3 = zzbn.zzg(i17, zzj);
                        i15 += zzo3;
                        break;
                    }
                case 56:
                    if (!zza(obj, i17, i14)) {
                        break;
                    }
                    zzo3 = zzbn.zzg(i17, 0L);
                    i15 += zzo3;
                    break;
                case 57:
                    if (!zza(obj, i17, i14)) {
                        break;
                    }
                    zzo3 = zzbn.zzj(i17, 0);
                    i15 += zzo3;
                    break;
                case 58:
                    if (!zza(obj, i17, i14)) {
                        break;
                    }
                    zzo3 = zzbn.zzc(i17, true);
                    i15 += zzo3;
                    break;
                case 59:
                    if (!zza(obj, i17, i14)) {
                        break;
                    } else {
                        zzo2 = zzfd.zzo(obj, j3);
                        break;
                    }
                case 60:
                    if (!zza(obj, i17, i14)) {
                        break;
                    }
                    zzo3 = zzeh.zzc(i17, zzfd.zzo(obj, j3), zzad(i14));
                    i15 += zzo3;
                    break;
                case 61:
                    if (!zza(obj, i17, i14)) {
                        break;
                    }
                    zzo2 = zzfd.zzo(obj, j3);
                    zzo3 = zzbn.zzc(i17, (zzbb) zzo2);
                    i15 += zzo3;
                    break;
                case 62:
                    if (!zza(obj, i17, i14)) {
                        break;
                    } else {
                        zzj2 = zzg(obj, j3);
                        zzo3 = zzbn.zzh(i17, zzj2);
                        i15 += zzo3;
                        break;
                    }
                case 63:
                    if (!zza(obj, i17, i14)) {
                        break;
                    } else {
                        zzj3 = zzg(obj, j3);
                        zzo3 = zzbn.zzl(i17, zzj3);
                        i15 += zzo3;
                        break;
                    }
                case 64:
                    if (!zza(obj, i17, i14)) {
                        break;
                    }
                    zzo3 = zzbn.zzk(i17, 0);
                    i15 += zzo3;
                    break;
                case 65:
                    if (!zza(obj, i17, i14)) {
                        break;
                    }
                    zzo3 = zzbn.zzh(i17, 0L);
                    i15 += zzo3;
                    break;
                case 66:
                    if (!zza(obj, i17, i14)) {
                        break;
                    } else {
                        zzj4 = zzg(obj, j3);
                        zzo3 = zzbn.zzi(i17, zzj4);
                        i15 += zzo3;
                        break;
                    }
                case 67:
                    if (!zza(obj, i17, i14)) {
                        break;
                    } else {
                        zzk3 = zzh(obj, j3);
                        zzo3 = zzbn.zzf(i17, zzk3);
                        i15 += zzo3;
                        break;
                    }
                case 68:
                    if (!zza(obj, i17, i14)) {
                        break;
                    }
                    zzo3 = zzbn.zzc(i17, (zzdo) zzfd.zzo(obj, j3), zzad(i14));
                    i15 += zzo3;
                    break;
            }
            i14 += 4;
            i6 = 267386880;
        }
        return i15 + zza(this.zzmx, obj);
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final boolean zzo(Object obj) {
        int i;
        int i2;
        int[] iArr = this.zzms;
        int i3 = 1;
        if (iArr == null || iArr.length == 0) {
            return true;
        }
        int length = iArr.length;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int i7 = iArr[i5];
            int zzai = zzai(i7);
            int zzag = zzag(zzai);
            if (this.zzmq) {
                i = length;
                i2 = 0;
            } else {
                int i8 = this.zzmi[zzai + 2];
                int i9 = i8 & 1048575;
                i2 = i3 << (i8 >>> 20);
                if (i9 != i4) {
                    i = length;
                    i6 = zzmh.getInt(obj, i9);
                    i4 = i9;
                } else {
                    i = length;
                }
            }
            if ((268435456 & zzag) != 0 && !zza(obj, zzai, i6, i2)) {
                return false;
            }
            int i10 = (267386880 & zzag) >>> 20;
            if (i10 != 9 && i10 != 17) {
                if (i10 != 27) {
                    if (i10 == 60 || i10 == 68) {
                        if (zza(obj, i7, zzai) && !zza(obj, zzag, zzad(zzai))) {
                            return false;
                        }
                    } else if (i10 != 49) {
                        if (i10 == 50 && !this.zzmz.zzh(zzfd.zzo(obj, zzag & 1048575)).isEmpty()) {
                            this.zzmz.zzl(zzae(zzai));
                            throw null;
                        }
                    }
                }
                List list = (List) zzfd.zzo(obj, zzag & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzef zzad = zzad(zzai);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzad.zzo(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zza(obj, zzai, i6, i2) && !zza(obj, zzag, zzad(zzai))) {
                return false;
            }
            i5++;
            length = i;
            i3 = 1;
        }
        return !this.zzmo || this.zzmy.zza(obj).isInitialized();
    }
}
