package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

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
        int i = 4;
        switch (zzd2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                i = 8;
                return zzA2 + i;
            case 1:
                ((Float) obj).getClass();
                return zzA2 + i;
            case 2:
                i = zzqv.zzB(((Long) obj).longValue());
                return zzA2 + i;
            case 3:
                i = zzqv.zzB(((Long) obj).longValue());
                return zzA2 + i;
            case 4:
                i = zzqv.zzB(((Integer) obj).intValue());
                return zzA2 + i;
            case 5:
                ((Long) obj).getClass();
                i = 8;
                return zzA2 + i;
            case 6:
                ((Integer) obj).getClass();
                return zzA2 + i;
            case 7:
                ((Boolean) obj).getClass();
                i = 1;
                return zzA2 + i;
            case 8:
                if (!(obj instanceof zzqm)) {
                    i = zzqv.zzz((String) obj);
                    return zzA2 + i;
                }
                zzd = ((zzqm) obj).zzd();
                zzA = zzqv.zzA(zzd);
                i = zzA + zzd;
                return zzA2 + i;
            case 9:
                i = ((zzts) obj).zzo();
                return zzA2 + i;
            case 10:
                if (!(obj instanceof zztc)) {
                    i = zzqv.zzx((zzts) obj);
                    return zzA2 + i;
                }
                zzd = ((zztc) obj).zza();
                zzA = zzqv.zzA(zzd);
                i = zzA + zzd;
                return zzA2 + i;
            case 11:
                if (obj instanceof zzqm) {
                    zzd = ((zzqm) obj).zzd();
                    zzA = zzqv.zzA(zzd);
                } else {
                    zzd = ((byte[]) obj).length;
                    zzA = zzqv.zzA(zzd);
                }
                i = zzA + zzd;
                return zzA2 + i;
            case 12:
                i = zzqv.zzA(((Integer) obj).intValue());
                return zzA2 + i;
            case 13:
                i = obj instanceof zzsp ? zzqv.zzB(((zzsp) obj).zza()) : zzqv.zzB(((Integer) obj).intValue());
                return zzA2 + i;
            case 14:
                ((Integer) obj).getClass();
                return zzA2 + i;
            case 15:
                ((Long) obj).getClass();
                i = 8;
                return zzA2 + i;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i = zzqv.zzA((intValue >> 31) ^ (intValue + intValue));
                return zzA2 + i;
            case 17:
                long longValue = ((Long) obj).longValue();
                i = zzqv.zzB((longValue >> 63) ^ (longValue + longValue));
                return zzA2 + i;
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
        boolean z = value instanceof zztc;
        zzscVar.zzg();
        if (zzscVar.zze() != zzvh.zzi) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(zzscVar, zzl(value));
            return;
        }
        Object zze = zze(zzscVar);
        if (zze != null) {
            if (z) {
                throw null;
            }
            this.zza.put(zzscVar, zze instanceof zztx ? zzscVar.zzc((zztx) zze, (zztx) value) : zzscVar.zzb(((zzts) zze).zzag(), (zzts) value).zzk());
        } else {
            this.zza.put(zzscVar, zzl(value));
            if (z) {
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
        int i;
        int zzA;
        int zzA2;
        zzsc zzscVar = (zzsc) entry.getKey();
        Object value = entry.getValue();
        if (zzscVar.zze() != zzvh.zzi) {
            return zza(zzscVar, value);
        }
        zzscVar.zzg();
        zzscVar.zzf();
        if (value instanceof zztc) {
            int zza = ((zzsc) entry.getKey()).zza();
            int zzA3 = zzqv.zzA(8);
            i = zzA3 + zzA3;
            zzA = zzqv.zzA(16) + zzqv.zzA(zza);
            int zzA4 = zzqv.zzA(24);
            int zza2 = ((zztc) value).zza();
            zzA2 = zzA4 + zzqv.zzA(zza2) + zza2;
        } else {
            int zza3 = ((zzsc) entry.getKey()).zza();
            int zzA5 = zzqv.zzA(8);
            i = zzA5 + zzA5;
            zzA = zzqv.zzA(16) + zzqv.zzA(zza3);
            zzA2 = zzqv.zzA(24) + zzqv.zzx((zzts) value);
        }
        return i + zzA + zzA2;
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
        int i = 0;
        for (int i2 = 0; i2 < zzc; i2++) {
            i += zzo(zzuoVar.zzg(i2));
        }
        Iterator it = zzuoVar.zzd().iterator();
        while (it.hasNext()) {
            i += zzo((Map.Entry) it.next());
        }
        return i;
    }

    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzsd clone() {
        zzsd zzsdVar = new zzsd();
        zzuo zzuoVar = this.zza;
        int zzc = zzuoVar.zzc();
        for (int i = 0; i < zzc; i++) {
            Map.Entry zzg = zzuoVar.zzg(i);
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
        for (int i = 0; i < zzc; i++) {
            Object value = zzuoVar.zzg(i).getValue();
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
        for (int i = 0; i < zzc; i++) {
            zzm(zzuoVar.zzg(i));
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
    
        if (r1 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if ((r7 instanceof com.google.android.recaptcha.internal.zztc) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(zzsc zzscVar, Object obj) {
        boolean z;
        zzscVar.zzg();
        zzscVar.zzd();
        byte[] bArr = zzsv.zzb;
        obj.getClass();
        zzvg zzvgVar = zzvg.zza;
        zzvh zzvhVar = zzvh.zza;
        switch (r1.zza()) {
            case zza:
                z = obj instanceof Integer;
                break;
            case zzb:
                z = obj instanceof Long;
                break;
            case zzc:
                z = obj instanceof Float;
                break;
            case zzd:
                z = obj instanceof Double;
                break;
            case zze:
                z = obj instanceof Boolean;
                break;
            case zzf:
                z = obj instanceof String;
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
        for (int i = 0; i < zzc; i++) {
            if (!zzn(zzuoVar.zzg(i))) {
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

    private zzsd(boolean z) {
        zzg();
        zzg();
    }
}
