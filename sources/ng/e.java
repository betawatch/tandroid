package ng;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e extends b {
    public long[] l;
    public long[][] m;
    public int n;

    public e(b bVar, long j10) {
        this.d = new ArrayList();
        this.e = 0L;
        this.f = Long.MAX_VALUE;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0;
        this.j = 0;
        int binarySearch = Arrays.binarySearch(bVar.a, j10);
        int i3 = binarySearch - 4;
        int i10 = binarySearch + 4;
        if (i3 < 0) {
            i10 += -i3;
            i3 = 0;
        }
        long[] jArr = bVar.a;
        if (i10 > jArr.length - 1) {
            i3 -= i10 - jArr.length;
            i10 = jArr.length - 1;
        }
        i3 = i3 < 0 ? 0 : i3;
        int i11 = (i10 - i3) + 1;
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
        while (i3 <= i10) {
            this.a[i13] = bVar.a[i3];
            for (int i14 = 0; i14 < this.d.size(); i14++) {
                ((a) this.d.get(i14)).a[i13] = ((a) bVar.d.get(i14)).a[i3];
            }
            i13++;
            i3++;
        }
        this.k = 86400000L;
        e();
    }

    @Override // ng.b
    public final void e() {
        super.e();
        this.n = 0;
        int length = this.b.length;
        int size = this.d.size();
        int max = Math.max(1, Math.round(length / 140.0f));
        int i3 = length / max;
        this.m = (long[][]) Array.newInstance((Class<?>) Long.TYPE, size, i3);
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < length; i10++) {
            for (int i11 = 0; i11 < size; i11++) {
                long j10 = ((a) this.d.get(i11)).a[i10];
                if (j10 > jArr[i11]) {
                    jArr[i11] = j10;
                }
            }
            if (i10 % max == 0) {
                for (int i12 = 0; i12 < size; i12++) {
                    this.m[i12][this.n] = jArr[i12];
                    jArr[i12] = 0;
                }
                int i13 = this.n + 1;
                this.n = i13;
                if (i13 >= i3) {
                    return;
                }
            }
        }
    }
}
