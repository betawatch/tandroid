package m3;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import d5.f0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class o implements t {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public /* synthetic */ o(Object obj, long j10, int i9) {
        this.a = i9;
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
                int e10 = f0.e(jArr, flacStreamMetadata.getSampleNumber(j10), false);
                long j11 = e10 == -1 ? 0L : jArr[e10];
                long j12 = e10 != -1 ? jArr2[e10] : 0L;
                int i9 = flacStreamMetadata.sampleRate;
                long j13 = (j11 * 1000000) / i9;
                long j14 = this.b;
                u uVar = new u(j13, j12 + j14);
                if (j13 == j10 || e10 == jArr.length - 1) {
                    return new s(uVar, uVar);
                }
                int i10 = e10 + 1;
                return new s(uVar, new u((jArr[i10] * 1000000) / i9, j14 + jArr2[i10]));
            case 1:
                return (s) this.c;
            default:
                o3.b bVar = (o3.b) this.c;
                s b10 = bVar.g[0].b(j10);
                int i11 = 1;
                while (true) {
                    o3.e[] eVarArr = bVar.g;
                    if (i11 >= eVarArr.length) {
                        return b10;
                    }
                    s b11 = eVarArr[i11].b(j10);
                    if (b11.a.b < b10.a.b) {
                        b10 = b11;
                    }
                    i11++;
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
