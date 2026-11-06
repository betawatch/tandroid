package d3;

import a8.ia;
import android.util.Range;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class z {
    public long a;
    public long b;
    public double c;
    public Range d;

    public z() {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / 1.0f));
        this.d = range;
        this.c = ((Double) range.getUpper()).doubleValue();
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public final void a(long j3, long j10) {
        double doubleValue;
        ia.f(j3 != -9223372036854775807L);
        ia.f(j10 != -9223372036854775807L);
        long j11 = this.a;
        if (j11 != -9223372036854775807L) {
            if (this.b != -9223372036854775807L && j3 != j11) {
                doubleValue = (j10 - r4) / (j3 - j11);
                this.c = (((Double) this.d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.c * 0.800000011920929d);
                this.a = j3;
                this.b = j10;
            }
        }
        doubleValue = ((Double) this.d.getUpper()).doubleValue();
        this.c = (((Double) this.d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.c * 0.800000011920929d);
        this.a = j3;
        this.b = j10;
    }

    public final void b() {
        this.c = ((Double) this.d.getUpper()).doubleValue();
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public final void c(float f10) {
        ia.f(f10 > 0.0f);
        this.d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f10));
        b();
    }
}
