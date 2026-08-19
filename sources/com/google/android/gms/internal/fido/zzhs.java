package com.google.android.gms.internal.fido;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.telegram.tgnet.ConnectionsManager;

/* loaded from: classes.dex */
public final class zzhs implements Closeable, AutoCloseable {
    private final InputStream zza;
    private zzhr zzb;
    private final byte[] zzc = new byte[8];
    private final zzht zzd = zzht.zza();

    public zzhs(InputStream inputStream) {
        this.zza = inputStream;
    }

    private final long zzh() {
        if (this.zzb.zza() < 24) {
            long zza = this.zzb.zza();
            this.zzb = null;
            return zza;
        }
        if (this.zzb.zza() == 24) {
            int read = this.zza.read();
            if (read == -1) {
                throw new EOFException();
            }
            this.zzb = null;
            return read & 255;
        }
        if (this.zzb.zza() == 25) {
            zzk(this.zzc, 2);
            byte[] bArr = this.zzc;
            return (bArr[1] & 255) | ((bArr[0] & 255) << 8);
        }
        if (this.zzb.zza() == 26) {
            zzk(this.zzc, 4);
            return ((r4[1] & 255) << 16) | ((this.zzc[0] & 255) << 24) | ((r4[2] & 255) << 8) | (r4[3] & 255);
        }
        if (this.zzb.zza() != 27) {
            throw new IOException(String.format("invalid additional information %s for major type %s", Byte.valueOf(this.zzb.zza()), Integer.valueOf(this.zzb.zzc())));
        }
        zzk(this.zzc, 8);
        return ((r4[1] & 255) << 48) | ((this.zzc[0] & 255) << 56) | ((r4[2] & 255) << 40) | ((r4[3] & 255) << 32) | ((r4[4] & 255) << 24) | ((r4[5] & 255) << 16) | ((r4[6] & 255) << 8) | (r4[7] & 255);
    }

    private final void zzi() {
        zzd();
        if (this.zzb.zza() == 31) {
            throw new IllegalStateException(String.format("expected definite length but found %s", Byte.valueOf(this.zzb.zza())));
        }
    }

    private final void zzj(byte b) {
        zzd();
        if (this.zzb.zzb() != b) {
            throw new IllegalStateException(String.format("expected major type %s but found %s", Integer.valueOf((b >> 5) & 7), Integer.valueOf(this.zzb.zzc())));
        }
    }

    private final void zzk(byte[] bArr, int i) {
        int i2 = 0;
        while (i2 != i) {
            int read = this.zza.read(bArr, i2, i - i2);
            if (read == -1) {
                throw new EOFException();
            }
            i2 += read;
        }
        this.zzb = null;
    }

    private final byte[] zzl() {
        zzi();
        long zzh = zzh();
        if (zzh < 0 || zzh > 2147483647L) {
            throw new UnsupportedOperationException(String.format("the maximum supported byte/text string length is %s bytes", Integer.valueOf(ConnectionsManager.DEFAULT_DATACENTER_ID)));
        }
        if (this.zza.available() < zzh) {
            throw new EOFException();
        }
        int i = (int) zzh;
        byte[] bArr = new byte[i];
        zzk(bArr, i);
        return bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza.close();
        this.zzd.zzb();
    }

    public final long zza() {
        zzj(Byte.MIN_VALUE);
        zzi();
        long zzh = zzh();
        if (zzh < 0) {
            throw new UnsupportedOperationException(String.format("the maximum supported array length is %s", Long.MAX_VALUE));
        }
        if (zzh > 0) {
            this.zzd.zzg(zzh);
        }
        return zzh;
    }

    public final long zzb() {
        boolean z;
        zzd();
        if (this.zzb.zzb() == 0) {
            z = true;
        } else {
            if (this.zzb.zzb() != 32) {
                throw new IllegalStateException(String.format("expected major type 0 or 1 but found %s", Integer.valueOf(this.zzb.zzc())));
            }
            z = false;
        }
        long zzh = zzh();
        if (zzh >= 0) {
            return z ? zzh : ~zzh;
        }
        throw new UnsupportedOperationException(String.format("the maximum supported unsigned/negative integer is %s", Long.MAX_VALUE));
    }

    public final long zzc() {
        zzj((byte) -96);
        zzi();
        long zzh = zzh();
        if (zzh < 0 || zzh > 4611686018427387903L) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (zzh > 0) {
            this.zzd.zzg(zzh + zzh);
        }
        return zzh;
    }

    public final zzhr zzd() {
        if (this.zzb == null) {
            int read = this.zza.read();
            if (read == -1) {
                this.zzd.zzb();
                return null;
            }
            zzhr zzhrVar = new zzhr(read);
            this.zzb = zzhrVar;
            byte zzb = zzhrVar.zzb();
            if (zzb != Byte.MIN_VALUE && zzb != -96 && zzb != -64) {
                if (zzb != -32) {
                    if (zzb != 0 && zzb != 32) {
                        if (zzb == 64) {
                            this.zzd.zze(-1L);
                        } else {
                            if (zzb != 96) {
                                throw new IllegalStateException(String.format("invalid major type: %s", Integer.valueOf(this.zzb.zzc())));
                            }
                            this.zzd.zze(-2L);
                        }
                        this.zzd.zzf();
                    }
                } else if (this.zzb.zza() == 31) {
                    this.zzd.zzc();
                }
            }
            this.zzd.zzd();
            this.zzd.zzf();
        }
        return this.zzb;
    }

    public final String zze() {
        zzj((byte) 96);
        return new String(zzl(), StandardCharsets.UTF_8);
    }

    public final boolean zzf() {
        zzj((byte) -32);
        if (this.zzb.zza() > 24) {
            throw new IllegalStateException("expected simple value");
        }
        int zzh = (int) zzh();
        if (zzh == 20) {
            return false;
        }
        if (zzh == 21) {
            return true;
        }
        throw new IllegalStateException(String.format("expected FALSE or TRUE", new Object[0]));
    }

    public final byte[] zzg() {
        zzj((byte) 64);
        return zzl();
    }
}
