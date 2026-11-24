package com.google.android.recaptcha.internal;

import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzqn extends zzqq {
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    public /* synthetic */ zzqn(byte[] bArr, int i, int i2, boolean z, zzqp zzqpVar) {
        super(null);
        this.zzk = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.zzf = bArr;
        this.zzg = 0;
        this.zzi = 0;
    }

    private final void zzL() {
        int i = this.zzg + this.zzh;
        this.zzg = i;
        int i2 = this.zzk;
        if (i <= i2) {
            this.zzh = 0;
            return;
        }
        int i3 = i - i2;
        this.zzh = i3;
        this.zzg = i - i3;
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final void zzA(int i) {
        this.zzk = i;
        zzL();
    }

    public final void zzB(int i) {
        if (i < 0) {
            i2d.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return;
        }
        int i2 = this.zzg;
        int i3 = this.zzi;
        if (i <= i2 - i3) {
            this.zzi = i3 + i;
        } else {
            i2d.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final boolean zzC() {
        return this.zzi == this.zzg;
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final boolean zzD() {
        return zzr() != 0;
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final boolean zzE(int i) {
        int i2 = i & 7;
        if (i2 == 0) {
            if (this.zzg - this.zzi < 10) {
                for (int i3 = 0; i3 < 10; i3++) {
                    if (zza() < 0) {
                    }
                }
                i2d.j("CodedInputStream encountered a malformed varint.");
                return false;
            }
            for (int i4 = 0; i4 < 10; i4++) {
                byte[] bArr = this.zzf;
                int i5 = this.zzi;
                this.zzi = i5 + 1;
                if (bArr[i5] < 0) {
                }
            }
            i2d.j("CodedInputStream encountered a malformed varint.");
            return false;
            return true;
        }
        if (i2 == 1) {
            zzB(8);
            return true;
        }
        if (i2 == 2) {
            zzB(zzj());
            return true;
        }
        if (i2 == 3) {
            zzK();
            zzz(((i >>> 3) << 3) | 4);
            return true;
        }
        if (i2 == 4) {
            zzJ();
            return false;
        }
        if (i2 == 5) {
            zzB(4);
            return true;
        }
        i2d.a();
        return false;
    }

    public final byte zza() {
        int i = this.zzi;
        if (i == this.zzg) {
            i2d.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return (byte) 0;
        }
        byte[] bArr = this.zzf;
        this.zzi = i + 1;
        return bArr[i];
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final double zzb() {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final float zzc() {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final int zzd() {
        return this.zzi;
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final int zze(int i) {
        if (i < 0) {
            i2d.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = i + this.zzi;
        if (i2 < 0) {
            i2d.j("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        int i3 = this.zzk;
        if (i2 > i3) {
            i2d.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.zzk = i2;
        zzL();
        return i3;
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final int zzf() {
        return zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final int zzg() {
        return zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final int zzh() {
        return zzj();
    }

    public final int zzi() {
        int i = this.zzi;
        if (this.zzg - i < 4) {
            i2d.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        byte[] bArr = this.zzf;
        this.zzi = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        if (r2[r3] >= 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzj() {
        int i;
        int i2 = this.zzi;
        int i3 = this.zzg;
        if (i3 != i2) {
            byte[] bArr = this.zzf;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzi = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        i5 = i2 + 4;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i5];
                            i = (i9 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i5 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i5] < 0) {
                                        i5 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i5] < 0) {
                                                i5 = i2 + 10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i5 = i7;
                }
                this.zzi = i5;
                return i;
            }
        }
        return (int) zzs();
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final int zzk() {
        return zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final int zzl() {
        return zzqq.zzF(zzj());
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final int zzm() {
        if (zzC()) {
            this.zzj = 0;
            return 0;
        }
        int zzj = zzj();
        this.zzj = zzj;
        if ((zzj >>> 3) != 0) {
            return zzj;
        }
        i2d.j("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final int zzn() {
        return zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final long zzo() {
        return zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final long zzp() {
        return zzr();
    }

    public final long zzq() {
        int i = this.zzi;
        if (this.zzg - i < 8) {
            i2d.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0L;
        }
        byte[] bArr = this.zzf;
        this.zzi = i + 8;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ad, code lost:
    
        if (r2[r3] >= 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzr() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.zzi;
        int i3 = this.zzg;
        if (i3 != i2) {
            byte[] bArr = this.zzf;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzi = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 >= 0) {
                    int i7 = i2 + 3;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        j4 = i8 ^ 16256;
                    } else {
                        i5 = i2 + 4;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i2 + 5;
                            long j5 = i9 ^ (bArr[i5] << 28);
                            if (j5 < 0) {
                                i5 = i2 + 6;
                                long j6 = j5 ^ (bArr[i7] << 35);
                                if (j6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i7 = i2 + 7;
                                    j5 = j6 ^ (bArr[i5] << 42);
                                    if (j5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i5 = i2 + 8;
                                        j6 = j5 ^ (bArr[i7] << 49);
                                        if (j6 >= 0) {
                                            long j7 = (j6 ^ (bArr[i5] << 56)) ^ 71499008037633920L;
                                            i5 = j7 < 0 ? i2 + 10 : i2 + 9;
                                            j = j7;
                                            this.zzi = i5;
                                            return j;
                                        }
                                        j2 = -558586000294016L;
                                    }
                                }
                                j = j2 ^ j6;
                                this.zzi = i5;
                                return j;
                            }
                            j3 = 266354560;
                            j4 = j3 ^ j5;
                        }
                    }
                    i5 = i7;
                    j = j4;
                    this.zzi = i5;
                    return j;
                }
                i = i6 ^ (-128);
                j = i;
                this.zzi = i5;
                return j;
            }
        }
        return zzs();
    }

    public final long zzs() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r5 & Byte.MAX_VALUE) << i;
            if ((zza() & 128) == 0) {
                return j;
            }
        }
        i2d.j("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final long zzt() {
        return zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final long zzu() {
        return zzqq.zzG(zzr());
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final long zzv() {
        return zzr();
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final zzqm zzw() {
        int zzj = zzj();
        if (zzj > 0) {
            int i = this.zzg;
            int i2 = this.zzi;
            if (zzj <= i - i2) {
                zzqm zzl = zzqm.zzl(this.zzf, i2, zzj);
                this.zzi += zzj;
                return zzl;
            }
        }
        if (zzj == 0) {
            return zzqm.zzb;
        }
        if (zzj <= 0) {
            i2d.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        int i3 = this.zzg;
        int i4 = this.zzi;
        if (zzj > i3 - i4) {
            i2d.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        int i5 = zzj + i4;
        this.zzi = i5;
        byte[] copyOfRange = Arrays.copyOfRange(this.zzf, i4, i5);
        zzqm zzqmVar = zzqm.zzb;
        return new zzqk(copyOfRange);
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final String zzx() {
        int zzj = zzj();
        if (zzj > 0) {
            int i = this.zzg;
            int i2 = this.zzi;
            if (zzj <= i - i2) {
                String str = new String(this.zzf, i2, zzj, zzsv.zza);
                this.zzi += zzj;
                return str;
            }
        }
        if (zzj == 0) {
            return "";
        }
        if (zzj < 0) {
            i2d.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        i2d.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final String zzy() {
        int zzj = zzj();
        if (zzj > 0) {
            int i = this.zzg;
            int i2 = this.zzi;
            if (zzj <= i - i2) {
                String zzd = zzvf.zzd(this.zzf, i2, zzj);
                this.zzi += zzj;
                return zzd;
            }
        }
        if (zzj == 0) {
            return "";
        }
        if (zzj <= 0) {
            i2d.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        i2d.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final void zzz(int i) {
        if (this.zzj == i) {
            return;
        }
        i2d.j("Protocol message end-group tag did not match expected tag.");
    }
}
