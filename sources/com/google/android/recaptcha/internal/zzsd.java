package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
final class zzsd {
    private static final zzsd zzb = new zzsd(true);
    final zzuo zza = new zzuj();
    private boolean zzc;
    private boolean zzd;

    private zzsd() {
    }

    public static int zza(zzsc zzscVar, Object obj) {
        int zzd;
        int zzA;
        zzvg zzd2 = zzscVar.zzd();
        int zza = zzscVar.zza();
        zzscVar.zzg();
        int zzA2 = zzqv.zzA(zza << 3);
        if (zzd2 == zzvg.zzj) {
            byte[] bArr = zzsv.zzb;
            if (((zzts) obj) instanceof zzpx) {
                throw null;
            }
            zzA2 += zzA2;
        }
        zzvh zzvhVar = zzvh.zza;
        int i10 = 4;
        switch (zzd2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                i10 = 8;
                return zzA2 + i10;
            case 1:
                ((Float) obj).getClass();
                return zzA2 + i10;
            case 2:
                i10 = zzqv.zzB(((Long) obj).longValue());
                return zzA2 + i10;
            case 3:
                i10 = zzqv.zzB(((Long) obj).longValue());
                return zzA2 + i10;
            case 4:
                i10 = zzqv.zzB(((Integer) obj).intValue());
                return zzA2 + i10;
            case 5:
                ((Long) obj).getClass();
                i10 = 8;
                return zzA2 + i10;
            case 6:
                ((Integer) obj).getClass();
                return zzA2 + i10;
            case 7:
                ((Boolean) obj).getClass();
                i10 = 1;
                return zzA2 + i10;
            case 8:
                if (!(obj instanceof zzqm)) {
                    i10 = zzqv.zzz((String) obj);
                    return zzA2 + i10;
                }
                zzd = ((zzqm) obj).zzd();
                zzA = zzqv.zzA(zzd);
                i10 = zzA + zzd;
                return zzA2 + i10;
            case 9:
                i10 = ((zzts) obj).zzo();
                return zzA2 + i10;
            case 10:
                if (!(obj instanceof zztc)) {
                    i10 = zzqv.zzx((zzts) obj);
                    return zzA2 + i10;
                }
                zzd = ((zztc) obj).zza();
                zzA = zzqv.zzA(zzd);
                i10 = zzA + zzd;
                return zzA2 + i10;
            case 11:
                if (obj instanceof zzqm) {
                    zzd = ((zzqm) obj).zzd();
                    zzA = zzqv.zzA(zzd);
                } else {
                    zzd = ((byte[]) obj).length;
                    zzA = zzqv.zzA(zzd);
                }
                i10 = zzA + zzd;
                return zzA2 + i10;
            case 12:
                i10 = zzqv.zzA(((Integer) obj).intValue());
                return zzA2 + i10;
            case 13:
                i10 = obj instanceof zzsp ? zzqv.zzB(((zzsp) obj).zza()) : zzqv.zzB(((Integer) obj).intValue());
                return zzA2 + i10;
            case 14:
                ((Integer) obj).getClass();
                return zzA2 + i10;
            case 15:
                ((Long) obj).getClass();
                i10 = 8;
                return zzA2 + i10;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i10 = zzqv.zzA((intValue >> 31) ^ (intValue + intValue));
                return zzA2 + i10;
            case 17:
                long longValue = ((Long) obj).longValue();
                i10 = zzqv.zzB((longValue >> 63) ^ (longValue + longValue));
                return zzA2 + i10;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static zzsd zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zztx) {
            return ((zztx) obj).zzd();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzm(Map.Entry entry) {
        zzsc zzscVar = (zzsc) entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof zztc;
        zzscVar.zzg();
        if (zzscVar.zze() != zzvh.zzi) {
            if (z10) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(zzscVar, zzl(value));
            return;
        }
        Object zze = zze(zzscVar);
        if (zze != null) {
            if (z10) {
                throw null;
            }
            this.zza.put(zzscVar, zze instanceof zztx ? zzscVar.zzc((zztx) zze, (zztx) value) : zzscVar.zzb(((zzts) zze).zzag(), (zzts) value).zzk());
        } else {
            this.zza.put(zzscVar, zzl(value));
            if (z10) {
                this.zzd = true;
            }
        }
    }

    private static boolean zzn(Map.Entry entry) {
        zzsc zzscVar = (zzsc) entry.getKey();
        if (zzscVar.zze() != zzvh.zzi) {
            return true;
        }
        zzscVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zztt) {
            return ((zztt) value).zzp();
        }
        if (value instanceof zztc) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        int i10;
        int zzA;
        int zzx;
        zzsc zzscVar = (zzsc) entry.getKey();
        Object value = entry.getValue();
        if (zzscVar.zze() != zzvh.zzi) {
            return zza(zzscVar, value);
        }
        zzscVar.zzg();
        zzscVar.zzf();
        if (value instanceof zztc) {
            int zza = ((zzsc) entry.getKey()).zza();
            int zzA2 = zzqv.zzA(8);
            i10 = zzA2 + zzA2;
            zzA = zzqv.zzA(zza) + zzqv.zzA(16);
            int zzA3 = zzqv.zzA(24);
            int zza2 = ((zztc) value).zza();
            zzx = a.e(zza2, zza2, zzA3);
        } else {
            int zza3 = ((zzsc) entry.getKey()).zza();
            int zzA4 = zzqv.zzA(8);
            i10 = zzA4 + zzA4;
            zzA = zzqv.zzA(zza3) + zzqv.zzA(16);
            zzx = zzqv.zzx((zzts) value) + zzqv.zzA(24);
        }
        return i10 + zzA + zzx;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzsd) {
            return this.zza.equals(((zzsd) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        zzuo zzuoVar = this.zza;
        int zzc = zzuoVar.zzc();
        int i10 = 0;
        for (int i11 = 0; i11 < zzc; i11++) {
            i10 += zzo(zzuoVar.zzg(i11));
        }
        Iterator it = zzuoVar.zzd().iterator();
        while (it.hasNext()) {
            i10 += zzo((Map.Entry) it.next());
        }
        return i10;
    }

    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzsd clone() {
        zzsd zzsdVar = new zzsd();
        zzuo zzuoVar = this.zza;
        int zzc = zzuoVar.zzc();
        for (int i10 = 0; i10 < zzc; i10++) {
            Map.Entry zzg = zzuoVar.zzg(i10);
            zzsdVar.zzi((zzsc) ((zzuk) zzg).zza(), zzg.getValue());
        }
        for (Map.Entry entry : zzuoVar.zzd()) {
            zzsdVar.zzi((zzsc) entry.getKey(), entry.getValue());
        }
        zzsdVar.zzd = this.zzd;
        return zzsdVar;
    }

    public final Object zze(zzsc zzscVar) {
        Object obj = this.zza.get(zzscVar);
        if (obj instanceof zztc) {
            throw null;
        }
        return obj;
    }

    public final Iterator zzf() {
        zzuo zzuoVar = this.zza;
        return zzuoVar.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzta(zzuoVar.entrySet().iterator()) : zzuoVar.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        zzuo zzuoVar = this.zza;
        int zzc = zzuoVar.zzc();
        for (int i10 = 0; i10 < zzc; i10++) {
            Object value = zzuoVar.zzg(i10).getValue();
            if (value instanceof zzsn) {
                ((zzsn) value).zzG();
            }
        }
        Iterator it = zzuoVar.zzd().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzsn) {
                ((zzsn) value2).zzG();
            }
        }
        zzuoVar.zza();
        this.zzc = true;
    }

    public final void zzh(zzsd zzsdVar) {
        zzuo zzuoVar = zzsdVar.zza;
        int zzc = zzuoVar.zzc();
        for (int i10 = 0; i10 < zzc; i10++) {
            zzm(zzuoVar.zzg(i10));
        }
        Iterator it = zzuoVar.zzd().iterator();
        while (it.hasNext()) {
            zzm((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if ((r7 instanceof com.google.android.recaptcha.internal.zzsp) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if ((r7 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if ((r7 instanceof com.google.android.recaptcha.internal.zztc) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(zzsc zzscVar, Object obj) {
        boolean z10;
        zzscVar.zzg();
        zzscVar.zzd();
        byte[] bArr = zzsv.zzb;
        obj.getClass();
        zzvg zzvgVar = zzvg.zza;
        zzvh zzvhVar = zzvh.zza;
        switch (r0.zza()) {
            case zza:
                z10 = obj instanceof Integer;
                break;
            case zzb:
                z10 = obj instanceof Long;
                break;
            case zzc:
                z10 = obj instanceof Float;
                break;
            case zzd:
                z10 = obj instanceof Double;
                break;
            case zze:
                z10 = obj instanceof Boolean;
                break;
            case zzf:
                z10 = obj instanceof String;
                break;
            case zzg:
                if (!(obj instanceof zzqm)) {
                    break;
                }
                if (obj instanceof zztc) {
                    this.zzd = true;
                }
                this.zza.put(zzscVar, obj);
                return;
            case zzh:
                if (!(obj instanceof Integer)) {
                    break;
                }
                if (obj instanceof zztc) {
                }
                this.zza.put(zzscVar, obj);
                return;
            case zzi:
                if (!(obj instanceof zzts)) {
                    break;
                }
                if (obj instanceof zztc) {
                }
                this.zza.put(zzscVar, obj);
                return;
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzscVar.zza()), zzscVar.zzd().zza(), obj.getClass().getName()));
        }
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        zzuo zzuoVar = this.zza;
        int zzc = zzuoVar.zzc();
        for (int i10 = 0; i10 < zzc; i10++) {
            if (!zzn(zzuoVar.zzg(i10))) {
                return false;
            }
        }
        Iterator it = zzuoVar.zzd().iterator();
        while (it.hasNext()) {
            if (!zzn((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzsd(boolean z10) {
        zzg();
        zzg();
    }
}
