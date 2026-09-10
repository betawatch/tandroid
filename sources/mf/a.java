package mf;

import com.google.firebase.messaging.d;
import java.io.InputStream;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class a extends d {
    public final long d;

    public a(InputStream inputStream, long j3, long j10) {
        super(inputStream, j3);
        this.d = j3 + j10;
    }

    public final long e() {
        return this.d - this.b;
    }

    @Override // com.google.firebase.messaging.d, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.b == this.d) {
            return -1;
        }
        return super.read();
    }

    @Override // com.google.firebase.messaging.d, java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j3) {
        long j10 = this.b;
        long j11 = j10 + j3;
        long j12 = this.d;
        if (j11 > j12) {
            j3 = (int) (j12 - j10);
        }
        return super.skip(j3);
    }

    @Override // com.google.firebase.messaging.d, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        long j3 = this.b;
        long j10 = i11 + j3;
        long j11 = this.d;
        if (j10 <= j11 || (i11 = (int) (j11 - j3)) != 0) {
            return super.read(bArr, i10, i11);
        }
        return -1;
    }
}
