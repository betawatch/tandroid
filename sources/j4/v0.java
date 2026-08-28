package j4;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class v0 implements v3.g {
    public long a;
    public long b;
    public Object c;
    public Object d;

    public v0(long j10, int i9) {
        d5.a.i(((com.google.android.exoplayer2.upstream.a) this.c) == null);
        this.a = j10;
        this.b = j10 + i9;
    }

    @Override // v3.g
    public m3.t D() {
        d5.a.i(this.a != -1);
        return new m3.o((FlacStreamMetadata) this.c, this.a, 0);
    }

    @Override // v3.g
    public void O(long j10) {
        long[] jArr = ((m3.p) this.d).a;
        this.b = jArr[d5.f0.e(jArr, j10, true)];
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

    public v0(String str, byte[] bArr, long j10, long j11) {
        this.c = str;
        this.d = bArr;
        this.a = j10;
        this.b = j11;
    }
}
