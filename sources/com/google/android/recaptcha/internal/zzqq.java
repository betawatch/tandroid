package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class zzqq {
    public static final /* synthetic */ int zze = 0;
    private static volatile int zzf = 100;
    int zza;
    int zzb;
    final int zzc = zzf;
    zzqr zzd;

    private zzqq() {
    }

    public static int zzF(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static long zzG(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    public static zzqq zzH(byte[] bArr, int i10, int i11, boolean z4) {
        zzqn zzqnVar = new zzqn(bArr, 0, 0, false, null);
        try {
            zzqnVar.zze(0);
            return zzqnVar;
        } catch (zzsx e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public abstract void zzA(int i10);

    public abstract boolean zzC();

    public abstract boolean zzD();

    public abstract boolean zzE(int i10);

    public final void zzI() {
        if (this.zza + this.zzb >= this.zzc) {
            throw new zzsx("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void zzJ() {
        if (this.zzb == 0) {
            zzz(0);
        }
    }

    public final void zzK() {
        int zzm;
        do {
            zzm = zzm();
            if (zzm == 0) {
                return;
            }
            zzI();
            this.zzb++;
            this.zzb--;
        } while (zzE(zzm));
    }

    public abstract double zzb();

    public abstract float zzc();

    public abstract int zzd();

    public abstract int zze(int i10);

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzk();

    public abstract int zzl();

    public abstract int zzm();

    public abstract int zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract long zzt();

    public abstract long zzu();

    public abstract long zzv();

    public abstract zzqm zzw();

    public abstract String zzx();

    public abstract String zzy();

    public abstract void zzz(int i10);

    public /* synthetic */ zzqq(zzqp zzqpVar) {
    }
}
