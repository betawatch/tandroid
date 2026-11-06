package com.google.android.recaptcha.internal;

import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
final class zzqn extends zzqq {
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    public /* synthetic */ zzqn(byte[] bArr, int i7, int i10, boolean z9, zzqp zzqpVar) {
        super(null);
        this.zzk = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.zzf = bArr;
        this.zzg = 0;
        this.zzi = 0;
    }

    private final void zzL() {
        int i7 = this.zzg + this.zzh;
        this.zzg = i7;
        int i10 = this.zzk;
        if (i7 <= i10) {
            this.zzh = 0;
            return;
        }
        int i11 = i7 - i10;
        this.zzh = i11;
        this.zzg = i7 - i11;
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final void zzA(int i7) {
        this.zzk = i7;
        zzL();
    }

    public final void zzB(int i7) {
        if (i7 >= 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (i7 <= i10 - i11) {
                this.zzi = i11 + i7;
                return;
            }
        }
        if (i7 >= 0) {
            throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
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
    public final boolean zzE(int i7) {
        int i10 = i7 & 7;
        int i11 = 0;
        if (i10 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i11 < 10) {
                    if (zza() < 0) {
                        i11++;
                    }
                }
                throw new zzsx("CodedInputStream encountered a malformed varint.");
            }
            while (i11 < 10) {
                byte[] bArr = this.zzf;
                int i12 = this.zzi;
                this.zzi = i12 + 1;
                if (bArr[i12] < 0) {
                    i11++;
                }
            }
            throw new zzsx("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i10 == 1) {
            zzB(8);
            return true;
        }
        if (i10 == 2) {
            zzB(zzj());
            return true;
        }
        if (i10 == 3) {
            zzK();
            zzz(((i7 >>> 3) << 3) | 4);
            return true;
        }
        if (i10 == 4) {
            zzJ();
            return false;
        }
        if (i10 != 5) {
            throw new zzsw("Protocol message tag had invalid wire type.");
        }
        zzB(4);
        return true;
    }

    public final byte zza() {
        int i7 = this.zzi;
        if (i7 == this.zzg) {
            throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzf;
        this.zzi = i7 + 1;
        return bArr[i7];
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
    public final int zze(int i7) {
        if (i7 < 0) {
            throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i10 = i7 + this.zzi;
        if (i10 < 0) {
            throw new zzsx("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i11 = this.zzk;
        if (i10 > i11) {
            throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzk = i10;
        zzL();
        return i11;
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
        int i7 = this.zzi;
        if (this.zzg - i7 < 4) {
            throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzf;
        this.zzi = i7 + 4;
        int i10 = bArr[i7] & 255;
        int i11 = bArr[i7 + 1] & 255;
        int i12 = bArr[i7 + 2] & 255;
        return ((bArr[i7 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public final int zzj() {
        int i7;
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (i11 != i10) {
            byte[] bArr = this.zzf;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.zzi = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    i7 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        i7 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            i7 = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b11 = bArr[i17];
                            int i19 = (i18 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i7 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i7 = i19;
                            }
                            i7 = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.zzi = i13;
                return i7;
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
        throw new zzsx("Protocol message contained an invalid tag (zero).");
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
        int i7 = this.zzi;
        if (this.zzg - i7 < 8) {
            throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzf;
        this.zzi = i7 + 8;
        long j3 = bArr[i7];
        long j10 = bArr[i7 + 2];
        long j11 = bArr[i7 + 3];
        return ((bArr[i7 + 6] & 255) << 48) | (j3 & 255) | ((bArr[i7 + 1] & 255) << 8) | ((j10 & 255) << 16) | ((j11 & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 7] & 255) << 56);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b7, code lost:
    
        if (r2[r5] >= 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzr() {
        long j3;
        long j10;
        long j11;
        int i7 = this.zzi;
        int i10 = this.zzg;
        if (i10 != i7) {
            byte[] bArr = this.zzf;
            int i11 = i7 + 1;
            byte b10 = bArr[i7];
            if (b10 >= 0) {
                this.zzi = i11;
                return b10;
            }
            if (i10 - i11 >= 9) {
                int i12 = i7 + 2;
                int i13 = (bArr[i11] << 7) ^ b10;
                if (i13 < 0) {
                    j10 = i13 ^ (-128);
                } else {
                    int i14 = i7 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        j10 = i15 ^ 16256;
                    } else {
                        int i16 = i7 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            long j12 = (-2080896) ^ i17;
                            i12 = i16;
                            j10 = j12;
                        } else {
                            i14 = i7 + 5;
                            long j13 = (bArr[i16] << 28) ^ i17;
                            if (j13 >= 0) {
                                j10 = j13 ^ 266354560;
                            } else {
                                i12 = i7 + 6;
                                long j14 = (bArr[i14] << 35) ^ j13;
                                if (j14 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    int i18 = i7 + 7;
                                    long j15 = j14 ^ (bArr[i12] << 42);
                                    if (j15 >= 0) {
                                        j10 = 4363953127296L ^ j15;
                                    } else {
                                        i12 = i7 + 8;
                                        j14 = j15 ^ (bArr[i18] << 49);
                                        if (j14 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i18 = i7 + 9;
                                            j3 = (j14 ^ (bArr[i12] << 56)) ^ 71499008037633920L;
                                            if (j3 < 0) {
                                                i12 = i7 + 10;
                                            } else {
                                                j10 = j3;
                                            }
                                        }
                                    }
                                    i12 = i18;
                                }
                                j3 = j14 ^ j11;
                                j10 = j3;
                            }
                        }
                    }
                    i12 = i14;
                }
                this.zzi = i12;
                return j10;
            }
        }
        return zzs();
    }

    public final long zzs() {
        long j3 = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            j3 |= (r3 & Byte.MAX_VALUE) << i7;
            if ((zza() & 128) == 0) {
                return j3;
            }
        }
        throw new zzsx("CodedInputStream encountered a malformed varint.");
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
            int i7 = this.zzg;
            int i10 = this.zzi;
            if (zzj <= i7 - i10) {
                zzqm zzl = zzqm.zzl(this.zzf, i10, zzj);
                this.zzi += zzj;
                return zzl;
            }
        }
        if (zzj == 0) {
            return zzqm.zzb;
        }
        if (zzj > 0) {
            int i11 = this.zzg;
            int i12 = this.zzi;
            if (zzj <= i11 - i12) {
                int i13 = zzj + i12;
                this.zzi = i13;
                byte[] copyOfRange = Arrays.copyOfRange(this.zzf, i12, i13);
                zzqm zzqmVar = zzqm.zzb;
                return new zzqk(copyOfRange);
            }
        }
        if (zzj <= 0) {
            throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final String zzx() {
        int zzj = zzj();
        if (zzj > 0) {
            int i7 = this.zzg;
            int i10 = this.zzi;
            if (zzj <= i7 - i10) {
                String str = new String(this.zzf, i10, zzj, zzsv.zza);
                this.zzi += zzj;
                return str;
            }
        }
        if (zzj == 0) {
            return "";
        }
        if (zzj < 0) {
            throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final String zzy() {
        int zzj = zzj();
        if (zzj > 0) {
            int i7 = this.zzg;
            int i10 = this.zzi;
            if (zzj <= i7 - i10) {
                String zzd = zzvf.zzd(this.zzf, i10, zzj);
                this.zzi += zzj;
                return zzd;
            }
        }
        if (zzj == 0) {
            return "";
        }
        if (zzj <= 0) {
            throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final void zzz(int i7) {
        if (this.zzj != i7) {
            throw new zzsx("Protocol message end-group tag did not match expected tag.");
        }
    }
}
