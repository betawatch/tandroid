package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class zzqm implements Iterable, Serializable {
    public static final zzqm zzb = new zzqk(zzsv.zzb);
    private int zza = 0;

    static {
        int i = zzqa.zza;
    }

    public static int zzj(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            k93.i(tb4.n(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            k93.i(b00.g(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        k93.i(b00.g(i2, i3, "End index: ", " >= "));
        return 0;
    }

    public static zzqm zzl(byte[] bArr, int i, int i2) {
        zzj(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzqk(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zza;
        if (i == 0) {
            int zzd = zzd();
            i = zzf(zzd, 0, zzd);
            if (i == 0) {
                i = 1;
            }
            this.zza = i;
        }
        return i;
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
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(zzd);
        sb.append(" contents=\"");
        return b00.j(sb, zza, "\">");
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i, int i2, int i3);

    public abstract int zzf(int i, int i2, int i3);

    public abstract zzqm zzg(int i, int i2);

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
