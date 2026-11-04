package com.google.android.recaptcha.internal;

import a1.g;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class zzqm implements Iterable, Serializable {
    public static final zzqm zzb = new zzqk(zzsv.zzb);
    private int zza = 0;

    static {
        int i3 = zzqa.zza;
    }

    public static int zzj(int i3, int i10, int i11) {
        int i12 = i10 - i3;
        if ((i3 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException(p1.j(i3, "Beginning index: ", " < 0"));
        }
        if (i10 < i3) {
            throw new IndexOutOfBoundsException(g.n(i3, i10, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(g.n(i10, i11, "End index: ", " >= "));
    }

    public static zzqm zzl(byte[] bArr, int i3, int i10) {
        zzj(i3, i3 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i3, bArr2, 0, i10);
        return new zzqk(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i3 = this.zza;
        if (i3 == 0) {
            int zzd = zzd();
            i3 = zzf(zzd, 0, zzd);
            if (i3 == 0) {
                i3 = 1;
            }
            this.zza = i3;
        }
        return i3;
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
        return g.s(sb2, zza, "\">");
    }

    public abstract byte zza(int i3);

    public abstract byte zzb(int i3);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i3, int i10, int i11);

    public abstract int zzf(int i3, int i10, int i11);

    public abstract zzqm zzg(int i3, int i10);

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
