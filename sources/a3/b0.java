package a3;

import android.util.Range;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        t6.f(j10 != -9223372036854775807L);
        t6.f(j11 != -9223372036854775807L);
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
        t6.f(f7 > 0.0f);
        this.d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f7));
        b();
    }
}
