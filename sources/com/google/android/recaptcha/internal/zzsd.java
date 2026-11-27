package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzsd {
    private static final zzsd zzb = new zzsd(true);
    final zzuo zza = new zzuj();
    private boolean zzc;
    private boolean zzd;

    private zzsd(boolean z) {
        zzg();
        zzg();
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
            zzA2 <<= 1;
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
                i = zzqv.zzA((intValue << 1) ^ (intValue >> 31));
                return zzA2 + i;
            case 17:
                long longValue = ((Long) obj).longValue();
                i = zzqv.zzB((longValue << 1) ^ (longValue >> 63));
                return zzA2 + i;
            default:
                xi4.l("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
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
                grb.i("Lazy fields must be message-valued");
                return;
            } else {
                this.zza.put(zzscVar, zzl(value));
                return;
            }
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
        lq5.j("Wrong object type used with protocol message reflection.");
        return false;
    }

    private static final int zzo(Map.Entry entry) {
        int zzA;
        int zzA2;
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
            zzA = zzqv.zzA(8) << 1;
            zzA2 = zzqv.zzA(zza) + zzqv.zzA(16);
            int zzA3 = zzqv.zzA(24);
            int zza2 = ((zztc) value).zza();
            zzx = dze.e(zza2, zza2, zzA3);
        } else {
            int zza3 = ((zzsc) entry.getKey()).zza();
            zzA = zzqv.zzA(8) << 1;
            zzA2 = zzqv.zzA(zza3) + zzqv.zzA(16);
            zzx = zzqv.zzx((zzts) value) + zzqv.zzA(24);
        }
        return zzA + zzA2 + zzx;
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
    
        if ((r6 instanceof com.google.android.recaptcha.internal.zzsp) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if ((r6 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if ((r6 instanceof com.google.android.recaptcha.internal.zztc) == false) goto L32;
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
        switch (r0.zza()) {
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

    private zzsd() {
    }
}
