package com.google.android.recaptcha.internal;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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

    public /* synthetic */ zzqo(InputStream inputStream, int i, zzqp zzqpVar) {
        super(null);
        this.zzm = ConnectionsManager.DEFAULT_DATACENTER_ID;
        byte[] bArr = zzsv.zzb;
        this.zzf = inputStream;
        this.zzg = new byte[TLObject.FLAG_12];
        this.zzh = 0;
        this.zzj = 0;
        this.zzl = 0;
    }

    private final List zzL(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, TLObject.FLAG_12);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.zzf.read(bArr, i2, min - i2);
                if (read == -1) {
                    fvc.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return null;
                }
                this.zzl += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzM() {
        int i = this.zzh + this.zzi;
        this.zzh = i;
        int i2 = this.zzl + i;
        int i3 = this.zzm;
        if (i2 <= i3) {
            this.zzi = 0;
            return;
        }
        int i4 = i2 - i3;
        this.zzi = i4;
        this.zzh = i - i4;
    }

    private final void zzN(int i) {
        if (zzO(i)) {
            return;
        }
        if (i > (ConnectionsManager.DEFAULT_DATACENTER_ID - this.zzl) - this.zzj) {
            fvc.i("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        } else {
            fvc.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final boolean zzO(int i) {
        int i2 = this.zzj;
        int i3 = i2 + i;
        int i4 = this.zzh;
        if (i3 <= i4) {
            sc8.j(tb4.n(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.zzl;
        if (i > (ConnectionsManager.DEFAULT_DATACENTER_ID - i5) - i2 || i5 + i2 + i > this.zzm) {
            return false;
        }
        if (i2 > 0) {
            if (i4 > i2) {
                byte[] bArr = this.zzg;
                System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            i5 = this.zzl + i2;
            this.zzl = i5;
            i4 = this.zzh - i2;
            this.zzh = i4;
            this.zzj = 0;
        }
        try {
            int read = this.zzf.read(this.zzg, i4, Math.min(4096 - i4, (ConnectionsManager.DEFAULT_DATACENTER_ID - i5) - i4));
            if (read == 0 || read < -1 || read > 4096) {
                throw new IllegalStateException(String.valueOf(this.zzf.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.zzh += read;
            zzM();
            if (this.zzh >= i) {
                return true;
            }
            return zzO(i);
        } catch (zzsx e) {
            e.zza();
            throw e;
        }
    }

    private final byte[] zzP(int i, boolean z) {
        byte[] zzQ = zzQ(i);
        if (zzQ != null) {
            return zzQ;
        }
        int i2 = this.zzj;
        int i3 = this.zzh;
        int i4 = i3 - i2;
        this.zzl += i3;
        this.zzj = 0;
        this.zzh = 0;
        List<byte[]> zzL = zzL(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.zzg, i2, bArr, 0, i4);
        for (byte[] bArr2 : zzL) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    private final byte[] zzQ(int i) {
        if (i == 0) {
            return zzsv.zzb;
        }
        int i2 = this.zzl;
        int i3 = this.zzj;
        int i4 = i2 + i3 + i;
        if ((-2147483647) + i4 > 0) {
            fvc.i("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return null;
        }
        int i5 = this.zzm;
        if (i4 > i5) {
            zzB((i5 - i2) - i3);
            fvc.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        int i6 = this.zzh - i3;
        int i7 = i - i6;
        if (i7 >= 4096) {
            try {
                if (i7 > this.zzf.available()) {
                    return null;
                }
            } catch (zzsx e) {
                e.zza();
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.zzg, this.zzj, bArr, 0, i6);
        this.zzl += this.zzh;
        this.zzj = 0;
        this.zzh = 0;
        while (i6 < i) {
            try {
                int read = this.zzf.read(bArr, i6, i - i6);
                if (read == -1) {
                    fvc.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return null;
                }
                this.zzl += read;
                i6 += read;
            } catch (zzsx e2) {
                e2.zza();
                throw e2;
            }
        }
        return bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final void zzA(int i) {
        this.zzm = i;
        zzM();
    }

    public final void zzB(int i) {
        int i2 = this.zzh;
        int i3 = this.zzj;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.zzj = i3 + i;
            return;
        }
        if (i < 0) {
            fvc.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return;
        }
        int i5 = this.zzl;
        int i6 = i5 + i3;
        int i7 = this.zzm;
        if (i6 + i > i7) {
            zzB((i7 - i5) - i3);
            fvc.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return;
        }
        this.zzl = i6;
        this.zzh = 0;
        this.zzj = 0;
        while (i4 < i) {
            try {
                long j = i - i4;
                try {
                    long skip = this.zzf.skip(j);
                    if (skip >= 0 && skip <= j) {
                        if (skip == 0) {
                            break;
                        } else {
                            i4 += (int) skip;
                        }
                    } else {
                        throw new IllegalStateException(String.valueOf(this.zzf.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                } catch (zzsx e) {
                    e.zza();
                    throw e;
                }
            } finally {
                this.zzl += i4;
                zzM();
            }
        }
        if (i4 >= i) {
            return;
        }
        int i8 = this.zzh;
        int i9 = i8 - this.zzj;
        this.zzj = i8;
        zzN(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.zzh;
            if (i10 <= i11) {
                this.zzj = i10;
                return;
            } else {
                i9 += i11;
                this.zzj = i11;
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
    public final boolean zzE(int i) {
        int i2 = i & 7;
        if (i2 == 0) {
            if (this.zzh - this.zzj < 10) {
                for (int i3 = 0; i3 < 10; i3++) {
                    if (zza() < 0) {
                    }
                }
                fvc.i("CodedInputStream encountered a malformed varint.");
                return false;
            }
            for (int i4 = 0; i4 < 10; i4++) {
                byte[] bArr = this.zzg;
                int i5 = this.zzj;
                this.zzj = i5 + 1;
                if (bArr[i5] < 0) {
                }
            }
            fvc.i("CodedInputStream encountered a malformed varint.");
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
        haf.a();
        return false;
    }

    public final byte zza() {
        if (this.zzj == this.zzh) {
            zzN(1);
        }
        byte[] bArr = this.zzg;
        int i = this.zzj;
        this.zzj = i + 1;
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
        return this.zzl + this.zzj;
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final int zze(int i) {
        if (i < 0) {
            fvc.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = this.zzl + this.zzj + i;
        if (i2 < 0) {
            fvc.i("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        int i3 = this.zzm;
        if (i2 > i3) {
            fvc.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.zzm = i2;
        zzM();
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
        int i = this.zzj;
        if (this.zzh - i < 4) {
            zzN(4);
            i = this.zzj;
        }
        byte[] bArr = this.zzg;
        this.zzj = i + 4;
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
        int i2 = this.zzj;
        int i3 = this.zzh;
        if (i3 != i2) {
            byte[] bArr = this.zzg;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzj = i4;
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
                this.zzj = i5;
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
            this.zzk = 0;
            return 0;
        }
        int zzj = zzj();
        this.zzk = zzj;
        if ((zzj >>> 3) != 0) {
            return zzj;
        }
        fvc.i("Protocol message contained an invalid tag (zero).");
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
        int i = this.zzj;
        if (this.zzh - i < 8) {
            zzN(8);
            i = this.zzj;
        }
        byte[] bArr = this.zzg;
        this.zzj = i + 8;
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
        int i2 = this.zzj;
        int i3 = this.zzh;
        if (i3 != i2) {
            byte[] bArr = this.zzg;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzj = i4;
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
                                            this.zzj = i5;
                                            return j;
                                        }
                                        j2 = -558586000294016L;
                                    }
                                }
                                j = j2 ^ j6;
                                this.zzj = i5;
                                return j;
                            }
                            j3 = 266354560;
                            j4 = j3 ^ j5;
                        }
                    }
                    i5 = i7;
                    j = j4;
                    this.zzj = i5;
                    return j;
                }
                i = i6 ^ (-128);
                j = i;
                this.zzj = i5;
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
        fvc.i("CodedInputStream encountered a malformed varint.");
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
        int i = this.zzh;
        int i2 = this.zzj;
        if (zzj <= i - i2 && zzj > 0) {
            zzqm zzl = zzqm.zzl(this.zzg, i2, zzj);
            this.zzj += zzj;
            return zzl;
        }
        if (zzj == 0) {
            return zzqm.zzb;
        }
        if (zzj < 0) {
            fvc.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        byte[] zzQ = zzQ(zzj);
        if (zzQ != null) {
            return zzqm.zzl(zzQ, 0, zzQ.length);
        }
        int i3 = this.zzj;
        int i4 = this.zzh;
        int i5 = i4 - i3;
        this.zzl += i4;
        this.zzj = 0;
        this.zzh = 0;
        List<byte[]> zzL = zzL(zzj - i5);
        byte[] bArr = new byte[zzj];
        System.arraycopy(this.zzg, i3, bArr, 0, i5);
        for (byte[] bArr2 : zzL) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        zzqm zzqmVar = zzqm.zzb;
        return new zzqk(bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final String zzx() {
        int zzj = zzj();
        if (zzj > 0) {
            int i = this.zzh;
            int i2 = this.zzj;
            if (zzj <= i - i2) {
                String str = new String(this.zzg, i2, zzj, zzsv.zza);
                this.zzj += zzj;
                return str;
            }
        }
        if (zzj == 0) {
            return "";
        }
        if (zzj < 0) {
            fvc.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
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
        int i = this.zzj;
        int i2 = this.zzh;
        if (zzj <= i2 - i && zzj > 0) {
            zzP = this.zzg;
            this.zzj = i + zzj;
        } else {
            if (zzj == 0) {
                return "";
            }
            if (zzj < 0) {
                fvc.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return null;
            }
            i = 0;
            if (zzj <= i2) {
                zzN(zzj);
                zzP = this.zzg;
                this.zzj = zzj;
            } else {
                zzP = zzP(zzj, false);
            }
        }
        return zzvf.zzd(zzP, i, zzj);
    }

    @Override // com.google.android.recaptcha.internal.zzqq
    public final void zzz(int i) {
        if (this.zzk == i) {
            return;
        }
        fvc.i("Protocol message end-group tag did not match expected tag.");
    }
}
