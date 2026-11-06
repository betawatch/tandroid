package aa;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class p implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ q b;

    public p(q qVar, long j3) {
        this.b = qVar;
        this.a = j3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle f10 = rf.b.f(1, "fatal");
        f10.putLong("timestamp", this.a);
        this.b.k.a2(f10);
        return null;
    }
}
