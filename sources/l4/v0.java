package l4;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class v0 implements x3.g {
    public long a;
    public long b;
    public Object c;
    public Object d;

    public v0(long j10, int i10) {
        f5.a.i(((com.google.android.exoplayer2.upstream.a) this.c) == null);
        this.a = j10;
        this.b = j10 + i10;
    }

    @Override // x3.g
    public long i(o3.l lVar) {
        long j10 = this.b;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.b = -1L;
        return j11;
    }

    @Override // x3.g
    public o3.t v() {
        f5.a.i(this.a != -1);
        return new o3.o((FlacStreamMetadata) this.c, this.a, 0);
    }

    @Override // x3.g
    public void z(long j10) {
        long[] jArr = ((o3.p) this.d).a;
        this.b = jArr[f5.d0.e(jArr, j10, true)];
    }

    public v0(String str, byte[] bArr, long j10, long j11) {
        this.c = str;
        this.d = bArr;
        this.a = j10;
        this.b = j11;
    }
}
