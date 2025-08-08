package j$.util;

/* loaded from: classes2.dex */
public final class f implements j$.util.function.l {
    private double a;
    private double b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    @Override // j$.util.function.l
    public final /* synthetic */ j$.util.function.l k(j$.util.function.l lVar) {
        return j$.com.android.tools.r8.a.a(this, lVar);
    }

    @Override // j$.util.function.l
    public final void accept(double d) {
        this.count++;
        this.b += d;
        c(d);
        this.min = Math.min(this.min, d);
        this.max = Math.max(this.max, d);
    }

    public final void a(f fVar) {
        this.count += fVar.count;
        this.b += fVar.b;
        c(fVar.sum);
        c(fVar.a);
        this.min = Math.min(this.min, fVar.min);
        this.max = Math.max(this.max, fVar.max);
    }

    private void c(double d) {
        double d2 = d - this.a;
        double d3 = this.sum;
        double d4 = d3 + d2;
        this.a = (d4 - d3) - d2;
        this.sum = d4;
    }

    public final String toString() {
        double d;
        String simpleName = f.class.getSimpleName();
        Long valueOf = Long.valueOf(this.count);
        double d2 = this.sum + this.a;
        if (Double.isNaN(d2) && Double.isInfinite(this.b)) {
            d2 = this.b;
        }
        Double valueOf2 = Double.valueOf(d2);
        Double valueOf3 = Double.valueOf(this.min);
        if (this.count > 0) {
            double d3 = this.sum + this.a;
            if (Double.isNaN(d3) && Double.isInfinite(this.b)) {
                d3 = this.b;
            }
            d = d3 / this.count;
        } else {
            d = 0.0d;
        }
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", simpleName, valueOf, valueOf2, valueOf3, Double.valueOf(d), Double.valueOf(this.max));
    }
}
