package a3;

import a8.yb;
import android.util.Range;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class b0 {
    public long a;
    public long b;
    public double c;
    public Range d;

    public b0() {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / 1.0f));
        this.d = range;
        this.c = ((Double) range.getUpper()).doubleValue();
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public final void a(long j10, long j11) {
        double doubleValue;
        yb.g(j10 != -9223372036854775807L);
        yb.g(j11 != -9223372036854775807L);
        long j12 = this.a;
        if (j12 != -9223372036854775807L) {
            if (this.b != -9223372036854775807L && j10 != j12) {
                doubleValue = (j11 - r4) / (j10 - j12);
                this.c = (((Double) this.d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.c * 0.800000011920929d);
                this.a = j10;
                this.b = j11;
            }
        }
        doubleValue = ((Double) this.d.getUpper()).doubleValue();
        this.c = (((Double) this.d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.c * 0.800000011920929d);
        this.a = j10;
        this.b = j11;
    }

    public final void b() {
        this.c = ((Double) this.d.getUpper()).doubleValue();
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public final void c(float f7) {
        yb.g(f7 > 0.0f);
        this.d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f7));
        b();
    }
}
