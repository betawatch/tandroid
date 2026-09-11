package a3;

import java.util.Arrays;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class f {
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final boolean[] g = new boolean[15];
    public int h;

    public final boolean a() {
        return this.d > 15 && this.h == 0;
    }

    public final void b(long j3) {
        long j10 = this.d;
        if (j10 == 0) {
            this.a = j3;
        } else if (j10 == 1) {
            long j11 = j3 - this.a;
            this.b = j11;
            this.f = j11;
            this.e = 1L;
        } else {
            long j12 = j3 - this.c;
            int i10 = (int) (j10 % 15);
            long abs = Math.abs(j12 - this.b);
            boolean[] zArr = this.g;
            if (abs <= 1000000) {
                this.e++;
                this.f += j12;
                if (zArr[i10]) {
                    zArr[i10] = false;
                    this.h--;
                }
            } else if (!zArr[i10]) {
                zArr[i10] = true;
                this.h++;
            }
        }
        this.d++;
        this.c = j3;
    }

    public final void c() {
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.h = 0;
        Arrays.fill(this.g, false);
    }
}
