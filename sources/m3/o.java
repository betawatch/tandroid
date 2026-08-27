package m3;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import d5.g0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class o implements t {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public /* synthetic */ o(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // m3.t
    public final boolean e() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // m3.t
    public final s h(long j10) {
        switch (this.a) {
            case 0:
                FlacStreamMetadata flacStreamMetadata = (FlacStreamMetadata) this.c;
                d5.a.j(flacStreamMetadata.seekTable);
                p pVar = flacStreamMetadata.seekTable;
                long[] jArr = pVar.a;
                long[] jArr2 = pVar.b;
                int e9 = g0.e(jArr, flacStreamMetadata.getSampleNumber(j10), false);
                long j11 = e9 == -1 ? 0L : jArr[e9];
                long j12 = e9 != -1 ? jArr2[e9] : 0L;
                int i10 = flacStreamMetadata.sampleRate;
                long j13 = (j11 * 1000000) / i10;
                long j14 = this.b;
                u uVar = new u(j13, j12 + j14);
                if (j13 == j10 || e9 == jArr.length - 1) {
                    return new s(uVar, uVar);
                }
                int i11 = e9 + 1;
                return new s(uVar, new u((jArr[i11] * 1000000) / i10, j14 + jArr2[i11]));
            case 1:
                return (s) this.c;
            default:
                o3.b bVar = (o3.b) this.c;
                s b10 = bVar.g[0].b(j10);
                int i12 = 1;
                while (true) {
                    o3.e[] eVarArr = bVar.g;
                    if (i12 >= eVarArr.length) {
                        return b10;
                    }
                    s b11 = eVarArr[i12].b(j10);
                    if (b11.a.b < b10.a.b) {
                        b10 = b11;
                    }
                    i12++;
                }
        }
    }

    @Override // m3.t
    public final long i() {
        switch (this.a) {
        }
        return this.b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(long j10) {
        this(j10, 0L);
        this.a = 1;
    }

    public o(long j10, long j11) {
        this.a = 1;
        this.b = j10;
        u uVar = j11 == 0 ? u.c : new u(0L, j11);
        this.c = new s(uVar, uVar);
    }
}
