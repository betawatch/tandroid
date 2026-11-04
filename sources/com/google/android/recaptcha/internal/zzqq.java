package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    public static int zzF(int i3) {
        return (i3 >>> 1) ^ (-(i3 & 1));
    }

    public static long zzG(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    public static zzqq zzH(byte[] bArr, int i3, int i10, boolean z10) {
        zzqn zzqnVar = new zzqn(bArr, 0, 0, false, null);
        try {
            zzqnVar.zze(0);
            return zzqnVar;
        } catch (zzsx e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract void zzA(int i3);

    public abstract boolean zzC();

    public abstract boolean zzD();

    public abstract boolean zzE(int i3);

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

    public abstract int zze(int i3);

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

    public abstract void zzz(int i3);

    public /* synthetic */ zzqq(zzqp zzqpVar) {
    }
}
