package e5;

import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d {
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

    public final void b(long j10) {
        long j11 = this.d;
        if (j11 == 0) {
            this.a = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.a;
            this.b = j12;
            this.f = j12;
            this.e = 1L;
        } else {
            long j13 = j10 - this.c;
            int i9 = (int) (j11 % 15);
            long abs = Math.abs(j13 - this.b);
            boolean[] zArr = this.g;
            if (abs <= 1000000) {
                this.e++;
                this.f += j13;
                if (zArr[i9]) {
                    zArr[i9] = false;
                    this.h--;
                }
            } else if (!zArr[i9]) {
                zArr[i9] = true;
                this.h++;
            }
        }
        this.d++;
        this.c = j10;
    }

    public final void c() {
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.h = 0;
        Arrays.fill(this.g, false);
    }
}
