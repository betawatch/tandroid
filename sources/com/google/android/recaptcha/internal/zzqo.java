package com.google.android.recaptcha.internal;

import j7.l1;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
final class zzqo extends zzqq {
    private final InputStream zzf;
    private final byte[] zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    public /* synthetic */ zzqo(InputStream inputStream, int i10, zzqp zzqpVar) {
        super(null);
        this.zzm = ConnectionsManager.DEFAULT_DATACENTER_ID;
        byte[] bArr = zzsv.zzb;
        this.zzf = inputStream;
        this.zzg = new byte[4096];
        this.zzh = 0;
        this.zzj = 0;
        this.zzl = 0;
    }

    private final List zzL(int i10) {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int min = Math.min(i10, 4096);
            byte[] bArr = new byte[min];
            int i11 = 0;
            while (i11 < min) {
                int read = this.zzf.read(bArr, i11, min - i11);
                if (read == -1) {
                    throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzl += read;
                i11 += read;
            }
            i10 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzM() {
        int i10 = this.zzh + this.zzi;
        this.zzh = i10;
        int i11 = this.zzl + i10;
        int i12 = this.zzm;
        if (i11 <= i12) {
            this.zzi = 0;
            return;
        }
        int i13 = i11 - i12;
        this.zzi = i13;
        this.zzh = i10 - i13;
    }

    private final void zzN(int i10) {
        if (zzO(i10)) {
            return;
        }
        if (i10 <= (ConnectionsManager.DEFAULT_DATACENTER_ID - this.zzl) - this.zzj) {
            throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzsx("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    private final boolean zzO(int i10) {
        int i11 = this.zzj;
        int i12 = i11 + i10;
        int i13 = this.zzh;
        if (i12 <= i13) {
            throw new IllegalStateException(l1.l(i10, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i14 = this.zzl;
        if (i10 > (ConnectionsManager.DEFAULT_DATACENTER_ID - i14) - i11 || i14 + i11 + i10 > this.zzm) {
            return false;
        }
        if (i11 > 0) {
            if (i13 > i11) {
                byte[] bArr = this.zzg;
                System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
            }
            i14 = this.zzl + i11;
            this.zzl = i14;
            i13 = this.zzh - i11;
            this.zzh = i13;
            this.zzj = 0;
        }
        try {
            int read = this.zzf.read(this.zzg, i13, Math.min(4096 - i13, (ConnectionsManager.DEFAULT_DATACENTER_ID - i14) - i13));
            if (read == 0 || read < -1 || read > 4096) {
                throw new IllegalStateException(String.valueOf(this.zzf.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.zzh += read;
            zzM();
            if (this.zzh >= i10) {
                return true;
            }
            return zzO(i10);
        } catch (zzsx e10) {
            e10.zza();
            throw e10;
        }
    }

    private final byte[] zzP(int i10, boolean z10) {
        byte[] zzQ = zzQ(i10);
        if (zzQ != null) {
            return zzQ;
        }
        int i11 = this.zzj;
        int i12 = this.zzh;
        int i13 = i12 - i11;
        this.zzl += i12;
        this.zzj = 0;
        this.zzh = 0;
        List<byte[]> zzL = zzL(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzg, i11, bArr, 0, i13);
        for (byte[] bArr2 : zzL) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        return bArr;
    }

    private final byte[] zzQ(int i10) {
        if (i10 == 0) {
            return zzsv.zzb;
        }
        int i11 = this.zzl;
        int i12 = this.zzj;
        int i13 = i11 + i12 + i10;
        if ((-2147483647) + i13 > 0) {
            throw new zzsx("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i14 = this.zzm;
        if (i13 > i14) {
            zzB((i14 - i11) - i12);
            throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = this.zzh - i12;
        int i16 = i10 - i15;
        if (i16 >= 4096) {
            try {
                if (i16 > this.zzf.available()) {
                    return null;
                }
            } catch (zzsx e10) {
                e10.zza();
                throw e10;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzg, this.zzj, bArr, 0, i15);
        this.zzl += this.zzh;
        this.zzj = 0;
        this.zzh = 0;
        while (i15 < i10) {
            try {
                int read = this.zzf.read(bArr, i15, i10 - i15);
                if (read == -1) {
                    throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzl += read;
                i15 += read;
            } catch (zzsx e11) {
                e11.zza();
                throw e11;
            }
        }
        return bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final void zzA(int i10) {
        this.zzm = i10;
        zzM();
    }

    public final void zzB(int i10) {
        int i11 = this.zzh;
        int i12 = this.zzj;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.zzj = i12 + i10;
            return;
        }
        if (i10 < 0) {
            throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i14 = this.zzl;
        int i15 = i14 + i12;
        int i16 = this.zzm;
        if (i15 + i10 > i16) {
            zzB((i16 - i14) - i12);
            throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i15;
        this.zzh = 0;
        this.zzj = 0;
        while (i13 < i10) {
            try {
                long j10 = i10 - i13;
                try {
                    long skip = this.zzf.skip(j10);
                    if (skip < 0 || skip > j10) {
                        throw new IllegalStateException(String.valueOf(this.zzf.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i13 += (int) skip;
                    }
                } catch (zzsx e10) {
                    e10.zza();
                    throw e10;
                }
            } catch (Throwable th2) {
                this.zzl += i13;
                zzM();
                throw th2;
            }
        }
        this.zzl += i13;
        zzM();
        if (i13 >= i10) {
            return;
        }
        int i17 = this.zzh;
        int i18 = i17 - this.zzj;
        this.zzj = i17;
        zzN(1);
        while (true) {
            int i19 = i10 - i18;
            int i20 = this.zzh;
            if (i19 <= i20) {
                this.zzj = i19;
                return;
            } else {
                i18 += i20;
                this.zzj = i20;
                zzN(1);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final boolean zzC() {
        return this.zzj == this.zzh && !zzO(1);
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final boolean zzD() {
        return zzr() != 0;
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final boolean zzE(int i10) {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zzh - this.zzj < 10) {
                while (i12 < 10) {
                    if (zza() < 0) {
                        i12++;
                    }
                }
                throw new zzsx("CodedInputStream encountered a malformed varint.");
            }
            while (i12 < 10) {
                byte[] bArr = this.zzg;
                int i13 = this.zzj;
                this.zzj = i13 + 1;
                if (bArr[i13] < 0) {
                    i12++;
                }
            }
            throw new zzsx("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i11 == 1) {
            zzB(8);
            return true;
        }
        if (i11 == 2) {
            zzB(zzj());
            return true;
        }
        if (i11 == 3) {
            zzK();
            zzz(((i10 >>> 3) << 3) | 4);
            return true;
        }
        if (i11 == 4) {
            zzJ();
            return false;
        }
        if (i11 != 5) {
            throw new zzsw("Protocol message tag had invalid wire type.");
        }
        zzB(4);
        return true;
    }

    public final byte zza() {
        if (this.zzj == this.zzh) {
            zzN(1);
        }
        byte[] bArr = this.zzg;
        int i10 = this.zzj;
        this.zzj = i10 + 1;
        return bArr[i10];
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
        return this.zzl + this.zzj;
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final int zze(int i10) {
        if (i10 < 0) {
            throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = this.zzl + this.zzj + i10;
        if (i11 < 0) {
            throw new zzsx("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i12 = this.zzm;
        if (i11 > i12) {
            throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzm = i11;
        zzM();
        return i12;
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
        int i10 = this.zzj;
        if (this.zzh - i10 < 4) {
            zzN(4);
            i10 = this.zzj;
        }
        byte[] bArr = this.zzg;
        this.zzj = i10 + 4;
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public final int zzj() {
        int i10;
        int i11 = this.zzj;
        int i12 = this.zzh;
        if (i12 != i11) {
            byte[] bArr = this.zzg;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.zzj = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.zzj = i14;
                return i10;
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
            this.zzk = 0;
            return 0;
        }
        int zzj = zzj();
        this.zzk = zzj;
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
        int i10 = this.zzj;
        if (this.zzh - i10 < 8) {
            zzN(8);
            i10 = this.zzj;
        }
        byte[] bArr = this.zzg;
        this.zzj = i10 + 8;
        long j10 = bArr[i10];
        long j11 = bArr[i10 + 2];
        long j12 = bArr[i10 + 3];
        return ((bArr[i10 + 6] & 255) << 48) | (j10 & 255) | ((bArr[i10 + 1] & 255) << 8) | ((j11 & 255) << 16) | ((j12 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 7] & 255) << 56);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b7, code lost:
    
        if (r2[r5] >= 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzr() {
        long j10;
        long j11;
        long j12;
        int i10 = this.zzj;
        int i11 = this.zzh;
        if (i11 != i10) {
            byte[] bArr = this.zzg;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.zzj = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    j11 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        j11 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            long j13 = (-2080896) ^ i18;
                            i13 = i17;
                            j11 = j13;
                        } else {
                            i15 = i10 + 5;
                            long j14 = (bArr[i17] << 28) ^ i18;
                            if (j14 >= 0) {
                                j11 = j14 ^ 266354560;
                            } else {
                                i13 = i10 + 6;
                                long j15 = (bArr[i15] << 35) ^ j14;
                                if (j15 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    int i19 = i10 + 7;
                                    long j16 = j15 ^ (bArr[i13] << 42);
                                    if (j16 >= 0) {
                                        j11 = 4363953127296L ^ j16;
                                    } else {
                                        i13 = i10 + 8;
                                        j15 = j16 ^ (bArr[i19] << 49);
                                        if (j15 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i19 = i10 + 9;
                                            j10 = (j15 ^ (bArr[i13] << 56)) ^ 71499008037633920L;
                                            if (j10 < 0) {
                                                i13 = i10 + 10;
                                            } else {
                                                j11 = j10;
                                            }
                                        }
                                    }
                                    i13 = i19;
                                }
                                j10 = j15 ^ j12;
                                j11 = j10;
                            }
                        }
                    }
                    i13 = i15;
                }
                this.zzj = i13;
                return j11;
            }
        }
        return zzs();
    }

    public final long zzs() {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            j10 |= (r3 & Byte.MAX_VALUE) << i10;
            if ((zza() & 128) == 0) {
                return j10;
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
        int i10 = this.zzh;
        int i11 = this.zzj;
        if (zzj <= i10 - i11 && zzj > 0) {
            zzqm zzl = zzqm.zzl(this.zzg, i11, zzj);
            this.zzj += zzj;
            return zzl;
        }
        if (zzj == 0) {
            return zzqm.zzb;
        }
        if (zzj < 0) {
            throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] zzQ = zzQ(zzj);
        if (zzQ != null) {
            return zzqm.zzl(zzQ, 0, zzQ.length);
        }
        int i12 = this.zzj;
        int i13 = this.zzh;
        int i14 = i13 - i12;
        this.zzl += i13;
        this.zzj = 0;
        this.zzh = 0;
        List<byte[]> zzL = zzL(zzj - i14);
        byte[] bArr = new byte[zzj];
        System.arraycopy(this.zzg, i12, bArr, 0, i14);
        for (byte[] bArr2 : zzL) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i14, length);
            i14 += length;
        }
        zzqm zzqmVar = zzqm.zzb;
        return new zzqk(bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final String zzx() {
        int zzj = zzj();
        if (zzj > 0) {
            int i10 = this.zzh;
            int i11 = this.zzj;
            if (zzj <= i10 - i11) {
                String str = new String(this.zzg, i11, zzj, zzsv.zza);
                this.zzj += zzj;
                return str;
            }
        }
        if (zzj == 0) {
            return "";
        }
        if (zzj < 0) {
            throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (zzj > this.zzh) {
            return new String(zzP(zzj, false), zzsv.zza);
        }
        zzN(zzj);
        String str2 = new String(this.zzg, this.zzj, zzj, zzsv.zza);
        this.zzj += zzj;
        return str2;
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final String zzy() {
        byte[] zzP;
        int zzj = zzj();
        int i10 = this.zzj;
        int i11 = this.zzh;
        if (zzj <= i11 - i10 && zzj > 0) {
            zzP = this.zzg;
            this.zzj = i10 + zzj;
        } else {
            if (zzj == 0) {
                return "";
            }
            if (zzj < 0) {
                throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i10 = 0;
            if (zzj <= i11) {
                zzN(zzj);
                zzP = this.zzg;
                this.zzj = zzj;
            } else {
                zzP = zzP(zzj, false);
            }
        }
        return zzvf.zzd(zzP, i10, zzj);
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final void zzz(int i10) {
        if (this.zzk != i10) {
            throw new zzsx("Protocol message end-group tag did not match expected tag.");
        }
    }
}
