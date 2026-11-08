package aa;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
