package f9;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ o b;

    public n(o oVar, long j10) {
        this.b = oVar;
        this.a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle g10 = a9.p.g(1, "fatal");
        g10.putLong("timestamp", this.a);
        this.b.k.s(g10);
        return null;
    }
}
