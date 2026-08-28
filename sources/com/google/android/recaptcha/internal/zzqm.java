package com.google.android.recaptcha.internal;

import aa.d;
import j3.r0;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class zzqm implements Iterable, Serializable {
    public static final zzqm zzb = new zzqk(zzsv.zzb);
    private int zza = 0;

    static {
        int i9 = zzqa.zza;
    }

    public static int zzj(int i9, int i10, int i11) {
        int i12 = i10 - i9;
        if ((i9 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i9 < 0) {
            throw new IndexOutOfBoundsException(r0.m(i9, "Beginning index: ", " < 0"));
        }
        if (i10 < i9) {
            throw new IndexOutOfBoundsException(d.k(i9, i10, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(d.k(i10, i11, "End index: ", " >= "));
    }

    public static zzqm zzl(byte[] bArr, int i9, int i10) {
        zzj(i9, i9 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i9, bArr2, 0, i10);
        return new zzqk(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i9 = this.zza;
        if (i9 == 0) {
            int zzd = zzd();
            i9 = zzf(zzd, 0, zzd);
            if (i9 == 0) {
                i9 = 1;
            }
            this.zza = i9;
        }
        return i9;
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
        return d.r(sb2, zza, "\">");
    }

    public abstract byte zza(int i9);

    public abstract byte zzb(int i9);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i9, int i10, int i11);

    public abstract int zzf(int i9, int i10, int i11);

    public abstract zzqm zzg(int i9, int i10);

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
