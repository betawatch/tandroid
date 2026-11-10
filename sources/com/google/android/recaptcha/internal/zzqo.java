package com.google.android.recaptcha.internal;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import jg.g;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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

    public /* synthetic */ zzqo(InputStream inputStream, int i7, zzqp zzqpVar) {
        super(null);
        this.zzm = ConnectionsManager.DEFAULT_DATACENTER_ID;
        byte[] bArr = zzsv.zzb;
        this.zzf = inputStream;
        this.zzg = new byte[TLObject.FLAG_12];
        this.zzh = 0;
        this.zzj = 0;
        this.zzl = 0;
    }

    private final List zzL(int i7) {
        ArrayList arrayList = new ArrayList();
        while (i7 > 0) {
            int min = Math.min(i7, TLObject.FLAG_12);
            byte[] bArr = new byte[min];
            int i10 = 0;
            while (i10 < min) {
                int read = this.zzf.read(bArr, i10, min - i10);
                if (read == -1) {
                    throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzl += read;
                i10 += read;
            }
            i7 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzM() {
        int i7 = this.zzh + this.zzi;
        this.zzh = i7;
        int i10 = this.zzl + i7;
        int i11 = this.zzm;
        if (i10 <= i11) {
            this.zzi = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzi = i12;
        this.zzh = i7 - i12;
    }

    private final void zzN(int i7) {
        if (zzO(i7)) {
            return;
        }
        if (i7 <= (ConnectionsManager.DEFAULT_DATACENTER_ID - this.zzl) - this.zzj) {
            throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzsx("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    private final boolean zzO(int i7) {
        int i10 = this.zzj;
        int i11 = i10 + i7;
        int i12 = this.zzh;
        if (i11 <= i12) {
            throw new IllegalStateException(g.k(i7, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i13 = this.zzl;
        if (i7 > (ConnectionsManager.DEFAULT_DATACENTER_ID - i13) - i10 || i13 + i10 + i7 > this.zzm) {
            return false;
        }
        if (i10 > 0) {
            if (i12 > i10) {
                byte[] bArr = this.zzg;
                System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
            }
            i13 = this.zzl + i10;
            this.zzl = i13;
            i12 = this.zzh - i10;
            this.zzh = i12;
            this.zzj = 0;
        }
        try {
            int read = this.zzf.read(this.zzg, i12, Math.min(4096 - i12, (ConnectionsManager.DEFAULT_DATACENTER_ID - i13) - i12));
            if (read == 0 || read < -1 || read > 4096) {
                throw new IllegalStateException(String.valueOf(this.zzf.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.zzh += read;
            zzM();
            if (this.zzh >= i7) {
                return true;
            }
            return zzO(i7);
        } catch (zzsx e10) {
            e10.zza();
            throw e10;
        }
    }

    private final byte[] zzP(int i7, boolean z9) {
        byte[] zzQ = zzQ(i7);
        if (zzQ != null) {
            return zzQ;
        }
        int i10 = this.zzj;
        int i11 = this.zzh;
        int i12 = i11 - i10;
        this.zzl += i11;
        this.zzj = 0;
        this.zzh = 0;
        List<byte[]> zzL = zzL(i7 - i12);
        byte[] bArr = new byte[i7];
        System.arraycopy(this.zzg, i10, bArr, 0, i12);
        for (byte[] bArr2 : zzL) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i12, length);
            i12 += length;
        }
        return bArr;
    }

    private final byte[] zzQ(int i7) {
        if (i7 == 0) {
            return zzsv.zzb;
        }
        int i10 = this.zzl;
        int i11 = this.zzj;
        int i12 = i10 + i11 + i7;
        if ((-2147483647) + i12 > 0) {
            throw new zzsx("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i13 = this.zzm;
        if (i12 > i13) {
            zzB((i13 - i10) - i11);
            throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = this.zzh - i11;
        int i15 = i7 - i14;
        if (i15 >= 4096) {
            try {
                if (i15 > this.zzf.available()) {
                    return null;
                }
            } catch (zzsx e10) {
                e10.zza();
                throw e10;
            }
        }
        byte[] bArr = new byte[i7];
        System.arraycopy(this.zzg, this.zzj, bArr, 0, i14);
        this.zzl += this.zzh;
        this.zzj = 0;
        this.zzh = 0;
        while (i14 < i7) {
            try {
                int read = this.zzf.read(bArr, i14, i7 - i14);
                if (read == -1) {
                    throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzl += read;
                i14 += read;
            } catch (zzsx e11) {
                e11.zza();
                throw e11;
            }
        }
        return bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final void zzA(int i7) {
        this.zzm = i7;
        zzM();
    }

    public final void zzB(int i7) {
        int i10 = this.zzh;
        int i11 = this.zzj;
        int i12 = i10 - i11;
        if (i7 <= i12 && i7 >= 0) {
            this.zzj = i11 + i7;
            return;
        }
        if (i7 < 0) {
            throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i13 = this.zzl;
        int i14 = i13 + i11;
        int i15 = this.zzm;
        if (i14 + i7 > i15) {
            zzB((i15 - i13) - i11);
            throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i14;
        this.zzh = 0;
        this.zzj = 0;
        while (i12 < i7) {
            try {
                long j3 = i7 - i12;
                try {
                    long skip = this.zzf.skip(j3);
                    if (skip < 0 || skip > j3) {
                        throw new IllegalStateException(String.valueOf(this.zzf.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i12 += (int) skip;
                    }
                } catch (zzsx e10) {
                    e10.zza();
                    throw e10;
                }
            } catch (Throwable th2) {
                this.zzl += i12;
                zzM();
                throw th2;
            }
        }
        this.zzl += i12;
        zzM();
        if (i12 >= i7) {
            return;
        }
        int i16 = this.zzh;
        int i17 = i16 - this.zzj;
        this.zzj = i16;
        zzN(1);
        while (true) {
            int i18 = i7 - i17;
            int i19 = this.zzh;
            if (i18 <= i19) {
                this.zzj = i18;
                return;
            } else {
                i17 += i19;
                this.zzj = i19;
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
    public final boolean zzE(int i7) {
        int i10 = i7 & 7;
        int i11 = 0;
        if (i10 == 0) {
            if (this.zzh - this.zzj < 10) {
                while (i11 < 10) {
                    if (zza() < 0) {
                        i11++;
                    }
                }
                throw new zzsx("CodedInputStream encountered a malformed varint.");
            }
            while (i11 < 10) {
                byte[] bArr = this.zzg;
                int i12 = this.zzj;
                this.zzj = i12 + 1;
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
        if (this.zzj == this.zzh) {
            zzN(1);
        }
        byte[] bArr = this.zzg;
        int i7 = this.zzj;
        this.zzj = i7 + 1;
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
        return this.zzl + this.zzj;
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final int zze(int i7) {
        if (i7 < 0) {
            throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i10 = this.zzl + this.zzj + i7;
        if (i10 < 0) {
            throw new zzsx("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i11 = this.zzm;
        if (i10 > i11) {
            throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzm = i10;
        zzM();
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
        int i7 = this.zzj;
        if (this.zzh - i7 < 4) {
            zzN(4);
            i7 = this.zzj;
        }
        byte[] bArr = this.zzg;
        this.zzj = i7 + 4;
        int i10 = bArr[i7] & 255;
        int i11 = bArr[i7 + 1] & 255;
        int i12 = bArr[i7 + 2] & 255;
        return ((bArr[i7 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public final int zzj() {
        int i7;
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
                this.zzj = i13;
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
        int i7 = this.zzj;
        if (this.zzh - i7 < 8) {
            zzN(8);
            i7 = this.zzj;
        }
        byte[] bArr = this.zzg;
        this.zzj = i7 + 8;
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
        int i7 = this.zzj;
        int i10 = this.zzh;
        if (i10 != i7) {
            byte[] bArr = this.zzg;
            int i11 = i7 + 1;
            byte b10 = bArr[i7];
            if (b10 >= 0) {
                this.zzj = i11;
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
                this.zzj = i12;
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
        int i7 = this.zzh;
        int i10 = this.zzj;
        if (zzj <= i7 - i10 && zzj > 0) {
            zzqm zzl = zzqm.zzl(this.zzg, i10, zzj);
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
        int i11 = this.zzj;
        int i12 = this.zzh;
        int i13 = i12 - i11;
        this.zzl += i12;
        this.zzj = 0;
        this.zzh = 0;
        List<byte[]> zzL = zzL(zzj - i13);
        byte[] bArr = new byte[zzj];
        System.arraycopy(this.zzg, i11, bArr, 0, i13);
        for (byte[] bArr2 : zzL) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        zzqm zzqmVar = zzqm.zzb;
        return new zzqk(bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final String zzx() {
        int zzj = zzj();
        if (zzj > 0) {
            int i7 = this.zzh;
            int i10 = this.zzj;
            if (zzj <= i7 - i10) {
                String str = new String(this.zzg, i10, zzj, zzsv.zza);
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
        int i7 = this.zzj;
        int i10 = this.zzh;
        if (zzj <= i10 - i7 && zzj > 0) {
            zzP = this.zzg;
            this.zzj = i7 + zzj;
        } else {
            if (zzj == 0) {
                return "";
            }
            if (zzj < 0) {
                throw new zzsx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i7 = 0;
            if (zzj <= i10) {
                zzN(zzj);
                zzP = this.zzg;
                this.zzj = zzj;
            } else {
                zzP = zzP(zzj, false);
            }
        }
        return zzvf.zzd(zzP, i7, zzj);
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final void zzz(int i7) {
        if (this.zzk != i7) {
            throw new zzsx("Protocol message end-group tag did not match expected tag.");
        }
    }
}
