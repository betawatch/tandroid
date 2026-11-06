package mg;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class e extends b {
    public long[] l;
    public long[][] m;
    public int n;

    public e(b bVar, long j3) {
        this.d = new ArrayList();
        this.e = 0L;
        this.f = Long.MAX_VALUE;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0;
        this.j = 0;
        int binarySearch = Arrays.binarySearch(bVar.a, j3);
        int i7 = binarySearch - 4;
        int i10 = binarySearch + 4;
        if (i7 < 0) {
            i10 += -i7;
            i7 = 0;
        }
        long[] jArr = bVar.a;
        if (i10 > jArr.length - 1) {
            i7 -= i10 - jArr.length;
            i10 = jArr.length - 1;
        }
        i7 = i7 < 0 ? 0 : i7;
        int i11 = (i10 - i7) + 1;
        this.a = new long[i11];
        this.b = new float[i11];
        this.d = new ArrayList();
        for (int i12 = 0; i12 < bVar.d.size(); i12++) {
            a aVar = new a();
            aVar.a = new long[i11];
            aVar.c = ((a) bVar.d.get(i12)).c;
            aVar.d = ((a) bVar.d.get(i12)).d;
            aVar.g = ((a) bVar.d.get(i12)).g;
            aVar.h = ((a) bVar.d.get(i12)).h;
            aVar.i = ((a) bVar.d.get(i12)).i;
            this.d.add(aVar);
        }
        int i13 = 0;
        while (i7 <= i10) {
            this.a[i13] = bVar.a[i7];
            for (int i14 = 0; i14 < this.d.size(); i14++) {
                ((a) this.d.get(i14)).a[i13] = ((a) bVar.d.get(i14)).a[i7];
            }
            i13++;
            i7++;
        }
        this.k = 86400000L;
        e();
    }

    @Override // mg.b
    public final void e() {
        super.e();
        this.n = 0;
        int length = this.b.length;
        int size = this.d.size();
        int max = Math.max(1, Math.round(length / 140.0f));
        int i7 = length / max;
        this.m = (long[][]) Array.newInstance((Class<?>) Long.TYPE, size, i7);
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < length; i10++) {
            for (int i11 = 0; i11 < size; i11++) {
                long j3 = ((a) this.d.get(i11)).a[i10];
                if (j3 > jArr[i11]) {
                    jArr[i11] = j3;
                }
            }
            if (i10 % max == 0) {
                for (int i12 = 0; i12 < size; i12++) {
                    this.m[i12][this.n] = jArr[i12];
                    jArr[i12] = 0;
                }
                int i13 = this.n + 1;
                this.n = i13;
                if (i13 >= i7) {
                    return;
                }
            }
        }
    }
}
