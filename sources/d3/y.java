package d3;

import a8.la;
import android.util.Range;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class y {
    public long a;
    public long b;
    public double c;
    public Range d;

    public y() {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / 1.0f));
        this.d = range;
        this.c = ((Double) range.getUpper()).doubleValue();
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public final void a(long j3, long j10) {
        double doubleValue;
        la.f(j3 != -9223372036854775807L);
        la.f(j10 != -9223372036854775807L);
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
        la.f(f10 > 0.0f);
        this.d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f10));
        b();
    }
}
