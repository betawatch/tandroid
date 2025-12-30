package com.google.android.recaptcha.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzqv extends zzqe {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzqv.class.getName());
    private static final boolean zzd = zzvc.zzx();
    zzqw zza;

    private zzqv() {
        throw null;
    }

    /* synthetic */ zzqv(zzqu zzquVar) {
    }

    public static int zzA(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int zzB(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    @Deprecated
    static int zzw(int i, zzts zztsVar, zzug zzugVar) {
        int zzA = zzA(i << 3);
        return zzA + zzA + ((zzpw) zztsVar).zza(zzugVar);
    }

    public static int zzx(zzts zztsVar) {
        int zzo = zztsVar.zzo();
        return zzA(zzo) + zzo;
    }

    static int zzy(zzts zztsVar, zzug zzugVar) {
        int zza = ((zzpw) zztsVar).zza(zzugVar);
        return zzA(zza) + zza;
    }

    public static int zzz(String str) {
        int length;
        try {
            length = zzvf.zzc(str);
        } catch (zzve unused) {
            length = str.getBytes(zzsv.zza).length;
        }
        return zzA(length) + length;
    }

    public final void zzC() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zzD(String str, zzve zzveVar) {
        zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzveVar);
        byte[] bytes = str.getBytes(zzsv.zza);
        try {
            int length = bytes.length;
            zzt(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzqt(e);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b);

    public abstract void zzd(int i, boolean z);

    public abstract void zze(int i, zzqm zzqmVar);

    public abstract void zzf(int i, int i2);

    public abstract void zzg(int i);

    public abstract void zzh(int i, long j);

    public abstract void zzi(long j);

    public abstract void zzj(int i, int i2);

    public abstract void zzk(int i);

    public abstract void zzl(byte[] bArr, int i, int i2);

    abstract void zzm(int i, zzts zztsVar, zzug zzugVar);

    public abstract void zzn(int i, zzts zztsVar);

    public abstract void zzo(int i, zzqm zzqmVar);

    public abstract void zzp(int i, String str);

    public abstract void zzr(int i, int i2);

    public abstract void zzs(int i, int i2);

    public abstract void zzt(int i);

    public abstract void zzu(int i, long j);

    public abstract void zzv(long j);
}
