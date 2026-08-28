package j$.util;

import java.util.function.IntConsumer;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* loaded from: classes2.dex */
public final class x implements IntConsumer {
    private long count;
    private long sum;
    private int min = ConnectionsManager.DEFAULT_DATACENTER_ID;
    private int max = TLObject.FLAG_31;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i9) {
        this.count++;
        this.sum += i9;
        this.min = Math.min(this.min, i9);
        this.max = Math.max(this.max, i9);
    }

    public final void a(x xVar) {
        this.count += xVar.count;
        this.sum += xVar.sum;
        this.min = Math.min(this.min, xVar.min);
        this.max = Math.max(this.max, xVar.max);
    }

    public final String toString() {
        String simpleName = x.class.getSimpleName();
        Long valueOf = Long.valueOf(this.count);
        Long valueOf2 = Long.valueOf(this.sum);
        Integer valueOf3 = Integer.valueOf(this.min);
        long j10 = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, valueOf, valueOf2, valueOf3, Double.valueOf(j10 > 0 ? this.sum / j10 : 0.0d), Integer.valueOf(this.max));
    }
}
