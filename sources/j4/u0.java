package j4;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class u0 implements v3.g {
    public long a;
    public long b;
    public Object c;
    public Object d;

    public u0(long j10, int i10) {
        d5.a.i(((com.google.android.exoplayer2.upstream.a) this.c) == null);
        this.a = j10;
        this.b = j10 + i10;
    }

    @Override // v3.g
    public void A(long j10) {
        long[] jArr = ((m3.p) this.d).a;
        this.b = jArr[d5.g0.e(jArr, j10, true)];
    }

    @Override // v3.g
    public long b(m3.l lVar) {
        long j10 = this.b;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.b = -1L;
        return j11;
    }

    @Override // v3.g
    public m3.t l() {
        d5.a.i(this.a != -1);
        return new m3.o((FlacStreamMetadata) this.c, this.a, 0);
    }

    public u0(String str, byte[] bArr, long j10, long j11) {
        this.c = str;
        this.d = bArr;
        this.a = j10;
        this.b = j11;
    }
}
