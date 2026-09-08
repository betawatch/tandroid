package com.google.android.recaptcha.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class zzqv extends zzqe {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzqv.class.getName());
    private static final boolean zzd = zzvc.zzx();
    zzqw zza;

    private zzqv() {
        throw null;
    }

    public static int zzA(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int zzB(long j3) {
        return (640 - (Long.numberOfLeadingZeros(j3) * 9)) >>> 6;
    }

    @Deprecated
    public static int zzw(int i10, zzts zztsVar, zzug zzugVar) {
        int zzA = zzA(i10 << 3);
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
        } catch (IndexOutOfBoundsException e7) {
            throw new zzqt(e7);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b10);

    public abstract void zzd(int i10, boolean z10);

    public abstract void zze(int i10, zzqm zzqmVar);

    public abstract void zzf(int i10, int i11);

    public abstract void zzg(int i10);

    public abstract void zzh(int i10, long j3);

    public abstract void zzi(long j3);

    public abstract void zzj(int i10, int i11);

    public abstract void zzk(int i10);

    public abstract void zzl(byte[] bArr, int i10, int i11);

    public abstract void zzm(int i10, zzts zztsVar, zzug zzugVar);

    public abstract void zzn(int i10, zzts zztsVar);

    public abstract void zzo(int i10, zzqm zzqmVar);

    public abstract void zzp(int i10, String str);

    public abstract void zzr(int i10, int i11);

    public abstract void zzs(int i10, int i11);

    public abstract void zzt(int i10);

    public abstract void zzu(int i10, long j3);

    public abstract void zzv(long j3);

    public /* synthetic */ zzqv(zzqu zzquVar) {
    }
}
