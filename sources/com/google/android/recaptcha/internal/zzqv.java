package com.google.android.recaptcha.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class zzqv extends zzqe {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzqv.class.getName());
    private static final boolean zzd = zzvc.zzx();
    zzqw zza;

    private zzqv() {
        throw null;
    }

    public static int zzA(int i9) {
        return (352 - (Integer.numberOfLeadingZeros(i9) * 9)) >>> 6;
    }

    public static int zzB(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    @Deprecated
    public static int zzw(int i9, zzts zztsVar, zzug zzugVar) {
        int zzA = zzA(i9 << 3);
        return ((zzpw) zztsVar).zza(zzugVar) + zzA + zzA;
    }

    public static int zzx(zzts zztsVar) {
        int zzo = zztsVar.zzo();
        return zzA(zzo) + zzo;
    }

    public static int zzy(zzts zztsVar, zzug zzugVar) {
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

    public final void zzD(String str, zzve zzveVar) {
        zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzveVar);
        byte[] bytes = str.getBytes(zzsv.zza);
        try {
            int length = bytes.length;
            zzt(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzqt(e10);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b10);

    public abstract void zzd(int i9, boolean z10);

    public abstract void zze(int i9, zzqm zzqmVar);

    public abstract void zzf(int i9, int i10);

    public abstract void zzg(int i9);

    public abstract void zzh(int i9, long j10);

    public abstract void zzi(long j10);

    public abstract void zzj(int i9, int i10);

    public abstract void zzk(int i9);

    public abstract void zzl(byte[] bArr, int i9, int i10);

    public abstract void zzm(int i9, zzts zztsVar, zzug zzugVar);

    public abstract void zzn(int i9, zzts zztsVar);

    public abstract void zzo(int i9, zzqm zzqmVar);

    public abstract void zzp(int i9, String str);

    public abstract void zzr(int i9, int i10);

    public abstract void zzs(int i9, int i10);

    public abstract void zzt(int i9);

    public abstract void zzu(int i9, long j10);

    public abstract void zzv(long j10);

    public /* synthetic */ zzqv(zzqu zzquVar) {
    }
}
