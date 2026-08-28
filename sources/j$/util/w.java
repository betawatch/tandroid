package j$.util;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class w implements DoubleConsumer {
    public double a;
    public double b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.count++;
        this.b += d;
        b(d);
        this.min = Math.min(this.min, d);
        this.max = Math.max(this.max, d);
    }

    public final void a(w wVar) {
        this.count += wVar.count;
        this.b += wVar.b;
        b(wVar.sum);
        b(wVar.a);
        this.min = Math.min(this.min, wVar.min);
        this.max = Math.max(this.max, wVar.max);
    }

    public final void b(double d) {
        double d9 = d - this.a;
        double d10 = this.sum;
        double d11 = d10 + d9;
        this.a = (d11 - d10) - d9;
        this.sum = d11;
    }

    public final String toString() {
        double d;
        String simpleName = w.class.getSimpleName();
        Long valueOf = Long.valueOf(this.count);
        double d9 = this.sum + this.a;
        if (Double.isNaN(d9) && Double.isInfinite(this.b)) {
            d9 = this.b;
        }
        Double valueOf2 = Double.valueOf(d9);
        Double valueOf3 = Double.valueOf(this.min);
        if (this.count > 0) {
            double d10 = this.sum + this.a;
            if (Double.isNaN(d10) && Double.isInfinite(this.b)) {
                d10 = this.b;
            }
            d = d10 / this.count;
        } else {
            d = 0.0d;
        }
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", simpleName, valueOf, valueOf2, valueOf3, Double.valueOf(d), Double.valueOf(this.max));
    }
}
