package com.google.android.recaptcha.internal;

import a4.w;
import j7.l1;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class zzqm implements Iterable, Serializable {
    public static final zzqm zzb = new zzqk(zzsv.zzb);
    private int zza = 0;

    static {
        int i10 = zzqa.zza;
    }

    public static int zzj(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(l1.l(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(w.k(i10, i11, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(w.k(i11, i12, "End index: ", " >= "));
    }

    public static zzqm zzl(byte[] bArr, int i10, int i11) {
        zzj(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzqk(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.zza;
        if (i10 == 0) {
            int zzd = zzd();
            i10 = zzf(zzd, 0, zzd);
            if (i10 == 0) {
                i10 = 1;
            }
            this.zza = i10;
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzqf(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzd = zzd();
        String zza = zzd() <= 50 ? zzuq.zza(this) : zzuq.zza(zzg(0, 47)).concat("...");
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(zzd);
        sb2.append(" contents=\"");
        return w.q(sb2, zza, "\">");
    }

    public abstract byte zza(int i10);

    public abstract byte zzb(int i10);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i10, int i11, int i12);

    public abstract int zzf(int i10, int i11, int i12);

    public abstract zzqm zzg(int i10, int i11);

    public abstract String zzh(Charset charset);

    public abstract void zzi(zzqe zzqeVar);

    public final int zzk() {
        return this.zza;
    }

    public final String zzm() {
        return zzd() == 0 ? "" : zzh(zzsv.zza);
    }

    public final boolean zzn() {
        return zzd() == 0;
    }

    public final byte[] zzo() {
        int zzd = zzd();
        if (zzd == 0) {
            return zzsv.zzb;
        }
        byte[] bArr = new byte[zzd];
        zze(bArr, 0, 0, zzd);
        return bArr;
    }
}
