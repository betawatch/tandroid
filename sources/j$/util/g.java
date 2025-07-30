package j$.util;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* loaded from: classes2.dex */
public final class g implements j$.util.function.E {
    private long count;
    private long sum;
    private int min = ConnectionsManager.DEFAULT_DATACENTER_ID;
    private int max = TLObject.FLAG_31;

    public final void a(g gVar) {
        this.count += gVar.count;
        this.sum += gVar.sum;
        this.min = Math.min(this.min, gVar.min);
        this.max = Math.max(this.max, gVar.max);
    }

    @Override // j$.util.function.E
    public final void accept(int i) {
        this.count++;
        this.sum += i;
        this.min = Math.min(this.min, i);
        this.max = Math.max(this.max, i);
    }

    @Override // j$.util.function.E
    public final /* synthetic */ j$.util.function.E l(j$.util.function.E e) {
        return j$.com.android.tools.r8.a.c(this, e);
    }

    public final String toString() {
        double d;
        String simpleName = g.class.getSimpleName();
        Long valueOf = Long.valueOf(this.count);
        Long valueOf2 = Long.valueOf(this.sum);
        Integer valueOf3 = Integer.valueOf(this.min);
        long j = this.count;
        if (j > 0) {
            double d2 = this.sum;
            double d3 = j;
            Double.isNaN(d2);
            Double.isNaN(d3);
            d = d2 / d3;
        } else {
            d = 0.0d;
        }
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, valueOf, valueOf2, valueOf3, Double.valueOf(d), Integer.valueOf(this.max));
    }
}
